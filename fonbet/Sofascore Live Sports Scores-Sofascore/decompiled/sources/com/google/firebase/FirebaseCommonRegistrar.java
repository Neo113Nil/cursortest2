package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a99;
import defpackage.b99;
import defpackage.by0;
import defpackage.c99;
import defpackage.cp4;
import defpackage.hg6;
import defpackage.jb3;
import defpackage.jka;
import defpackage.kb3;
import defpackage.mp4;
import defpackage.nu0;
import defpackage.nu4;
import defpackage.oif;
import defpackage.op4;
import defpackage.qx4;
import defpackage.r38;
import defpackage.wba;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        jb3 b = kb3.b(nu4.class);
        b.a(new qx4(2, 0, nu0.class));
        b.f = new cp4(3);
        arrayList.add(b.b());
        oif oifVar = new oif(by0.class, Executor.class);
        jb3 jb3Var = new jb3(op4.class, b99.class, c99.class);
        jb3Var.a(qx4.c(Context.class));
        jb3Var.a(qx4.c(r38.class));
        jb3Var.a(new qx4(2, 0, a99.class));
        jb3Var.a(new qx4(1, 1, nu4.class));
        jb3Var.a(new qx4(oifVar, 1, 0));
        jb3Var.f = new mp4(oifVar, 0);
        arrayList.add(jb3Var.b());
        arrayList.add(wba.q("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(wba.q("fire-core", "22.1.0"));
        arrayList.add(wba.q("device-name", a(Build.PRODUCT)));
        arrayList.add(wba.q("device-model", a(Build.DEVICE)));
        arrayList.add(wba.q("device-brand", a(Build.BRAND)));
        arrayList.add(wba.u("android-target-sdk", new hg6(8)));
        arrayList.add(wba.u("android-min-sdk", new hg6(9)));
        arrayList.add(wba.u("android-platform", new hg6(10)));
        arrayList.add(wba.u("android-installer", new hg6(11)));
        try {
            str = jka.f.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(wba.q("kotlin", str));
        }
        return arrayList;
    }
}
