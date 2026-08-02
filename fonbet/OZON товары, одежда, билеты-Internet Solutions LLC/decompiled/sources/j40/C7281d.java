package j40;

import Jb.f;
import g30.InterfaceC6618a;
import j40.C7282e;
import kotlin.jvm.internal.Intrinsics;
import l40.InterfaceC7871a;
import l40.h;

/* renamed from: j40.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7281d implements Jb.e<InterfaceC7871a> {

    /* renamed from: a, reason: collision with root package name */
    private final f f69435a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Q90.c> f69436b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f69437c;

    public C7281d(f fVar, Pc.a aVar, Pc.a aVar2) {
        this.f69435a = fVar;
        this.f69436b = aVar;
        this.f69437c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        M90.a rustoreInteractor = (M90.a) this.f69435a.get();
        Q90.c featureToggles = (Q90.c) ((C7282e.a) this.f69436b).get();
        InterfaceC6618a analyticInteractor = (InterfaceC6618a) ((C7282e.b) this.f69437c).get();
        Intrinsics.checkNotNullParameter(rustoreInteractor, "rustoreInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        return new h(rustoreInteractor, featureToggles, analyticInteractor);
    }
}
