package ru.ozon.android.messenger.framework.composer.analytics.di.module;

import RZ.a;
import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c implements Jb.e<RZ.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Sg.a> f86601a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Sg.a> f86602b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<VZ.a> f86603c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC6369b> f86604d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f86605e;

    public c(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f86601a = aVar;
        this.f86602b = aVar2;
        this.f86603c = aVar3;
        this.f86604d = aVar4;
        this.f86605e = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Sg.a analyticsScreenStorage = this.f86601a.get();
        Sg.a applicationAnalyticsScreenStorage = this.f86602b.get();
        VZ.a analyticsScreenFactory = this.f86603c.get();
        InterfaceC6369b interfaceC6369b = this.f86604d.get();
        boolean booleanValue = ((Boolean) this.f86605e.get()).booleanValue();
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        Intrinsics.checkNotNullParameter(analyticsScreenFactory, "analyticsScreenFactory");
        a.C0494a c0494a = new a.C0494a(interfaceC6369b != null ? new ZZ.b(interfaceC6369b, new a()) : new b());
        c0494a.d(new a.b(analyticsScreenStorage, applicationAnalyticsScreenStorage, analyticsScreenFactory));
        RZ.a a11 = c0494a.a();
        a11.e().c(booleanValue);
        return a11;
    }
}
