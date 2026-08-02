package m60;

import com.squareup.moshi.Moshi;
import fd.InterfaceC6511n;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.GoTabData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AppConfigTab;

/* loaded from: classes3.dex */
public final class m implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f74531a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<String, String, Boolean, Unit> f74532b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f74533c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Q90.c f74534d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74535e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0<String> f74536f;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Moshi moshi, @NotNull InterfaceC6511n<? super String, ? super String, ? super Boolean, Unit> goTab, @NotNull S80.b fintechNavigation, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(goTab, "goTab");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74531a = moshi;
        this.f74532b = goTab;
        this.f74533c = fintechNavigation;
        this.f74534d = featureToggles;
        this.f74535e = fintechAnalyticInteractor;
        this.f74536f = function0;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "go_tab";
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
        int i11;
        List<AppConfigTab> tabs;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            GoTabData goTabData = (GoTabData) H30.q.a(this.f74531a, parameterJson, GoTabData.class);
            AppConfig n11 = this.f74534d.n();
            if (n11 != null && (tabs = n11.getTabs()) != null) {
                Iterator<AppConfigTab> it = tabs.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.d(it.next().getId(), goTabData != null ? goTabData.getTabId() : null)) {
                        break;
                    }
                    i11++;
                }
            }
            i11 = -1;
            InterfaceC6618a interfaceC6618a = this.f74535e;
            Function0<String> function0 = this.f74536f;
            interfaceC6618a.f0(function0 != null ? function0.invoke() : null, goTabData != null ? goTabData.getLoadUrl() : null, goTabData != null ? goTabData.getTabId() : null, i11 != -1);
            this.f74532b.invoke(goTabData != null ? goTabData.getTabId() : null, goTabData != null ? goTabData.getLoadUrl() : null, goTabData != null ? goTabData.getReplace() : null);
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            L80.a.c("NavigationGoTab", null, e11);
            return new NativeResult.Error("error go tab e=" + e11, null, 2, null);
        }
    }
}
