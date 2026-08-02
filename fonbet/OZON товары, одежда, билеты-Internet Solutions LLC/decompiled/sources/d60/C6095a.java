package d60;

import U50.j;
import androidx.fragment.app.r;
import b40.InterfaceC5539a;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.esia.api.EsiaLoginData;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: d60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6095a extends V50.b<EsiaLoginData> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC5539a f61206b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f61207c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f61208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6095a(@NotNull InterfaceC5539a esiaApi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f61206b = esiaApi;
        this.f61207c = fintechAnalyticInteractor;
        this.f61208d = "auth";
    }

    private final NativeResult e(WeakReference<FintechWebView> weakReference, EsiaLoginData esiaLoginData) {
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        NativeResult.Success success;
        InterfaceC5539a interfaceC5539a = this.f61206b;
        this.f61207c.v0(interfaceC5539a.isAvailable());
        if (!interfaceC5539a.isAvailable()) {
            return new NativeResult.Error("esiaApi.isAvailable() = false", NativeResult.Error.a.IS_NOT_AVAILABLE);
        }
        if (weakReference != null && (fintechWebView = weakReference.get()) != null && (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) != null) {
            interfaceC5539a.login(parentFragmentActivity, esiaLoginData);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            if (success != null) {
                return success;
            }
        }
        return new NativeResult.Error("weakWebViewRef.get()?.getParentFragmentActivity() = null", NativeResult.Error.a.SDK_ERROR);
    }

    @Override // V50.b
    @NotNull
    public final Class<EsiaLoginData> a() {
        return EsiaLoginData.class;
    }

    @Override // V50.b
    public final void c(WeakReference weakReference, Object obj, j callback) {
        EsiaLoginData value = (EsiaLoginData) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(weakReference, value);
    }

    @Override // V50.b
    public final NativeResult d(WeakReference weakReference, EsiaLoginData esiaLoginData, String parameterJson) {
        EsiaLoginData value = esiaLoginData;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return e(weakReference, value);
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f61208d;
    }
}
