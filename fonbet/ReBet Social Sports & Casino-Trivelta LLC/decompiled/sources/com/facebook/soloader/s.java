package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import kotlin.UByte;
import kotlin.UShort;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public abstract class s {

    public static class a extends UnsatisfiedLinkError {
        public a(String str) {
            super(str);
        }
    }

    public static String[] a(h hVar) {
        return hVar instanceof i ? c((i) hVar) : b(hVar);
    }

    public static String[] b(h hVar) {
        long j10;
        long f10;
        long j11;
        long j12;
        long g10;
        long j13;
        long g11;
        long j14;
        long d10;
        long j15;
        long d11;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long g12 = g(hVar, allocate, 0L);
        if (g12 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(g12) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z10 = h(hVar, allocate, 4L) == 1;
        long j16 = 5;
        if (h(hVar, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        long g13 = z10 ? g(hVar, allocate, 28L) : d(hVar, allocate, 32L);
        if (z10) {
            j10 = 44;
            f10 = f(hVar, allocate, 44L);
        } else {
            j10 = 44;
            f10 = f(hVar, allocate, 56L);
        }
        int f11 = f(hVar, allocate, z10 ? 42L : 54L);
        boolean z11 = z10;
        long j17 = 40;
        if (f10 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            long g14 = z11 ? g(hVar, allocate, 32L) : d(hVar, allocate, 40L);
            f10 = z11 ? g(hVar, allocate, g14 + 28) : g(hVar, allocate, g14 + j10);
        }
        long j18 = g13;
        long j19 = 0;
        while (true) {
            if (j19 >= f10) {
                j11 = 0;
                break;
            }
            if ((z11 ? g(hVar, allocate, j18) : g(hVar, allocate, j18)) == 2) {
                j11 = z11 ? g(hVar, allocate, j18 + 4) : d(hVar, allocate, j18 + 8);
            } else {
                j18 += f11;
                j19++;
                j17 = j17;
            }
        }
        long j20 = j17;
        if (j11 == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j21 = j11;
        long j22 = 0;
        int i10 = 0;
        while (true) {
            long g15 = z11 ? g(hVar, allocate, j21) : d(hVar, allocate, j21);
            long j23 = j16;
            if (g15 == 1) {
                if (i10 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i10++;
            } else if (g15 == j23) {
                j22 = z11 ? g(hVar, allocate, j21 + 4) : d(hVar, allocate, j21 + 8);
            }
            j21 += z11 ? 8L : 16L;
            if (g15 == 0) {
                if (j22 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= f10) {
                        j12 = 0;
                        break;
                    }
                    if (z11) {
                        j13 = g13;
                        g11 = g(hVar, allocate, j13);
                    } else {
                        j13 = g13;
                        g11 = g(hVar, allocate, j13);
                    }
                    if (g11 == 1) {
                        if (z11) {
                            j14 = f10;
                            d10 = g(hVar, allocate, j13 + 8);
                        } else {
                            j14 = f10;
                            d10 = d(hVar, allocate, j13 + 16);
                        }
                        if (z11) {
                            j15 = d10;
                            d11 = g(hVar, allocate, j13 + 20);
                        } else {
                            j15 = d10;
                            d11 = d(hVar, allocate, j13 + j20);
                        }
                        if (j15 <= j22 && j22 < j15 + d11) {
                            j12 = (z11 ? g(hVar, allocate, j13 + 4) : d(hVar, allocate, j13 + 8)) + (j22 - j15);
                        }
                    } else {
                        j14 = f10;
                    }
                    g13 = j13 + f11;
                    i11++;
                    f10 = j14;
                }
                if (j12 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                do {
                    g10 = z11 ? g(hVar, allocate, j11) : d(hVar, allocate, j11);
                    if (g10 == 1) {
                        strArr[i12] = e(hVar, allocate, (z11 ? g(hVar, allocate, j11 + 4) : d(hVar, allocate, j11 + 8)) + j12);
                        if (i12 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i12++;
                    }
                    j11 += z11 ? 8L : 16L;
                } while (g10 != 0);
                if (i12 == i10) {
                    return strArr;
                }
                throw new a("malformed DT_NEEDED section");
            }
            j16 = j23;
        }
    }

    public static String[] c(i iVar) {
        int i10 = 0;
        while (true) {
            try {
                return b(iVar);
            } catch (ClosedByInterruptException e10) {
                i10++;
                if (i10 > 4) {
                    throw e10;
                }
                Thread.interrupted();
                p.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e10);
                iVar.d();
            }
        }
    }

    public static long d(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 8, j10);
        return byteBuffer.getLong();
    }

    public static String e(h hVar, ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short h10 = h(hVar, byteBuffer, j10);
            if (h10 == 0) {
                return sb2.toString();
            }
            sb2.append((char) h10);
            j10 = j11;
        }
    }

    public static int f(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 2, j10);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public static long g(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 4, j10);
        return byteBuffer.getInt() & BodyPartID.bodyIdMax;
    }

    public static short h(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 1, j10);
        return (short) (byteBuffer.get() & UByte.MAX_VALUE);
    }

    public static void i(h hVar, ByteBuffer byteBuffer, int i10, long j10) {
        int Z10;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        while (byteBuffer.remaining() > 0 && (Z10 = hVar.Z(byteBuffer, j10)) != -1) {
            j10 += Z10;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
