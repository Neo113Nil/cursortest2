package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {61}, m = "scrollBy")
/* renamed from: r0.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9103D extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.J f82397d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82398e;

    /* renamed from: f, reason: collision with root package name */
    int f82399f;

    C9103D() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82398e = obj;
        this.f82399f |= LinearLayoutManager.INVALID_OFFSET;
        return C9105F.b(null, 0.0f, this);
    }
}
