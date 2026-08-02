package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f719a;

    public j(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f719a = new n1(context, str, str2);
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String c(com.braze.models.k kVar) {
        return "Adding event to storage with uid " + ((com.braze.models.outgoing.event.b) kVar).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x036e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection b() {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        Object linkedHashMap2;
        Map emptyMap2;
        KSerializer MapSerializer2;
        DataStoreKey dataStoreKey;
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n1 n1Var = this.f719a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = n1Var.readData(dataStoreKey2, "");
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) i.f715a, 6, (Object) null);
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
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            final String str3 = (String) entry.getKey();
            final String str4 = (String) entry.getValue();
            try {
                com.braze.models.k e3 = com.braze.models.outgoing.event.b.g.e(str4, str3);
                if (e3 != null) {
                    linkedHashSet.add(e3);
                }
            } catch (Exception e4) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) e4, false, new Function0() { // from class: com.braze.storage.j$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.a(str4, str3);
                    }
                }, 4, (Object) null);
                n1 n1Var2 = this.f719a;
                DataStoreKey dataStoreKey3 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), priority, (Throwable) null, false, (Function0) new k0(dataStoreKey3), 12, (Object) null);
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    try {
                        Object readData2 = n1Var2.readData(dataStoreKey3, "");
                        Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.String");
                        String str5 = (String) readData2;
                        if (StringsKt.isBlank(str5)) {
                            linkedHashMap2 = new LinkedHashMap();
                        } else {
                            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                            if (StringsKt.isBlank(str5)) {
                                emptyMap2 = MapsKt.emptyMap();
                            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str5).toString(), AbstractJsonLexerKt.NULL)) {
                                emptyMap2 = MapsKt.emptyMap();
                            } else {
                                try {
                                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
                                    if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject2), BuiltinSerializersKt.serializer(stringCompanionObject2));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                                    } else {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, priority, (Throwable) null, false, (Function0) g.f706a, 6, (Object) null);
                                        emptyMap2 = MapsKt.emptyMap();
                                    }
                                    Object decodeFromString2 = Json.INSTANCE.decodeFromString(MapSerializer2, str5);
                                    Intrinsics.checkNotNull(decodeFromString2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    emptyMap2 = (Map) decodeFromString2;
                                } catch (Exception e5) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str5), 4, (Object) null);
                                    emptyMap2 = MapsKt.emptyMap();
                                }
                            }
                            Map mutableMap2 = MapsKt.toMutableMap(emptyMap2);
                            Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap2 = TypeIntrinsics.asMutableMap(mutableMap2);
                        }
                    } catch (Exception e6) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new l0(dataStoreKey3), 8, (Object) null);
                        linkedHashMap2 = new LinkedHashMap();
                        Object obj = linkedHashMap2;
                        TypeIntrinsics.asMutableMap(obj).remove(str3);
                        n1 n1Var3 = this.f719a;
                        dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                        if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
                        } else {
                            try {
                                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                                try {
                                    Json.Companion companion = Json.INSTANCE;
                                    companion.getSerializersModule();
                                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                                    str = companion.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), obj);
                                } catch (Exception e7) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e7, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                                    str = (!(obj instanceof Map) && (obj instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                                }
                                n1Var3.writeData(dataStoreKey, str);
                            } catch (Exception e8) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e8, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
                            }
                        }
                    }
                }
                Object obj2 = linkedHashMap2;
                TypeIntrinsics.asMutableMap(obj2).remove(str3);
                n1 n1Var32 = this.f719a;
                dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str, String str2) {
        return "Could not create BrazeEvent from [serialized event string=" + str + ", unique identifier=" + str2 + "] ... Deleting!";
    }

    public final void a(final com.braze.models.k event) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.j$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.c(com.braze.models.k.this);
            }
        }, 7, (Object) null);
        n1 n1Var = this.f719a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = n1Var.readData(dataStoreKey, "");
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
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) f.f701a, 6, (Object) null);
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
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) event;
        linkedHashMap.put(bVar.e(), bVar.a());
        n1 n1Var2 = this.f719a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = companion.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMap);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            n1Var2.writeData(dataStoreKey2, str);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x019d A[LOOP:0: B:6:0x0197->B:8:0x019d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Set events) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        KSerializer MapSerializer;
        Iterator it;
        DataStoreKey dataStoreKey;
        String str;
        Intrinsics.checkNotNullParameter(events, "events");
        n1 n1Var = this.f719a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = n1Var.readData(dataStoreKey2, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) h.f710a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e2) {
                                    e = e2;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    Map map = linkedHashMap;
                                    it = events.iterator();
                                    while (it.hasNext()) {
                                    }
                                    n1 n1Var2 = this.f719a;
                                    dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
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
                            Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                            Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                            Map map2 = linkedHashMap;
                            it = events.iterator();
                            while (it.hasNext()) {
                            }
                            n1 n1Var22 = this.f719a;
                            dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                            }
                        }
                    }
                    Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap22);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new l0(dataStoreKey2), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map map22 = linkedHashMap;
        it = events.iterator();
        while (it.hasNext()) {
            final String e5 = ((com.braze.models.outgoing.event.b) ((com.braze.models.k) it.next())).e();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.j$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.a(e5);
                }
            }, 7, (Object) null);
            map22.remove(e5);
        }
        n1 n1Var222 = this.f719a;
        dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = companion.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), map22);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(map22 instanceof Map) && (map22 instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            n1Var222.writeData(dataStoreKey, str);
        } catch (Exception e7) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e7, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String b(com.braze.models.k kVar) {
        return "Storage provider is closed. Not adding event: " + kVar;
    }

    public static final String b(Set set) {
        return "Storage provider is closed. Not deleting events: " + set;
    }

    public static final String a(String str) {
        return "Deleting event from storage with uid " + str;
    }
}
