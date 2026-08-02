package defpackage;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qed implements znf {
    public Object a;

    @Override // defpackage.xnf
    public final Object getValue(Object obj, KProperty kProperty) {
        kProperty.getClass();
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        a70.l(kProperty.getName(), " should be initialized before get.", "Property ");
        return null;
    }

    @Override // defpackage.znf
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        kProperty.getClass();
        obj2.getClass();
        this.a = obj2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NotNullProperty(");
        if (this.a != null) {
            str = "value=" + this.a;
        } else {
            str = "value not initialized yet";
        }
        return lnb.q(sb, str, ')');
    }
}
