package com.zoho.livechat.android;

import Uf.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.annotation.NonNull;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.FAQCategoryListener;
import com.zoho.livechat.android.listeners.FAQListener;
import com.zoho.livechat.android.listeners.RegisterListener;
import com.zoho.livechat.android.listeners.SalesIQActionListener;
import com.zoho.livechat.android.listeners.SalesIQFAQListener;
import com.zoho.livechat.android.listeners.SalesIQListener;
import com.zoho.livechat.android.listeners.UnRegisterListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.data.local.MobilistenDatabase;
import com.zoho.livechat.android.modules.conversations.models.SalesIQConversation;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.C3951u;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.N;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSAdapter;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.AbstractC5484f;
import mf.C5583a;
import od.AbstractC5884j;
import od.RunnableC5874H;
import od.t;
import od.y;
import og.i;
import pd.h;
import rd.C6218a;
import td.C6461a;
import ze.C6959a;

/* loaded from: classes4.dex */
public class ZohoLiveChat {
    private static NotificationListener notificationListener;
    private static SalesIQListener salesIQListener;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static SalesIQActionListener f42480a;

        /* renamed from: b, reason: collision with root package name */
        public static ArrayList f42481b = new ArrayList();

        public static ArrayList a() {
            return f42481b;
        }

        public static SalesIQActionListener b() {
            return f42480a;
        }

        public static void c(String str) {
            if (str == null || f42481b.contains(str)) {
                return;
            }
            f42481b.add(str);
        }

        public static void d(SalesIQActionListener salesIQActionListener) {
            f42480a = salesIQActionListener;
        }

