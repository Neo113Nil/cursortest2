package u10;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import jk0.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import v10.C10183a;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f99742a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f99743b;

    /* renamed from: c, reason: collision with root package name */
    private final C10.e f99744c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10.g f99745d;

    /* renamed from: e, reason: collision with root package name */
    private final ComposerListBehavior f99746e;

    /* renamed from: f, reason: collision with root package name */
    private final int f99747f;

    /* renamed from: g, reason: collision with root package name */
    private final int f99748g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f99749h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f99750i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f99751j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f99752k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f99753l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Object f99754m;

    /* renamed from: n, reason: collision with root package name */
    private int f99755n;

    static final class a extends AbstractC7737t implements Function0<AppBarLayout> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppBarLayout invoke() {
            return C10183a.a(b.this.f99742a);
        }
    }

    /* renamed from: u10.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    /* synthetic */ class C2196b extends C7735q implements Function1<l, Unit> {
        C2196b(b bVar) {
            super(1, bVar, b.class, "onOverlapInfoUpdate", "onOverlapInfoUpdate(Lru/ozon/uikit/recycler/lifecycle/OverlapContainersPositionInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(l lVar) {
            l p02 = lVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            b.c((b) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<View> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View findViewById = b.this.f99742a.findViewById(R.id.bottomBarBackground);
            if (findViewById != null) {
                return findViewById;
            }
            return null;
        }
    }

    static final class d extends AbstractC7737t implements Function0<View> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return C10183a.b(b.this.f99742a);
        }
    }

    static final class e extends AbstractC7737t implements Function0<LinearLayout> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return C10183a.c(b.this.f99742a);
        }
    }

    static final class f extends AbstractC7737t implements Function0<View> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View findViewById = b.this.f99742a.findViewById(R.id.statusBarBackground);
            if (findViewById != null) {
                return findViewById;
            }
            return null;
        }
    }

    static final class g extends AbstractC7737t implements Function0<LinearLayout> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return C10183a.o(b.this.f99742a);
        }
    }

    public b(@NotNull View rootView, boolean z11, C10.e eVar, @NotNull C10.g lastItemBottomOffsetDecoration, ComposerListBehavior composerListBehavior, int i11, int i12) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(lastItemBottomOffsetDecoration, "lastItemBottomOffsetDecoration");
        this.f99742a = rootView;
        this.f99743b = z11;
        this.f99744c = eVar;
        this.f99745d = lastItemBottomOffsetDecoration;
        this.f99746e = composerListBehavior;
        this.f99747f = i11;
        this.f99748g = i12;
        this.f99749h = v10.f.a(new a());
        this.f99750i = v10.f.a(new g());
        this.f99751j = v10.f.a(new e());
        this.f99752k = v10.f.a(new d());
        this.f99753l = v10.f.a(new f());
        this.f99754m = v10.f.a(new c());
    }

    public static void a(b bVar, View view, C5353y0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        bVar.d(windowInsets);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Sc.j, java.lang.Object] */
    public static final void c(b bVar, l lVar) {
        bVar.getClass();
        int i11 = lVar.h().top;
        C10.e eVar = bVar.f99744c;
        if (eVar != null) {
            ?? r52 = bVar.f99749h;
            AppBarLayout appBarLayout = (AppBarLayout) r52.getValue();
            if (appBarLayout != null ? Intrinsics.d(appBarLayout.getTag(R.id.tag_skip_window_insets), Boolean.TRUE) : false) {
                AppBarLayout appBarLayout2 = (AppBarLayout) r52.getValue();
                if (appBarLayout2 != null) {
                    appBarLayout2.setPadding(appBarLayout2.getPaddingLeft(), 0, appBarLayout2.getPaddingRight(), appBarLayout2.getPaddingBottom());
                }
                View g10 = bVar.g();
                if (g10 != null) {
                    g10.setVisibility(4);
                }
            } else {
                int a11 = eVar.a();
                ?? r72 = bVar.f99750i;
                if (a11 > 0) {
                    View g11 = bVar.g();
                    if (g11 != null) {
                        g11.setVisibility(0);
                    }
                    AppBarLayout appBarLayout3 = (AppBarLayout) r52.getValue();
                    if (appBarLayout3 != null) {
                        appBarLayout3.setPadding(appBarLayout3.getPaddingLeft(), i11, appBarLayout3.getPaddingRight(), appBarLayout3.getPaddingBottom());
                    }
                    LinearLayout linearLayout = (LinearLayout) r72.getValue();
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                } else if (eVar.c() > 0) {
                    View g12 = bVar.g();
                    if (g12 != null) {
                        g12.setVisibility(0);
                    }
                    AppBarLayout appBarLayout4 = (AppBarLayout) r52.getValue();
                    if (appBarLayout4 != null) {
                        appBarLayout4.setPadding(appBarLayout4.getPaddingLeft(), 0, appBarLayout4.getPaddingRight(), appBarLayout4.getPaddingBottom());
                    }
                    LinearLayout linearLayout2 = (LinearLayout) r72.getValue();
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), i11, linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                } else {
                    View g13 = bVar.g();
                    if (g13 != null) {
                        g13.setVisibility(4);
                    }
                    AppBarLayout appBarLayout5 = (AppBarLayout) r52.getValue();
                    if (appBarLayout5 != null) {
                        appBarLayout5.setPadding(appBarLayout5.getPaddingLeft(), 0, appBarLayout5.getPaddingRight(), appBarLayout5.getPaddingBottom());
                    }
                    LinearLayout linearLayout3 = (LinearLayout) r72.getValue();
                    linearLayout3.setPadding(linearLayout3.getPaddingLeft(), 0, linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
                }
            }
        }
        int i12 = lVar.h().bottom;
        boolean z11 = bVar.f99755n > 0;
        View view = (View) bVar.f99752k.getValue();
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), z11 ? 0 : i12);
        }
        ?? r42 = bVar.f99751j;
        if (Intrinsics.d(((LinearLayout) r42.getValue()).getTag(R.id.tag_skip_window_insets), Boolean.TRUE) || z11) {
            LinearLayout linearLayout4 = (LinearLayout) r42.getValue();
            linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), 0);
            View f7 = bVar.f();
            if (f7 != null) {
                f7.setVisibility(4);
                return;
            }
            return;
        }
        if (((LinearLayout) r42.getValue()).getChildCount() == 0) {
            LinearLayout linearLayout5 = (LinearLayout) r42.getValue();
            linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), 0);
            View f11 = bVar.f();
            if (f11 != null) {
                f11.setVisibility(4);
                return;
            }
            return;
        }
        LinearLayout linearLayout6 = (LinearLayout) r42.getValue();
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), i12);
        View f12 = bVar.f();
        if (f12 != null) {
            f12.setVisibility(0);
        }
    }

    private final void d(C5353y0 c5353y0) {
        View g10;
        View f7;
        androidx.core.graphics.d f11 = c5353y0.f(7);
        Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
        androidx.core.graphics.d f12 = c5353y0.f(8);
        Intrinsics.checkNotNullExpressionValue(f12, "getInsets(...)");
        this.f99755n = f12.f42129d;
        C10.e eVar = this.f99744c;
        if (eVar != null) {
            eVar.f(f11.f42127b);
        }
        int i11 = f12.f42129d;
        this.f99745d.b(i11 > 0 ? 0 : f11.f42129d);
        int i12 = f11.f42127b;
        View g11 = g();
        if ((g11 == null || g11.getMeasuredHeight() != i12) && (g10 = g()) != null) {
            ViewGroup.LayoutParams layoutParams = g10.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i12;
            g10.setLayoutParams(layoutParams);
        }
        int i13 = f11.f42129d;
        int i14 = i11 <= 0 ? i13 : 0;
        View f13 = f();
        if ((f13 == null || f13.getMeasuredHeight() != i14) && (f7 = f()) != null) {
            ViewGroup.LayoutParams layoutParams2 = f7.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = i14;
            f7.setLayoutParams(layoutParams2);
        }
        View view = this.f99742a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
        ComposerListBehavior composerListBehavior = this.f99746e;
        if (composerListBehavior != null) {
            composerListBehavior.C(new Rect(f11.f42126a, f11.f42127b, f11.f42128c, i13));
            composerListBehavior.E(new C2196b(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final View f() {
        return (View) this.f99754m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final View g() {
        return (View) this.f99753l.getValue();
    }

    public final void e() {
        if (this.f99743b) {
            View view = this.f99742a;
            view.setFitsSystemWindows(false);
            View g10 = g();
            if (g10 != null) {
                g10.setBackgroundColor(this.f99747f);
            }
            View f7 = f();
            if (f7 != null) {
                f7.setBackgroundColor(this.f99748g);
            }
            Y.J(view, new D() { // from class: u10.a
                @Override // androidx.core.view.D
                public final C5353y0 onApplyWindowInsets(View view2, C5353y0 c5353y0) {
                    b.a(b.this, view2, c5353y0);
                    return c5353y0;
                }
            });
        }
    }

    public final void h(@NotNull C5353y0 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!this.f99743b || Intrinsics.d(insets, C5353y0.f42353b)) {
            return;
        }
        d(insets);
    }
}
