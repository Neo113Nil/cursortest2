package l80;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B4.C2584m;
import B4.H;
import B90.V;
import Be.AbstractC2635g;
import C.D;
import E4.e;
import I30.f;
import R80.g;
import Sc.C4005g;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4003e;
import T60.a;
import T80.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.core.view.C5316f0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import b90.C5595b;
import c90.InterfaceC5773a;
import d40.InterfaceC6083a;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g.C6589a;
import g.InterfaceC6590b;
import g30.InterfaceC6618a;
import h30.InterfaceC6794b;
import h80.C6875a;
import j80.C7308a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment;
import ru.ozon.fintech.features.tabber.presentation.base.OverFragment;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AppConfigTab;
import ru.ozon.fintech.ui.badge.TabBadgeIconState;
import ru.ozon.fintech.ui.badge.TabBadgeIconView;
import ru.ozon.fintech.ui.bottomnavigation.FintechBottomNavigationView;
import ta0.InterfaceC9791a;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll80/f;", "LE30/a;", "LY80/l;", "LI30/c;", "LI30/a;", "LI30/f;", "LI30/d;", "Ll80/i;", "", "LI30/e;", "LO30/d;", "<init>", "()V", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class f extends E30.a implements Y80.l, I30.c, I30.a, I30.f, I30.d, l80.i, I30.e, O30.d {

    /* renamed from: X, reason: collision with root package name */
    private static final int f72969X = D.c(56.0f);

    /* renamed from: Y, reason: collision with root package name */
    private static final int f72970Y = D.d(56);

    /* renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f72971Z = 0;

    /* renamed from: A, reason: collision with root package name */
    private Long f72972A;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC6083a f72975D;

    /* renamed from: E, reason: collision with root package name */
    public S80.b f72976E;

    /* renamed from: F, reason: collision with root package name */
    public ru.ozon.fintech.settings.domain.a f72977F;

    /* renamed from: G, reason: collision with root package name */
    public A30.m f72978G;

    /* renamed from: H, reason: collision with root package name */
    public T80.b f72979H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC9791a f72980I;

    /* renamed from: J, reason: collision with root package name */
    public K40.a f72981J;

    /* renamed from: K, reason: collision with root package name */
    public C6875a f72982K;

    /* renamed from: L, reason: collision with root package name */
    public S60.a f72983L;

    /* renamed from: M, reason: collision with root package name */
    public Ib.a<InterfaceC5773a> f72984M;

    /* renamed from: N, reason: collision with root package name */
    public Q90.n f72985N;

    /* renamed from: O, reason: collision with root package name */
    public h80.b f72986O;

    /* renamed from: P, reason: collision with root package name */
    private Y80.k f72987P;

    /* renamed from: Q, reason: collision with root package name */
    private int f72988Q;

    /* renamed from: R, reason: collision with root package name */
    private int f72989R;

    /* renamed from: S, reason: collision with root package name */
    private Integer f72990S;

    /* renamed from: j, reason: collision with root package name */
    private boolean f72991j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f72992k;

    /* renamed from: l, reason: collision with root package name */
    private View f72993l;

    /* renamed from: m, reason: collision with root package name */
    private FrameLayout f72994m;

    /* renamed from: n, reason: collision with root package name */
    private OverFragment f72995n;

    /* renamed from: o, reason: collision with root package name */
    private C2584m f72996o;

    /* renamed from: p, reason: collision with root package name */
    private l80.l f72997p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f72998q;

    /* renamed from: r, reason: collision with root package name */
    private Long f72999r;

    /* renamed from: s, reason: collision with root package name */
    private Long f73000s;

    /* renamed from: u, reason: collision with root package name */
    private C7308a f73002u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC6618a f73003v;

    /* renamed from: w, reason: collision with root package name */
    public Q90.c f73004w;

    /* renamed from: x, reason: collision with root package name */
    public d70.d f73005x;

    /* renamed from: z, reason: collision with root package name */
    private Long f73007z;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f73001t = new LinkedHashMap();

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final p f73006y = new p();

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final ArrayList f72973B = C7714v.m0(Integer.valueOf(R.navigation.tab0), Integer.valueOf(R.navigation.tab1), Integer.valueOf(R.navigation.tab2), Integer.valueOf(R.navigation.tab3), Integer.valueOf(R.navigation.tab4));

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final y0 f72974C = new y0(N.b(l80.g.class), new u(), new V40.a(this, 1), new v());

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73008a;

        static {
            int[] iArr = new int[c.b.values().length];
            try {
                iArr[c.b.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.b.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.b.HIDE_ANIMATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.b.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f73008a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f73010b;

        b(int i11) {
            this.f73010b = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            FintechBottomNavigationView b11;
            Intrinsics.checkNotNullParameter(animation, "animation");
            l80.l lVar = f.this.f72997p;
            if (lVar == null || (b11 = lVar.b()) == null) {
                return;
            }
            b11.setVisibility(this.f73010b == 0 ? 0 : 8);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$fillBottomIcons$lambda$28$$inlined$observeWithoutRepeatOnLifeCycle$1", f = "BaseTabActivity.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73011d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f73012e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MenuItem f73013f;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MenuItem f73014a;

            public a(MenuItem menuItem) {
                this.f73014a = menuItem;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                Drawable drawable = (Drawable) t2;
                if (drawable != null) {
                    this.f73014a.setIcon(drawable);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, MenuItem menuItem) {
            super(2, dVar);
            this.f73012e = interfaceC2395h;
            this.f73013f = menuItem;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f73012e, dVar, this.f73013f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73011d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f73013f);
                this.f73011d = 1;
                if (((AbstractC2635g) this.f73012e).collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$handleDeepLink$2", f = "BaseTabActivity.kt", l = {853}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73015d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73015d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f73015d = 1;
                if (Y.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            f fVar = f.this;
            fVar.f0().P(fVar.getF96341r0());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$1", f = "BaseTabActivity.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73017d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f73019f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f73020g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$1$1", f = "BaseTabActivity.kt", l = {52}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73021d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f73022e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f73023f;

            /* renamed from: l80.f$e$a$a, reason: collision with other inner class name */
            public static final class C1220a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f73024a;

                public C1220a(f fVar) {
                    this.f73024a = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    boolean booleanValue = ((Boolean) t2).booleanValue();
                    f fVar = this.f73024a;
                    if (!fVar.g0().getGlobalFlagSecured()) {
                        if (booleanValue) {
                            Window window = fVar.getWindow();
                            if (window != null) {
                                window.addFlags(8192);
                            }
                        } else {
                            Window window2 = fVar.getWindow();
                            if (window2 != null) {
                                window2.clearFlags(8192);
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar) {
                super(2, dVar);
                this.f73022e = interfaceC2395h;
                this.f73023f = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f73022e, dVar, this.f73023f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73021d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C1220a c1220a = new C1220a(this.f73023f);
                    this.f73021d = 1;
                    if (this.f73022e.collect(c1220a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar) {
            super(2, dVar);
            this.f73019f = interfaceC2395h;
            this.f73020g = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new e(this.f73019f, dVar, this.f73020g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73017d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f73019f, null, this.f73020g);
                this.f73017d = 1;
                if (C5412d0.b(f.this, bVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$2", f = "BaseTabActivity.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: l80.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1221f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73025d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f73027f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f73028g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$2$1", f = "BaseTabActivity.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: l80.f$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73029d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f73030e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f73031f;

            /* renamed from: l80.f$f$a$a, reason: collision with other inner class name */
            public static final class C1222a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f73032a;

                public C1222a(f fVar) {
                    this.f73032a = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    if (str != null) {
                        f fVar = this.f73032a;
                        fVar.e0().u(str);
                        new f.a(fVar).setTitle(fVar.getString(R.string.webview_outdated_title)).f(fVar.getString(R.string.webview_outdated, str)).h(fVar.getString(R.string.webview_outdated_cancel), l.f73058a).m(fVar.getString(R.string.webview_outdated_update), fVar.new m()).q();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar) {
                super(2, dVar);
                this.f73030e = interfaceC2395h;
                this.f73031f = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f73030e, dVar, this.f73031f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73029d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C1222a c1222a = new C1222a(this.f73031f);
                    this.f73029d = 1;
                    if (this.f73030e.collect(c1222a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1221f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar) {
            super(2, dVar);
            this.f73027f = interfaceC2395h;
            this.f73028g = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new C1221f(this.f73027f, dVar, this.f73028g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1221f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73025d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f73027f, null, this.f73028g);
                this.f73025d = 1;
                if (C5412d0.b(f.this, bVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$3", f = "BaseTabActivity.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73033d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x0 f73035f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f73036g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$3$1", f = "BaseTabActivity.kt", l = {52}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73037d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x0 f73038e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f73039f;

            /* renamed from: l80.f$g$a$a, reason: collision with other inner class name */
            public static final class C1223a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f73040a;

                public C1223a(f fVar) {
                    this.f73040a = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int i11 = a.f73008a[((c.b) t2).ordinal()];
                    f fVar = this.f73040a;
                    ComponentCallbacksC5392m componentCallbacksC5392m = null;
                    if (i11 == 1) {
                        L80.a.a("PINPADER_PERF", "showSplash SHOW");
                        FrameLayout frameLayout = fVar.f72994m;
                        if (frameLayout == null) {
                            Intrinsics.n("splashHolder");
                            throw null;
                        }
                        frameLayout.setAlpha(1.0f);
                        List<ComponentCallbacksC5392m> r02 = fVar.getSupportFragmentManager().r0();
                        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                        List<ComponentCallbacksC5392m> list = r02;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.d(((ComponentCallbacksC5392m) it.next()).getTag(), "OnboardingFragment")) {
                                    break;
                                }
                            }
                        }
                        OnboardingFragment onboardingFragment = new OnboardingFragment();
                        Q p11 = fVar.getSupportFragmentManager().p();
                        p11.b(R.id.splash_holder, onboardingFragment, "OnboardingFragment");
                        p11.i();
                    } else if (i11 == 2) {
                        L80.a.a("PINPADER_PERF", "showSplash HIDE");
                        if (fVar.g0().isStandAloneIntegration()) {
                            fVar.h0().a(new a.g(System.currentTimeMillis()));
                        }
                        H30.u.b(fVar);
                        H30.u.c(fVar);
                        List<ComponentCallbacksC5392m> r03 = fVar.getSupportFragmentManager().r0();
                        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
                        Iterator<T> it2 = r03.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            T next = it2.next();
                            if (Intrinsics.d(((ComponentCallbacksC5392m) next).getTag(), "OnboardingFragment")) {
                                componentCallbacksC5392m = next;
                                break;
                            }
                        }
                        ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m;
                        if (componentCallbacksC5392m2 != null) {
                            Q p12 = fVar.getSupportFragmentManager().p();
                            p12.q(componentCallbacksC5392m2);
                            p12.i();
                        }
                    } else if (i11 == 3) {
                        if (fVar.g0().isStandAloneIntegration()) {
                            fVar.h0().a(new a.g(System.currentTimeMillis()));
                        }
                        H30.u.b(fVar);
                        Window window = fVar.getWindow();
                        if (window != null) {
                            H30.u.d(window);
                        }
                        FrameLayout frameLayout2 = fVar.f72994m;
                        if (frameLayout2 == null) {
                            Intrinsics.n("splashHolder");
                            throw null;
                        }
                        frameLayout2.animate().alpha(0.0f).setDuration(350L).setListener(fVar.new n()).start();
                    } else if (i11 != 4) {
                        throw new Sc.o();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x0 x0Var, kotlin.coroutines.d dVar, f fVar) {
                super(2, dVar);
                this.f73038e = x0Var;
                this.f73039f = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f73038e, dVar, this.f73039f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73037d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C1223a c1223a = new C1223a(this.f73039f);
                    this.f73037d = 1;
                    if (this.f73038e.collect(c1223a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x0 x0Var, kotlin.coroutines.d dVar, f fVar) {
            super(2, dVar);
            this.f73035f = x0Var;
            this.f73036g = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new g(this.f73035f, dVar, this.f73036g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73033d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f73035f, null, this.f73036g);
                this.f73033d = 1;
                if (C5412d0.b(f.this, bVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$4", f = "BaseTabActivity.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73041d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f73043f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f73044g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$$inlined$observe$4$1", f = "BaseTabActivity.kt", l = {52}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73045d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f73046e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f73047f;

            /* renamed from: l80.f$h$a$a, reason: collision with other inner class name */
            public static final class C1224a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f73048a;

                public C1224a(f fVar) {
                    this.f73048a = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    boolean booleanValue = ((Boolean) t2).booleanValue();
                    f fVar = this.f73048a;
                    if (booleanValue) {
                        View view = fVar.f72993l;
                        if (view == null) {
                            Intrinsics.n("mainBack");
                            throw null;
                        }
                        view.animate().alpha(1.0f).setStartDelay(300L).setDuration(400L).start();
                    } else {
                        View view2 = fVar.f72993l;
                        if (view2 == null) {
                            Intrinsics.n("mainBack");
                            throw null;
                        }
                        view2.setAlpha(0.0f);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar) {
                super(2, dVar);
                this.f73046e = interfaceC2395h;
                this.f73047f = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f73046e, dVar, this.f73047f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73045d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C1224a c1224a = new C1224a(this.f73047f);
                    this.f73045d = 1;
                    if (this.f73046e.collect(c1224a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar) {
            super(2, dVar);
            this.f73043f = interfaceC2395h;
            this.f73044g = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new h(this.f73043f, dVar, this.f73044g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73041d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f73043f, null, this.f73044g);
                this.f73041d = 1;
                if (C5412d0.b(f.this, bVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$10", f = "BaseTabActivity.kt", l = {571}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73049d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f73051a;

            a(f fVar) {
                this.f73051a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Boolean bool = (Boolean) obj;
                if (Intrinsics.d(bool, Boolean.TRUE)) {
                    L80.a.a("PINPADER_OFF", "BasetabActivity forceRecreateAndOfflineFlow clear=" + bool);
                    f fVar = this.f73051a;
                    int i11 = f.f72971Z;
                    H30.k.b(new Oe.M(fVar, 2));
                    H30.k.a(new D90.h(fVar, 4));
                }
                return Unit.f71690a;
            }
        }

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new i(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73049d;
            if (i11 == 0) {
                Sc.s.b(obj);
                f fVar = f.this;
                C0 W11 = fVar.f0().W();
                if (W11 == null) {
                    return Unit.f71690a;
                }
                a aVar2 = new a(fVar);
                this.f73049d = 1;
                if (W11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$11", f = "BaseTabActivity.kt", l = {589}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73052d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f73054a;

            a(f fVar) {
                this.f73054a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                    f fVar = this.f73054a;
                    int i11 = f.f72971Z;
                    H30.k.b(new Oe.M(fVar, 2));
                    H30.k.a(new C5595b(fVar, 1));
                }
                return Unit.f71690a;
            }
        }

        j(kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new j(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73052d;
            if (i11 == 0) {
                Sc.s.b(obj);
                f fVar = f.this;
                C0 J11 = fVar.f0().J();
                if (J11 == null) {
                    return Unit.f71690a;
                }
                a aVar2 = new a(fVar);
                this.f73052d = 1;
                if (J11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$12", f = "BaseTabActivity.kt", l = {603}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73055d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f73057a;

            a(f fVar) {
                this.f73057a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Long l11 = (Long) obj;
                f fVar = this.f73057a;
                if (l11 != null) {
                    L80.a.a("RECREATE_FLOW", "recreateJob DOO timeout=" + l11);
                    fVar.f73007z = new Long(l11.longValue() + System.currentTimeMillis());
                    fVar.f72972A = l11;
                    fVar.e0().y1((int) (l11.longValue() / 1000));
                } else {
                    L80.a.a("RECREATE_FLOW", "recreateJob RESET timeout=" + l11);
                    fVar.f73007z = null;
                    fVar.f72972A = null;
                }
                return Unit.f71690a;
            }
        }

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new k(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73055d;
            if (i11 == 0) {
                Sc.s.b(obj);
                f fVar = f.this;
                C0 c02 = fVar.f0().c0();
                if (c02 == null) {
                    return Unit.f71690a;
                }
                a aVar2 = new a(fVar);
                this.f73055d = 1;
                if (c02.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* loaded from: classes3.dex */
    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public static final l f73058a = new l();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            dialogInterface.cancel();
        }
    }

    /* loaded from: classes3.dex */
    static final class m implements DialogInterface.OnClickListener {
        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            dialogInterface.cancel();
            f.this.j0().y0();
        }
    }

    /* loaded from: classes3.dex */
    public static final class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Object obj;
            f fVar = f.this;
            Intrinsics.checkNotNullParameter(animation, "animation");
            try {
                List<ComponentCallbacksC5392m> r02 = fVar.getSupportFragmentManager().r0();
                Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                Iterator<T> it = r02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.d(((ComponentCallbacksC5392m) obj).getTag(), "OnboardingFragment")) {
                            break;
                        }
                    }
                }
                ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
                if (componentCallbacksC5392m != null) {
                    Q p11 = fVar.getSupportFragmentManager().p();
                    p11.q(componentCallbacksC5392m);
                    p11.j();
                }
            } catch (Exception unused) {
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$onCreate$9", f = "BaseTabActivity.kt", l = {563}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73061d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f73063a;

            a(f fVar) {
                this.f73063a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                this.f73063a.c0((AppConfig) obj);
                return Unit.f71690a;
            }
        }

        o(kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new o(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73061d;
            if (i11 == 0) {
                Sc.s.b(obj);
                f fVar = f.this;
                x0<AppConfig> o11 = fVar.d0().o();
                a aVar2 = new a(fVar);
                this.f73061d = 1;
                if (o11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* loaded from: classes3.dex */
    public static final class p implements InterfaceC6794b {
        p() {
        }

        @Override // h30.InterfaceC6794b
        public final void a(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            L80.a.a("BaseTabActivity", "onOpenOneLinkFailure: link - " + link);
            f.this.e0().r();
        }

        @Override // h30.InterfaceC6794b
        public final void b(String str) {
            Ns.b.c("onOpenOneLinkSuccess: link - ", str, "BaseTabActivity");
            f fVar = f.this;
            if (str != null && fVar.r(str).e()) {
                fVar.k0(str, null);
            }
            fVar.e0().r();
        }
    }

    /* loaded from: classes3.dex */
    static final class q implements W, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ A90.g f73065a;

        q(A90.g function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f73065a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f73065a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final /* synthetic */ void onChanged(Object obj) {
            this.f73065a.invoke(obj);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$setBadge$1$1$1", f = "BaseTabActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class r extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Drawable, Drawable, kotlin.coroutines.d<? super Pair<? extends Drawable, ? extends Drawable>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Drawable f73066d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Drawable f73067e;

        r() {
            super(3, null);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(Drawable drawable, Drawable drawable2, kotlin.coroutines.d<? super Pair<? extends Drawable, ? extends Drawable>> dVar) {
            r rVar = new r(3, dVar);
            rVar.f73066d = drawable;
            rVar.f73067e = drawable2;
            return rVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return new Pair(this.f73066d, this.f73067e);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$setBadge$lambda$43$$inlined$observeWithoutRepeatOnLifeCycle$1", f = "BaseTabActivity.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73068d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f73069e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f73070f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f73071g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f.a f73072h;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f73073a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f73074b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f73075c;

            public a(f fVar, int i11, f.a aVar) {
                this.f73073a = fVar;
                this.f73074b = i11;
                this.f73075c = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                FintechBottomNavigationView b11;
                TabBadgeIconView tabBadgeIconView;
                Pair pair = (Pair) t2;
                f fVar = this.f73073a;
                l80.l lVar = fVar.f72997p;
                if (lVar != null && (b11 = lVar.b()) != null) {
                    Drawable drawable = (Drawable) pair.e();
                    Drawable drawable2 = (Drawable) pair.f();
                    fVar.getClass();
                    if (drawable != null) {
                        ViewGroup viewGroup = (ViewGroup) b11.findViewById(this.f73074b);
                        if (viewGroup != null) {
                            tabBadgeIconView = (TabBadgeIconView) viewGroup.findViewById(R.id.tab_icon_badge);
                            if (tabBadgeIconView == null) {
                                Context context = viewGroup.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                TabBadgeIconView tabBadgeIconView2 = new TabBadgeIconView(context, null, 0, 6, null);
                                tabBadgeIconView2.setId(R.id.tab_icon_badge);
                                viewGroup.addView(tabBadgeIconView2);
                                ViewGroup.LayoutParams layoutParams = tabBadgeIconView2.getLayoutParams();
                                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                layoutParams2.height = E30.f.a();
                                layoutParams2.width = E30.f.a();
                                layoutParams2.gravity = 8388661;
                                layoutParams2.setMargins(0, E30.f.i(), E30.f.f(), 0);
                                tabBadgeIconView2.setLayoutParams(layoutParams2);
                                tabBadgeIconView = tabBadgeIconView2;
                            }
                        } else {
                            tabBadgeIconView = null;
                        }
                        if (tabBadgeIconView != null) {
                            tabBadgeIconView.bindState(new TabBadgeIconState(drawable, drawable2));
                            if (this.f73075c == f.a.SCALE) {
                                Animation loadAnimation = AnimationUtils.loadAnimation(tabBadgeIconView.getContext(), R.anim.fin_icon_badge_animation);
                                loadAnimation.setInterpolator(new OvershootInterpolator());
                                tabBadgeIconView.setVisibility(0);
                                tabBadgeIconView.startAnimation(loadAnimation);
                            } else {
                                TransitionManager.beginDelayedTransition(b11, new Fade());
                                ViewGroup.LayoutParams layoutParams3 = tabBadgeIconView.getLayoutParams();
                                if (layoutParams3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                layoutParams3.height = E30.f.a();
                                layoutParams3.width = E30.f.a();
                                tabBadgeIconView.setLayoutParams(layoutParams3);
                                tabBadgeIconView.setVisibility(0);
                            }
                        }
                    }
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, f fVar, int i11, f.a aVar) {
            super(2, dVar);
            this.f73069e = interfaceC2395h;
            this.f73070f = fVar;
            this.f73071g = i11;
            this.f73072h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new s(this.f73069e, dVar, this.f73070f, this.f73071g, this.f73072h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73068d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f73070f, this.f73071g, this.f73072h);
                this.f73068d = 1;
                if (this.f73069e.collect(aVar2, this) == aVar) {
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

    /* loaded from: classes3.dex */
    public static final class t implements InterfaceC2395h<Pair> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f73076a;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f73077a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabActivity$setBadge$lambda$43$lambda$41$$inlined$map$1$2", f = "BaseTabActivity.kt", l = {223}, m = "emit")
            /* renamed from: l80.f$t$a$a, reason: collision with other inner class name */
            public static final class C1225a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f73078d;

                /* renamed from: e, reason: collision with root package name */
                int f73079e;

                public C1225a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f73078d = obj;
                    this.f73079e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i) {
                this.f73077a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1225a c1225a;
                int i11;
                if (dVar instanceof C1225a) {
                    c1225a = (C1225a) dVar;
                    int i12 = c1225a.f73079e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1225a.f73079e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1225a.f73078d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1225a.f73079e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            Pair pair = new Pair((Drawable) obj, null);
                            c1225a.f73079e = 1;
                            if (this.f73077a.emit(pair, c1225a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1225a = new C1225a(dVar);
                Object obj22 = c1225a.f73078d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1225a.f73079e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public t(InterfaceC2395h interfaceC2395h) {
            this.f73076a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Pair> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = ((AbstractC2635g) this.f73076a).collect(new a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class u extends AbstractC7737t implements Function0<A0> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return f.this.getViewModelStore();
        }
    }

    /* loaded from: classes3.dex */
    public static final class v extends AbstractC7737t implements Function0<AbstractC6409a> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return f.this.getDefaultViewModelCreationExtras();
        }
    }

    public f() {
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new h.k(), new InterfaceC6590b() { // from class: l80.c
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                C6589a result = (C6589a) obj;
                int i11 = f.f72971Z;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.b() != -1) {
                    f fVar = f.this;
                    K40.a aVar = fVar.f72981J;
                    if (aVar == null) {
                        Intrinsics.n("cbottomDisplay");
                        throw null;
                    }
                    if (aVar == null) {
                        Intrinsics.n("cbottomDisplay");
                        throw null;
                    }
                    K40.b creator = aVar.creator();
                    String string = fVar.getString(R.string.update_finish_with_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    aVar.g(K40.b.b(creator, string, 0, 30), CbottomType.SNACK, "BaseTabActivity", null);
                }
            }
        }), "registerForActivityResult(...)");
        this.f72988Q = R.id.global_navigation;
        this.f72989R = R.id.goto_global_action;
        this.f72990S = Integer.valueOf(R.id.over_fragment_top);
    }

    public static Unit M(f fVar) {
        l80.l lVar;
        FintechBottomNavigationView b11;
        Menu menu;
        fVar.getClass();
        L80.a.a("TABSFLOW", "actuallyMakeRestart 1");
        l80.l lVar2 = new l80.l(fVar, 0);
        fVar.f72997p = lVar2;
        lVar2.e(Float.valueOf(f72970Y));
        FrameLayout frameLayout = fVar.f72992k;
        if (frameLayout == null) {
            Intrinsics.n("topLayoutView");
            throw null;
        }
        int childCount = frameLayout.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            FrameLayout frameLayout2 = fVar.f72992k;
            if (frameLayout2 == null) {
                Intrinsics.n("topLayoutView");
                throw null;
            }
            View childAt = frameLayout2.getChildAt(i12);
            View view = fVar.f72993l;
            if (view == null) {
                Intrinsics.n("mainBack");
                throw null;
            }
            if (Intrinsics.d(childAt, view)) {
                FrameLayout frameLayout3 = fVar.f72992k;
                if (frameLayout3 == null) {
                    Intrinsics.n("topLayoutView");
                    throw null;
                }
                i11 = Math.min(frameLayout3.getChildCount(), i12 + 1);
            }
        }
        FrameLayout frameLayout4 = fVar.f72992k;
        if (frameLayout4 == null) {
            Intrinsics.n("topLayoutView");
            throw null;
        }
        frameLayout4.addView(fVar.f72997p, i11);
        C7665d it = new IntRange(0, 4, 1).iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            it.b();
            int i15 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            int i16 = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? 0 : R.navigation.tab4 : R.navigation.tab3 : R.navigation.tab2 : R.navigation.tab1 : R.navigation.tab0;
            if (i14 < 5 && (lVar = fVar.f72997p) != null && (b11 = lVar.b()) != null && (menu = b11.getMenu()) != null) {
                menu.add(0, i16, i14, Ej.b.a(i13, "TAB"));
                i14++;
            }
            i13 = i15;
        }
        androidx.lifecycle.D a11 = K.a(fVar);
        AbstractC5434v lifecycle = fVar.getLifecycle();
        l80.l lVar3 = fVar.f72997p;
        FintechBottomNavigationView b12 = lVar3 != null ? lVar3.b() : null;
        Intrinsics.f(b12);
        ArrayList arrayList = fVar.f72973B;
        G supportFragmentManager = fVar.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        C7308a c7308a = fVar.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        Y80.k kVar = new Y80.k(b12, a11, lifecycle, arrayList, supportFragmentManager, c7308a.Z0(), new l80.e(fVar), new C7894a(fVar));
        kVar.x();
        kVar.l();
        kVar.o().observe(fVar, new q(new A90.g(fVar, 1)));
        fVar.f72996o = kVar.o().getValue();
        fVar.f72987P = kVar;
        AppConfig n11 = fVar.d0().n();
        if (n11 != null) {
            fVar.c0(n11);
        }
        fVar.f0().V(new G30.a(fVar, 5));
        fVar.j0().m0();
        return Unit.f71690a;
    }

    public static Unit N(f fVar) {
        L80.a.a("TABSFLOW", "makeClear");
        fVar.f0().z(null);
        C7308a c7308a = fVar.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        c7308a.O();
        C7308a c7308a2 = fVar.f73002u;
        if (c7308a2 == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        c7308a2.W0();
        Y80.k kVar = fVar.f72987P;
        if (kVar != null) {
            kVar.k();
        }
        H30.k.a(new Ca.h(fVar, 5));
        l80.l lVar = fVar.f72997p;
        if (lVar != null) {
            int childCount = lVar.d().getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View a11 = C5316f0.a(lVar.d(), i11);
                FintechWebView fintechWebView = a11 instanceof FintechWebView ? (FintechWebView) a11 : null;
                if (fintechWebView != null) {
                    fintechWebView.onDestroy();
                }
            }
            ViewParent parent = lVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setLayoutTransition(null);
                viewGroup.removeView(lVar);
            }
        }
        l80.l lVar2 = fVar.f72997p;
        if (lVar2 != null) {
            ViewParent parent2 = lVar2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(null);
                viewGroup2.removeView(lVar2);
            }
        }
        fVar.f72997p = null;
        fVar.f72996o = null;
        fVar.d0().m();
        if (fVar.g0().isStandAloneIntegration()) {
            fVar.g0().w();
        }
        return Unit.f71690a;
    }

    public static Unit O(f fVar, C2584m c2584m) {
        fVar.f72996o = c2584m;
        if (c2584m != null) {
            c2584m.p(new C7895b(fVar));
        }
        return Unit.f71690a;
    }

    public static void P(f fVar, C2584m c2584m, H destination, Bundle bundle) {
        FintechBottomNavigationView b11;
        Intrinsics.checkNotNullParameter(c2584m, "<unused var>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        fVar.getClass();
        e.b bVar = destination instanceof e.b ? (e.b) destination : null;
        if (bVar != null && kotlin.text.h.t(bVar.A(), "TabNewWebViewFragment", false)) {
            l80.l lVar = fVar.f72997p;
            if (lVar == null || (b11 = lVar.b()) == null) {
                return;
            }
            b11.post(new V(fVar, 6));
            return;
        }
        if (Intrinsics.d(destination.n(), "dialog") || destination.m() == R.id.global_open_preferences) {
            return;
        }
        if (bundle != null && bundle.getBoolean(CameraFragment.NO_BOTTOM_TABS)) {
            fVar.a(true);
            return;
        }
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.m() == R.id.global_open_onboarding || destination.m() == R.id.global_open_sharing_files || destination.m() == R.id.global_open_updatewall) {
            fVar.a(true);
            return;
        }
        C7308a c7308a = fVar.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        if (c7308a.a1(destination.m())) {
            return;
        }
        fVar.s(true);
    }

    public static Unit Q(f fVar, String selectedTag, String selectedName, String fromTag, String fromName, int i11) {
        Intrinsics.checkNotNullParameter(selectedTag, "selectedTag");
        Intrinsics.checkNotNullParameter(selectedName, "selectedName");
        Intrinsics.checkNotNullParameter(fromTag, "fromTag");
        Intrinsics.checkNotNullParameter(fromName, "fromName");
        fVar.e0().h1(i11, selectedName, selectedTag, fromName, fromTag);
        fVar.j0().x0(((Boolean) fVar.f73001t.getOrDefault(fVar.f0().K0(), Boolean.FALSE)).booleanValue());
        return Unit.f71690a;
    }

    public static Unit R(f fVar) {
        fVar.l0(false);
        return Unit.f71690a;
    }

    public static WindowInsets S(f fVar, View v11, WindowInsets insets) {
        int i11;
        int i12;
        int statusBars;
        Insets insets2;
        int navigationBars;
        Insets insets3;
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        L30.k.c(insets);
        if (Build.VERSION.SDK_INT >= 31) {
            statusBars = WindowInsets.Type.statusBars();
            insets2 = insets.getInsets(statusBars);
            i11 = insets2.top;
            navigationBars = WindowInsets.Type.navigationBars();
            insets3 = insets.getInsets(navigationBars);
            i12 = insets3.bottom;
        } else {
            i11 = 0;
            i12 = 0;
        }
        L30.j.g(i11);
        L30.j.h(f72969X);
        L30.j.f(i12);
        L30.j.e(fVar, fVar.getF96341r0());
        return v11.onApplyWindowInsets(insets);
    }

    private final void a0(int i11, int i12, boolean z11) {
        FintechBottomNavigationView b11;
        FintechBottomNavigationView b12;
        FintechBottomNavigationView b13;
        FragmentContainerView c11;
        FintechBottomNavigationView b14;
        ViewPropertyAnimator animate;
        FintechBottomNavigationView b15;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        FintechBottomNavigationView b16;
        ViewPropertyAnimator animate3;
        FragmentContainerView c12;
        FintechBottomNavigationView b17;
        float f7 = i12 == 0 ? 1.0f : 0.0f;
        l80.l lVar = this.f72997p;
        if (lVar != null && (b17 = lVar.b()) != null) {
            b17.setVisibility(0);
        }
        if (z11) {
            l80.l lVar2 = this.f72997p;
            if (lVar2 != null && (c12 = lVar2.c()) != null) {
                c12.setPadding(0, 0, 0, i11);
            }
            FrameLayout j11 = j();
            if (j11 != null) {
                j11.setPadding(0, 0, 0, i11);
            }
            long j12 = i12 == 0 ? 110L : 220L;
            l80.l lVar3 = this.f72997p;
            if (lVar3 != null && (b16 = lVar3.b()) != null && (animate3 = b16.animate()) != null) {
                animate3.cancel();
            }
            l80.l lVar4 = this.f72997p;
            if (lVar4 == null || (b15 = lVar4.b()) == null || (animate2 = b15.animate()) == null || (translationY = animate2.translationY(i12)) == null || (alpha = translationY.alpha(f7)) == null || (duration = alpha.setDuration(j12)) == null || (interpolator = duration.setInterpolator(new DecelerateInterpolator())) == null || (listener = interpolator.setListener(new b(i12))) == null) {
                return;
            }
            listener.start();
            return;
        }
        l80.l lVar5 = this.f72997p;
        if (lVar5 != null && (b14 = lVar5.b()) != null && (animate = b14.animate()) != null) {
            animate.cancel();
        }
        l80.l lVar6 = this.f72997p;
        if (lVar6 != null && (c11 = lVar6.c()) != null) {
            c11.setPadding(0, 0, 0, i11);
        }
        FrameLayout j13 = j();
        if (j13 != null) {
            j13.setPadding(0, 0, 0, i11);
        }
        l80.l lVar7 = this.f72997p;
        if (lVar7 != null && (b13 = lVar7.b()) != null) {
            b13.setTranslationY(i12);
        }
        l80.l lVar8 = this.f72997p;
        if (lVar8 != null && (b12 = lVar8.b()) != null) {
            b12.setAlpha(f7);
        }
        l80.l lVar9 = this.f72997p;
        if (lVar9 == null || (b11 = lVar9.b()) == null) {
            return;
        }
        b11.setVisibility(i12 != 0 ? 8 : 0);
    }

    private final void b0() {
        Intent intent = getIntent();
        if ((intent != null ? intent.getExtras() : null) != null) {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                intent2.removeExtra("android-support-nav:controller:deepLinkExtras");
            }
            Intent intent3 = getIntent();
            if (intent3 != null) {
                intent3.removeExtra("android-support-nav:controller:deepLinkIds");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(AppConfig appConfig) {
        FintechBottomNavigationView b11;
        Menu menu;
        if (appConfig != null) {
            Integer G11 = f0().G();
            int intValue = G11 != null ? G11.intValue() : 0;
            C7665d it = new IntRange(0, 4, 1).iterator();
            while (it.hasNext()) {
                int b12 = it.b();
                l80.l lVar = this.f72997p;
                MenuItem item = (lVar == null || (b11 = lVar.b()) == null || (menu = b11.getMenu()) == null) ? null : menu.getItem(b12);
                AppConfigTab appConfigTab = (AppConfigTab) C7714v.Q(b12, appConfig.getTabs());
                if (item != null) {
                    if (appConfigTab != null) {
                        item.setVisible(true);
                        item.setTitle(appConfigTab.getName());
                        C10727i.c(K.a(this), null, null, new c(j0().n0(appConfigTab.getIconSrc(), appConfigTab.getIcon()), null, item), 3);
                    } else {
                        item.setVisible(false);
                    }
                }
            }
            if (intValue >= appConfig.getTabs().size()) {
                f0().x(appConfig.getTabs().size() - 1, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(boolean z11) {
        L80.a.a("TABSFLOW", "makeRestart");
        H30.k.b(new F70.c(this, z11));
    }

    @Override // I30.a
    public final void a(boolean z11) {
        C7308a c7308a = this.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        c7308a.b1();
        a0(0, f72970Y, z11);
    }

    @Override // androidx.appcompat.app.g, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(l80.h.a(context, getF96341r0()));
    }

    @Override // Y80.l
    public final Activity c() {
        return this;
    }

    @Override // Y80.l
    @NotNull
    public final Map<Integer, List<ComponentCallbacksC5392m>> d() {
        Y80.k kVar = this.f72987P;
        return kVar != null ? kVar.m() : U.c();
    }

    @NotNull
    public final Q90.c d0() {
        Q90.c cVar = this.f73004w;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("featureToggles");
        throw null;
    }

    @Override // Y80.l
    @NotNull
    public final Integer e() {
        return Integer.valueOf(this.f72989R);
    }

    @NotNull
    public final InterfaceC6618a e0() {
        InterfaceC6618a interfaceC6618a = this.f73003v;
        if (interfaceC6618a != null) {
            return interfaceC6618a;
        }
        Intrinsics.n("fintechAnalyticInteractor");
        throw null;
    }

    @Override // Y80.l
    public final B f() {
        return K.a(this);
    }

    @NotNull
    public final S80.b f0() {
        S80.b bVar = this.f72976E;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("fintechNavigation");
        throw null;
    }

    @Override // Y80.l
    /* renamed from: g, reason: from getter */
    public final int getF72988Q() {
        return this.f72988Q;
    }

    @NotNull
    public final ru.ozon.fintech.settings.domain.a g0() {
        ru.ozon.fintech.settings.domain.a aVar = this.f72977F;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("fintechSettings");
        throw null;
    }

    @NotNull
    public final S60.a h0() {
        S60.a aVar = this.f72983L;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("metrixInteractor");
        throw null;
    }

    @Override // I30.d
    public final void i() {
        this.f72991j = true;
    }

    @NotNull
    public Intent i0() {
        return new Intent(getApplication(), getClass());
    }

    @Override // I30.c
    public final FrameLayout j() {
        l80.l lVar = this.f72997p;
        if (lVar != null) {
            return lVar.d();
        }
        return null;
    }

    @NotNull
    public l80.g j0() {
        return (l80.g) this.f72974C.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r10 = r8.f72997p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r10 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r10 = r10.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r10 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r4 = (android.view.ViewGroup) r10.findViewById(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        android.transition.TransitionManager.beginDelayedTransition(r10, new android.transition.Fade());
        r10 = (android.widget.TextView) r4.findViewById(ru.ozon.app.android.R.id.menuItemBadge);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r10 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        r10.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r10 = (ru.ozon.fintech.ui.badge.TabBadgeIconView) r4.findViewById(ru.ozon.app.android.R.id.tab_icon_badge);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r10 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        r10.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r9 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r13 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        r9 = j0().n0(r13, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r14 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        r10 = j0().n0(r14, null);
        r12 = new Be.q(r10, r9, new l80.f.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        xe.C10727i.c(androidx.lifecycle.K.a(r8), null, null, new l80.f.s(r12, null, r8, r6, r15), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        r12 = new l80.f.t(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        if (r9 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        r9 = r8.f72997p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        if (r9 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        r9 = r9.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        if (r9 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
    
        r10 = (android.view.ViewGroup) r9.findViewById(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
    
        if (r10 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
    
        r13 = r10.findViewById(ru.ozon.app.android.R.id.menuItemBadge);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        if (r13 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        android.transition.TransitionManager.beginDelayedTransition(r9, new android.transition.Fade());
        android.view.LayoutInflater.from(r10.getContext()).inflate(ru.ozon.app.android.R.layout.fintech_bottom_bar_badge, r10, true);
        r13 = r10.findViewById(ru.ozon.app.android.R.id.menuItemBadge);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        if (r11 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0124, code lost:
    
        r10 = ((android.widget.TextView) r13).getBackground();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if ((r10 instanceof android.graphics.drawable.GradientDrawable) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        r0 = (android.graphics.drawable.GradientDrawable) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        r10 = ru.ozon.uni.android.uikit.common.StyleParser.INSTANCE;
        r14 = getBaseContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "getBaseContext(...)");
        r0.setColor(r10.parseColor(r14, r11, ru.ozon.app.android.R.color.oz_text_negative));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r0 = (android.widget.TextView) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        if (r12.length() != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        r10 = r9.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.dimen_12);
        r12 = r9.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.dimen_12);
        r13 = r9.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.dimen_24);
        r14 = r0.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        if (r14 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r14 = (android.view.ViewGroup.MarginLayoutParams) r14;
        r14.height = r10;
        r14.width = r12;
        r14.setMarginEnd(r13);
        r0.setLayoutParams(r14);
        r0.setText("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b7, code lost:
    
        if (r0.getVisibility() != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ba, code lost:
    
        android.transition.TransitionManager.beginDelayedTransition(r9, new android.transition.Fade());
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c7, code lost:
    
        if (r15 != I30.f.a.SCALE) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c9, code lost:
    
        r9 = android.view.animation.AnimationUtils.loadAnimation(r0.getContext(), ru.ozon.app.android.R.anim.fin_icon_badge_animation);
        r9.setInterpolator(new android.view.animation.OvershootInterpolator());
        r0.setVisibility(0);
        r0.startAnimation(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0192, code lost:
    
        r10 = r9.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.fintech_dimen_18);
        r13 = r0.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
    
        if (r13 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a3, code lost:
    
        r13 = (android.view.ViewGroup.MarginLayoutParams) r13;
        r13.height = -2;
        r13.width = -2;
        r13.setMarginEnd(r10);
        r0.setLayoutParams(r13);
        r0.setText(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e8, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x007e, code lost:
    
        if (r9 == false) goto L31;
     */
    @Override // I30.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z11, @NotNull String appConfigId, String str, @NotNull String text, String str2, String str3, f.a aVar) {
        int i11;
        FintechBottomNavigationView b11;
        KeyEvent.Callback callback;
        List<AppConfigTab> tabs;
        Intrinsics.checkNotNullParameter(appConfigId, "appConfigId");
        Intrinsics.checkNotNullParameter(text, "text");
        AppConfig n11 = d0().n();
        if (n11 != null && (tabs = n11.getTabs()) != null) {
            Iterator<AppConfigTab> it = tabs.iterator();
            i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.d(it.next().getId(), appConfigId)) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            i11 = 0;
        }
        Integer Z11 = f0().Z(f0().q0(i11));
        if (Z11 == null) {
            return;
        }
        int intValue = Z11.intValue();
        l80.l lVar = this.f72997p;
        TextView textView = null;
        GradientDrawable gradientDrawable = null;
        if (lVar != null && (b11 = lVar.b()) != null) {
            ViewGroup viewGroup = (ViewGroup) b11.findViewById(intValue);
            if (viewGroup != null) {
                KeyEvent.Callback callback2 = (TextView) viewGroup.findViewById(R.id.menuItemBadge);
                callback = callback2;
                if (callback2 == null) {
                    callback = b11.findViewById(R.id.tab_icon_badge);
                }
            } else {
                callback = null;
            }
        }
    }

    public final void k0(String url, Intent intent) {
        Pattern pattern;
        String host;
        Uri data = intent != null ? intent.getData() : null;
        if (url == null && data == null) {
            return;
        }
        if (url == null) {
            url = data != null ? data.toString() : null;
            if (url == null) {
                return;
            }
        }
        L80.a.a("TABSFLOW", "handleDeepLink url=".concat(url));
        if (g0().u() && g0().isStandAloneIntegration() && R80.v.a(url).e()) {
            Map<String, String> c11 = R80.v.a(url).c();
            String str = c11.get("phone");
            if (str == null) {
                str = "";
            }
            String str2 = c11.get("otp");
            String str3 = str2 != null ? str2 : "";
            String str4 = c11.get("otpId");
            Long valueOf = str4 != null ? Long.valueOf(Long.parseLong(str4)) : null;
            Ib.a<InterfaceC5773a> aVar = this.f72984M;
            if (aVar == null) {
                Intrinsics.n("testEnvironmentManagerLazy");
                throw null;
            }
            InterfaceC5773a interfaceC5773a = aVar.get();
            String str5 = c11.get("login");
            if (str5 != null) {
                interfaceC5773a.g(str5);
            }
            String str6 = c11.get("password");
            if (str6 != null) {
                interfaceC5773a.a(str6);
            }
            A30.m mVar = this.f72978G;
            if (mVar != null) {
                mVar.k(str, str3, valueOf != null ? valueOf.longValue() : -1L);
                return;
            } else {
                Intrinsics.n("fintechAuthInteractor");
                throw null;
            }
        }
        if (data != null && (host = data.getHost()) != null && kotlin.text.h.t(host, "onelink", false)) {
            e0().d1(intent);
            return;
        }
        if (g0().isQa()) {
            Ib.a<InterfaceC5773a> aVar2 = this.f72984M;
            if (aVar2 == null) {
                Intrinsics.n("testEnvironmentManagerLazy");
                throw null;
            }
            if (aVar2.get().canHandle(data)) {
                f0().n0();
                return;
            }
        }
        if (g0().isQa()) {
            String uri = data != null ? data.toString() : null;
            if (R80.v.b(uri != null ? uri : "").e()) {
                C10727i.c(K.a(this), null, null, new d(null), 3);
                return;
            }
        }
        R80.b r11 = r(url);
        if (!r11.e()) {
            L80.a.b("BaseTabActivity", "Can't handle deep link: ".concat(url));
            e0().c1(url, url);
            return;
        }
        if (f0().U() instanceof CameraFragment) {
            g.a aVar3 = R80.g.f24802d;
            Intrinsics.checkNotNullParameter(url, "url");
            R80.b g10 = R80.c.g(R80.c.i(url), "https");
            String[] elements = {"finance.ozon.ru", "finance.ozonru.me"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            R80.b c12 = R80.c.c(g10, C7705l.j0(elements));
            pattern = R80.g.f24809k;
            if (R80.c.f(c12, pattern).e()) {
                f0().pop();
            }
        }
        L80.a.a("TABSFLOW", "handleDeepLink = " + r11.d());
        String valueOf2 = String.valueOf(r11.d());
        f0();
        x0<String> L11 = f0().L();
        if (L11 != null) {
            L11.setValue(valueOf2);
        }
        d0().A(valueOf2);
        e0().c1(url, valueOf2);
    }

    @Override // I30.e
    public final void l(int i11, @NotNull String tabId, boolean z11) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        this.f73001t.put(Integer.valueOf(i11), Boolean.valueOf(z11));
        j0().x0(((Boolean) this.f73001t.getOrDefault(f0().K0(), Boolean.FALSE)).booleanValue());
    }

    @Override // Y80.l
    /* renamed from: o, reason: from getter */
    public final Integer getF72990S() {
        return this.f72990S;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        int i11;
        int i12;
        int statusBars;
        Insets insets;
        int navigationBars;
        Insets insets2;
        super.onAttachedToWindow();
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        if (Build.VERSION.SDK_INT >= 31) {
            statusBars = WindowInsets.Type.statusBars();
            insets = rootWindowInsets.getInsets(statusBars);
            i11 = insets.top;
            navigationBars = WindowInsets.Type.navigationBars();
            insets2 = rootWindowInsets.getInsets(navigationBars);
            i12 = insets2.bottom;
        } else {
            i11 = 0;
            i12 = 0;
        }
        L30.j.g(i11);
        L30.j.h(D.c(56.0f));
        L30.j.f(i12);
        if (!g0().isStandAloneIntegration()) {
            H30.u.b(this);
            H30.u.c(this);
        }
        b0();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    @InterfaceC3999a
    public final void onBackPressed() {
        C7308a c7308a = this.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        if (c7308a.j1()) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r8.containsKey("needRecreateOnStart") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r8.containsKey("recreateTimeoutMs") != false) goto L14;
     */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle bundle) {
        Long l11;
        Long l12;
        L80.a.a("TABSFLOW", "BaseTabActivity onCreate pre super intent.data=" + getIntent().getData());
        if (bundle != null) {
            l11 = Long.valueOf(bundle.getLong("needRecreateOnStart"));
        }
        l11 = null;
        this.f73007z = l11;
        if (bundle != null) {
            l12 = Long.valueOf(bundle.getLong("recreateTimeoutMs"));
        }
        l12 = null;
        this.f72972A = l12;
        h0().a(new a.f(g0().isStandAloneIntegration() ? 0L : System.currentTimeMillis()));
        h0().a(new a.C0533a(System.currentTimeMillis()));
        boolean z11 = (bundle == null || getIntent().getData() == null) ? false : true;
        L80.a.a("TABSFLOW", "BaseTabActivity onCreate fintechNavigation.intentHandled=" + f0().o());
        if (!f0().o() && !z11) {
            k0(null, getIntent());
        }
        if (H30.e.e(this, W30.a.a(this, getF96341r0()))) {
            e0().e(Boolean.valueOf(!H30.e.d(this)));
        }
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        T80.b bVar = this.f72979H;
        if (bVar == null) {
            Intrinsics.n("externalFintechNavigation");
            throw null;
        }
        C7308a c7308a = new C7308a(application, bVar, e0());
        this.f73002u = c7308a;
        c7308a.k1(this);
        S80.b f02 = f0();
        C7308a c7308a2 = this.f73002u;
        if (c7308a2 == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        f02.K(c7308a2);
        S80.b f03 = f0();
        C7308a c7308a3 = this.f73002u;
        if (c7308a3 == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        f03.g0(c7308a3);
        Q90.n nVar = this.f72985N;
        if (nVar == null) {
            Intrinsics.n("ultraManager");
            throw null;
        }
        if (nVar.d() && 2 != g0().k()) {
            e0().b0(2);
            g0().D(2);
            androidx.appcompat.app.j.L(2);
        }
        e0().w(this.f73006y);
        ru.ozon.fintech.settings.domain.a g02 = g0();
        S80.b f04 = f0();
        Q90.n nVar2 = this.f72985N;
        if (nVar2 == null) {
            Intrinsics.n("ultraManager");
            throw null;
        }
        l80.k.a(this, g02, f04, nVar2);
        L80.a.a("TABSFLOW", "BaseTabActivity onCreate PRE super");
        if (Build.VERSION.SDK_INT >= 31) {
            androidx.activity.t.a(this);
        }
        super.onCreate(null);
        if (g0().getGlobalFlagSecured()) {
            getWindow().setFlags(8192, 8192);
        }
        Window window = getWindow();
        if (window != null) {
            H30.u.a(window, g0().isStandAloneIntegration());
        }
        L80.a.a("TABSFLOW", "BaseTabActivity onCreate POST super");
        h0().d(L30.n.a());
        overridePendingTransition(0, 0);
        setContentView(R.layout.base_tab_activity);
        this.f72995n = (OverFragment) ((FragmentContainerView) findViewById(R.id.over_host_fragment)).b();
        this.f72993l = findViewById(R.id.main_activity_back);
        this.f72992k = (FrameLayout) findViewById(R.id.main_activity_top);
        this.f72994m = (FrameLayout) findViewById(R.id.splash_holder);
        View view = this.f72993l;
        if (view == null) {
            Intrinsics.n("mainBack");
            throw null;
        }
        view.setAlpha(0.0f);
        View findViewById = findViewById(R.id.off);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((Button) findViewById).setOnClickListener(new Cw.b(this, 11));
        C10727i.c(K.a(this), null, null, new e(j0().k0(), null, this), 3);
        if (g0().isStandAloneIntegration()) {
            C10727i.c(K.a(this), null, null, new C1221f(j0().l0(), null, this), 3);
        }
        getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l80.d
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return f.S(f.this, view2, windowInsets);
            }
        });
        x0<c.b> j11 = f0().j();
        if (j11 != null) {
            C10727i.c(K.a(this), null, null, new g(j11, null, this), 3);
        }
        C10727i.c(K.a(this), null, null, new h(j0().j0(), null, this), 3);
        C6875a c6875a = this.f72982K;
        if (c6875a == null) {
            Intrinsics.n("analyticContext");
            throw null;
        }
        c6875a.a();
        l0(true);
        l80.g j02 = j0();
        getIntent();
        j02.r0();
        C10727i.c(K.a(this), null, null, new o(null), 3);
        C10727i.c(K.a(this), null, null, new i(null), 3);
        C10727i.c(K.a(this), null, null, new j(null), 3);
        C10727i.c(K.a(this), null, null, new k(null), 3);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        L80.a.a("TABSFLOW", "BaseTabActivity onDestroy");
        C7308a c7308a = this.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        c7308a.M0(this);
        j0().s0(this);
        if (this.f72991j) {
            startActivity(i0());
        }
        super.onDestroy();
    }

    @Override // E30.a, androidx.appcompat.app.g, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        Integer num;
        if (g0().isQa() || g0().isForceStage()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (i11 == 24 && (num = this.f72998q) != null && num.intValue() == 24) {
                Long l11 = this.f72999r;
                if (currentTimeMillis - (l11 != null ? l11.longValue() : 0L) < 300) {
                    Long l12 = this.f73000s;
                    if (currentTimeMillis - (l12 != null ? l12.longValue() : 0L) > 3000) {
                        this.f73000s = Long.valueOf(currentTimeMillis);
                        ru.ozon.fintech.features.tabber.presentation.preferences.a.a(getF96341r0(), f0(), this);
                    }
                }
            }
            this.f72998q = Integer.valueOf(i11);
            this.f72999r = Long.valueOf(currentTimeMillis);
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        L80.a.a("TABSFLOW", "onNewIntent intent.data " + (intent != null ? intent.getData() : null));
        super.onNewIntent(intent);
        b0();
        f0().I0(false);
        k0(null, intent);
        j0().t0(this);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected final void onResume() {
        super.onResume();
        h80.b bVar = this.f72986O;
        if (bVar != null) {
            bVar.b(this);
        } else {
            Intrinsics.n("ultraAndPermissionAnalytics");
            throw null;
        }
    }

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    protected final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Long l11 = this.f73007z;
        if (l11 != null) {
            outState.putLong("needRecreateOnStart", l11.longValue());
        }
        Long l12 = this.f72972A;
        if (l12 != null) {
            outState.putLong("recreateTimeoutMs", l12.longValue());
        }
        j0().u0(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onStart() {
        overridePendingTransition(0, 0);
        S80.b f02 = f0();
        C7308a c7308a = this.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        f02.K(c7308a);
        S80.b f03 = f0();
        C7308a c7308a2 = this.f73002u;
        if (c7308a2 == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        f03.g0(c7308a2);
        L80.a.a("RECREATE_FLOW", "onStart needRecreateOnStart=" + this.f73007z);
        long currentTimeMillis = System.currentTimeMillis();
        Long l11 = this.f73007z;
        if (currentTimeMillis > (l11 != null ? l11.longValue() : Long.MAX_VALUE)) {
            L80.a.a("RECREATE_FLOW", "onStart DO RECREATE");
            Long l12 = this.f72972A;
            if (l12 != null) {
                e0().W0((int) (l12.longValue() / 1000));
            }
            A30.m mVar = this.f72978G;
            if (mVar == null) {
                Intrinsics.n("fintechAuthInteractor");
                throw null;
            }
            mVar.D(true);
            d0().y(true);
            H30.k.b(new Oe.M(this, 2));
            H30.k.a(new F70.a(this, 2));
        }
        this.f73007z = null;
        this.f72972A = null;
        List<ComponentCallbacksC5392m> A02 = f0().A0();
        if (A02 != null) {
            for (ComponentCallbacksC5392m componentCallbacksC5392m : A02) {
                if (componentCallbacksC5392m instanceof FintechWebViewFragmentBase) {
                    ((FintechWebViewFragmentBase) componentCallbacksC5392m).Q();
                }
            }
        }
        j0().v0(this);
        ComponentCallbacksC5392m U10 = f0().U();
        FintechWebViewFragmentBase fintechWebViewFragmentBase = U10 instanceof FintechWebViewFragmentBase ? (FintechWebViewFragmentBase) U10 : null;
        if (fintechWebViewFragmentBase != null) {
            fintechWebViewFragmentBase.K();
        }
        super.onStart();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onStop() {
        List<ComponentCallbacksC5392m> A02 = f0().A0();
        if (A02 != null) {
            for (ComponentCallbacksC5392m componentCallbacksC5392m : A02) {
                if (componentCallbacksC5392m instanceof FintechWebViewFragmentBase) {
                    ((FintechWebViewFragmentBase) componentCallbacksC5392m).R();
                }
            }
        }
        super.onStop();
        j0().w0(this);
        e0().L();
        InterfaceC9791a interfaceC9791a = this.f72980I;
        if (interfaceC9791a == null) {
            Intrinsics.n("mirPayWalletManager");
            throw null;
        }
        if (interfaceC9791a.i()) {
            return;
        }
        InterfaceC9791a interfaceC9791a2 = this.f72980I;
        if (interfaceC9791a2 == null) {
            Intrinsics.n("mirPayWalletManager");
            throw null;
        }
        interfaceC9791a2.closeConnection();
    }

    @Override // androidx.appcompat.app.g
    public final boolean onSupportNavigateUp() {
        C2584m c2584m = this.f72996o;
        if (c2584m != null) {
            return c2584m.M();
        }
        return false;
    }

    @Override // I30.d
    /* renamed from: p, reason: from getter */
    public final boolean getF72991j() {
        return this.f72991j;
    }

    @Override // Y80.l
    @NotNull
    public final List<Integer> q() {
        return this.f72973B;
    }

    @Override // I30.a
    public final void s(boolean z11) {
        C7308a c7308a = this.f73002u;
        if (c7308a == null) {
            Intrinsics.n("gotoFintechNavigationDelegate");
            throw null;
        }
        c7308a.b1();
        a0(f72969X, 0, z11);
    }

    @Override // Y80.l
    public final com.google.android.material.bottomnavigation.c t() {
        l80.l lVar = this.f72997p;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    @Override // I30.a
    public final boolean u() {
        FintechBottomNavigationView b11;
        l80.l lVar = this.f72997p;
        return Intrinsics.b((lVar == null || (b11 = lVar.b()) == null) ? null : Float.valueOf(b11.getTranslationY()), 0.0f);
    }

    @Override // Y80.l
    public final G v() {
        OverFragment overFragment = this.f72995n;
        if (overFragment != null) {
            return overFragment.getChildFragmentManager();
        }
        Intrinsics.n("overFragment");
        throw null;
    }

    @Override // Y80.l
    /* renamed from: x, reason: from getter */
    public final C2584m getF72996o() {
        return this.f72996o;
    }

    @Override // Y80.l
    /* renamed from: y, reason: from getter */
    public final Y80.k getF72987P() {
        return this.f72987P;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
    }
}
