package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class a extends c<JSONObject> {
    private static final String b = "a";
    private String a = "";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    public class RunnableC1268a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        public class RunnableC1269a implements Runnable {
            final /* synthetic */ CampaignUnit a;

            public RunnableC1269a(CampaignUnit campaignUnit) {
                this.a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.a.getAds().size() > 0) {
                    a.this.a(this.a);
                    if (!TextUtils.isEmpty(a.this.a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC1268a.this.a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC1268a runnableC1268a = RunnableC1268a.this;
                a.this.a(runnableC1268a.c, msg);
            }
        }

        public RunnableC1268a(JSONObject jSONObject, String str, int i) {
            this.a = jSONObject;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject optJSONObject = this.a.optJSONObject("data");
            boolean equals = "v5".equals(this.b);
            a aVar = a.this;
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC1269a(equals ? b.parseV5CampaignUnit(optJSONObject, aVar.a) : b.parseCampaignUnit(optJSONObject, aVar.a)));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(b, "parseLoad content = " + jSONObject);
        int optInt = jSONObject.optInt("status");
        if (1 != optInt) {
            a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC1268a(jSONObject, jSONObject.optString("version"), optInt));
    }

    public abstract void a(int i, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(b, "onFailed errorCode = " + aVar.a);
        a(aVar.a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.b.b, eVar.c);
    }

    public void a(String str) {
        this.a = str;
    }
}
