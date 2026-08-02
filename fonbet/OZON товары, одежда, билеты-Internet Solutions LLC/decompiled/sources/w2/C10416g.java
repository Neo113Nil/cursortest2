package w2;

import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import w2.C10416g;

@SuppressLint({"ViewConstructor"})
/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10416g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f103378a;

    /* renamed from: w2.g$a */
    private static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public SplashScreenView f103379c;

        @Override // w2.C10416g.b
        public final void b() {
        }

        @Override // w2.C10416g.b
        @NotNull
        public final View d() {
            View iconView;
            View iconView2;
            SplashScreenView splashScreenView = this.f103379c;
            if (splashScreenView == null) {
                Intrinsics.n("platformView");
                throw null;
            }
            iconView = splashScreenView.getIconView();
            if (iconView == null) {
                return new View(c());
            }
            SplashScreenView splashScreenView2 = this.f103379c;
            if (splashScreenView2 == null) {
                Intrinsics.n("platformView");
                throw null;
            }
            iconView2 = splashScreenView2.getIconView();
            Intrinsics.f(iconView2);
            return iconView2;
        }

        @Override // w2.C10416g.b
        public final ViewGroup e() {
            SplashScreenView splashScreenView = this.f103379c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.n("platformView");
            throw null;
        }

        @Override // w2.C10416g.b
        public final void f() {
            SplashScreenView splashScreenView = this.f103379c;
            if (splashScreenView == null) {
                Intrinsics.n("platformView");
                throw null;
            }
            splashScreenView.remove();
            if (Build.VERSION.SDK_INT < 33) {
                Resources.Theme theme = c().getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                View decorView = c().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                C10418i.a(theme, decorView, new TypedValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2.g$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Activity f103380a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC4008j f103381b;

        public b(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f103380a = activity;
            this.f103381b = k.b(new Function0() { // from class: w2.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C10416g.b.a(C10416g.b.this);
                }
            });
        }

        public static ViewGroup a(b bVar) {
            View inflate = View.inflate(bVar.f103380a, R.layout.splash_screen_view, null);
            Intrinsics.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) inflate;
        }

        public void b() {
            View rootView = ((ViewGroup) this.f103380a.findViewById(android.R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView((ViewGroup) this.f103381b.getValue());
            }
        }

        @NotNull
        public final Activity c() {
            return this.f103380a;
        }

        @NotNull
        public View d() {
            View findViewById = e().findViewById(R.id.splashscreen_icon_view);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            return findViewById;
        }

        @NotNull
        public ViewGroup e() {
            return (ViewGroup) this.f103381b.getValue();
        }

        public void f() {
            ViewParent parent = e().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(e());
            }
        }
    }

    public C10416g(@NotNull Activity activity) {
        b bVar;
        Intrinsics.checkNotNullParameter(activity, "ctx");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            bVar = new a(activity);
        } else {
            bVar = new b(activity);
        }
        bVar.b();
        this.f103378a = bVar;
    }

    @NotNull
    public final View a() {
        return this.f103378a.d();
    }

    @NotNull
    public final ViewGroup b() {
        return this.f103378a.e();
    }

    public final void c() {
        this.f103378a.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10416g(@NotNull SplashScreenView platformView, @NotNull Activity ctx) {
        this(ctx);
        Intrinsics.checkNotNullParameter(platformView, "platformView");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        b bVar = this.f103378a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31");
        Intrinsics.checkNotNullParameter(platformView, "<set-?>");
        ((a) bVar).f103379c = platformView;
    }
}
