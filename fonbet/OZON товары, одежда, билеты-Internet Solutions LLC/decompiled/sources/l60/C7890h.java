package l60;

import U50.j;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: l60.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7890h implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Boolean> f72932a;

    /* JADX WARN: Multi-variable type inference failed */
    public C7890h(@NotNull Function1<? super Boolean, Boolean> invokeListener) {
        Intrinsics.checkNotNullParameter(invokeListener, "invokeListener");
        this.f72932a = invokeListener;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "sms_listener";
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
        boolean z11;
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            z11 = new JSONObject(parameterJson).getBoolean("enable");
        } catch (Exception e11) {
            L80.a.c("SmsListenerBridgeInterface", null, e11);
            z11 = false;
        }
        if (!this.f72932a.invoke(Boolean.valueOf(z11)).booleanValue()) {
            return new NativeResult.Error("Error to start listening", null, 2, null);
        }
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        return success;
    }
}
