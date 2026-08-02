package m60;

import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: m60.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8094B implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f74499a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74500b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f74501c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f74502d;

    /* JADX WARN: Multi-variable type inference failed */
    public C8094B(@NotNull Function1<? super Boolean, Unit> tabsVisibilityCallback, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0, Function0<String> function02) {
        Intrinsics.checkNotNullParameter(tabsVisibilityCallback, "tabsVisibilityCallback");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74499a = tabsVisibilityCallback;
        this.f74500b = fintechAnalyticInteractor;
        this.f74501c = function0;
        this.f74502d = function02;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "tab_bar_visibility";
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
        InterfaceC6618a interfaceC6618a = this.f74500b;
        Function0<String> function0 = this.f74501c;
        Function0<String> function02 = this.f74502d;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            boolean z11 = new JSONObject(parameterJson).getBoolean(FormPageDTO.Field.FIELD_TYPE_HIDDEN);
            this.f74499a.invoke(Boolean.valueOf(z11));
            interfaceC6618a.u0(function02 != null ? function02.invoke() : null, function0.invoke(), Boolean.valueOf(z11), true);
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            String str = "Ошибка при скрытии табов e=" + e11;
            interfaceC6618a.u0(function02 != null ? function02.invoke() : null, function0.invoke(), null, false);
            return new NativeResult.Error(str, null, 2, null);
        }
    }
}
