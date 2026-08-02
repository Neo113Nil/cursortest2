package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {769}, m = "doFlingAnimation-QWom1Mo")
/* renamed from: r0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9111L extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.L f82407d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82408e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9113N f82409f;

    /* renamed from: g, reason: collision with root package name */
    int f82410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9111L(C9113N c9113n, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f82409f = c9113n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82408e = obj;
        this.f82410g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f82409f.n(0L, this);
    }
}
