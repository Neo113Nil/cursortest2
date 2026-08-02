package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nb extends j {

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f25809c;

    /* renamed from: d, reason: collision with root package name */
    public final t9 f25810d;

    /* renamed from: e, reason: collision with root package name */
    public final ke f25811e;

    /* renamed from: f, reason: collision with root package name */
    public final u3 f25812f;

    /* renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f25813g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f25814h;

    /* renamed from: i, reason: collision with root package name */
    public final re f25815i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f25816j;

    /* renamed from: k, reason: collision with root package name */
    public final JSONArray f25817k;

    /* renamed from: l, reason: collision with root package name */
    public final String f25818l;

    /* renamed from: m, reason: collision with root package name */
    public final String f25819m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25820n;

    /* renamed from: o, reason: collision with root package name */
    public final long f25821o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f25822p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f25823q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f25824r;

    /* renamed from: s, reason: collision with root package name */
    public final td f25825s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if (r2.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nb(d9 request, n9 connectionResult, e2 brazeManager) {
        super(request, connectionResult);
        ArrayList arrayList;
        u3 u3Var;
        ArrayList a10;
        final JSONObject optJSONObject;
        re reVar;
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        JSONObject jsonObject = connectionResult.f25807c;
        jsonObject = jsonObject == null ? new JSONObject() : jsonObject;
        this.f25809c = jsonObject;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        String optionalString = JsonUtils.getOptionalString(jsonObject, "error");
        JSONObject optJSONObject2 = jsonObject.optJSONObject("auth_error");
        t9 pdVar = optJSONObject2 != null ? new pd(request, optJSONObject2.optInt(EventKeys.ERROR_CODE_KEY, -1), JsonUtils.getOptionalString(optJSONObject2, EventKeys.REASON), optionalString) : Intrinsics.areEqual(optionalString, "invalid_api_key") ? new sa(optionalString, request) : optionalString != null ? new i0(optionalString, request) : null;
        this.f25810d = pdVar;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        JSONObject optJSONObject3 = jsonObject.optJSONObject("optional_auth_error");
        this.f25811e = optJSONObject3 != null ? new ke(request, optJSONObject3.optInt(EventKeys.ERROR_CODE_KEY, -1), JsonUtils.getOptionalString(optJSONObject3, EventKeys.REASON)) : null;
        this.f25817k = jsonObject.optJSONArray("feature_flags");
        this.f25821o = jsonObject.optLong("last_sync_at", -1L);
        this.f25822p = jsonObject.optJSONObject("banners");
        this.f25823q = jsonObject.has("request_time") ? Long.valueOf(jsonObject.optLong("request_time")) : null;
        JSONObject optJSONObject4 = jsonObject.optJSONObject("dismissals");
        if (optJSONObject4 != null && (optJSONArray = optJSONObject4.optJSONArray("acknowledged")) != null) {
            arrayList = d.f25365c.a(optJSONArray);
        }
        arrayList = null;
        this.f25824r = arrayList;
        if (pdVar == null && (request instanceof y3)) {
            try {
                u3Var = new u3(jsonObject);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.O6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.nb.a(bo.app.nb.this);
                    }
                }, 4, (Object) null);
            }
            this.f25812f = u3Var;
            a10 = og.f25896a.a(this.f25809c.optJSONArray("triggers"), brazeManager);
            this.f25814h = a10;
            if (a10 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.P6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.nb.b(bo.app.nb.this);
                    }
                }, 6, (Object) null);
            }
            optJSONObject = this.f25809c.optJSONObject("config");
            if (optJSONObject == null) {
                try {
                    reVar = new re(optJSONObject);
                } catch (Exception e11) {
                    e = e11;
                    reVar = null;
                }
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Q6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.nb.a(optJSONObject);
                        }
                    }, 6, (Object) null);
                } catch (Exception e12) {
                    e = e12;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: c3.R6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.nb.b(optJSONObject);
                        }
                    }, 4, (Object) null);
                    this.f25815i = reVar;
                    this.f25813g = og.a(this.f25809c.optJSONObject("templated_message"), brazeManager);
                    JSONArray optJSONArray2 = this.f25809c.optJSONArray("geofences");
                    this.f25816j = optJSONArray2 != null ? com.braze.support.f.a(optJSONArray2) : null;
                    if (request instanceof v5) {
                    }
                    this.f25825s = request instanceof ae ? xd.f26273k.a(this.f25809c, true) : null;
                }
            } else {
                reVar = null;
            }
            this.f25815i = reVar;
            this.f25813g = og.a(this.f25809c.optJSONObject("templated_message"), brazeManager);
            JSONArray optJSONArray22 = this.f25809c.optJSONArray("geofences");
            this.f25816j = optJSONArray22 != null ? com.braze.support.f.a(optJSONArray22) : null;
            if (request instanceof v5) {
                this.f25818l = JsonUtils.getOptionalString(this.f25809c, "mite");
                this.f25819m = JsonUtils.getOptionalString(this.f25809c, "host");
                this.f25820n = JsonUtils.getOptionalString(this.f25809c, "auth");
            } else {
                this.f25818l = null;
                this.f25819m = null;
                this.f25820n = null;
            }
            this.f25825s = request instanceof ae ? xd.f26273k.a(this.f25809c, true) : null;
        }
        u3Var = null;
        this.f25812f = u3Var;
        a10 = og.f25896a.a(this.f25809c.optJSONArray("triggers"), brazeManager);
        this.f25814h = a10;
        if (a10 != null) {
        }
        optJSONObject = this.f25809c.optJSONObject("config");
        if (optJSONObject == null) {
        }
        this.f25815i = reVar;
        this.f25813g = og.a(this.f25809c.optJSONObject("templated_message"), brazeManager);
        JSONArray optJSONArray222 = this.f25809c.optJSONArray("geofences");
        this.f25816j = optJSONArray222 != null ? com.braze.support.f.a(optJSONArray222) : null;
        if (request instanceof v5) {
        }
        this.f25825s = request instanceof ae ? xd.f26273k.a(this.f25809c, true) : null;
    }

    public static final String a(nb nbVar) {
        return "Encountered Exception processing Content Cards response: " + nbVar.f25809c;
    }

    public static final String b(nb nbVar) {
        return "Found " + nbVar.f25814h.size() + " triggered actions in server response.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Got server config: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final String b(JSONObject jSONObject) {
        return "Encountered Exception processing server config: " + jSONObject;
    }
}
