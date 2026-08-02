package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.iu;
import defpackage.iy1;
import defpackage.jb3;
import defpackage.k58;
import defpackage.kb3;
import defpackage.l48;
import defpackage.lxf;
import defpackage.mp4;
import defpackage.oif;
import defpackage.qx4;
import defpackage.r38;
import defpackage.wba;
import defpackage.z8;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ lxf lambda$getComponents$0(oif oifVar, ac3 ac3Var) {
        return new lxf((Context) ac3Var.e(Context.class), (ScheduledExecutorService) ac3Var.h(oifVar), (r38) ac3Var.e(r38.class), (l48) ac3Var.e(l48.class), ((z8) ac3Var.e(z8.class)).a("frc"), ac3Var.j(iu.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kb3> getComponents() {
        oif oifVar = new oif(iy1.class, ScheduledExecutorService.class);
        jb3 jb3Var = new jb3(lxf.class, k58.class);
        jb3Var.a = LIBRARY_NAME;
        jb3Var.a(qx4.c(Context.class));
        jb3Var.a(new qx4(oifVar, 1, 0));
        jb3Var.a(qx4.c(r38.class));
        jb3Var.a(qx4.c(l48.class));
        jb3Var.a(qx4.c(z8.class));
        jb3Var.a(qx4.a(iu.class));
        jb3Var.f = new mp4(oifVar, 3);
        jb3Var.c(2);
        return Arrays.asList(jb3Var.b(), wba.q(LIBRARY_NAME, "23.1.0"));
    }
}
