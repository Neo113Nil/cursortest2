package ud0;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ud0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10042b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f100663a;

    public C10042b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f100663a = application;
    }

    @NotNull
    public final EnumC10041a a(Network network) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.a.getSystemService(this.f100663a, ConnectivityManager.class);
        if (connectivityManager == null) {
            return EnumC10041a.Unknown;
        }
        NetworkInfo networkInfo = network != null ? connectivityManager.getNetworkInfo(network) : connectivityManager.getActiveNetworkInfo();
        if (networkInfo == null) {
            return EnumC10041a.Unknown;
        }
        if (!networkInfo.isConnected()) {
            return EnumC10041a.NoInternet;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? EnumC10041a.Unknown : EnumC10041a.WiFi;
        }
        switch (networkInfo.getSubtype()) {
        }
        return EnumC10041a.Unknown;
    }
}
