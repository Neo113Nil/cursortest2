package defpackage;

import com.appsflyer.internal.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q89 implements Iterable, eia {
    public static final q89 b = new q89(new String[0]);
    public final String[] a;

    public q89(String[] strArr) {
        strArr.getClass();
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        strArr.getClass();
        int length = strArr.length - 2;
        int v = vha.v(length, 0, -2);
        if (v > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == v) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final TreeMap c() {
        phi.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String j = vha.j(this, i);
            Locale locale = Locale.US;
            String k = i.k(locale, j, locale);
            List list = (List) treeMap.get(k);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(k, list);
            }
            list.add(vha.l(this, i));
        }
        return treeMap;
    }

    public final List d(String str) {
        str.getClass();
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (c.o(str, vha.j(this, i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(vha.l(this, i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        return list == null ? km5.a : list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q89) {
            return Arrays.equals(this.a, ((q89) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(vha.j(this, i), vha.l(this, i));
        }
        return new r4(pairArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String j = vha.j(this, i);
            String l = vha.l(this, i);
            sb.append(j);
            sb.append(": ");
            if (wol.l(j)) {
                l = "██";
            }
            sb.append(l);
            sb.append("\n");
        }
        return sb.toString();
    }
}
