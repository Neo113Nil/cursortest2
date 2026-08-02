package d60;

import U50.d;
import U50.j;
import android.content.Context;
import android.content.pm.PackageManager;
import b40.InterfaceC5539a;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.esia.EsiaAvailableResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class c implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f61210a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC5539a f61211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f61212c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f61213d;

    public c(@NotNull Context context, @NotNull InterfaceC5539a esiaApi, @NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f61210a = context;
        this.f61211b = esiaApi;
        this.f61212c = moshi;
        this.f61213d = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_available";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        String str;
        PackageManager packageManager;
        String str2;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        boolean z11 = false;
        if (this.f61211b.isAvailable() && (packageManager = this.f61210a.getPackageManager()) != null) {
            try {
                str2 = packageManager.getApplicationInfo("ru.rostel", 0).packageName;
            } catch (Exception e11) {
                L80.a.c("EsiaIsAvailableBridgeInterface", "ru.rostel не найдено", e11);
                str2 = null;
            }
            if (str2 != null) {
                z11 = true;
            }
        }
        this.f61213d.R1(z11);
        try {
            str = this.f61212c.c(EsiaAvailableResult.class).toJson(new EsiaAvailableResult(z11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return new NativeResult.Success(str);
    }
}
