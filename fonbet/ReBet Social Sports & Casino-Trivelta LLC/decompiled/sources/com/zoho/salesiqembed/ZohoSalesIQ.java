package com.zoho.salesiqembed;

import af.AbstractC1935a;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Patterns;
import androidx.annotation.NonNull;
import com.facebook.hermes.intl.Constants;
import com.zoho.livechat.android.NotificationListener;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.ConversationListener;
import com.zoho.livechat.android.listeners.DepartmentListener;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.listeners.OperatorImageListener;
import com.zoho.livechat.android.listeners.SalesIQChatListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceCategoryListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceDepartmentsListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.activities.ArticlesActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.x;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.TrackingHelper;
import com.zoho.salesiqembed.android.tracking.UTSAdapter;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import hg.C4507a;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mf.C5583a;
import nd.EnumC5697a;
import ng.C5735a;
import od.AbstractC5884j;
import od.EnumC5876b;
import od.t;
import od.u;
import od.y;
import pg.C6069a;
import rd.C6218a;
import sd.EnumC6361a;
import ue.C6549a;
import vd.C6685a;
import ve.InterfaceC6686a;
import xe.C6822a;

/* loaded from: classes4.dex */
public class ZohoSalesIQ extends ZohoLiveChat {
    static final Object VISITOR_DATA_UPDATE_SYNCHRONIZE_LOCK = new Object();
    private static int appThemeResourceId = -1;
    static boolean hasLandedOnFirstPage = false;
    private static boolean isLifecycleCallbacksRegistered = false;
    public static String sessionID = "12";

    public static class Chat {
        private static Bitmap image;
        private static String language;
        private static ArrayList<String> departlist = new ArrayList<>();
        private static HashMap<Integer, String> sysmessagelist = new HashMap<>();
        private static boolean showAgentImage = false;
        private static SalesIQChatListener chatListener = null;

        public static /* synthetic */ Unit a(Function2 function2, Boolean bool) {
            if (bool.booleanValue()) {
                function2.invoke(Boolean.TRUE, null);
            } else {
                function2.invoke(Boolean.FALSE, MobilistenInitProvider.k() != null ? MobilistenInitProvider.k().getString(t.f60884J2) : "operation failed");
            }
            return Unit.INSTANCE;
        }

        public static void allowChatInOfflineMode(boolean z10) {
            Q.d(z10);
        }

        public static void allowStartChatWithFile(boolean z10) {
            Q.e(z10);
        }

        public static /* synthetic */ void b(DepartmentListener departmentListener, we.e eVar) {
            if (eVar.d()) {
                departmentListener.onSuccess(new ArrayList<>(AbstractC1935a.a((List) eVar.b())));
            } else if (eVar.c() != null) {
                departmentListener.onFailure(eVar.c().a(), eVar.c().b());
            } else {
                departmentListener.onFailure(601, "operation failed");
            }
        }

        public static /* synthetic */ Unit c(EnumC6361a enumC6361a, ConversationListener conversationListener, Boolean bool, String str) {
            if (!bool.booleanValue()) {
                conversationListener.onFailure(601, str);
            } else if (enumC6361a == null) {
                conversationListener.onSuccess(LiveChatUtil.getVisitorChats(Te.a.Y(LiveChatUtil.getAllChats(SalesIQChat.c.Chat))));
            } else {
                conversationListener.onSuccess(LiveChatUtil.getVisitorChats(Te.a.Y(LiveChatUtil.getChatsWithSpecificStatus(enumC6361a, SalesIQChat.c.Chat))));
            }
            return Unit.INSTANCE;
        }

        public static boolean canShowOperatorImageOnBubble() {
            return showAgentImage;
        }

        public static void endChat(String str) {
            LiveChatUtil.endChat(str);
        }

        public static void fetchAttenderImage(String str, Boolean bool, OperatorImageListener operatorImageListener) {
            if (MobilistenUtil.j()) {
                operatorImageListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
            } else if (LiveChatUtil.isEnabled()) {
                LiveChatUtil.fetchAttenderImage(str, bool, operatorImageListener);
            } else {
                operatorImageListener.onFailure(605, "mobilisten disabled");
            }
        }

