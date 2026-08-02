package Ph;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Ph.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1449f {

    /* renamed from: Ph.f$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f9076n;

        /* renamed from: o, reason: collision with root package name */
        public int f9077o;

        /* renamed from: p, reason: collision with root package name */
        public int f9078p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f9079q;

        /* renamed from: r, reason: collision with root package name */
        public int f9080r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9079q = obj;
            this.f9080r |= Integer.MIN_VALUE;
            return AbstractC1449f.c(null, this);
        }
    }

    /* renamed from: Ph.f$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f9081n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f9082o;

        /* renamed from: p, reason: collision with root package name */
        public int f9083p;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9082o = obj;
            this.f9083p |= Integer.MIN_VALUE;
            return AbstractC1449f.b(null, this);
        }
    }

    public static final Object a(X[] xArr, Continuation continuation) {
        return xArr.length == 0 ? CollectionsKt.emptyList() : new C1447e(xArr).c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Collection collection, Continuation continuation) {
        b bVar;
        int i10;
        Iterator it;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f9083p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f9083p = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f9082o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f9083p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) bVar.f9081n;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    C0 c02 = (C0) it.next();
                    bVar.f9081n = it;
                    bVar.f9083p = 1;
                    if (c02.join(bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f9082o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f9083p;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C0[] c0Arr, Continuation continuation) {
        a aVar;
        int i10;
        int i11;
        C0[] c0Arr2;
        int length;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f9080r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f9080r = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f9079q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f9080r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    i11 = 0;
                    c0Arr2 = c0Arr;
                    length = c0Arr.length;
                    if (i11 < length) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = aVar.f9078p;
                    i11 = aVar.f9077o;
                    C0[] c0Arr3 = (C0[]) aVar.f9076n;
                    ResultKt.throwOnFailure(obj);
                    c0Arr2 = c0Arr3;
                    i11++;
                    if (i11 < length) {
                        C0 c02 = c0Arr2[i11];
                        aVar.f9076n = c0Arr2;
                        aVar.f9077o = i11;
                        aVar.f9078p = length;
                        aVar.f9080r = 1;
                        if (c02.join(aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i11++;
                        if (i11 < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f9079q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f9080r;
        if (i10 != 0) {
        }
    }
}
