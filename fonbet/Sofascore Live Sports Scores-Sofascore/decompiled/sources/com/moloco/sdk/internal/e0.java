package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.lm5;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class e0 {
    public static d0 a(String str, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return b(str, errorType, cVar, lm5Var);
    }

    public static final d0 b(String str, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map) {
        str.getClass();
        errorType.getClass();
        cVar.getClass();
        map.getClass();
        return new d0(new MolocoAdError("Moloco", str, errorType, null, 8, null), cVar, map);
    }
}
