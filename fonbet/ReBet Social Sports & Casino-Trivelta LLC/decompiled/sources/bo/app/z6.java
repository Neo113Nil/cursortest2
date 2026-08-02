package bo.app;

import Ph.P;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.C2991e;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4096j0;
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
public final class z6 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Wh.a f26347a;

    /* renamed from: b, reason: collision with root package name */
    public C2991e f26348b;

    /* renamed from: c, reason: collision with root package name */
    public String f26349c;

    /* renamed from: d, reason: collision with root package name */
    public long f26350d;

    /* renamed from: e, reason: collision with root package name */
    public int f26351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2991e f26352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f26353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f26354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(C2991e c2991e, String str, long j10, Continuation continuation) {
        super(2, continuation);
        this.f26352f = c2991e;
        this.f26353g = str;
        this.f26354h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z6(this.f26352f, this.f26353g, this.f26354h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z6) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01e1 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #4 {all -> 0x0069, blocks: (B:6:0x0040, B:8:0x004a, B:9:0x01d0, B:11:0x01e1, B:12:0x023a, B:18:0x01f9, B:20:0x01fb, B:21:0x021e, B:26:0x0210, B:29:0x0224, B:31:0x006c, B:33:0x0080, B:34:0x008b, B:36:0x0093, B:37:0x01a6, B:38:0x0099, B:40:0x00a9, B:42:0x00af, B:45:0x00c1, B:46:0x0167, B:48:0x00d6, B:50:0x00e2, B:51:0x00f4, B:53:0x0100, B:54:0x0111, B:56:0x011d, B:57:0x012e, B:59:0x013a, B:60:0x014b, B:62:0x0157, B:65:0x0176, B:69:0x0190, B:77:0x01b4), top: B:5:0x0040, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2991e c2991e;
        Wh.a aVar;
        String str;
        long j10;
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26351e;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            c2991e = this.f26352f;
            aVar = c2991e.f29418a;
            str = this.f26353g;
            j10 = this.f26354h;
            this.f26347a = aVar;
            this.f26348b = c2991e;
            this.f26349c = str;
            this.f26350d = j10;
            this.f26351e = 1;
            if (aVar.f(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j11 = this.f26350d;
            String str3 = this.f26349c;
            c2991e = this.f26348b;
            aVar = this.f26347a;
            ResultKt.throwOnFailure(obj);
            j10 = j11;
            str = str3;
        }
        try {
            DataStoreKey dataStoreKey2 = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = c2991e.readData(dataStoreKey2, "");
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
                                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                            } catch (Exception e10) {
                                e = e10;
                                dataStoreUtils = dataStoreUtils2;
                            }
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) y6.f26319a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e11) {
                                        e = e11;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str4), 4, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                        linkedHashMap.put(str, Boxing.boxLong(j10));
                                        dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
                                        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                Object d10 = AbstractC4212b.f46079d.d(k10, str4);
                                Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) d10;
                            } catch (Exception e12) {
                                exc = e12;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str4), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                linkedHashMap.put(str, Boxing.boxLong(j10));
                                dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
                                if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                }
                                return Unit.INSTANCE;
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
            linkedHashMap.put(str, Boxing.boxLong(j10));
            dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                        aVar2.a();
                        str2 = aVar2.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), linkedHashMap);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str2 = "{}";
                    }
                    c2991e.writeData(dataStoreKey, str2);
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
