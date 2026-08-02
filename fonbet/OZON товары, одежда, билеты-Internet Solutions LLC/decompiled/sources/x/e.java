package x;

import C.A;
import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import x.c;

/* loaded from: classes8.dex */
final class e implements c.a {

    /* renamed from: a, reason: collision with root package name */
    static final c f104643a = new c(new e());

    /* renamed from: b, reason: collision with root package name */
    private static final Set<A> f104644b = Collections.singleton(A.f4076d);

    @Override // x.c.a
    @NonNull
    public final Set<A> a() {
        return f104644b;
    }

    @Override // x.c.a
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // x.c.a
    @NonNull
    public final Set<A> c(@NonNull A a11) {
        x2.i.a("DynamicRange is not supported: " + a11, A.f4076d.equals(a11));
        return f104644b;
    }
}
