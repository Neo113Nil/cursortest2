package net.time4j.format.expert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final b f57885a;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final char f57886a;

        /* renamed from: b, reason: collision with root package name */
        public final b f57887b;

        /* renamed from: c, reason: collision with root package name */
        public final b f57888c;

        /* renamed from: d, reason: collision with root package name */
        public final b f57889d;

        /* renamed from: e, reason: collision with root package name */
        public final List f57890e;

        public final b j(net.time4j.tz.k kVar) {
            ArrayList arrayList = new ArrayList();
            List list = this.f57890e;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(kVar);
            return new b(this.f57886a, this.f57887b, this.f57888c, this.f57889d, arrayList);
        }

        public final b k(b bVar) {
            return new b(this.f57886a, bVar, this.f57888c, this.f57889d, this.f57890e);
        }

        public final b l(b bVar) {
            return new b(this.f57886a, this.f57887b, bVar, this.f57889d, this.f57890e);
        }

        public final b m(b bVar) {
            return new b(this.f57886a, this.f57887b, this.f57888c, bVar, this.f57890e);
        }

        public b(char c10) {
            this(c10, null, null, null, null);
        }

        public b(char c10, b bVar, b bVar2, b bVar3, List list) {
            this.f57886a = c10;
            this.f57887b = bVar;
            this.f57888c = bVar2;
            this.f57889d = bVar3;
            this.f57890e = list;
        }
    }

    public G(b bVar) {
        this.f57885a = bVar;
    }

    public static b c(b bVar, String str, int i10) {
        if (bVar == null) {
            return null;
        }
        char charAt = str.charAt(i10);
        return charAt < bVar.f57886a ? c(bVar.f57887b, str, i10) : charAt > bVar.f57886a ? c(bVar.f57889d, str, i10) : i10 < str.length() + (-1) ? c(bVar.f57888c, str, i10 + 1) : bVar;
    }

    public static b d(b bVar, String str, net.time4j.tz.k kVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty key cannot be inserted.");
        }
        if (kVar != null) {
            return e(bVar, str, kVar, 0);
        }
        throw new NullPointerException("Missing timezone id.");
    }

    public static b e(b bVar, String str, net.time4j.tz.k kVar, int i10) {
        char charAt = str.charAt(i10);
        if (bVar == null) {
            bVar = new b(charAt);
        }
        return charAt < bVar.f57886a ? bVar.k(e(bVar.f57887b, str, kVar, i10)) : charAt > bVar.f57886a ? bVar.m(e(bVar.f57889d, str, kVar, i10)) : i10 < str.length() + (-1) ? bVar.l(e(bVar.f57888c, str, kVar, i10 + 1)) : bVar.j(kVar);
    }

    public final void a(b bVar, StringBuilder sb2, List list) {
        if (bVar == null) {
            return;
        }
        a(bVar.f57887b, sb2, list);
        if (bVar.f57890e != null) {
            list.add(sb2.toString() + bVar.f57886a);
        }
        b bVar2 = bVar.f57888c;
        sb2.append(bVar.f57886a);
        a(bVar2, sb2, list);
        sb2.deleteCharAt(sb2.length() - 1);
        a(bVar.f57889d, sb2, list);
    }

    public List b(String str) {
        if (str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        b c10 = c(this.f57885a, str, 0);
        return c10 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(c10.f57890e);
    }

    public String f(CharSequence charSequence, int i10) {
        b bVar = this.f57885a;
        int length = charSequence.length();
        int i11 = i10;
        int i12 = i11;
        while (bVar != null && i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < bVar.f57886a) {
                bVar = bVar.f57887b;
            } else if (charAt > bVar.f57886a) {
                bVar = bVar.f57889d;
            } else {
                i11++;
                if (bVar.f57890e != null) {
                    i12 = i11;
                }
                bVar = bVar.f57888c;
            }
        }
        return i10 >= i12 ? "" : charSequence.subSequence(i10, i12).toString();
    }

    public String toString() {
        ArrayList<String> arrayList = new ArrayList();
        a(this.f57885a, new StringBuilder(), arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("count=");
        sb2.append(arrayList.size());
        sb2.append(",labels={");
        for (String str : arrayList) {
            sb2.append(str);
            sb2.append("=>");
            sb2.append(b(str));
            sb2.append(',');
        }
        sb2.deleteCharAt(sb2.length() - 1).append('}');
        return sb2.toString();
    }
}
