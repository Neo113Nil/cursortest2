package k60;

import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayDeviceInfo;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class s implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f70995a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f70996b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f70997c;

    public s(@NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC9791a mirPayWalletManager) {
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f70995a = mirPayWalletManager;
        this.f70996b = moshi;
        this.f70997c = fintechAnalyticInteractor;
    }

    public static Unit a(s sVar, String str, U50.j jVar, sa0.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        L80.a.b("MirPayGetDeviceInfoBridgeInterface", status.name());
        NativeResult.Error.a aVar = NativeResult.Error.a.SDK_ERROR;
        String b11 = Nk.a.b("Ошибка установки соединения с SDK Mir Pay. Статус: ", status.name());
        sVar.f70997c.D0(str, b11, aVar.name());
        jVar.invoke(new NativeResult.Error(b11, aVar));
        return Unit.f71690a;
    }

    public static Unit b(s sVar, String str, U50.j jVar) {
        String str2;
        try {
            sa0.e g10 = sVar.f70995a.g();
            try {
                str2 = sVar.f70996b.c(MirPayDeviceInfo.class).toJson(new MirPayDeviceInfo(g10.a(), g10.b()));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str2 = "";
            }
            sVar.f70997c.O0(str, g10.a(), g10.b());
            jVar.invoke(new NativeResult.Success(str2));
        } catch (MirPayWalletException e11) {
            L80.a.c("MirPayGetDeviceInfoBridgeInterface", null, e11);
            L80.a.g(e11);
            NativeResult.Error.a aVar = NativeResult.Error.a.IS_NOT_AVAILABLE;
            String c11 = Sh.b.c("Ошибка при получении инофрмации о устройстве, ", e11.getType().name(), " ", e11.getMessage());
            sVar.f70997c.D0(str, c11, aVar.name());
            jVar.invoke(new NativeResult.Error(c11, aVar));
        }
        return Unit.f71690a;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_device_info";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String string = new JSONObject(parameterJson).getString("bank_id");
        if (string == null || string.length() == 0) {
            ((U50.j) callback).invoke(new NativeResult.Error("Ошибка парсинга Json'а", null, 2, null));
        } else {
            final U50.j jVar = (U50.j) callback;
            va0.b.a(this.f70995a, string, new Function0() { // from class: k60.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.b(s.this, string, jVar);
                }
            }, new Function1() { // from class: k60.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.a(s.this, string, jVar, (sa0.d) obj);
                }
            });
        }
    }
}
