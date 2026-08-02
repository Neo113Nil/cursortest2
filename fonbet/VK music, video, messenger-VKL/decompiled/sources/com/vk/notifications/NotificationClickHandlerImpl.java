package com.vk.notifications;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ironsource.C4504q2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.notifications.dto.NotificationsCsatAnswerAnswerDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationConfirm;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.metrics.eventtracking.b;
import com.vk.money.MoneyTransfersFragment;
import com.vk.money.MoneyWebViewFragment;
import com.vk.notifications.CommunityGroupedNotificationsFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vk.notifications.common.NotificationCSatRate;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.stereo.api.notifications.di.interactor.VoipStereoSpeakerNotifications;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.af50;
import xsna.asp;
import xsna.b7;
import xsna.b870;
import xsna.bj70;
import xsna.bpn0;
import xsna.bqs;
import xsna.c5g;
import xsna.c970;
import xsna.cqm0;
import xsna.ct;
import xsna.d970;
import xsna.dmf;
import xsna.dq;
import xsna.drm0;
import xsna.dt;
import xsna.du0;
import xsna.dw20;
import xsna.e3m;
import xsna.f970;
import xsna.fkq0;
import xsna.fl30;
import xsna.fo20;
import xsna.fsq;
import xsna.fxc0;
import xsna.g2u0;
import xsna.g2v;
import xsna.g620;
import xsna.gcd0;
import xsna.gqu;
import xsna.gz80;
import xsna.gzs;
import xsna.h7u0;
import xsna.hf3;
import xsna.hg1;
import xsna.hu3;
import xsna.ic1;
import xsna.iq20;
import xsna.is;
import xsna.it8;
import xsna.itg0;
import xsna.j5g;
import xsna.jsv;
import xsna.k970;
import xsna.krv0;
import xsna.l8k;
import xsna.l8w;
import xsna.leq;
import xsna.li70;
import xsna.mau;
import xsna.maz;
import xsna.mq20;
import xsna.n1r;
import xsna.n3t;
import xsna.nea0;
import xsna.np20;
import xsna.nyy;
import xsna.o0r0;
import xsna.o0w;
import xsna.oct0;
import xsna.oey;
import xsna.on7;
import xsna.op20;
import xsna.oz50;
import xsna.p6a;
import xsna.pey;
import xsna.pi70;
import xsna.q860;
import xsna.qgg;
import xsna.rfc0;
import xsna.rj70;
import xsna.rkz;
import xsna.rsg0;
import xsna.sk4;
import xsna.t6g0;
import xsna.tfx;
import xsna.tts;
import xsna.ubq;
import xsna.ver0;
import xsna.vtk0;
import xsna.w11;
import xsna.xqu;
import xsna.xwk;
import xsna.y730;
import xsna.yfb;
import xsna.yqu;
import xsna.ysg0;
import xsna.z7w;
import xsna.zal0;
import xsna.zm00;
import xsna.zrp;

/* compiled from: NotificationClickHandlerImpl.kt */
/* loaded from: classes4.dex */
public final class NotificationClickHandlerImpl implements c970 {
    public final rj70 a;
    public final VoipStereoSpeakerNotifications b;
    public final ProfileFragmentProviderComponent c;
    public final bpn0 d = new bpn0(new sk4(26));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationClickHandlerImpl.kt */
    public static final class JoinType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ JoinType[] $VALUES;
        public static final JoinType ACCEPT;
        public static final JoinType DECLINE;
        public static final JoinType UNSURE;

        static {
            JoinType joinType = new JoinType("ACCEPT", 0);
            ACCEPT = joinType;
            JoinType joinType2 = new JoinType("UNSURE", 1);
            UNSURE = joinType2;
            JoinType joinType3 = new JoinType("DECLINE", 2);
            DECLINE = joinType3;
            JoinType[] joinTypeArr = {joinType, joinType2, joinType3};
            $VALUES = joinTypeArr;
            $ENTRIES = new asp(joinTypeArr);
        }

        public JoinType() {
            throw null;
        }

        public static JoinType valueOf(String str) {
            return (JoinType) Enum.valueOf(JoinType.class, str);
        }

