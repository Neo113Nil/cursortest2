package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0015\u0016B1\b\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lbo/app/x3;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lbo/app/g2;", "v", "", "w", "y", "x", "z", "e", "()Z", "isEmpty", "", "userId", "containsRespondWithFeed", "containsRespondWithTriggers", "Lbo/app/w3;", "outboundConfigParams", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbo/app/w3;)V", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class x3 implements IPutIntoJson<JSONObject>, g2 {
    public static final b f = new b(null);
    private final String b;
    private final Boolean c;
    private final Boolean d;
    private final w3 e;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0004\u001a\u00020\u0000J\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\b\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\b\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0004\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0004\u0010\u0019¨\u0006\u001c"}, d2 = {"Lbo/app/x3$a;", "", "", "userId", "b", "c", "Lbo/app/w3;", "outboundConfigParams", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/x3;", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "containsRespondWithFeed", "Ljava/lang/Boolean;", "getContainsRespondWithFeed", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "containsRespondWithTriggers", "getContainsRespondWithTriggers", "Lbo/app/w3;", "getOutboundConfigParams", "()Lbo/app/w3;", "(Lbo/app/w3;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbo/app/w3;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private String a;
        private Boolean b;
        private Boolean c;
        private w3 d;

        public a(String str, Boolean bool, Boolean bool2, w3 w3Var) {
            this.a = str;
            this.b = bool;
            this.c = bool2;
            this.d = w3Var;
        }

        public final void a(String str) {
            this.a = str;
        }

        public final void b(Boolean bool) {
            this.c = bool;
        }

        public final a c() {
            b(Boolean.TRUE);
            return this;
        }

        public final void a(Boolean bool) {
            this.b = bool;
        }

        public final void b(w3 w3Var) {
            this.d = w3Var;
        }

        public final a a(w3 outboundConfigParams) {
            Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
            b(outboundConfigParams);
            return this;
        }

        public final a b(String userId) {
            a(userId);
            return this;
        }

        public final x3 a() {
            return new x3(this.a, this.b, this.c, this.d, null);
        }

        public final a b() {
            a(Boolean.TRUE);
            return this;
        }

        public /* synthetic */ a(String str, Boolean bool, Boolean bool2, w3 w3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : w3Var);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lbo/app/x3$b;", "", "", "RESPOND_WITH_CONFIG_KEY", "Ljava/lang/String;", "RESPOND_WITH_FEED_KEY", "RESPOND_WITH_TRIGGERS_KEY", "USER_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private x3(String str, Boolean bool, Boolean bool2, w3 w3Var) {
        this.b = str;
        this.c = bool;
        this.d = bool2;
        this.e = w3Var;
    }

    public /* synthetic */ x3(String str, Boolean bool, Boolean bool2, w3 w3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, bool2, w3Var);
    }

    @Override // bo.app.g2
    public boolean e() {
        w3 w3Var;
        JSONObject jsonObject = getJsonObject();
        if (jsonObject.length() == 0) {
            return true;
        }
        if (this.c == null && this.d == null && (w3Var = this.e) != null) {
            return w3Var.e();
        }
        if (jsonObject.length() == 1) {
            return jsonObject.has("user_id");
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        String str = this.b;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.b);
        }
        Boolean bool = this.c;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.d;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        w3 w3Var = this.e;
        if (w3Var != null) {
            jSONObject.put("config", w3Var.getJsonKey());
        }
        return jSONObject;
    }

    public final boolean w() {
        return this.e != null;
    }

    public final boolean x() {
        return this.c != null;
    }

    public final boolean y() {
        return this.d != null;
    }

    public final boolean z() {
        String str = this.b;
        return !(str == null || str.length() == 0);
    }
}
