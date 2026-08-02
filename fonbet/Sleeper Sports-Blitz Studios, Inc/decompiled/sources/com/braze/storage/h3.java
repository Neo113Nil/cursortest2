package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final d3 f714a;

    public h3(Context context, String userId, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f714a = new d3(context, userId, apiKey);
    }

    public static final String a() {
        return "No stored open session in storage.";
    }

    public static final String b() {
        return "Could not create new mutable session for open session.";
    }

    public static final String d() {
        return "Failed to set end time to now for session json data";
    }

    public final com.braze.models.p c() {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        String str = "";
        d3 d3Var = this.f714a;
        DataStoreKey dataStoreKey = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (!d3Var.contains(dataStoreKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.h3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h3.a();
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            String readString = this.f714a.readString(dataStoreKey, "");
            d3 d3Var2 = this.f714a;
            DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = d3Var2.readData(dataStoreKey2, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) readData;
                    if (StringsKt.isBlank(str2)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str2)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                            emptyMap = MapsKt.emptyMap();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) f3.f705a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                }
                                Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str2);
                                Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) decodeFromString;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            }
                        }
                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new l0(dataStoreKey2), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            String str3 = (String) linkedHashMap.get(readString);
            if (str3 != null) {
                str = str3;
            }
            return new com.braze.models.p(new JSONObject(str));
        } catch (JSONException e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.storage.h3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h3.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final void a(com.braze.models.p session) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        String str;
        Intrinsics.checkNotNullParameter(session, "session");
        String qVar = session.f().toString();
        JSONObject jsonKey = session.getJsonKey();
        a(jsonKey);
        d3 d3Var = this.f714a;
        DataStoreKey dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = d3Var.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyMap = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) g3.f709a, 6, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            }
                            Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str2);
                            Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) decodeFromString;
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                        }
                    }
                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map mutableMap2 = MapsKt.toMutableMap(linkedHashMap);
        mutableMap2.put(qVar, jsonKey.toString());
        d3 d3Var2 = this.f714a;
        DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    str = companion.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), mutableMap2);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = "{}";
                }
                d3Var2.writeData(dataStoreKey2, str);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
            }
        }
        if (!session.h()) {
            this.f714a.writeData(DataStoreKey.CURRENT_OPEN_SESSION_ID, qVar);
            return;
        }
        d3 d3Var3 = this.f714a;
        DataStoreKey dataStoreKey3 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (Intrinsics.areEqual(d3Var3.readString(dataStoreKey3, ""), qVar)) {
            this.f714a.clearData(dataStoreKey3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String sessionId) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        KSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str;
        d3 d3Var;
        DataStoreKey dataStoreKey2;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        d3 d3Var2 = this.f714a;
        DataStoreKey dataStoreKey3 = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey3), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = d3Var2.readData(dataStoreKey3, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyMap = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                        } catch (Exception e) {
                            e = e;
                            dataStoreUtils = dataStoreUtils2;
                        }
                        try {
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                            } else {
                                dataStoreUtils = dataStoreUtils2;
                                try {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) e3.f700a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e2) {
                                    e = e2;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    Map mutableMap2 = MapsKt.toMutableMap(linkedHashMap);
                                    mutableMap2.remove(sessionId);
                                    d3 d3Var3 = this.f714a;
                                    dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                    d3Var = this.f714a;
                                    dataStoreKey2 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
                                    if (Intrinsics.areEqual(sessionId, d3Var.readString(dataStoreKey2, null))) {
                                    }
                                }
                            }
                            Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str2);
                            Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) decodeFromString;
                        } catch (Exception e3) {
                            exc = e3;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                            Map mutableMap3 = MapsKt.toMutableMap(emptyMap);
                            Intrinsics.checkNotNull(mutableMap3, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap3);
                            Map mutableMap22 = MapsKt.toMutableMap(linkedHashMap);
                            mutableMap22.remove(sessionId);
                            d3 d3Var32 = this.f714a;
                            dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                            }
                            d3Var = this.f714a;
                            dataStoreKey2 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
                            if (Intrinsics.areEqual(sessionId, d3Var.readString(dataStoreKey2, null))) {
                            }
                        }
                    }
                    Map mutableMap32 = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap32, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap32);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new l0(dataStoreKey3), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map mutableMap222 = MapsKt.toMutableMap(linkedHashMap);
        mutableMap222.remove(sessionId);
        d3 d3Var322 = this.f714a;
        dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    str = companion.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), mutableMap222);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = "{}";
                }
                d3Var322.writeData(dataStoreKey, str);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
            }
        }
        d3Var = this.f714a;
        dataStoreKey2 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (Intrinsics.areEqual(sessionId, d3Var.readString(dataStoreKey2, null))) {
            this.f714a.clearData(dataStoreKey2);
        }
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (jsonObject.has(SDKConstants.PARAM_TOURNAMENTS_END_TIME)) {
            return;
        }
        try {
            jsonObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, DateTimeUtils.nowInSecondsPrecise());
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.h3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h3.d();
                }
            }, 4, (Object) null);
        }
    }
}
