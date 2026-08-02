package x1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.S;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {782}, m = "withTimeout")
/* loaded from: classes.dex */
final class O<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f104836d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f104837e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ S.a<Object> f104838f;

    /* renamed from: g, reason: collision with root package name */
    int f104839g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(S.a aVar, kotlin.coroutines.jvm.internal.a aVar2) {
        super(aVar2);
        this.f104838f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104837e = obj;
        this.f104839g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f104838f.k1(0L, null, this);
    }
}
