package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor", f = "Sso2DomainsAuthMobileInteractor.kt", l = {146, 154}, m = "callDomainAuthAction")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    r f97419d;

    /* renamed from: e, reason: collision with root package name */
    t f97420e;

    /* renamed from: f, reason: collision with root package name */
    String f97421f;

    /* renamed from: g, reason: collision with root package name */
    Serializable f97422g;

    /* renamed from: h, reason: collision with root package name */
    Sso2DomainsAuthMobileResponse f97423h;

    /* renamed from: i, reason: collision with root package name */
    boolean f97424i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f97425j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ r f97426k;

    /* renamed from: l, reason: collision with root package name */
    int f97427l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97426k = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97425j = obj;
        this.f97427l |= LinearLayoutManager.INVALID_OFFSET;
        return r.a(this.f97426k, null, null, null, null, this);
    }
}
