package com.zohosalesiq.reactlibrary;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.NotificationListener;
import com.zoho.livechat.android.VisitorChat;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.ConversationListener;
import com.zoho.livechat.android.listeners.DepartmentListener;
import com.zoho.livechat.android.listeners.FAQCategoryListener;
import com.zoho.livechat.android.listeners.FAQListener;
import com.zoho.livechat.android.listeners.OperatorImageListener;
import com.zoho.livechat.android.listeners.RegisterListener;
import com.zoho.livechat.android.listeners.SalesIQActionListener;
import com.zoho.livechat.android.listeners.SalesIQChatListener;
import com.zoho.livechat.android.listeners.SalesIQCustomActionListener;
import com.zoho.livechat.android.listeners.SalesIQListener;
import com.zoho.livechat.android.listeners.UnRegisterListener;
import com.zoho.livechat.android.models.SalesIQArticle;
import com.zoho.livechat.android.models.SalesIQArticleCategory;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.Resource;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceCategoryListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceDepartmentsListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener;
import com.zoho.livechat.android.modules.notifications.sdk.entities.SalesIQNotificationPayload;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiq.core.reactlibrary.RNZohoSalesIQCore;
import com.zoho.salesiqembed.ZohoSalesIQ;
import hg.C4507a;
import ie.b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb.C5444x;
import mg.EnumC5584a;
import n.AbstractC5596a;
import nd.EnumC5697a;
import nd.c;
import od.C5877c;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONObject;
import pg.C6069a;
import rd.C6218a;
import sd.EnumC6361a;
import ue.C6549a;
import vd.C6685a;
import ve.InterfaceC6686a;

/* loaded from: classes4.dex */
public final class C0 {

    /* renamed from: b, reason: collision with root package name */
    public static String f44681b;

    /* renamed from: d, reason: collision with root package name */
    public static ReactApplicationContext f44683d;

    /* renamed from: h, reason: collision with root package name */
    public static b f44687h;

    /* renamed from: i, reason: collision with root package name */
    public static C0 f44688i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f44689j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f44690k;

    /* renamed from: l, reason: collision with root package name */
    public static HashMap f44691l;

    /* renamed from: a, reason: collision with root package name */
    public static final a f44680a = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f44682c = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f44684e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final Hashtable f44685f = new Hashtable();

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f44686g = new Handler(Looper.getMainLooper());

    public static final class a {

        /* renamed from: com.zohosalesiq.reactlibrary.C0$a$a, reason: collision with other inner class name */
        public static final class C0648a implements RegisterListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f44692a;

            public C0648a(String str) {
                this.f44692a = str;
            }

            @Override // com.zoho.livechat.android.listeners.RegisterListener
            public void onFailure(int i10, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
            }

            @Override // com.zoho.livechat.android.listeners.RegisterListener
            public void onSuccess() {
                SharedPreferences M10;
                ne.l.f(new b.o(this.f44692a, null, 2, null));
                LiveChatUtil.log("MobilistenEncryptedSharedPreferences- re-registering visitor success");
                if (!Yd.a.o().contains("are_new_encrypted_keys_present_in_default_preferences") || !Yd.a.o().getBoolean("are_new_encrypted_keys_present_in_default_preferences", true)) {
                    SharedPreferences.Editor edit = Yd.a.o().edit();
                    edit.remove("is_encrypted_shared_preference_failure_acknowledged");
                    edit.commit();
                } else {
                    if (C6218a.M() == null || (M10 = C6218a.M()) == null) {
                        return;
                    }
                    SharedPreferences.Editor edit2 = M10.edit();
                    edit2.putBoolean("is_encrypted_shared_preference_failure_acknowledged", true);
                    edit2.commit();
                }
            }
        }

        public static final class b implements nd.e {
            final /* synthetic */ boolean[] $canInvokeCallBack;

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Activity f44693a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callback f44694b;

            public b(Activity activity, Callback callback, boolean[] zArr) {
                this.f44693a = activity;
                this.f44694b = callback;
                this.$canInvokeCallBack = zArr;
            }

            @Override // nd.e
            public void a() {
                if (C0.f44681b != null) {
                    ZohoSalesIQ.j.d(C0.f44681b, C0.f44682c);
                }
                if (this.f44693a != null && ZohoLiveChat.getApplicationManager() != null) {
                    ne.j.s0(false, 1, null);
                }
                Callback callback = this.f44694b;
                if (callback != null) {
                    boolean[] zArr = this.$canInvokeCallBack;
                    if (zArr[0]) {
                        zArr[0] = false;
                        callback.invoke(Boolean.TRUE);
                    }
                }
            }

            @Override // nd.e
            public void b() {
                Callback callback = this.f44694b;
                if (callback != null) {
                    boolean[] zArr = this.$canInvokeCallBack;
                    if (zArr[0]) {
                        zArr[0] = false;
                        callback.invoke(Boolean.FALSE);
                    }
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String str, boolean z10) {
            C0.f44681b = str;
            C0.f44682c = z10;
            ZohoSalesIQ.j.d(str, C0.f44682c);
        }

        public final void b(String event, Object obj) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (C0.f44683d == null || !C0.f44690k) {
                LiveChatUtil.log("eventEmitter, Added pending event: " + event);
                if (C0.f44691l == null) {
                    C0.f44691l = new HashMap();
                }
                HashMap hashMap = C0.f44691l;
                Intrinsics.checkNotNull(hashMap);
                hashMap.put(event, obj);
                return;
            }
            LiveChatUtil.log("eventEmitter, Send event: " + event);
            ReactApplicationContext reactApplicationContext = C0.f44683d;
            Intrinsics.checkNotNull(reactApplicationContext);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(event, obj);
            LiveChatUtil.log("eventEmitter, Event: " + event + " sent");
        }

        public final EnumC5697a c(String componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            switch (componentName.hashCode()) {
                case -2139919396:
                    if (componentName.equals("VISITOR_NAME")) {
                        return EnumC5697a.visitorName;
                    }
                    return null;
                case -2086244949:
                    if (componentName.equals("MEDIA_CAPTURE")) {
                        return EnumC5697a.takePhoto;
                    }
                    return null;
                case -1952129204:
                    if (componentName.equals("VOICE_NOTE_WHEN_BOT_CONNECTED")) {
                        return EnumC5697a.voiceNoteWhenBotConnected;
                    }
                    return null;
                case -1884772963:
                    if (componentName.equals("RATING")) {
                        return EnumC5697a.rating;
                    }
                    return null;
                case -1881221379:
                    if (componentName.equals("REOPEN")) {
                        return EnumC5697a.reopen;
                    }
                    return null;
                case -786189681:
                    if (componentName.equals("PRE_CHAT_FORM")) {
                        return EnumC5697a.prechatForm;
                    }
                    return null;
                case -749757636:
                    if (componentName.equals("FILE_SHARE")) {
                        return EnumC5697a.fileShare;
                    }
                    return null;
                case 68795:
                    if (componentName.equals("END")) {
                        return EnumC5697a.end;
                    }
                    return null;
                case 2060894:
                    if (componentName.equals("CALL")) {
                        return EnumC5697a.call;
                    }
                    return null;
                case 58726162:
                    if (componentName.equals("FILE_SHARING_WHEN_BOT_CONNECTED")) {
                        return EnumC5697a.fileSharingWhenBotConnected;
                    }
                    return null;
                case 68645222:
                    if (componentName.equals("SCREENSHOT")) {
                        return EnumC5697a.screenshot;
                    }
                    return null;
                case 591125381:
                    if (componentName.equals("FEEDBACK")) {
                        return EnumC5697a.feedback;
                    }
                    return null;
                case 623187034:
                    if (componentName.equals("TAKE_PHOTO")) {
                        return EnumC5697a.takePhoto;
                    }
                    return null;
                case 1126473453:
                    if (componentName.equals("RECORD_VIDEO")) {
                        return EnumC5697a.recordVideo;
                    }
                    return null;
                case 1184644783:
                    if (componentName.equals("END_WHEN_OPERATOR_CONNECTED")) {
                        return EnumC5697a.endWhenOperatorConnected;
                    }
                    return null;
                case 1361572880:
                    if (componentName.equals("END_WHEN_BOT_CONNECTED")) {
                        return EnumC5697a.endWhenBotConnected;
                    }
                    return null;
                case 1411457504:
                    if (componentName.equals("OPERATOR_IMAGE")) {
                        return EnumC5697a.operatorImage;
                    }
                    return null;
                case 1506633784:
                    if (componentName.equals("END_WHEN_IN_QUEUE")) {
                        return EnumC5697a.endWhenInQueue;
                    }
                    return null;
                case 1822346016:
                    if (componentName.equals("MEDIA_LIBRARY")) {
                        return EnumC5697a.gallery;
                    }
                    return null;
                case 1869095001:
                    if (componentName.equals("EMAIL_TRANSCRIPT")) {
                        return EnumC5697a.emailTranscript;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final WritableMap d(VisitorChat chat) {
            Intrinsics.checkNotNullParameter(chat, "chat");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(StackTraceHelper.ID_KEY, chat.d());
            writableNativeMap.putInt("unreadCount", chat.l());
            writableNativeMap.putBoolean("isBotAttender", chat.m());
            if (chat.j() > 0) {
                writableNativeMap.putInt("queuePosition", chat.j());
            }
            if (chat.i() != null) {
                writableNativeMap.putString("question", chat.i());
            }
            if (chat.f() != null) {
                writableNativeMap.putString("departmentName", chat.f());
            }
            if (chat.e() != null) {
                writableNativeMap.putString("status", chat.e());
            }
            VisitorChat.a h10 = chat.h();
            if (h10 != null) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                if (h10.c() != null) {
                    writableNativeMap.putString("lastMessage", h10.c());
                    writableNativeMap2.putString("text", h10.c());
                }
                if (h10.b() != null) {
                    writableNativeMap.putString("lastMessageSender", h10.b());
                    writableNativeMap2.putString("sender", h10.b());
                }
                if (h10.d() != null && h10.d().longValue() > 0) {
                    writableNativeMap.putString("lastMessageTime", LiveChatUtil.getString(h10.d()));
                    writableNativeMap2.putString("time", LiveChatUtil.getString(h10.d()));
                }
                writableNativeMap2.putBoolean("is_read", h10.e());
                VisitorChat.a.C0607a a10 = h10.a();
                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                if (a10 != null) {
                    writableNativeMap3.putString("name", a10.c());
                    writableNativeMap3.putString("content_type", a10.b());
                    writableNativeMap3.putString("comment", a10.a());
                    writableNativeMap3.putDouble("size", LiveChatUtil.getDouble(a10.d()));
                    writableNativeMap2.putMap("file", writableNativeMap3);
                }
                writableNativeMap.putMap("recentMessage", writableNativeMap2);
            }
            if (chat.c() != null) {
                writableNativeMap.putString("attenderName", chat.c());
            }
            if (chat.b() != null) {
                writableNativeMap.putString("attenderID", chat.b());
            }
            if (chat.a() != null) {
                writableNativeMap.putString("attenderEmail", chat.a());
            }
            if (chat.g() != null) {
                writableNativeMap.putString(EventGroupType.FEEDBACK_EVENT_GROUP, chat.g());
            }
            if (chat.k() != null) {
                writableNativeMap.putString("rating", chat.k());
            }
            return writableNativeMap;
        }

        public final WritableMap e(SalesIQNotificationPayload salesIQNotificationPayload) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap(EventKeys.PAYLOAD, RNZohoSalesIQCore.f44615a.l(salesIQNotificationPayload));
            if (salesIQNotificationPayload instanceof SalesIQNotificationPayload.Chat) {
                writableNativeMap.putString("type", "chat");
                return writableNativeMap;
            }
            if (salesIQNotificationPayload instanceof SalesIQNotificationPayload.VisitorHistory) {
                writableNativeMap.putString("type", "visitorHistory");
                return writableNativeMap;
            }
            if (salesIQNotificationPayload instanceof SalesIQNotificationPayload.EndChatDetails) {
                writableNativeMap.putString("type", "endChatDetails");
                return writableNativeMap;
            }
            if (!(salesIQNotificationPayload instanceof SalesIQNotificationPayload.Call)) {
                return null;
            }
            writableNativeMap.putString("type", "call");
            return writableNativeMap;
        }

        public final WritableMap f() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, 100);
            writableNativeMap.putString("message", "Invalid resource type");
            return writableNativeMap;
        }

