package org.mp4parser.boxes.iso14496.part12;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.ParsableBox;
import org.mp4parser.support.DoNotParseDetail;

/* loaded from: classes10.dex */
public final class MediaDataBox implements ParsableBox, Closeable {
    public static final String TYPE = "mdat";
    File dataFile;
    ByteBuffer header;

    @Override // org.mp4parser.Box
    public String getType() {
        return TYPE;
    }

    @Override // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write((ByteBuffer) this.header.rewind());
        Throwable th = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.dataFile);
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    channel.transferTo(0L, this.dataFile.lastModified(), writableByteChannel);
                    if (channel != null) {
                        channel.close();
                    }
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th2) {
                if (0 == 0) {
                    th = th2;
                } else if (null != th2) {
                    th.addSuppressed(th2);
                }
                fileInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            if (0 == 0) {
                throw th3;
            }
            if (null != th3) {
                th.addSuppressed(th3);
            }
            throw null;
        }
    }

    @Override // org.mp4parser.Box
    public long getSize() {
        return this.header.limit() + this.dataFile.length();
    }

    @Override // org.mp4parser.ParsableBox
    @DoNotParseDetail
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        File createTempFile = File.createTempFile("MediaDataBox", super.toString());
        this.dataFile = createTempFile;
        createTempFile.deleteOnExit();
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
        this.header = allocate;
        allocate.put(byteBuffer);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.dataFile, "rw");
            try {
                randomAccessFile.getChannel().transferFrom(readableByteChannel, 0L, j);
            } finally {
                randomAccessFile.close();
            }
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        File file = this.dataFile;
        if (file != null) {
            file.delete();
        }
    }
}
