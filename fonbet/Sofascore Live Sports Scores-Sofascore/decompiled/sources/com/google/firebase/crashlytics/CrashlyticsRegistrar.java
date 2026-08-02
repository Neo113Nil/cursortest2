package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.by0;
import defpackage.i7b;
import defpackage.iu;
import defpackage.iy1;
import defpackage.jb3;
import defpackage.k58;
import defpackage.kb3;
import defpackage.l1;
import defpackage.l48;
import defpackage.oif;
import defpackage.ow3;
import defpackage.qx4;
import defpackage.r38;
import defpackage.r8h;
import defpackage.s38;
import defpackage.t58;
import defpackage.v58;
import defpackage.wba;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final oif a = new oif(by0.class, ExecutorService.class);
    public final oif b = new oif(iy1.class, ExecutorService.class);
    public final oif c = new oif(i7b.class, ExecutorService.class);

    static {
        r8h r8hVar = r8h.a;
        Map map = v58.b;
        if (map.containsKey(r8hVar)) {
            Objects.toString(r8hVar);
        } else {
            map.put(r8hVar, new t58(new CountDownLatch(1)));
            Objects.toString(r8hVar);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        jb3 b = kb3.b(s38.class);
        b.a = "fire-cls";
        b.a(qx4.c(r38.class));
        b.a(qx4.c(l48.class));
        b.a(new qx4(this.a, 1, 0));
        b.a(new qx4(this.b, 1, 0));
        b.a(new qx4(this.c, 1, 0));
        b.a(new qx4(0, 2, ow3.class));
        b.a(new qx4(0, 2, iu.class));
        b.a(new qx4(0, 2, k58.class));
        b.f = new l1(this, 16);
        b.c(2);
        return Arrays.asList(b.b(), wba.q("fire-cls", "20.1.0"));
    }
}
