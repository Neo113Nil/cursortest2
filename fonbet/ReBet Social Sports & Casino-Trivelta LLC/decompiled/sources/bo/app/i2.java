package bo.app;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class i2 extends yc implements d9 {

    /* renamed from: b, reason: collision with root package name */
    public String f25541b;

    /* renamed from: c, reason: collision with root package name */
    public final ue f25542c;

    /* renamed from: d, reason: collision with root package name */
    public final j2 f25543d;

    /* renamed from: e, reason: collision with root package name */
    public Long f25544e;

    /* renamed from: f, reason: collision with root package name */
    public Long f25545f;

    /* renamed from: g, reason: collision with root package name */
    public String f25546g;

    /* renamed from: h, reason: collision with root package name */
    public String f25547h;

    /* renamed from: i, reason: collision with root package name */
    public String f25548i;

    /* renamed from: j, reason: collision with root package name */
    public x4 f25549j;

    /* renamed from: k, reason: collision with root package name */
    public String f25550k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(kd requestTarget, String str, ue serverConfigStorageProvider, j2 requestInitiatedBy) {
        super(requestTarget);
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        this.f25541b = str;
        this.f25542c = serverConfigStorageProvider;
        this.f25543d = requestInitiatedBy;
    }

    public static final String b(i2 i2Var) {
        return ">> Request Uri: " + i2Var.e();
    }

    public static final String c(i2 i2Var) {
        return i2Var + " for " + i2Var.b() + " executed successfully.";
    }

    public static final String d() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String f() {
        return "******************************************************************";
    }

    public static final String g() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String h() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String i() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String j() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    public static final String k() {
        return "******************************************************************";
    }

    @Override // bo.app.r9
    public void a(r7 internalPublisher, m9 externalPublisher, nb apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        ke keVar = apiResponse.f25811e;
        if (keVar != null) {
            ((r7) externalPublisher).b(new BrazeSdkAuthenticationErrorEvent(new pd(keVar.f25671a, keVar.f25672b, keVar.f25673c, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b() == c9.f25344n, new Function0() { // from class: c3.r3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.i2.c(bo.app.i2.this);
            }
        }, 3, (Object) null);
    }

    public final kd e() {
        return new kd(Braze.INSTANCE.getApiEndpoint(this.f26324a.f25668b));
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(a()) + "\nto target: " + e();
    }

    @Override // bo.app.r9
    public void b(r7 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        internalPublisher.b(new zc(this), zc.class);
    }

    public /* synthetic */ i2(kd kdVar, String str, ue ueVar, int i10) {
        this(kdVar, (i10 & 2) != 0 ? null : str, ueVar, j2.f25588e);
    }

    public void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", this.f25547h);
        String str = this.f25550k;
        if (str != null && str.length() != 0) {
            existingHeaders.put("X-Braze-Auth-Signature", this.f25550k);
        }
        j2 j2Var = this.f25543d;
        if (j2Var != j2.f25588e) {
            existingHeaders.put("X-Braze-Request-Initiated-By", j2Var.f25590a);
        }
    }

    public static final String a(i2 i2Var) {
        return ">> API key    : " + i2Var.f25547h;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            x4 x4Var = this.f25549j;
            if (x4Var != null && !x4Var.isEmpty()) {
                jSONObject.put("device", x4Var.getValue());
            }
            String str = this.f25546g;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l10 = this.f25544e;
            if (l10 != null) {
                jSONObject.put("time", l10);
            }
            String str2 = this.f25547h;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.f25548i;
            if (str3 != null) {
                jSONObject.put(EventKeys.SDK_VERSION_KEY, str3);
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.p3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.r9
    public void a(r7 internalPublisher, m9 externalPublisher, t9 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        final String a10 = responseError.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.s3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.i2.a(a10);
            }
        }, 6, (Object) null);
        if (responseError instanceof sa) {
            internalPublisher.b(responseError, sa.class);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.t3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.f();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.u3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.g();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.v3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.h();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.w3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.i();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.x3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.j();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.y3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.a(bo.app.i2.this);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.z3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.b(bo.app.i2.this);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.q3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i2.k();
                }
            }, 6, (Object) null);
        }
        if (responseError instanceof pd) {
            ((r7) externalPublisher).b(new BrazeSdkAuthenticationErrorEvent((pd) responseError), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    public static final String a(String str) {
        return "Error occurred while executing Braze request: " + str;
    }

    @Override // bo.app.r9
    public void a(r7 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        internalPublisher.b(new ad(this), ad.class);
    }
}
