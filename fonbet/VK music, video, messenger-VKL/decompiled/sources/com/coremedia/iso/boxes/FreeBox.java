package com.coremedia.iso.boxes;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.ga8;
import xsna.pa8;
import xsna.up2;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes12.dex */
public class FreeBox implements ga8 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private yej parent;
    List<ga8> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public void addAndReplace(ga8 ga8Var) {
        this.data.position(up2.p(ga8Var.getSize()));
        this.data = this.data.slice();
        this.replacers.add(ga8Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreeBox freeBox = (FreeBox) obj;
        return getData() == null ? freeBox.getData() == null : getData().equals(freeBox.getData());
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<ga8> it = this.replacers.iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(this.data.limit() + 8);
        allocate.put(TYPE.getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }

    public ByteBuffer getData() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // xsna.ga8
    public yej getParent() {
        return this.parent;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        Iterator<ga8> it = this.replacers.iterator();
        long j = 8;
        while (it.hasNext()) {
            j += it.next().getSize();
        }
        return j + this.data.limit();
    }

    @Override // xsna.ga8
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        this.offset = xukVar.position() - byteBuffer.remaining();
        if (j > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            this.data = xukVar.K0(xukVar.position(), j);
            xukVar.position(xukVar.position() + j);
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(up2.p(j));
            this.data = allocate;
            xukVar.read(allocate);
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // xsna.ga8
    public void setParent(yej yejVar) {
        this.parent = yejVar;
    }

    public FreeBox(int i) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i);
    }
}
