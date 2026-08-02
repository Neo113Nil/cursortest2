package V1;

import b1.AbstractC2335D;
import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import com.reactnativecommunity.clipboard.ClipboardModule;
import e1.AbstractC4156x;
import e1.I;
import e1.J;
import e1.Z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h extends Q1.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f12348b = new a() { // from class: V1.g
        @Override // V1.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a f12349a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f12350a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12351b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12352c;

        public b(int i10, boolean z10, int i11) {
            this.f12350a = i10;
            this.f12351b = z10;
            this.f12352c = i11;
        }
    }

    public h() {
        this(null);
    }

    public static int A(J j10, int i10) {
        byte[] f10 = j10.f();
        int g10 = j10.g();
        int i11 = g10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= g10 + i10) {
                return i10;
            }
            if ((f10[i11] & UByte.MAX_VALUE) == 255 && f10[i12] == 0) {
                System.arraycopy(f10, i11 + 2, f10, i12, (i10 - (i11 - g10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B(J j10, int i10, int i11, boolean z10) {
        int P10;
        long P11;
        int i12;
        int i13;
        int g10 = j10.g();
        while (true) {
            try {
                boolean z11 = true;
                if (j10.a() < i11) {
                    j10.b0(g10);
                    return true;
                }
                if (i10 >= 3) {
                    P10 = j10.v();
                    P11 = j10.O();
                    i12 = j10.U();
                } else {
                    P10 = j10.P();
                    P11 = j10.P();
                    i12 = 0;
                }
                if (P10 == 0 && P11 == 0 && i12 == 0) {
                    j10.b0(g10);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & P11) != 0) {
                        j10.b0(g10);
                        return false;
                    }
                    P11 = (((P11 >> 24) & 255) << 21) | (P11 & 255) | (((P11 >> 8) & 255) << 7) | (((P11 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i13 = (i12 & 64) != 0 ? 1 : 0;
                } else {
                    if (i10 == 3) {
                        i13 = (i12 & 32) != 0 ? 1 : 0;
                    } else {
                        i13 = 0;
                        z11 = false;
                    }
                    if (z11) {
                        i13 += 4;
                    }
                    if (P11 < i13) {
                        j10.b0(g10);
                        return false;
                    }
                    if (j10.a() < P11) {
                        j10.b0(g10);
                        return false;
                    }
                    j10.c0((int) P11);
                }
            } catch (Throwable th2) {
                j10.b0(g10);
                throw th2;
            }
        }
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? Z.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static V1.a f(J j10, int i10, int i11) {
        int z10;
        String str;
        int M10 = j10.M();
        Charset w10 = w(M10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        j10.q(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + Ra.c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if (ClipboardModule.MIMETYPE_JPG.equals(str)) {
                str = ClipboardModule.MIMETYPE_JPEG;
            }
            z10 = 2;
        } else {
            z10 = z(bArr, 0);
            String e10 = Ra.c.e(new String(bArr, 0, z10, StandardCharsets.ISO_8859_1));
            if (e10.indexOf(47) == -1) {
                str = "image/" + e10;
            } else {
                str = e10;
            }
        }
        int i13 = bArr[z10 + 1] & UByte.MAX_VALUE;
        int i14 = z10 + 2;
        int y10 = y(bArr, i14, M10);
        return new V1.a(str, new String(bArr, i14, y10 - i14, w10), i13, d(bArr, y10 + v(M10), i12));
    }

    public static V1.b g(J j10, int i10, String str) {
        byte[] bArr = new byte[i10];
        j10.q(bArr, 0, i10);
        return new V1.b(str, bArr);
    }

    public static c h(J j10, int i10, int i11, boolean z10, int i12, a aVar) {
        int g10 = j10.g();
        int z11 = z(j10.f(), g10);
        String str = new String(j10.f(), g10, z11 - g10, StandardCharsets.ISO_8859_1);
        j10.b0(z11 + 1);
        int v10 = j10.v();
        int v11 = j10.v();
        long O10 = j10.O();
        if (O10 == BodyPartID.bodyIdMax) {
            O10 = -1;
        }
        long O11 = j10.O();
        long j11 = O11 == BodyPartID.bodyIdMax ? -1L : O11;
        ArrayList arrayList = new ArrayList();
        int i13 = g10 + i10;
        while (j10.g() < i13) {
            i k10 = k(i11, j10, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, v10, v11, O10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    public static d i(J j10, int i10, int i11, boolean z10, int i12, a aVar) {
        int g10 = j10.g();
        int z11 = z(j10.f(), g10);
        String str = new String(j10.f(), g10, z11 - g10, StandardCharsets.ISO_8859_1);
        j10.b0(z11 + 1);
        int M10 = j10.M();
        boolean z12 = (M10 & 2) != 0;
        boolean z13 = (M10 & 1) != 0;
        int M11 = j10.M();
        String[] strArr = new String[M11];
        for (int i13 = 0; i13 < M11; i13++) {
            int g11 = j10.g();
            int z14 = z(j10.f(), g11);
            strArr[i13] = new String(j10.f(), g11, z14 - g11, StandardCharsets.ISO_8859_1);
            j10.b0(z14 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = g10 + i10;
        while (j10.g() < i14) {
            i k10 = k(i11, j10, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e j(J j10, int i10) {
        if (i10 < 4) {
            return null;
        }
        int M10 = j10.M();
        Charset w10 = w(M10);
        byte[] bArr = new byte[3];
        j10.q(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        j10.q(bArr2, 0, i11);
        int y10 = y(bArr2, 0, M10);
        String str2 = new String(bArr2, 0, y10, w10);
        int v10 = y10 + v(M10);
        return new e(str, str2, p(bArr2, v10, y(bArr2, v10, M10), w10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [V1.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [e1.J] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i k(int i10, J j10, boolean z10, int i11, a aVar) {
        int Q10;
        int i12;
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        int i15;
        J j11;
        Throwable th2;
        J j12;
        int i16;
        J j13;
        ?? r122;
        i g10;
        int i17 = i10;
        int M10 = j10.M();
        int M11 = j10.M();
        int M12 = j10.M();
        int M13 = i17 >= 3 ? j10.M() : 0;
        if (i17 == 4) {
            Q10 = j10.Q();
            if (!z10) {
                Q10 = (((Q10 >> 24) & 255) << 21) | (Q10 & 255) | (((Q10 >> 8) & 255) << 7) | (((Q10 >> 16) & 255) << 14);
            }
        } else {
            Q10 = i17 == 3 ? j10.Q() : j10.P();
        }
        int i18 = Q10;
        int U10 = i17 >= 3 ? j10.U() : 0;
        if (M10 == 0 && M11 == 0 && M12 == 0 && M13 == 0 && i18 == 0 && U10 == 0) {
            j10.b0(j10.j());
            return null;
        }
        int g11 = j10.g() + i18;
        if (g11 > j10.j()) {
            AbstractC4156x.i("Id3Decoder", "Frame size exceeds remaining tag data");
            j10.b0(j10.j());
            return null;
        }
        if (aVar != null) {
            boolean a10 = aVar.a(i17, M10, M11, M12, M13);
            i17 = i17;
            r12 = M10;
            i12 = M11;
            if (!a10) {
                j10.b0(g11);
                return null;
            }
        } else {
            i12 = M11;
            r12 = M10;
        }
        if (i17 == 3) {
            z11 = (U10 & 128) != 0;
            z13 = (U10 & 64) != 0;
            z12 = (U10 & 32) != 0;
            z14 = false;
            r7 = z11;
        } else if (i17 == 4) {
            boolean z15 = (U10 & 64) != 0;
            boolean z16 = (U10 & 8) != 0;
            boolean z17 = (U10 & 4) != 0;
            z14 = (U10 & 2) != 0;
            r7 = (U10 & 1) != 0;
            z12 = z15;
            z11 = r7;
            r7 = z16;
            z13 = z17;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (r7 || z13) {
            AbstractC4156x.i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            j10.b0(g11);
            return null;
        }
        if (z12) {
            i18--;
            j10.c0(1);
        }
        if (z11) {
            i18 -= 4;
            j10.c0(4);
        }
        if (z14) {
            i18 = A(j10, i18);
        }
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                j12 = j10;
            }
        } catch (Exception e10) {
            e = e10;
            i13 = r12;
            i14 = i12;
            i15 = M13;
            j11 = j10;
            i12 = i18;
            th2 = null;
            i16 = M12;
            j13 = j11;
            j13.b0(g11);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        } catch (OutOfMemoryError e11) {
            e = e11;
            i13 = r12;
            i14 = i12;
            i15 = M13;
            j11 = j10;
            i12 = i18;
            th2 = null;
            i16 = M12;
            j13 = j11;
            j13.b0(g11);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i12 == 88 && M12 == 88 && (i17 == 2 || M13 == 88)) {
            g10 = s(j10, i18);
        } else if (r12 == 84) {
            g10 = q(j10, i18, x(i17, r12, i12, M12, M13));
        } else if (r12 == 87 && i12 == 88 && M12 == 88 && (i17 == 2 || M13 == 88)) {
            g10 = u(j10, i18);
        } else if (r12 == 87) {
            g10 = t(j10, i18, x(i17, r12, i12, M12, M13));
        } else if (r12 == 80 && i12 == 82 && M12 == 73 && M13 == 86) {
            g10 = o(j10, i18);
        } else {
            if (r12 != 71 || i12 != 69 || M12 != 79 || (M13 != 66 && i17 != 2)) {
                th2 = null;
                try {
                } catch (Exception e12) {
                    e = e12;
                    i13 = r12;
                    i14 = i12;
                    i15 = M13;
                    j11 = j10;
                    i12 = i18;
                    i16 = M12;
                    j13 = j11;
                    j13.b0(g11);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                } catch (OutOfMemoryError e13) {
                    e = e13;
                    i13 = r12;
                    i14 = i12;
                    i15 = M13;
                    j11 = j10;
                    i12 = i18;
                    i16 = M12;
                    j13 = j11;
                    j13.b0(g11);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (i17 != 2 ? r12 == 65 && i12 == 80 && M12 == 73 && M13 == 67 : r12 == 80 && i12 == 73 && M12 == 67) {
                    g10 = f(j10, i18, i17);
                } else {
                    if (r12 != 67 || i12 != 79 || M12 != 77 || (M13 != 77 && i17 != 2)) {
                        if (r12 == 67 && i12 == 72 && M12 == 65 && M13 == 80) {
                            i13 = r12;
                            i14 = i12;
                            i15 = M13;
                            i12 = i18;
                            i16 = M12;
                            try {
                                g10 = h(j10, i12, i17, z10, i11, aVar);
                                i17 = i10;
                                r12 = j10;
                            } catch (Exception e14) {
                                e = e14;
                                i17 = i10;
                                j13 = j10;
                                j13.b0(g11);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                i17 = i10;
                                j13 = j10;
                                j13.b0(g11);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th4) {
                                th = th4;
                                j12 = j10;
                                j12.b0(g11);
                                throw th;
                            }
                        } else {
                            i13 = r12;
                            i14 = i12;
                            i15 = M13;
                            i12 = i18;
                            i16 = M12;
                            try {
                                if (i13 == 67 && i14 == 84 && i16 == 79 && i15 == 67) {
                                    i17 = i10;
                                    J j14 = j10;
                                    g10 = i(j14, i12, i17, z10, i11, aVar);
                                    r12 = j14;
                                } else {
                                    i17 = i10;
                                    J j15 = j10;
                                    if (i13 == 77 && i14 == 76 && i16 == 76 && i15 == 84) {
                                        g10 = n(j15, i12);
                                        r12 = j15;
                                    } else {
                                        g10 = g(j15, i12, x(i17, i13, i14, i16, i15));
                                        r12 = j15;
                                    }
                                }
                            } catch (Exception e16) {
                                e = e16;
                                j13 = r12;
                                j13.b0(g11);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e17) {
                                e = e17;
                                j13 = r12;
                                j13.b0(g11);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th5) {
                                th = th5;
                                j12 = r12;
                                j12.b0(g11);
                                throw th;
                            }
                        }
                        r12.b0(g11);
                        r122 = g10;
                        e = th2;
                        if (r122 == 0) {
                            AbstractC4156x.j("Id3Decoder", "Failed to decode frame: id=" + x(i17, i13, i14, i16, i15) + ", frameSize=" + i12, e);
                        }
                        return r122;
                    }
                    g10 = j(j10, i18);
                }
                i13 = r12;
                i14 = i12;
                i15 = M13;
                r12 = j10;
                i12 = i18;
                r12 = r12;
                i16 = M12;
                r12.b0(g11);
                r122 = g10;
                e = th2;
                if (r122 == 0) {
                }
                return r122;
            }
            g10 = l(j10, i18);
        }
        i13 = r12;
        i14 = i12;
        i15 = M13;
        r12 = j10;
        i12 = i18;
        th2 = null;
        r12 = r12;
        i16 = M12;
        r12.b0(g11);
        r122 = g10;
        e = th2;
        if (r122 == 0) {
        }
        return r122;
    }

    public static f l(J j10, int i10) {
        int M10 = j10.M();
        Charset w10 = w(M10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        j10.q(bArr, 0, i11);
        int z10 = z(bArr, 0);
        String u10 = AbstractC2335D.u(new String(bArr, 0, z10, StandardCharsets.ISO_8859_1));
        int i12 = z10 + 1;
        int y10 = y(bArr, i12, M10);
        String p10 = p(bArr, i12, y10, w10);
        int v10 = y10 + v(M10);
        int y11 = y(bArr, v10, M10);
        return new f(u10, p10, p(bArr, v10, y11, w10), d(bArr, y11 + v(M10), i11));
    }

    public static b m(J j10) {
        if (j10.a() < 10) {
            AbstractC4156x.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int P10 = j10.P();
        if (P10 != 4801587) {
            AbstractC4156x.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(P10)));
            return null;
        }
        int M10 = j10.M();
        j10.c0(1);
        int M11 = j10.M();
        int L10 = j10.L();
        if (M10 == 2) {
            if ((M11 & 64) != 0) {
                AbstractC4156x.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (M10 == 3) {
            if ((M11 & 64) != 0) {
                int v10 = j10.v();
                j10.c0(v10);
                L10 -= v10 + 4;
            }
        } else {
            if (M10 != 4) {
                AbstractC4156x.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + M10);
                return null;
            }
            if ((M11 & 64) != 0) {
                int L11 = j10.L();
                j10.c0(L11 - 4);
                L10 -= L11;
            }
            if ((M11 & 16) != 0) {
                L10 -= 10;
            }
        }
        return new b(M10, M10 < 4 && (M11 & 128) != 0, L10);
    }

    public static l n(J j10, int i10) {
        int U10 = j10.U();
        int P10 = j10.P();
        int P11 = j10.P();
        int M10 = j10.M();
        int M11 = j10.M();
        I i11 = new I();
        i11.m(j10);
        int i12 = ((i10 - 10) * 8) / (M10 + M11);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int h10 = i11.h(M10);
            int h11 = i11.h(M11);
            iArr[i13] = h10;
            iArr2[i13] = h11;
        }
        return new l(U10, P10, P11, iArr, iArr2);
    }

    public static m o(J j10, int i10) {
        byte[] bArr = new byte[i10];
        j10.q(bArr, 0, i10);
        int z10 = z(bArr, 0);
        return new m(new String(bArr, 0, z10, StandardCharsets.ISO_8859_1), d(bArr, z10 + 1, i10));
    }

    public static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static n q(J j10, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int M10 = j10.M();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        j10.q(bArr, 0, i11);
        return new n(str, null, r(bArr, M10, 0));
    }

    public static AbstractC3445z r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC3445z.u("");
        }
        AbstractC3445z.a k10 = AbstractC3445z.k();
        int y10 = y(bArr, i11, i10);
        while (i11 < y10) {
            k10.a(new String(bArr, i11, y10 - i11, w(i10)));
            i11 = v(i10) + y10;
            y10 = y(bArr, i11, i10);
        }
        AbstractC3445z m10 = k10.m();
        return m10.isEmpty() ? AbstractC3445z.u("") : m10;
    }

    public static n s(J j10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int M10 = j10.M();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        j10.q(bArr, 0, i11);
        int y10 = y(bArr, 0, M10);
        return new n("TXXX", new String(bArr, 0, y10, w(M10)), r(bArr, M10, y10 + v(M10)));
    }

    public static o t(J j10, int i10, String str) {
        byte[] bArr = new byte[i10];
        j10.q(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o u(J j10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int M10 = j10.M();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        j10.q(bArr, 0, i11);
        int y10 = y(bArr, 0, M10);
        String str = new String(bArr, 0, y10, w(M10));
        int v10 = y10 + v(M10);
        return new o("WXXX", str, p(bArr, v10, z(bArr, v10), StandardCharsets.ISO_8859_1));
    }

    public static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int y(byte[] bArr, int i10, int i11) {
        int z10 = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return z10;
        }
        while (z10 < bArr.length - 1) {
            if ((z10 - i10) % 2 == 0 && bArr[z10 + 1] == 0) {
                return z10;
            }
            z10 = z(bArr, z10 + 1);
        }
        return bArr.length;
    }

    public static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // Q1.c
    public C2334C b(Q1.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public C2334C e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        J j10 = new J(bArr, i10);
        b m10 = m(j10);
        if (m10 == null) {
            return null;
        }
        int g10 = j10.g();
        int i11 = m10.f12350a == 2 ? 6 : 10;
        int i12 = m10.f12352c;
        if (m10.f12351b) {
            i12 = A(j10, m10.f12352c);
        }
        j10.a0(g10 + i12);
        boolean z10 = false;
        if (!B(j10, m10.f12350a, i11, false)) {
            if (m10.f12350a != 4 || !B(j10, 4, i11, true)) {
                AbstractC4156x.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f12350a);
                return null;
            }
            z10 = true;
        }
        while (j10.a() >= i11) {
            i k10 = k(m10.f12350a, j10, z10, i11, this.f12349a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new C2334C(arrayList);
    }

    public h(a aVar) {
        this.f12349a = aVar;
    }
}
