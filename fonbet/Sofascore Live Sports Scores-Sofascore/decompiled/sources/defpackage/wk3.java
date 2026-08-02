package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wk3 {
    public static final uzc a;

    static {
        b5g b5gVar = l23.e;
        int i = b5gVar.c;
        tk3 tk3Var = new tk3(b5gVar, b5gVar, 1);
        int i2 = b5gVar.c;
        jpd jpdVar = l23.x;
        int i3 = (jpdVar.c << 6) | i2;
        vk3 vk3Var = new vk3(b5gVar, jpdVar, 0);
        int i4 = (i2 << 6) | jpdVar.c;
        vk3 vk3Var2 = new vk3(jpdVar, b5gVar, 0);
        uzc uzcVar = q6a.a;
        uzc uzcVar2 = new uzc();
        uzcVar2.i(i | (i << 6), tk3Var);
        uzcVar2.i(i3, vk3Var);
        uzcVar2.i(i4, vk3Var2);
        a = uzcVar2;
    }
}
