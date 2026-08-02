package com.vk.superapp.browser.internal.ui.menu.action;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.adapter.RecyclerViewState;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.dto.hints.HintId;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.ActionMenuCloseCause;
import com.vkontakte.android.R;
import defpackage.z;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a820;
import xsna.b40;
import xsna.bw;
import xsna.c40;
import xsna.d40;
import xsna.dex0;
import xsna.dh6;
import xsna.dw20;
import xsna.e1;
import xsna.e370;
import xsna.e3m;
import xsna.e40;
import xsna.e43;
import xsna.f40;
import xsna.fvv0;
import xsna.iah0;
import xsna.j5g;
import xsna.nw20;
import xsna.ofu0;
import xsna.oux0;
import xsna.pfu0;
import xsna.pla;
import xsna.rxi0;
import xsna.tzp0;
import xsna.u080;
import xsna.udx0;
import xsna.v5;
import xsna.vdx0;
import xsna.vf1;
import xsna.wc80;
import xsna.xfu0;
import xsna.yyb0;
import xsna.z4t0;

/* compiled from: VkBrowserActionMenu.kt */
/* loaded from: classes6.dex */
public final class n implements xfu0, ModalBottomSheetBehavior.e {
    public final fvv0 b;
    public List<String> c;
    public dw20 d;
    public Context e;
    public RecyclerViewState f;
    public SuperappUiRouterBridge.c g;
    public final c h;
    public final com.vk.superapp.browser.internal.ui.menu.action.c i;
    public final com.vk.superapp.browser.internal.ui.menu.action.a j;

    /* compiled from: VkBrowserActionMenu.kt */
    public final class a {
        public a() {
        }

        public final void a() {
            n.this.dismiss();
        }

        public final void b() {
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
            dw20 dw20Var = n.this.d;
            KeyEvent.Callback callback = dw20Var != null ? dw20Var.s : null;
            nw20 nw20Var = callback instanceof nw20 ? (nw20) callback : null;
            if (nw20Var == null || (modalBottomSheetBehavior = nw20Var.i) == null) {
                return;
            }
            modalBottomSheetBehavior.E = true;
        }
    }

    /* compiled from: VkBrowserActionMenu.kt */
    public static final class b implements a820 {

        /* compiled from: VkBrowserActionMenu.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OtherAction.values().length];
                try {
                    iArr[OtherAction.ALLOW_BADGES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OtherAction.DISALLOW_BADGES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
        }

        @Override // xsna.a820
        public final void a(OtherAction otherAction, Rect rect) {
            n nVar;
            Context context;
            Activity h;
            int i = a.$EnumSwitchMapping$0[otherAction.ordinal()];
            if ((i != 1 && i != 2) || (context = (nVar = n.this).e) == null || (h = e3m.h(context)) == null) {
                return;
            }
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            nVar.g = superappUiRouterBridge.m(h, rect, new vf1(19, nVar, otherAction));
        }
    }

    /* compiled from: VkBrowserActionMenu.kt */
    public static final class c implements dh6.a {
        public c() {
        }

        @Override // xsna.dh6.a
        public final void a() {
            tzp0.b bVar;
            fvv0 fvv0Var = n.this.i.a;
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            boolean f = fvv0Var.t().f();
            int i = (int) fvv0Var.t().b;
            String str = fvv0Var.t().D;
            String str2 = fvv0Var.t().w;
            udx0Var.getClass();
            if (f) {
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GAME;
                rxi0.a.getClass();
                bVar = new tzp0.b(new SchemeStat$EventItem(type, null, null, null, str2, rxi0.b(i), 14, null));
            } else {
                SchemeStat$EventItem.Type type2 = SchemeStat$EventItem.Type.MINI_APP;
                rxi0.a.getClass();
                bVar = new tzp0.b(new SchemeStat$EventItem(type2, null, null, null, str2, rxi0.b(i), 14, null));
            }
            bVar.e(Integer.valueOf(i));
            bVar.g(new SchemeStat$TypeMiniAppItem(SchemeStat$TypeMiniAppItem.Type.NAVIGATION, str, null, 4, null));
            bVar.a();
        }

