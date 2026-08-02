package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gal {
    public static final uzc a;
    public static final eal[] b;

    static {
        uzc uzcVar = new uzc(8);
        eal.a.getClass();
        fal falVar = dal.g;
        uzcVar.i(1, falVar);
        fal falVar2 = dal.f;
        uzcVar.i(2, falVar2);
        fal falVar3 = dal.b;
        uzcVar.i(4, falVar3);
        fal falVar4 = dal.d;
        uzcVar.i(8, falVar4);
        fal falVar5 = dal.h;
        uzcVar.i(16, falVar5);
        fal falVar6 = dal.e;
        uzcVar.i(32, falVar6);
        fal falVar7 = dal.i;
        uzcVar.i(64, falVar7);
        fal falVar8 = dal.c;
        uzcVar.i(128, falVar8);
        a = uzcVar;
        b = new eal[]{falVar, falVar2, falVar3, falVar7, falVar5, falVar6, falVar4, dal.j, falVar8};
    }

    public static final void a(qkb qkbVar, a4a a4aVar, long j, int i, int i2) {
        if (r4a.u(j, -1L)) {
            return;
        }
        qkbVar.a(a4aVar.b, (int) ((j >>> 48) & 65535));
        qkbVar.a(a4aVar.c, (int) ((j >>> 32) & 65535));
        qkbVar.a(a4aVar.d, i - ((int) ((j >>> 16) & 65535)));
        qkbVar.a(a4aVar.e, i2 - ((int) (j & 65535)));
    }
}
