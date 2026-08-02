package com.vk.superapp.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.superApp.dto.SuperAppActiveFeatureDto;
import com.vk.api.generated.superApp.dto.SuperAppEditWidgetSettingsSourceDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.preference.Preference;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.SuperAppFeatures;
import com.vk.superapp.animation.SuperAppAnimation;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.superapp.api.dto.menu.Animation;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionLocalityPicker;
import com.vk.superapp.api.dto.widgets.actions.WebActionOnboardingRedesignV3;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenInternalVkUi;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenNativeApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenWidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebActionRequestPermission;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebActionVkInternal;
import com.vk.superapp.dto.ListData;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vk.superapp.dto.WidgetsLoadingState;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.views.SuperAppRecyclerView;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vk.superapp.ui.widgets.SuperAppShowcasePromoWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionPosterWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseVideoBannerWidget;
import com.vk.superapp.ui.widgets.SuperAppTextWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetOnboardingPanel;
import com.vk.superapp.ui.widgets.api.StubTiles;
import com.vk.superapp.ui.widgets.half_tile.HalfTileContent;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;
import com.vk.superapp.ui.widgets.menu.SuperAppWidgetCustomMenu;
import com.vk.superapp.ui.widgets.miniwidgets.DefaultMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vk.superapp.ui.widgets.tile.SuperAppMoreTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vkontakte.android.R;
import defpackage.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a72;
import xsna.a7n0;
import xsna.ag1;
import xsna.asu0;
import xsna.ayu0;
import xsna.b0y;
import xsna.b3m0;
import xsna.b8j0;
import xsna.b9n0;
import xsna.bjc;
import xsna.brm0;
import xsna.c3v;
import xsna.c5g;
import xsna.c8n0;
import xsna.ca10;
import xsna.can0;
import xsna.cbn0;
import xsna.cdn0;
import xsna.cvk;
import xsna.cx00;
import xsna.d120;
import xsna.d750;
import xsna.dcn0;
import xsna.den0;
import xsna.dhr0;
import xsna.drm0;
import xsna.dw20;
import xsna.dz2;
import xsna.e370;
import xsna.e43;
import xsna.e890;
import xsna.eeh0;
import xsna.eiy;
import xsna.ek;
import xsna.enj;
import xsna.epx;
import xsna.exi0;
import xsna.f2u;
import xsna.f2w0;
import xsna.f870;
import xsna.f8n0;
import xsna.f9n0;
import xsna.fa00;
import xsna.fan0;
import xsna.fbn0;
import xsna.fda0;
import xsna.fdv;
import xsna.fnj;
import xsna.foh;
import xsna.fpx0;
import xsna.fq;
import xsna.g5g;
import xsna.g7n0;
import xsna.gen0;
import xsna.ggb0;
import xsna.hdn0;
import xsna.hen0;
import xsna.hg1;
import xsna.hmv0;
import xsna.hsc0;
import xsna.hx4;
import xsna.hyu;
import xsna.i0q0;
import xsna.iah0;
import xsna.ian0;
import xsna.ie40;
import xsna.it80;
import xsna.itd;
import xsna.itg0;
import xsna.j5g;
import xsna.j5n;
import xsna.j8n0;
import xsna.j8q;
import xsna.jbn0;
import xsna.jen0;
import xsna.joi0;
import xsna.jsb0;
import xsna.jvl0;
import xsna.k5f0;
import xsna.k5j0;
import xsna.k7l0;
import xsna.kdw;
import xsna.ken0;
import xsna.kpr;
import xsna.ksg0;
import xsna.kwg0;
import xsna.kym0;
import xsna.l730;
import xsna.l850;
import xsna.l8q;
import xsna.l9n;
import xsna.lan0;
import xsna.lbn0;
import xsna.ldn0;
import xsna.le80;
import xsna.len0;
import xsna.lh;
import xsna.lr;
import xsna.m0l0;
import xsna.m84;
import xsna.man0;
import xsna.maz;
import xsna.mcj0;
import xsna.mcn0;
import xsna.men0;
import xsna.mga0;
import xsna.mvl0;
import xsna.mzp0;
import xsna.n5j0;
import xsna.n9n0;
import xsna.nan0;
import xsna.ndn0;
import xsna.nen0;
import xsna.nk0;
import xsna.nlf0;
import xsna.nn4;
import xsna.nnk;
import xsna.nr4;
import xsna.nvm0;
import xsna.o19;
import xsna.o25;
import xsna.o7j0;
import xsna.oan0;
import xsna.obn0;
import xsna.onm0;
import xsna.osk0;
import xsna.ox80;
import xsna.pmu;
import xsna.pn;
import xsna.q440;
import xsna.q5j0;
import xsna.q7n0;
import xsna.q9n0;
import xsna.qbn0;
import xsna.qdn0;
import xsna.qex0;
import xsna.r6i0;
import xsna.r8a0;
import xsna.rh4;
import xsna.rsg0;
import xsna.rvq;
import xsna.rwi;
import xsna.s200;
import xsna.s3q0;
import xsna.s440;
import xsna.sni;
import xsna.sni0;
import xsna.sua;
import xsna.t440;
import xsna.tan0;
import xsna.tdn0;
import xsna.tl30;
import xsna.tzp0;
import xsna.u7n0;
import xsna.udk0;
import xsna.ufx;
import xsna.uh3;
import xsna.uk;
import xsna.ux00;
import xsna.uzp0;
import xsna.v7n0;
import xsna.vdn0;
import xsna.vdx0;
import xsna.ver0;
import xsna.vom0;
import xsna.vtt;
import xsna.w0l0;
import xsna.wbn0;
import xsna.wm80;
import xsna.wug0;
import xsna.ww50;
import xsna.xa4;
import xsna.xdn0;
import xsna.xgx0;
import xsna.xqi0;
import xsna.xwk;
import xsna.xx40;
import xsna.y1z;
import xsna.y730;
import xsna.y8n0;
import xsna.yan0;
import xsna.yfb;
import xsna.ygm0;
import xsna.yiz;
import xsna.yk;
import xsna.ynx0;
import xsna.yo80;
import xsna.yvv;
import xsna.z6f0;
import xsna.z8n0;
import xsna.zif0;
import xsna.zlm0;
import xsna.zvv;

/* compiled from: SuperAppPresenter.kt */
/* loaded from: classes6.dex */
public final class a implements v7n0, dhr0.e, w0l0, c.m<it80<n9n0>> {
    public List<? extends z8n0> A;
    public c8n0 B;
    public WidgetObjects C;
    public final yan0 D;
    public man0 E;
    public SuperAppWidgetOnboardingPanel F;
    public final le80 G;
    public final ian0 H;
    public c I;
    public final sua J;
    public final SuperAppFragment b;
    public final mzp0 c;
    public final fbn0 d;
    public final ayu0 e;
    public final f2w0 f;
    public final hmv0 g;
    public final can0 h;
    public boolean i;
    public io.reactivex.rxjava3.disposables.c j;
    public io.reactivex.rxjava3.disposables.c k;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public io.reactivex.rxjava3.disposables.c n;
    public io.reactivex.rxjava3.disposables.c o;
    public final io.reactivex.rxjava3.disposables.c p;
    public io.reactivex.rxjava3.disposables.c q;
    public final io.reactivex.rxjava3.disposables.b r;
    public final io.reactivex.rxjava3.disposables.b s;
    public final d<s3q0> t;
    public io.reactivex.rxjava3.disposables.c u;
    public final q<kym0> v;
    public io.reactivex.rxjava3.disposables.c w;
    public io.reactivex.rxjava3.disposables.c x;
    public io.reactivex.rxjava3.disposables.c y;
    public n9n0 z;

