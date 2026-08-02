package com.braze.triggers.utils;

import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.s;
import com.braze.triggers.actions.f;
import com.braze.triggers.actions.h;
import com.braze.triggers.conditions.e;
import com.braze.triggers.conditions.i;
import com.braze.triggers.conditions.j;
import com.braze.triggers.conditions.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f822a = new c();
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    public static InAppMessageBase a(final JSONObject jSONObject, r brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.a();
                    }
                }, 14, (Object) null);
                return null;
            }
            final String string = jSONObject.getString("type");
            if (!Intrinsics.areEqual(string, "inapp")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.a(string);
                    }
                }, 12, (Object) null);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return null;
            }
            return s.a(jSONObject2, brazeManager);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a(jSONObject);
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

    public final h b(final JSONObject actionJson, r brazeManager) {
        Intrinsics.checkNotNullParameter(actionJson, "actionJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            final String string = actionJson.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                return new com.braze.triggers.actions.c(actionJson, brazeManager);
            }
            if (Intrinsics.areEqual(string, "templated_iam")) {
                return new f(actionJson, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.c(string);
                }
            }, 6, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.b(actionJson);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize triggered action Json: " + jSONObject;
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public static final String b(String str) {
        return "Received triggered condition Json with unknown type: " + str + ". Not parsing.";
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(String str) {
        return "Received templated message Json with unknown type: " + str + ". Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Encountered exception processing templated message: " + jSONObject;
    }

    public final ArrayList a(final JSONArray jSONArray, r brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.c();
                    }
                }, 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNull(jSONObject);
                h b2 = b(jSONObject, brazeManager);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            return arrayList;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.b(jSONArray);
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
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = triggerConditionsJson.optJSONObject(i);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.b();
                    }
                }, 12, (Object) null);
            } else {
                final String string = optJSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1679221933:
                            if (string.equals("purchase_property")) {
                                arrayList.add(new i(optJSONObject));
                                break;
                            }
                            break;
                        case 3417674:
                            if (string.equals("open")) {
                                arrayList.add(new com.braze.triggers.conditions.f());
                                break;
                            }
                            break;
                        case 3556498:
                            if (string.equals("test")) {
                                arrayList.add(new k());
                                break;
                            }
                            break;
                        case 447503464:
                            if (string.equals("custom_event_property")) {
                                arrayList.add(new com.braze.triggers.conditions.b(optJSONObject));
                                break;
                            }
                            break;
                        case 717572172:
                            if (string.equals("custom_event")) {
                                arrayList.add(new com.braze.triggers.conditions.a(optJSONObject));
                                break;
                            }
                            break;
                        case 1512893214:
                            if (string.equals("iam_click")) {
                                arrayList.add(new e(optJSONObject));
                                break;
                            }
                            break;
                        case 1743324417:
                            if (string.equals(FirebaseAnalytics.Event.PURCHASE)) {
                                arrayList.add(new com.braze.triggers.conditions.h(optJSONObject));
                                break;
                            }
                            break;
                        case 1926863907:
                            if (string.equals("push_click")) {
                                arrayList.add(new j(optJSONObject));
                                break;
                            }
                            break;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.utils.c$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.b(string);
                    }
                }, 12, (Object) null);
            }
        }
        return arrayList;
    }
}
