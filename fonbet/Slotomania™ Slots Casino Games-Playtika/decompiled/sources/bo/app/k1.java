package bo.app;

import com.braze.Constants;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lbo/app/k1;", "", "Lorg/json/JSONArray;", "featureFlagsJson", "", "Lcom/braze/models/FeatureFlag;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lorg/json/JSONObject;", "featureFlagObject", "(Lorg/json/JSONObject;)Lcom/braze/models/FeatureFlag;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class k1 {
    public static final k1 a = new k1();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class a extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof JSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class b extends Lambda implements Function1<Integer, JSONObject> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final JSONObject a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.json.JSONObject] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize feature flag Json: ", this.b);
        }
    }

    private k1() {
    }

    public final List<FeatureFlag> a(JSONArray featureFlagsJson) {
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, featureFlagsJson.length())), new a(featureFlagsJson)), new b(featureFlagsJson)).iterator();
        while (it.hasNext()) {
            FeatureFlag a2 = a.a((JSONObject) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final FeatureFlag a(JSONObject featureFlagObject) {
        Intrinsics.checkNotNullParameter(featureFlagObject, "featureFlagObject");
        try {
            String string = featureFlagObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "featureFlagObject.getString(FeatureFlag.ID)");
            boolean z = featureFlagObject.getBoolean("enabled");
            JSONObject optJSONObject = featureFlagObject.optJSONObject(FeatureFlag.PROPERTIES);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z, optJSONObject);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new c(featureFlagObject));
            return null;
        }
    }
}
