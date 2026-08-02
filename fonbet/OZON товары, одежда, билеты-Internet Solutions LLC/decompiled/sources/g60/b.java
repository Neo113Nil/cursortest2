package g60;

import U50.j;
import android.annotation.SuppressLint;
import android.location.Location;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.geolocation.LocationRequestData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import t90.AbstractC9782b;

/* loaded from: classes3.dex */
public final class b implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f63927a;

    /* renamed from: b, reason: collision with root package name */
    private final f f63928b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final K80.b f63929c;

    public b(@NotNull Moshi moshi, f fVar, @NotNull K80.b locationManager) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f63927a = moshi;
        this.f63928b = fVar;
        this.f63929c = locationManager;
    }

    public static void a(j jVar, b bVar, Location location) {
        String str;
        Intrinsics.checkNotNullParameter(location, "location");
        Moshi moshi = bVar.f63927a;
        try {
            str = moshi.c(LocationRequestData.class).toJson(new LocationRequestData(location.getLatitude(), location.getLongitude()));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        jVar.invoke(new NativeResult.Success(str));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_current_location";
    }

    @Override // U50.a
    @SuppressLint({"MissingPermission"})
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        Moshi moshi = this.f63927a;
        String str = "";
        if (parentFragmentActivity == null) {
            try {
                str = moshi.c(LocationRequestData.class).toJson(new LocationRequestData(0.0d, 0.0d));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            ((j) callback).invoke(new NativeResult.Success(str));
            L80.a.a("GetCurrentLocation", "weakWebViewRef.get()?.getParentFragmentActivity() = null");
            return;
        }
        f fVar = this.f63928b;
        if ((fVar != null ? fVar.i(parentFragmentActivity) : null) instanceof AbstractC9782b.a) {
            this.f63929c.b(parentFragmentActivity, new NC.c((j) callback, this));
            return;
        }
        try {
            str = moshi.c(LocationRequestData.class).toJson(new LocationRequestData(0.0d, 0.0d));
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        ((j) callback).invoke(new NativeResult.Success(str));
    }
}
