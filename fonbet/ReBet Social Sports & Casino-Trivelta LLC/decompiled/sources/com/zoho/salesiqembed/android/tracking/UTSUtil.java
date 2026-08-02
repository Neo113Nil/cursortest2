package com.zoho.salesiqembed.android.tracking;

import a1.C1908a;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.conversations.data.local.entities.Bot;
import com.zoho.livechat.android.modules.conversations.data.local.entities.BotTrigger;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.triggers.data.TriggersRepository;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.TriggerReceiver;
import com.zoho.salesiqembed.android.tracking.UTSAdapter;
import ie.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.text.StringsKt;
import l.AbstractC5335a;
import od.m;
import od.t;
import od.x;
import rd.C6218a;
import ug.AbstractC6574b;
import vg.C6689a;
import we.b;
import wg.C6751f;

/* loaded from: classes4.dex */
public class UTSUtil {
    public static final String EVENT_CUSTOM_ACTIONS = "custom_actions";
    public static final String EVENT_WIDGET_INTERACTION = "widget_interaction";
    private static Ne.b conversationUtsEventsHandler = Ne.b.n();
    private static Handler handler = null;
    private static androidx.appcompat.app.a trackingConsentAlertDialog = null;
    static boolean trackingConsentDialogShown = false;
    private static TriggersRepository triggersRepository;

    public enum ActionState {
        Updated,
        Triggered,
        Delayed
    }

    public class a extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44638a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f44639b;

