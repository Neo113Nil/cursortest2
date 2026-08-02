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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* renamed from: di.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4116u implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f45423a;

    /* renamed from: b, reason: collision with root package name */
    public final C4118v f45424b;

    /* renamed from: di.u$a */
    public static final class a implements Function0 {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new B0();
        }
    }

    public C4116u(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f45423a = compute;
        this.f45424b = new C4118v();
    }

    @Override // di.C0
    public Object a(KClass key, List types) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = this.f45424b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C4106o0 c4106o0 = (C4106o0) obj;
        Object obj2 = c4106o0.f45400a.get();
        if (obj2 == null) {
            obj2 = c4106o0.a(new a());
        }
        B0 b02 = (B0) obj2;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4078a0((KType) it.next()));
        }
        concurrentHashMap = b02.f45282a;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl((InterfaceC1901b) this.f45423a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Result m146boximpl = Result.m146boximpl(m147constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m146boximpl);
            obj3 = putIfAbsent == null ? m146boximpl : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return ((Result) obj3).getValue();
    }
}
