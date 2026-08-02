package m60;

import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

/* loaded from: classes3.dex */
public final class l implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74527a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<String> f74528b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.NavigationGoBack$handleSync$1", f = "NavigationGoBack.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ WeakReference<FintechWebView> f74529d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f74530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WeakReference<FintechWebView> weakReference, l lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f74529d = weakReference;
            this.f74530e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f74529d, this.f74530e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FintechWebView fintechWebView;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            WeakReference<FintechWebView> weakReference = this.f74529d;
            if (weakReference != null && (fintechWebView = weakReference.get()) != null) {
                fintechWebView.goBack();
            }
            l lVar = this.f74530e;
            InterfaceC6618a interfaceC6618a = lVar.f74527a;
            Function0 function0 = lVar.f74528b;
            interfaceC6618a.A0(function0 != null ? (String) function0.invoke() : null, true);
            return Unit.f71690a;
        }
    }

    public l(@NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74527a = fintechAnalyticInteractor;
        this.f74528b = function0;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "go_back";
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
        try {
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(N.a(De.s.f6650a), null, null, new a(weakReference, this, null), 3);
        } catch (Exception e11) {
            L80.a.b("NavigationGoBack", "error = " + e11);
            Function0<String> function0 = this.f74528b;
            this.f74527a.A0(function0 != null ? function0.invoke() : null, false);
            new NativeResult.Error("Ошибка при навигации назад", null, 2, null);
        }
        NativeResult.Success.INSTANCE.getClass();
        return NativeResult.Success.DEFAULT;
    }
}
