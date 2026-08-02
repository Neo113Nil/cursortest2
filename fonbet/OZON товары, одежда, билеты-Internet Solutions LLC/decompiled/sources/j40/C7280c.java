package j40;

import g30.InterfaceC6618a;
import j40.C7282e;
import kotlin.jvm.internal.Intrinsics;
import l40.InterfaceC7871a;

/* renamed from: j40.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7280c implements Jb.e<InterfaceC7871a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<J7.c> f69431a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f69432b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Q90.c> f69433c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f69434d;

    public C7280c(Pc.a<J7.c> aVar, Pc.a<S80.b> aVar2, Pc.a<Q90.c> aVar3, Pc.a<InterfaceC6618a> aVar4) {
        this.f69431a = aVar;
        this.f69432b = aVar2;
        this.f69433c = aVar3;
        this.f69434d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        J7.c manager = this.f69431a.get();
        S80.b navigation = (S80.b) ((C7282e.d) this.f69432b).get();
        Q90.c featureToggles = (Q90.c) ((C7282e.a) this.f69433c).get();
        InterfaceC6618a analyticInteractor = (InterfaceC6618a) ((C7282e.b) this.f69434d).get();
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        return new l40.d(navigation, manager, featureToggles, analyticInteractor);
    }
}
