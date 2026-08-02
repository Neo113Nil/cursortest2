package org.joda.time.format;

import C.o0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private int f79354a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f79355b = 2;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f79356c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79357d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f79358e;

    /* renamed from: f, reason: collision with root package name */
    private c[] f79359f;

    static class a implements p, o {

        /* renamed from: a, reason: collision with root package name */
        private final p[] f79360a;

        /* renamed from: b, reason: collision with root package name */
        private final o[] f79361b;

        a(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11 += 2) {
                Object obj = list.get(i11);
                if (obj instanceof p) {
                    if (obj instanceof a) {
                        p[] pVarArr = ((a) obj).f79360a;
                        if (pVarArr != null) {
                            for (p pVar : pVarArr) {
                                arrayList.add(pVar);
                            }
                        }
                    } else {
                        arrayList.add(obj);
                    }
                }
                Object obj2 = list.get(i11 + 1);
                if (obj2 instanceof o) {
                    if (obj2 instanceof a) {
                        o[] oVarArr = ((a) obj2).f79361b;
                        if (oVarArr != null) {
                            for (o oVar : oVarArr) {
                                arrayList2.add(oVar);
                            }
                        }
                    } else {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                this.f79360a = null;
            } else {
                this.f79360a = (p[]) arrayList.toArray(new p[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.f79361b = null;
            } else {
                this.f79361b = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
            }
        }

        @Override // org.joda.time.format.p
        public final int a(org.joda.time.k kVar) {
            p[] pVarArr = this.f79360a;
            int length = pVarArr.length;
            int i11 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i11;
                }
                i11 += pVarArr[length].a(kVar);
            }
        }

        @Override // org.joda.time.format.p
        public final void b(StringBuffer stringBuffer, org.joda.time.k kVar) {
            for (p pVar : this.f79360a) {
                pVar.b(stringBuffer, kVar);
            }
        }

        @Override // org.joda.time.format.o
        public final int c(org.joda.time.e eVar, String str, int i11) {
            o[] oVarArr = this.f79361b;
            if (oVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = oVarArr.length;
            for (int i12 = 0; i12 < length && i11 >= 0; i12++) {
                i11 = oVarArr[i12].c(eVar, str, i11);
            }
            return i11;
        }

        @Override // org.joda.time.format.p
        public final int d(org.joda.time.k kVar, int i11) {
            p[] pVarArr = this.f79360a;
            int length = pVarArr.length;
            int i12 = 0;
            while (i12 < i11) {
                length--;
                if (length < 0) {
                    break;
                }
                i12 += pVarArr[length].d(kVar, Integer.MAX_VALUE);
            }
            return i12;
        }
    }

    static class b extends d {

        /* renamed from: b, reason: collision with root package name */
        private final d f79362b;

        /* renamed from: c, reason: collision with root package name */
        private final h f79363c;

        /* renamed from: d, reason: collision with root package name */
        private final String[] f79364d;

        b(d dVar, h hVar) {
            this.f79362b = dVar;
            this.f79363c = hVar;
            HashSet hashSet = new HashSet();
            for (String str : dVar.c()) {
                hashSet.add(str + this.f79363c.c()[0]);
            }
            this.f79364d = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.n.f
        public final void a(StringBuffer stringBuffer, int i11) {
            this.f79362b.a(stringBuffer, i11);
            this.f79363c.a(stringBuffer, i11);
        }

        @Override // org.joda.time.format.n.f
        public final int b(int i11) {
            return this.f79362b.b(i11) + this.f79363c.b(i11);
        }

        @Override // org.joda.time.format.n.f
        public final String[] c() {
            return (String[]) this.f79364d.clone();
        }

        @Override // org.joda.time.format.n.f
        public final int d(int i11, String str) {
            int d11 = this.f79362b.d(i11, str);
            return (d11 < 0 || (d11 = this.f79363c.d(d11, str)) < 0 || !g(d(d11, str) - d11, i11, str)) ? d11 : ~i11;
        }

        @Override // org.joda.time.format.n.f
        public final int e(int i11, String str) {
            d dVar = this.f79362b;
            int e11 = dVar.e(i11, str);
            if (e11 >= 0) {
                int d11 = dVar.d(e11, str);
                h hVar = this.f79363c;
                int e12 = hVar.e(d11, str);
                if (e12 < 0 || !g(hVar.d(e12, str) - e11, i11, str)) {
                    return e11 > 0 ? e11 : e12;
                }
            }
            return ~i11;
        }
    }

    static abstract class d implements f {

        /* renamed from: a, reason: collision with root package name */
        private volatile String[] f79371a;

        public final void f(HashSet hashSet) {
            if (this.f79371a == null) {
                int i11 = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : c()) {
                    if (str2.length() < i11) {
                        i11 = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet2 = new HashSet();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar != null) {
                        for (String str3 : fVar.c()) {
                            if (str3.length() > i11 || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet2.add(str3);
                            }
                        }
                    }
                }
                this.f79371a = (String[]) hashSet2.toArray(new String[hashSet2.size()]);
            }
        }

        protected final boolean g(int i11, int i12, String str) {
            int i13;
            String str2;
            if (this.f79371a != null) {
                String[] strArr = this.f79371a;
                int length = strArr.length;
                int i14 = 0;
                while (i14 < length) {
                    String str3 = strArr[i14];
                    int length2 = str3.length();
                    if (i11 < length2) {
                        i13 = i12;
                        str2 = str;
                        if (str2.regionMatches(true, i13, str3, 0, length2)) {
                            return true;
                        }
                    } else {
                        i13 = i12;
                        str2 = str;
                    }
                    if (i11 == length2 && str2.regionMatches(false, i13, str3, 0, length2)) {
                        return true;
                    }
                    i14++;
                    str = str2;
                    i12 = i13;
                }
            }
            return false;
        }
    }

    static class e implements p, o {

        /* renamed from: b, reason: collision with root package name */
        static final e f79372b = new e("");

        /* renamed from: a, reason: collision with root package name */
        private final String f79373a;

        e(String str) {
            this.f79373a = str;
        }

        @Override // org.joda.time.format.p
        public final int a(org.joda.time.k kVar) {
            return this.f79373a.length();
        }

        @Override // org.joda.time.format.p
        public final void b(StringBuffer stringBuffer, org.joda.time.k kVar) {
            stringBuffer.append(this.f79373a);
        }

        @Override // org.joda.time.format.o
        public final int c(org.joda.time.e eVar, String str, int i11) {
            String str2 = this.f79373a;
            return str.regionMatches(true, i11, str2, 0, str2.length()) ? str2.length() + i11 : ~i11;
        }

        @Override // org.joda.time.format.p
        public final int d(org.joda.time.k kVar, int i11) {
            return 0;
        }
    }

    interface f {
        void a(StringBuffer stringBuffer, int i11);

        int b(int i11);

        String[] c();

        int d(int i11, String str);

        int e(int i11, String str);
    }

    static class g implements p, o {

        /* renamed from: a, reason: collision with root package name */
        private final String f79374a;

        /* renamed from: b, reason: collision with root package name */
        private final String f79375b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f79376c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f79377d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f79378e;

        /* renamed from: f, reason: collision with root package name */
        private final p f79379f;

        /* renamed from: g, reason: collision with root package name */
        private volatile p f79380g;

        /* renamed from: h, reason: collision with root package name */
        private final o f79381h;

        /* renamed from: i, reason: collision with root package name */
        private volatile o f79382i;

        g(String str, String str2, p pVar, o oVar, boolean z11) {
            this.f79374a = str;
            this.f79375b = str2;
            if (str.equals(str2)) {
                this.f79376c = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.f79376c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.f79379f = pVar;
            this.f79381h = oVar;
            this.f79377d = z11;
            this.f79378e = true;
        }

        @Override // org.joda.time.format.p
        public final int a(org.joda.time.k kVar) {
            int length;
            p pVar = this.f79379f;
            p pVar2 = this.f79380g;
            int a11 = pVar2.a(kVar) + pVar.a(kVar);
            if (!this.f79377d) {
                if (this.f79378e && pVar2.d(kVar, 1) > 0) {
                    length = this.f79374a.length();
                    return length + a11;
                }
                return a11;
            }
            if (pVar.d(kVar, 1) > 0) {
                if (this.f79378e) {
                    int d11 = pVar2.d(kVar, 2);
                    if (d11 > 0) {
                        length = (d11 > 1 ? this.f79374a : this.f79375b).length();
                    }
                } else {
                    length = this.f79374a.length();
                }
                return length + a11;
            }
            return a11;
        }

        @Override // org.joda.time.format.p
        public final void b(StringBuffer stringBuffer, org.joda.time.k kVar) {
            p pVar = this.f79379f;
            p pVar2 = this.f79380g;
            pVar.b(stringBuffer, kVar);
            if (this.f79377d) {
                if (pVar.d(kVar, 1) > 0) {
                    if (this.f79378e) {
                        int d11 = pVar2.d(kVar, 2);
                        if (d11 > 0) {
                            stringBuffer.append(d11 > 1 ? this.f79374a : this.f79375b);
                        }
                    } else {
                        stringBuffer.append(this.f79374a);
                    }
                }
            } else if (this.f79378e && pVar2.d(kVar, 1) > 0) {
                stringBuffer.append(this.f79374a);
            }
            pVar2.b(stringBuffer, kVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        @Override // org.joda.time.format.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c(org.joda.time.e eVar, String str, int i11) {
            String str2;
            int i12;
            int c11 = this.f79381h.c(eVar, str, i11);
            if (c11 < 0) {
                return c11;
            }
            if (c11 > i11) {
                String[] strArr = this.f79376c;
                int length = strArr.length;
                int i13 = 0;
                while (i13 < length) {
                    String str3 = strArr[i13];
                    if (str3 == null || str3.length() == 0) {
                        str2 = str;
                    } else {
                        str2 = str;
                        if (!str2.regionMatches(true, c11, str3, 0, str3.length())) {
                            i13++;
                            str = str2;
                        }
                    }
                    r0 = str3 != null ? str3.length() : 0;
                    c11 += r0;
                    int i14 = r0;
                    r0 = 1;
                    i12 = i14;
                    int c12 = this.f79382i.c(eVar, str2, c11);
                    return c12 >= 0 ? c12 : (r0 == 0 || c12 != c11 || i12 <= 0) ? (c12 <= c11 || r0 != 0 || this.f79377d) ? c12 : ~c11 : ~c11;
                }
            }
            str2 = str;
            i12 = -1;
            int c122 = this.f79382i.c(eVar, str2, c11);
            if (c122 >= 0) {
            }
        }

        @Override // org.joda.time.format.p
        public final int d(org.joda.time.k kVar, int i11) {
            int d11 = this.f79379f.d(kVar, i11);
            return d11 < i11 ? this.f79380g.d(kVar, i11) + d11 : d11;
        }

        final void g(p pVar, o oVar) {
            this.f79380g = pVar;
            this.f79382i = oVar;
        }
    }

    static class h extends d {

        /* renamed from: b, reason: collision with root package name */
        private final String f79383b;

        h(String str) {
            this.f79383b = str;
        }

        @Override // org.joda.time.format.n.f
        public final void a(StringBuffer stringBuffer, int i11) {
            stringBuffer.append(this.f79383b);
        }

        @Override // org.joda.time.format.n.f
        public final int b(int i11) {
            return this.f79383b.length();
        }

        @Override // org.joda.time.format.n.f
        public final String[] c() {
            return new String[]{this.f79383b};
        }

        @Override // org.joda.time.format.n.f
        public final int d(int i11, String str) {
            String str2 = this.f79383b;
            int length = str2.length();
            return (!str.regionMatches(true, i11, str2, 0, length) || g(length, i11, str)) ? ~i11 : i11 + length;
        }

        @Override // org.joda.time.format.n.f
        public final int e(int i11, String str) {
            String str2 = this.f79383b;
            int length = str2.length();
            int length2 = str.length();
            int i12 = i11;
            while (i12 < length2) {
                String str3 = str;
                if (str3.regionMatches(true, i12, str2, 0, length) && !g(length, i12, str3)) {
                    return i12;
                }
                switch (str3.charAt(i12)) {
                    case '+':
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i12++;
                        str = str3;
                }
                return ~i11;
            }
            return ~i11;
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public n() {
        ArrayList arrayList = this.f79356c;
        if (arrayList == null) {
            this.f79356c = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.f79357d = false;
        this.f79358e = false;
        this.f79359f = new c[10];
    }

    private void a(p pVar, o oVar) {
        this.f79356c.add(pVar);
        this.f79356c.add(oVar);
        this.f79357d = this.f79357d;
        this.f79358e = this.f79358e;
    }

    private void c(int i11) {
        c cVar = new c(this.f79354a, this.f79355b, i11, this.f79359f);
        a(cVar, cVar);
        this.f79359f[i11] = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.joda.time.format.n] */
    private void k(String str, String str2, boolean z11) {
        g gVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f79356c;
        if (arrayList2.size() == 0) {
            if (z11) {
                return;
            }
            e eVar = e.f79372b;
            g gVar2 = new g(str, str2, eVar, eVar, z11);
            a(gVar2, gVar2);
            return;
        }
        int size = arrayList2.size();
        while (true) {
            int i11 = size - 1;
            if (i11 < 0) {
                gVar = null;
                arrayList = arrayList2;
                break;
            } else {
                if (arrayList2.get(i11) instanceof g) {
                    gVar = (g) arrayList2.get(i11);
                    arrayList = arrayList2.subList(size, arrayList2.size());
                    break;
                }
                size -= 2;
            }
        }
        if (gVar != null && arrayList.size() == 0) {
            throw new IllegalStateException("Cannot have two adjacent separators");
        }
        Object[] p11 = p(arrayList);
        arrayList.clear();
        g gVar3 = new g(str, str2, (p) p11[0], (o) p11[1], z11);
        arrayList.add(gVar3);
        arrayList.add(gVar3);
    }

    private static Object[] p(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            e eVar = e.f79372b;
            return new Object[]{eVar, eVar};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        a aVar = new a(list);
        return new Object[]{aVar, aVar};
    }

    private static m u(List<Object> list, boolean z11, boolean z12) {
        if (z11 && z12) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof g)) {
            g gVar = (g) list.get(0);
            if (gVar.f79382i == null && gVar.f79380g == null) {
                m u11 = u(list.subList(2, size), z11, z12);
                gVar.g(u11.b(), u11.a());
                return new m(gVar, gVar);
            }
        }
        Object[] p11 = p(list);
        return z11 ? new m(null, (o) p11[1]) : z12 ? new m((p) p11[0], null) : new m((p) p11[0], (o) p11[1]);
    }

    public final void b() {
        c(3);
    }

    public final void d() {
        c(4);
    }

    public final void e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        e eVar = new e(str);
        a(eVar, eVar);
    }

    public final void f() {
        c(5);
    }

    public final void g() {
        c(1);
    }

    public final void h() {
        c(6);
    }

    public final void i() {
        c(9);
    }

    public final void j() {
        k(ProductContainerDTO.RATIO_DELIMITER, ProductContainerDTO.RATIO_DELIMITER, true);
    }

    public final void l() {
        k("T", "T", false);
    }

    public final void m(String str) {
        Object obj;
        Object obj2;
        h hVar = new h(str);
        if (this.f79356c.size() > 0) {
            obj = o0.b(2, this.f79356c);
            obj2 = o0.b(1, this.f79356c);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null || obj2 == null || obj != obj2 || !(obj instanceof c)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        c cVar = new c((c) obj, hVar);
        ArrayList arrayList = this.f79356c;
        arrayList.set(arrayList.size() - 2, cVar);
        ArrayList arrayList2 = this.f79356c;
        arrayList2.set(arrayList2.size() - 1, cVar);
        this.f79359f[cVar.f()] = cVar;
    }

    public final void n() {
        c(2);
    }

    public final void o() {
        c(0);
    }

    public final void q() {
        this.f79354a = 2;
    }

    public final void r() {
        this.f79355b = 4;
    }

    public final void s() {
        this.f79355b = 5;
    }

    public final m t() {
        m u11 = u(this.f79356c, this.f79357d, this.f79358e);
        for (c cVar : this.f79359f) {
            if (cVar != null) {
                cVar.e(this.f79359f);
            }
        }
        this.f79359f = (c[]) this.f79359f.clone();
        return u11;
    }

    static class c implements p, o {

        /* renamed from: a, reason: collision with root package name */
        private final int f79365a;

        /* renamed from: b, reason: collision with root package name */
        private final int f79366b;

        /* renamed from: c, reason: collision with root package name */
        private final int f79367c;

        /* renamed from: d, reason: collision with root package name */
        private final int f79368d;

        /* renamed from: e, reason: collision with root package name */
        private final c[] f79369e;

        /* renamed from: f, reason: collision with root package name */
        private final d f79370f;

        c(int i11, int i12, int i13, c[] cVarArr) {
            this.f79365a = i11;
            this.f79366b = i12;
            this.f79367c = 10;
            this.f79368d = i13;
            this.f79369e = cVarArr;
            this.f79370f = null;
        }

        static boolean h(PeriodType periodType, int i11) {
            switch (i11) {
                case 0:
                    return periodType.g(DurationFieldType.s());
                case 1:
                    return periodType.g(DurationFieldType.l());
                case 2:
                    return periodType.g(DurationFieldType.n());
                case 3:
                    return periodType.g(DurationFieldType.b());
                case 4:
                    return periodType.g(DurationFieldType.h());
                case 5:
                    return periodType.g(DurationFieldType.j());
                case 6:
                    return periodType.g(DurationFieldType.m());
                case 7:
                    return periodType.g(DurationFieldType.i());
                case 8:
                case 9:
                    return periodType.g(DurationFieldType.m()) || periodType.g(DurationFieldType.i());
                default:
                    return false;
            }
        }

        private static int i(int i11, int i12, String str) {
            if (i12 >= 10) {
                return Integer.parseInt(str.substring(i11, i12 + i11));
            }
            boolean z11 = false;
            if (i12 > 0) {
                int i13 = i11 + 1;
                char charAt = str.charAt(i11);
                int i14 = i12 - 1;
                if (charAt == '-') {
                    i14 = i12 - 2;
                    if (i14 >= 0) {
                        charAt = str.charAt(i13);
                        z11 = true;
                        i13 = i11 + 2;
                    }
                }
                int i15 = charAt - '0';
                while (true) {
                    int i16 = i14 - 1;
                    if (i14 <= 0) {
                        break;
                    }
                    int charAt2 = (str.charAt(i13) + ((i15 << 3) + (i15 << 1))) - 48;
                    i14 = i16;
                    i13++;
                    i15 = charAt2;
                }
                return z11 ? -i15 : i15;
            }
            return 0;
        }

        static void j(org.joda.time.e eVar, int i11, int i12) {
            switch (i11) {
                case 0:
                    eVar.g(i12);
                    break;
                case 1:
                    eVar.f(i12);
                    break;
                case 2:
                    eVar.i(i12);
                    break;
                case 3:
                    eVar.j(i12);
                    break;
                case 4:
                    eVar.d(i12);
                    break;
                case 5:
                    eVar.e(i12);
                    break;
                case 6:
                    eVar.l(i12);
                    break;
                case 7:
                    eVar.h(i12);
                    break;
            }
        }

        @Override // org.joda.time.format.p
        public final int a(org.joda.time.k kVar) {
            long g10 = g(kVar);
            if (g10 == Long.MAX_VALUE) {
                return 0;
            }
            int max = Math.max(org.joda.time.format.h.d(g10), this.f79365a);
            int i11 = this.f79368d;
            if (i11 >= 8) {
                int max2 = Math.max(max, g10 < 0 ? 5 : 4);
                max = (i11 == 9 && Math.abs(g10) % 1000 == 0) ? max2 - 3 : max2 + 1;
                g10 /= 1000;
            }
            int i12 = (int) g10;
            d dVar = this.f79370f;
            return dVar != null ? max + dVar.b(i12) : max;
        }

        @Override // org.joda.time.format.p
        public final void b(StringBuffer stringBuffer, org.joda.time.k kVar) {
            long g10 = g(kVar);
            if (g10 == Long.MAX_VALUE) {
                return;
            }
            int i11 = (int) g10;
            int i12 = this.f79368d;
            if (i12 >= 8) {
                i11 = (int) (g10 / 1000);
            }
            int length = stringBuffer.length();
            int i13 = this.f79365a;
            if (i13 <= 1) {
                try {
                    org.joda.time.format.h.c(stringBuffer, i11);
                } catch (IOException unused) {
                }
            } else {
                org.joda.time.format.h.b(stringBuffer, i11, i13);
            }
            if (i12 >= 8) {
                int abs = (int) (Math.abs(g10) % 1000);
                if (i12 == 8 || abs > 0) {
                    if (g10 < 0 && g10 > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    org.joda.time.format.h.b(stringBuffer, abs, 3);
                }
            }
            d dVar = this.f79370f;
            if (dVar != null) {
                dVar.a(stringBuffer, i11);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
        
            return ~r3;
         */
        @Override // org.joda.time.format.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c(org.joda.time.e eVar, String str, int i11) {
            int i12;
            int i13;
            char charAt;
            int i14 = i11;
            boolean z11 = this.f79366b == 4;
            if (i14 < str.length()) {
                d dVar = this.f79370f;
                int i15 = -1;
                if (dVar == null || z11) {
                    i12 = -1;
                } else {
                    i12 = dVar.e(i14, str);
                    if (i12 < 0) {
                        return !z11 ? ~i12 : i12;
                    }
                    z11 = true;
                }
                int i16 = this.f79368d;
                if (z11 || h(eVar.getPeriodType(), i16)) {
                    int i17 = this.f79367c;
                    int min = i12 > 0 ? Math.min(i17, i12 - i14) : Math.min(i17, str.length() - i14);
                    int i18 = 0;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i18 < min) {
                        int i19 = i14 + i18;
                        char charAt2 = str.charAt(i19);
                        if (i18 == 0 && (charAt2 == '-' || charAt2 == '+')) {
                            z13 = charAt2 == '-';
                            int i21 = i18 + 1;
                            if (i21 >= min || (charAt = str.charAt(i19 + 1)) < '0' || charAt > '9') {
                                break;
                            }
                            if (z13) {
                                i18 = i21;
                            } else {
                                i14++;
                            }
                            min = Math.min(min + 1, str.length() - i14);
                        } else {
                            if (charAt2 >= '0' && charAt2 <= '9') {
                                z12 = true;
                            } else {
                                if ((charAt2 != '.' && charAt2 != ',') || ((i16 != 8 && i16 != 9) || i15 >= 0)) {
                                    break;
                                }
                                min = Math.min(min + 1, str.length() - i14);
                                i15 = i19 + 1;
                            }
                            i18++;
                        }
                    }
                    if (i12 >= 0 && i14 + i18 != i12) {
                        return i14;
                    }
                    if (i16 != 8 && i16 != 9) {
                        j(eVar, i16, i(i14, i18, str));
                    } else if (i15 < 0) {
                        j(eVar, 6, i(i14, i18, str));
                        j(eVar, 7, 0);
                    } else {
                        int i22 = i(i14, (i15 - i14) - 1, str);
                        j(eVar, 6, i22);
                        int i23 = (i14 + i18) - i15;
                        if (i23 <= 0) {
                            i13 = 0;
                        } else {
                            if (i23 >= 3) {
                                i13 = i(i15, 3, str);
                            } else {
                                int i24 = i(i15, i23, str);
                                i13 = i23 == 1 ? i24 * 100 : i24 * 10;
                            }
                            if (z13 || i22 < 0) {
                                i13 = -i13;
                            }
                        }
                        j(eVar, 7, i13);
                    }
                    int i25 = i14 + i18;
                    return (i25 < 0 || dVar == null) ? i25 : dVar.d(i25, str);
                }
            } else if (z11) {
                return ~i14;
            }
            return i14;
        }

        @Override // org.joda.time.format.p
        public final int d(org.joda.time.k kVar, int i11) {
            if (i11 <= 0) {
                return 0;
            }
            return (this.f79366b == 4 || g(kVar) != Long.MAX_VALUE) ? 1 : 0;
        }

        public final void e(c[] cVarArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (c cVar : cVarArr) {
                if (cVar != null && !equals(cVar)) {
                    hashSet.add(null);
                    hashSet2.add(cVar.f79370f);
                }
            }
            d dVar = this.f79370f;
            if (dVar != null) {
                dVar.f(hashSet2);
            }
        }

        final int f() {
            return this.f79368d;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final long g(org.joda.time.k kVar) {
            int i11;
            long j11;
            int i12 = this.f79366b;
            PeriodType periodType = i12 == 4 ? null : kVar.getPeriodType();
            int i13 = this.f79368d;
            if (periodType != null && !h(periodType, i13)) {
                return Long.MAX_VALUE;
            }
            switch (i13) {
                case 0:
                    i11 = kVar.get(DurationFieldType.s());
                    j11 = i11;
                    if (j11 == 0) {
                        int i14 = 0;
                        c[] cVarArr = this.f79369e;
                        if (i12 == 1) {
                            int size = kVar.size();
                            while (i14 < size) {
                                if (kVar.getValue(i14) != 0) {
                                    return Long.MAX_VALUE;
                                }
                                i14++;
                            }
                            if (cVarArr[i13] != this) {
                                return Long.MAX_VALUE;
                            }
                            int min = Math.min(i13, 8);
                            while (true) {
                                min--;
                                if (min >= 0) {
                                    if (h(periodType, min) && cVarArr[min] != null) {
                                        return Long.MAX_VALUE;
                                    }
                                }
                            }
                        } else if (i12 == 2) {
                            int size2 = kVar.size();
                            while (i14 < size2) {
                                if (kVar.getValue(i14) != 0) {
                                    return Long.MAX_VALUE;
                                }
                                i14++;
                            }
                            if (cVarArr[i13] != this) {
                                return Long.MAX_VALUE;
                            }
                            for (int i15 = i13 + 1; i15 <= 9; i15++) {
                                if (h(periodType, i15) && cVarArr[i15] != null) {
                                    return Long.MAX_VALUE;
                                }
                            }
                        } else if (i12 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j11;
                case 1:
                    i11 = kVar.get(DurationFieldType.l());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 2:
                    i11 = kVar.get(DurationFieldType.n());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 3:
                    i11 = kVar.get(DurationFieldType.b());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 4:
                    i11 = kVar.get(DurationFieldType.h());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 5:
                    i11 = kVar.get(DurationFieldType.j());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 6:
                    i11 = kVar.get(DurationFieldType.m());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 7:
                    i11 = kVar.get(DurationFieldType.i());
                    j11 = i11;
                    if (j11 == 0) {
                    }
                    return j11;
                case 8:
                case 9:
                    j11 = (kVar.get(DurationFieldType.m()) * 1000) + kVar.get(DurationFieldType.i());
                    if (j11 == 0) {
                    }
                    return j11;
                default:
                    return Long.MAX_VALUE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [org.joda.time.format.n$b] */
        c(c cVar, h hVar) {
            this.f79365a = cVar.f79365a;
            this.f79366b = cVar.f79366b;
            this.f79367c = cVar.f79367c;
            this.f79368d = cVar.f79368d;
            this.f79369e = cVar.f79369e;
            d dVar = cVar.f79370f;
            this.f79370f = dVar != null ? new b(dVar, hVar) : hVar;
        }
    }
}
