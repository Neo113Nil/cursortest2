package g80;

import android.content.Context;
import g30.InterfaceC6618a;
import g80.C6661a;
import h80.C6875a;
import kotlin.jvm.internal.Intrinsics;
import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;

/* loaded from: classes3.dex */
public final class f implements Jb.e<C6875a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f64090a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC9218a> f64091b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<B30.a> f64092c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f64093d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<h90.f> f64094e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<C9635d> f64095f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<C9634c> f64096g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<s90.f> f64097h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<C9632a> f64098i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<C9633b> f64099j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<s90.h> f64100k;

    /* renamed from: l, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f64101l;

    public f(Pc.a<Context> aVar, Pc.a<InterfaceC9218a> aVar2, Pc.a<B30.a> aVar3, Pc.a<InterfaceC6618a> aVar4, Pc.a<h90.f> aVar5, Pc.a<C9635d> aVar6, Pc.a<C9634c> aVar7, Pc.a<s90.f> aVar8, Pc.a<C9632a> aVar9, Pc.a<C9633b> aVar10, Pc.a<s90.h> aVar11, Pc.a<ru.ozon.fintech.settings.domain.a> aVar12) {
        this.f64090a = aVar;
        this.f64091b = aVar2;
        this.f64092c = aVar3;
        this.f64093d = aVar4;
        this.f64094e = aVar5;
        this.f64095f = aVar6;
        this.f64096g = aVar7;
        this.f64097h = aVar8;
        this.f64098i = aVar9;
        this.f64099j = aVar10;
        this.f64100k = aVar11;
        this.f64101l = aVar12;
    }

    @Override // Pc.a
    public final Object get() {
        Context application = (Context) ((C6661a.s) this.f64090a).get();
        InterfaceC9218a fintechPermissionManager = (InterfaceC9218a) ((C6661a.h) this.f64091b).get();
        B30.a biometricAuthManager = (B30.a) ((C6661a.c) this.f64092c).get();
        InterfaceC6618a analyticInteractor = (InterfaceC6618a) ((C6661a.f) this.f64093d).get();
        h90.f notificationInteractor = (h90.f) ((C6661a.l) this.f64094e).get();
        C9635d notificationsPermission = (C9635d) ((C6661a.m) this.f64095f).get();
        C9634c cameraPermission = (C9634c) ((C6661a.d) this.f64096g).get();
        s90.f readContactsPermission = (s90.f) ((C6661a.o) this.f64097h).get();
        C9632a accessCoarseLocationPermission = (C9632a) ((C6661a.C1037a) this.f64098i).get();
        C9633b accessFineLocationPermission = (C9633b) ((C6661a.b) this.f64099j).get();
        s90.h recordAudioPermission = (s90.h) ((C6661a.p) this.f64100k).get();
        ru.ozon.fintech.settings.domain.a settings = (ru.ozon.fintech.settings.domain.a) ((C6661a.i) this.f64101l).get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(notificationsPermission, "notificationsPermission");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(readContactsPermission, "readContactsPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        Intrinsics.checkNotNullParameter(recordAudioPermission, "recordAudioPermission");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new C6875a(application, fintechPermissionManager, biometricAuthManager, analyticInteractor, notificationInteractor, notificationsPermission, cameraPermission, readContactsPermission, accessCoarseLocationPermission, accessFineLocationPermission, recordAudioPermission, settings);
    }
}
