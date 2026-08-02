package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f59773bb;
    protected int bb_pos;
    e utf8 = e.b();
    private int vtable_size;
    private int vtable_start;

    final class a implements Comparator<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f59774a;

        a(ByteBuffer byteBuffer) {
            this.f59774a = byteBuffer;
        }

        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            return d.this.keysCompare(num, num2, this.f59774a);
        }
    }

    protected static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i11 = 0; i11 < 4; i11++) {
            if (str.charAt(i11) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i11))) {
                return false;
            }
        }
        return true;
    }

    protected static int compareStrings(int i11, int i12, ByteBuffer byteBuffer) {
        int i13 = byteBuffer.getInt(i11) + i11;
        int i14 = byteBuffer.getInt(i12) + i12;
        int i15 = byteBuffer.getInt(i13);
        int i16 = byteBuffer.getInt(i14);
        int i17 = i13 + 4;
        int i18 = i14 + 4;
        int min = Math.min(i15, i16);
        for (int i19 = 0; i19 < min; i19++) {
            int i21 = i19 + i17;
            int i22 = i19 + i18;
            if (byteBuffer.get(i21) != byteBuffer.get(i22)) {
                return byteBuffer.get(i21) - byteBuffer.get(i22);
            }
        }
        return i15 - i16;
    }

    protected int __indirect(int i11) {
        return this.f59773bb.getInt(i11) + i11;
    }

    protected int __offset(int i11) {
        if (i11 < this.vtable_size) {
            return this.f59773bb.getShort(this.vtable_start + i11);
        }
        return 0;
    }

    protected void __reset(int i11, ByteBuffer byteBuffer) {
        this.f59773bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i11;
            int i12 = i11 - byteBuffer.getInt(i11);
            this.vtable_start = i12;
            this.vtable_size = this.f59773bb.getShort(i12);
        }
    }

    protected String __string(int i11) {
        return __string(i11, this.f59773bb, this.utf8);
    }

    protected d __union(d dVar, int i11) {
        return __union(dVar, i11, this.f59773bb);
    }

    protected int __vector(int i11) {
        int i12 = i11 + this.bb_pos;
        return this.f59773bb.getInt(i12) + i12 + 4;
    }

    protected ByteBuffer __vector_as_bytebuffer(int i11, int i12) {
        int __offset = __offset(i11);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.f59773bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit((__vector_len(__offset) * i12) + __vector);
        return order;
    }

    protected ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i11, int i12) {
        int __offset = __offset(i11);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i12) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    protected int __vector_len(int i11) {
        int i12 = i11 + this.bb_pos;
        return this.f59773bb.getInt(this.f59773bb.getInt(i12) + i12);
    }

    public ByteBuffer getByteBuffer() {
        return this.f59773bb;
    }

    protected int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected void sortTables(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        Arrays.sort(numArr, new a(byteBuffer));
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = numArr[i12].intValue();
        }
    }

    protected static int __indirect(int i11, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i11) + i11;
    }

    protected static int __offset(int i11, int i12, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i12;
        return byteBuffer.getShort((i11 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    protected static String __string(int i11, ByteBuffer byteBuffer, e eVar) {
        int i12 = byteBuffer.getInt(i11) + i11;
        return eVar.a(byteBuffer, i12 + 4, byteBuffer.getInt(i12));
    }

    protected static d __union(d dVar, int i11, ByteBuffer byteBuffer) {
        dVar.__reset(__indirect(i11, byteBuffer), byteBuffer);
        return dVar;
    }

    protected static int compareStrings(int i11, byte[] bArr, ByteBuffer byteBuffer) {
        int i12 = byteBuffer.getInt(i11) + i11;
        int i13 = byteBuffer.getInt(i12);
        int length = bArr.length;
        int i14 = i12 + 4;
        int min = Math.min(i13, length);
        for (int i15 = 0; i15 < min; i15++) {
            int i16 = i15 + i14;
            if (byteBuffer.get(i16) != bArr[i15]) {
                return byteBuffer.get(i16) - bArr[i15];
            }
        }
        return i13 - length;
    }

    public void __reset() {
        __reset(0, null);
    }
}
