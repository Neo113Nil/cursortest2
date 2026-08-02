package xd0;

import Vb0.b;
import android.app.Application;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10708a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f105372a;

    /* renamed from: xd0.a$a, reason: collision with other inner class name */
    private static final class C2279a extends RuntimeException {
        public C2279a() {
            super("TelephonyManager system service is null");
        }
    }

    public C10708a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f105372a = application;
    }

    public final String a() {
        TelephonyManager telephonyManager = (TelephonyManager) androidx.core.content.a.getSystemService(this.f105372a, TelephonyManager.class);
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        b.a.c(b.f28514a, new C2279a());
        return null;
    }

    public final Boolean b() {
        TelephonyManager telephonyManager = (TelephonyManager) androidx.core.content.a.getSystemService(this.f105372a, TelephonyManager.class);
        if (telephonyManager != null) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        b.a.c(b.f28514a, new C2279a());
        return null;
    }
}
