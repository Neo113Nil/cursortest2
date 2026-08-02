package v;

import C.C2697q;
import C.C2698s;
import C.InterfaceC2694n;
import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import w.C10340H;
import w.C10348a;

/* loaded from: classes8.dex */
final class M0 {
    private static String a(C10340H c10340h, Integer num, List<String> list) throws C10348a {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) c10340h.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) c10340h.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    static ArrayList b(@NonNull C10138u c10138u, C2697q c2697q) throws C.P {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c10138u.f().c());
            if (c2697q == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    str = a(c10138u.f(), c2697q.c(), asList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : asList) {
                    if (!str2.equals(str)) {
                        arrayList2.add(c10138u.e(str2));
                    }
                }
                Iterator it2 = c2697q.a(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((androidx.camera.core.impl.H) ((InterfaceC2694n) it2.next())).b());
                }
            }
            return arrayList;
        } catch (C2698s e11) {
            throw new C.P(e11);
        } catch (C10348a e12) {
            throw new C.P(new C2698s(e12));
        }
    }
}
