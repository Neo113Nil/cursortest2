package x60;

import H30.q;
import U50.j;
import android.app.Activity;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.models.SecureRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class h implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f105069a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<String> f105070b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<Integer> f105071c;

    public h(@NotNull Moshi moshi, Function0<String> function0, Function0<Integer> function02) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f105069a = moshi;
        this.f105070b = function0;
        this.f105071c = function02;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "screen";
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
        NativeResult.Success success;
        Integer invoke;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        SecureRequest secureRequest = (SecureRequest) q.a(this.f105069a, parameterJson, SecureRequest.class);
        Object context = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getContext();
        Object obj = context instanceof Activity ? (Activity) context : null;
        I30.e eVar = obj instanceof I30.e ? (I30.e) obj : null;
        if (eVar == null || secureRequest == null) {
            return new NativeResult.Error("Can't set secure flag for request=" + secureRequest + " activity=" + obj, NativeResult.Error.a.SDK_ERROR);
        }
        boolean secured = secureRequest.getSecured();
        Function0<String> function0 = this.f105070b;
        if (function0 == null || (str = function0.invoke()) == null) {
            str = "";
        }
        Function0<Integer> function02 = this.f105071c;
        eVar.l((function02 == null || (invoke = function02.invoke()) == null) ? 0 : invoke.intValue(), str, secured);
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        return success;
    }
}
