package vb0;

import Sc.o;
import android.R;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import io.sentry.android.core.C7106g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: vb0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10295b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f102741a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q0 f102742b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f102743c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f102744d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f102745e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f102746f;

    /* renamed from: vb0.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f102747a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f102748b;

        public a(int i11, boolean z11) {
            this.f102747a = i11;
            this.f102748b = z11;
        }

        public final int a() {
            return this.f102747a;
        }

        public final boolean b() {
            return this.f102748b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f102747a == aVar.f102747a && this.f102748b == aVar.f102748b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102748b) + (Integer.hashCode(this.f102747a) * 31);
        }

        @NotNull
        public final String toString() {
            return "BarState(color=" + this.f102747a + ", useDarkIcons=" + this.f102748b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: vb0.b$b, reason: collision with other inner class name */
    public static final class EnumC2227b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC2227b[] $VALUES;
        public static final EnumC2227b NAVIGATION;
        public static final EnumC2227b STATUS;
        private final int gravity;

        @NotNull
        private final Function1<d, Integer> heightFrom;
        private final int insetsType;

        /* renamed from: vb0.b$b$a */
        /* synthetic */ class a extends E {

            /* renamed from: a, reason: collision with root package name */
            public static final a f102749a = new a(d.class, "top", "getTop()I", 0);

            @Override // kotlin.jvm.internal.E, kotlin.reflect.o
            public final Object get(Object obj) {
                return Integer.valueOf(((d) obj).f42127b);
            }
        }

        /* renamed from: vb0.b$b$b, reason: collision with other inner class name */
        /* synthetic */ class C2228b extends E {

            /* renamed from: a, reason: collision with root package name */
            public static final C2228b f102750a = new C2228b(d.class, "bottom", "getBottom()I", 0);

            @Override // kotlin.jvm.internal.E, kotlin.reflect.o
            public final Object get(Object obj) {
                return Integer.valueOf(((d) obj).f42129d);
            }
        }

        static {
            EnumC2227b enumC2227b = new EnumC2227b("STATUS", 0, 1, 48, a.f102749a);
            STATUS = enumC2227b;
            EnumC2227b enumC2227b2 = new EnumC2227b("NAVIGATION", 1, 2, 80, C2228b.f102750a);
            NAVIGATION = enumC2227b2;
            EnumC2227b[] enumC2227bArr = {enumC2227b, enumC2227b2};
            $VALUES = enumC2227bArr;
            $ENTRIES = Xc.b.a(enumC2227bArr);
        }

        private EnumC2227b(String str, int i11, int i12, int i13, E e11) {
            this.insetsType = i12;
            this.gravity = i13;
            this.heightFrom = e11;
        }

        @NotNull
        public static Xc.a<EnumC2227b> a() {
            return $ENTRIES;
        }

        public static EnumC2227b valueOf(String str) {
            return (EnumC2227b) Enum.valueOf(EnumC2227b.class, str);
        }

        public static EnumC2227b[] values() {
            return (EnumC2227b[]) $VALUES.clone();
        }

        public final int b(@NotNull C5353y0 insets) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            d f7 = insets.f(this.insetsType);
            Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
            return this.heightFrom.invoke(f7).intValue();
        }

        @NotNull
        public final FrameLayout.LayoutParams d() {
            return new FrameLayout.LayoutParams(-1, 0, this.gravity);
        }
    }

    /* renamed from: vb0.b$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102751a;

        static {
            int[] iArr = new int[EnumC2227b.values().length];
            try {
                iArr[EnumC2227b.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2227b.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102751a = iArr;
        }
    }

    public C10295b(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f102741a = window;
        this.f102742b = new Q0(window.getDecorView(), window);
        this.f102743c = Build.VERSION.SDK_INT >= 35;
        this.f102744d = new LinkedHashMap();
        this.f102745e = new LinkedHashMap();
    }

    public static void a(EnumC2227b enumC2227b, View view, View view2, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view2, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        d(enumC2227b, view, insets);
    }

    private final void b(EnumC2227b enumC2227b, int i11) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        int i12 = c.f102751a[enumC2227b.ordinal()];
        Window window = this.f102741a;
        if (i12 == 1) {
            window.setStatusBarColor(i11);
        } else {
            if (i12 != 2) {
                throw new o();
            }
            window.setNavigationBarColor(i11);
        }
    }

    private final void c(EnumC2227b enumC2227b, boolean z11) {
        int i11 = c.f102751a[enumC2227b.ordinal()];
        Q0 q02 = this.f102742b;
        if (i11 == 1) {
            q02.e(z11);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            q02.d(z11);
        }
    }

    private static final void d(EnumC2227b enumC2227b, View view, C5353y0 c5353y0) {
        int b11 = enumC2227b.b(c5353y0);
        if (b11 != view.getLayoutParams().height) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = b11;
            view.setLayoutParams(layoutParams);
        }
    }

    private final Boolean e(int i11) {
        TypedValue typedValue = new TypedValue();
        if (this.f102741a.getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return Boolean.valueOf(typedValue.data != 0);
        }
        return null;
    }

    private final boolean h(EnumC2227b enumC2227b) {
        int i11 = c.f102751a[enumC2227b.ordinal()];
        Q0 q02 = this.f102742b;
        if (i11 == 1) {
            return q02.c();
        }
        if (i11 == 2) {
            return q02.b();
        }
        throw new o();
    }

    public final void f() {
        Iterator<E> it = EnumC2227b.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EnumC2227b enumC2227b = (EnumC2227b) it.next();
            View view = (View) this.f102744d.remove(enumC2227b);
            if (view != null) {
                Y.J(view, null);
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            a aVar = (a) this.f102745e.remove(enumC2227b);
            if (aVar != null) {
                b(enumC2227b, aVar.a());
                c(enumC2227b, aVar.b());
            }
        }
        Boolean bool = this.f102746f;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (Build.VERSION.SDK_INT >= 29) {
                this.f102741a.setNavigationBarContrastEnforced(booleanValue);
            }
        }
        this.f102746f = null;
    }

    public final void g(@NotNull EnumC2227b type, int i11) {
        int statusBarColor;
        Boolean e11;
        boolean booleanValue;
        boolean isNavigationBarContrastEnforced;
        Intrinsics.checkNotNullParameter(type, "type");
        LinkedHashMap linkedHashMap = this.f102745e;
        boolean containsKey = linkedHashMap.containsKey(type);
        Window window = this.f102741a;
        boolean z11 = this.f102743c;
        if (!containsKey) {
            int[] iArr = c.f102751a;
            int i12 = iArr[type.ordinal()];
            if (i12 == 1) {
                statusBarColor = window.getStatusBarColor();
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                statusBarColor = window.getNavigationBarColor();
            }
            if (z11) {
                booleanValue = h(type);
            } else {
                int i13 = iArr[type.ordinal()];
                if (i13 == 1) {
                    e11 = e(R.attr.windowLightStatusBar);
                } else {
                    if (i13 != 2) {
                        throw new o();
                    }
                    e11 = Build.VERSION.SDK_INT >= 27 ? e(R.attr.windowLightNavigationBar) : null;
                }
                booleanValue = e11 != null ? e11.booleanValue() : h(type);
            }
            linkedHashMap.put(type, new a(statusBarColor, booleanValue));
            if (type == EnumC2227b.NAVIGATION && Build.VERSION.SDK_INT >= 29) {
                isNavigationBarContrastEnforced = window.isNavigationBarContrastEnforced();
                this.f102746f = Boolean.valueOf(isNavigationBarContrastEnforced);
            }
        }
        b(type, i11);
        c(type, !(androidx.core.graphics.c.c(i11) < 0.5d));
        if (type == EnumC2227b.NAVIGATION && Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        if (z11) {
            LinkedHashMap linkedHashMap2 = this.f102744d;
            Object obj = linkedHashMap2.get(type);
            Object obj2 = obj;
            if (obj == null) {
                View view = new View(window.getContext());
                view.setLayoutParams(type.d());
                View decorView = window.getDecorView();
                Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) decorView;
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content);
                ViewGroup viewGroup3 = viewGroup;
                if (viewGroup2 != null) {
                    viewGroup3 = viewGroup2;
                }
                viewGroup3.addView(view);
                WindowInsets rootWindowInsets = window.getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    C5353y0 u11 = C5353y0.u(view, rootWindowInsets);
                    Intrinsics.checkNotNullExpressionValue(u11, "toWindowInsetsCompat(...)");
                    d(type, view, u11);
                }
                Y.J(view, new C7106g(type, view));
                Y.A(view);
                linkedHashMap2.put(type, view);
                obj2 = view;
            }
            ((View) obj2).setBackgroundColor(i11);
        }
    }
}
