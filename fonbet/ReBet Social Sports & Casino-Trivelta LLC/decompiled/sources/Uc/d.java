package Uc;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f12156a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12157b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Runnable onCommitCallback, boolean z10, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(onCommitCallback, "onCommitCallback");
        this.f12156a = onCommitCallback;
        this.f12157b = z10;
        this.f12158c = z11;
    }

    @Override // Uc.b
    public void a(FragmentManager fragmentManager, c executor) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.f(fragmentManager, this);
    }

    public final boolean b() {
        return this.f12157b;
    }

    public final boolean c() {
        return this.f12158c;
    }

    public final Runnable d() {
        return this.f12156a;
    }
}
