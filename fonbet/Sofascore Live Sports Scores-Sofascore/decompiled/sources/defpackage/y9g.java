package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y9g {
    public v7l a;
    public ArrayList b;

    public static long a(vx4 vx4Var, long j) {
        v7l v7lVar = vx4Var.d;
        ArrayList arrayList = vx4Var.k;
        if (v7lVar instanceof s99) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            rx4 rx4Var = (rx4) arrayList.get(i);
            if (rx4Var instanceof vx4) {
                vx4 vx4Var2 = (vx4) rx4Var;
                if (vx4Var2.d != v7lVar) {
                    j2 = Math.min(j2, a(vx4Var2, vx4Var2.f + j));
                }
            }
        }
        vx4 vx4Var3 = v7lVar.i;
        vx4 vx4Var4 = v7lVar.h;
        if (vx4Var != vx4Var3) {
            return j2;
        }
        long j3 = j - v7lVar.j();
        return Math.min(Math.min(j2, a(vx4Var4, j3)), j3 - vx4Var4.f);
    }

    public static long b(vx4 vx4Var, long j) {
        v7l v7lVar = vx4Var.d;
        ArrayList arrayList = vx4Var.k;
        if (v7lVar instanceof s99) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            rx4 rx4Var = (rx4) arrayList.get(i);
            if (rx4Var instanceof vx4) {
                vx4 vx4Var2 = (vx4) rx4Var;
                if (vx4Var2.d != v7lVar) {
                    j2 = Math.max(j2, b(vx4Var2, vx4Var2.f + j));
                }
            }
        }
        vx4 vx4Var3 = v7lVar.h;
        vx4 vx4Var4 = v7lVar.i;
        if (vx4Var != vx4Var3) {
            return j2;
        }
        long j3 = v7lVar.j() + j;
        return Math.max(Math.max(j2, b(vx4Var4, j3)), j3 - vx4Var4.f);
    }
}
