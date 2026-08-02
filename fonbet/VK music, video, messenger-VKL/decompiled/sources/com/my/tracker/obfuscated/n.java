package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.Y3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import xsna.w63;

/* loaded from: classes.dex */
public final class n {
    final AtomicBoolean a = new AtomicBoolean(false);
    final y2 b;
    final Context c;

    public n(y2 y2Var, Context context) {
        this.b = y2Var;
        this.c = context.getApplicationContext();
    }

    public static n a(y2 y2Var, Context context) {
        return new n(y2Var, context);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            x2.a("AttributionHandler: referrer is empty");
            return;
        }
        if (a()) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, C.UTF8_NAME)).getQueryParameter("mt_deeplink");
            if (TextUtils.isEmpty(queryParameter)) {
                x2.a("AttributionHandler: deeplink is empty");
            } else {
                a(new JSONObject().put("deeplink", queryParameter));
            }
        } catch (Throwable th) {
            x2.b("AttributionHandler error: handling referrer failed with error: ", th);
        }
    }

    public void b(String str) {
        if (a()) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Y3.c);
            if (optJSONObject == null) {
                x2.a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!optJSONObject.has("error")) {
                a(optJSONObject);
                return;
            }
            x2.a("AttributionHandler: attribution response returned error " + optJSONObject.optInt("error"));
        } catch (Throwable th) {
            x2.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    public boolean a() {
        if (this.a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(p1.a(this.c).h());
    }

    public void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(optString)) {
            x2.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.a.compareAndSet(false, true)) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        p1 a = p1.a(this.c);
        if (!TextUtils.isEmpty(a.h())) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        a.i(jSONObject.toString());
        MyTracker.AttributionListener d = this.b.d();
        if (d == null) {
            return;
        }
        Handler c = this.b.c();
        if (c == null) {
            c = m.a;
        }
        try {
            c.post(new w63(11, d, MyTrackerAttribution.newAttribution(optString)));
        } catch (Throwable th) {
            x2.b("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            x2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }
}