        private static void fetchConversations(final Function2<Boolean, String, Unit> function2) {
            if (Q.f44447F.f44467b) {
                function2.invoke(Boolean.TRUE, null);
            } else {
                LiveChatUtil.submitTaskToExecutorServiceSafely(new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: com.zoho.salesiqembed.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZohoSalesIQ.Chat.a(Function2.this, (Boolean) obj);
                    }
                }));
            }
        }

        public static void get(@NonNull String str, @NonNull InterfaceC6686a interfaceC6686a) {
            Te.a.G(str, interfaceC6686a);
        }

        public static void getDepartments(final DepartmentListener departmentListener) {
            if (MobilistenUtil.j()) {
                departmentListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
            } else if (LiveChatUtil.isEnabled()) {
                com.zoho.livechat.android.modules.brand.ui.helpers.a.D(new InterfaceC6686a() { // from class: com.zoho.salesiqembed.g
                    @Override // ve.InterfaceC6686a
                    public final void a(we.e eVar) {
                        ZohoSalesIQ.Chat.b(DepartmentListener.this, eVar);
                    }
                });
            } else {
                departmentListener.onFailure(605, "mobilisten disabled");
            }
        }

        @NonNull
        public static ArrayList<String> getDepts() {
            return departlist;
        }

        public static String getLanguage() {
            return language;
        }

        public static void getList(ConversationListener conversationListener) {
            getList(null, conversationListener);
        }

        public static SalesIQChatListener getListener() {
            return chatListener;
        }

        public static String getMessage(nd.g gVar) {
            if (gVar == null || !sysmessagelist.containsKey(Integer.valueOf(gVar.ordinal()))) {
                return null;
            }
            return sysmessagelist.get(new Integer(gVar.ordinal()));
        }

        public static Bitmap getVisitorImage() {
            return image;
        }

        public static void hideQueueTime(boolean z10) {
            Te.a.D0(z10);
        }

        public static boolean isMultipleOpenRestricted() {
            return LiveChatUtil.isMultipleChatsDisabled();
        }

        @Deprecated
        public static void open() {
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                LiveChatUtil.open(Uf.j.n());
            }
        }

        public static void openNewChat() {
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                LiveChatUtil.openNewChat(Uf.j.n());
            }
        }

        public static void setDepartment(String str) {
            if (str == null) {
                departlist = null;
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            departlist = arrayList;
            arrayList.add(str);
        }

        public static void setDepartments(@NonNull List<String> list) {
            if (list == null || list.isEmpty()) {
                departlist = null;
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            departlist = arrayList;
            arrayList.addAll(list);
        }

        public static void setLanguage(@NonNull String str) {
            language = str;
            Application k10 = MobilistenInitProvider.k();
            if (C6218a.M() != null) {
                if (!Objects.equals(C6218a.M().getString("mobilisten_api_locale", null), str)) {
                    C5583a.f();
                    ne.j.r0(true);
                }
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putString("mobilisten_api_locale", str);
                edit.apply();
                if (k10 != null) {
                    Td.e.v0(k10, str);
                }
            }
        }

        public static void setListener(SalesIQChatListener salesIQChatListener) {
            chatListener = salesIQChatListener;
        }

        @Deprecated
        public static void setMessage(nd.g gVar, String str) {
            if (gVar == null || str == null || str.trim().length() <= 0) {
                return;
            }
            sysmessagelist.put(Integer.valueOf(gVar.ordinal()), str);
        }

        @Deprecated
        public static void setOfflineMessage(String str) {
            Q.K(str);
        }

        public static void setOperatorEmail(String str) {
            if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                MobilistenUtil.a.a().b(str);
                return;
            }
            throw new C6685a("Invalid Email ID '" + str + "'");
        }

        @Deprecated
        public static void setTitle(String str) {
            Te.a.F0(str);
        }

        public static void setVisibility(@NonNull EnumC5697a enumC5697a, boolean z10) {
            if (enumC5697a == null || C6218a.M() == null) {
                return;
            }
            SharedPreferences.Editor edit = C6218a.M().edit();
            if (enumC5697a == EnumC5697a.operatorImage) {
                edit.putBoolean("component_operator_image", z10);
            } else if (enumC5697a == EnumC5697a.rating) {
                edit.putBoolean("component_rating", z10);
            } else if (enumC5697a == EnumC5697a.feedback) {
                edit.putBoolean("component_feedback", z10);
            } else if (enumC5697a == EnumC5697a.screenshot) {
                edit.putBoolean("screen_shot", z10);
            } else if (enumC5697a == EnumC5697a.prechatForm) {
                edit.putBoolean("prechat_form", z10);
            } else if (enumC5697a == EnumC5697a.visitorName) {
                edit.putBoolean("visitor_name", z10);
            } else if (enumC5697a == EnumC5697a.emailTranscript) {
                edit.putBoolean("email_transcript", z10);
            } else if (enumC5697a == EnumC5697a.fileShare) {
                edit.putBoolean("file_share", z10);
            } else if (enumC5697a == EnumC5697a.end) {
                edit.putBoolean("chat_component_end_chat", z10);
            } else if (enumC5697a == EnumC5697a.endWhenInQueue) {
                edit.putBoolean("chat_component_end_chat_when_in_queue", z10);
            } else if (enumC5697a == EnumC5697a.endWhenBotConnected) {
                edit.putBoolean("chat_component_end_chat_with_bot", z10);
            } else if (enumC5697a == EnumC5697a.endWhenOperatorConnected) {
                edit.putBoolean("chat_component_end_chat_with_agent", z10);
            } else if (enumC5697a == EnumC5697a.reopen) {
                edit.putBoolean("chat_component_reopen_chat", z10);
            } else if (enumC5697a == EnumC5697a.queuePosition) {
                edit.putBoolean("chat_component_reopen_chat", z10);
            } else if (enumC5697a == EnumC5697a.call) {
                Te.a.U0(De.a.ChatComponentCall, z10);
            } else if (enumC5697a == EnumC5697a.fileSharingWhenBotConnected) {
                Te.a.U0(De.a.ChatComponentFileSharingWhenBotConnected, z10);
            } else if (enumC5697a == EnumC5697a.voiceNoteWhenBotConnected) {
                Te.a.U0(De.a.ChatComponentVoiceNoteWhenBotConnected, z10);
            } else if (enumC5697a == EnumC5697a.takePhoto) {
                Te.a.U0(De.a.ChatComponentTakePhoto, z10);
            } else if (enumC5697a == EnumC5697a.recordVideo) {
                Te.a.U0(De.a.ChatComponentRecordVideo, z10);
            } else if (enumC5697a == EnumC5697a.gallery) {
                Te.a.U0(De.a.ChatComponentGallery, z10);
            }
            edit.apply();
        }

        public static void setVisitorImage(Bitmap bitmap) {
            image = bitmap;
        }

        public static void setWaitingTime(long j10) {
            Te.a.G0(Long.valueOf(j10));
        }

        @Deprecated
        public static void show() {
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                LiveChatUtil.openChat(Uf.j.n(), false, true, UTSUtil.shouldWaitForWidgetInteractionTrigger(), true);
            }
        }

        public static void showFeedback(long j10) {
            Ye.d.q(De.a.FeedbackValidityDuration, j10).a();
        }

        public static void showFeedbackAfterSkip(boolean z10) {
            Ye.d.o(De.a.ShowFeedbackAfterSkip, z10).a();
        }

        @Deprecated
        public static void showLauncher(boolean z10) {
            ZohoSalesIQ.showLauncher(z10);
        }

        public static void showOfflineMessage(boolean z10) {
            Q.P(z10);
        }

        public static void showOperatorImageInLauncher(boolean z10) {
            if (ZohoLiveChat.getApplicationManager() != null) {
                showAgentImage = z10;
                ne.j.q0();
            }
        }

        public static void start(@NonNull String str) {
            start(str, (String) null, (String) null);
        }

        @Deprecated
        public static void startWithTrigger(String str, String str2, InterfaceC6686a interfaceC6686a) {
            Te.a.O0(str, null, str2, null, interfaceC6686a);
        }

        public static void getList(final EnumC6361a enumC6361a, final ConversationListener conversationListener) {
            try {
                if (MobilistenUtil.j()) {
                    conversationListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                } else if (LiveChatUtil.isEnabled()) {
                    fetchConversations(new Function2() { // from class: com.zoho.salesiqembed.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ZohoSalesIQ.Chat.c(EnumC6361a.this, conversationListener, (Boolean) obj, (String) obj2);
                        }
                    });
                } else {
                    conversationListener.onFailure(605, "mobilisten disabled");
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }

        public static void setTitle(String str, String str2) {
            Te.a.F0(str);
            Te.a.E0(str2);
        }

        public static void start(@NonNull String str, String str2) {
            start(str, str2, (String) null);
        }

        public static void startWithTrigger(@NonNull String str, String str2, String str3, InterfaceC6686a interfaceC6686a) {
            Te.a.O0(str2, str, str3, null, interfaceC6686a);
        }

        public static void open(Activity activity) {
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager().R(activity);
                LiveChatUtil.open(activity);
            }
        }

        public static void start(@NonNull String str, String str2, String str3) {
            start(str, str2, str3, (InterfaceC6686a) null);
        }

        public static void startWithTrigger(@NonNull String str, String str2, C4507a c4507a, InterfaceC6686a interfaceC6686a) {
            Te.a.M0(str2, str, c4507a, interfaceC6686a, null);
        }

        public static void start(@NonNull String str, String str2, String str3, InterfaceC6686a interfaceC6686a) {
            Te.a.J0(str, str2, str3, null, interfaceC6686a);
        }

        public static void startWithTrigger(@NonNull String str, String str2, C4507a c4507a) {
            Te.a.M0(str2, str, c4507a, null, null);
        }

        public static void start(@NonNull String str, String str2, C4507a c4507a, InterfaceC6686a interfaceC6686a) {
            Te.a.H0(str, str2, c4507a, interfaceC6686a);
        }

        public static void startWithTrigger(@NonNull String str, String str2, String str3) {
            Te.a.N0(str2, str, str3);
        }

        public static void open(String str) {
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                LiveChatUtil.open(Uf.j.n(), str);
            }
        }

        public static void start(@NonNull String str, String str2, C4507a c4507a) {
            Te.a.H0(str, str2, c4507a, null);
        }

        public static void startWithTrigger(@NonNull String str, String str2) {
            Te.a.L0(str2, str);
        }

        public static void startWithTrigger(@NonNull String str) {
            Te.a.L0(null, str);
        }

        public static void setVisibility(EnumC5876b enumC5876b, boolean z10) {
            Hashtable hashtable;
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                if (Uf.j.n() != null) {
                    try {
                        Hashtable s10 = ZohoLiveChat.getApplicationManager().s();
                        EnumC5876b enumC5876b2 = EnumC5876b.CHAT;
                        if (s10.get(enumC5876b2) == null) {
                            hashtable = new Hashtable();
                        } else {
                            hashtable = (Hashtable) ZohoLiveChat.getApplicationManager().s().get(enumC5876b2);
                        }
                        ZohoLiveChat.getApplicationManager();
                        hashtable.put(Uf.j.n().getClass().getCanonicalName(), Boolean.valueOf(z10));
                        ZohoLiveChat.getApplicationManager().s().put(enumC5876b, hashtable);
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                    if (!z10) {
                        try {
                            ZohoLiveChat.getApplicationManager();
                            ne.j.t0(Uf.j.n());
                            return;
                        } catch (Exception e11) {
                            LiveChatUtil.log(e11);
                            return;
                        }
                    }
                    try {
                        if (enumC5876b.ordinal() == EnumC5876b.CHAT.ordinal()) {
                            ZohoLiveChat.getApplicationManager();
                            if (ne.j.c0(Uf.j.n())) {
                                ZohoLiveChat.getApplicationManager();
                                ne.j.C0(Uf.j.n(), false);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        LiveChatUtil.log(e12);
                        return;
                    }
                }
                throw new ClassNotFoundException("No Activity found to set the API");
            }
        }
    }

    public class a implements InitListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f44620a;

        public a(InterfaceC6686a interfaceC6686a) {
            this.f44620a = interfaceC6686a;
        }

        @Override // com.zoho.livechat.android.listeners.InitListener
        public void onInitError(final int i10, final String str) {
            if (this.f44620a != null) {
                Handler handler = new Handler(Looper.getMainLooper());
                final InterfaceC6686a interfaceC6686a = this.f44620a;
                handler.post(new Runnable() { // from class: com.zoho.salesiqembed.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6686a.this.a(we.e.a(new we.d(i10, str)));
                    }
                });
            }
        }

        @Override // com.zoho.livechat.android.listeners.InitListener
        public void onInitSuccess() {
            if (this.f44620a != null) {
                Handler handler = new Handler(Looper.getMainLooper());
                final InterfaceC6686a interfaceC6686a = this.f44620a;
                handler.post(new Runnable() { // from class: com.zoho.salesiqembed.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6686a.this.a(we.e.e(Unit.INSTANCE));
                    }
                });
            }
        }
    }

    public class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity != null) {
                UTSUtil.dismissTrackingConsent();
                if (ZohoLiveChat.getApplicationManager() != null) {
                    ZohoLiveChat.getApplicationManager().P(activity.getClass().getCanonicalName());
                }
                try {
                    Hashtable hashtable = (Hashtable) ZohoLiveChat.getApplicationManager().s().get(EnumC5876b.CHAT);
                    if (hashtable != null) {
                        ZohoLiveChat.getApplicationManager();
                        if (Uf.j.n() != null) {
                            ZohoLiveChat.getApplicationManager();
                            if (hashtable.containsKey(Uf.j.n().getClass().getCanonicalName())) {
                                hashtable.remove(activity.getClass().getCanonicalName());
                            }
                        }
                    }
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                if (!((PowerManager) activity.getSystemService("power")).isInteractive()) {
                    C6218a.o0(false);
                    try {
                        UTSAdapter.hold();
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (Q.w() && UTSUtil.isTrackingEnabled() && LiveChatUtil.isSupportedVersion() && LiveChatUtil.isEmbedAllowed() && LiveChatUtil.isAppEnabled()) {
                UTSUtil.connectToUTS(activity);
            } else {
                UTSAdapter.disconnect();
            }
            String a10 = m.a(activity);
            if (!(activity instanceof Yf.c) && !Ag.c.b(activity) && a10 == null) {
                try {
                    if (!UTSUtil.isTrackingEnabled()) {
                        if (ZohoSalesIQ.hasLandedOnFirstPage) {
                        }
                    }
                    TrackingHelper.updatePageTitle(activity.getClass().getSimpleName());
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
            ZohoSalesIQ.hasLandedOnFirstPage = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public class c implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 == 20) {
                try {
                    UTSAdapter.hold();
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
        }
    }

    public static /* synthetic */ class d {
        static final /* synthetic */ int[] $SwitchMap$com$zoho$salesiqembed$ZohoSalesIQ$ResourceType;

        static {
            int[] iArr = new int[k.values().length];
            $SwitchMap$com$zoho$salesiqembed$ZohoSalesIQ$ResourceType = iArr;
            try {
                iArr[k.Articles.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum e {
        APP,
        SDK
    }

    public static class f {
        public static void a(InterfaceC6686a interfaceC6686a) {
            com.zoho.livechat.android.modules.brand.ui.helpers.a.D(interfaceC6686a);
        }

        public static void b(Function1 function1) {
            Te.a.T0(function1);
        }

        public static void c(String str) {
            if (str == null || str.trim().isEmpty() || C6218a.M() == null) {
                return;
            }
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putString("conversation_title", str);
            edit.apply();
        }

        public static void d(boolean z10) {
            if (C6218a.M() != null) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putBoolean("enableconversation", z10);
                edit.apply();
            }
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static SalesIQKnowledgeBaseListener f44623a;

        public static /* synthetic */ Unit a(OpenResourceListener openResourceListener, Integer num, String str) {
            if (openResourceListener != null) {
                openResourceListener.onFailure(num.intValue(), str);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(String str, OpenResourceListener openResourceListener) {
            ZohoLiveChat.getApplicationManager();
            Intent intent = new Intent(Uf.j.n(), (Class<?>) ArticlesActivity.class);
            intent.putExtra("article_id", str);
            intent.putExtra("mode", "SINGLETASK");
            ZohoLiveChat.getApplicationManager();
            Uf.j.n().startActivity(intent);
            if (openResourceListener != null) {
                openResourceListener.onSuccess();
            }
            return Unit.INSTANCE;
        }

        public static void c(k kVar, boolean z10) {
            if (C6218a.M() != null) {
                SharedPreferences M10 = C6218a.M();
                if (M10.getBoolean("articles_category_visibility", true) != z10) {
                    C5583a.f();
                }
                SharedPreferences.Editor edit = M10.edit();
                if (kVar == k.Articles) {
                    edit.putBoolean("articles_category_visibility", z10);
                }
                edit.apply();
            }
        }

        public static void d(k kVar, boolean z10) {
            if (C6218a.M() != null) {
                SharedPreferences M10 = C6218a.M();
                if (M10.getBoolean("articles_departments_visibility", false) != z10) {
                    C5583a.f();
                }
                SharedPreferences.Editor edit = M10.edit();
                if (kVar == k.Articles) {
                    edit.putBoolean("articles_departments_visibility", z10);
                }
                edit.apply();
            }
        }

        public static void e(k kVar, String str, String str2, ResourceCategoryListener resourceCategoryListener) {
            if (MobilistenUtil.j()) {
                resourceCategoryListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                return;
            }
            if (!LiveChatUtil.isEnabled()) {
                resourceCategoryListener.onFailure(605, "mobilisten disabled");
            } else if (!C6218a.c0()) {
                resourceCategoryListener.onFailure(600, "No network connection");
            } else {
                if (d.$SwitchMap$com$zoho$salesiqembed$ZohoSalesIQ$ResourceType[kVar.ordinal()] != 1) {
                    return;
                }
                C5583a.i(str, str2, resourceCategoryListener);
            }
        }

        public static SalesIQKnowledgeBaseListener f() {
            return f44623a;
        }

        public static void g(ResourceDepartmentsListener resourceDepartmentsListener) {
            if (MobilistenUtil.j()) {
                resourceDepartmentsListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
            } else if (LiveChatUtil.isEnabled()) {
                resourceDepartmentsListener.onSuccess(C5583a.s());
            } else {
                resourceDepartmentsListener.onFailure(605, "mobilisten disabled");
            }
        }

        public static void h(k kVar, String str, String str2, String str3, int i10, int i11, boolean z10, ResourcesListener resourcesListener) {
            if (MobilistenUtil.j()) {
                resourcesListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                return;
            }
            if (!LiveChatUtil.isEnabled()) {
                resourcesListener.onFailure(605, "mobilisten disabled");
            } else if (!C6218a.c0()) {
                resourcesListener.onFailure(600, "No network connection");
            } else {
                if (d.$SwitchMap$com$zoho$salesiqembed$ZohoSalesIQ$ResourceType[kVar.ordinal()] != 1) {
                    return;
                }
                C5583a.j(str, str2, str3, i10, i11, z10, resourcesListener);
            }
        }

        public static void i(k kVar, String str, String str2, String str3, boolean z10, ResourcesListener resourcesListener) {
            h(kVar, str, str2, str3, 1, 99, z10, resourcesListener);
        }

        public static void j(k kVar, String str, ResourceListener resourceListener) {
            k(kVar, str, true, resourceListener);
        }

        public static void k(k kVar, String str, boolean z10, ResourceListener resourceListener) {
            if (MobilistenUtil.j()) {
                resourceListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                return;
            }
            if (!LiveChatUtil.isEnabled()) {
                resourceListener.onFailure(605, "mobilisten disabled");
            } else if (!C6218a.c0()) {
                resourceListener.onFailure(600, "No network connection");
            } else {
                if (d.$SwitchMap$com$zoho$salesiqembed$ZohoSalesIQ$ResourceType[kVar.ordinal()] != 1) {
                    return;
                }
                C5583a.h(str, z10, resourceListener);
            }
        }

        public static boolean l(k kVar) {
            if (kVar == k.Articles) {
                return LiveChatUtil.isArticlesEnabledFromSalesIQ();
            }
            return false;
        }

        public static void m(k kVar, final String str, final OpenResourceListener openResourceListener) {
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                if (Uf.j.n() != null) {
                    if (MobilistenUtil.j()) {
                        openResourceListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                        return;
                    }
                    if (!LiveChatUtil.isEnabled()) {
                        openResourceListener.onFailure(605, "mobilisten disabled");
                    } else if (!C6218a.c0()) {
                        openResourceListener.onFailure(600, "No network connection");
                    } else {
                        if (d.$SwitchMap$com$zoho$salesiqembed$ZohoSalesIQ$ResourceType[kVar.ordinal()] != 1) {
                            return;
                        }
                        C5583a.e(str, true, new Function0() { // from class: com.zoho.salesiqembed.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZohoSalesIQ.g.b(str, openResourceListener);
                            }
                        }, new Function2() { // from class: com.zoho.salesiqembed.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ZohoSalesIQ.g.a(OpenResourceListener.this, (Integer) obj, (String) obj2);
                            }
                        });
                    }
                }
            }
        }

        public static void n(SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener) {
            f44623a = salesIQKnowledgeBaseListener;
        }

        public static void o(int i10) {
            if (C6218a.M() != null) {
                Ye.d.p(De.a.KnowledgeBaseRecentlyViewedLimit, i10).a();
            }
        }

        public static void p(k kVar, boolean z10) {
            if (C6218a.M() != null) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                if (kVar == k.Articles) {
                    edit.putBoolean("enablearticles", z10);
                }
                edit.apply();
            }
        }
    }

    public static class h {

        public enum a {
            ALWAYS,
            NEVER,
            WHEN_ACTIVE_CHAT
        }

        public static void a(boolean z10) {
            ne.j.L(z10);
        }

        public static void b(long j10) {
            if (j10 > 0) {
                ne.j.z0(j10);
            }
        }

        public static void c(a aVar) {
            ne.j.B0(aVar);
        }

        public static void d(a aVar) {
            ne.j.M0(aVar, true);
            Q.G(aVar != a.NEVER, true);
        }
    }

    public static class i {
        public static boolean a() {
            return Ye.d.e(De.a.IsLoggerEnabled, true);
        }

        public static void b(boolean z10) {
            Ye.d.o(De.a.IsLoggerEnabled, z10).a();
        }
    }

    public static class j {
        public static /* synthetic */ void a(String str, boolean z10) {
            if (C6218a.M() != null) {
                SharedPreferences M10 = C6218a.M();
                String fCMId = LiveChatUtil.getFCMId();
                if (str != null) {
                    if (fCMId == null || !fCMId.equals(str)) {
                        SharedPreferences.Editor edit = M10.edit();
                        Ye.d.r(De.a.FcmToken, str).a();
                        edit.putBoolean("istestdevice", z10);
                        edit.putBoolean("enablepush", true);
                        if (fCMId != null) {
                            edit.remove("pushstatus");
                        }
                        edit.apply();
                        if ("true".equals(M10.getString("pushallowed", Constants.CASEFIRST_FALSE))) {
                            MobilistenUtil.n();
                        }
                    }
                }
            }
        }

        public static void b() {
            if (C6218a.M() != null) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putBoolean("enableinapp", false);
                edit.apply();
            }
        }

        public static void c() {
            if (C6218a.M() != null) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putBoolean("enableinapp", true);
                edit.apply();
            }
        }

        public static void d(final String str, final boolean z10) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: com.zoho.salesiqembed.k
                @Override // java.lang.Runnable
                public final void run() {
                    ZohoSalesIQ.j.a(str, z10);
                }
            });
        }

        public static int e() {
            int i10 = 0;
            Cursor cursor = null;
            try {
                try {
                    cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE UNREAD_COUNT != 0");
                    while (cursor.moveToNext()) {
                        i10 += cursor.getInt(cursor.getColumnIndexOrThrow("UNREAD_COUNT"));
                    }
                    cursor.close();
                    return i10;
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return i10;
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }

        public static NotificationListener f() {
            return ZohoLiveChat.c.b();
        }

        public static void g(Map map, InterfaceC6686a interfaceC6686a) {
            Kf.a.h(map, false, interfaceC6686a);
        }

        public static void h(Context context, Map map) {
            AbstractC5884j.v(context != null ? context.getApplicationContext() : MobilistenInitProvider.k(), map);
        }

        public static boolean i(Map map) {
            return AbstractC5884j.w(map);
        }

        public static void j(e eVar) {
            Kf.a.j(eVar);
        }

        public static void k(int i10) {
            if (C6218a.M() != null) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putInt("ic_launcher", i10);
                edit.apply();
            }
        }

        public static void l(NotificationListener notificationListener) {
            ZohoLiveChat.c.c(notificationListener);
        }
    }

    public enum k {
        Articles
    }

    public enum l {
        Conversations,
        FAQ,
        KnowledgeBase
    }

    public static class m {
        public static String a(Activity activity) {
            if (activity == null || ZohoLiveChat.getApplicationManager() == null) {
                return null;
            }
            return (String) ZohoLiveChat.getApplicationManager().v().get(activity.getClass().getCanonicalName());
        }

        public static void b(String str) {
            if (str.isEmpty()) {
                return;
            }
            TrackingHelper.performCustomAction(str);
        }

        public static void c(String str, boolean z10) {
            if (z10) {
                UTSUtil.sendCustomAction(str, true);
            } else {
                TrackingHelper.performCustomAction(str);
            }
        }

        public static void d(String str) {
            if (str == null || str.trim().length() <= 0 || ZohoLiveChat.getApplicationManager() == null) {
                return;
            }
            ZohoLiveChat.getApplicationManager();
            if (Uf.j.n() != null) {
                ZohoLiveChat.getApplicationManager().S(str);
                TrackingHelper.updatePageTitle(str);
            }
        }
    }

    public static class n {
        public static void a(String str, String str2) {
            ZohoLiveChat.e.b(str, str2);
        }

        public static void b(String str) {
            if (Ed.a.x() || str == null || str.trim().isEmpty()) {
                return;
            }
            Q.O(str);
            ZohoLiveChat.e.g(str);
            UTSUtil.updatePhone(str);
        }

        public static void c(String str) {
            synchronized (ZohoSalesIQ.VISITOR_DATA_UPDATE_SYNCHRONIZE_LOCK) {
                try {
                    if (!Ed.a.x() && str != null && !str.trim().isEmpty()) {
                        if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                            ZohoLiveChat.e.h(str);
                            Q.M(str);
                            UTSUtil.updateEmail(str);
                        }
                    }
                } finally {
                }
            }
        }

        public static void d(y yVar) {
            ZohoLiveChat.e.i(yVar);
        }

        public static void e(String str) {
            synchronized (ZohoSalesIQ.VISITOR_DATA_UPDATE_SYNCHRONIZE_LOCK) {
                try {
                    if (!Ed.a.x() && str != null && !str.trim().isEmpty()) {
                        Q.I(true);
                        Q.N(str);
                        UTSUtil.updateName(str);
                        Ye.d.r(De.a.VisitorName, str).a();
                    }
                } finally {
                }
            }
        }

        public static void f(String str) {
            ZohoLiveChat.e.j(str);
        }

        public static void g(String str) {
            ZohoLiveChat.e.k(str);
        }
    }

    public static void clearData(Context context) {
        ZohoLiveChat.clearData(context);
    }

    public static void deInit(final InterfaceC6686a interfaceC6686a) {
        if (Ed.a.x()) {
            Ed.a.A(false, null, interfaceC6686a);
        } else {
            ZohoLiveChat.clearDataForRegisterVisitor(MobilistenInitProvider.k(), false, false, null, null, new Function0() { // from class: com.zoho.salesiqembed.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZohoSalesIQ.j(InterfaceC6686a.this);
                }
            });
        }
    }

    public static void dismissUI() {
        if (ZohoLiveChat.getApplicationManager() != null) {
            ZohoLiveChat.getApplicationManager();
            Uf.j.L();
        }
        C6549a.h().g();
    }

    public static Se.a getCommunicationMode() {
        return com.zoho.livechat.android.modules.brand.ui.helpers.a.x();
    }

    public static String getSessionID() {
        return sessionID;
    }

    public static int getStyleForCurrentThemeMode() {
        int i10 = appThemeResourceId;
        SharedPreferences M10 = C6218a.M();
        if (MobilistenInitProvider.k() == null || M10 == null || !M10.getBoolean("SYNC_WITH_OS", true)) {
            return getTheme();
        }
        int i11 = MobilistenInitProvider.k().getResources().getConfiguration().uiMode & 48;
        return i11 != 16 ? i11 != 32 ? i10 : u.f61163i : u.f61164j;
    }

    public static int getTheme() {
        int i10 = appThemeResourceId;
        return i10 != -1 ? i10 : u.f61162h;
    }

    public static /* synthetic */ void i(InitListener initListener, we.e eVar) {
        if (eVar.d()) {
            if (initListener != null) {
                initListener.onInitSuccess();
            }
        } else {
            if (initListener == null || eVar.c() == null) {
                return;
            }
            initListener.onInitError(eVar.c().a(), eVar.c().b());
        }
    }

    public static void init(Application application, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        rd.b.o(new C5735a());
        MobilistenInitProvider.n(application, str, str2, null, null, null, null, null);
        registerCallbacks(application);
    }

    public static void initialize(@NonNull Application application, @NonNull C6069a c6069a, InterfaceC6686a interfaceC6686a) {
        nd.b bVar;
        rd.b.o(new C5735a());
        if (c6069a.i() != null) {
            bVar = new nd.b();
            for (Map.Entry entry : c6069a.i().entrySet()) {
                bVar.c(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
            }
        } else {
            bVar = null;
        }
        if (c6069a.h() != null) {
            if (bVar == null) {
                bVar = new nd.b();
            }
            bVar.b(c6069a.h());
        }
        MobilistenInitProvider.o(application, c6069a, null, null, new a(interfaceC6686a), bVar);
        registerCallbacks(application);
    }

    public static boolean isBrandOnline() {
        return !LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline();
    }

    public static boolean isLiveChatAvailable() {
        return LiveChatUtil.isOpenChatAvailable();
    }

    public static /* synthetic */ Unit j(final InterfaceC6686a interfaceC6686a) {
        Uf.j.f12224n = false;
        Uf.j.f12225o = false;
        if (interfaceC6686a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zoho.salesiqembed.b
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6686a.this.a(we.e.e(Unit.INSTANCE));
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static void present() {
        present(null, null, null);
    }

    private static void registerCallbacks(Application application) {
        if (isLifecycleCallbacksRegistered) {
            return;
        }
        try {
            application.registerActivityLifecycleCallbacks(new b());
            application.registerComponentCallbacks(new c());
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        isLifecycleCallbacksRegistered = true;
    }

    public static void setApplicationContext(Application application) {
        MobilistenInitProvider.p(application);
    }

    public static void setLauncherIcon(Drawable drawable) {
        if (drawable != null) {
            ne.j.y0(drawable);
        }
    }

    public static void setLauncherProperties(nd.c cVar) {
        ne.j.F(cVar, true);
    }

    public static void setPlatformName(String str) {
        if (str != null) {
            if (C6218a.M() == null) {
                LiveChatUtil.platformName = str;
                return;
            }
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putString("PLATFORM_NAME", str);
            edit.apply();
        }
    }

    public static void setSessionID(String str) {
        sessionID = str;
    }

    public static void setTheme(int i10) {
        appThemeResourceId = i10;
        ne.j.q0();
    }

    public static void setUriScheme(@NonNull Ze.a aVar) {
        C6822a.E(aVar);
    }

    @Deprecated
    public static void showLauncher(boolean z10) {
        if (z10) {
            h.d(h.a.ALWAYS);
        } else {
            h.d(h.a.NEVER);
        }
    }

    public static void syncThemeWithOS(boolean z10) {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putBoolean("SYNC_WITH_OS", z10);
            edit.commit();
        }
    }

    public static void present(l lVar) {
        present(lVar, null, null);
    }

    public static void present(l lVar, String str) {
        present(lVar, str, null);
    }

    public static void init(Application application, String str, String str2, nd.b bVar, nd.e eVar) {
        if (str == null || str2 == null) {
            if (eVar != null) {
                eVar.b();
            }
        } else {
            rd.b.o(new C5735a());
            MobilistenInitProvider.n(application, str, str2, null, null, eVar, null, bVar);
            registerCallbacks(application);
        }
    }

    public static void present(l lVar, String str, InterfaceC6686a interfaceC6686a) {
        if (ZohoLiveChat.getApplicationManager() != null) {
            ZohoLiveChat.getApplicationManager();
            LiveChatUtil.openChat(Uf.j.n(), str, false, true, !UTSUtil.isTrackingEnabled() || UTSUtil.shouldWaitForWidgetInteractionTrigger(), false, lVar, null, interfaceC6686a);
        } else if (interfaceC6686a != null) {
            we.d z10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.z();
            if (z10 == null) {
                z10 = we.d.f67649d;
            }
            interfaceC6686a.a(we.e.a(z10));
        }
    }

    public static void init(Application application, String str, String str2, nd.b bVar, InitListener initListener) {
        if (str != null && str2 != null) {
            rd.b.o(new C5735a());
            MobilistenInitProvider.n(application, str, str2, null, null, null, initListener, bVar);
            registerCallbacks(application);
        } else if (initListener != null) {
            we.d dVar = we.d.f67669t;
            initListener.onInitError(dVar.a(), dVar.b());
        }
    }

    @Deprecated
    public static void initialize(@NonNull Application application, @NonNull C6069a c6069a, final InitListener initListener) {
        initialize(application, c6069a, new InterfaceC6686a() { // from class: com.zoho.salesiqembed.a
            @Override // ve.InterfaceC6686a
            public final void a(we.e eVar) {
                ZohoSalesIQ.i(InitListener.this, eVar);
            }
        });
    }

    public static void init(Application application, String str, String str2, nd.b bVar, Bd.b bVar2, InitListener initListener) {
        if (str != null && str2 != null) {
            rd.b.o(new C5735a());
            MobilistenInitProvider.n(application, str, str2, bVar2, null, null, initListener, bVar);
            registerCallbacks(application);
        } else if (initListener != null) {
            we.d dVar = we.d.f67669t;
            initListener.onInitError(dVar.a(), dVar.b());
        }
    }

    public static void init(Application application, String str, String str2, Activity activity, nd.b bVar, InitListener initListener) {
        rd.b.o(new C5735a());
        MobilistenInitProvider.n(application, str, str2, null, activity, null, initListener, bVar);
        registerCallbacks(application);
    }
}
