package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a99;
import defpackage.ac3;
import defpackage.b99;
import defpackage.by0;
import defpackage.hg6;
import defpackage.ib3;
import defpackage.iy1;
import defpackage.j5h;
import defpackage.jb3;
import defpackage.k48;
import defpackage.kb3;
import defpackage.l48;
import defpackage.oif;
import defpackage.qx4;
import defpackage.r38;
import defpackage.wba;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static l48 lambda$getComponents$0(ac3 ac3Var) {
        return new k48((r38) ac3Var.e(r38.class), ac3Var.j(b99.class), (ExecutorService) ac3Var.h(new oif(by0.class, ExecutorService.class)), new j5h((Executor) ac3Var.h(new oif(iy1.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kb3> getComponents() {
        jb3 b = kb3.b(l48.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(r38.class));
        b.a(qx4.a(b99.class));
        int i = 0;
        b.a(new qx4(new oif(by0.class, ExecutorService.class), 1, 0));
        b.a(new qx4(new oif(iy1.class, Executor.class), 1, 0));
        b.f = new hg6(14);
        kb3 b2 = b.b();
        a99 a99Var = new a99(i);
        jb3 b3 = kb3.b(a99.class);
        b3.e = 1;
        b3.f = new ib3(a99Var, i);
        return Arrays.asList(b2, b3.b(), wba.q(LIBRARY_NAME, "19.1.2"));
    }
}
