package com.zoho.livechat.android.utils;

import android.content.SharedPreferences;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.VoiceURLConnection;
import java.net.HttpURLConnection;
import java.util.Map;
import rd.C6218a;

/* loaded from: classes4.dex */
public class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44439c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f44440d;

    /* renamed from: e, reason: collision with root package name */
    public final a f44441e;

    public interface a {
        void invoke();
    }

    public N(String str, String str2, Map map, boolean z10, a aVar) {
        this.f44439c = str;
        this.f44438b = str2;
        this.f44440d = map;
        this.f44437a = z10;
        this.f44441e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        a aVar;
        String str = this.f44438b;
        if (str == null || this.f44439c == null) {
            return;
        }
        try {
            if (str.isEmpty()) {
                return;
            }
            try {
                HttpURLConnection g10 = sd.d.g(this.f44437a ? Yd.a.g("visitor/v2/%1$s/sdkdevice/%2$s/register", this.f44438b, this.f44439c) : Yd.a.g("visitor/v2/%1$s/sdkdevice/%2$s/unregister", this.f44438b, this.f44439c));
                g10.setDoOutput(true);
                g10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                g10.setConnectTimeout(30000);
                g10.setReadTimeout(30000);
                og.i.v(g10.getOutputStream(), this.f44440d);
                int responseCode = g10.getResponseCode();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Push ");
                sb2.append(this.f44437a ? EventGroupType.REGISTRATION_EVENT_GROUP : "un-registration");
                sb2.append(" | code ");
                sb2.append(responseCode);
                LiveChatUtil.log(sb2.toString());
                if (responseCode != 204 && responseCode != 200) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Push ");
                    sb3.append(this.f44437a ? EventGroupType.REGISTRATION_EVENT_GROUP : "un-registration");
                    sb3.append(" failed: ");
                    sb3.append(og.i.t(g10.getErrorStream()));
                    LiveChatUtil.log(sb3.toString());
                    aVar = this.f44441e;
                    if (aVar == null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                SharedPreferences.Editor edit = C6218a.M().edit();
                if (this.f44437a) {
                    edit.putString("pushstatus", "true");
                } else {
                    edit.remove("pushstatus");
                }
                edit.apply();
                aVar = this.f44441e;
                if (aVar == null) {
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                a aVar2 = this.f44441e;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        } catch (Throwable th2) {
            a aVar3 = this.f44441e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
            throw th2;
        }
    }
}
