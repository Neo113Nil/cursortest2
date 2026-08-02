package ru.ozon.fintech.features.onboarding.presentation;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ae.x0;
import B90.g0;
import H30.u;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.C;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import f3.AbstractC6409a;
import j3.AbstractC7265g;
import j3.C7275q;
import j3.w;
import j3.y;
import java.util.Iterator;
import java.util.List;
import k80.C7607a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;
import ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment;
import ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment;
import ru.ozon.fintech.settings.models.FeatureValue;
import v70.InterfaceC10268b;
import x40.C10656a;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;
import xe.N;
import z70.C10997a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/onboarding/presentation/OnboardingFragment;", "LE30/c;", "", "<init>", "()V", "onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingFragment extends E30.c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f95832p = 0;

    /* renamed from: a, reason: collision with root package name */
    public C10656a f95833a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f95834b;

    /* renamed from: c, reason: collision with root package name */
    private ConstraintLayout f95835c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f95836d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f95837e;

    /* renamed from: f, reason: collision with root package name */
    private OnboardingSlidesFragment f95838f;

    /* renamed from: g, reason: collision with root package name */
    private OnboardingSlidesV2Fragment f95839g;

    /* renamed from: h, reason: collision with root package name */
    private LottieAnimationView f95840h;

    /* renamed from: i, reason: collision with root package name */
    private LottieAnimationView f95841i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f95842j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f95843k;

    /* renamed from: l, reason: collision with root package name */
    private ProgressBar f95844l;

    /* renamed from: m, reason: collision with root package name */
    private PlayerView f95845m;

    /* renamed from: n, reason: collision with root package name */
    private FrameLayout f95846n;

    /* renamed from: o, reason: collision with root package name */
    private ExoPlayer f95847o;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            r activity = OnboardingFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$1", f = "OnboardingFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95849d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95850e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95852g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingFragment f95853h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$1$1", f = "OnboardingFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95854d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95855e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingFragment f95856f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2047a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingFragment f95857a;

                public C2047a(OnboardingFragment onboardingFragment) {
                    this.f95857a = onboardingFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    T t11;
                    T t12;
                    ImageView imageView;
                    LottieAnimationView lottieAnimationView;
                    Integer e11;
                    Integer d11;
                    C10997a c10997a = (C10997a) t2;
                    OnboardingFragment onboardingFragment = this.f95857a;
                    if (c10997a != null && (d11 = c10997a.d()) != null) {
                        int intValue = d11.intValue();
                        ConstraintLayout constraintLayout = onboardingFragment.f95835c;
                        if (constraintLayout != null) {
                            constraintLayout.setBackgroundColor(androidx.core.content.a.getColor(onboardingFragment.requireContext(), intValue));
                        }
                    }
                    if (c10997a != null && (e11 = c10997a.e()) != null) {
                        int intValue2 = e11.intValue();
                        ConstraintLayout constraintLayout2 = onboardingFragment.f95835c;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setBackground(androidx.core.content.a.getDrawable(onboardingFragment.requireContext(), intValue2));
                        }
                    }
                    LottieAnimationView lottieAnimationView2 = onboardingFragment.f95840h;
                    int i11 = 8;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility((c10997a != null ? c10997a.b() : null) != null ? 0 : 8);
                    }
                    if ((c10997a != null ? c10997a.b() : null) != null) {
                        LottieAnimationView lottieAnimationView3 = onboardingFragment.f95840h;
                        if (lottieAnimationView3 != null && !lottieAnimationView3.isAnimating()) {
                            LottieAnimationView lottieAnimationView4 = onboardingFragment.f95840h;
                            if (lottieAnimationView4 != null) {
                                lottieAnimationView4.setAnimation(c10997a.b().intValue());
                            }
                            LottieAnimationView lottieAnimationView5 = onboardingFragment.f95840h;
                            if (lottieAnimationView5 != null) {
                                lottieAnimationView5.playAnimation();
                            }
                        }
                    } else {
                        D a11 = K.a(onboardingFragment);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        C10727i.c(a11, He.b.f10879b, null, new h(null, onboardingFragment), 2);
                    }
                    LottieAnimationView lottieAnimationView6 = onboardingFragment.f95841i;
                    if (lottieAnimationView6 != null) {
                        lottieAnimationView6.setVisibility((c10997a != null ? c10997a.g() : null) != null ? 0 : 8);
                    }
                    if ((c10997a != null ? c10997a.g() : null) != null && (lottieAnimationView = onboardingFragment.f95841i) != null && !lottieAnimationView.isAnimating()) {
                        LottieAnimationView lottieAnimationView7 = onboardingFragment.f95841i;
                        if (lottieAnimationView7 != null) {
                            lottieAnimationView7.setAnimation(c10997a.g().intValue());
                        }
                        LottieAnimationView lottieAnimationView8 = onboardingFragment.f95841i;
                        if (lottieAnimationView8 != null) {
                            lottieAnimationView8.playAnimation();
                        }
                    }
                    ImageView imageView2 = onboardingFragment.f95842j;
                    if (imageView2 != null) {
                        imageView2.setVisibility((c10997a != null ? c10997a.c() : null) != null ? 0 : 8);
                    }
                    if ((c10997a != null ? c10997a.c() : null) != null && (imageView = onboardingFragment.f95842j) != null) {
                        imageView.setImageResource(c10997a.c().intValue());
                    }
                    TextView textView = onboardingFragment.f95843k;
                    if (textView != null) {
                        textView.setVisibility((c10997a != null ? c10997a.a() : null) != null ? 0 : 8);
                    }
                    TextView textView2 = onboardingFragment.f95843k;
                    if (textView2 != null) {
                        textView2.setText(c10997a != null ? c10997a.a() : null);
                    }
                    ProgressBar progressBar = onboardingFragment.f95844l;
                    if (progressBar != null) {
                        if (c10997a != null && c10997a.h()) {
                            i11 = 0;
                        }
                        progressBar.setVisibility(i11);
                    }
                    if (c10997a != null && c10997a.i()) {
                        List<ComponentCallbacksC5392m> r02 = onboardingFragment.getChildFragmentManager().r0();
                        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                        Iterator<T> it = r02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t12 = (T) null;
                                break;
                            }
                            t12 = it.next();
                            if (Intrinsics.d(((ComponentCallbacksC5392m) t12).getTag(), "DisclosureFragment")) {
                                break;
                            }
                        }
                        if ((t12 instanceof DisclosureFragment ? t12 : null) == null) {
                            DisclosureFragment disclosureFragment = new DisclosureFragment();
                            disclosureFragment.setArguments(androidx.core.os.d.a());
                            Q p11 = onboardingFragment.getChildFragmentManager().p();
                            p11.t(R.anim.fade_in, R.anim.fade_out, 0, 0);
                            p11.b(R.id.disclosure_holder, disclosureFragment, "DisclosureFragment");
                            p11.i();
                            u.c(onboardingFragment.requireActivity());
                        }
                    }
                    if (c10997a != null && c10997a.k()) {
                        OnboardingFragment.I(onboardingFragment, c10997a.i());
                    }
                    if (c10997a != null && c10997a.j()) {
                        List<ComponentCallbacksC5392m> r03 = onboardingFragment.getChildFragmentManager().r0();
                        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
                        Iterator<T> it2 = r03.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t11 = (T) null;
                                break;
                            }
                            t11 = it2.next();
                            if (Intrinsics.d(((ComponentCallbacksC5392m) t11).getTag(), "UpdateWallFragment")) {
                                break;
                            }
                        }
                        if ((t11 instanceof UpdateWallFragment ? t11 : null) == null) {
                            UpdateWallFragment updateWallFragment = new UpdateWallFragment();
                            updateWallFragment.setArguments(androidx.core.os.d.a());
                            Q p12 = onboardingFragment.getChildFragmentManager().p();
                            p12.t(R.anim.fade_in, R.anim.fade_out, 0, 0);
                            p12.b(R.id.update_holder, updateWallFragment, "UpdateWallFragment");
                            p12.i();
                            u.c(onboardingFragment.requireActivity());
                        }
                    }
                    if (c10997a != null && c10997a.f() && c10997a.l() != null && onboardingFragment.f95847o == null && onboardingFragment.getContext() != null) {
                        XmlResourceParser xml = onboardingFragment.getResources().getXml(R.xml.onboarding_player);
                        Intrinsics.checkNotNullExpressionValue(xml, "getXml(...)");
                        try {
                            xml.next();
                            xml.nextTag();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        onboardingFragment.f95845m = new PlayerView(onboardingFragment.requireContext(), Xml.asAttributeSet(xml));
                        FrameLayout frameLayout = onboardingFragment.f95846n;
                        if (frameLayout != null) {
                            frameLayout.addView(onboardingFragment.f95845m);
                        }
                        PlayerView playerView = onboardingFragment.f95845m;
                        if (playerView != null) {
                            playerView.setAlpha(0.0f);
                        }
                        onboardingFragment.f95847o = new ExoPlayer.b(onboardingFragment.requireContext()).a();
                        PlayerView playerView2 = onboardingFragment.f95845m;
                        if (playerView2 != null) {
                            playerView2.E();
                        }
                        ExoPlayer exoPlayer = onboardingFragment.f95847o;
                        if (exoPlayer != null) {
                            exoPlayer.t(onboardingFragment.new f());
                        }
                        PlayerView playerView3 = onboardingFragment.f95845m;
                        if (playerView3 != null) {
                            playerView3.setVisibility(0);
                        }
                        PlayerView playerView4 = onboardingFragment.f95845m;
                        if (playerView4 != null) {
                            playerView4.B(onboardingFragment.f95847o);
                        }
                        Uri parse = Uri.parse("android.resource://" + onboardingFragment.requireContext().getPackageName() + "/" + c10997a.l());
                        C7275q.a aVar = new C7275q.a();
                        aVar.i(parse);
                        C7275q a12 = aVar.a();
                        Intrinsics.checkNotNullExpressionValue(a12, "fromUri(...)");
                        y yVar = onboardingFragment.f95847o;
                        if (yVar != null) {
                            ((AbstractC7265g) yVar).g0(a12);
                        }
                        ExoPlayer exoPlayer2 = onboardingFragment.f95847o;
                        if (exoPlayer2 != null) {
                            exoPlayer2.prepare();
                        }
                        y yVar2 = onboardingFragment.f95847o;
                        if (yVar2 != null) {
                            ((AbstractC7265g) yVar2).D(true);
                        }
                        r requireActivity = onboardingFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        u.g(requireActivity, new Integer(R.color.black));
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
                super(2, dVar);
                this.f95855e = interfaceC2395h;
                this.f95856f = onboardingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95855e, dVar, this.f95856f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95854d;
                if (i11 == 0) {
                    s.b(obj);
                    C2047a c2047a = new C2047a(this.f95856f);
                    this.f95854d = 1;
                    if (this.f95855e.collect(c2047a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
            super(2, dVar);
            this.f95852g = interfaceC2395h;
            this.f95853h = onboardingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = OnboardingFragment.this.new b(this.f95852g, dVar, this.f95853h);
            bVar.f95850e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95849d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95850e)) {
                    J viewLifecycleOwner = OnboardingFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95852g, null, this.f95853h);
                    this.f95849d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$2", f = "OnboardingFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95858d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95859e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ w0 f95861g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingFragment f95862h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$2$1", f = "OnboardingFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95863d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w0 f95864e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingFragment f95865f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2048a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingFragment f95866a;

                public C2048a(OnboardingFragment onboardingFragment) {
                    this.f95866a = onboardingFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    OnboardingFragment onboardingFragment = this.f95866a;
                    View view = onboardingFragment.getView();
                    if (view != null) {
                        view.post(new g0(onboardingFragment, 12));
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
                super(2, dVar);
                this.f95864e = w0Var;
                this.f95865f = onboardingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95864e, dVar, this.f95865f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95863d;
                if (i11 == 0) {
                    s.b(obj);
                    C2048a c2048a = new C2048a(this.f95865f);
                    this.f95863d = 1;
                    if (this.f95864e.collect(c2048a, this) == aVar) {
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
        public c(w0 w0Var, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
            super(2, dVar);
            this.f95861g = w0Var;
            this.f95862h = onboardingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = OnboardingFragment.this.new c(this.f95861g, dVar, this.f95862h);
            cVar.f95859e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95858d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95859e)) {
                    J viewLifecycleOwner = OnboardingFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95861g, null, this.f95862h);
                    this.f95858d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$3", f = "OnboardingFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95867d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95868e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95870g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingFragment f95871h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$3$1", f = "OnboardingFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95872d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95873e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingFragment f95874f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2049a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingFragment f95875a;

                public C2049a(OnboardingFragment onboardingFragment) {
                    this.f95875a = onboardingFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    OnboardingFragment onboardingFragment = this.f95875a;
                    OnboardingSlidesFragment onboardingSlidesFragment = onboardingFragment.f95838f;
                    if (onboardingSlidesFragment != null) {
                        onboardingSlidesFragment.goNext();
                    }
                    OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = onboardingFragment.f95839g;
                    if (onboardingSlidesV2Fragment != null) {
                        onboardingSlidesV2Fragment.goNext();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
                super(2, dVar);
                this.f95873e = c02;
                this.f95874f = onboardingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95873e, dVar, this.f95874f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95872d;
                if (i11 == 0) {
                    s.b(obj);
                    C2049a c2049a = new C2049a(this.f95874f);
                    this.f95872d = 1;
                    if (this.f95873e.collect(c2049a, this) == aVar) {
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
        public d(C0 c02, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
            super(2, dVar);
            this.f95870g = c02;
            this.f95871h = onboardingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = OnboardingFragment.this.new d(this.f95870g, dVar, this.f95871h);
            dVar2.f95868e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95867d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95868e)) {
                    J viewLifecycleOwner = OnboardingFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95870g, null, this.f95871h);
                    this.f95867d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$4", f = "OnboardingFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95876d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95877e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95879g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OnboardingFragment f95880h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$$inlined$observe$4$1", f = "OnboardingFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95881d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95882e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OnboardingFragment f95883f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2050a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OnboardingFragment f95884a;

                public C2050a(OnboardingFragment onboardingFragment) {
                    this.f95884a = onboardingFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Window window;
                    if (Intrinsics.d((Boolean) t2, Boolean.TRUE)) {
                        OnboardingFragment onboardingFragment = this.f95884a;
                        if (onboardingFragment.f95838f == null && onboardingFragment.f95839g == null) {
                            r requireActivity = onboardingFragment.requireActivity();
                            if (requireActivity != null && (window = requireActivity.getWindow()) != null) {
                                u.e(window);
                            }
                            r requireActivity2 = onboardingFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                            u.g(requireActivity2, onboardingFragment.J().u0().getSplashBackColorRes());
                        } else {
                            u.c(onboardingFragment.requireActivity());
                            r requireActivity3 = onboardingFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                            u.b(requireActivity3);
                        }
                        ComponentCallbacksC5392m g02 = onboardingFragment.getChildFragmentManager().g0("DisclosureFragment");
                        if (g02 != null) {
                            Q p11 = onboardingFragment.getChildFragmentManager().p();
                            p11.t(R.anim.fade_in, R.anim.fade_out, 0, 0);
                            p11.q(g02);
                            p11.i();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
                super(2, dVar);
                this.f95882e = c02;
                this.f95883f = onboardingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95882e, dVar, this.f95883f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95881d;
                if (i11 == 0) {
                    s.b(obj);
                    C2050a c2050a = new C2050a(this.f95883f);
                    this.f95881d = 1;
                    if (this.f95882e.collect(c2050a, this) == aVar) {
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
        public e(C0 c02, kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
            super(2, dVar);
            this.f95879g = c02;
            this.f95880h = onboardingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = OnboardingFragment.this.new e(this.f95879g, dVar, this.f95880h);
            eVar.f95877e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95876d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95877e)) {
                    J viewLifecycleOwner = OnboardingFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95879g, null, this.f95880h);
                    this.f95876d = 1;
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

    public static final class f implements y.c {
        f() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // j3.y.c
        public final void onRenderedFirstFrame() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator startDelay;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            PlayerView playerView = OnboardingFragment.this.f95845m;
            if (playerView == null || (animate = playerView.animate()) == null || (startDelay = animate.setStartDelay(100L)) == null || (alpha = startDelay.alpha(1.0f)) == null || (duration = alpha.setDuration(200L)) == null) {
                return;
            }
            duration.start();
        }

        @Override // j3.y.c
        public final void onVideoSizeChanged(j3.Q videoSize) {
            Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        }
    }

    public static final class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            OnboardingFragment.this.J().q0();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$lambda$6$$inlined$post$1", f = "OnboardingFragment.kt", l = {11}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95887d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ OnboardingFragment f95888e;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$onViewCreated$lambda$6$$inlined$post$1$1", f = "OnboardingFragment.kt", l = {}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ OnboardingFragment f95889d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
                super(2, dVar);
                this.f95889d = onboardingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(dVar, this.f95889d);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f95889d.J().q0();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(kotlin.coroutines.d dVar, OnboardingFragment onboardingFragment) {
            super(2, dVar);
            this.f95888e = onboardingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(dVar, this.f95888e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95887d;
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                a aVar2 = new a(null, this.f95888e);
                this.f95887d = 1;
                if (C10727i.f(l02, aVar2, this) == aVar) {
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

    public static final class i extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OnboardingFragment.this;
        }
    }

    public static final class j extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f95891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f95891b = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95891b.invoke();
        }
    }

    public static final class k extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95892b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95892b.getValue()).getViewModelStore();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95893b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95893b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95893b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public OnboardingFragment() {
        C7607a c7607a = new C7607a(this, 1);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new j(new i()));
        this.f95834b = b0.b(this, kotlin.jvm.internal.N.b(y70.f.class), new k(a11), new l(a11), c7607a);
        this.f95836d = new a();
        this.f95837e = "OnboardingFragment";
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [T, y70.d] */
    public static final void I(final OnboardingFragment onboardingFragment, boolean z11) {
        Object obj;
        Object obj2;
        ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a aVar;
        Integer version;
        C10656a c10656a;
        List<ComponentCallbacksC5392m> r02 = onboardingFragment.getChildFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Iterator<T> it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((ComponentCallbacksC5392m) obj).getTag(), "OnboardingSlidesFragment")) {
                    break;
                }
            }
        }
        onboardingFragment.f95838f = obj instanceof OnboardingSlidesFragment ? (OnboardingSlidesFragment) obj : null;
        List<ComponentCallbacksC5392m> r03 = onboardingFragment.getChildFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
        Iterator<T> it2 = r03.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (Intrinsics.d(((ComponentCallbacksC5392m) obj2).getTag(), "OnboardingSlidesV2Fragment")) {
                    break;
                }
            }
        }
        OnboardingSlidesV2Fragment onboardingSlidesV2Fragment = obj2 instanceof OnboardingSlidesV2Fragment ? (OnboardingSlidesV2Fragment) obj2 : null;
        onboardingFragment.f95839g = onboardingSlidesV2Fragment;
        if (onboardingFragment.f95838f == null && onboardingSlidesV2Fragment == null) {
            FeatureValue A02 = onboardingFragment.J().A0();
            JSONObject dict = A02 != null ? A02.getDict() : null;
            if (dict != null) {
                kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                try {
                    c10656a = onboardingFragment.f95833a;
                } catch (Exception e11) {
                    L80.a.c("PARSE_ONBOARDING", "V2", e11);
                    aVar = null;
                }
                if (c10656a == null) {
                    Intrinsics.n("cbottomMapper2");
                    throw null;
                }
                aVar = c10656a.d(dict.toString());
                if (aVar != null && (version = aVar.getVersion()) != null && version.intValue() == 2) {
                    OnboardingSlidesV2Fragment.Companion companion = OnboardingSlidesV2Fragment.INSTANCE;
                    String uniqueUuid = onboardingFragment.getUniqueUuid();
                    companion.getClass();
                    final OnboardingSlidesV2Fragment b11 = OnboardingSlidesV2Fragment.Companion.b(null, aVar, 2, uniqueUuid);
                    m11.f71787a = new Function0() { // from class: y70.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q p11 = OnboardingFragment.this.getChildFragmentManager().p();
                            p11.b(R.id.slides_holder, b11, "OnboardingSlidesV2Fragment");
                            p11.i();
                            return Unit.f71690a;
                        }
                    };
                    onboardingFragment.f95839g = b11;
                }
                C10727i.c(K.a(onboardingFragment), null, null, new ru.ozon.fintech.features.onboarding.presentation.a(z11, m11, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y70.f J() {
        return (y70.f) this.f95834b.getValue();
    }

    public static void t(OnboardingFragment onboardingFragment) {
        r activity;
        androidx.activity.J onBackPressedDispatcher;
        onboardingFragment.f95836d.remove();
        a aVar = onboardingFragment.f95836d;
        aVar.setEnabled(true);
        if (onboardingFragment.isDetached() || (activity = onboardingFragment.getActivity()) == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        J viewLifecycleOwner = onboardingFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, aVar);
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95807c() {
        return this.f95837e;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC10268b) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC10268b.class)).u(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        J().J0(bundle, getUniqueUuid());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_onboarding, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95836d.remove();
        this.f95835c = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("firstLottieAnimationDone", J().v0());
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        this.f95836d.setEnabled(true);
        J().onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ExoPlayer exoPlayer = this.f95847o;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f95836d.setEnabled(false);
        J().getClass();
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        List<ComponentCallbacksC5392m> r02 = getChildFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Iterator<T> it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((ComponentCallbacksC5392m) obj).getTag(), "OnboardingSlidesFragment")) {
                    break;
                }
            }
        }
        this.f95838f = obj instanceof OnboardingSlidesFragment ? (OnboardingSlidesFragment) obj : null;
        List<ComponentCallbacksC5392m> r03 = getChildFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
        Iterator<T> it2 = r03.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (Intrinsics.d(((ComponentCallbacksC5392m) obj2).getTag(), "OnboardingSlidesV2Fragment")) {
                    break;
                }
            }
        }
        this.f95839g = obj2 instanceof OnboardingSlidesV2Fragment ? (OnboardingSlidesV2Fragment) obj2 : null;
        View view2 = getView();
        if (view2 != null) {
            view2.post(new g0(this, 12));
        }
        this.f95835c = (ConstraintLayout) view.findViewById(R.id.on_boarding_top);
        this.f95844l = (ProgressBar) view.findViewById(R.id.onboarding_progress);
        this.f95840h = (LottieAnimationView) view.findViewById(R.id.hello_lottie);
        this.f95841i = (LottieAnimationView) view.findViewById(R.id.progress_lottie);
        this.f95842j = (ImageView) view.findViewById(R.id.iv_logo);
        this.f95843k = (TextView) view.findViewById(R.id.tv_advertising);
        this.f95846n = (FrameLayout) view.findViewById(R.id.player_view_holder);
        LottieAnimationView lottieAnimationView = this.f95841i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatMode(1);
        }
        LottieAnimationView lottieAnimationView2 = this.f95841i;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setRepeatCount(-1);
        }
        x0<C10997a> B02 = J().B0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new b(B02, null, this), 3);
        LottieAnimationView lottieAnimationView3 = this.f95840h;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.addAnimatorListener(new g());
        }
        ConstraintLayout constraintLayout = this.f95835c;
        if (constraintLayout != null) {
            constraintLayout.setAlpha(1.0f);
        }
        w0<Boolean> e11 = J().t0().e();
        if (e11 != null) {
            J viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C10727i.c(K.a(viewLifecycleOwner2), null, null, new c(e11, null, this), 3);
        }
        C0 x02 = J().x0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new d(x02, null, this), 3);
        C0 s02 = J().s0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new e(s02, null, this), 3);
    }
}
