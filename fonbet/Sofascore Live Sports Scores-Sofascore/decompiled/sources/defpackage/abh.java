package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class abh {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public abh(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        return lnb.r(sb, this.c, '}');
    }

    public abh() {
        this.a = new ArrayList();
    }
}
