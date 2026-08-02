package ru.ozon.android.messenger.framework.composer.screen;

import B0.C2454a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i10.h;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import l10.u;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h.c.a f86784a;

    /* renamed from: b, reason: collision with root package name */
    private final u f86785b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86786c;

    /* renamed from: d, reason: collision with root package name */
    private final a f86787d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f86788e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f86789f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<Class<? extends ru.ozon.android.messenger.framework.composer.configuration.f>> f86790g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Set<QZ.g> f86791h;

    /* renamed from: i, reason: collision with root package name */
    private final int f86792i;

    /* renamed from: j, reason: collision with root package name */
    private final Integer f86793j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f86794k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Class<? extends E00.a> f86795l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Class<? extends C00.a> f86796m;

    public static final class a {

        /* renamed from: j, reason: collision with root package name */
        private static final int f86797j = ResourceExtKt.toPx(260);

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b.a f86798a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f86799b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final SheetSoftInputMode f86800c;

        /* renamed from: d, reason: collision with root package name */
        private final int f86801d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f86802e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f86803f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f86804g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f86805h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f86806i;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 0, 2047);
        }

        public static a a(a aVar, b.a displayMode) {
            boolean z11 = aVar.f86799b;
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            SheetSoftInputMode softInputMode = aVar.f86800c;
            Intrinsics.checkNotNullParameter(softInputMode, "softInputMode");
            return new a(displayMode, z11, softInputMode, aVar.f86801d, aVar.f86802e, aVar.f86803f, aVar.f86804g, aVar.f86805h, aVar.f86806i);
        }

        public final boolean b() {
            return this.f86802e;
        }

        @NotNull
        public final b.a c() {
            return this.f86798a;
        }

        public final int d() {
            return this.f86801d;
        }

        public final boolean e() {
            return this.f86806i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f86798a == aVar.f86798a && this.f86799b == aVar.f86799b && this.f86800c == aVar.f86800c && this.f86801d == aVar.f86801d && this.f86802e == aVar.f86802e && this.f86803f == aVar.f86803f && this.f86804g == aVar.f86804g && this.f86805h == aVar.f86805h && this.f86806i == aVar.f86806i;
        }

        public final boolean f() {
            return this.f86804g;
        }

        @NotNull
        public final SheetSoftInputMode g() {
            return this.f86800c;
        }

        public final boolean h() {
            return this.f86803f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86806i) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.f86801d, (this.f86800c.hashCode() + C3532b.a(C3532b.a(this.f86798a.hashCode() * 31, 31, false), 31, this.f86799b)) * 31, 31), 31, this.f86802e), 31, false), 31, this.f86803f), 31, this.f86804g), 31, this.f86805h);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetConfig(displayMode=");
            sb2.append(this.f86798a);
            sb2.append(", isPageViewTrackingEnabled=false, modifyWindowFlags=");
            sb2.append(this.f86799b);
            sb2.append(", softInputMode=");
            sb2.append(this.f86800c);
            sb2.append(", minHeight=");
            sb2.append(this.f86801d);
            sb2.append(", cancelable=");
            sb2.append(this.f86802e);
            sb2.append(", isDismissActivityResult=false, isToolbarEnabled=");
            sb2.append(this.f86803f);
            sb2.append(", showHandle=");
            sb2.append(this.f86804g);
            sb2.append(", roundedCorners=");
            sb2.append(this.f86805h);
            sb2.append(", showCloseButton=");
            return Pk0.a.a(")", sb2, this.f86806i);
        }

        public a(@NotNull b.a displayMode, boolean z11, @NotNull SheetSoftInputMode softInputMode, int i11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            Intrinsics.checkNotNullParameter(softInputMode, "softInputMode");
            this.f86798a = displayMode;
            this.f86799b = z11;
            this.f86800c = softInputMode;
            this.f86801d = i11;
            this.f86802e = z12;
            this.f86803f = z13;
            this.f86804g = z14;
            this.f86805h = z15;
            this.f86806i = z16;
        }

        public /* synthetic */ a(b.a aVar, SheetSoftInputMode sheetSoftInputMode, int i11, int i12) {
            this((i12 & 1) != 0 ? b.a.REGULAR : aVar, true, (i12 & 8) != 0 ? SheetSoftInputMode.UNSPECIFIED : sheetSoftInputMode, (i12 & 16) != 0 ? f86797j : i11, true, false, (i12 & 256) != 0, true, (i12 & UserVerificationMethods.USER_VERIFY_ALL) == 0);
        }
    }

    public e(@NotNull h.c.a pageRef, u uVar, boolean z11, a aVar, boolean z12, boolean z13, @NotNull Set configurators, @NotNull Set interceptors, int i11, Integer num, boolean z14, @NotNull Class composerEmptyStateScreenFactory, @NotNull Class initialWidgetsProvider) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(composerEmptyStateScreenFactory, "composerEmptyStateScreenFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        this.f86784a = pageRef;
        this.f86785b = uVar;
        this.f86786c = z11;
        this.f86787d = aVar;
        this.f86788e = z12;
        this.f86789f = z13;
        this.f86790g = configurators;
        this.f86791h = interceptors;
        this.f86792i = i11;
        this.f86793j = num;
        this.f86794k = z14;
        this.f86795l = composerEmptyStateScreenFactory;
        this.f86796m = initialWidgetsProvider;
    }

    public static e a(e eVar, a aVar) {
        h.c.a pageRef = eVar.f86784a;
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Set<Class<? extends ru.ozon.android.messenger.framework.composer.configuration.f>> configurators = eVar.f86790g;
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        Set<QZ.g> interceptors = eVar.f86791h;
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Class<? extends E00.a> composerEmptyStateScreenFactory = eVar.f86795l;
        Intrinsics.checkNotNullParameter(composerEmptyStateScreenFactory, "composerEmptyStateScreenFactory");
        Class<? extends C00.a> initialWidgetsProvider = eVar.f86796m;
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        return new e(pageRef, eVar.f86785b, eVar.f86786c, aVar, eVar.f86788e, eVar.f86789f, configurators, interceptors, eVar.f86792i, eVar.f86793j, eVar.f86794k, composerEmptyStateScreenFactory, initialWidgetsProvider);
    }

    public final boolean b() {
        return this.f86788e;
    }

    public final int c() {
        return this.f86792i;
    }

    public final a d() {
        return this.f86787d;
    }

    @NotNull
    public final Class<? extends E00.a> e() {
        return this.f86795l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f86784a, eVar.f86784a) && Intrinsics.d(this.f86785b, eVar.f86785b) && this.f86786c == eVar.f86786c && Intrinsics.d(this.f86787d, eVar.f86787d) && this.f86788e == eVar.f86788e && this.f86789f == eVar.f86789f && Intrinsics.d(this.f86790g, eVar.f86790g) && Intrinsics.d(this.f86791h, eVar.f86791h) && this.f86792i == eVar.f86792i && Intrinsics.d(this.f86793j, eVar.f86793j) && this.f86794k == eVar.f86794k && Intrinsics.d(this.f86795l, eVar.f86795l) && Intrinsics.d(this.f86796m, eVar.f86796m);
    }

    @NotNull
    public final Set<Class<? extends ru.ozon.android.messenger.framework.composer.configuration.f>> f() {
        return this.f86790g;
    }

    @NotNull
    public final Class<? extends C00.a> g() {
        return this.f86796m;
    }

    @NotNull
    public final Set<QZ.g> h() {
        return this.f86791h;
    }

    public final int hashCode() {
        int hashCode = this.f86784a.hashCode() * 31;
        u uVar = this.f86785b;
        int a11 = C3532b.a((hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31, 31, this.f86786c);
        a aVar = this.f86787d;
        int a12 = C2454a.a(this.f86792i, (this.f86791h.hashCode() + ((this.f86790g.hashCode() + C3532b.a(C3532b.a((a11 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f86788e), 31, this.f86789f)) * 31)) * 31, 29791);
        Integer num = this.f86793j;
        return this.f86796m.hashCode() + ((this.f86795l.hashCode() + C3532b.a((a12 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f86794k)) * 31);
    }

    @NotNull
    public final h.c i() {
        return this.f86784a;
    }

    public final Integer j() {
        return this.f86793j;
    }

    public final u k() {
        return this.f86785b;
    }

    public final boolean l() {
        return this.f86794k;
    }

    public final boolean m() {
        return this.f86786c;
    }

    public final boolean n() {
        return this.f86789f;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerScreenConfig(pageRef=");
        sb2.append(this.f86784a);
        sb2.append(", toolbarConfig=");
        sb2.append(this.f86785b);
        sb2.append(", isPageViewTrackingEnabled=");
        sb2.append(this.f86786c);
        sb2.append(", bottomSheetConfig=");
        sb2.append(this.f86787d);
        sb2.append(", animationEnabled=");
        sb2.append(this.f86788e);
        sb2.append(", isSwipeToRefreshEnabled=");
        sb2.append(this.f86789f);
        sb2.append(", configurators=");
        sb2.append(this.f86790g);
        sb2.append(", interceptors=");
        sb2.append(this.f86791h);
        sb2.append(", backgroundColor=");
        sb2.append(this.f86792i);
        sb2.append(", loader=null, notRemovableOverlayWidgets=null, softInputMode=");
        sb2.append(this.f86793j);
        sb2.append(", isFirstRowSpacerEnabled=");
        sb2.append(this.f86794k);
        sb2.append(", composerEmptyStateScreenFactory=");
        sb2.append(this.f86795l);
        sb2.append(", initialWidgetsProvider=");
        return Fj.c.c(sb2, this.f86796m, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(h.c.a aVar, u uVar, a aVar2, Set set, int i11, Class cls, int i12) {
        this(aVar, r6, true, r8, true, r10, r11, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r11 : set, (i12 & 256) != 0 ? R$color.layer_floor_1 : i11, (i12 & 2048) != 0 ? null : 16, (i12 & 4096) != 0, (i12 & 8192) != 0 ? ru.ozon.android.messenger.framework.composer.emptyscreen.a.class : cls, ru.ozon.android.messenger.framework.composer.initialwidgets.a.class);
        u uVar2 = (i12 & 2) != 0 ? new u(0) : uVar;
        a aVar3 = (i12 & 8) != 0 ? null : aVar2;
        boolean z11 = (i12 & 32) != 0;
        M m11 = M.f71699a;
    }
}
