package m60;

import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class i implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q90.c f74519a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74520b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.NavigationConfigureTabs$handleSync$1", f = "NavigationConfigureTabs.kt", l = {60}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f74521d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74521d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Q90.c cVar = i.this.f74519a;
                this.f74521d = 1;
                if (cVar.t(null, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public i(@NotNull Q90.c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74519a = featureToggles;
        this.f74520b = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "configure_tabs";
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
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        JSONObject jSONObject = new JSONObject(parameterJson);
        jSONObject.put("source", AppConfig.f97035NB);
        S90.c cVar = S90.c.MOB_TABS_CONFIGURATION;
        this.f74519a.w(U.i(new Pair(cVar, new S90.a(cVar, new FeatureValue(true, null, null, null, jSONObject, null, 46, null)))));
        this.f74520b.s0(jSONObject.toString());
        C10727i.d(kotlin.coroutines.g.f71771a, new a(null));
        NativeResult.Success.INSTANCE.getClass();
        return NativeResult.Success.DEFAULT;
    }
}
