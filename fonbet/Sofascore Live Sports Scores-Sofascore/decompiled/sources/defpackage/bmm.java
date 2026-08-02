package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerEntryPointDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class bmm {
    public static yda a;
    public static yda b;
    public static yda c;
    public static v4m d;
    public static final LinkedHashSet e = new LinkedHashSet();

    public static void a(v4m v4mVar, Function1 function1) {
        boolean z;
        List<y7m> list = (List) function1.invoke(v4mVar.a);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((y7m) it.next()).b) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        boolean z2 = z;
        int c2 = sub.c(k13.r(list, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        for (y7m y7mVar : list) {
            linkedHashMap.put(y7mVar.a, Boolean.valueOf(y7mVar.b));
        }
        BlazePlayerEntryPointDelegate playerEntryPointDelegate$blazesdk_release = BlazeSDK.INSTANCE.getPlayerEntryPointDelegate$blazesdk_release();
        if (playerEntryPointDelegate$blazesdk_release != null) {
            playerEntryPointDelegate$blazesdk_release.onReadStatusChanged(v4mVar.d, v4mVar.b, v4mVar.c, z2, linkedHashMap);
        }
    }

    public static void b(String str) {
        str.getClass();
        v4m v4mVar = d;
        if (Intrinsics.c(v4mVar != null ? v4mVar.a : null, str)) {
            d = null;
        }
        o13.z(e, new cfi(str, 22));
    }

    public static void c(String str, String str2, String str3, BlazePlayerType blazePlayerType, ArrayList arrayList) {
        str.getClass();
        str3.getClass();
        blazePlayerType.getClass();
        d = new v4m(str, str2, str3, blazePlayerType, arrayList);
    }

    public static void d(String str, String str2, String str3, BlazePlayerType blazePlayerType, ArrayList arrayList, Function1 function1) {
        str3.getClass();
        blazePlayerType.getClass();
        v4m v4mVar = new v4m(str, str2, str3, blazePlayerType, arrayList);
        e.add(v4mVar);
        a(v4mVar, new fhm(function1, v4mVar, 1));
    }

    public static void e(String str) {
        str.getClass();
        o13.z(e, new cfi(str, 23));
    }
}