        @Override // xsna.dh6.a
        public final void b() {
            tzp0.b bVar;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem;
            SchemeStat$TypeMiniAppItem.Type type;
            com.vk.superapp.browser.internal.ui.menu.action.c cVar = n.this.i;
            fvv0 fvv0Var = cVar.a;
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            boolean f = fvv0Var.t().f();
            int i = (int) fvv0Var.t().b;
            ActionMenuCloseCause actionMenuCloseCause = cVar.h;
            String str = fvv0Var.t().D;
            String str2 = fvv0Var.t().w;
            udx0Var.getClass();
            if (f) {
                SchemeStat$EventItem.Type type2 = SchemeStat$EventItem.Type.GAME;
                rxi0.a.getClass();
                bVar = new tzp0.b(new SchemeStat$EventItem(type2, null, null, null, str2, rxi0.b(i), 14, null));
            } else {
                SchemeStat$EventItem.Type type3 = SchemeStat$EventItem.Type.MINI_APP;
                rxi0.a.getClass();
                bVar = new tzp0.b(new SchemeStat$EventItem(type3, null, null, null, str2, rxi0.b(i), 14, null));
            }
            if (actionMenuCloseCause != null) {
                switch (udx0.a.$EnumSwitchMapping$14[actionMenuCloseCause.ordinal()]) {
                    case 1:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_SHARE;
                        break;
                    case 2:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ADD_TO_HOME_SCREEN;
                        break;
                    case 3:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ABOUT_SCREEN;
                        break;
                    case 4:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_REPORT;
                        break;
                    case 5:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_CLEAR_CACHE;
                        break;
                    case 6:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_DELETE;
                        break;
                    case 7:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_REMOVE_FROM_FAVOURITES;
                        break;
                    case 8:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_COPY;
                        break;
                    case 9:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_RECOMMEND;
                        break;
                    case 10:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_UNRECOMMEND;
                        break;
                    case 11:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_FAVE_ADD;
                        break;
                    case 12:
                        type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_FAVE_REMOVE;
                        break;
                    case 13:
                        type = SchemeStat$TypeMiniAppItem.Type.NAVIGATION;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                SchemeStat$TypeMiniAppItem.Type type4 = type;
                if (type4 != null) {
                    schemeStat$TypeMiniAppItem = new SchemeStat$TypeMiniAppItem(type4, str, null, 4, null);
                    bVar.g(schemeStat$TypeMiniAppItem);
                    bVar.e(Integer.valueOf(i));
                    bVar.b();
                    cVar.h = null;
                }
            }
            schemeStat$TypeMiniAppItem = null;
            bVar.g(schemeStat$TypeMiniAppItem);
            bVar.e(Integer.valueOf(i));
            bVar.b();
            cVar.h = null;
        }
    }

    public n(wc80 wc80Var, fvv0 fvv0Var, boolean z, boolean z2) {
        this.b = fvv0Var;
        fvv0Var.f();
        fvv0Var.v();
        fvv0Var.v();
        this.f = RecyclerViewState.CAN_SCROLL_BOTTOM;
        this.h = new c();
        b bVar = new b();
        com.vk.superapp.browser.internal.ui.menu.action.c cVar = new com.vk.superapp.browser.internal.ui.menu.action.c(wc80Var, fvv0Var, z, z2);
        this.i = cVar;
        this.j = new com.vk.superapp.browser.internal.ui.menu.action.a(cVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013c  */
    @Override // xsna.xfu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context) {
        boolean z;
        dw20.a i;
        com.vk.superapp.browser.internal.ui.menu.action.c cVar;
        this.e = context;
        dex0 dex0Var = e370.s;
        fvv0 fvv0Var = this.b;
        boolean z2 = (dex0Var == null || !pla.e().b().m(HintId.INFO_MINI_APPS_BADGES_ACTION_MENU) || fvv0Var.t().R == null) ? false : true;
        dw20.b x = ((dw20.b) new dw20.b(context, this.h).l(e3m.f(R.attr.vk_ui_background_content, context)).Z(new yyb0(this, 1)).J()).F0(true).q0(false).x(0);
        if (!z2) {
            if (!(this.e != null ? !iah0.s(r5) : false)) {
                z = false;
                dw20.b u = x.I(z).e0(new ofu0(this, z2)).u(0);
                z4t0 z4t0Var = new z4t0(this, 3);
                u.getClass();
                u.d.i1 = z4t0Var;
                dw20.b c2 = u.c(new pfu0(this));
                u080 u080Var = new u080() { // from class: xsna.nfu0
                    @Override // xsna.u080
                    public final bqx0 b(View view, bqx0 bqx0Var) {
                        com.vk.superapp.browser.internal.ui.menu.action.n nVar = com.vk.superapp.browser.internal.ui.menu.action.n.this;
                        if (nVar.b.t().f()) {
                            if (nVar.e != null ? !iah0.s(r2) : false) {
                                return bqx0.b;
                            }
                        }
                        return bqx0Var;
                    }
                };
                c2.getClass();
                e.a aVar = c2.d;
                c2.d.d1 = u080Var;
                if (fvv0Var.t().f()) {
                    aVar.B = true;
                    if (!iah0.o(context)) {
                        aVar.A = true;
                    }
                }
                i = c2.v(0).i(this.j, (r3 & 2) == 0, false);
                this.d = ((dw20.b) i).I0("mini_app_options");
                a aVar2 = new a();
                cVar = this.i;
                io.reactivex.rxjava3.disposables.b bVar = cVar.d;
                cVar.e = aVar2;
                fvv0 fvv0Var2 = cVar.a;
                cVar.f = fvv0Var2.t().u;
                cVar.f();
                if (!cVar.r) {
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    bVar.b(vdx0Var.d().p((int) fvv0Var2.t().b).U(new e40(new d40(0), 0)).subscribe(new z(new com.vk.movika.sdk.base.data.a(cVar, 3), 2), new f40(new e1(cVar, 4), 0)));
                }
                if (cVar.s) {
                    vdx0 vdx0Var2 = e370.e;
                    bVar.b((vdx0Var2 != null ? vdx0Var2 : null).d().q(fvv0Var2.t().b).subscribe(new bw(new v5(cVar, 3), 1), new c40(new b40(0), 0)));
                    return;
                }
                return;
            }
        }
        z = true;
        dw20.b u2 = x.I(z).e0(new ofu0(this, z2)).u(0);
        z4t0 z4t0Var2 = new z4t0(this, 3);
        u2.getClass();
        u2.d.i1 = z4t0Var2;
        dw20.b c22 = u2.c(new pfu0(this));
        u080 u080Var2 = new u080() { // from class: xsna.nfu0
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                com.vk.superapp.browser.internal.ui.menu.action.n nVar = com.vk.superapp.browser.internal.ui.menu.action.n.this;
                if (nVar.b.t().f()) {
                    if (nVar.e != null ? !iah0.s(r2) : false) {
                        return bqx0.b;
                    }
                }
                return bqx0Var;
            }
        };
        c22.getClass();
        e.a aVar3 = c22.d;
        c22.d.d1 = u080Var2;
        if (fvv0Var.t().f()) {
        }
        i = c22.v(0).i(this.j, (r3 & 2) == 0, false);
        this.d = ((dw20.b) i).I0("mini_app_options");
        a aVar22 = new a();
        cVar = this.i;
        io.reactivex.rxjava3.disposables.b bVar2 = cVar.d;
        cVar.e = aVar22;
        fvv0 fvv0Var22 = cVar.a;
        cVar.f = fvv0Var22.t().u;
        cVar.f();
        if (!cVar.r) {
        }
        if (cVar.s) {
        }
    }

