package v50;

import B0.C2454a;
import Kk.C3532b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Insets;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.detmir.recycli.adapters.RecyclerItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottomsnack.ui.SnackbarCbottomLayout$1;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import v50.p;

/* loaded from: classes3.dex */
public final class j implements p.a {

    /* renamed from: l, reason: collision with root package name */
    private static final int f102340l = C.D.c(4.0f);

    /* renamed from: m, reason: collision with root package name */
    private static final int f102341m = C.D.c(8.0f);

    /* renamed from: n, reason: collision with root package name */
    private static final float f102342n = C.D.c(12.0f);

    /* renamed from: o, reason: collision with root package name */
    private static final int f102343o;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f102344a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private p f102345b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a f102346c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final u f102347d;

    /* renamed from: e, reason: collision with root package name */
    private u f102348e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<Window> f102349f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<LinearLayout> f102350g;

    /* renamed from: h, reason: collision with root package name */
    private k f102351h;

    /* renamed from: i, reason: collision with root package name */
    private Function2<? super String, ? super Integer, Unit> f102352i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final i f102353j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private b f102354k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f102355a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f102356b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f102357c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f102358d;

        /* renamed from: e, reason: collision with root package name */
        private View f102359e;

        /* renamed from: f, reason: collision with root package name */
        private int f102360f;

        /* renamed from: g, reason: collision with root package name */
        private int f102361g;

        /* renamed from: h, reason: collision with root package name */
        private int f102362h;

        /* renamed from: i, reason: collision with root package name */
        private int f102363i;

        /* renamed from: j, reason: collision with root package name */
        private final String f102364j;

        /* renamed from: k, reason: collision with root package name */
        private final List<Integer> f102365k;

        /* renamed from: l, reason: collision with root package name */
        private final String f102366l;

        /* renamed from: m, reason: collision with root package name */
        private final Integer f102367m;

        /* renamed from: n, reason: collision with root package name */
        private final int f102368n;

        /* renamed from: o, reason: collision with root package name */
        private final List<RecyclerItem> f102369o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f102370p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f102371q;

        public a() {
            this(null, null, false, 0, 0, 0, 0, null, null, null, null, 0, null, false, 536870911);
        }

        public final boolean a() {
            return this.f102357c;
        }

        public final String b() {
            return this.f102364j;
        }

        public final List<Integer> c() {
            return this.f102365k;
        }

        public final String d() {
            return this.f102366l;
        }

