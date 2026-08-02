package com.braze.support;

import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f29483a = new f();

    public static final ArrayList a(JSONArray geofenceJson) {
        Intrinsics.checkNotNullParameter(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        for (int i10 = 0; i10 < length; i10++) {
            final JSONObject optJSONObject = geofenceJson.optJSONObject(i10);
            if (optJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29483a, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.l1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.support.f.a();
                        }
                    }, 6, (Object) null);
                } catch (JSONException e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29483a, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: Y3.n1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.support.f.a(optJSONObject);
                        }
                    }, 4, (Object) null);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29483a, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: Y3.m1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.support.f.b(optJSONObject);
                        }
                    }, 4, (Object) null);
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
