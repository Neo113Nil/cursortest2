package bo.app;

import bo.app.pf;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pf extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final sf f25912l;

    /* renamed from: m, reason: collision with root package name */
    public final v9 f25913m;

    /* renamed from: n, reason: collision with root package name */
    public final c9 f25914n;

    /* renamed from: o, reason: collision with root package name */
    public final String f25915o;

    /* renamed from: p, reason: collision with root package name */
    public final long f25916p;

    /* renamed from: q, reason: collision with root package name */
    public final long f25917q;

    /* renamed from: r, reason: collision with root package name */
    public final sf f25918r;

    /* renamed from: s, reason: collision with root package name */
    public final lb f25919s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(ue serverConfigStorageProvider, String urlBase, sf templatedTriggeredAction, v9 triggerEvent, String str) {
        super(new kd(urlBase + "template", false), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f25912l = templatedTriggeredAction;
        this.f25913m = triggerEvent;
        this.f25914n = c9.f25337g;
        this.f25915o = templatedTriggeredAction.f26059h;
        int i10 = templatedTriggeredAction.f26029b.f25830e;
        this.f25916p = i10 == -1 ? TimeUnit.SECONDS.toMillis(r3.f25829d + 30) : i10;
        this.f25917q = templatedTriggeredAction.f26061j;
        this.f25918r = templatedTriggeredAction;
        this.f25919s = new lb(str, null, null);
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, nb apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        InAppMessageBase inAppMessageBase = apiResponse.f25813g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f25912l.f26091f));
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25914n;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }

    @Override // bo.app.i2
    public final String toString() {
        sf sfVar = this.f25912l;
        v9 v9Var = this.f25913m;
        return "TemplateRequest(templatedTriggeredAction=" + sfVar + ", triggerEvent=" + v9Var + ", triggerAnalyticsId='" + this.f25915o + "', templatePayloadExpirationTimestamp=" + this.f25917q + ", getTemplatedDataExpiration=" + (((gg) v9Var).f25492b + this.f25916p) + "triggeredAction=" + this.f25918r + ")";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.f25915o);
            jSONObject.put("trigger_event_type", this.f25913m.a());
            y8 y8Var = ((gg) this.f25913m).f25493c;
            jSONObject.put(EventKeys.DATA, y8Var != null ? ((k1) y8Var).getKey() : null);
            a10.put("template", jSONObject);
            String str = this.f25919s.f25727a;
            if (str != null && str.length() != 0) {
                a10.put("respond_with", this.f25919s.getKey());
            }
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.c9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return pf.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, t9 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        if (responseError instanceof i0) {
            internalPublisher.b(new sg(this.f25913m, this.f25912l), sg.class);
        }
    }
}
