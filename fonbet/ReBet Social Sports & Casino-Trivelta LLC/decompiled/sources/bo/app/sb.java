package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.C2995i;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.Y;
import di.Z0;
import ei.AbstractC4212b;
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

/* loaded from: classes.dex */
public final class sb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Wh.a f26048a;

    /* renamed from: b, reason: collision with root package name */
    public C2995i f26049b;

    /* renamed from: c, reason: collision with root package name */
    public String f26050c;

    /* renamed from: d, reason: collision with root package name */
    public int f26051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2995i f26052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f26053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(C2995i c2995i, String str, Continuation continuation) {
        super(2, continuation);
        this.f26052e = c2995i;
        this.f26053f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new sb(this.f26052e, this.f26053f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sb(this.f26052e, this.f26053f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ce A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:6:0x0039, B:8:0x0043, B:9:0x01c6, B:11:0x01ce, B:12:0x01d4, B:14:0x01e6, B:15:0x023f, B:21:0x01fe, B:23:0x0200, B:24:0x0223, B:29:0x0215, B:32:0x0229, B:35:0x0065, B:37:0x0079, B:38:0x0084, B:40:0x008c, B:41:0x019d, B:42:0x0092, B:44:0x00a2, B:46:0x00a8, B:49:0x00ba, B:50:0x0160, B:52:0x00cf, B:54:0x00db, B:55:0x00ed, B:57:0x00f9, B:58:0x010a, B:60:0x0116, B:61:0x0127, B:63:0x0133, B:64:0x0144, B:66:0x0150, B:69:0x016f, B:73:0x0188, B:81:0x01ab), top: B:5:0x0039, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01e6 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:6:0x0039, B:8:0x0043, B:9:0x01c6, B:11:0x01ce, B:12:0x01d4, B:14:0x01e6, B:15:0x023f, B:21:0x01fe, B:23:0x0200, B:24:0x0223, B:29:0x0215, B:32:0x0229, B:35:0x0065, B:37:0x0079, B:38:0x0084, B:40:0x008c, B:41:0x019d, B:42:0x0092, B:44:0x00a2, B:46:0x00a8, B:49:0x00ba, B:50:0x0160, B:52:0x00cf, B:54:0x00db, B:55:0x00ed, B:57:0x00f9, B:58:0x010a, B:60:0x0116, B:61:0x0127, B:63:0x0133, B:64:0x0144, B:66:0x0150, B:69:0x016f, B:73:0x0188, B:81:0x01ab), top: B:5:0x0039, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2995i c2995i;
        Wh.a aVar;
        String str;
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26051d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            c2995i = this.f26052e;
            aVar = c2995i.f29430a;
            str = this.f26053f;
            this.f26048a = aVar;
            this.f26049b = c2995i;
            this.f26050c = str;
            this.f26051d = 1;
            if (aVar.f(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = this.f26050c;
            c2995i = this.f26049b;
            aVar = this.f26048a;
            ResultKt.throwOnFailure(obj);
            str = str3;
        }
        try {
            DataStoreKey dataStoreKey2 = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = c2995i.readData(dataStoreKey2, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) readData;
                    if (StringsKt.isBlank(str4)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str4)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str4).toString(), "null")) {
                            emptyMap = MapsKt.emptyMap();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
                                try {
                                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        k10 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject), AbstractC2028a.H(stringCompanionObject));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                        k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                        k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                        k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                        k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                        k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                                    } else {
                                        dataStoreUtils = dataStoreUtils2;
                                        try {
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) rb.f25988a, 6, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                        } catch (Exception e10) {
                                            e = e10;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str4), 4, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                            Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                            Integer num = (Integer) linkedHashMap.get(str);
                                            linkedHashMap.put(str, Boxing.boxInt((num != null ? num.intValue() : 0) + 1));
                                            dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
                                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    Object d10 = AbstractC4212b.f46079d.d(k10, str4);
                                    Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    emptyMap = (Map) d10;
                                } catch (Exception e11) {
                                    exc = e11;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str4), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                    Integer num2 = (Integer) linkedHashMap.get(str);
                                    linkedHashMap.put(str, Boxing.boxInt((num2 != null ? num2.intValue() : 0) + 1));
                                    dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap22);
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            Integer num22 = (Integer) linkedHashMap.get(str);
            linkedHashMap.put(str, Boxing.boxInt((num22 != null ? num22.intValue() : 0) + 1));
            dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                        aVar2.a();
                        str2 = aVar2.b(new C4084d0(Z0.f45341a, Y.f45337a), linkedHashMap);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str2 = "{}";
                    }
                    c2995i.writeData(dataStoreKey, str2);
                } catch (Exception e15) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
                }
            }
            return Unit.INSTANCE;
        } finally {
            aVar.g(null);
        }
    }
}
