package com.vk.core.serialize;

import com.vk.core.serialize.Serializer;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.HashMap;
import xsna.emb;
import xsna.epx;
import xsna.lhg;
import xsna.vl8;

/* compiled from: StreamParcelableBuffer.kt */
/* loaded from: classes17.dex */
public final class b {

    /* compiled from: StreamParcelableBuffer.kt */
    public static final class a implements DataInput {
        public final vl8 b;

        public a(vl8 vl8Var) {
            this.b = vl8Var;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            return this.b.readInt() != 0;
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            return this.b.readByte();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            return (char) this.b.readInt();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(this.b.readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(this.b.readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            if (bArr != null) {
                this.b.readFully(bArr);
            }
        }

        @Override // java.io.DataInput
        public final int readInt() {
            return this.b.readInt();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataInput
        public final long readLong() {
            return this.b.readLong();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            vl8 vl8Var = this.b;
            long readLong = vl8Var.readLong();
            vl8Var.getClass();
            return vl8Var.w(readLong, emb.b);
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: StreamParcelableBuffer.kt */
    /* renamed from: com.vk.core.serialize.b$b, reason: collision with other inner class name */
    public static final class C0773b implements DataOutput {
        public final vl8 b;

        public C0773b(vl8 vl8Var) {
            this.b = vl8Var;
        }

        @Override // java.io.DataOutput
        public final void write(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataOutput
        public final void writeBoolean(boolean z) {
            this.b.N(z ? 1 : 0);
        }

        @Override // java.io.DataOutput
        public final void writeByte(int i) {
            this.b.I(i);
        }

        @Override // java.io.DataOutput
        public final void writeBytes(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataOutput
        public final void writeChar(int i) {
            this.b.N(i);
        }

        @Override // java.io.DataOutput
        public final void writeChars(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataOutput
        public final void writeDouble(double d) {
            this.b.O(Double.doubleToLongBits(d));
        }

        @Override // java.io.DataOutput
        public final void writeFloat(float f) {
            this.b.N(Float.floatToIntBits(f));
        }

        @Override // java.io.DataOutput
        public final void writeInt(int i) {
            this.b.N(i);
        }

        @Override // java.io.DataOutput
        public final void writeLong(long j) {
            this.b.O(j);
        }

        @Override // java.io.DataOutput
        public final void writeShort(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataOutput
        public final void writeUTF(String str) {
            long length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) < 128) {
                i++;
            }
            long j = length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (str.charAt(i) < 2048) {
                    j += (127 - r6) >>> 31;
                    i++;
                } else {
                    int length2 = str.length();
                    int i2 = 0;
                    while (i < length2) {
                        char charAt = str.charAt(i);
                        if (charAt < 2048) {
                            i2 += (127 - charAt) >>> 31;
                        } else {
                            i2 += 2;
                            if (epx.g(55296, charAt) <= 0 && epx.g(charAt, 57343) <= 0) {
                                if (Character.codePointAt(str, i) == charAt) {
                                    throw new IllegalArgumentException(lhg.a(i, "Unpaired surrogate at index "));
                                }
                                i++;
                            }
                        }
                        i++;
                    }
                    j += i2;
                }
            }
            if (j < length) {
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (j + 4294967296L));
            }
            vl8 vl8Var = this.b;
            vl8Var.O(j);
            vl8Var.Q(0, str.length(), str);
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr) {
            if (bArr != null) {
                this.b.write(bArr, 0, bArr.length);
            }
        }
    }

    public b() {
        vl8 vl8Var = new vl8();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        new Serializer.d(new a(vl8Var));
        new Serializer.e(new C0773b(vl8Var));
    }
}
