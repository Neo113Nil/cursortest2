package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.b48;
import defpackage.ec4;
import defpackage.f48;
import defpackage.it7;
import defpackage.jb3;
import defpackage.jw1;
import defpackage.k2a;
import defpackage.kb3;
import defpackage.kt4;
import defpackage.mf0;
import defpackage.mx9;
import defpackage.qn2;
import defpackage.qx4;
import defpackage.r38;
import defpackage.sz8;
import defpackage.uff;
import defpackage.v38;
import defpackage.w65;
import defpackage.wba;
import defpackage.yqo;
import defpackage.yso;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public b48 buildFirebaseInAppMessagingUI(ac3 ac3Var) {
        r38 r38Var = (r38) ac3Var.e(r38.class);
        v38 v38Var = (v38) ac3Var.e(v38.class);
        r38Var.a();
        Application application = (Application) r38Var.a;
        sz8 sz8Var = new sz8(application, 8);
        mx9 mx9Var = new mx9();
        qn2 qn2Var = new qn2();
        qn2Var.a = w65.a(new mf0(sz8Var, 0));
        qn2Var.b = w65.a(yso.d);
        qn2Var.c = w65.a(new jw1((uff) qn2Var.a, 0));
        k2a k2aVar = new k2a(mx9Var, (uff) qn2Var.a, 8);
        qn2Var.d = new k2a(mx9Var, k2aVar, 7);
        qn2Var.e = new k2a(mx9Var, k2aVar, 4);
        qn2Var.f = new k2a(mx9Var, k2aVar, 5);
        qn2Var.g = new k2a(mx9Var, k2aVar, 6);
        qn2Var.h = new k2a(mx9Var, k2aVar, 2);
        qn2Var.i = new k2a(mx9Var, k2aVar, 3);
        qn2Var.j = new k2a(mx9Var, k2aVar, 1);
        qn2Var.k = new k2a(mx9Var, k2aVar, 0);
        sz8 sz8Var2 = new sz8(v38Var, 28);
        it7 it7Var = new it7(25);
        uff a = w65.a(new mf0(sz8Var2, 2));
        ec4 ec4Var = new ec4(qn2Var, 2);
        ec4 ec4Var2 = new ec4(qn2Var, 3);
        b48 b48Var = (b48) ((w65) w65.a(new f48(a, ec4Var, w65.a(new jw1(w65.a(new mf0(it7Var, ec4Var2)), 1)), new ec4(qn2Var, 0), ec4Var2, new ec4(qn2Var, 1), w65.a(yqo.e)))).get();
        application.registerActivityLifecycleCallbacks(b48Var);
        return b48Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kb3> getComponents() {
        jb3 b = kb3.b(b48.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(r38.class));
        b.a(qx4.c(v38.class));
        b.f = new kt4(this, 21);
        b.c(2);
        return Arrays.asList(b.b(), wba.q(LIBRARY_NAME, "22.0.3"));
    }
}
