package Tc;

import Qc.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class d extends ReactViewGroup implements e, com.swmansion.rnscreens.gamma.stack.header.subview.a {

    /* renamed from: a, reason: collision with root package name */
    public final ReactContext f11426a;

    /* renamed from: b, reason: collision with root package name */
    public f f11427b;

    /* renamed from: c, reason: collision with root package name */
    public String f11428c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11429d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11431f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f11432g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f11433h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11434i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11435j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11436k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11437l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11438m;

    /* renamed from: n, reason: collision with root package name */
    public String f11439n;

    /* renamed from: o, reason: collision with root package name */
    public String f11440o;

    /* renamed from: p, reason: collision with root package name */
    public String f11441p;

    /* renamed from: q, reason: collision with root package name */
    public String f11442q;

    /* renamed from: r, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.b f11443r;

    /* renamed from: s, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.b f11444s;

    /* renamed from: t, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.b f11445t;

    /* renamed from: u, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.header.subview.b f11446u;

    /* renamed from: v, reason: collision with root package name */
    public final Oc.b f11447v;

    /* renamed from: w, reason: collision with root package name */
    public WeakReference f11448w;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.swmansion.rnscreens.gamma.stack.header.subview.e.values().length];
            try {
                iArr[com.swmansion.rnscreens.gamma.stack.header.subview.e.f41833a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.swmansion.rnscreens.gamma.stack.header.subview.e.f41834b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.swmansion.rnscreens.gamma.stack.header.subview.e.f41835c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.swmansion.rnscreens.gamma.stack.header.subview.e.f41836d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f11426a = reactContext;
        this.f11427b = f.f11449a;
        this.f11428c = "";
        this.f11447v = new Oc.b(false, 1, null);
    }

    public static final Unit v(String str, d dVar, Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (Intrinsics.areEqual(str, dVar.f11442q)) {
            dVar.setBackButtonIcon$react_native_screens_release(drawable);
            dVar.r();
        }
        return Unit.INSTANCE;
    }

    @Override // Tc.e
    public boolean a() {
        return getLayoutDirection() == 1;
    }

    @Override // com.swmansion.rnscreens.gamma.stack.header.subview.a
    public void e() {
        r();
    }

    @Nullable
    public final String getBackButtonDrawableIconResourceName$react_native_screens_release() {
        return this.f11439n;
    }

    @Override // Tc.e
    public boolean getBackButtonHidden() {
        return this.f11431f;
    }

    @Override // Tc.e
    @Nullable
    public Drawable getBackButtonIcon() {
        return this.f11433h;
    }

    @Nullable
    public final String getBackButtonImageIconUri$react_native_screens_release() {
        return this.f11440o;
    }

    @Override // Tc.e
    @Nullable
    public Integer getBackButtonTintColor() {
        return this.f11432g;
    }

    public final int getConfigSubviewsCount$react_native_screens_release() {
        return CollectionsKt.listOfNotNull((Object[]) new com.swmansion.rnscreens.gamma.stack.header.subview.b[]{getBackgroundSubview(), getLeadingSubview(), getCenterSubview(), getTrailingSubview()}).size();
    }

    @Override // Tc.e
    public boolean getHidden() {
        return this.f11429d;
    }

    @NotNull
    public final ReactContext getReactContext() {
        return this.f11426a;
    }

    @Override // Tc.e
    public boolean getScrollFlagEnterAlways() {
        return this.f11435j;
    }

    @Override // Tc.e
    public boolean getScrollFlagEnterAlwaysCollapsed() {
        return this.f11436k;
    }

    @Override // Tc.e
    public boolean getScrollFlagExitUntilCollapsed() {
        return this.f11437l;
    }

    @Override // Tc.e
    public boolean getScrollFlagScroll() {
        return this.f11434i;
    }

    @Override // Tc.e
    public boolean getScrollFlagSnap() {
        return this.f11438m;
    }

    @Nullable
    public final StateWrapper getStateWrapper$react_native_screens_release() {
        return this.f11447v.a();
    }

    @Override // Tc.e
    @NotNull
    public String getTitle() {
        return this.f11428c;
    }

    @Override // Tc.e
    public boolean getTransparent() {
        return this.f11430e;
    }

    @Override // Tc.e
    @NotNull
    public f getType() {
        return this.f11427b;
    }

    @Override // Tc.e
    public void j(int i10, int i11, int i12) {
        Oc.b.d(this.f11447v, Integer.valueOf(i10), Integer.valueOf(i11), null, Integer.valueOf(i12), 4, null);
    }

    public final void p(com.swmansion.rnscreens.gamma.stack.header.subview.b headerSubview) {
        Intrinsics.checkNotNullParameter(headerSubview, "headerSubview");
        int i10 = a.$EnumSwitchMapping$0[headerSubview.getType().ordinal()];
        if (i10 == 1) {
            this.f11443r = headerSubview;
        } else if (i10 == 2) {
            this.f11444s = headerSubview;
        } else if (i10 == 3) {
            this.f11445t = headerSubview;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11446u = headerSubview;
        }
        headerSubview.setOnStackHeaderSubviewChangeListener$react_native_screens_release(new WeakReference<>(this));
        r();
    }

    public final com.swmansion.rnscreens.gamma.stack.header.subview.b q(int i10) {
        return (com.swmansion.rnscreens.gamma.stack.header.subview.b) CollectionsKt.getOrNull(CollectionsKt.listOfNotNull((Object[]) new com.swmansion.rnscreens.gamma.stack.header.subview.b[]{getBackgroundSubview(), getLeadingSubview(), getCenterSubview(), getTrailingSubview()}), i10);
    }

    public final void r() {
        b bVar;
        WeakReference weakReference = this.f11448w;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a(this);
    }

    public final void s() {
        com.swmansion.rnscreens.gamma.stack.header.subview.b backgroundSubview = getBackgroundSubview();
        if (backgroundSubview != null) {
            t(backgroundSubview);
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.b leadingSubview = getLeadingSubview();
        if (leadingSubview != null) {
            t(leadingSubview);
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.b centerSubview = getCenterSubview();
        if (centerSubview != null) {
            t(centerSubview);
        }
        com.swmansion.rnscreens.gamma.stack.header.subview.b trailingSubview = getTrailingSubview();
        if (trailingSubview != null) {
            t(trailingSubview);
        }
    }

    public final void setBackButtonDrawableIconResourceName$react_native_screens_release(@Nullable String str) {
        this.f11439n = str;
    }

    public void setBackButtonHidden$react_native_screens_release(boolean z10) {
        this.f11431f = z10;
    }

    public void setBackButtonIcon$react_native_screens_release(@Nullable Drawable drawable) {
        this.f11433h = drawable;
    }

    public final void setBackButtonImageIconUri$react_native_screens_release(@Nullable String str) {
        this.f11440o = str;
    }

    public void setBackButtonTintColor$react_native_screens_release(@Nullable Integer num) {
        this.f11432g = num;
    }

    public void setHidden$react_native_screens_release(boolean z10) {
        this.f11429d = z10;
    }

    @Override // Tc.e
    public void setOnConfigChangeListener(@Nullable b bVar) {
        this.f11448w = bVar != null ? new WeakReference(bVar) : null;
    }

    public void setScrollFlagEnterAlways$react_native_screens_release(boolean z10) {
        this.f11435j = z10;
    }

    public void setScrollFlagEnterAlwaysCollapsed$react_native_screens_release(boolean z10) {
        this.f11436k = z10;
    }

    public void setScrollFlagExitUntilCollapsed$react_native_screens_release(boolean z10) {
        this.f11437l = z10;
    }

    public void setScrollFlagScroll$react_native_screens_release(boolean z10) {
        this.f11434i = z10;
    }

    public void setScrollFlagSnap$react_native_screens_release(boolean z10) {
        this.f11438m = z10;
    }

    public final void setStateWrapper$react_native_screens_release(@Nullable StateWrapper stateWrapper) {
        this.f11447v.b(stateWrapper);
    }

    public void setTitle$react_native_screens_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f11428c = str;
    }

    public void setTransparent$react_native_screens_release(boolean z10) {
        this.f11430e = z10;
    }

    public void setType$react_native_screens_release(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f11427b = fVar;
    }

    public final void t(com.swmansion.rnscreens.gamma.stack.header.subview.b headerSubview) {
        Intrinsics.checkNotNullParameter(headerSubview, "headerSubview");
        headerSubview.setOnStackHeaderSubviewChangeListener$react_native_screens_release(null);
        int i10 = a.$EnumSwitchMapping$0[headerSubview.getType().ordinal()];
        if (i10 == 1) {
            this.f11443r = null;
        } else if (i10 == 2) {
            this.f11444s = null;
        } else if (i10 == 3) {
            this.f11445t = null;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11446u = null;
        }
        r();
    }

    public final void u(int i10) {
        com.swmansion.rnscreens.gamma.stack.header.subview.b q10 = q(i10);
        if (q10 != null) {
            t(q10);
        }
    }

    public final void w() {
        String str = this.f11439n;
        final String str2 = this.f11440o;
        if (Intrinsics.areEqual(str, this.f11441p) && Intrinsics.areEqual(str2, this.f11442q)) {
            return;
        }
        this.f11441p = str;
        this.f11442q = str2;
        if (str != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setBackButtonIcon$react_native_screens_release(j.a(context, str));
        } else {
            if (str2 == null) {
                setBackButtonIcon$react_native_screens_release(null);
                return;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Qc.f.c(context2, str2, new Function1() { // from class: Tc.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit v10;
                    v10 = d.v(str2, this, (Drawable) obj);
                    return v10;
                }
            });
        }
    }

    @Override // Tc.e
    @Nullable
    public com.swmansion.rnscreens.gamma.stack.header.subview.b getBackgroundSubview() {
        return this.f11443r;
    }

    @Override // Tc.e
    @Nullable
    public com.swmansion.rnscreens.gamma.stack.header.subview.b getCenterSubview() {
        return this.f11445t;
    }

    @Override // Tc.e
    @Nullable
    public com.swmansion.rnscreens.gamma.stack.header.subview.b getLeadingSubview() {
        return this.f11444s;
    }

    @Override // Tc.e
    @Nullable
    public com.swmansion.rnscreens.gamma.stack.header.subview.b getTrailingSubview() {
        return this.f11446u;
    }
}
