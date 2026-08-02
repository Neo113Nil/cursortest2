package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.hc5;
import defpackage.iu;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.qx4;
import defpackage.wba;
import defpackage.z8;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z8 lambda$getComponents$0(ac3 ac3Var) {
        return new z8((Context) ac3Var.e(Context.class), ac3Var.j(iu.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kb3> getComponents() {
        jb3 b = kb3.b(z8.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(Context.class));
        b.a(qx4.a(iu.class));
        b.f = new hc5(6);
        return Arrays.asList(b.b(), wba.q(LIBRARY_NAME, "21.1.1"));
    }
}
