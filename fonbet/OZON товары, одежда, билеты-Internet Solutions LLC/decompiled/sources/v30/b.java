package v30;

import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f101998a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9633b f101999b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9632a f102000c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final s90.g f102001d;

    public b(@NotNull InterfaceC9218a fintechPermissionManager, @NotNull C9633b accessFineLocationPermission, @NotNull C9632a accessCoarseLocationPermission, @NotNull s90.g readExternalStoragePermission) {
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        Intrinsics.checkNotNullParameter(readExternalStoragePermission, "readExternalStoragePermission");
        this.f101998a = fintechPermissionManager;
        this.f101999b = accessFineLocationPermission;
        this.f102000c = accessCoarseLocationPermission;
        this.f102001d = readExternalStoragePermission;
    }

    public final boolean a(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101999b.getClass();
        return this.f101998a.b(activity, "android.permission.ACCESS_FINE_LOCATION", true) == InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED;
    }

    public final boolean b(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!a(activity)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f102000c.getClass();
        return this.f101998a.b(activity, "android.permission.ACCESS_COARSE_LOCATION", true) == InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED;
    }

    public final boolean c(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f102001d.getClass();
        return this.f101998a.b(activity, "android.permission.READ_EXTERNAL_STORAGE", true) == InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED;
    }
}
