package io.agora.rtc2.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public class Marshallable {
    public static final int PROTO_PACKET_SIZE = 8192;
    private ByteBuffer mBuffer;

    public Marshallable() {
        ByteBuffer allocate = ByteBuffer.allocate(8192);
        this.mBuffer = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.mBuffer.position(2);
    }

    public void clear() {
        this.mBuffer.position(10);
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public void marshall(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public byte[] marshall32() {
        int position = this.mBuffer.position();
        this.mBuffer.putInt(0, position);
        byte[] bArr = new byte[position];
        this.mBuffer.position(0);
        this.mBuffer.get(bArr);
        return bArr;
    }

    public byte[] popAll() {
        byte[] bArr = new byte[this.mBuffer.remaining()];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public Boolean popBool() {
        return Boolean.valueOf(this.mBuffer.get() == 1);
    }

    public byte popByte() {
        return this.mBuffer.get();
    }

    public byte[] popBytes() {
        int i10 = this.mBuffer.getShort();
        byte[] bArr = new byte[0];
        if (i10 <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        this.mBuffer.get(bArr2);
        return bArr2;
    }

    public byte[] popBytes32() {
        int i10 = this.mBuffer.getInt();
        if (i10 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public double popDouble() {
        return this.mBuffer.getDouble();
    }

    public int popInt() {
        return this.mBuffer.getInt();
    }

    public long popInt64() {
        return this.mBuffer.getLong();
    }

    public int[] popIntArray() {
        int popInt = popInt();
        int[] iArr = new int[popInt];
        for (int i10 = 0; i10 < popInt; i10++) {
            iArr[i10] = popInt();
        }
        return iArr;
    }

    public short popShort() {
        return this.mBuffer.getShort();
    }

    public short[] popShortArray() {
        int popInt = popInt();
        short[] sArr = new short[popInt];
        for (int i10 = 0; i10 < popInt; i10++) {
            sArr[i10] = popShort();
        }
        return sArr;
    }

    public String popString16() {
        int i10 = this.mBuffer.getShort();
        if (i10 <= 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        this.mBuffer.get(bArr);
        try {
            return new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public String popString16UTF8() {
        int i10 = this.mBuffer.getShort();
        if (i10 <= 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        this.mBuffer.get(bArr);
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public void pushBool(Boolean bool) {
        this.mBuffer.put(bool.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public void pushByte(byte b10) {
        this.mBuffer.put(b10);
    }

    public void pushBytes(byte[] bArr) {
        this.mBuffer.putShort((short) bArr.length);
        this.mBuffer.put(bArr);
    }

    public void pushBytes32(byte[] bArr) {
        this.mBuffer.putInt(bArr.length);
        this.mBuffer.put(bArr);
    }

    public void pushDouble(double d10) {
        this.mBuffer.putDouble(d10);
    }

    public void pushInt(int i10) {
        this.mBuffer.putInt(i10);
    }

    public void pushInt64(long j10) {
        this.mBuffer.putLong(j10);
    }

    public void pushIntArray(int[] iArr) {
        if (iArr == null) {
            pushInt(0);
            return;
        }
        pushInt(iArr.length);
        for (int i10 : iArr) {
            pushInt(i10);
        }
    }

    public void pushShort(short s10) {
        this.mBuffer.putShort(s10);
    }

    public void pushShortArray(short[] sArr) {
        if (sArr == null) {
            pushInt(0);
            return;
        }
        pushInt(sArr.length);
        for (short s10 : sArr) {
            pushShort(s10);
        }
    }

    public void pushString16(String str) {
        if (str == null) {
            this.mBuffer.putShort((short) 0);
            return;
        }
        this.mBuffer.putShort((short) str.getBytes().length);
        if (str.getBytes().length > 0) {
            this.mBuffer.put(str.getBytes());
        }
    }

    public void pushStringArray(ArrayList<String> arrayList) {
        if (arrayList == null) {
            pushInt(0);
            return;
        }
        int size = arrayList.size();
        pushShort((short) size);
        for (int i10 = 0; i10 < size; i10++) {
            pushBytes(arrayList.get(i10).getBytes());
        }
    }

    public void unmarshall(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void unmarshall32(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.mBuffer = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        popInt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] marshall() {
        int position = (short) this.mBuffer.position();
        this.mBuffer.putShort(0, position);
        byte[] bArr = new byte[position];
        this.mBuffer.position(0);
        this.mBuffer.get(bArr);
        return bArr;
    }

    public void pushIntArray(Integer[] numArr) {
        if (numArr == null) {
            pushInt(0);
            return;
        }
        pushInt(numArr.length);
        for (Integer num : numArr) {
            pushInt(num.intValue());
        }
    }

    public void unmarshall(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.mBuffer = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        popShort();
    }
}
