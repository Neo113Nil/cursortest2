package I0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.N;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.y f5255a;

    public l() {
        H h10 = H.f5075b;
        Intrinsics.checkNotNull(h10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f5255a = N.a(h10);
    }

    public final D a() {
        return (D) this.f5255a.getValue();
    }

    public final InterfaceC5321f b() {
        return this.f5255a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.a() > r2.a()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D c(D newState) {
        Object value;
        D d10;
        Intrinsics.checkNotNullParameter(newState, "newState");
        kotlinx.coroutines.flow.y yVar = this.f5255a;
        do {
            value = yVar.getValue();
            d10 = (D) value;
            if (!(d10 instanceof x ? true : Intrinsics.areEqual(d10, H.f5075b))) {
                if (!(d10 instanceof C1341f)) {
                    if (!(d10 instanceof r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            d10 = newState;
        } while (!yVar.d(value, d10));
        return d10;
    }
}