    /* compiled from: SuperAppPresenter.kt */
    /* renamed from: com.vk.superapp.ui.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1906a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebActionRequestPermission.Permission.values().length];
            try {
                iArr[WebActionRequestPermission.Permission.GEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebActionRequestPermission.Permission.CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(SuperAppFragment superAppFragment, ynx0 ynx0Var, mzp0 mzp0Var, fbn0 fbn0Var, tan0 tan0Var, ayu0 ayu0Var, f2w0 f2w0Var, hmv0 hmv0Var, can0 can0Var) {
        this.b = superAppFragment;
        this.c = mzp0Var;
        this.d = fbn0Var;
        this.e = ayu0Var;
        this.f = f2w0Var;
        this.g = hmv0Var;
        this.h = can0Var;
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.r = new io.reactivex.rxjava3.disposables.b();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.s = bVar;
        this.t = d.O0(s3q0.a);
        this.v = xwk.e().T().m().d;
        this.A = Collections.EMPTY_LIST;
        this.D = new yan0(tan0Var);
        this.G = new le80();
        this.H = new ian0(new j8n0(this, 1));
        this.J = new sua();
        dhr0.f(this);
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        this.p = S1().v().a0(asu0.a.d()).subscribe(new nan0(new fda0(this, 14), 0));
        bVar.e();
        bVar.b(hg1.h(ynx0Var.h(), new c3v(this, 28)));
        int i2 = 3;
        bVar.b(hg1.h(new i0(ynx0Var.f(), new osk0(new zlm0(i2), i2)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new k7l0(this, 5)));
        bVar.b(hg1.h(ynx0Var.d(), new rvq(this, 29)));
    }

    public static com.vk.superapp.b S1() {
        return q7n0.a().getCache();
    }

    public static void X3(boolean z) {
        yvv yvvVar;
        if (!BuildInfo.h() || BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
            return;
        }
        if (z) {
            yvvVar.c();
            throw null;
        }
        yvvVar.c();
        throw null;
    }

    public static CustomMenuInfo p3(String str, CustomMenuInfo customMenuInfo, BadgeInfo badgeInfo) {
        BadgeInfo badgeInfo2;
        if (!epx.f(customMenuInfo.d, str)) {
            return customMenuInfo;
        }
        BadgeInfo badgeInfo3 = customMenuInfo.g;
        if (badgeInfo3 != null) {
            badgeInfo2 = BadgeInfo.a(badgeInfo3, badgeInfo.b, badgeInfo.c, badgeInfo.d, badgeInfo.e, badgeInfo.g, 16);
        } else {
            badgeInfo2 = null;
        }
        return CustomMenuInfo.a(customMenuInfo, null, null, badgeInfo2, 2015);
    }

    public static void s2(a aVar, WebAction webAction, Context context, SuperAppWidget superAppWidget, int i) {
        q F;
        Integer num = null;
        SuperAppWidget superAppWidget2 = (i & 4) != 0 ? null : superAppWidget;
        SuperAppFragment superAppFragment = aVar.b;
        if (webAction instanceof WebActionOpenUrl) {
            maz.c(xwk.d().e(), context, ((WebActionOpenUrl) webAction).c, LaunchContext.A, null, null, 24);
            return;
        }
        if (webAction instanceof WebActionOpenVkApp) {
            S1().k();
            WidgetObjects widgetObjects = aVar.C;
            WebApiApplication webApiApplication = widgetObjects != null ? widgetObjects.b.get(Long.valueOf(((WebActionOpenVkApp) webAction).d)) : null;
            if (webApiApplication != null) {
                WebActionOpenVkApp webActionOpenVkApp = (WebActionOpenVkApp) webAction;
                cbn0.c(q7n0.a().a(), context, webApiApplication, webActionOpenVkApp.e, null, webActionOpenVkApp.g, 24);
                return;
            } else {
                WebActionOpenVkApp webActionOpenVkApp2 = (WebActionOpenVkApp) webAction;
                cbn0.i(q7n0.a().a(), context, webActionOpenVkApp2.d, webActionOpenVkApp2.g, 4);
                return;
            }
        }
        if (webAction instanceof WebActionOpenInternalVkUi) {
            S1().k();
            qex0 qex0Var = e370.y;
            WebActionOpenInternalVkUi webActionOpenInternalVkUi = (WebActionOpenInternalVkUi) webAction;
            q7n0.a().a().b(context, f870.r(webActionOpenInternalVkUi.c, (qex0Var != null ? qex0Var : null).b()), webActionOpenInternalVkUi.c);
            return;
        }
        if (webAction instanceof WebActionRequestPermission) {
            List<WebActionRequestPermission.Permission> list = ((WebActionRequestPermission) webAction).c;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i2 = C1906a.$EnumSwitchMapping$0[((WebActionRequestPermission.Permission) it.next()).ordinal()];
                if (i2 == 1) {
                    PermissionHelper.a.getClass();
                    g5g.A(arrayList, PermissionHelper.h);
                    g5g.A(arrayList2, PermissionHelper.i);
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            FragmentActivity activity = superAppFragment.getActivity();
            if (activity == null) {
                return;
            }
            PermissionHelper.g(PermissionHelper.a, superAppFragment.getActivity(), (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), 0, R.string.vk_widgets_permissions_settings, new uh3(arrayList, aVar, activity), null, null, 200);
            return;
        }
        if (webAction instanceof WebActionOpenNativeApp) {
            o19.s(((WebActionOpenNativeApp) webAction).d, new ag1(17, webAction, aVar));
            return;
        }
        if (webAction instanceof WebActionLocalityPicker) {
            m1 a0 = rwi.d().f().a(context, tzp0.a(null, 3)).a0(asu0.a.d());
            k5j0 k5j0Var = new k5j0(new mcj0(aVar, 10), 6);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            new c0(a0.E(k5j0Var, lVar, kVar, kVar), new onm0(new ksg0(aVar, 10), 1), kVar).subscribe();
            return;
        }
        if (!(webAction instanceof WebActionVkInternal)) {
            if (webAction instanceof WebActionOpenWidgetSettings) {
                superAppFragment.uo(WidgetSettingsModalOpenSource.MINI_WIDGET_SETTINGS);
                return;
            } else {
                cvk.u(R.string.vk_unsupported_action, true);
                return;
            }
        }
        WebActionVkInternal.Payload payload = ((WebActionVkInternal) webAction).c;
        if (payload instanceof WebActionVkInternal.Payload.ShareMe) {
            if (superAppWidget2 == null || superAppWidget2.getType().length() <= 0) {
                return;
            }
            nr4.b().x(xa4.L(context), superAppWidget2.getType(), ((WebActionVkInternal.Payload.ShareMe) payload).b);
            return;
        }
        if (!(payload instanceof WebActionVkInternal.Payload.Music)) {
            cvk.u(R.string.vk_unsupported_action, true);
            return;
        }
        WebActionVkInternal.Payload.Music music = (WebActionVkInternal.Payload.Music) payload;
        boolean z = music.b == WebActionVkInternal.Payload.Music.Extra.SHUFFLE;
        ian0 ian0Var = aVar.H;
        String str = music.c;
        ian0Var.getClass();
        int i3 = z ? 200 : 100;
        if (str != null) {
            F = rsg0.y0(new l730(i3, str, MusicPlaybackLaunchContext.E.t(), z), null, null, 3).F(new eiy(new hsc0(ian0Var, 18), 22)).U(new sni0(new o7j0(5), 5));
        } else {
            if (!z) {
                int nextInt = new Random().nextInt();
                num = Integer.valueOf(nextInt != 0 ? nextInt : 1);
            }
            F = rsg0.T(yfb.x(hx4.C((hx4) ian0Var.c.getValue(), o25.a().c(), null, num, null, Integer.valueOf(i3), null, MusicPlaybackLaunchContext.E.t(), 13918))).U(new ie40(new hyu(24), 16)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new nvm0(new r8a0(ian0Var, 28), 2));
        }
        ian0Var.d.b(F.subscribe(new vom0(new rh4(29, ian0Var, z ? MusicPlaybackLaunchContext.E.Ab() : MusicPlaybackLaunchContext.E), 1), new b0y(new udk0(3), 28)));
    }

    public static ArrayList t3(SuperAppAnimationConfig superAppAnimationConfig) {
        SuperAppAnimation.Type type;
        ArrayList arrayList = new ArrayList();
        for (Animation animation : superAppAnimationConfig.a()) {
            String f = animation.f();
            String g = animation.g();
            int e = animation.e();
            SuperAppAnimation.Type.a aVar = SuperAppAnimation.Type.Companion;
            String h = animation.b().h();
            aVar.getClass();
            SuperAppAnimation.Type[] values = SuperAppAnimation.Type.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    type = null;
                    break;
                }
                type = values[i];
                if (brm0.w(type.name(), h, true)) {
                    break;
                }
                i++;
            }
            if (type == null) {
                type = SuperAppAnimation.Type.OPEN;
            }
            arrayList.add(new SuperAppAnimation.a(f, g, e, type, animation.c(), animation.d()));
        }
        return arrayList;
    }

    @Override // xsna.v7n0
    public final void A() {
        S1().n();
    }

    @Override // xsna.u7n0
    public final void D0(yk ykVar, m84 m84Var) {
        FragmentActivity activity = this.b.getActivity();
        if (activity == null) {
            activity = null;
        }
        if (activity == null) {
            return;
        }
        com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(activity);
        cVar.setCancelable(false);
        cVar.show();
        ver0.c(activity, rsg0.D0(yfb.x(new ufx("account.markActualizePhone", new lr(0), new pn(1)))).l(new n5j0(new jvl0(3), 2)).subscribe(new d750(new nn4(cVar, ykVar, m84Var, 8), 21), new ox80(new v(25, cVar, m84Var), 14)));
    }

    @Override // xsna.v7n0
    public final void E3() {
        SuperAppAnimationConfig m;
        Object obj;
        Object obj2;
        if (S1().z() == null || (m = S1().m()) == null) {
            return;
        }
        ArrayList t3 = t3(m);
        if (t3.isEmpty()) {
            return;
        }
        Iterator it = t3.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SuperAppAnimation.a) obj).d == SuperAppAnimation.Type.SHAKE) {
                    break;
                }
            }
        }
        SuperAppAnimation.a aVar = (SuperAppAnimation.a) obj;
        Iterator it2 = t3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((SuperAppAnimation.a) obj2).d == SuperAppAnimation.Type.OPEN) {
                    break;
                }
            }
        }
        SuperAppAnimation.a aVar2 = (SuperAppAnimation.a) obj2;
        SuperAppFragment superAppFragment = this.b;
        FragmentActivity activity = superAppFragment.getActivity();
        if (activity == null) {
            return;
        }
        SuperAppAnimation.b bVar = superAppFragment.i0;
        superAppFragment.i0 = bVar != null ? bVar.a(aVar, aVar2) : new SuperAppAnimation.b(aVar, aVar2);
        SuperAppAnimation superAppAnimation = superAppFragment.f0;
        if (superAppAnimation == null || !superAppAnimation.a()) {
            SuperAppAnimation superAppAnimation2 = superAppFragment.f0;
            if (superAppAnimation2 != null) {
                superAppAnimation2.b();
            }
            superAppFragment.f0 = null;
            if (aVar2 != null && aVar2.a() != 0) {
                SuperAppAnimation superAppAnimation3 = new SuperAppAnimation(activity, superAppFragment.D, aVar2, new uk(21, superAppFragment, aVar));
                superAppFragment.f0 = superAppAnimation3;
                superAppAnimation3.c();
            } else {
                if (aVar == null || aVar.a() == 0) {
                    return;
                }
                superAppFragment.qo(aVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.ArrayList] */
    public final ArrayList I1(n9n0 n9n0Var) {
        int i;
        Object obj;
        Object obj2;
        SuperAppWidgetHalfTile superAppWidgetHalfTile;
        SuperAppWidgetTile superAppWidgetTile;
        men0 nen0Var;
        Object obj3;
        Object obj4;
        Object obj5;
        SuperAppWidgetHalfTile superAppWidgetHalfTile2;
        zif0 ldn0Var;
        Collection collection;
        ?? r8;
        List O0;
        ArrayList arrayList = new ArrayList();
        ListBuilder e = e43.e();
        q9n0 q9n0Var = n9n0Var.a;
        n9n0.a aVar = n9n0Var.b;
        e.addAll(q9n0Var.a);
        q9n0 q9n0Var2 = n9n0Var.a;
        Iterator it = q9n0Var2.a.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            SuperAppWidget superAppWidget = (SuperAppWidget) it.next();
            if (superAppWidget instanceof SuperAppShowcaseSectionScrollWidget) {
                List<SuperAppWidget> list = ((SuperAppShowcaseSectionScrollWidget) superAppWidget).o.f;
                if (list == null || (O0 = j5g.O0(list)) == null) {
                    r8 = 0;
                } else {
                    r8 = new ArrayList(O0.size());
                    int size = O0.size();
                    while (i < size) {
                        Object obj6 = O0.get(i);
                        SuperAppWidget superAppWidget2 = (SuperAppWidget) obj6;
                        if ((superAppWidget2 instanceof SuperAppWidgetMarketProductTile) || (superAppWidget2 instanceof SuperAppMoreTile)) {
                            r8.add(obj6);
                        }
                        i++;
                    }
                }
                if (r8 == 0) {
                    r8 = EmptyList.b;
                }
                e.addAll((Collection) r8);
            }
        }
        ListBuilder g = e.g();
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
            if (!aVar2.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar2.next();
            if (obj instanceof SuperAppMiniWidget) {
                break;
            }
        }
        if (!(obj instanceof SuperAppMiniWidget)) {
            obj = null;
        }
        SuperAppMiniWidget superAppMiniWidget = (SuperAppMiniWidget) obj;
        if (superAppMiniWidget != null) {
            arrayList.add(new fan0(superAppMiniWidget));
        }
        SuperAppWidgetCustomMenu.CREATOR.getClass();
        ListIterator listIterator2 = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar3 = (ListBuilder.a) listIterator2;
            if (!aVar3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = aVar3.next();
            SuperAppWidget superAppWidget3 = (SuperAppWidget) obj2;
            if ((superAppWidget3 instanceof SuperAppWidgetCustomMenu) && epx.f(((SuperAppWidgetCustomMenu) superAppWidget3).k, "showcase_menu")) {
                break;
            }
        }
        SuperAppWidgetCustomMenu superAppWidgetCustomMenu = obj2 instanceof SuperAppWidgetCustomMenu ? (SuperAppWidgetCustomMenu) obj2 : null;
        if (superAppWidgetCustomMenu != null) {
            this.J.getClass();
            CustomMenuInfo customMenuInfo = superAppWidgetCustomMenu.q;
            if (epx.f(superAppWidgetCustomMenu.k, "showcase_menu")) {
                int i2 = customMenuInfo != null ? 1 : 0;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = superAppWidgetCustomMenu.p.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new jbn0((CustomMenuInfo) it2.next()));
                }
                if (customMenuInfo != null) {
                    arrayList2.add(new lbn0(customMenuInfo));
                }
                int i3 = i2 + 8;
                if (arrayList2.isEmpty()) {
                    collection = EmptyList.b;
                } else {
                    if (arrayList2.size() != i3) {
                        if (arrayList2.size() > i3) {
                            collection = j5g.H0(arrayList2, i3);
                        } else {
                            int size2 = i3 - arrayList2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                arrayList2.add(new qbn0());
                            }
                        }
                    }
                    collection = arrayList2;
                }
            } else {
                collection = EmptyList.b;
            }
            arrayList.addAll(collection);
        }
        ListIterator listIterator3 = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar4 = (ListBuilder.a) listIterator3;
            if (!aVar4.hasNext()) {
                break;
            }
            SuperAppWidget superAppWidget4 = (SuperAppWidget) aVar4.next();
            if (superAppWidget4 instanceof SuperAppShowcaseExpandableServiceMenu) {
                SuperAppShowcaseExpandableServiceMenu superAppShowcaseExpandableServiceMenu = (SuperAppShowcaseExpandableServiceMenu) superAppWidget4;
                ldn0Var = new c8n0(superAppShowcaseExpandableServiceMenu.j.b, superAppShowcaseExpandableServiceMenu.o.b);
            } else if (superAppWidget4 instanceof SuperAppTextWidget) {
                ldn0Var = new dcn0((SuperAppTextWidget) superAppWidget4);
            } else if (superAppWidget4 instanceof SuperAppWidgetTile) {
                SuperAppWidgetTile superAppWidgetTile2 = (SuperAppWidgetTile) superAppWidget4;
                SuperAppWidgetTile.Payload payload = superAppWidgetTile2.o;
                TileBackground tileBackground = payload.b;
                if ((tileBackground != null ? tileBackground.d : null) != null) {
                    ldn0Var = new jen0(superAppWidgetTile2);
                } else if ((tileBackground != null ? tileBackground.c : null) != null) {
                    ldn0Var = new ken0(superAppWidgetTile2);
                } else {
                    List<TileBackgroundImage> list2 = tileBackground != null ? tileBackground.b : null;
                    if (list2 == null || list2.isEmpty()) {
                        TileBackground tileBackground2 = payload.b;
                        if ((tileBackground2 != null ? tileBackground2.e : null) != null) {
                            ldn0Var = new nen0(superAppWidgetTile2);
                        }
                        ldn0Var = null;
                    } else {
                        ldn0Var = new len0(superAppWidgetTile2);
                    }
                }
            } else if (superAppWidget4 instanceof SuperAppWidgetHalfTile) {
                SuperAppWidgetHalfTile superAppWidgetHalfTile3 = (SuperAppWidgetHalfTile) superAppWidget4;
                HalfTileContent halfTileContent = superAppWidgetHalfTile3.o.c;
                if (halfTileContent instanceof HalfTileContent.Regular) {
                    ldn0Var = new tdn0(superAppWidgetHalfTile3);
                } else if (halfTileContent instanceof HalfTileContent.UserStack) {
                    ldn0Var = new gen0(superAppWidgetHalfTile3);
                } else {
                    if (halfTileContent instanceof HalfTileContent.Progress) {
                        ldn0Var = new ndn0(superAppWidgetHalfTile3);
                    }
                    ldn0Var = null;
                }
            } else if (superAppWidget4 instanceof SuperAppShowcasePromoWidget) {
                ldn0Var = new qdn0((SuperAppShowcasePromoWidget) superAppWidget4);
            } else if (superAppWidget4 instanceof SuperAppShowcaseScrollWidget) {
                ldn0Var = new vdn0((SuperAppShowcaseScrollWidget) superAppWidget4);
            } else if (superAppWidget4 instanceof SuperAppShowcaseSectionPosterWidget) {
                ldn0Var = new xdn0((SuperAppShowcaseSectionPosterWidget) superAppWidget4);
            } else if (superAppWidget4 instanceof SuperAppShowcaseSectionScrollWidget) {
                ldn0Var = new den0((SuperAppShowcaseSectionScrollWidget) superAppWidget4);
            } else if (superAppWidget4 instanceof SuperAppShowcaseVideoBannerWidget) {
                ldn0Var = new hen0((SuperAppShowcaseVideoBannerWidget) superAppWidget4);
            } else {
                if (superAppWidget4 instanceof SuperAppShowcaseConfirmNumberWidget) {
                    ldn0Var = new ldn0((SuperAppShowcaseConfirmNumberWidget) superAppWidget4);
                }
                ldn0Var = null;
            }
            if (superAppWidget4 instanceof SuperAppWidgetOnboardingPanel) {
                SuperAppWidgetOnboardingPanel superAppWidgetOnboardingPanel = (SuperAppWidgetOnboardingPanel) superAppWidget4;
                this.G.getClass();
                if (le80.a(superAppWidgetOnboardingPanel.j.b) <= 3 || this.F != null) {
                    lan0 lan0Var = new lan0(superAppWidgetOnboardingPanel);
                    this.F = (SuperAppWidgetOnboardingPanel) superAppWidget4;
                    arrayList.add(lan0Var);
                }
                if (superAppWidget4 != null && epx.f(aVar, n9n0.a.b.a)) {
                    WidgetIds widgetIds = superAppWidgetOnboardingPanel.j;
                    String str = superAppWidgetOnboardingPanel.n;
                    if ((superAppWidgetOnboardingPanel.u instanceof WebActionOnboardingRedesignV3) && le80.a(str) == 0) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        le80.b(Preference.h(context, 0, "v3_redesign_onboarding_show_count_pref_name").getInt("v3_redesign_onboarding_show_count_field_name", 0), str);
                    }
                    if (!sni.j) {
                        sni.j = true;
                        int a = le80.a(widgetIds.b);
                        if (a > 3) {
                            N3(superAppWidget4, false);
                        } else {
                            le80.b(a + 1, widgetIds.b);
                        }
                    }
                }
            }
            if (ldn0Var != null) {
                arrayList.add(ldn0Var);
            }
        }
        SuperAppFragment superAppFragment = this.b;
        Context activity = superAppFragment.getActivity();
        if (activity == null && (activity = e43.a) == null) {
            activity = null;
        }
        int i5 = 2;
        int i6 = (!(!iah0.s(activity) || fnj.b(activity)) || activity.getResources().getConfiguration().screenWidthDp <= 740) ? 2 : 3;
        n9n0 n9n0Var2 = this.z;
        StubTiles stubTiles = n9n0Var2 != null ? n9n0Var2.a.g : null;
        ArrayList arrayList3 = new ArrayList();
        g5g.D(arrayList, true, new kpr(23));
        int i7 = 0;
        while (!arrayList.isEmpty()) {
            z8n0 z8n0Var = (z8n0) j5g.Y(arrayList);
            if ((z8n0Var instanceof men0 ? 12 / i6 : z8n0Var instanceof y8n0 ? (12 / i6) / i5 : 12) < 12) {
                ArrayList arrayList4 = new ArrayList();
                int i8 = i;
                while (i8 < 12) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        z8n0 z8n0Var2 = (z8n0) obj3;
                        if ((z8n0Var2 instanceof men0) || (z8n0Var2 instanceof y8n0)) {
                            break;
                        }
                    }
                    z8n0 z8n0Var3 = (z8n0) obj3;
                    if (z8n0Var3 == null) {
                        break;
                    }
                    boolean z = z8n0Var3 instanceof men0;
                    int i9 = z ? 12 / i6 : z8n0Var3 instanceof y8n0 ? (12 / i6) / i5 : 12;
                    if (z8n0Var3 instanceof y8n0) {
                        arrayList.remove(z8n0Var3);
                        arrayList4.add(z8n0Var3);
                        i8 += i9;
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it4.next();
                            if (obj4 instanceof y8n0) {
                                break;
                            }
                        }
                        if (!(obj4 instanceof y8n0)) {
                            obj4 = null;
                        }
                        Object obj7 = (y8n0) obj4;
                        if (obj7 != null) {
                            arrayList.remove(obj7);
                        } else {
                            Iterator it5 = arrayList.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = it5.next();
                                if (obj5 instanceof men0) {
                                    break;
                                }
                            }
                            if (!(obj5 instanceof men0)) {
                                obj5 = null;
                            }
                            if (((men0) obj5) != null && stubTiles != null && (superAppWidgetHalfTile2 = stubTiles.c) != null) {
                                HalfTileContent halfTileContent2 = superAppWidgetHalfTile2.o.c;
                                if (halfTileContent2 instanceof HalfTileContent.Regular) {
                                    obj7 = new tdn0(superAppWidgetHalfTile2);
                                } else if (halfTileContent2 instanceof HalfTileContent.UserStack) {
                                    obj7 = new gen0(superAppWidgetHalfTile2);
                                } else if (halfTileContent2 instanceof HalfTileContent.Progress) {
                                    obj7 = new ndn0(superAppWidgetHalfTile2);
                                }
                            }
                            obj7 = null;
                        }
                        if (obj7 != null) {
                            arrayList4.add(obj7);
                            i8 += i9;
                        }
                    } else if (z) {
                        int i10 = i8 + i9;
                        if (i10 > 12) {
                            break;
                        }
                        arrayList4.add(z8n0Var3);
                        arrayList.remove(z8n0Var3);
                        i8 = i10;
                    } else {
                        continue;
                    }
                    i5 = 2;
                }
                if (i8 < 12) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        if (next instanceof y8n0) {
                            arrayList5.add(next);
                        }
                    }
                    int size3 = arrayList5.size();
                    boolean z2 = size3 == arrayList4.size() && size3 <= i6;
                    if (!z2 || size3 != i6) {
                        int i11 = 12 - i8;
                        int i12 = 12 / i6;
                        if ((size3 % 2 != 0 || z2) && stubTiles != null && (superAppWidgetHalfTile = stubTiles.c) != null) {
                            HalfTileContent halfTileContent3 = superAppWidgetHalfTile.o.c;
                            f9n0 tdn0Var = halfTileContent3 instanceof HalfTileContent.Regular ? new tdn0(superAppWidgetHalfTile) : halfTileContent3 instanceof HalfTileContent.UserStack ? new gen0(superAppWidgetHalfTile) : halfTileContent3 instanceof HalfTileContent.Progress ? new ndn0(superAppWidgetHalfTile) : null;
                            if (tdn0Var != null) {
                                arrayList4.add(tdn0Var);
                                i11 -= i12 / 2;
                            }
                        }
                        if (i11 >= i12 && !z2 && stubTiles != null && (superAppWidgetTile = stubTiles.b) != null) {
                            SuperAppWidgetTile.Payload payload2 = superAppWidgetTile.o;
                            TileBackground tileBackground3 = payload2.b;
                            if ((tileBackground3 != null ? tileBackground3.d : null) != null) {
                                nen0Var = new jen0(superAppWidgetTile);
                            } else if ((tileBackground3 != null ? tileBackground3.c : null) != null) {
                                nen0Var = new ken0(superAppWidgetTile);
                            } else {
                                List<TileBackgroundImage> list3 = tileBackground3 != null ? tileBackground3.b : null;
                                if (list3 == null || list3.isEmpty()) {
                                    TileBackground tileBackground4 = payload2.b;
                                    nen0Var = (tileBackground4 != null ? tileBackground4.e : null) != null ? new nen0(superAppWidgetTile) : null;
                                } else {
                                    nen0Var = new len0(superAppWidgetTile);
                                }
                            }
                            if (nen0Var != null) {
                                arrayList4.add(nen0Var);
                            }
                        }
                    }
                }
                arrayList3.add(new mcn0(arrayList4, i7, i6));
                i7++;
            } else {
                arrayList3.add(z8n0Var);
                arrayList.remove(z8n0Var);
            }
            i = 0;
            i5 = 2;
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        n9n0.a.b bVar = n9n0.a.b.a;
        if (epx.f(aVar, bVar)) {
            a4(q9n0Var2);
        }
        WidgetsLoadingState widgetsLoadingState = epx.f(aVar, bVar) ? WidgetsLoadingState.NETWORK : aVar instanceof n9n0.a.C3389a ? WidgetsLoadingState.CACHE : null;
        g7n0.b bVar2 = superAppFragment.d0.b;
        if (bVar2 != null) {
            bVar2.h(arrayList, widgetsLoadingState);
        }
        return arrayList;
    }

    @Override // xsna.v7n0
    public final void I4() {
        io.reactivex.rxjava3.disposables.c g;
        fbn0 fbn0Var = this.d;
        ProfileNavigationInfo.SecurityRecommendationIndicator a = fbn0Var.a();
        if (a == null) {
            return;
        }
        if (a != ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING) {
            io.reactivex.rxjava3.disposables.c cVar = this.y;
            if (cVar != null) {
                cVar.dispose();
            }
            g = hg1.g(fbn0Var.b().o(asu0.a.d()), new ek(29));
            this.y = g;
        }
        fbn0Var.d();
    }

    @Override // xsna.v7n0
    public final void J1() {
        n9n0 z = S1().z();
        if (!this.i || z == null) {
            return;
        }
        I1(z);
    }

    public final void N3(SuperAppWidget superAppWidget, boolean z) {
        if (z) {
            S1().r(superAppWidget.d().b);
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.disposables.c n = itg0.n(vdx0Var.u().c(superAppWidget.d().b, superAppWidget.r()));
        FragmentActivity activity = this.b.getActivity();
        if (activity != null) {
            ver0.b(activity, n);
        }
    }

    @Override // xsna.v7n0
    public final void O1() {
        c cVar = this.I;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // com.vk.lists.c.m
    public final q<it80<n9n0>> O9(String str, c cVar) {
        return S1().f(str);
    }

    public final void V2(String str, BadgeInfo badgeInfo, String str2) {
        if (badgeInfo != null) {
            if ((badgeInfo.c || badgeInfo.d || badgeInfo.e != 0) && !drm0.N(str)) {
                l9n l9nVar = new l9n(this, str, 5);
                FragmentActivity activity = this.b.getActivity();
                if (activity == null || drm0.N(str)) {
                    return;
                }
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                ver0.b(activity, vdx0Var.u().b(str, str2).subscribe(new cx00(new mvl0(l9nVar, 3), 28), new q440(new kdw(22), 22)));
            }
        }
    }

    @Override // xsna.u7n0
    public final void Y0(String str) {
        this.b.to(str, true);
    }

    @Override // xsna.u7n0
    public final void Z(Context context, WebAction webAction, SuperAppWidget superAppWidget) {
        s2(this, webAction, context, superAppWidget, 24);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, superAppWidget.r(), null, 46, null), new MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem(MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem.Type.ONBOARDING_PANEL_CLICK), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void a4(q9n0 q9n0Var) {
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        ArrayList arrayList = q9n0Var.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UpdateOptions updateOptions = ((SuperAppWidget) it.next()).h;
            Integer valueOf = updateOptions != null ? Integer.valueOf(updateOptions.c) : null;
            if (valueOf != null) {
                arrayList2.add(valueOf);
            }
        }
        Long valueOf2 = ((Integer) j5g.o0(arrayList2)) != null ? Long.valueOf(r6.intValue()) : null;
        if (valueOf2 == null || valueOf2.longValue() == 0) {
            return;
        }
        this.l = q.R(valueOf2.longValue(), TimeUnit.SECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tl30(new l850(this, 19), 28), new s440(new ygm0(2), 18));
    }

    @Override // xsna.u7n0
    public final void b(Context context, WebAction webAction, f9n0 f9n0Var, Integer num) {
        g7n0 g7n0Var = this.b.d0;
        if (webAction instanceof WebActionVkInternal) {
            WebActionVkInternal.Payload payload = ((WebActionVkInternal) webAction).c;
            if (payload instanceof WebActionVkInternal.Payload.Music) {
                g7n0.b bVar = g7n0Var.b;
                if (bVar != null) {
                    wbn0.b(bVar, f9n0Var, Integer.valueOf(((WebActionVkInternal.Payload.Music) payload).d), null, 12);
                }
                s2(this, webAction, context, f9n0Var.c(), 24);
                return;
            }
        }
        if (webAction instanceof WebActionSubscribe) {
            g7n0.b bVar2 = g7n0Var.b;
            if (bVar2 != null) {
                wbn0.b(bVar2, f9n0Var, (Integer) webAction.b.getValue(), num, 8);
                return;
            }
            return;
        }
        g7n0.b bVar3 = g7n0Var.b;
        if (bVar3 != null) {
            bVar3.f(f9n0Var, (Integer) webAction.b.getValue(), num, null);
        }
        s2(this, webAction, context, f9n0Var.c(), 24);
    }

    @Override // xsna.gm6
    public final void d() {
        this.i = true;
        c.h hVar = new c.h(this);
        hVar.v = true;
        SuperAppFragment superAppFragment = this.b;
        SuperAppRecyclerView superAppRecyclerView = superAppFragment.Y;
        if (superAppRecyclerView == null) {
            superAppRecyclerView = null;
        }
        this.I = f.a(hVar, superAppRecyclerView);
        t2(S1().z(), S1().e(), false);
        this.E = new man0(superAppFragment, new a72(this, 20));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        asu0.q().submit(new itd(this));
        hmv0 hmv0Var = this.g;
        if (!hmv0Var.f(this)) {
            hmv0Var.d(this);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        this.u = hg1.h(this.t.v0(3L, TimeUnit.SECONDS), new r6i0(this, 7));
        io.reactivex.rxjava3.disposables.c cVar2 = this.w;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.w = hg1.h(this.v, new b3m0(this, 4));
        io.reactivex.rxjava3.disposables.c cVar3 = this.x;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.x = hg1.h(this.d.c().a0(asu0Var.d()), new fa00(this, 28));
    }

    @Override // xsna.u7n0
    public final void d0(SuperAppWidget superAppWidget) {
        ArrayList arrayList;
        SuperAppActiveFeatureDto superAppActiveFeatureDto;
        int i = 0;
        boolean z = epx.f(superAppWidget.getType(), NotificationCompat.CATEGORY_PROMO) || epx.f(superAppWidget.getType(), "section_video_banner");
        FragmentActivity activity = this.b.getActivity();
        if (activity == null) {
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            enj.q(R.string.default_network_error, 0, activity);
            return;
        }
        if (z || S1().b(superAppWidget)) {
            S1().r(superAppWidget.d().b);
            int i2 = superAppWidget.d().c;
            String str = superAppWidget.i;
            if (str == null) {
                str = "";
            }
            String str2 = superAppWidget.d().b;
            String r = superAppWidget.r();
            int i3 = 29;
            ufx ufxVar = new ufx("superApp.hideWidgetState", new fq(i3), new joi0(6));
            ufx.k(ufxVar, "widget_id", i2, 0, 12);
            if (str2 != null) {
                ufx.n(ufxVar, "widget_uid", str2, 0, 12);
            }
            ufx.n(ufxVar, "state", str, 0, 12);
            if (r != null) {
                ufx.n(ufxVar, "track_code", r, 0, 12);
            }
            ver0.b(activity, rsg0.y0(yfb.x(ufxVar), null, null, 3).subscribe(new f2u(new lh(i3, this, activity), 22), new eeh0(new foh(xgx0.a, 9), 8)));
            return;
        }
        SuperAppWidget b = superAppWidget.b(false);
        S1().g(b);
        yiz yizVar = new yiz();
        String valueOf = String.valueOf(b.d().c);
        SuperAppEditWidgetSettingsSourceDto superAppEditWidgetSettingsSourceDto = SuperAppEditWidgetSettingsSourceDto.OTHER;
        String a = S1().a(SuperAppFeatures.RequestName.EDIT_WIDGET_SETTINGS);
        if (a != null) {
            List<String> c0 = drm0.c0(a, new String[]{StringUtils.COMMA}, 0, 6);
            arrayList = new ArrayList();
            for (String str3 : c0) {
                SuperAppActiveFeatureDto[] values = SuperAppActiveFeatureDto.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        superAppActiveFeatureDto = null;
                        break;
                    }
                    SuperAppActiveFeatureDto superAppActiveFeatureDto2 = values[i4];
                    if (brm0.s(str3, superAppActiveFeatureDto2.i())) {
                        superAppActiveFeatureDto = superAppActiveFeatureDto2;
                        break;
                    }
                    i4++;
                }
                if (superAppActiveFeatureDto != null) {
                    arrayList.add(superAppActiveFeatureDto);
                }
            }
        } else {
            arrayList = null;
        }
        dz2 x = yfb.x(yizVar.l(false, arrayList, valueOf, superAppEditWidgetSettingsSourceDto));
        x.q = 1;
        j1 U = rsg0.y0(x, null, null, 3).U(new xx40(new oan0(i), 12));
        jsb0 jsb0Var = new jsb0(new ggb0(this, superAppWidget), 13);
        wug0 wug0Var = new wug0(15, this, superAppWidget);
        int i5 = kwg0.a;
        ver0.b(activity, U.subscribe(jsb0Var, new d120(new hsc0(wug0Var, 6), 20)));
    }

    public final void d4(List<? extends z8n0> list, ListData.Cause cause, boolean z) {
        SuperAppFragment superAppFragment = this.b;
        FragmentActivity activity = superAppFragment.getActivity();
        if (activity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            z8n0 z8n0Var = (z8n0) obj;
            if (!(z8n0Var instanceof f9n0) || ((f9n0) z8n0Var).g()) {
                arrayList.add(obj);
            }
        }
        hdn0 hdn0Var = z ? null : new hdn0(new a7n0.a(activity.getString(R.string.widget_settings_button)));
        if (hdn0Var != null) {
            arrayList = j5g.v0(hdn0Var, arrayList);
        }
        this.J.getClass();
        superAppFragment.so(new ListData(arrayList, cause, 56));
    }

    @Override // xsna.u7n0
    public final void e0(WidgetIds widgetIds, int i) {
        Object obj;
        g7n0.b bVar;
        Iterator<T> it = this.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z8n0 z8n0Var = (z8n0) obj;
            f9n0 f9n0Var = z8n0Var instanceof f9n0 ? (f9n0) z8n0Var : null;
            if (epx.f(f9n0Var != null ? f9n0Var.f() : null, widgetIds.b)) {
                break;
            }
        }
        z8n0 z8n0Var2 = (z8n0) obj;
        if (z8n0Var2 == null || (bVar = this.b.d0.b) == null) {
            return;
        }
        wbn0.b(bVar, z8n0Var2, Integer.valueOf(i), null, 12);
    }

    @Override // xsna.u7n0
    public final void f0(String str) {
        this.b.to(str, false);
    }

    @Override // xsna.u7n0
    public final void g(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence.length() == 0) {
            return;
        }
        SuperAppFragment superAppFragment = this.b;
        FragmentActivity activity = superAppFragment.getActivity();
        ((ClipboardManager) (activity != null ? activity.getSystemService("clipboard") : null)).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
        enj.r(superAppFragment.getActivity(), charSequence2, 0);
    }

    @Override // xsna.u7n0
    public final void g0(String str) {
        FragmentActivity activity = this.b.getActivity();
        if (activity == null) {
            activity = null;
        }
        FragmentActivity fragmentActivity = activity;
        if (fragmentActivity == null) {
            return;
        }
        maz.c(xwk.d().e(), fragmentActivity, str, LaunchContext.A, null, null, 24);
    }

    @Override // xsna.u7n0
    public final void h0(Context context, b9n0 b9n0Var) {
        if (!(b9n0Var.c() instanceof a7n0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.b.uo(WidgetSettingsModalOpenSource.SETTINGS_BUTTON_WIDGET);
    }

    @Override // xsna.u7n0
    public final void h1(j8q j8qVar, ExpandableMenuState expandableMenuState) {
        ww50<?> v;
        ww50 v2;
        SuperAppFragment superAppFragment = this.b;
        g7n0 g7n0Var = superAppFragment.d0;
        SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem = j8qVar.b;
        String str = menuItem.c;
        String str2 = menuItem.d;
        WebAction webAction = menuItem.i;
        BadgeInfo badgeInfo = menuItem.j;
        c8n0 c8n0Var = this.B;
        V2(str, badgeInfo, c8n0Var != null ? c8n0Var.b : null);
        if (webAction != null) {
            g7n0.b bVar = g7n0Var.b;
            if (bVar != null) {
                bVar.f(j8qVar, (Integer) webAction.b.getValue(), null, expandableMenuState);
            }
            FragmentActivity activity = superAppFragment.getActivity();
            if (activity != null) {
                s2(this, webAction, activity, null, 28);
                return;
            }
            return;
        }
        if (menuItem.b == SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.MORE_ITEM) {
            g7n0.b bVar2 = g7n0Var.b;
            if (bVar2 != null) {
                bVar2.f(j8qVar, null, null, expandableMenuState);
            }
            FragmentActivity activity2 = superAppFragment.getActivity();
            if (activity2 == null || (v2 = s200.v(activity2)) == null) {
                return;
            }
            this.h.a(v2.b);
            return;
        }
        if (str2 == null) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Failed to handle menu click"));
            return;
        }
        g7n0.b bVar3 = g7n0Var.b;
        if (bVar3 != null) {
            bVar3.f(j8qVar, null, null, expandableMenuState);
        }
        FragmentActivity activity3 = superAppFragment.getActivity();
        if (activity3 == null || (v = s200.v(activity3)) == null) {
            return;
        }
        cbn0 a = q7n0.a().a();
        if (str2 == null) {
            str2 = "";
        }
        a.g(v, str2);
    }

    @Override // com.vk.lists.c.k
    public final q<it80<n9n0>> hj(c cVar, boolean z) {
        this.r.e();
        S1().s(z);
        return S1().c();
    }

    @Override // xsna.u7n0
    public final void i0(WidgetIds widgetIds) {
        Object obj;
        String str = widgetIds.b;
        Iterator<T> it = this.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            z8n0 z8n0Var = (z8n0) next;
            f9n0 f9n0Var = z8n0Var instanceof f9n0 ? (f9n0) z8n0Var : null;
            if (epx.f(f9n0Var != null ? f9n0Var.f() : null, str)) {
                obj = next;
                break;
            }
        }
        if (((z8n0) obj) == null) {
            return;
        }
        S1().y(str);
    }

    @Override // xsna.u7n0
    public final void i1(obn0 obn0Var) {
        ww50<?> v;
        ww50 v2;
        V2(obn0Var.c().d, obn0Var.c().g, null);
        WebAction webAction = obn0Var.c().l;
        String str = obn0Var.c().c;
        SuperAppFragment superAppFragment = this.b;
        g7n0 g7n0Var = superAppFragment.d0;
        if (webAction != null) {
            g7n0.b bVar = g7n0Var.b;
            if (bVar != null) {
                bVar.f(obn0Var, (Integer) webAction.b.getValue(), null, null);
            }
            FragmentActivity activity = superAppFragment.getActivity();
            if (activity != null) {
                s2(this, webAction, activity, null, 28);
                return;
            }
            return;
        }
        if (epx.f(str, "more")) {
            g7n0.b bVar2 = g7n0Var.b;
            if (bVar2 != null) {
                wbn0.b(bVar2, obn0Var, null, null, 14);
            }
            FragmentActivity activity2 = superAppFragment.getActivity();
            if (activity2 == null || (v2 = s200.v(activity2)) == null) {
                return;
            }
            this.h.a(v2.b);
            return;
        }
        if (str == null) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Failed to handle menu click"));
            return;
        }
        g7n0.b bVar3 = g7n0Var.b;
        if (bVar3 != null) {
            bVar3.f(obn0Var, null, null, null);
        }
        FragmentActivity activity3 = superAppFragment.getActivity();
        if (activity3 == null || (v = s200.v(activity3)) == null) {
            return;
        }
        q7n0.a().a().g(v, str);
    }

    @Override // xsna.v7n0
    public final void j() {
        n9n0 n9n0Var = this.z;
        if (n9n0Var != null) {
            ArrayList I1 = I1(n9n0Var);
            this.A = I1;
            d4(I1, ListData.Cause.CACHE, false);
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.q;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.s.e();
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        c cVar2 = this.I;
        if (cVar2 != null) {
            cVar2.v();
        }
        this.I = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.w;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.x;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.y;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        this.H.d.dispose();
        this.i = false;
        this.g.e(this);
    }

    @Override // xsna.cc6
    public final void onPause() {
        this.r.e();
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.k;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.m;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.n;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.o;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar6 = this.j;
        if (cVar6 != null) {
            cVar6.dispose();
        }
        yan0 yan0Var = this.D;
        fpx0 fpx0Var = yan0Var.b;
        if (fpx0Var != null) {
            fpx0Var.a();
        }
        yan0Var.b = null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = hg1.h(S1().o(), new z6f0(this, 18));
        S1().u();
        io.reactivex.rxjava3.disposables.c cVar2 = this.n;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.n = S1().A().subscribe(new ca10(new b8j0(this, 9), 27));
        io.reactivex.rxjava3.disposables.c cVar3 = this.o;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.o = S1().B().subscribe(new y730(new t440(this, 27), 16));
        io.reactivex.rxjava3.disposables.c cVar4 = this.j;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        q<QueueParams> F = S1().F();
        nlf0 nlf0Var = new nlf0(new j5n(27), 4);
        F.getClass();
        this.j = new i0(F, nlf0Var).subscribe(new pmu(new mga0(this, 22), 25));
        man0 man0Var = this.E;
        if (man0Var != null && man0Var.c) {
            man0Var.a();
            man0Var.c = false;
        }
        this.t.onNext(s3q0.a);
        n9n0 z = S1().z();
        if (z != null) {
            a4(z.a);
        }
    }

    @Override // xsna.w0l0
    public final void p0(List<m0l0> list) {
        Object obj;
        Object obj2;
        Object obj3;
        SuperAppMiniWidget.Payload payload;
        ArrayList<MiniWidgetItem> arrayList;
        n9n0 n9n0Var = this.z;
        if (n9n0Var != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (DateUtils.isToday(((m0l0) obj2).c)) {
                        break;
                    }
                }
            }
            m0l0 m0l0Var = (m0l0) obj2;
            if (m0l0Var == null) {
                return;
            }
            int i = m0l0Var.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = n9n0Var.a.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it2.next();
                    if (((SuperAppWidget) obj3) instanceof SuperAppMiniWidget) {
                        break;
                    }
                }
            }
            SuperAppMiniWidget superAppMiniWidget = obj3 instanceof SuperAppMiniWidget ? (SuperAppMiniWidget) obj3 : null;
            if (superAppMiniWidget != null && (payload = superAppMiniWidget.n) != null && (arrayList = payload.b) != null) {
                Iterator<T> it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    MiniWidgetItem miniWidgetItem = (MiniWidgetItem) next;
                    if (miniWidgetItem instanceof DefaultMiniWidget) {
                        DefaultMiniWidget defaultMiniWidget = (DefaultMiniWidget) miniWidgetItem;
                        if (epx.f(defaultMiniWidget.h, "mw_steps") && !epx.f(defaultMiniWidget.o, String.valueOf(i))) {
                            obj = next;
                            break;
                        }
                    }
                }
                MiniWidgetItem miniWidgetItem2 = (MiniWidgetItem) obj;
                if (miniWidgetItem2 != null) {
                    DefaultMiniWidget defaultMiniWidget2 = (DefaultMiniWidget) miniWidgetItem2;
                    arrayList.set(arrayList.indexOf(miniWidgetItem2), new DefaultMiniWidget(defaultMiniWidget2.h, defaultMiniWidget2.i, defaultMiniWidget2.j, defaultMiniWidget2.k, defaultMiniWidget2.l, defaultMiniWidget2.m, defaultMiniWidget2.n, String.valueOf(i), defaultMiniWidget2.p));
                    arrayList2.add(superAppMiniWidget);
                }
            }
            S1().j(arrayList2);
        }
    }

    public final ArrayList r1(boolean z) {
        ArrayList arrayList = new ArrayList();
        SuperAppFragment superAppFragment = this.b;
        FragmentActivity activity = superAppFragment.getActivity();
        if (!z || activity == null) {
            arrayList.add(new f8n0());
        } else {
            this.J.getClass();
            List<Pair<CustomMenuInfo, q5j0>> list = nnk.a;
            arrayList.add(new c8n0("PUkAEhcOSVJ3SUVUW1UGA2RRSwVQRh0PJQ4aKVhRBRNkR0saVE0EEzI0HQ9FUUlcZBgMBENdCAM1NAQTW0FJSmQdDARGXQQIZFFYCw", e43.l(nnk.a("friends", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WDRQvDgcSRhYW", activity.getString(R.string.friends), "services_menu_friends"), nnk.a("groups", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WDBQpHhkFF0k", activity.getString(R.string.vk_groups), "services_menu_communities"), nnk.a("audios", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WChMiAgYFF0k", activity.getString(R.string.music), "services_menu_music"), nnk.a("videos", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WHQ8iDgYFF0k", activity.getString(R.string.videos), "services_menu_video"), nnk.a("clips", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WCAovGxpUSA", activity.getString(R.string.vk_clips), "services_menu_clips"), nnk.a("games", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WDAcrDhpUSA", activity.getString(R.string.vk_games), "services_menu_games"), nnk.a("market", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WCAonGBofU10OAjVJFA", activity.getString(R.string.vk_shopping), "services_menu_market"), nnk.a("steps", "PUkAEhcOSVFzWFBGDQNJSmQfEAZQFlFEKwIHH2pVGxZkFg", activity.getString(R.string.vk_steps), "services_menu_steps"), nnk.a("stickers", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WGBIvCAITR0dJGw", activity.getString(R.string.vk_stickers), "services_menu_stickers"), nnk.a("faves", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WCQkpAAQXR18YRDs", activity.getString(R.string.vk_bookmarks), "services_menu_bookmarks"), nnk.a("settings", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WGAMyHwAYUkdJGw", activity.getString(R.string.vk_settings), "services_menu_settings"), new SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem(SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.MORE_ITEM, "PUkdD0VRSVxkCAUfUFofOSsOBwMXGEkIJwYMVA8WBgk0DksL", "more", "", "", null, null, null, null))));
        }
        arrayList.add(new cdn0());
        g7n0.b bVar = superAppFragment.d0.b;
        if (bVar != null) {
            bVar.h(arrayList, WidgetsLoadingState.SKELETON);
        }
        return arrayList;
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        i0q0.f(new wm80(this, 26));
    }

    public final void t2(n9n0 n9n0Var, boolean z, boolean z2) {
        Object obj;
        List<? extends z8n0> r1;
        Object obj2;
        mzp0 mzp0Var;
        fdv fdvVar;
        if (z2 || n9n0Var == null || !epx.f(this.z, n9n0Var)) {
            if (n9n0Var == null) {
                yan0 yan0Var = this.D;
                fpx0 fpx0Var = yan0Var.b;
                if (fpx0Var != null) {
                    fpx0Var.a();
                }
                yan0Var.b = null;
            }
            if (n9n0Var != null) {
                for (SuperAppWidget superAppWidget : n9n0Var.a.a) {
                    if (superAppWidget instanceof SuperAppWidgetCustomMenu) {
                        Iterator<T> it = ((SuperAppWidgetCustomMenu) superAppWidget).p.iterator();
                        while (it.hasNext()) {
                            WebAction webAction = ((CustomMenuInfo) it.next()).l;
                            WebActionOpenNativeApp webActionOpenNativeApp = webAction instanceof WebActionOpenNativeApp ? (WebActionOpenNativeApp) webAction : null;
                            if (webActionOpenNativeApp != null) {
                                HashMap<String, e890.a> hashMap = e890.a;
                                e890.a(webActionOpenNativeApp.d);
                            }
                        }
                    }
                }
            }
            SuperAppFragment superAppFragment = this.b;
            g7n0.b bVar = superAppFragment.d0.b;
            if (bVar != null) {
                bVar.l = n9n0Var != null ? n9n0Var.a.k : null;
            }
            this.z = n9n0Var;
            this.C = n9n0Var != null ? n9n0Var.a.d : null;
            if (n9n0Var == null) {
                io.reactivex.rxjava3.disposables.c cVar = this.k;
                if (cVar == null || cVar.h()) {
                    Iterator<T> it2 = this.A.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (obj instanceof c8n0) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (((c8n0) (obj instanceof c8n0 ? obj : null)) == null) {
                        this.k = hg1.h(q.B0(3L, TimeUnit.SECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new exi0(this, 9));
                        r1 = r1(false);
                        this.A = r1;
                        ListData.Cause cause = ListData.Cause.DEFAULT;
                        this.J.getClass();
                        superAppFragment.so(new ListData(r1, cause, 24));
                        X3(!z);
                        return;
                    }
                }
                r1 = this.A;
                this.A = r1;
                ListData.Cause cause2 = ListData.Cause.DEFAULT;
                this.J.getClass();
                superAppFragment.so(new ListData(r1, cause2, 24));
                X3(!z);
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar2 = this.k;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            ArrayList I1 = I1(n9n0Var);
            this.A = I1;
            Iterator it3 = I1.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (obj2 instanceof c8n0) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (!(obj2 instanceof c8n0)) {
                obj2 = null;
            }
            c8n0 c8n0Var = (c8n0) obj2;
            this.B = c8n0Var;
            if (c8n0Var != null && (fdvVar = superAppFragment.Z) != null) {
                l8q l8qVar = fdvVar.d;
                if (l8qVar == null) {
                    l8qVar = null;
                }
                List<SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem> list = c8n0Var.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(new j8q((SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem) it4.next()));
                }
                l8qVar.O0(arrayList, null, null);
            }
            n9n0.a aVar = n9n0Var.b;
            ListData.Cause cause3 = epx.f(aVar, n9n0.a.b.a) ? ListData.Cause.NETWORK_UPDATE : aVar instanceof n9n0.a.C3389a ? ListData.Cause.CACHE : ListData.Cause.UNKNOWN;
            if ((cause3 == ListData.Cause.NETWORK_UPDATE || cause3 == ListData.Cause.CACHE) && (mzp0Var = this.c) != null) {
                mzp0Var.c(cause3 == ListData.Cause.CACHE);
            }
            List<? extends z8n0> list2 = this.A;
            Integer num = n9n0Var.a.i;
            d4(list2, cause3, (num != null ? num.intValue() : 0) != 0);
            X3(true);
        }
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<it80<n9n0>> qVar, boolean z, c cVar) {
        this.r.b(qVar.subscribe(new ux00(new vtt(z, this, cVar), 24)));
    }

    @Override // xsna.u7n0
    public final void x(Context context, z8n0 z8n0Var, WebAction webAction, int i, boolean z) {
        SuperAppFragment superAppFragment = this.b;
        g7n0 g7n0Var = superAppFragment.d0;
        if (z) {
            superAppFragment.uo(WidgetSettingsModalOpenSource.MINI_WIDGET_LONG_TAP);
            return;
        }
        if (!(z8n0Var instanceof fan0)) {
            i++;
        }
        if ((webAction instanceof WebActionVkInternal) && (((WebActionVkInternal) webAction).c instanceof WebActionVkInternal.Payload.Music)) {
            g7n0.b bVar = g7n0Var.b;
            if (bVar != null) {
                wbn0.b(bVar, z8n0Var, Integer.valueOf(i), null, 12);
            }
        } else {
            g7n0.b bVar2 = g7n0Var.b;
            if (bVar2 != null) {
                bVar2.f(z8n0Var, Integer.valueOf(i), null, null);
            }
        }
        s2(this, webAction, context, null, 28);
    }

    @Override // xsna.u7n0
    public final void x0(String str) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent);
        FragmentActivity activity = this.b.getActivity();
        if (activity == null) {
            return;
        }
        if (!str.equals(SuperAppMiniWidgetItemDto.TypeDto.MW_STEPS.i())) {
            if (str.equals(SuperAppMiniWidgetItemDto.TypeDto.MW_MUSIC.i())) {
                new dw20.b(activity, null).M(R.drawable.vk_icon_error_outline_56, valueOf).v0(R.string.vk_music_widget_not_available_title).h0(R.string.vk_music_widget_not_available_button, new k5f0(6)).I0(null);
                return;
            } else {
                x4(activity);
                return;
            }
        }
        ayu0 ayu0Var = this.e;
        MobileServicesType h = ayu0Var.h(activity);
        if (h == MobileServicesType.GOOGLE_PLAY || h == MobileServicesType.HUAWEI) {
            ayu0Var.j(activity, RequestedMiniApp.VK_STEPS, null, new nk0(28, this, activity));
        } else {
            ((dw20.b) dw20.a.Q(new dw20.b(activity, null).M(R.drawable.vk_icon_error_outline_56, valueOf).v0(R.string.vk_steps_widget_not_available_title), R.string.vk_steps_widget_not_available_subtitle)).h0(R.string.vk_music_widget_not_available_button, new yo80(8)).I0(null);
        }
    }

    public final void x4(Activity activity) {
        ((dw20.b) dw20.a.Q(new dw20.b(activity, null).M(R.drawable.vk_icon_error_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.vk_mini_widget_disable_click_title), R.string.vk_mini_widget_disable_click_subtitle)).h0(R.string.vk_mini_widget_disable_click_button, new xqi0(this)).I0(null);
    }

    @Override // xsna.u7n0
    public final void z(SuperAppWidget superAppWidget) {
        N3(superAppWidget, true);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, superAppWidget.r(), null, 46, null), new MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem(MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem.Type.ONBOARDING_PANEL_CLOSE), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }

    @Override // xsna.u7n0
    public final void u0(Context context, u7n0.a aVar, WebAction webAction) {
    }
}
