package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
/* renamed from: r0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9139s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f82636d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82637e;

    /* renamed from: f, reason: collision with root package name */
    int f82638f;

    C9139s() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82637e = obj;
        this.f82638f |= LinearLayoutManager.INVALID_OFFSET;
        return C9140t.a(null, this);
    }
}
