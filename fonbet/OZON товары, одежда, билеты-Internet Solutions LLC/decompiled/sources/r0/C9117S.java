package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {195}, m = "consumeUntilUp")
/* renamed from: r0.S, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9117S extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f82498d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82499e;

    /* renamed from: f, reason: collision with root package name */
    int f82500f;

    C9117S(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82499e = obj;
        this.f82500f |= LinearLayoutManager.INVALID_OFFSET;
        return C9115P.a(null, this);
    }
}
