package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class tv9 extends uu9 {
    @Override // defpackage.vu9
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public tv9 a(Object obj) {
        obj.getClass();
        c(obj);
        return this;
    }

    public vv9 h() {
        int i = this.b;
        if (i == 0) {
            int i2 = vv9.c;
            return ewf.j;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            vv9 s = vv9.s(i, objArr);
            this.b = s.size();
            this.c = true;
            return s;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = vv9.c;
        return new djh(obj);
    }
}
