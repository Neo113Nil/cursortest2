package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nbp implements Cloneable, nap {
    public static final nbp c = new nbp();
    public List a;
    public final List b;

    public nbp() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Class cls = z6nVar.a;
        boolean c2 = c(cls, true);
        boolean c3 = c(cls, false);
        if (c2 || c3) {
            return new lbp(this, c3, c2, h9pVar, z6nVar);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nbp clone() {
        try {
            return (nbp) super.clone();
        } catch (CloneNotSupportedException e) {
            a70.j(e);
            return null;
        }
    }

    public final boolean c(Class cls, boolean z) {
        List<r1p> list;
        if (z) {
            list = this.a;
        } else {
            if (!Enum.class.isAssignableFrom(cls)) {
                vha vhaVar = f6n.a;
                if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                    return true;
                }
            }
            list = this.b;
        }
        for (r1p r1pVar : list) {
        }
        return false;
    }
}
