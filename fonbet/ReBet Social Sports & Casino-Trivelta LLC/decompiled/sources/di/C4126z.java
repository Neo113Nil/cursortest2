package di;

import Zh.InterfaceC1901b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* renamed from: di.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4126z implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f45440a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f45441b;

    public C4126z(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f45440a = compute;
        this.f45441b = new ConcurrentHashMap();
    }

    @Override // di.C0
    public Object a(KClass key, List types) {
        ConcurrentHashMap concurrentHashMap;
        Object m147constructorimpl;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap2 = this.f45441b;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap2.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, (obj = new B0()))) != null) {
            obj = putIfAbsent;
        }
        B0 b02 = (B0) obj;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4078a0((KType) it.next()));
        }
        concurrentHashMap = b02.f45282a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl((InterfaceC1901b) this.f45440a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Result m146boximpl = Result.m146boximpl(m147constructorimpl);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, m146boximpl);
            obj2 = putIfAbsent2 == null ? m146boximpl : putIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).getValue();
    }
}
