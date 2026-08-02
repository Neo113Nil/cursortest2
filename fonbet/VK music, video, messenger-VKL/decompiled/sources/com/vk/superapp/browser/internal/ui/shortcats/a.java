package com.vk.superapp.browser.internal.ui.shortcats;

import android.app.Activity;
import android.content.pm.ShortcutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionPlaceIdDto;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutPendingData;
import com.vk.superapp.js.bridge.events.AddToHomeScreen$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vkontakte.android.R;
import defpackage.z;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.n;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.aex0;
import xsna.az;
import xsna.bpn0;
import xsna.bz;
import xsna.cz;
import xsna.e370;
import xsna.epx;
import xsna.fhj0;
import xsna.fvv0;
import xsna.ggu0;
import xsna.gz;
import xsna.hgl0;
import xsna.iah0;
import xsna.iz;
import xsna.izs;
import xsna.j8n0;
import xsna.jv;
import xsna.jz;
import xsna.kz;
import xsna.lz;
import xsna.mfu0;
import xsna.oz;
import xsna.pll;
import xsna.pz;
import xsna.qfu0;
import xsna.qz;
import xsna.rz;
import xsna.s3q0;
import xsna.sv;
import xsna.sz;
import xsna.tz;
import xsna.ui;
import xsna.utj;
import xsna.uyp;
import xsna.uz;
import xsna.vdx0;
import xsna.wgj0;
import xsna.wz;
import xsna.x0;
import xsna.xgx0;
import xsna.xz;
import xsna.yy;
import xsna.zen0;
import xsna.zz;

