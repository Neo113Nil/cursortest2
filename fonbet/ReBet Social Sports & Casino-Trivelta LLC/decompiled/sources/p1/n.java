package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lb.C5444x;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f62983a;

    /* renamed from: b, reason: collision with root package name */
    public final List f62984b;

    /* renamed from: c, reason: collision with root package name */
    public final List f62985c;

    public n(List list, List list2, List list3) {
        this.f62983a = list;
        this.f62984b = list2;
        this.f62985c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    public static void c(String str, List list, List list2, List list3) {
        String str2;
        list.add("");
        int i10 = 0;
        while (i10 < str.length()) {
            int indexOf = str.indexOf("$", i10);
            if (indexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i10));
                i10 = str.length();
            } else if (indexOf != i10) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i10, indexOf));
                i10 = indexOf;
            } else if (str.startsWith("$$", i10)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                i10 += 2;
            } else {
                list3.add("");
                int i11 = i10 + 1;
                int indexOf2 = str.indexOf("$", i11);
                String substring = str.substring(i11, indexOf2);
                if (substring.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith(W9.d.f13160a) && !str2.endsWith(C5444x.f55808b) && !str2.endsWith("X")) {
                            str2 = str2 + W9.d.f13160a;
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, str2);
                }
                list.add("");
                i10 = indexOf2 + 1;
            }
        }
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f62984b.size(); i11++) {
            sb2.append((String) this.f62983a.get(i11));
            if (((Integer) this.f62984b.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) this.f62984b.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) this.f62985c.get(i11), Long.valueOf(j10)));
            } else if (((Integer) this.f62984b.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) this.f62985c.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) this.f62984b.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) this.f62985c.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) this.f62983a.get(this.f62984b.size()));
        return sb2.toString();
    }
}
