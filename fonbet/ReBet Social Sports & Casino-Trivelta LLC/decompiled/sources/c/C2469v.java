package c;

import com.facebook.react.uimanager.ViewProps;
import com.surt.guardian.models.GuardianDiagnostics;
import com.surt.guardian.network.RiskLevel;
import com.surt.guardian.network.VerificationResult;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import zendesk.core.Constants;

/* renamed from: c.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2469v extends SuspendLambda implements Function1 {

    /* renamed from: n, reason: collision with root package name */
    public int f26692n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G f26693o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f26694p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f26695q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2469v(D d10, G g10, String str, Continuation continuation) {
        super(1, continuation);
        this.f26693o = g10;
        this.f26694p = d10;
        this.f26695q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C2469v(this.f26694p, this.f26693o, this.f26695q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C2469v) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map data;
        MediaType mediaType;
        String str;
        Object m147constructorimpl;
        String string;
        Map emptyMap;
        GuardianDiagnostics guardianDiagnostics;
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f26692n != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C c10 = C.f26395a;
        G request = this.f26693o;
        c10.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.c() != null) {
            data = MapsKt.mutableMapOf(TuplesKt.to("device_data", request.c()));
        } else {
            data = MapsKt.mutableMapOf(TuplesKt.to("session_id", request.g()), TuplesKt.to("device_fingerprint", request.d()), TuplesKt.to(EventKeys.TIMESTAMP, Long.valueOf(request.h())));
            String b10 = request.b();
            if (b10 != null) {
                data.put("attestation_token", b10);
            }
            String f10 = request.f();
            if (f10 != null) {
                data.put(EventKeys.REASON, f10);
            }
            String a10 = request.a();
            if (a10 != null) {
                data.put(PublisherMetadata.APP_VERSION, a10);
            }
            String e10 = request.e();
            if (e10 != null) {
                data.put("error_type", e10);
            }
        }
        String i10 = request.i();
        if (i10 != null) {
            data.put("verisoul_session_id", i10);
        }
        Intrinsics.checkNotNullParameter(data, "data");
        String str2 = "{" + CollectionsKt.joinToString$default(data.entrySet(), ",", null, null, 0, null, C2468u.f26689d, 30, null) + '}';
        RequestBody.Companion companion = RequestBody.INSTANCE;
        mediaType = D.f26397e;
        RequestBody create = companion.create(str2, mediaType);
        StringBuilder sb2 = new StringBuilder();
        str = this.f26694p.f26398a;
        sb2.append(str);
        sb2.append("/geolocation/transactions/verify");
        Request.Builder post = new Request.Builder().url(sb2.toString()).post(create);
        String str3 = this.f26695q;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            post.header(Constants.AUTHORIZATION_HEADER, "Bearer " + this.f26695q);
        }
        Request build = post.build();
        String str4 = this.f26695q;
        String str5 = (str4 == null || StringsKt.isBlank(str4)) ? ViewProps.NONE : "Bearer " + StringsKt.take(this.f26695q, 12) + "… (len=" + this.f26695q.length() + ')';
        Logger logger = Logger.f41582a;
        logger.a("ApiClient", "Verify URL: " + build.url());
        logger.a("ApiClient", "Authorization: " + str5);
        logger.a("ApiClient", "Headers: " + build.headers());
        logger.a("ApiClient", "Request body: " + str2);
        Response execute = D.i(this.f26694p).newCall(build).execute();
        this.f26694p.getClass();
        try {
            String str6 = "";
            String str7 = null;
            str7 = null;
            if (execute.isSuccessful()) {
                ResponseBody body = execute.body();
                if (body == null || (string = body.string()) == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(new IOException("Empty response")));
                } else {
                    try {
                        emptyMap = D.e(new JSONObject(string));
                    } catch (Exception e11) {
                        Logger.c(Logger.f41582a, "ApiClient", "Failed to parse JSON: " + e11.getMessage(), null, 4, null);
                        emptyMap = MapsKt.emptyMap();
                    }
                    if (emptyMap.containsKey(EventKeys.DATA)) {
                        Object obj2 = emptyMap.get(EventKeys.DATA);
                        Map map = obj2 instanceof Map ? (Map) obj2 : null;
                        if (map != null) {
                            emptyMap = map;
                        }
                    }
                    Object obj3 = emptyMap.get("result");
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    Object obj4 = map2 != null ? map2.get("status") : null;
                    boolean areEqual = Intrinsics.areEqual(obj4 instanceof String ? (String) obj4 : null, "accepted");
                    Object obj5 = emptyMap.get("risk_level");
                    RiskLevel a11 = D.a(obj5 instanceof String ? (String) obj5 : null);
                    Object obj6 = emptyMap.get("transaction_id");
                    String str8 = obj6 instanceof String ? (String) obj6 : null;
                    String str9 = str8 == null ? "" : str8;
                    Object obj7 = emptyMap.get("diagnostics");
                    Map map3 = obj7 instanceof Map ? (Map) obj7 : null;
                    if (map3 != null) {
                        Object obj8 = map3.get("attestationResult");
                        if (obj8 == null) {
                            obj8 = map3.get("attestation_result");
                        }
                        String str10 = obj8 instanceof String ? (String) obj8 : null;
                        Object obj9 = map3.get("networkIntelResult");
                        if (obj9 == null) {
                            obj9 = map3.get("network_intel_result");
                        }
                        guardianDiagnostics = new GuardianDiagnostics(null, null, null, str10, obj9 instanceof String ? (String) obj9 : null, null, 39, null);
                    } else {
                        guardianDiagnostics = new GuardianDiagnostics(null, null, null, null, null, null, 63, null);
                    }
                    GuardianDiagnostics guardianDiagnostics2 = guardianDiagnostics;
                    Object obj10 = emptyMap.get("errors");
                    List list = obj10 instanceof List ? (List) obj10 : null;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj11 : list) {
                            String str11 = obj11 instanceof String ? (String) obj11 : null;
                            if (str11 != null) {
                                arrayList2.add(str11);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    Object obj12 = emptyMap.get(EventKeys.TIMESTAMP);
                    Number number = obj12 instanceof Number ? (Number) obj12 : null;
                    long longValue = number != null ? number.longValue() : System.currentTimeMillis();
                    Object obj13 = emptyMap.get("metadata");
                    m147constructorimpl = Result.m147constructorimpl(new VerificationResult(areEqual, a11, str9, arrayList, longValue, obj13 instanceof Map ? (Map) obj13 : null, guardianDiagnostics2));
                }
            } else {
                try {
                    ResponseBody body2 = execute.body();
                    if (body2 != null) {
                        str7 = body2.string();
                    }
                } catch (Exception unused) {
                }
                StringBuilder sb3 = new StringBuilder("HTTP ");
                sb3.append(execute.code());
                sb3.append(": ");
                sb3.append(execute.message());
                if (str7 != null && !StringsKt.isBlank(str7)) {
                    str6 = " | body: ".concat(str7);
                }
                sb3.append(str6);
                String sb4 = sb3.toString();
                Logger.c(Logger.f41582a, "ApiClient", "Verify error: " + sb4, null, 4, null);
                Result.Companion companion3 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(new IOException(sb4)));
            }
        } catch (Exception e12) {
            Logger.f41582a.b("ApiClient", "Error parsing verification response", e12);
            Result.Companion companion4 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(e12));
        }
        return Result.m146boximpl(m147constructorimpl);
    }
}
