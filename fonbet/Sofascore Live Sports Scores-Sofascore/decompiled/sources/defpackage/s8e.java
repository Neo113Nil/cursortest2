package defpackage;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class s8e extends yaa {
    public final Class h;

    public s8e(Class cls) {
        this.h = cls;
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        pzf pzfVar = b0gVar.e;
        Class cls = this.h;
        cls.getClass();
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(cls);
        orCreateKotlinClass.getClass();
        pzfVar.e = pzfVar.e.H(orCreateKotlinClass, obj);
    }
}
