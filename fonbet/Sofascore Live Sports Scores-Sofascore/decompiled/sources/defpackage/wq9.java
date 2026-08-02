package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wq9 extends g7a {
    public static final is8 i = new is8(12);
    public final uq9 h;

    public wq9(uq9 uq9Var) {
        this.h = uq9Var;
    }

    public static ApicFrame H(nkk nkkVar, int i2, int i3) {
        int Y;
        String W;
        int s = nkkVar.s();
        String V = V(s);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        nkkVar.e(bArr, 0, i4);
        if (i3 == 2) {
            W = "image/" + rz8.W(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(W)) {
                W = "image/jpeg";
            }
            Y = 2;
        } else {
            Y = Y(bArr, 0);
            W = rz8.W(new String(bArr, 0, Y, "ISO-8859-1"));
            if (W.indexOf(47) == -1) {
                W = "image/".concat(W);
            }
        }
        int i5 = bArr[Y + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = Y + 2;
        int X = X(bArr, i6, s);
        String str = new String(bArr, i6, X - i6, V);
        int U = U(s) + X;
        return new ApicFrame(W, str, i5, i4 <= U ? lik.e : Arrays.copyOfRange(bArr, U, i4));
    }

    public static ChapterFrame I(nkk nkkVar, int i2, int i3, boolean z, int i4, uq9 uq9Var) {
        int i5 = nkkVar.b;
        int Y = Y(nkkVar.a, i5);
        String str = new String(nkkVar.a, i5, Y - i5, "ISO-8859-1");
        nkkVar.E(Y + 1);
        int f = nkkVar.f();
        int f2 = nkkVar.f();
        long t = nkkVar.t();
        if (t == 4294967295L) {
            t = -1;
        }
        long t2 = nkkVar.t();
        long j = t2 == 4294967295L ? -1L : t2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (nkkVar.b < i6) {
            Id3Frame L = L(i3, nkkVar, z, i4, uq9Var);
            if (L != null) {
                arrayList.add(L);
            }
        }
        return new ChapterFrame(str, f, f2, t, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame J(nkk nkkVar, int i2, int i3, boolean z, int i4, uq9 uq9Var) {
        int i5 = nkkVar.b;
        int Y = Y(nkkVar.a, i5);
        String str = new String(nkkVar.a, i5, Y - i5, "ISO-8859-1");
        nkkVar.E(Y + 1);
        int s = nkkVar.s();
        boolean z2 = (s & 2) != 0;
        boolean z3 = (s & 1) != 0;
        int s2 = nkkVar.s();
        String[] strArr = new String[s2];
        for (int i6 = 0; i6 < s2; i6++) {
            int i7 = nkkVar.b;
            int Y2 = Y(nkkVar.a, i7);
            strArr[i6] = new String(nkkVar.a, i7, Y2 - i7, "ISO-8859-1");
            nkkVar.E(Y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (nkkVar.b < i8) {
            Id3Frame L = L(i3, nkkVar, z, i4, uq9Var);
            if (L != null) {
                arrayList.add(L);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame K(int i2, nkk nkkVar) {
        if (i2 < 4) {
            return null;
        }
        int s = nkkVar.s();
        String V = V(s);
        byte[] bArr = new byte[3];
        nkkVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        nkkVar.e(bArr2, 0, i3);
        int X = X(bArr2, 0, s);
        String str2 = new String(bArr2, 0, X, V);
        int U = U(s) + X;
        return new CommentFrame(str, str2, P(bArr2, U, X(bArr2, U, s), V));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020d A[Catch: all -> 0x01e7, UnsupportedEncodingException -> 0x0217, TRY_LEAVE, TryCatch #3 {UnsupportedEncodingException -> 0x0217, blocks: (B:61:0x020d, B:135:0x01e2, B:142:0x01f7, B:143:0x01fc), top: B:52:0x0101 }] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [nkk] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [nkk] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame L(int i2, nkk nkkVar, boolean z, int i3, uq9 uq9Var) {
        int v;
        int i4;
        int i5;
        ?? r1;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Id3Frame id3Frame;
        nkk nkkVar2;
        int i7;
        int i8;
        Id3Frame binaryFrame;
        int i9 = i2;
        int s = nkkVar.s();
        int s2 = nkkVar.s();
        int s3 = nkkVar.s();
        int s4 = i9 >= 3 ? nkkVar.s() : 0;
        if (i9 == 4) {
            v = nkkVar.v();
            if (!z) {
                v = (((v >> 24) & 255) << 21) | (v & 255) | (((v >> 8) & 255) << 7) | (((v >> 16) & 255) << 14);
            }
        } else {
            v = i9 == 3 ? nkkVar.v() : nkkVar.u();
        }
        int i10 = v;
        int x = i9 >= 3 ? nkkVar.x() : 0;
        if (s == 0 && s2 == 0 && s3 == 0 && s4 == 0 && i10 == 0 && x == 0) {
            nkkVar.E(nkkVar.c);
            return null;
        }
        int i11 = nkkVar.b + i10;
        if (i11 > nkkVar.c) {
            m6k.f0();
            nkkVar.E(nkkVar.c);
            return null;
        }
        if (uq9Var != null) {
            boolean evaluate = uq9Var.evaluate(i9, s, s2, s3, s4);
            i5 = s;
            i4 = s2;
            i6 = s4;
            i9 = i9;
            r1 = s3;
            if (!evaluate) {
                nkkVar.E(i11);
                return null;
            }
        } else {
            i4 = s2;
            i5 = s;
            r1 = s3;
            i6 = s4;
        }
        if (i9 == 3) {
            z2 = (x & 128) != 0;
            z3 = (x & 64) != 0;
            id3Frame = null;
            z5 = (x & 32) != 0;
            z4 = z2;
        } else if (i9 == 4) {
            boolean z6 = (x & 64) != 0;
            boolean z7 = (x & 8) != 0;
            boolean z8 = (x & 4) != 0;
            id3Frame = (x & 2) != 0 ? 1 : null;
            z4 = (x & 1) != 0;
            boolean z9 = z8;
            z5 = z6;
            z2 = z7;
            z3 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            id3Frame = null;
        }
        if (z2 || z3) {
            m6k.f0();
            nkkVar.E(i11);
            return null;
        }
        if (z5) {
            i10--;
            nkkVar.F(1);
        }
        if (z4) {
            i10 -= 4;
            nkkVar.F(4);
        }
        if (id3Frame != null) {
            i10 = Z(i10, nkkVar);
        }
        try {
            try {
                try {
                    try {
                        if (i5 == 84 && i4 == 88 && r1 == 88 && (i9 == 2 || i6 == 88)) {
                            binaryFrame = R(i10, nkkVar);
                        } else if (i5 == 84) {
                            binaryFrame = Q(i10, nkkVar, W(i9, i5, i4, r1, i6));
                        } else if (i5 == 87 && i4 == 88 && r1 == 88 && (i9 == 2 || i6 == 88)) {
                            binaryFrame = T(i10, nkkVar);
                        } else if (i5 == 87) {
                            binaryFrame = S(i10, nkkVar, W(i9, i5, i4, r1, i6));
                        } else if (i5 == 80 && i4 == 82 && r1 == 73 && i6 == 86) {
                            binaryFrame = O(i10, nkkVar);
                        } else if (i5 == 71 && i4 == 69 && r1 == 79 && (i6 == 66 || i9 == 2)) {
                            binaryFrame = M(i10, nkkVar);
                        } else {
                            id3Frame = null;
                            try {
                                if (i9 != 2 ? i5 == 65 && i4 == 80 && r1 == 73 && i6 == 67 : i5 == 80 && i4 == 73 && r1 == 67) {
                                    binaryFrame = H(nkkVar, i10, i9);
                                } else {
                                    if (i5 != 67 || i4 != 79 || r1 != 77 || (i6 != 77 && i9 != 2)) {
                                        if (i5 == 67 && i4 == 72 && r1 == 65 && i6 == 80) {
                                            int i12 = i10;
                                            i7 = i6;
                                            i8 = r1;
                                            try {
                                                binaryFrame = I(nkkVar, i12, i9, z, i3, uq9Var);
                                                i9 = i2;
                                                r1 = nkkVar;
                                            } catch (UnsupportedEncodingException unused) {
                                                r1 = nkkVar;
                                                m6k.f0();
                                                r1.E(i11);
                                                return id3Frame;
                                            } catch (Throwable th) {
                                                th = th;
                                                nkkVar2 = nkkVar;
                                                nkkVar2.E(i11);
                                                throw th;
                                            }
                                        } else {
                                            int i13 = i10;
                                            i7 = i6;
                                            i8 = r1;
                                            if (i5 == 67 && i4 == 84 && i8 == 79 && i7 == 67) {
                                                i9 = i2;
                                                nkk nkkVar3 = nkkVar;
                                                binaryFrame = J(nkkVar3, i13, i9, z, i3, uq9Var);
                                                r1 = nkkVar3;
                                            } else {
                                                i9 = i2;
                                                nkk nkkVar4 = nkkVar;
                                                if (i5 == 77 && i4 == 76 && i8 == 76 && i7 == 84) {
                                                    binaryFrame = N(i13, nkkVar4);
                                                    r1 = nkkVar4;
                                                } else {
                                                    String W = W(i9, i5, i4, i8, i7);
                                                    byte[] bArr = new byte[i13];
                                                    nkkVar4.e(bArr, 0, i13);
                                                    binaryFrame = new BinaryFrame(W, bArr);
                                                    r1 = nkkVar4;
                                                }
                                            }
                                        }
                                        if (binaryFrame == null) {
                                            W(i9, i5, i4, i8, i7);
                                            m6k.f0();
                                        }
                                        r1.E(i11);
                                        return binaryFrame;
                                    }
                                    binaryFrame = K(i10, nkkVar);
                                }
                                i8 = r1;
                                i7 = i6;
                                r1 = nkkVar;
                                if (binaryFrame == null) {
                                }
                                r1.E(i11);
                                return binaryFrame;
                            } catch (UnsupportedEncodingException unused2) {
                                r1 = nkkVar;
                            }
                        }
                        i8 = r1;
                        i7 = i6;
                        r1 = nkkVar;
                        id3Frame = null;
                        if (binaryFrame == null) {
                        }
                        r1.E(i11);
                        return binaryFrame;
                    } catch (UnsupportedEncodingException unused3) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nkkVar2 = nkkVar;
                }
            } catch (Throwable th3) {
                th = th3;
                nkkVar2 = r1;
            }
        } catch (UnsupportedEncodingException unused4) {
            r1 = nkkVar;
            id3Frame = null;
        }
    }

    public static GeobFrame M(int i2, nkk nkkVar) {
        int s = nkkVar.s();
        String V = V(s);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nkkVar.e(bArr, 0, i3);
        int Y = Y(bArr, 0);
        String str = new String(bArr, 0, Y, "ISO-8859-1");
        int i4 = Y + 1;
        int X = X(bArr, i4, s);
        String P = P(bArr, i4, X, V);
        int U = U(s) + X;
        int X2 = X(bArr, U, s);
        String P2 = P(bArr, U, X2, V);
        int U2 = U(s) + X2;
        return new GeobFrame(str, P, P2, i3 <= U2 ? lik.e : Arrays.copyOfRange(bArr, U2, i3));
    }

    public static MlltFrame N(int i2, nkk nkkVar) {
        int x = nkkVar.x();
        int u = nkkVar.u();
        int u2 = nkkVar.u();
        int s = nkkVar.s();
        int s2 = nkkVar.s();
        nm2 nm2Var = new nm2(2);
        nm2Var.p(nkkVar.a, nkkVar.c);
        nm2Var.q(nkkVar.b * 8);
        int i3 = ((i2 - 10) * 8) / (s + s2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = nm2Var.i(s);
            int i6 = nm2Var.i(s2);
            iArr[i4] = i5;
            iArr2[i4] = i6;
        }
        return new MlltFrame(x, u, iArr, iArr2, u2);
    }

    public static PrivFrame O(int i2, nkk nkkVar) {
        byte[] bArr = new byte[i2];
        nkkVar.e(bArr, 0, i2);
        int Y = Y(bArr, 0);
        String str = new String(bArr, 0, Y, "ISO-8859-1");
        int i3 = Y + 1;
        return new PrivFrame(str, i2 <= i3 ? lik.e : Arrays.copyOfRange(bArr, i3, i2));
    }

    public static String P(byte[] bArr, int i2, int i3, String str) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    public static TextInformationFrame Q(int i2, nkk nkkVar, String str) {
        if (i2 < 1) {
            return null;
        }
        int s = nkkVar.s();
        String V = V(s);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nkkVar.e(bArr, 0, i3);
        return new TextInformationFrame(str, null, new String(bArr, 0, X(bArr, 0, s), V));
    }

    public static TextInformationFrame R(int i2, nkk nkkVar) {
        if (i2 < 1) {
            return null;
        }
        int s = nkkVar.s();
        String V = V(s);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nkkVar.e(bArr, 0, i3);
        int X = X(bArr, 0, s);
        String str = new String(bArr, 0, X, V);
        int U = U(s) + X;
        return new TextInformationFrame("TXXX", str, P(bArr, U, X(bArr, U, s), V));
    }

    public static UrlLinkFrame S(int i2, nkk nkkVar, String str) {
        byte[] bArr = new byte[i2];
        nkkVar.e(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, Y(bArr, 0), "ISO-8859-1"));
    }

    public static UrlLinkFrame T(int i2, nkk nkkVar) {
        if (i2 < 1) {
            return null;
        }
        int s = nkkVar.s();
        String V = V(s);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nkkVar.e(bArr, 0, i3);
        int X = X(bArr, 0, s);
        String str = new String(bArr, 0, X, V);
        int U = U(s) + X;
        return new UrlLinkFrame("WXXX", str, P(bArr, U, Y(bArr, U), "ISO-8859-1"));
    }

    public static int U(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static String V(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : C.UTF8_NAME : "UTF-16BE" : C.UTF16_NAME;
    }

    public static String W(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int X(byte[] bArr, int i2, int i3) {
        int Y = Y(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return Y;
        }
        while (Y < bArr.length - 1) {
            if ((Y - i2) % 2 == 0 && bArr[Y + 1] == 0) {
                return Y;
            }
            Y = Y(bArr, Y + 1);
        }
        return bArr.length;
    }

    public static int Y(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int Z(int i2, nkk nkkVar) {
        byte[] bArr = nkkVar.a;
        int i3 = nkkVar.b;
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
    public static boolean a0(nkk nkkVar, int i2, int i3, boolean z) {
        int u;
        long u2;
        int i4;
        int i5;
        int i6 = nkkVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (nkkVar.c() < i3) {
                    nkkVar.E(i6);
                    return true;
                }
                if (i2 >= 3) {
                    u = nkkVar.f();
                    u2 = nkkVar.t();
                    i4 = nkkVar.x();
                } else {
                    u = nkkVar.u();
                    u2 = nkkVar.u();
                    i4 = 0;
                }
                if (u == 0 && u2 == 0 && i4 == 0) {
                    nkkVar.E(i6);
                    return true;
                }
                if (i2 == 4 && !z) {
                    if ((8421504 & u2) != 0) {
                        nkkVar.E(i6);
                        return false;
                    }
                    u2 = (((u2 >> 24) & 255) << 21) | (u2 & 255) | (((u2 >> 8) & 255) << 7) | (((u2 >> 16) & 255) << 14);
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
                    if (u2 < i5) {
                        nkkVar.E(i6);
                        return false;
                    }
                    if (nkkVar.c() < u2) {
                        nkkVar.E(i6);
                        return false;
                    }
                    nkkVar.F((int) u2);
                }
            } catch (Throwable th) {
                nkkVar.E(i6);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Metadata G(int i2, byte[] bArr) {
        p53 p53Var;
        ArrayList arrayList = new ArrayList();
        nkk nkkVar = new nkk(bArr, i2);
        boolean z = false;
        if (nkkVar.c() < 10) {
            m6k.f0();
        } else {
            int u = nkkVar.u();
            if (u == 4801587) {
                int s = nkkVar.s();
                nkkVar.F(1);
                int s2 = nkkVar.s();
                int r = nkkVar.r();
                if (s == 2) {
                    if ((s2 & 64) != 0) {
                        m6k.f0();
                    }
                    p53Var = new p53(s, s >= 4 && (s2 & 128) != 0, r);
                } else {
                    if (s == 3) {
                        if ((s2 & 64) != 0) {
                            int f = nkkVar.f();
                            nkkVar.F(f);
                            r -= f + 4;
                        }
                    } else if (s == 4) {
                        if ((s2 & 64) != 0) {
                            int r2 = nkkVar.r();
                            nkkVar.F(r2 - 4);
                            r -= r2;
                        }
                        if ((s2 & 16) != 0) {
                            r -= 10;
                        }
                    } else {
                        m6k.f0();
                    }
                    p53Var = new p53(s, s >= 4 && (s2 & 128) != 0, r);
                }
                if (p53Var != null) {
                    return null;
                }
                int i3 = p53Var.a;
                int i4 = nkkVar.b;
                int i5 = i3 == 2 ? 6 : 10;
                int i6 = p53Var.c;
                if (p53Var.b) {
                    i6 = Z(i6, nkkVar);
                }
                nkkVar.D(i4 + i6);
                if (!a0(nkkVar, i3, i5, false)) {
                    if (i3 != 4 || !a0(nkkVar, 4, i5, true)) {
                        m6k.f0();
                        return null;
                    }
                    z = true;
                }
                while (nkkVar.c() >= i5) {
                    Id3Frame L = L(i3, nkkVar, z, i5, this.h);
                    if (L != null) {
                        arrayList.add(L);
                    }
                }
                return new Metadata(arrayList);
            }
            "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(u)));
            m6k.f0();
        }
        p53Var = null;
        if (p53Var != null) {
        }
    }

    @Override // defpackage.g7a
    public final Metadata s(vic vicVar, ByteBuffer byteBuffer) {
        return G(byteBuffer.limit(), byteBuffer.array());
    }
}
