package ru.ozon.fintech.features.cbottomonboarding.presentation.v1;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import H30.A;
import H30.D;
import H30.o;
import S40.a;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import V40.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.activity.C;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import f3.AbstractC6409a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.dots.WormDotsIndicator;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Keep
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\b\u0007*\u0001V\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Z[B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0005J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J3\u00100\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b4\u0010\u0005R\u001a\u00105\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010#R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010L\u001a\u00020F8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bK\u0010=\u001a\u0004\bL\u0010JR\u001a\u0010N\u001a\u00020M8\u0016X\u0096D¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010HR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006\\"}, d2 = {"Lru/ozon/fintech/features/cbottomonboarding/presentation/v1/OnboardingSlidesFragment;", "LE30/b;", "Lw40/a;", "LV40/b$a;", "<init>", "()V", "LV40/b;", "provideOnboardingInteractor", "()LV40/b;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "goNext", "onPause", "onResume", "", "provideId", "()Ljava/lang/String;", "onDestroy", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "parameterJson", "Landroid/os/Parcelable;", "parameterParcelable", "", "version", "uuid", "updateState", "(Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/String;)V", "action", "(Ljava/lang/String;)V", "doOpenAnimation", "fragmentName", "Ljava/lang/String;", "getFragmentName", "LS40/a;", "binding", "LS40/a;", "LZ40/e;", "viewModel$delegate", "LSc/j;", "getViewModel", "()LZ40/e;", "viewModel", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "", "lightStatusBar", "Z", "getLightStatusBar", "()Z", "isStandaloneIntegration$delegate", "isStandaloneIntegration", "", "dimAmount", "F", "getDimAmount", "()F", "", "animDuration", "J", "touched", "ru/ozon/fintech/features/cbottomonboarding/presentation/v1/OnboardingSlidesFragment$i", "pageListener", "Lru/ozon/fintech/features/cbottomonboarding/presentation/v1/OnboardingSlidesFragment$i;", "Companion", "a", "b", "cbottom-onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingSlidesFragment extends E30.b implements InterfaceC10428a, b.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final int MINIMUM_COUNT_PAGE = 1;

    @NotNull
    private static final String TAG = "OnboardingSlidesFragment";
    private final long animDuration;
    private a binding;
    private final float dimAmount;

    @NotNull
    private final String fragmentName = TAG;

    /* renamed from: isStandaloneIntegration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isStandaloneIntegration;
    private final boolean lightStatusBar;

    @NotNull
    private final C onBackPressedCallback;

    @NotNull
    private final i pageListener;
    private boolean touched;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static Bundle a(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return androidx.core.os.d.b(new Pair("PARAMETER_JSON", str), new Pair("PARAMETER_PARCELABLE", parcelable), new Pair("PARAMETER_VERSION", Integer.valueOf(i11)), new Pair("PARAMETER_UUID", uuid));
        }
    }

    public final class b extends Z4.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Y40.c f95109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull OnboardingSlidesFragment onboardingSlidesFragment, Y40.c onboardingUI) {
            super(onboardingSlidesFragment.getChildFragmentManager(), onboardingSlidesFragment.getLifecycle());
            Intrinsics.checkNotNullParameter(onboardingUI, "onboardingUI");
            this.f95109a = onboardingUI;
        }

        @Override // Z4.a
        @NotNull
        public final ComponentCallbacksC5392m createFragment(int i11) {
            if (((Y40.b) C7714v.Q(i11, this.f95109a.a())) == null) {
                throw new Exception("Not found");
            }
            Z40.b bVar = new Z40.b();
            bVar.setArguments(androidx.core.os.d.b(new Pair("FRAME_POS", Integer.valueOf(i11))));
            return bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public final int getShimmersCount() {
            return ((ArrayList) this.f95109a.a()).size();
        }
    }

    public static final class c extends C {
        c() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            Function0<Unit> function0 = OnboardingSlidesFragment.this.getViewModel().k0().f28087f;
            if (function0 != null) {
                function0.invoke();
            } else {
                Intrinsics.n("endDismissListener");
                throw null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$onViewCreated$$inlined$observe$1", f = "OnboardingSlidesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95111d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95112e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95114g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesFragment f95115h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$onViewCreated$$inlined$observe$1$1", f = "OnboardingSlidesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95116d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95117e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesFragment f95118f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2002a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesFragment f95119a;

                public C2002a(OnboardingSlidesFragment onboardingSlidesFragment) {
                    this.f95119a = onboardingSlidesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int intValue = ((Number) t2).intValue();
                    S40.a aVar = this.f95119a.binding;
                    if (aVar != null) {
                        D.d(aVar.f25770d, intValue);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesFragment onboardingSlidesFragment) {
                super(2, dVar);
                this.f95117e = c02;
                this.f95118f = onboardingSlidesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95117e, dVar, this.f95118f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95116d;
                if (i11 == 0) {
                    s.b(obj);
                    C2002a c2002a = new C2002a(this.f95118f);
                    this.f95116d = 1;
                    if (this.f95117e.collect(c2002a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesFragment onboardingSlidesFragment) {
            super(2, dVar);
            this.f95114g = c02;
            this.f95115h = onboardingSlidesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = OnboardingSlidesFragment.this.new d(this.f95114g, dVar, this.f95115h);
            dVar2.f95112e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95111d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95112e)) {
                    J viewLifecycleOwner = OnboardingSlidesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95114g, null, this.f95115h);
                    this.f95111d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$onViewCreated$$inlined$observe$2", f = "OnboardingSlidesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95120d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95121e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95123g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesFragment f95124h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$onViewCreated$$inlined$observe$2$1", f = "OnboardingSlidesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95125d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95126e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesFragment f95127f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2003a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesFragment f95128a;

                public C2003a(OnboardingSlidesFragment onboardingSlidesFragment) {
                    this.f95128a = onboardingSlidesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Y40.c cVar = (Y40.c) t2;
                    if (cVar != null) {
                        OnboardingSlidesFragment onboardingSlidesFragment = this.f95128a;
                        S40.a aVar = onboardingSlidesFragment.binding;
                        if ((aVar != null ? aVar.f25770d.e() : null) == null && !cVar.a().isEmpty()) {
                            b bVar = new b(onboardingSlidesFragment, cVar);
                            S40.a aVar2 = onboardingSlidesFragment.binding;
                            if (aVar2 != null) {
                                aVar2.f25770d.s(bVar);
                            }
                            S40.a aVar3 = onboardingSlidesFragment.binding;
                            if (aVar3 != null) {
                                aVar3.f25770d.t(cVar.d(), false);
                            }
                            S40.a aVar4 = onboardingSlidesFragment.binding;
                            if (aVar4 != null) {
                                aVar4.f25770d.post(onboardingSlidesFragment.new g());
                            }
                            S40.a aVar5 = onboardingSlidesFragment.binding;
                            WormDotsIndicator wormDotsIndicator = aVar5 != null ? aVar5.f25769c : null;
                            S40.a aVar6 = onboardingSlidesFragment.binding;
                            E30.g.a(new h(cVar), wormDotsIndicator, aVar6 != null ? aVar6.f25770d : null);
                            onboardingSlidesFragment.doOpenAnimation();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesFragment onboardingSlidesFragment) {
                super(2, dVar);
                this.f95126e = interfaceC2395h;
                this.f95127f = onboardingSlidesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95126e, dVar, this.f95127f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95125d;
                if (i11 == 0) {
                    s.b(obj);
                    C2003a c2003a = new C2003a(this.f95127f);
                    this.f95125d = 1;
                    if (this.f95126e.collect(c2003a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesFragment onboardingSlidesFragment) {
            super(2, dVar);
            this.f95123g = interfaceC2395h;
            this.f95124h = onboardingSlidesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = OnboardingSlidesFragment.this.new e(this.f95123g, dVar, this.f95124h);
            eVar.f95121e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95120d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95121e)) {
                    J viewLifecycleOwner = OnboardingSlidesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95123g, null, this.f95124h);
                    this.f95120d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$onViewCreated$$inlined$observe$3", f = "OnboardingSlidesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95129d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95130e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95132g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesFragment f95133h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$onViewCreated$$inlined$observe$3$1", f = "OnboardingSlidesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95134d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95135e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesFragment f95136f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2004a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesFragment f95137a;

                public C2004a(OnboardingSlidesFragment onboardingSlidesFragment) {
                    this.f95137a = onboardingSlidesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ViewPager2 viewPager2;
                    int intValue = ((Number) t2).intValue();
                    S40.a aVar = this.f95137a.binding;
                    if (aVar != null && (viewPager2 = aVar.f25770d) != null) {
                        viewPager2.t(intValue, true);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesFragment onboardingSlidesFragment) {
                super(2, dVar);
                this.f95135e = c02;
                this.f95136f = onboardingSlidesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95135e, dVar, this.f95136f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95134d;
                if (i11 == 0) {
                    s.b(obj);
                    C2004a c2004a = new C2004a(this.f95136f);
                    this.f95134d = 1;
                    if (this.f95135e.collect(c2004a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesFragment onboardingSlidesFragment) {
            super(2, dVar);
            this.f95132g = c02;
            this.f95133h = onboardingSlidesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = OnboardingSlidesFragment.this.new f(this.f95132g, dVar, this.f95133h);
            fVar.f95130e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95129d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95130e)) {
                    J viewLifecycleOwner = OnboardingSlidesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95132g, null, this.f95133h);
                    this.f95129d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    static final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OnboardingSlidesFragment onboardingSlidesFragment = OnboardingSlidesFragment.this;
            a aVar = onboardingSlidesFragment.binding;
            if (aVar != null) {
                aVar.f25770d.p(onboardingSlidesFragment.pageListener);
            }
        }
    }

    static final class h implements Function2<WormDotsIndicator, ViewPager2, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y40.c f95139a;

        h(Y40.c cVar) {
            this.f95139a = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(WormDotsIndicator wormDotsIndicator, ViewPager2 viewPager2) {
            WormDotsIndicator dots = wormDotsIndicator;
            ViewPager2 pager = viewPager2;
            Intrinsics.checkNotNullParameter(dots, "dots");
            Intrinsics.checkNotNullParameter(pager, "pager");
            dots.setVisibility(((ArrayList) this.f95139a.a()).size() <= 1 ? 4 : 0);
            dots.attachTo(pager);
            return Unit.f71690a;
        }
    }

    public static final class i extends ViewPager2.g {
        i() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            OnboardingSlidesFragment onboardingSlidesFragment = OnboardingSlidesFragment.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    return;
                }
                a aVar = onboardingSlidesFragment.binding;
                U40.c.a(OnboardingSlidesFragment.TAG, "onPageScrollStateChanged SCROLL_STATE_DRAGGING selectedPos=" + (aVar != null ? Integer.valueOf(aVar.f25770d.f()) : null));
                onboardingSlidesFragment.getViewModel().k0().i(true, onboardingSlidesFragment.touched);
                return;
            }
            boolean z11 = onboardingSlidesFragment.touched;
            a aVar2 = onboardingSlidesFragment.binding;
            U40.c.a(OnboardingSlidesFragment.TAG, "onPageScrollStateChanged touched=" + z11 + " SCROLL_STATE_IDLE selectedPos=" + (aVar2 != null ? Integer.valueOf(aVar2.f25770d.f()) : null));
            V40.b k02 = onboardingSlidesFragment.getViewModel().k0();
            a aVar3 = onboardingSlidesFragment.binding;
            k02.j(aVar3 != null ? aVar3.f25770d.f() : 0);
            onboardingSlidesFragment.getViewModel().k0().i(false, onboardingSlidesFragment.touched);
            onboardingSlidesFragment.touched = false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i11, float f7, int i12) {
            D3.h.g(i11, "onPageScrolled position=", OnboardingSlidesFragment.TAG);
            OnboardingSlidesFragment onboardingSlidesFragment = OnboardingSlidesFragment.this;
            a aVar = onboardingSlidesFragment.binding;
            boolean z11 = false;
            int f11 = aVar != null ? aVar.f25770d.f() : 0;
            if (i11 > f11) {
                onboardingSlidesFragment.getViewModel().k0().j(i11);
                V40.b k02 = onboardingSlidesFragment.getViewModel().k0();
                a aVar2 = onboardingSlidesFragment.binding;
                k02.i(aVar2 != null && aVar2.f25770d.k() == 1, onboardingSlidesFragment.touched);
            }
            if (f11 - i11 >= 2) {
                onboardingSlidesFragment.getViewModel().k0().j(i11);
                V40.b k03 = onboardingSlidesFragment.getViewModel().k0();
                a aVar3 = onboardingSlidesFragment.binding;
                if (aVar3 != null && aVar3.f25770d.k() == 1) {
                    z11 = true;
                }
                k03.i(z11, onboardingSlidesFragment.touched);
            }
            super.onPageScrolled(i11, f7, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            OnboardingSlidesFragment onboardingSlidesFragment = OnboardingSlidesFragment.this;
            U40.c.a(OnboardingSlidesFragment.TAG, "onPageSelected touched=" + onboardingSlidesFragment.touched + " position=" + i11);
            a aVar = onboardingSlidesFragment.binding;
            if (aVar == null || aVar.f25770d.k() != 0) {
                return;
            }
            V40.b k02 = onboardingSlidesFragment.getViewModel().k0();
            a aVar2 = onboardingSlidesFragment.binding;
            k02.j(aVar2 != null ? aVar2.f25770d.f() : 0);
            onboardingSlidesFragment.getViewModel().k0().i(false, onboardingSlidesFragment.touched);
            onboardingSlidesFragment.touched = false;
        }
    }

    public static final class j extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OnboardingSlidesFragment.this;
        }
    }

    public static final class k extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f95142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f95142b = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95142b.invoke();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95143b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95143b.getValue()).getViewModelStore();
        }
    }

    public static final class m extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95144b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95144b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public OnboardingSlidesFragment() {
        F70.c cVar = new F70.c(this, 4);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new k(new j()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(Z40.e.class), new l(a11), new m(a11), cVar);
        this.onBackPressedCallback = new c();
        this.lightStatusBar = true;
        this.isStandaloneIntegration = Sc.k.b(new G30.a(this, 3));
        this.dimAmount = 0.6f;
        this.animDuration = 400L;
        this.pageListener = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOpenAnimation() {
        ViewPager2 viewPager2;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator duration;
        WormDotsIndicator wormDotsIndicator;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator startDelay2;
        ViewPropertyAnimator duration2;
        WormDotsIndicator wormDotsIndicator2;
        ViewPager2 viewPager22;
        a aVar = this.binding;
        if (aVar != null && (viewPager22 = aVar.f25770d) != null) {
            viewPager22.setAlpha(0.0f);
        }
        a aVar2 = this.binding;
        if (aVar2 != null && (wormDotsIndicator2 = aVar2.f25769c) != null) {
            wormDotsIndicator2.setAlpha(0.0f);
        }
        a aVar3 = this.binding;
        if (aVar3 != null && (wormDotsIndicator = aVar3.f25769c) != null && (animate2 = wormDotsIndicator.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (startDelay2 = alpha2.setStartDelay(150L)) != null && (duration2 = startDelay2.setDuration(this.animDuration)) != null) {
            duration2.start();
        }
        a aVar4 = this.binding;
        if (aVar4 == null || (viewPager2 = aVar4.f25770d) == null || (animate = viewPager2.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (startDelay = alpha.setStartDelay(150L)) == null || (duration = startDelay.setDuration(this.animDuration)) == null) {
            return;
        }
        duration.start();
    }

    @NotNull
    public static final Bundle getBundle(String str, Parcelable parcelable, int i11, @NotNull String str2) {
        INSTANCE.getClass();
        return Companion.a(str, parcelable, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z40.e getViewModel() {
        return (Z40.e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isStandaloneIntegration_delegate$lambda$1(OnboardingSlidesFragment onboardingSlidesFragment) {
        return onboardingSlidesFragment.getViewModel().n0();
    }

    @NotNull
    public static final OnboardingSlidesFragment newInstance(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Companion companion = INSTANCE;
        companion.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        OnboardingSlidesFragment onboardingSlidesFragment = new OnboardingSlidesFragment();
        companion.getClass();
        onboardingSlidesFragment.setArguments(Companion.a(str, parcelable, i11, uuid));
        return onboardingSlidesFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$4(OnboardingSlidesFragment onboardingSlidesFragment, View view, MotionEvent motionEvent) {
        onboardingSlidesFragment.touched = true;
        U40.c.a(TAG, "setOnTouchListener touched=true");
        return false;
    }

    @Override // w40.InterfaceC10428a
    public void action(String parameterJson) {
    }

    @Override // E30.b
    public float getDimAmount() {
        return this.dimAmount;
    }

    @Override // E30.b
    @NotNull
    public String getFragmentName() {
        return this.fragmentName;
    }

    @Override // E30.b
    public boolean getLightStatusBar() {
        return this.lightStatusBar;
    }

    @Override // E30.b
    @NotNull
    public C getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final void goNext() {
        V40.b k02 = getViewModel().k0();
        k02.getClass();
        o.a(k02, new V40.a(k02, 0));
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration */
    public boolean getF96847d() {
        return ((Boolean) this.isStandaloneIntegration.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((T40.a) O30.a.a(O30.c.a(requireActivity)).a(T40.a.class)).w1(this);
        super.onAttach(context);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        L80.a.a(TAG, "onCreate");
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        Z40.e viewModel = getViewModel();
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        int i11 = arguments3 != null ? arguments3.getInt("PARAMETER_VERSION") : 2;
        Bundle arguments4 = getArguments();
        viewModel.j0(string2, parcelable, Integer.valueOf(i11), (arguments4 == null || (string = arguments4.getString("PARAMETER_UUID", "")) == null) ? "" : string, Boolean.TRUE);
        getViewModel().g0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        L80.a.a(TAG, "onCreateView");
        a b11 = a.b(inflater, container);
        this.binding = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
        L80.a.a(TAG, "onDestroy");
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        L80.a.a(TAG, "onDestroyView");
        getViewModel().k0().k();
        a aVar = this.binding;
        if (aVar != null) {
            aVar.f25770d.A(this.pageListener);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getViewModel().p0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        getViewModel().k0().l();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        getViewModel().k0().m();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        getViewModel().onStart();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        getViewModel().onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ConstraintLayout a11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        L80.a.a(TAG, "onViewCreated");
        a aVar = this.binding;
        if (aVar != null && (a11 = aVar.a()) != null) {
            a aVar2 = this.binding;
            a11.getViewTreeObserver().addOnGlobalLayoutListener(new A(a11, aVar2 != null ? aVar2.f25768b : null));
        }
        getViewModel().k0().getClass();
        C0 f7 = getViewModel().k0().f();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new d(f7, null, this), 3);
        a aVar3 = this.binding;
        View childAt = aVar3 != null ? aVar3.f25770d.getChildAt(0) : null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new Z40.a(this, 0));
        }
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (recyclerView != null && layoutManager != null) {
            recyclerView.setItemViewCacheSize(0);
            layoutManager.setItemPrefetchEnabled(false);
        }
        a aVar4 = this.binding;
        if (aVar4 != null) {
            D.b(aVar4.f25770d, 2);
        }
        x0<Y40.c> l02 = getViewModel().l0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new e(l02, null, this), 3);
        C0 m02 = getViewModel().m0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new f(m02, null, this), 3);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public String provideId() {
        return getViewModel().i0();
    }

    @Override // V40.b.a
    @NotNull
    public V40.b provideOnboardingInteractor() {
        return getViewModel().k0();
    }

    @Override // w40.InterfaceC10428a
    public void updateState(String parameterJson, Parcelable parameterParcelable, int version, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        getViewModel().j0(parameterJson, parameterParcelable, Integer.valueOf(version), uuid, Boolean.FALSE);
    }
}
