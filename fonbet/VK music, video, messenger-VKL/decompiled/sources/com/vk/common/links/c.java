package com.vk.common.links;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.C4504q2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.catalog2.feature.music.ui.fragment.audiobook.AudioBookPersonCatalogFragment;
import com.vk.catalog2.feature.music.ui.fragment.audiobook.AudioBookPersonGenreCatalogFragment;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgIdType;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.pushes.PushOpenActivity;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stickers.bridge.GiftData;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.EventsAppFragment;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.invite.GroupCallInviteActivity;
import com.vk.voip.invite.GroupCallInviteFragment;
import com.vk.voip.ui.join.directly.withpreview.JoinCallConfig;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vk.webapp.fragments.BugtrackerFragment;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vk.webapp.fragments.HelpFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.LinkRedirActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.single.k;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0u;
import xsna.a1w;
import xsna.a201;
import xsna.a4r0;
import xsna.aad;
import xsna.aeg0;
import xsna.aha0;
import xsna.ahn;
import xsna.amt;
import xsna.aq20;
import xsna.aq80;
import xsna.ar80;
import xsna.arm0;
import xsna.asu0;
import xsna.b6m;
import xsna.b9;
import xsna.b95;
import xsna.ba6;
import xsna.bdz;
import xsna.be50;
import xsna.bis;
import xsna.bpn0;
import xsna.bqs;
import xsna.bqt;
import xsna.br80;
import xsna.brm0;
import xsna.bum;
import xsna.bwg;
import xsna.c120;
import xsna.c230;
import xsna.c2k;
import xsna.c2y;
import xsna.c4r0;
import xsna.c5g;
import xsna.c63;
import xsna.ca6;
import xsna.cp50;
import xsna.cqm0;
import xsna.cr80;
import xsna.csb;
import xsna.cvk;
import xsna.cx00;
import xsna.d120;
import xsna.d1e0;
import xsna.di30;
import xsna.dlw0;
import xsna.dq;
import xsna.drm0;
import xsna.e370;
import xsna.e3m;
import xsna.e43;
import xsna.e4b0;
import xsna.e4t;
import xsna.ept;
import xsna.epx;
import xsna.eqq;
import xsna.esa;
import xsna.f2u;
import xsna.f880;
import xsna.fa;
import xsna.fdi;
import xsna.fkq0;
import xsna.fr;
import xsna.fxc0;
import xsna.fz2;
import xsna.g1e0;
import xsna.g2v;
import xsna.g9b;
import xsna.gf2;
import xsna.gl30;
import xsna.gzn;
import xsna.gzs;
import xsna.h03;
import xsna.h440;
import xsna.h630;
import xsna.h66;
import xsna.hf3;
import xsna.hg1;
import xsna.hl10;
import xsna.hl30;
import xsna.hoc;
import xsna.hq3;
import xsna.hs00;
import xsna.hu50;
import xsna.hyu;
import xsna.i0q0;
import xsna.ig4;
import xsna.iou;
import xsna.iq20;
import xsna.iu4;
import xsna.izs;
import xsna.j5g;
import xsna.jeq0;
import xsna.jgr0;
import xsna.jsv;
import xsna.k2y;
import xsna.k8t;
import xsna.khw0;
import xsna.kil0;
import xsna.kjs;
import xsna.kq80;
import xsna.kv;
import xsna.kyv;
import xsna.l8w;
import xsna.le50;
import xsna.ljs;
import xsna.lpg0;
import xsna.lxz;
import xsna.m330;
import xsna.mch0;
import xsna.mh4;
import xsna.mm1;
import xsna.mq20;
import xsna.mq80;
import xsna.n1r;
import xsna.n240;
import xsna.n37;
import xsna.nh;
import xsna.nq80;
import xsna.o0w;
import xsna.o25;
import xsna.oga0;
import xsna.op0;
import xsna.op20;
import xsna.oua;
import xsna.owv;
import xsna.oz50;
import xsna.p2u;
import xsna.p350;
import xsna.p37;
import xsna.p5w;
import xsna.peq0;
import xsna.pn00;
import xsna.po40;
import xsna.pq80;
import xsna.prq;
import xsna.pyz;
import xsna.q1w;
import xsna.q46;
import xsna.qct;
import xsna.qil0;
import xsna.qq80;
import xsna.qr;
import xsna.qw40;
import xsna.r97;
import xsna.rpu;
import xsna.rq80;
import xsna.rsg0;
import xsna.rwi;
import xsna.s440;
import xsna.sd6;
import xsna.se3;
import xsna.sh3;
import xsna.sl30;
import xsna.svn;
import xsna.t6g0;
import xsna.tfx;
import xsna.thx;
import xsna.tkw0;
import xsna.tl30;
import xsna.tts;
import xsna.tv7;
import xsna.tz;
import xsna.u30;
import xsna.uga0;
import xsna.uh40;
import xsna.uhx;
import xsna.uk40;
import xsna.uqm;
import xsna.ur80;
import xsna.ut6;
import xsna.uu60;
import xsna.v1v;
import xsna.v73;
import xsna.v9a0;
import xsna.vcl0;
import xsna.vk40;
import xsna.vkb;
import xsna.vq80;
import xsna.vx2;
import xsna.w110;
import xsna.w620;
import xsna.w95;
import xsna.wnt;
import xsna.wq80;
import xsna.x750;
import xsna.x93;
import xsna.xa4;
import xsna.xc50;
import xsna.xgv;
import xsna.xjm;
import xsna.xk30;
import xsna.xqu;
import xsna.xwk;
import xsna.yfb;
import xsna.yl0;
import xsna.yp80;
import xsna.yw4;
import xsna.z250;
import xsna.z5b;
import xsna.zal0;
import xsna.zdx0;
import xsna.zga0;
import xsna.zqk0;
import xsna.zqu;
import xsna.zyu;

/* compiled from: OpenFunctions.kt */
/* loaded from: classes17.dex */
public final class c {
    public static final Regex a = new Regex("[0-9]+");
    public static final bpn0 b = new bpn0(new nh(22));

    public static final void A(Context context, NewsfeedRouter newsfeedRouter, String str, String str2, yp80 yp80Var, boolean z) {
        tfx tfxVar = new tfx("utils.resolveScreenName", new vcl0(4), new j(29));
        tfx.o(tfxVar, "screen_name", str, 0, 0, 12);
        rsg0.y0(yfb.x(tfxVar), null, null, 3).L(new hl30(new pyz(14), 6), false).subscribe(new tts(new csb(context, newsfeedRouter, str2, str, yp80Var, z), 18), new l8w(new iou(yp80Var, 25), 13));
    }

