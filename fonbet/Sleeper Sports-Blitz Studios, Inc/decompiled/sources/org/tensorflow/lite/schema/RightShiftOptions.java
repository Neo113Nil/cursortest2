package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class RightShiftOptions extends Table {
    public void unpackTo(RightShiftOptionsT rightShiftOptionsT) {
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static RightShiftOptions getRootAsRightShiftOptions(ByteBuffer byteBuffer) {
        return getRootAsRightShiftOptions(byteBuffer, new RightShiftOptions());
    }

    public static RightShiftOptions getRootAsRightShiftOptions(ByteBuffer byteBuffer, RightShiftOptions rightShiftOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rightShiftOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public RightShiftOptions __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public static void startRightShiftOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static int endRightShiftOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public RightShiftOptions get(int i) {
            return get(new RightShiftOptions(), i);
        }

        public RightShiftOptions get(RightShiftOptions rightShiftOptions, int i) {
            return rightShiftOptions.__assign(RightShiftOptions.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public RightShiftOptionsT unpack() {
        RightShiftOptionsT rightShiftOptionsT = new RightShiftOptionsT();
        unpackTo(rightShiftOptionsT);
        return rightShiftOptionsT;
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RightShiftOptionsT rightShiftOptionsT) {
        if (rightShiftOptionsT == null) {
            return 0;
        }
        startRightShiftOptions(flatBufferBuilder);
        return endRightShiftOptions(flatBufferBuilder);
    }
}
