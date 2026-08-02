package defpackage;

import android.graphics.PointF;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.setting.i;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bbh implements lkk {
    public static final bbh a = new bbh();
    public static final wj9 b = wj9.J(a.q, "v", i.a, "o");

    @Override // defpackage.lkk
    public final Object i(wga wgaVar, float f) {
        if (wgaVar.Z() == 1) {
            wgaVar.h();
        }
        wgaVar.k();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (wgaVar.t()) {
            int e0 = wgaVar.e0(b);
            if (e0 == 0) {
                z = wgaVar.C();
            } else if (e0 == 1) {
                arrayList = nha.c(wgaVar, f);
            } else if (e0 == 2) {
                arrayList2 = nha.c(wgaVar, f);
            } else if (e0 != 3) {
                wgaVar.f0();
                wgaVar.g0();
            } else {
                arrayList3 = nha.c(wgaVar, f);
            }
        }
        wgaVar.n();
        if (wgaVar.Z() == 2) {
            wgaVar.m();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            a70.p("Shape data was missing information.");
            return null;
        }
        if (arrayList.isEmpty()) {
            return new abh(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i2 = i - 1;
            arrayList4.add(new i74(pkc.a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), pkc.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i3 = size - 1;
            arrayList4.add(new i74(pkc.a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), pkc.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new abh(pointF, z, arrayList4);
    }
}
