package h80;

import Q90.n;
import android.app.Application;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;
import s90.f;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f65092a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f65093b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f65094c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9633b f65095d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9632a f65096e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9634c f65097f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C9635d f65098g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final f f65099h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final B30.a f65100i;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65101a;

        static {
            int[] iArr = new int[InterfaceC9218a.EnumC1415a.values().length];
            try {
                iArr[InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC9218a.EnumC1415a.NEED_PERMISSION_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65101a = iArr;
        }
    }

    public b(@NotNull n fintechUltraManager, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC9218a fintechPermissionManager, @NotNull C9633b accessFineLocationPermission, @NotNull C9632a accessCoarseLocationPermission, @NotNull C9634c cameraPermission, @NotNull C9635d notificationsPermission, @NotNull f readContactsPermission, @NotNull B30.a biometricAuthManager) {
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(notificationsPermission, "notificationsPermission");
        Intrinsics.checkNotNullParameter(readContactsPermission, "readContactsPermission");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        this.f65092a = fintechUltraManager;
        this.f65093b = fintechAnalyticInteractor;
        this.f65094c = fintechPermissionManager;
        this.f65095d = accessFineLocationPermission;
        this.f65096e = accessCoarseLocationPermission;
        this.f65097f = cameraPermission;
        this.f65098g = notificationsPermission;
        this.f65099h = readContactsPermission;
        this.f65100i = biometricAuthManager;
    }

    private static InterfaceC6618a.b.EnumC1034a c(InterfaceC9218a.EnumC1415a enumC1415a) {
        int i11 = a.f65101a[enumC1415a.ordinal()];
        return i11 != 1 ? i11 != 2 ? InterfaceC6618a.b.EnumC1034a.DENIED : InterfaceC6618a.b.EnumC1034a.UNKNOWN : InterfaceC6618a.b.EnumC1034a.ALLOWED;
    }

    private static InterfaceC6618a.b.EnumC1034a d(boolean z11) {
        return z11 ? InterfaceC6618a.b.EnumC1034a.ALLOWED : InterfaceC6618a.b.EnumC1034a.UNKNOWN;
    }

    @NotNull
    public final InterfaceC6618a.b a(@NotNull Application context) {
        boolean z11;
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = this.f65092a;
        boolean i11 = nVar.i();
        boolean d11 = nVar.d();
        this.f65097f.getClass();
        InterfaceC9218a interfaceC9218a = this.f65094c;
        InterfaceC6618a.b.EnumC1034a d12 = d(interfaceC9218a.c(context, "android.permission.CAMERA"));
        this.f65098g.getClass();
        InterfaceC6618a.b.EnumC1034a d13 = d(interfaceC9218a.c(context, "android.permission.POST_NOTIFICATIONS"));
        InterfaceC6618a.b.EnumC1034a d14 = d(interfaceC9218a.c(context, "android.permission.READ_CALL_LOG"));
        this.f65099h.getClass();
        InterfaceC6618a.b.EnumC1034a d15 = d(interfaceC9218a.c(context, "android.permission.READ_CONTACTS"));
        this.f65096e.getClass();
        if (interfaceC9218a.c(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            this.f65095d.getClass();
            if (interfaceC9218a.c(context, "android.permission.ACCESS_FINE_LOCATION")) {
                z11 = true;
                return new InterfaceC6618a.b(i11, d11, d12, d13, d14, d(z11), d15, d(this.f65100i.b()));
            }
        }
        z11 = false;
        return new InterfaceC6618a.b(i11, d11, d12, d13, d14, d(z11), d15, d(this.f65100i.b()));
    }

    public final void b(@NotNull l80.f activity) {
        InterfaceC6618a.b.EnumC1034a enumC1034a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f65097f.getClass();
        InterfaceC9218a interfaceC9218a = this.f65094c;
        InterfaceC9218a.EnumC1415a b11 = interfaceC9218a.b(activity, "android.permission.CAMERA", true);
        this.f65098g.getClass();
        InterfaceC9218a.EnumC1415a b12 = interfaceC9218a.b(activity, "android.permission.POST_NOTIFICATIONS", true);
        InterfaceC9218a.EnumC1415a b13 = interfaceC9218a.b(activity, "android.permission.READ_CALL_LOG", true);
        this.f65096e.getClass();
        InterfaceC9218a.EnumC1415a b14 = interfaceC9218a.b(activity, "android.permission.ACCESS_COARSE_LOCATION", true);
        this.f65095d.getClass();
        InterfaceC9218a.EnumC1415a b15 = interfaceC9218a.b(activity, "android.permission.ACCESS_FINE_LOCATION", true);
        InterfaceC9218a.EnumC1415a enumC1415a = InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED;
        if (b14 == enumC1415a && b15 == enumC1415a) {
            enumC1034a = InterfaceC6618a.b.EnumC1034a.ALLOWED;
        } else {
            InterfaceC9218a.EnumC1415a enumC1415a2 = InterfaceC9218a.EnumC1415a.NEED_PERMISSION_REQUEST;
            enumC1034a = (b14 == enumC1415a2 && b15 == enumC1415a2) ? InterfaceC6618a.b.EnumC1034a.UNKNOWN : InterfaceC6618a.b.EnumC1034a.DENIED;
        }
        InterfaceC6618a.b.EnumC1034a enumC1034a2 = enumC1034a;
        this.f65099h.getClass();
        InterfaceC9218a.EnumC1415a b16 = interfaceC9218a.b(activity, "android.permission.READ_CONTACTS", true);
        n nVar = this.f65092a;
        this.f65093b.B0(new InterfaceC6618a.b(nVar.i(), nVar.d(), c(b11), c(b12), c(b13), enumC1034a2, c(b16), d(this.f65100i.b())));
    }
}
