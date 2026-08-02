package com.braze.support;

import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f787a = new o();

    public static final ArrayList a(JSONArray geofenceJson) {
        Intrinsics.checkNotNullParameter(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        for (int i = 0; i < length; i++) {
            final JSONObject optJSONObject = geofenceJson.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f787a, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.o$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.a();
                        }
                    }, 6, (Object) null);
                    Unit unit = Unit.INSTANCE;
                } catch (JSONException e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f787a, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.support.o$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.a(optJSONObject);
                        }
                    }, 4, (Object) null);
                    Unit unit2 = Unit.INSTANCE;
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f787a, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.support.o$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.b(optJSONObject);
                        }
                    }, 4, (Object) null);
                    Unit unit3 = Unit.INSTANCE;
                }
            } else {
                arrayList.add(new BrazeGeofence(optJSONObject));
            }
        }
        return arrayList;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json:" + jSONObject;
    }

    public static final String a() {
        return "Received null or blank geofence Json. Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json due to JSONException: " + jSONObject;
    }
}
