package f9;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
final class f {
    static Rect a(List list, Matrix matrix) {
        Iterator it = list.iterator();
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
        }
        RectF rectF = new RectF(i12, i13, i11, i14);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    static zbpb b(zbaaj zbaajVar) {
        return zbaajVar.zbi() ? zbaajVar.zbc().zbd() : zbaajVar.zbH() ? zbaajVar.zbf().zbc() : zbaajVar.zbe();
    }

    static List c(zbpb zbpbVar) {
        double sin = Math.sin(Math.toRadians(zbpbVar.zba()));
        double cos = Math.cos(Math.toRadians(zbpbVar.zba()));
        Point point = new Point((int) (zbpbVar.zbd() + (zbpbVar.zbf() * cos)), (int) ((zbpbVar.zbf() * sin) + zbpbVar.zbe()));
        double d11 = point.x;
        double zbc = zbpbVar.zbc() * sin;
        double zbc2 = (zbpbVar.zbc() * cos) + r0[1].y;
        Point point2 = r0[0];
        int i11 = point2.x;
        Point point3 = r0[2];
        int i12 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zbpbVar.zbd(), zbpbVar.zbe()), point, new Point((int) (d11 - zbc), (int) zbc2), new Point((i12 - point4.x) + i11, (point3.y - point4.y) + point2.y)};
        return Arrays.asList(pointArr);
    }
}
