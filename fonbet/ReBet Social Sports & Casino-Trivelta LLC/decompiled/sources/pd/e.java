package pd;

import a1.C1908a;
import android.content.Intent;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.x;
import java.net.HttpURLConnection;
import java.util.Hashtable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import rd.C6218a;
import sd.EnumC6362b;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class e extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63134a;

    /* renamed from: b, reason: collision with root package name */
    public String f63135b = "";

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC6064a f63136c;

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, InterfaceC6064a interfaceC6064a) {
        this.f63134a = str;
        this.f63136c = interfaceC6064a;
        start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0137, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0139, code lost:
    
        r0.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013c, code lost:
    
        com.zoho.livechat.android.utils.Q.f44447F.f44473h.addIfAbsent(r5.f63134a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0145, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014b, code lost:
    
        if (r0 == null) goto L32;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        InterfaceC6064a interfaceC6064a;
        try {
            try {
                Q.f44447F.f44473h.addIfAbsent(this.f63134a);
                HttpURLConnection g10 = sd.d.g(Yd.a.g("visitor/v2/%1$s/conversations/%2$s/close", LiveChatUtil.getScreenName(), this.f63134a));
                g10.setRequestProperty("X-Pex-Agent", C6218a.X());
                g10.setConnectTimeout(3000);
                g10.setReadTimeout(3000);
                g10.setRequestMethod("PUT");
                int responseCode = g10.getResponseCode();
                LiveChatUtil.log("Conversation Close | status code: " + responseCode);
                if (responseCode == 200) {
                    this.f63135b = og.i.t(g10.getInputStream());
                    LiveChatUtil.log("Conversation Close | response | " + this.f63135b);
                    Hashtable hashtable = (Hashtable) AbstractC6574b.d(this.f63135b);
                    String str = null;
                    Hashtable hashtable2 = hashtable != null ? (Hashtable) hashtable.get(EventKeys.DATA) : null;
                    if (hashtable2 != null) {
                        str = LiveChatUtil.getString(hashtable2.get("chat_id"));
                        rd.b.e().h(str, Long.valueOf(LiveChatUtil.getLong(hashtable2.get("end_time"))));
                    }
                    SalesIQChat chat = LiveChatUtil.getChat(str);
                    if (chat != null) {
                        chat.setLastmsgtime(rd.b.f());
                        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                        Intent intent = new Intent("receivelivechat");
                        intent.putExtra("message", "refreshchat");
                        intent.putExtra("chid", chat.getChid());
                        C1908a.b(MobilistenInitProvider.k()).d(intent);
                    }
                    InterfaceC6064a interfaceC6064a2 = this.f63136c;
                    if (interfaceC6064a2 != null) {
                        interfaceC6064a2.onSuccess();
                    }
                } else {
                    String t10 = og.i.t(g10.getErrorStream());
                    this.f63135b = t10;
                    int a10 = o.a(t10);
                    if (a10 == EnumC6362b.CONVERSATION_ALREADY_ENDED.code) {
                        SalesIQChat chat2 = LiveChatUtil.getChat(LiveChatUtil.getChatidfromVisitorID(this.f63134a));
                        if (chat2 != null) {
                            chat2.setStatus(4);
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat2);
                        }
                        x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: pd.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        });
                        xVar.c(this.f63134a);
                        LiveChatUtil.submitTaskToExecutorServiceSafely(xVar);
                    }
                    InterfaceC6064a interfaceC6064a3 = this.f63136c;
                    if (interfaceC6064a3 != null) {
                        interfaceC6064a3.a(this.f63134a, a10, this.f63135b);
                    }
                }
                interfaceC6064a = this.f63136c;
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                interfaceC6064a = this.f63136c;
            }
        } catch (Throwable th2) {
            InterfaceC6064a interfaceC6064a4 = this.f63136c;
            if (interfaceC6064a4 != null) {
                interfaceC6064a4.onComplete();
            }
            Q.f44447F.f44473h.addIfAbsent(this.f63134a);
            throw th2;
        }
    }
}
