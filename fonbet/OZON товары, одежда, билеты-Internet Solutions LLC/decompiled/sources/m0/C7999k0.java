package m0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {370, 373}, m = "runAnimations")
/* renamed from: m0.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7999k0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C7989f0 f73789d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f73790e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7989f0<Object> f73791f;

    /* renamed from: g, reason: collision with root package name */
    int f73792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7999k0(C7989f0 c7989f0, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f73791f = c7989f0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f73790e = obj;
        this.f73792g |= LinearLayoutManager.INVALID_OFFSET;
        return C7989f0.s(this.f73791f, this);
    }
}
