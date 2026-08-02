package ru.ozon.fintech.features.sharing.presentation.photo;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import B0.C2454a;
import C.D;
import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MenuItem;
import d40.InterfaceC6083a;
import e80.C6319a;
import h3.C6788a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.app.android.R;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.ui.thumb.ThumbState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import xe.C10720e0;
import xe.C10727i;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a extends E30.d implements f.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f96290a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f96291b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f96292c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U30.a f96293d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r90.f f96294e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final K40.a f96295f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f96296g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC9782b f96297h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<C9987a> f96298i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private C0 f96299j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f96300k;

    /* renamed from: l, reason: collision with root package name */
    private int f96301l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f96302m;

    /* renamed from: n, reason: collision with root package name */
    private List<String> f96303n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private String f96304o;

    /* renamed from: p, reason: collision with root package name */
    private List<String> f96305p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private x0<FinToolbarState> f96306q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final x0<C2083a> f96307r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C0 f96308s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C0 f96309t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final C0 f96310u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C0 f96311v;

    /* renamed from: w, reason: collision with root package name */
    private Function0<Unit> f96312w;

    /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.a$a, reason: collision with other inner class name */
    public static final class C2083a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f96313a;

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f96314b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Object f96315c;

        /* renamed from: d, reason: collision with root package name */
        private final int f96316d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f96317e;

        public C2083a(List<String> list, List<String> list2, @NotNull List<ThumbState> thumbs, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(thumbs, "thumbs");
            this.f96313a = list;
            this.f96314b = list2;
            this.f96315c = thumbs;
            this.f96316d = i11;
            this.f96317e = z11;
        }

        public final List<String> a() {
            return this.f96314b;
        }

        public final boolean b() {
            return this.f96317e;
        }

        public final List<String> c() {
            return this.f96313a;
        }

        public final int d() {
            return this.f96316d;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ru.ozon.fintech.ui.thumb.ThumbState>] */
        @NotNull
        public final List<ThumbState> e() {
            return this.f96315c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2083a)) {
                return false;
            }
            C2083a c2083a = (C2083a) obj;
            return Intrinsics.d(this.f96313a, c2083a.f96313a) && Intrinsics.d(this.f96314b, c2083a.f96314b) && Intrinsics.d(this.f96315c, c2083a.f96315c) && this.f96316d == c2083a.f96316d && this.f96317e == c2083a.f96317e;
        }

        public final int hashCode() {
            List<String> list = this.f96313a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.f96314b;
            return Boolean.hashCode(this.f96317e) + C2454a.a(this.f96316d, H00.a.c((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f96315c), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(pagerUrls=");
            sb2.append(this.f96313a);
            sb2.append(", base64Keys=");
            sb2.append(this.f96314b);
            sb2.append(", thumbs=");
            sb2.append(this.f96315c);
            sb2.append(", selectedPage=");
            sb2.append(this.f96316d);
            sb2.append(", hiddenThumbs=");
            return Pk0.a.a(")", sb2, this.f96317e);
        }
    }

    /* synthetic */ class b extends C7719a implements Function1<AbstractC9781a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC9781a abstractC9781a) {
            ((w0) this.receiver).tryEmit(abstractC9781a);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((a) this.receiver).permissionUpdated(null);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((S80.b) this.receiver).pop();
            return Unit.f71690a;
        }
    }

    /* synthetic */ class e extends C7735q implements Function1<MenuItem, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItem menuItem) {
            MenuItem p02 = menuItem;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.f0((a) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class f extends C7735q implements Function1<ActionResult2, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2 actionResult2) {
            ActionResult2 p02 = actionResult2;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.h0((a) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    public a(@NotNull Application application, @NotNull InterfaceC6083a exchanger, @NotNull S80.b fintechNavigation, @NotNull U30.a fileManager, @NotNull r90.f permissionsDelegate, @NotNull K40.a cbottomDisplay, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f96290a = application;
        this.f96291b = exchanger;
        this.f96292c = fintechNavigation;
        this.f96293d = fileManager;
        this.f96294e = permissionsDelegate;
        this.f96295f = cbottomDisplay;
        this.f96296g = settings;
        this.f96298i = O0.a(null);
        this.f96299j = E0.a(0, 1, EnumC11113a.DROP_LATEST);
        this.f96304o = "";
        this.f96306q = O0.a(null);
        this.f96307r = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f96308s = E0.a(0, 1, enumC11113a);
        this.f96309t = E0.a(0, 1, enumC11113a);
        this.f96310u = E0.a(0, 1, enumC11113a);
        this.f96311v = E0.a(0, 1, enumC11113a);
        permissionsDelegate.s(this);
    }

    public static Unit d0(a aVar, Bitmap bitmap, String str) {
        Cbottom2SnackDTO b11;
        aVar.getClass();
        Uri o11 = (bitmap == null || str == null) ? null : aVar.f96293d.o(bitmap, str);
        Application application = aVar.f96290a;
        K40.a aVar2 = aVar.f96295f;
        if (o11 != null) {
            K40.b creator = aVar2.creator();
            String string = application.getString(R.string.fintech_share_photo_ok_save);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            b11 = K40.b.h(creator, string, D.d(8), 28);
        } else {
            K40.b creator2 = aVar2.creator();
            String string2 = application.getString(R.string.fintech_share_photo_cant_save);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            b11 = K40.b.b(creator2, string2, D.d(8), 28);
        }
        C6788a a11 = androidx.lifecycle.x0.a(aVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.features.sharing.presentation.photo.d(aVar, b11, null), 2);
        aVar.f96312w = null;
        return Unit.f71690a;
    }

    public static Unit e0(a aVar, Bitmap bitmap, String str) {
        aVar.getClass();
        if (bitmap != null && str != null) {
            String i11 = aVar.f96296g.i();
            String string = aVar.f96290a.getString(R.string.fintech_share_photo_chooser_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            aVar.f96293d.i(str, i11, string, bitmap);
        }
        aVar.f96312w = null;
        return Unit.f71690a;
    }

    public static final void f0(a aVar) {
        K40.b creator = aVar.f96295f.creator();
        Application application = aVar.f96290a;
        String string = application.getString(R.string.fintech_share_photo_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = application.getString(R.string.fintech_share_photo_save);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String obj = new OzonSpannableString(string2).toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        String string3 = application.getString(R.string.fintech_share_photo_share);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String obj2 = new OzonSpannableString(string3).toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        creator.getClass();
        aVar.f96295f.g(K40.b.e(string, obj, obj2), CbottomType.SHEET, aVar.f96304o, null);
    }

    public static final void h0(a aVar, ActionResult2 actionResult2) {
        aVar.getClass();
        String composerActionId = actionResult2.getComposerActionId();
        if (composerActionId != null) {
            int hashCode = composerActionId.hashCode();
            if (hashCode == -2019611686) {
                if (composerActionId.equals("DESTROY")) {
                    aVar.f96300k = false;
                    aVar.f96312w = null;
                    return;
                }
                return;
            }
            if (hashCode == -1273508709) {
                if (composerActionId.equals("SHEET_SHARE_ID")) {
                    aVar.f96310u.tryEmit(Integer.valueOf(aVar.f96301l));
                }
            } else if (hashCode == 118646066 && composerActionId.equals("SHEET_DOWNLOAD_ID")) {
                aVar.f96309t.tryEmit(Integer.valueOf(aVar.f96301l));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    private final void handleState() {
        a aVar;
        ArrayList arrayList;
        K k11;
        a aVar2 = this;
        x0<C9987a> x0Var = aVar2.f96298i;
        AbstractC9782b abstractC9782b = aVar2.f96297h;
        C0 c02 = aVar2.f96299j;
        b bVar = new b(1, c02, w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8);
        c cVar = new c(0, aVar2, a.class, "closePermissionRequest", "closePermissionRequest()V", 0);
        r90.f fVar = aVar2.f96294e;
        Application application = aVar2.f96290a;
        x0Var.setValue(fVar.q(abstractC9782b, application, bVar, cVar));
        c02.tryEmit(r90.f.p(aVar2.f96297h));
        List<String> list = aVar2.f96303n;
        aVar2.f96306q.setValue(new FinToolbarState(application.getString(R.string.fintech_share_photo_title, Integer.valueOf(aVar2.f96301l + 1), Integer.valueOf((list == null && (list = aVar2.f96305p) == null) ? 0 : list.size())), null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new d(0, aVar2.f96292c, S80.b.class, "pop", "pop()V", 0), Integer.valueOf(FinToolbarState.INSTANCE.getTHREE_DOTS_MENU_RES()), null, null, new e(1, aVar2, a.class, "dotsClicked", "dotsClicked(Landroid/view/MenuItem;)V", 0), 17, 25086, null));
        x0<C2083a> x0Var2 = aVar2.f96307r;
        List<String> list2 = aVar2.f96303n;
        List<String> list3 = aVar2.f96305p;
        if (list2 != null) {
            List<String> list4 = list2;
            arrayList = new ArrayList(C7714v.z(list4, 10));
            int i11 = 0;
            for (Object obj : list4) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(new ThumbState(Ej.b.a(i11, "Thumb_"), (String) obj, null, null, i11 == aVar2.f96301l, i11, new ru.ozon.fintech.features.sharing.presentation.photo.b(1, aVar2, a.class, "thumbClicked", "thumbClicked(I)V", 0)));
                i11 = i12;
            }
        } else {
            if (list3 == null) {
                aVar = aVar2;
                k11 = K.f71697a;
                x0Var2.setValue(new C2083a(list2, list3, k11, aVar.f96301l, aVar.f96302m));
            }
            List<String> list5 = list3;
            arrayList = new ArrayList(C7714v.z(list5, 10));
            int i13 = 0;
            for (Object obj2 : list5) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                String str = (String) obj2;
                arrayList.add(new ThumbState(Ej.b.a(i13, "Thumb_"), null, str, C6319a.b(str), i13 == aVar2.f96301l, i13, new ru.ozon.fintech.features.sharing.presentation.photo.c(1, aVar2, a.class, "thumbClicked", "thumbClicked(I)V", 0)));
                aVar2 = aVar2;
                i13 = i14;
            }
        }
        aVar = aVar2;
        k11 = arrayList;
        x0Var2.setValue(new C2083a(list2, list3, k11, aVar.f96301l, aVar.f96302m));
    }

    public static final void i0(a aVar, int i11) {
        aVar.f96301l = i11;
        aVar.f96308s.tryEmit(Integer.valueOf(i11));
        aVar.handleState();
    }

    @NotNull
    public final w0<AbstractC9781a> getPermissionAction() {
        return this.f96299j;
    }

    @NotNull
    public final x0<C9987a> getPermissionScreenState() {
        return this.f96298i;
    }

    @NotNull
    public final x0<C2083a> getState() {
        return this.f96307r;
    }

    @NotNull
    public final String getUuid() {
        return this.f96304o;
    }

    @NotNull
    public final x0<FinToolbarState> j0() {
        return this.f96306q;
    }

    @NotNull
    public final C0 k0() {
        return this.f96309t;
    }

    @NotNull
    public final C0 l0() {
        return this.f96308s;
    }

    @NotNull
    public final C0 m0() {
        return this.f96311v;
    }

    @NotNull
    public final C0 n0() {
        return this.f96310u;
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f96300k) {
            this.f96294e.g(activity);
        }
    }

    public final void onStart() {
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f96304o;
        companion.getClass();
        this.f96291b.b(ActionResult2.Companion.a(str), androidx.lifecycle.x0.a(this), false, new f(1, this, a.class, "sheetClicked", "sheetClicked(Lru/ozon/fintech/exchanger/datapass/ActionResult2;)V", 0));
    }

    public final void onStop() {
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f96304o;
        companion.getClass();
        this.f96291b.a(ActionResult2.Companion.a(str));
        List<String> list = this.f96305p;
        if (list != null) {
            C6319a.a(list);
        }
    }

    public final void p0(int i11) {
        this.f96301l = i11;
        this.f96311v.tryEmit(Integer.valueOf(i11));
        handleState();
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        this.f96297h = abstractC9782b;
        if (abstractC9782b instanceof AbstractC9782b.a) {
            Function0<Unit> function0 = this.f96312w;
            if (function0 != null) {
                function0.invoke();
            }
            this.f96312w = null;
        }
        handleState();
    }

    public final boolean q0() {
        return this.f96296g.isStandAloneIntegration();
    }

    public final void r0() {
        this.f96292c.pop();
    }

    public final void s0(List<String> list, List<String> list2, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f96303n = list;
        this.f96304o = uuid;
        this.f96305p = list2;
        int size = list != null ? list.size() : list2 != null ? list2.size() : 0;
        if (i11 >= size) {
            this.f96301l = Math.max(0, size - 1);
        } else if (i11 < 0) {
            this.f96301l = 0;
        } else {
            this.f96301l = i11;
        }
        handleState();
    }

    public final void t0(final Bitmap bitmap, int i11) {
        Activity c11 = this.f96292c.c();
        if (c11 != null) {
            this.f96300k = true;
            List<String> list = this.f96303n;
            final String str = null;
            String str2 = list != null ? list.get(i11) : null;
            List<String> list2 = this.f96305p;
            String str3 = list2 != null ? list2.get(i11) : null;
            if (str2 != null) {
                str = this.f96293d.b(str2);
            } else if (str3 != null) {
                str = str3;
            }
            this.f96312w = new Function0() { // from class: d80.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ru.ozon.fintech.features.sharing.presentation.photo.a.d0(ru.ozon.fintech.features.sharing.presentation.photo.a.this, bitmap, str);
                }
            };
            this.f96294e.g(c11);
        }
    }

    public final void u0(boolean z11) {
        this.f96302m = z11;
        handleState();
    }

    public final void v0(final Bitmap bitmap, int i11) {
        List<String> list = this.f96303n;
        final String str = null;
        String str2 = list != null ? list.get(i11) : null;
        List<String> list2 = this.f96305p;
        String str3 = list2 != null ? list2.get(i11) : null;
        if (str2 != null) {
            str = this.f96293d.b(str2);
        } else if (str3 != null) {
            str = str3;
        }
        Activity c11 = this.f96292c.c();
        if (c11 != null) {
            this.f96300k = true;
            this.f96312w = new Function0() { // from class: d80.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ru.ozon.fintech.features.sharing.presentation.photo.a.e0(ru.ozon.fintech.features.sharing.presentation.photo.a.this, bitmap, str);
                }
            };
            this.f96294e.g(c11);
        }
    }
}
