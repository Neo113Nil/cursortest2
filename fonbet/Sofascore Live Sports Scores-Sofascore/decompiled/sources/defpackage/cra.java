package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cra {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ era c;

    public cra(era eraVar, int i) {
        this.c = eraVar;
        this.a = i;
    }

    public final void a(int i) {
        era eraVar = this.c;
        en0 en0Var = eraVar.c;
        if (en0Var == null) {
            return;
        }
        this.b.add(new q5f(en0Var, i, eraVar.b, null));
    }
}
