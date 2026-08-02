package d1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e1.AbstractC4134a;
import e1.Z;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3985a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f44857a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f44858b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f44859c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f44860d;

    /* renamed from: e, reason: collision with root package name */
    public final float f44861e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44862f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44863g;

    /* renamed from: h, reason: collision with root package name */
    public final float f44864h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44865i;

    /* renamed from: j, reason: collision with root package name */
    public final float f44866j;

    /* renamed from: k, reason: collision with root package name */
    public final float f44867k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f44868l;

    /* renamed from: m, reason: collision with root package name */
    public final int f44869m;

    /* renamed from: n, reason: collision with root package name */
    public final int f44870n;

    /* renamed from: o, reason: collision with root package name */
    public final float f44871o;

    /* renamed from: p, reason: collision with root package name */
    public final int f44872p;

    /* renamed from: q, reason: collision with root package name */
    public final float f44873q;

    /* renamed from: r, reason: collision with root package name */
    public final int f44874r;

    /* renamed from: s, reason: collision with root package name */
    public static final C3985a f44849s = new b().o("").a();

    /* renamed from: t, reason: collision with root package name */
    public static final String f44850t = Z.K0(0);

    /* renamed from: u, reason: collision with root package name */
    public static final String f44851u = Z.K0(17);

    /* renamed from: v, reason: collision with root package name */
    public static final String f44852v = Z.K0(1);

    /* renamed from: w, reason: collision with root package name */
    public static final String f44853w = Z.K0(2);

    /* renamed from: x, reason: collision with root package name */
    public static final String f44854x = Z.K0(3);

    /* renamed from: y, reason: collision with root package name */
    public static final String f44855y = Z.K0(18);

    /* renamed from: z, reason: collision with root package name */
    public static final String f44856z = Z.K0(4);

    /* renamed from: A, reason: collision with root package name */
    public static final String f44836A = Z.K0(5);

    /* renamed from: B, reason: collision with root package name */
    public static final String f44837B = Z.K0(6);

    /* renamed from: C, reason: collision with root package name */
    public static final String f44838C = Z.K0(7);

    /* renamed from: D, reason: collision with root package name */
    public static final String f44839D = Z.K0(8);

    /* renamed from: E, reason: collision with root package name */
    public static final String f44840E = Z.K0(9);

    /* renamed from: F, reason: collision with root package name */
    public static final String f44841F = Z.K0(10);

    /* renamed from: G, reason: collision with root package name */
    public static final String f44842G = Z.K0(11);

    /* renamed from: H, reason: collision with root package name */
    public static final String f44843H = Z.K0(12);

    /* renamed from: I, reason: collision with root package name */
    public static final String f44844I = Z.K0(13);

    /* renamed from: J, reason: collision with root package name */
    public static final String f44845J = Z.K0(14);

    /* renamed from: K, reason: collision with root package name */
    public static final String f44846K = Z.K0(15);

    /* renamed from: L, reason: collision with root package name */
    public static final String f44847L = Z.K0(16);

    /* renamed from: M, reason: collision with root package name */
    public static final String f44848M = Z.K0(19);

    /* renamed from: d1.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f44875a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f44876b;

        /* renamed from: c, reason: collision with root package name */
        public Layout.Alignment f44877c;

        /* renamed from: d, reason: collision with root package name */
        public Layout.Alignment f44878d;

        /* renamed from: e, reason: collision with root package name */
        public float f44879e;

        /* renamed from: f, reason: collision with root package name */
        public int f44880f;

        /* renamed from: g, reason: collision with root package name */
        public int f44881g;

        /* renamed from: h, reason: collision with root package name */
        public float f44882h;

        /* renamed from: i, reason: collision with root package name */
        public int f44883i;

        /* renamed from: j, reason: collision with root package name */
        public int f44884j;

        /* renamed from: k, reason: collision with root package name */
        public float f44885k;

        /* renamed from: l, reason: collision with root package name */
        public float f44886l;

        /* renamed from: m, reason: collision with root package name */
        public float f44887m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f44888n;

        /* renamed from: o, reason: collision with root package name */
        public int f44889o;

        /* renamed from: p, reason: collision with root package name */
        public int f44890p;

        /* renamed from: q, reason: collision with root package name */
        public float f44891q;

        /* renamed from: r, reason: collision with root package name */
        public int f44892r;

        public C3985a a() {
            return new C3985a(this.f44875a, this.f44877c, this.f44878d, this.f44876b, this.f44879e, this.f44880f, this.f44881g, this.f44882h, this.f44883i, this.f44884j, this.f44885k, this.f44886l, this.f44887m, this.f44888n, this.f44889o, this.f44890p, this.f44891q, this.f44892r);
        }

        public b b() {
            this.f44888n = false;
            return this;
        }

        public int c() {
            return this.f44881g;
        }

        public int d() {
            return this.f44883i;
        }

        public CharSequence e() {
            return this.f44875a;
        }

        public b f(Bitmap bitmap) {
            this.f44876b = bitmap;
            this.f44875a = null;
            return this;
        }

        public b g(float f10) {
            this.f44887m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f44879e = f10;
            this.f44880f = i10;
            return this;
        }

        public b i(int i10) {
            this.f44881g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f44878d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f44882h = f10;
            return this;
        }

        public b l(int i10) {
            this.f44883i = i10;
            return this;
        }

        public b m(float f10) {
            this.f44891q = f10;
            return this;
        }

        public b n(float f10) {
            this.f44886l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f44875a = charSequence;
            this.f44876b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f44877c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f44885k = f10;
            this.f44884j = i10;
            return this;
        }

        public b r(int i10) {
            this.f44890p = i10;
            return this;
        }

        public b s(int i10) {
            this.f44889o = i10;
            this.f44888n = true;
            return this;
        }

        public b t(int i10) {
            this.f44892r = i10;
            return this;
        }

        public b() {
            this.f44875a = null;
            this.f44876b = null;
            this.f44877c = null;
            this.f44878d = null;
            this.f44879e = -3.4028235E38f;
            this.f44880f = Integer.MIN_VALUE;
            this.f44881g = Integer.MIN_VALUE;
            this.f44882h = -3.4028235E38f;
            this.f44883i = Integer.MIN_VALUE;
            this.f44884j = Integer.MIN_VALUE;
            this.f44885k = -3.4028235E38f;
            this.f44886l = -3.4028235E38f;
            this.f44887m = -3.4028235E38f;
            this.f44888n = false;
            this.f44889o = -16777216;
            this.f44890p = Integer.MIN_VALUE;
        }

        public b(C3985a c3985a) {
            this.f44875a = c3985a.f44857a;
            this.f44876b = c3985a.f44860d;
            this.f44877c = c3985a.f44858b;
            this.f44878d = c3985a.f44859c;
            this.f44879e = c3985a.f44861e;
            this.f44880f = c3985a.f44862f;
            this.f44881g = c3985a.f44863g;
            this.f44882h = c3985a.f44864h;
            this.f44883i = c3985a.f44865i;
            this.f44884j = c3985a.f44870n;
            this.f44885k = c3985a.f44871o;
            this.f44886l = c3985a.f44866j;
            this.f44887m = c3985a.f44867k;
            this.f44888n = c3985a.f44868l;
            this.f44889o = c3985a.f44869m;
            this.f44890p = c3985a.f44872p;
            this.f44891q = c3985a.f44873q;
            this.f44892r = c3985a.f44874r;
        }
    }

    public static C3985a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f44850t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f44851u);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3988d.c((Bundle) it.next(), valueOf);
                }
                bVar.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f44852v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f44853w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f44854x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f44855y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f44856z;
        if (bundle.containsKey(str)) {
            String str2 = f44836A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f44837B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f44838C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f44839D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f44841F;
        if (bundle.containsKey(str6)) {
            String str7 = f44840E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f44842G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f44843H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f44844I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f44845J, false)) {
            bVar.b();
        }
        String str11 = f44846K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f44847L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = f44848M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    public b a() {
        return new b();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f44857a;
        if (charSequence != null) {
            bundle.putCharSequence(f44850t, charSequence);
            CharSequence charSequence2 = this.f44857a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> a10 = AbstractC3988d.a((Spanned) charSequence2);
                if (!a10.isEmpty()) {
                    bundle.putParcelableArrayList(f44851u, a10);
                }
            }
        }
        bundle.putSerializable(f44852v, this.f44858b);
        bundle.putSerializable(f44853w, this.f44859c);
        bundle.putFloat(f44856z, this.f44861e);
        bundle.putInt(f44836A, this.f44862f);
        bundle.putInt(f44837B, this.f44863g);
        bundle.putFloat(f44838C, this.f44864h);
        bundle.putInt(f44839D, this.f44865i);
        bundle.putInt(f44840E, this.f44870n);
        bundle.putFloat(f44841F, this.f44871o);
        bundle.putFloat(f44842G, this.f44866j);
        bundle.putFloat(f44843H, this.f44867k);
        bundle.putBoolean(f44845J, this.f44868l);
        bundle.putInt(f44844I, this.f44869m);
        bundle.putInt(f44846K, this.f44872p);
        bundle.putFloat(f44847L, this.f44873q);
        bundle.putInt(f44848M, this.f44874r);
        return bundle;
    }

    public Bundle d() {
        Bundle c10 = c();
        if (this.f44860d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC4134a.g(this.f44860d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c10.putByteArray(f44855y, byteArrayOutputStream.toByteArray());
        }
        return c10;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C3985a.class == obj.getClass()) {
            C3985a c3985a = (C3985a) obj;
            if (TextUtils.equals(this.f44857a, c3985a.f44857a) && this.f44858b == c3985a.f44858b && this.f44859c == c3985a.f44859c && ((bitmap = this.f44860d) != null ? !((bitmap2 = c3985a.f44860d) == null || !bitmap.sameAs(bitmap2)) : c3985a.f44860d == null) && this.f44861e == c3985a.f44861e && this.f44862f == c3985a.f44862f && this.f44863g == c3985a.f44863g && this.f44864h == c3985a.f44864h && this.f44865i == c3985a.f44865i && this.f44866j == c3985a.f44866j && this.f44867k == c3985a.f44867k && this.f44868l == c3985a.f44868l && this.f44869m == c3985a.f44869m && this.f44870n == c3985a.f44870n && this.f44871o == c3985a.f44871o && this.f44872p == c3985a.f44872p && this.f44873q == c3985a.f44873q && this.f44874r == c3985a.f44874r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f44857a, this.f44858b, this.f44859c, this.f44860d, Float.valueOf(this.f44861e), Integer.valueOf(this.f44862f), Integer.valueOf(this.f44863g), Float.valueOf(this.f44864h), Integer.valueOf(this.f44865i), Float.valueOf(this.f44866j), Float.valueOf(this.f44867k), Boolean.valueOf(this.f44868l), Integer.valueOf(this.f44869m), Integer.valueOf(this.f44870n), Float.valueOf(this.f44871o), Integer.valueOf(this.f44872p), Float.valueOf(this.f44873q), Integer.valueOf(this.f44874r));
    }

    public C3985a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16) {
        if (charSequence == null) {
            AbstractC4134a.e(bitmap);
        } else {
            AbstractC4134a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f44857a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f44857a = charSequence.toString();
        } else {
            this.f44857a = null;
        }
        this.f44858b = alignment;
        this.f44859c = alignment2;
        this.f44860d = bitmap;
        this.f44861e = f10;
        this.f44862f = i10;
        this.f44863g = i11;
        this.f44864h = f11;
        this.f44865i = i12;
        this.f44866j = f13;
        this.f44867k = f14;
        this.f44868l = z10;
        this.f44869m = i14;
        this.f44870n = i13;
        this.f44871o = f12;
        this.f44872p = i15;
        this.f44873q = f15;
        this.f44874r = i16;
    }
}
