package bo.app;

import bo.app.og;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    public static final og f25896a = new og();

    /* renamed from: b, reason: collision with root package name */
    public static final String f25897b = BrazeLogger.getBrazeLogTag((Class<?>) og.class);

    public static InAppMessageBase a(final JSONObject jSONObject, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.T8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return og.a();
                    }
                }, 14, (Object) null);
                return null;
            }
            final String string = jSONObject.getString("type");
            if (!Intrinsics.areEqual(string, "inapp")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.U8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return og.a(string);
                    }
                }, 12, (Object) null);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(EventKeys.DATA);
            if (jSONObject2 == null) {
                return null;
            }
            return com.braze.support.i.a(jSONObject2, brazeManager);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.V8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return og.a(jSONObject);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONArray jSONArray) {
        return "Failed to deserialize triggered actions Json array: " + jSONArray;
    }

    public static final String c() {
        return "Triggered actions Json array was null. Not de-serializing triggered actions.";
    }

    public static final String c(String str) {
        return "Received unknown trigger type: " + str;
    }

    public final tg b(final JSONObject actionJson, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(actionJson, "actionJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            final String string = actionJson.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                return new oa(actionJson, brazeManager);
            }
            if (Intrinsics.areEqual(string, "templated_iam")) {
                return new sf(actionJson, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.P8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return og.c(string);
                }
            }, 6, (Object) null);
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.Q8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return og.b(actionJson);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(String str) {
        return "Received templated message Json with unknown type: " + str + ". Not parsing.";
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize triggered action Json: " + jSONObject;
    }

    public static final String a(JSONObject jSONObject) {
        return "Encountered exception processing templated message: " + jSONObject;
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public static final String b(String str) {
        return "Received triggered condition Json with unknown type: " + str + ". Not parsing.";
    }

    public final ArrayList a(final JSONArray jSONArray, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.W8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return og.c();
                    }
                }, 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                Intrinsics.checkNotNull(jSONObject);
                tg b10 = b(jSONObject, brazeManager);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.X8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return og.b(jSONArray);
                }
            }, 8, (Object) null);
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
    public static ArrayList a(JSONArray triggerConditionsJson) {
        Intrinsics.checkNotNullParameter(triggerConditionsJson, "triggerConditionsJson");
        ArrayList arrayList = new ArrayList();
        int length = triggerConditionsJson.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = triggerConditionsJson.optJSONObject(i10);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.R8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return og.b();
                    }
                }, 12, (Object) null);
            } else {
                final String string = optJSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1679221933:
                            if (string.equals("purchase_property")) {
                                arrayList.add(new xb(optJSONObject));
                                break;
                            }
                            break;
                        case 3417674:
                            if (string.equals("open")) {
                                arrayList.add(new gb());
                                break;
                            }
                            break;
                        case 3556498:
                            if (string.equals("test")) {
                                arrayList.add(new tf());
                                break;
                            }
                            break;
                        case 447503464:
                            if (string.equals("custom_event_property")) {
                                arrayList.add(new b4(optJSONObject));
                                break;
                            }
                            break;
                        case 717572172:
                            if (string.equals("custom_event")) {
                                arrayList.add(new z3(optJSONObject));
                                break;
                            }
                            break;
                        case 1512893214:
                            if (string.equals("iam_click")) {
                                arrayList.add(new ea(optJSONObject));
                                break;
                            }
                            break;
                        case 1743324417:
                            if (string.equals("purchase")) {
                                arrayList.add(new vb(optJSONObject));
                                break;
                            }
                            break;
                        case 1926863907:
                            if (string.equals("push_click")) {
                                arrayList.add(new zb(optJSONObject));
                                break;
                            }
                            break;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25897b, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.S8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return og.b(string);
                    }
                }, 12, (Object) null);
            }
        }
        return arrayList;
    }
}
