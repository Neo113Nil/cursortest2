package g80;

import Q90.n;
import g30.InterfaceC6618a;
import g80.C6661a;
import kotlin.jvm.internal.Intrinsics;
import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;

/* loaded from: classes3.dex */
public final class g implements Jb.e<h80.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<n> f64102a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f64103b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC9218a> f64104c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<B30.a> f64105d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<C9635d> f64106e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<C9634c> f64107f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<s90.f> f64108g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<C9632a> f64109h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<C9633b> f64110i;

    public g(Pc.a<n> aVar, Pc.a<InterfaceC6618a> aVar2, Pc.a<InterfaceC9218a> aVar3, Pc.a<B30.a> aVar4, Pc.a<C9635d> aVar5, Pc.a<C9634c> aVar6, Pc.a<s90.f> aVar7, Pc.a<C9632a> aVar8, Pc.a<C9633b> aVar9) {
        this.f64102a = aVar;
        this.f64103b = aVar2;
        this.f64104c = aVar3;
        this.f64105d = aVar4;
        this.f64106e = aVar5;
        this.f64107f = aVar6;
        this.f64108g = aVar7;
        this.f64109h = aVar8;
        this.f64110i = aVar9;
    }

    @Override // Pc.a
    public final Object get() {
        n fintechUltraManager = (n) ((C6661a.j) this.f64102a).get();
        InterfaceC6618a fintechAnalyticInteractor = (InterfaceC6618a) ((C6661a.f) this.f64103b).get();
        InterfaceC9218a fintechPermissionManager = (InterfaceC9218a) ((C6661a.h) this.f64104c).get();
        B30.a biometricAuthManager = (B30.a) ((C6661a.c) this.f64105d).get();
        C9635d notificationsPermission = (C9635d) ((C6661a.m) this.f64106e).get();
        C9634c cameraPermission = (C9634c) ((C6661a.d) this.f64107f).get();
        s90.f readContactsPermission = (s90.f) ((C6661a.o) this.f64108g).get();
        C9632a accessCoarseLocationPermission = (C9632a) ((C6661a.C1037a) this.f64109h).get();
        C9633b accessFineLocationPermission = (C9633b) ((C6661a.b) this.f64110i).get();
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(notificationsPermission, "notificationsPermission");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(readContactsPermission, "readContactsPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        return new h80.b(fintechUltraManager, fintechAnalyticInteractor, fintechPermissionManager, accessFineLocationPermission, accessCoarseLocationPermission, cameraPermission, notificationsPermission, readContactsPermission, biometricAuthManager);
    }
}
