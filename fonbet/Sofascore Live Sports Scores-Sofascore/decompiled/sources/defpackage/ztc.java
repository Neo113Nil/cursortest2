package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ztc extends xv4 {
    default dti V() {
        return dti.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [xv4, ztc] */
    default Object g() {
        c40 c40Var;
        wtc wtcVar = (wtc) this;
        if (!wtcVar.a.n) {
            r3a.a("ModifierLocal accessed from an unattached node");
        }
        if (!wtcVar.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar2 = wtcVar.a.e;
        wma c0 = c6o.c0(this);
        while (c0 != null) {
            if ((((wtc) c0.F.g).d & 32) != 0) {
                while (wtcVar2 != null) {
                    if ((wtcVar2.c & 32) != 0) {
                        bw4 bw4Var = wtcVar2;
                        ?? r3 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof ztc) {
                                ztc ztcVar = (ztc) bw4Var;
                                if (ztcVar.V().i()) {
                                    ztcVar.V().p();
                                    throw null;
                                }
                            } else if ((bw4Var.c & 32) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar3 = bw4Var.p;
                                int i = 0;
                                bw4Var = bw4Var;
                                r3 = r3;
                                while (wtcVar3 != null) {
                                    if ((wtcVar3.c & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            bw4Var = wtcVar3;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r3.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r3.b(wtcVar3);
                                        }
                                    }
                                    wtcVar3 = wtcVar3.f;
                                    bw4Var = bw4Var;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            bw4Var = c6o.X(r3);
                        }
                    }
                    wtcVar2 = wtcVar2.e;
                }
            }
            c0 = c0.v();
            wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
        return upf.a.a.invoke();
    }
}
