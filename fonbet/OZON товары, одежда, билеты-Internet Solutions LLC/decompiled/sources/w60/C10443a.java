package w60;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Q90.c;
import Sc.s;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import k40.InterfaceC7480a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* renamed from: w60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10443a implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f103594a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f103595b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7480a f103596c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f103597d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f103598e;

    @e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.review.ReviewBridgeInterface$handle$1", f = "ReviewBridgeInterface.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: w60.a$a, reason: collision with other inner class name */
    static final class C2246a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f103599d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U50.j f103601f;

        /* renamed from: w60.a$a$a, reason: collision with other inner class name */
        static final class C2247a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ U50.j f103602a;

            C2247a(U50.j jVar) {
                this.f103602a = jVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, d dVar) {
                this.f103602a.invoke(new NativeResult.Success(((l40.b) obj).name()));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2246a(U50.j jVar, d dVar) {
            super(2, dVar);
            this.f103601f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C10443a.this.new C2246a(this.f103601f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((C2246a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f103599d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h<l40.b> a11 = C10443a.this.f103596c.a();
                C2247a c2247a = new C2247a(this.f103601f);
                this.f103599d = 1;
                if (((AbstractC2635g) a11).collect(c2247a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C10443a(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull c featureToggles, @NotNull InterfaceC7480a reviewInteractor, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(reviewInteractor, "reviewInteractor");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f103594a = fintechSettings;
        this.f103595b = featureToggles;
        this.f103596c = reviewInteractor;
        this.f103597d = fintechAnalyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "show_rate";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        B0 b02;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B0 b03 = this.f103598e;
        if (b03 != null && ((AbstractC10711a) b03).isActive() && (b02 = this.f103598e) != null) {
            ((H0) b02).j(null);
        }
        this.f103597d.b2();
        r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        if (!Tl.a.f(this.f103595b, S90.c.MOB_SHOW_REVIEW_APP) || this.f103594a.r()) {
            return;
        }
        this.f103598e = parentFragmentActivity != null ? C10727i.c(K.a(parentFragmentActivity), null, null, new C2246a((U50.j) callback, null), 3) : null;
    }
}
