package r90;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;

/* renamed from: r90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9219b implements InterfaceC9218a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f83215a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f83216b;

    public C9219b(@NotNull Context context, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f83215a = context;
        this.f83216b = sharedPreferences;
    }

    @Override // r90.InterfaceC9218a
    public final boolean a(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Context context = this.f83215a;
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (strArr != null) {
            for (String str : strArr) {
                if (Intrinsics.d(str, permission)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // r90.InterfaceC9218a
    @NotNull
    public final InterfaceC9218a.EnumC1415a b(@NotNull Activity activity, @NotNull String permission, boolean z11) {
        String str;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        boolean c11 = c(activity, permission);
        SharedPreferences sharedPreferences = this.f83216b;
        if (c11) {
            if (!z11) {
                sharedPreferences.edit().remove(permission).commit();
            }
            return InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED;
        }
        if (androidx.core.app.b.h(activity, permission)) {
            return InterfaceC9218a.EnumC1415a.NEED_PERMISSION_RATIONALE_REQUEST;
        }
        try {
            str = sharedPreferences.getString(permission, "");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null && str.length() != 0) {
            return InterfaceC9218a.EnumC1415a.NEED_OPEN_SETTINGS;
        }
        if (!z11) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(permission, "rationale_requested");
            edit.apply();
        }
        return InterfaceC9218a.EnumC1415a.NEED_PERMISSION_REQUEST;
    }

    @Override // r90.InterfaceC9218a
    public final boolean c(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return androidx.core.content.a.checkSelfPermission(context, permission) == 0;
    }
}