        public final C0 g() {
            return C0.f44688i;
        }

        public final ZohoSalesIQ.l h(String str) {
            if (str == null) {
                return null;
            }
            if (Intrinsics.areEqual(d.f44697b.b(), str)) {
                return ZohoSalesIQ.l.Conversations;
            }
            if (Intrinsics.areEqual(d.f44699d.b(), str) || Intrinsics.areEqual(d.f44698c.b(), str)) {
                return ZohoSalesIQ.l.KnowledgeBase;
            }
            return null;
        }

        public final ZohoSalesIQ.h.a i(String mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            return Intrinsics.areEqual("LAUNCHER_VISIBILITY_MODE_ALWAYS", mode) ? ZohoSalesIQ.h.a.ALWAYS : Intrinsics.areEqual("LAUNCHER_VISIBILITY_MODE_WHEN_ACTIVE_CHAT", mode) ? ZohoSalesIQ.h.a.WHEN_ACTIVE_CHAT : ZohoSalesIQ.h.a.NEVER;
        }

        public final WritableMap j(od.x siqVisitor) {
            Intrinsics.checkNotNullParameter(siqVisitor, "siqVisitor");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (siqVisitor.h() != null) {
                writableNativeMap.putString("name", siqVisitor.h());
            }
            if (siqVisitor.d() != null) {
                writableNativeMap.putString("email", siqVisitor.d());
            }
            if (siqVisitor.m() != null) {
                writableNativeMap.putString("phone", siqVisitor.m());
            }
            writableNativeMap.putString("numberOfChats", LiveChatUtil.getString(Long.valueOf(siqVisitor.j())));
            if (siqVisitor.b() != null) {
                writableNativeMap.putString("city", siqVisitor.b());
            }
            if (siqVisitor.f() != null) {
                writableNativeMap.putString(EventKeys.IP, siqVisitor.f());
            }
            if (siqVisitor.e() != null) {
                writableNativeMap.putString("firstVisitTime", LiveChatUtil.getString(Long.valueOf(siqVisitor.e().getTime())));
            }
            if (siqVisitor.g() != null) {
                writableNativeMap.putString("lastVisitTime", LiveChatUtil.getString(Long.valueOf(siqVisitor.g().getTime())));
            }
            if (siqVisitor.n() != null) {
                writableNativeMap.putString(EventKeys.REGION, siqVisitor.n());
            }
            if (siqVisitor.l() != null) {
                writableNativeMap.putString("os", siqVisitor.l());
            }
            if (siqVisitor.c() != null) {
                writableNativeMap.putString("countryCode", siqVisitor.c());
            }
            if (siqVisitor.a() != null) {
                writableNativeMap.putString("browser", siqVisitor.a());
            }
            if (siqVisitor.r() != null) {
                writableNativeMap.putString("totalTimeSpent", siqVisitor.r());
            }
            writableNativeMap.putString("numberOfVisits", LiveChatUtil.getString(Long.valueOf(siqVisitor.k())));
            writableNativeMap.putString("noOfDaysVisited", LiveChatUtil.getString(Long.valueOf(siqVisitor.i())));
            if (siqVisitor.q() != null) {
                writableNativeMap.putString("state", siqVisitor.q());
            }
            if (siqVisitor.o() != null) {
                writableNativeMap.putString("searchEngine", siqVisitor.o());
            }
            if (siqVisitor.p() != null) {
                writableNativeMap.putString("searchQuery", siqVisitor.p());
            }
            return writableNativeMap;
        }

        public final void k(ReadableNativeMap map) {
            SharedPreferences M10;
            Intrinsics.checkNotNullParameter(map, "map");
            if (map.hasKey("type")) {
                String string = map.getString("type");
                String string2 = map.getString("userId");
                if (Intrinsics.areEqual("registered_visitor", string)) {
                    if (string2 == null || TextUtils.isEmpty(string2)) {
                        return;
                    }
                    LiveChatUtil.log("MobilistenEncryptedSharedPreferences- re-registering visitor");
                    LiveChatUtil.registerVisitor(string2, new C0648a(string2));
                    return;
                }
                if (Intrinsics.areEqual("guest", string)) {
                    LiveChatUtil.log("MobilistenEncryptedSharedPreferences- Guest user acknowledged");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("avuid", LiveChatUtil.getAVUID());
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                    ne.l.f(new b.n(jSONObject.toString(), null, 2, null));
                    if (!Yd.a.o().contains("are_new_encrypted_keys_present_in_default_preferences") || !Yd.a.o().getBoolean("are_new_encrypted_keys_present_in_default_preferences", true)) {
                        SharedPreferences.Editor edit = Yd.a.o().edit();
                        edit.remove("is_encrypted_shared_preference_failure_acknowledged");
                        edit.commit();
                    } else {
                        if (C6218a.M() == null || (M10 = C6218a.M()) == null) {
                            return;
                        }
                        SharedPreferences.Editor edit2 = M10.edit();
                        edit2.putBoolean("is_encrypted_shared_preference_failure_acknowledged", true);
                        edit2.commit();
                    }
                }
            }
        }

        public final void l(Application application, Activity activity, String appKey, String accessKey, Callback callback) {
            nd.b bVar;
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            if (application != null) {
                boolean[] zArr = {true};
                ZohoSalesIQ.setPlatformName("ReactNative-Android");
                if (C0.f44687h != null) {
                    bVar = new nd.b();
                    b bVar2 = C0.f44687h;
                    Intrinsics.checkNotNull(bVar2);
                    bVar.c(1, bVar2.b());
                    b bVar3 = C0.f44687h;
                    Intrinsics.checkNotNull(bVar3);
                    bVar.c(2, bVar3.a());
                } else {
                    bVar = null;
                }
                ZohoSalesIQ.init(application, appKey, accessKey, bVar, new b(activity, callback, zArr));
                if (activity == null || ZohoLiveChat.getApplicationManager() == null) {
                    return;
                }
                Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
                Intrinsics.checkNotNull(applicationManager);
                applicationManager.R(activity);
                Uf.j applicationManager2 = ZohoLiveChat.getApplicationManager();
                Intrinsics.checkNotNull(applicationManager2);
                applicationManager2.Q(activity);
            }
        }

        public final void m(Application application) {
            if (C0.f44689j || application == null) {
                return;
            }
            C5877c.a(application);
            c cVar = new c();
            ZohoLiveChat.setListener(cVar);
            ZohoSalesIQ.Chat.setListener(cVar);
            ZohoSalesIQ.g.n(cVar);
            ZohoLiveChat.a.d(cVar);
            ZohoSalesIQ.j.l(cVar);
            C0.f44689j = true;
            LiveChatUtil.log("Callbacks registered");
        }

