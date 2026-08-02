package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
/* renamed from: r0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9119U extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f82521d;

    /* renamed from: e, reason: collision with root package name */
    EnumC10640o f82522e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f82523f;

    /* renamed from: g, reason: collision with root package name */
    int f82524g;

    C9119U() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82523f = obj;
        this.f82524g |= LinearLayoutManager.INVALID_OFFSET;
        return C9115P.h(null, null, this);
    }
}
