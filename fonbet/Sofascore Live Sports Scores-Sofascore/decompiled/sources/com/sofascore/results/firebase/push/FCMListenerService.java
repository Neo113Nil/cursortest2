package com.sofascore.results.firebase.push;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.database.DbPendingNotification;
import com.sofascore.model.notifications.NotificationData;
import com.sofascore.model.notifications.NotificationOpen;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import com.sofascore.model.notifications.NotificationType;
import com.sofascore.model.notifications.SofascoreNotification;
import com.sofascore.results.R;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.service.NotificationTextToSpeechService;
import com.sofascore.results.service.PendingDeleteNotificationService;
import com.sofascore.results.service.SyncWorker;
import com.sofascore.results.service.game.MuteEventService;
import defpackage.a5f;
import defpackage.b5i;
import defpackage.bgd;
import defpackage.boj;
import defpackage.cm6;
import defpackage.efd;
import defpackage.egd;
import defpackage.eq3;
import defpackage.f3e;
import defpackage.f5d;
import defpackage.fc6;
import defpackage.fgd;
import defpackage.gfd;
import defpackage.gz8;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ia0;
import defpackage.ir4;
import defpackage.jgd;
import defpackage.jp1;
import defpackage.kc4;
import defpackage.ke0;
import defpackage.ktd;
import defpackage.lsb;
import defpackage.ltd;
import defpackage.m2i;
import defpackage.m6k;
import defpackage.mc4;
import defpackage.me4;
import defpackage.mha;
import defpackage.n9e;
import defpackage.nf6;
import defpackage.o4i;
import defpackage.p2g;
import defpackage.ph0;
import defpackage.puh;
import defpackage.r6h;
import defpackage.rd6;
import defpackage.s38;
import defpackage.s9a;
import defpackage.td4;
import defpackage.thd;
import defpackage.u0a;
import defpackage.u2g;
import defpackage.ugj;
import defpackage.uhd;
import defpackage.uic;
import defpackage.uuh;
import defpackage.vuh;
import defpackage.vv8;
import defpackage.w2g;
import defpackage.w9g;
import defpackage.wxf;
import defpackage.xbb;
import defpackage.xbl;
import defpackage.xw3;
import defpackage.y05;
import defpackage.y4b;
import defpackage.yaa;
import defpackage.yfa;
import defpackage.yhd;
import defpackage.yx4;
import defpackage.z45;
import defpackage.zxe;
import defpackage.zzl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/firebase/push/FCMListenerService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FCMListenerService extends FirebaseMessagingService implements vv8 {
    public volatile r6h a;
    public final Object b = new Object();
    public boolean c = false;
    public vuh d;

    @Override // defpackage.uv8
    public final Object f() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new r6h(this);
                    }
                } finally {
                }
            }
        }
        return this.a.f();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            mc4 mc4Var = ((kc4) ((cm6) f())).a;
            this.d = new vuh((yhd) mc4Var.b0.get(), mc4Var.c.b);
        }
        super.onCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x09bf, code lost:
    
        if (r3.getMode() == 2) goto L325;
     */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        NotificationData notificationData;
        Object u2gVar;
        xbb xbbVar;
        Object obj;
        boolean z;
        Bitmap decodeResource;
        Bitmap p;
        NotificationManager notificationManager;
        SharedPreferences d;
        SharedPreferences d2;
        Object u2gVar2;
        remoteMessage.getClass();
        if (remoteMessage.Y0().containsKey("af-uinstall-tracking")) {
            return;
        }
        ugj.a.getClass();
        HashMap Y0 = remoteMessage.Y0();
        String str = (String) Y0.get("notification");
        if (str == null || str.length() == 0) {
            notificationData = null;
        } else {
            try {
                p2g p2gVar = w2g.b;
                u2gVar2 = yfa.C(str);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar2 = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar2);
            if (a != null) {
                s38.a().c(a);
            }
            if (u2gVar2 instanceof u2g) {
                u2gVar2 = null;
            }
            notificationData = (NotificationData) u2gVar2;
        }
        try {
            p2g p2gVar3 = w2g.b;
            u2gVar = new JSONArray((String) Y0.get("notificationType"));
        } catch (Throwable th2) {
            p2g p2gVar4 = w2g.b;
            u2gVar = new u2g(th2);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        JSONArray jSONArray = (JSONArray) u2gVar;
        if (jSONArray != null) {
            xbb b = a.b();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    b.add(obj2);
                }
            }
            xbbVar = a.a(b);
        } else {
            xbbVar = null;
        }
        SofascoreNotification sofascoreNotification = new SofascoreNotification(Intrinsics.c(Y0.get("ping"), "true"), Intrinsics.c(Y0.get("sync"), "true"), Intrinsics.c(Y0.get("fetchRemoteConfig"), "true"), (String) Y0.get("talk"), xbbVar, notificationData);
        if (sofascoreNotification.isPing()) {
            u0a.C(this);
        }
        boolean z2 = true;
        if (sofascoreNotification.isSync()) {
            Application application = getApplication();
            ia0 ia0Var = application instanceof ia0 ? (ia0) application : null;
            if (ia0Var == null || !ia0Var.b) {
                ke0.h = true;
            } else {
                ktd A = mha.A(new ktd(SyncWorker.class));
                mha.y(A);
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                xbl d3 = xbl.d(applicationContext);
                d3.getClass();
                d3.b("SyncWorker-".concat(""), nf6.a, (ltd) A.a());
            }
        }
        if (sofascoreNotification.getNotificationData() != null) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext2 = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext2);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            String string = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
            String str2 = string != null ? string : "NOTIFICATION_ENABLED";
            if (!new fgd(this).b.areNotificationsEnabled()) {
                str2 = "NOTIFICATION_DISABLED";
            } else if (str2.equals("NOTIFICATION_DISABLED")) {
                str2 = "NOTIFICATION_ENABLED";
            }
            if (str2.equals("NOTIFICATION_ENABLED")) {
                Context applicationContext3 = getApplicationContext();
                applicationContext3.getClass();
                NotificationData notificationData2 = sofascoreNotification.getNotificationData();
                List<String> notificationType = sofascoreNotification.getNotificationType();
                String str3 = notificationType != null ? (String) CollectionsKt.firstOrNull(notificationType) : null;
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                if (notificationData2 != null) {
                    if (notificationData2.getId() != -1) {
                        firebaseBundle.putInt("id", notificationData2.getId());
                    }
                    NotificationOpen open = notificationData2.getOpen();
                    if (open != null) {
                        firebaseBundle.putString("type", open.getValue());
                    }
                    if (notificationData2.getCampaignId() != -1) {
                        firebaseBundle.putInt(Payload.CAMPAIGN_ID, notificationData2.getCampaignId());
                    }
                }
                if (str3 != null) {
                    firebaseBundle.putString("category", str3);
                }
                ia0 ia0Var2 = ia0.q;
                me4.d((f5d) me4.e(), "notification_impression", firebaseBundle, applicationContext3).a.e(n9e.K(firebaseBundle), null, "notification_impression", false);
                vuh vuhVar = this.d;
                if (vuhVar == null) {
                    Intrinsics.i("notificationHelper");
                    throw null;
                }
                Context context = vuhVar.b;
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext4 = context.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext4);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences2 = d2;
                }
                if (!sharedPreferences2.getBoolean("PREF_NEW_NOTIFICATION_SETUP", false)) {
                    td4.u0(new w9g(vuhVar, null, 15));
                }
                NotificationData notificationData3 = sofascoreNotification.getNotificationData();
                if ((notificationData3 != null ? notificationData3.getOpen() : null) == null) {
                    return;
                }
                NotificationManager notificationManager2 = (NotificationManager) vuhVar.b.getSystemService(NotificationManager.class);
                String channel = StringsKt.J(notificationData3.getChannel(), "player_game", false) ? "player_player_game" : StringsKt.J(notificationData3.getChannel(), "player_media", false) ? "player_player_media" : notificationData3.getChannel();
                Iterator it = ir4.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.c(NotificationSettingKt.getBackendChannelName((NotificationSetting) obj), channel)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NotificationSetting notificationSetting = (NotificationSetting) obj;
                if (notificationSetting == null || jgd.d.contains(NotificationSettingKt.getBackendChannelName(notificationSetting))) {
                    return;
                }
                String channelId = notificationSetting.getChannelId();
                NotificationChannel notificationChannel = notificationManager2 != null ? notificationManager2.getNotificationChannel(channelId) : null;
                if (notificationChannel == null || notificationChannel.getImportance() <= 0) {
                    return;
                }
                List<String> notificationType2 = sofascoreNotification.getNotificationType();
                String str4 = notificationType2 != null ? (String) CollectionsKt.firstOrNull(notificationType2) : null;
                if (Intrinsics.c(str4, NotificationType.FantasyDeadlineCountdown.INSTANCE.getLabel())) {
                    Context context2 = vuhVar.b;
                    channelId.getClass();
                    if (eq3.b(context2, "android.permission.POST_NOTIFICATIONS") != 0) {
                        return;
                    }
                    long endTimestamp = ((notificationData3.getEndTimestamp() * 1000) - yaa.v()) + SystemClock.elapsedRealtime();
                    RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.elite_faceoff_notification_timer_collapsed);
                    remoteViews.setTextViewText(R.id.deadline_label, notificationData3.getTitle());
                    remoteViews.setTextViewText(R.id.label_bottom, notificationData3.getMessage());
                    remoteViews.setChronometer(R.id.notification_timer, endTimestamp, null, true);
                    RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), R.layout.elite_faceoff_notification_timer_expanded);
                    remoteViews2.setTextViewText(R.id.label_bottom, notificationData3.getMessage());
                    remoteViews2.setChronometer(R.id.notification_timer, endTimestamp, null, true);
                    long endTimestamp2 = (notificationData3.getEndTimestamp() * 1000) - yaa.v();
                    Intent intent = new Intent(context2, (Class<?>) StartActivity.class);
                    intent.setAction("notification_click_action");
                    intent.putExtra("notification_id", notificationData3.getGroupKey());
                    NotificationOpen open2 = notificationData3.getOpen();
                    intent.putExtra("open", open2 != null ? open2.getValue() : null);
                    intent.putExtra("open_action", "open_fantasy_competition");
                    intent.putExtra("event_id", notificationData3.getId());
                    PendingIntent activity = PendingIntent.getActivity(context2, notificationData3.getGroupKey(), intent, 201326592);
                    efd efdVar = new efd(context2, channelId);
                    efdVar.v.icon = 2131231886;
                    efdVar.g(new gfd());
                    efdVar.e(8, true);
                    efdVar.e(16, true);
                    efdVar.j = 0;
                    efdVar.e(2, false);
                    efdVar.t = endTimestamp2;
                    efdVar.g = activity;
                    efdVar.q = remoteViews;
                    efdVar.r = remoteViews2;
                    Notification b2 = efdVar.b();
                    b2.getClass();
                    fgd fgdVar = new fgd(context2);
                    int groupKey = notificationData3.getGroupKey();
                    Bundle extras = NotificationCompat.getExtras(b2);
                    if (extras == null || !extras.getBoolean("android.support.useSideChannel")) {
                        fgdVar.b.notify(null, groupKey, b2);
                        return;
                    }
                    bgd bgdVar = new bgd(context2.getPackageName(), groupKey, b2);
                    synchronized (fgd.f) {
                        try {
                            egd egdVar = fgd.g;
                            if (egdVar == null) {
                                egdVar = new egd(context2.getApplicationContext());
                                fgd.g = egdVar;
                            }
                            egdVar.b.obtainMessage(0, bgdVar).sendToTarget();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    fgdVar.b.cancel(null, groupKey);
                    return;
                }
                thd thdVar = vuhVar.a.a;
                String updateableNotificationId = notificationData3.getUpdateableNotificationId();
                if (updateableNotificationId == null || updateableNotificationId.length() == 0) {
                    gz8.S(thdVar.a, false, true, new lsb(27, thdVar, new DbPendingNotification(0, notificationData3.getGroupKey(), notificationData3.getTitle(), notificationData3.getMessage(), notificationData3.getUpdateableNotificationId())));
                } else {
                    thdVar.getClass();
                    boolean z3 = ((Number) gz8.S(thdVar.a, true, false, new jp1(updateableNotificationId, 23))).intValue() > 0;
                    if (z3 && notificationData3.getSound() == null) {
                        int groupKey2 = notificationData3.getGroupKey();
                        String title = notificationData3.getTitle();
                        String message = notificationData3.getMessage();
                        title.getClass();
                        message.getClass();
                        gz8.S(thdVar.a, false, true, new yx4(groupKey2, title, message, updateableNotificationId, 6));
                    } else if (!z3) {
                        gz8.S(thdVar.a, false, true, new lsb(27, thdVar, new DbPendingNotification(0, notificationData3.getGroupKey(), notificationData3.getTitle(), notificationData3.getMessage(), notificationData3.getUpdateableNotificationId())));
                    }
                }
                efd efdVar2 = new efd(vuhVar.b, channelId);
                String updateableNotificationId2 = notificationData3.getUpdateableNotificationId();
                boolean z4 = updateableNotificationId2 == null || updateableNotificationId2.length() == 0;
                int b3 = vuhVar.b(efdVar2, notificationData3);
                Bitmap f = ((uhd) vuhVar.c.getValue()).f(notificationData3);
                if (f == null || b3 <= 1) {
                    Context context3 = vuhVar.b;
                    try {
                        decodeResource = BitmapFactory.decodeResource(context3.getResources(), notificationData3.getIcon());
                        z = z4;
                    } catch (NullPointerException e) {
                        z = z4;
                        s38.a().c(new NullPointerException("Notification getPicture error for " + notificationData3.getChannel() + ", " + e));
                        decodeResource = BitmapFactory.decodeResource(context3.getResources(), 2131231886);
                        z2 = true;
                    }
                    p = wxf.p(context3, decodeResource, z2);
                } else {
                    z = z4;
                    p = f;
                }
                Bitmap bitmap = p;
                Intent intent2 = new Intent(vuhVar.b, (Class<?>) StartActivity.class);
                intent2.setAction("notification_click_action");
                intent2.putExtra("notification_id", notificationData3.getGroupKey());
                NotificationOpen open3 = notificationData3.getOpen();
                intent2.putExtra("open", open3 != null ? open3.getValue() : null);
                intent2.putExtra("notification_type", str4);
                intent2.putExtra("intent_from_notification", true);
                intent2.putExtra(Payload.CAMPAIGN_ID, notificationData3.getCampaignId());
                NotificationOpen open4 = notificationData3.getOpen();
                if (open4 != null) {
                    switch (puh.a[open4.ordinal()]) {
                        case 1:
                            intent2.putExtra("open_action", "open_details");
                            intent2.putExtra("event_id", notificationData3.getId());
                            if (StringsKt.J(notificationData3.getChannel(), "player_of_the_match_voting", false)) {
                                intent2.putExtra("player_of_the_match_voting", true);
                            }
                            Unit unit = Unit.a;
                            break;
                        case 2:
                            fc6.x(intent2, "open_action", "open_details", notificationData3, "event_id");
                            intent2.putExtra("preselected_tab", rd6.s);
                            break;
                        case 3:
                            fc6.x(intent2, "open_action", "open_details", notificationData3, "event_id");
                            intent2.putExtra("preselected_tab", rd6.j);
                            break;
                        case 4:
                            intent2.putExtra("open_action", "open_login");
                            break;
                        case 5:
                            intent2.putExtra("open_action", "open_url");
                            intent2.putExtra("url", notificationData3.getUrl());
                            break;
                        case 6:
                            fc6.x(intent2, "open_action", "open_team", notificationData3, "team_id");
                            break;
                        case 7:
                            intent2.putExtra("open_action", "news_id");
                            intent2.putExtra("url", notificationData3.getUrl());
                            break;
                        case 8:
                            fc6.x(intent2, "open_action", "open_player", notificationData3, "player_id");
                            intent2.putExtra("preselected_tab", zxe.c);
                            break;
                        case 9:
                            fc6.x(intent2, "open_action", "open_player", notificationData3, "player_id");
                            intent2.putExtra("preselected_tab", zxe.d);
                            break;
                        case 10:
                            fc6.x(intent2, "open_action", "open_player", notificationData3, "player_id");
                            intent2.putExtra("preselected_tab", zxe.e);
                            break;
                        case 11:
                            fc6.x(intent2, "open_action", "open_player", notificationData3, "player_id");
                            intent2.putExtra("preselected_tab", zxe.f);
                            break;
                        case 12:
                            intent2.putExtra("open_action", "open_details");
                            intent2.putExtra("event_id", notificationData3.getId());
                            intent2.putExtra("player_id", notificationData3.getPlayerId());
                            List<Integer> teams = notificationData3.getTeams();
                            if (teams != null && teams.size() == 2) {
                                intent2.putExtra("player_team_side", (notificationData3.getForTeam() == teams.get(0).intValue() ? teams.get(0) : teams.get(1)).intValue());
                            }
                            Unit unit2 = Unit.a;
                            break;
                        case 13:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("team_of_the_period_id", notificationData3.getTeamOfThePeriodId());
                            break;
                        case 14:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("preselected_tab", y4b.c);
                            break;
                        case 15:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.e);
                            break;
                        case 16:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("preselected_tab", y4b.h);
                            break;
                        case 17:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.f);
                            break;
                        case 18:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.d);
                            break;
                        case 19:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.g);
                            intent2.putExtra("initial_top_stats_chip", boj.PLAYERS);
                            break;
                        case 20:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.g);
                            intent2.putExtra("initial_top_stats_chip", boj.PERFORMANCES);
                            break;
                        case 21:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.g);
                            intent2.putExtra("initial_top_stats_chip", boj.TEAMS);
                            break;
                        case 22:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.i);
                            break;
                        case 23:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("unique_tournament_group_id", notificationData3.getId());
                            intent2.putExtra("preselected_tab", y4b.j);
                            break;
                        case 24:
                            intent2.putExtra("open_action", "open_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            intent2.putExtra("preselected_tab", y4b.k);
                            break;
                        case 25:
                            fc6.x(intent2, "open_action", "open_fight_night", notificationData3, "mma_fight_night_id");
                            break;
                        case 26:
                            fc6.x(intent2, "open_action", "open_fighter", notificationData3, "mma_fighter_id");
                            break;
                        case 27:
                            fc6.x(intent2, "open_action", "open_stage", notificationData3, "stage_id");
                            break;
                        case 28:
                            fc6.x(intent2, "open_action", "open_stage", notificationData3, "stage_id");
                            intent2.putExtra("preselected_tab", o4i.e);
                            break;
                        case 29:
                            fc6.x(intent2, "open_action", "open_stage", notificationData3, "stage_id");
                            intent2.putExtra("preselected_tab", o4i.c);
                            break;
                        case 30:
                            fc6.x(intent2, "open_action", "open_stage", notificationData3, "stage_id");
                            intent2.putExtra("preselected_tab", o4i.d);
                            break;
                        case 31:
                            fc6.x(intent2, "open_action", "open_driver", notificationData3, "driver_id");
                            break;
                        case 32:
                            fc6.x(intent2, "open_action", "open_driver", notificationData3, "driver_id");
                            intent2.putExtra("preselected_tab", b5i.d);
                            break;
                        case 33:
                            fc6.x(intent2, "open_action", "open_driver", notificationData3, "driver_id");
                            intent2.putExtra("preselected_tab", b5i.c);
                            break;
                        case 34:
                            fc6.x(intent2, "open_action", "open_driver", notificationData3, "driver_id");
                            intent2.putExtra("preselected_tab", b5i.e);
                            break;
                        case 35:
                            fc6.x(intent2, "open_action", "open_constructor", notificationData3, "constructor_id");
                            break;
                        case 36:
                            fc6.x(intent2, "open_action", "open_constructor", notificationData3, "constructor_id");
                            intent2.putExtra("preselected_tab", m2i.d);
                            break;
                        case 37:
                            fc6.x(intent2, "open_action", "open_constructor", notificationData3, "constructor_id");
                            intent2.putExtra("preselected_tab", m2i.c);
                            break;
                        case 38:
                            fc6.x(intent2, "open_action", "open_constructor", notificationData3, "constructor_id");
                            intent2.putExtra("preselected_tab", m2i.e);
                            break;
                        case 39:
                            fc6.x(intent2, "open_action", "open_survey", notificationData3, "event_id");
                            break;
                        case 40:
                            fc6.x(intent2, "open_action", "open_crowdsourcing", notificationData3, "event_id");
                            break;
                        case 41:
                            fc6.x(intent2, "open_action", "open_crowdsourcing", notificationData3, "event_id");
                            break;
                        case 42:
                            fc6.x(intent2, "open_action", "open_contribution_tracker", notificationData3, "event_id");
                            break;
                        case 43:
                            intent2.putExtra("open_action", "open_weekly_challenge");
                            break;
                        case 44:
                            fc6.x(intent2, "open_action", "open_fantasy_competition", notificationData3, "event_id");
                            break;
                        case 45:
                            fc6.x(intent2, "open_action", "open_fantasy_onboarding", notificationData3, "event_id");
                            break;
                        case 46:
                            intent2.putExtra("open_action", "historical_data");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            break;
                        case 47:
                            intent2.putExtra("open_action", "sofascore-season");
                            break;
                        case 48:
                            intent2.putExtra("open_action", notificationData3.getUniqueId() == 16 ? "select_world_cup" : "select_featured_tournament");
                            intent2.putExtra("unique_tournament_id", notificationData3.getUniqueId());
                            break;
                        case 49:
                            intent2.putExtra("open_action", "open_preferences");
                            break;
                        case 50:
                            intent2.putExtra("open_action", "select_feed_tab");
                            break;
                        case 51:
                            fc6.x(intent2, "open_action", "open_rankings", notificationData3, "rankings_id");
                            break;
                        case 52:
                            fc6.x(intent2, "open_action", "open_insights", notificationData3, "event_id");
                            break;
                        case 53:
                            fc6.x(intent2, "open_action", "open_manager", notificationData3, "manager_id");
                            break;
                        case 54:
                            fc6.x(intent2, "open_action", "open_venue", notificationData3, "venue_id");
                            break;
                        case 55:
                            intent2.putExtra("open_action", "open_player_of_the_season");
                            intent2.putExtra("preselected_tab", f3e.b);
                            break;
                        case 56:
                            intent2.putExtra("open_action", "open_player_of_the_season");
                            intent2.putExtra("preselected_tab", f3e.c);
                            break;
                        case 57:
                            intent2.putExtra("open_action", "open_player_of_the_season");
                            intent2.putExtra("preselected_tab", f3e.d);
                            break;
                        case 58:
                            intent2.putExtra("open_action", "open_upgrade");
                            break;
                        default:
                            zzl.b();
                            return;
                    }
                }
                Context context4 = vuhVar.b;
                int groupKey3 = notificationData3.getGroupKey();
                Intent intent3 = new Intent(context4, (Class<?>) PendingDeleteNotificationService.class);
                intent3.putExtra("NotificationID", groupKey3);
                PendingIntent activity2 = PendingIntent.getActivity(vuhVar.b, notificationData3.getGroupKey(), intent2, 201326592);
                PendingIntent service = PendingIntent.getService(vuhVar.b, notificationData3.getGroupKey(), intent3, 201326592);
                efdVar2.f(bitmap);
                efdVar2.v.icon = 2131231886;
                efdVar2.o = vuhVar.b.getColor(R.color.ic_launcher_background);
                efdVar2.g = activity2;
                efdVar2.v.deleteIntent = service;
                efdVar2.e(16, true);
                String sound = notificationData3.getSound();
                Context context5 = vuhVar.b;
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext5 = context5.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext5);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences3 = d;
                }
                boolean z5 = sharedPreferences3.getBoolean("PREF_NOTIFICATION_TTS", false);
                if (sound == null || z5) {
                    efdVar2.w = true;
                }
                if (CollectionsKt.R(ph0.a0(new NotificationOpen[]{NotificationOpen.DETAILS, NotificationOpen.LINEUPS, NotificationOpen.HIGHLIGHTS, NotificationOpen.PLAYER_DIALOG}), notificationData3.getOpen())) {
                    Context context6 = vuhVar.b;
                    int id = notificationData3.getId();
                    Intent intent4 = new Intent(context6.getApplicationContext(), (Class<?>) MuteEventService.class);
                    intent4.putExtra("GAME_ID", id);
                    efdVar2.a(R.drawable.ic_notification_mute, PendingIntent.getService(vuhVar.b, notificationData3.getGroupKey(), intent4, 201326592), vuhVar.b.getString(R.string.mute_event));
                }
                AudioManager audioManager = (AudioManager) vuhVar.b.getSystemService(AudioManager.class);
                int i2 = audioManager != null ? 2 : 2;
                if (audioManager != null && audioManager.getRingerMode() == i2 && sofascoreNotification.getTextToSpeech() != null && ((sound != null || !z) && z5)) {
                    Context context7 = vuhVar.b;
                    String textToSpeech = sofascoreNotification.getTextToSpeech();
                    Intent intent5 = new Intent(context7, (Class<?>) NotificationTextToSpeechService.class);
                    intent5.putExtra("TALK_STRING", textToSpeech);
                    try {
                        context7.startForegroundService(intent5);
                    } catch (Exception unused) {
                    }
                }
                Notification b4 = efdVar2.b();
                b4.getClass();
                try {
                    notificationManager = notificationManager2;
                    try {
                        notificationManager.notify(notificationData3.getGroupKey(), b4);
                    } catch (SecurityException e2) {
                        e = e2;
                        s38 a2 = s38.a();
                        a2.b("Notification display error: channelId=" + channelId + ", data=" + notificationData3.getId());
                        a2.c(e);
                        Boolean bool = y05.a;
                        if (y05.a(vuhVar.b)) {
                        }
                    }
                } catch (SecurityException e3) {
                    e = e3;
                    notificationManager = notificationManager2;
                }
                Boolean bool2 = y05.a;
                if (y05.a(vuhVar.b)) {
                    if (f == null || b3 == 1) {
                        hs4 hs4Var = z45.a;
                        xw3.L(s9a.c(hq4.c), null, null, new uuh(notificationData3, efdVar2, notificationManager, vuhVar, b3, null), 3);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        ugj.a.getClass();
        if (str.length() > 0) {
            String O = m6k.O(this);
            m6k.c0(this, str);
            if (!Intrinsics.c(O, str)) {
                mha.F(this);
            }
            AppsFlyerLib.getInstance().updateServerUninstallToken(this, str);
        }
    }
}
