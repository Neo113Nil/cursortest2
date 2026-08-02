package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qui implements Serializable {
    public final int a;
    public final int b;
    public final int c;

    public qui(List list) {
        int i;
        int i2;
        list.getClass();
        int i3 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Point2D) it.next()).getX() >= 50.0f && r7.getY() >= 66.7d && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((Point2D) it2.next()).getX() >= 50.0f && r10.getY() > 33.3d && r10.getY() < 66.7d && (i2 = i2 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((Point2D) it3.next()).getX() >= 50.0f && r0.getY() <= 33.3d && (i3 = i3 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qui)) {
            return false;
        }
        qui quiVar = (qui) obj;
        return this.a == quiVar.a && this.b == quiVar.b && this.c == quiVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return fc6.h(this.c, ")", lnb.s(this.a, this.b, "TeamAttackingSides(leftThird=", ", middleThird=", ", rightThird="));
    }
}
