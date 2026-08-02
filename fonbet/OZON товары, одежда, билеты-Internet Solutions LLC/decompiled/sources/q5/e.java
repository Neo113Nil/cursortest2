package q5;

import androidx.recyclerview.widget.LinearLayoutManager;
import l5.C7873b;
import l5.InterfaceC7874c;
import org.jetbrains.annotations.NotNull;
import v5.C10234h;
import v5.C10239m;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
/* loaded from: classes8.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8986a f81662d;

    /* renamed from: e, reason: collision with root package name */
    C7873b f81663e;

    /* renamed from: f, reason: collision with root package name */
    C10234h f81664f;

    /* renamed from: g, reason: collision with root package name */
    Object f81665g;

    /* renamed from: h, reason: collision with root package name */
    C10239m f81666h;

    /* renamed from: i, reason: collision with root package name */
    InterfaceC7874c f81667i;

    /* renamed from: j, reason: collision with root package name */
    p5.h f81668j;

    /* renamed from: k, reason: collision with root package name */
    int f81669k;

    /* renamed from: l, reason: collision with root package name */
    /* synthetic */ Object f81670l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C8986a f81671m;

    /* renamed from: n, reason: collision with root package name */
    int f81672n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C8986a c8986a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f81671m = c8986a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        this.f81670l = obj;
        this.f81672n |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f81671m.f(null, null, null, null, null, this);
        return f7;
    }
}
