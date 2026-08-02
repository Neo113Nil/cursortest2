package defpackage;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xep extends wep {
    public final icp b;

    public xep(icp icpVar, zep zepVar) {
        super(zepVar);
        this.b = icpVar;
    }

    @Override // defpackage.wep
    public final Object a() {
        return this.b.zza();
    }

    @Override // defpackage.wep
    public final void b(Object obj, e7n e7nVar, sep sepVar) {
        Field field = sepVar.b;
        Object read = sepVar.g.read(e7nVar);
        if (read == null && sepVar.h) {
            return;
        }
        if (sepVar.d) {
            cfp.b(obj, field);
        } else if (sepVar.i) {
            throw new o9p("Cannot set value of 'static final' ".concat(f6n.b(field, false)), 16);
        }
        field.set(obj, read);
    }

    @Override // defpackage.wep
    public final Object c(Object obj) {
        return obj;
    }
}
