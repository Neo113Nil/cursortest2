package m0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {566, 2186}, m = "waitForComposition")
/* renamed from: m0.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8003m0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C7989f0 f73822d;

    /* renamed from: e, reason: collision with root package name */
    Object f73823e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f73824f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7989f0<Object> f73825g;

    /* renamed from: h, reason: collision with root package name */
    int f73826h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8003m0(C7989f0 c7989f0, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f73825g = c7989f0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f73824f = obj;
        this.f73826h |= LinearLayoutManager.INVALID_OFFSET;
        return C7989f0.x(this.f73825g, this);
    }
}
