package B2;

import B2.f;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f613c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C2.b f614a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.savedstate.a f615b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Unit c(g gVar) {
            gVar.getLifecycle().a(new Recreator(gVar));
            return Unit.INSTANCE;
        }

        public final f b(final g owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new f(new C2.b(owner, new Function0() { // from class: B2.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit c10;
                    c10 = f.a.c(g.this);
                    return c10;
                }
            }), null);
        }

        public a() {
        }
    }

    public /* synthetic */ f(C2.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    public static final f a(g gVar) {
        return f613c.b(gVar);
    }

    public final androidx.savedstate.a b() {
        return this.f615b;
    }

    public final void c() {
        this.f614a.f();
    }

    public final void d(Bundle bundle) {
        this.f614a.h(bundle);
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f614a.i(outBundle);
    }

    public f(C2.b bVar) {
        this.f614a = bVar;
        this.f615b = new androidx.savedstate.a(bVar);
    }
}
