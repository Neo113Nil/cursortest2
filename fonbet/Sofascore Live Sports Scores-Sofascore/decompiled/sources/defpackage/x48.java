package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x48 extends ode {
    public static final l10 d = l10.c();
    public final fsj c;

    public x48(fsj fsjVar) {
        this.c = fsjVar;
    }

    public static boolean d(fsj fsjVar, int i) {
        if (fsjVar != null) {
            l10 l10Var = d;
            if (i > 1) {
                l10Var.getClass();
                return false;
            }
            for (Map.Entry entry : fsjVar.n().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String trim = str.trim();
                    if (trim.isEmpty()) {
                        l10Var.getClass();
                    } else if (trim.length() > 100) {
                        l10Var.getClass();
                    } else if (((Long) entry.getValue()) == null) {
                        Objects.toString(entry.getValue());
                        l10Var.getClass();
                        return false;
                    }
                }
                l10Var.getClass();
                return false;
            }
            Iterator<E> it = fsjVar.s().iterator();
            while (it.hasNext()) {
                if (!d((fsj) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(fsj fsjVar, int i) {
        Long l;
        l10 l10Var = d;
        if (fsjVar == null) {
            l10Var.getClass();
            return false;
        }
        if (i > 1) {
            l10Var.getClass();
            return false;
        }
        String name = fsjVar.getName();
        if (name != null) {
            String trim = name.trim();
            if (!trim.isEmpty() && trim.length() <= 100) {
                if (fsjVar.q() <= 0) {
                    l10Var.getClass();
                    return false;
                }
                if (!fsjVar.t()) {
                    l10Var.getClass();
                    return false;
                }
                if (fsjVar.getName().startsWith("_st_") && ((l = (Long) fsjVar.n().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    l10Var.getClass();
                    return false;
                }
                Iterator<E> it = fsjVar.s().iterator();
                while (it.hasNext()) {
                    if (!e((fsj) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : fsjVar.o().entrySet()) {
                    try {
                        ode.b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        e.getLocalizedMessage();
                        l10Var.getClass();
                        return false;
                    }
                }
                return true;
            }
        }
        l10Var.getClass();
        return false;
    }

    @Override // defpackage.ode
    public final boolean a() {
        fsj fsjVar = this.c;
        boolean e = e(fsjVar, 0);
        l10 l10Var = d;
        if (!e) {
            fsjVar.getName();
            l10Var.getClass();
            return false;
        }
        if (fsjVar.m() <= 0) {
            Iterator<E> it = fsjVar.s().iterator();
            while (it.hasNext()) {
                if (((fsj) it.next()).m() > 0) {
                }
            }
            return true;
        }
        if (d(fsjVar, 0)) {
            return true;
        }
        l10Var.getClass();
        return false;
    }
}
