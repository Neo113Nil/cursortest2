package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {357}, m = "reset")
/* renamed from: r0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9144x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9146z f82643d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82644e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9146z f82645f;

    /* renamed from: g, reason: collision with root package name */
    int f82646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9144x(C9146z c9146z, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f82645f = c9146z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82644e = obj;
        this.f82646g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f82645f.t(this);
    }
}
