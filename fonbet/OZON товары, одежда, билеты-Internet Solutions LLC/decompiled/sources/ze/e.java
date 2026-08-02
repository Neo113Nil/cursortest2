package ze;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f108920d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11115c<Object> f108921e;

    /* renamed from: f, reason: collision with root package name */
    int f108922f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C11115c c11115c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f108921e = c11115c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object P11;
        this.f108920d = obj;
        this.f108922f |= LinearLayoutManager.INVALID_OFFSET;
        P11 = this.f108921e.P(null, 0, 0L, this);
        return P11 == Wc.a.COROUTINE_SUSPENDED ? P11 : l.b(P11);
    }
}