/* compiled from: ActionController.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final long n = TimeUnit.SECONDS.toMillis(10);
    public static final /* synthetic */ int o = 0;
    public final pll a;
    public final fvv0 b;
    public final mfu0 c;
    public boolean d;
    public AddActionSuggestion f;
    public io.reactivex.rxjava3.disposables.c g;
    public boolean h;
    public utj i;
    public boolean j;
    public ShortcutPendingData k;
    public final hgl0 e = new hgl0();
    public final bpn0 l = new bpn0(new x0(1));
    public final bpn0 m = new bpn0(new uz(0));

    /* compiled from: ActionController.kt */
    /* renamed from: com.vk.superapp.browser.internal.ui.shortcats.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1873a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddActionSuggestion.Action.values().length];
            try {
                iArr[AddActionSuggestion.Action.RECOMMEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddActionSuggestion.Action.ADD_TO_MAIN_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddActionSuggestion.Action.RECOMMENDATION_FROM_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddActionSuggestion.Action.NOTIFICATIONS_AUTO_PERMISSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AddActionSuggestion.Action.PERSONAL_DISCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AddActionSuggestion.Action.ADD_TO_COMMUNITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AddActionSuggestion.Action.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ActionController.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: ActionController.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: ActionController.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: ActionController.kt */
    public static final class e implements aex0.d {
        public final /* synthetic */ ShortcutPendingData.ShortcutSource a;
        public final /* synthetic */ a b;

        public e(ShortcutPendingData.ShortcutSource shortcutSource, a aVar) {
            this.a = shortcutSource;
            this.b = aVar;
        }

        @Override // xsna.aex0.d
        public final void a() {
            qfu0 M;
            ShortcutPendingData.ShortcutSource shortcutSource = ShortcutPendingData.ShortcutSource.REQUEST;
            a aVar = this.b;
            ShortcutPendingData.ShortcutSource shortcutSource2 = this.a;
            if (shortcutSource2 == shortcutSource && (M = aVar.b.M()) != null) {
                M.a();
            }
            aVar.a(shortcutSource2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aex0.d
        public final void b() {
            mfu0 mfu0Var = this.b.c;
            EventNames eventNames = EventNames.AddToHomeScreen;
            mfu0Var.x(eventNames, new AddToHomeScreen$Error(null, uyp.b(eventNames, mfu0Var, null), 1, 0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aex0.d
        public final void onCancel() {
            mfu0 mfu0Var = this.b.c;
            EventNames eventNames = EventNames.AddToHomeScreen;
            mfu0Var.x(eventNames, new AddToHomeScreen$Error(null, uyp.b(eventNames, mfu0Var, null), 1, 0 == true ? 1 : 0));
        }
    }

    public a(pll pllVar, fvv0 fvv0Var, mfu0 mfu0Var) {
        this.a = pllVar;
        this.b = fvv0Var;
        this.c = mfu0Var;
    }

    public final void a(ShortcutPendingData.ShortcutSource shortcutSource) {
        pll pllVar = this.a;
        final Activity k = pllVar.k();
        if (k == null) {
            return;
        }
        final WebApiApplication t = this.b.t();
        ((ggu0) pllVar.b).r.b(new io.reactivex.rxjava3.internal.operators.single.c(new n() { // from class: xsna.vz
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                WebApiApplication webApiApplication = WebApiApplication.this;
                WebPhoto webPhoto = webApiApplication.d;
                ShortcutManager shortcutManager = (ShortcutManager) k.getSystemService("shortcut");
                String str = webPhoto.a(Math.max(shortcutManager.getIconMaxWidth(), shortcutManager.getIconMaxHeight())).b;
                ifx0 ifx0Var = e370.c;
                if (ifx0Var == null) {
                    ifx0Var = null;
                }
                return ifx0Var.d().b(str).l(new nz(new mz(webApiApplication, 0), 0));
            }
        }).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xz(new wz(this, shortcutSource, k, 0), 0), new z(new b(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1)));
    }

    public final boolean b() {
        AddActionSuggestion addActionSuggestion = this.f;
        if ((addActionSuggestion != null ? addActionSuggestion.d : null) == AddActionSuggestion.Action.RECOMMEND) {
            return true;
        }
        if ((addActionSuggestion != null ? addActionSuggestion.d : null) == AddActionSuggestion.Action.ADD_TO_MAIN_SCREEN && c()) {
            return true;
        }
        AddActionSuggestion addActionSuggestion2 = this.f;
        if ((addActionSuggestion2 != null ? addActionSuggestion2.d : null) == AddActionSuggestion.Action.RECOMMENDATION_FROM_NOTIFICATION) {
            return true;
        }
        if ((addActionSuggestion2 != null ? addActionSuggestion2.d : null) == AddActionSuggestion.Action.NOTIFICATIONS_AUTO_PERMISSION && !this.b.o()) {
            return true;
        }
        AddActionSuggestion addActionSuggestion3 = this.f;
        if ((addActionSuggestion3 != null ? addActionSuggestion3.d : null) != AddActionSuggestion.Action.PERSONAL_DISCOUNT) {
            return (addActionSuggestion3 != null ? addActionSuggestion3.d : null) == AddActionSuggestion.Action.ADD_TO_COMMUNITY;
        }
        return true;
    }

    public final boolean c() {
        Activity k = this.a.k();
        return (k == null || !fhj0.a.b(k) || wgj0.a(k, this.b.getAppId(), null)) ? false : true;
    }

    public final void d() {
        if (this.f == null && this.g == null) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            zen0 d2 = vdx0Var.d();
            fvv0 fvv0Var = this.b;
            q a = zen0.a.a(d2, fvv0Var.getAppId(), fvv0Var.T0(), null, 12);
            jz jzVar = new jz(new iz(this, 0), 0);
            a.getClass();
            new a0(new c0(a, jzVar, io.reactivex.rxjava3.internal.functions.a.c), new kz(this, 0)).subscribe(new jv(new com.vk.movika.sdk.base.observable.q(this, 2), 1), new lz(new c(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 0));
        }
    }

    public final void e() {
        if (this.g != null) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        zen0 d2 = vdx0Var.d();
        fvv0 fvv0Var = this.b;
        q a = zen0.a.a(d2, fvv0Var.getAppId(), fvv0Var.T0(), AppsNeedToShowActionPlaceIdDto.ORDER, 4);
        qz qzVar = new qz(new pz(this, 0), 0);
        a.getClass();
        ((ggu0) this.a.b).r.b(new a0(new c0(a, qzVar, io.reactivex.rxjava3.internal.functions.a.c), new rz(this, 0)).subscribe(new sv(new sz(this, 0), 1), new tz(new d(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 0)));
    }

    public final void f(Activity activity, ShortcutPendingData.ShortcutSource shortcutSource) {
        String str;
        WebImageSize a;
        fvv0 fvv0Var = this.b;
        String string = fvv0Var.h() ? activity.getString(R.string.vk_apps_add_game_to_home_screen_shortcut_title) : activity.getString(R.string.vk_apps_add_app_to_home_screen_shortcut_title);
        String string2 = fvv0Var.h() ? activity.getString(R.string.vk_apps_add_game_to_home_screen_shortcut_subtitle) : activity.getString(R.string.vk_apps_add_app_to_home_screen_shortcut_subtitle);
        WebApiApplication v = fvv0Var.v();
        if (v == null || (a = v.d.a(iah0.a(72))) == null || (str = a.b) == null) {
            str = "";
        }
        SuperappUiRouterBridge.a.e eVar = new SuperappUiRouterBridge.a.e(str, string, string2);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.g0(eVar, new e(shortcutSource, this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(AppLifecycleEvent appLifecycleEvent, j8n0 j8n0Var) {
        AddActionSuggestion addActionSuggestion;
        boolean z;
        vdx0 vdx0Var;
        Long l;
        vdx0 vdx0Var2;
        pll pllVar = this.a;
        ggu0 ggu0Var = (ggu0) pllVar.b;
        Activity k = pllVar.k();
        if (k != null && !this.d && (addActionSuggestion = this.f) != null) {
            AddActionSuggestion.Action action = addActionSuggestion.d;
            AddActionSuggestion.Action action2 = AddActionSuggestion.Action.RECOMMEND;
            fvv0 fvv0Var = this.b;
            if (action == action2 || action == AddActionSuggestion.Action.RECOMMENDATION_FROM_NOTIFICATION) {
                WebApiApplication v = fvv0Var.v();
                if (v != null ? epx.f(v.S, Boolean.TRUE) : false) {
                    WebApiApplication v2 = fvv0Var.v();
                    if ((v2 != null ? v2.S : null) != null) {
                        z = true;
                        if (!z) {
                            AddActionSuggestion addActionSuggestion2 = this.f;
                            AddActionSuggestion.Action action3 = addActionSuggestion2 != null ? addActionSuggestion2.d : null;
                            switch (action3 == null ? -1 : C1873a.$EnumSwitchMapping$0[action3.ordinal()]) {
                                case 1:
                                    vdx0Var = null;
                                    SuperappUiRouterBridge.a.h hVar = new SuperappUiRouterBridge.a.h(k.getString(R.string.vk_apps_recommendation_dialog_title), k.getString(R.string.vk_apps_recommendation_dialog_subtitle));
                                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                                    if (superappUiRouterBridge == null) {
                                        superappUiRouterBridge = null;
                                    }
                                    superappUiRouterBridge.g0(hVar, new zz(this));
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                        vdx0Var2 = vdx0Var;
                                    }
                                    q<Boolean> C = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                                case 2:
                                    vdx0Var = null;
                                    f(k, ShortcutPendingData.ShortcutSource.REQUEST);
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                    }
                                    q<Boolean> C2 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C2.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                                case 3:
                                    AddActionSuggestion addActionSuggestion3 = this.f;
                                    if (addActionSuggestion3 != null) {
                                        String str = addActionSuggestion3.e;
                                        View inflate = k.getLayoutInflater().inflate(R.layout.vk_recommendation_request_snackbar, (ViewGroup) null);
                                        if (inflate != null) {
                                            ((TextView) inflate.findViewById(R.id.tv_title)).setText(str);
                                        } else {
                                            inflate = null;
                                        }
                                        int i = utj.t;
                                        int i2 = utj.u;
                                        int i3 = utj.v;
                                        FloatingViewGesturesHelper.SwipeDirection swipeDirection = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
                                        float f = utj.x;
                                        int a = iah0.a(8);
                                        vdx0Var = null;
                                        utj utjVar = new utj(k, new utj.k(null, null, false), new utj.i(false, false, true), new utj.f(a, a, i, i, i2, i3), new utj.j(inflate, null), new utj.h(null, null), new utj.e(null, null, null), new utj.b(null, null, null), new utj.c(null, null), new utj.d(swipeDirection, 3, n, 0.7f, new utj.g(), null, false, f));
                                        utjVar.p = null;
                                        utjVar.f(k.getWindow());
                                        this.i = utjVar;
                                        this.d = true;
                                        vdx0Var2 = e370.e;
                                        if (vdx0Var2 == null) {
                                        }
                                        q<Boolean> C22 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                        new yy(0);
                                        ggu0Var.r.b(C22.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                        break;
                                    }
                                    vdx0Var = null;
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                    }
                                    q<Boolean> C222 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C222.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                                case 4:
                                    fvv0Var.t().s = true;
                                    fvv0Var.getView().lj(fvv0Var.h());
                                    vdx0Var = null;
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                    }
                                    q<Boolean> C2222 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C2222.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                                case 5:
                                    if (((Boolean) this.l.getValue()).booleanValue()) {
                                        fvv0Var.getView().C4((PersonalDiscountDialogType) this.m.getValue());
                                    } else {
                                        AddActionSuggestion addActionSuggestion4 = this.f;
                                        if (addActionSuggestion4 != null) {
                                            fvv0Var.getView().oc(addActionSuggestion4.e);
                                        }
                                    }
                                    vdx0Var = null;
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                    }
                                    q<Boolean> C22222 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C22222.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                                case 6:
                                    AddActionSuggestion addActionSuggestion5 = this.f;
                                    if (addActionSuggestion5 != null && (l = addActionSuggestion5.f) != null) {
                                        long longValue = l.longValue();
                                        vdx0 vdx0Var3 = e370.e;
                                        if (vdx0Var3 == null) {
                                            vdx0Var3 = null;
                                        }
                                        int i4 = 0;
                                        ggu0Var.r.b(vdx0Var3.j().f(longValue).subscribe(new az(new com.vk.movika.sdk.base.observable.c(this, 2), i4), new cz(new bz(i4), 0)));
                                    }
                                    vdx0Var = null;
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                    }
                                    q<Boolean> C222222 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C222222.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                                case 7:
                                    break;
                                default:
                                    vdx0Var = null;
                                    this.d = true;
                                    vdx0Var2 = e370.e;
                                    if (vdx0Var2 == null) {
                                    }
                                    q<Boolean> C2222222 = vdx0Var2.d().C(fvv0Var.getAppId(), appLifecycleEvent, this.f.d.h());
                                    new yy(0);
                                    ggu0Var.r.b(C2222222.subscribe(new gz(), new oz(new ui(xgx0.a, 1), 0)));
                                    break;
                            }
                            return;
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        if (j8n0Var != null) {
            j8n0Var.invoke();
        }
    }
}
