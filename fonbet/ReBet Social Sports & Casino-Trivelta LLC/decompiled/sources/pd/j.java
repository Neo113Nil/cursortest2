package pd;

import android.app.Activity;
import android.content.SharedPreferences;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.x;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.net.HttpURLConnection;
import java.util.Hashtable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;
import rd.C6218a;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public String f63145a;

    /* renamed from: b, reason: collision with root package name */
    public final InitListener f63146b;

    /* renamed from: c, reason: collision with root package name */
    public final nd.e f63147c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Hashtable f63148a;

        public a(Hashtable hashtable) {
            this.f63148a = hashtable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Q.E(true);
                if (rd.b.d() != null) {
                    rd.b.d().a("libraryproperties", this.f63148a);
                }
                LiveChatUtil.triggerInitListener(true, null, j.this.f63146b);
                if (ZohoLiveChat.getApplicationManager().w() != null) {
                    ZohoLiveChat.getApplicationManager().w().onSuccess();
                    ZohoLiveChat.getApplicationManager().W(null);
                }
                Ye.a.r(true, j.this.f63147c);
                ne.j.q0();
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public j(String str, InitListener initListener, nd.e eVar) {
        this.f63145a = str;
        this.f63146b = initListener;
        this.f63147c = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Rf.a aVar;
        String language;
        Activity n10;
        try {
            HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/sdkdevice", LiveChatUtil.getScreenName());
            g10.addQueryParameter("name", this.f63145a).addQueryParameter("os", Constants.PLATFORM_ANDROID);
            if (LiveChatUtil.getCVUID() != null) {
                g10.addQueryParameter("cvuid", LiveChatUtil.getCVUID());
            }
            String str = "LiveDesk/1.1(" + C6218a.N().trim() + ";" + C6218a.K().trim() + ")";
            HttpURLConnection g11 = sd.d.g(g10);
            g11.setRequestProperty(zendesk.core.Constants.USER_AGENT_HEADER_KEY, str);
            g11.setConnectTimeout(30000);
            g11.setReadTimeout(30000);
            g11.setInstanceFollowRedirects(true);
            if (g11.getResponseCode() != 200) {
                LiveChatUtil.triggerInitListener(false, 601, "operation failed", this.f63146b);
                Ye.a.r(false, this.f63147c);
                if (ZohoLiveChat.getApplicationManager().u() != null) {
                    ZohoLiveChat.getApplicationManager().u().onFailure(601, "operation failed");
                    ZohoLiveChat.getApplicationManager().V(null);
                }
                LiveChatUtil.log("GetWmsIdDetails | response | " + og.i.t(g11.getErrorStream()));
                return;
            }
            String t10 = og.i.t(g11.getInputStream());
            LiveChatUtil.log("GetWmsIdDetails | response | " + t10);
            Hashtable hashtable = (Hashtable) ((Hashtable) AbstractC6574b.d(t10)).get(EventKeys.DATA);
            SharedPreferences.Editor edit = C6218a.M().edit();
            String obj = hashtable.get("annonid").toString();
            if (obj != null) {
                edit.putString("annonid", obj);
            }
            String str2 = (String) hashtable.get("installation_id");
            if (str2 != null) {
                edit.putString("insid", str2);
            }
            String str3 = (String) hashtable.get("pns_key");
            if (str3 != null) {
                edit.putString("pnskey", str3);
            }
            String obj2 = hashtable.get("_zldp").toString();
            if (obj2 != null) {
                edit.putString("zldp", obj2);
            }
            edit.remove("pushstatus");
            String obj3 = hashtable.get("wms_server_url").toString();
            if (obj3 != null) {
                edit.putString("wms_server_url", obj3);
            }
            edit.commit();
            if ("true".equals(C6218a.M().getString("pushallowed", com.facebook.hermes.intl.Constants.CASEFIRST_FALSE))) {
                MobilistenUtil.n();
            }
            qd.c.b();
            x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: pd.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            });
            xVar.d(true);
            xVar.run();
            ZohoLiveChat.getApplicationManager().p().post(new a(hashtable));
            if (ZohoLiveChat.getApplicationManager().u() != null) {
                if (Zd.a.g()) {
                    Zd.a.k();
                }
                ZohoLiveChat.getApplicationManager().u().onSuccess();
                ZohoLiveChat.getApplicationManager().V(null);
            }
            Tf.b.S();
            try {
                Thread.sleep(2000L);
            } catch (Throwable unused) {
                if (LiveChatUtil.getAllOpenChatIds().isEmpty()) {
                    aVar = Rf.a.LandedOnApp;
                    language = LiveChatUtil.getLanguage();
                    n10 = Uf.j.n();
                }
            }
            if (LiveChatUtil.getAllOpenChatIds().isEmpty()) {
                aVar = Rf.a.LandedOnApp;
                language = LiveChatUtil.getLanguage();
                n10 = Uf.j.n();
                Tf.b.I(aVar, language, false, null, null, null, ZohoSalesIQ.m.a(n10));
            }
            if (!LiveChatUtil.canConnectToWMS()) {
                if (qd.c.k()) {
                    return;
                }
                if (rd.b.g() != null && !rd.b.g().equals("0")) {
                    return;
                }
            }
            rd.b.b();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            Ye.a.r(false, this.f63147c);
            LiveChatUtil.triggerInitListener(false, 601, "operation failed", this.f63146b);
        }
    }
}