        public static void e(long j10) {
            if (C6218a.M() != null) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putLong("timeout", j10);
                edit.apply();
            }
        }

        public static void f(String str) {
            if (str == null || !f42481b.contains(str)) {
                return;
            }
            f42481b.remove(str);
        }

        public static void g() {
            f42481b.clear();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static SalesIQFAQListener f42482a;

        public static void a(FAQListener fAQListener) {
            b(null, fAQListener);
        }

        public static void b(String str, FAQListener fAQListener) {
            try {
                if (MobilistenUtil.j()) {
                    fAQListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                    return;
                }
                if (!LiveChatUtil.isEnabled()) {
                    fAQListener.onFailure(605, "mobilisten disabled");
                } else if (C6218a.c0()) {
                    C5583a.k(null, str, null, 1, 99, fAQListener);
                } else {
                    fAQListener.onFailure(600, "No network connection");
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }

        public static void c(FAQCategoryListener fAQCategoryListener) {
            d(null, fAQCategoryListener);
        }

        public static void d(String[] strArr, FAQCategoryListener fAQCategoryListener) {
            try {
                if (MobilistenUtil.j()) {
                    fAQCategoryListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                    return;
                }
                if (!LiveChatUtil.isEnabled()) {
                    fAQCategoryListener.onFailure(605, "mobilisten disabled");
                } else if (C6218a.c0()) {
                    new C3951u(strArr, fAQCategoryListener).start();
                } else {
                    fAQCategoryListener.onFailure(600, "No network connection");
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }

        public static SalesIQFAQListener e() {
            return f42482a;
        }
    }

    public static class c {
        public static int a() {
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

        public static NotificationListener b() {
            return ZohoLiveChat.notificationListener;
        }

        public static void c(NotificationListener notificationListener) {
            NotificationListener unused = ZohoLiveChat.notificationListener = notificationListener;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static ArrayList f42483a = new ArrayList();

        public static void a(String str) {
            if (f42483a.contains(str)) {
                f42483a.remove(str);
            }
        }

        public static void b(String str) {
            if (f42483a.contains(str)) {
                return;
            }
            f42483a.add(str);
        }

        public static ArrayList c() {
            return f42483a;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static String f42484a;

        /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void a(String str) {
            String str2;
            boolean z10;
            SalesIQChat chat;
            if (ZohoLiveChat.getApplicationManager() != null) {
                ZohoLiveChat.getApplicationManager();
                if (j.n() != null) {
                    boolean isMultipleChatsDisabled = LiveChatUtil.isMultipleChatsDisabled();
                    if (str != null && str.trim().length() > 0 && !LiveChatUtil.isHideWhenOffline() && LiveChatUtil.isEmbedAllowed() && LiveChatUtil.isAppEnabled() && LiveChatUtil.isSupportedVersion() && LiveChatUtil.isChatEnabled() && LiveChatUtil.enableChatInOfflineMode()) {
                        if (isMultipleChatsDisabled) {
                            ArrayList<String> connectedChatIds = LiveChatUtil.getConnectedChatIds();
                            ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                            z10 = false;
                            if (!connectedChatIds.isEmpty()) {
                                str2 = connectedChatIds.get(0);
                            } else if (!allOpenChatIds.isEmpty()) {
                                str2 = allOpenChatIds.get(0);
                            }
                            chat = LiveChatUtil.getChat(str2);
                            if (LiveChatUtil.canAllowOpenChatActivityInOfflineState(chat) && !C6218a.c0()) {
                                MobilistenUtil.v(t.f61107s);
                                return;
                            }
                            if (chat == null && chat.getType() == SalesIQChat.c.Call) {
                                return;
                            }
                            ZohoLiveChat.getApplicationManager();
                            Intent intent = new Intent(j.n(), (Class<?>) ChatActivity.class);
                            if (chat != null) {
                                LiveChatUtil.setStartChatEnabled();
                            } else {
                                str2 = chat.getChid();
                            }
                            intent.putExtra("chid", str2);
                            if (z10) {
                                intent.putExtra("question", str);
                            }
                            intent.putExtra("mode", "SINGLETASK");
                            intent.setFlags(268435456);
                            rd.b.b();
                            ZohoLiveChat.getApplicationManager();
                            j.n().startActivity(intent);
                        }
                        str2 = "temp_chid";
                        z10 = true;
                        chat = LiveChatUtil.getChat(str2);
                        if (LiveChatUtil.canAllowOpenChatActivityInOfflineState(chat)) {
                        }
                        if (chat == null) {
                        }
                        ZohoLiveChat.getApplicationManager();
                        Intent intent2 = new Intent(j.n(), (Class<?>) ChatActivity.class);
                        if (chat != null) {
                        }
                        intent2.putExtra("chid", str2);
                        if (z10) {
                        }
                        intent2.putExtra("mode", "SINGLETASK");
                        intent2.setFlags(268435456);
                        rd.b.b();
                        ZohoLiveChat.getApplicationManager();
                        j.n().startActivity(intent2);
                    }
                }
            }
        }

        public static void b(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            MobilistenUtil.i().a(str, str2);
            UTSUtil.updateCustomerInfo();
        }

        public static HashMap c() {
            return (HashMap) MobilistenUtil.i().b().b();
        }

        public static String d() {
            return Ye.d.k(De.a.VisitorPhone);
        }

        public static String e() {
            return Ye.d.l(De.a.VisitorEmail, null);
        }

        public static String f() {
            return f42484a;
        }

        public static void g(String str) {
            if (str == null) {
                return;
            }
            Ye.d.r(De.a.VisitorPhone, str).a();
        }

        public static void h(String str) {
            if (str == null || !Patterns.EMAIL_ADDRESS.matcher(str).matches() || C6218a.M() == null) {
                return;
            }
            Ye.d.r(De.a.VisitorEmail, str).a();
            String visitorName = LiveChatUtil.getVisitorName(false);
            if ((visitorName == null || LiveChatUtil.isAnnonVisitorbyName(visitorName)) && e() != null) {
                String[] split = str.split("@");
                if (split.length <= 0 || Q.B()) {
                    return;
                }
                Ye.d.r(De.a.VisitorName, split[0]).a();
            }
        }

        public static void i(y yVar) {
            MobilistenUtil.c.b().a(yVar);
        }

        public static void j(String str) {
            f42484a = str;
        }

        public static void k(final String str) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: od.L
                @Override // java.lang.Runnable
                public final void run() {
                    ZohoLiveChat.e.a(str);
                }
            });
        }
    }

    static {
        AbstractC5484f.J(true);
    }

    public static /* synthetic */ Unit a(Context context, SalesIQConversation salesIQConversation) {
        performCleanup(context);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(Context context) {
        Q.m();
        Q.l();
        if (LiveChatUtil.isSupportedVersion()) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new h(null, null));
        }
        qd.c.e();
        qd.c.b();
        UTSAdapter.disconnect();
        wd.d.j(context);
        getApplicationManager();
        ne.j.t0(j.n());
    }

    public static /* synthetic */ Unit c(final j jVar, final Context context, final boolean z10, final Bd.b bVar, final String str, final Function0[] function0Arr) {
        jVar.p().post(new Runnable() { // from class: od.E
            @Override // java.lang.Runnable
            public final void run() {
                ZohoLiveChat.finalizeCleanup(context, jVar, z10, bVar, str, function0Arr);
            }
        });
        return Unit.INSTANCE;
    }

    public static void clearData(final Context context) {
        if (getApplicationManager() == null) {
            return;
        }
        try {
            if (Td.e.m0()) {
                Td.e.w(new Function1() { // from class: od.G
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZohoLiveChat.a(context, (SalesIQConversation) obj);
                    }
                });
            } else {
                performCleanup(context);
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void clearDataForRegisterVisitor(Context context) {
        clearDataForRegisterVisitor(context, true, true, null, null, null);
    }

    public static /* synthetic */ Unit d(Context context, j jVar, boolean z10, boolean z11, Bd.b bVar, String str, Function0[] function0Arr, SalesIQConversation salesIQConversation) {
        performCleanup(context, jVar, z10, z11, bVar, str, function0Arr);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit e(final Context context) {
        getApplicationManager().p().post(new Runnable() { // from class: od.J
            @Override // java.lang.Runnable
            public final void run() {
                ZohoLiveChat.b(context);
            }
        });
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void f(SharedPreferences sharedPreferences, boolean z10, boolean z11, boolean z12, String str, boolean z13, boolean z14, Function0 function0) {
        validateAndRetainNeededSharedPreferencesData(sharedPreferences, z10, z11, z12, str, z13, z14);
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finalizeCleanup(Context context, j jVar, boolean z10, Bd.b bVar, final String str, Function0<Unit>[] function0Arr) {
        Q.m();
        Q.l();
        LiveChatUtil.log("MultipleInit - clearDataForRegisterVisitor onComplete " + z10);
        if (z10 && bVar != null) {
            Ed.a.B(bVar);
        }
        if (z10 && LiveChatUtil.isSupportedVersion()) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new h(null, null));
        }
        qd.c.e();
        qd.c.b();
        UTSAdapter.disconnect();
        wd.d.j(context);
        ne.j.t0(j.n());
        C6461a.f65810a.a();
        Ue.a.e();
        LiveChatUtil.reInitialiseExecutorService();
        if (z10) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: od.F
                @Override // java.lang.Runnable
                public final void run() {
                    ZohoLiveChat.g(str);
                }
            });
        }
        invokeCallback(function0Arr);
    }

    public static /* synthetic */ void g(String str) {
        if (i.f(str)) {
            Ye.d.r(De.a.CVUID, str).b(true);
        }
        if (LiveChatUtil.isSupportedVersion()) {
            new h(null, null).run();
        }
    }

    public static j getApplicationManager() {
        return MobilistenInitProvider.m();
    }

    public static SalesIQListener getListener() {
        return salesIQListener;
    }

    private static void handleFailure(j jVar, String str, Function0<Unit>[] function0Arr) {
        if (jVar.u() != null) {
            jVar.u().onFailure(601, str);
        }
        if (jVar.w() != null) {
            jVar.w().onFailure(601, str);
        }
        LiveChatUtil.log(str);
        invokeCallback(function0Arr);
    }

    private static void invokeCallback(Function0<Unit>[] function0Arr) {
        Function0<Unit> function0 = function0Arr[0];
        if (function0 != null) {
            function0.invoke();
            function0Arr[0] = null;
        }
    }

    public static boolean isSDKEnabled() {
        return (!LiveChatUtil.isEnabled() || LiveChatUtil.isHideOutsideBusinessHours() || LiveChatUtil.isHideWhenOffline()) ? false : true;
    }

    private static void performCleanup(final Context context) {
        Q.j();
        Tf.b.i();
        Ue.a.e();
        Ff.a.b();
        C6959a.g();
        C6461a.f65810a.a();
        UTSUtil.resetTrackingConsent();
        com.zoho.livechat.android.provider.a aVar = com.zoho.livechat.android.provider.a.INSTANCE;
        aVar.delete(context.getContentResolver(), b.a.f44269a, null, null);
        aVar.delete(context.getContentResolver(), b.c.f44270a, null, null);
        if (getApplicationManager() != null) {
            MobilistenDatabase h10 = Yd.a.h();
            h10.getQueryExecutor().execute(new RunnableC5874H(h10));
        }
        SharedPreferences M10 = C6218a.M();
        if (M10 != null) {
            retainPermanentSharedPreferenceValues(M10, false, true, false, null, new Function0() { // from class: od.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZohoLiveChat.e(context);
                }
            });
        }
    }

    public static void printDebugLogs(boolean z10) {
        Q.f44460u = z10;
    }

    public static void registerVisitor(@NonNull String str) {
        LiveChatUtil.registerVisitor(str, null);
    }

    private static void retainPermanentSharedPreferenceValues(final SharedPreferences sharedPreferences, final boolean z10, final boolean z11, final boolean z12, String str, final Function0<Unit> function0) {
        String str2;
        final boolean z13;
        final boolean z14;
        De.a aVar = De.a.FcmToken;
        if (Ye.d.c(aVar)) {
            str2 = Ye.d.k(aVar);
            boolean z15 = sharedPreferences.getBoolean("istestdevice", false);
            z14 = sharedPreferences.getBoolean("enablepush", false);
            z13 = z15;
        } else {
            str2 = null;
            z13 = false;
            z14 = false;
        }
        final String str3 = str2;
        if (Ye.d.c(aVar) && sharedPreferences.contains("pushstatus")) {
            LiveChatUtil.unRegisterDevice(new N.a() { // from class: od.C
                @Override // com.zoho.livechat.android.utils.N.a
                public final void invoke() {
                    ZohoLiveChat.f(sharedPreferences, z10, z11, z12, str3, z13, z14, function0);
                }
            });
        } else {
            validateAndRetainNeededSharedPreferencesData(sharedPreferences, z10, z11, z12, str3, z13, z14);
            function0.invoke();
        }
    }

    public static void setListener(SalesIQListener salesIQListener2) {
        salesIQListener = salesIQListener2;
    }

    public static void setTabOrder(ZohoSalesIQ.l... lVarArr) {
        MobilistenUtil.o(lVarArr);
    }

    public static void unregisterVisitor(Context context) {
        if (Ed.a.x()) {
            return;
        }
        LiveChatUtil.setAVUID(null);
        if (LiveChatUtil.setCVUID(null, null, null)) {
            return;
        }
        clearDataForRegisterVisitor(context);
    }

    private static void validateAndRetainNeededSharedPreferencesData(SharedPreferences sharedPreferences, boolean z10, boolean z11, boolean z12, String str, boolean z13, boolean z14) {
        boolean z15;
        String str2;
        String str3;
        String str4;
        boolean z16;
        int i10;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        float f10;
        boolean z21;
        boolean z22;
        boolean z23;
        String k10 = z11 ? Ye.d.k(De.a.AppKey) : null;
        String k11 = z11 ? Ye.d.k(De.a.AccessKey) : null;
        De.a aVar = De.a.CVUID;
        String k12 = Ye.d.k(aVar);
        int i11 = Yd.a.o().getInt("encrypted_data_version", 0);
        boolean z24 = Yd.a.o().getBoolean("are_new_encrypted_keys_present_in_default_preferences", false);
        ZohoSalesIQ.h.a aVar2 = ZohoSalesIQ.h.a.NEVER;
        String name = aVar2.name();
        String name2 = aVar2.name();
        boolean contains = sharedPreferences.contains("showLaucher");
        if (z10) {
            if (sharedPreferences.contains("showLaucher")) {
                z22 = false;
                z23 = sharedPreferences.getBoolean("showLaucher", false);
                contains = true;
            } else {
                z22 = false;
                z23 = false;
            }
            boolean z25 = sharedPreferences.getBoolean("SYNC_WITH_OS", true);
            boolean e10 = Ye.d.e(De.a.EnableDragDismissing, z22);
            if (sharedPreferences.contains("launcher_visibility_mode")) {
                name = Ye.d.l(De.a.LauncherVisibilityMode, aVar2.name());
                z22 = true;
            }
            String l10 = Ye.d.l(De.a.CustomLauncherVisibilityMode, aVar2.name());
            float x10 = C6218a.x();
            int w10 = C6218a.w();
            boolean z26 = contains;
            f10 = x10;
            z21 = C6218a.e0();
            z16 = z26;
            str4 = l10;
            z20 = z25;
            i10 = w10;
            str2 = "SYNC_WITH_OS";
            str3 = name;
            z15 = z22;
            z18 = e10;
            z17 = C6218a.d0();
            z19 = z23;
        } else {
            z15 = false;
            str2 = "SYNC_WITH_OS";
            str3 = name;
            str4 = name2;
            z16 = contains;
            i10 = 0;
            z17 = false;
            z18 = false;
            z19 = false;
            z20 = true;
            f10 = 0.0f;
            z21 = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Ye.d.b();
        edit.clear();
        edit.commit();
        String str5 = str3;
        Ge.h j10 = Ye.d.j();
        if (z11) {
            j10.h(De.a.AppKey, k10).h(De.a.AccessKey, k11);
        }
        if (z12) {
            j10.h(aVar, k12);
        }
        j10.h(De.a.FcmToken, str).b(true);
        edit.putBoolean("istestdevice", z13);
        edit.putBoolean("enablepush", z14);
        edit.putInt("encrypted_data_version", i11);
        edit.putBoolean("are_new_encrypted_keys_present_in_default_preferences", z24);
        if (z10) {
            edit.putInt("launcher_mode", i10);
            edit.putFloat("launcher_y_in_points", f10);
            edit.putBoolean("launcher_in_right_side", z21);
            edit.putBoolean("is_launcher_in_bottom_side", z17);
            edit.putBoolean("enable_launcher_drag_dismissing", z18);
            if (z15) {
                edit.putString("launcher_visibility_mode", str5);
            }
            if (z16) {
                Q.G(z19, z16);
            }
            edit.putString("custom_launcher_visibility_mode", str4);
            edit.putBoolean(str2, z20);
        }
        edit.commit();
    }

    public static void clearDataForRegisterVisitor(final Context context, final boolean z10, final boolean z11, final Bd.b bVar, final String str, Function0<Unit> function0) {
        final Function0[] function0Arr = {function0};
        final j applicationManager = getApplicationManager();
        if (applicationManager == null) {
            invokeCallback(function0Arr);
            return;
        }
        try {
            if (!Td.e.m0()) {
                performCleanup(context, applicationManager, z10, z11, bVar, str, function0Arr);
                return;
            }
            try {
                Td.e.w(new Function1() { // from class: od.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZohoLiveChat.d(context, applicationManager, z10, z11, bVar, str, function0Arr, (SalesIQConversation) obj);
                    }
                });
            } catch (Exception e10) {
                e = e10;
                applicationManager = applicationManager;
                function0Arr = function0Arr;
                handleFailure(applicationManager, e.getMessage(), function0Arr);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void registerVisitor(@NonNull String str, RegisterListener registerListener) {
        LiveChatUtil.registerVisitor(str, registerListener);
    }

    public static void unregisterVisitor(Context context, UnRegisterListener unRegisterListener) {
        if (Ed.a.x()) {
            unRegisterListener.onFailure(6303, "Cannot use unregisterVisitor method when user is logged in.");
            return;
        }
        if (C6218a.c0()) {
            if (MobilistenUtil.j()) {
                unRegisterListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                return;
            }
            LiveChatUtil.setAVUID(null);
            if (LiveChatUtil.setCVUID(null, null, unRegisterListener)) {
                return;
            }
            clearDataForRegisterVisitor(context);
            return;
        }
        unRegisterListener.onFailure(600, "No network connection");
    }

    private static void performCleanup(final Context context, final j jVar, boolean z10, final boolean z11, final Bd.b bVar, final String str, final Function0<Unit>[] function0Arr) {
        AbstractC5884j.g();
        com.zoho.livechat.android.utils.y.INSTANCE.getFileCache().a(context);
        Tf.b.i();
        boolean z12 = false;
        ne.j.N0(false);
        Q.j();
        C6218a.a();
        Ff.a.b();
        C6959a.g();
        com.zoho.livechat.android.provider.a aVar = com.zoho.livechat.android.provider.a.INSTANCE;
        aVar.delete(context.getContentResolver(), b.a.f44269a, null, null);
        aVar.delete(context.getContentResolver(), b.c.f44270a, null, null);
        MobilistenDatabase h10 = Yd.a.h();
        h10.getQueryExecutor().execute(new RunnableC5874H(h10));
        SharedPreferences M10 = C6218a.M();
        if (M10 != null) {
            if (z10 && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            retainPermanentSharedPreferenceValues(M10, true, z10, z12, str, new Function0() { // from class: od.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZohoLiveChat.c(Uf.j.this, context, z11, bVar, str, function0Arr);
                }
            });
            return;
        }
        handleFailure(jVar, "operation failed", function0Arr);
    }
}
