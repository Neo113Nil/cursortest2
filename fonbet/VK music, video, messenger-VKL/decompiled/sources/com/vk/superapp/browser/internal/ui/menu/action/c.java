package com.vk.superapp.browser.internal.ui.menu.action;

import androidx.recyclerview.widget.m;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.bridges.dto.analytics.ActionMenuClick;
import com.vk.superapp.bridges.dto.analytics.ActionMenuCloseCause;
import com.vk.superapp.browser.internal.ui.menu.action.b;
import com.vk.superapp.browser.internal.ui.menu.action.i;
import com.vk.superapp.browser.internal.ui.menu.action.n;
import com.vk.superapp.catalog.impl.v1.SuperappCatalogActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.c5g;
import xsna.dgn0;
import xsna.e370;
import xsna.e43;
import xsna.er;
import xsna.fvv0;
import xsna.gzp0;
import xsna.h9;
import xsna.iah0;
import xsna.j5g;
import xsna.j9x;
import xsna.k9x;
import xsna.l1a0;
import xsna.m520;
import xsna.o2l;
import xsna.ply;
import xsna.swe0;
import xsna.tj8;
import xsna.udx0;
import xsna.vy;
import xsna.wc80;
import xsna.y30;
import xsna.yh;
import xsna.z30;

/* compiled from: ActionMenuPresenter.kt */
/* loaded from: classes6.dex */
public final class c implements m520 {
    public final k A;
    public final fvv0 a;
    public final wc80 b;
    public final boolean c;
    public n.a e;
    public boolean f;
    public boolean g;
    public ActionMenuCloseCause h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Boolean l;
    public Boolean m;
    public String o;
    public List<? extends i> p;
    public l1a0 q;
    public boolean r;
    public boolean s;
    public final tj8 t;
    public final tj8 u;
    public final tj8 v;
    public final tj8 w;
    public final tj8 x;
    public final tj8 y;
    public final tj8 z;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public Object n = EmptyList.b;

