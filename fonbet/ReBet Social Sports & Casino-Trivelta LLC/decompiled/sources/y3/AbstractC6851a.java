package y3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import w3.C6701b;
import w3.EnumC6700a;
import w3.c;
import w3.d;
import w3.e;
import w3.f;
import w3.g;
import w3.h;
import w3.i;
import w3.j;
import w3.k;
import w3.l;
import w3.m;
import w3.n;
import w3.o;
import w3.p;
import w3.q;
import w3.r;
import x3.C6794a;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6851a {
    public static q a(InputStream inputStream) {
        return b(C6794a.b(inputStream));
    }

    public static q b(C6794a c6794a) {
        String str;
        EnumC6700a enumC6700a = EnumC6700a.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        n nVar = null;
        o oVar = null;
        EnumC6700a enumC6700a2 = enumC6700a;
        String str5 = str4;
        String str6 = str5;
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new q(enumC6700a, enumC6700a2, str5, str6, str2, i10, i11, i12, str3, arrayList, i13, nVar, str4, arrayList2, arrayList3, hashMap, hashMap2, arrayList4, arrayList5, arrayList6, i14, z10, oVar);
            }
            EnumC6700a enumC6700a3 = enumC6700a;
            int c10 = C6794a.c(j10);
            EnumC6700a enumC6700a4 = enumC6700a2;
            int d10 = C6794a.d(j10);
            switch (c10) {
                case 1:
                    str = str5;
                    u(c10, d10);
                    enumC6700a = EnumC6700a.b(c6794a.l());
                    enumC6700a2 = enumC6700a4;
                    break;
                case 2:
                    t(c10, d10);
                    str = c6794a.i();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 3:
                    str = str5;
                    t(c10, d10);
                    str6 = c6794a.i();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 4:
                    str = str5;
                    t(c10, d10);
                    str2 = c6794a.i();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 5:
                    str = str5;
                    u(c10, d10);
                    i10 = c6794a.l();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 6:
                    str = str5;
                    u(c10, d10);
                    i11 = c6794a.l();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 7:
                    str = str5;
                    u(c10, d10);
                    i12 = c6794a.l();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 8:
                    str = str5;
                    t(c10, d10);
                    str3 = c6794a.i();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 9:
                    str = str5;
                    t(c10, d10);
                    arrayList.add(c6794a.i());
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 10:
                    str = str5;
                    t(c10, d10);
                    nVar = o(c6794a.h());
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 11:
                case 12:
                case 13:
                default:
                    str = str5;
                    c6794a.n(d10);
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 14:
                    str = str5;
                    t(c10, d10);
                    str4 = c6794a.i();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 15:
                    str = str5;
                    t(c10, d10);
                    arrayList3.add(e(c6794a.h()));
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 16:
                    str = str5;
                    t(c10, d10);
                    s(c6794a.h(), hashMap);
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 17:
                    str = str5;
                    t(c10, d10);
                    arrayList4.add(m(c6794a.h()));
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 18:
                    str = str5;
                    t(c10, d10);
                    arrayList5.add(i(c6794a.h()));
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 19:
                    str = str5;
                    t(c10, d10);
                    arrayList6.add(g(c6794a.h()));
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 20:
                    str = str5;
                    u(c10, d10);
                    i13 = c6794a.l();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 21:
                    str = str5;
                    t(c10, d10);
                    arrayList2.add(f(c6794a.h()));
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 22:
                    str = str5;
                    u(c10, d10);
                    i14 = c6794a.l();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 23:
                    str = str5;
                    u(c10, d10);
                    z10 = c6794a.f();
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 24:
                    str = str5;
                    u(c10, d10);
                    enumC6700a2 = EnumC6700a.b(c6794a.l());
                    enumC6700a = enumC6700a3;
                    break;
                case 25:
                    str = str5;
                    t(c10, d10);
                    s(c6794a.h(), hashMap2);
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
                case 26:
                    str = str5;
                    t(c10, d10);
                    oVar = p(c6794a.h());
                    enumC6700a = enumC6700a3;
                    enumC6700a2 = enumC6700a4;
                    break;
            }
            str5 = str;
        }
    }

    public static C6701b c(C6794a c6794a) {
        byte[] bArr = new byte[0];
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new C6701b(bArr);
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            if (c10 != 1) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                bArr = c6794a.g();
            }
        }
    }

    public static c d(C6794a c6794a) {
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (true) {
            int j15 = c6794a.j();
            if (j15 == 0) {
                return new c(j10, j11, j12, str, j13, str2, j14, str3);
            }
            int c10 = C6794a.c(j15);
            int d10 = C6794a.d(j15);
            switch (c10) {
                case 1:
                    u(c10, d10);
                    j10 = c6794a.k();
                    break;
                case 2:
                    u(c10, d10);
                    j11 = c6794a.k();
                    break;
                case 3:
                    u(c10, d10);
                    j12 = c6794a.k();
                    break;
                case 4:
                    t(c10, d10);
                    str = c6794a.i();
                    break;
                case 5:
                    u(c10, d10);
                    j13 = c6794a.k();
                    break;
                case 6:
                    t(c10, d10);
                    str2 = c6794a.i();
                    break;
                case 7:
                    u(c10, d10);
                    j14 = c6794a.k();
                    break;
                case 8:
                    t(c10, d10);
                    str3 = c6794a.i();
                    break;
                default:
                    c6794a.n(d10);
                    break;
            }
        }
    }

    public static d e(C6794a c6794a) {
        String str = "";
        k kVar = null;
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new d(str, kVar);
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            if (c10 == 1) {
                t(c10, d10);
                str = c6794a.i();
            } else if (c10 != 2) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                kVar = l(c6794a.h());
            }
        }
    }

    public static e f(C6794a c6794a) {
        byte[] bArr = new byte[0];
        byte[] bArr2 = new byte[0];
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new e(bArr, bArr2);
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            if (c10 == 1) {
                t(c10, d10);
                bArr = c6794a.g();
            } else if (c10 != 2) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                bArr2 = c6794a.g();
            }
        }
    }

    public static f g(C6794a c6794a) {
        int i10 = 0;
        String str = "";
        String str2 = str;
        long j10 = 0;
        while (true) {
            int j11 = c6794a.j();
            if (j11 == 0) {
                return new f(i10, str, str2, j10);
            }
            int c10 = C6794a.c(j11);
            int d10 = C6794a.d(j11);
            if (c10 == 1) {
                u(c10, d10);
                i10 = c6794a.l();
            } else if (c10 == 2) {
                t(c10, d10);
                str = c6794a.i();
            } else if (c10 == 3) {
                t(c10, d10);
                str2 = c6794a.i();
            } else if (c10 != 4) {
                c6794a.n(d10);
            } else {
                u(c10, d10);
                j10 = c6794a.k();
            }
        }
    }

    public static g h(C6794a c6794a) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            int j14 = c6794a.j();
            if (j14 == 0) {
                return new g(j13, j10, j11, arrayList, j12, arrayList2);
            }
            int c10 = C6794a.c(j14);
            int d10 = C6794a.d(j14);
            switch (c10) {
                case 1:
                    u(c10, d10);
                    j13 = c6794a.k();
                    break;
                case 2:
                    u(c10, d10);
                    j10 = c6794a.k();
                    break;
                case 3:
                    u(c10, d10);
                    j11 = c6794a.k();
                    break;
                case 4:
                    t(c10, d10);
                    arrayList.add(d(c6794a.h()));
                    break;
                case 5:
                    u(c10, d10);
                    j12 = c6794a.k();
                    break;
                case 6:
                    t(c10, d10);
                    arrayList2.add(d(c6794a.h()));
                    break;
                default:
                    c6794a.n(d10);
                    break;
            }
        }
    }

    public static h i(C6794a c6794a) {
        ArrayList arrayList = new ArrayList();
        String str = "";
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new h(str, arrayList);
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            if (c10 == 1) {
                t(c10, d10);
                str = c6794a.i();
            } else if (c10 != 2) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                arrayList.add(j(c6794a.h()));
            }
        }
    }

    public static i j(C6794a c6794a) {
        String str = "";
        String str2 = str;
        String str3 = str2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new i(str, i10, i11, i12, str2, str3);
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            switch (c10) {
                case 1:
                    t(c10, d10);
                    str = c6794a.i();
                    break;
                case 2:
                    u(c10, d10);
                    i10 = c6794a.l();
                    break;
                case 3:
                    u(c10, d10);
                    i11 = c6794a.l();
                    break;
                case 4:
                    u(c10, d10);
                    i12 = c6794a.l();
                    break;
                case 5:
                    t(c10, d10);
                    str2 = c6794a.i();
                    break;
                case 6:
                    t(c10, d10);
                    str3 = c6794a.i();
                    break;
                default:
                    c6794a.n(d10);
                    break;
            }
        }
    }

    public static j k(C6794a c6794a) {
        byte[] bArr = new byte[0];
        String str = "";
        String str2 = str;
        long j10 = 0;
        C6701b c6701b = null;
        while (true) {
            int j11 = c6794a.j();
            if (j11 == 0) {
                return new j(str, str2, j10, bArr, c6701b);
            }
            int c10 = C6794a.c(j11);
            int d10 = C6794a.d(j11);
            if (c10 == 1) {
                t(c10, d10);
                str = c6794a.i();
            } else if (c10 == 2) {
                t(c10, d10);
                str2 = c6794a.i();
            } else if (c10 == 3) {
                u(c10, d10);
                j10 = c6794a.k();
            } else if (c10 == 4) {
                t(c10, d10);
                bArr = c6794a.g();
            } else if (c10 != 6) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                c6701b = c(c6794a.h());
            }
        }
    }

    public static k l(C6794a c6794a) {
        k.a aVar = k.a.GWP_ASAN;
        k.b bVar = k.b.UNKNOWN;
        g gVar = null;
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                return new k(aVar, bVar, gVar);
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            if (c10 == 1) {
                u(c10, d10);
                aVar = k.a.b(c6794a.l());
            } else if (c10 == 2) {
                u(c10, d10);
                bVar = k.b.b(c6794a.l());
            } else if (c10 != 3) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                gVar = h(c6794a.h());
            }
        }
    }

    public static l m(C6794a c6794a) {
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = "";
        String str2 = str;
        while (true) {
            int j14 = c6794a.j();
            if (j14 == 0) {
                return new l(j10, j11, j12, z10, z11, z12, str, str2, j13);
            }
            int c10 = C6794a.c(j14);
            int d10 = C6794a.d(j14);
            switch (c10) {
                case 1:
                    u(c10, d10);
                    j10 = c6794a.k();
                    break;
                case 2:
                    u(c10, d10);
                    j11 = c6794a.k();
                    break;
                case 3:
                    u(c10, d10);
                    j12 = c6794a.k();
                    break;
                case 4:
                    u(c10, d10);
                    z10 = c6794a.f();
                    break;
                case 5:
                    u(c10, d10);
                    z11 = c6794a.f();
                    break;
                case 6:
                    u(c10, d10);
                    z12 = c6794a.f();
                    break;
                case 7:
                    t(c10, d10);
                    str = c6794a.i();
                    break;
                case 8:
                    t(c10, d10);
                    str2 = c6794a.i();
                    break;
                case 9:
                    u(c10, d10);
                    j13 = c6794a.k();
                    break;
                default:
                    c6794a.n(d10);
                    break;
            }
        }
    }

    public static m n(C6794a c6794a) {
        String str = "";
        long j10 = 0;
        while (true) {
            int j11 = c6794a.j();
            if (j11 == 0) {
                return new m(str, j10);
            }
            int c10 = C6794a.c(j11);
            int d10 = C6794a.d(j11);
            if (c10 == 1) {
                t(c10, d10);
                str = c6794a.i();
            } else if (c10 != 2) {
                c6794a.n(d10);
            } else {
                u(c10, d10);
                j10 = c6794a.k();
            }
        }
    }

    public static n o(C6794a c6794a) {
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        String str = "";
        String str2 = str;
        long j10 = 0;
        j jVar = null;
        while (true) {
            int j11 = c6794a.j();
            if (j11 == 0) {
                return new n(i10, str, i11, str2, z10, i12, i13, z11, j10, jVar);
            }
            int c10 = C6794a.c(j11);
            int d10 = C6794a.d(j11);
            switch (c10) {
                case 1:
                    u(c10, d10);
                    i10 = c6794a.l();
                    break;
                case 2:
                    t(c10, d10);
                    str = c6794a.i();
                    break;
                case 3:
                    u(c10, d10);
                    i11 = c6794a.l();
                    break;
                case 4:
                    t(c10, d10);
                    str2 = c6794a.i();
                    break;
                case 5:
                    u(c10, d10);
                    z10 = c6794a.f();
                    break;
                case 6:
                    u(c10, d10);
                    i12 = c6794a.l();
                    break;
                case 7:
                    u(c10, d10);
                    i13 = c6794a.l();
                    break;
                case 8:
                    u(c10, d10);
                    z11 = c6794a.f();
                    break;
                case 9:
                    u(c10, d10);
                    j10 = c6794a.k();
                    break;
                case 10:
                    t(c10, d10);
                    jVar = k(c6794a.h());
                    break;
                default:
                    c6794a.n(d10);
                    break;
            }
        }
    }

    public static o p(C6794a c6794a) {
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        while (true) {
            int j11 = c6794a.j();
            if (j11 == 0) {
                return new o(j10, arrayList);
            }
            int c10 = C6794a.c(j11);
            int d10 = C6794a.d(j11);
            if (c10 == 1) {
                u(c10, d10);
                j10 = c6794a.k();
            } else if (c10 != 2) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                arrayList.add(q(c6794a.h()));
            }
        }
    }

    public static p q(C6794a c6794a) {
        c cVar = null;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            int j12 = c6794a.j();
            if (j12 == 0) {
                return new p(cVar, j10, j11);
            }
            int c10 = C6794a.c(j12);
            int d10 = C6794a.d(j12);
            if (c10 == 1) {
                t(c10, d10);
                cVar = d(c6794a.h());
            } else if (c10 == 2) {
                u(c10, d10);
                j10 = c6794a.k();
            } else if (c10 != 3) {
                c6794a.n(d10);
            } else {
                u(c10, d10);
                j11 = c6794a.k();
            }
        }
    }

    public static r r(C6794a c6794a) {
        int c10;
        int d10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        long j10 = 0;
        String str = "";
        long j11 = 0;
        while (true) {
            int i11 = i10;
            while (true) {
                int j12 = c6794a.j();
                if (j12 == 0) {
                    return new r(i11, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, j10, j11);
                }
                c10 = C6794a.c(j12);
                d10 = C6794a.d(j12);
                switch (c10) {
                    case 1:
                        break;
                    case 2:
                        t(c10, d10);
                        str = c6794a.i();
                        break;
                    case 3:
                        t(c10, d10);
                        arrayList.add(n(c6794a.h()));
                        break;
                    case 4:
                        t(c10, d10);
                        arrayList4.add(d(c6794a.h()));
                        break;
                    case 5:
                        t(c10, d10);
                        arrayList5.add(k(c6794a.h()));
                        break;
                    case 6:
                        u(c10, d10);
                        j10 = c6794a.k();
                        break;
                    case 7:
                        t(c10, d10);
                        arrayList2.add(c6794a.i());
                        break;
                    case 8:
                        u(c10, d10);
                        j11 = c6794a.k();
                        break;
                    case 9:
                        t(c10, d10);
                        arrayList3.add(c6794a.i());
                        break;
                    default:
                        c6794a.n(d10);
                        break;
                }
            }
            u(c10, d10);
            i10 = c6794a.l();
        }
    }

    public static void s(C6794a c6794a, Map map) {
        int i10 = 0;
        r rVar = null;
        while (true) {
            int j10 = c6794a.j();
            if (j10 == 0) {
                break;
            }
            int c10 = C6794a.c(j10);
            int d10 = C6794a.d(j10);
            if (c10 == 1) {
                u(c10, d10);
                i10 = c6794a.l();
            } else if (c10 != 2) {
                c6794a.n(d10);
            } else {
                t(c10, d10);
                rVar = r(c6794a.h());
            }
        }
        if (rVar != null) {
            map.put(Integer.valueOf(i10), rVar);
        }
    }

    public static void t(int i10, int i11) {
        C6794a.a(i10, 2, i11);
    }

    public static void u(int i10, int i11) {
        C6794a.a(i10, 0, i11);
    }
}
