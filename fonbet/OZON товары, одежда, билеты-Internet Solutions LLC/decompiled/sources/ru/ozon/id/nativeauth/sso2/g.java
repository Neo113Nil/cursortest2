package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor", f = "Sso2DomainsAuthMobileInteractor.kt", l = {43, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 54, 55, 74, 80}, m = "auth")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f97407d;

    /* renamed from: e, reason: collision with root package name */
    Object f97408e;

    /* renamed from: f, reason: collision with root package name */
    Object f97409f;

    /* renamed from: g, reason: collision with root package name */
    Sso2DomainsAuthMobileResponse f97410g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f97411h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ r f97412i;

    /* renamed from: j, reason: collision with root package name */
    int f97413j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97412i = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97411h = obj;
        this.f97413j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97412i.h(null, null, this);
    }
}
