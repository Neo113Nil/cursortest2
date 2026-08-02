package com.googlecode.mp4parser;

import com.ironsource.X3;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.ga8;
import xsna.pa8;
import xsna.q100;
import xsna.ruy;
import xsna.up2;
import xsna.vc;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes13.dex */
public class BasicContainer implements yej, Iterator<ga8>, Closeable {
    private static final ga8 EOF = new AbstractBox("eof ") { // from class: com.googlecode.mp4parser.BasicContainer.1
        @Override // com.googlecode.mp4parser.AbstractBox
        public long getContentSize() {
            return 0L;
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        public void _parseDetails(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        public void getContent(ByteBuffer byteBuffer) {
        }
    };
    private static q100 LOG = q100.a(BasicContainer.class);
    protected pa8 boxParser;
    protected xuk dataSource;
    ga8 lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<ga8> boxes = new ArrayList();

    public void addBox(ga8 ga8Var) {
        if (ga8Var != null) {
            this.boxes = new ArrayList(getBoxes());
            ga8Var.setParent(this);
            this.boxes.add(ga8Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.dataSource.close();
    }

    @Override // xsna.yej
    public List<ga8> getBoxes() {
        return (this.dataSource == null || this.lookahead == EOF) ? this.boxes : new ruy(this.boxes, this);
    }

    @Override // xsna.yej
    public ByteBuffer getByteBuffer(long j, long j2) throws IOException {
        ByteBuffer K0;
        xuk xukVar = this.dataSource;
        if (xukVar != null) {
            synchronized (xukVar) {
                K0 = this.dataSource.K0(this.startPosition + j, j2);
            }
            return K0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(up2.p(j2));
        long j3 = j2 + j;
        long j4 = 0;
        for (ga8 ga8Var : this.boxes) {
            long size = ga8Var.getSize() + j4;
            if (size > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                ga8Var.getBox(newChannel);
                newChannel.close();
                if (j4 >= j && size <= j3) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && size > j3) {
                    long j5 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), up2.p(j5), up2.p((ga8Var.getSize() - j5) - (size - j3)));
                } else if (j4 < j && size <= j3) {
                    long j6 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), up2.p(j6), up2.p(ga8Var.getSize() - j6));
                } else if (j4 >= j && size > j3) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, up2.p(ga8Var.getSize() - (size - j3)));
                }
            }
            j4 = size;
        }
        return (ByteBuffer) allocate.rewind();
    }

    public long getContainerSize() {
        long j = 0;
        for (int i = 0; i < getBoxes().size(); i++) {
            j += this.boxes.get(i).getSize();
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ga8 ga8Var = this.lookahead;
        if (ga8Var == EOF) {
            return false;
        }
        if (ga8Var != null) {
            return true;
        }
        try {
            this.lookahead = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.lookahead = EOF;
            return false;
        }
    }

    public void initContainer(xuk xukVar, long j, pa8 pa8Var) throws IOException {
        this.dataSource = xukVar;
        long position = xukVar.position();
        this.startPosition = position;
        this.parsePosition = position;
        xukVar.position(xukVar.position() + j);
        this.endPosition = xukVar.position();
        this.boxParser = pa8Var;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List<ga8> list) {
        this.boxes = new ArrayList(list);
        this.lookahead = EOF;
        this.dataSource = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(X3.j.d);
        for (int i = 0; i < this.boxes.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.boxes.get(i).toString());
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    @Override // xsna.yej
    public final void writeContainer(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<ga8> it = getBoxes().iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
    }

    @Override // java.util.Iterator
    public ga8 next() {
        ga8 b;
        ga8 ga8Var = this.lookahead;
        if (ga8Var != null && ga8Var != EOF) {
            this.lookahead = null;
            return ga8Var;
        }
        xuk xukVar = this.dataSource;
        if (xukVar == null || this.parsePosition >= this.endPosition) {
            this.lookahead = EOF;
            throw new NoSuchElementException();
        }
        try {
            synchronized (xukVar) {
                this.dataSource.position(this.parsePosition);
                b = ((vc) this.boxParser).b(this.dataSource, this);
                this.parsePosition = this.dataSource.position();
            }
            return b;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // xsna.yej
    public <T extends ga8> List<T> getBoxes(Class<T> cls) {
        List<ga8> boxes = getBoxes();
        ArrayList arrayList = null;
        ga8 ga8Var = null;
        for (int i = 0; i < boxes.size(); i++) {
            ga8 ga8Var2 = boxes.get(i);
            if (cls.isInstance(ga8Var2)) {
                if (ga8Var == null) {
                    ga8Var = ga8Var2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(ga8Var);
                    }
                    arrayList.add(ga8Var2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (ga8Var != null) {
            return Collections.singletonList(ga8Var);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // xsna.yej
    public <T extends ga8> List<T> getBoxes(Class<T> cls, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        List<ga8> boxes = getBoxes();
        for (int i = 0; i < boxes.size(); i++) {
            ga8 ga8Var = boxes.get(i);
            if (cls.isInstance(ga8Var)) {
                arrayList.add(ga8Var);
            }
            if (z && (ga8Var instanceof yej)) {
                arrayList.addAll(((yej) ga8Var).getBoxes(cls, z));
            }
        }
        return arrayList;
    }
}
