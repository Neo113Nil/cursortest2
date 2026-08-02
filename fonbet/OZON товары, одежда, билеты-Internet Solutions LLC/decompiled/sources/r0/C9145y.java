package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
/* renamed from: r0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9145y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9146z f82647d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82648e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9146z f82649f;

    /* renamed from: g, reason: collision with root package name */
    int f82650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9145y(C9146z c9146z, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f82649f = c9146z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82648e = obj;
        this.f82650g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f82649f.M0(this);
    }
}
