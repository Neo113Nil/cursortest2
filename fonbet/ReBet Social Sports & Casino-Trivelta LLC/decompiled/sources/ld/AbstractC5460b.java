package ld;

import com.zendesk.util.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ld.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5460b {
    public static String a(String str) {
        return d.c(str) ? "Zendesk" : str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static char b(int i10) {
        if (i10 == 2) {
            return 'V';
        }
        if (i10 == 3) {
            return 'D';
        }
        if (i10 == 5) {
            return 'W';
        }
        if (i10 != 6) {
            return i10 != 7 ? 'I' : 'A';
        }
        return 'E';
    }

    public static List c(String str, int i10) {
        int min;
        ArrayList arrayList = new ArrayList();
        if (i10 < 1) {
            if (d.a(str)) {
                arrayList.add(str);
                return arrayList;
            }
            arrayList.add("");
            return arrayList;
        }
        if (!d.a(str)) {
            arrayList.add("");
            return arrayList;
        }
        if (str.length() < i10) {
            arrayList.add(str);
            return arrayList;
        }
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int indexOf = str.indexOf(d.f42388b, i11);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i11 + i10);
                arrayList.add(str.substring(i11, min));
                if (min >= indexOf) {
                    break;
                }
                i11 = min;
            }
            i11 = min + 1;
        }
        return arrayList;
    }
}
