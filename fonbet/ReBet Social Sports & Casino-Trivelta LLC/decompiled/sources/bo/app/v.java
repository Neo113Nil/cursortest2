package bo.app;

import L0.f;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList, long j10, Continuation continuation) {
        super(2, continuation);
        this.f26132b = arrayList;
        this.f26133c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.f26132b, this.f26133c, continuation);
        vVar.f26131a = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((L0.c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0159 A[LOOP:0: B:9:0x0157->B:10:0x0159, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        Map mutableMap;
        Map map;
        int size;
        int i10;
        String str;
        L0.c cVar = (L0.c) this.f26131a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        f.a g10 = L0.i.g(DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT.getKey());
        String str2 = (String) cVar.c(g10);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        if (StringsKt.isBlank(str3)) {
            mutableMap = new LinkedHashMap();
        } else {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            if (StringsKt.isBlank(str3)) {
                emptyMap = MapsKt.emptyMap();
            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), "null")) {
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
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) u.f26092a, 6, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                        } catch (Exception e11) {
                            e = e11;
                            exc = e;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                            mutableMap = MapsKt.toMutableMap(emptyMap);
                            map = mutableMap;
                            ArrayList arrayList = this.f26132b;
                            long j10 = this.f26133c;
                            size = arrayList.size();
                            i10 = 0;
                            while (i10 < size) {
                            }
                            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
                            cVar.k(g10, str);
                            return Unit.INSTANCE;
                        }
                    }
                    Object d10 = AbstractC4212b.f46079d.d(k10, str3);
                    Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                    emptyMap = (Map) d10;
                } catch (Exception e12) {
                    exc = e12;
                    dataStoreUtils = dataStoreUtils2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                    emptyMap = MapsKt.emptyMap();
                    mutableMap = MapsKt.toMutableMap(emptyMap);
                    map = mutableMap;
                    ArrayList arrayList2 = this.f26132b;
                    long j102 = this.f26133c;
                    size = arrayList2.size();
                    i10 = 0;
                    while (i10 < size) {
                    }
                    DataStoreUtils dataStoreUtils32 = DataStoreUtils.INSTANCE;
                    AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                    aVar2.a();
                    str = aVar2.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
                    cVar.k(g10, str);
                    return Unit.INSTANCE;
                }
            }
            mutableMap = MapsKt.toMutableMap(emptyMap);
        }
        map = mutableMap;
        ArrayList arrayList22 = this.f26132b;
        long j1022 = this.f26133c;
        size = arrayList22.size();
        i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList22.get(i10);
            i10++;
            map.put((String) obj2, Boxing.boxLong(j1022));
        }
        DataStoreUtils dataStoreUtils322 = DataStoreUtils.INSTANCE;
        try {
            AbstractC4212b.a aVar22 = AbstractC4212b.f46079d;
            aVar22.a();
            str = aVar22.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils322, BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
            str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
        }
        cVar.k(g10, str);
        return Unit.INSTANCE;
    }
}
