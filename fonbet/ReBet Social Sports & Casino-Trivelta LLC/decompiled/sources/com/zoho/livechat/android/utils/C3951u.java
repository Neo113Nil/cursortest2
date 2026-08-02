package com.zoho.livechat.android.utils;

import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.FAQCategoryListener;
import com.zoho.livechat.android.models.SalesIQArticleCategory;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import okhttp3.HttpUrl;
import ug.AbstractC6574b;

/* renamed from: com.zoho.livechat.android.utils.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3951u extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final FAQCategoryListener f44571a;
    private final String[] departmentIDs;

    public C3951u(String[] strArr, FAQCategoryListener fAQCategoryListener) {
        this.departmentIDs = strArr;
        this.f44571a = fAQCategoryListener;
    }

    public static /* synthetic */ void a(C3951u c3951u, ArrayList arrayList) {
        c3951u.getClass();
        ArrayList<SalesIQArticleCategory> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Hashtable) {
                arrayList2.add(new SalesIQArticleCategory((Hashtable) next));
            }
        }
        c3951u.f44571a.onSuccess(arrayList2);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        FAQCategoryListener fAQCategoryListener;
        if (LiveChatUtil.getScreenName() == null) {
            return;
        }
        try {
            HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/articles/count", LiveChatUtil.getScreenName());
            g10.addQueryParameter(PublisherMetadata.APP_ID, LiveChatUtil.getAppID());
            String[] strArr = this.departmentIDs;
            if (strArr != null && strArr.length > 0) {
                g10.addQueryParameter("department_ids", AbstractC3949s.a(",", strArr));
            }
            LiveChatUtil.log("Get articles category | url: " + g10.build().getUrl());
            HttpURLConnection g11 = sd.d.g(g10);
            g11.setConnectTimeout(30000);
            g11.setReadTimeout(30000);
            g11.setInstanceFollowRedirects(true);
            int responseCode = g11.getResponseCode();
            LiveChatUtil.log("Get articles category | status code: " + responseCode);
            if (responseCode == 200) {
                final ArrayList arrayList = (ArrayList) ((Hashtable) ((Hashtable) AbstractC6574b.d(og.i.t(g11.getInputStream()))).get(EventKeys.DATA)).get(EventKeys.DATA);
                if (arrayList != null) {
                    LiveChatUtil.log("Get articles category | count: " + arrayList.size());
                    if (this.f44571a == null || ZohoLiveChat.getApplicationManager() == null) {
                        return;
                    }
                    ZohoLiveChat.getApplicationManager().p().post(new Runnable() { // from class: com.zoho.livechat.android.utils.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3951u.a(C3951u.this, arrayList);
                        }
                    });
                    return;
                }
                return;
            }
            Hashtable hashtable = (Hashtable) AbstractC6574b.d(og.i.t(g11.getErrorStream()));
            if (hashtable.containsKey("error")) {
                Hashtable hashtable2 = (Hashtable) hashtable.get("error");
                if (hashtable2.containsKey(EventKeys.ERROR_CODE)) {
                    if (1025 == LiveChatUtil.getInteger(hashtable2.get(EventKeys.ERROR_CODE)).intValue()) {
                        FAQCategoryListener fAQCategoryListener2 = this.f44571a;
                        if (fAQCategoryListener2 != null) {
                            fAQCategoryListener2.onFailure(616, "invalid department id");
                            return;
                        }
                        return;
                    }
                    if (1000 != LiveChatUtil.getInteger(hashtable2.get(EventKeys.ERROR_CODE)).intValue() || (fAQCategoryListener = this.f44571a) == null) {
                        return;
                    }
                    fAQCategoryListener.onFailure(601, "operation failed");
                }
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
