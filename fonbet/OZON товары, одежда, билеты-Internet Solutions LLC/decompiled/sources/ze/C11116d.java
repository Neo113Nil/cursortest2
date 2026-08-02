package ze;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
/* renamed from: ze.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C11116d<E> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f108917d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11115c<E> f108918e;

    /* renamed from: f, reason: collision with root package name */
    int f108919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11116d(C11115c c11115c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f108918e = c11115c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f108917d = obj;
        this.f108919f |= LinearLayoutManager.INVALID_OFFSET;
        Object O11 = C11115c.O(this.f108918e, this);
        return O11 == Wc.a.COROUTINE_SUSPENDED ? O11 : l.b(O11);
    }
}