    public static final boolean B(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
            return true;
        } catch (ActivityNotFoundException unused) {
            return C(context, drm0.U(str, "mailto:"), null, null);
        }
    }

    public static final boolean C(Context context, String str, String str2, String str3) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str3);
            intent.setDataAndType(Uri.parse("mailto:"), "text/plain");
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.send_email)));
            return true;
        } catch (ActivityNotFoundException e) {
            cvk.u(R.string.error, false);
            L.i(e);
            return false;
        }
    }

    public static final void D(final Context context, final Uri uri, final LaunchContext launchContext, Bundle bundle, final yp80 yp80Var) {
        String uri2 = uri.toString();
        JSONObject b2 = b(bundle);
        a4r0 a4r0Var = new a4r0("utils.resolveExternalLink");
        a4r0Var.K("url", uri2);
        a4r0Var.K("away_params", b2.toString());
        new c0(hg1.m(rsg0.y0(a4r0Var, null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.lq80
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                xwk.d().getBrowser().i(context, uri, launchContext, null);
                yp80Var.onSuccess();
            }
        }).subscribe(new p350(new r97(context, uri, launchContext, yp80Var, 3), 4), new tz(new c2k(context, uri, launchContext, yp80Var), 28));
    }

    @SuppressLint({"CheckResult"})
    public static final void E(Context context, String str, yp80 yp80Var) {
        new c0(hg1.m(rsg0.y0(new a0u(str), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new sd6(yp80Var, 6)).subscribe(new kjs(new mh4(23, context, yp80Var), 11), new ljs(new xgv(yp80Var, 19), 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F(final Context context, final yp80 yp80Var, String str, String str2, boolean z, boolean z2, String str3, int i) {
        ArrayList arrayList;
        if ((i & 8) != 0) {
            str = null;
        }
        boolean z3 = (i & 32) != 0 ? false : z;
        final boolean z4 = (i & 64) != 0 ? false : z2;
        final String str4 = (i & 128) != 0 ? null : str3;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = str2 == null ? z3 ? "push_other" : "link" : str2;
        if (context instanceof LinkRedirActivity) {
            ref$ObjectRef.element = "internal_notification";
        }
        if (str == null || str.length() == 0) {
            arrayList = new ArrayList();
        } else {
            List c0 = drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                Long n = arm0.n((String) it.next());
                if (n != null) {
                    arrayList2.add(n);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((Number) next).longValue() > 0) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                dq.h(((Number) it3.next()).longValue(), arrayList4);
            }
            arrayList = new ArrayList(arrayList4);
        }
        final List O0 = j5g.O0(j5g.S0(arrayList));
        i0q0.j(new Runnable() { // from class: xsna.xq80
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                g2v.d().a().d(context, O0, z4, (String) ref$ObjectRef.element, str4);
                yp80 yp80Var2 = yp80Var;
                if (yp80Var2 != null) {
                    yp80Var2.onSuccess();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map] */
    public static final void G(Context context, yp80 yp80Var, String str, LinkedHashMap linkedHashMap, boolean z) {
        LinkedHashMap linkedHashMap2;
        if (context instanceof LinkRedirActivity) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
            linkedHashMap3.put("ref", "internal_notification");
            linkedHashMap2 = pn00.t(linkedHashMap3);
        } else {
            Object obj = linkedHashMap.get("ref");
            linkedHashMap2 = linkedHashMap;
            if (obj == null) {
                String str2 = z ? "push_other" : "link";
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap);
                linkedHashMap4.put("ref", str2);
                linkedHashMap2 = pn00.t(linkedHashMap4);
            }
        }
        g2v.d().a().n(context, str, linkedHashMap2);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    public static final void H(Context context, String str, boolean z, lpg0 lpg0Var) {
        boolean z2;
        FragmentManager supportFragmentManager;
        JoinCallConfig joinCallConfig = new JoinCallConfig(str, null, null, null, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE), null, false, false, 238, null);
        if (o25.a().b()) {
            if (!fxc0.B().J().m1()) {
                int i = JoinCallFragment.U;
                JoinCallFragment.a.a(context, joinCallConfig);
                return;
            } else {
                if (lpg0Var != null) {
                    JoinCallFragment.a.C2064a c2064a = new JoinCallFragment.a.C2064a();
                    c2064a.c.a.putParcelable("KEY_JOIN_CALL_CONFIG", joinCallConfig);
                    lpg0Var.a(context, c2064a);
                    return;
                }
                return;
            }
        }
        int i2 = GroupCallInviteFragment.V;
        if (z) {
            int i3 = GroupCallInviteFragment.V;
            GroupCallInviteFragment.a aVar = new GroupCallInviteFragment.a(GroupCallInviteFragment.class, GroupCallInviteActivity.class, null);
            aVar.s(true);
            aVar.x();
            aVar.w(R.style.VkIm_Theme_ChatInvite);
            Bundle bundle = aVar.j;
            bundle.putString("vkJoinLink", str);
            bundle.putParcelable("callSource", null);
            bundle.putString("name", null);
            bundle.putBoolean("should_auth_if_needed", false);
            bundle.putInt("closeType", 2);
            aVar.k(context);
            return;
        }
        while (true) {
            z2 = context instanceof FragmentActivity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) context : null);
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        int i4 = GroupCallInviteFragment.V;
        if (supportFragmentManager.H("GroupCallInviteFragment") != null) {
            return;
        }
        GroupCallInviteFragment groupCallInviteFragment = new GroupCallInviteFragment();
        Bundle b2 = qr.b("vkJoinLink", str, "name", null);
        b2.putParcelable("callSource", null);
        b2.putBoolean("should_auth_if_needed", false);
        groupCallInviteFragment.setArguments(b2);
        groupCallInviteFragment.Td(supportFragmentManager, "GroupCallInviteFragment");
    }

    @SuppressLint({"CheckResult"})
    public static final void I(long j, yp80 yp80Var) {
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        Context b2 = c63.b();
        if (b2 == null && (b2 = e43.a) == null) {
            b2 = null;
        }
        Context context = b2;
        List singletonList = Collections.singletonList(new UserId(j));
        List singletonList2 = Collections.singletonList(GroupsFieldsDto.NAME);
        if ((4 & 2) != 0) {
            singletonList2 = null;
        }
        int i = 1;
        hg1.m(q.I0(rsg0.y0(yfb.x(xqu.a.a(null, singletonList, singletonList2)), null, null, 3).U(new z250(new vq80(j), i)), rsg0.y0(yfb.x(xqu.e(new zqu(), o25.a().c(), Collections.singletonList(GroupsFilterDto.ENABLED_NOTIFICATIONS), null, 15, 74)), null, null, 3).U(new ca6(new ba6(j, i), 29)), new op0(new aad(10), 26)), context, 0L, false, 62).subscribe(new n1r(new yl0(17, context, yp80Var), 13), new uu60(new eqq(yp80Var, 27), 3));
    }

    @SuppressLint({"CheckResult"})
    public static final void J(Context context) {
        new HomeFragment2.a().k(context);
    }

    public static final void K(op20 op20Var) {
        oz50 oz50Var;
        Context context = op20Var.b;
        aq20 aq20Var = op20Var.e;
        iq20 iq20Var = op20Var.d;
        String str = op20Var.c.a;
        ApiApplication apiApplication = op20Var.a;
        long j = apiApplication.b.b;
        InternalMiniApps.Companion.getClass();
        if (j != InternalMiniApps.VK_PAY_OLD.h().a) {
            boolean z = true;
            if (j == EventsAppFragment.a0) {
                if (str == null) {
                    yp80 yp80Var = iq20Var.g;
                    if (yp80Var != null) {
                        yp80Var.U();
                        return;
                    }
                    return;
                }
                boolean z2 = apiApplication.J;
                EventsAppFragment.a aVar = new EventsAppFragment.a(str, InternalVkMiniApps.EVENTS_CATALOG.h().a, EventsAppFragment.class, false, 20);
                if (z2) {
                    aVar.j.putBoolean("no_bottom_navigation", true);
                }
                oz50Var = aVar;
            } else if (j == 53670660) {
                int i = GiftsCatalogFragment.c0;
                GiftsCatalogFragment.a aVar2 = new GiftsCatalogFragment.a(str);
                aVar2.y();
                oz50Var = aVar2;
            } else {
                if (str == null) {
                    yp80 yp80Var2 = iq20Var.g;
                    if (yp80Var2 != null) {
                        yp80Var2.U();
                        return;
                    }
                    return;
                }
                if (aq20Var.i) {
                    Activity h = e3m.h(context);
                    if (h != null) {
                        yp80 yp80Var3 = iq20Var.g;
                        if (yp80Var3 != null) {
                            yp80Var3.onSuccess();
                        }
                        hf3.e(h, op20Var, new x750(op20Var, 7));
                        return;
                    }
                    yp80 yp80Var4 = iq20Var.g;
                    if (yp80Var4 != null) {
                        yp80Var4.U();
                        return;
                    }
                    return;
                }
                if (!apiApplication.J && !epx.f(aq20Var.d, Boolean.TRUE)) {
                    z = false;
                }
                aq20Var.d = Boolean.valueOf(z);
                oz50Var = bis.d(op20Var);
            }
        } else {
            if (!o25.a().i().y) {
                yp80 yp80Var5 = iq20Var.g;
                if (yp80Var5 != null) {
                    yp80Var5.U();
                    return;
                }
                return;
            }
            int i2 = VkPayFragment.g0;
            oz50Var = VkPayFragment.b.b(str);
        }
        Integer num = aq20Var.e;
        Activity h2 = e3m.h(context);
        if (num == null || !(h2 instanceof aeg0)) {
            oz50Var.k(context);
        } else {
            oz50Var.h(h2, num.intValue());
        }
        yp80 yp80Var6 = iq20Var.g;
        if (yp80Var6 != null) {
            yp80Var6.onSuccess();
        }
    }

    public static final void L(Context context, boolean z, tkw0 tkw0Var, String str) {
        dlw0.a aVar = new dlw0.a(str);
        if (z) {
            tkw0Var.b(context, aVar);
        } else {
            tkw0Var.a(context, aVar, null);
        }
    }

    public static final void M(Context context, String str, String str2) {
        int i = 0;
        Matcher matcher = Pattern.compile("([a-z]+)([-0-9]+)_([-0-9]+)", 0).matcher(str);
        if (matcher.find()) {
            UserId userId = new UserId(cqm0.l(matcher.group(2)));
            try {
                i = Integer.parseInt(matcher.group(3));
            } catch (Throwable unused) {
            }
            ReactionsFragment.a aVar = new ReactionsFragment.a(userId, i);
            aVar.B(matcher.group(1));
            if (epx.f(str2, "friends")) {
                aVar.z();
            } else if (epx.f(str2, "published")) {
                aVar.A();
            } else {
                aVar.y();
            }
            aVar.k(context);
        }
    }

    @SuppressLint({"CheckResult"})
    public static final void N(final Context context, final Uri uri, final LaunchContext launchContext, final yp80 yp80Var) {
        new c0(hg1.m(rsg0.y0(new prq(uri.toString(), 1), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.zq80
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.common.links.c.O(context, uri, launchContext, yp80Var);
            }
        }).subscribe(new c2y(new gf2(context, yp80Var, uri, launchContext, 1), 16), new xk30(new ar80(context, uri, launchContext, yp80Var, 0), 10));
    }

    public static final void O(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var) {
        xwk.d().getBrowser().i(context, uri, launchContext, null);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    public static final void P(Context context, String str, String str2, String str3, String str4) {
        if (str2 != null && str2.length() != 0) {
            str = v1v.a('_', str, str2);
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str3 == null) {
            str3 = "link_mask";
        }
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str4, str3);
        aVar.m = str;
        aVar.d();
        aVar.C(context);
    }

    public static final void Q(Context context, String str, boolean z, String str2, String str3, yp80 yp80Var, boolean z2, boolean z3, String str4) {
        b0 a0;
        int i;
        ur80 ur80Var = new ur80(str, z, str2, str3, yp80Var, z2, z3, str4);
        String a2 = (str3 == null || !((Regex) b.getValue()).f(str3)) ? str : v1v.a('_', str, str3);
        if (z2) {
            v9a0 v9a0Var = new v9a0("photos.getPhotoRecognitionTags");
            List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            String str5 = (String) c0.get(0);
            String str6 = (String) c0.get(1);
            v9a0Var.D(cqm0.l(str5), "owner_id");
            try {
                i = Integer.parseInt(str6);
            } catch (Throwable unused) {
                i = 0;
            }
            v9a0Var.C(i, "photo_id");
            v9a0Var.K("access_key", str3);
            v9a0Var.K("ref", str4);
            a0 = rsg0.a0(v9a0Var);
        } else if (z3) {
            List singletonList = Collections.singletonList(a2);
            tfx tfxVar = new tfx("photos.getPhotosByIdWithTags", new fr(28), new uga0(0));
            tfxVar.i("photos", singletonList);
            tfxVar.j("photo_sizes", true);
            tfxVar.j("extended", true);
            a0 = rsg0.a0(yfb.y(tfxVar, new p2u(13)));
        } else {
            a0 = rsg0.a0(new yw4(a2, 1));
        }
        asu0.a.getClass();
        new c0(hg1.m(a0.r0(asu0.r()).L(new b9(new owv(ur80Var, 21), 26), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new u30(ur80Var, 4)).subscribe(new tz(new sh3(22, context, ur80Var), 29), new le50(new mm1(21, context, ur80Var), 5));
    }

    @SuppressLint({"CheckResult"})
    public static final void S(Context context, Uri uri, LaunchContext launchContext, String str, yp80 yp80Var) {
        boolean t = BuildInfo.t();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (!t) {
            Pair h0 = h0(context, launchContext);
            String str2 = (String) h0.d();
            String str3 = (String) h0.g();
            BrowserPerfState browserPerfState = new BrowserPerfState();
            browserPerfState.d = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
            po40 po40Var = new po40();
            UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto = UtilsResolveScreenNameWithDataPlatformDto.ANDROID;
            String uri2 = uri.toString();
            Integer m = arm0.m(10, str3);
            String str4 = launchContext.f;
            Integer m2 = str4 != null ? arm0.m(10, str4) : null;
            ArrayList a2 = a();
            ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AppFields) it.next()).h());
            }
            new c0(hg1.m(rsg0.y0(yfb.x(po40Var.r(str, utilsResolveScreenNameWithDataPlatformDto, str2, m2, m, uri2, arrayList)), null, null, 3), context, 0L, false, 62), lVar, new q46(yp80Var, 4)).subscribe(new le50(new mq80(context, uri, launchContext, browserPerfState, yp80Var), 4), new cx00(new di30(yp80Var, str, browserPerfState, uri, 1), 9));
            return;
        }
        BrowserPerfState browserPerfState2 = new BrowserPerfState();
        browserPerfState2.d = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        Pair h02 = h0(context, launchContext);
        String str5 = (String) h02.d();
        String str6 = (String) h02.g();
        po40 po40Var2 = new po40();
        UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto2 = UtilsResolveScreenNameWithDataPlatformDto.ANDROID;
        String uri3 = uri.toString();
        Integer m3 = arm0.m(10, str6);
        ArrayList a3 = a();
        ArrayList arrayList2 = new ArrayList(c5g.u(a3, 10));
        Iterator it2 = a3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AppFields) it2.next()).h());
        }
        new c0(hg1.m(rsg0.y0(yfb.x(po40.s(po40Var2, str, utilsResolveScreenNameWithDataPlatformDto2, str5, m3, uri3, arrayList2, 8)), null, null, 3), context, 0L, false, 62).U(new e4t(new b95(1, new svn(), svn.class, "map", "map(Lcom/vk/api/generated/utils/dto/UtilsDomainResolvedWithDataDto;)Lcom/vk/api/execute/ScreenName;", 0, 8), 8)), lVar, new oua(yp80Var, 3)).subscribe(new k2y(new pq80(context, uri, launchContext, browserPerfState2, yp80Var), 10), new qw40(new w95(yp80Var, str, browserPerfState2, 7), 5));
    }

    public static /* synthetic */ void T(Context context, Uri uri, LaunchContext launchContext, String str, yp80 yp80Var) {
        UserId.b bVar = UserId.c;
        S(context, uri, launchContext, str, yp80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    public static final boolean U(Context context, String str, String str2, String str3, String str4, yp80 yp80Var) {
        Collection collection;
        Integer m = arm0.m(10, str);
        if (m == null) {
            if (yp80Var != null) {
                yp80Var.onError(new IllegalArgumentException("Gift id can't be parsed"));
            }
            return false;
        }
        if (str2 == null || str2.length() <= 0) {
            collection = EmptyList.b;
        } else {
            List c0 = drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                Long n = arm0.n((String) it.next());
                if (n != null) {
                    arrayList.add(n);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((Number) next).longValue() > 0) {
                    arrayList2.add(next);
                }
            }
            collection = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                dq.h(((Number) it3.next()).longValue(), collection);
            }
        }
        zal0 a2 = g2v.d().a();
        int intValue = m.intValue();
        Collection collection2 = collection;
        if (str4 == null) {
            str4 = "link";
        }
        zal0.D(a2, context, intValue, collection2, str3, str4, 32);
        return true;
    }

    @SuppressLint({"CheckResult"})
    public static final void V(final Context context, final Uri uri, final LaunchContext launchContext, Bundle bundle, final yp80 yp80Var) {
        new c0(hg1.m(rsg0.y0(new c4r0(uri.toString(), b(bundle)), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.jq80
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                xwk.d().getBrowser().i(context, uri, launchContext, null);
                yp80Var.onSuccess();
            }
        }).subscribe(new c120(new n37(context, uri, launchContext, yp80Var, 3), 14), new be50(new p37(context, uri, launchContext, yp80Var), 6));
    }

    @SuppressLint({"CheckResult"})
    public static final void W(Context context, rsg0 rsg0Var, String str, yp80 yp80Var) {
        new c0(hg1.m(rsg0.y0(rsg0Var, null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new nq80(yp80Var, 0)).subscribe(new tl30(new vkb(str, context, yp80Var, 5), 10), new s440(new tv7(context, str, yp80Var, 3), 8));
    }

    public static final void X(Context context, yp80 yp80Var) {
        g2v.d().a().b(context, GiftData.d, null);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    public static final boolean Y(Context context, String str, String str2, yp80 yp80Var) {
        Integer m = arm0.m(10, str);
        if (m != null) {
            W(context, new kil0(m.intValue(), null), str2, yp80Var);
            return true;
        }
        if (yp80Var == null) {
            return false;
        }
        yp80Var.onError(new IllegalArgumentException("pack id can't be parsed"));
        return false;
    }

    public static final boolean Z(Context context, String str, String str2, String str3, yp80 yp80Var) {
        if (g2v.d().c(str)) {
            if (str3 != null && str3.equals("rules")) {
                return false;
            }
            zal0 a2 = g2v.d().a();
            if (str2 == null) {
                str2 = "link";
            }
            a2.G(context, str2, null);
            return true;
        }
        qil0 qil0Var = new qil0("store.getStockItemByName");
        qil0Var.K("type", "stickers");
        BuildInfo.Client client = BuildInfo.a;
        qil0Var.K("merchant", BuildInfo.v());
        qil0Var.K("name", str);
        qil0Var.C(0, "force_inapp");
        qil0Var.C(!vx2.d.o() ? 1 : 0, "no_inapp");
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, "wishlists_status", "stickers_author_subscription");
        qil0Var.G("fields", arrayList);
        W(context, qil0Var, str2, yp80Var);
        return true;
    }

    public static final ArrayList a() {
        Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
        ArrayList arrayList = new ArrayList(WebApiApplication.a.a());
        arrayList.add(AppFields.IS_IN_CATALOG);
        return arrayList;
    }

    public static final void a0(Context context, Uri uri, String str, yp80 yp80Var) {
        if (epx.f(uri.getLastPathSegment(), "stickers") && !drm0.N("catalog")) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            clearQuery.appendPath("catalog");
            for (String str2 : queryParameterNames) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
            uri = clearQuery.build();
        }
        String uri2 = uri.toString();
        zal0 a2 = g2v.d().a();
        EmptyList emptyList = EmptyList.b;
        if (str == null) {
            str = "link";
        }
        a2.v(context, uri2, str, emptyList);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    public static final JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.getString(str));
            }
        }
        return jSONObject;
    }

    public static void b0(Context context, Uri uri, String str, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            str = null;
        }
        if (!z) {
            int i2 = HelpFragment.a0;
            HelpFragment.b.d(context, str, null, uri.toString());
        } else {
            Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("act", "new");
            int i3 = HelpFragment.a0;
            HelpFragment.b.d(context, str, null, appendQueryParameter.toString());
        }
    }

    public static final void c(String str, BrowserPerfState browserPerfState, Throwable th) {
        hl10 b2;
        String group;
        Long l = null;
        if (brm0.B(str, MBridgeConstans.DYNAMIC_VIEW_WX_APP, false) && (b2 = a.b(str)) != null && (group = b2.a.group()) != null) {
            l = arm0.n(group);
        }
        if (l != null) {
            long longValue = l.longValue();
            boolean a2 = h03.a(th);
            String message = th.getMessage();
            v73 v73Var = new v73(longValue, null, false, str, null, null, null, null);
            if (browserPerfState.F() || browserPerfState.q != null) {
                return;
            }
            browserPerfState.p = false;
            browserPerfState.q = Integer.valueOf(a2 ? 1 : 0);
            browserPerfState.r = message;
            browserPerfState.n = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
            zdx0 zdx0Var = e370.v;
            if (zdx0Var != null) {
                zdx0Var.a(browserPerfState, v73Var);
            }
        }
    }

    public static final void c0(Context context, long j, String str, Integer num, yp80 yp80Var) {
        b6m.e().f(j, context, num, str);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(2:5|(3:9|10|(2:12|13)(2:15|16)))(2:22|(3:24|10|(0)(0))))(2:25|(3:27|10|(0)(0)))|17|18|19|10|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Context context, UserId userId, String str, yp80 yp80Var, boolean z) {
        int i;
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            if (hashCode != 1536) {
                if (hashCode == 47664 && str.equals("000")) {
                    i = -15;
                    oga0 r4 = new cr80().b.r4();
                    if (!fkq0.d(userId)) {
                        r4.j(i, context, userId);
                        return;
                    }
                    new c0(hg1.m(rsg0.y0(yfb.x(zga0.c(new aha0(), userId, Collections.singletonList(Integer.valueOf(i)), null, null, null, 250)), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new kv(yp80Var, 2)).subscribe(new d120(new kq80(context, r4, i), 10), new amt(new lxz(yp80Var, 13), 18));
                    return;
                }
            } else if (str.equals("00")) {
                i = -7;
                oga0 r42 = new cr80().b.r4();
                if (!fkq0.d(userId)) {
                }
            }
        } else if (str.equals("0")) {
            i = -6;
            oga0 r422 = new cr80().b.r4();
            if (!fkq0.d(userId)) {
            }
        }
        bpn0 bpn0Var = cqm0.a;
        i = Integer.parseInt(str);
        oga0 r4222 = new cr80().b.r4();
        if (!fkq0.d(userId)) {
        }
    }

    public static final boolean d0(Context context, UserId userId, VoipCallSource voipCallSource, boolean z, UserId userId2, String str, yp80 yp80Var) {
        if (userId.b <= 0) {
            if (yp80Var != null) {
                yp80Var.U();
            }
            return false;
        }
        g1e0.a aVar = new g1e0.a();
        aVar.b = Source.ACTUAL;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        aVar.a.c(Peer.a.b(userId.b));
        int i = 1;
        aVar.c = true;
        g1e0 g1e0Var = new g1e0(aVar);
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        int i2 = 5;
        new k(hg1.n(a1wVar.E("OpenFunctions", new d1e0(g1e0Var)), context, false, null, 62), new h66(yp80Var, i)).subscribe(new uk40(new wq80(userId, z, voipCallSource, userId2, str, yp80Var), i2), new vk40(new h440(yp80Var, i2), 11));
        return true;
    }

    public static final io.reactivex.rxjava3.disposables.c e(NavigationDelegateActivity navigationDelegateActivity, String str, Uri uri, aq80 aq80Var, izs izsVar) {
        BrowserPerfState browserPerfState = new BrowserPerfState();
        browserPerfState.d = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        po40 po40Var = new po40();
        UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto = UtilsResolveScreenNameWithDataPlatformDto.ANDROID;
        String uri2 = uri.toString();
        ArrayList a2 = a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AppFields) it.next()).h());
        }
        return new c0(hg1.m(rsg0.y0(yfb.x(po40.s(po40Var, str, utilsResolveScreenNameWithDataPlatformDto, null, null, uri2, arrayList, 28)), null, null, 3), navigationDelegateActivity, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new ig4(aq80Var, 4)).subscribe(new hu50(new hoc(aq80Var, navigationDelegateActivity, browserPerfState, izsVar, 1), 5), new wnt(new bwg(aq80Var, str, browserPerfState, 4), 17));
    }

    public static /* synthetic */ boolean e0(Context context, UserId userId, VoipCallSource voipCallSource, boolean z, com.vk.pushes.receivers.b bVar, int i) {
        if ((i & 64) != 0) {
            bVar = null;
        }
        return d0(context, userId, voipCallSource, z, null, "", bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(mch0 mch0Var, Context context, Uri uri, iq20 iq20Var) {
        boolean z;
        String str;
        Long l;
        WebAppPlaceholderInfo webAppPlaceholderInfo;
        LaunchContext launchContext = iq20Var.h;
        ApiApplication apiApplication = mch0Var.f;
        se3 se3Var = mch0Var.g;
        if (apiApplication == null) {
            yp80 yp80Var = iq20Var.g;
            if (yp80Var != null) {
                yp80Var.U();
                return;
            }
            return;
        }
        UserId userId = apiApplication.b;
        if (userId == null || userId.b != InternalVkMiniApps.MASK_CATALOG.h().a) {
            z = false;
        } else {
            z = epx.f(launchContext != null ? launchContext.j : null, "story");
        }
        boolean z2 = z;
        mq20 mq20Var = new mq20(se3Var != null ? se3Var.a : null, (String) null, uri.toString(), launchContext != null ? launchContext.i : null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, (String) null, (String) null);
        iq20 iq20Var2 = new iq20(launchContext != null ? launchContext.h : null, launchContext != null ? launchContext.d : null, launchContext != null ? launchContext.j : null, iq20Var.d, null, null, iq20Var.g, null, 176);
        try {
            str = uri.getQueryParameter("mid");
        } catch (Exception unused) {
            str = null;
        }
        Long n = str != null ? arm0.n(str) : null;
        if (n == null || n.longValue() >= 0) {
            String path = uri.getPath();
            n = path != null ? arm0.n(drm0.h0(path, '_')) : null;
            if (n == null || n.longValue() >= 0) {
                l = null;
                aq20 aq20Var = new aq20(null, l, mch0Var.c, launchContext != null ? launchContext.y : null, launchContext == null ? launchContext.r : null, null, null, z2, null, false, 3553);
                op20 op20Var = new op20(apiApplication, context, mq20Var, iq20Var2, aq20Var);
                webAppPlaceholderInfo = apiApplication.Y;
                yp80 yp80Var2 = iq20Var2.g;
                if (webAppPlaceholderInfo == null) {
                    bis.d(new op20(apiApplication, context, null, null, null, 28)).k(context);
                    if (yp80Var2 != null) {
                        yp80Var2.onSuccess();
                        return;
                    }
                    return;
                }
                if (apiApplication.w && !apiApplication.zb().booleanValue()) {
                    k8t.a(context, apiApplication, SignalingProtocol.KEY_CHAT_DIRECT);
                    if (yp80Var2 != null) {
                        yp80Var2.onSuccess();
                        return;
                    }
                    return;
                }
                if (se3Var == null) {
                    if (yp80Var2 != null) {
                        yp80Var2.U();
                        return;
                    }
                    return;
                }
                apiApplication.I = aq20Var.c;
                mq20Var.a = se3Var.a;
                if (apiApplication.K) {
                    K(op20Var);
                } else if ("mini_app".equals(apiApplication.C) || apiApplication.zb().booleanValue()) {
                    if (iq20Var2.b == null) {
                        iq20Var2.b = "link";
                    }
                    hf3.c(op20Var);
                } else if ("game".equals(apiApplication.C) || "standalone".equals(apiApplication.C)) {
                    new GameUnavailableFragment.a(apiApplication).k(context);
                } else {
                    g(apiApplication.I, apiApplication.c, op20Var);
                }
                if (yp80Var2 != null) {
                    yp80Var2.onSuccess();
                    return;
                }
                return;
            }
        }
        l = n;
        if (launchContext == null) {
        }
        aq20 aq20Var2 = new aq20(null, l, mch0Var.c, launchContext != null ? launchContext.y : null, launchContext == null ? launchContext.r : null, null, null, z2, null, false, 3553);
        op20 op20Var2 = new op20(apiApplication, context, mq20Var, iq20Var2, aq20Var2);
        webAppPlaceholderInfo = apiApplication.Y;
        yp80 yp80Var22 = iq20Var2.g;
        if (webAppPlaceholderInfo == null) {
        }
    }

    public static void f0(VoipCallSource voipCallSource, LinkedHashSet linkedHashSet, UserId userId, boolean z, int i) {
        a201.b().a().d(new khw0.a(new zqk0(null, 0L, "", "", "", false, false, EmptySet.b, true, (i & 4) != 0 ? UserId.d : userId, null, null, null, 0, false, null, null, null, z, true, false, 2619905), voipCallSource, null, "", linkedHashSet));
    }

    public static final void g(UserId userId, String str, op20 op20Var) {
        mq20 mq20Var = op20Var.c;
        String str2 = mq20Var.b;
        if (str2 == null) {
            str2 = mq20Var.a;
        }
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        Uri.Builder buildUpon2 = Uri.parse(mq20Var.a).buildUpon();
        String str3 = mq20Var.d;
        if (str3 == null) {
            str3 = mq20Var.c;
        }
        Uri parse = Uri.parse(str3);
        for (String str4 : parse.getQueryParameterNames()) {
            buildUpon.appendQueryParameter(str4, parse.getQueryParameter(str4));
            buildUpon2.appendQueryParameter(str4, parse.getQueryParameter(str4));
        }
        buildUpon.encodedFragment(parse.getFragment());
        buildUpon2.encodedFragment(parse.getFragment());
        String uri = buildUpon2.build().toString();
        String uri2 = buildUpon.build().toString();
        int i = (int) op20Var.a.b.b;
        Context context = op20Var.b;
        long j = i;
        WebViewFragment.c cVar = new WebViewFragment.c(uri);
        cVar.A();
        cVar.J(uri2);
        cVar.H(str);
        boolean z = j != 0;
        Bundle bundle = cVar.j;
        bundle.putBoolean("app_report", z);
        bundle.putParcelable("ownerID", userId);
        cVar.G(j);
        bundle.putBoolean("is_app_group", true);
        cVar.F(false, false);
        cVar.K();
        cVar.s(j != 0);
        cVar.k(context);
    }

    public static void g0(JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, UserId userId, esa esaVar, int i) {
        zqk0 zqk0Var;
        UserId userId2 = (i & 16) != 0 ? null : userId;
        esa esaVar2 = (i & 32) != 0 ? null : esaVar;
        ImageList imageList = joinData.d;
        String str = joinData.c;
        String str2 = joinData.b;
        if (userId2 != null) {
            String Db = imageList.Db();
            zqk0Var = new zqk0(str2, 0L, str, str, Db == null ? "" : Db, false, false, EmptySet.b, true, userId2, null, null, null, 0, false, esaVar2, null, null, z, z2, false, 2554368);
        } else {
            String Db2 = imageList.Db();
            zqk0Var = new zqk0(str2, 0L, str, str, Db2 == null ? "" : Db2, false, false, EmptySet.b, true, null, null, null, null, 0, false, esaVar2, null, null, z, z2, false, 2555392);
        }
        a201.b().a().d(new khw0.a(zqk0Var, voipCallSource, null, null, null, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Context context, String str, LaunchContext launchContext, gzs<? extends qct> gzsVar) {
        String str2 = launchContext.e;
        String str3 = launchContext.a ? "push" : (str2 == null || !drm0.D(str2, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOTIFICATIONS), true)) ? SignalingProtocol.KEY_CHAT_DIRECT : C4504q2.x;
        String str4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (epx.f(str, "achievements")) {
            k8t.b(context, null);
            return;
        }
        int i = 2;
        if (epx.f(str, "popular")) {
            gzsVar.invoke().c(new GamesHeaderSectionInfo.Section(SectionIdType.Recommended.c, str4, i, objArr7 == true ? 1 : 0), null).k(context);
            return;
        }
        if ((str != null && brm0.B(str, "tags", false)) || (str != null && brm0.B(str, "genres", false))) {
            gzsVar.invoke().c(new GamesHeaderSectionInfo.FriendlyUrl(str, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), str3).k(context);
            return;
        }
        if (str != null && brm0.B(str, "genre", false)) {
            try {
                gzsVar.invoke().c(new GamesHeaderSectionInfo.Genre(Integer.parseInt(str.substring(5)), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), str3).k(context);
            } catch (NumberFormatException unused) {
                L.l("Invalid format of genre id");
            }
        } else {
            if (str == null || !brm0.B(str, "collection", false)) {
                gzsVar.invoke().b().k(context);
                return;
            }
            try {
                gzsVar.invoke().c(new GamesHeaderSectionInfo.Collection(Integer.parseInt(str.substring(10)), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), str3).k(context);
            } catch (NumberFormatException unused2) {
                L.l("Invalid format of collection id");
            }
        }
    }

    public static final Pair h0(Context context, LaunchContext launchContext) {
        String str;
        int i;
        String str2 = launchContext.d;
        str = "";
        if (str2 != null && drm0.D(str2, "feed", false)) {
            return new Pair("feed", "");
        }
        String str3 = launchContext.e;
        if (str3 == null) {
            str3 = "";
        }
        String substring = str2 != null ? str2.substring(str3.length()) : "";
        if (str3.length() == 0) {
            if (str2 != null) {
                int length = str2.length();
                i = 0;
                while (i < length) {
                    char charAt = str2.charAt(i);
                    if (Character.isDigit(charAt) || charAt == '-') {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i != -1) {
                String substring2 = str2 != null ? str2.substring(0, i) : "";
                str = str2 != null ? str2.substring(i) : "";
                str2 = substring2;
            } else if (str2 == null || str2.length() == 0) {
                if (context instanceof LinkRedirActivity) {
                    str2 = "apps_direct_link";
                } else {
                    UiTracker uiTracker = UiTracker.a;
                    str2 = UiTracker.d();
                }
            }
            return new Pair(str2, str);
        }
        str2 = str3;
        str = substring;
        return new Pair(str2, str);
    }

    @SuppressLint({"CheckResult"})
    public static final void i(Context context, String str, yp80 yp80Var) {
        new c0(hg1.m(rsg0.y0(new hq3(str, 6), null, null, 3).U(new p5w(new gzn(24), 8)), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new fa(yp80Var, 8)).subscribe(new jsv(new ut6(23, context, yp80Var), 11), new n240(new hs00(yp80Var, 13), 6));
    }

    public static final void i0(Context context) {
        kyv j = g2v.c().j();
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.DEEPLINK;
        UiTracker uiTracker = UiTracker.a;
        j.c(context, new VoipCallSource(source, UiTracker.c()), EmptySet.b);
    }

    public static final void j(Context context, String str) {
        long l = cqm0.l(str);
        if (l != 0) {
            UserId userId = new UserId(l);
            int i = ArticleAuthorPageFragment.a.m;
            ArticleAuthorPageFragment.a.C0378a.a(userId).k(context);
        } else {
            ArticleAuthorPageFragment.a aVar = new ArticleAuthorPageFragment.a();
            aVar.j.putString(X3.j.D, str);
            aVar.k(context);
        }
    }

    public static final boolean j0(Context context, Uri uri, yp80 yp80Var) {
        if (!o25.a().i().O) {
            return false;
        }
        int i = BugtrackerFragment.a0;
        BugtrackerFragment.b.a(context, uri.toString());
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }

    @SuppressLint({"CheckResult"})
    public static final void k(UserId userId, Context context, yp80 yp80Var, String str) {
        if (userId != null && !o25.a().a(userId)) {
            t6g0 t6g0Var = t6g0.b;
            int i = 11;
            hg1.m(t6g0.c().w(new com.vk.repository.data.api.a(userId, new ept(17), new hyu(i))).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, 0L, false, 62).subscribe(new bqs(new z5b(str, context, yp80Var, 4), 15), new bdz(new h630(yp80Var, i), i));
        } else {
            rwi.d().m().b(context);
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
        }
    }

    public static final void m(Context context, String str, int i, String str2) {
        DisplayAudioBookChaptersFragment.a aVar = new DisplayAudioBookChaptersFragment.a(i);
        aVar.z(str);
        if (str2 == null) {
            str2 = "";
        }
        aVar.y(str2);
        aVar.k(context);
    }

    public static final void n(Context context, String str, int i, String str2) {
        AudioBookPersonCatalogFragment.a aVar = new AudioBookPersonCatalogFragment.a(i);
        aVar.C(str);
        if (str2 == null) {
            str2 = "";
        }
        aVar.B(str2);
        aVar.k(context);
    }

    public static final void o(Context context, String str, int i, int i2) {
        UserId c = o25.a().c();
        AudioBookPersonGenreCatalogFragment.a aVar = new AudioBookPersonGenreCatalogFragment.a(AudioBookPersonGenreCatalogFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", c);
        bundle.putInt("genre_id", i);
        bundle.putInt("person_id", i2);
        if (str.length() > 0) {
            bundle.putString("ref", str);
        }
        aVar.k(context);
    }

    public static final void p(Context context, String str, String str2, yp80 yp80Var) {
        e4b0 e4b0Var = new e4b0(context, Collections.singletonList(new Pair(str, Collections.singletonList(0))));
        e4b0Var.c = true;
        e4b0Var.e = yp80Var;
        e4b0Var.b(MusicPlaybackLaunchContext.Fb(str2));
    }

    public static final void q(Context context) {
        new BirthdaysListFragment.a().k(context);
    }

    public static final void r(Context context, String str) {
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("peer_id");
        Long n = queryParameter != null ? arm0.n(queryParameter) : null;
        if (n != null) {
            t(context, null, n.longValue(), 0, null, parse.getQueryParameter("ref"), null, null, false, null, null, null, null, 8154);
            return;
        }
        String queryParameter2 = parse.getQueryParameter("ref");
        if (queryParameter2 == null) {
            queryParameter2 = "conversations";
        }
        g2v.c().b().S(context, queryParameter2);
    }

    public static void s(Context context, long j, int i, yp80 yp80Var, ChannelEntryPoint channelEntryPoint, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            yp80Var = null;
        }
        ChannelEntryPoint channelEntryPoint2 = (i2 & 16) != 0 ? null : channelEntryPoint;
        if (j == 0) {
            g2v.c().a().g(context);
            if (yp80Var != null) {
                yp80Var.onSuccess();
                return;
            }
            return;
        }
        g2v.c().a().c(context, j, i > 0 ? new ChannelHistoryOpenMode.OpenAtMsgByCnvId(i) : ChannelHistoryOpenMode.OpenAtUnread.b, channelEntryPoint2);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    public static void t(final Context context, Long l, final long j, int i, String str, String str2, String str3, String str4, boolean z, yp80 yp80Var, String str5, String str6, ChatAnalyticsParams chatAnalyticsParams, int i2) {
        Long l2 = (i2 & 2) != 0 ? null : l;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        String str7 = (i2 & 16) != 0 ? "" : str;
        String str8 = (i2 & 32) != 0 ? null : str2;
        String str9 = (i2 & 64) != 0 ? null : str3;
        String str10 = (i2 & 128) != 0 ? null : str4;
        boolean z2 = (i2 & 256) != 0 ? false : z;
        yp80 yp80Var2 = (i2 & 512) != 0 ? null : yp80Var;
        String str11 = (i2 & 1024) != 0 ? null : str5;
        String str12 = (i2 & 2048) != 0 ? null : str6;
        ChatAnalyticsParams chatAnalyticsParams2 = (i2 & 4096) != 0 ? null : chatAnalyticsParams;
        if (j == 0) {
            Intent K = g2v.c().b().K(context);
            fdi.f(context, K);
            if (context instanceof Activity) {
                xa4.L(context).E(K);
            } else {
                context.startActivity(K);
            }
            if (yp80Var2 != null) {
                yp80Var2.onSuccess();
                return;
            }
            return;
        }
        if (!z2) {
            yp80 yp80Var3 = yp80Var2;
            u(context, l2, j, null, i3, str7, str8, str9, str10, yp80Var3, str11, str12, chatAnalyticsParams2);
            if (yp80Var3 != null) {
                yp80Var3.onSuccess();
                return;
            }
            return;
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        final ChatAnalyticsParams chatAnalyticsParams3 = chatAnalyticsParams2;
        final Long l3 = l2;
        final String str13 = str11;
        final String str14 = str8;
        final String str15 = str10;
        final String str16 = str12;
        final int i4 = i3;
        final String str17 = str7;
        final String str18 = str9;
        final yp80 yp80Var4 = yp80Var2;
        io.reactivex.rxjava3.kotlin.c.e(hg1.n(new r(a1wVar.E("openChat", new uqm(Peer.a.b(j), Source.CACHE)), new iu4(new xjm(j, 1), 26)), context, false, null, 62).m(asu0.a.d()), new w620(yp80Var2, 9), new izs() { // from class: xsna.yq80
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long j2 = j;
                com.vk.common.links.c.u(context, l3, j2, ((ipm) obj).a(j2), i4, str17, str14, str18, str15, yp80Var4, str13, str16, chatAnalyticsParams3);
                return s3q0.a;
            }
        });
    }

    public static final void u(Context context, Long l, long j, DialogExt dialogExt, int i, String str, String str2, String str3, String str4, yp80 yp80Var, String str5, String str6, ChatAnalyticsParams chatAnalyticsParams) {
        o0w.x(g2v.c().b(), context, l, j, dialogExt, str, i > 0 ? new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, i) : MsgListOpenAtUnreadMode.b, false, null, null, null, str2 == null ? "" : str2, str3 == null ? "" : str3, str5, str4 == null ? "conversation_link" : str4, "link", null, null, false, str6, context instanceof PushOpenActivity ? g2v.c().b().D() : null, chatAnalyticsParams, new f880(yp80Var, 1), new c230(yp80Var, 10), 209159104);
    }

    public static void v(Context context, Uri uri, yp80 yp80Var, String str, String str2, int i) {
        ChatInviteFragment.T.b(context, uri, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, yp80Var, (i & 32) == 0);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    public static final void w(Context context, String str, String str2, String str3, String str4, yp80 yp80Var) {
        new c0(hg1.m(rsg0.y0(yfb.x(po40.s(new po40(), str, UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new g9b(yp80Var, 5)).subscribe(new sl30(new br80(context, str2, str3, str4, yp80Var), 10), new f2u(new uh40(yp80Var, 5), 11));
    }

    @SuppressLint({"CheckResult"})
    public static final boolean x(long j, long j2, yp80 yp80Var, LaunchContext launchContext) {
        m1 y0;
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        Context b2 = c63.b();
        if (b2 == null && (b2 = e43.a) == null) {
            b2 = null;
        }
        Context context = b2;
        if (launchContext.b) {
            return false;
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        if (a1wVar.r().h.i()) {
            if (j2 != 0) {
                u(context, Long.valueOf(-j), j2, null, 0, "", null, null, null, null, null, null, null);
            } else {
                o0w b3 = g2v.c().b();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                b3.G(context, Peer.a.b(-j));
            }
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
            return true;
        }
        ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            fz2 y = yfb.y(xqu.a.a(null, Collections.singletonList(fkq0.a(new UserId(j))), null), new bqt(15));
            ahn.D(y);
            y0 = rsg0.y0(y, null, null, 3);
        } else {
            y0 = rsg0.y0(new rpu(new UserId(j), new String[0]), null, null, 3);
        }
        hg1.m(y0, context, 0L, false, 62).subscribe(new cp50(new rq80(j, j2, context, yp80Var), 4), new zyu(new w110(yp80Var, 11), 14));
        return true;
    }

    public static final void y(Context context, peq0 peq0Var) {
        String sb;
        String d = peq0Var.d(1);
        if (d == null || d.length() == 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            int i = VKSuperAppBrowserFragment.Y;
            sb2.append(VKSuperAppBrowserFragment.a.a());
            sb2.append(jeq0.c(peq0Var.a));
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("https://");
            int i2 = VKSuperAppBrowserFragment.Y;
            sb3.append(VKSuperAppBrowserFragment.a.a());
            sb3.append("/disable_page?h=");
            sb3.append(d);
            sb = sb3.toString();
        }
        String str = sb;
        long j = InternalVkMiniApps.DISABLE_PAGE.h().a;
        thx a2 = uhx.a();
        if ((10 & 4) != 0) {
            j = -1;
        }
        if (!a2.equals(uhx.a())) {
            j = a2.a;
        }
        new jgr0(str, j, null, false, 28).k(context);
    }

    public static final void z(Context context, NewsfeedRouter newsfeedRouter, String str, String str2, yp80 yp80Var, boolean z) {
        po40 po40Var = new po40();
        UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto = UtilsResolveScreenNameWithDataPlatformDto.ANDROID;
        ArrayList a2 = a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AppFields) it.next()).h());
        }
        new c0(hg1.m(rsg0.y0(yfb.x(po40.s(po40Var, str, utilsResolveScreenNameWithDataPlatformDto, null, null, null, arrayList, 60)), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new bum(yp80Var, 1)).subscribe(new m330(new qq80(context, newsfeedRouter, str2, str, yp80Var, z), 8), new gl30(new xc50(yp80Var, 4), 10));
    }
}
