package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yxl {
    public static final tpl a(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        Regex regex = new Regex("^\\d+(\\.\\d+)*");
        ArrayList b = b(regex, i, str);
        ArrayList b2 = b(regex, i, str2);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Number) b.get(i2)).intValue() < ((Number) b2.get(i2)).intValue()) {
                return tpl.OLDER;
            }
            if (((Number) b.get(i2)).intValue() > ((Number) b2.get(i2)).intValue()) {
                return tpl.NEWER;
            }
        }
        return tpl.EQUAL;
    }

    public static final ArrayList b(Regex regex, int i, String str) {
        String str2;
        List split$default;
        quf qufVar = Regex.b;
        txb b = regex.b(str);
        if (b == null || (str2 = b.getValue()) == null) {
            str2 = "";
        }
        split$default = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        List L0 = CollectionsKt.L0(arrayList, i);
        int size = i - L0.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2 = lnb.f(0, arrayList2, i2, 1)) {
        }
        return CollectionsKt.w0(arrayList2, L0);
    }

    public static /* synthetic */ tpl compareVersion$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        return a(i, str, str2);
    }

    public static boolean isVersionEqualTo$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        str.getClass();
        return str2 != null && a(i, str, str2) == tpl.EQUAL;
    }

    public static boolean isVersionInRange$default(String str, String str2, String str3, int i, int i2, Object obj) {
        boolean z;
        boolean z2;
        if ((i2 & 4) != 0) {
            i = 3;
        }
        str.getClass();
        if (str2 != null) {
            str.getClass();
            z = !(a(i, str, str2) == tpl.OLDER);
        } else {
            z = true;
        }
        if (str3 != null) {
            str.getClass();
            z2 = !(a(i, str, str3) == tpl.NEWER);
        } else {
            z2 = true;
        }
        return z && z2;
    }

    public static boolean isVersionNewerThan$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        str.getClass();
        return str2 == null || a(i, str, str2) == tpl.NEWER;
    }

    public static boolean isVersionOlderThan$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        str.getClass();
        return str2 == null || a(i, str, str2) == tpl.OLDER;
    }
}
