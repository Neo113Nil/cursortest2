package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c3h {
    public static final ilg a = k03.h;

    public static final boolean a(fze fzeVar) {
        MotionEvent a2;
        List list = fzeVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((mze) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = fzeVar.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = fzeVar.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
