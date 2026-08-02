package h4;

import Ij.C3261b;
import Ve.C4598rp;
import b4.AbstractC5532h;
import b4.C5525a;
import b4.C5529e;
import b4.C5533i;
import b4.C5534j;
import b4.C5537m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import j3.t;
import m3.C8050C;
import n3.AbstractC8431d;
import n3.C8429b;

/* loaded from: classes.dex */
final class f {
    public static C8429b a(t tVar, String str) {
        for (int i11 = 0; i11 < tVar.e(); i11++) {
            t.a d11 = tVar.d(i11);
            if (d11 instanceof C8429b) {
                C8429b c8429b = (C8429b) d11;
                if (c8429b.f76370a.equals(str)) {
                    return c8429b;
                }
            }
        }
        return null;
    }

    private static C5529e b(int i11, C8050C c8050c) {
        int p11 = c8050c.p();
        if (c8050c.p() == 1684108385) {
            c8050c.S(8);
            String A11 = c8050c.A(p11 - 16);
            return new C5529e("und", A11, A11);
        }
        m3.s.f("MetadataUtil", "Failed to parse comment attribute: " + AbstractC8431d.a(i11));
        return null;
    }

    private static C5525a c(C8050C c8050c) {
        int p11 = c8050c.p();
        if (c8050c.p() != 1684108385) {
            m3.s.f("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int p12 = c8050c.p();
        int i11 = C6795a.f64748b;
        int i12 = p12 & 16777215;
        String str = i12 == 13 ? "image/jpeg" : i12 == 14 ? "image/png" : null;
        if (str == null) {
            C3261b.f(i12, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c8050c.S(4);
        int i13 = p11 - 16;
        byte[] bArr = new byte[i13];
        c8050c.n(0, i13, bArr);
        return new C5525a(3, str, bArr, null);
    }

    public static AbstractC5532h d(C8050C c8050c) {
        int p11 = c8050c.p() + c8050c.f();
        int p12 = c8050c.p();
        int i11 = (p12 >> 24) & 255;
        AbstractC5532h abstractC5532h = null;
        try {
            if (i11 == 169 || i11 == 253) {
                int i12 = 16777215 & p12;
                if (i12 == 6516084) {
                    return b(p12, c8050c);
                }
                if (i12 == 7233901 || i12 == 7631467) {
                    return h(p12, "TIT2", c8050c);
                }
                if (i12 == 6516589 || i12 == 7828084) {
                    return h(p12, "TCOM", c8050c);
                }
                if (i12 == 6578553) {
                    return h(p12, "TDRC", c8050c);
                }
                if (i12 == 4280916) {
                    return h(p12, "TPE1", c8050c);
                }
                if (i12 == 7630703) {
                    return h(p12, "TSSE", c8050c);
                }
                if (i12 == 6384738) {
                    return h(p12, "TALB", c8050c);
                }
                if (i12 == 7108978) {
                    return h(p12, "USLT", c8050c);
                }
                if (i12 == 6776174) {
                    return h(p12, "TCON", c8050c);
                }
                if (i12 == 6779504) {
                    return h(p12, "TIT1", c8050c);
                }
            } else {
                if (p12 == 1735291493) {
                    String a11 = C5533i.a(f(c8050c) - 1);
                    if (a11 != null) {
                        abstractC5532h = new C5537m("TCON", null, AbstractC5880y.B(a11));
                    } else {
                        m3.s.f("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return abstractC5532h;
                }
                if (p12 == 1684632427) {
                    return e(p12, "TPOS", c8050c);
                }
                if (p12 == 1953655662) {
                    return e(p12, "TRCK", c8050c);
                }
                if (p12 == 1953329263) {
                    return g(p12, "TBPM", c8050c, true, false);
                }
                if (p12 == 1668311404) {
                    return g(p12, "TCMP", c8050c, true, true);
                }
                if (p12 == 1668249202) {
                    return c(c8050c);
                }
                if (p12 == 1631670868) {
                    return h(p12, "TPE2", c8050c);
                }
                if (p12 == 1936682605) {
                    return h(p12, "TSOT", c8050c);
                }
                if (p12 == 1936679276) {
                    return h(p12, "TSOA", c8050c);
                }
                if (p12 == 1936679282) {
                    return h(p12, "TSOP", c8050c);
                }
                if (p12 == 1936679265) {
                    return h(p12, "TSO2", c8050c);
                }
                if (p12 == 1936679791) {
                    return h(p12, "TSOC", c8050c);
                }
                if (p12 == 1920233063) {
                    return g(p12, "ITUNESADVISORY", c8050c, false, false);
                }
                if (p12 == 1885823344) {
                    return g(p12, "ITUNESGAPLESS", c8050c, false, true);
                }
                if (p12 == 1936683886) {
                    return h(p12, "TVSHOWSORT", c8050c);
                }
                if (p12 == 1953919848) {
                    return h(p12, "TVSHOW", c8050c);
                }
                if (p12 == 757935405) {
                    int i13 = -1;
                    int i14 = -1;
                    String str = null;
                    String str2 = null;
                    while (c8050c.f() < p11) {
                        int f7 = c8050c.f();
                        int p13 = c8050c.p();
                        int p14 = c8050c.p();
                        c8050c.S(4);
                        if (p14 == 1835360622) {
                            str = c8050c.A(p13 - 12);
                        } else if (p14 == 1851878757) {
                            str2 = c8050c.A(p13 - 12);
                        } else {
                            if (p14 == 1684108385) {
                                i13 = f7;
                                i14 = p13;
                            }
                            c8050c.S(p13 - 12);
                        }
                    }
                    if (str != null && str2 != null && i13 != -1) {
                        c8050c.R(i13);
                        c8050c.S(16);
                        abstractC5532h = new C5534j(str, str2, c8050c.A(i14 - 16));
                    }
                    return abstractC5532h;
                }
            }
            m3.s.b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC8431d.a(p12));
            return null;
        } finally {
            c8050c.R(p11);
        }
    }

    private static C5537m e(int i11, String str, C8050C c8050c) {
        int p11 = c8050c.p();
        if (c8050c.p() == 1684108385 && p11 >= 22) {
            c8050c.S(10);
            int L11 = c8050c.L();
            if (L11 > 0) {
                String a11 = Ej.b.a(L11, "");
                int L12 = c8050c.L();
                if (L12 > 0) {
                    a11 = C4598rp.c(L12, a11, "/");
                }
                return new C5537m(str, null, AbstractC5880y.B(a11));
            }
        }
        m3.s.f("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC8431d.a(i11));
        return null;
    }

    private static int f(C8050C c8050c) {
        int p11 = c8050c.p();
        if (c8050c.p() == 1684108385) {
            c8050c.S(8);
            int i11 = p11 - 16;
            if (i11 == 1) {
                return c8050c.E();
            }
            if (i11 == 2) {
                return c8050c.L();
            }
            if (i11 == 3) {
                return c8050c.H();
            }
            if (i11 == 4 && (c8050c.m() & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return c8050c.I();
            }
        }
        m3.s.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static AbstractC5532h g(int i11, String str, C8050C c8050c, boolean z11, boolean z12) {
        int f7 = f(c8050c);
        if (z12) {
            f7 = Math.min(1, f7);
        }
        if (f7 >= 0) {
            return z11 ? new C5537m(str, null, AbstractC5880y.B(Integer.toString(f7))) : new C5529e("und", str, Integer.toString(f7));
        }
        m3.s.f("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC8431d.a(i11));
        return null;
    }

    private static C5537m h(int i11, String str, C8050C c8050c) {
        int p11 = c8050c.p();
        if (c8050c.p() == 1684108385) {
            c8050c.S(8);
            return new C5537m(str, null, AbstractC5880y.B(c8050c.A(p11 - 16)));
        }
        m3.s.f("MetadataUtil", "Failed to parse text attribute: " + AbstractC8431d.a(i11));
        return null;
    }

    public static void i(int i11, t tVar, C7272n.a aVar, t tVar2, t... tVarArr) {
        if (tVar2 == null) {
            tVar2 = new t(new t.a[0]);
        }
        if (tVar != null) {
            for (int i12 = 0; i12 < tVar.e(); i12++) {
                t.a d11 = tVar.d(i12);
                if (d11 instanceof C8429b) {
                    C8429b c8429b = (C8429b) d11;
                    if (!c8429b.f76370a.equals("com.android.capture.fps")) {
                        tVar2 = tVar2.a(c8429b);
                    } else if (i11 == 2) {
                        tVar2 = tVar2.a(c8429b);
                    }
                }
            }
        }
        for (t tVar3 : tVarArr) {
            tVar2 = tVar2.b(tVar3);
        }
        if (tVar2.e() > 0) {
            aVar.r0(tVar2);
        }
    }
}
