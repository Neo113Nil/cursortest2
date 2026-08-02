package com.zoho.livechat.android.utils;

import android.content.SharedPreferences;
import java.net.HttpURLConnection;
import rd.C6218a;

/* loaded from: classes4.dex */
public class r extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final String f44568a;

    public r(String str) {
        this.f44568a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection h10 = sd.d.h(Yd.a.e(this.f44568a, new String[0]), true, true);
            h10.setConnectTimeout(30000);
            h10.setReadTimeout(30000);
            h10.setInstanceFollowRedirects(true);
            if (h10.getResponseCode() == 200) {
                String t10 = og.i.t(h10.getInputStream());
                if (t10.trim().length() <= 0 || C6218a.M() == null) {
                    return;
                }
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putString("article_css", t10.trim());
                edit.apply();
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
