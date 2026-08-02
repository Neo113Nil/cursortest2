package Y2;

import Q2.AbstractC1508t;
import R2.C1543t;
import R2.C1549z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1543t f13909a;

    /* renamed from: b, reason: collision with root package name */
    public final C1549z f13910b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13912d;

    public E(C1543t processor, C1549z token, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f13909a = processor;
        this.f13910b = token;
        this.f13911c = z10;
        this.f13912d = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean s10 = this.f13911c ? this.f13909a.s(this.f13910b, this.f13912d) : this.f13909a.t(this.f13910b, this.f13912d);
        AbstractC1508t.e().a(AbstractC1508t.i("StopWorkRunnable"), "StopWorkRunnable for " + this.f13910b.a().b() + "; Processor.stopWork = " + s10);
    }
}
