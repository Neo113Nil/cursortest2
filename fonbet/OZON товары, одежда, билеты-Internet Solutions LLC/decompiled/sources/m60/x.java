package m60;

import I30.f;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.NavigationSetTabBadgeData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class x implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f74598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final R30.a f74599b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74600c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f74601d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.NavigationSetTabBadge$setTabBadge$1$1", f = "NavigationSetTabBadge.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.r f74602d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ NavigationSetTabBadgeData f74603e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f74604f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.fragment.app.r rVar, NavigationSetTabBadgeData navigationSetTabBadgeData, x xVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f74602d = rVar;
            this.f74603e = navigationSetTabBadgeData;
            this.f74604f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f74602d, this.f74603e, this.f74604f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String upperCase;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            I30.f fVar = (I30.f) this.f74602d;
            NavigationSetTabBadgeData navigationSetTabBadgeData = this.f74603e;
            boolean enabled = navigationSetTabBadgeData.getEnabled();
            String tab = navigationSetTabBadgeData.getTab();
            String color = navigationSetTabBadgeData.getColor();
            String text = navigationSetTabBadgeData.getText();
            if (text == null) {
                text = "";
                str = text;
            } else {
                str = "";
            }
            String iconUrl = navigationSetTabBadgeData.getIconUrl();
            String str2 = str;
            String iconBackgroundUrl = navigationSetTabBadgeData.getIconBackgroundUrl();
            String animationType = navigationSetTabBadgeData.getAnimationType();
            this.f74604f.getClass();
            f.a aVar2 = null;
            if (animationType != null) {
                try {
                    upperCase = animationType.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } catch (Exception unused) {
                }
            } else {
                upperCase = null;
            }
            if (upperCase == null) {
                upperCase = str2;
            }
            aVar2 = f.a.valueOf(upperCase);
            fVar.k(enabled, tab, color, text, iconUrl, iconBackgroundUrl, aVar2);
            return Unit.f71690a;
        }
    }

    public x(@NotNull Moshi moshi, @NotNull R30.a appCoroutineScopes, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74598a = moshi;
        this.f74599b = appCoroutineScopes;
        this.f74600c = fintechAnalyticInteractor;
        this.f74601d = function0;
    }

    private final NativeResult a(WeakReference<FintechWebView> weakReference, String str) {
        NativeResult.Success success;
        FintechWebView fintechWebView;
        androidx.fragment.app.r parentFragmentActivity;
        try {
            NavigationSetTabBadgeData navigationSetTabBadgeData = (NavigationSetTabBadgeData) H30.q.a(this.f74598a, str, NavigationSetTabBadgeData.class);
            if (navigationSetTabBadgeData == null) {
                return new NativeResult.Error("error NavigationSetTabBadgeData is null", null, 2, null);
            }
            InterfaceC6618a interfaceC6618a = this.f74600c;
            Function0<String> function0 = this.f74601d;
            interfaceC6618a.X1(function0 != null ? function0.invoke() : null, navigationSetTabBadgeData.getTab(), navigationSetTabBadgeData.getEnabled(), navigationSetTabBadgeData.getColor(), navigationSetTabBadgeData.getText(), navigationSetTabBadgeData.getIconUrl(), navigationSetTabBadgeData.getIconBackgroundUrl(), navigationSetTabBadgeData.getAnimationType());
            if (weakReference != null && (fintechWebView = weakReference.get()) != null && (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) != null) {
                if (!(parentFragmentActivity instanceof I30.f)) {
                    return new NativeResult.Error("error NavigationSetTabBadge", null, 2, null);
                }
                C10727i.c(this.f74599b.c(), null, null, new a(parentFragmentActivity, navigationSetTabBadgeData, this, null), 3);
            }
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            L80.a.c("NavigationSetTabBadge", null, e11);
            return new NativeResult.Error("error NavigationSetTabBadge", null, 2, null);
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "set_tab_badge";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(a(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return a(weakReference, parameterJson);
    }
}
