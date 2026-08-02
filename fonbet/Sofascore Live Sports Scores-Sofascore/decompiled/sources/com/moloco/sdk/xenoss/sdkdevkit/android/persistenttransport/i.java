package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.util.Base64;
import com.moloco.sdk.BuildConfig;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new h(com.moloco.sdk.service_locator.j.a());
            default:
                return new IvParameterSpec(Base64.decode(BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
        }
    }
}
