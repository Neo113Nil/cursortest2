package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class dii extends cii {
    public static String b(String str, String str2) {
        return i5h.l(i5h.n(new oh0(str, 7), new cfi(str2, 1)), "\n");
    }

    public static String c(String str) {
        List list;
        int i;
        i8b i8bVar = new i8b(str);
        if (i8bVar.hasNext()) {
            Object next = i8bVar.next();
            if (i8bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (i8bVar.hasNext()) {
                    arrayList.add(i8bVar.next());
                }
                list = arrayList;
            } else {
                list = a.c(next);
            }
        } else {
            list = km5.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.R((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList3.add(Integer.valueOf(i));
        }
        Integer num = (Integer) CollectionsKt.p0(arrayList3);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str3 = (String) obj2;
            String C = ((i == 0 || i == size) && StringsKt.R(str3)) ? null : iii.C(intValue, str3);
            if (C != null) {
                arrayList4.add(C);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        CollectionsKt.e0(arrayList4, sb, "\n", null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        return sb.toString();
    }

    public static String d(String str) {
        List list;
        if (StringsKt.R("|")) {
            a70.p("marginPrefix must be non-blank string.");
            return null;
        }
        i8b i8bVar = new i8b(str);
        if (i8bVar.hasNext()) {
            Object next = i8bVar.next();
            if (i8bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (i8bVar.hasNext()) {
                    arrayList.add(i8bVar.next());
                }
                list = arrayList;
            } else {
                list = a.c(next);
            }
        } else {
            list = km5.a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && StringsKt.R(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && c.u(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.e0(arrayList2, sb, "\n", null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        return sb.toString();
    }
}
