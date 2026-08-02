package com.vk.pushes.receivers;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import com.vk.api.generated.video.dto.VideoSetNotificationsStatusStatusDto;
import com.vk.api.likes.LikesGetList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.processor.d;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.receivers.c;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.b0;
import defpackage.s;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.a1w;
import xsna.afs;
import xsna.asu0;
import xsna.b1a;
import xsna.bdz;
import xsna.ble;
import xsna.bpn0;
import xsna.bv1;
import xsna.ca70;
import xsna.cvk;
import xsna.d260;
import xsna.dam;
import xsna.drm0;
import xsna.dz2;
import xsna.e43;
import xsna.eaa;
import xsna.eiy;
import xsna.eos;
import xsna.fkq0;
import xsna.fo6;
import xsna.fpf0;
import xsna.g2v;
import xsna.g600;
import xsna.gl30;
import xsna.gqu;
import xsna.gz80;
import xsna.gzs;
import xsna.hqu;
import xsna.hr6;
import xsna.il7;
import xsna.ir;
import xsna.is;
import xsna.j03;
import xsna.j3z;
import xsna.jp5;
import xsna.jr;
import xsna.jsv;
import xsna.k1b;
import xsna.k22;
import xsna.k7m;
import xsna.kp5;
import xsna.l5m;
import xsna.le50;
import xsna.ljs;
import xsna.lkz;
import xsna.lw30;
import xsna.lx60;
import xsna.m1r;
import xsna.m330;
import xsna.m7m;
import xsna.m960;
import xsna.maz;
import xsna.n1r;
import xsna.n3t;
import xsna.n9;
import xsna.nea0;
import xsna.nm1;
import xsna.nyq;
import xsna.o060;
import xsna.o25;
import xsna.o260;
import xsna.o3y;
import xsna.o770;
import xsna.oo20;
import xsna.pd40;
import xsna.pmu;
import xsna.pn00;
import xsna.pv30;
import xsna.pz30;
import xsna.q1w;
import xsna.q440;
import xsna.q770;
import xsna.qa20;
import xsna.qg1;
import xsna.qgm;
import xsna.qns0;
import xsna.qt5;
import xsna.qv30;
import xsna.r6z;
import xsna.r770;
import xsna.ra20;
import xsna.rkz;
import xsna.rm0;
import xsna.rsg0;
import xsna.sh6;
import xsna.skz;
import xsna.sl30;
import xsna.sm4;
import xsna.t520;
import xsna.tfx;
import xsna.tl30;
import xsna.tn0;
import xsna.u6;
import xsna.uft0;
import xsna.ui70;
import xsna.uum;
import xsna.v1b;
import xsna.wd3;
import xsna.wmi0;
import xsna.wmz;
import xsna.x2q0;
import xsna.x8m;
import xsna.xqu;
import xsna.xuo0;
import xsna.xwk;
import xsna.xy2;
import xsna.ya;
import xsna.yfb;
import xsna.yjs;
import xsna.yl0;
import xsna.ysd;
import xsna.yv30;
import xsna.z4g;
import xsna.z5a;
import xsna.zs;
import xsna.zyu;

/* compiled from: NotificationActionsProcessor.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes5.dex */
public final class c {
    public static final a b = new a();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public final Lazy<VideoApiHelperRepository> a;

    /* compiled from: NotificationActionsProcessor.kt */
    public static final class a {
        public static final void a(Context context, Intent intent) {
            a aVar = c.b;
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            if (context2.getApplicationInfo().targetSdkVersion < 31) {
                ca70 ca70Var = ca70.a;
                ca70.c(context);
            }
            f(context, intent, false);
        }

        public static final void b(Context context, Intent intent, boolean z) {
            a aVar = c.b;
            zs zsVar = new zs(intent.getStringExtra("hash"), z);
            h(zsVar, intent);
            rsg0.y0(zsVar, null, null, 3).subscribe(new skz(new u6(23, context, intent), 10), new bdz(new kp5(18, context, intent), 9));
        }

