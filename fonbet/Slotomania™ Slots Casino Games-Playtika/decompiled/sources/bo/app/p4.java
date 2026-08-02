package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lbo/app/p4;", "Lbo/app/l2;", "Lorg/json/JSONObject;", "e", "", "o", "()Z", "isAlwaysEligible", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "isOnlyEligibleOnce", "", "q", "()Ljava/lang/Integer;", "reEligibilityTime", "reEligibility", "<init>", "(I)V", "json", "(Lorg/json/JSONObject;)V", Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class p4 implements l2 {
    public static final a c = new a(null);
    private final int b;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lbo/app/p4$a;", "", "", "ALWAYS_ELIGIBLE", "I", "ELIGIBLE_ONCE", "", "RE_ELIGIBILITY", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
            return "Could not convert ReEligibilityConfig to JSON";
        }
    }

    public p4(int i) {
        this.b = i;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getValue() {
        try {
            return new JSONObject().put("re_eligibility", this.b);
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            return null;
        }
    }

    @Override // bo.app.l2
    public boolean o() {
        return this.b == 0;
    }

    @Override // bo.app.l2
    public Integer q() {
        int i = this.b;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // bo.app.l2
    public boolean s() {
        return this.b == -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p4(JSONObject json) {
        this(json.optInt("re_eligibility", -1));
        Intrinsics.checkNotNullParameter(json, "json");
    }
}
