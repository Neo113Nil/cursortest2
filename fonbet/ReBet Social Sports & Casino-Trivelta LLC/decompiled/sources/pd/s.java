package pd;

import a1.C1908a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import rd.C6218a;
import te.AbstractC6462a;
import ug.AbstractC6574b;
import xe.C6822a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class s extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63166a;

    /* renamed from: b, reason: collision with root package name */
    public String f63167b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f63168c;

    /* renamed from: d, reason: collision with root package name */
    public String f63169d;

    /* renamed from: e, reason: collision with root package name */
    public String f63170e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC6064a f63171f;

    public s(String str, String str2, String str3, String str4, InterfaceC6064a interfaceC6064a) {
        this.f63168c = str;
        this.f63166a = str2;
        this.f63169d = str3;
        this.f63170e = str4;
        this.f63171f = interfaceC6064a;
    }

    public void a() {
        start();
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e7 A[Catch: all -> 0x004d, Exception -> 0x0051, TryCatch #2 {all -> 0x004d, blocks: (B:3:0x0004, B:5:0x0043, B:6:0x0054, B:8:0x005a, B:9:0x0063, B:12:0x006b, B:13:0x0072, B:16:0x007a, B:17:0x0081, B:19:0x0087, B:20:0x0090, B:22:0x00ac, B:23:0x00b5, B:25:0x00bb, B:26:0x00c4, B:28:0x00ca, B:29:0x00d3, B:31:0x00dd, B:32:0x00e6, B:34:0x00f5, B:36:0x0104, B:38:0x010c, B:40:0x0116, B:42:0x0124, B:44:0x015f, B:45:0x012d, B:47:0x0133, B:49:0x013d, B:51:0x0147, B:53:0x014d, B:55:0x0157, B:57:0x0164, B:60:0x0189, B:62:0x01b2, B:65:0x01c6, B:67:0x01cc, B:69:0x01d2, B:71:0x01d8, B:74:0x01f5, B:77:0x021e, B:78:0x0227, B:79:0x0222, B:81:0x0232, B:179:0x03d7, B:181:0x03e7, B:183:0x03ef, B:185:0x03f5, B:187:0x03ff, B:190:0x0417, B:192:0x041d, B:193:0x0405, B:195:0x040f, B:198:0x043b, B:200:0x043f, B:201:0x044f, B:203:0x0455, B:204:0x0460, B:112:0x057f, B:114:0x0583, B:115:0x0586, B:117:0x058c, B:119:0x0592, B:120:0x0598, B:122:0x059d, B:123:0x05a6, B:125:0x05aa, B:126:0x05eb, B:84:0x048f, B:86:0x04b7, B:87:0x04bc, B:89:0x04ca, B:90:0x04cf, B:92:0x04e7, B:93:0x04ea, B:95:0x04f2, B:97:0x0500, B:98:0x0505, B:100:0x0513, B:102:0x051a, B:103:0x0528, B:105:0x052e, B:107:0x053e, B:108:0x0543, B:110:0x0554, B:111:0x055b, B:217:0x05fd, B:223:0x023e, B:227:0x05ae, B:231:0x05d7, B:232:0x05c1, B:236:0x05cc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ff A[Catch: all -> 0x004d, Exception -> 0x0051, TryCatch #2 {all -> 0x004d, blocks: (B:3:0x0004, B:5:0x0043, B:6:0x0054, B:8:0x005a, B:9:0x0063, B:12:0x006b, B:13:0x0072, B:16:0x007a, B:17:0x0081, B:19:0x0087, B:20:0x0090, B:22:0x00ac, B:23:0x00b5, B:25:0x00bb, B:26:0x00c4, B:28:0x00ca, B:29:0x00d3, B:31:0x00dd, B:32:0x00e6, B:34:0x00f5, B:36:0x0104, B:38:0x010c, B:40:0x0116, B:42:0x0124, B:44:0x015f, B:45:0x012d, B:47:0x0133, B:49:0x013d, B:51:0x0147, B:53:0x014d, B:55:0x0157, B:57:0x0164, B:60:0x0189, B:62:0x01b2, B:65:0x01c6, B:67:0x01cc, B:69:0x01d2, B:71:0x01d8, B:74:0x01f5, B:77:0x021e, B:78:0x0227, B:79:0x0222, B:81:0x0232, B:179:0x03d7, B:181:0x03e7, B:183:0x03ef, B:185:0x03f5, B:187:0x03ff, B:190:0x0417, B:192:0x041d, B:193:0x0405, B:195:0x040f, B:198:0x043b, B:200:0x043f, B:201:0x044f, B:203:0x0455, B:204:0x0460, B:112:0x057f, B:114:0x0583, B:115:0x0586, B:117:0x058c, B:119:0x0592, B:120:0x0598, B:122:0x059d, B:123:0x05a6, B:125:0x05aa, B:126:0x05eb, B:84:0x048f, B:86:0x04b7, B:87:0x04bc, B:89:0x04ca, B:90:0x04cf, B:92:0x04e7, B:93:0x04ea, B:95:0x04f2, B:97:0x0500, B:98:0x0505, B:100:0x0513, B:102:0x051a, B:103:0x0528, B:105:0x052e, B:107:0x053e, B:108:0x0543, B:110:0x0554, B:111:0x055b, B:217:0x05fd, B:223:0x023e, B:227:0x05ae, B:231:0x05d7, B:232:0x05c1, B:236:0x05cc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0417 A[Catch: all -> 0x004d, Exception -> 0x0051, TryCatch #2 {all -> 0x004d, blocks: (B:3:0x0004, B:5:0x0043, B:6:0x0054, B:8:0x005a, B:9:0x0063, B:12:0x006b, B:13:0x0072, B:16:0x007a, B:17:0x0081, B:19:0x0087, B:20:0x0090, B:22:0x00ac, B:23:0x00b5, B:25:0x00bb, B:26:0x00c4, B:28:0x00ca, B:29:0x00d3, B:31:0x00dd, B:32:0x00e6, B:34:0x00f5, B:36:0x0104, B:38:0x010c, B:40:0x0116, B:42:0x0124, B:44:0x015f, B:45:0x012d, B:47:0x0133, B:49:0x013d, B:51:0x0147, B:53:0x014d, B:55:0x0157, B:57:0x0164, B:60:0x0189, B:62:0x01b2, B:65:0x01c6, B:67:0x01cc, B:69:0x01d2, B:71:0x01d8, B:74:0x01f5, B:77:0x021e, B:78:0x0227, B:79:0x0222, B:81:0x0232, B:179:0x03d7, B:181:0x03e7, B:183:0x03ef, B:185:0x03f5, B:187:0x03ff, B:190:0x0417, B:192:0x041d, B:193:0x0405, B:195:0x040f, B:198:0x043b, B:200:0x043f, B:201:0x044f, B:203:0x0455, B:204:0x0460, B:112:0x057f, B:114:0x0583, B:115:0x0586, B:117:0x058c, B:119:0x0592, B:120:0x0598, B:122:0x059d, B:123:0x05a6, B:125:0x05aa, B:126:0x05eb, B:84:0x048f, B:86:0x04b7, B:87:0x04bc, B:89:0x04ca, B:90:0x04cf, B:92:0x04e7, B:93:0x04ea, B:95:0x04f2, B:97:0x0500, B:98:0x0505, B:100:0x0513, B:102:0x051a, B:103:0x0528, B:105:0x052e, B:107:0x053e, B:108:0x0543, B:110:0x0554, B:111:0x055b, B:217:0x05fd, B:223:0x023e, B:227:0x05ae, B:231:0x05d7, B:232:0x05c1, B:236:0x05cc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0405 A[Catch: all -> 0x004d, Exception -> 0x0051, TryCatch #2 {all -> 0x004d, blocks: (B:3:0x0004, B:5:0x0043, B:6:0x0054, B:8:0x005a, B:9:0x0063, B:12:0x006b, B:13:0x0072, B:16:0x007a, B:17:0x0081, B:19:0x0087, B:20:0x0090, B:22:0x00ac, B:23:0x00b5, B:25:0x00bb, B:26:0x00c4, B:28:0x00ca, B:29:0x00d3, B:31:0x00dd, B:32:0x00e6, B:34:0x00f5, B:36:0x0104, B:38:0x010c, B:40:0x0116, B:42:0x0124, B:44:0x015f, B:45:0x012d, B:47:0x0133, B:49:0x013d, B:51:0x0147, B:53:0x014d, B:55:0x0157, B:57:0x0164, B:60:0x0189, B:62:0x01b2, B:65:0x01c6, B:67:0x01cc, B:69:0x01d2, B:71:0x01d8, B:74:0x01f5, B:77:0x021e, B:78:0x0227, B:79:0x0222, B:81:0x0232, B:179:0x03d7, B:181:0x03e7, B:183:0x03ef, B:185:0x03f5, B:187:0x03ff, B:190:0x0417, B:192:0x041d, B:193:0x0405, B:195:0x040f, B:198:0x043b, B:200:0x043f, B:201:0x044f, B:203:0x0455, B:204:0x0460, B:112:0x057f, B:114:0x0583, B:115:0x0586, B:117:0x058c, B:119:0x0592, B:120:0x0598, B:122:0x059d, B:123:0x05a6, B:125:0x05aa, B:126:0x05eb, B:84:0x048f, B:86:0x04b7, B:87:0x04bc, B:89:0x04ca, B:90:0x04cf, B:92:0x04e7, B:93:0x04ea, B:95:0x04f2, B:97:0x0500, B:98:0x0505, B:100:0x0513, B:102:0x051a, B:103:0x0528, B:105:0x052e, B:107:0x053e, B:108:0x0543, B:110:0x0554, B:111:0x055b, B:217:0x05fd, B:223:0x023e, B:227:0x05ae, B:231:0x05d7, B:232:0x05c1, B:236:0x05cc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0455 A[Catch: all -> 0x004d, Exception -> 0x0051, TryCatch #2 {all -> 0x004d, blocks: (B:3:0x0004, B:5:0x0043, B:6:0x0054, B:8:0x005a, B:9:0x0063, B:12:0x006b, B:13:0x0072, B:16:0x007a, B:17:0x0081, B:19:0x0087, B:20:0x0090, B:22:0x00ac, B:23:0x00b5, B:25:0x00bb, B:26:0x00c4, B:28:0x00ca, B:29:0x00d3, B:31:0x00dd, B:32:0x00e6, B:34:0x00f5, B:36:0x0104, B:38:0x010c, B:40:0x0116, B:42:0x0124, B:44:0x015f, B:45:0x012d, B:47:0x0133, B:49:0x013d, B:51:0x0147, B:53:0x014d, B:55:0x0157, B:57:0x0164, B:60:0x0189, B:62:0x01b2, B:65:0x01c6, B:67:0x01cc, B:69:0x01d2, B:71:0x01d8, B:74:0x01f5, B:77:0x021e, B:78:0x0227, B:79:0x0222, B:81:0x0232, B:179:0x03d7, B:181:0x03e7, B:183:0x03ef, B:185:0x03f5, B:187:0x03ff, B:190:0x0417, B:192:0x041d, B:193:0x0405, B:195:0x040f, B:198:0x043b, B:200:0x043f, B:201:0x044f, B:203:0x0455, B:204:0x0460, B:112:0x057f, B:114:0x0583, B:115:0x0586, B:117:0x058c, B:119:0x0592, B:120:0x0598, B:122:0x059d, B:123:0x05a6, B:125:0x05aa, B:126:0x05eb, B:84:0x048f, B:86:0x04b7, B:87:0x04bc, B:89:0x04ca, B:90:0x04cf, B:92:0x04e7, B:93:0x04ea, B:95:0x04f2, B:97:0x0500, B:98:0x0505, B:100:0x0513, B:102:0x051a, B:103:0x0528, B:105:0x052e, B:107:0x053e, B:108:0x0543, B:110:0x0554, B:111:0x055b, B:217:0x05fd, B:223:0x023e, B:227:0x05ae, B:231:0x05d7, B:232:0x05c1, B:236:0x05cc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ec  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        InterfaceC6064a interfaceC6064a;
        InterfaceC6064a interfaceC6064a2;
        Message.f fVar;
        int i10;
        String str;
        SalesIQChat salesIQChat;
        int i11;
        String str2;
        boolean z10;
        SalesIQChat salesIQChat2;
        SalesIQChat.Extras extras;
        SalesIQChat.Extras.a aVar;
        Pe.b h02;
        String str3;
        String visitid;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z11;
        boolean z12;
        Map map;
        s sVar = this;
        try {
            try {
                rd.b.b();
                HttpURLConnection g10 = sd.d.g(Yd.a.g("visitor/v2/%1$s/conversations/%2$s/reopen", LiveChatUtil.getScreenName(), sVar.f63166a));
                g10.setRequestProperty("X-Pex-Agent", C6218a.X());
                g10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                SalesIQChat chat = LiveChatUtil.getChat(sVar.f63170e);
                HashMap hashMap = new HashMap();
                hashMap.put("user_id", LiveChatUtil.getAnnonID());
                if (LiveChatUtil.getAVUID() != null) {
                    hashMap.put("avuid", LiveChatUtil.getAVUID());
                }
                if (LiveChatUtil.getCVUID() != null) {
                    hashMap.put("cvuid", LiveChatUtil.getCVUID());
                }
                if (LiveChatUtil.getVisitorName() != null) {
                    hashMap.put("name", LiveChatUtil.getVisitorName());
                }
                if (ZohoLiveChat.e.e() != null) {
                    hashMap.put("email", ZohoLiveChat.e.e());
                }
                if (ZohoLiveChat.e.d() != null) {
                    hashMap.put("phone", ZohoLiveChat.e.d());
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("visitor", hashMap);
                hashMap2.put("message", sVar.f63168c);
                hashMap2.put("client_message_id", sVar.f63169d);
                if (Te.a.p0() != null) {
                    hashMap2.put("custom_wait_time", Te.a.p0());
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
                hashMap2.put("is_call_allowed", Boolean.valueOf(Td.e.o0()));
                if (chat != null) {
                    hashMap2.put("department_id", chat.getDeptid());
                    if (chat.getExtras() == null || chat.getExtras().attributes == null || chat.getExtras().attributes.secretInfo == null || chat.getExtras().attributes.secretInfo.isEmpty()) {
                        if (chat.getConvID() != null) {
                            Pe.b I10 = Te.a.I(chat.getConvID());
                            Pe.b bVar = I10;
                            if (I10 == null) {
                                bVar = Te.a.I(chat.getVisitid());
                            }
                            if (bVar != null && bVar.d() != null && !bVar.d().isEmpty()) {
                                map = bVar.d();
                            }
                        }
                        map = null;
                    } else {
                        map = chat.getExtras().attributes.secretInfo;
                    }
                    if (map != null) {
                        hashMap2.put("secret_fields", map);
                    }
                }
                og.i.v(g10.getOutputStream(), hashMap2);
                int responseCode = g10.getResponseCode();
                LiveChatUtil.log("Conversation Reopen | status code: - " + responseCode);
                if (responseCode == 200) {
                    sVar.f63167b = og.i.t(g10.getInputStream());
                    LiveChatUtil.log("Conversation Reopen | response : - " + sVar.f63167b);
                    Hashtable hashtable = (Hashtable) AbstractC6574b.d(sVar.f63167b);
                    if (hashtable != null) {
                        Hashtable hashtable2 = (Hashtable) hashtable.get(EventKeys.DATA);
                        if (hashtable2 != null && hashtable2.containsKey("chat_id") && hashtable2.containsKey(StackTraceHelper.ID_KEY) && hashtable2.containsKey("chat_status")) {
                            str2 = LiveChatUtil.getString(hashtable2.get("chat_id"));
                            z10 = LiveChatUtil.getLong(hashtable2.get("start_time")) > Te.a.Z(str2);
                            hashtable2.get("time");
                            String string = LiveChatUtil.getString(hashtable2.get(StackTraceHelper.ID_KEY));
                            i11 = LiveChatUtil.getInteger(((Hashtable) hashtable2.get("chat_status")).get("state")).intValue();
                            salesIQChat = LiveChatUtil.getChat(str2);
                            if (salesIQChat != null) {
                                if (z10) {
                                    salesIQChat.setStatus(i11);
                                } else {
                                    LiveChatUtil.log("FallbackCase");
                                }
                                salesIQChat.setVisitorid(string);
                            }
                        } else {
                            salesIQChat = null;
                            i11 = 0;
                            str2 = null;
                            z10 = true;
                        }
                        if (i11 == 3) {
                            MobilistenUtil.x(AbstractC6462a.b(C6822a.m()));
                        } else {
                            com.zoho.livechat.android.modules.brand.ui.helpers.a.R(Md.a.Chat, Md.a.Call);
                        }
                        int i12 = i11;
                        String str8 = str2;
                        if (salesIQChat != null) {
                            try {
                                try {
                                    String string2 = LiveChatUtil.getString(hashtable2.get("wms_chat_id"));
                                    if (!TextUtils.isEmpty(string2)) {
                                        try {
                                            salesIQChat.setRchatid(string2);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            interfaceC6064a = null;
                                            sVar = this;
                                            interfaceC6064a2 = sVar.f63171f;
                                            if (interfaceC6064a2 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    Hashtable hashtable3 = (Hashtable) hashtable2.get("department");
                                    if (hashtable3 != null) {
                                        String string3 = LiveChatUtil.getString(hashtable3.get("name"));
                                        if (!TextUtils.isEmpty(string3)) {
                                            salesIQChat.setDepartmentName(string3);
                                        }
                                        String string4 = LiveChatUtil.getString(hashtable3.get(StackTraceHelper.ID_KEY));
                                        if (!TextUtils.isEmpty(string4)) {
                                            salesIQChat.setDeptid(string4);
                                        }
                                    }
                                    ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
                                    ContentValues contentValues = new ContentValues();
                                    if (z10) {
                                        Object obj = hashtable2.get("attender");
                                        salesIQChat2 = salesIQChat;
                                        if (obj instanceof Hashtable) {
                                            Hashtable hashtable4 = (Hashtable) obj;
                                            String string5 = LiveChatUtil.getString(hashtable4.get(StackTraceHelper.ID_KEY));
                                            str5 = LiveChatUtil.getString(hashtable4.get("name"));
                                            str7 = LiveChatUtil.getString(hashtable4.get("image_key"));
                                            str6 = LiveChatUtil.getString(hashtable4.get("email"));
                                            z11 = LiveChatUtil.getBoolean(hashtable4.get("is_bot"));
                                            z12 = LiveChatUtil.getBoolean(hashtable4.get("call_enabled"));
                                            str4 = string5;
                                        } else {
                                            str4 = "";
                                            str5 = str4;
                                            str6 = str5;
                                            str7 = str6;
                                            z11 = false;
                                            z12 = false;
                                        }
                                        contentValues.put("ATTENDER_ID", str4);
                                        contentValues.put("ATTENDER", str5);
                                        contentValues.put("ATTENDER_IMGKEY", str7);
                                        contentValues.put("ATTENDER_EMAIL", str6);
                                        contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boolean.valueOf(z12));
                                        contentValues.put("ISBOTATTENDER", Boolean.valueOf(z11));
                                        contentValues.put("STATUS", Integer.valueOf(i12));
                                        if (hashtable2.containsKey("start_time")) {
                                            contentValues.put("LAST_INITIATED_TIME", Long.valueOf(LiveChatUtil.getLong(hashtable2.get("start_time"))));
                                        }
                                    } else {
                                        salesIQChat2 = salesIQChat;
                                    }
                                    if (hashtable2.containsKey("missed_time")) {
                                        contentValues.put("MISSED_TIME", Long.valueOf(LiveChatUtil.getLong(hashtable2.get("missed_time"))));
                                    }
                                    if (hashtable2.containsKey("end_time")) {
                                        contentValues.put("END_TIME", Long.valueOf(LiveChatUtil.getLong(hashtable2.get("end_time"))));
                                    }
                                    if (hashtable2.containsKey("last_message_time")) {
                                        contentValues.put("LMTIME", Long.valueOf(LiveChatUtil.getLong(hashtable2.get("last_message_time"))));
                                    }
                                    if (LiveChatUtil.getChatWaitingTime() > 0) {
                                        contentValues.put("WAITING_TIMER_START_TIME", Long.valueOf(rd.b.f()));
                                    }
                                    if (hashtable2.containsKey("queue_type")) {
                                        if (LiveChatUtil.getString(hashtable2.get("queue_type")).equalsIgnoreCase("chat")) {
                                            sVar = this;
                                            MobilistenUtil.B(sVar.f63170e, hashtable2);
                                            extras = chat == null ? chat.getExtras() : null;
                                            if (chat != null && chat.getConvID() != null) {
                                                h02 = Te.a.h0(chat.getConvID());
                                                if (h02 == null) {
                                                    visitid = chat.getConvID();
                                                } else {
                                                    h02 = Te.a.h0(chat.getVisitid());
                                                    if (h02 != null) {
                                                        visitid = chat.getVisitid();
                                                    } else {
                                                        str3 = null;
                                                        if (h02 != null && h02.d() != null) {
                                                            Te.a.B0(str3, h02.a(h02.i(), h02.c(), h02.f(), h02.e(), h02.g(), null));
                                                        }
                                                    }
                                                }
                                                str3 = visitid;
                                                if (h02 != null) {
                                                    Te.a.B0(str3, h02.a(h02.i(), h02.c(), h02.f(), h02.e(), h02.g(), null));
                                                }
                                            }
                                            if (extras != null && (aVar = extras.attributes) != null) {
                                                aVar.secretInfo = null;
                                                contentValues.put("EXTRAS", Yd.a.j().v(extras));
                                            }
                                            if (contentValues.size() > 0) {
                                                contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{str8});
                                            }
                                            LiveChatUtil.triggerChatListener("CHAT_REOPEN", salesIQChat2);
                                            Intent intent = new Intent("receivelivechat");
                                            intent.putExtra("message", "refreshchat");
                                            str = str8;
                                            intent.putExtra("chid", str);
                                            intent.putExtra("StartWaitingTimer", true);
                                            C1908a.b(MobilistenInitProvider.k()).d(intent);
                                            i10 = i12;
                                        }
                                    }
                                    sVar = this;
                                    if (chat == null) {
                                    }
                                    if (chat != null) {
                                        h02 = Te.a.h0(chat.getConvID());
                                        if (h02 == null) {
                                        }
                                        str3 = visitid;
                                        if (h02 != null) {
                                        }
                                    }
                                    if (extras != null) {
                                        aVar.secretInfo = null;
                                        contentValues.put("EXTRAS", Yd.a.j().v(extras));
                                    }
                                    if (contentValues.size() > 0) {
                                    }
                                    LiveChatUtil.triggerChatListener("CHAT_REOPEN", salesIQChat2);
                                    Intent intent2 = new Intent("receivelivechat");
                                    intent2.putExtra("message", "refreshchat");
                                    str = str8;
                                    intent2.putExtra("chid", str);
                                    intent2.putExtra("StartWaitingTimer", true);
                                    C1908a.b(MobilistenInitProvider.k()).d(intent2);
                                    i10 = i12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sVar = this;
                                    interfaceC6064a = null;
                                    interfaceC6064a2 = sVar.f63171f;
                                    if (interfaceC6064a2 != null) {
                                        interfaceC6064a2.onComplete();
                                        sVar.f63171f = interfaceC6064a;
                                    }
                                    throw th;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                sVar = this;
                                LiveChatUtil.log(e);
                                InterfaceC6064a interfaceC6064a3 = sVar.f63171f;
                                if (interfaceC6064a3 != null) {
                                    interfaceC6064a3.onComplete();
                                    sVar.f63171f = null;
                                    return;
                                }
                                return;
                            }
                        } else {
                            SalesIQChat salesIQChat3 = salesIQChat;
                            sVar = this;
                            ContentResolver contentResolver2 = MobilistenInitProvider.k().getContentResolver();
                            ContentValues contentValues2 = new ContentValues();
                            String string6 = LiveChatUtil.getString(hashtable2.get("chat_id"));
                            if (!TextUtils.isEmpty(sVar.f63170e)) {
                                contentValues2.put("CHATID", string6);
                            }
                            String string7 = LiveChatUtil.getString(hashtable2.get("wms_chat_id"));
                            if (!TextUtils.isEmpty(string7)) {
                                contentValues2.put("RCHATID", string7);
                            }
                            Integer integer = LiveChatUtil.getInteger(((Hashtable) hashtable2.get("chat_status")).get("state"));
                            int intValue = integer.intValue();
                            if (z10) {
                                contentValues2.put("STATUS", integer);
                            }
                            Hashtable hashtable5 = (Hashtable) hashtable2.get("department");
                            if (hashtable5 != null) {
                                String string8 = LiveChatUtil.getString(hashtable5.get("name"));
                                if (!TextUtils.isEmpty(string8)) {
                                    contentValues2.put("DEPTNAME", string8);
                                }
                                String string9 = LiveChatUtil.getString(hashtable5.get(StackTraceHelper.ID_KEY));
                                if (!TextUtils.isEmpty(string9)) {
                                    contentValues2.put("DEPTID", string9);
                                }
                            }
                            if (z10) {
                                contentValues2.put("ATTENDER_ID", "");
                                contentValues2.put("ATTENDER", "");
                                contentValues2.put("ATTENDER_IMGKEY", "");
                                contentValues2.put("ATTENDER_EMAIL", "");
                            }
                            if (hashtable2.containsKey("queue_type") && LiveChatUtil.getString(hashtable2.get("queue_type")).equalsIgnoreCase("chat")) {
                                MobilistenUtil.B(sVar.f63170e, hashtable2);
                            }
                            contentResolver2.update(b.a.f44269a, contentValues2, "CHATID=?", new String[]{sVar.f63170e});
                            if (salesIQChat3 != null) {
                                LiveChatUtil.triggerChatListener("CHAT_REOPEN", salesIQChat3);
                            }
                            Intent intent3 = new Intent("receivelivechat");
                            intent3.putExtra("message", "refreshchat");
                            intent3.putExtra("chid", string6);
                            intent3.putExtra("offlinecase", true);
                            C1908a.b(MobilistenInitProvider.k()).d(intent3);
                            str = string6;
                            i10 = intValue;
                        }
                        String str9 = sVar.f63170e;
                        if (str9 != null) {
                            Q.C(str9);
                        }
                        if (LiveChatUtil.isMultipleChatsDisabled() && LiveChatUtil.isTriggerChatAvailable()) {
                            LiveChatUtil.deleteTriggerChat();
                        }
                    } else {
                        i10 = 0;
                        str = null;
                    }
                    fVar = Message.f.Sent;
                    if (i10 == 3) {
                        LiveChatUtil.triggerChatListener("CHAT_MISSED", LiveChatUtil.getChat(str));
                    }
                    InterfaceC6064a interfaceC6064a4 = sVar.f63171f;
                    if (interfaceC6064a4 != null) {
                        interfaceC6064a4.onSuccess();
                    }
                } else {
                    fVar = Message.f.Failure;
                    String t10 = og.i.t(g10.getErrorStream());
                    sVar.f63167b = t10;
                    if (responseCode == 400 || responseCode == -1) {
                        int a10 = o.a(t10);
                        InterfaceC6064a interfaceC6064a5 = sVar.f63171f;
                        if (interfaceC6064a5 != null && a10 != -1) {
                            interfaceC6064a5.a(sVar.f63170e, a10, o.c(sVar.f63167b));
                        }
                    }
                    LiveChatUtil.log("Conversation Reopen | response : - " + sVar.f63167b);
                }
                C6966g.F0(sVar.f63170e, sVar.f63169d, fVar);
                InterfaceC6064a interfaceC6064a6 = sVar.f63171f;
                if (interfaceC6064a6 != null) {
                    interfaceC6064a6.onComplete();
                    sVar.f63171f = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
