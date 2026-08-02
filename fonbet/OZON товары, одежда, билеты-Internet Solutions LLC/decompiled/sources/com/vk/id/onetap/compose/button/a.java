package com.vk.id.onetap.compose.button;

import com.vk.id.auth.VKIDAuthParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invokeSuspend$lambda$0;
        invokeSuspend$lambda$0 = CommonKt$startAuth$2.invokeSuspend$lambda$0((VKIDAuthParams.Builder) obj);
        return invokeSuspend$lambda$0;
    }
}
