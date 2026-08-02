package com.vk.id;

import Sc.s;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lkotlin/Pair;", "", "<anonymous>", "(Lxe/M;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.AuthResultHandler$handleOauth$2", f = "AuthResultHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AuthResultHandler$handleOauth$2 extends j implements Function2<M, d<? super Pair<? extends String, ? extends String>>, Object> {
    final /* synthetic */ AuthResult.Success $oauth;
    int label;
    final /* synthetic */ AuthResultHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthResultHandler$handleOauth$2(AuthResultHandler authResultHandler, AuthResult.Success success, d<? super AuthResultHandler$handleOauth$2> dVar) {
        super(2, dVar);
        this.this$0 = authResultHandler;
        this.$oauth = success;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AuthResultHandler$handleOauth$2(this.this$0, this.$oauth, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Pair<? extends String, ? extends String>> dVar) {
        return invoke2(m11, (d<? super Pair<String, String>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider;
        InternalVKIDPrefsStore internalVKIDPrefsStore;
        InternalVKIDPrefsStore internalVKIDPrefsStore2;
        InternalVKIDPrefsStore internalVKIDPrefsStore3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        internalVKIDDeviceIdProvider = this.this$0.deviceIdProvider;
        internalVKIDDeviceIdProvider.setDeviceId$vkid_release(this.$oauth.getDeviceId());
        internalVKIDPrefsStore = this.this$0.prefsStore;
        String state = internalVKIDPrefsStore.getState();
        internalVKIDPrefsStore2 = this.this$0.prefsStore;
        Pair pair = new Pair(state, internalVKIDPrefsStore2.getCodeVerifier$vkid_release());
        internalVKIDPrefsStore3 = this.this$0.prefsStore;
        internalVKIDPrefsStore3.clear();
        return pair;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super Pair<String, String>> dVar) {
        return ((AuthResultHandler$handleOauth$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
