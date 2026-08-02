package R2;

import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface A {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9925a = a.f9926a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9926a = new a();

        public static /* synthetic */ A c(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.b(z10);
        }

        public final A a() {
            return c(this, false, 1, null);
        }

        public final A b(boolean z10) {
            B b10 = new B();
            return z10 ? new C(b10) : b10;
        }
    }

    static A c(boolean z10) {
        return f9925a.b(z10);
    }

    static A create() {
        return f9925a.a();
    }

    boolean a(X2.h hVar);

    C1549z b(X2.h hVar);

    default C1549z d(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return e(X2.p.a(spec));
    }

    C1549z e(X2.h hVar);

    List remove(String str);
}
