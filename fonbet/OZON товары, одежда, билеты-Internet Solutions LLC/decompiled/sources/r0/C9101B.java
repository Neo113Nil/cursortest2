package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
/* renamed from: r0.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9101B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.J f82387d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82388e;

    /* renamed from: f, reason: collision with root package name */
    int f82389f;

    C9101B() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82388e = obj;
        this.f82389f |= LinearLayoutManager.INVALID_OFFSET;
        return C9105F.a(null, 0.0f, null, this);
    }
}
