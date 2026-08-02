package m60;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class y implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f74605a;

    public y(@NotNull S80.b navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f74605a = navigation;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "share_plain_text";
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
            String string = new JSONObject(parameterJson).getString("text");
            S80.b bVar = this.f74605a;
            Intrinsics.f(string);
            bVar.R(string);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            L80.a.c("NavigationSharePlainText", null, e11);
            return new NativeResult.Error("error while sharing", null, 2, null);
        }
    }
}
