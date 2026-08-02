package net.time4j.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class w {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f58122d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Class f58123a;

    /* renamed from: b, reason: collision with root package name */
    public final List f58124b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58125c;

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f58126a;

        public b(int i10) {
            this.f58126a = i10;
        }

        public abstract int a();

        public abstract b b(int i10);
    }

    public static class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public final int f58127b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f58128c;

        @Override // net.time4j.format.w.b
        public int a() {
            return this.f58127b;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return new c(i10, this.f58127b, this.f58128c);
        }

        public c(int i10, int i11, Object obj) {
            super(i10);
            if (i11 >= 1 && i11 <= 9) {
                this.f58127b = i11;
                this.f58128c = obj;
            } else {
                throw new IllegalArgumentException("Fraction width out of bounds: " + i11);
            }
        }
    }

    public static class e extends b {

        /* renamed from: b, reason: collision with root package name */
        public final int f58130b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58131c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f58132d;

        @Override // net.time4j.format.w.b
        public int a() {
            return this.f58130b;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return new e(i10, this.f58130b, this.f58131c, this.f58132d);
        }

        public e(int i10, int i11, int i12, Object obj) {
            super(i10);
            if (i11 < 1 || i11 > 18) {
                throw new IllegalArgumentException("Min width out of bounds: " + i11);
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("Max width smaller than min width.");
            }
            if (i12 > 18) {
                throw new IllegalArgumentException("Max width out of bounds: " + i12);
            }
            if (obj == null) {
                throw new NullPointerException("Missing unit.");
            }
            this.f58130b = i11;
            this.f58131c = i12;
            this.f58132d = obj;
        }
    }

    public static class f extends b {

        /* renamed from: b, reason: collision with root package name */
        public final List f58133b;

        @Override // net.time4j.format.w.b
        public int a() {
            return 0;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            ArrayList arrayList = new ArrayList(this.f58133b);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                arrayList.set(size, bVar.b(i10));
                i10 += bVar.a();
            }
            return new f(arrayList);
        }

        public f(List list) {
            super(0);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Optional section is empty.");
            }
            Object obj = list.get(0);
            g gVar = g.f58134b;
            if (obj == gVar || list.get(list.size() - 1) == gVar) {
                throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
            }
            this.f58133b = Collections.unmodifiableList(list);
        }
    }

    public static class g extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final g f58134b = new g();

        public g() {
            super(0);
        }

        public static b c() {
            return f58134b;
        }

        @Override // net.time4j.format.w.b
        public int a() {
            return 0;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return this;
        }
    }

    public static class h extends b {

        /* renamed from: b, reason: collision with root package name */
        public final e f58135b;

        /* renamed from: c, reason: collision with root package name */
        public final b f58136c;

        /* renamed from: d, reason: collision with root package name */
        public final p f58137d;

        /* renamed from: e, reason: collision with root package name */
        public final Map f58138e;

        /* renamed from: f, reason: collision with root package name */
        public final int f58139f;

        @Override // net.time4j.format.w.b
        public int a() {
            return this.f58139f;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return new h(i10, this.f58135b, this.f58136c, this.f58137d, this.f58138e, this.f58139f);
        }

        public h(Object obj, String str, p pVar, Map map) {
            super(0);
            this.f58135b = new e(0, 1, 18, obj);
            this.f58136c = new d(str, true);
            this.f58137d = pVar;
            this.f58138e = map;
            int i10 = Integer.MAX_VALUE;
            for (String str2 : map.values()) {
                if (str2.length() < i10) {
                    i10 = str2.length();
                }
            }
            this.f58139f = i10;
        }

        public h(int i10, e eVar, b bVar, p pVar, Map map, int i11) {
            super(i10);
            this.f58135b = eVar;
            this.f58136c = bVar;
            this.f58137d = pVar;
            this.f58138e = map;
            this.f58139f = i11;
        }
    }

    public static class i extends b {

        /* renamed from: b, reason: collision with root package name */
        public final char f58140b;

        /* renamed from: c, reason: collision with root package name */
        public final char f58141c;

        @Override // net.time4j.format.w.b
        public int a() {
            return 1;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return new i(i10, this.f58140b, this.f58141c);
        }

        public i(char c10, char c11) {
            this(0, c10, c11);
        }

        public i(int i10, char c10, char c11) {
            super(i10);
            this.f58140b = c10;
            this.f58141c = c11;
        }
    }

    public static class j extends b {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58142b;

        @Override // net.time4j.format.w.b
        public int a() {
            return this.f58142b ? 1 : 0;
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return new j(i10, this.f58142b);
        }

        public j(boolean z10) {
            super(0);
            this.f58142b = z10;
        }

        public j(int i10, boolean z10) {
            super(i10);
            this.f58142b = z10;
        }
    }

    public w(Class cls, String str) {
        int i10;
        if (cls == null) {
            throw new NullPointerException("Missing unit type.");
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= length) {
                if (arrayList.size() > 1) {
                    throw new IllegalArgumentException("Open square bracket without closing one.");
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Empty or invalid pattern.");
                }
                List list = (List) arrayList.get(0);
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Missing format pattern.");
                }
                Object obj = list.get(0);
                g gVar = g.f58134b;
                if (obj == gVar || list.get(list.size() - 1) == gVar) {
                    throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
                }
                int size = list.size();
                int a10 = ((b) list.get(size - 1)).a();
                for (int i13 = size - 2; i13 >= 0; i13--) {
                    b bVar = (b) list.get(i13);
                    if (bVar == g.f58134b) {
                        a10 = 0;
                    } else {
                        list.set(i13, bVar.b(a10));
                        a10 += bVar.a();
                    }
                }
                this.f58123a = cls;
                this.f58124b = Collections.unmodifiableList(list);
                this.f58125c = str;
                return;
            }
            char charAt = str.charAt(i11);
            if (charAt == '#') {
                i12++;
            } else if (g(charAt)) {
                int i14 = i11 + 1;
                while (i14 < length && str.charAt(i14) == charAt) {
                    i14++;
                }
                d(charAt, i14 - i11, i12, arrayList);
                i11 = i14 - 1;
                i12 = 0;
            } else {
                if (i12 > 0) {
                    throw new IllegalArgumentException("Char # must be followed by unit symbol.");
                }
                if (charAt == '\'') {
                    int i15 = i11 + 1;
                    i10 = i15;
                    while (i10 < length) {
                        if (str.charAt(i10) == '\'') {
                            int i16 = i10 + 1;
                            if (i16 >= length || str.charAt(i16) != '\'') {
                                break;
                            } else {
                                i10 = i16;
                            }
                        }
                        i10++;
                    }
                    if (i10 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                    }
                    if (i15 == i10) {
                        a('\'', arrayList);
                    } else {
                        b(str.substring(i15, i10).replace("''", "'"), arrayList);
                    }
                } else if (charAt == '[') {
                    i(arrayList);
                } else if (charAt == ']') {
                    e(arrayList);
                } else {
                    char c10 = ',';
                    char c11 = '.';
                    if (charAt == '.') {
                        h(arrayList).add(new i(c11, c10));
                    } else if (charAt == ',') {
                        h(arrayList).add(new i(c10, c11));
                    } else if (charAt == '-') {
                        h(arrayList).add(new j(z10));
                    } else if (charAt == '+') {
                        h(arrayList).add(new j(z11));
                    } else if (charAt == '{') {
                        int i17 = i11 + 1;
                        i10 = i17;
                        while (i10 < length && str.charAt(i10) != '}') {
                            i10++;
                        }
                        c(str.substring(i17, i10), arrayList);
                    } else if (charAt == '|') {
                        h(arrayList).add(g.c());
                    } else {
                        a(charAt, arrayList);
                    }
                }
                i11 = i10;
            }
            i11++;
        }
    }

    public static void e(List list) {
        int size = list.size();
        int i10 = size - 1;
        if (i10 < 1) {
            throw new IllegalArgumentException("Closing square bracket without open one.");
        }
        ((List) list.get(size - 2)).add(new f((List) list.remove(i10)));
    }

    public static boolean g(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static List h(List list) {
        return (List) list.get(list.size() - 1);
    }

    public static void i(List list) {
        list.add(new ArrayList());
    }

    public final void a(char c10, List list) {
        b(String.valueOf(c10), list);
    }

    public final void b(String str, List list) {
        h(list).add(new d(str));
    }

    public final void c(String str, List list) {
        Locale locale;
        String[] split = str.split(":");
        if (split.length > 9 || split.length < 4) {
            throw new IllegalArgumentException("Plural information has wrong format: " + str);
        }
        if (split[0].length() != 1) {
            throw new IllegalArgumentException("Plural information has wrong symbol: " + str);
        }
        Object f10 = f(split[0].charAt(0));
        String[] split2 = split[2].split("-|_");
        String str2 = split2[0];
        if (split2.length > 1) {
            String str3 = split2[1];
            if (split2.length > 2) {
                String str4 = split2[2];
                if (split2.length > 3) {
                    throw new IllegalArgumentException("Plural information has wrong locale: " + str);
                }
                locale = new Locale(str2, str3, str4);
            } else {
                locale = new Locale(str2, str3);
            }
        } else {
            locale = new Locale(str2);
        }
        EnumMap enumMap = new EnumMap(n.class);
        p f11 = p.f(locale, k.CARDINALS);
        for (int i10 = 3; i10 < split.length; i10++) {
            String[] split3 = split[i10].split("=");
            if (split3.length != 2) {
                throw new IllegalArgumentException("Plural information has wrong format: " + str);
            }
            enumMap.put((EnumMap) n.valueOf(split3[0]), (n) split3[1]);
        }
        if (enumMap.isEmpty()) {
            throw new IllegalArgumentException("Missing plural forms: " + str);
        }
        if (enumMap.containsKey(n.OTHER)) {
            h(list).add(new h(f10, split[1], f11, enumMap));
            return;
        }
        throw new IllegalArgumentException("Missing plural category OTHER: " + str);
    }

    public final void d(char c10, int i10, int i11, List list) {
        Object f10 = f(c10);
        List list2 = (List) list.get(list.size() - 1);
        if (c10 != 'f') {
            list2.add(new e(0, i10, i10 + i11, f10));
        } else {
            if (i11 > 0) {
                throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
            }
            list2.add(new c(0, i10, f(c10)));
        }
    }

    public abstract Object f(char c10);

    public static class d extends b {

        /* renamed from: b, reason: collision with root package name */
        public final String f58129b;

        @Override // net.time4j.format.w.b
        public int a() {
            return this.f58129b.length();
        }

        @Override // net.time4j.format.w.b
        public b b(int i10) {
            return new d(i10, this.f58129b);
        }

        public d(String str) {
            this(str, false);
        }

        public d(String str, boolean z10) {
            super(0);
            if (!z10 && str.isEmpty()) {
                throw new IllegalArgumentException("Literal is empty.");
            }
            this.f58129b = str;
        }

        public d(int i10, String str) {
            super(i10);
            this.f58129b = str;
        }
    }
}
