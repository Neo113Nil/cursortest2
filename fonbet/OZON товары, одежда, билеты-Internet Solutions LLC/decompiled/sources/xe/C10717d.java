package xe;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll")
/* renamed from: xe.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10717d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object[] f105441d;

    /* renamed from: e, reason: collision with root package name */
    int f105442e;

    /* renamed from: f, reason: collision with root package name */
    int f105443f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f105444g;

    /* renamed from: h, reason: collision with root package name */
    int f105445h;

    C10717d(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105444g = obj;
        this.f105445h |= LinearLayoutManager.INVALID_OFFSET;
        return C10721f.d(null, this);
    }
}
