package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class BitcastOptions extends Table {
    public void unpackTo(BitcastOptionsT bitcastOptionsT) {
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static BitcastOptions getRootAsBitcastOptions(ByteBuffer byteBuffer) {
        return getRootAsBitcastOptions(byteBuffer, new BitcastOptions());
    }

    public static BitcastOptions getRootAsBitcastOptions(ByteBuffer byteBuffer, BitcastOptions bitcastOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bitcastOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public BitcastOptions __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public static void startBitcastOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static int endBitcastOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public BitcastOptions get(int i) {
            return get(new BitcastOptions(), i);
        }

        public BitcastOptions get(BitcastOptions bitcastOptions, int i) {
            return bitcastOptions.__assign(BitcastOptions.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public BitcastOptionsT unpack() {
        BitcastOptionsT bitcastOptionsT = new BitcastOptionsT();
        unpackTo(bitcastOptionsT);
        return bitcastOptionsT;
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BitcastOptionsT bitcastOptionsT) {
        if (bitcastOptionsT == null) {
            return 0;
        }
        startBitcastOptions(flatBufferBuilder);
        return endBitcastOptions(flatBufferBuilder);
    }
}
