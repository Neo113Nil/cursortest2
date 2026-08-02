package s0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {110}, m = "performFling")
/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9566i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f98059d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9568k f98060e;

    /* renamed from: f, reason: collision with root package name */
    int f98061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9566i(C9568k c9568k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f98060e = c9568k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98059d = obj;
        this.f98061f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f98060e.b(null, 0.0f, null, this);
    }
}
