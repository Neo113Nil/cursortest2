package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.BoxParser;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class FreeBox implements ParsableBox {
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List<ParsableBox> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public FreeBox(int i) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i);
    }

    public ByteBuffer getData() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<ParsableBox> it = this.replacers.iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(allocate, this.data.limit() + 8);
        allocate.put(TYPE.getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }

    @Override // org.mp4parser.Box
    public long getSize() {
        Iterator<ParsableBox> it = this.replacers.iterator();
        long j = 8;
        while (it.hasNext()) {
            j += it.next().getSize();
        }
        return j + this.data.limit();
    }

    @Override // org.mp4parser.Box
    public String getType() {
        return TYPE;
    }

    @Override // org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        this.data = ByteBuffer.allocate(CastUtils.l2i(j));
        int i = 0;
        do {
            i += readableByteChannel.read(this.data);
        } while (i < j);
    }

    public void addAndReplace(ParsableBox parsableBox) {
        this.data.position(CastUtils.l2i(parsableBox.getSize()));
        this.data = this.data.slice();
        this.replacers.add(parsableBox);
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

    public int hashCode() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
