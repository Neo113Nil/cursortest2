package ru.ozon.fintech.features.cbottomonboarding.presentation.v2;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B90.C2613o;
import B90.m0;
import H30.D;
import Sc.InterfaceC4008j;
import Sc.s;
import W40.a;
import a50.C4949a;
import a50.C4950b;
import a50.C4952d;
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
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.annotation.Keep;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
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
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.fintech.ui.dots.WormDotsIndicator;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Keep
@Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\b\u0007*\u0001Y\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002]^B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0005J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J3\u00100\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u00020\u000b*\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000bH\u0002¢\u0006\u0004\b7\u0010\u0005R\u001a\u00108\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010#R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020G8\u0016X\u0096D¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010QR\u001b\u0010S\u001a\u00020G8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bR\u0010@\u001a\u0004\bS\u0010QR\u001a\u0010U\u001a\u00020T8\u0016X\u0096D¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Lru/ozon/fintech/features/cbottomonboarding/presentation/v2/OnboardingSlidesV2Fragment;", "LE30/b;", "Lw40/a;", "LW40/a$a;", "<init>", "()V", "LW40/a;", "provideOnboardingInteractor", "()LW40/a;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "goNext", "onPause", "onResume", "", "provideId", "()Ljava/lang/String;", "onDestroy", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "parameterJson", "Landroid/os/Parcelable;", "parameterParcelable", "", "version", "uuid", "updateState", "(Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/String;)V", "action", "(Ljava/lang/String;)V", "Landroidx/viewpager2/widget/ViewPager2;", "baseSetup", "(Landroidx/viewpager2/widget/ViewPager2;)V", "doOpenAnimation", "fragmentName", "Ljava/lang/String;", "getFragmentName", "LS40/c;", "binding", "LS40/c;", "La50/d;", "viewModel$delegate", "LSc/j;", "getViewModel", "()La50/d;", "viewModel", "", "animDuration", "J", "", "touched", "Z", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "lightStatusBar", "getLightStatusBar", "()Z", "isStandaloneIntegration$delegate", "isStandaloneIntegration", "", "dimAmount", "F", "getDimAmount", "()F", "ru/ozon/fintech/features/cbottomonboarding/presentation/v2/OnboardingSlidesV2Fragment$k", "pageListener", "Lru/ozon/fintech/features/cbottomonboarding/presentation/v2/OnboardingSlidesV2Fragment$k;", "Companion", "a", "b", "cbottom-onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingSlidesV2Fragment extends E30.b implements InterfaceC10428a, a.InterfaceC0586a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final int MINIMUM_COUNT_PAGE = 1;

    @NotNull
    private static final String TAG = "OnboardingSlidesV2Fragment";
    private final long animDuration;
    private S40.c binding;
    private final float dimAmount;

    @NotNull
    private final String fragmentName = "OnboardingSlidesFragment";

    /* renamed from: isStandaloneIntegration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isStandaloneIntegration;
    private final boolean lightStatusBar;

    @NotNull
    private final C onBackPressedCallback;

    @NotNull
    private final k pageListener;
    private boolean touched;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static Bundle a(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return androidx.core.os.d.b(new Pair("PARAMETER_JSON", str), new Pair("PARAMETER_PARCELABLE", parcelable), new Pair("PARAMETER_VERSION", Integer.valueOf(i11)), new Pair("PARAMETER_UUID", uuid));
        }

        @NotNull
        public static OnboardingSlidesV2Fragment b(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = new OnboardingSlidesV2Fragment();
            OnboardingSlidesV2Fragment.INSTANCE.getClass();
            onboardingSlidesV2Fragment.setArguments(a(str, parcelable, i11, uuid));
            return onboardingSlidesV2Fragment;
        }
    }

    public final class b extends Z4.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Y40.c f95145a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull OnboardingSlidesV2Fragment onboardingSlidesV2Fragment, Y40.c onboardingUI) {
            super(onboardingSlidesV2Fragment.getChildFragmentManager(), onboardingSlidesV2Fragment.getLifecycle());
            Intrinsics.checkNotNullParameter(onboardingUI, "onboardingUI");
            this.f95145a = onboardingUI;
        }

        @Override // Z4.a
        @NotNull
        public final ComponentCallbacksC5392m createFragment(int i11) {
            if (((Y40.b) C7714v.Q(i11, this.f95145a.a())) == null) {
                throw new Exception("Not found");
            }
            C4950b c4950b = new C4950b();
            c4950b.setArguments(androidx.core.os.d.b(new Pair("FRAME_POS", Integer.valueOf(i11))));
            return c4950b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public final int getShimmersCount() {
            return ((ArrayList) this.f95145a.a()).size();
        }
    }

    public static final class c extends C {
        c() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            Function0<Unit> function0 = OnboardingSlidesV2Fragment.this.getViewModel().k0().f33232f;
            if (function0 != null) {
                function0.invoke();
            } else {
                Intrinsics.n("endDismissListener");
                throw null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$1", f = "OnboardingSlidesV2Fragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95147d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95148e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95150g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesV2Fragment f95151h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$1$1", f = "OnboardingSlidesV2Fragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95152d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95153e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesV2Fragment f95154f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$d$a$a, reason: collision with other inner class name */
            public static final class C2005a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesV2Fragment f95155a;

                public C2005a(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                    this.f95155a = onboardingSlidesV2Fragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int intValue = ((Number) t2).intValue();
                    L80.a.a(OnboardingSlidesV2Fragment.TAG, "viewModel.onboardingSlidesInteractor.nextFrame.observe " + intValue);
                    S40.c cVar = this.f95155a.binding;
                    if (cVar != null) {
                        D.d(cVar.f25782g, intValue);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                super(2, dVar);
                this.f95153e = c02;
                this.f95154f = onboardingSlidesV2Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95153e, dVar, this.f95154f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95152d;
                if (i11 == 0) {
                    s.b(obj);
                    C2005a c2005a = new C2005a(this.f95154f);
                    this.f95152d = 1;
                    if (this.f95153e.collect(c2005a, this) == aVar) {
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
        public d(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
            super(2, dVar);
            this.f95150g = c02;
            this.f95151h = onboardingSlidesV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = OnboardingSlidesV2Fragment.this.new d(this.f95150g, dVar, this.f95151h);
            dVar2.f95148e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95147d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95148e)) {
                    J viewLifecycleOwner = OnboardingSlidesV2Fragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95150g, null, this.f95151h);
                    this.f95147d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$2", f = "OnboardingSlidesV2Fragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95156d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95157e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95159g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesV2Fragment f95160h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$2$1", f = "OnboardingSlidesV2Fragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95161d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95162e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesV2Fragment f95163f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$e$a$a, reason: collision with other inner class name */
            public static final class C2006a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesV2Fragment f95164a;

                public C2006a(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                    this.f95164a = onboardingSlidesV2Fragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Y40.c cVar = (Y40.c) t2;
                    if (cVar != null) {
                        OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = this.f95164a;
                        S40.c cVar2 = onboardingSlidesV2Fragment.binding;
                        if ((cVar2 != null ? cVar2.f25782g.e() : null) == null && !cVar.a().isEmpty()) {
                            S40.c cVar3 = onboardingSlidesV2Fragment.binding;
                            if (cVar3 != null) {
                                cVar3.f25782g.s(new b(onboardingSlidesV2Fragment, cVar));
                            }
                            S40.c cVar4 = onboardingSlidesV2Fragment.binding;
                            if (cVar4 != null) {
                                cVar4.f25782g.t(cVar.d(), false);
                            }
                            S40.c cVar5 = onboardingSlidesV2Fragment.binding;
                            if (cVar5 != null) {
                                cVar5.f25782g.post(onboardingSlidesV2Fragment.new i());
                            }
                            S40.c cVar6 = onboardingSlidesV2Fragment.binding;
                            WormDotsIndicator wormDotsIndicator = cVar6 != null ? cVar6.f25781f : null;
                            S40.c cVar7 = onboardingSlidesV2Fragment.binding;
                            E30.g.a(new j(cVar), wormDotsIndicator, cVar7 != null ? cVar7.f25782g : null);
                            onboardingSlidesV2Fragment.doOpenAnimation();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                super(2, dVar);
                this.f95162e = interfaceC2395h;
                this.f95163f = onboardingSlidesV2Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95162e, dVar, this.f95163f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95161d;
                if (i11 == 0) {
                    s.b(obj);
                    C2006a c2006a = new C2006a(this.f95163f);
                    this.f95161d = 1;
                    if (this.f95162e.collect(c2006a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
            super(2, dVar);
            this.f95159g = interfaceC2395h;
            this.f95160h = onboardingSlidesV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = OnboardingSlidesV2Fragment.this.new e(this.f95159g, dVar, this.f95160h);
            eVar.f95157e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95156d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95157e)) {
                    J viewLifecycleOwner = OnboardingSlidesV2Fragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95159g, null, this.f95160h);
                    this.f95156d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$3", f = "OnboardingSlidesV2Fragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95165d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95166e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95168g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesV2Fragment f95169h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$3$1", f = "OnboardingSlidesV2Fragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95170d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95171e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesV2Fragment f95172f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$f$a$a, reason: collision with other inner class name */
            public static final class C2007a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesV2Fragment f95173a;

                public C2007a(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                    this.f95173a = onboardingSlidesV2Fragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ViewPager2 viewPager2;
                    int intValue = ((Number) t2).intValue();
                    S40.c cVar = this.f95173a.binding;
                    if (cVar != null && (viewPager2 = cVar.f25782g) != null) {
                        viewPager2.t(intValue, true);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                super(2, dVar);
                this.f95171e = c02;
                this.f95172f = onboardingSlidesV2Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95171e, dVar, this.f95172f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95170d;
                if (i11 == 0) {
                    s.b(obj);
                    C2007a c2007a = new C2007a(this.f95172f);
                    this.f95170d = 1;
                    if (this.f95171e.collect(c2007a, this) == aVar) {
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
        public f(C0 c02, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
            super(2, dVar);
            this.f95168g = c02;
            this.f95169h = onboardingSlidesV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = OnboardingSlidesV2Fragment.this.new f(this.f95168g, dVar, this.f95169h);
            fVar.f95166e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95165d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95166e)) {
                    J viewLifecycleOwner = OnboardingSlidesV2Fragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95168g, null, this.f95169h);
                    this.f95165d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$4", f = "OnboardingSlidesV2Fragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95174d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95175e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95177g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesV2Fragment f95178h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$4$1", f = "OnboardingSlidesV2Fragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95179d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95180e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesV2Fragment f95181f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$g$a$a, reason: collision with other inner class name */
            public static final class C2008a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesV2Fragment f95182a;

                public C2008a(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                    this.f95182a = onboardingSlidesV2Fragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    NoScrollRecycler noScrollRecycler;
                    NoScrollRecycler noScrollRecycler2;
                    Y40.d dVar2 = (Y40.d) t2;
                    OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = this.f95182a;
                    S40.c cVar = onboardingSlidesV2Fragment.binding;
                    if (cVar != null && (noScrollRecycler = cVar.f25779d) != null) {
                        if (dVar2 != null) {
                            com.detmir.recycli.adapters.d.a(noScrollRecycler, dVar2.a());
                            noScrollRecycler.setPadding(C.D.d(dVar2.b().left), C.D.d(dVar2.b().top), C.D.d(dVar2.b().right), C.D.d(dVar2.b().bottom));
                        }
                        S40.c cVar2 = onboardingSlidesV2Fragment.binding;
                        if (cVar2 != null && (noScrollRecycler2 = cVar2.f25779d) != null) {
                            noScrollRecycler2.setVisibility(dVar2 != null && !dVar2.a().isEmpty() ? 0 : 8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                super(2, dVar);
                this.f95180e = interfaceC2395h;
                this.f95181f = onboardingSlidesV2Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95180e, dVar, this.f95181f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95179d;
                if (i11 == 0) {
                    s.b(obj);
                    C2008a c2008a = new C2008a(this.f95181f);
                    this.f95179d = 1;
                    if (this.f95180e.collect(c2008a, this) == aVar) {
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
        public g(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
            super(2, dVar);
            this.f95177g = interfaceC2395h;
            this.f95178h = onboardingSlidesV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = OnboardingSlidesV2Fragment.this.new g(this.f95177g, dVar, this.f95178h);
            gVar.f95175e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95174d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95175e)) {
                    J viewLifecycleOwner = OnboardingSlidesV2Fragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95177g, null, this.f95178h);
                    this.f95174d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$5", f = "OnboardingSlidesV2Fragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95183d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95184e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95186g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingSlidesV2Fragment f95187h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$onViewCreated$$inlined$observe$5$1", f = "OnboardingSlidesV2Fragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95188d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95189e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingSlidesV2Fragment f95190f;

            /* renamed from: ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment$h$a$a, reason: collision with other inner class name */
            public static final class C2009a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingSlidesV2Fragment f95191a;

                public C2009a(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                    this.f95191a = onboardingSlidesV2Fragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    NoScrollRecycler noScrollRecycler;
                    NoScrollRecycler noScrollRecycler2;
                    Y40.d dVar2 = (Y40.d) t2;
                    OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = this.f95191a;
                    S40.c cVar = onboardingSlidesV2Fragment.binding;
                    if (cVar != null && (noScrollRecycler2 = cVar.f25777b) != null && dVar2 != null) {
                        com.detmir.recycli.adapters.d.a(noScrollRecycler2, dVar2.a());
                        noScrollRecycler2.setPadding(C.D.d(dVar2.b().left), C.D.d(dVar2.b().top), C.D.d(dVar2.b().right), C.D.d(dVar2.b().bottom));
                    }
                    S40.c cVar2 = onboardingSlidesV2Fragment.binding;
                    if (cVar2 != null && (noScrollRecycler = cVar2.f25777b) != null) {
                        noScrollRecycler.setVisibility(dVar2 != null && !dVar2.a().isEmpty() ? 0 : 8);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
                super(2, dVar);
                this.f95189e = interfaceC2395h;
                this.f95190f = onboardingSlidesV2Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95189e, dVar, this.f95190f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95188d;
                if (i11 == 0) {
                    s.b(obj);
                    C2009a c2009a = new C2009a(this.f95190f);
                    this.f95188d = 1;
                    if (this.f95189e.collect(c2009a, this) == aVar) {
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
        public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
            super(2, dVar);
            this.f95186g = interfaceC2395h;
            this.f95187h = onboardingSlidesV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = OnboardingSlidesV2Fragment.this.new h(this.f95186g, dVar, this.f95187h);
            hVar.f95184e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95183d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95184e)) {
                    J viewLifecycleOwner = OnboardingSlidesV2Fragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95186g, null, this.f95187h);
                    this.f95183d = 1;
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

    static final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = OnboardingSlidesV2Fragment.this;
            S40.c cVar = onboardingSlidesV2Fragment.binding;
            if (cVar != null) {
                cVar.f25782g.p(onboardingSlidesV2Fragment.pageListener);
            }
        }
    }

    static final class j implements Function2<WormDotsIndicator, ViewPager2, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y40.c f95193a;

        j(Y40.c cVar) {
            this.f95193a = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(WormDotsIndicator wormDotsIndicator, ViewPager2 viewPager2) {
            WormDotsIndicator dots = wormDotsIndicator;
            ViewPager2 pager = viewPager2;
            Intrinsics.checkNotNullParameter(dots, "dots");
            Intrinsics.checkNotNullParameter(pager, "pager");
            dots.setVisibility(((ArrayList) this.f95193a.a()).size() <= 1 ? 4 : 0);
            dots.attachTo(pager);
            return Unit.f71690a;
        }
    }

    public static final class k extends ViewPager2.g {
        k() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = OnboardingSlidesV2Fragment.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    return;
                }
                S40.c cVar = onboardingSlidesV2Fragment.binding;
                U40.c.a(OnboardingSlidesV2Fragment.TAG, "onPageScrollStateChanged SCROLL_STATE_DRAGGING selectedPos=" + (cVar != null ? Integer.valueOf(cVar.f25782g.f()) : null));
                onboardingSlidesV2Fragment.getViewModel().k0().k(true, onboardingSlidesV2Fragment.touched);
                return;
            }
            boolean z11 = onboardingSlidesV2Fragment.touched;
            S40.c cVar2 = onboardingSlidesV2Fragment.binding;
            U40.c.a(OnboardingSlidesV2Fragment.TAG, "onPageScrollStateChanged touched=" + z11 + " SCROLL_STATE_IDLE selectedPos=" + (cVar2 != null ? Integer.valueOf(cVar2.f25782g.f()) : null));
            a k02 = onboardingSlidesV2Fragment.getViewModel().k0();
            S40.c cVar3 = onboardingSlidesV2Fragment.binding;
            k02.l(cVar3 != null ? cVar3.f25782g.f() : 0);
            onboardingSlidesV2Fragment.getViewModel().k0().k(false, onboardingSlidesV2Fragment.touched);
            onboardingSlidesV2Fragment.touched = false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i11, float f7, int i12) {
            D3.h.g(i11, "onPageScrolled position=", OnboardingSlidesV2Fragment.TAG);
            OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = OnboardingSlidesV2Fragment.this;
            S40.c cVar = onboardingSlidesV2Fragment.binding;
            boolean z11 = false;
            int f11 = cVar != null ? cVar.f25782g.f() : 0;
            if (i11 > f11) {
                onboardingSlidesV2Fragment.getViewModel().k0().l(i11);
                a k02 = onboardingSlidesV2Fragment.getViewModel().k0();
                S40.c cVar2 = onboardingSlidesV2Fragment.binding;
                k02.k(cVar2 != null && cVar2.f25782g.k() == 1, onboardingSlidesV2Fragment.touched);
            }
            if (f11 - i11 >= 2) {
                onboardingSlidesV2Fragment.getViewModel().k0().l(i11);
                a k03 = onboardingSlidesV2Fragment.getViewModel().k0();
                S40.c cVar3 = onboardingSlidesV2Fragment.binding;
                if (cVar3 != null && cVar3.f25782g.k() == 1) {
                    z11 = true;
                }
                k03.k(z11, onboardingSlidesV2Fragment.touched);
            }
            super.onPageScrolled(i11, f7, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = OnboardingSlidesV2Fragment.this;
            U40.c.a(OnboardingSlidesV2Fragment.TAG, "onPageSelected touched=" + onboardingSlidesV2Fragment.touched + " position=" + i11);
            S40.c cVar = onboardingSlidesV2Fragment.binding;
            if (cVar == null || cVar.f25782g.k() != 0) {
                return;
            }
            a k02 = onboardingSlidesV2Fragment.getViewModel().k0();
            S40.c cVar2 = onboardingSlidesV2Fragment.binding;
            k02.l(cVar2 != null ? cVar2.f25782g.f() : 0);
            onboardingSlidesV2Fragment.getViewModel().k0().k(false, onboardingSlidesV2Fragment.touched);
            onboardingSlidesV2Fragment.touched = false;
        }
    }

    public static final class l extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OnboardingSlidesV2Fragment.this;
        }
    }

    public static final class m extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f95196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f95196b = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95196b.invoke();
        }
    }

    public static final class n extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95197b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95197b.getValue()).getViewModelStore();
        }
    }

    public static final class o extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95198b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95198b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public OnboardingSlidesV2Fragment() {
        C4949a c4949a = new C4949a(this, 0);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new m(new l()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(C4952d.class), new n(a11), new o(a11), c4949a);
        this.animDuration = 400L;
        this.onBackPressedCallback = new c();
        this.lightStatusBar = true;
        this.isStandaloneIntegration = Sc.k.b(new m0(this, 3));
        this.dimAmount = 0.6f;
        this.pageListener = new k();
    }

    private final void baseSetup(ViewPager2 viewPager2) {
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new Gp.a(this, 1));
        }
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (recyclerView != null && layoutManager != null) {
            recyclerView.setItemViewCacheSize(0);
            layoutManager.setItemPrefetchEnabled(false);
        }
        viewPager2.v(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean baseSetup$lambda$14(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment, View view, MotionEvent motionEvent) {
        onboardingSlidesV2Fragment.touched = true;
        U40.c.a(TAG, "setOnTouchListener touched=true");
        return false;
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
        S40.c cVar = this.binding;
        if (cVar != null && (viewPager22 = cVar.f25782g) != null) {
            viewPager22.setAlpha(0.0f);
        }
        S40.c cVar2 = this.binding;
        if (cVar2 != null && (wormDotsIndicator2 = cVar2.f25781f) != null) {
            wormDotsIndicator2.setAlpha(0.0f);
        }
        S40.c cVar3 = this.binding;
        if (cVar3 != null && (wormDotsIndicator = cVar3.f25781f) != null && (animate2 = wormDotsIndicator.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (startDelay2 = alpha2.setStartDelay(150L)) != null && (duration2 = startDelay2.setDuration(this.animDuration)) != null) {
            duration2.start();
        }
        S40.c cVar4 = this.binding;
        if (cVar4 == null || (viewPager2 = cVar4.f25782g) == null || (animate = viewPager2.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (startDelay = alpha.setStartDelay(150L)) == null || (duration = startDelay.setDuration(this.animDuration)) == null) {
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
    public final C4952d getViewModel() {
        return (C4952d) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isStandaloneIntegration_delegate$lambda$1(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
        return onboardingSlidesV2Fragment.getViewModel().n0();
    }

    @NotNull
    public static final OnboardingSlidesV2Fragment newInstance(String str, Parcelable parcelable, int i11, @NotNull String str2) {
        INSTANCE.getClass();
        return Companion.b(str, parcelable, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 onViewCreated$lambda$9$lambda$8(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment, View view, C5353y0 c5353y0) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "windowInsets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        S40.c cVar = onboardingSlidesV2Fragment.binding;
        if (cVar != null && (frameLayout2 = cVar.f25780e) != null) {
            frameLayout2.setPadding(0, a11.f42127b, 0, 0);
        }
        S40.c cVar2 = onboardingSlidesV2Fragment.binding;
        if (cVar2 != null && (frameLayout = cVar2.f25778c) != null) {
            frameLayout.setPadding(0, 0, 0, a11.f42129d);
        }
        return c5353y0;
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
        a k02 = getViewModel().k0();
        k02.getClass();
        H30.o.a(k02, new R70.a(k02, 1));
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
        ((T40.a) O30.a.a(O30.c.a(requireActivity)).a(T40.a.class)).U0(this);
        super.onAttach(context);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        L80.a.a(TAG, "onCreate");
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        C4952d viewModel = getViewModel();
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
        S40.c b11 = S40.c.b(inflater, container);
        this.binding = b11;
        FrameLayout a11 = b11.a();
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
        getViewModel().k0().m();
        S40.c cVar = this.binding;
        if (cVar != null) {
            cVar.f25782g.A(this.pageListener);
        }
        this.binding = null;
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
        getViewModel().k0().n();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        getViewModel().k0().o();
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
        FrameLayout a11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        L80.a.a(TAG, "onViewCreated");
        getViewModel().k0().p();
        C0 h11 = getViewModel().k0().h();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new d(h11, null, this), 3);
        S40.c cVar = this.binding;
        if (cVar != null) {
            baseSetup(cVar.f25782g);
        }
        x0<Y40.c> l02 = getViewModel().l0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new e(l02, null, this), 3);
        C0 m02 = getViewModel().m0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new f(m02, null, this), 3);
        S40.c cVar2 = this.binding;
        if (cVar2 != null) {
            NoScrollRecycler noScrollRecycler = cVar2.f25779d;
            Context context = noScrollRecycler.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            noScrollRecycler.setLayoutManager(new CenterLinearLayoutManager(context, 1, false));
            noScrollRecycler.setItemAnimator(null);
        }
        S40.c cVar3 = this.binding;
        if (cVar3 != null) {
            NoScrollRecycler noScrollRecycler2 = cVar3.f25777b;
            Context context2 = noScrollRecycler2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            noScrollRecycler2.setLayoutManager(new CenterLinearLayoutManager(context2, 1, false));
            noScrollRecycler2.setItemAnimator(null);
        }
        S40.c cVar4 = this.binding;
        if (cVar4 != null && (a11 = cVar4.a()) != null) {
            Y.J(a11, new C2613o(this, 4));
        }
        x0<Y40.d> g10 = getViewModel().k0().g();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new g(g10, null, this), 3);
        x0<Y40.d> d11 = getViewModel().k0().d();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new h(d11, null, this), 3);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public String provideId() {
        return getViewModel().i0();
    }

    @Override // W40.a.InterfaceC0586a
    @NotNull
    public a provideOnboardingInteractor() {
        return getViewModel().k0();
    }

    @Override // w40.InterfaceC10428a
    public void updateState(String parameterJson, Parcelable parameterParcelable, int version, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        getViewModel().j0(parameterJson, parameterParcelable, Integer.valueOf(version), uuid, Boolean.FALSE);
    }
}
