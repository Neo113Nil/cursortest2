package n60;

import U50.d;
import U50.j;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.network.GetNetworkTypeData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: n60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8447a implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f76555a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f76556b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f76557c;

    public C8447a(@NotNull Context context, @NotNull InterfaceC9218a fintechPermissionManager, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f76555a = context;
        this.f76556b = fintechPermissionManager;
        this.f76557c = moshi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[Catch: Exception -> 0x00e3, TryCatch #2 {Exception -> 0x00e3, blocks: (B:6:0x0013, B:10:0x0048, B:12:0x004e, B:15:0x0059, B:18:0x0068, B:20:0x0070, B:22:0x0076, B:23:0x007a, B:26:0x008c, B:30:0x0089, B:32:0x0094, B:34:0x009c, B:36:0x00a2, B:37:0x00a6, B:40:0x00c9, B:44:0x00c6, B:45:0x00cf, B:47:0x001e, B:50:0x0025, B:53:0x002f, B:55:0x0035, B:57:0x003f, B:60:0x00d9, B:39:0x00bc, B:25:0x007f), top: B:4:0x0011, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: Exception -> 0x00e3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e3, blocks: (B:6:0x0013, B:10:0x0048, B:12:0x004e, B:15:0x0059, B:18:0x0068, B:20:0x0070, B:22:0x0076, B:23:0x007a, B:26:0x008c, B:30:0x0089, B:32:0x0094, B:34:0x009c, B:36:0x00a2, B:37:0x00a6, B:40:0x00c9, B:44:0x00c6, B:45:0x00cf, B:47:0x001e, B:50:0x0025, B:53:0x002f, B:55:0x0035, B:57:0x003f, B:60:0x00d9, B:39:0x00bc, B:25:0x007f), top: B:4:0x0011, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NativeResult a() {
        NetworkCapabilities networkCapabilities;
        String str;
        NetworkCapabilities networkCapabilities2;
        Context context = this.f76555a;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        try {
        } catch (Exception unused) {
            return new NativeResult.Error("Exception while get network info", NativeResult.Error.a.SDK_ERROR);
        }
        if (connectivityManager == null) {
            return new NativeResult.Error("There is no instance of ConnectivityManager", NativeResult.Error.a.IS_NOT_AVAILABLE);
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            if (networkCapabilities.hasTransport(1)) {
                str = "Wi-Fi";
            } else {
                if (networkCapabilities.hasTransport(0)) {
                    boolean z11 = context.getSystemService("phone") instanceof TelephonyManager;
                } else if (networkCapabilities.hasTransport(3)) {
                    str = "Ethernet";
                }
                str = null;
            }
            if (!Intrinsics.d(str, "No connection")) {
                return new NativeResult.Error("No network connection", NativeResult.Error.a.IS_NOT_AVAILABLE);
            }
            boolean d11 = Intrinsics.d(str, "Unknown mobile network");
            Moshi moshi = this.f76557c;
            String str2 = "";
            if (d11) {
                Network activeNetwork2 = connectivityManager.getActiveNetwork();
                networkCapabilities2 = activeNetwork2 != null ? connectivityManager.getNetworkCapabilities(activeNetwork2) : null;
                try {
                    str2 = moshi.c(GetNetworkTypeData.class).toJson(new GetNetworkTypeData(networkCapabilities2 != null ? networkCapabilities2.hasTransport(4) : false, "Cellular()"));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return new NativeResult.Success(str2);
            }
            if (str == null) {
                return new NativeResult.Error("Unknown connection or no permissions", NativeResult.Error.a.IS_NOT_AVAILABLE);
            }
            Network activeNetwork3 = connectivityManager.getActiveNetwork();
            networkCapabilities2 = activeNetwork3 != null ? connectivityManager.getNetworkCapabilities(activeNetwork3) : null;
            try {
                str2 = moshi.c(GetNetworkTypeData.class).toJson(new GetNetworkTypeData(networkCapabilities2 != null ? networkCapabilities2.hasTransport(4) : false, "Cellular(" + str + ")"));
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            return new NativeResult.Success(str2);
            return new NativeResult.Error("Exception while get network info", NativeResult.Error.a.SDK_ERROR);
        }
        str = "No connection";
        if (!Intrinsics.d(str, "No connection")) {
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_type";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(a());
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return a();
    }
}
