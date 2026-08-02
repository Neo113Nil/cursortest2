package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class i1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f717a;
    public j1 b;
    public String c;
    public long d;
    public int e;
    public final /* synthetic */ j1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.f = j1Var;
        this.g = str;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i1(this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01df A[Catch: all -> 0x023f, TRY_LEAVE, TryCatch #6 {all -> 0x023f, blocks: (B:6:0x0044, B:8:0x004e, B:9:0x01ce, B:11:0x01df, B:12:0x0239, B:18:0x01f7, B:20:0x01f9, B:21:0x021d, B:26:0x020e, B:29:0x0223, B:31:0x006d, B:33:0x0081, B:34:0x0088, B:36:0x0090, B:37:0x01a2, B:38:0x0096, B:40:0x00a6, B:42:0x00ac, B:45:0x00be, B:46:0x0164, B:48:0x00d3, B:50:0x00df, B:51:0x00f1, B:53:0x00fd, B:54:0x010e, B:56:0x011a, B:57:0x012b, B:59:0x0137, B:60:0x0148, B:62:0x0154, B:65:0x0173, B:69:0x018c, B:77:0x01b2), top: B:5:0x0044, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        j1 j1Var;
        String str;
        long j;
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.f.f721a;
            j1Var = this.f;
            str = this.g;
            j = this.h;
            this.f717a = mutex;
            this.b = j1Var;
            this.c = str;
            this.d = j;
            this.e = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.d;
            String str3 = this.c;
            j1Var = this.b;
            mutex = this.f717a;
            ResultKt.throwOnFailure(obj);
            j = j2;
            str = str3;
        }
        try {
            DataStoreKey dataStoreKey2 = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = j1Var.readData(dataStoreKey2, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) readData;
                    if (StringsKt.isBlank(str4)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str4)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str4).toString(), AbstractJsonLexerKt.NULL)) {
                            emptyMap = MapsKt.emptyMap();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) h1.f712a, 6, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str4), 4, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                            Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                            linkedHashMap.put(str, Boxing.boxLong(j));
                                            dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
                                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str4);
                                    Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    emptyMap = (Map) decodeFromString;
                                } catch (Exception e2) {
                                    exc = e2;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str4), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                    linkedHashMap.put(str, Boxing.boxLong(j));
                                    dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                dataStoreUtils = dataStoreUtils2;
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
            linkedHashMap.put(str, Boxing.boxLong(j));
            dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str2 = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), linkedHashMap);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str2 = "{}";
                    }
                    j1Var.writeData(dataStoreKey, str2);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
