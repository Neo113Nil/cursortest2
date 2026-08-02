package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainValidator", f = "Sso2DomainValidator.kt", l = {32}, m = "getNotSyncDomains")
/* renamed from: ru.ozon.id.nativeauth.sso2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9552f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9551e f97402d;

    /* renamed from: e, reason: collision with root package name */
    t f97403e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f97404f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9551e f97405g;

    /* renamed from: h, reason: collision with root package name */
    int f97406h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9552f(C9551e c9551e, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97405g = c9551e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97404f = obj;
        this.f97406h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97405g.b(null, this);
    }
}
