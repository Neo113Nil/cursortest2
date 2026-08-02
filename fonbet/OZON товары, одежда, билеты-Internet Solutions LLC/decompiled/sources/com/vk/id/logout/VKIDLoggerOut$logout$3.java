package com.vk.id.logout;

import Sc.s;
import Wc.a;
import com.vk.id.AccessToken;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lkotlin/Pair;", "", "<anonymous>", "(Lxe/M;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.logout.VKIDLoggerOut$logout$3", f = "VKIDLoggerOut.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKIDLoggerOut$logout$3 extends j implements Function2<M, d<? super Pair<? extends String, ? extends String>>, Object> {
    final /* synthetic */ String $accessToken;
    int label;
    final /* synthetic */ VKIDLoggerOut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDLoggerOut$logout$3(String str, VKIDLoggerOut vKIDLoggerOut, d<? super VKIDLoggerOut$logout$3> dVar) {
        super(2, dVar);
        this.$accessToken = str;
        this.this$0 = vKIDLoggerOut;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKIDLoggerOut$logout$3(this.$accessToken, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Pair<? extends String, ? extends String>> dVar) {
        return invoke2(m11, (d<? super Pair<String, String>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider;
        InternalVKIDTokenStorage internalVKIDTokenStorage;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = this.$accessToken;
        if (str == null) {
            internalVKIDTokenStorage = this.this$0.tokenStorage;
            AccessToken accessToken$vkid_release = internalVKIDTokenStorage.getAccessToken$vkid_release();
            str = accessToken$vkid_release != null ? accessToken$vkid_release.getToken() : null;
        }
        internalVKIDDeviceIdProvider = this.this$0.deviceIdProvider;
        return new Pair(str, internalVKIDDeviceIdProvider.getDeviceId$vkid_release());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super Pair<String, String>> dVar) {
        return ((VKIDLoggerOut$logout$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
