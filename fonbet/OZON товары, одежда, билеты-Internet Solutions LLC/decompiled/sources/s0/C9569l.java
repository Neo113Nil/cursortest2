package s0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.J;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {334}, m = "animateDecay")
/* renamed from: s0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9569l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    float f98069d;

    /* renamed from: e, reason: collision with root package name */
    C8006o f98070e;

    /* renamed from: f, reason: collision with root package name */
    J f98071f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f98072g;

    /* renamed from: h, reason: collision with root package name */
    int f98073h;

    C9569l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98072g = obj;
        this.f98073h |= LinearLayoutManager.INVALID_OFFSET;
        return C9573p.a(null, 0.0f, null, null, null, this);
    }
}
