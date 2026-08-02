package f9;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
final class g {
    static String a(List list) {
        Iterator it = list.iterator();
        float f7 = 0.0f;
        String str = "und";
        while (it.hasNext()) {
            zbaaw zbaawVar = (zbaaw) it.next();
            if (f7 < zbaawVar.zbc()) {
                f7 = zbaawVar.zbc();
                str = zbaawVar.zbf();
            }
        }
        return str;
    }
}
