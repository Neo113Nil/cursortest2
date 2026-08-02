package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nuo {
    public final zro a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public nuo(zro zroVar, String str, String str2, Class... clsArr) {
        this.a = zroVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        zroVar.b.submit(new dno(this, 5));
    }
}
