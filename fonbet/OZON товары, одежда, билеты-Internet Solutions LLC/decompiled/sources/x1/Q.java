package x1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.S;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {753}, m = "withTimeoutOrNull")
/* loaded from: classes8.dex */
final class Q<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f104843d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ S.a<Object> f104844e;

    /* renamed from: f, reason: collision with root package name */
    int f104845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(S.a aVar, kotlin.coroutines.jvm.internal.a aVar2) {
        super(aVar2);
        this.f104844e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104843d = obj;
        this.f104845f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f104844e.J0(0L, null, this);
    }
}
