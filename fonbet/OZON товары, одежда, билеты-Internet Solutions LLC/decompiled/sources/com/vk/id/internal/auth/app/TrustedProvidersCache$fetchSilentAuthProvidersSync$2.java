package com.vk.id.internal.auth.app;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import Wc.a;
import com.vk.id.internal.api.VKIDApiService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "LSc/r;", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$2", f = "TrustedProvidersCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TrustedProvidersCache$fetchSilentAuthProvidersSync$2 extends j implements Function2<M, d<? super r<? extends List<? extends VkAuthSilentAuthProvider>>>, Object> {
    int label;
    final /* synthetic */ TrustedProvidersCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrustedProvidersCache$fetchSilentAuthProvidersSync$2(TrustedProvidersCache trustedProvidersCache, d<? super TrustedProvidersCache$fetchSilentAuthProvidersSync$2> dVar) {
        super(2, dVar);
        this.this$0 = trustedProvidersCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TrustedProvidersCache$fetchSilentAuthProvidersSync$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends List<? extends VkAuthSilentAuthProvider>>> dVar) {
        return invoke2(m11, (d<? super r<? extends List<VkAuthSilentAuthProvider>>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        String str;
        String str2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        interfaceC4008j = this.this$0.api;
        VKIDApiService vKIDApiService = (VKIDApiService) interfaceC4008j.getValue();
        str = this.this$0.clientId;
        str2 = this.this$0.clientSecret;
        return r.a(vKIDApiService.getSilentAuthProviders(str, str2).mo52executed1pmJ48());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<? extends List<VkAuthSilentAuthProvider>>> dVar) {
        return ((TrustedProvidersCache$fetchSilentAuthProvidersSync$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
