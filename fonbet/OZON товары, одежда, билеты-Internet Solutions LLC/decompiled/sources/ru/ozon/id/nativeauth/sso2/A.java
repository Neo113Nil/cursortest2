package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.t;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler", f = "Sso2ReauthorizeHandler.kt", l = {63, 66}, m = "startFlowIfNeedAndWait")
/* loaded from: classes3.dex */
final class A extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    v f97326d;

    /* renamed from: e, reason: collision with root package name */
    t.c f97327e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f97328f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ v f97329g;

    /* renamed from: h, reason: collision with root package name */
    int f97330h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(v vVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97329g = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97328f = obj;
        this.f97330h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97329g.l(null, this);
    }
}
