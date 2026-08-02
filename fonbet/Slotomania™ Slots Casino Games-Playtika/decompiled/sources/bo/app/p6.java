package bo.app;

import com.braze.Constants;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\u0013¨\u0006\u0016"}, d2 = {"Lbo/app/p6;", "", "Lorg/json/JSONObject;", "templatedMessageJson", "Lbo/app/z1;", "brazeManager", "Lcom/braze/models/inappmessage/IInAppMessage;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lorg/json/JSONObject;Lbo/app/z1;)Lcom/braze/models/inappmessage/IInAppMessage;", "Lorg/json/JSONArray;", "triggeredActionJsonArray", "", "Lbo/app/y2;", "(Lorg/json/JSONArray;Lbo/app/z1;)Ljava/util/List;", "actionJson", "b", "(Lorg/json/JSONObject;Lbo/app/z1;)Lbo/app/y2;", "triggerConditionsJson", "Lbo/app/s2;", "(Lorg/json/JSONArray;)Ljava/util/List;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class p6 {
    public static final p6 a = new p6();
    private static final String b = BrazeLogger.getBrazeLogTag((Class<?>) p6.class);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Templated message Json was null. Not de-serializing templated message.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received templated message Json with unknown type: " + ((Object) this.b) + ". Not parsing.";
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
            return Intrinsics.stringPlus("Encountered exception processing templated message: ", this.b);
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
            return "Received null or blank trigger condition Json. Not parsing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received triggered condition Json with unknown type: " + ((Object) this.b) + ". Not parsing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Received unknown trigger type: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize triggered action Json: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered actions Json array was null. Not de-serializing triggered actions.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(JSONArray jSONArray) {
            super(0);
            this.b = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize triggered actions Json array: ", this.b);
        }
    }

    private p6() {
    }

    public final IInAppMessage a(JSONObject templatedMessageJson, z1 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (templatedMessageJson == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, (Function0) a.b, 6, (Object) null);
                return null;
            }
            String string = templatedMessageJson.getString("type");
            if (!Intrinsics.areEqual(string, "inapp")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, (Function0) new b(string), 4, (Object) null);
                return null;
            }
            JSONObject jSONObject = templatedMessageJson.getJSONObject("data");
            if (jSONObject == null) {
                return null;
            }
            return c3.a(jSONObject, brazeManager);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(b, BrazeLogger.Priority.W, (Throwable) e2, (Function0<String>) new c(templatedMessageJson));
            return null;
        }
    }

    public final y2 b(JSONObject actionJson, z1 brazeManager) {
        Intrinsics.checkNotNullParameter(actionJson, "actionJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            String string = actionJson.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                return new f3(actionJson, brazeManager);
            }
            if (Intrinsics.areEqual(string, "templated_iam")) {
                return new b6(actionJson, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new f(string), 2, (Object) null);
            return null;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(b, BrazeLogger.Priority.W, (Throwable) e2, (Function0<String>) new g(actionJson));
            return null;
        }
    }

    public final List<y2> a(JSONArray triggeredActionJsonArray, z1 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (triggeredActionJsonArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, (Function0) h.b, 6, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = triggeredActionJsonArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                JSONObject actionJson = triggeredActionJsonArray.getJSONObject(i2);
                Intrinsics.checkNotNullExpressionValue(actionJson, "actionJson");
                y2 b2 = b(actionJson, brazeManager);
                if (b2 != null) {
                    arrayList.add(b2);
                }
                i2 = i3;
            }
            return arrayList;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(b, BrazeLogger.Priority.W, (Throwable) e2, (Function0<String>) new i(triggeredActionJsonArray));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final List<s2> a(JSONArray triggerConditionsJson) {
        Intrinsics.checkNotNullParameter(triggerConditionsJson, "triggerConditionsJson");
        ArrayList arrayList = new ArrayList();
        int length = triggerConditionsJson.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            JSONObject optJSONObject = triggerConditionsJson.optJSONObject(i2);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, (Function0) d.b, 4, (Object) null);
            } else {
                String string = optJSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1679221933:
                            if (string.equals("purchase_property")) {
                                arrayList.add(new d4(optJSONObject));
                                break;
                            }
                            break;
                        case 3417674:
                            if (string.equals("open")) {
                                arrayList.add(new t3());
                                break;
                            }
                            break;
                        case 3556498:
                            if (string.equals("test")) {
                                arrayList.add(new c6());
                                break;
                            }
                            break;
                        case 447503464:
                            if (string.equals("custom_event_property")) {
                                arrayList.add(new g0(optJSONObject));
                                break;
                            }
                            break;
                        case 717572172:
                            if (string.equals("custom_event")) {
                                arrayList.add(new e0(optJSONObject));
                                break;
                            }
                            break;
                        case 1512893214:
                            if (string.equals("iam_click")) {
                                arrayList.add(new a3(optJSONObject));
                                break;
                            }
                            break;
                        case 1743324417:
                            if (string.equals(FirebaseAnalytics.Event.PURCHASE)) {
                                arrayList.add(new b4(optJSONObject));
                                break;
                            }
                            break;
                        case 1926863907:
                            if (string.equals("push_click")) {
                                arrayList.add(new f4(optJSONObject));
                                break;
                            }
                            break;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, (Function0) new e(string), 4, (Object) null);
            }
            i2 = i3;
        }
        return arrayList;
    }
}
