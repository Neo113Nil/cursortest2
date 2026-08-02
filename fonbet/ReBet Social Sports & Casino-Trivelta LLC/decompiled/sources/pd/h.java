package pd;

import android.app.Application;
import android.content.SharedPreferences;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.modules.authentication.ui.models.SalesIQJWTAuth;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.AbstractC3932a;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import java.net.HttpURLConnection;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import me.C5582a;
import mf.C5583a;
import okhttp3.HttpUrl;
import rd.C6218a;
import ug.AbstractC6574b;
import xe.C6822a;
import ze.C6959a;

/* loaded from: classes4.dex */
public class h implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f63141c = false;

    /* renamed from: d, reason: collision with root package name */
    public static h f63142d;

    /* renamed from: a, reason: collision with root package name */
    public nd.e f63143a;

    /* renamed from: b, reason: collision with root package name */
    public InitListener f63144b;

    public h(InitListener initListener, nd.e eVar) {
        this.f63144b = initListener;
        this.f63143a = eVar;
    }

    public static /* synthetic */ void a() {
        ZohoLiveChat.getApplicationManager();
        if (Uf.j.n() != null) {
            ZohoLiveChat.getApplicationManager();
            ZohoLiveChat.getApplicationManager();
            Uf.j.F(Uf.j.n());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0203, code lost:
    
        if (com.zoho.livechat.android.utils.LiveChatUtil.getAllOpenChatIds().isEmpty() != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0205, code lost:
    
        Tf.b.I(Rf.a.LandedOnApp, com.zoho.livechat.android.utils.LiveChatUtil.getLanguage(), false, null, null, null, com.zoho.salesiqembed.ZohoSalesIQ.m.a(Uf.j.n()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0223, code lost:
    
        if (com.zoho.livechat.android.utils.LiveChatUtil.getAllOpenChatIds().isEmpty() == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Hashtable hashtable, SharedPreferences sharedPreferences) {
        Hashtable hashtable2;
        Locale defaultSystemLocale;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("android_channel", AbstractC6574b.g(hashtable));
        if (hashtable.containsKey("avuid")) {
            edit.putString("avuid", LiveChatUtil.getString(hashtable.get("avuid")));
        }
        String string = C6218a.M().getString("mobilisten_locale", null);
        String string2 = C6218a.M().getString("mobilisten_api_locale", null);
        String o10 = C5583a.o();
        boolean m10 = C5583a.m();
        boolean u10 = C5583a.u();
        boolean t10 = C5583a.t();
        List s10 = C5583a.s();
        edit.putString("mobilisten_locale", LiveChatUtil.getString(hashtable.get("language")));
        Application k10 = MobilistenInitProvider.k();
        if (k10 != null) {
            String languageOrNull = LiveChatUtil.getLanguageOrNull(hashtable);
            if ((languageOrNull == null || languageOrNull.isEmpty()) && (defaultSystemLocale = LiveChatUtil.getDefaultSystemLocale()) != null) {
                languageOrNull = defaultSystemLocale.getLanguage();
            }
            if (languageOrNull != null && !languageOrNull.isEmpty()) {
                Td.e.v0(k10, languageOrNull);
            }
        }
        edit.putString("lsid", (String) hashtable.get("lsid"));
        if (hashtable.containsKey("wms_server_url")) {
            edit.putString("wms_server_url", hashtable.get("wms_server_url").toString());
        }
        edit.commit();
        C5583a.x(string, string2, o10, m10, t10, u10, s10);
        if (!Objects.equals(string2, ZohoSalesIQ.Chat.getLanguage())) {
            edit.putString("mobilisten_api_locale", ZohoSalesIQ.Chat.getLanguage());
            edit.commit();
        }
        com.zoho.livechat.android.modules.brand.ui.helpers.a.Q(Md.a.Call);
        boolean z10 = LiveChatUtil.getAnnonID() == null;
        if (z10) {
            AbstractC3932a.a(this.f63144b, this.f63143a);
        } else {
            rd.b.e().j(hashtable, this.f63144b, this.f63143a);
        }
        boolean z11 = LiveChatUtil.getBoolean(hashtable.get("call_status"));
        boolean equals = "online".equals(hashtable.get("status"));
        Ye.d.o(De.a.AppChatStatus, equals).e(De.a.AppCallStatus, z11).b(true);
        edit.putBoolean("embedstatus", equals || z11);
        if (hashtable.containsKey("waiting_time_config") && (hashtable2 = (Hashtable) hashtable.get("waiting_time_config")) != null && hashtable2.containsKey(Constants.PLATFORM_ANDROID)) {
            LiveChatUtil.setEmbedWaitingTime(LiveChatUtil.getLong(hashtable2.get(Constants.PLATFORM_ANDROID)));
        }
        edit.remove("unsupported");
        edit.remove("embednotallowed");
        edit.remove("ip_blocked");
        edit.commit();
        if (hashtable.containsKey("notifications")) {
            boolean z12 = LiveChatUtil.getBoolean(((Hashtable) hashtable.get("notifications")).get(ViewProps.ENABLED));
            SharedPreferences.Editor edit2 = C6218a.M().edit();
            edit2.putString("pushallowed", LiveChatUtil.getString(Boolean.valueOf(z12)));
            edit2.commit();
            if (z12 && !sharedPreferences.contains("pushstatus")) {
                MobilistenUtil.n();
            } else if (!z12 && sharedPreferences.contains("pushstatus") && Ye.d.c(De.a.FcmToken)) {
                LiveChatUtil.unRegisterDevice();
            }
            edit = edit2;
        }
        if (hashtable.containsKey("article_css_url")) {
            String string3 = LiveChatUtil.getString(hashtable.get("article_css_url"));
            if (!string3.isEmpty()) {
                String string4 = C6218a.M().getString("article_css_url", "");
                SharedPreferences.Editor edit3 = sharedPreferences.edit();
                edit3.putString("article_css_url", string3);
                edit3.commit();
                if (!string4.equalsIgnoreCase(string3) || C6218a.M().getString("article_css", null) == null) {
                    new com.zoho.livechat.android.utils.r(string3).start();
                }
                edit = edit3;
            }
        }
        C6959a.t().G(null);
        if (!UTSUtil.isTrackingEnabled()) {
            edit.remove("zldt");
            edit.apply();
            UTSUtil.clearBotTriggers();
            if (!z10) {
                Tf.b.S();
                try {
                    Thread.sleep(2000L);
                } catch (Throwable unused) {
                }
            }
        }
        Channel m11 = C6822a.m();
        Td.e.M0(Boolean.TRUE, Boolean.valueOf(LiveChatUtil.isChatEnabled()), null);
        if (m11 != null) {
            Td.e.u(m11);
        }
        ne.j.p0();
        ne.j.q0();
        Ue.a.r();
        Ue.a.f();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HttpUrl.Builder g10 = Yd.a.g("visitor/v2/channels/android", new String[0]);
            if (LiveChatUtil.getAVUID() == null) {
                g10.addQueryParameter("fetchavuid", "true");
            }
            if (LiveChatUtil.getAnnonID() != null) {
                g10.addQueryParameter("wms_id", LiveChatUtil.getAnnonID());
            }
            HttpURLConnection h10 = sd.d.h(g10, false, false);
            h10.setConnectTimeout(50000);
            h10.setReadTimeout(30000);
            h10.setInstanceFollowRedirects(true);
            if (h10.getResponseCode() == 200) {
                String t10 = og.i.t(h10.getInputStream());
                LiveChatUtil.log(t10);
                Hashtable hashtable = (Hashtable) AbstractC6574b.d(t10);
                if (hashtable != null && hashtable.containsKey(EventKeys.ERROR_CODE)) {
                    ne.j.S0();
                    Uf.j.f12224n = false;
                    LiveChatUtil.triggerInitListener(false, t10, this.f63144b);
                    if (ZohoLiveChat.getApplicationManager().w() != null) {
                        ZohoLiveChat.getApplicationManager().w().onFailure(601, "operation failed");
                        ZohoLiveChat.getApplicationManager().W(null);
                    }
                    ZohoLiveChat.getApplicationManager();
                    ne.j.t0(Uf.j.n());
                } else if (hashtable != null && hashtable.containsKey(EventKeys.DATA)) {
                    Uf.j.f12224n = true;
                    Hashtable hashtable2 = (Hashtable) hashtable.get(EventKeys.DATA);
                    SharedPreferences M10 = C6218a.M();
                    SharedPreferences.Editor edit = M10.edit();
                    edit.putString("screenname", ((String) ((Hashtable) hashtable2.get("portal_config")).get("name")).replaceAll("\\s", "").toLowerCase());
                    edit.putString(PublisherMetadata.APP_ID, (String) hashtable2.get(PublisherMetadata.APP_ID));
                    if (hashtable2.containsKey("server_time")) {
                        long j10 = LiveChatUtil.getLong(hashtable2.get("server_time"));
                        if (j10 > 0) {
                            edit = C6218a.M().edit();
                            edit.putString("stime", String.valueOf(Long.valueOf(System.currentTimeMillis() - j10)));
                        }
                    }
                    edit.commit();
                    Bd.b t11 = Ed.a.t();
                    if (t11 instanceof SalesIQJWTAuth) {
                        C5582a f10 = Ed.a.f(t11, Bd.a.Initialisation);
                        if (f10.d()) {
                            b(hashtable2, M10);
                        } else if (f10.c() != null && f10.c().b() != null) {
                            if (f10.c().b().intValue() == 6300) {
                                Ed.a.A(true, t11, null);
                            } else if (f10.c().b().intValue() != 6301) {
                                edit.remove("screenname");
                                edit.remove(PublisherMetadata.APP_ID);
                                edit.putBoolean("embednotallowed", true);
                                edit.commit();
                                Uf.j.f12224n = false;
                                ne.j.q0();
                                LiveChatUtil.triggerInitListener(false, f10.c().b().intValue(), f10.c().c(), this.f63144b);
                            }
                        }
                    } else {
                        b(hashtable2, M10);
                    }
                }
            } else {
                ne.j.S0();
                SharedPreferences.Editor edit2 = C6218a.M().edit();
                edit2.putBoolean("embednotallowed", true);
                edit2.apply();
                String t12 = og.i.t(h10.getErrorStream());
                LiveChatUtil.triggerInitListener(false, t12, this.f63144b);
                if (ZohoLiveChat.getApplicationManager().w() != null) {
                    ZohoLiveChat.getApplicationManager().w().onFailure(601, "operation failed");
                    ZohoLiveChat.getApplicationManager().W(null);
                }
                LiveChatUtil.triggerInitListener(false, 601, "operation failed", this.f63144b);
                Ye.a.r(false, this.f63143a);
                LiveChatUtil.log("Mobilisten Android Channel " + t12);
                Uf.j.f12224n = false;
                ne.j.q0();
                ZohoLiveChat.getApplicationManager().p().postDelayed(new Runnable() { // from class: pd.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a();
                    }
                }, 1000L);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
