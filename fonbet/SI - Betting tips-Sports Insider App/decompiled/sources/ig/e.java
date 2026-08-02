package ig;

import eg.c0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f11248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11249b;

    /* renamed from: c, reason: collision with root package name */
    public final gg.a f11250c;

    public e(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        this.f11248a = coroutineContext;
        this.f11249b = i5;
        this.f11250c = aVar;
    }

    @Override // hg.g
    public Object a(hg.h hVar, Continuation continuation) {
        Object i5 = c0.i(new androidx.lifecycle.o(hVar, this, (Continuation) null, 15), continuation);
        return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
    }

    @Override // ig.r
    public final hg.g c(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        CoroutineContext coroutineContext2 = this.f11248a;
        CoroutineContext t3 = coroutineContext.t(coroutineContext2);
        gg.a aVar2 = gg.a.f10048a;
        gg.a aVar3 = this.f11250c;
        int i10 = this.f11249b;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i5 != -3) {
                    if (i10 != -2) {
                        if (i5 != -2) {
                            i5 += i10;
                            if (i5 < 0) {
                                i5 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i5 = i10;
            }
            aVar = aVar3;
        }
        return (Intrinsics.areEqual(t3, coroutineContext2) && i5 == i10 && aVar == aVar3) ? this : e(t3, i5, aVar);
    }

    public abstract Object d(gg.w wVar, Continuation continuation);

    public abstract e e(CoroutineContext coroutineContext, int i5, gg.a aVar);

    public hg.g f() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
        CoroutineContext coroutineContext = this.f11248a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i5 = this.f11249b;
        if (i5 != -3) {
            arrayList.add("capacity=" + i5);
        }
        gg.a aVar = gg.a.f10048a;
        gg.a aVar2 = this.f11250c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return d9.e.k(sb2, CollectionsKt.J(arrayList, ", ", null, null, null, 62), ']');
    }
}
