package b2;

import H1.B;
import androidx.media3.common.a;
import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import com.reactnativecommunity.clipboard.ClipboardModule;
import e1.AbstractC4156x;
import e1.J;
import f1.AbstractC4227e;
import f1.C4225c;

/* renamed from: b2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2380j {
    public static C4225c a(C2334C c2334c, String str) {
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof C4225c) {
                C4225c c4225c = (C4225c) d10;
                if (c4225c.f46171a.equals(str)) {
                    return c4225c;
                }
            }
        }
        return null;
    }

    public static V1.e b(int i10, J j10) {
        int v10 = j10.v();
        if (j10.v() == 1684108385) {
            j10.c0(8);
            String H10 = j10.H(v10 - 16);
            return new V1.e("und", H10, H10);
        }
        AbstractC4156x.i("MetadataUtil", "Failed to parse comment attribute: " + AbstractC4227e.a(i10));
        return null;
    }

    public static V1.a c(J j10) {
        int v10 = j10.v();
        if (j10.v() != 1684108385) {
            AbstractC4156x.i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int p10 = AbstractC2372b.p(j10.v());
        String str = p10 == 13 ? ClipboardModule.MIMETYPE_JPEG : p10 == 14 ? ClipboardModule.MIMETYPE_PNG : null;
        if (str == null) {
            AbstractC4156x.i("MetadataUtil", "Unrecognized cover art flags: " + p10);
            return null;
        }
        j10.c0(4);
        int i10 = v10 - 16;
        byte[] bArr = new byte[i10];
        j10.q(bArr, 0, i10);
        return new V1.a(str, null, 3, bArr);
    }

    public static C2334C.a d(J j10) {
        int g10 = j10.g() + j10.v();
        int v10 = j10.v();
        int i10 = (v10 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & v10;
                if (i11 == 6516084) {
                    return b(v10, j10);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return k(v10, "TIT2", j10);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return k(v10, "TCOM", j10);
                }
                if (i11 == 6578553) {
                    return k(v10, "TDRC", j10);
                }
                if (i11 == 4280916) {
                    return k(v10, "TPE1", j10);
                }
                if (i11 == 7630703) {
                    return k(v10, "TSSE", j10);
                }
                if (i11 == 6384738) {
                    return k(v10, "TALB", j10);
                }
                if (i11 == 7108978) {
                    return k(v10, "USLT", j10);
                }
                if (i11 == 6776174) {
                    return k(v10, "TCON", j10);
                }
                if (i11 == 6779504) {
                    return k(v10, "TIT1", j10);
                }
            } else {
                if (v10 == 1735291493) {
                    return j(j10);
                }
                if (v10 == 1684632427) {
                    return e(v10, "TPOS", j10);
                }
                if (v10 == 1953655662) {
                    return e(v10, "TRCK", j10);
                }
                if (v10 == 1953329263) {
                    return g(v10, "TBPM", j10, true, false);
                }
                if (v10 == 1668311404) {
                    return g(v10, "TCMP", j10, true, true);
                }
                if (v10 == 1668249202) {
                    return c(j10);
                }
                if (v10 == 1631670868) {
                    return k(v10, "TPE2", j10);
                }
                if (v10 == 1936682605) {
                    return k(v10, "TSOT", j10);
                }
                if (v10 == 1936679276) {
                    return k(v10, "TSOA", j10);
                }
                if (v10 == 1936679282) {
                    return k(v10, "TSOP", j10);
                }
                if (v10 == 1936679265) {
                    return k(v10, "TSO2", j10);
                }
                if (v10 == 1936679791) {
                    return k(v10, "TSOC", j10);
                }
                if (v10 == 1920233063) {
                    return g(v10, "ITUNESADVISORY", j10, false, false);
                }
                if (v10 == 1885823344) {
                    return g(v10, "ITUNESGAPLESS", j10, false, true);
                }
                if (v10 == 1936683886) {
                    return k(v10, "TVSHOWSORT", j10);
                }
                if (v10 == 1953919848) {
                    return k(v10, "TVSHOW", j10);
                }
                if (v10 == 757935405) {
                    return h(j10, g10);
                }
            }
            AbstractC4156x.b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC4227e.a(v10));
            j10.b0(g10);
            return null;
        } finally {
            j10.b0(g10);
        }
    }

    public static V1.n e(int i10, String str, J j10) {
        int v10 = j10.v();
        if (j10.v() == 1684108385 && v10 >= 22) {
            j10.c0(10);
            int U10 = j10.U();
            if (U10 > 0) {
                String str2 = "" + U10;
                int U11 = j10.U();
                if (U11 > 0) {
                    str2 = str2 + "/" + U11;
                }
                return new V1.n(str, null, AbstractC3445z.u(str2));
            }
        }
        AbstractC4156x.i("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC4227e.a(i10));
        return null;
    }

    public static int f(J j10) {
        int v10 = j10.v();
        if (j10.v() == 1684108385) {
            j10.c0(8);
            int i10 = v10 - 16;
            if (i10 == 1) {
                return j10.M();
            }
            if (i10 == 2) {
                return j10.U();
            }
            if (i10 == 3) {
                return j10.P();
            }
            if (i10 == 4 && (j10.n() & 128) == 0) {
                return j10.Q();
            }
        }
        AbstractC4156x.i("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static V1.i g(int i10, String str, J j10, boolean z10, boolean z11) {
        int f10 = f(j10);
        if (z11) {
            f10 = Math.min(1, f10);
        }
        if (f10 >= 0) {
            return z10 ? new V1.n(str, null, AbstractC3445z.u(Integer.toString(f10))) : new V1.e("und", str, Integer.toString(f10));
        }
        AbstractC4156x.i("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC4227e.a(i10));
        return null;
    }

    public static V1.i h(J j10, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (j10.g() < i10) {
            int g10 = j10.g();
            int v10 = j10.v();
            int v11 = j10.v();
            j10.c0(4);
            if (v11 == 1835360622) {
                str = j10.H(v10 - 12);
            } else if (v11 == 1851878757) {
                str2 = j10.H(v10 - 12);
            } else {
                if (v11 == 1684108385) {
                    i11 = g10;
                    i12 = v10;
                }
                j10.c0(v10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        j10.b0(i11);
        j10.c0(16);
        return new V1.k(str, str2, j10.H(i12 - 16));
    }

    public static C4225c i(J j10, int i10, String str) {
        while (true) {
            int g10 = j10.g();
            if (g10 >= i10) {
                return null;
            }
            int v10 = j10.v();
            if (j10.v() == 1684108385) {
                int v11 = j10.v();
                int v12 = j10.v();
                int i11 = v10 - 16;
                byte[] bArr = new byte[i11];
                j10.q(bArr, 0, i11);
                return new C4225c(str, bArr, v12, v11);
            }
            j10.b0(g10 + v10);
        }
    }

    public static V1.n j(J j10) {
        String a10 = V1.j.a(f(j10) - 1);
        if (a10 != null) {
            return new V1.n("TCON", null, AbstractC3445z.u(a10));
        }
        AbstractC4156x.i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static V1.n k(int i10, String str, J j10) {
        int v10 = j10.v();
        if (j10.v() == 1684108385) {
            j10.c0(8);
            return new V1.n(str, null, AbstractC3445z.u(j10.H(v10 - 16)));
        }
        AbstractC4156x.i("MetadataUtil", "Failed to parse text attribute: " + AbstractC4227e.a(i10));
        return null;
    }

    public static void l(int i10, B b10, a.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.d0(b10.f4303a).e0(b10.f4304b);
        }
    }

    public static void m(int i10, C2334C c2334c, a.b bVar, C2334C c2334c2, C2334C... c2334cArr) {
        if (c2334c2 == null) {
            c2334c2 = new C2334C(new C2334C.a[0]);
        }
        if (c2334c != null) {
            for (int i11 = 0; i11 < c2334c.e(); i11++) {
                C2334C.a d10 = c2334c.d(i11);
                if (d10 instanceof C4225c) {
                    C4225c c4225c = (C4225c) d10;
                    if (!c4225c.f46171a.equals("com.android.capture.fps")) {
                        c2334c2 = c2334c2.a(c4225c);
                    } else if (i10 == 2) {
                        c2334c2 = c2334c2.a(c4225c);
                    }
                }
            }
        }
        for (C2334C c2334c3 : c2334cArr) {
            c2334c2 = c2334c2.b(c2334c3);
        }
        if (c2334c2.e() > 0) {
            bVar.r0(c2334c2);
        }
    }
}
