package m60;

import T60.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class q implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S60.a f74574a;

    public q(@NotNull S60.a fintechMetrixInteractor) {
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        this.f74574a = fintechMetrixInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "page_interactive";
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
            S60.a aVar = this.f74574a;
            long currentTimeMillis = System.currentTimeMillis();
            Intrinsics.f(string);
            aVar.a(new a.h(currentTimeMillis, string));
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            L80.a.c("NavigationPageInteractive", null, e11);
            return new NativeResult.Error("error while handling page loaded", null, 2, null);
        }
    }
}
