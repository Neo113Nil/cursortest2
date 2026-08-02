package wc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl", f = "ActionAuthRepositoryImpl.kt", l = {142, 145}, m = "withTracking")
/* renamed from: wc0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10508i<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10503d f104163d;

    /* renamed from: e, reason: collision with root package name */
    String f104164e;

    /* renamed from: f, reason: collision with root package name */
    Oc0.a f104165f;

    /* renamed from: g, reason: collision with root package name */
    long f104166g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f104167h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C10503d f104168i;

    /* renamed from: j, reason: collision with root package name */
    int f104169j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10508i(C10503d c10503d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f104168i = c10503d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104167h = obj;
        this.f104169j |= LinearLayoutManager.INVALID_OFFSET;
        return C10503d.p(this.f104168i, null, null, null, this);
    }
}
