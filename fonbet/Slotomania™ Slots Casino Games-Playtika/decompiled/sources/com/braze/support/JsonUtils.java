package com.braze.support;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.app.w0;
import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005\u001a2\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0010\b\u0000\u0010\u000b\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u000f\u001a8\u0010\n\u001a\u0002H\u000b\"\u0010\b\u0000\u0010\u000b\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u0002H\u000bH\u0086\b¢\u0006\u0002\u0010\u0011\u001aC\u0010\n\u001a\u0002H\u000b\"\u0010\b\u0000\u0010\u000b*\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00132\u0006\u0010\u0010\u001a\u0002H\u000b¢\u0006\u0002\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00170\u0018¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001b0\u001a\u001a\u0018\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001d*\u0004\u0018\u00010\u0005\u001a\u0012\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u0004\u0018\u00010\u0016\u001a\n\u0010 \u001a\u00020\u0005*\u00020\u0005\u001a\u001d\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010#\u001a\u001b\u0010$\u001a\u0004\u0018\u00010%*\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010&\u001a\u0016\u0010'\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010(\u001a\u00020\u0001*\u0004\u0018\u00010\u0016\u001a\f\u0010(\u001a\u00020\u0001*\u0004\u0018\u00010\u0005\u001a\u0016\u0010)\u001a\u00020\u0003*\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u001a\u001d\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00170+\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u0004\u0018\u00010\u0016H\u0086\n\u001a\u001b\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00170+\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u0005H\u0086\n\u001a\f\u0010,\u001a\u00020-*\u0004\u0018\u00010\u0001\u001a\u0015\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0086\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"TAG", "", "areJsonObjectsEqual", "", TypedValues.AttributesType.S_TARGET, "Lorg/json/JSONObject;", "source", "mergeJsonObjects", "oldJson", "newJson", "optEnum", "TargetEnum", "", "jsonObject", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Enum;", "defaultEnum", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "targetEnumClass", "Ljava/lang/Class;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", "constructJsonArray", "Lorg/json/JSONArray;", "T", "", "([Ljava/lang/Object;)Lorg/json/JSONArray;", "", "Lcom/braze/models/IPutIntoJson;", "convertJSONObjectToMap", "", "convertStringJsonArrayToList", "", "deepcopy", "getColorIntegerOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getDoubleOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "getOptionalString", "getPrettyPrintedString", "isEqualTo", "iterator", "", "parseJsonObjectIntoBundle", "Landroid/os/Bundle;", "plus", "otherJson", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ JSONArray c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, JSONArray jSONArray) {
            super(0);
            this.b = i;
            this.c = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get string for item at index: " + this.b + " and array: " + this.c;
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
            return "Failed to retrieve color integer from JSON";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
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
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    public static final class e extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            Object opt = this.b.opt(i);
            Intrinsics.reifiedOperationMarker(3, "T");
            return Boolean.valueOf(opt instanceof Object);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class f<T> extends Lambda implements Function1<Integer, T> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final T a(int i) {
            T t = (T) this.b.get(i);
            Intrinsics.reifiedOperationMarker(1, "T");
            return t;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    public static final class g extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(1);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            Object opt = this.b.opt(str);
            Intrinsics.reifiedOperationMarker(3, "T");
            return Boolean.valueOf(opt instanceof Object);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class h<T> extends Lambda implements Function1<String, T> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(1);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(String str) {
            T t = (T) this.b.get(str);
            Intrinsics.reifiedOperationMarker(1, "T");
            return t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Caught exception merging JSON for old key ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Caught exception merging JSON for new key ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable parse JSON into a bundle.";
        }
    }

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "target.keys()");
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
        Intrinsics.checkNotNullExpressionValue(keys, "this.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            String string = jSONObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "this.getString(key)");
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                try {
                    String string = jSONArray.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "this.getString(i)");
                    arrayList.add(string);
                } catch (Exception e2) {
                    BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) new a(i2, jSONArray));
                }
                i2 = i3;
            }
        }
        return arrayList;
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
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Function0<String>) b.b);
            }
        }
        return null;
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

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final JSONObject mergeJsonObjects(JSONObject oldJson, JSONObject newJson) {
        Intrinsics.checkNotNullParameter(oldJson, "oldJson");
        Intrinsics.checkNotNullParameter(newJson, "newJson");
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = oldJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "oldJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, oldJson.get(next));
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) new i(next));
            }
        }
        Iterator<String> keys2 = newJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys2, "newJson.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject.put(next2, newJson.get(next2));
            } catch (JSONException e3) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e3, (Function0<String>) new j(next2));
            }
        }
        return jSONObject;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, Class<TargetEnum> targetEnumClass, TargetEnum targetenum) {
        TargetEnum targetenum2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        try {
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            targetenum2 = (TargetEnum) w0.a(upperCase, targetEnumClass);
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
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) k.b);
            }
        }
        return bundle;
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject otherJson) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(otherJson, "otherJson");
        return mergeJsonObjects(jSONObject, otherJson);
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        String str = "";
        if (jSONObject == null) {
            return "";
        }
        try {
            str = jSONObject.toString(2);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Function0<String>) c.b);
        }
        Intrinsics.checkNotNullExpressionValue(str, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        return str;
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            jSONArray.put(t);
        }
        return jSONArray;
    }

    public static final String getPrettyPrintedString(JSONArray jSONArray) {
        String str = "";
        if (jSONArray == null) {
            return "";
        }
        try {
            str = jSONArray.toString(2);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Function0<String>) d.b);
        }
        Intrinsics.checkNotNullExpressionValue(str, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        return str;
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, TargetEnum defaultEnum) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultEnum, "defaultEnum");
        try {
            w0 w0Var = w0.a;
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            String str = string;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Locale locale = US;
            Intrinsics.checkNotNullExpressionValue(string.toUpperCase(US), "this as java.lang.String).toUpperCase(locale)");
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            Enum[] enumArr = new Enum[0];
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return defaultEnum;
        }
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            w0 w0Var = w0.a;
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            String str = string;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Locale locale = US;
            Intrinsics.checkNotNullExpressionValue(string.toUpperCase(US), "this as java.lang.String).toUpperCase(locale)");
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            Enum[] enumArr = new Enum[0];
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
        Sequence filter = SequencesKt.filter(asSequence, new e(jSONArray));
        Intrinsics.needClassReification();
        return SequencesKt.map(filter, new f(jSONArray)).iterator();
    }

    public static final /* synthetic */ <T> Iterator<T> iterator(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "this.keys()");
        Sequence asSequence = SequencesKt.asSequence(keys);
        Intrinsics.needClassReification();
        Sequence filter = SequencesKt.filter(asSequence, new g(jSONObject));
        Intrinsics.needClassReification();
        return SequencesKt.map(filter, new h(jSONObject)).iterator();
    }
}
