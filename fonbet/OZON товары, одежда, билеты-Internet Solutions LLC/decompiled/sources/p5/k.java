package p5;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
/* loaded from: classes8.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f80242d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f80243e;

    /* renamed from: f, reason: collision with root package name */
    int f80244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f80243e = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object c11;
        this.f80242d = obj;
        this.f80244f |= LinearLayoutManager.INVALID_OFFSET;
        c11 = this.f80243e.c(null, this);
        return c11;
    }
}
