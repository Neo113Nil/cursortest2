package o2;

import android.util.SparseArray;
import androidx.media3.common.a;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4144k;
import java.util.ArrayList;
import java.util.List;
import o2.L;

/* renamed from: o2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5790j implements L.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f59068a;

    /* renamed from: b, reason: collision with root package name */
    public final List f59069b;

    public C5790j(int i10) {
        this(i10, AbstractC3445z.t());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // o2.L.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L a(int i10, L.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new y(new t(bVar.f58983b, bVar.a(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new y(new r("video/mp2t"));
            }
            if (i10 == 27) {
                if (f(4)) {
                    return null;
                }
                return new y(new p(c(bVar), f(1), f(8), "video/mp2t"));
            }
            if (i10 == 36) {
                return new y(new q(c(bVar), "video/mp2t"));
            }
            if (i10 == 45) {
                return new y(new u("video/mp2t"));
            }
            if (i10 == 89) {
                return new y(new C5792l(bVar.f58985d, "video/mp2t"));
            }
            if (i10 == 172) {
                return new y(new C5786f(bVar.f58983b, bVar.a(), "video/mp2t"));
            }
            if (i10 == 257) {
                return new C5778E(new x("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new y(new C5791k(bVar.f58983b, bVar.a(), 5408, "video/mp2t"));
                }
                switch (i10) {
                    case 15:
                        if (!f(2)) {
                            break;
                        }
                        break;
                    case 16:
                        break;
                    case 17:
                        if (!f(2)) {
                            break;
                        }
                        break;
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                break;
                            case 130:
                                if (!f(64)) {
                                }
                                break;
                            default:
                                switch (i10) {
                                    case 134:
                                        if (!f(16)) {
                                            break;
                                        }
                                        break;
                                }
                        }
                }
                return null;
            }
            return new y(new C5791k(bVar.f58983b, bVar.a(), 4096, "video/mp2t"));
        }
        return new y(new C5794n(d(bVar), "video/mp2t"));
    }

    @Override // o2.L.c
    public SparseArray b() {
        return new SparseArray();
    }

    public final C5780G c(L.b bVar) {
        return new C5780G(e(bVar), "video/mp2t");
    }

    public final O d(L.b bVar) {
        return new O(e(bVar), "video/mp2t");
    }

    public final List e(L.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f59069b;
        }
        e1.J j10 = new e1.J(bVar.descriptorBytes);
        List list = this.f59069b;
        while (j10.a() > 0) {
            int M10 = j10.M();
            int g10 = j10.g() + j10.M();
            if (M10 == 134) {
                list = new ArrayList();
                int M11 = j10.M() & 31;
                for (int i11 = 0; i11 < M11; i11++) {
                    String J10 = j10.J(3);
                    int M12 = j10.M();
                    boolean z10 = (M12 & 128) != 0;
                    if (z10) {
                        i10 = M12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte M13 = (byte) j10.M();
                    j10.c0(1);
                    list.add(new a.b().y0(str).n0(J10).Q(i10).k0(z10 ? AbstractC4144k.g((M13 & 64) != 0) : null).P());
                }
            }
            j10.b0(g10);
        }
        return list;
    }

    public final boolean f(int i10) {
        return (i10 & this.f59068a) != 0;
    }

    public C5790j(int i10, List list) {
        this.f59068a = i10;
        this.f59069b = list;
    }
}
