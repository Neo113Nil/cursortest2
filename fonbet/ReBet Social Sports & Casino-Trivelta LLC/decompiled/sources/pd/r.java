package pd;

import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class r extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63164a = "";

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f63165b;

    public r(ArrayList arrayList) {
        this.f63165b = arrayList;
    }

    public void a() {
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection g10 = sd.d.g(Yd.a.g("visitor/v2/%1$s/conversations/queue/position", LiveChatUtil.getScreenName()));
            g10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_ids", this.f63165b);
            og.i.v(g10.getOutputStream(), hashMap);
            if (g10.getResponseCode() != 200) {
                this.f63164a = og.i.t(g10.getErrorStream());
                LiveChatUtil.log("Mobilisten QueuePosition API - Response = " + this.f63164a);
                return;
            }
            this.f63164a = og.i.t(g10.getInputStream());
            LiveChatUtil.log("Mobilisten QueuePosition API - Response = " + this.f63164a);
            rd.b.e().l((Hashtable) ((Hashtable) AbstractC6574b.d(this.f63164a)).get(EventKeys.DATA));
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
