package H1;

import android.net.Uri;
import e2.s;
import java.util.Map;

/* loaded from: classes.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f4478a = new u() { // from class: H1.t
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return u.e();
        }
    };

    static /* synthetic */ InterfaceC1183p[] e() {
        return new InterfaceC1183p[0];
    }

    default InterfaceC1183p[] d(Uri uri, Map map) {
        return f();
    }

    InterfaceC1183p[] f();

    default u a(s.a aVar) {
        return this;
    }

    default u b(boolean z10) {
        return this;
    }

    default u c(int i10) {
        return this;
    }
}
