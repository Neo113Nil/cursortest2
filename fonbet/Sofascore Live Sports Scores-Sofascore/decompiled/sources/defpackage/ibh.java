package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ibh extends o41 {
    public final abh i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public ibh(List list) {
        super(list);
        this.i = new abh();
        this.j = new Path();
    }

    @Override // defpackage.o41
    public final Object f(nja njaVar, float f) {
        abh abhVar;
        abh abhVar2;
        int i;
        int i2;
        ArrayList arrayList;
        PointF pointF;
        abh abhVar3;
        abh abhVar4;
        abh abhVar5;
        abh abhVar6 = (abh) njaVar.b;
        abh abhVar7 = (abh) njaVar.c;
        abh abhVar8 = abhVar7 == null ? abhVar6 : abhVar7;
        abh abhVar9 = this.i;
        ArrayList arrayList2 = abhVar9.a;
        if (abhVar9.b == null) {
            abhVar9.b = new PointF();
        }
        boolean z = abhVar6.c;
        ArrayList arrayList3 = abhVar6.a;
        boolean z2 = true;
        abhVar9.c = z || abhVar8.c;
        int size = arrayList3.size();
        ArrayList arrayList4 = abhVar8.a;
        if (size != arrayList4.size()) {
            ajb.b("Curves must have the same number of control points. Shape 1: " + arrayList3.size() + "\tShape 2: " + arrayList4.size());
        }
        int min = Math.min(arrayList3.size(), arrayList4.size());
        if (arrayList2.size() < min) {
            for (int size2 = arrayList2.size(); size2 < min; size2++) {
                arrayList2.add(new i74());
            }
        } else if (arrayList2.size() > min) {
            for (int size3 = arrayList2.size() - 1; size3 >= min; size3--) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        PointF pointF2 = abhVar6.b;
        PointF pointF3 = abhVar8.b;
        float f2 = pkc.f(pointF2.x, pointF3.x, f);
        float f3 = pkc.f(pointF2.y, pointF3.y, f);
        PointF pointF4 = abhVar9.b;
        if (pointF4 == null) {
            pointF4 = new PointF();
            abhVar9.b = pointF4;
        }
        pointF4.set(f2, f3);
        int size4 = arrayList2.size() - 1;
        while (size4 >= 0) {
            i74 i74Var = (i74) arrayList3.get(size4);
            i74 i74Var2 = (i74) arrayList4.get(size4);
            PointF pointF5 = i74Var.a;
            PointF pointF6 = i74Var.b;
            PointF pointF7 = i74Var.c;
            boolean z3 = z2;
            PointF pointF8 = i74Var2.a;
            PointF pointF9 = i74Var2.b;
            PointF pointF10 = i74Var2.c;
            ((i74) arrayList2.get(size4)).a.set(pkc.f(pointF5.x, pointF8.x, f), pkc.f(pointF5.y, pointF8.y, f));
            ((i74) arrayList2.get(size4)).b.set(pkc.f(pointF6.x, pointF9.x, f), pkc.f(pointF6.y, pointF9.y, f));
            ((i74) arrayList2.get(size4)).c.set(pkc.f(pointF7.x, pointF10.x, f), pkc.f(pointF7.y, pointF10.y, f));
            size4--;
            z2 = z3;
            arrayList3 = arrayList3;
            abhVar9 = abhVar9;
            arrayList4 = arrayList4;
        }
        abh abhVar10 = abhVar9;
        boolean z4 = z2;
        ArrayList arrayList5 = this.m;
        if (arrayList5 != null) {
            int size5 = arrayList5.size() - 1;
            abhVar = abhVar10;
            while (true) {
                ArrayList arrayList6 = abhVar.a;
                if (size5 < 0) {
                    break;
                }
                r7g r7gVar = (r7g) this.m.get(size5);
                r7gVar.getClass();
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) r7gVar.b.e()).floatValue();
                    if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        boolean z5 = abhVar.c;
                        int size6 = arrayList6.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            i74 i74Var3 = (i74) arrayList6.get(size6);
                            i74 i74Var4 = (i74) arrayList6.get(r7g.c(size6 - 1, arrayList6.size()));
                            PointF pointF11 = (size6 != 0 || z5) ? i74Var4.c : abhVar.b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? i74Var4.b : pointF11).equals(pointF11) && i74Var3.a.equals(pointF11) && !((abhVar.c || (size6 != 0 && size6 != arrayList6.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        abh abhVar11 = r7gVar.c;
                        if (abhVar11 == null || abhVar11.a.size() != i3) {
                            ArrayList arrayList7 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList7.add(new i74());
                            }
                            i2 = 0;
                            r7gVar.c = new abh(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList7);
                        } else {
                            i2 = 0;
                        }
                        abh abhVar12 = r7gVar.c;
                        abhVar12.c = z5;
                        PointF pointF12 = abhVar.b;
                        float f4 = pointF12.x;
                        float f5 = pointF12.y;
                        PointF pointF13 = abhVar12.b;
                        if (pointF13 == null) {
                            pointF13 = new PointF();
                            abhVar12.b = pointF13;
                        }
                        pointF13.set(f4, f5);
                        ArrayList arrayList8 = abhVar12.a;
                        boolean z6 = abhVar.c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList6.size()) {
                            i74 i74Var5 = (i74) arrayList6.get(i6);
                            i74 i74Var6 = (i74) arrayList6.get(r7g.c(i6 - 1, arrayList6.size()));
                            i74 i74Var7 = (i74) arrayList6.get(r7g.c(i6 - 2, arrayList6.size()));
                            PointF pointF14 = (i6 != 0 || z6) ? i74Var6.c : abhVar.b;
                            if (i6 != 0 || z6) {
                                arrayList = arrayList6;
                                pointF = i74Var6.b;
                            } else {
                                arrayList = arrayList6;
                                pointF = pointF14;
                            }
                            float f6 = floatValue;
                            PointF pointF15 = i74Var5.a;
                            PointF pointF16 = i74Var7.c;
                            boolean z7 = z6;
                            PointF pointF17 = i74Var5.c;
                            boolean z8 = (abhVar.c || !(i6 == 0 || i6 == arrayList.size() + (-1))) ? false : z4;
                            if (pointF.equals(pointF14) && pointF15.equals(pointF14) && !z8) {
                                float f7 = pointF14.x;
                                float f8 = f7 - pointF16.x;
                                float f9 = pointF14.y;
                                float f10 = f9 - pointF16.y;
                                float f11 = pointF17.x - f7;
                                float f12 = pointF17.y - f9;
                                abh abhVar13 = abhVar;
                                abhVar3 = abhVar6;
                                abhVar4 = abhVar7;
                                float hypot = (float) Math.hypot(f8, f10);
                                float hypot2 = (float) Math.hypot(f11, f12);
                                float min2 = Math.min(f6 / hypot, 0.5f);
                                float min3 = Math.min(f6 / hypot2, 0.5f);
                                float f13 = pointF14.x;
                                float b = me4.b(pointF16.x, f13, min2, f13);
                                float f14 = pointF14.y;
                                float b2 = me4.b(pointF16.y, f14, min2, f14);
                                float b3 = me4.b(pointF17.x, f13, min3, f13);
                                float b4 = me4.b(pointF17.y, f14, min3, f14);
                                float f15 = b - ((b - f13) * 0.5519f);
                                float f16 = b2 - ((b2 - f14) * 0.5519f);
                                float f17 = b3 - ((b3 - f13) * 0.5519f);
                                float f18 = b4 - ((b4 - f14) * 0.5519f);
                                i74 i74Var8 = (i74) arrayList8.get(r7g.c(i7 - 1, arrayList8.size()));
                                i74 i74Var9 = (i74) arrayList8.get(i7);
                                abhVar5 = abhVar13;
                                i74Var8.b.set(b, b2);
                                i74Var8.c.set(b, b2);
                                if (i6 == 0) {
                                    PointF pointF18 = abhVar12.b;
                                    if (pointF18 == null) {
                                        pointF18 = new PointF();
                                        abhVar12.b = pointF18;
                                    }
                                    pointF18.set(b, b2);
                                }
                                i74Var9.a.set(f15, f16);
                                i74 i74Var10 = (i74) arrayList8.get(i7 + 1);
                                i74Var9.b.set(f17, f18);
                                i74Var9.c.set(b3, b4);
                                i74Var10.a.set(b3, b4);
                                i7 += 2;
                            } else {
                                abhVar3 = abhVar6;
                                abhVar4 = abhVar7;
                                abhVar5 = abhVar;
                                i74 i74Var11 = (i74) arrayList8.get(r7g.c(i7 - 1, arrayList8.size()));
                                i74 i74Var12 = (i74) arrayList8.get(i7);
                                PointF pointF19 = i74Var6.b;
                                i74Var11.b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = i74Var6.c;
                                i74Var11.c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = i74Var5.a;
                                i74Var12.a.set(pointF21.x, pointF21.y);
                                i7++;
                            }
                            i6++;
                            arrayList6 = arrayList;
                            floatValue = f6;
                            z6 = z7;
                            abhVar6 = abhVar3;
                            abhVar7 = abhVar4;
                            abhVar = abhVar5;
                        }
                        abhVar = abhVar12;
                        size5 = i - 1;
                        abhVar6 = abhVar6;
                        abhVar7 = abhVar7;
                    }
                }
                i = size5;
                size5 = i - 1;
                abhVar6 = abhVar6;
                abhVar7 = abhVar7;
            }
        } else {
            abhVar = abhVar10;
        }
        abh abhVar14 = abhVar6;
        abh abhVar15 = abhVar7;
        Path path = this.j;
        pkc.e(abhVar, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        pkc.e(abhVar14, this.k);
        if (abhVar15 != null) {
            abhVar2 = abhVar15;
            pkc.e(abhVar2, this.l);
        } else {
            abhVar2 = abhVar15;
        }
        wj9 wj9Var = this.e;
        float f19 = njaVar.g;
        float floatValue2 = njaVar.h.floatValue();
        abh abhVar16 = abhVar2;
        Path path2 = this.k;
        return (Path) wj9Var.C(f19, floatValue2, path2, abhVar16 == null ? path2 : this.l, f, d(), this.d);
    }

    @Override // defpackage.o41
    public final boolean k() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
