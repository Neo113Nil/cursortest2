package d9;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: d9.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C6106d {
    static Rect a(List list) {
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
        return new Rect(i12, i13, i11, i14);
    }

    static List b(zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        pointArr[0] = new Point(zzfVar.zza, zzfVar.zzb);
        double d11 = zzfVar.zza;
        double d12 = zzfVar.zzc;
        Point point = new Point((int) (d11 + (d12 * cos)), (int) ((d12 * sin) + zzfVar.zzb));
        pointArr[1] = point;
        double d13 = point.x;
        int i11 = zzfVar.zzd;
        pointArr[2] = new Point((int) (d13 - (i11 * sin)), (int) ((i11 * cos) + pointArr[1].y));
        Point point2 = pointArr[0];
        int i12 = point2.x;
        Point point3 = pointArr[2];
        int i13 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i13 - point4.x) + i12, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}
