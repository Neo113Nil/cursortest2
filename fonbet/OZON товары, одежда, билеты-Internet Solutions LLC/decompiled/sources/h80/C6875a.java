package h80;

import android.content.Context;
import g30.InterfaceC6618a;
import h90.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;
import s90.h;

/* renamed from: h80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6875a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f65080a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f65081b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B30.a f65082c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f65083d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f65084e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9635d f65085f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C9634c f65086g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final s90.f f65087h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C9632a f65088i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C9633b f65089j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f65090k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f65091l;

    public C6875a(@NotNull Context context, @NotNull InterfaceC9218a fintechPermissionManager, @NotNull B30.a biometricAuthManager, @NotNull InterfaceC6618a analyticInteractor, @NotNull f notificationInteractor, @NotNull C9635d notificationsPermission, @NotNull C9634c cameraPermission, @NotNull s90.f readContactsPermission, @NotNull C9632a accessCoarseLocationPermission, @NotNull C9633b accessFineLocationPermission, @NotNull h recordAudioPermission, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
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
        this.f65080a = context;
        this.f65081b = fintechPermissionManager;
        this.f65082c = biometricAuthManager;
        this.f65083d = analyticInteractor;
        this.f65084e = notificationInteractor;
        this.f65085f = notificationsPermission;
        this.f65086g = cameraPermission;
        this.f65087h = readContactsPermission;
        this.f65088i = accessCoarseLocationPermission;
        this.f65089j = accessFineLocationPermission;
        this.f65090k = settings;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        InterfaceC9218a interfaceC9218a;
        boolean z11;
        if (this.f65091l) {
            return;
        }
        boolean q11 = this.f65090k.q();
        boolean e11 = this.f65085f.e();
        Context context = this.f65080a;
        InterfaceC9218a interfaceC9218a2 = this.f65081b;
        boolean z12 = false;
        if (e11 ? interfaceC9218a2.c(context, "android.permission.POST_NOTIFICATIONS") : true) {
            f fVar = this.f65084e;
            if (fVar.d() && fVar.a()) {
                interfaceC9218a = interfaceC9218a2;
                z11 = true;
                this.f65086g.getClass();
                boolean c11 = interfaceC9218a.c(context, "android.permission.CAMERA");
                this.f65088i.getClass();
                if (interfaceC9218a.c(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    this.f65089j.getClass();
                    if (interfaceC9218a.c(context, "android.permission.ACCESS_FINE_LOCATION")) {
                        z12 = true;
                    }
                }
                this.f65087h.getClass();
                this.f65083d.r1(q11, z11, c11, z12, interfaceC9218a.c(context, "android.permission.READ_CONTACTS"), this.f65082c.b());
                this.f65091l = true;
            }
        }
        interfaceC9218a = interfaceC9218a2;
        z11 = false;
        this.f65086g.getClass();
        boolean c112 = interfaceC9218a.c(context, "android.permission.CAMERA");
        this.f65088i.getClass();
        if (interfaceC9218a.c(context, "android.permission.ACCESS_COARSE_LOCATION")) {
        }
        this.f65087h.getClass();
        this.f65083d.r1(q11, z11, c112, z12, interfaceC9218a.c(context, "android.permission.READ_CONTACTS"), this.f65082c.b());
        this.f65091l = true;
    }
}
