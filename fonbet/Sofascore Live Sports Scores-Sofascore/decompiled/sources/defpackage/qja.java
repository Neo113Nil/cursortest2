package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class qja {
    public static final wj9 a = wj9.J(CampaignEx.JSON_KEY_AD_K);

    public static ArrayList a(wga wgaVar, plb plbVar, float f, lkk lkkVar, boolean z) {
        wga wgaVar2;
        plb plbVar2;
        float f2;
        lkk lkkVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (wgaVar.Z() == 6) {
            plbVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        wgaVar.k();
        while (wgaVar.t()) {
            if (wgaVar.e0(a) != 0) {
                wgaVar.g0();
            } else if (wgaVar.Z() == 1) {
                wgaVar.h();
                if (wgaVar.Z() == 7) {
                    wga wgaVar3 = wgaVar;
                    plb plbVar3 = plbVar;
                    float f3 = f;
                    lkk lkkVar3 = lkkVar;
                    boolean z3 = z;
                    nja b = pja.b(wgaVar3, plbVar3, f3, lkkVar3, false, z3);
                    wgaVar2 = wgaVar3;
                    plbVar2 = plbVar3;
                    f2 = f3;
                    lkkVar2 = lkkVar3;
                    z2 = z3;
                    arrayList.add(b);
                } else {
                    wgaVar2 = wgaVar;
                    plbVar2 = plbVar;
                    f2 = f;
                    lkkVar2 = lkkVar;
                    z2 = z;
                    while (wgaVar2.t()) {
                        arrayList.add(pja.b(wgaVar2, plbVar2, f2, lkkVar2, true, z2));
                    }
                }
                wgaVar2.m();
                wgaVar = wgaVar2;
                plbVar = plbVar2;
                f = f2;
                lkkVar = lkkVar2;
                z = z2;
            } else {
                wga wgaVar4 = wgaVar;
                arrayList.add(pja.b(wgaVar4, plbVar, f, lkkVar, false, z));
                wgaVar = wgaVar4;
            }
        }
        wgaVar.n();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            nja njaVar = (nja) arrayList.get(i2);
            i2++;
            nja njaVar2 = (nja) arrayList.get(i2);
            njaVar.h = Float.valueOf(njaVar2.g);
            if (njaVar.c == null && (obj = njaVar2.b) != null) {
                njaVar.c = obj;
                if (njaVar instanceof bbe) {
                    ((bbe) njaVar).d();
                }
            }
        }
        nja njaVar3 = (nja) arrayList.get(i);
        if ((njaVar3.b == null || njaVar3.c == null) && arrayList.size() > 1) {
            arrayList.remove(njaVar3);
        }
    }
}