        public static void c(Context context, Intent intent) {
            ca70 ca70Var = ca70.a;
            String stringExtra = intent.getStringExtra("notification_tag_id_key");
            if (stringExtra == null) {
                stringExtra = "";
            }
            ca70.a(context, stringExtra, 1);
        }

        public static void d(Context context, Intent intent, boolean z, xy2 xy2Var, gzs gzsVar) {
            if (!z) {
                g(context, intent.getStringExtra("url"), intent);
                return;
            }
            dz2 x = yfb.x(xy2Var);
            h(x, intent);
            rsg0.y0(x, null, null, 3).subscribe(new zyu(new ysd(gzsVar, context, intent, 8), 13), new o060(new r770(0, context, intent), 1));
        }

        public static void e(Context context, Intent intent, Throwable th) {
            String string;
            String valueOf;
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            if (context2.getApplicationInfo().targetSdkVersion < 31) {
                ca70 ca70Var = ca70.a;
                ca70.c(context);
            }
            if (th instanceof VKApiExecutionException) {
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                string = j03.d(context, vKApiExecutionException);
                valueOf = vKApiExecutionException.s() + ": " + th.getMessage();
            } else {
                string = context.getString(R.string.error);
                valueOf = String.valueOf(th.getMessage());
            }
            i(intent, valueOf);
            cvk.w(string, false);
            L.i(th);
        }

        public static void f(Context context, Intent intent, boolean z) {
            if (z || (intent.hasExtra("stat_key") && intent.hasExtra("track_interaction_key"))) {
                j(intent);
            }
            c(context, intent);
        }

        public static void g(Context context, String str, Intent intent) {
            if (str != null && str.length() != 0) {
                maz.c(xwk.d().e(), context, str, new LaunchContext(true, false, false, null, "push_notifications", null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108846), null, null, 24);
            }
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            if (context2.getApplicationInfo().targetSdkVersion < 31) {
                ca70 ca70Var = ca70.a;
                ca70.c(context);
            }
            f(context, intent, false);
        }

        public static void h(rsg0 rsg0Var, Intent intent) {
            String s;
            UserId userId = (UserId) intent.getParcelableExtra("target_user_id");
            if (userId == null || userId.equals(o25.a().c()) || (s = o25.a().s(userId)) == null) {
                return;
            }
            rsg0Var.B(s, null);
        }

        public static void i(Intent intent, String str) {
            if (intent.hasExtra("stat_key")) {
                ui70.L(z4g.d(), intent.getAction(), intent.getStringExtra("push_type_key"), intent.getStringExtra("stat_key"), str, String.valueOf(o25.a().c().b), intent.getStringExtra("subtype"), 64);
            }
        }

        public static void j(Intent intent) {
            int hashCode;
            String stringExtra = intent.getStringExtra("stat_key");
            if (stringExtra == null || !intent.hasExtra("stat_key") || !intent.hasExtra("track_interaction_key")) {
                z4g.d().n(false);
                return;
            }
            String action = intent.getAction();
            sm4 sm4Var = new sm4(stringExtra, (action == null || ((hashCode = action.hashCode()) == -1283430010 ? !action.equals("msg_send") : !(hashCode == -912007698 ? action.equals("api_call_input") : hashCode == 795589992 && action.equals("comment_send")))) ? "button_click" : "input_text");
            h(sm4Var, intent);
            rsg0.y0(sm4Var, null, null, 3).subscribe(new sh6(new nyq(17), 28), new m330(new x8m(26), 6));
        }
    }

