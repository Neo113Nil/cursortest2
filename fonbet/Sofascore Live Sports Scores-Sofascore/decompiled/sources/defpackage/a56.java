package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a56 implements Serializable {
    public final double a;
    public final double b;
    public final double c;

    public a56(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = CollectionsKt.w0(arrayList2, arrayList).iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Point2D point2D = (Point2D) it.next();
            if (point2D.getX() <= 33.3d) {
                if (arrayList.contains(point2D)) {
                    i++;
                } else {
                    i3++;
                }
            } else if (point2D.getX() < 66.7d) {
                i2++;
            } else if (arrayList.contains(point2D)) {
                i3++;
            } else {
                i++;
            }
        }
        double d = i + i2 + i3;
        this.a = i / d;
        this.b = i2 / d;
        this.c = i3 / d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a56.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a56 a56Var = (a56) obj;
        return this.a == a56Var.a && this.b == a56Var.b && this.c == a56Var.c;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + dmi.b(Double.hashCode(this.a) * 31, 31, this.b);
    }
}
