package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class j0g {
    public static final LinkedHashSet a = new LinkedHashSet();

    public static final int a(ucd ucdVar) {
        hw9 hw9Var = ucdVar.a.a[0];
        int i = hw9Var.a != null ? 1 : 0;
        if (hw9Var.b != null) {
            i++;
        }
        return hw9Var.c != null ? i + 1 : i;
    }
}