    @Override // xsna.xfu0
    public final void b(Boolean bool) {
        if (bool != null) {
            com.vk.superapp.browser.internal.ui.menu.action.c cVar = this.i;
            cVar.m = bool;
            cVar.f();
        }
    }

    @Override // xsna.xfu0
    public final void c(List<String> list) {
        Iterable l;
        this.c = list;
        com.vk.superapp.browser.internal.ui.menu.action.c cVar = this.i;
        cVar.getClass();
        if (list == null) {
            cVar.n = EmptyList.b;
            return;
        }
        List list2 = EmptyList.b;
        for (String str : list) {
            List list3 = list2;
            int hashCode = str.hashCode();
            if (hashCode == 393159697) {
                if (str.equals("toggle_counter")) {
                    l = e43.l(OtherAction.ALLOW_BADGES, OtherAction.DISALLOW_BADGES);
                }
                l = EmptyList.b;
            } else if (hashCode != 1450388282) {
                if (hashCode == 1736359741 && str.equals("toggle_notifications")) {
                    l = e43.l(OtherAction.ALLOW_NOTIFICATIONS, OtherAction.DISALLOW_NOTIFICATIONS);
                }
                l = EmptyList.b;
            } else {
                if (str.equals("toggle_eruda")) {
                    l = e43.l(OtherAction.SHOW_DEBUG_MODE, OtherAction.HIDE_DEBUG_MODE);
                }
                l = EmptyList.b;
            }
            list2 = j5g.u0(l, list3);
        }
        List singletonList = Collections.singletonList(new f(list2));
        cVar.n = j5g.u0(list.contains("recommendations") ? Collections.singletonList(new oux0()) : EmptyList.b, j5g.u0(singletonList, Collections.singletonList(new d())));
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.e
    public final boolean d(float f, int i) {
        boolean z = i == 3;
        RecyclerViewState recyclerViewState = this.f;
        if ((recyclerViewState != RecyclerViewState.CAN_SCROLL_TOP || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((recyclerViewState != RecyclerViewState.CAN_SCROLL_BOTTOM || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && recyclerViewState != RecyclerViewState.CAN_SCROLL_BOTH)) {
            RecyclerViewState recyclerViewState2 = RecyclerViewState.CAN_SCROLL_TOP;
        } else if (z) {
            return false;
        }
        return true;
    }

    @Override // xsna.xfu0
    public final void dismiss() {
        dw20 dw20Var = this.d;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.xfu0
    public final void e(boolean z) {
        com.vk.superapp.browser.internal.ui.menu.action.c cVar = this.i;
        cVar.f = z;
        cVar.f();
    }

    @Override // xsna.xfu0
    public final void f(Boolean bool) {
        if (bool != null) {
            com.vk.superapp.browser.internal.ui.menu.action.c cVar = this.i;
            cVar.l = bool;
            cVar.f();
        }
    }

    @Override // xsna.xfu0
    public final void g(boolean z) {
        com.vk.superapp.browser.internal.ui.menu.action.c cVar = this.i;
        cVar.g = z;
        cVar.f();
    }

    @Override // xsna.xfu0
    public final void hide() {
        dw20 dw20Var = this.d;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }
}
