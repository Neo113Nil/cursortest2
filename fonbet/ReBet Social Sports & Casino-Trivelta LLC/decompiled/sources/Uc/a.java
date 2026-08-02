package Uc;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final com.swmansion.rnscreens.gamma.stack.screen.d f12152a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12153b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12154c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12155d;

    public /* synthetic */ a(com.swmansion.rnscreens.gamma.stack.screen.d dVar, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, z10, (i11 & 8) != 0 ? true : z11);
    }

    @Override // Uc.b
    public void a(FragmentManager fragmentManager, c executor) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.e(fragmentManager, this);
    }

    public final boolean b() {
        return this.f12154c;
    }

    public final boolean c() {
        return this.f12155d;
    }

    public final int d() {
        return this.f12153b;
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d e() {
        return this.f12152a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.swmansion.rnscreens.gamma.stack.screen.d fragment, int i10, boolean z10, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f12152a = fragment;
        this.f12153b = i10;
        this.f12154c = z10;
        this.f12155d = z11;
    }
}
