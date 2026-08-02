package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class CustomMetadata extends Table {
    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static CustomMetadata getRootAsCustomMetadata(ByteBuffer byteBuffer) {
        return getRootAsCustomMetadata(byteBuffer, new CustomMetadata());
    }

    public static CustomMetadata getRootAsCustomMetadata(ByteBuffer byteBuffer, CustomMetadata customMetadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return customMetadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public CustomMetadata __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public String name() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public int data(int i) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public int dataLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public ByteVector dataVector() {
        return dataVector(new ByteVector());
    }

    public ByteVector dataVector(ByteVector byteVector) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return byteVector.__assign(__vector(__offset), this.bb);
        }
        return null;
    }

    public ByteBuffer dataAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public static int createCustomMetadata(FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.startTable(2);
        addData(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        return endCustomMetadata(flatBufferBuilder);
    }

    public static void startCustomMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static int endCustomMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public CustomMetadata get(int i) {
            return get(new CustomMetadata(), i);
        }

        public CustomMetadata get(CustomMetadata customMetadata, int i) {
            return customMetadata.__assign(CustomMetadata.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public CustomMetadataT unpack() {
        CustomMetadataT customMetadataT = new CustomMetadataT();
        unpackTo(customMetadataT);
        return customMetadataT;
    }

    public void unpackTo(CustomMetadataT customMetadataT) {
        customMetadataT.setName(name());
        int[] iArr = new int[dataLength()];
        for (int i = 0; i < dataLength(); i++) {
            iArr[i] = data(i);
        }
        customMetadataT.setData(iArr);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CustomMetadataT customMetadataT) {
        int i = 0;
        if (customMetadataT == null) {
            return 0;
        }
        int createString = customMetadataT.getName() == null ? 0 : flatBufferBuilder.createString(customMetadataT.getName());
        if (customMetadataT.getData() != null) {
            byte[] bArr = new byte[customMetadataT.getData().length];
            int[] data = customMetadataT.getData();
            int length = data.length;
            int i2 = 0;
            while (i < length) {
                bArr[i2] = (byte) data[i];
                i2++;
                i++;
            }
            i = createDataVector(flatBufferBuilder, bArr);
        }
        return createCustomMetadata(flatBufferBuilder, createString, i);
    }
}