        public static JoinType[] values() {
            return (JoinType[]) $VALUES.clone();
        }
    }

    /* compiled from: NotificationClickHandlerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationCSatRate.values().length];
            try {
                iArr[NotificationCSatRate.Star1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationCSatRate.Star2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationCSatRate.Star3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationCSatRate.Star4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationCSatRate.Star5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NotificationCSatRate.No.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NotificationCSatRate.NotSure.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NotificationCSatRate.Yes.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NotificationClickHandlerImpl(rj70 rj70Var, VoipStereoSpeakerNotifications voipStereoSpeakerNotifications, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = rj70Var;
        this.b = voipStereoSpeakerNotifications;
        this.c = profileFragmentProviderComponent;
    }

    public static final void h(rsg0<Boolean> rsg0Var, Context context, JoinType joinType, NotificationItem notificationItem, Group group, bj70 bj70Var) {
        m1 y0 = rsg0.y0(rsg0Var, null, null, 3);
        y730 y730Var = new y730(new oey(12), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        hg1.m(y0.E(y730Var, lVar, kVar, kVar), context, 0L, false, 62).subscribe(new jsv(new p6a(joinType, notificationItem, group, bj70Var, 1), 9), new n3t(new pey(12), 15));
    }

    public static void i(Context context, NotificationAction notificationAction) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = notificationAction.d;
        if (jSONObject != null) {
            Iterator it = drm0.c0(jSONObject.optString("fids"), new String[]{StringUtils.COMMA}, 0, 6).iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(cqm0.l((String) it.next())));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        zal0 a2 = g2v.d().a();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dq.h(((Number) it2.next()).longValue(), arrayList2);
        }
        zal0.e(a2, context, arrayList2, "notification_feed_birthday", 20);
    }

    public static void j(Context context, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        if (notificationItem == null || bj70Var == null) {
            return;
        }
        k970 k970Var = new k970(context, notificationAction, notificationItem, bj70Var);
        NotificationConfirm notificationConfirm = notificationAction.e;
        if (notificationConfirm == null) {
            k970Var.invoke();
            return;
        }
        String str = notificationConfirm.c;
        String str2 = notificationConfirm.b;
        h7u0.a aVar = new h7u0.a(context);
        if (str2 != null && str2.length() != 0) {
            aVar.h0(str2);
        }
        if (str != null && str.length() != 0) {
            aVar.a.f = str;
        }
        aVar.d0(notificationConfirm.d, new hu3(k970Var, 3));
        aVar.X(notificationConfirm.e, new d970());
        aVar.m();
    }

    public static void k(Context context, View view, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        String str = notificationAction.c;
        if (str != null) {
            NotificationEntity notificationEntity = notificationItem != null ? notificationItem.d : null;
            UiTracker uiTracker = UiTracker.a;
            String d = UiTracker.d();
            if (notificationEntity == null || !MBridgeConstans.DYNAMIC_VIEW_WX_APP.equals(notificationEntity.b)) {
                maz.c(xwk.d().e(), context, str, new LaunchContext(false, false, false, null, d, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108847), null, null, 24);
            } else {
                ApiApplication apiApplication = notificationEntity.j;
                if (apiApplication != null) {
                    hf3.d(new np20((int) apiApplication.b.b, context, new mq20((String) null, (String) null, (String) null, (String) null, 95, str, (String) null), new iq20(apiApplication.B, d, null, null, null, null, null, null, 252), null, 16));
                }
            }
            if (!(view instanceof li70) && notificationItem != null && notificationItem.p && bj70Var != null) {
                notificationItem.v = new NotificationItem.b((Integer) null, (String) null);
                bj70Var.Q(notificationItem);
            }
            if ((view != null ? g2u0.c(view) : null) == null || notificationItem == null || !(bj70Var instanceof pi70)) {
                return;
            }
            ((pi70) bj70Var).getClass();
            throw null;
        }
    }

    public static void n(Context context, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        if (notificationItem == null) {
            return;
        }
        JSONObject jSONObject = notificationAction.d;
        hg1.m(rsg0.y0(new oct0(jSONObject != null ? jSONObject.optString("query") : null), null, null, 3), context, 0L, false, 62).subscribe(new rkz(new it8(bj70Var, notificationAction, notificationItem, 3), 13), new bqs(new af50(context, 5), 12));
    }

    public static void o(Context context, NotificationAction notificationAction) {
        JSONObject jSONObject = notificationAction.d;
        Integer valueOf = jSONObject != null ? Integer.valueOf(jSONObject.optInt("conversation_message_id")) : null;
        Long valueOf2 = jSONObject != null ? Long.valueOf(jSONObject.optLong("peer_id")) : null;
        MsgListOpenMode msgListOpenAtMsgMode = valueOf != null ? new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, valueOf.intValue()) : MsgListOpenAtUnreadMode.b;
        if (valueOf2 != null && valueOf2.longValue() != 0) {
            o0w.x(g2v.c().b(), context, null, valueOf2.longValue(), null, null, msgListOpenAtMsgMode, false, null, null, null, null, null, null, C4504q2.x, "vkapp_notifications", null, null, false, null, null, null, null, null, 1073717210);
            return;
        }
        b.a.q(new IllegalArgumentException("action=" + notificationAction.b + ", context=" + jSONObject + ", url=" + notificationAction.c));
    }

    public static void p(Context context, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        JSONObject jSONObject;
        if (notificationItem == null || bj70Var == null || (jSONObject = notificationAction.d) == null) {
            return;
        }
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        int optInt = jSONObject.optInt("photo_id");
        int optInt2 = jSONObject.optInt("tag_id");
        hg1.m(rsg0.y0("tag_photo_accept".equals(notificationAction.b) ? new nea0(userId, optInt, optInt2) : new is(userId, optInt, optInt2), null, null, 3), context, 0L, false, 62).subscribe(new tts(new on7(notificationAction, notificationItem, bj70Var, 5), 17), new l8w(new leq(22), 11));
    }

    public static void q(Context context, JSONObject jSONObject) {
        ArrayList arrayList;
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        String optString = jSONObject.optString("text");
        JSONArray optJSONArray = jSONObject.optJSONArray("attachments");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(com.vkontakte.android.attachments.a.c(optJSONObject, null, null));
                }
            }
        } else {
            arrayList = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("geo");
        GeoAttachment d = optJSONObject2 != null ? com.vkontakte.android.attachments.a.d(optJSONObject2) : null;
        if (d != null && arrayList != null) {
            arrayList.add(d);
        }
        if (userId.b >= 0) {
            int i2 = rfc0.a;
            q860 q860Var = new q860();
            q860Var.n(userId, optString, arrayList, null);
            q860Var.p(-1, context);
            return;
        }
        t6g0 t6g0Var = t6g0.b;
        c subscribe = hg1.m(t6g0.b().N0(fkq0.a(userId)), context, 0L, false, 62).subscribe(new ubq(new f970(userId, optString, arrayList, context), 20), new fl30(new qgg(userId, optString, arrayList, context, 2), 8));
        Activity h = e3m.h(context);
        if (h != null) {
            itg0.a(h, subscribe);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    public static void r(Context context, NotificationAction notificationAction) {
        ?? r2;
        String str;
        String optString;
        JSONObject jSONObject = notificationAction.d;
        if (jSONObject == null || (optString = jSONObject.optString("fids")) == null) {
            r2 = EmptyList.b;
        } else {
            List c0 = drm0.c0(optString, new String[]{StringUtils.COMMA}, 0, 6);
            r2 = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                Long k = cqm0.k((String) it.next());
                if (k != null) {
                    r2.add(k);
                }
            }
        }
        if (r2.isEmpty()) {
            return;
        }
        if (r2.size() == 1) {
            o0w b = g2v.c().b();
            long longValue = ((Number) j5g.Y(r2)).longValue();
            JSONObject jSONObject2 = notificationAction.d;
            if (jSONObject2 == null || (str = jSONObject2.optString("entry_point")) == null) {
                str = C4504q2.x;
            }
            o0w.x(b, context, null, longValue, null, null, null, false, null, null, null, null, null, null, str, null, null, null, false, null, null, null, null, null, 1073733626);
            return;
        }
        o0r0 e = xwk.e();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((Iterable) r2).iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b2 = Peer.a.b(longValue2);
            Peer.Member member = b2 instanceof Peer.Member ? (Peer.Member) b2 : null;
            if (member != null) {
                arrayList.add(member);
            }
        }
        e.j(context, arrayList, context.getString(R.string.write_a_message), new b7(14, context, notificationAction));
    }

    public static void s(Context context, NotificationItem notificationItem, bj70 bj70Var) {
        Intent intent;
        if (gz80.a(26)) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        try {
            context.startActivity(intent);
            if (notificationItem == null || !notificationItem.p || bj70Var == null) {
                return;
            }
            notificationItem.v = new NotificationItem.b((Integer) null, (String) null);
            bj70Var.Q(notificationItem);
        } catch (ActivityNotFoundException unused) {
            h7u0.a aVar = new h7u0.a(context);
            aVar.g0(R.string.app_name);
            aVar.U(R.string.notifications_system_settings_fallback_message);
            aVar.c = true;
            aVar.c0(R.string.ok, null);
            aVar.m();
        }
    }

    public static void u(Context context, View view, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        oz50 aVar;
        JSONObject jSONObject = notificationAction.d;
        if (jSONObject == null || jSONObject.optString("query") == null) {
            return;
        }
        int i = GroupedNotificationsFragment.f0;
        JSONObject jSONObject2 = notificationAction.d;
        if (jSONObject2.optInt("group_id", 0) != 0) {
            aVar = new CommunityGroupedNotificationsFragment.a(CommunityGroupedNotificationsFragment.class, null, null);
            String string = jSONObject2.getString("query");
            Bundle bundle = aVar.j;
            bundle.putString("query", string);
            bundle.putString("title", jSONObject2.optString("header"));
            bundle.putLong("id", jSONObject2.optLong("group_id", 0L));
        } else {
            aVar = new GroupedNotificationsFragment.a(GroupedNotificationsFragment.class, null, null);
            String string2 = jSONObject2.getString("query");
            Bundle bundle2 = aVar.j;
            bundle2.putString("query", string2);
            bundle2.putString("title", jSONObject2.optString("header"));
        }
        aVar.k(context);
        if ((view != null ? g2u0.c(view) : null) == null || notificationItem == null || !(bj70Var instanceof pi70)) {
            return;
        }
        ((pi70) bj70Var).getClass();
        throw null;
    }

    @Override // xsna.c970
    public final void a() {
        yfb.x(new tfx("notifications.csatHide", new io.reactivex.rxjava3.subjects.c(29), new w11(26))).p();
    }

    @Override // xsna.c970
    public final void b(Context context, NotificationEntity notificationEntity, NotificationItem notificationItem, View view) {
        ApiApplication apiApplication;
        NotificationAction notificationAction;
        if (notificationEntity == null) {
            return;
        }
        String str = notificationEntity.b;
        NotificationAction notificationAction2 = notificationEntity.d;
        if (notificationAction2 != null) {
            c(context, view, notificationAction2, null, null);
            return;
        }
        boolean Ab = notificationEntity.Ab();
        ProfileFragmentProviderComponent profileFragmentProviderComponent = this.c;
        String str2 = null;
        if (Ab) {
            UserProfile userProfile = notificationEntity.e;
            if (userProfile != null) {
                UserId userId = userProfile.c;
                ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                profileFragmentProviderComponent.ye(userId, null).k(context);
                return;
            }
            return;
        }
        if (notificationEntity.zb()) {
            Group group = notificationEntity.f;
            if (group != null) {
                UserId userId2 = group.c;
                if (!fkq0.b(userId2)) {
                    userId2 = null;
                }
                if (userId2 == null) {
                    userId2 = fkq0.e(group.c);
                }
                ProfileFragmentProviderComponent.Companion companion2 = ProfileFragmentProviderComponent.Companion;
                profileFragmentProviderComponent.ye(userId2, null).k(context);
                return;
            }
            return;
        }
        if ("photo".equals(str)) {
            if (notificationItem != null && (notificationAction = notificationItem.l) != null) {
                str2 = notificationAction.c;
            }
            String str3 = str2;
            if (str3 != null && str3.length() > 0) {
                maz.c(xwk.d().e(), context, str3, LaunchContext.A, null, null, 24);
                return;
            }
            Photo photo = notificationEntity.g;
            if (photo != null) {
                vtk0.c().b(photo).k(context);
                return;
            }
            return;
        }
        if (!"video".equals(str)) {
            if (!MBridgeConstans.DYNAMIC_VIEW_WX_APP.equals(str) || (apiApplication = notificationEntity.j) == null) {
                return;
            }
            hf3.c(new op20(apiApplication, context, null, new iq20(null, "feedback", null, null, null, null, null, null, 253), null, 20));
            return;
        }
        VideoFile videoFile = notificationEntity.h;
        if (videoFile != null) {
            if (g620.f().d(videoFile)) {
                fxc0.B().Y().k(context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            } else {
                vtk0.c().a(videoFile).k(context);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.c970
    public final void c(Context context, View view, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var) {
        ArrayList arrayList;
        dw20.a i;
        if (notificationAction != null) {
            try {
                JSONObject jSONObject = notificationAction.d;
                String str = notificationAction.b;
                if (str != null) {
                    try {
                        switch (str.hashCode()) {
                            case -1756351616:
                                if (str.equals("friend_add") && view != null && notificationItem != null && bj70Var != null) {
                                    xwk.e().T().j(view, new UserId(jSONObject != null ? jSONObject.optLong("user_id") : 0L), false, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOTIFICATIONS), null, (r22 & 32) != 0 ? false : false, (r22 & 128) != 0 ? null : new du0(19, notificationItem, bj70Var), (r22 & 256) != 0 ? null : null, (r22 & 512) != 0 ? null : null, null);
                                    break;
                                }
                                break;
                            case -1574710030:
                                if (!str.equals("voiceroom_invite_speaker_decline")) {
                                    break;
                                }
                                t(notificationAction);
                                break;
                            case -1349088399:
                                if (!str.equals("custom")) {
                                    break;
                                } else {
                                    k(context, view, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case -1345785794:
                                if (!str.equals("invite_group_accept")) {
                                    break;
                                } else {
                                    l(context, view, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case -1286222974:
                                if (!str.equals("message_open")) {
                                    break;
                                } else {
                                    o(context, notificationAction);
                                    break;
                                }
                            case -624136624:
                                if (str.equals("send_message") && jSONObject != null) {
                                    r(context, notificationAction);
                                    break;
                                }
                                break;
                            case -603325429:
                                if (!str.equals("groups_invite_group_decline")) {
                                    break;
                                } else {
                                    m(context, notificationAction.d, false, notificationItem, bj70Var);
                                    break;
                                }
                            case -584613837:
                                if (!str.equals("system_settings")) {
                                    break;
                                } else {
                                    s(context, notificationItem, bj70Var);
                                    break;
                                }
                            case -496981471:
                                if (str.equals("payment_send") && jSONObject != null) {
                                    String optString = jSONObject.optString("init_url");
                                    int i2 = MoneyWebViewFragment.q0;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url_to_load", optString);
                                    bundle.putInt("request_code", 1002);
                                    bundle.putInt("transfer_id", 0);
                                    new oz50(MoneyWebViewFragment.class, null, bundle).k(context);
                                    break;
                                }
                                break;
                            case -370396668:
                                if (!str.equals("tag_photo_decline")) {
                                    break;
                                } else {
                                    p(context, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case -344682880:
                                if (!str.equals("invite_group_decline")) {
                                    break;
                                } else {
                                    l(context, view, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case -288415866:
                                if (!str.equals("ungroup")) {
                                    break;
                                } else {
                                    u(context, view, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case -245750445:
                                if (!str.equals("groups_invite_group_accept")) {
                                    break;
                                } else {
                                    m(context, notificationAction.d, true, notificationItem, bj70Var);
                                    break;
                                }
                            case -238236614:
                                if (!str.equals("tag_photo_accept")) {
                                    break;
                                } else {
                                    p(context, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case -161411355:
                                if (str.equals("post_suggest") && jSONObject != null) {
                                    q(context, jSONObject);
                                    break;
                                }
                                break;
                            case -138538100:
                                if (!str.equals("voiceroom_invite_speaker_accept")) {
                                    break;
                                }
                                t(notificationAction);
                                break;
                            case 26331015:
                                if (!str.equals("send_gift")) {
                                    break;
                                } else {
                                    i(context, notificationAction);
                                    break;
                                }
                            case 853364720:
                                if (!str.equals("hide_item")) {
                                    break;
                                } else {
                                    n(context, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case 966916451:
                                if (!str.equals(CallEventualStatName.API_CALL)) {
                                    break;
                                } else {
                                    j(context, notificationAction, notificationItem, bj70Var);
                                    break;
                                }
                            case 1285173718:
                                if (!str.equals("voiceroom_invite_speaker_change_decision_and_decline")) {
                                    break;
                                }
                                t(notificationAction);
                                break;
                            case 1382682413:
                                if (!str.equals("payments")) {
                                    break;
                                } else {
                                    MoneyTransfersFragment.d dVar = new MoneyTransfersFragment.d();
                                    dVar.C();
                                    dVar.k(context);
                                    break;
                                }
                            case 1475610601:
                                if (!str.equals("authorize")) {
                                    break;
                                } else {
                                    com.vk.common.links.b.j(context, notificationAction.c);
                                    break;
                                }
                            case 1616284200:
                                if (!str.equals("voiceroom_invite_speaker_change_decision_and_accept")) {
                                    break;
                                }
                                t(notificationAction);
                                break;
                            case 1850424854:
                                if (str.equals("action_sheet") && (arrayList = notificationAction.g) != null) {
                                    b870 b870Var = new b870(bj70Var, notificationItem, this);
                                    b870Var.setItems(arrayList);
                                    i = new dw20.b(context, null).i(b870Var, (r3 & 2) == 0, false);
                                    b870Var.h = i.I0(null);
                                    if (view instanceof ButtonsSwipeView) {
                                        ((ButtonsSwipeView) view).b();
                                        break;
                                    }
                                }
                                break;
                            case 2012050809:
                                if (!str.equals("group_notify_enable")) {
                                    break;
                                } else {
                                    String str2 = "";
                                    if (jSONObject != null) {
                                        long optLong = jSONObject.optLong("group_id");
                                        String optString2 = jSONObject.optString("header", "");
                                        if (optString2 != null) {
                                            str2 = optString2;
                                        }
                                        new CommunityNotificationSettingsFragment.a(optLong, str2).k(context);
                                        break;
                                    }
                                }
                                break;
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // xsna.c970
    public final void e() {
        ysg0.b.a(new gcd0(18));
    }

    @Override // xsna.c970
    public final void f(NotificationCSatRate notificationCSatRate) {
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto;
        switch (a.$EnumSwitchMapping$0[notificationCSatRate.ordinal()]) {
            case 1:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.TYPE_1;
                break;
            case 2:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.TYPE_2;
                break;
            case 3:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.TYPE_3;
                break;
            case 4:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.TYPE_4;
                break;
            case 5:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.TYPE_5;
                break;
            case 6:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.NO;
                break;
            case 7:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.NOT_SURE;
                break;
            case 8:
                notificationsCsatAnswerAnswerDto = NotificationsCsatAnswerAnswerDto.YES;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        tfx tfxVar = new tfx("notifications.csatAnswer", new ct(19), new dt(21));
        tfx.o(tfxVar, "answer", notificationsCsatAnswerAnswerDto.i(), 0, 0, 12);
        yfb.x(tfxVar).p();
    }

    public final void g(final Context context, final Group group, final NotificationItem notificationItem, final JoinType joinType, final bj70 bj70Var) {
        if (joinType == JoinType.DECLINE) {
            xwk.e().h0().b(context, group, new gzs() { // from class: xsna.i970
                @Override // xsna.gzs
                public final Object invoke() {
                    Group group2 = group;
                    NotificationClickHandlerImpl.h(new hqu(group2.c, (String) null, (String) null, (AdminLeaveAction) null, 30), context, joinType, notificationItem, group2, bj70Var);
                    return s3q0.a;
                }
            });
            return;
        }
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            h(yfb.y(yqu.a.c((xqu) this.d.getValue(), fkq0.a(group.c), zm00.g(joinType == JoinType.UNSURE), null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED), new fo20(7)), context, joinType, notificationItem, group, bj70Var);
        } else {
            h(new gqu(group.c, joinType == JoinType.UNSURE, r3, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), context, joinType, notificationItem, group, bj70Var);
        }
    }

    public final void l(final Context context, View view, NotificationAction notificationAction, final NotificationItem notificationItem, final bj70 bj70Var) {
        if (notificationItem == null || bj70Var == null || view == null) {
            return;
        }
        final Group group = notificationAction.f;
        String str = notificationAction.b;
        if (group != null) {
            if (group.p != 1 || !"invite_group_accept".equals(str)) {
                g(context, group, notificationItem, "invite_group_accept".equals(str) ? JoinType.ACCEPT : JoinType.DECLINE, bj70Var);
                return;
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new gzs() { // from class: xsna.e970
                @Override // xsna.gzs
                public final Object invoke() {
                    NotificationClickHandlerImpl.this.g(context, group, notificationItem, NotificationClickHandlerImpl.JoinType.ACCEPT, bj70Var);
                    return s3q0.a;
                }
            }, 30);
            VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new gzs() { // from class: xsna.h970
                @Override // xsna.gzs
                public final Object invoke() {
                    NotificationClickHandlerImpl.this.g(context, group, notificationItem, NotificationClickHandlerImpl.JoinType.UNSURE, bj70Var);
                    return s3q0.a;
                }
            }, 30);
            VkContextMenu.c.c(bVar, R.string.event_inv_decline, null, false, null, new gzs() { // from class: xsna.j970
                @Override // xsna.gzs
                public final Object invoke() {
                    NotificationClickHandlerImpl.this.g(context, group, notificationItem, NotificationClickHandlerImpl.JoinType.DECLINE, bj70Var);
                    return s3q0.a;
                }
            }, 30);
            bVar.j();
        }
    }

    public final void m(Context context, JSONObject jSONObject, boolean z, NotificationItem notificationItem, bj70 bj70Var) {
        UserId userId = new UserId(jSONObject != null ? jSONObject.optLong("group_id", 0L) : 0L);
        UserId userId2 = new UserId(jSONObject != null ? jSONObject.optLong("user_id", 0L) : 0L);
        if (userId.b == 0 || userId2.b == 0 || notificationItem == null) {
            return;
        }
        bpn0 bpn0Var = this.d;
        ver0.c(context, hg1.m(rsg0.y0(yfb.x(z ? ((xqu) bpn0Var.getValue()).x(userId, userId2) : ((xqu) bpn0Var.getValue()).k(userId, userId2)), null, null, 3), context, 0L, false, 62).U(new mau(new z7w(11), 9)).subscribe(new fsq(new dmf(z, notificationItem, bj70Var, this), 12), new n1r(new l8k(29), 11)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void t(NotificationAction notificationAction) {
        String str;
        JSONObject jSONObject = notificationAction.d;
        if (jSONObject != null && jSONObject.optString("room_id") != null && (str = notificationAction.b) != null) {
            switch (str.hashCode()) {
                case -1574710030:
                    if (str.equals("voiceroom_invite_speaker_decline")) {
                        VoipStereoSpeakerNotifications.NotificationAction notificationAction2 = VoipStereoSpeakerNotifications.NotificationAction.ACCEPT;
                        new nyy(0, this, NotificationClickHandlerImpl.class, "voiceroomActionDone", "voiceroomActionDone()V", 0, 2);
                        new ic1(1, this, NotificationClickHandlerImpl.class, "voiceroomActionError", "voiceroomActionError(Ljava/lang/Throwable;)V", 0, 6);
                        this.b.getClass();
                        return;
                    }
                    break;
                case -138538100:
                    if (str.equals("voiceroom_invite_speaker_accept")) {
                        VoipStereoSpeakerNotifications.NotificationAction notificationAction3 = VoipStereoSpeakerNotifications.NotificationAction.ACCEPT;
                        new nyy(0, this, NotificationClickHandlerImpl.class, "voiceroomActionDone", "voiceroomActionDone()V", 0, 2);
                        new ic1(1, this, NotificationClickHandlerImpl.class, "voiceroomActionError", "voiceroomActionError(Ljava/lang/Throwable;)V", 0, 6);
                        this.b.getClass();
                        return;
                    }
                    break;
                case 1285173718:
                    if (str.equals("voiceroom_invite_speaker_change_decision_and_decline")) {
                        VoipStereoSpeakerNotifications.NotificationAction notificationAction4 = VoipStereoSpeakerNotifications.NotificationAction.ACCEPT;
                        new nyy(0, this, NotificationClickHandlerImpl.class, "voiceroomActionDone", "voiceroomActionDone()V", 0, 2);
                        new ic1(1, this, NotificationClickHandlerImpl.class, "voiceroomActionError", "voiceroomActionError(Ljava/lang/Throwable;)V", 0, 6);
                        this.b.getClass();
                        return;
                    }
                    break;
                case 1616284200:
                    if (str.equals("voiceroom_invite_speaker_change_decision_and_accept")) {
                        VoipStereoSpeakerNotifications.NotificationAction notificationAction5 = VoipStereoSpeakerNotifications.NotificationAction.ACCEPT;
                        new nyy(0, this, NotificationClickHandlerImpl.class, "voiceroomActionDone", "voiceroomActionDone()V", 0, 2);
                        new ic1(1, this, NotificationClickHandlerImpl.class, "voiceroomActionError", "voiceroomActionError(Ljava/lang/Throwable;)V", 0, 6);
                        this.b.getClass();
                        return;
                    }
                    break;
            }
        }
    }
}
