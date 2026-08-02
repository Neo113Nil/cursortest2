package defpackage;

import androidx.recyclerview.widget.l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a9d {
    public final g7h a;
    public final ubf b;
    public final l c;
    public final r18 d;
    public int e;

    public a9d(l lVar, r18 r18Var, hvk hvkVar, ubf ubfVar) {
        vp8 vp8Var = new vp8(this, 1);
        this.c = lVar;
        this.d = r18Var;
        hvkVar.getClass();
        this.a = new g7h(hvkVar, this);
        this.b = ubfVar;
        this.e = lVar.getItemCount();
        lVar.registerAdapterDataObserver(vp8Var);
    }
}
