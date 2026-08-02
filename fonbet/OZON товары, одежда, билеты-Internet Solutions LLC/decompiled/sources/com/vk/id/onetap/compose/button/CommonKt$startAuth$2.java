package com.vk.id.onetap.compose.button;

import Sc.s;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.onetap.compose.button.CommonKt$startAuth$2", f = "Common.kt", l = {63, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CommonKt$startAuth$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AccessToken, Unit> $onAuth;
    final /* synthetic */ Function2<AuthCodeData, Boolean, Unit> $onAuthCode;
    final /* synthetic */ Function1<VKIDAuthFail, Unit> $onFail;
    final /* synthetic */ Function1<d<? super VKIDAuthUiParams>, Object> $onGetParams;
    final /* synthetic */ VKIDAuthParams.Builder $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonKt$startAuth$2(Function1<? super d<? super VKIDAuthUiParams>, ? extends Object> function1, VKIDAuthParams.Builder builder, Function1<? super AccessToken, Unit> function12, Function2<? super AuthCodeData, ? super Boolean, Unit> function2, Function1<? super VKIDAuthFail, Unit> function13, d<? super CommonKt$startAuth$2> dVar) {
        super(2, dVar);
        this.$onGetParams = function1;
        this.$params = builder;
        this.$onAuth = function12;
        this.$onAuthCode = function2;
        this.$onFail = function13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(VKIDAuthParams.Builder builder) {
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonKt$startAuth$2(this.$onGetParams, this.$params, this.$onAuth, this.$onAuthCode, this.$onFail, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r1.authorize(r3, r8, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VKIDAuthParams.Builder builder;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Function1<d<? super VKIDAuthUiParams>, Object> function1 = this.$onGetParams;
            this.label = 1;
            obj = function1.invoke(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        VKIDAuthUiParams vKIDAuthUiParams = (VKIDAuthUiParams) obj;
        if (vKIDAuthUiParams == null || (builder = vKIDAuthUiParams.asParamsBuilder(new a())) == null) {
            builder = this.$params;
        }
        builder.setInternalUse(true);
        VKID companion = VKID.INSTANCE.getInstance();
        final Function1<AccessToken, Unit> function12 = this.$onAuth;
        final Function2<AuthCodeData, Boolean, Unit> function2 = this.$onAuthCode;
        final Function1<VKIDAuthFail, Unit> function13 = this.$onFail;
        VKIDAuthCallback vKIDAuthCallback = new VKIDAuthCallback() { // from class: com.vk.id.onetap.compose.button.CommonKt$startAuth$2.1
            @Override // com.vk.id.auth.VKIDAuthCallback
            public void onAuth(AccessToken accessToken) {
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                function12.invoke(accessToken);
            }

            @Override // com.vk.id.auth.VKIDAuthCallback
            public void onAuthCode(AuthCodeData data, boolean isCompletion) {
                Intrinsics.checkNotNullParameter(data, "data");
                function2.invoke(data, Boolean.valueOf(isCompletion));
            }

            @Override // com.vk.id.auth.VKIDAuthCallback
            public void onFail(VKIDAuthFail fail) {
                Intrinsics.checkNotNullParameter(fail, "fail");
                function13.invoke(fail);
            }
        };
        VKIDAuthParams build = builder.build();
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommonKt$startAuth$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
