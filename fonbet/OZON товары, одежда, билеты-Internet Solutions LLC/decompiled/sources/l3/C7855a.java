package l3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import m3.N;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7855a {

    /* renamed from: A, reason: collision with root package name */
    private static final String f72579A;

    /* renamed from: B, reason: collision with root package name */
    private static final String f72580B;

    /* renamed from: C, reason: collision with root package name */
    private static final String f72581C;

    /* renamed from: D, reason: collision with root package name */
    private static final String f72582D;

    /* renamed from: E, reason: collision with root package name */
    private static final String f72583E;

    /* renamed from: F, reason: collision with root package name */
    private static final String f72584F;

    /* renamed from: G, reason: collision with root package name */
    private static final String f72585G;

    /* renamed from: H, reason: collision with root package name */
    private static final String f72586H;

    /* renamed from: I, reason: collision with root package name */
    private static final String f72587I;

    /* renamed from: J, reason: collision with root package name */
    private static final String f72588J;

    /* renamed from: K, reason: collision with root package name */
    private static final String f72589K;

    /* renamed from: L, reason: collision with root package name */
    private static final String f72590L;

    /* renamed from: s, reason: collision with root package name */
    private static final String f72591s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f72592t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f72593u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f72594v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f72595w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f72596x;

    /* renamed from: y, reason: collision with root package name */
    private static final String f72597y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f72598z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f72599a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f72600b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f72601c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f72602d;

    /* renamed from: e, reason: collision with root package name */
    public final float f72603e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72604f;

    /* renamed from: g, reason: collision with root package name */
    public final int f72605g;

    /* renamed from: h, reason: collision with root package name */
    public final float f72606h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72607i;

    /* renamed from: j, reason: collision with root package name */
    public final float f72608j;

    /* renamed from: k, reason: collision with root package name */
    public final float f72609k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f72610l;

    /* renamed from: m, reason: collision with root package name */
    public final int f72611m;

    /* renamed from: n, reason: collision with root package name */
    public final int f72612n;

    /* renamed from: o, reason: collision with root package name */
    public final float f72613o;

    /* renamed from: p, reason: collision with root package name */
    public final int f72614p;

    /* renamed from: q, reason: collision with root package name */
    public final float f72615q;

    /* renamed from: r, reason: collision with root package name */
    public final int f72616r;

    static {
        C1210a c1210a = new C1210a();
        c1210a.o("");
        c1210a.a();
        int i11 = N.f74289a;
        f72591s = Integer.toString(0, 36);
        f72592t = Integer.toString(17, 36);
        f72593u = Integer.toString(1, 36);
        f72594v = Integer.toString(2, 36);
        f72595w = Integer.toString(3, 36);
        f72596x = Integer.toString(18, 36);
        f72597y = Integer.toString(4, 36);
        f72598z = Integer.toString(5, 36);
        f72579A = Integer.toString(6, 36);
        f72580B = Integer.toString(7, 36);
        f72581C = Integer.toString(8, 36);
        f72582D = Integer.toString(9, 36);
        f72583E = Integer.toString(10, 36);
        f72584F = Integer.toString(11, 36);
        f72585G = Integer.toString(12, 36);
        f72586H = Integer.toString(13, 36);
        f72587I = Integer.toString(14, 36);
        f72588J = Integer.toString(15, 36);
        f72589K = Integer.toString(16, 36);
        f72590L = Integer.toString(19, 36);
    }

    C7855a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i11, int i12, float f11, int i13, int i14, float f12, float f13, float f14, boolean z11, int i15, int i16, float f15, int i17) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            G10.a.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f72599a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f72599a = charSequence.toString();
        } else {
            this.f72599a = null;
        }
        this.f72600b = alignment;
        this.f72601c = alignment2;
        this.f72602d = bitmap;
        this.f72603e = f7;
        this.f72604f = i11;
        this.f72605g = i12;
        this.f72606h = f11;
        this.f72607i = i13;
        this.f72608j = f13;
        this.f72609k = f14;
        this.f72610l = z11;
        this.f72611m = i15;
        this.f72612n = i14;
        this.f72613o = f12;
        this.f72614p = i16;
        this.f72615q = f15;
        this.f72616r = i17;
    }

    public static C7855a b(Bundle bundle) {
        C1210a c1210a = new C1210a();
        CharSequence charSequence = bundle.getCharSequence(f72591s);
        if (charSequence != null) {
            c1210a.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f72592t);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    C7857c.c((Bundle) it.next(), valueOf);
                }
                c1210a.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f72593u);
        if (alignment != null) {
            c1210a.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f72594v);
        if (alignment2 != null) {
            c1210a.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f72595w);
        if (bitmap != null) {
            c1210a.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f72596x);
            if (byteArray != null) {
                c1210a.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f72597y;
        if (bundle.containsKey(str)) {
            String str2 = f72598z;
            if (bundle.containsKey(str2)) {
                c1210a.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f72579A;
        if (bundle.containsKey(str3)) {
            c1210a.i(bundle.getInt(str3));
        }
        String str4 = f72580B;
        if (bundle.containsKey(str4)) {
            c1210a.k(bundle.getFloat(str4));
        }
        String str5 = f72581C;
        if (bundle.containsKey(str5)) {
            c1210a.l(bundle.getInt(str5));
        }
        String str6 = f72583E;
        if (bundle.containsKey(str6)) {
            String str7 = f72582D;
            if (bundle.containsKey(str7)) {
                c1210a.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f72584F;
        if (bundle.containsKey(str8)) {
            c1210a.n(bundle.getFloat(str8));
        }
        String str9 = f72585G;
        if (bundle.containsKey(str9)) {
            c1210a.g(bundle.getFloat(str9));
        }
        String str10 = f72586H;
        if (bundle.containsKey(str10)) {
            c1210a.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f72587I, false)) {
            c1210a.b();
        }
        String str11 = f72588J;
        if (bundle.containsKey(str11)) {
            c1210a.r(bundle.getInt(str11));
        }
        String str12 = f72589K;
        if (bundle.containsKey(str12)) {
            c1210a.m(bundle.getFloat(str12));
        }
        String str13 = f72590L;
        if (bundle.containsKey(str13)) {
            c1210a.t(bundle.getInt(str13));
        }
        return c1210a.a();
    }

    public final C1210a a() {
        return new C1210a(this);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f72599a;
        if (charSequence != null) {
            bundle.putCharSequence(f72591s, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<Bundle> a11 = C7857c.a((Spanned) charSequence);
                if (!a11.isEmpty()) {
                    bundle.putParcelableArrayList(f72592t, a11);
                }
            }
        }
        bundle.putSerializable(f72593u, this.f72600b);
        bundle.putSerializable(f72594v, this.f72601c);
        bundle.putFloat(f72597y, this.f72603e);
        bundle.putInt(f72598z, this.f72604f);
        bundle.putInt(f72579A, this.f72605g);
        bundle.putFloat(f72580B, this.f72606h);
        bundle.putInt(f72581C, this.f72607i);
        bundle.putInt(f72582D, this.f72612n);
        bundle.putFloat(f72583E, this.f72613o);
        bundle.putFloat(f72584F, this.f72608j);
        bundle.putFloat(f72585G, this.f72609k);
        bundle.putBoolean(f72587I, this.f72610l);
        bundle.putInt(f72586H, this.f72611m);
        bundle.putInt(f72588J, this.f72614p);
        bundle.putFloat(f72589K, this.f72615q);
        bundle.putInt(f72590L, this.f72616r);
        Bitmap bitmap = this.f72602d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            G10.a.h(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f72596x, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7855a.class != obj.getClass()) {
            return false;
        }
        C7855a c7855a = (C7855a) obj;
        if (!TextUtils.equals(this.f72599a, c7855a.f72599a) || this.f72600b != c7855a.f72600b || this.f72601c != c7855a.f72601c) {
            return false;
        }
        Bitmap bitmap = c7855a.f72602d;
        Bitmap bitmap2 = this.f72602d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f72603e == c7855a.f72603e && this.f72604f == c7855a.f72604f && this.f72605g == c7855a.f72605g && this.f72606h == c7855a.f72606h && this.f72607i == c7855a.f72607i && this.f72608j == c7855a.f72608j && this.f72609k == c7855a.f72609k && this.f72610l == c7855a.f72610l && this.f72611m == c7855a.f72611m && this.f72612n == c7855a.f72612n && this.f72613o == c7855a.f72613o && this.f72614p == c7855a.f72614p && this.f72615q == c7855a.f72615q && this.f72616r == c7855a.f72616r;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(this.f72603e);
        Integer valueOf2 = Integer.valueOf(this.f72604f);
        Integer valueOf3 = Integer.valueOf(this.f72605g);
        Float valueOf4 = Float.valueOf(this.f72606h);
        Integer valueOf5 = Integer.valueOf(this.f72607i);
        Float valueOf6 = Float.valueOf(this.f72608j);
        Float valueOf7 = Float.valueOf(this.f72609k);
        Boolean valueOf8 = Boolean.valueOf(this.f72610l);
        Integer valueOf9 = Integer.valueOf(this.f72611m);
        Integer valueOf10 = Integer.valueOf(this.f72612n);
        Float valueOf11 = Float.valueOf(this.f72613o);
        Integer valueOf12 = Integer.valueOf(this.f72614p);
        Float valueOf13 = Float.valueOf(this.f72615q);
        Integer valueOf14 = Integer.valueOf(this.f72616r);
        return Objects.hash(this.f72599a, this.f72600b, this.f72601c, this.f72602d, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14);
    }

    /* renamed from: l3.a$a, reason: collision with other inner class name */
    public static final class C1210a {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f72617a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f72618b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f72619c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f72620d;

        /* renamed from: e, reason: collision with root package name */
        private float f72621e;

        /* renamed from: f, reason: collision with root package name */
        private int f72622f;

        /* renamed from: g, reason: collision with root package name */
        private int f72623g;

        /* renamed from: h, reason: collision with root package name */
        private float f72624h;

        /* renamed from: i, reason: collision with root package name */
        private int f72625i;

        /* renamed from: j, reason: collision with root package name */
        private int f72626j;

        /* renamed from: k, reason: collision with root package name */
        private float f72627k;

        /* renamed from: l, reason: collision with root package name */
        private float f72628l;

        /* renamed from: m, reason: collision with root package name */
        private float f72629m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f72630n;

        /* renamed from: o, reason: collision with root package name */
        private int f72631o;

        /* renamed from: p, reason: collision with root package name */
        private int f72632p;

        /* renamed from: q, reason: collision with root package name */
        private float f72633q;

        /* renamed from: r, reason: collision with root package name */
        private int f72634r;

        public C1210a() {
            this.f72617a = null;
            this.f72618b = null;
            this.f72619c = null;
            this.f72620d = null;
            this.f72621e = -3.4028235E38f;
            this.f72622f = LinearLayoutManager.INVALID_OFFSET;
            this.f72623g = LinearLayoutManager.INVALID_OFFSET;
            this.f72624h = -3.4028235E38f;
            this.f72625i = LinearLayoutManager.INVALID_OFFSET;
            this.f72626j = LinearLayoutManager.INVALID_OFFSET;
            this.f72627k = -3.4028235E38f;
            this.f72628l = -3.4028235E38f;
            this.f72629m = -3.4028235E38f;
            this.f72630n = false;
            this.f72631o = -16777216;
            this.f72632p = LinearLayoutManager.INVALID_OFFSET;
        }

        public final C7855a a() {
            return new C7855a(this.f72617a, this.f72619c, this.f72620d, this.f72618b, this.f72621e, this.f72622f, this.f72623g, this.f72624h, this.f72625i, this.f72626j, this.f72627k, this.f72628l, this.f72629m, this.f72630n, this.f72631o, this.f72632p, this.f72633q, this.f72634r);
        }

        public final void b() {
            this.f72630n = false;
        }

        public final int c() {
            return this.f72623g;
        }

        public final int d() {
            return this.f72625i;
        }

        public final CharSequence e() {
            return this.f72617a;
        }

        public final void f(Bitmap bitmap) {
            this.f72618b = bitmap;
            this.f72617a = null;
        }

        public final void g(float f7) {
            this.f72629m = f7;
        }

        public final void h(float f7, int i11) {
            this.f72621e = f7;
            this.f72622f = i11;
        }

        public final void i(int i11) {
            this.f72623g = i11;
        }

        public final void j(Layout.Alignment alignment) {
            this.f72620d = alignment;
        }

        public final void k(float f7) {
            this.f72624h = f7;
        }

        public final void l(int i11) {
            this.f72625i = i11;
        }

        public final void m(float f7) {
            this.f72633q = f7;
        }

        public final void n(float f7) {
            this.f72628l = f7;
        }

        public final void o(CharSequence charSequence) {
            this.f72617a = charSequence;
            this.f72618b = null;
        }

        public final void p(Layout.Alignment alignment) {
            this.f72619c = alignment;
        }

        public final void q(float f7, int i11) {
            this.f72627k = f7;
            this.f72626j = i11;
        }

        public final void r(int i11) {
            this.f72632p = i11;
        }

        public final void s(int i11) {
            this.f72631o = i11;
            this.f72630n = true;
        }

        public final void t(int i11) {
            this.f72634r = i11;
        }

        C1210a(C7855a c7855a) {
            this.f72617a = c7855a.f72599a;
            this.f72618b = c7855a.f72602d;
            this.f72619c = c7855a.f72600b;
            this.f72620d = c7855a.f72601c;
            this.f72621e = c7855a.f72603e;
            this.f72622f = c7855a.f72604f;
            this.f72623g = c7855a.f72605g;
            this.f72624h = c7855a.f72606h;
            this.f72625i = c7855a.f72607i;
            this.f72626j = c7855a.f72612n;
            this.f72627k = c7855a.f72613o;
            this.f72628l = c7855a.f72608j;
            this.f72629m = c7855a.f72609k;
            this.f72630n = c7855a.f72610l;
            this.f72631o = c7855a.f72611m;
            this.f72632p = c7855a.f72614p;
            this.f72633q = c7855a.f72615q;
            this.f72634r = c7855a.f72616r;
        }
    }
}
