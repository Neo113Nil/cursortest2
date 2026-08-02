package com.braze.support;

import androidx.exifinterface.media.ExifInterface;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0007\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\n\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\bJ9\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\n\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0086\b¨\u0006\u0012"}, d2 = {"Lcom/braze/support/DataStoreUtils;", "", "<init>", "()V", "toJsonString", "", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Ljava/lang/Object;)Ljava/lang/String;", "jsonStringToStringMap", "", "jsonString", "jsonStringToList", "", "stringToMap", "string", "entryDelimiter", "keyValueDelimiter", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataStoreUtils {
    public static final DataStoreUtils INSTANCE = new DataStoreUtils();

    private DataStoreUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Integer] */
    public static /* synthetic */ Map stringToMap$default(DataStoreUtils dataStoreUtils, String string, String entryDelimiter, String keyValueDelimiter, int i, Object obj) {
        String str;
        String str2;
        if ((i & 2) != 0) {
            entryDelimiter = ",";
        }
        if ((i & 4) != 0) {
            keyValueDelimiter = ":";
        }
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(entryDelimiter, "entryDelimiter");
        Intrinsics.checkNotNullParameter(keyValueDelimiter, "keyValueDelimiter");
        if (StringsKt.isBlank(string)) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            str = string;
        } catch (Exception e) {
            e = e;
            str = string;
        }
        try {
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{entryDelimiter}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List split$default2 = StringsKt.split$default((CharSequence) it2.next(), new String[]{keyValueDelimiter}, false, 2, 2, (Object) null);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default2, 10));
                Iterator it3 = split$default2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt.trim((CharSequence) it3.next()).toString());
                }
                String str3 = (String) arrayList3.get(0);
                String str4 = (String) arrayList3.get(1);
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                    str2 = str4;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    ?? intOrNull = StringsKt.toIntOrNull(str4);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    str2 = intOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    ?? longOrNull = StringsKt.toLongOrNull(str4);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    str2 = longOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    ?? doubleOrNull = StringsKt.toDoubleOrNull(str4);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    str2 = doubleOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    ?? floatOrNull = StringsKt.toFloatOrNull(str4);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    str2 = floatOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    ?? booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str4);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    str2 = booleanStrictOrNull;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    linkedHashMap.put(str3, str2);
                }
            }
            return linkedHashMap;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new h(str), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final /* synthetic */ <T> String toJsonString(T data) {
        try {
            Json.Companion companion = Json.INSTANCE;
            SerializersModule serializersModule = companion.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return companion.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), data);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) i.f781a, 4, (Object) null);
            return (!(data instanceof Map) && (data instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
        }
    }

    public final /* synthetic */ <T> Map<String, T> jsonStringToStringMap(String jsonString) {
        Map<String, T> emptyMap;
        KSerializer MapSerializer;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        String str = jsonString;
        if (!StringsKt.isBlank(str) && !Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
            try {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                        BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                        Intrinsics.needClassReification();
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) g.f779a, 6, (Object) null);
                        return MapsKt.emptyMap();
                    }
                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                }
                Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, jsonString);
                Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                emptyMap = (Map) decodeFromString;
                Map<String, T> map = emptyMap;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new f(jsonString), 4, (Object) null);
                emptyMap = MapsKt.emptyMap();
            }
            return emptyMap;
        }
        return MapsKt.emptyMap();
    }

    public final /* synthetic */ <T> List<T> jsonStringToList(String jsonString) {
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        String str = jsonString;
        if (!StringsKt.isBlank(str) && !Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
            try {
                Json.Companion companion = Json.INSTANCE;
                SerializersModule serializersModule = companion.getSerializersModule();
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                emptyList = (List) companion.decodeFromString(new ArrayListSerializer(SerializersKt.serializer(serializersModule, (KType) null)), jsonString);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new e(jsonString), 4, (Object) null);
                emptyList = CollectionsKt.emptyList();
            }
            return emptyList;
        }
        return CollectionsKt.emptyList();
    }

    public final /* synthetic */ <T> Map<String, T> stringToMap(String string, String entryDelimiter, String keyValueDelimiter) {
        Object obj;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(entryDelimiter, "entryDelimiter");
        Intrinsics.checkNotNullParameter(keyValueDelimiter, "keyValueDelimiter");
        if (StringsKt.isBlank(string)) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            List split$default = StringsKt.split$default((CharSequence) string, new String[]{entryDelimiter}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            Iterator<T> it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t : arrayList) {
                if (((String) t).length() > 0) {
                    arrayList2.add(t);
                }
            }
            Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List split$default2 = StringsKt.split$default((CharSequence) it2.next(), new String[]{keyValueDelimiter}, false, 2, 2, (Object) null);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default2, 10));
                Iterator<T> it3 = split$default2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt.trim((CharSequence) it3.next()).toString());
                }
                ArrayList arrayList4 = arrayList3;
                String str = (String) arrayList4.get(0);
                String str2 = (String) arrayList4.get(1);
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                    obj = str2;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    Object intOrNull = StringsKt.toIntOrNull(str2);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    obj = intOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    Object longOrNull = StringsKt.toLongOrNull(str2);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    obj = longOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    Object doubleOrNull = StringsKt.toDoubleOrNull(str2);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    obj = doubleOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    Object floatOrNull = StringsKt.toFloatOrNull(str2);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    obj = floatOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    Object booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str2);
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    obj = booleanStrictOrNull;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    linkedHashMap.put(str, obj);
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new h(string), 4, (Object) null);
            return linkedHashMap;
        }
    }
}
