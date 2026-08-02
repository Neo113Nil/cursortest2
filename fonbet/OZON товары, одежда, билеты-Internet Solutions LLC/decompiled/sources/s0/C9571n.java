package s0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.J;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {379}, m = "animateWithTarget")
/* renamed from: s0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9571n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    float f98078d;

    /* renamed from: e, reason: collision with root package name */
    float f98079e;

    /* renamed from: f, reason: collision with root package name */
    C8006o f98080f;

    /* renamed from: g, reason: collision with root package name */
    J f98081g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f98082h;

    /* renamed from: i, reason: collision with root package name */
    int f98083i;

    C9571n() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98082h = obj;
        this.f98083i |= LinearLayoutManager.INVALID_OFFSET;
        return C9573p.b(null, 0.0f, 0.0f, null, null, null, this);
    }
}
