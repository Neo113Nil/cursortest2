package w30;

import Ae.O0;
import Ae.x0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f103548a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B30.a f103549b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h90.f f103550c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9635d f103551d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9634c f103552e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final s90.f f103553f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C9632a f103554g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C9633b f103555h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<a> f103556i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f103557a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f103558b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f103559c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f103560d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f103561e;

        public a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f103557a = z11;
            this.f103558b = z12;
            this.f103559c = z13;
            this.f103560d = z14;
            this.f103561e = z15;
        }

        public final boolean a() {
            return this.f103558b;
        }

        public final boolean b() {
            return this.f103560d;
        }

        public final boolean c() {
            return this.f103561e;
        }

        public final boolean d() {
            return this.f103557a;
        }

        public final boolean e() {
            return this.f103559c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103557a == aVar.f103557a && this.f103558b == aVar.f103558b && this.f103559c == aVar.f103559c && this.f103560d == aVar.f103560d && this.f103561e == aVar.f103561e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103561e) + C3532b.a(C3532b.a(C3532b.a(Boolean.hashCode(this.f103557a) * 31, 31, this.f103558b), 31, this.f103559c), 31, this.f103560d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PermissionsInfo(isReadContactsGranted=");
            sb2.append(this.f103557a);
            sb2.append(", isAccessLocationGranted=");
            sb2.append(this.f103558b);
            sb2.append(", isUseBiometricGranted=");
            sb2.append(this.f103559c);
            sb2.append(", isCameraGranted=");
            sb2.append(this.f103560d);
            sb2.append(", isNotificationEnabled=");
            return Pk0.a.a(")", sb2, this.f103561e);
        }
    }

    public r(@NotNull InterfaceC9218a fintechPermissionManager, @NotNull B30.a biometricAuthManager, @NotNull h90.f notificationInteractor, @NotNull C9635d notificationsPermission, @NotNull C9634c cameraPermission, @NotNull s90.f readContactsPermission, @NotNull C9632a accessCoarseLocationPermission, @NotNull C9633b accessFineLocationPermission) {
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(notificationsPermission, "notificationsPermission");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(readContactsPermission, "readContactsPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        this.f103548a = fintechPermissionManager;
        this.f103549b = biometricAuthManager;
        this.f103550c = notificationInteractor;
        this.f103551d = notificationsPermission;
        this.f103552e = cameraPermission;
        this.f103553f = readContactsPermission;
        this.f103554g = accessCoarseLocationPermission;
        this.f103555h = accessFineLocationPermission;
        this.f103556i = O0.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull androidx.fragment.app.r activity) {
        boolean z11;
        InterfaceC9218a.EnumC1415a enumC1415a;
        boolean z12;
        boolean z13;
        h90.f fVar;
        boolean z14;
        Intrinsics.checkNotNullParameter(activity, "activity");
        x0<a> x0Var = this.f103556i;
        boolean b11 = this.f103549b.b();
        this.f103553f.getClass();
        InterfaceC9218a interfaceC9218a = this.f103548a;
        boolean z15 = true;
        InterfaceC9218a.EnumC1415a b12 = interfaceC9218a.b(activity, "android.permission.READ_CONTACTS", true);
        InterfaceC9218a.EnumC1415a enumC1415a2 = InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED;
        boolean z16 = false;
        if (b12 == enumC1415a2) {
            z11 = true;
        } else {
            z11 = true;
            z15 = false;
        }
        this.f103555h.getClass();
        if (interfaceC9218a.b(activity, "android.permission.ACCESS_FINE_LOCATION", z11) == enumC1415a2) {
            this.f103554g.getClass();
            if (interfaceC9218a.b(activity, "android.permission.ACCESS_COARSE_LOCATION", z11) == enumC1415a2) {
                enumC1415a = enumC1415a2;
                z12 = z11;
                this.f103552e.getClass();
                if (interfaceC9218a.b(activity, "android.permission.CAMERA", z11) != enumC1415a) {
                    z13 = false;
                    z16 = z11;
                } else {
                    z13 = false;
                }
                if (this.f103551d.e() || interfaceC9218a.b(activity, "android.permission.POST_NOTIFICATIONS", z11) == enumC1415a) {
                    fVar = this.f103550c;
                    if (fVar.d() && fVar.a()) {
                        z14 = z11;
                        x0Var.setValue(new a(z15, z12, b11, z16, z14));
                    }
                }
                z14 = z13;
                x0Var.setValue(new a(z15, z12, b11, z16, z14));
            }
        }
        enumC1415a = enumC1415a2;
        z12 = false;
        this.f103552e.getClass();
        if (interfaceC9218a.b(activity, "android.permission.CAMERA", z11) != enumC1415a) {
        }
        if (this.f103551d.e()) {
        }
        fVar = this.f103550c;
        if (fVar.d()) {
            z14 = z11;
            x0Var.setValue(new a(z15, z12, b11, z16, z14));
        }
        z14 = z13;
        x0Var.setValue(new a(z15, z12, b11, z16, z14));
    }

    @NotNull
    public final x0<a> b() {
        return this.f103556i;
    }
}
