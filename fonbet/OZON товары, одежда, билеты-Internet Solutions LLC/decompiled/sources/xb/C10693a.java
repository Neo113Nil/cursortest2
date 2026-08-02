package xb;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "com.vk.push.core.network.data.source.MasterHostApi", f = "MasterHostApi.kt", l = {55}, m = "getHostList-gIAlu-s")
/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10693a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f105255d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10695c f105256e;

    /* renamed from: f, reason: collision with root package name */
    int f105257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10693a(C10695c c10695c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f105256e = c10695c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105255d = obj;
        this.f105257f |= LinearLayoutManager.INVALID_OFFSET;
        Object c11 = this.f105256e.c(null, this);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : r.a(c11);
    }
}
