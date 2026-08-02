package com.logrocket.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f6747a = new j1();

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f6748b = new k1();

    public static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i5;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i10 = 0;
        while (i10 < length) {
            try {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i10, (byte) charAt);
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i10 == length) {
            byteBuffer.position(position + i10);
            return;
        }
        position += i10;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i11 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i11, (byte) ((charAt2 & '?') | 128));
                    position = i11;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i11;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i13 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i5 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i13;
                                    i10 = i12;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                                try {
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i10 = i12;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i10 = i12;
                                    position = i5;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new z1(i10, length);
                }
                int i14 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i14, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i10++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static String d(j jVar) {
        StringBuilder sb2 = new StringBuilder(jVar.size());
        for (int i5 = 0; i5 < jVar.size(); i5++) {
            byte b10 = jVar.b(i5);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public abstract int a(CharSequence charSequence, byte[] bArr, int i5, int i10);

    public abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int e(int i5, byte[] bArr, int i10, int i11);

    public abstract void f(byte[] bArr, int i5, int i10);
}
