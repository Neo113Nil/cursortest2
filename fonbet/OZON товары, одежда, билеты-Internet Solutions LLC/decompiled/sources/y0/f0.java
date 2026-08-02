package y0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {383}, m = "performFling")
/* loaded from: classes8.dex */
final class f0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f105808d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h0 f105809e;

    /* renamed from: f, reason: collision with root package name */
    int f105810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(h0 h0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f105809e = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105808d = obj;
        this.f105810f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f105809e.a(null, 0.0f, this);
    }
}
