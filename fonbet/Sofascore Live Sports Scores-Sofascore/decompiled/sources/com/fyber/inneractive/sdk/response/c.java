package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.s0;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends b {
    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        f fVar = (f) this.a;
        if (TextUtils.isEmpty(fVar.z) && r0Var != null) {
            fVar.z = r0Var.b;
        }
        if (str == null) {
            str = null;
        } else {
            s0 s0Var = s0.c;
            s0Var.getClass();
            int indexOf = str.indexOf(38);
            if (indexOf >= 0) {
                StringWriter stringWriter = new StringWriter((int) ((str.length() * 0.1d) + str.length()));
                try {
                    s0Var.a(stringWriter, str, indexOf);
                } catch (IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String b = o.b(property);
            if (!TextUtils.isEmpty(b)) {
                str = b;
            }
        }
        fVar.M = str;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        f fVar = new f();
        this.a = fVar;
        return fVar;
    }
}
