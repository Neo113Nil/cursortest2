package u4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.C8050C;
import m3.C8065g;
import u4.J;

/* renamed from: u4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9955i implements J.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f100043a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C7272n> f100044b;

    public C9955i(int i11, List<C7272n> list) {
        this.f100043a = i11;
        this.f100044b = list;
    }

    private List<C7272n> b(J.b bVar) {
        String str;
        int i11;
        List list;
        boolean c11 = c(32);
        List<C7272n> list2 = this.f100044b;
        if (c11) {
            return list2;
        }
        C8050C c8050c = new C8050C(bVar.f99965d);
        while (c8050c.a() > 0) {
            int E11 = c8050c.E();
            int f7 = c8050c.f() + c8050c.E();
            if (E11 == 134) {
                ArrayList arrayList = new ArrayList();
                int E12 = c8050c.E() & 31;
                for (int i12 = 0; i12 < E12; i12++) {
                    String C11 = c8050c.C(3, StandardCharsets.UTF_8);
                    int E13 = c8050c.E();
                    boolean z11 = (E13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    if (z11) {
                        i11 = E13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i11 = 1;
                    }
                    byte E14 = (byte) c8050c.E();
                    c8050c.S(1);
                    if (z11) {
                        boolean z12 = (E14 & 64) != 0;
                        int i13 = C8065g.f74319d;
                        list = Collections.singletonList(z12 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C7272n.a aVar = new C7272n.a();
                    aVar.y0(str);
                    aVar.n0(C11);
                    aVar.Q(i11);
                    aVar.k0(list);
                    arrayList.add(aVar.P());
                }
                list2 = arrayList;
            }
            c8050c.R(f7);
        }
        return list2;
    }

    private boolean c(int i11) {
        return (i11 & this.f100043a) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J a(int i11, J.b bVar) {
        if (i11 != 2) {
            String str = bVar.f99962a;
            if (i11 == 3 || i11 == 4) {
                return new x(new s(str, bVar.a(), "video/mp2t"));
            }
            if (i11 == 21) {
                return new x(new q());
            }
            if (i11 == 27) {
                if (c(4)) {
                    return null;
                }
                return new x(new o(new E(b(bVar)), c(1), c(8)));
            }
            if (i11 == 36) {
                return new x(new p(new E(b(bVar))));
            }
            if (i11 == 45) {
                return new x(new t());
            }
            if (i11 == 89) {
                return new x(new C9957k(bVar.f99964c));
            }
            if (i11 == 172) {
                return new x(new C9951e(str, bVar.a(), "video/mp2t"));
            }
            if (i11 == 257) {
                return new D(new w("application/vnd.dvb.ait"));
            }
            if (i11 != 138) {
                if (i11 == 139) {
                    return new x(new C9956j(str, bVar.a(), 5408));
                }
                switch (i11) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new x(new C9954h(bVar.a(), str, "video/mp2t", false));
                    case 16:
                        return new x(new n(new L(b(bVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new x(new r(str, bVar.a()));
                    default:
                        switch (i11) {
                            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                                break;
                            case 129:
                                return new x(new C9949c(str, bVar.a(), "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i11) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new D(new w("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new x(new C9956j(str, bVar.a(), 4096));
        }
        return new x(new m(new L(b(bVar)), "video/mp2t"));
    }
}
