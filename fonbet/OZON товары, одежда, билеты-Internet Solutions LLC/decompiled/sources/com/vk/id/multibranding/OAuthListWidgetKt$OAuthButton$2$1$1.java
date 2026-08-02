package com.vk.id.multibranding;

import Sc.s;
import com.vk.id.AccessToken;
import com.vk.id.OAuth;
import com.vk.id.VKID;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.Prompt;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.multibranding.common.style.OAuthListWidgetStyle;
import java.util.Map;
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
@e(c = "com.vk.id.multibranding.OAuthListWidgetKt$OAuthButton$2$1$1", f = "OAuthListWidget.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class OAuthListWidgetKt$OAuthButton$2$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ OAuthListWidgetAnalytics $analytics;
    final /* synthetic */ VKIDAuthUiParams $authParams;
    final /* synthetic */ Map<String, String> $extraAuthParams;
    final /* synthetic */ OAuth $item;
    final /* synthetic */ Function2<OAuth, AccessToken, Unit> $onAuth;
    final /* synthetic */ Function2<AuthCodeData, Boolean, Unit> $onAuthCode;
    final /* synthetic */ Function1<VKIDAuthFail, Unit> $onFail;
    final /* synthetic */ OAuthListWidgetStyle $style;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OAuthListWidgetKt$OAuthButton$2$1$1(VKIDAuthUiParams vKIDAuthUiParams, Function2<? super OAuth, ? super AccessToken, Unit> function2, OAuth oAuth, Function2<? super AuthCodeData, ? super Boolean, Unit> function22, OAuthListWidgetAnalytics oAuthListWidgetAnalytics, Map<String, String> map, Function1<? super VKIDAuthFail, Unit> function1, OAuthListWidgetStyle oAuthListWidgetStyle, d<? super OAuthListWidgetKt$OAuthButton$2$1$1> dVar) {
        super(2, dVar);
        this.$authParams = vKIDAuthUiParams;
        this.$onAuth = function2;
        this.$item = oAuth;
        this.$onAuthCode = function22;
        this.$analytics = oAuthListWidgetAnalytics;
        this.$extraAuthParams = map;
        this.$onFail = function1;
        this.$style = oAuthListWidgetStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(OAuth oAuth, OAuthListWidgetStyle oAuthListWidgetStyle, Map map, VKIDAuthParams.Builder builder) {
        VKIDAuthParams.Theme providerTheme;
        builder.setOAuth(oAuth);
        providerTheme = OAuthListWidgetKt.toProviderTheme(oAuthListWidgetStyle);
        builder.setTheme(providerTheme);
        builder.setPrompt(Prompt.LOGIN);
        builder.setExtraParams(map);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OAuthListWidgetKt$OAuthButton$2$1$1(this.$authParams, this.$onAuth, this.$item, this.$onAuthCode, this.$analytics, this.$extraAuthParams, this.$onFail, this.$style, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            VKID companion = VKID.INSTANCE.getInstance();
            final Function2<OAuth, AccessToken, Unit> function2 = this.$onAuth;
            final OAuth oAuth = this.$item;
            final Function2<AuthCodeData, Boolean, Unit> function22 = this.$onAuthCode;
            final OAuthListWidgetAnalytics oAuthListWidgetAnalytics = this.$analytics;
            final Map<String, String> map = this.$extraAuthParams;
            final Function1<VKIDAuthFail, Unit> function1 = this.$onFail;
            VKIDAuthCallback vKIDAuthCallback = new VKIDAuthCallback() { // from class: com.vk.id.multibranding.OAuthListWidgetKt$OAuthButton$2$1$1.1
                @Override // com.vk.id.auth.VKIDAuthCallback
                public void onAuth(AccessToken accessToken) {
                    Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                    function2.invoke(oAuth, accessToken);
                }

                @Override // com.vk.id.auth.VKIDAuthCallback
                public void onAuthCode(AuthCodeData data, boolean isCompletion) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    function22.invoke(data, Boolean.valueOf(isCompletion));
                }

                @Override // com.vk.id.auth.VKIDAuthCallback
                public void onFail(VKIDAuthFail fail) {
                    Intrinsics.checkNotNullParameter(fail, "fail");
                    OAuthListWidgetAnalytics oAuthListWidgetAnalytics2 = oAuthListWidgetAnalytics;
                    String str = map.get("session_id");
                    if (str == null) {
                        str = "";
                    }
                    oAuthListWidgetAnalytics2.onAuthError(str, oAuth);
                    function1.invoke(fail);
                }
            };
            VKIDAuthUiParams vKIDAuthUiParams = this.$authParams;
            final OAuth oAuth2 = this.$item;
            final OAuthListWidgetStyle oAuthListWidgetStyle = this.$style;
            final Map<String, String> map2 = this.$extraAuthParams;
            VKIDAuthParams build = vKIDAuthUiParams.asParamsBuilder(new Function1() { // from class: com.vk.id.multibranding.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = OAuthListWidgetKt$OAuthButton$2$1$1.invokeSuspend$lambda$0(OAuth.this, oAuthListWidgetStyle, map2, (VKIDAuthParams.Builder) obj2);
                    return invokeSuspend$lambda$0;
                }
            }).build();
            this.label = 1;
            if (companion.authorize(vKIDAuthCallback, build, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OAuthListWidgetKt$OAuthButton$2$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