        public final void n(ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            if (g() == null) {
                synchronized (C0.class) {
                    try {
                        a aVar = C0.f44680a;
                        if (aVar.g() == null) {
                            aVar.o(new C0(reactContext, null));
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final void o(C0 c02) {
            C0.f44688i = c02;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f44695a;

        /* renamed from: b, reason: collision with root package name */
        public String f44696b;

        public final String a() {
            return this.f44696b;
        }

        public final String b() {
            return this.f44695a;
        }

        public final void c(String str) {
            this.f44696b = str;
        }

        public final void d(String str) {
            this.f44695a = str;
        }
    }

    public static final class c implements SalesIQListener, SalesIQChatListener, SalesIQKnowledgeBaseListener, SalesIQActionListener, NotificationListener {
        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleBotTrigger() {
            a aVar = C0.f44680a;
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_BOT_TRIGGER", null));
            aVar.b("EVENT_BOT_TRIGGER", null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatAttended(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_ATTENDED", d10.copy()));
            aVar.b("EVENT_CHAT_ATTENDED", d10);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatClosed(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_CLOSED", d10.copy()));
            aVar.b("EVENT_CHAT_CLOSED", d10);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatMissed(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_MISSED", d10.copy()));
            aVar.b("EVENT_CHAT_MISSED", d10);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatOpened(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_OPENED", d10.copy()));
            aVar.b("EVENT_CHAT_OPENED", d10);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatReOpened(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_REOPENED", d10.copy()));
            aVar.b("EVENT_CHAT_REOPENED", d10);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatViewClose(String str) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(StackTraceHelper.ID_KEY, str);
            a aVar = C0.f44680a;
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHATVIEW_CLOSED", writableNativeMap));
            aVar.b("EVENT_CHATVIEW_CLOSED", str);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleChatViewOpen(String str) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(StackTraceHelper.ID_KEY, str);
            a aVar = C0.f44680a;
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHATVIEW_OPENED", writableNativeMap));
            aVar.b("EVENT_CHATVIEW_OPENED", str);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQActionListener
        public void handleCustomAction(od.z salesIQCustomAction, SalesIQCustomActionListener salesIQCustomActionListener) {
            Intrinsics.checkNotNullParameter(salesIQCustomAction, "salesIQCustomAction");
            Intrinsics.checkNotNullParameter(salesIQCustomActionListener, "salesIQCustomActionListener");
            UUID randomUUID = UUID.randomUUID();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("uuid", randomUUID.toString());
            writableNativeMap.putString("elementID", salesIQCustomAction.f61206a);
            writableNativeMap.putString(AnnotatedPrivateKey.LABEL, salesIQCustomAction.f61208c);
            writableNativeMap.putString("name", salesIQCustomAction.f61207b);
            writableNativeMap.putString("clientActionName", salesIQCustomAction.f61209d);
            C0.f44685f.put(randomUUID.toString(), salesIQCustomActionListener);
            a aVar = C0.f44680a;
            aVar.b("EVENT_PERFORM_CHATACTION", writableNativeMap.copy());
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_PERFORM_CHATACTION", writableNativeMap));
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleCustomLauncherVisibility(boolean z10) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean(ViewProps.VISIBLE, z10);
            a aVar = C0.f44680a;
            aVar.b("LAUNCHER_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_HANDLE_CUSTOM_LAUNCHER_VISIBILITY", writableNativeMap));
            aVar.b("EVENT_HANDLE_CUSTOM_LAUNCHER_VISIBILITY", Boolean.valueOf(z10));
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleFeedback(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("EVENT_FEEDBACK_RECEIVED", d10.copy());
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_FEEDBACK_RECEIVED", d10));
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleIPBlock() {
            a aVar = C0.f44680a;
            aVar.b("ZSIQ_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_VISITOR_IPBLOCKED", null));
            aVar.b("EVENT_VISITOR_IPBLOCKED", null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleOperatorsOffline() {
            a aVar = C0.f44680a;
            aVar.b("ZSIQ_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_OPERATORS_OFFLINE", null));
            aVar.b("EVENT_OPERATORS_OFFLINE", null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleOperatorsOnline() {
            a aVar = C0.f44680a;
            aVar.b("ZSIQ_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_OPERATORS_ONLINE", null));
            aVar.b("EVENT_OPERATORS_ONLINE", null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleQueuePositionChange(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("EVENT_CHAT_QUEUE_POSITION_CHANGED", d10.copy());
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_QUEUE_POSITION_CHANGED", d10));
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void handleRating(VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_RATING_RECEIVED", d10.copy()));
            aVar.b("EVENT_RATING_RECEIVED", d10);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener
        public void handleResourceClosed(ZohoSalesIQ.k type, Resource resource) {
            Intrinsics.checkNotNullParameter(type, "type");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("type", "RESOURCE_ARTICLES");
            RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
            writableNativeMap.putMap("resource", companion.l(resource));
            a aVar = C0.f44680a;
            aVar.b("EVENT_RESOURCE_CLOSED", writableNativeMap.copy());
            aVar.b("KNOWLEDGEBASE_EVENT_LISTENER", companion.d("EVENT_RESOURCE_CLOSED", writableNativeMap));
            aVar.b("EVENT_ARTICLE_CLOSED", resource != null ? resource.getId() : null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener
        public void handleResourceDisliked(ZohoSalesIQ.k type, Resource resource) {
            Intrinsics.checkNotNullParameter(type, "type");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("type", "RESOURCE_ARTICLES");
            RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
            writableNativeMap.putMap("resource", companion.l(resource));
            a aVar = C0.f44680a;
            aVar.b("EVENT_RESOURCE_DISLIKED", writableNativeMap.copy());
            aVar.b("KNOWLEDGEBASE_EVENT_LISTENER", companion.d("EVENT_RESOURCE_DISLIKED", writableNativeMap));
            aVar.b("EVENT_ARTICLE_DISLIKED", resource != null ? resource.getId() : null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener
        public void handleResourceLiked(ZohoSalesIQ.k type, Resource resource) {
            Intrinsics.checkNotNullParameter(type, "type");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("type", "RESOURCE_ARTICLES");
            RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
            writableNativeMap.putMap("resource", companion.l(resource));
            a aVar = C0.f44680a;
            aVar.b("EVENT_RESOURCE_LIKED", writableNativeMap.copy());
            aVar.b("KNOWLEDGEBASE_EVENT_LISTENER", companion.d("EVENT_RESOURCE_LIKED", writableNativeMap));
            aVar.b("EVENT_ARTICLE_LIKED", resource != null ? resource.getId() : null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener
        public void handleResourceOpened(ZohoSalesIQ.k type, Resource resource) {
            Intrinsics.checkNotNullParameter(type, "type");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("type", "RESOURCE_ARTICLES");
            RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
            writableNativeMap.putMap("resource", companion.l(resource));
            a aVar = C0.f44680a;
            aVar.b("EVENT_RESOURCE_OPENED", writableNativeMap.copy());
            aVar.b("KNOWLEDGEBASE_EVENT_LISTENER", companion.d("EVENT_RESOURCE_OPENED", writableNativeMap));
            aVar.b("EVENT_ARTICLE_OPENED", resource != null ? resource.getId() : null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleSupportClose() {
            a aVar = C0.f44680a;
            aVar.b("ZSIQ_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_SUPPORT_CLOSED", null));
            aVar.b("EVENT_SUPPORT_CLOSED", null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleSupportOpen() {
            a aVar = C0.f44680a;
            aVar.b("ZSIQ_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_SUPPORT_OPENED", null));
            aVar.b("EVENT_SUPPORT_OPENED", null);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public void handleTrigger(String str, od.x xVar) {
            WritableMap j10 = xVar != null ? C0.f44680a.j(xVar) : null;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("triggerName", str);
            writableNativeMap.putMap("visitorInformation", j10);
            a aVar = C0.f44680a;
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CUSTOMTRIGGER", writableNativeMap.copy()));
            aVar.b("EVENT_CUSTOMTRIGGER", writableNativeMap);
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public boolean handleUri(Uri uri, VisitorChat visitorChat) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(visitorChat, "visitorChat");
            a aVar = C0.f44680a;
            WritableMap d10 = aVar.d(visitorChat);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("chat", d10.copy());
            writableNativeMap.putString(EventKeys.URL, uri.toString());
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_HANDLE_URL", writableNativeMap));
            d10.putString(EventKeys.URL, uri.toString());
            aVar.b("EVENT_HANDLE_URL", d10);
            return C0.f44684e;
        }

        @Override // com.zoho.livechat.android.NotificationListener
        public void onBadgeChange(int i10) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("count", i10);
            a aVar = C0.f44680a;
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_UNREAD_COUNT_CHANGED", writableNativeMap));
            aVar.b("EVENT_CHAT_UNREAD_COUNT_CHANGED", Integer.valueOf(i10));
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQChatListener
        public void onChatExpired(VisitorChat visitorChat) {
            WritableMap d10 = visitorChat != null ? C0.f44680a.d(visitorChat) : null;
            a aVar = C0.f44680a;
            aVar.b("CHAT_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_CHAT_EXPIRED", d10 != null ? d10.copy() : null));
            aVar.b("EVENT_CHAT_EXPIRED", d10);
        }

        @Override // com.zoho.livechat.android.NotificationListener
        public void onClick(Context context, SalesIQNotificationPayload payload) {
            Intent intent;
            Intrinsics.checkNotNullParameter(payload, "payload");
            LiveChatUtil.log("NotificationListener onClick Received");
            a aVar = C0.f44680a;
            WritableMap e10 = aVar.e(payload);
            if (e10 != null) {
                aVar.b("EVENT_NOTIFICATION_CLICKED", e10.copy());
                aVar.b("NOTIFICATION_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_NOTIFICATION_CLICKED", e10));
            }
            if (C6549a.f66349d.a().j(true)) {
                if (context != null) {
                    intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                } else {
                    if (C0.f44683d != null) {
                        ReactApplicationContext reactApplicationContext = C0.f44683d;
                        Intrinsics.checkNotNull(reactApplicationContext);
                        if (reactApplicationContext.getApplicationContext() != null) {
                            ReactApplicationContext reactApplicationContext2 = C0.f44683d;
                            Intrinsics.checkNotNull(reactApplicationContext2);
                            context = reactApplicationContext2.getApplicationContext();
                            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                            if (intent != null) {
                                intent.addFlags(268435456);
                            }
                        }
                    }
                    intent = null;
                }
                if (intent != null) {
                    Intrinsics.checkNotNull(context);
                    context.startActivity(intent);
                }
            }
        }

        @Override // com.zoho.livechat.android.listeners.SalesIQListener
        public Bd.b onVisitorRegistrationFailed(we.d salesIQError) {
            Intrinsics.checkNotNullParameter(salesIQError, "salesIQError");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, salesIQError.a());
            if (salesIQError.b() != null) {
                writableNativeMap.putString("message", salesIQError.b());
            }
            C0.f44680a.b("ZSIQ_EVENT_LISTENER", RNZohoSalesIQCore.f44615a.d("EVENT_VISITOR_REGISTRATION_FAILURE", writableNativeMap));
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;

        /* renamed from: b, reason: collision with root package name */
        public static final d f44697b = new d("CONVERSATIONS", 0, "TAB_CONVERSATIONS");

        /* renamed from: c, reason: collision with root package name */
        public static final d f44698c = new d("FAQ", 1, "TAB_FAQ");

        /* renamed from: d, reason: collision with root package name */
        public static final d f44699d = new d("KNOWLEDGE_BASE", 2, "TAB_KNOWLEDGE_BASE");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f44700e;

        /* renamed from: a, reason: collision with root package name */
        public final String f44701a;

        static {
            d[] a10 = a();
            $VALUES = a10;
            f44700e = EnumEntriesKt.enumEntries(a10);
        }

        public d(String str, int i10, String str2) {
            this.f44701a = str2;
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{f44697b, f44698c, f44699d};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public final String b() {
            return this.f44701a;
        }
    }

    public static final class e implements OperatorImageListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f44703b;

        public e(Callback callback) {
            this.f44703b = callback;
        }

        @Override // com.zoho.livechat.android.listeners.OperatorImageListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", message);
            this.f44703b.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.listeners.OperatorImageListener
        public void onSuccess(Drawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            Bitmap a12 = C0.this.a1(drawable);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a12.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            Intrinsics.checkNotNull(encodeToString);
            this.f44703b.invoke(null, StringsKt.replace$default(encodeToString, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "", false, 4, (Object) null));
        }
    }

    public static final class f implements FAQListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f44705b;

        public f(Callback callback) {
            this.f44705b = callback;
        }

        @Override // com.zoho.livechat.android.listeners.FAQListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", message);
            this.f44705b.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.listeners.FAQListener
        public void onSuccess(ArrayList articlesList) {
            Intrinsics.checkNotNullParameter(articlesList, "articlesList");
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int size = articlesList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = articlesList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                writableNativeArray.pushMap(C0.this.x1((SalesIQArticle) obj));
            }
            this.f44705b.invoke(null, writableNativeArray);
        }
    }

    public static final class g implements ResourcesListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f44707b;

        public g(Callback callback) {
            this.f44707b = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener
        public void onFailure(int i10, String str) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", str);
            this.f44707b.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener
        public void onSuccess(List articles, boolean z10) {
            Intrinsics.checkNotNullParameter(articles, "articles");
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int size = articles.size();
            for (int i10 = 0; i10 < size; i10++) {
                writableNativeArray.pushMap(C0.this.y1((Resource) articles.get(i10)));
            }
            this.f44707b.invoke(null, writableNativeArray);
        }
    }

    public static final class h implements FAQCategoryListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44708a;

        public h(Callback callback) {
            this.f44708a = callback;
        }

        @Override // com.zoho.livechat.android.listeners.FAQCategoryListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", message);
            this.f44708a.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.listeners.FAQCategoryListener
        public void onSuccess(ArrayList categoryList) {
            Intrinsics.checkNotNullParameter(categoryList, "categoryList");
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int size = categoryList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = categoryList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                SalesIQArticleCategory salesIQArticleCategory = (SalesIQArticleCategory) obj;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(StackTraceHelper.ID_KEY, salesIQArticleCategory.getCategoryId());
                writableNativeMap.putString("name", salesIQArticleCategory.getCategoryName());
                writableNativeMap.putInt("articleCount", salesIQArticleCategory.getCount());
                writableNativeArray.pushMap(writableNativeMap);
            }
            this.f44708a.invoke(null, writableNativeArray);
        }
    }

    public static final class i implements ConversationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44709a;

        public i(Callback callback) {
            this.f44709a = callback;
        }

        @Override // com.zoho.livechat.android.listeners.ConversationListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", message);
            this.f44709a.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.listeners.ConversationListener
        public void onSuccess(ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                writableNativeArray.pushMap(C0.f44680a.d((VisitorChat) obj));
            }
            this.f44709a.invoke(null, writableNativeArray);
        }
    }

    public static final class j implements ConversationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44710a;

        public j(Callback callback) {
            this.f44710a = callback;
        }

        @Override // com.zoho.livechat.android.listeners.ConversationListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", message);
            this.f44710a.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.listeners.ConversationListener
        public void onSuccess(ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                writableNativeArray.pushMap(C0.f44680a.d((VisitorChat) obj));
            }
            this.f44710a.invoke(null, writableNativeArray);
        }
    }

    public static final class k implements DepartmentListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f44712b;

        public k(Callback callback) {
            this.f44712b = callback;
        }

        @Override // com.zoho.livechat.android.listeners.DepartmentListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", message);
            this.f44712b.invoke(writableNativeMap, null);
        }

        @Override // com.zoho.livechat.android.listeners.DepartmentListener
        public void onSuccess(ArrayList departmentList) {
            Intrinsics.checkNotNullParameter(departmentList, "departmentList");
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int size = departmentList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = departmentList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                writableNativeArray.pushMap(C0.this.Q1((od.w) obj));
            }
            this.f44712b.invoke(null, writableNativeArray);
        }
    }

    public static final class l implements ResourceCategoryListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44713a;

        public l(Callback callback) {
            this.f44713a = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceCategoryListener
        public void onFailure(int i10, String str) {
            this.f44713a.invoke(RNZohoSalesIQCore.f44615a.c(i10, str), null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceCategoryListener
        public void onSuccess(List resourceCategories) {
            Intrinsics.checkNotNullParameter(resourceCategories, "resourceCategories");
            this.f44713a.invoke(null, RNZohoSalesIQCore.f44615a.k(resourceCategories));
        }
    }

    public static final class m implements ResourceDepartmentsListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44714a;

        public m(Callback callback) {
            this.f44714a = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceDepartmentsListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f44714a.invoke(RNZohoSalesIQCore.f44615a.c(i10, message), null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceDepartmentsListener
        public void onSuccess(List resourceDepartments) {
            Intrinsics.checkNotNullParameter(resourceDepartments, "resourceDepartments");
            this.f44714a.invoke(null, RNZohoSalesIQCore.f44615a.k(resourceDepartments));
        }
    }

    public static final class n implements ResourcesListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44715a;

        public n(Callback callback) {
            this.f44715a = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener
        public void onFailure(int i10, String str) {
            this.f44715a.invoke(RNZohoSalesIQCore.f44615a.c(i10, str), null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener
        public void onSuccess(List articles, boolean z10) {
            Intrinsics.checkNotNullParameter(articles, "articles");
            this.f44715a.invoke(null, RNZohoSalesIQCore.f44615a.k(articles), Boolean.valueOf(z10));
        }
    }

    public static final class o implements ResourceListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44716a;

        public o(Callback callback) {
            this.f44716a = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceListener
        public void onFailure(int i10, String str) {
            this.f44716a.invoke(RNZohoSalesIQCore.f44615a.c(i10, str), null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceListener
        public void onSuccess(Resource resource) {
            this.f44716a.invoke(null, RNZohoSalesIQCore.f44615a.l(resource));
        }
    }

    public static final class p implements OpenResourceListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44717a;

        public p(Callback callback) {
            this.f44717a = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener
        public void onFailure(int i10, String str) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", str);
            this.f44717a.invoke(writableNativeMap);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener
        public void onSuccess() {
            this.f44717a.invoke("null");
        }
    }

    public static final class q implements OpenResourceListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44718a;

        public q(Callback callback) {
            this.f44718a = callback;
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener
        public void onFailure(int i10, String str) {
            this.f44718a.invoke(RNZohoSalesIQCore.f44615a.c(i10, str), null);
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener
        public void onSuccess() {
            this.f44718a.invoke(null, Boolean.TRUE);
        }
    }

    public static final class r implements RegisterListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44719a;

        public r(Callback callback) {
            this.f44719a = callback;
        }

        @Override // com.zoho.livechat.android.listeners.RegisterListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f44719a.invoke(RNZohoSalesIQCore.f44615a.c(i10, message), Boolean.FALSE);
        }

        @Override // com.zoho.livechat.android.listeners.RegisterListener
        public void onSuccess() {
            this.f44719a.invoke(null, Boolean.TRUE);
        }
    }

    public static final class s implements UnRegisterListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f44720a;

        public s(Callback callback) {
            this.f44720a = callback;
        }

        @Override // com.zoho.livechat.android.listeners.UnRegisterListener
        public void onFailure(int i10, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f44720a.invoke(RNZohoSalesIQCore.f44615a.c(i10, message), Boolean.FALSE);
        }

        @Override // com.zoho.livechat.android.listeners.UnRegisterListener
        public void onSuccess() {
            this.f44720a.invoke(null, Boolean.TRUE);
        }
    }

    public /* synthetic */ C0(ReactApplicationContext reactApplicationContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext);
    }

    public static final void A1(C0 c02, Callback callback) {
        ZohoLiveChat.b.a(c02.new f(callback));
    }

    public static final void A2() {
        ZohoSalesIQ.Chat.show();
    }

    public static final void A3(C0 c02, String str, boolean z10) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.p(e22, z10);
    }

    public static final void B4(Callback[] callbackArr, we.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (callbackArr[0] != null) {
            if (result.d()) {
                VisitorChat visitorChat = (VisitorChat) result.b();
                a aVar = f44680a;
                Intrinsics.checkNotNull(visitorChat);
                WritableMap d10 = aVar.d(visitorChat);
                Callback callback = callbackArr[0];
                Intrinsics.checkNotNull(callback);
                callback.invoke(null, d10);
            } else {
                we.d c10 = result.c();
                Callback callback2 = callbackArr[0];
                Intrinsics.checkNotNull(callback2);
                RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
                Intrinsics.checkNotNull(c10);
                callback2.invoke(companion.c(c10.a(), c10.b()), null);
            }
        }
        callbackArr[0] = null;
    }

    public static final void C1(String str, C0 c02, Callback callback) {
        ZohoSalesIQ.g.i(ZohoSalesIQ.k.Articles, null, str, null, false, c02.new g(callback));
    }

    public static final void C2(String str) {
        ZohoSalesIQ.Chat.open(str);
    }

    public static final void C3(String str) {
        ZohoSalesIQ.Chat.setLanguage(str);
    }

    public static final void D4(boolean z10) {
        ZohoSalesIQ.syncThemeWithOS(z10);
    }

    public static final void E1(Callback callback) {
        ZohoLiveChat.b.c(new h(callback));
    }

    public static final void E2(C0 c02, String str, String str2, Callback callback) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.m(e22, str2, new q(callback));
    }

    public static final void E3(ReadableMap readableMap, C0 c02) {
        int i10;
        int i11;
        int i12;
        nd.c cVar = new nd.c(readableMap.hasKey("mode") ? readableMap.getInt("mode") : 2);
        if (readableMap.hasKey(C5444x.f55808b) && (i12 = readableMap.getInt(C5444x.f55808b)) > -1) {
            cVar.n(Integer.valueOf(i12));
        }
        if (readableMap.hasKey("y") && (i11 = readableMap.getInt("y")) > -1) {
            cVar.o(i11);
        }
        if (readableMap.hasKey("yFromBottom") && (i10 = readableMap.getInt("yFromBottom")) > -1) {
            cVar.p(i10);
        }
        c.b bVar = null;
        if (readableMap.hasKey("horizontalDirection")) {
            c.a aVar = Intrinsics.areEqual("LAUNCHER_HORIZONTAL_LEFT", readableMap.getString("horizontalDirection")) ? c.a.f57279a : Intrinsics.areEqual("LAUNCHER_HORIZONTAL_RIGHT", readableMap.getString("horizontalDirection")) ? c.a.f57280b : null;
            if (aVar != null) {
                cVar.i(aVar);
            }
        }
        if (readableMap.hasKey("verticalDirection")) {
            if (Intrinsics.areEqual("LAUNCHER_VERTICAL_TOP", readableMap.getString("verticalDirection"))) {
                bVar = c.b.f57282a;
            } else if (Intrinsics.areEqual("LAUNCHER_VERTICAL_BOTTOM", readableMap.getString("verticalDirection"))) {
                bVar = c.b.f57283b;
            }
            if (bVar != null) {
                cVar.j(bVar);
            }
        }
        if (readableMap.hasKey("icon") && readableMap.getString("icon") != null && ZohoLiveChat.getApplicationManager() != null) {
            Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
            Intrinsics.checkNotNull(applicationManager);
            if (applicationManager.m() != null) {
                int T12 = c02.T1(readableMap.getString("icon"));
                Uf.j applicationManager2 = ZohoLiveChat.getApplicationManager();
                Intrinsics.checkNotNull(applicationManager2);
                Drawable b10 = AbstractC5596a.b(applicationManager2.m(), T12);
                if (T12 > 0) {
                    cVar.k(b10);
                }
            }
        }
        ZohoSalesIQ.setLauncherProperties(cVar);
    }

    public static final void F4() {
        ZohoLiveChat.a.g();
    }

    public static final void G1(Callback callback, we.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (callback != null) {
            if (result.d()) {
                VisitorChat visitorChat = (VisitorChat) result.b();
                a aVar = f44680a;
                Intrinsics.checkNotNull(visitorChat);
                callback.invoke(null, aVar.d(visitorChat));
                return;
            }
            we.d c10 = result.c();
            RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
            Intrinsics.checkNotNull(c10);
            callback.invoke(companion.c(c10.a(), c10.b()), null);
        }
    }

    public static final void G2(String str, boolean z10) {
        ZohoSalesIQ.m.c(str, z10);
    }

    public static final void G3(boolean z10) {
        ZohoSalesIQ.Chat.showLauncher(z10);
    }

    public static final void H4(String str) {
        ZohoLiveChat.a.f(str);
    }

    public static final void I1(Callback callback) {
        callback.invoke(Integer.valueOf(ZohoSalesIQ.j.e()));
    }

    public static final void I2(String str, String str2, final Callback callback) {
        ZohoSalesIQ.present(f44680a.h(str), str2, new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.y0
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                C0.J2(Callback.this, eVar);
            }
        });
    }

    public static final void J2(Callback callback, we.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (callback != null) {
            if (result.d()) {
                callback.invoke(null, Boolean.TRUE);
                return;
            }
            we.d c10 = result.c();
            RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
            Intrinsics.checkNotNull(c10);
            callback.invoke(companion.c(c10.a(), c10.b()), Boolean.FALSE);
        }
    }

    public static final void J4(C0 c02, Callback callback) {
        ZohoLiveChat.unregisterVisitor(c02.P1(), new s(callback));
    }

    public static final void K1(Callback callback) {
        ZohoSalesIQ.Chat.getList(new i(callback));
    }

    public static final void M1(C0 c02, String str, Callback callback) {
        try {
            if (c02.w2(str)) {
                ZohoSalesIQ.Chat.getList(c02.U1(str), new j(callback));
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, 604);
            writableNativeMap.putString("message", "Invalid filter type");
            callback.invoke(writableNativeMap, null);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static final void M2(ReadableMap readableMap) {
        ReactApplicationContext reactApplicationContext = f44683d;
        Intrinsics.checkNotNull(reactApplicationContext);
        ZohoSalesIQ.j.h(reactApplicationContext.getApplicationContext(), readableMap.toHashMap());
    }

    public static final void N3(String str) {
        try {
            ZohoSalesIQ.Chat.setOperatorEmail(str);
        } catch (C6685a e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static final void P2() {
        if (ZohoLiveChat.getApplicationManager() == null || Uf.j.n() == null || !ne.j.c0(Uf.j.n())) {
            return;
        }
        ne.j.D0(Uf.j.n(), false, 2, null);
    }

    public static final void P3(String str) {
        ZohoSalesIQ.m.d(str);
    }

    public static final void R2(String str) {
        ZohoLiveChat.a.c(str);
    }

    public static final void R3(String str) {
        ZohoSalesIQ.n.f(str);
    }

    public static final void S0(C0 c02, String str, boolean z10) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.c(e22, z10);
    }

    public static final void S1(C0 c02, Callback callback) {
        ZohoSalesIQ.Chat.getDepartments(c02.new k(callback));
    }

    public static final void T3(boolean z10) {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.rating, z10);
    }

    public static final void U2(String str, Callback callback) {
        ZohoLiveChat.registerVisitor(str, new r(callback));
    }

    public static final void V0(C0 c02, String str, boolean z10) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.d(e22, z10);
    }

    public static final void W1(C0 c02, String str, String str2, String str3, Callback callback) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.e(e22, str2, str3, new l(callback));
    }

    public static final void X0(String str) {
        Hashtable hashtable = f44685f;
        SalesIQCustomActionListener salesIQCustomActionListener = (SalesIQCustomActionListener) hashtable.get(str);
        if (salesIQCustomActionListener != null) {
            salesIQCustomActionListener.onSuccess();
        }
        hashtable.remove(str);
    }

    public static final void X2(String str, ReadableArray readableArray) {
        int hashCode = str.hashCode();
        boolean z10 = true;
        if (hashCode != -1739836516) {
            if (hashCode == -1350614529) {
                if (str.equals("EVENT_OPEN_URL") && !f44684e && readableArray.size() == 1) {
                    ReactApplicationContext reactApplicationContext = f44683d;
                    String string = readableArray.getString(0);
                    LiveChatUtil.openUri(reactApplicationContext, string != null ? Uri.parse(string) : null);
                    return;
                }
                return;
            }
            if (hashCode == -232784166 && str.equals("EVENT_VISITOR_REGISTRATION_FAILURE") && readableArray.size() > 0) {
                ReadableMap map = readableArray.getMap(0);
                if (map instanceof ReadableNativeMap) {
                    f44680a.k((ReadableNativeMap) map);
                    return;
                }
                return;
            }
            return;
        }
        if (str.equals("EVENT_COMPLETE_CHAT_ACTION") && readableArray.size() > 0) {
            String string2 = readableArray.getString(0);
            if (readableArray.size() > 1 && !readableArray.getBoolean(1)) {
                z10 = false;
            }
            String string3 = readableArray.size() == 3 ? readableArray.getString(2) : null;
            if (string2 == null || string2.length() == 0) {
                return;
            }
            Hashtable hashtable = f44685f;
            SalesIQCustomActionListener salesIQCustomActionListener = (SalesIQCustomActionListener) hashtable.get(string2);
            if (salesIQCustomActionListener != null) {
                if (string3 == null || string3.length() == 0) {
                    if (z10) {
                        salesIQCustomActionListener.onSuccess();
                    } else {
                        salesIQCustomActionListener.onFailure();
                    }
                } else if (z10) {
                    salesIQCustomActionListener.onSuccess(string3);
                } else {
                    salesIQCustomActionListener.onFailure(string3);
                }
            }
            hashtable.remove(string2);
        }
    }

    public static final void Z0(String str, boolean z10, String str2) {
        SalesIQCustomActionListener salesIQCustomActionListener = (SalesIQCustomActionListener) f44685f.get(str);
        if (salesIQCustomActionListener == null || !z10 || str2 == null) {
            return;
        }
        salesIQCustomActionListener.onSuccess(str2);
    }

    public static final void Z1(C0 c02, String str, String str2, String str3, String str4, int i10, int i11, Callback callback) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.h(e22, str2, str3, str4, i10, i11, false, new n(callback));
    }

    public static final C4507a.C0720a Z2(ReadableMap readableMap, C4507a.C0720a c0720a) {
        C4507a.C0720a f10;
        C4507a b10 = RNZohoSalesIQCore.f44615a.b(readableMap);
        return (b10 == null || (f10 = b10.f()) == null) ? c0720a : f10;
    }

    public static final void a4(String str, String str2) {
        ZohoSalesIQ.n.a(str, str2);
    }

    public static final void b2(C0 c02, String str, String str2, Callback callback) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        ZohoSalesIQ.g.j(e22, str2, new o(callback));
    }

    public static final void b3(double d10) {
        ZohoLiveChat.a.e(((long) d10) * 1000);
    }

    public static final void c1() {
        ZohoSalesIQ.j.b();
    }

    public static final void c4(String str) {
        ZohoSalesIQ.n.b(str);
    }

    public static final void d2(Callback callback, we.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.d()) {
            callback.invoke(null);
        } else {
            callback.invoke(f44680a.e((SalesIQNotificationPayload) result.b()));
        }
    }

    public static final void d3(String str, boolean z10) {
        EnumC5697a c10 = f44680a.c(str);
        if (c10 != null) {
            ZohoSalesIQ.Chat.setVisibility(c10, z10);
        }
    }

    public static final void e1() {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.prechatForm, false);
    }

    public static final void e4(String str) {
        ZohoSalesIQ.n.c(str);
    }

    public static final void f3(String str, String str2) {
        ZohoSalesIQ.Chat.setTitle(str, str2);
    }

    public static final void g1() {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.screenshot, false);
    }

    public static final void h2(boolean z10) {
        ZohoSalesIQ.Chat.hideQueueTime(z10);
    }

    public static final void h3(String str) {
        ZohoSalesIQ.Chat.setTitle(str);
    }

    public static final void h4(String str) {
        ZohoSalesIQ.n.e(str);
    }

    public static final void j2(Application application, C0 c02, String str, String str2) {
        f44680a.l(application, c02.P1(), str, str2, null);
    }

    public static final void j4(boolean z10) {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.visitorName, z10);
    }

    public static final void k1() {
        ZohoSalesIQ.j.c();
    }

    public static final void k3(String str) {
        ZohoSalesIQ.f.c(str);
    }

    public static final void l2(Application application, C0 c02, String str, String str2, Callback callback) {
        f44680a.l(application, c02.P1(), str, str2, callback);
    }

    public static final void m1() {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.prechatForm, true);
    }

    public static final void m3(boolean z10) {
        ZohoSalesIQ.f.d(z10);
    }

    public static final void n2(Activity activity, boolean[] zArr, Promise promise, we.e result) {
        String str;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.d()) {
            if (zArr[0]) {
                zArr[0] = false;
                if (promise != null) {
                    we.d c10 = result.c();
                    if (c10 == null || (str = Integer.valueOf(c10.a()).toString()) == null) {
                        str = "1000";
                    }
                    we.d c11 = result.c();
                    promise.reject(str, c11 != null ? c11.b() : null);
                    return;
                }
                return;
            }
            return;
        }
        String str2 = f44681b;
        if (str2 != null) {
            ZohoSalesIQ.j.d(str2, f44682c);
        }
        if (activity != null && ZohoLiveChat.getApplicationManager() != null) {
            ne.j.s0(false, 1, null);
        }
        if (zArr[0]) {
            zArr[0] = false;
            if (promise != null) {
                promise.resolve(null);
            }
        }
    }

    public static final void o1() {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.screenshot, true);
    }

    public static final void o3(String str) {
        ZohoSalesIQ.m.b(str);
    }

    public static final void p2(Callback callback) {
        callback.invoke(Boolean.valueOf(ZohoLiveChat.isSDKEnabled()));
    }

    public static final void p4(boolean z10) {
        ZohoSalesIQ.Chat.showOfflineMessage(z10);
    }

    public static final void q1(String str) {
        ZohoSalesIQ.Chat.endChat(str);
    }

    public static final void r2(Callback callback, C0 c02, String str) {
        ZohoSalesIQ.k e22 = c02.e2(str);
        Intrinsics.checkNotNull(e22);
        callback.invoke(Boolean.valueOf(ZohoSalesIQ.g.l(e22)));
    }

    public static final void r3(String str) {
        ZohoSalesIQ.Chat.setDepartment(str);
    }

    public static final void r4(boolean z10) {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.operatorImage, z10);
    }

    public static final void t2(Callback callback) {
        callback.invoke(Boolean.valueOf(ZohoSalesIQ.i.a()));
    }

    public static final void t3(List list) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        ZohoSalesIQ.Chat.setDepartments(list);
    }

    public static final void t4(C0 c02, boolean z10) {
        Activity P12 = c02.P1();
        if (P12 == null || ZohoLiveChat.getApplicationManager() == null) {
            return;
        }
        Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
        Intrinsics.checkNotNull(applicationManager);
        applicationManager.R(P12);
        ZohoSalesIQ.Chat.showOperatorImageInLauncher(z10);
    }

    public static final void u1(Promise promise, we.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        RNZohoSalesIQCore.f44615a.g(result, promise, EnumC5584a.f56601a);
    }

    public static final void v3(boolean z10) {
        ZohoSalesIQ.g.p(ZohoSalesIQ.k.Articles, z10);
    }

    public static final void v4(String str) {
        ZohoSalesIQ.Chat.open(str);
    }

    public static final void x3(boolean z10) {
        ZohoSalesIQ.Chat.setVisibility(EnumC5697a.feedback, z10);
    }

    public static final void x4(String str) {
        ZohoSalesIQ.n.g(str);
    }

    public static final void y2(String str, Callback callback) {
        ZohoSalesIQ.g.m(ZohoSalesIQ.k.Articles, str, new p(callback));
    }

    public static final void z4(Callback callback, we.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.d() || result.b() == null) {
            we.d c10 = result.c();
            if (callback != null) {
                RNZohoSalesIQCore.Companion companion = RNZohoSalesIQCore.f44615a;
                Intrinsics.checkNotNull(c10);
                callback.invoke(companion.c(c10.a(), c10.b()), null);
                return;
            }
            return;
        }
        VisitorChat visitorChat = (VisitorChat) result.b();
        a aVar = f44680a;
        Intrinsics.checkNotNull(visitorChat);
        WritableMap d10 = aVar.d(visitorChat);
        if (callback != null) {
            callback.invoke(null, d10);
        }
    }

    public final void A4(String str, String str2, Callback callback) {
        final Callback[] callbackArr = {callback};
        ZohoSalesIQ.Chat.startWithTrigger(str, str2, new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.z0
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                C0.B4(callbackArr, eVar);
            }
        });
    }

