package m60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.settings.models.AppConfig;

/* loaded from: classes3.dex */
public final class k implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f74525a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f74526b;

    public k(@NotNull Moshi moshi, @NotNull Q90.c featureToggles) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f74525a = moshi;
        this.f74526b = featureToggles;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_tabs";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        AppConfig n11 = this.f74526b.n();
        if (n11 == null) {
            return new NativeResult.Error("curAppConfig is NULL", null, 2, null);
        }
        try {
            str = this.f74525a.c(AppConfig.class).toJson(n11);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return new NativeResult.Success(str);
    }
}
