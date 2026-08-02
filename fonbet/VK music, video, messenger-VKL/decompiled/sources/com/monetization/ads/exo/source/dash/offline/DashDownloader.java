package com.monetization.ads.exo.source.dash.offline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import yads.c30;
import yads.e30;
import yads.ev0;
import yads.gd2;
import yads.gn1;
import yads.hu;
import yads.i30;
import yads.ij0;
import yads.j30;
import yads.k30;
import yads.mc3;
import yads.mp2;
import yads.oy2;
import yads.qm2;
import yads.qr;
import yads.qy2;
import yads.rr;
import yads.uo;
import yads.vo;
import yads.zb;

/* loaded from: classes14.dex */
public final class DashDownloader extends qy2 {
    private final vo j;

    public DashDownloader(gn1 gn1Var, qr qrVar, Executor executor) {
        this(gn1Var, new e30(), qrVar, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(rr rrVar, zb zbVar, long j, long j2, boolean z, ArrayList arrayList) {
        i30 d;
        DashDownloader dashDownloader = this;
        zb zbVar2 = zbVar;
        long j3 = j;
        int i = 0;
        while (i < zbVar2.c.size()) {
            mp2 mp2Var = (mp2) zbVar2.c.get(i);
            try {
                int i2 = zbVar2.b;
                d = mp2Var.d();
                if (d == null) {
                    try {
                        hu huVar = (hu) dashDownloader.a(new a(rrVar, i2, mp2Var), z);
                        d = huVar == null ? null : new k30(huVar, mp2Var.c);
                    } catch (IOException e) {
                        e = e;
                        if (z) {
                            throw e;
                        }
                        i++;
                        dashDownloader = this;
                        zbVar2 = zbVar;
                        j3 = j;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (d != null) {
                long c = d.c(j2);
                if (c == -1) {
                    throw new ij0("Unbounded segment index");
                }
                uo b = dashDownloader.j.b(mp2Var.b);
                int i3 = mc3.a;
                String str = b.a;
                qm2 qm2Var = mp2Var.e;
                if (qm2Var != null) {
                    arrayList.add(new oy2(j3, j30.a(mp2Var, str, qm2Var, 0)));
                }
                qm2 e3 = mp2Var.e();
                if (e3 != null) {
                    arrayList.add(new oy2(j3, j30.a(mp2Var, str, e3, 0)));
                }
                long b2 = d.b();
                long j4 = (b2 + c) - 1;
                for (long j5 = b2; j5 <= j4; j5++) {
                    arrayList.add(new oy2(d.a(j5) + j, j30.a(mp2Var, str, d.b(j5), 0)));
                }
                i++;
                dashDownloader = this;
                zbVar2 = zbVar;
                j3 = j;
            } else {
                try {
                    throw new ij0("Missing segment index");
                } catch (IOException e4) {
                    e = e4;
                    if (z) {
                    }
                }
            }
        }
    }

    public DashDownloader(gn1 gn1Var, e30 e30Var, qr qrVar, Executor executor) {
        super(gn1Var, e30Var, qrVar, executor);
        this.j = new vo();
    }

    @Override // yads.qy2
    public final ArrayList a(rr rrVar, ev0 ev0Var, boolean z) {
        c30 c30Var = (c30) ev0Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c30Var.m.size(); i++) {
            gd2 gd2Var = (gd2) c30Var.m.get(i);
            long a = mc3.a(gd2Var.b);
            long a2 = mc3.a(c30Var.b(i));
            List list = gd2Var.c;
            for (int i2 = 0; i2 < list.size(); i2++) {
                a(rrVar, (zb) list.get(i2), a, a2, z, arrayList);
            }
        }
        return arrayList;
    }
}
