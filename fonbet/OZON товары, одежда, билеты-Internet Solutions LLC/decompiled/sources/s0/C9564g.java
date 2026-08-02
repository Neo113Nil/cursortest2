package s0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {123}, m = "fling")
/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9564g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function1 f98045d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f98046e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9568k f98047f;

    /* renamed from: g, reason: collision with root package name */
    int f98048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9564g(C9568k c9568k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f98047f = c9568k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object h11;
        this.f98046e = obj;
        this.f98048g |= LinearLayoutManager.INVALID_OFFSET;
        h11 = this.f98047f.h(null, 0.0f, null, this);
        return h11;
    }
}
