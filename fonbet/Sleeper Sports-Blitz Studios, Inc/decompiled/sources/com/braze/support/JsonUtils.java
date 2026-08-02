package com.braze.support;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\u001aC\u0010\u0002\u001a\u0002H\u0003\"\u0010\b\u0000\u0010\u0003*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\t2\u0006\u0010\n\u001a\u0002H\u0003¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0002\u001a\u0002H\u0003\"\u0010\b\u0000\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u0002H\u0003H\u0086\b¢\u0006\u0002\u0010\f\u001a2\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0010\b\u0000\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u00120\u0011\u001a\u001b\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0013¢\u0006\u0002\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0018\u001a\u0018\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001a*\u0004\u0018\u00010\u0006\u001a\u0012\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u0004\u0018\u00010\u000f\u001a\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006\u001a\u0015\u0010 \u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0086\u0002\u001a\f\u0010\"\u001a\u00020\u0001*\u0004\u0018\u00010\u0006\u001a\f\u0010\"\u001a\u00020\u0001*\u0004\u0018\u00010\u000f\u001a\u001d\u0010#\u001a\u0004\u0018\u00010$*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010%\u001a\u001a\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010*\u001a\u00020'*\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\n\u0010+\u001a\u00020\u0006*\u00020\u0006\u001a\f\u0010,\u001a\u00020-*\u0004\u0018\u00010\u0001\u001a\u001d\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00100/\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u0004\u0018\u00010\u000fH\u0086\n\u001a\u001b\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00100/\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0006H\u0086\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"TAG", "", "optEnum", "TargetEnum", "", "jsonObject", "Lorg/json/JSONObject;", SDKConstants.PARAM_KEY, "targetEnumClass", "Ljava/lang/Class;", "defaultEnum", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Enum;", "constructJsonArray", "Lorg/json/JSONArray;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/braze/models/IPutIntoJson;", "", "([Ljava/lang/Object;)Lorg/json/JSONArray;", "getOptionalString", "getDoubleOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "convertJSONObjectToMap", "", "convertStringJsonArrayToList", "", "mergeJsonObjects", "oldJson", "newJson", "plus", "otherJson", "getPrettyPrintedString", "getColorIntegerOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "areJsonObjectsEqual", "", TypedValues.AttributesType.S_TARGET, "source", "isEqualTo", "deepcopy", "parseJsonObjectIntoBundle", "Landroid/os/Bundle;", "iterator", "", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object opt = jSONObject.opt(next);
            Object opt2 = jSONObject2.opt(next);
            if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                if (!isEqualTo((JSONObject) opt, (JSONObject) opt2)) {
                    return false;
                }
            } else if (opt != null && opt2 != null && !Intrinsics.areEqual(opt, opt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends IPutIntoJson<T>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getPropertiesJSONObject());
        }
        return jSONArray;
    }

    public static final Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(final JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (final int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String convertStringJsonArrayToList$lambda$1;
                            convertStringJsonArrayToList$lambda$1 = JsonUtils.convertStringJsonArrayToList$lambda$1(i, jSONArray);
                            return convertStringJsonArrayToList$lambda$1;
                        }
                    }, 8, (Object) null);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String convertStringJsonArrayToList$lambda$1(int i, JSONArray jSONArray) {
        return "Failed to get string for item at index: " + i + " and array: " + jSONArray;
    }

    public static final JSONObject deepcopy(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return new JSONObject(jSONObject.toString());
    }

    public static final Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (str != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String colorIntegerOrNull$lambda$8;
                        colorIntegerOrNull$lambda$8 = JsonUtils.getColorIntegerOrNull$lambda$8();
                        return colorIntegerOrNull$lambda$8;
                    }
                }, 8, (Object) null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getColorIntegerOrNull$lambda$8() {
        return "Failed to retrieve color integer from JSON";
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static final String getOptionalString(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$6() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$7() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final JSONObject mergeJsonObjects(JSONObject oldJson, JSONObject newJson) {
        Intrinsics.checkNotNullParameter(oldJson, "oldJson");
        Intrinsics.checkNotNullParameter(newJson, "newJson");
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = oldJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            final String next = keys.next();
            try {
                jSONObject.put(next, oldJson.get(next));
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String mergeJsonObjects$lambda$3$lambda$2;
                        mergeJsonObjects$lambda$3$lambda$2 = JsonUtils.mergeJsonObjects$lambda$3$lambda$2(next);
                        return mergeJsonObjects$lambda$3$lambda$2;
                    }
                }, 8, (Object) null);
            }
        }
        Iterator<String> keys2 = newJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
        while (keys2.hasNext()) {
            final String next2 = keys2.next();
            try {
                jSONObject.put(next2, newJson.get(next2));
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String mergeJsonObjects$lambda$5$lambda$4;
                        mergeJsonObjects$lambda$5$lambda$4 = JsonUtils.mergeJsonObjects$lambda$5$lambda$4(next2);
                        return mergeJsonObjects$lambda$5$lambda$4;
                    }
                }, 8, (Object) null);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$3$lambda$2(String str) {
        return "Caught exception merging JSON for old key " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$5$lambda$4(String str) {
        return "Caught exception merging JSON for new key " + str;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, Class<TargetEnum> targetEnumClass, TargetEnum targetenum) {
        TargetEnum targetenum2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        try {
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String enumValue = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(enumValue, "toUpperCase(...)");
            Intrinsics.checkNotNullParameter(enumValue, "enumValue");
            Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
            targetenum2 = (TargetEnum) Enum.valueOf(targetEnumClass, enumValue);
        } catch (Exception unused) {
        }
        return targetenum2 == null ? targetenum : targetenum2;
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseJsonObjectIntoBundle$lambda$10;
                        parseJsonObjectIntoBundle$lambda$10 = JsonUtils.parseJsonObjectIntoBundle$lambda$10();
                        return parseJsonObjectIntoBundle$lambda$10;
                    }
                }, 8, (Object) null);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseJsonObjectIntoBundle$lambda$10() {
        return "Unable parse JSON into a bundle.";
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject otherJson) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(otherJson, "otherJson");
        return mergeJsonObjects(jSONObject, otherJson);
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (T t : tArr) {
            jSONArray.put(t);
        }
        return jSONArray;
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String prettyPrintedString$lambda$6;
                    prettyPrintedString$lambda$6 = JsonUtils.getPrettyPrintedString$lambda$6();
                    return prettyPrintedString$lambda$6;
                }
            }, 8, (Object) null);
            return "";
        }
    }

    public static final String getPrettyPrintedString(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        try {
            return jSONArray.toString(2);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.support.JsonUtils$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String prettyPrintedString$lambda$7;
                    prettyPrintedString$lambda$7 = JsonUtils.getPrettyPrintedString$lambda$7();
                    return prettyPrintedString$lambda$7;
                }
            }, 8, (Object) null);
            return "";
        }
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, TargetEnum defaultEnum) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultEnum, "defaultEnum");
        try {
            k kVar = k.f783a;
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str = string;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Locale locale = US;
            Intrinsics.checkNotNullExpressionValue(string.toUpperCase(US), "toUpperCase(...)");
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return defaultEnum;
        }
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            k kVar = k.f783a;
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str = string;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Locale locale = US;
            Intrinsics.checkNotNullExpressionValue(string.toUpperCase(US), "toUpperCase(...)");
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return null;
        }
    }

    public static final /* synthetic */ <T> Iterator<T> iterator(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList().iterator();
        }
        Sequence asSequence = CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length()));
        Intrinsics.needClassReification();
        Sequence filter = SequencesKt.filter(asSequence, new t(jSONArray));
        Intrinsics.needClassReification();
        return SequencesKt.map(filter, new u(jSONArray)).iterator();
    }

    public static final /* synthetic */ <T> Iterator<T> iterator(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        Sequence asSequence = SequencesKt.asSequence(keys);
        Intrinsics.needClassReification();
        Sequence filter = SequencesKt.filter(asSequence, new v(jSONObject));
        Intrinsics.needClassReification();
        return SequencesKt.map(filter, new w(jSONObject)).iterator();
    }
}
