package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.C9551e;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler", f = "Sso2ReauthorizeHandler.kt", l = {115, 139}, m = "reAuthDomains")
/* loaded from: classes3.dex */
final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    v f97508d;

    /* renamed from: e, reason: collision with root package name */
    t f97509e;

    /* renamed from: f, reason: collision with root package name */
    C9551e.a f97510f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f97511g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ v f97512h;

    /* renamed from: i, reason: collision with root package name */
    int f97513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(v vVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97512h = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object h11;
        this.f97511g = obj;
        this.f97513i |= LinearLayoutManager.INVALID_OFFSET;
        h11 = this.f97512h.h(null, null, this);
        return h11;
    }
}
