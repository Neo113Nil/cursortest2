package m60;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import androidx.lifecycle.K;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o40.InterfaceC8640a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.RunSoftUpdateData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* loaded from: classes3.dex */
public final class w implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f74586a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f74587b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC8640a f74588c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Pair<String, String>> f74589d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74590e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f74591f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.NavigationRunSoftUpdate$handle$2", f = "NavigationRunSoftUpdate.kt", l = {76}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f74592d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.r f74594f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ U50.j f74595g;

        /* renamed from: m60.w$a$a, reason: collision with other inner class name */
        static final class C1259a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ U50.j f74596a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f74597b;

            C1259a(U50.j jVar, w wVar) {
                this.f74596a = jVar;
                this.f74597b = wVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                String lowerCase;
                String str;
                if (((Boolean) obj).booleanValue()) {
                    lowerCase = "SOFT_UPDATE_HAPPENED".toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "UPDATE_NOT_NEEDED".toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                Moshi moshi = this.f74597b.f74586a;
                try {
                    str = moshi.c(RunSoftUpdateData.class).toJson(new RunSoftUpdateData(lowerCase));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    str = "";
                }
                this.f74596a.invoke(new NativeResult.Success(str));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.fragment.app.r rVar, U50.j jVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f74594f = rVar;
            this.f74595g = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w.this.new a(this.f74594f, this.f74595g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74592d;
            if (i11 == 0) {
                Sc.s.b(obj);
                w wVar = w.this;
                InterfaceC2395h<Boolean> b11 = wVar.f74588c.b(this.f74594f, false);
                C1259a c1259a = new C1259a(this.f74595g, wVar);
                this.f74592d = 1;
                if (((AbstractC2635g) b11).collect(c1259a, this) == aVar) {
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

    public w(@NotNull Moshi moshi, @NotNull Q90.c featureToggles, @NotNull InterfaceC8640a forceUpdateInteractor, @NotNull Function0<Pair<String, String>> tabInfoCallback, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(tabInfoCallback, "tabInfoCallback");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74586a = moshi;
        this.f74587b = featureToggles;
        this.f74588c = forceUpdateInteractor;
        this.f74589d = tabInfoCallback;
        this.f74590e = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "run_soft_update";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        B0 b02;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean f7 = Tl.a.f(this.f74587b, S90.c.MOB_APP_SHOW_REQUIRED_VERSION);
        Moshi moshi = this.f74586a;
        InterfaceC6618a interfaceC6618a = this.f74590e;
        String str = "";
        if (!f7) {
            interfaceC6618a.T1("NONE", "Feature toggle MOB_APP_SHOW_REQUIRED_VERSION disable", false);
            String lowerCase = "UPDATE_NOT_NEEDED".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            try {
                str = moshi.c(RunSoftUpdateData.class).toJson(new RunSoftUpdateData(lowerCase));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            ((U50.j) callback).invoke(new NativeResult.Error(str, null, 2, null));
            return;
        }
        androidx.fragment.app.r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        if (parentFragmentActivity == null) {
            String lowerCase2 = "UPDATE_NOT_NEEDED".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            try {
                str = moshi.c(RunSoftUpdateData.class).toJson(new RunSoftUpdateData(lowerCase2));
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            ((U50.j) callback).invoke(new NativeResult.Success(str));
            return;
        }
        B0 b03 = this.f74591f;
        if (b03 != null && ((AbstractC10711a) b03).isActive() && (b02 = this.f74591f) != null) {
            ((H0) b02).j(null);
        }
        Pair<String, String> invoke = this.f74589d.invoke();
        interfaceC6618a.L0(invoke.e(), invoke.f());
        this.f74591f = C10727i.c(K.a(parentFragmentActivity), null, null, new a(parentFragmentActivity, (U50.j) callback, null), 3);
    }
}
