package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class l0 extends ReactViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public b f41982a;

    /* renamed from: b, reason: collision with root package name */
    public a f41983b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41984c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41985d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41986e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f41987f;

    /* renamed from: g, reason: collision with root package name */
    public String f41988g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41990i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41991j;

    /* renamed from: k, reason: collision with root package name */
    public m0 f41992k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41993l;

    /* renamed from: m, reason: collision with root package name */
    public final int f41994m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f41995a = new a("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f41996b = new a("WORDS", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f41997c = new a("SENTENCES", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f41998d = new a("CHARACTERS", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f41999e;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f41999e = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f41995a, f41996b, f41997c, f41998d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final b f42000a = new d("TEXT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f42001b = new c("PHONE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f42002c = new C0598b("NUMBER", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f42003d = new a("EMAIL", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42004e;

        public static final class a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.l0.b
            public int b(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 32;
            }
        }

        /* renamed from: com.swmansion.rnscreens.l0$b$b, reason: collision with other inner class name */
        public static final class C0598b extends b {
            public C0598b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.l0.b
            public int b(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 2;
            }
        }

        public static final class c extends b {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.l0.b
            public int b(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 3;
            }
        }

        public static final class d extends b {

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.f41995a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.f41996b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.f41997c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.f41998d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.l0.b
            public int b(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                int i10 = a.$EnumSwitchMapping$0[capitalize.ordinal()];
                if (i10 == 1) {
                    return 1;
                }
                if (i10 == 2) {
                    return 8192;
                }
                if (i10 == 3) {
                    return 16384;
                }
                if (i10 == 4) {
                    return 4096;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        static {
            b[] a10 = a();
            $VALUES = a10;
            f42004e = EnumEntriesKt.enumEntries(a10);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f42000a, f42001b, f42002c, f42003d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract int b(a aVar);

        public b(String str, int i10) {
        }
    }

    public static final class c implements SearchView.m {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean p(String str) {
            l0.this.C(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean t(String str) {
            l0.this.D(str);
            return true;
        }
    }

    public l0(ReactContext reactContext) {
        super(reactContext);
        this.f41982a = b.f42000a;
        this.f41983b = a.f41995a;
        this.f41988g = "";
        this.f41989h = true;
        this.f41991j = true;
        this.f41994m = UIManagerHelper.getSurfaceId(this);
    }

    public static final Unit F(l0 l0Var, C3812c newSearchView) {
        Y screenStackFragment;
        C3812c searchView;
        Intrinsics.checkNotNullParameter(newSearchView, "newSearchView");
        if (l0Var.f41992k == null) {
            l0Var.f41992k = new m0(newSearchView);
        }
        l0Var.L();
        if (l0Var.f41990i && (screenStackFragment = l0Var.getScreenStackFragment()) != null && (searchView = screenStackFragment.getSearchView()) != null) {
            searchView.q0();
        }
        return Unit.INSTANCE;
    }

    public static final void I(l0 l0Var, View view, boolean z10) {
        l0Var.y(z10);
    }

    public static final boolean J(l0 l0Var) {
        l0Var.x();
        return false;
    }

    public static final void K(l0 l0Var, View view) {
        l0Var.A();
    }

    private final b0 getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof d0) {
            return ((d0) parent).getConfig();
        }
        return null;
    }

    private final Y getScreenStackFragment() {
        b0 headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.i0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                l0.I(l0.this, view, z10);
            }
        });
        searchView.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.j0
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                boolean J10;
                J10 = l0.J(l0.this);
                return J10;
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.K(l0.this, view);
            }
        });
    }

    private final void setToolbarElementsVisibility(int i10) {
        int i11 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            b0 headerConfig = getHeaderConfig();
            d0 i12 = headerConfig != null ? headerConfig.i(i11) : null;
            if ((i12 != null ? i12.getType() : null) != d0.a.f41781e && i12 != null) {
                i12.setVisibility(i10);
            }
            if (i11 == configSubviewsCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void A() {
        H(new Mc.q(this.f41994m, getId()));
        setToolbarElementsVisibility(8);
    }

    public final void B(String str) {
        Y screenStackFragment;
        C3812c searchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(str);
    }

    public final void C(String str) {
        H(new Mc.n(this.f41994m, getId(), str));
    }

    public final void D(String str) {
        H(new Mc.r(this.f41994m, getId(), str));
    }

    public final void E(boolean z10) {
    }

    public final void G() {
        L();
    }

    public final void H(Event event) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    public final void L() {
        Y screenStackFragment = getScreenStackFragment();
        C3812c searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.f41993l) {
                setSearchViewListeners(searchView);
                this.f41993l = true;
            }
            searchView.setInputType(this.f41982a.b(this.f41983b));
            m0 m0Var = this.f41992k;
            if (m0Var != null) {
                m0Var.h(this.f41984c);
            }
            m0 m0Var2 = this.f41992k;
            if (m0Var2 != null) {
                m0Var2.i(this.f41985d);
            }
            m0 m0Var3 = this.f41992k;
            if (m0Var3 != null) {
                m0Var3.e(this.f41986e);
            }
            m0 m0Var4 = this.f41992k;
            if (m0Var4 != null) {
                m0Var4.f(this.f41987f);
            }
            m0 m0Var5 = this.f41992k;
            if (m0Var5 != null) {
                m0Var5.g(this.f41988g, this.f41991j);
            }
            searchView.setOverrideBackAction(this.f41989h);
        }
    }

    @NotNull
    public final a getAutoCapitalize() {
        return this.f41983b;
    }

    public final boolean getAutoFocus() {
        return this.f41990i;
    }

    @Nullable
    public final Integer getHeaderIconColor() {
        return this.f41986e;
    }

    @Nullable
    public final Integer getHintTextColor() {
        return this.f41987f;
    }

    @NotNull
    public final b getInputType() {
        return this.f41982a;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.f41988g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f41989h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f41991j;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.f41984c;
    }

    @Nullable
    public final Integer getTintColor() {
        return this.f41985d;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.V0(new Function1() { // from class: com.swmansion.rnscreens.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit F10;
                    F10 = l0.F(l0.this, (C3812c) obj);
                    return F10;
                }
            });
        }
    }

    public final void setAutoCapitalize(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41983b = aVar;
    }

    public final void setAutoFocus(boolean z10) {
        this.f41990i = z10;
    }

    public final void setHeaderIconColor(@Nullable Integer num) {
        this.f41986e = num;
    }

    public final void setHintTextColor(@Nullable Integer num) {
        this.f41987f = num;
    }

    public final void setInputType(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f41982a = bVar;
    }

    public final void setPlaceholder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f41988g = str;
    }

    public final void setShouldOverrideBackButton(boolean z10) {
        this.f41989h = z10;
    }

    public final void setShouldShowHintSearchIcon(boolean z10) {
        this.f41991j = z10;
    }

    public final void setTextColor(@Nullable Integer num) {
        this.f41984c = num;
    }

    public final void setTintColor(@Nullable Integer num) {
        this.f41985d = num;
    }

    public final void u() {
        C3812c searchView;
        Y screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void v() {
        C3812c searchView;
        Y screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.o0();
    }

    public final void w() {
        C3812c searchView;
        Y screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.p0();
    }

    public final void x() {
        H(new Mc.o(this.f41994m, getId()));
        setToolbarElementsVisibility(0);
    }

    public final void y(boolean z10) {
        H(z10 ? new Mc.p(this.f41994m, getId()) : new Mc.m(this.f41994m, getId()));
    }

    public final void z() {
        C3812c searchView;
        Y screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.q0();
    }
}
