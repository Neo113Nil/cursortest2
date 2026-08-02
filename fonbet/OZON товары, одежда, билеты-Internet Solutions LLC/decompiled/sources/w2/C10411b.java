package w2;

import T7.E;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.recyclerview.widget.LinearLayoutManager;
import j.C7232a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import w2.C10411b;

@SuppressLint({"CustomSplashScreen"})
/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10411b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f103355a;

    /* renamed from: w2.b$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.appcompat.app.g f103356a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f103357b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f103358c;

        /* renamed from: d, reason: collision with root package name */
        private Drawable f103359d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f103360e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private c f103361f;

        /* renamed from: g, reason: collision with root package name */
        private d f103362g;

        /* renamed from: h, reason: collision with root package name */
        private C10416g f103363h;

        /* renamed from: w2.b$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC2238a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f103365b;

            ViewTreeObserverOnPreDrawListenerC2238a(View view) {
                this.f103365b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                a aVar = a.this;
                if (aVar.e().b()) {
                    return false;
                }
                this.f103365b.getViewTreeObserver().removeOnPreDrawListener(this);
                C10416g c10416g = aVar.f103363h;
                if (c10416g == null) {
                    return true;
                }
                aVar.c(c10416g);
                return true;
            }
        }

        /* renamed from: w2.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class ViewOnLayoutChangeListenerC2239b implements View.OnLayoutChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C10416g f103367b;

            ViewOnLayoutChangeListenerC2239b(C10416g c10416g) {
                this.f103367b = c10416g;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    a aVar = a.this;
                    boolean b11 = aVar.e().b();
                    C10416g c10416g = this.f103367b;
                    if (b11) {
                        aVar.f103363h = c10416g;
                    } else {
                        aVar.c(c10416g);
                    }
                }
            }
        }

        public a(@NotNull androidx.appcompat.app.g activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f103356a = activity;
            this.f103361f = new E();
        }

        public final void c(@NotNull C10416g splashScreenViewProvider) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
            d dVar = this.f103362g;
            if (dVar == null) {
                return;
            }
            this.f103362g = null;
            splashScreenViewProvider.b().postOnAnimation(new Z.f(6, splashScreenViewProvider, dVar));
        }

        @NotNull
        public final Activity d() {
            return this.f103356a;
        }

        @NotNull
        public final c e() {
            return this.f103361f;
        }

        public void f() {
            TypedValue typedValue = new TypedValue();
            androidx.appcompat.app.g gVar = this.f103356a;
            Resources.Theme theme = gVar.getTheme();
            if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.f103357b = Integer.valueOf(typedValue.resourceId);
                this.f103358c = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f103359d = C7232a.a(gVar, typedValue.resourceId);
            }
            if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                this.f103360e = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
            }
            i(theme, typedValue);
        }

        public void g(@NotNull c keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            this.f103361f = keepOnScreenCondition;
            View findViewById = this.f103356a.findViewById(android.R.id.content);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2238a(findViewById));
        }

        public void h(@NotNull d exitAnimationListener) {
            float dimension;
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            this.f103362g = exitAnimationListener;
            androidx.appcompat.app.g gVar = this.f103356a;
            C10416g c10416g = new C10416g(gVar);
            Integer num = this.f103357b;
            Integer num2 = this.f103358c;
            ViewGroup b11 = c10416g.b();
            if (num != null && num.intValue() != 0) {
                b11.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                b11.setBackgroundColor(num2.intValue());
            } else {
                b11.setBackground(gVar.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f103359d;
            if (drawable != null) {
                ImageView imageView = (ImageView) b11.findViewById(R.id.splashscreen_icon_view);
                if (this.f103360e) {
                    Drawable a11 = C7232a.a(imageView.getContext(), R.drawable.icon_background);
                    dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                    if (a11 != null) {
                        imageView.setBackground(new C10410a(a11, dimension));
                    }
                } else {
                    dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
                }
                imageView.setImageDrawable(new C10410a(drawable, dimension));
            }
            b11.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2239b(c10416g));
        }

        protected final void i(@NotNull Resources.Theme currentTheme, @NotNull TypedValue typedValue) {
            int i11;
            Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            if (!currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i11 = typedValue.resourceId) == 0) {
                return;
            }
            this.f103356a.setTheme(i11);
        }

        public final void j(@NotNull c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f103361f = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C2240b extends a {

        /* renamed from: i, reason: collision with root package name */
        private a f103368i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f103369j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final ViewGroupOnHierarchyChangeListenerC10414e f103370k;

        /* renamed from: w2.b$b$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f103372b;

            a(View view) {
                this.f103372b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (C2240b.this.e().b()) {
                    return false;
                }
                this.f103372b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2240b(@NotNull androidx.appcompat.app.g activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f103369j = true;
            this.f103370k = new ViewGroupOnHierarchyChangeListenerC10414e(this, activity);
        }

        public static void k(C2240b c2240b, d dVar, SplashScreenView splashScreenView) {
            Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                c2240b.getClass();
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = c2240b.d().getTheme();
                Window window = c2240b.d().getWindow();
                if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                    window.setStatusBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                    window.setNavigationBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                    if (typedValue.data != 0) {
                        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
                    } else {
                        window.clearFlags(LinearLayoutManager.INVALID_OFFSET);
                    }
                }
                View decorView = window.getDecorView();
                Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) decorView;
                C10418i.a(theme, viewGroup, typedValue);
                viewGroup.setOnHierarchyChangeListener(null);
                window.setDecorFitsSystemWindows(c2240b.f103369j);
            }
            dVar.b(new C10416g(splashScreenView, c2240b.d()));
        }

        @Override // w2.C10411b.a
        public final void f() {
            Resources.Theme theme = d().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            i(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = d().getWindow().getDecorView();
                Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f103370k);
            }
        }

        @Override // w2.C10411b.a
        public final void g(@NotNull c keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            j(keepOnScreenCondition);
            View findViewById = d().findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.f103368i != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f103368i);
            }
            a aVar = new a(findViewById);
            this.f103368i = aVar;
            viewTreeObserver.addOnPreDrawListener(aVar);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [w2.d] */
        @Override // w2.C10411b.a
        public final void h(@NotNull final d exitAnimationListener) {
            SplashScreen splashScreen;
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            splashScreen = d().getSplashScreen();
            splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: w2.d
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    C10411b.C2240b.k(C10411b.C2240b.this, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final void l(boolean z11) {
            this.f103369j = z11;
        }
    }

    /* renamed from: w2.b$c */
    public interface c {
        boolean b();
    }

    /* renamed from: w2.b$d */
    /* loaded from: classes8.dex */
    public interface d {
        void b(@NotNull C10416g c10416g);
    }

    public C10411b(androidx.appcompat.app.g gVar) {
        this.f103355a = Build.VERSION.SDK_INT >= 31 ? new C2240b(gVar) : new a(gVar);
    }

    public static final void a(C10411b c10411b) {
        c10411b.f103355a.f();
    }

    public final void b(@NotNull c condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f103355a.g(condition);
    }

    public final void c(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f103355a.h(listener);
    }
}
