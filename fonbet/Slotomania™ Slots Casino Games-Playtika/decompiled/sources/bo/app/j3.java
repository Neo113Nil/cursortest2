package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002JH\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\r\u001a\u00020\u0005*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u0006H\u0002JP\u0010\r\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00060\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0016¨\u0006\u0017"}, d2 = {"Lbo/app/j3;", "Lbo/app/i2;", "Lbo/app/a5;", "requestTarget", "", "", "Lcom/braze/communication/HttpHeaders;", "requestHeaders", "Lkotlin/Lazy;", "requestIdentifier", "Lorg/json/JSONObject;", "jsonParams", "", Constants.BRAZE_PUSH_CONTENT_KEY, "responseHeaders", "responseJsonData", "", "timeInMillis", "payload", "Lkotlin/Pair;", "httpConnector", "<init>", "(Lbo/app/i2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class j3 implements i2 {
    private final i2 a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ Lazy<String> b;
        final /* synthetic */ a5 c;
        final /* synthetic */ j3 d;
        final /* synthetic */ Map<String, String> e;
        final /* synthetic */ JSONObject f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Lazy<String> lazy, a5 a5Var, j3 j3Var, Map<String, String> map, JSONObject jSONObject) {
            super(0);
            this.b = lazy;
            this.c = a5Var;
            this.d = j3Var;
            this.e = map;
            this.f = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder append = new StringBuilder("\n                |Making request with id => \"").append(this.b.getValue()).append("\"\n                |to url: ").append(this.c).append("\n                \n                |with headers:\n                ").append(this.d.a(this.e)).append("\n                |\n                |");
            JSONObject jSONObject = this.f;
            return StringsKt.trimMargin$default(append.append(jSONObject == null ? "" : Intrinsics.stringPlus("and JSON :\n", JsonUtils.getPrettyPrintedString(jSONObject))).append("\n                ").toString(), null, 1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception while logging request: ";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ Lazy<String> b;
        final /* synthetic */ a5 c;
        final /* synthetic */ long d;
        final /* synthetic */ j3 e;
        final /* synthetic */ Map<String, String> f;
        final /* synthetic */ JSONObject g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Lazy<String> lazy, a5 a5Var, long j, j3 j3Var, Map<String, String> map, JSONObject jSONObject) {
            super(0);
            this.b = lazy;
            this.c = a5Var;
            this.d = j;
            this.e = j3Var;
            this.f = map;
            this.g = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return StringsKt.trimMargin$default("\n                |Made request with id => \"" + this.b.getValue() + "\"\n                |to url: " + this.c + "\n                |took: " + this.d + "ms\n                \n                |with response headers:\n                " + this.e.a(this.f) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(this.g) + "\n                ", null, 1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception while logging result: ";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ a5 b;
        final /* synthetic */ Map<String, String> c;
        final /* synthetic */ JSONObject d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a5 a5Var, Map<String, String> map, JSONObject jSONObject) {
            super(0);
            this.b = a5Var;
            this.c = map;
            this.d = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return v1.a(this.b, this.c, this.d);
        }
    }

    public j3(i2 httpConnector) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        this.a = httpConnector;
    }

    @Override // bo.app.i2
    public Pair<JSONObject, Map<String, String>> a(a5 requestTarget, Map<String, String> requestHeaders, JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Lazy<String> lazy = LazyKt.lazy(new e(requestTarget, requestHeaders, payload));
        a(requestTarget, requestHeaders, lazy, payload);
        long currentTimeMillis = System.currentTimeMillis();
        Pair<JSONObject, Map<String, String>> a2 = this.a.a(requestTarget, requestHeaders, payload);
        a(lazy, requestTarget, a2.getSecond(), a2.getFirst(), System.currentTimeMillis() - currentTimeMillis);
        return a2;
    }

    private final void a(a5 requestTarget, Map<String, String> requestHeaders, Lazy<String> requestIdentifier, JSONObject jsonParams) {
        try {
            try {
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(requestIdentifier, requestTarget, this, requestHeaders, jsonParams), 3, (Object) null);
        } catch (Exception e4) {
            e = e4;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
    }

    private final void a(Lazy<String> requestIdentifier, a5 requestTarget, Map<String, String> responseHeaders, JSONObject responseJsonData, long timeInMillis) {
        try {
            try {
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(requestIdentifier, requestTarget, timeInMillis, this, responseHeaders, responseJsonData), 3, (Object) null);
        } catch (Exception e4) {
            e = e4;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, d.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add("|\"" + entry.getKey() + "\" => \"" + ((Object) entry.getValue()) + '\"');
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
    }
}
