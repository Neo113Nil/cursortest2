package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.c99;
import defpackage.hki;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.l48;
import defpackage.mp4;
import defpackage.n48;
import defpackage.nu4;
import defpackage.oif;
import defpackage.pvd;
import defpackage.qx4;
import defpackage.r38;
import defpackage.txj;
import defpackage.wba;
import defpackage.wxj;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(oif oifVar, ac3 ac3Var) {
        r38 r38Var = (r38) ac3Var.e(r38.class);
        if (ac3Var.e(n48.class) == null) {
            return new FirebaseMessaging(r38Var, ac3Var.j(nu4.class), ac3Var.j(c99.class), (l48) ac3Var.e(l48.class), ac3Var.g(oifVar), (hki) ac3Var.e(hki.class));
        }
        pvd.j();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kb3> getComponents() {
        oif oifVar = new oif(txj.class, wxj.class);
        jb3 b = kb3.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(r38.class));
        b.a(new qx4(0, 0, n48.class));
        b.a(qx4.a(nu4.class));
        b.a(qx4.a(c99.class));
        b.a(qx4.c(l48.class));
        b.a(new qx4(oifVar, 0, 1));
        b.a(qx4.c(hki.class));
        b.f = new mp4(oifVar, 1);
        b.c(1);
        return Arrays.asList(b.b(), wba.q(LIBRARY_NAME, "25.1.1"));
    }
}
