package dm0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.ipc.PushIPCClientImpl", f = "PushIPCClientImpl.kt", l = {33}, m = "registerForPushes-gIAlu-s")
/* renamed from: dm0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6217b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f61667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C6222g f61668e;

    /* renamed from: f, reason: collision with root package name */
    public int f61669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6217b(C6222g c6222g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61668e = c6222g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61667d = obj;
        this.f61669f |= LinearLayoutManager.INVALID_OFFSET;
        Object c11 = this.f61668e.c(null, this);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : r.a(c11);
    }
}
