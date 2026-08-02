package com.vk.id.internal.auth.app;

import android.content.pm.Signature;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class SilentAuthInfoUtils$calculateDigestHex$1 extends C7735q implements Function1<Signature, String> {
    SilentAuthInfoUtils$calculateDigestHex$1(Object obj) {
        super(1, obj, SilentAuthInfoUtils.class, "calculateDigestHex", "calculateDigestHex(Landroid/content/pm/Signature;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Signature p02) {
        String calculateDigestHex;
        Intrinsics.checkNotNullParameter(p02, "p0");
        calculateDigestHex = ((SilentAuthInfoUtils) this.receiver).calculateDigestHex(p02);
        return calculateDigestHex;
    }
}
