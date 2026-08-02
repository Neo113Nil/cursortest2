package wc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl", f = "ActionAuthRepositoryImpl.kt", l = {181, 181}, m = "buildBody")
/* renamed from: wc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10502c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10503d f104108d;

    /* renamed from: e, reason: collision with root package name */
    Object f104109e;

    /* renamed from: f, reason: collision with root package name */
    Object f104110f;

    /* renamed from: g, reason: collision with root package name */
    boolean f104111g;

    /* renamed from: h, reason: collision with root package name */
    boolean f104112h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f104113i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C10503d f104114j;

    /* renamed from: k, reason: collision with root package name */
    int f104115k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10502c(C10503d c10503d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f104114j = c10503d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104113i = obj;
        this.f104115k |= LinearLayoutManager.INVALID_OFFSET;
        return C10503d.j(this.f104114j, null, false, false, this);
    }
}
