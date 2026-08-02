package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x1 {
    public static final v1 b = new v1();
    public final b2 a;

    public x1() {
        b2 b2Var;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            b2Var = b;
        }
        w1 w1Var = new w1(r0.a, b2Var);
        Charset charset = l1.a;
        this.a = w1Var;
    }
}
