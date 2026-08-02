package com.reactnativecompressor.Video.VideoCompressor.video;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FileUtils;
import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.IsoFile;
import org.mp4parser.boxes.iso14496.part12.MediaDataBox;
import org.mp4parser.tools.IsoTypeWriter;

/* compiled from: Mdat.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/video/Mdat;", "Lorg/mp4parser/Box;", "<init>", "()V", "parent", "Lorg/mp4parser/Container;", "contentSize", "", "dataOffset", "getParent", "setParent", "", "getSize", "getOffset", "setDataOffset", TypedValues.CycleType.S_WAVE_OFFSET, "setContentSize", "getContentSize", "getType", "", "isSmallBox", "", "getBox", "writableByteChannel", "Ljava/nio/channels/WritableByteChannel;", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Mdat implements Box {
    private long contentSize = FileUtils.ONE_GB;
    private long dataOffset;
    private Container parent;

    private final boolean isSmallBox(long contentSize) {
        return contentSize + ((long) 8) < 4294967296L;
    }

    public final Container getParent() {
        Container container = this.parent;
        if (container != null) {
            return container;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parent");
        return null;
    }

    public final void setParent(Container parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    @Override // org.mp4parser.Box
    public long getSize() {
        return 16 + this.contentSize;
    }

    /* renamed from: getOffset, reason: from getter */
    public final long getDataOffset() {
        return this.dataOffset;
    }

    public final void setDataOffset(long offset) {
        this.dataOffset = offset;
    }

    public final void setContentSize(long contentSize) {
        this.contentSize = contentSize;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    @Override // org.mp4parser.Box
    public String getType() {
        return MediaDataBox.TYPE;
    }

    @Override // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) {
        Intrinsics.checkNotNullParameter(writableByteChannel, "writableByteChannel");
        ByteBuffer allocate = ByteBuffer.allocate(16);
        long size = getSize();
        if (!isSmallBox(size)) {
            IsoTypeWriter.writeUInt32(allocate, 1L);
        } else if (size >= 0 && size <= 4294967296L) {
            IsoTypeWriter.writeUInt32(allocate, size);
        } else {
            IsoTypeWriter.writeUInt32(allocate, 1L);
        }
        allocate.put(IsoFile.fourCCtoBytes(MediaDataBox.TYPE));
        if (isSmallBox(size)) {
            allocate.put(new byte[8]);
        } else {
            if (size < 0) {
                size = 1;
            }
            IsoTypeWriter.writeUInt64(allocate, size);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
    }
}
