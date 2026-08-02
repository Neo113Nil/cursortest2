package com.fasterxml.jackson.core.io;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.dyp0;
import xsna.jmi0;
import xsna.pt8;
import xsna.sl9;
import xsna.xay;

/* loaded from: classes12.dex */
public class SerializedString implements jmi0, Serializable {
    public static final xay c = xay.a;
    private static final long serialVersionUID = 1;
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;
    public transient String b;

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.b = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0110, code lost:
    
        throw new java.lang.IllegalArgumentException("Broken surrogate pair: first char 0x" + java.lang.Integer.toHexString(r6) + ", second 0x" + java.lang.Integer.toHexString(r8) + "; illegal combination");
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] d() {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2 = this._unquotedUTF8Ref;
        if (bArr2 != null) {
            return bArr2;
        }
        String str = this._value;
        c.getClass();
        int length = str.length();
        int min = Math.min(Math.max(24, length + 6 + (length >> 1)), 32000);
        byte[] bArr3 = new byte[min];
        pt8 pt8Var = null;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            int i5 = i3 + 1;
            int charAt = str.charAt(i3);
            while (charAt <= 127) {
                if (i4 >= min) {
                    if (pt8Var == null) {
                        pt8Var = new pt8(bArr3, i4);
                    }
                    pt8Var.m();
                    byte[] bArr4 = pt8Var.d;
                    bArr3 = bArr4;
                    min = bArr4.length;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                bArr3[i4] = (byte) charAt;
                if (i5 >= length) {
                    i4 = i6;
                    break loop0;
                }
                int charAt2 = str.charAt(i5);
                i5++;
                charAt = charAt2;
                i4 = i6;
            }
            if (pt8Var == null) {
                pt8Var = new pt8(bArr3, i4);
            }
            if (i4 >= min) {
                pt8Var.m();
                bArr3 = pt8Var.d;
                min = bArr3.length;
                i4 = 0;
            }
            if (charAt < 2048) {
                i = i4 + 1;
                bArr3[i4] = (byte) ((charAt >> 6) | PsExtractor.AUDIO_STREAM);
            } else if (charAt < 55296 || charAt > 57343) {
                int i7 = i4 + 1;
                bArr3[i4] = (byte) ((charAt >> 12) | 224);
                if (i7 >= min) {
                    pt8Var.m();
                    bArr3 = pt8Var.d;
                    min = bArr3.length;
                    i7 = 0;
                }
                bArr3[i7] = (byte) (((charAt >> 6) & 63) | 128);
                i = i7 + 1;
            } else {
                if (charAt > 56319) {
                    throw new IllegalArgumentException(dyp0.h(charAt));
                }
                if (i5 >= length) {
                    throw new IllegalArgumentException(dyp0.h(charAt));
                }
                int i8 = i5 + 1;
                int charAt3 = str.charAt(i5);
                if (charAt3 < 56320 || charAt3 > 57343) {
                    break;
                }
                int i9 = ((charAt - 55296) << 10) + 65536 + (charAt3 - 56320);
                if (i9 > 1114111) {
                    throw new IllegalArgumentException(dyp0.h(i9));
                }
                int i10 = i4 + 1;
                bArr3[i4] = (byte) ((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                if (i10 >= min) {
                    pt8Var.m();
                    bArr3 = pt8Var.d;
                    min = bArr3.length;
                    i10 = 0;
                }
                int i11 = i10 + 1;
                bArr3[i10] = (byte) (((i9 >> 12) & 63) | 128);
                if (i11 >= min) {
                    pt8Var.m();
                    byte[] bArr5 = pt8Var.d;
                    bArr3 = bArr5;
                    min = bArr5.length;
                    i11 = 0;
                }
                i = i11 + 1;
                bArr3[i11] = (byte) (((i9 >> 6) & 63) | 128);
                i2 = i9;
                i3 = i8;
                if (i < min) {
                    pt8Var.m();
                    byte[] bArr6 = pt8Var.d;
                    bArr3 = bArr6;
                    min = bArr6.length;
                    i = 0;
                }
                bArr3[i] = (byte) ((i2 & 63) | 128);
                i4 = i + 1;
            }
            i2 = charAt;
            i3 = i5;
            if (i < min) {
            }
            bArr3[i] = (byte) ((i2 & 63) | 128);
            i4 = i + 1;
        }
        if (pt8Var == null) {
            bArr = Arrays.copyOfRange(bArr3, 0, i4);
        } else {
            pt8Var.e = i4;
            LinkedList<byte[]> linkedList = pt8Var.b;
            int i12 = pt8Var.c + i4;
            if (i12 == 0) {
                bArr = pt8.f;
            } else {
                byte[] bArr7 = new byte[i12];
                Iterator<byte[]> it = linkedList.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    byte[] next = it.next();
                    int length2 = next.length;
                    System.arraycopy(next, 0, bArr7, i13, length2);
                    i13 += length2;
                }
                System.arraycopy(pt8Var.d, 0, bArr7, i13, pt8Var.e);
                int i14 = i13 + pt8Var.e;
                if (i14 != i12) {
                    throw new RuntimeException(sl9.c(i12, i14, "Internal error: total len assumed to be ", ", copied ", " bytes"));
                }
                if (!linkedList.isEmpty()) {
                    pt8Var.c = 0;
                    pt8Var.e = 0;
                    if (!linkedList.isEmpty()) {
                        linkedList.clear();
                    }
                }
                bArr = bArr7;
            }
        }
        this._unquotedUTF8Ref = bArr;
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    public final String g() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public Object readResolve() {
        return new SerializedString(this.b);
    }

    public final String toString() {
        return this._value;
    }
}
