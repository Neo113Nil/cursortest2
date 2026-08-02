package si0;

import Jb.f;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import r.n;

/* loaded from: classes3.dex */
public final class b implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98799a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f98800b;

    public b(Pc.a aVar) {
        this.f98800b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f98799a) {
            case 0:
                C7967a serviceLocator = (C7967a) ((f) this.f98800b).get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.b();
            default:
                Context context = (Context) this.f98800b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                n c11 = n.c(context);
                Intrinsics.checkNotNullExpressionValue(c11, "from(...)");
                return c11;
        }
    }

    public b(C9700a c9700a, f fVar) {
        this.f98800b = fVar;
    }
}
