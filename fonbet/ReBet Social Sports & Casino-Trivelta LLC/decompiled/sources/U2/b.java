package U2;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f12020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(V2.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f12020b = 6;
    }

    @Override // U2.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.i();
    }

    @Override // U2.a
    public int e() {
        return this.f12020b;
    }

    @Override // U2.a
    public /* bridge */ /* synthetic */ boolean f(Object obj) {
        return g(((Boolean) obj).booleanValue());
    }

    public boolean g(boolean z10) {
        return !z10;
    }
}
