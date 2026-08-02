package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rdd implements sdd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.sdd
    public final boolean a(wtc wtcVar) {
        ?? r0 = 0;
        while (wtcVar != 0) {
            if (wtcVar instanceof pze) {
                ((pze) wtcVar).Q();
            } else if ((wtcVar.c & 16) != 0 && (wtcVar instanceof bw4)) {
                wtc wtcVar2 = wtcVar.p;
                int i = 0;
                r0 = r0;
                wtcVar = wtcVar;
                while (wtcVar2 != null) {
                    if ((wtcVar2.c & 16) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            wtcVar = wtcVar2;
                        } else {
                            if (r0 == 0) {
                                r0 = new i1d(new wtc[16], 0);
                            }
                            if (wtcVar != 0) {
                                r0.b(wtcVar);
                                wtcVar = 0;
                            }
                            r0.b(wtcVar2);
                        }
                    }
                    wtcVar2 = wtcVar2.f;
                    r0 = r0;
                    wtcVar = wtcVar;
                }
                if (i == 1) {
                }
            }
            wtcVar = c6o.X(r0);
        }
        return false;
    }

    @Override // defpackage.sdd
    public final int b() {
        return 16;
    }

    @Override // defpackage.sdd
    public final void e(wma wmaVar, long j, jc9 jc9Var, int i, boolean z) {
        wmaVar.A(j, jc9Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    @Override // defpackage.sdd
    public final boolean f(jc9 jc9Var, wma wmaVar) {
        wdd wddVar = (wdd) wmaVar.F.e;
        wddVar.getClass();
        wtc g1 = wddVar.g1(xdd.g(16));
        if (g1 != null && g1.n) {
            if (!g1.a.n) {
                r3a.b("visitLocalDescendants called on an unattached node");
            }
            wtc wtcVar = g1.a;
            if ((wtcVar.d & 16) != 0) {
                while (wtcVar != null) {
                    if ((wtcVar.c & 16) != 0) {
                        bw4 bw4Var = wtcVar;
                        ?? r3 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof pze) {
                                if (((pze) bw4Var).P0()) {
                                    jc9Var.c = jc9Var.a.b - 1;
                                    return true;
                                }
                            } else if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar2 = bw4Var.p;
                                int i = 0;
                                bw4Var = bw4Var;
                                r3 = r3;
                                while (wtcVar2 != null) {
                                    if ((wtcVar2.c & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            bw4Var = wtcVar2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r3.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r3.b(wtcVar2);
                                        }
                                    }
                                    wtcVar2 = wtcVar2.f;
                                    bw4Var = bw4Var;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            bw4Var = c6o.X(r3);
                        }
                    }
                    wtcVar = wtcVar.f;
                }
            }
        }
        return false;
    }

    @Override // defpackage.sdd
    public final boolean h(wma wmaVar) {
        return true;
    }
}