        public a(String str, Context context) {
            this.f44638a = str;
            this.f44639b = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            LiveChatUtil.openUrl(this.f44638a);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(P.e(this.f44639b, AbstractC5335a.f55002q));
            textPaint.setUnderlineText(true);
        }
    }

    public static /* synthetic */ void a(DialogInterface dialogInterface) {
        trackingConsentDialogShown = true;
        Q.H(false);
        ne.j.q0();
    }

    public static /* synthetic */ void b(Activity activity) {
        if (UTSAdapter.isUtsConnected() && UTSAdapter.isHold()) {
            UTSAdapter.resume();
            return;
        }
        if (UTSAdapter.getConnStatus() == UTSAdapter.Status.DISCONNECTED) {
            SharedPreferences sharedPreferences = MobilistenInitProvider.k().getSharedPreferences("siq_session", 0);
            Hashtable hashtable = new Hashtable();
            if (activity == null || !activity.getResources().getBoolean(m.f59918e)) {
                String visitorName = LiveChatUtil.getVisitorName(false);
                if (visitorName != null && !LiveChatUtil.isAnnonVisitorbyName(visitorName)) {
                    hashtable.put("name", visitorName);
                }
                if (ZohoLiveChat.e.e() != null) {
                    hashtable.put("email", ZohoLiveChat.e.e());
                }
                if (ZohoLiveChat.e.d() != null) {
                    hashtable.put("phone", ZohoLiveChat.e.d());
                }
                if (!ZohoLiveChat.e.c().isEmpty()) {
                    hashtable.put("cinfo", AbstractC6574b.g(ZohoLiveChat.e.c()));
                }
            }
            String n10 = C6218a.n();
            if (n10 != null) {
                hashtable.put("ptitle", n10);
            } else if (activity != null) {
                hashtable.put("ptitle", activity.getClass().getSimpleName());
            }
            UTSAdapter.setHandler(new c());
            try {
                UTSAdapter.connect(sharedPreferences.getString("annonid", null), MobilistenUtil.d(), MobilistenUtil.c(), MobilistenUtil.g(), hashtable);
            } catch (C6689a e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public static /* synthetic */ void c(Activity activity, DialogInterface dialogInterface, int i10) {
        trackingConsentDialogShown = true;
        connectToUTS(activity, true, 0);
        SharedPreferences.Editor edit = C6218a.M().edit();
        edit.putBoolean("tracking_consent", true);
        edit.apply();
        dialogInterface.dismiss();
    }

    public static void clearBotTriggeredActionsList() {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.remove("bot_triggered_actions_list");
            edit.apply();
        }
    }

    public static void clearBotTriggers() {
        if (C6218a.M() != null) {
            try {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.remove("bot_triggers_list");
                edit.apply();
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public static void connectToUTS(Activity activity) {
        boolean z10;
        int trackingConsentConfig = LiveChatUtil.getTrackingConsentConfig();
        if (trackingConsentConfig == 0) {
            z10 = true;
        } else if (C6218a.M().contains("tracking_consent")) {
            z10 = C6218a.M().getBoolean("tracking_consent", false);
            if (!z10) {
                return;
            }
        } else {
            z10 = false;
        }
        connectToUTS(activity, z10, trackingConsentConfig);
    }

    public static /* synthetic */ void d(WaitingChatDetails waitingChatDetails, String str, boolean z10) {
        updateChatUIWithTrigger(waitingChatDetails, true);
        performCustomAction(str);
        C6218a.g0(null);
    }

    public static void dismissTrackingConsent() {
        androidx.appcompat.app.a aVar = trackingConsentAlertDialog;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        trackingConsentAlertDialog.dismiss();
        trackingConsentDialogShown = false;
    }

    public static /* synthetic */ void e(DialogInterface dialogInterface, int i10) {
        trackingConsentDialogShown = true;
        clearBotTriggeredActionsList();
        SharedPreferences.Editor edit = C6218a.M().edit();
        edit.putBoolean("tracking_consent", false);
        edit.apply();
        dialogInterface.dismiss();
    }

    public static void executeTrigger(int i10, boolean z10, Hashtable hashtable) {
        conversationUtsEventsHandler.i(i10, z10, hashtable);
    }

    public static /* synthetic */ void f(WaitingChatDetails waitingChatDetails, Bot bot, boolean z10) {
        updateChatUIWithTrigger(waitingChatDetails, bot != null);
        sendSDKOpenActionToUTS();
        C6218a.g0(null);
    }

    public static /* synthetic */ void g(Hashtable hashtable) {
        long j10;
        try {
            if (!qd.c.k()) {
                Q.b(hashtable);
                rd.b.b();
                return;
            }
            Q.D(hashtable);
            if (LiveChatUtil.isEnabled()) {
                Hashtable hashtable2 = (Hashtable) hashtable.get("triggers");
                int intValue = LiveChatUtil.getInteger(hashtable2.get("type")).intValue();
                if (hasAlreadyTriggered() && intValue != 10) {
                    sendTriggerAcknowledgement(LiveChatUtil.getString(hashtable2.get("triggerid")));
                    LiveChatUtil.log("Trigger received but delayed. Type: " + intValue);
                    return;
                }
                if (!LiveChatUtil.isChatEnabled() || LiveChatUtil.checkMultipleChatRestriction() || (intValue != 2 && intValue != 16)) {
                    if (intValue == 10) {
                        Hashtable hashtable3 = (Hashtable) AbstractC6574b.d(LiveChatUtil.getString(hashtable2.get(EventKeys.VALUE_KEY)));
                        String string = LiveChatUtil.getString(hashtable3.get("triggername"));
                        long j11 = getparseTime(LiveChatUtil.getString(hashtable3.get("time")));
                        String string2 = LiveChatUtil.getString(hashtable2.get("triggerid"));
                        Hashtable hashtable4 = (Hashtable) hashtable2.get("visitorinfo");
                        hashtable4.put("triggername", string);
                        Application k10 = MobilistenInitProvider.k();
                        Intent intent = new Intent(k10, (Class<?>) TriggerReceiver.class);
                        intent.putExtra("triggerinfo", hashtable4);
                        intent.putExtra("type", intValue);
                        intent.putExtra("triggerid", string2);
                        if (j11 > 1000) {
                            startTriggerAlarm(k10, intent, j11);
                            return;
                        } else {
                            LiveChatUtil.triggerSalesIQListener("TRIGGER", string, getVisitorObject(hashtable4));
                            sendTriggerAcknowledgement(string2);
                            return;
                        }
                    }
                    return;
                }
                String string3 = LiveChatUtil.getString(hashtable2.get(EventKeys.VALUE_KEY));
                String string4 = LiveChatUtil.getString(hashtable2.get("triggerid"));
                Hashtable hashtable5 = (Hashtable) AbstractC6574b.d(string3);
                String str = (String) hashtable2.get("botid");
                if (intValue == 2) {
                    str = TrackingHelper.INTELLIGENT_TRIGGER;
                }
                com.google.gson.k botTriggeredActionsList = getBotTriggeredActionsList();
                if (str == null || !botTriggeredActionsList.t(str)) {
                    j10 = 1000;
                } else {
                    j10 = 1000;
                    if (ActionState.values()[botTriggeredActionsList.r(str).e().r("state").b()] == ActionState.Delayed) {
                        String str2 = (String) hashtable5.get("dname");
                        HashMap hashMap = new HashMap();
                        hashMap.put("bot_id", str);
                        hashMap.put("bot_name", str2);
                        ne.l.f(new b.a(hashMap));
                        updateBotTriggeredActionsList(str, ActionState.Triggered, getCustomActions(str));
                        LiveChatUtil.triggerChatListener("CHAT_ERROR", null, new b.f());
                    }
                }
                Application k11 = MobilistenInitProvider.k();
                Intent intent2 = new Intent(k11, (Class<?>) TriggerReceiver.class);
                intent2.putExtra("triggerinfo", string3);
                intent2.putExtra("type", intValue);
                intent2.putExtra("triggerid", string4);
                long j12 = 0;
                if (hashtable5 != null) {
                    if (intValue != 2) {
                        j12 = LiveChatUtil.getLong(hashtable5.get("time"));
                    } else if (Tf.b.D(null) == null || !Tf.b.D(null).isIntelligentTrigger()) {
                        j12 = LiveChatUtil.getLong(StringsKt.removeSuffix(LiveChatUtil.getString(hashtable5.get("time")), (CharSequence) " seconds")) * j10;
                    }
                }
                if (Tf.b.n() != null || j12 <= j10) {
                    hashtable5.put("triggerid", string4);
                    executeTrigger(intValue, Tf.b.s() != null ? Tf.b.s().booleanValue() : false, hashtable5);
                } else if (k11 != null) {
                    startTriggerAlarm(k11, intent2, j12);
                }
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static Bot getBot(String str, String str2) {
        List<BotTrigger> botTriggers = getBotTriggers();
        Bot bot = null;
        if (botTriggers != null) {
            for (BotTrigger botTrigger : botTriggers) {
                String event = botTrigger.getEvent();
                String id2 = botTrigger.getId();
                String name = botTrigger.getName();
                List<String> values = botTrigger.getValues();
                if (Objects.equals(str, EVENT_WIDGET_INTERACTION) && Objects.equals(event, EVENT_WIDGET_INTERACTION)) {
                    bot = new Bot(id2, name);
                } else if (Objects.equals(event, EVENT_CUSTOM_ACTIONS) && id2 != null && values != null && values.contains(str2)) {
                    return new Bot(id2, name);
                }
            }
        }
        return bot;
    }

    private static com.google.gson.k getBotTriggeredActionsList() {
        com.google.gson.k kVar;
        Exception e10;
        com.google.gson.k kVar2 = new com.google.gson.k();
        try {
            if (C6218a.M() == null) {
                return kVar2;
            }
            kVar = (com.google.gson.k) Yd.a.j().m(C6218a.M().getString("bot_triggered_actions_list", null), com.google.gson.k.class);
            if (kVar != null) {
                return kVar;
            }
            try {
                return new com.google.gson.k();
            } catch (Exception e11) {
                e10 = e11;
                LiveChatUtil.log(e10);
                return kVar;
            }
        } catch (Exception e12) {
            kVar = kVar2;
            e10 = e12;
        }
    }

    public static List<BotTrigger> getBotTriggers() {
        ArrayList arrayList = new ArrayList();
        if (C6218a.M() != null) {
            try {
                return (List) Yd.a.j().n(C6218a.M().getString("bot_triggers_list", null), new TypeToken<List<BotTrigger>>() { // from class: com.zoho.salesiqembed.android.tracking.UTSUtil.2
                }.getType());
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
        return arrayList;
    }

    public static List<String> getCustomActions(String str) {
        List<BotTrigger> botTriggers = getBotTriggers();
        if (botTriggers == null) {
            return null;
        }
        for (BotTrigger botTrigger : botTriggers) {
            String event = botTrigger.getEvent();
            List<String> values = botTrigger.getValues();
            String id2 = botTrigger.getId();
            if (Objects.equals(event, EVENT_CUSTOM_ACTIONS) && Objects.equals(id2, str)) {
                return values;
            }
        }
        return null;
    }

    private static int getTriggerDelay() {
        try {
            String property = System.getProperty("mobilisten_trigger_delay", "0");
            if (property != null) {
                return Integer.parseInt(property);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static TriggersRepository getTriggersRepository() {
        if (triggersRepository == null) {
            triggersRepository = TriggersRepository.y(MobilistenInitProvider.k());
        }
        return triggersRepository;
    }

    private static x getVisitorObject(Hashtable hashtable) {
        x xVar = new x();
        if (hashtable != null) {
            if (hashtable.containsKey("name")) {
                xVar.z(LiveChatUtil.getString(hashtable.get("name")));
            }
            if (hashtable.containsKey("email")) {
                xVar.v(LiveChatUtil.getString(hashtable.get("email")));
            }
            if (hashtable.containsKey("phone")) {
                xVar.E(LiveChatUtil.getString(hashtable.get("phone")));
            }
            if (hashtable.containsKey("browser")) {
                xVar.s(LiveChatUtil.getString(hashtable.get("browser")));
            }
            if (hashtable.containsKey("os")) {
                xVar.D(LiveChatUtil.getString(hashtable.get("os")));
            }
            if (hashtable.containsKey(EventKeys.IP)) {
                xVar.x(LiveChatUtil.getString(hashtable.get(EventKeys.IP)));
            }
            if (hashtable.containsKey("ccode")) {
                xVar.u(LiveChatUtil.getString(hashtable.get("ccode")));
            }
            if (hashtable.containsKey("se")) {
                xVar.G(LiveChatUtil.getString(hashtable.get("se")));
            }
            if (hashtable.containsKey("sk")) {
                xVar.H(LiveChatUtil.getString(hashtable.get("sk")));
            }
            if (hashtable.containsKey(EventKeys.REGION)) {
                xVar.F(LiveChatUtil.getString(hashtable.get(EventKeys.REGION)));
            }
            if (hashtable.containsKey("state")) {
                xVar.I(LiveChatUtil.getString(hashtable.get("state")));
            }
            if (hashtable.containsKey("city")) {
                xVar.t(LiveChatUtil.getString(hashtable.get("city")));
            }
            if (hashtable.containsKey("chats")) {
                xVar.B(LiveChatUtil.getLong(hashtable.get("chats")));
            }
            if (hashtable.containsKey("visits")) {
                xVar.C(LiveChatUtil.getLong(hashtable.get("visits")));
            }
            if (hashtable.containsKey("noofdays")) {
                xVar.A(LiveChatUtil.getLong(hashtable.get("noofdays")));
            }
            if (hashtable.containsKey("totaltime")) {
                xVar.J(LiveChatUtil.getString(hashtable.get("totaltime")));
            }
            if (hashtable.containsKey("fintime")) {
                xVar.w(new Date(LiveChatUtil.getLong(hashtable.get("fintime"))));
            }
            if (hashtable.containsKey("lvtime")) {
                xVar.y(new Date(LiveChatUtil.getLong(hashtable.get("lvtime"))));
            }
        }
        return xVar;
    }

    private static long getparseTime(String str) {
        int intValue;
        int i10;
        int i11;
        try {
            String lowerCase = str.toLowerCase();
            if (lowerCase.contains("second")) {
                i11 = Integer.valueOf(lowerCase.split(" ")[0]).intValue() * 1000;
            } else {
                if (lowerCase.contains("minute")) {
                    intValue = Integer.valueOf(lowerCase.split(" ")[0]).intValue();
                    i10 = 60000;
                } else {
                    if (!lowerCase.contains("hour")) {
                        return 2000L;
                    }
                    intValue = Integer.valueOf(lowerCase.split(" ")[0]).intValue();
                    i10 = 3600000;
                }
                i11 = intValue * i10;
            }
            return i11;
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return 2000L;
        }
    }

    public static void handleProactiveChat(Hashtable hashtable) {
        conversationUtsEventsHandler.u(hashtable);
    }

    public static void handleTrigger(final Hashtable hashtable) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: com.zoho.salesiqembed.android.tracking.d
            @Override // java.lang.Runnable
            public final void run() {
                UTSUtil.g(hashtable);
            }
        }, getTriggerDelay());
    }

    private static boolean hasAlreadyTriggered() {
        Iterator it = getBotTriggeredActionsList().q().iterator();
        while (it.hasNext()) {
            ActionState actionState = ActionState.values()[((com.google.gson.h) ((Map.Entry) it.next()).getValue()).e().r("state").b()];
            if (actionState == ActionState.Delayed || actionState == ActionState.Triggered) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasToWaitForTrigger() {
        return isBotNeedToBeTriggered();
    }

    public static boolean hasTriggerBeenRequested() {
        Iterator it = getBotTriggeredActionsList().q().iterator();
        while (it.hasNext()) {
            if (ActionState.values()[((com.google.gson.h) ((Map.Entry) it.next()).getValue()).e().r("state").b()] != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasWidgetInteractionTrigger() {
        Bot bot = getBot(EVENT_WIDGET_INTERACTION, null);
        return (bot == null || bot.getId() == null) ? false : true;
    }

    private static boolean isBotNeedToBeTriggered() {
        boolean z10;
        Iterator it = getBotTriggeredActionsList().q().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (ActionState.values()[((com.google.gson.h) ((Map.Entry) it.next()).getValue()).e().r("state").b()] == ActionState.Triggered) {
                z10 = true;
                break;
            }
        }
        return UTSAdapter.isUtsConnected() && !z10;
    }

    public static boolean isProactiveChatAvailable() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = '7'");
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean isTrackingEnabled() {
        ArrayList arrayList;
        Hashtable androidChannel = LiveChatUtil.getAndroidChannel();
        if (androidChannel == null || (arrayList = (ArrayList) androidChannel.get("components")) == null) {
            return false;
        }
        return arrayList.contains("proactive");
    }

    public static boolean isTriggerChatAvailable() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = '6'");
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static void performCustomAction(String str) {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put("opr", "customaction");
            Hashtable hashtable2 = new Hashtable();
            hashtable2.put("field", str);
            hashtable2.put(EventKeys.VALUE_KEY, new Hashtable());
            hashtable.put("action", hashtable2);
            Hashtable hashtable3 = new Hashtable();
            String n10 = C6218a.n();
            if (n10 != null) {
                hashtable3.put("ptitle", n10);
            }
            if (LiveChatUtil.getLSID() != null) {
                hashtable3.put("lsid", LiveChatUtil.getLSID());
            }
            hashtable.put("navdata", hashtable3);
            hashtable.put("event_time", Long.valueOf(rd.b.f()));
            UTSAdapter.writeData(hashtable);
            Bot bot = getBot(EVENT_CUSTOM_ACTIONS, str);
            com.google.gson.k botTriggeredActionsList = getBotTriggeredActionsList();
            if (bot != null) {
                if (botTriggeredActionsList.size() > 0) {
                    updateBotTriggeredActionsList(bot.getId(), isBotNeedToBeTriggered() ? ActionState.Updated : ActionState.Triggered, getCustomActions(bot.getId()));
                } else {
                    updateBotTriggeredActionsList(bot.getId(), ActionState.Updated, getCustomActions(bot.getId()));
                }
            }
        } catch (C6751f e10) {
            LiveChatUtil.log(e10.getMessage());
        }
    }

    public static void resetTrackingConsent() {
        trackingConsentDialogShown = false;
    }

    public static void sendCustomAction(final String str, boolean z10) {
        if (!UTSAdapter.isUtsConnected()) {
            if (!z10 || ZohoLiveChat.getApplicationManager() == null) {
                return;
            }
            ZohoLiveChat.getApplicationManager();
            if (Uf.j.n() != null) {
                if (!LiveChatUtil.getAllOpenChatIds().isEmpty()) {
                    ZohoSalesIQ.Chat.show();
                    return;
                } else {
                    ZohoLiveChat.getApplicationManager();
                    LiveChatUtil.openNewChat(Uf.j.n(), LiveChatUtil.isConversationEnabled() || LiveChatUtil.isArticlesEnabled(), true);
                    return;
                }
            }
            return;
        }
        if (str != null) {
            Bot bot = getBot(EVENT_CUSTOM_ACTIONS, str);
            final WaitingChatDetails waitingChatDetails = new WaitingChatDetails(bot != null ? bot.getId() : null, bot != null ? bot.getName() : null, bot == null, null, null);
            if (C6218a.k()) {
                performCustomAction(str);
                if (z10) {
                    updateChatUIWithTrigger(waitingChatDetails, hasToWaitForTrigger());
                    return;
                }
                return;
            }
            if (!z10) {
                performCustomAction(str);
                return;
            }
            if (ZohoLiveChat.getApplicationManager() != null) {
                if (bot != null && isBotNeedToBeTriggered()) {
                    ZohoLiveChat.getApplicationManager();
                    LiveChatUtil.openChat(Uf.j.n(), true, false, true, false);
                } else if (LiveChatUtil.getAllOpenChatIds().isEmpty()) {
                    ZohoLiveChat.getApplicationManager();
                    LiveChatUtil.openNewChat(Uf.j.n(), LiveChatUtil.isConversationEnabled() || LiveChatUtil.isArticlesEnabled(), true);
                } else {
                    ZohoSalesIQ.Chat.show();
                }
            }
            if (LiveChatUtil.getAllOpenChatIds().isEmpty() && LiveChatUtil.getChat(LiveChatUtil.getOnGoingChatId()) == null && isBotNeedToBeTriggered()) {
                C6218a.g0(new C6218a.InterfaceC0890a() { // from class: com.zoho.salesiqembed.android.tracking.f
                    @Override // rd.C6218a.InterfaceC0890a
                    public final void a(boolean z11) {
                        UTSUtil.d(WaitingChatDetails.this, str, z11);
                    }
                });
            } else {
                performCustomAction(str);
            }
        }
    }

    public static void sendSDKOpenActionToUTS() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("opr", "action");
        hashtable.put("type", "1");
        try {
            UTSAdapter.writeData(hashtable);
            Bot bot = getBot(EVENT_WIDGET_INTERACTION, null);
            if (bot != null) {
                updateBotTriggeredActionsList(bot.getId(), ActionState.Updated, getCustomActions(bot.getId()));
            }
        } catch (C6751f e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void sendTriggerAcknowledgement(String str) {
        LiveChatUtil.log("UTS trigger acknowledgement called");
        if (UTSAdapter.isUtsConnected()) {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put("opr", "action");
                hashtable.put("type", "7");
                if (str != null) {
                    hashtable.put("triggered_id", str);
                }
                UTSAdapter.writeData(hashtable);
                LiveChatUtil.log("UTS trigger acknowledgement success");
            } catch (C6751f e10) {
                LiveChatUtil.log(e10.getMessage());
            }
        }
    }

    public static void setTrackingConsentDialogShown(boolean z10) {
        trackingConsentDialogShown = z10;
    }

    public static boolean shouldWaitForWidgetInteractionTrigger() {
        return hasWidgetInteractionTrigger();
    }

    private static void startTriggerAlarm(Application application, Intent intent, long j10) {
        long currentTimeMillis = System.currentTimeMillis() + j10;
        intent.putExtra("request_code", currentTimeMillis);
        AlarmManager alarmManager = (AlarmManager) application.getSystemService("alarm");
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, PendingIntent.getBroadcast(application, 1000, intent, 201326592));
            getTriggersRepository().K(Rf.a.PerformedCustomAction, UUID.randomUUID().toString(), currentTimeMillis);
        }
    }

    public static void updateBotTriggeredActionsList(String str, ActionState actionState, List<String> list) {
        com.google.gson.k s10;
        if (!isTrackingEnabled() || C6218a.M() == null) {
            return;
        }
        try {
            com.google.gson.k kVar = (com.google.gson.k) Yd.a.j().m(C6218a.M().getString("bot_triggered_actions_list", null), com.google.gson.k.class);
            if (kVar == null) {
                kVar = new com.google.gson.k();
                s10 = new com.google.gson.k();
            } else {
                s10 = kVar.s(str);
                if (s10 == null) {
                    s10 = new com.google.gson.k();
                }
            }
            if (list != null) {
                s10.p(EventKeys.VALUES_KEY, list.toString());
            }
            if (actionState != null) {
                s10.o("state", Integer.valueOf(actionState.ordinal()));
                kVar.m(str, s10);
            } else {
                kVar.v(str);
            }
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putString("bot_triggered_actions_list", kVar.toString());
            edit.apply();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void updateBotTriggers(ArrayList<Hashtable<String, Object>> arrayList) {
        if (C6218a.M() != null) {
            try {
                SharedPreferences.Editor edit = C6218a.M().edit();
                List<BotTrigger> botTriggers = getBotTriggers();
                if (botTriggers == null || botTriggers.isEmpty()) {
                    edit.putString("bot_triggers_list", arrayList != null ? Yd.a.j().v(arrayList) : null);
                }
                edit.apply();
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    private static void updateChatUIWithTrigger(WaitingChatDetails waitingChatDetails, boolean z10) {
        if (LiveChatUtil.getAllOpenChatIds().isEmpty()) {
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "triggered_chat");
            intent.putExtra("has_to_wait", z10);
            if (waitingChatDetails.getAttenderId() != null) {
                intent.putExtra("bot_id", waitingChatDetails.getAttenderId());
            }
            if (waitingChatDetails.getAttenderName() != null) {
                intent.putExtra("bot_name", waitingChatDetails.getAttenderName());
            }
            intent.putExtra("is_intelligent_trigger", waitingChatDetails.isIntelligentTrigger());
            C1908a.b(MobilistenInitProvider.k()).d(intent);
        }
    }

    public static void updateCustomerInfo() {
        if (UTSAdapter.isUtsConnected()) {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put("opr", "updateinfo");
                hashtable.put("cinfo", AbstractC6574b.g(MobilistenUtil.i().b().b()));
                UTSAdapter.writeData(hashtable);
            } catch (Exception | C6751f e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public static void updateEmail(String str) {
        if (UTSAdapter.isUtsConnected()) {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put("opr", "updateinfo");
                hashtable.put("email", str);
                try {
                    UTSAdapter.writeData(hashtable);
                } catch (C6751f e10) {
                    LiveChatUtil.log(e10.getMessage());
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }
    }

    public static void updateName(Hashtable hashtable) {
        try {
            if (hashtable.containsKey("name")) {
                String string = LiveChatUtil.getString(hashtable.get("name"));
                String string2 = LiveChatUtil.getString(hashtable.get("token"));
                if (string.trim().isEmpty() || string2.equalsIgnoreCase(string)) {
                    string = "Visitor " + string2;
                }
                Ye.d.r(De.a.VisitorName, string).a();
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void updatePageTitle(String str) {
        if (UTSAdapter.isUtsConnected()) {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put("opr", "nav");
                Hashtable hashtable2 = new Hashtable();
                hashtable2.put("mpage", str);
                hashtable.put("navdata", hashtable2);
                try {
                    UTSAdapter.writeData(hashtable);
                } catch (C6751f e10) {
                    LiveChatUtil.log(e10.getMessage());
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }
    }

    public static void updatePhone(String str) {
        if (UTSAdapter.isUtsConnected()) {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put("opr", "updateinfo");
                hashtable.put("phone", str);
                try {
                    UTSAdapter.writeData(hashtable);
                } catch (C6751f e10) {
                    LiveChatUtil.log(e10.getMessage());
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }
    }

    public static void updateSDKOpen(boolean z10) {
        if (UTSAdapter.isUtsConnected()) {
            final Bot bot = getBot(EVENT_WIDGET_INTERACTION, null);
            final WaitingChatDetails waitingChatDetails = new WaitingChatDetails(bot != null ? bot.getId() : null, bot != null ? bot.getName() : null, bot == null, null, null);
            boolean z11 = z10 && shouldWaitForWidgetInteractionTrigger();
            if (C6218a.k()) {
                if (z11) {
                    updateChatUIWithTrigger(waitingChatDetails, bot != null);
                }
                sendSDKOpenActionToUTS();
            } else if (z11) {
                C6218a.g0(new C6218a.InterfaceC0890a() { // from class: com.zoho.salesiqembed.android.tracking.e
                    @Override // rd.C6218a.InterfaceC0890a
                    public final void a(boolean z12) {
                        UTSUtil.f(WaitingChatDetails.this, bot, z12);
                    }
                });
            } else {
                sendSDKOpenActionToUTS();
            }
        }
    }

    public static void connectToUTS(final Activity activity, boolean z10, int i10) {
        SpannableString spannableString;
        String str;
        String str2;
        try {
            if (!z10) {
                if (trackingConsentDialogShown) {
                    return;
                }
                androidx.appcompat.app.a aVar = trackingConsentAlertDialog;
                if (aVar == null || !aVar.isShowing()) {
                    Q.H(true);
                    androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(activity, qe.d.n(activity));
                    SpannableString spannableString2 = new SpannableString(LiveChatUtil.getTrackingConsentContent());
                    if (spannableString2.length() <= 0) {
                        if (i10 == 1) {
                            spannableString2 = new SpannableString(activity.getString(t.f61054k0));
                        } else {
                            spannableString2 = new SpannableString(activity.getString(t.f61061l0));
                        }
                    }
                    String trackingConsentPolicyUrlContent = LiveChatUtil.getTrackingConsentPolicyUrlContent();
                    if (trackingConsentPolicyUrlContent == null || trackingConsentPolicyUrlContent.length() <= 0) {
                        trackingConsentPolicyUrlContent = activity.getString(t.f61033h0);
                    }
                    String trackingConsentPolicyUrl = LiveChatUtil.getTrackingConsentPolicyUrl();
                    if (TextUtils.isEmpty(trackingConsentPolicyUrl)) {
                        spannableString = spannableString2;
                    } else {
                        SpannableString spannableString3 = new SpannableString(((Object) spannableString2) + " " + trackingConsentPolicyUrlContent);
                        spannableString3.setSpan(new a(trackingConsentPolicyUrl, dVar), spannableString2.length() + 1, spannableString3.length(), 33);
                        spannableString3.setSpan(new ForegroundColorSpan(P.e(dVar, AbstractC5335a.f55002q)), spannableString2.length() + 1, spannableString3.length(), 18);
                        spannableString = spannableString3;
                    }
                    Hashtable trackingButtonContent = LiveChatUtil.getTrackingButtonContent();
                    if (trackingButtonContent != null) {
                        str = LiveChatUtil.getString(trackingButtonContent.get("text1"));
                        str2 = LiveChatUtil.getString(trackingButtonContent.get("text2"));
                    } else {
                        str = "";
                        str2 = "";
                    }
                    if (str.length() <= 0) {
                        str = activity.getString(t.f61047j0);
                    }
                    if (str2.length() <= 0) {
                        str2 = activity.getString(t.f61040i0);
                    }
                    trackingConsentAlertDialog = qe.d.g(dVar, null, spannableString, str, new DialogInterface.OnClickListener() { // from class: com.zoho.salesiqembed.android.tracking.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            UTSUtil.c(activity, dialogInterface, i11);
                        }
                    }, Integer.valueOf(P.e(dVar, AbstractC5335a.f55002q)), str2, new DialogInterface.OnClickListener() { // from class: com.zoho.salesiqembed.android.tracking.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            UTSUtil.e(dialogInterface, i11);
                        }
                    }, Integer.valueOf(P.e(dVar, AbstractC5335a.f55002q)), null, new DialogInterface.OnDismissListener() { // from class: com.zoho.salesiqembed.android.tracking.i
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            UTSUtil.a(dialogInterface);
                        }
                    }, i10 != 2);
                    return;
                }
                return;
            }
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: com.zoho.salesiqembed.android.tracking.j
                @Override // java.lang.Runnable
                public final void run() {
                    UTSUtil.b(activity);
                }
            });
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void updateName(String str) {
        if (UTSAdapter.isUtsConnected()) {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put("opr", "updateinfo");
                hashtable.put("name", str);
                try {
                    UTSAdapter.writeData(hashtable);
                    Ye.d.r(De.a.VisitorName, Q.u()).a();
                    Q.N(null);
                } catch (C6751f e10) {
                    LiveChatUtil.log(e10.getMessage());
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }
    }
}
