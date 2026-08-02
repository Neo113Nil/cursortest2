package Uc;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final com.swmansion.rnscreens.gamma.stack.screen.d f12159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.swmansion.rnscreens.gamma.stack.screen.d fragment) {
        super(null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f12159a = fragment;
    }

    @Override // Uc.b
    public void a(FragmentManager fragmentManager, c executor) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.h(fragmentManager, this);
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d b() {
        return this.f12159a;
    }
}
