package s0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {187}, m = "tryApproach")
/* renamed from: s0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9567j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f98062d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9568k f98063e;

    /* renamed from: f, reason: collision with root package name */
    int f98064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9567j(C9568k c9568k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f98063e = c9568k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98062d = obj;
        this.f98064f |= LinearLayoutManager.INVALID_OFFSET;
        return C9568k.g(this.f98063e, null, 0.0f, 0.0f, null, this);
    }
}
