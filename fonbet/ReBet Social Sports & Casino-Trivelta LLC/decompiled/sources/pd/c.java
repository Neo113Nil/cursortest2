package pd;

import a1.C1908a;
import android.content.Intent;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final String f63129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63131c;

    /* renamed from: d, reason: collision with root package name */
    public String f63132d = "";

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC6064a f63133e;

    public c(String str, String str2, String str3, InterfaceC6064a interfaceC6064a) {
        this.f63129a = str;
        this.f63130b = str2;
        this.f63131c = str3;
        this.f63133e = interfaceC6064a;
    }

    public void a() {
        start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        r1 = og.i.t(r1.getInputStream());
        r5.f63132d = r1;
        r1 = (java.util.Hashtable) ((java.util.Hashtable) ug.AbstractC6574b.d(r1)).get(com.twilio.voice.EventKeys.DATA);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        com.zoho.livechat.android.utils.MobilistenUtil.B(r5.f63131c, r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        InterfaceC6064a interfaceC6064a;
        try {
            try {
                HttpURLConnection g10 = sd.d.g(Yd.a.g("visitor/v2/%1$s/conversations/%2$s/transfer", LiveChatUtil.getScreenName(), this.f63129a));
                g10.setConnectTimeout(3000);
                g10.setReadTimeout(3000);
                g10.setRequestMethod("PUT");
                HashMap hashMap = new HashMap();
                String str = this.f63130b;
                if (str != null && str.length() > 0) {
                    hashMap.put("department_id", this.f63130b);
                }
                Boolean bool = Boolean.TRUE;
                hashMap.put("queue_support", bool);
                hashMap.put("show_alert", bool);
                og.i.v(g10.getOutputStream(), hashMap);
                int responseCode = g10.getResponseCode();
                LiveChatUtil.log("Chat Transfer | status code: " + responseCode);
                if (responseCode != 200 && responseCode != 204) {
                    String t10 = og.i.t(g10.getErrorStream());
                    this.f63132d = t10;
                    int a10 = o.a(t10);
                    InterfaceC6064a interfaceC6064a2 = this.f63133e;
                    if (interfaceC6064a2 != null && a10 != -1) {
                        interfaceC6064a2.a(this.f63131c, a10, null);
                    }
                    LiveChatUtil.log("Chat Transfer | response | " + this.f63132d);
                    interfaceC6064a = this.f63133e;
                    if (interfaceC6064a == null) {
                        interfaceC6064a.onComplete();
                        this.f63133e = null;
                        return;
                    }
                    return;
                }
                Q.f(this.f63131c);
                Intent intent = new Intent("receivelivechat");
                intent.putExtra("message", "refreshchatlist");
                intent.putExtra("chid", this.f63131c);
                C1908a.b(MobilistenInitProvider.k()).d(intent);
                InterfaceC6064a interfaceC6064a3 = this.f63133e;
                if (interfaceC6064a3 != null) {
                    interfaceC6064a3.onSuccess();
                }
                LiveChatUtil.log("Chat Transfer | response | " + this.f63132d);
                interfaceC6064a = this.f63133e;
                if (interfaceC6064a == null) {
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                InterfaceC6064a interfaceC6064a4 = this.f63133e;
                if (interfaceC6064a4 != null) {
                    interfaceC6064a4.onComplete();
                    this.f63133e = null;
                }
            }
        } catch (Throwable th2) {
            InterfaceC6064a interfaceC6064a5 = this.f63133e;
            if (interfaceC6064a5 != null) {
                interfaceC6064a5.onComplete();
                this.f63133e = null;
            }
            throw th2;
        }
    }
}
