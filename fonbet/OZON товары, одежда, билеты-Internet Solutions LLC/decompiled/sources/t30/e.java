package t30;

import android.content.Context;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import t30.g;

/* loaded from: classes3.dex */
public final class e implements Jb.e<x30.f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f99059a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<R30.a> f99060b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f99061c;

    public e(Pc.a<Context> aVar, Pc.a<R30.a> aVar2, Pc.a<InterfaceC6618a> aVar3) {
        this.f99059a = aVar;
        this.f99060b = aVar2;
        this.f99061c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((g.a.n) this.f99059a).get();
        R30.a appCoroutineScopes = (R30.a) ((g.a.l) this.f99060b).get();
        InterfaceC6618a analyticInteractor = (InterfaceC6618a) ((g.a.f) this.f99061c).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        return new x30.f(context, appCoroutineScopes, analyticInteractor);
    }
}
