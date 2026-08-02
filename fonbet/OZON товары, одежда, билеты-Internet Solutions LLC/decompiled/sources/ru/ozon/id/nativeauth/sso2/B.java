package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler", f = "Sso2ReauthorizeHandler.kt", l = {100}, m = "tryReAuthDomains")
/* loaded from: classes3.dex */
final class B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    v f97331d;

    /* renamed from: e, reason: collision with root package name */
    v f97332e;

    /* renamed from: f, reason: collision with root package name */
    boolean f97333f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f97334g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ v f97335h;

    /* renamed from: i, reason: collision with root package name */
    int f97336i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(v vVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97335h = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97334g = obj;
        this.f97336i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97335h.m(null, null, this);
    }
}
