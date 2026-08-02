package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m4a implements he4 {
    public final kn4 a;

    public m4a(kn4 kn4Var) {
        this.a = kn4Var;
    }

    @Override // defpackage.he4
    public final ie4 build(Object obj) {
        return new de0((InputStream) obj, this.a);
    }

    @Override // defpackage.he4
    public final Class c() {
        return InputStream.class;
    }
}
