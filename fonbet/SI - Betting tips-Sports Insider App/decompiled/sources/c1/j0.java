package c1;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final hg.d1 f3414a;

    public j0() {
        d1 d1Var = d1.f3359b;
        Intrinsics.checkNotNull(d1Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f3414a = hg.u0.b(d1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(k2.g0 g0Var, mf.c cVar) {
        k2.n nVar;
        int i5;
        if (cVar instanceof k2.n) {
            nVar = (k2.n) cVar;
            int i10 = nVar.f18726c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f18726c = i10 - Integer.MIN_VALUE;
                Object obj = nVar.f18724a;
                lf.a aVar = lf.a.f20034a;
                i5 = nVar.f18726c;
                if (i5 == 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                nVar.f18726c = 1;
                this.f3414a.a(g0Var, nVar);
                return;
            }
        }
        nVar = new k2.n(this, cVar);
        Object obj2 = nVar.f18724a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = nVar.f18726c;
        if (i5 == 0) {
        }
    }

    public c1 b() {
        return (c1) this.f3414a.getValue();
    }

    public void c(Set tableIds) {
        hg.d1 d1Var;
        Object value;
        int[] iArr;
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            d1Var = this.f3414a;
            value = d1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = tableIds.contains(Integer.valueOf(i5)) ? iArr2[i5] + 1 : iArr2[i5];
            }
            com.android.billingclient.api.a aVar = ig.c.f11245b;
            if (value == null) {
                value = aVar;
            }
        } while (!d1Var.k(value, iArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r6.f3348a > ((c1.d) r2).f3348a) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(c1 newState) {
        hg.d1 d1Var;
        Object value;
        Object obj;
        Intrinsics.checkNotNullParameter(newState, "newState");
        do {
            d1Var = this.f3414a;
            value = d1Var.getValue();
            obj = (c1) value;
            if (!(obj instanceof w0) && !Intrinsics.areEqual(obj, d1.f3359b)) {
                if (!(obj instanceof d)) {
                    if (!(obj instanceof s0)) {
                        if (!(obj instanceof v0)) {
                            throw new gf.m();
                        }
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                }
                Object obj2 = ig.c.f11245b;
                if (value == null) {
                    value = obj2;
                }
                if (obj == null) {
                    obj = obj2;
                }
            }
            obj = newState;
            Object obj22 = ig.c.f11245b;
            if (value == null) {
            }
            if (obj == null) {
            }
        } while (!d1Var.k(value, obj));
    }

    public j0(int i5) {
        this.f3414a = hg.u0.b(new int[i5]);
    }
}
