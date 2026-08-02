package pd;

import a1.C1908a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Hashtable;
import okhttp3.HttpUrl;
import rd.C6218a;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63150a;

    /* renamed from: b, reason: collision with root package name */
    public String f63151b;

    /* renamed from: c, reason: collision with root package name */
    public String f63152c;

    /* renamed from: d, reason: collision with root package name */
    public String f63153d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f63154e;

    public k(String str, String str2, String str3, String str4) {
        this.f63150a = str;
        this.f63151b = str2;
        this.f63152c = str3;
        this.f63154e = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        Exception e10;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream2 = null;
        httpURLConnection = null;
        try {
            try {
                HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/conversations/join_proactive", LiveChatUtil.getScreenName());
                LiveChatUtil.log("ProActive | url: " + g10);
                HttpURLConnection g11 = sd.d.g(g10);
                try {
                    g11.setRequestProperty("X-Pex-Agent", C6218a.X());
                    g11.setRequestMethod("PUT");
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_id", LiveChatUtil.getAnnonID());
                    if (LiveChatUtil.getAVUID() != null) {
                        hashMap.put("avuid", LiveChatUtil.getAVUID());
                    }
                    if (LiveChatUtil.getCVUID() != null) {
                        hashMap.put("cvuid", LiveChatUtil.getCVUID());
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("visitor", hashMap);
                    hashMap2.put("question", this.f63150a);
                    String str = this.f63151b;
                    if (str != null) {
                        hashMap2.put("client_message_id", str);
                    }
                    String str2 = this.f63152c;
                    if (str2 != null) {
                        hashMap2.put("chat_id", str2);
                    }
                    if (LiveChatUtil.getZLDT() != null) {
                        hashMap2.put("uvid", LiveChatUtil.getZLDT());
                    }
                    if (LiveChatUtil.getSID() != null) {
                        hashMap2.put("session_id", LiveChatUtil.getSID());
                    }
                    if (!ZohoLiveChat.e.c().isEmpty()) {
                        hashMap2.put("customer_info", ZohoLiveChat.e.c());
                    }
                    outputStream = g11.getOutputStream();
                    try {
                        og.i.v(outputStream, hashMap2);
                        int responseCode = g11.getResponseCode();
                        LiveChatUtil.log("ProActive | status code: " + responseCode);
                        if (responseCode == 200) {
                            inputStream2 = g11.getInputStream();
                            this.f63153d = og.i.t(inputStream2);
                            LiveChatUtil.log("ProActive | Success: " + this.f63153d);
                            String str3 = "";
                            ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
                            Hashtable hashtable = (Hashtable) AbstractC6574b.d(this.f63153d);
                            if (hashtable != null) {
                                Hashtable hashtable2 = (Hashtable) hashtable.get(EventKeys.DATA);
                                String string = LiveChatUtil.getString(hashtable2.get("chat_id"));
                                String string2 = LiveChatUtil.getString(hashtable2.get(StackTraceHelper.ID_KEY));
                                String string3 = LiveChatUtil.getString(hashtable2.get("wms_chat_id"));
                                String string4 = LiveChatUtil.getString(hashtable2.get("reference_id"));
                                boolean z10 = LiveChatUtil.getBoolean(hashtable2.get("unread_status"));
                                Hashtable hashtable3 = (Hashtable) hashtable2.get("attender");
                                SalesIQChat chat = LiveChatUtil.getChat(this.f63152c);
                                if (chat != null && chat.getConvID() != null) {
                                    String convID = chat.getConvID();
                                    De.a aVar = De.a.OngoingConversationContextAcknowledgementKey;
                                    if (convID.equals(Ye.d.k(aVar))) {
                                        Ye.d.t(aVar);
                                        Ye.d.t(De.a.OngoingConversationContextRequestedMessages);
                                        Ye.d.t(De.a.OngoingConversationContextAppStatus);
                                        Ye.d.t(De.a.IsOngoingConversationContextAutoReplyOn);
                                        Ye.d.t(De.a.IsCampaignSuggestionsSubscribed);
                                    }
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("RCHATID", string3);
                                contentValues.put("VISITORID", string2);
                                contentValues.put("VISITID", string4);
                                contentValues.put("STATUS", (Integer) 2);
                                if (hashtable3 != null) {
                                    contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boolean.valueOf(LiveChatUtil.getBoolean(hashtable3.get("call_enabled"))));
                                }
                                contentValues.put("UNREAD_COUNT", Integer.valueOf(z10 ? 1 : 0));
                                contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{string});
                                Ue.a.s(chat);
                                str3 = string;
                            }
                            Intent intent = new Intent("receivelivechat");
                            intent.putExtra("message", "refreshchat");
                            intent.putExtra("chid", str3);
                            C1908a.b(MobilistenInitProvider.k()).d(intent);
                        } else {
                            this.f63153d = og.i.t(g11.getErrorStream());
                            LiveChatUtil.log("ProActive Failure | response " + this.f63153d);
                        }
                        g11.disconnect();
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e11) {
                                LiveChatUtil.log(e11);
                            }
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        inputStream = null;
                        httpURLConnection = g11;
                        try {
                            LiveChatUtil.log(e10);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception e13) {
                                    LiveChatUtil.log(e13);
                                }
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return;
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception e14) {
                                    LiveChatUtil.log(e14);
                                }
                            }
                            if (inputStream != null) {
                                throw th2;
                            }
                            try {
                                inputStream.close();
                                throw th2;
                            } catch (Exception e15) {
                                LiveChatUtil.log(e15);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        inputStream = null;
                        httpURLConnection = g11;
                        if (httpURLConnection != null) {
                        }
                        if (outputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                    }
                } catch (Exception e16) {
                    e10 = e16;
                    outputStream = null;
                    httpURLConnection = g11;
                    inputStream = null;
                } catch (Throwable th5) {
                    th2 = th5;
                    outputStream = null;
                    httpURLConnection = g11;
                    inputStream = null;
                }
            } catch (Exception e17) {
                LiveChatUtil.log(e17);
                return;
            }
        } catch (Exception e18) {
            inputStream = null;
            e10 = e18;
            outputStream = null;
        } catch (Throwable th6) {
            inputStream = null;
            th2 = th6;
            outputStream = null;
        }
        if (inputStream2 != null) {
            inputStream2.close();
        }
    }
}
