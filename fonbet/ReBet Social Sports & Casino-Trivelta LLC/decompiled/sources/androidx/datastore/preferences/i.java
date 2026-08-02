package androidx.datastore.preferences;

import L0.f;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f19400a = new LinkedHashSet();

    public static final class a extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f19401n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f19402o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f19403p;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K0.c cVar, L0.f fVar, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f19402o = cVar;
            aVar.f19403p = fVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19401n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            K0.c cVar = (K0.c) this.f19402o;
            L0.f fVar = (L0.f) this.f19403p;
            Set keySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            Map b10 = cVar.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : b10.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            L0.c d10 = fVar.d();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    d10.k(L0.i.a(str), value);
                } else if (value instanceof Float) {
                    d10.k(L0.i.d(str), value);
                } else if (value instanceof Integer) {
                    d10.k(L0.i.e(str), value);
                } else if (value instanceof Long) {
                    d10.k(L0.i.f(str), value);
                } else if (value instanceof String) {
                    d10.k(L0.i.g(str), value);
                } else if (value instanceof Set) {
                    f.a h10 = L0.i.h(str);
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    d10.k(h10, (Set) value);
                }
            }
            return d10.e();
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f19404n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f19405o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Set f19406p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, Continuation continuation) {
            super(2, continuation);
            this.f19406p = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f19406p, continuation);
            bVar.f19405o = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.f fVar, Continuation continuation) {
            return ((b) create(fVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19404n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Set keySet = ((L0.f) this.f19405o).a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f19406p != i.c()) {
                Set set = this.f19406p;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            return Boxing.boxBoolean(z10);
        }
    }

    public static final K0.a a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f19400a) {
            return new K0.a(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
        }
        return new K0.a(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null);
    }

    public static /* synthetic */ K0.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f19400a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f19400a;
    }

    public static final Function3 d() {
        return new a(null);
    }

    public static final Function2 e(Set set) {
        return new b(set, null);
    }
}
