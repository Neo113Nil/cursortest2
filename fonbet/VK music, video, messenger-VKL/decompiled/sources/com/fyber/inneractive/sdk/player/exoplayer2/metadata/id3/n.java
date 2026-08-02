package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class n {
    public static final int b = z.a("ID3");
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.l a;

    public n() {
        this.a = null;
    }

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static h b(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2, boolean z, int i3, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        int i4 = nVar.b;
        int b2 = b(i4, nVar.a);
        String str = new String(nVar.a, i4, b2 - i4, "ISO-8859-1");
        nVar.e(b2 + 1);
        int j = nVar.j();
        boolean z2 = (j & 2) != 0;
        boolean z3 = (j & 1) != 0;
        int j2 = nVar.j();
        String[] strArr = new String[j2];
        for (int i5 = 0; i5 < j2; i5++) {
            int i6 = nVar.b;
            int b3 = b(i6, nVar.a);
            strArr[i5] = new String(nVar.a, i6, b3 - i6, "ISO-8859-1");
            nVar.e(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (nVar.b < i7) {
            o a = a(i2, nVar, z, i3, lVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new h(str, z2, z3, strArr, oVarArr);
    }

    public static q c(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = new byte[i];
        nVar.a(bArr, 0, i);
        int b2 = b(0, bArr);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i2 = b2 + 1;
        return new q(str, i2 < i ? Arrays.copyOfRange(bArr, i2, i) : new byte[0]);
    }

    public static s d(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i < 1) {
            return null;
        }
        int j = nVar.j();
        String b2 = b(j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nVar.a(bArr, 0, i2);
        int a = a(bArr, 0, j);
        String str = new String(bArr, 0, a, b2);
        int a2 = a(j) + a;
        return new s("TXXX", str, a2 < i2 ? new String(bArr, a2, a(bArr, a2, j) - a2, b2) : "");
    }

    public static u e(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i < 1) {
            return null;
        }
        int j = nVar.j();
        String b2 = b(j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nVar.a(bArr, 0, i2);
        int a = a(bArr, 0, j);
        String str = new String(bArr, 0, a, b2);
        int a2 = a(j) + a;
        return new u("WXXX", str, a2 < i2 ? new String(bArr, a2, b(a2, bArr) - a2, "ISO-8859-1") : "");
    }

    public static int f(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = nVar.a;
        int i2 = nVar.b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0037, code lost:
    
        if ((r7 & 64) != 0) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a(int i, byte[] bArr) {
        m mVar;
        ArrayList arrayList = new ArrayList();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i, bArr);
        boolean z = false;
        if (i - nVar.b >= 10 && nVar.l() == b) {
            int j = nVar.j();
            nVar.e(nVar.b + 1);
            int j2 = nVar.j();
            int i2 = nVar.i();
            if (j != 2) {
                if (j == 3) {
                    if ((j2 & 64) != 0) {
                        int b2 = nVar.b();
                        nVar.e(nVar.b + b2);
                        i2 -= b2 + 4;
                    }
                } else if (j == 4) {
                    if ((j2 & 64) != 0) {
                        int i3 = nVar.i();
                        nVar.e(nVar.b + (i3 - 4));
                        i2 -= i3;
                    }
                    if ((j2 & 16) != 0) {
                        i2 -= 10;
                    }
                }
                mVar = new m(j < 4 && (j2 & 128) != 0, j, i2);
            }
            if (mVar != null) {
                return null;
            }
            int i4 = nVar.b;
            int i5 = mVar.a == 2 ? 6 : 10;
            int i6 = mVar.c;
            if (mVar.b) {
                i6 = f(i6, nVar);
            }
            nVar.d(i4 + i6);
            if (!a(nVar, mVar.a, i5, false)) {
                if (mVar.a != 4 || !a(nVar, 4, i5, true)) {
                    return null;
                }
                z = true;
            }
            while (nVar.c - nVar.b >= i5) {
                o a = a(mVar.a, nVar, z, i5, this.a);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList);
        }
        mVar = null;
        if (mVar != null) {
        }
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        this.a = lVar;
    }

    public static u b(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        byte[] bArr = new byte[i];
        nVar.a(bArr, 0, i);
        return new u(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static l b(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int j = nVar.j();
        String b2 = b(j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nVar.a(bArr, 0, i2);
        int b3 = b(0, bArr);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i3 = b3 + 1;
        int a = a(bArr, i3, j);
        String str2 = new String(bArr, i3, a - i3, b2);
        int a2 = a(j) + a;
        int a3 = a(bArr, a2, j);
        return new l(str, str2, new String(bArr, a2, a3 - a2, b2), Arrays.copyOfRange(bArr, a(j) + a3, i2));
    }

    public static f a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2, boolean z, int i3, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        int i4 = nVar.b;
        int b2 = b(i4, nVar.a);
        String str = new String(nVar.a, i4, b2 - i4, "ISO-8859-1");
        nVar.e(b2 + 1);
        int b3 = nVar.b();
        int b4 = nVar.b();
        long k = nVar.k();
        if (k == 4294967295L) {
            k = -1;
        }
        long k2 = nVar.k();
        long j = k2 == 4294967295L ? -1L : k2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (nVar.b < i5) {
            o a = a(i2, nVar, z, i3, lVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new f(str, b3, b4, k, j, oVarArr);
    }

    public static String b(int i) {
        if (i == 1) {
            return C.UTF16_NAME;
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i != 3) {
            return "ISO-8859-1";
        }
        return C.UTF8_NAME;
    }

    public static int b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2, boolean z) {
        int l;
        long l2;
        int i3;
        int i4;
        int i5 = nVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (nVar.c - nVar.b < i2) {
                    nVar.e(i5);
                    return true;
                }
                if (i >= 3) {
                    l = nVar.b();
                    l2 = nVar.k();
                    i3 = nVar.o();
                } else {
                    l = nVar.l();
                    l2 = nVar.l();
                    i3 = 0;
                }
                if (l == 0 && l2 == 0 && i3 == 0) {
                    nVar.e(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & l2) != 0) {
                        nVar.e(i5);
                        return false;
                    }
                    l2 = (((l2 >> 24) & 255) << 21) | (l2 & 255) | (((l2 >> 8) & 255) << 7) | (((l2 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i4 += 4;
                    }
                    if (l2 < i4) {
                        nVar.e(i5);
                        return false;
                    }
                    int i6 = nVar.c;
                    int i7 = nVar.b;
                    if (i6 - i7 < l2) {
                        nVar.e(i5);
                        return false;
                    }
                    nVar.e(i7 + ((int) l2));
                }
            } catch (Throwable th) {
                nVar.e(i5);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x018a, code lost:
    
        if (r10 == 67) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z, int i2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        int l;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        o dVar;
        int i3 = i;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = nVar;
        int j = nVar2.j();
        int j2 = nVar2.j();
        int j3 = nVar2.j();
        int j4 = i3 >= 3 ? nVar2.j() : 0;
        if (i3 == 4) {
            l = nVar2.m();
            if (!z) {
                l = (((l >> 24) & 255) << 21) | (l & 255) | (((l >> 8) & 255) << 7) | (((l >> 16) & 255) << 14);
            }
        } else if (i3 == 3) {
            l = nVar2.m();
        } else {
            l = nVar2.l();
        }
        int o = i3 >= 3 ? nVar2.o() : 0;
        if (j == 0 && j2 == 0 && j3 == 0 && j4 == 0 && l == 0 && o == 0) {
            nVar2.e(nVar2.c);
            return null;
        }
        int i4 = nVar2.b;
        int i5 = i4 + l;
        int i6 = nVar2.c;
        if (i5 > i6) {
            nVar2.e(i6);
            return null;
        }
        if (lVar != null && (j != 67 || j2 != 79 || j3 != 77 || (j4 != 77 && i3 != 2))) {
            nVar2.e(i5);
            return null;
        }
        if (i3 == 3) {
            z2 = (o & 128) != 0;
            z5 = (o & 64) != 0;
            z6 = false;
            z4 = (o & 32) != 0;
            z3 = z2;
        } else if (i3 == 4) {
            boolean z7 = (o & 64) != 0;
            boolean z8 = (o & 8) != 0;
            z5 = (o & 4) != 0;
            z6 = (o & 2) != 0;
            if ((o & 1) != 0) {
                boolean z9 = z8;
                z4 = z7;
                z2 = z9;
                z3 = true;
            } else {
                boolean z10 = z8;
                z4 = z7;
                z2 = z10;
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (!z2 && !z5) {
            if (z4) {
                l--;
                nVar2.e(i4 + 1);
            }
            if (z3) {
                l -= 4;
                nVar2.e(nVar2.b + 4);
            }
            if (z6) {
                l = f(l, nVar2);
            }
            int i7 = l;
            try {
                if (j == 84 && j2 == 88 && j3 == 88 && (i3 == 2 || j4 == 88)) {
                    dVar = d(i7, nVar2);
                } else if (j == 84) {
                    dVar = a(i7, nVar2, a(i3, j, j2, j3, j4));
                } else if (j == 87 && j2 == 88 && j3 == 88 && (i3 == 2 || j4 == 88)) {
                    dVar = e(i7, nVar2);
                } else if (j == 87) {
                    dVar = b(i7, nVar2, a(i3, j, j2, j3, j4));
                } else if (j == 80 && j2 == 82 && j3 == 73 && j4 == 86) {
                    dVar = c(i7, nVar2);
                } else if (j == 71 && j2 == 69 && j3 == 79 && (j4 == 66 || i3 == 2)) {
                    dVar = b(i7, nVar2);
                } else if (i3 == 2) {
                    if (j == 80 && j2 == 73 && j3 == 67) {
                        dVar = a(nVar2, i7, i3);
                    }
                    if (j != 67 && j2 == 79 && j3 == 77 && (j4 == 77 || i3 == 2)) {
                        dVar = a(i7, nVar2);
                    } else if (j != 67 && j2 == 72 && j3 == 65 && j4 == 80) {
                        try {
                            dVar = a(nVar2, i7, i3, z, i2, lVar);
                            i3 = i;
                            nVar2 = nVar;
                        } catch (UnsupportedEncodingException unused) {
                            nVar2 = nVar;
                            nVar2.e(i5);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            nVar2 = nVar;
                            nVar2.e(i5);
                            throw th;
                        }
                    } else if (j != 67 && j2 == 84 && j3 == 79 && j4 == 67) {
                        i3 = i;
                        nVar2 = nVar;
                        dVar = b(nVar2, i7, i3, z, i2, lVar);
                    } else {
                        i3 = i;
                        nVar2 = nVar;
                        String a = a(i3, j, j2, j3, j4);
                        byte[] bArr = new byte[i7];
                        nVar2.a(bArr, 0, i7);
                        dVar = new d(a, bArr);
                    }
                } else {
                    if (j == 65) {
                        if (j2 == 80) {
                            if (j3 == 73) {
                            }
                        }
                    }
                    if (j != 67) {
                    }
                    if (j != 67) {
                    }
                    if (j != 67) {
                    }
                    i3 = i;
                    nVar2 = nVar;
                    String a2 = a(i3, j, j2, j3, j4);
                    byte[] bArr2 = new byte[i7];
                    nVar2.a(bArr2, 0, i7);
                    dVar = new d(a2, bArr2);
                }
                if (dVar == null) {
                    a(i3, j, j2, j3, j4);
                }
                nVar2.e(i5);
                return dVar;
            } catch (UnsupportedEncodingException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            nVar2.e(i5);
            return null;
        }
    }

    public static s a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        if (i < 1) {
            return null;
        }
        int j = nVar.j();
        String b2 = b(j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nVar.a(bArr, 0, i2);
        return new s(str, null, new String(bArr, 0, a(bArr, 0, j), b2));
    }

    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2) {
        int b2;
        String lowerCase;
        int j = nVar.j();
        String b3 = b(j);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        nVar.a(bArr, 0, i3);
        if (i2 == 2) {
            lowerCase = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.equals("image/jpg")) {
                lowerCase = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(0, bArr);
            lowerCase = new String(bArr, 0, b2, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i4 = bArr[b2 + 1] & 255;
        int i5 = b2 + 2;
        int a = a(bArr, i5, j);
        return new b(lowerCase, new String(bArr, i5, a - i5, b3), i4, Arrays.copyOfRange(bArr, a(j) + a, i3));
    }

    public static j a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        if (i < 4) {
            return null;
        }
        int j = nVar.j();
        String b2 = b(j);
        byte[] bArr = new byte[3];
        nVar.a(bArr, 0, 3);
        String str2 = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        nVar.a(bArr2, 0, i2);
        int a = a(bArr2, 0, j);
        String str3 = new String(bArr2, 0, a, b2);
        int a2 = a(j) + a;
        if (a2 < i2) {
            str = new String(bArr2, a2, a(bArr2, a2, j) - a2, b2);
        } else {
            str = "";
        }
        return new j(str2, str3, str);
    }

    public static String a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int a(byte[] bArr, int i, int i2) {
        int b2 = b(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if (b2 % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(b2 + 1, bArr);
        }
        return bArr.length;
    }
}
