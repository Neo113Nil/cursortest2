package z3;

import android.net.Uri;
import j3.C7251G;
import j3.C7270l;
import j3.C7272n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class g extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final g f107103n;

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f107104d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f107105e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f107106f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f107107g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f107108h;

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f107109i;

    /* renamed from: j, reason: collision with root package name */
    public final C7272n f107110j;

    /* renamed from: k, reason: collision with root package name */
    public final List<C7272n> f107111k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, String> f107112l;

    /* renamed from: m, reason: collision with root package name */
    public final List<C7270l> f107113m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f107114a;

        /* renamed from: b, reason: collision with root package name */
        public final C7272n f107115b;

        /* renamed from: c, reason: collision with root package name */
        public final String f107116c;

        public a(Uri uri, C7272n c7272n, String str) {
            this.f107114a = uri;
            this.f107115b = c7272n;
            this.f107116c = str;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f107117a;

        /* renamed from: b, reason: collision with root package name */
        public final C7272n f107118b;

        /* renamed from: c, reason: collision with root package name */
        public final String f107119c;

        /* renamed from: d, reason: collision with root package name */
        public final String f107120d;

        /* renamed from: e, reason: collision with root package name */
        public final String f107121e;

        /* renamed from: f, reason: collision with root package name */
        public final String f107122f;

        public b(Uri uri, C7272n c7272n, String str, String str2, String str3, String str4) {
            this.f107117a = uri;
            this.f107118b = c7272n;
            this.f107119c = str;
            this.f107120d = str2;
            this.f107121e = str3;
            this.f107122f = str4;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f107103n = new g("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public g(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, C7272n c7272n, List<C7272n> list7, boolean z11, Map<String, String> map, List<C7270l> list8) {
        super(str, list, z11);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Uri uri = list2.get(i11).f107117a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f107104d = Collections.unmodifiableList(arrayList);
        this.f107105e = Collections.unmodifiableList(list2);
        this.f107106f = Collections.unmodifiableList(list3);
        this.f107107g = Collections.unmodifiableList(list4);
        this.f107108h = Collections.unmodifiableList(list5);
        this.f107109i = Collections.unmodifiableList(list6);
        this.f107110j = c7272n;
        this.f107111k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f107112l = Collections.unmodifiableMap(map);
        this.f107113m = Collections.unmodifiableList(list8);
    }

    private static void b(ArrayList arrayList, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            Uri uri = ((a) list.get(i11)).f107114a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    private static ArrayList c(int i11, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            Object obj = list.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 < list2.size()) {
                    C7251G c7251g = (C7251G) list2.get(i13);
                    if (c7251g.f68935b == i11 && c7251g.f68936c == i12) {
                        arrayList.add(obj);
                        break;
                    }
                    i13++;
                }
            }
        }
        return arrayList;
    }

    @Override // D3.r
    public final h a(List list) {
        ArrayList c11 = c(0, this.f107105e, list);
        List list2 = Collections.EMPTY_LIST;
        return new g(this.f107123a, this.f107124b, c11, list2, c(1, this.f107107g, list), c(2, this.f107108h, list), list2, this.f107110j, this.f107111k, this.f107125c, this.f107112l, this.f107113m);
    }
}