        public final Integer e() {
            return this.f102367m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f102355a, aVar.f102355a) && Intrinsics.d(this.f102356b, aVar.f102356b) && this.f102357c == aVar.f102357c && this.f102358d == aVar.f102358d && Intrinsics.d(this.f102359e, aVar.f102359e) && this.f102360f == aVar.f102360f && this.f102361g == aVar.f102361g && this.f102362h == aVar.f102362h && this.f102363i == aVar.f102363i && Intrinsics.d(this.f102364j, aVar.f102364j) && Intrinsics.d(this.f102365k, aVar.f102365k) && Intrinsics.d(this.f102366l, aVar.f102366l) && Intrinsics.d(this.f102367m, aVar.f102367m) && this.f102368n == aVar.f102368n && Intrinsics.d(this.f102369o, aVar.f102369o) && this.f102370p == aVar.f102370p && this.f102371q == aVar.f102371q;
        }

        public final int f() {
            return this.f102361g;
        }

        public final View g() {
            return this.f102359e;
        }

        public final List<RecyclerItem> h() {
            return this.f102369o;
        }

        public final int hashCode() {
            String str = this.f102355a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f102356b;
            int a11 = C3532b.a(C3532b.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 961, this.f102357c), 31, this.f102358d);
            View view = this.f102359e;
            int a12 = C2454a.a(this.f102363i, C2454a.a(this.f102362h, C2454a.a(this.f102361g, C2454a.a(this.f102360f, (a11 + (view == null ? 0 : view.hashCode())) * 1742810335, 31), 31), 31), 31);
            String str2 = this.f102364j;
            int hashCode2 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Integer> list = this.f102365k;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.f102366l;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.f102367m;
            int a13 = C3532b.a(C2454a.a(this.f102368n, (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 961, false);
            List<RecyclerItem> list2 = this.f102369o;
            return C3532b.a(C3532b.a((a13 + (list2 != null ? list2.hashCode() : 0)) * 961, 31, this.f102370p), 961, this.f102371q);
        }

        public final Integer i() {
            return this.f102356b;
        }

        public final String j() {
            return this.f102355a;
        }

        public final int k() {
            return this.f102368n;
        }

        public final int l() {
            return this.f102363i;
        }

        public final boolean m() {
            return this.f102371q;
        }

        public final int n() {
            return this.f102360f;
        }

        public final int o() {
            return this.f102362h;
        }

        public final void p(boolean z11) {
            this.f102358d = z11;
        }

        @NotNull
        public final String toString() {
            boolean z11 = this.f102358d;
            View view = this.f102359e;
            StringBuilder sb2 = new StringBuilder("State(id=");
            sb2.append(this.f102355a);
            sb2.append(", cbottomVersion=");
            sb2.append(this.f102356b);
            sb2.append(", atTop=");
            Pk0.f.c(", message=null, inDialog=", ", boundView=", sb2, this.f102357c, z11);
            sb2.append(view);
            sb2.append(", iconResLeft=null, iconDrawLeft=null, imageUrlLeft=null, iconResRight=null, iconDrawRight=null, imageUrlRight=null, topPadding=");
            sb2.append(this.f102360f);
            sb2.append(", bottomPadding=");
            sb2.append(this.f102361g);
            sb2.append(", verticalMargin=");
            sb2.append(this.f102362h);
            sb2.append(", sideMargin=");
            sb2.append(this.f102363i);
            sb2.append(", backgroundColor=");
            sb2.append(this.f102364j);
            sb2.append(", backgroundRadius=");
            sb2.append(this.f102365k);
            sb2.append(", borderColor=");
            sb2.append(this.f102366l);
            sb2.append(", borderWidth=");
            sb2.append(this.f102367m);
            sb2.append(", showDuration=");
            sb2.append(this.f102368n);
            sb2.append(", bindToFragmentView=false, customView=null, cbottomItems=");
            sb2.append(this.f102369o);
            sb2.append(", tapListener=null, dismissOnTap=");
            sb2.append(this.f102370p);
            sb2.append(", swipeable=");
            return Pk0.a.a(", buttonText=null, buttonListener=null)", sb2, this.f102371q);
        }

        public a(String str, Integer num, boolean z11, int i11, int i12, int i13, int i14, String str2, List list, String str3, Integer num2, int i15, ArrayList arrayList, boolean z12, int i16) {
            String str4 = (i16 & 1) != 0 ? null : str;
            Integer num3 = (i16 & 2) != 0 ? null : num;
            boolean z13 = (i16 & 4) != 0 ? false : z11;
            int i17 = (i16 & 4096) != 0 ? 0 : i11;
            int i18 = (i16 & 8192) != 0 ? 0 : i12;
            int i19 = (i16 & 16384) != 0 ? j.f102340l : i13;
            int i21 = (32768 & i16) != 0 ? j.f102341m : i14;
            String str5 = (65536 & i16) != 0 ? null : str2;
            List list2 = (131072 & i16) != 0 ? null : list;
            String str6 = (262144 & i16) != 0 ? null : str3;
            Integer num4 = (524288 & i16) != 0 ? null : num2;
            int i22 = (1048576 & i16) != 0 ? 2000 : i15;
            ArrayList arrayList2 = (i16 & 8388608) != 0 ? null : arrayList;
            boolean z14 = (i16 & 67108864) != 0 ? true : z12;
            this.f102355a = str4;
            this.f102356b = num3;
            this.f102357c = z13;
            this.f102358d = false;
            this.f102359e = null;
            this.f102360f = i17;
            this.f102361g = i18;
            this.f102362h = i19;
            this.f102363i = i21;
            this.f102364j = str5;
            this.f102365k = list2;
            this.f102366l = str6;
            this.f102367m = num4;
            this.f102368n = i22;
            this.f102369o = arrayList2;
            this.f102370p = false;
            this.f102371q = z14;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            View g10;
            j jVar = j.this;
            if (jVar.n().g() == null) {
                return;
            }
            View g11 = jVar.n().g();
            if (g11 == null || g11.getVisibility() != 0 || (g10 = jVar.n().g()) == null || !g10.isAttachedToWindow()) {
                jVar.o();
                View g12 = jVar.n().g();
                if (g12 == null || (viewTreeObserver = g12.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    static {
        C.D.c(2.0f);
        f102343o = C.D.c(0.0f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [v50.i] */
    public j(@NotNull Context context, @NotNull p snackbarManager, @NotNull a state) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(snackbarManager, "snackbarManager");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f102344a = context;
        this.f102345b = snackbarManager;
        this.f102346c = state;
        Intrinsics.checkNotNullParameter(context, "context");
        u uVar = new u(context, null, 0);
        uVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f102347d = uVar;
        this.f102353j = new View.OnApplyWindowInsetsListener() { // from class: v50.i
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return j.g(j.this, view, windowInsets);
            }
        };
        this.f102354k = new b();
    }

    public static Unit c(j jVar, View e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        jVar.f102351h = null;
        jVar.f102345b.e(jVar);
        jVar.o();
        Function2<? super String, ? super Integer, Unit> function2 = jVar.f102352i;
        if (function2 != null) {
            String j11 = jVar.f102346c.j();
            if (j11 == null) {
                j11 = "";
            }
            Integer i11 = jVar.f102346c.i();
            function2.invoke(j11, Integer.valueOf(i11 != null ? i11.intValue() : 1));
        }
        return Unit.f71690a;
    }

    public static Unit d(j jVar) {
        jVar.getClass();
        jVar.f102345b.d(jVar);
        return Unit.f71690a;
    }

    public static Unit e(j jVar) {
        jVar.f102345b.e(jVar);
        jVar.f102351h = null;
        jVar.o();
        Function2<? super String, ? super Integer, Unit> function2 = jVar.f102352i;
        if (function2 != null) {
            String j11 = jVar.f102346c.j();
            if (j11 == null) {
                j11 = "";
            }
            Integer i11 = jVar.f102346c.i();
            function2.invoke(j11, Integer.valueOf(i11 != null ? i11.intValue() : 1));
        }
        return Unit.f71690a;
    }

    public static Unit f(j jVar, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        jVar.f102345b.c(jVar);
        return Unit.f71690a;
    }

    public static WindowInsets g(j jVar, View v11, WindowInsets insets) {
        int statusBars;
        Insets insets2;
        int i11;
        int navigationBars;
        Insets insets3;
        int i12;
        Insets insets4;
        int i13;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (Build.VERSION.SDK_INT >= 31) {
            statusBars = WindowInsets.Type.statusBars();
            insets2 = insets.getInsets(statusBars);
            i11 = insets2.top;
            navigationBars = WindowInsets.Type.navigationBars();
            insets3 = insets.getInsets(navigationBars);
            i12 = insets3.bottom;
            insets4 = insets.getInsets(8);
            i13 = insets4.bottom;
            WeakReference<LinearLayout> weakReference = jVar.f102350g;
            if (weakReference != null && (linearLayout = weakReference.get()) != null) {
                linearLayout.setPadding(0, i11, 0, Math.max(i12, i13));
            }
        }
        return v11.onApplyWindowInsets(insets);
    }

    public static Unit h(j jVar, MotionEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        jVar.f102345b.f(jVar);
        return Unit.f71690a;
    }

    public static void i(j jVar) {
        LinearLayout linearLayout;
        ViewTreeObserver viewTreeObserver;
        u uVar = jVar.f102348e;
        ViewGroup viewGroup = (ViewGroup) (uVar != null ? uVar.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(jVar.f102348e);
        }
        View g10 = jVar.f102346c.g();
        if (g10 != null && (viewTreeObserver = g10.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(jVar.f102354k);
        }
        WeakReference<LinearLayout> weakReference = jVar.f102350g;
        if (weakReference != null && (linearLayout = weakReference.get()) != null) {
            linearLayout.setOnApplyWindowInsetsListener(null);
        }
        jVar.f102349f = null;
        jVar.f102348e = null;
    }

    public static Unit j(j jVar, MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        jVar.f102345b.b(jVar);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        u uVar = this.f102348e;
        if (uVar != null) {
            uVar.setTranslationX(-4000.0f);
        }
        u uVar2 = this.f102348e;
        if (uVar2 != null) {
            uVar2.post(new androidx.work.impl.background.systemalarm.d(this, 2));
        }
    }

    @Override // v50.p.a
    @NotNull
    public final u a() {
        return this.f102347d;
    }

    @Override // v50.p.a
    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    public final u b(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f102346c = state;
        StyleParser styleParser = StyleParser.INSTANCE;
        String d11 = state.d();
        Context context = this.f102344a;
        Integer parseColor = styleParser.parseColor(context, d11);
        int intValue = parseColor != null ? parseColor.intValue() : androidx.core.content.a.getColor(context, R.color.oz_semantic_ctrl_neutral_pale);
        Integer e11 = state.e();
        int d12 = e11 != null ? C.D.d(e11.intValue()) : f102343o;
        List<Integer> c11 = state.c();
        float f7 = f102342n;
        float pxF = c11 != null ? UiExtKt.toPxF(c11.get(0).intValue()) : f7;
        List<Integer> c12 = state.c();
        float pxF2 = c12 != null ? UiExtKt.toPxF(c12.get(1).intValue()) : f7;
        List<Integer> c13 = state.c();
        float pxF3 = c13 != null ? UiExtKt.toPxF(c13.get(2).intValue()) : f7;
        List<Integer> c14 = state.c();
        if (c14 != null) {
            f7 = UiExtKt.toPxF(c14.get(3).intValue());
        }
        float[] fArr = {pxF, pxF, pxF2, pxF2, pxF3, pxF3, f7, f7};
        Integer parseColor2 = styleParser.parseColor(context, state.b());
        int intValue2 = parseColor2 != null ? parseColor2.intValue() : androidx.core.content.a.getColor(context, R.color.oz_semantic_bg_secondary);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(intValue2);
        gradientDrawable.setStroke(d12, intValue);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable});
        u uVar = this.f102347d;
        uVar.setBackground(layerDrawable);
        uVar.setClipChildren(true);
        if (state.h() == null) {
            uVar.removeAllViews();
            o oVar = new o(context);
            oVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            oVar.a(state);
            uVar.addView(oVar);
            return uVar;
        }
        if (uVar.getChildCount() <= 0 || !(uVar.getChildAt(0) instanceof n)) {
            Intrinsics.checkNotNullParameter(context, "context");
            n nVar = new n(context, null, 0);
            nVar.setLayoutParams(new FrameLayout.LayoutParams(-1, C.D.c(160.0f)));
            nVar.setLayoutManager(new SnackbarCbottomLayout$1(context));
            H30.r.a(nVar);
            nVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            uVar.addView(nVar);
            Intrinsics.checkNotNullParameter(state, "state");
            List<RecyclerItem> h11 = state.h();
            if (h11 != null) {
                com.detmir.recycli.adapters.d.a(nVar, h11);
            }
        } else {
            View childAt = uVar.getChildAt(0);
            Intrinsics.g(childAt, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottomsnack.ui.SnackbarCbottomLayout");
            n nVar2 = (n) childAt;
            Intrinsics.checkNotNullParameter(state, "state");
            List<RecyclerItem> h12 = state.h();
            if (h12 != null) {
                com.detmir.recycli.adapters.d.a(nVar2, h12);
                return uVar;
            }
        }
        return uVar;
    }

    @Override // v50.p.a
    public final void dismiss() {
        p pVar = this.f102345b;
        pVar.c(this);
        k kVar = this.f102351h;
        if (kVar != null) {
            kVar.j(new Q90.l(this, 5));
            k kVar2 = this.f102351h;
            Intrinsics.f(kVar2);
            kVar2.i();
            return;
        }
        pVar.e(this);
        o();
        Function2<? super String, ? super Integer, Unit> function2 = this.f102352i;
        if (function2 != null) {
            String j11 = this.f102346c.j();
            if (j11 == null) {
                j11 = "";
            }
            Integer i11 = this.f102346c.i();
            function2.invoke(j11, Integer.valueOf(i11 != null ? i11.intValue() : 1));
        }
    }

    @Override // v50.p.a
    public final String getId() {
        return this.f102346c.j();
    }

    @NotNull
    public final a n() {
        return this.f102346c;
    }

    public final void p(Function2<? super String, ? super Integer, Unit> function2) {
        this.f102352i = function2;
    }

    public final void q(LinearLayout linearLayout) {
        this.f102350g = new WeakReference<>(linearLayout);
        this.f102345b.a(this, this.f102346c.k());
    }

    public final void r(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f102349f = new WeakReference<>(window);
        this.f102345b.a(this, this.f102346c.k());
    }

    @Override // v50.p.a
    public final void show() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        boolean z11;
        int i11 = 1;
        int i12 = 0;
        WeakReference<Window> weakReference = this.f102349f;
        Window window = weakReference != null ? weakReference.get() : null;
        WeakReference<LinearLayout> weakReference2 = this.f102350g;
        LinearLayout linearLayout = weakReference2 != null ? weakReference2.get() : null;
        if (window == null) {
            Context context = this.f102344a;
            Intrinsics.checkNotNullParameter(context, "<this>");
            while (true) {
                z11 = context instanceof Activity;
                if (z11 || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            Activity activity = z11 ? (Activity) context : null;
            window = activity != null ? activity.getWindow() : null;
        }
        b bVar = this.f102354k;
        if (linearLayout != null) {
            u b11 = b(this.f102346c);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (this.f102346c.a()) {
                layoutParams.gravity = 49;
                layoutParams.setMargins(this.f102346c.l(), this.f102346c.n() + this.f102346c.o(), this.f102346c.l(), this.f102346c.f() + this.f102346c.o());
            } else {
                layoutParams.gravity = 81;
                layoutParams.setMargins(this.f102346c.l(), this.f102346c.n() + this.f102346c.o(), this.f102346c.l(), this.f102346c.f() + this.f102346c.o());
            }
            if (this.f102346c.a()) {
                linearLayout.setGravity(49);
            } else {
                linearLayout.setGravity(81);
            }
            b11.setLayoutParams(layoutParams);
            b11.setVisibility(4);
            View g10 = this.f102346c.g();
            if (g10 != null && (viewTreeObserver2 = g10.getViewTreeObserver()) != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(bVar);
            }
            if (this.f102346c.a()) {
                linearLayout.addView(b11);
            } else {
                linearLayout.addView(b11, 0);
            }
            linearLayout.setOnApplyWindowInsetsListener(this.f102353j);
            this.f102348e = b11;
        } else if (window != null) {
            u b12 = b(this.f102346c);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            if (this.f102346c.a()) {
                layoutParams2.gravity = 49;
                layoutParams2.setMargins(this.f102346c.l(), this.f102346c.n() + this.f102346c.o(), this.f102346c.l(), this.f102346c.f() + this.f102346c.o());
            } else {
                layoutParams2.gravity = 81;
                layoutParams2.setMargins(this.f102346c.l(), this.f102346c.n() + this.f102346c.o(), this.f102346c.l(), this.f102346c.f() + this.f102346c.o());
            }
            b12.setVisibility(4);
            View g11 = this.f102346c.g();
            if (g11 != null && (viewTreeObserver = g11.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
            }
            window.addContentView(b12, layoutParams2);
            this.f102348e = b12;
        }
        if (this.f102346c.m()) {
            int i13 = D.f102302t;
            C10249B c10249b = new C10249B();
            c10249b.e(new g(this, i12));
            c10249b.f(new h(this, 0));
            c10249b.c(new E90.h(this, 1));
            c10249b.b(new Ca.D(this, i11));
            c10249b.d(new Ca.E(this, i11));
            c10249b.g(this.f102346c.a());
            c10249b.i();
            c10249b.h();
            c10249b.a(this.f102347d);
        }
        u uVar = this.f102348e;
        Intrinsics.f(uVar);
        k kVar = new k(uVar, this.f102346c.a());
        this.f102351h = kVar;
        kVar.k(new fa.b(this, 3));
        kVar.l();
    }
}