    public final void B1(final String categoryId, final Callback articlesCallback) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(articlesCallback, "articlesCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.h
            @Override // java.lang.Runnable
            public final void run() {
                C0.C1(categoryId, this, articlesCallback);
            }
        });
    }

    public final void B2(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.t0
            @Override // java.lang.Runnable
            public final void run() {
                C0.C2(str);
            }
        });
    }

    public final void B3(final String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.y
            @Override // java.lang.Runnable
            public final void run() {
                C0.C3(code);
            }
        });
    }

    public final void C4(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.r
            @Override // java.lang.Runnable
            public final void run() {
                C0.D4(z10);
            }
        });
    }

    public final void D1(final Callback categoryCallback) {
        Intrinsics.checkNotNullParameter(categoryCallback, "categoryCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.v
            @Override // java.lang.Runnable
            public final void run() {
                C0.E1(Callback.this);
            }
        });
    }

    public final void D2(final String type, final String str, final Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r1(type, callback, new Runnable() { // from class: com.zohosalesiq.reactlibrary.n
            @Override // java.lang.Runnable
            public final void run() {
                C0.E2(C0.this, type, str, callback);
            }
        });
    }

    public final void D3(final ReadableMap launcherPropertiesMap) {
        Intrinsics.checkNotNullParameter(launcherPropertiesMap, "launcherPropertiesMap");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.A0
            @Override // java.lang.Runnable
            public final void run() {
                C0.E3(ReadableMap.this, this);
            }
        });
    }

    public final void E4() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.p
            @Override // java.lang.Runnable
            public final void run() {
                C0.F4();
            }
        });
    }

    public final void F1(String chatId, final Callback callback) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        ZohoSalesIQ.Chat.get(chatId, new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.X
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                C0.G1(Callback.this, eVar);
            }
        });
    }

    public final void F2(final String actionName, final boolean z10) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.e0
            @Override // java.lang.Runnable
            public final void run() {
                C0.G2(actionName, z10);
            }
        });
    }

    public final void F3(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.d
            @Override // java.lang.Runnable
            public final void run() {
                C0.G3(z10);
            }
        });
    }

    public final void G4(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.V
            @Override // java.lang.Runnable
            public final void run() {
                C0.H4(str);
            }
        });
    }

    public final void H1(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.t
            @Override // java.lang.Runnable
            public final void run() {
                C0.I1(Callback.this);
            }
        });
    }

    public final void H2(final String str, final String str2, final Callback callback) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.B0
            @Override // java.lang.Runnable
            public final void run() {
                C0.I2(str, str2, callback);
            }
        });
    }

    public final void H3(boolean z10) {
        ZohoSalesIQ.i.b(z10);
    }

    public final void I3(String str) {
    }

    public final void I4(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.k0
            @Override // java.lang.Runnable
            public final void run() {
                C0.J4(C0.this, callback);
            }
        });
    }

    public final void J1(final Callback listCallback) {
        Intrinsics.checkNotNullParameter(listCallback, "listCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.n0
            @Override // java.lang.Runnable
            public final void run() {
                C0.K1(Callback.this);
            }
        });
    }

    public final void J3(int i10) {
        ZohoSalesIQ.h.b(i10);
    }

    public final void K2(boolean z10) {
        ZohoLiveChat.printDebugLogs(z10);
    }

    public final void K3(String actionSource) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        ZohoSalesIQ.j.j(v1(actionSource));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K4(String key, ReadableMap readableMap) {
        Object valueOf;
        int hashCode;
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null) {
            return;
        }
        String string = readableMap.getString("type");
        if (string != null) {
            int hashCode2 = string.hashCode();
            if (hashCode2 != -1034364087) {
                if (hashCode2 != -891985903) {
                    if (hashCode2 == 64711720 && string.equals("boolean")) {
                        valueOf = Boolean.valueOf(readableMap.getBoolean(EventKeys.VALUE_KEY));
                        hashCode = key.hashCode();
                        if (hashCode == -1862503232) {
                            if (key.equals("NeutralRatingDisabled")) {
                                str = "binaryRating";
                            }
                            str = null;
                        } else if (hashCode != 1437563242) {
                            if (hashCode == 1592721274 && key.equals("ChatBotCarousalCardPropertiesOrientation")) {
                                str = "chat_bot_carousal_card_properties_orientation";
                            }
                            str = null;
                        } else {
                            if (key.equals("ChatBotCarousalCardImageVisibility")) {
                                str = "chat_bot_carousal_card_image_visibility";
                            }
                            str = null;
                        }
                        if (str != null) {
                            System.setProperty(str, String.valueOf(valueOf));
                            return;
                        }
                        LiveChatUtil.log("MobilistenPlugin - Invalid configuration key: " + key);
                        return;
                    }
                } else if (string.equals("string")) {
                    valueOf = readableMap.getString(EventKeys.VALUE_KEY);
                    hashCode = key.hashCode();
                    if (hashCode == -1862503232) {
                    }
                    if (str != null) {
                    }
                }
            } else if (string.equals("number")) {
                valueOf = Double.valueOf(readableMap.getDouble(EventKeys.VALUE_KEY));
                hashCode = key.hashCode();
                if (hashCode == -1862503232) {
                }
                if (str != null) {
                }
            }
        }
        LiveChatUtil.log("MobilistenPlugin - Invalid configuration type: " + string);
    }

    public final void L1(final String filter, final Callback listCallback) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(listCallback, "listCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.Z
            @Override // java.lang.Runnable
            public final void run() {
                C0.M1(C0.this, filter, listCallback);
            }
        });
    }

    public final void L2(final ReadableMap extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.e
            @Override // java.lang.Runnable
            public final void run() {
                C0.M2(ReadableMap.this);
            }
        });
    }

    public final void L3(String str) {
        int T12 = T1(str);
        if (T12 > 0) {
            ZohoSalesIQ.j.k(T12);
        }
    }

    public final void L4(String str) {
    }

    public final void M3(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.x0
            @Override // java.lang.Runnable
            public final void run() {
                C0.N3(str);
            }
        });
    }

    public final void N1(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Se.a communicationMode = ZohoSalesIQ.getCommunicationMode();
        if (communicationMode != null) {
            promise.resolve(communicationMode.name());
        } else {
            promise.reject("100", "No communication mode found");
        }
    }

    public final void N2() {
    }

    public final Map O1() {
        HashMap hashMap = new HashMap();
        hashMap.put("TYPE_CONNECTED", "CONNECTED");
        hashMap.put("TYPE_OPEN", "OPEN");
        hashMap.put("TYPE_WAITING", "WAITING");
        hashMap.put("TYPE_MISSED", "MISSED");
        hashMap.put("TYPE_ENDED", "ENDED");
        hashMap.put("TYPE_CLOSED", "CLOSED");
        hashMap.put("TAB_CONVERSATIONS", d.f44697b.b());
        hashMap.put("TAB_FAQ", d.f44698c.b());
        hashMap.put("TAB_KNOWLEDGE_BASE", d.f44699d.b());
        hashMap.put("SUPPORT_OPENED", "EVENT_SUPPORT_OPENED");
        hashMap.put("SUPPORT_CLOSED", "EVENT_SUPPORT_CLOSED");
        hashMap.put("CHATVIEW_OPENED", "EVENT_CHATVIEW_OPENED");
        hashMap.put("CHATVIEW_CLOSED", "EVENT_CHATVIEW_CLOSED");
        hashMap.put("OPERATORS_ONLINE", "EVENT_OPERATORS_ONLINE");
        hashMap.put("OPERATORS_OFFLINE", "EVENT_OPERATORS_OFFLINE");
        hashMap.put("VISITOR_IPBLOCKED", "EVENT_VISITOR_IPBLOCKED");
        hashMap.put("CHAT_ATTENDED", "EVENT_CHAT_ATTENDED");
        hashMap.put("CHAT_MISSED", "EVENT_CHAT_MISSED");
        hashMap.put("CHAT_OPENED", "EVENT_CHAT_OPENED");
        hashMap.put("CHAT_CLOSED", "EVENT_CHAT_CLOSED");
        hashMap.put("CHAT_REOPENED", "EVENT_CHAT_REOPENED");
        hashMap.put("CHAT_EXPIRED", "EVENT_CHAT_EXPIRED");
        hashMap.put("FEEDBACK_RECEIVED", "EVENT_FEEDBACK_RECEIVED");
        hashMap.put("RATING_RECEIVED", "EVENT_RATING_RECEIVED");
        hashMap.put("PERFORM_CHATACTION", "EVENT_PERFORM_CHATACTION");
        hashMap.put("CUSTOMTRIGGER", "EVENT_CUSTOMTRIGGER");
        hashMap.put("BOT_TRIGGER", "EVENT_BOT_TRIGGER");
        hashMap.put("EVENT_HANDLE_URL", "EVENT_HANDLE_URL");
        hashMap.put("RE_REGISTER_PUSH", "RE_REGISTER_PUSH");
        hashMap.put("EVENT_OPEN_URL", "EVENT_OPEN_URL");
        hashMap.put("EVENT_COMPLETE_CHAT_ACTION", "EVENT_COMPLETE_CHAT_ACTION");
        hashMap.put("CHAT_QUEUE_POSITION_CHANGED", "EVENT_CHAT_QUEUE_POSITION_CHANGED");
        hashMap.put("CHAT_UNREAD_COUNT_CHANGED", "EVENT_CHAT_UNREAD_COUNT_CHANGED");
        hashMap.put("EVENT_RESOURCE_LIKED", "EVENT_RESOURCE_LIKED");
        hashMap.put("EVENT_RESOURCE_DISLIKED", "EVENT_RESOURCE_DISLIKED");
        hashMap.put("EVENT_RESOURCE_OPENED", "EVENT_RESOURCE_OPENED");
        hashMap.put("EVENT_RESOURCE_CLOSED", "EVENT_RESOURCE_CLOSED");
        hashMap.put("EVENT_NOTIFICATION_CLICKED", "EVENT_NOTIFICATION_CLICKED");
        hashMap.put("ACTION_SOURCE_APP", "APP");
        hashMap.put("ACTION_SOURCE_SDK", "SDK");
        hashMap.put("ARTICLE_LIKED", "EVENT_ARTICLE_LIKED");
        hashMap.put("ARTICLE_DISLIKED", "EVENT_ARTICLE_DISLIKED");
        hashMap.put("ARTICLE_OPENED", "EVENT_ARTICLE_OPENED");
        hashMap.put("ARTICLE_CLOSED", "EVENT_ARTICLE_CLOSED");
        hashMap.put("LAUNCHER_MODE_STATIC", 1);
        hashMap.put("LAUNCHER_MODE_FLOATING", 2);
        hashMap.put("EVENT_HANDLE_CUSTOM_LAUNCHER_VISIBILITY", "EVENT_HANDLE_CUSTOM_LAUNCHER_VISIBILITY");
        hashMap.put("EVENT_VISITOR_REGISTRATION_FAILURE", "EVENT_VISITOR_REGISTRATION_FAILURE");
        hashMap.put("LAUNCHER_VISIBILITY_MODE_ALWAYS", "LAUNCHER_VISIBILITY_MODE_ALWAYS");
        hashMap.put("LAUNCHER_VISIBILITY_MODE_NEVER", "LAUNCHER_VISIBILITY_MODE_NEVER");
        hashMap.put("LAUNCHER_VISIBILITY_MODE_WHEN_ACTIVE_CHAT", "LAUNCHER_VISIBILITY_MODE_WHEN_ACTIVE_CHAT");
        hashMap.put("LAUNCHER_HORIZONTAL_RIGHT", "LAUNCHER_HORIZONTAL_RIGHT");
        hashMap.put("LAUNCHER_HORIZONTAL_LEFT", "LAUNCHER_HORIZONTAL_LEFT");
        hashMap.put("LAUNCHER_VERTICAL_TOP", "LAUNCHER_VERTICAL_TOP");
        hashMap.put("LAUNCHER_VERTICAL_BOTTOM", "LAUNCHER_VERTICAL_BOTTOM");
        hashMap.put("RESOURCE_ARTICLES", "RESOURCE_ARTICLES");
        hashMap.put("CHAT_EVENT_LISTENER", "CHAT_EVENT_LISTENER");
        hashMap.put("KNOWLEDGEBASE_EVENT_LISTENER", "KNOWLEDGEBASE_EVENT_LISTENER");
        hashMap.put("NOTIFICATION_EVENT_LISTENER", "NOTIFICATION_EVENT_LISTENER");
        hashMap.put("LAUNCHER_EVENT_LISTENER", "LAUNCHER_EVENT_LISTENER");
        hashMap.put("ZSIQ_EVENT_LISTENER", "ZSIQ_EVENT_LISTENER");
        return hashMap;
    }

    public final void O2() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.i0
            @Override // java.lang.Runnable
            public final void run() {
                C0.P2();
            }
        });
    }

    public final void O3(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.x
            @Override // java.lang.Runnable
            public final void run() {
                C0.P3(str);
            }
        });
    }

    public final Activity P1() {
        ReactApplicationContext reactApplicationContext = f44683d;
        Intrinsics.checkNotNull(reactApplicationContext);
        return reactApplicationContext.getCurrentActivity();
    }

    public final void Q0(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        f44690k = true;
        LiveChatUtil.log("Add listener, Event: " + eventName + " added ");
        HashMap hashMap = f44691l;
        if (hashMap != null) {
            Intrinsics.checkNotNull(hashMap);
            if (hashMap.isEmpty()) {
                return;
            }
            ReactApplicationContext reactApplicationContext = f44683d;
            Intrinsics.checkNotNull(reactApplicationContext);
            if (!reactApplicationContext.hasCatalystInstance()) {
                LiveChatUtil.log("Add listener, pending events ignored " + (f44691l == null));
                return;
            }
            HashMap hashMap2 = f44691l;
            Intrinsics.checkNotNull(hashMap2);
            for (Map.Entry entry : hashMap2.entrySet()) {
                f44680a.b((String) entry.getKey(), entry.getValue());
            }
            f44691l = null;
        }
    }

    public final WritableMap Q1(od.w department) {
        Intrinsics.checkNotNullParameter(department, "department");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(StackTraceHelper.ID_KEY, department.f61173a);
        writableNativeMap.putString("name", department.f61174b);
        Boolean bool = department.f61175c;
        if (bool != null) {
            writableNativeMap.putBoolean("available", bool.booleanValue());
        }
        return writableNativeMap;
    }

    public final void Q2(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.C
            @Override // java.lang.Runnable
            public final void run() {
                C0.R2(str);
            }
        });
    }

    public final void Q3(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.u0
            @Override // java.lang.Runnable
            public final void run() {
                C0.R3(str);
            }
        });
    }

    public final void R0(final String type, final boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        r1(type, null, new Runnable() { // from class: com.zohosalesiq.reactlibrary.W
            @Override // java.lang.Runnable
            public final void run() {
                C0.S0(C0.this, type, z10);
            }
        });
    }

    public final void R1(final Callback departmentCallback) {
        Intrinsics.checkNotNullParameter(departmentCallback, "departmentCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.f0
            @Override // java.lang.Runnable
            public final void run() {
                C0.S1(C0.this, departmentCallback);
            }
        });
    }

    public final void S2(String str, boolean z10) {
        f44680a.a(str, z10);
    }

    public final void S3(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.H
            @Override // java.lang.Runnable
            public final void run() {
                C0.T3(z10);
            }
        });
    }

    public final void T0() {
    }

    public final int T1(String str) {
        Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
        if (applicationManager == null || applicationManager.m() == null) {
            return 0;
        }
        Resources resources = applicationManager.m().getResources();
        Uf.j applicationManager2 = ZohoLiveChat.getApplicationManager();
        Intrinsics.checkNotNull(applicationManager2);
        return resources.getIdentifier(str, "drawable", applicationManager2.m().getPackageName());
    }

    public final void T2(final String uniqueid, final Callback callback) {
        Intrinsics.checkNotNullParameter(uniqueid, "uniqueid");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.L
            @Override // java.lang.Runnable
            public final void run() {
                C0.U2(uniqueid, callback);
            }
        });
    }

    public final void U0(final String type, final boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        r1(type, null, new Runnable() { // from class: com.zohosalesiq.reactlibrary.v0
            @Override // java.lang.Runnable
            public final void run() {
                C0.V0(C0.this, type, z10);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final EnumC6361a U1(String str) {
        switch (str.hashCode()) {
            case -2020551013:
                if (str.equals("MISSED")) {
                    return EnumC6361a.MISSED;
                }
                break;
            case 2432586:
                if (str.equals("OPEN")) {
                    return EnumC6361a.OPEN;
                }
                break;
            case 66114202:
                if (str.equals("ENDED")) {
                    return EnumC6361a.ENDED;
                }
                break;
            case 1834295853:
                if (str.equals("WAITING")) {
                    return EnumC6361a.WAITING;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    return EnumC6361a.CLOSED;
                }
                break;
        }
        return EnumC6361a.CONNECTED;
    }

    public final void U3(ReadableArray tabNames) {
        int i10;
        Intrinsics.checkNotNullParameter(tabNames, "tabNames");
        int min = (int) Math.min(tabNames.size(), ZohoSalesIQ.l.values().length - 1);
        ZohoSalesIQ.l[] lVarArr = new ZohoSalesIQ.l[min];
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            String string = tabNames.getString(i12);
            if (Intrinsics.areEqual(d.f44697b.b(), string)) {
                i10 = i11 + 1;
                lVarArr[i11] = ZohoSalesIQ.l.Conversations;
            } else if (Intrinsics.areEqual(d.f44698c.b(), string) || Intrinsics.areEqual(d.f44699d.b(), string)) {
                i10 = i11 + 1;
                lVarArr[i11] = ZohoSalesIQ.l.KnowledgeBase;
            }
            i11 = i10;
        }
        ZohoLiveChat.setTabOrder((ZohoSalesIQ.l[]) Arrays.copyOf(lVarArr, min));
    }

    public final void V1(final String type, final String str, final String str2, final Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r1(type, callback, new Runnable() { // from class: com.zohosalesiq.reactlibrary.O
            @Override // java.lang.Runnable
            public final void run() {
                C0.W1(C0.this, type, str, str2, callback);
            }
        });
    }

    public final void V2(Integer num) {
    }

    public final void V3(ReadableMap readableMap) {
    }

    public final void W0(final String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.p0
            @Override // java.lang.Runnable
            public final void run() {
                C0.X0(uuid);
            }
        });
    }

    public final void W2(final String event, final ReadableArray objects) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(objects, "objects");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.A
            @Override // java.lang.Runnable
            public final void run() {
                C0.X2(event, objects);
            }
        });
    }

    public final void W3(String str) {
    }

    public final void X1(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ZohoSalesIQ.g.g(new m(callback));
    }

    public final void X3(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int f22 = f2(name);
        if (f22 > 0) {
            ZohoSalesIQ.setTheme(f22);
        }
    }

    public final void Y0(final String uuid, final boolean z10, final String str) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.o
            @Override // java.lang.Runnable
            public final void run() {
                C0.Z0(uuid, z10, str);
            }
        });
    }

    public final void Y1(final String type, final String str, final String str2, final int i10, final int i11, final String str3, final Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r1(type, callback, new Runnable() { // from class: com.zohosalesiq.reactlibrary.i
            @Override // java.lang.Runnable
            public final void run() {
                C0.Z1(C0.this, type, str, str2, str3, i10, i11, callback);
            }
        });
    }

    public final void Y2(final ReadableMap attributesMap, Promise promise) {
        Intrinsics.checkNotNullParameter(attributesMap, "attributesMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ZohoSalesIQ.f.b(new Function1() { // from class: com.zohosalesiq.reactlibrary.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4507a.C0720a Z22;
                Z22 = C0.Z2(ReadableMap.this, (C4507a.C0720a) obj);
                return Z22;
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    public final void Y3(String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        ZohoSalesIQ.h.c(f44680a.i(mode));
    }

    public final void Z3(final String str, final String str2) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.T
            @Override // java.lang.Runnable
            public final void run() {
                C0.a4(str, str2);
            }
        });
    }

    public final Bitmap a1(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNull(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void a2(final String type, final String str, final Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r1(type, callback, new Runnable() { // from class: com.zohosalesiq.reactlibrary.h0
            @Override // java.lang.Runnable
            public final void run() {
                C0.b2(C0.this, type, str, callback);
            }
        });
    }

    public final void a3(final double d10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.u
            @Override // java.lang.Runnable
            public final void run() {
                C0.b3(d10);
            }
        });
    }

    public final void b1() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.s0
            @Override // java.lang.Runnable
            public final void run() {
                C0.c1();
            }
        });
    }

    public final void b4(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.q0
            @Override // java.lang.Runnable
            public final void run() {
                C0.c4(str);
            }
        });
    }

    public final void c2(ReadableMap readableMap, final Callback callback) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map j10 = RNZohoSalesIQCore.f44615a.j(readableMap);
        if (!(j10 instanceof Map)) {
            j10 = null;
        }
        if (j10 != null) {
            ZohoSalesIQ.j.g(j10, new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.E
                @Override // ve.InterfaceC6686a
                public final void a(we.e eVar) {
                    C0.d2(Callback.this, eVar);
                }
            });
        } else {
            callback.invoke(null);
        }
    }

    public final void c3(final String chatComponentName, final boolean z10) {
        Intrinsics.checkNotNullParameter(chatComponentName, "chatComponentName");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.K
            @Override // java.lang.Runnable
            public final void run() {
                C0.d3(chatComponentName, z10);
            }
        });
    }

    public final void d1() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.c
            @Override // java.lang.Runnable
            public final void run() {
                C0.e1();
            }
        });
    }

    public final void d4(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.P
            @Override // java.lang.Runnable
            public final void run() {
                C0.e4(str);
            }
        });
    }

    public final ZohoSalesIQ.k e2(String str) {
        if (Intrinsics.areEqual("RESOURCE_ARTICLES", str)) {
            return ZohoSalesIQ.k.Articles;
        }
        return null;
    }

    public final void e3(final String str, final String str2) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.U
            @Override // java.lang.Runnable
            public final void run() {
                C0.f3(str, str2);
            }
        });
    }

    public final void f1() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.w
            @Override // java.lang.Runnable
            public final void run() {
                C0.g1();
            }
        });
    }

    public final int f2(String str) {
        Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
        if (applicationManager == null || applicationManager.m() == null) {
            return 0;
        }
        Resources resources = applicationManager.m().getResources();
        Uf.j applicationManager2 = ZohoLiveChat.getApplicationManager();
        Intrinsics.checkNotNull(applicationManager2);
        return resources.getIdentifier(str, "style", applicationManager2.m().getPackageName());
    }

    public final void f4(ReadableMap visitorLocation) {
        Intrinsics.checkNotNullParameter(visitorLocation, "visitorLocation");
        od.y yVar = new od.y();
        if (visitorLocation.hasKey("latitude")) {
            yVar.k(visitorLocation.getDouble("latitude"));
        }
        if (visitorLocation.hasKey("longitude")) {
            yVar.l(visitorLocation.getDouble("longitude"));
        }
        if (visitorLocation.hasKey(AdRevenueScheme.COUNTRY)) {
            yVar.i(visitorLocation.getString(AdRevenueScheme.COUNTRY));
        }
        if (visitorLocation.hasKey("city")) {
            yVar.h(visitorLocation.getString("city"));
        }
        if (visitorLocation.hasKey("state")) {
            yVar.m(visitorLocation.getString("state"));
        }
        if (visitorLocation.hasKey("countryCode")) {
            yVar.j(visitorLocation.getString("countryCode"));
        }
        if (visitorLocation.hasKey("zipCode")) {
            yVar.n(visitorLocation.getString("zipCode"));
        }
        ZohoSalesIQ.n.d(yVar);
    }

    public final void g2(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.g0
            @Override // java.lang.Runnable
            public final void run() {
                C0.h2(z10);
            }
        });
    }

    public final void g3(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.j0
            @Override // java.lang.Runnable
            public final void run() {
                C0.h3(str);
            }
        });
    }

    public final void g4(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.F
            @Override // java.lang.Runnable
            public final void run() {
                C0.h4(str);
            }
        });
    }

    public final void h1() {
        ZohoSalesIQ.dismissUI();
    }

    public final void i1(boolean z10) {
        ZohoSalesIQ.h.a(z10);
    }

    public final void i2(final String appKey, final String accessKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        final Application w12 = w1();
        if (w12 != null) {
            f44680a.m(w12);
            f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.b
                @Override // java.lang.Runnable
                public final void run() {
                    C0.j2(w12, this, appKey, accessKey);
                }
            });
        }
    }

    public final void i3(int i10) {
        ZohoSalesIQ.Chat.setWaitingTime(i10);
    }

    public final void i4(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.s
            @Override // java.lang.Runnable
            public final void run() {
                C0.j4(z10);
            }
        });
    }

    public final void j1() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.l
            @Override // java.lang.Runnable
            public final void run() {
                C0.k1();
            }
        });
    }

    public final void j3(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.z
            @Override // java.lang.Runnable
            public final void run() {
                C0.k3(str);
            }
        });
    }

    public final void k2(final String appKey, final String accessKey, final Callback callback) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        final Application w12 = w1();
        LiveChatUtil.log("initWithCallback, application: " + w12);
        if (w12 != null) {
            f44680a.m(w12);
            f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.J
                @Override // java.lang.Runnable
                public final void run() {
                    C0.l2(w12, this, appKey, accessKey, callback);
                }
            });
        }
    }

    public final void k4(boolean z10) {
        f44684e = z10;
    }

    public final void l1() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.m
            @Override // java.lang.Runnable
            public final void run() {
                C0.m1();
            }
        });
    }

    public final void l3(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.q
            @Override // java.lang.Runnable
            public final void run() {
                C0.m3(z10);
            }
        });
    }

    public final void l4(boolean z10) {
        ZohoSalesIQ.Chat.showFeedbackAfterSkip(z10);
    }

    public final void m2(ReadableMap readableMap, final Promise promise) {
        String a10;
        String b10;
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        String string = readableMap.getString("appKey");
        String string2 = readableMap.getString("accessKey");
        Application w12 = w1();
        final Activity P12 = P1();
        if (w12 == null) {
            if (promise != null) {
                promise.reject("1000", "Operation failed, Unknown error");
                return;
            }
            return;
        }
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            if (promise != null) {
                promise.reject("1000", "App and access key must not be empty");
                return;
            }
            return;
        }
        C6069a.C0873a c0873a = new C6069a.C0873a(string, string2);
        String string3 = readableMap.getString("androidCallViewMode");
        if (string3 != null) {
            C6069a.b bVar = Intrinsics.areEqual(string3, "BANNER") ? C6069a.b.f63201a : Intrinsics.areEqual(string3, "FLOATING") ? C6069a.b.f63202b : null;
            if (bVar != null) {
                c0873a.b(bVar);
            }
        }
        final boolean[] zArr = {true};
        ZohoSalesIQ.setPlatformName("ReactNative-Android");
        b bVar2 = f44687h;
        if (bVar2 != null && (b10 = bVar2.b()) != null) {
            c0873a.c(1, b10);
        }
        b bVar3 = f44687h;
        if (bVar3 != null && (a10 = bVar3.a()) != null) {
            c0873a.c(2, a10);
        }
        ZohoSalesIQ.initialize(w12, c0873a.a(), new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.I
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                C0.n2(P12, zArr, promise, eVar);
            }
        });
        Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
        if (applicationManager != null) {
            applicationManager.R(P12);
        }
        Uf.j applicationManager2 = ZohoLiveChat.getApplicationManager();
        if (applicationManager2 != null) {
            applicationManager2.Q(P12);
        }
    }

    public final void m4(int i10) {
        ZohoSalesIQ.Chat.showFeedback(i10);
    }

    public final void n1() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.r0
            @Override // java.lang.Runnable
            public final void run() {
                C0.o1();
            }
        });
    }

    public final void n3(final String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.B
            @Override // java.lang.Runnable
            public final void run() {
                C0.o3(actionName);
            }
        });
    }

    public final void n4(String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        ZohoSalesIQ.h.d(f44680a.i(mode));
    }

    public final void o2(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.D
            @Override // java.lang.Runnable
            public final void run() {
                C0.p2(Callback.this);
            }
        });
    }

    public final void o4(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.M
            @Override // java.lang.Runnable
            public final void run() {
                C0.p4(z10);
            }
        });
    }

    public final void p1(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.o0
            @Override // java.lang.Runnable
            public final void run() {
                C0.q1(str);
            }
        });
    }

    public final void p3(ReadableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        ReadableMap map2 = map.getMap("regular");
        ReadableMap map3 = map.getMap("medium");
        String string = map2 != null ? map2.getString("path") : null;
        String string2 = map3 != null ? map3.getString("path") : null;
        if (string == null && string2 == null) {
            f44687h = null;
            return;
        }
        b bVar = new b();
        f44687h = bVar;
        Intrinsics.checkNotNull(bVar);
        bVar.d(string != null ? LiveChatUtil.getString(string) : null);
        b bVar2 = f44687h;
        Intrinsics.checkNotNull(bVar2);
        bVar2.c(string2 != null ? LiveChatUtil.getString(string2) : null);
    }

    public final void q2(final String type, final Callback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r1(type, callback, new Runnable() { // from class: com.zohosalesiq.reactlibrary.j
            @Override // java.lang.Runnable
            public final void run() {
                C0.r2(Callback.this, this, type);
            }
        });
    }

    public final void q3(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.Q
            @Override // java.lang.Runnable
            public final void run() {
                C0.r3(str);
            }
        });
    }

    public final void q4(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.c0
            @Override // java.lang.Runnable
            public final void run() {
                C0.r4(z10);
            }
        });
    }

    public final void r1(String str, Callback callback, Runnable runnable) {
        if (e2(str) != null) {
            runnable.run();
        } else if (callback != null) {
            callback.invoke(f44680a.f());
        }
    }

    public final void s1(String attenderId, boolean z10, Callback imageCallback) {
        Intrinsics.checkNotNullParameter(attenderId, "attenderId");
        Intrinsics.checkNotNullParameter(imageCallback, "imageCallback");
        ZohoSalesIQ.Chat.fetchAttenderImage(attenderId, Boolean.valueOf(z10), new e(imageCallback));
    }

    public final void s2(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.k
            @Override // java.lang.Runnable
            public final void run() {
                C0.t2(Callback.this);
            }
        });
    }

    public final void s3(final List list) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.a
            @Override // java.lang.Runnable
            public final void run() {
                C0.t3(list);
            }
        });
    }

    public final void s4(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.m0
            @Override // java.lang.Runnable
            public final void run() {
                C0.t4(C0.this, z10);
            }
        });
    }

    public final void t1(final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ZohoSalesIQ.f.a(new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.w0
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                C0.u1(Promise.this, eVar);
            }
        });
    }

    public final void u2(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(ZohoSalesIQ.Chat.isMultipleOpenRestricted()));
    }

    public final void u3(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.a0
            @Override // java.lang.Runnable
            public final void run() {
                C0.v3(z10);
            }
        });
    }

    public final void u4(ReadableMap result) {
        ReadableMap map;
        Intrinsics.checkNotNullParameter(result, "result");
        final String string = result.hasKey("chatId") ? result.getString("chatId") : (result.hasKey(EventKeys.PAYLOAD) && (map = result.getMap(EventKeys.PAYLOAD)) != null && map.hasKey("chatId")) ? map.getString("chatId") : null;
        if (string != null) {
            LiveChatUtil.log("Opening payload chat with id: " + string);
            f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0.v4(string);
                }
            });
        }
    }

    public final ZohoSalesIQ.e v1(String str) {
        return Intrinsics.areEqual("APP", str) ? ZohoSalesIQ.e.APP : ZohoSalesIQ.e.SDK;
    }

    public final void v2(ReadableMap map, Callback callback) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(ZohoSalesIQ.j.i(map.toHashMap())));
    }

    public final Application w1() {
        Activity P12 = P1();
        if (P12 != null) {
            return P12.getApplication();
        }
        ReactApplicationContext reactApplicationContext = f44683d;
        if (reactApplicationContext != null) {
            Intrinsics.checkNotNull(reactApplicationContext);
            if (reactApplicationContext.getApplicationContext() instanceof Application) {
                ReactApplicationContext reactApplicationContext2 = f44683d;
                Intrinsics.checkNotNull(reactApplicationContext2);
                Context applicationContext = reactApplicationContext2.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                return (Application) applicationContext;
            }
        }
        return null;
    }

    public final boolean w2(String str) {
        for (EnumC6361a enumC6361a : EnumC6361a.values()) {
            if (Intrinsics.areEqual(enumC6361a.name(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void w3(final boolean z10) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.f
            @Override // java.lang.Runnable
            public final void run() {
                C0.x3(z10);
            }
        });
    }

    public final void w4(final String str) {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.N
            @Override // java.lang.Runnable
            public final void run() {
                C0.x4(str);
            }
        });
    }

    public final WritableMap x1(SalesIQArticle article) {
        Intrinsics.checkNotNullParameter(article, "article");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(StackTraceHelper.ID_KEY, article.getId());
        writableNativeMap.putString("name", article.getTitle());
        writableNativeMap.putInt("likeCount", article.getLiked());
        writableNativeMap.putInt("dislikeCount", article.getDisliked());
        writableNativeMap.putInt("viewCount", article.getViewed());
        if (article.getCategoryId() != null) {
            writableNativeMap.putString("categoryID", article.getCategoryId());
        }
        if (article.getCategoryName() != null) {
            writableNativeMap.putString("categoryName", article.getCategoryName());
        }
        return writableNativeMap;
    }

    public final void x2(final String str, final Callback articlesCallback) {
        Intrinsics.checkNotNullParameter(articlesCallback, "articlesCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.Y
            @Override // java.lang.Runnable
            public final void run() {
                C0.y2(str, articlesCallback);
            }
        });
    }

    public final WritableMap y1(Resource resource) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (resource != null) {
            writableNativeMap.putString(StackTraceHelper.ID_KEY, resource.getId());
            writableNativeMap.putString("name", resource.getTitle());
            if (resource.getStats() != null) {
                Resource.Stats stats = resource.getStats();
                Intrinsics.checkNotNull(stats);
                writableNativeMap.putInt("likeCount", stats.getLiked());
                Resource.Stats stats2 = resource.getStats();
                Intrinsics.checkNotNull(stats2);
                writableNativeMap.putInt("dislikeCount", stats2.getDisliked());
                Resource.Stats stats3 = resource.getStats();
                Intrinsics.checkNotNull(stats3);
                writableNativeMap.putInt("viewCount", stats3.getViewed());
            }
            if (resource.getCategory() != null) {
                Resource.Category category = resource.getCategory();
                Intrinsics.checkNotNull(category);
                if (category.getId() != null) {
                    Resource.Category category2 = resource.getCategory();
                    Intrinsics.checkNotNull(category2);
                    writableNativeMap.putString("categoryID", category2.getId());
                }
                Resource.Category category3 = resource.getCategory();
                Intrinsics.checkNotNull(category3);
                if (category3.getName() != null) {
                    Resource.Category category4 = resource.getCategory();
                    Intrinsics.checkNotNull(category4);
                    writableNativeMap.putString("categoryName", category4.getName());
                }
            }
        }
        return writableNativeMap;
    }

    public final void y3(int i10) {
        ZohoSalesIQ.g.o(i10);
    }

    public final void y4(String question, String str, String str2, final Callback callback) {
        Intrinsics.checkNotNullParameter(question, "question");
        ZohoSalesIQ.Chat.start(question, str, str2, new InterfaceC6686a() { // from class: com.zohosalesiq.reactlibrary.G
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                C0.z4(Callback.this, eVar);
            }
        });
    }

    public final void z1(final Callback articlesCallback) {
        Intrinsics.checkNotNullParameter(articlesCallback, "articlesCallback");
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.b0
            @Override // java.lang.Runnable
            public final void run() {
                C0.A1(C0.this, articlesCallback);
            }
        });
    }

    public final void z2() {
        f44686g.post(new Runnable() { // from class: com.zohosalesiq.reactlibrary.S
            @Override // java.lang.Runnable
            public final void run() {
                C0.A2();
            }
        });
    }

    public final void z3(final String type, final boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        r1(type, null, new Runnable() { // from class: com.zohosalesiq.reactlibrary.d0
            @Override // java.lang.Runnable
            public final void run() {
                C0.A3(C0.this, type, z10);
            }
        });
    }

    public C0(ReactApplicationContext reactApplicationContext) {
        f44683d = reactApplicationContext;
    }
}
