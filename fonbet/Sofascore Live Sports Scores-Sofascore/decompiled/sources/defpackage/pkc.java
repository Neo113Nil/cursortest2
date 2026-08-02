package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class pkc {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(abh abhVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = abhVar.b;
        ArrayList arrayList = abhVar.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            i74 i74Var = (i74) arrayList.get(i);
            PointF pointF3 = i74Var.a;
            PointF pointF4 = i74Var.b;
            PointF pointF5 = i74Var.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (abhVar.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return me4.b(f2, f, f3, f);
    }

    public static void g(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2, cja cjaVar) {
        if (ajaVar.a(i, cjaVar.getName())) {
            String name = cjaVar.getName();
            aja ajaVar3 = new aja(ajaVar2);
            ajaVar3.a.add(name);
            aja ajaVar4 = new aja(ajaVar3);
            ajaVar4.b = cjaVar;
            arrayList.add(ajaVar4);
        }
    }
}
