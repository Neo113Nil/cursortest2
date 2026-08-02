package x60;

import U50.j;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: x60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10669a implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v30.d f105043a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f105044b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f105045c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f105046d;

    public C10669a(@NotNull v30.d fintechAntiFraudInteractor, @NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f105043a = fintechAntiFraudInteractor;
        this.f105044b = moshi;
        this.f105045c = fintechAnalyticInteractor;
        this.f105046d = function0;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_device_status";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String c11 = this.f105043a.c();
        Function0<String> function0 = this.f105046d;
        this.f105045c.K0(c11.length(), function0 != null ? function0.invoke() : null);
        try {
            str = this.f105044b.c(String.class).toJson(c11);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        ((j) callback).invoke(new NativeResult.Success(str));
    }
}