    public c() {
        this((bpn0) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    public final void a(final Context context, final Intent intent) {
        Intent intent2;
        String str;
        String string;
        UserId userId;
        long j;
        Parcelable parcelable;
        Object parcelableExtra;
        String str2;
        String str3;
        ble bleVar;
        String str4;
        long j2;
        String str5;
        UserId userId2;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (o25.a().b()) {
            String action = intent.getAction();
            o260 o260Var = d260.a;
            o260 o260Var2 = d260.a;
            if (o260Var2 == null) {
                o260Var2 = null;
            }
            o260Var2.getClass();
            AtomicLong atomicLong = x2q0.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = x2q0.c;
            long j4 = elapsedRealtime + j3;
            long j5 = atomicLong.get();
            if (j4 < j5) {
                j4 = j5;
            }
            atomicLong.set(j4);
            AtomicLong atomicLong2 = x2q0.e;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
            long j6 = atomicLong2.get();
            if (elapsedRealtime2 < j6) {
                elapsedRealtime2 = j6;
            }
            atomicLong2.set(elapsedRealtime2);
            a aVar = b;
            a.i(intent, null);
            if (action != null) {
                int i = 24;
                int i2 = 1;
                switch (action.hashCode()) {
                    case -2092612298:
                        if (action.equals("msg_request_accept")) {
                            long longExtra = intent.getLongExtra("peer_id", 0L);
                            if (longExtra != 0) {
                                Serializer.c<Peer> cVar = Peer.CREATOR;
                                yv30 yv30Var = new yv30(Peer.a.b(longExtra), MsgRequestStatus.ACCEPTED, false);
                                a1w a1wVar = q1w.a;
                                if (a1wVar == null) {
                                    a1wVar = null;
                                }
                                a1wVar.D(aVar, yv30Var);
                                ca70 ca70Var = ca70.a;
                                ca70.a(context, "msg_request", Long.valueOf(longExtra));
                                a.j(intent);
                                return;
                            }
                            return;
                        }
                        return;
                    case -2085622897:
                        intent2 = intent;
                        str = "video_group_id";
                        if (!action.equals("action_video_watch_later")) {
                            return;
                        }
                        break;
                    case -1991355703:
                        if (action.equals("accept_money")) {
                            a.a(context, intent);
                            return;
                        }
                        return;
                    case -1617223153:
                        if (action.equals("msg_mark_as_read")) {
                            long longExtra2 = intent.getLongExtra("peer_id", 0L);
                            int intExtra = intent.getIntExtra("msg_cnv_id", 0);
                            long longExtra3 = intent.getLongExtra("owner_id", 0L);
                            a1w a1wVar2 = q1w.a;
                            if (a1wVar2 == null) {
                                a1wVar2 = null;
                            }
                            Serializer.c<Peer> cVar2 = Peer.CREATOR;
                            a1wVar2.D(aVar, new qgm(Peer.a.b(longExtra2), intExtra, (Object) null, 12));
                            wmi0.a.a(qa20.b.a.c(longExtra2, Long.valueOf(longExtra3)), new MessageNotificationInfo(null, null, null, null, null));
                            g2v.c().h().getClass();
                            a.f(context, intent, !((ImSynchronizationHelpersComponent) ((k7m) m7m.f(r2)).a(fpf0.a(ImSynchronizationHelpersComponent.class))).x3().b());
                            if (gz80.a(24)) {
                                ra20 ra20Var = ra20.a;
                                Long valueOf = Long.valueOf(longExtra3);
                                ra20Var.getClass();
                                ra20.b(context, valueOf);
                                return;
                            }
                            return;
                        }
                        return;
                    case -1603861555:
                        if (action.equals("msg_request_reject")) {
                            long longExtra4 = intent.getLongExtra("peer_id", 0L);
                            if (longExtra4 != 0) {
                                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                                yv30 yv30Var2 = new yv30(Peer.a.b(longExtra4), MsgRequestStatus.REJECTED, false);
                                a1w a1wVar3 = q1w.a;
                                if (a1wVar3 == null) {
                                    a1wVar3 = null;
                                }
                                a1wVar3.D(aVar, yv30Var2);
                                ca70 ca70Var2 = ca70.a;
                                ca70.a(context, "msg_request", Long.valueOf(longExtra4));
                                a.j(intent);
                                return;
                            }
                            return;
                        }
                        return;
                    case -1349088399:
                        if (action.equals("custom")) {
                            a.a(context, intent);
                            return;
                        }
                        return;
                    case -1283430010:
                        if (action.equals("msg_send")) {
                            final long longExtra5 = intent.getLongExtra("peer_id", 0L);
                            final long longExtra6 = intent.getLongExtra("owner_id", 0L);
                            int intExtra2 = intent.getIntExtra("msg_cnv_id", 0);
                            String stringExtra = intent.getStringExtra("entry_point");
                            if (stringExtra == null) {
                                stringExtra = "message_push_reply";
                            }
                            String str6 = stringExtra;
                            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                            String str7 = resultsFromIntent != null ? resultsFromIntent.get("message") : 0;
                            String spannableString = str7 != 0 ? str7 instanceof String ? str7 : str7 instanceof SpannableString ? ((SpannableString) str7).toString() : str7.toString() : "";
                            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                            if (resultsFromIntent != null) {
                                if (!drm0.N(spannableString)) {
                                    Serializer.c<Peer> cVar4 = Peer.CREATOR;
                                    pz30 pz30Var = new pz30(Peer.a.b(longExtra5), spannableString, null, null, null, null, null, str6, null, null, intExtra2 != 0 ? Integer.valueOf(intExtra2) : null, null, null, 15228);
                                    a1w a1wVar4 = q1w.a;
                                    if (a1wVar4 == null) {
                                        a1wVar4 = null;
                                    }
                                    a1wVar4.D(aVar, pz30Var);
                                    g2v.c().h().getClass();
                                    ref$BooleanRef.element = !((ImSynchronizationHelpersComponent) ((k7m) m7m.f(r5)).a(fpf0.a(ImSynchronizationHelpersComponent.class))).x3().b();
                                }
                                c.postDelayed(new Runnable() { // from class: xsna.p770
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        c.a aVar2 = com.vk.pushes.receivers.c.b;
                                        boolean z = ref$BooleanRef.element;
                                        Context context2 = context;
                                        c.a.f(context2, intent, z);
                                        qa20 qa20Var = qa20.b;
                                        long j7 = longExtra6;
                                        Long valueOf2 = Long.valueOf(j7);
                                        wmi0.a.a(qa20Var.a.c(longExtra5, valueOf2), new MessageNotificationInfo(null, null, null, null, null));
                                        if (gz80.a(24)) {
                                            ra20 ra20Var2 = ra20.a;
                                            Long valueOf3 = Long.valueOf(j7);
                                            ra20Var2.getClass();
                                            ra20.b(context2, valueOf3);
                                        }
                                    }
                                }, 300L);
                                return;
                            }
                            Context context2 = e43.a;
                            if (context2 == null) {
                                context2 = null;
                            }
                            if (context2.getApplicationInfo().targetSdkVersion < 31) {
                                ca70 ca70Var3 = ca70.a;
                                ca70.c(context);
                            }
                            wmi0.a.a(qa20.b.a.c(longExtra5, Long.valueOf(longExtra6)), new MessageNotificationInfo(null, null, null, null, null));
                            qv30 qv30Var = new qv30(longExtra5, intExtra2, pn00.i(new Pair("title", context.getString(R.string.notify_reply_error_title)), new Pair("body", context.getString(R.string.notify_reply_error_text))));
                            ca70 ca70Var4 = ca70.a;
                            new pv30(context, qv30Var).g((NotificationManager) context.getSystemService("notification"));
                            l5m l5mVar = new l5m(null, null, 3);
                            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.MSG_NOTIFY_REPLY_ERROR.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
                            l5mVar.q();
                            return;
                        }
                        return;
                    case -936757454:
                        str = "video_group_id";
                        if (action.equals("action_live_watch_later")) {
                            intent2 = intent;
                            break;
                        } else {
                            return;
                        }
                    case -912007698:
                        if (action.equals("api_call_input")) {
                            String stringExtra2 = intent.getStringExtra("query");
                            if (stringExtra2 == null) {
                                a.c(context, intent);
                                return;
                            }
                            Bundle resultsFromIntent2 = RemoteInput.getResultsFromIntent(intent);
                            if (resultsFromIntent2 == null || (string = resultsFromIntent2.getString("message")) == null) {
                                a.c(context, intent);
                                return;
                            }
                            qns0 qns0Var = new qns0(stringExtra2, string);
                            a.h(qns0Var, intent);
                            m1 y0 = rsg0.y0(qns0Var, null, null, 3);
                            int i3 = 10;
                            y0.subscribe(new le50(new il7(i3, context, intent), 1), new o3y(new nm1(19, context, intent), i3));
                            return;
                        }
                        return;
                    case -729071928:
                        if (action.equals("group_accept") && (userId = (UserId) intent.getParcelableExtra("group_id")) != null) {
                            ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
                            comFeatures.getClass();
                            rsg0 x = com.vk.toggle.b.A.a(comFeatures) ? yfb.x(xqu.a.c(null, null, null, null, fkq0.a(userId), null, null, null)) : new gqu(userId, false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            a.h(x, intent);
                            rsg0.y0(x, null, null, 3).E(new hr6(1), lVar, kVar, kVar).subscribe(new gl30(new com.vk.pushes.receivers.a(context, intent), 8), new afs(new d(22, context, intent), 15));
                            return;
                        }
                        return;
                    case -486578593:
                        if (action.equals("action_live_not_interested")) {
                            a.d(context, intent, com.vk.toggle.d.B().a, new uft0().c(new UserId(intent.getLongExtra("video_group_id", 0L)), Integer.valueOf(intent.getIntExtra("video_id", 0))), new m960(context, 4));
                            return;
                        }
                        return;
                    case -443115947:
                        if (action.equals("friend_decline")) {
                            eos eosVar = new eos((UserId) intent.getParcelableExtra("user_id"), 0);
                            a.h(eosVar, intent);
                            rsg0.y0(eosVar, null, null, 3).subscribe(new q440(new bv1(26, context, intent), 7), new oo20(new b0(23, context, intent), 9));
                            return;
                        }
                        return;
                    case -370396668:
                        if (action.equals("tag_photo_decline")) {
                            is isVar = new is(new UserId(intent.getLongExtra("owner_id", 0L)), intent.getIntExtra("item_id", 0), intent.getIntExtra("tag_id", 0));
                            a.h(isVar, intent);
                            int i4 = 9;
                            rsg0.y0(isVar, null, null, 3).subscribe(new g600(new wd3(20, context, intent), i4), new lkz(new eaa(i, context, intent), i4));
                            return;
                        }
                        return;
                    case -238236614:
                        if (action.equals("tag_photo_accept")) {
                            nea0 nea0Var = new nea0(new UserId(intent.getLongExtra("owner_id", 0L)), intent.getIntExtra("item_id", 0), intent.getIntExtra("tag_id", 0));
                            a.h(nea0Var, intent);
                            rsg0.y0(nea0Var, null, null, 3).subscribe(new pmu(new tn0(19, context, intent), 8), new pd40(new s(25, context, intent), 4));
                            return;
                        }
                        return;
                    case -105333760:
                        if (action.equals("validate_action_confirm")) {
                            a.b(context, intent, true);
                            return;
                        }
                        return;
                    case 99610:
                        if (action.equals("dnd")) {
                            long longExtra7 = intent.getLongExtra("peer_id", 0L);
                            int intExtra3 = intent.getIntExtra("dnd_time", 0);
                            long longExtra8 = intent.getLongExtra("owner_id", 0L);
                            if (intExtra3 != Integer.MAX_VALUE) {
                                xuo0.a.getClass();
                                j = (intExtra3 * 1000) + xuo0.a();
                            } else {
                                j = -1;
                            }
                            uum.a aVar2 = new uum.a();
                            Serializer.c<Peer> cVar5 = Peer.CREATOR;
                            aVar2.a = Peer.a.b(longExtra7);
                            aVar2.a(j, false);
                            aVar2.c = Boolean.TRUE;
                            uum uumVar = new uum(aVar2);
                            a1w a1wVar5 = q1w.a;
                            if (a1wVar5 == null) {
                                a1wVar5 = null;
                            }
                            a1wVar5.D(aVar, uumVar);
                            a.f(context, intent, false);
                            if (gz80.a(24)) {
                                ra20 ra20Var2 = ra20.a;
                                Long valueOf2 = Long.valueOf(longExtra8);
                                ra20Var2.getClass();
                                ra20.b(context, valueOf2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3321751:
                        if (action.equals("like")) {
                            String stringExtra3 = intent.getStringExtra("type");
                            if (stringExtra3 == null) {
                                stringExtra3 = LikesGetList.Type.POST.i();
                            }
                            r6z r6zVar = new r6z(24, intent.getIntExtra("item_id", 0), new UserId(intent.getLongExtra("owner_id", 0L)), stringExtra3, null);
                            a.h(r6zVar, intent);
                            rsg0.y0(r6zVar, null, null, 3).subscribe(new lw30(new lx60(i2, context, intent), 3), new rkz(new jp5(17, context, intent), 12));
                            return;
                        }
                        return;
                    case 41017984:
                        if (action.equals("voip_callback_on_missed")) {
                            UserId userId3 = new UserId(intent.getLongExtra("peer_id", 0L));
                            Serializer.c<VoipCallSource> cVar6 = VoipCallSource.CREATOR;
                            MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.PUSH;
                            UiTracker uiTracker = UiTracker.a;
                            z4g.d().E(context, userId3, new VoipCallSource(source, UiTracker.c()), new b(context, intent));
                            return;
                        }
                        return;
                    case 257390818:
                        if (action.equals("action_video_not_interested")) {
                            a.d(context, intent, com.vk.toggle.d.C().a, new uft0().n(new UserId(intent.getLongExtra("video_group_id", 0L)), VideoSetNotificationsStatusStatusDto.PREFERRED), new q770(context, 0));
                            return;
                        }
                        return;
                    case 423034451:
                        if (action.equals("msg_request_view")) {
                            long longExtra9 = intent.getLongExtra("owner_id", 0L);
                            long longExtra10 = intent.getLongExtra("peer_id", 0L);
                            a1w a1wVar6 = q1w.a;
                            if (a1wVar6 == null) {
                                a1wVar6 = null;
                            }
                            boolean z = longExtra9 == a1wVar6.q().b;
                            if (longExtra10 != 0) {
                                z4g.d().i(context, Long.valueOf(longExtra9), longExtra10, z);
                                ca70 ca70Var5 = ca70.a;
                                ca70.a(context, "msg_request", Long.valueOf(longExtra10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 485898294:
                        if (action.equals("validate_action_decline")) {
                            a.b(context, intent, false);
                            return;
                        }
                        return;
                    case 570580279:
                        if (action.equals("gift_send")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableExtra = intent.getParcelableExtra("user_id", UserId.class);
                                parcelable = (Parcelable) parcelableExtra;
                            } else {
                                Parcelable parcelableExtra2 = intent.getParcelableExtra("user_id");
                                if (!(parcelableExtra2 instanceof UserId)) {
                                    parcelableExtra2 = null;
                                }
                                parcelable = (UserId) parcelableExtra2;
                            }
                            UserId userId4 = (UserId) parcelable;
                            if (userId4 == null) {
                                return;
                            }
                            z4g.d().y(userId4.b, context);
                            a.f(context, intent, false);
                            Context context3 = e43.a;
                            if ((context3 != null ? context3 : null).getApplicationInfo().targetSdkVersion < 31) {
                                ca70 ca70Var6 = ca70.a;
                                ca70.c(context);
                                return;
                            }
                            return;
                        }
                        return;
                    case 795589992:
                        if (action.equals("comment_send")) {
                            String stringExtra4 = intent.getStringExtra("type");
                            if (stringExtra4 == null) {
                                stringExtra4 = "";
                            }
                            long longExtra11 = intent.getLongExtra("owner_id", 0L);
                            int intExtra4 = intent.getIntExtra("item_id", 0);
                            int intExtra5 = intent.getIntExtra("reply_id", 0);
                            Bundle resultsFromIntent3 = RemoteInput.getResultsFromIntent(intent);
                            if (resultsFromIntent3 == null) {
                                a.g(context, intent.getStringExtra("url"), intent);
                                return;
                            }
                            String string2 = resultsFromIntent3.getString("message");
                            String str8 = string2 != null ? string2 : "";
                            switch (stringExtra4.hashCode()) {
                                case -1997001380:
                                    str2 = "group_id";
                                    if (stringExtra4.equals("market_comment")) {
                                        str3 = "market.createComment";
                                        break;
                                    }
                                    str3 = null;
                                    break;
                                case -1317863781:
                                    str2 = "group_id";
                                    if (stringExtra4.equals("video_comment")) {
                                        str3 = "video.createComment";
                                        break;
                                    }
                                    str3 = null;
                                    break;
                                case -925859502:
                                    str2 = "group_id";
                                    if (stringExtra4.equals("photo_comment")) {
                                        str3 = "photos.createComment";
                                        break;
                                    }
                                    str3 = null;
                                    break;
                                case -616578225:
                                    str2 = "group_id";
                                    if (stringExtra4.equals("topic_comment")) {
                                        str3 = "board.createComment";
                                        break;
                                    }
                                    str3 = null;
                                    break;
                                case 950398559:
                                    str2 = "group_id";
                                    if (stringExtra4.equals("comment")) {
                                        str3 = "wall.createComment";
                                        break;
                                    }
                                    str3 = null;
                                    break;
                                default:
                                    str2 = "group_id";
                                    str3 = null;
                                    break;
                            }
                            if (str3 == null || str3.length() == 0) {
                                bleVar = null;
                            } else {
                                bleVar = new ble(str3);
                                bleVar.K("message", str8);
                                bleVar.C(intExtra5, "reply_to_comment");
                                String str9 = str3.equals("board.createComment") ? str2 : "owner_id";
                                if (str3.equals("board.createComment")) {
                                    str4 = "item_id";
                                    j2 = (-1) * longExtra11;
                                } else {
                                    str4 = "item_id";
                                    j2 = longExtra11;
                                }
                                bleVar.D(j2, str9);
                                switch (str3.hashCode()) {
                                    case -674379887:
                                        if (str3.equals("market.createComment")) {
                                            str5 = str4;
                                            break;
                                        }
                                        str5 = null;
                                        break;
                                    case 745955094:
                                        if (str3.equals("photos.createComment")) {
                                            str5 = "photo_id";
                                            break;
                                        }
                                        str5 = null;
                                        break;
                                    case 936406416:
                                        if (str3.equals("video.createComment")) {
                                            str5 = "video_id";
                                            break;
                                        }
                                        str5 = null;
                                        break;
                                    case 1454306463:
                                        if (str3.equals("wall.createComment")) {
                                            str5 = "post_id";
                                            break;
                                        }
                                        str5 = null;
                                        break;
                                    case 1743335611:
                                        if (str3.equals("board.createComment")) {
                                            str5 = "topic_id";
                                            break;
                                        }
                                        str5 = null;
                                        break;
                                    default:
                                        str5 = null;
                                        break;
                                }
                                if (str5 != null) {
                                    bleVar.C(intExtra4, str5);
                                }
                            }
                            if (bleVar == null) {
                                a.e(context, intent, new Exception("Wrong comment type"));
                                return;
                            } else {
                                a.h(bleVar, intent);
                                rsg0.y0(bleVar, null, null, 3).subscribe(new m1r(new k22(13, context, intent), 11), new n1r(new yl0(15, context, intent), 10));
                                return;
                            }
                        }
                        return;
                    case 821988681:
                        if (action.equals("send_money")) {
                            a.a(context, intent);
                            return;
                        }
                        return;
                    case 966916451:
                        if (action.equals(CallEventualStatName.API_CALL)) {
                            String stringExtra5 = intent.getStringExtra("query");
                            if (stringExtra5 == null) {
                                a.c(context, intent);
                                return;
                            }
                            qns0 qns0Var2 = new qns0(stringExtra5, (String) null);
                            a.h(qns0Var2, intent);
                            rsg0.y0(qns0Var2, null, null, 3).subscribe(new ljs(new z5a(20, context, intent), 15), new j3z(new fo6(17, context, intent), 8));
                            return;
                        }
                        return;
                    case 1034488031:
                        if (action.equals("music_subscription_clicked")) {
                            z4g.d().g(context, c);
                            return;
                        }
                        return;
                    case 1408681683:
                        if (action.equals("msg_mark_as_read_channel")) {
                            long longExtra12 = intent.getLongExtra("peer_id", 0L);
                            int intExtra6 = intent.getIntExtra("msg_cnv_id", 0);
                            long longExtra13 = intent.getLongExtra("owner_id", 0L);
                            UserId c2 = o25.a().c();
                            if (!fkq0.c(c2)) {
                                c2 = null;
                            }
                            Long valueOf3 = c2 != null ? Long.valueOf(c2.b) : null;
                            if (valueOf3 != null && longExtra13 == valueOf3.longValue()) {
                                a1w a1wVar7 = q1w.a;
                                if (a1wVar7 == null) {
                                    a1wVar7 = null;
                                }
                                a1wVar7.D(aVar, new k1b(longExtra12, intExtra6));
                            }
                            v1b.b.b(longExtra12, Long.valueOf(longExtra13));
                            g2v.c().h().getClass();
                            a.f(context, intent, !((ImSynchronizationHelpersComponent) ((k7m) m7m.f(r0)).a(fpf0.a(ImSynchronizationHelpersComponent.class))).x3().b());
                            if (gz80.a(24)) {
                                ra20 ra20Var3 = ra20.a;
                                Long valueOf4 = Long.valueOf(longExtra13);
                                ra20Var3.getClass();
                                ra20.b(context, valueOf4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1593577782:
                        if (action.equals("group_decline") && (userId2 = (UserId) intent.getParcelableExtra("group_id")) != null) {
                            hqu hquVar = new hqu(userId2, (String) null, (String) null, (AdminLeaveAction) null, 30);
                            a.h(hquVar, intent);
                            rsg0.y0(hquVar, null, null, 3).E(new wmz(new dam(22), 11), lVar, kVar, kVar).subscribe(new eiy(new b1a(23, context, intent), 9), new jsv(new qt5(20, context, intent), 8));
                            return;
                        }
                        return;
                    case 1598405877:
                        if (action.equals("action_video_download")) {
                            Lazy<VideoApiHelperRepository> lazy = this.a;
                            VideoApiHelperRepository value = lazy != null ? lazy.getValue() : null;
                            long longExtra14 = intent.getLongExtra("video_group_id", 0L);
                            int intExtra7 = intent.getIntExtra("video_id", 0);
                            if (!com.vk.toggle.d.C().c || value == null) {
                                a.g(context, intent.getStringExtra("url"), intent);
                                return;
                            } else {
                                value.b(intExtra7, new UserId(longExtra14), null).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sl30(new o770(context, intent, intExtra7), 7), new tl30(new n9(20, context, intent), 8));
                                return;
                            }
                        }
                        return;
                    case 2114722249:
                        if (action.equals("friend_accept")) {
                            yjs yjsVar = new yjs((UserId) intent.getParcelableExtra("user_id"), "");
                            a.h(yjsVar, intent);
                            rsg0.y0(yjsVar, null, null, 3).subscribe(new n3t(new rm0(19, context, intent), 14), new t520(new ya(25, context, intent), 9));
                            return;
                        }
                        return;
                    default:
                        return;
                }
                long longExtra15 = intent2.getLongExtra(str, 0L);
                int intExtra8 = intent2.getIntExtra("video_id", 0);
                UserId userId5 = new UserId(longExtra15);
                tfx tfxVar = new tfx("fave.addVideo", new ir(19), new jr(15));
                tfx.n(tfxVar, "owner_id", userId5, 0L, 0L, 12);
                tfx.l(tfxVar, "id", intExtra8, 0, 0, 12);
                a.d(context, intent2, true, tfxVar, new qg1(17, intent2, context));
            }
        }
    }

    public /* synthetic */ c(int i) {
        this((bpn0) null);
    }

    public c(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }
}
