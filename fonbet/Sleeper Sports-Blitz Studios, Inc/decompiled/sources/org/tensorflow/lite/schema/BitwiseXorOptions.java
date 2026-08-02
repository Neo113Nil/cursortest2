package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class BitwiseXorOptions extends Table {
    public void unpackTo(BitwiseXorOptionsT bitwiseXorOptionsT) {
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static BitwiseXorOptions getRootAsBitwiseXorOptions(ByteBuffer byteBuffer) {
        return getRootAsBitwiseXorOptions(byteBuffer, new BitwiseXorOptions());
    }

    public static BitwiseXorOptions getRootAsBitwiseXorOptions(ByteBuffer byteBuffer, BitwiseXorOptions bitwiseXorOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bitwiseXorOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public BitwiseXorOptions __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public static void startBitwiseXorOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static int endBitwiseXorOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public BitwiseXorOptions get(int i) {
            return get(new BitwiseXorOptions(), i);
        }

        public BitwiseXorOptions get(BitwiseXorOptions bitwiseXorOptions, int i) {
            return bitwiseXorOptions.__assign(BitwiseXorOptions.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public BitwiseXorOptionsT unpack() {
        BitwiseXorOptionsT bitwiseXorOptionsT = new BitwiseXorOptionsT();
        unpackTo(bitwiseXorOptionsT);
        return bitwiseXorOptionsT;
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BitwiseXorOptionsT bitwiseXorOptionsT) {
        if (bitwiseXorOptionsT == null) {
            return 0;
        }
        startBitwiseXorOptions(flatBufferBuilder);
        return endBitwiseXorOptions(flatBufferBuilder);
    }
}
