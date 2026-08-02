package defpackage;

import android.os.Bundle;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pvd implements bij, h72, msi, al3, nfk, ql6, b75, gjg {
    public final /* synthetic */ int a;

    public /* synthetic */ pvd(int i) {
        this.a = i;
    }

    public static /* synthetic */ void A(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void B(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void j() {
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void l(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void n(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " format is expected but ");
        sb.append(obj2);
        sb.append((Object) " ad format was received");
        throw new geg(sb.toString());
    }

    public static /* synthetic */ void o(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new XmlPullParserException(str);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3, Object obj4, Throwable th) {
        throw new RuntimeException(str + obj + obj2 + obj3 + obj4, th);
    }

    public static /* synthetic */ void v(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void w(StringBuilder sb, Object obj) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void x() {
        throw new fka();
    }

    public static /* synthetic */ void y(Object obj, Object obj2, String str) {
        throw new fb3(str + obj + obj2, 3);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.gjg
    public boolean b(int i) {
        if (i != 0) {
            return i == 4;
        }
        throw null;
    }

    @Override // defpackage.ql6
    public ll6[] createExtractors() {
        return new ll6[]{new rgf()};
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        i72 ideVar;
        switch (this.a) {
            case 6:
                qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f == -1.0f ? new ide() : new ide(f);
            default:
                int i = bundle.getInt(Integer.toString(0, 36), -1);
                if (i == 0) {
                    qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new e99(bundle.getBoolean(Integer.toString(2, 36), false)) : new e99();
                }
                if (i == 1) {
                    qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                    float f2 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    if (f2 == -1.0f) {
                        return new ide();
                    }
                    ideVar = new ide(f2);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                            return bundle.getBoolean(Integer.toString(1, 36), false) ? new pgj(bundle.getBoolean(Integer.toString(2, 36), false)) : new pgj();
                        }
                        a70.p(ljg.j(i, "Unknown RatingType: "));
                        return null;
                    }
                    qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                    int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                    float f3 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                    if (f3 != -1.0f) {
                        return new sbi(i2, f3);
                    }
                    ideVar = new sbi(i2);
                }
                return ideVar;
        }
    }

    @Override // defpackage.al3
    public void a() {
    }

    @Override // defpackage.nfk
    public void f(f79 f79Var) {
    }

    @Override // defpackage.b75
    public double h(double d) {
        return d;
    }

    @Override // defpackage.msi
    public void d(jsi jsiVar, int i) {
    }

    @Override // defpackage.bij
    public void e(String str, Object[] objArr) {
    }
}
