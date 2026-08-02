package q5;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import v5.C10234h;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {122, 126, 144}, m = "execute")
/* renamed from: q5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8988c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8986a f81643d;

    /* renamed from: e, reason: collision with root package name */
    C10234h f81644e;

    /* renamed from: f, reason: collision with root package name */
    Object f81645f;

    /* renamed from: g, reason: collision with root package name */
    Object f81646g;

    /* renamed from: h, reason: collision with root package name */
    M f81647h;

    /* renamed from: i, reason: collision with root package name */
    M f81648i;

    /* renamed from: j, reason: collision with root package name */
    M f81649j;

    /* renamed from: k, reason: collision with root package name */
    M f81650k;

    /* renamed from: l, reason: collision with root package name */
    /* synthetic */ Object f81651l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C8986a f81652m;

    /* renamed from: n, reason: collision with root package name */
    int f81653n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8988c(C8986a c8986a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f81652m = c8986a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f81651l = obj;
        this.f81653n |= LinearLayoutManager.INVALID_OFFSET;
        return C8986a.c(this.f81652m, null, null, null, null, this);
    }
}
