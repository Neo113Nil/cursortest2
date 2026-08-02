package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xq9 extends v7a {
    public static final is8 i = new is8(13);
    public final vq9 h;

    public xq9(vq9 vq9Var) {
        this.h = vq9Var;
    }

    public static v90 L(j9e j9eVar, int i2, int i3) {
        int d0;
        String concat;
        int A = j9eVar.A();
        Charset a0 = a0(A);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        j9eVar.k(bArr, 0, i4);
        if (i3 == 2) {
            concat = "image/" + rz8.W(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            d0 = 2;
        } else {
            d0 = d0(bArr, 0);
            String W = rz8.W(new String(bArr, 0, d0, StandardCharsets.ISO_8859_1));
            concat = W.indexOf(47) == -1 ? "image/".concat(W) : W;
        }
        int i5 = bArr[d0 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = d0 + 2;
        int c0 = c0(i6, A, bArr);
        String str = new String(bArr, i6, c0 - i6, a0);
        int Z = Z(A) + c0;
        return new v90(concat, str, i5, i4 <= Z ? nik.b : Arrays.copyOfRange(bArr, Z, i4));
    }

    public static ko2 M(j9e j9eVar, int i2, int i3, boolean z, int i4, vq9 vq9Var) {
        int i5 = j9eVar.b;
        int d0 = d0(j9eVar.a, i5);
        String str = new String(j9eVar.a, i5, d0 - i5, StandardCharsets.ISO_8859_1);
        j9eVar.N(d0 + 1);
        int m = j9eVar.m();
        int m2 = j9eVar.m();
        long C = j9eVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = j9eVar.C();
        long j = C2 == 4294967295L ? -1L : C2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (j9eVar.b < i6) {
            yq9 P = P(i3, j9eVar, z, i4, vq9Var);
            if (P != null) {
                arrayList.add(P);
            }
        }
        return new ko2(str, m, m2, C, j, (yq9[]) arrayList.toArray(new yq9[0]));
    }

    public static lo2 N(j9e j9eVar, int i2, int i3, boolean z, int i4, vq9 vq9Var) {
        int i5 = j9eVar.b;
        int d0 = d0(j9eVar.a, i5);
        String str = new String(j9eVar.a, i5, d0 - i5, StandardCharsets.ISO_8859_1);
        j9eVar.N(d0 + 1);
        int A = j9eVar.A();
        boolean z2 = (A & 2) != 0;
        boolean z3 = (A & 1) != 0;
        int A2 = j9eVar.A();
        String[] strArr = new String[A2];
        for (int i6 = 0; i6 < A2; i6++) {
            int i7 = j9eVar.b;
            int d02 = d0(j9eVar.a, i7);
            strArr[i6] = new String(j9eVar.a, i7, d02 - i7, StandardCharsets.ISO_8859_1);
            j9eVar.N(d02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (j9eVar.b < i8) {
            yq9 P = P(i3, j9eVar, z, i4, vq9Var);
            if (P != null) {
                arrayList.add(P);
            }
        }
        return new lo2(str, z2, z3, strArr, (yq9[]) arrayList.toArray(new yq9[0]));
    }

    public static u33 O(int i2, j9e j9eVar) {
        if (i2 < 4) {
            return null;
        }
        int A = j9eVar.A();
        Charset a0 = a0(A);
        byte[] bArr = new byte[3];
        j9eVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        j9eVar.k(bArr2, 0, i3);
        int c0 = c0(0, A, bArr2);
        String str2 = new String(bArr2, 0, c0, a0);
        int Z = Z(A) + c0;
        return new u33(str, str2, T(bArr2, Z, c0(Z, A, bArr2), a0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [yq9] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [j9e] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yq9 P(int i2, j9e j9eVar, boolean z, int i3, vq9 vq9Var) {
        int E;
        int i4;
        int i5;
        int i6;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        j9e j9eVar2;
        Throwable th;
        j9e j9eVar3;
        int i9;
        j9e j9eVar4;
        ?? r12;
        yq9 xv1Var;
        int i10 = i2;
        int A = j9eVar.A();
        int A2 = j9eVar.A();
        int A3 = j9eVar.A();
        int A4 = i10 >= 3 ? j9eVar.A() : 0;
        if (i10 == 4) {
            E = j9eVar.E();
            if (!z) {
                E = (((E >> 24) & 255) << 21) | (E & 255) | (((E >> 8) & 255) << 7) | (((E >> 16) & 255) << 14);
            }
        } else {
            E = i10 == 3 ? j9eVar.E() : j9eVar.D();
        }
        int i11 = E;
        int H = i10 >= 3 ? j9eVar.H() : 0;
        if (A == 0 && A2 == 0 && A3 == 0 && A4 == 0 && i11 == 0 && H == 0) {
            j9eVar.N(j9eVar.c);
            return null;
        }
        int i12 = j9eVar.b + i11;
        if (i12 > j9eVar.c) {
            tgj.d0("Frame size exceeds remaining tag data");
            j9eVar.N(j9eVar.c);
            return null;
        }
        if (vq9Var != null) {
            boolean evaluate = vq9Var.evaluate(i10, A, A2, A3, A4);
            i10 = i10;
            r1 = A2;
            i4 = A;
            i5 = A3;
            i6 = A4;
            if (!evaluate) {
                j9eVar.N(i12);
                return null;
            }
        } else {
            i4 = A;
            i5 = A3;
            i6 = A4;
            r1 = A2;
        }
        if (i10 == 3) {
            z2 = (H & 128) != 0;
            z3 = (H & 64) != 0;
            z6 = false;
            z5 = (H & 32) != 0;
            z4 = z2;
        } else if (i10 == 4) {
            boolean z7 = (H & 64) != 0;
            boolean z8 = (H & 8) != 0;
            boolean z9 = (H & 4) != 0;
            z6 = (H & 2) != 0;
            z4 = (H & 1) != 0;
            boolean z10 = z9;
            z5 = z7;
            z2 = z8;
            z3 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z3) {
            tgj.d0("Skipping unsupported compressed or encrypted frame");
            j9eVar.N(i12);
            return null;
        }
        if (z5) {
            i11--;
            j9eVar.O(1);
        }
        if (z4) {
            i11 -= 4;
            j9eVar.O(4);
        }
        if (z6) {
            i11 = e0(i11, j9eVar);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                j9eVar3 = j9eVar;
            }
        } catch (Exception e) {
            e = e;
            i7 = r1;
            i8 = i5;
            j9eVar2 = j9eVar;
            i5 = i11;
            th = null;
            i9 = i6;
            j9eVar4 = j9eVar2;
            j9eVar4.N(i12);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (OutOfMemoryError e2) {
            e = e2;
            i7 = r1;
            i8 = i5;
            j9eVar2 = j9eVar;
            i5 = i11;
            th = null;
            i9 = i6;
            j9eVar4 = j9eVar2;
            j9eVar4.N(i12);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        }
        if (i4 == 84 && r1 == 88 && i5 == 88 && (i10 == 2 || i6 == 88)) {
            xv1Var = W(i11, j9eVar);
        } else if (i4 == 84) {
            xv1Var = U(i11, j9eVar, b0(i10, i4, r1, i5, i6));
        } else if (i4 == 87 && r1 == 88 && i5 == 88 && (i10 == 2 || i6 == 88)) {
            xv1Var = Y(i11, j9eVar);
        } else if (i4 == 87) {
            xv1Var = X(i11, j9eVar, b0(i10, i4, r1, i5, i6));
        } else if (i4 == 80 && r1 == 82 && i5 == 73 && i6 == 86) {
            xv1Var = S(i11, j9eVar);
        } else {
            if (i4 != 71 || r1 != 69 || i5 != 79 || (i6 != 66 && i10 != 2)) {
                th = null;
                try {
                } catch (Exception e3) {
                    e = e3;
                    i7 = r1;
                    i8 = i5;
                    j9eVar2 = j9eVar;
                    i5 = i11;
                    i9 = i6;
                    j9eVar4 = j9eVar2;
                    j9eVar4.N(i12);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    i7 = r1;
                    i8 = i5;
                    j9eVar2 = j9eVar;
                    i5 = i11;
                    i9 = i6;
                    j9eVar4 = j9eVar2;
                    j9eVar4.N(i12);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                }
                if (i10 != 2 ? i4 == 65 && r1 == 80 && i5 == 73 && i6 == 67 : i4 == 80 && r1 == 73 && i5 == 67) {
                    xv1Var = L(j9eVar, i11, i10);
                } else {
                    if (i4 != 67 || r1 != 79 || i5 != 77 || (i6 != 77 && i10 != 2)) {
                        if (i4 == 67 && r1 == 72 && i5 == 65 && i6 == 80) {
                            i7 = r1;
                            i8 = i5;
                            i5 = i11;
                            i9 = i6;
                            try {
                                xv1Var = M(j9eVar, i5, i10, z, i3, vq9Var);
                                i10 = i2;
                                r1 = j9eVar;
                            } catch (Exception e5) {
                                e = e5;
                                i10 = i2;
                                j9eVar4 = j9eVar;
                                j9eVar4.N(i12);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                i10 = i2;
                                j9eVar4 = j9eVar;
                                j9eVar4.N(i12);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th3) {
                                th = th3;
                                j9eVar3 = j9eVar;
                                j9eVar3.N(i12);
                                throw th;
                            }
                        } else {
                            i7 = r1;
                            i8 = i5;
                            i5 = i11;
                            i9 = i6;
                            try {
                                if (i4 == 67 && i7 == 84 && i8 == 79 && i9 == 67) {
                                    i10 = i2;
                                    j9e j9eVar5 = j9eVar;
                                    xv1Var = N(j9eVar5, i5, i10, z, i3, vq9Var);
                                    r1 = j9eVar5;
                                } else {
                                    i10 = i2;
                                    j9e j9eVar6 = j9eVar;
                                    if (i4 == 77 && i7 == 76 && i8 == 76 && i9 == 84) {
                                        xv1Var = R(i5, j9eVar6);
                                        r1 = j9eVar6;
                                    } else {
                                        String b0 = b0(i10, i4, i7, i8, i9);
                                        byte[] bArr = new byte[i5];
                                        j9eVar6.k(bArr, 0, i5);
                                        xv1Var = new xv1(b0, bArr);
                                        r1 = j9eVar6;
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                j9eVar4 = r1;
                                j9eVar4.N(i12);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e8) {
                                e = e8;
                                j9eVar4 = r1;
                                j9eVar4.N(i12);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th4) {
                                th = th4;
                                j9eVar3 = r1;
                                j9eVar3.N(i12);
                                throw th;
                            }
                        }
                        r1.N(i12);
                        r12 = xv1Var;
                        e = th;
                        if (r12 == 0) {
                            tgj.e0("Failed to decode frame: id=" + b0(i10, i4, i7, i8, i9) + ", frameSize=" + i5, e);
                        }
                        return r12;
                    }
                    xv1Var = O(i11, j9eVar);
                }
                i7 = r1;
                i8 = i5;
                r1 = j9eVar;
                i5 = i11;
                r1 = r1;
                i9 = i6;
                r1.N(i12);
                r12 = xv1Var;
                e = th;
                if (r12 == 0) {
                }
                return r12;
            }
            xv1Var = Q(i11, j9eVar);
        }
        i7 = r1;
        i8 = i5;
        r1 = j9eVar;
        i5 = i11;
        th = null;
        r1 = r1;
        i9 = i6;
        r1.N(i12);
        r12 = xv1Var;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    public static ww8 Q(int i2, j9e j9eVar) {
        int A = j9eVar.A();
        Charset a0 = a0(A);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        j9eVar.k(bArr, 0, i3);
        int d0 = d0(bArr, 0);
        String p = sjc.p(new String(bArr, 0, d0, StandardCharsets.ISO_8859_1));
        int i4 = d0 + 1;
        int c0 = c0(i4, A, bArr);
        String T = T(bArr, i4, c0, a0);
        int Z = Z(A) + c0;
        int c02 = c0(Z, A, bArr);
        String T2 = T(bArr, Z, c02, a0);
        int Z2 = Z(A) + c02;
        return new ww8(p, T, T2, i3 <= Z2 ? nik.b : Arrays.copyOfRange(bArr, Z2, i3));
    }

    public static zkc R(int i2, j9e j9eVar) {
        int H = j9eVar.H();
        int D = j9eVar.D();
        int D2 = j9eVar.D();
        int A = j9eVar.A();
        int A2 = j9eVar.A();
        nm2 nm2Var = new nm2(3);
        nm2Var.o(j9eVar);
        int i3 = ((i2 - 10) * 8) / (A + A2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = nm2Var.i(A);
            int i6 = nm2Var.i(A2);
            iArr[i4] = i5;
            iArr2[i4] = i6;
        }
        return new zkc(H, D, iArr, iArr2, D2);
    }

    public static o7f S(int i2, j9e j9eVar) {
        byte[] bArr = new byte[i2];
        j9eVar.k(bArr, 0, i2);
        int d0 = d0(bArr, 0);
        String str = new String(bArr, 0, d0, StandardCharsets.ISO_8859_1);
        int i3 = d0 + 1;
        return new o7f(str, i2 <= i3 ? nik.b : Arrays.copyOfRange(bArr, i3, i2));
    }

    public static String T(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    public static cdj U(int i2, j9e j9eVar, String str) {
        if (i2 < 1) {
            return null;
        }
        int A = j9eVar.A();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        j9eVar.k(bArr, 0, i3);
        return new cdj(str, null, V(A, 0, bArr));
    }

    public static vvf V(int i2, int i3, byte[] bArr) {
        if (i3 >= bArr.length) {
            return hv9.z("");
        }
        zu9 s = hv9.s();
        int c0 = c0(i3, i2, bArr);
        while (i3 < c0) {
            s.c(new String(bArr, i3, c0 - i3, a0(i2)));
            i3 = Z(i2) + c0;
            c0 = c0(i3, i2, bArr);
        }
        vvf g = s.g();
        return g.isEmpty() ? hv9.z("") : g;
    }

    public static cdj W(int i2, j9e j9eVar) {
        if (i2 < 1) {
            return null;
        }
        int A = j9eVar.A();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        j9eVar.k(bArr, 0, i3);
        int c0 = c0(0, A, bArr);
        return new cdj("TXXX", new String(bArr, 0, c0, a0(A)), V(A, Z(A) + c0, bArr));
    }

    public static oek X(int i2, j9e j9eVar, String str) {
        byte[] bArr = new byte[i2];
        j9eVar.k(bArr, 0, i2);
        return new oek(str, null, new String(bArr, 0, d0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static oek Y(int i2, j9e j9eVar) {
        if (i2 < 1) {
            return null;
        }
        int A = j9eVar.A();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        j9eVar.k(bArr, 0, i3);
        int c0 = c0(0, A, bArr);
        String str = new String(bArr, 0, c0, a0(A));
        int Z = Z(A) + c0;
        return new oek("WXXX", str, T(bArr, Z, d0(bArr, Z), StandardCharsets.ISO_8859_1));
    }

    public static int Z(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static Charset a0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String b0(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int c0(int i2, int i3, byte[] bArr) {
        int d0 = d0(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return d0;
        }
        while (d0 < bArr.length - 1) {
            if ((d0 - i2) % 2 == 0 && bArr[d0 + 1] == 0) {
                return d0;
            }
            d0 = d0(bArr, d0 + 1);
        }
        return bArr.length;
    }

    public static int d0(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int e0(int i2, j9e j9eVar) {
        byte[] bArr = j9eVar.a;
        int i3 = j9eVar.b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f0(j9e j9eVar, int i2, int i3, boolean z) {
        int D;
        long D2;
        int i4;
        int i5;
        int i6 = j9eVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (j9eVar.a() < i3) {
                    j9eVar.N(i6);
                    return true;
                }
                if (i2 >= 3) {
                    D = j9eVar.m();
                    D2 = j9eVar.C();
                    i4 = j9eVar.H();
                } else {
                    D = j9eVar.D();
                    D2 = j9eVar.D();
                    i4 = 0;
                }
                if (D == 0 && D2 == 0 && i4 == 0) {
                    j9eVar.N(i6);
                    return true;
                }
                if (i2 == 4 && !z) {
                    if ((8421504 & D2) != 0) {
                        j9eVar.N(i6);
                        return false;
                    }
                    D2 = (((D2 >> 24) & 255) << 21) | (D2 & 255) | (((D2 >> 8) & 255) << 7) | (((D2 >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i5 = (i4 & 64) != 0 ? 1 : 0;
                } else {
                    if (i2 == 3) {
                        i5 = (i4 & 32) != 0 ? 1 : 0;
                    } else {
                        i5 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i5 += 4;
                    }
                    if (D2 < i5) {
                        j9eVar.N(i6);
                        return false;
                    }
                    if (j9eVar.a() < D2) {
                        j9eVar.N(i6);
                        return false;
                    }
                    j9eVar.O((int) D2);
                }
            } catch (Throwable th) {
                j9eVar.N(i6);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ric K(int i2, byte[] bArr) {
        p53 p53Var;
        ArrayList arrayList = new ArrayList();
        j9e j9eVar = new j9e(bArr, i2);
        boolean z = false;
        if (j9eVar.a() < 10) {
            tgj.d0("Data too short to be an ID3 tag");
        } else {
            int D = j9eVar.D();
            if (D == 4801587) {
                int A = j9eVar.A();
                j9eVar.O(1);
                int A2 = j9eVar.A();
                int z2 = j9eVar.z();
                if (A == 2) {
                    if ((A2 & 64) != 0) {
                        tgj.d0("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    p53Var = new p53(A, A >= 4 && (A2 & 128) != 0, z2);
                } else {
                    if (A == 3) {
                        if ((A2 & 64) != 0) {
                            int m = j9eVar.m();
                            j9eVar.O(m);
                            z2 -= m + 4;
                        }
                    } else if (A == 4) {
                        if ((A2 & 64) != 0) {
                            int z3 = j9eVar.z();
                            j9eVar.O(z3 - 4);
                            z2 -= z3;
                        }
                        if ((A2 & 16) != 0) {
                            z2 -= 10;
                        }
                    } else {
                        fn0.r(A, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    p53Var = new p53(A, A >= 4 && (A2 & 128) != 0, z2);
                }
                if (p53Var != null) {
                    return null;
                }
                int i3 = p53Var.a;
                int i4 = j9eVar.b;
                int i5 = i3 == 2 ? 6 : 10;
                int i6 = p53Var.c;
                if (p53Var.b) {
                    i6 = e0(i6, j9eVar);
                }
                j9eVar.M(i4 + i6);
                if (!f0(j9eVar, i3, i5, false)) {
                    if (i3 != 4 || !f0(j9eVar, 4, i5, true)) {
                        fn0.r(i3, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z = true;
                }
                while (j9eVar.a() >= i5) {
                    yq9 P = P(i3, j9eVar, z, i5, this.h);
                    if (P != null) {
                        arrayList.add(P);
                    }
                }
                return new ric(arrayList);
            }
            tgj.d0("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(D))));
        }
        p53Var = null;
        if (p53Var != null) {
        }
    }

    @Override // defpackage.v7a
    public final ric l(wic wicVar, ByteBuffer byteBuffer) {
        return K(byteBuffer.limit(), byteBuffer.array());
    }
}