    /* compiled from: ActionMenuPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HorizontalAction.values().length];
            try {
                iArr[HorizontalAction.SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAction.ADD_TO_FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAction.REMOVE_FROM_FAVORITES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HorizontalAction.HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HorizontalAction.ALL_SERVICES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HorizontalAction.ALL_GAMES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HorizontalAction.ADD_TO_RECOMMENDATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HorizontalAction.REMOVE_FROM_RECOMMENDATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OtherAction.values().length];
            try {
                iArr2[OtherAction.ALLOW_BADGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OtherAction.DISALLOW_BADGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OtherAction.COPY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OtherAction.HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OtherAction.PIP_MODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OtherAction.REPORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[OtherAction.CLEAR_CACHE.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[OtherAction.DELETE_GAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[OtherAction.DELETE_MINI_APP.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[OtherAction.HELP.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[OtherAction.ADD_TO_RECOMMENDATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[OtherAction.REMOVE_FROM_RECOMMENDATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[OtherAction.ALLOW_NOTIFICATIONS.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[OtherAction.DISALLOW_NOTIFICATIONS.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[OtherAction.SHOW_DEBUG_MODE.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[OtherAction.HIDE_DEBUG_MODE.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ActionMenuPresenter.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((c) this.receiver).i);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((c) this.receiver).i = ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: ActionMenuPresenter.kt */
    /* renamed from: com.vk.superapp.browser.internal.ui.menu.action.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C1872c extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((WebApiApplication) this.receiver).f());
        }
    }

    /* compiled from: ActionMenuPresenter.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((c) this.receiver).f);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((c) this.receiver).f = ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: ActionMenuPresenter.kt */
    public static final /* synthetic */ class e extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((c) this.receiver).g);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((c) this.receiver).g = ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: ActionMenuPresenter.kt */
    public static final /* synthetic */ class f extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((WebApiApplication) this.receiver).f());
        }
    }

    public c(wc80 wc80Var, fvv0 fvv0Var, boolean z, boolean z2) {
        this.a = fvv0Var;
        this.b = wc80Var;
        this.c = z;
        this.f = fvv0Var.t().u;
        this.i = z2;
        this.l = fvv0Var.t().R;
        this.m = fvv0Var.t().S;
        k9x q = swe0.q(0, 10);
        ArrayList arrayList = new ArrayList(c5g.u(q, 10));
        j9x it = q.iterator();
        while (it.d) {
            it.nextInt();
            arrayList.add(i.a.a);
        }
        this.p = arrayList;
        this.t = new tj8(new b(this, c.class, "isDebugModeOn", "isDebugModeOn()Z", 0), OtherAction.HIDE_DEBUG_MODE, OtherAction.SHOW_DEBUG_MODE);
        this.u = new tj8(new d(this, c.class, "isFavorite", "isFavorite()Z", 0), HorizontalAction.REMOVE_FROM_FAVORITES, HorizontalAction.ADD_TO_FAVORITES);
        this.v = new tj8(new f(this.a.t(), WebApiApplication.class, "isHtmlGame", "isHtmlGame()Z", 0), HorizontalAction.ALL_GAMES, HorizontalAction.ALL_SERVICES);
        this.w = new tj8(new e(this, c.class, "isNotificationsAllowed", "isNotificationsAllowed()Z", 0), OtherAction.DISALLOW_NOTIFICATIONS, OtherAction.ALLOW_NOTIFICATIONS);
        this.x = new tj8(new C1872c(this.a.t(), WebApiApplication.class, "isHtmlGame", "isHtmlGame()Z", 0), OtherAction.DELETE_GAME, OtherAction.DELETE_MINI_APP);
        this.y = new tj8(new yh(this, 1), OtherAction.DISALLOW_BADGES, OtherAction.ALLOW_BADGES);
        HorizontalAction horizontalAction = HorizontalAction.SHARE;
        HorizontalAction horizontalAction2 = HorizontalAction.SHARE;
        this.z = new tj8(new h9(this, 2), OtherAction.REMOVE_FROM_RECOMMENDATION, OtherAction.ADD_TO_RECOMMENDATION);
        this.A = new k();
    }

    @Override // xsna.m520
    public final void a(BannerType bannerType) {
        this.b.g(bannerType);
    }

    @Override // xsna.m520
    public final void b(String str) {
        this.b.k(str);
    }

    @Override // xsna.m520
    public final void c(HorizontalAction horizontalAction) {
        ActionMenuClick actionMenuClick;
        switch (vy.$EnumSwitchMapping$1[horizontalAction.ordinal()]) {
            case 1:
                actionMenuClick = ActionMenuClick.SHARE;
                break;
            case 2:
                actionMenuClick = ActionMenuClick.ADD_TO_FAVORITES;
                break;
            case 3:
                actionMenuClick = ActionMenuClick.REMOVE_FROM_FAVORITES;
                break;
            case 4:
                actionMenuClick = ActionMenuClick.ADD_TO_HOME_SCREEN;
                break;
            case 5:
                actionMenuClick = ActionMenuClick.REMOVE_FROM_RECOMMENDATIONS;
                break;
            case 6:
                actionMenuClick = ActionMenuClick.ADD_TO_RECOMMENDATIONS;
                break;
            case 7:
                actionMenuClick = ActionMenuClick.ALL_APPS;
                break;
            case 8:
                actionMenuClick = ActionMenuClick.ALL_GAMES;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        g(actionMenuClick);
        int i = a.$EnumSwitchMapping$0[horizontalAction.ordinal()];
        fvv0 fvv0Var = this.a;
        wc80 wc80Var = this.b;
        switch (i) {
            case 1:
                this.h = ActionMenuCloseCause.SHARE;
                wc80Var.l(fvv0Var.e());
                return;
            case 2:
                wc80Var.t();
                this.f = true;
                f();
                return;
            case 3:
                this.h = ActionMenuCloseCause.REMOVE_FROM_FAVORITES;
                wc80Var.q();
                this.f = false;
                f();
                return;
            case 4:
                this.h = ActionMenuCloseCause.ADD_TO_HOME_SCREEN;
                wc80Var.u();
                return;
            case 5:
                wc80Var.w();
                return;
            case 6:
                wc80Var.c();
                return;
            case 7:
                wc80Var.p();
                return;
            case 8:
                wc80Var.a(fvv0Var.getAppId());
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.m520
    public final void d(OtherAction otherAction) {
        ActionMenuClick actionMenuClick;
        ActionMenuCloseCause actionMenuCloseCause;
        int[] iArr = vy.$EnumSwitchMapping$0;
        switch (iArr[otherAction.ordinal()]) {
            case 1:
                actionMenuClick = ActionMenuClick.COPY;
                break;
            case 2:
                actionMenuClick = ActionMenuClick.ENABLE_NOTIFICATIONS;
                break;
            case 3:
                actionMenuClick = ActionMenuClick.DISABLE_NOTIFICATIONS;
                break;
            case 4:
                actionMenuClick = ActionMenuClick.REPORT;
                break;
            case 5:
                actionMenuClick = ActionMenuClick.CLEAR_CACHE;
                break;
            case 6:
                actionMenuClick = ActionMenuClick.DELETE;
                break;
            case 7:
                actionMenuClick = ActionMenuClick.DELETE;
                break;
            case 8:
                actionMenuClick = ActionMenuClick.SHOW_DEBUG_MENU;
                break;
            case 9:
                actionMenuClick = ActionMenuClick.HIDE_DEBUG_MENU;
                break;
            case 10:
                actionMenuClick = ActionMenuClick.ENABLE_BADGES;
                break;
            case 11:
                actionMenuClick = ActionMenuClick.DISABLE_BADGES;
                break;
            case 12:
                actionMenuClick = ActionMenuClick.ADD_TO_HOME_SCREEN;
                break;
            case 13:
                actionMenuClick = ActionMenuClick.PIP;
                break;
            case 14:
                actionMenuClick = ActionMenuClick.ADD_TO_RECOMMENDATIONS;
                break;
            case 15:
                actionMenuClick = ActionMenuClick.REMOVE_FROM_RECOMMENDATIONS;
                break;
            case 16:
                actionMenuClick = ActionMenuClick.HELP;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        g(actionMenuClick);
        switch (iArr[otherAction.ordinal()]) {
            case 1:
                actionMenuCloseCause = ActionMenuCloseCause.COPY;
                break;
            case 2:
            case 3:
            case 8:
            case 9:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
                actionMenuCloseCause = null;
                break;
            case 4:
                actionMenuCloseCause = ActionMenuCloseCause.REPORT;
                break;
            case 5:
                actionMenuCloseCause = ActionMenuCloseCause.CLEAR_CACHE;
                break;
            case 6:
                actionMenuCloseCause = ActionMenuCloseCause.DELETE;
                break;
            case 7:
                actionMenuCloseCause = ActionMenuCloseCause.DELETE;
                break;
            case 12:
                actionMenuCloseCause = ActionMenuCloseCause.ADD_TO_HOME_SCREEN;
                break;
            case 13:
                actionMenuCloseCause = ActionMenuCloseCause.PIP_MODE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (actionMenuCloseCause == null) {
            actionMenuCloseCause = this.h;
        }
        this.h = actionMenuCloseCause;
        int i = a.$EnumSwitchMapping$1[otherAction.ordinal()];
        fvv0 fvv0Var = this.a;
        wc80 wc80Var = this.b;
        switch (i) {
            case 1:
                wc80Var.d();
                return;
            case 2:
                wc80Var.x();
                return;
            case 3:
                wc80Var.r(fvv0Var.e());
                return;
            case 4:
                wc80Var.u();
                return;
            case 5:
                wc80Var.o();
                return;
            case 6:
                wc80Var.v();
                return;
            case 7:
                wc80Var.s();
                return;
            case 8:
                wc80Var.m();
                return;
            case 9:
                wc80Var.m();
                return;
            case 10:
                wc80Var.e();
                return;
            case 11:
                wc80Var.p();
                return;
            case 12:
                wc80Var.a(fvv0Var.getAppId());
                return;
            case 13:
                wc80Var.j();
                return;
            case 14:
                wc80Var.n();
                this.g = false;
                f();
                return;
            case 15:
                n.a aVar = this.e;
                if (aVar != null) {
                    aVar.a();
                }
                wc80Var.b();
                this.i = true;
                f();
                return;
            case 16:
                n.a aVar2 = this.e;
                if (aVar2 != null) {
                    aVar2.a();
                }
                wc80Var.i();
                this.i = false;
                f();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.m520
    public final void e(i iVar) {
        if (iVar instanceof i.b) {
            this.b.f(((i.b) iVar).a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016f, code lost:
    
        if (xsna.o2l.b("__dbg_log_eruda_mini_app", false) == true) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        tj8 tj8Var;
        Iterable iterable;
        Collection collection;
        Collection singletonList;
        Iterator it;
        Object obj;
        n.a aVar = this.e;
        if (aVar != null) {
            WebApiApplication t = this.a.t();
            boolean z = this.k;
            boolean z2 = this.j;
            List<? extends i> list = this.p;
            try {
                int i = SuperappCatalogActivity.f;
                tj8Var = this.v;
            } catch (ClassNotFoundException unused) {
                tj8Var = null;
            }
            String str = this.o;
            l1a0 l1a0Var = this.q;
            this.A.getClass();
            List singletonList2 = Collections.singletonList(new b.C1871b(t.c, t.d.a(iah0.a(36)).b, t.g()));
            ArrayList o = e43.o(HorizontalAction.SHARE, (t.f() || t.a0) ? (HorizontalAction) this.u.d() : null);
            if (this.c) {
                o.add(HorizontalAction.HOME);
            }
            if (tj8Var != null) {
                o.add(tj8Var.d());
            }
            ArrayList u0 = j5g.u0(Collections.singletonList(new b.c(j5g.V(o))), singletonList2);
            if (list != null) {
                iterable = list.isEmpty() ? EmptyList.b : Collections.singletonList(new b.e(str, list));
            }
            iterable = EmptyList.b;
            ArrayList u02 = j5g.u0(l1a0Var != null ? Collections.singletonList(new b.a(l1a0Var)) : EmptyList.b, j5g.u0(iterable, u0));
            boolean z3 = false;
            if (t.R == null || !t.g() || t.f()) {
                collection = EmptyList.b;
            } else {
                collection = Collections.singletonList(new b.d((OtherAction) this.y.d(), z2 && z));
            }
            Boolean bool = t.S;
            boolean z4 = t.B;
            boolean z5 = (bool == null || t.f()) ? false : true;
            ListBuilder e2 = e43.e();
            if (z5) {
                e2.add(new b.d((OtherAction) this.z.d(), false));
            }
            e2.add(new b.d(OtherAction.PIP_MODE, false));
            e2.add(new b.d(OtherAction.COPY, false));
            e2.add(new b.d((OtherAction) this.w.d(), false));
            e2.addAll(collection);
            String str2 = t.b0;
            if (str2 != null && str2.length() != 0) {
                e2.add(new b.d(OtherAction.HELP, false));
            }
            if (!z4) {
                e2.add(new b.d(OtherAction.REPORT, false));
            }
            e2.add(new b.d(OtherAction.CLEAR_CACHE, false));
            if (!t.Q) {
                if (e370.s != null) {
                    o2l.a.getClass();
                }
                singletonList = EmptyList.b;
                e2.addAll(singletonList);
                if (!z4) {
                    e2.add(new b.d((OtherAction) this.x.d(), false));
                }
                ArrayList u03 = j5g.u0(e2.g(), u02);
                ArrayList arrayList = new ArrayList(c5g.u(u03, 10));
                it = u03.iterator();
                while (it.hasNext()) {
                    com.vk.superapp.browser.internal.ui.menu.action.b bVar = (com.vk.superapp.browser.internal.ui.menu.action.b) it.next();
                    Iterator it2 = ((Iterable) this.n).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (((z30) obj).a(bVar)) {
                                break;
                            }
                        }
                    }
                    z30 z30Var = (z30) obj;
                    if (z30Var != null) {
                        bVar = z30Var.b(bVar);
                    }
                    arrayList.add(bVar);
                }
                List<? extends com.vk.superapp.browser.internal.ui.menu.action.b> V = j5g.V(arrayList);
                if (this.l != null) {
                    if (!this.j && this.k) {
                        z3 = true;
                    }
                    this.j = z3;
                }
                com.vk.superapp.browser.internal.ui.menu.action.a aVar2 = n.this.j;
                m.d a2 = androidx.recyclerview.widget.m.a(new y30(aVar2.e, V), true);
                aVar2.e = V;
                a2.b(aVar2);
            }
            singletonList = Collections.singletonList(new b.d((OtherAction) this.t.d(), false));
            e2.addAll(singletonList);
            if (!z4) {
            }
            ArrayList u032 = j5g.u0(e2.g(), u02);
            ArrayList arrayList2 = new ArrayList(c5g.u(u032, 10));
            it = u032.iterator();
            while (it.hasNext()) {
            }
            List<? extends com.vk.superapp.browser.internal.ui.menu.action.b> V2 = j5g.V(arrayList2);
            if (this.l != null) {
            }
            com.vk.superapp.browser.internal.ui.menu.action.a aVar22 = n.this.j;
            m.d a22 = androidx.recyclerview.widget.m.a(new y30(aVar22.e, V2), true);
            aVar22.e = V2;
            a22.b(aVar22);
        }
    }

    public final void g(ActionMenuClick actionMenuClick) {
        SchemeStat$TypeMiniAppItem.Type type;
        if (actionMenuClick != null) {
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            fvv0 fvv0Var = this.a;
            boolean f2 = fvv0Var.t().f();
            long j = fvv0Var.t().b;
            udx0Var.getClass();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(f2 ? SchemeStat$EventItem.Type.GAME : SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(j), null, null, null, null, 60, null);
            switch (udx0.a.$EnumSwitchMapping$13[actionMenuClick.ordinal()]) {
                case 1:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ADD_TO_FAVOURITES;
                    break;
                case 2:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_REMOVE_FROM_FAVOURITES;
                    break;
                case 3:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ENABLE_NOTIFICATIONS;
                    break;
                case 4:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_DISABLE_NOTIFICATIONS;
                    break;
                case 5:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ENABLE_BADGES;
                    break;
                case 6:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_DISABLE_BADGES;
                    break;
                case 7:
                    type = SchemeStat$TypeMiniAppItem.Type.SHOW_DEBUG_CONSOLE;
                    break;
                case 8:
                    type = SchemeStat$TypeMiniAppItem.Type.HIDE_DEBUG_CONSOLE;
                    break;
                case 9:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_RECOMMEND;
                    break;
                case 10:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_UNRECOMMEND;
                    break;
                case 11:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_SHARE;
                    break;
                case 12:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_COPY;
                    break;
                case 13:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ADD_TO_HOME_SCREEN;
                    break;
                case 14:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_PIP;
                    break;
                case 15:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_REPORT;
                    break;
                case 16:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_CLEAR_CACHE;
                    break;
                case 17:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_DELETE;
                    break;
                case 18:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_FAVE_ADD;
                    break;
                case 19:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_FAVE_REMOVE;
                    break;
                case 20:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ABOUT_SCREEN;
                    break;
                case 21:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_HELP;
                    break;
                case 22:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ALL_APPS;
                    break;
                case 23:
                    type = SchemeStat$TypeMiniAppItem.Type.ACTION_MENU_ALL_APPS;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gzp0.a.a(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2));
        }
    }

    @Override // xsna.m520
    public final void l() {
        g(ActionMenuClick.ABOUT_APP);
        this.h = ActionMenuCloseCause.ABOUT_SCREEN;
        this.b.h(er.a(HttpRequest.DEFAULT_SCHEME).authority(dgn0.h()).appendPath("about_service").appendEncodedPath("").appendQueryParameter("app_id", String.valueOf(this.a.getAppId())).appendQueryParameter("lang", ply.a()).build().toString());
    }
}
