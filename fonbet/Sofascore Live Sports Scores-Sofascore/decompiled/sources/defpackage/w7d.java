package defpackage;

import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w7d extends a8d {
    public final Class s;

    public w7d(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            is8.b(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.a8d, defpackage.b8d
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.a8d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        str.getClass();
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (c.o(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        StringBuilder q = wt3.q("Enum value ", str, " not found for type ");
        q.append(cls.getName());
        q.append('.');
        throw new IllegalArgumentException(q.toString());
    }
}
