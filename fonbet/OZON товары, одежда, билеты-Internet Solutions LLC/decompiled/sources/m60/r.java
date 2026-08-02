package m60;

import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class r implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f74575a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull Moshi moshi, @NotNull Function1<? super String, Unit> pageLoaded) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(pageLoaded, "pageLoaded");
        this.f74575a = pageLoaded;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "page_loaded";
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
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            String string = new JSONObject(parameterJson).getString(ImagesContract.URL);
            Function1<String, Unit> function1 = this.f74575a;
            Intrinsics.f(string);
            function1.invoke(string);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            L80.a.c("NavigationPageLoaded", null, e11);
            return new NativeResult.Error("error while handling page loaded", null, 2, null);
        }
    }
}
