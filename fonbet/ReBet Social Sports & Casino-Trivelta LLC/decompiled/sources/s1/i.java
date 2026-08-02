package s1;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: n, reason: collision with root package name */
    public static final i f64545n;

    /* renamed from: d, reason: collision with root package name */
    public final List f64546d;

    /* renamed from: e, reason: collision with root package name */
    public final List f64547e;

    /* renamed from: f, reason: collision with root package name */
    public final List f64548f;

    /* renamed from: g, reason: collision with root package name */
    public final List f64549g;

    /* renamed from: h, reason: collision with root package name */
    public final List f64550h;

    /* renamed from: i, reason: collision with root package name */
    public final List f64551i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.a f64552j;

    /* renamed from: k, reason: collision with root package name */
    public final List f64553k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f64554l;

    /* renamed from: m, reason: collision with root package name */
    public final List f64555m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f64556a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f64557b;

        /* renamed from: c, reason: collision with root package name */
        public final String f64558c;

        /* renamed from: d, reason: collision with root package name */
        public final String f64559d;

        public a(Uri uri, androidx.media3.common.a aVar, String str, String str2) {
            this.f64556a = uri;
            this.f64557b = aVar;
            this.f64558c = str;
            this.f64559d = str2;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f64560a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f64561b;

        /* renamed from: c, reason: collision with root package name */
        public final String f64562c;

        /* renamed from: d, reason: collision with root package name */
        public final String f64563d;

        /* renamed from: e, reason: collision with root package name */
        public final String f64564e;

        /* renamed from: f, reason: collision with root package name */
        public final String f64565f;

        public b(Uri uri, androidx.media3.common.a aVar, String str, String str2, String str3, String str4) {
            this.f64560a = uri;
            this.f64561b = aVar;
            this.f64562c = str;
            this.f64563d = str2;
            this.f64564e = str3;
            this.f64565f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new a.b().j0("0").W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(androidx.media3.common.a aVar) {
            return new b(this.f64560a, aVar, this.f64562c, this.f64563d, this.f64564e, this.f64565f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f64545n = new i("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public i(String str, List list, List list2, List list3, List list4, List list5, List list6, androidx.media3.common.a aVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        this.f64546d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f64547e = Collections.unmodifiableList(list2);
        this.f64548f = Collections.unmodifiableList(list3);
        this.f64549g = Collections.unmodifiableList(list4);
        this.f64550h = Collections.unmodifiableList(list5);
        this.f64551i = Collections.unmodifiableList(list6);
        this.f64552j = aVar;
        this.f64553k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f64554l = Collections.unmodifiableMap(map);
        this.f64555m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f64556a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static List d(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i12);
                    if (streamKey.f20473b == i10 && streamKey.f20474c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static i e(String str) {
        List singletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new i("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    public static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f64560a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // x1.InterfaceC6777a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i a(List list) {
        String str = this.f64566a;
        List list2 = this.f64567b;
        List d10 = d(this.f64547e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new i(str, list2, d10, list3, d(this.f64549g, 1, list), d(this.f64550h, 2, list), list3, this.f64552j, this.f64553k, this.f64568c, this.f64554l, this.f64555m);
    }
}
