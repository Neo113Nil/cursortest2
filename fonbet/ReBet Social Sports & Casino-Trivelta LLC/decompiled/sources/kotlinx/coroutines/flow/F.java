package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class F extends kotlinx.coroutines.flow.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public long f54631a = -1;

    /* renamed from: b, reason: collision with root package name */
    public Continuation f54632b;

    @Override // kotlinx.coroutines.flow.internal.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(D d10) {
        if (this.f54631a >= 0) {
            return false;
        }
        this.f54631a = d10.X();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation[] b(D d10) {
        long j10 = this.f54631a;
        this.f54631a = -1L;
        this.f54632b = null;
        return d10.W(j10);
    }
}
