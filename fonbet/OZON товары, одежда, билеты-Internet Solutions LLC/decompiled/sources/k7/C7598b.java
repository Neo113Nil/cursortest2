package k7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import i7.C7017a;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ru.ozon.app.android.R;
import s7.C9619n;
import v7.d;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7598b {

    /* renamed from: a, reason: collision with root package name */
    private final a f71022a;

    /* renamed from: b, reason: collision with root package name */
    private final a f71023b = new a();

    /* renamed from: c, reason: collision with root package name */
    final float f71024c;

    /* renamed from: d, reason: collision with root package name */
    final float f71025d;

    /* renamed from: e, reason: collision with root package name */
    final float f71026e;

    C7598b(Context context, a aVar) {
        AttributeSet attributeSet;
        int i11;
        int next;
        aVar = aVar == null ? new a() : aVar;
        int i12 = aVar.f71027a;
        if (i12 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i12);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSet = Xml.asAttributeSet(xml);
                i11 = attributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e11) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i12));
                notFoundException.initCause(e11);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i11 = 0;
        }
        TypedArray e12 = C9619n.e(context, attributeSet, C7017a.f65937c, R.attr.badgeStyle, i11 == 0 ? R.style.Widget_MaterialComponents_Badge : i11, new int[0]);
        Resources resources = context.getResources();
        this.f71024c = e12.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f71026e = e12.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f71025d = e12.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        this.f71023b.f71030d = aVar.f71030d == -2 ? 255 : aVar.f71030d;
        this.f71023b.f71034h = aVar.f71034h == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : aVar.f71034h;
        this.f71023b.f71035i = aVar.f71035i == 0 ? R.plurals.mtrl_badge_content_description : aVar.f71035i;
        this.f71023b.f71036j = aVar.f71036j == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : aVar.f71036j;
        this.f71023b.f71038l = Boolean.valueOf(aVar.f71038l == null || aVar.f71038l.booleanValue());
        this.f71023b.f71032f = aVar.f71032f == -2 ? e12.getInt(8, 4) : aVar.f71032f;
        if (aVar.f71031e != -2) {
            this.f71023b.f71031e = aVar.f71031e;
        } else if (e12.hasValue(9)) {
            this.f71023b.f71031e = e12.getInt(9, 0);
        } else {
            this.f71023b.f71031e = -1;
        }
        this.f71023b.f71028b = Integer.valueOf(aVar.f71028b == null ? v7.c.a(context, e12, 0).getDefaultColor() : aVar.f71028b.intValue());
        if (aVar.f71029c != null) {
            this.f71023b.f71029c = aVar.f71029c;
        } else if (e12.hasValue(3)) {
            this.f71023b.f71029c = Integer.valueOf(v7.c.a(context, e12, 3).getDefaultColor());
        } else {
            this.f71023b.f71029c = Integer.valueOf(new d(context, R.style.TextAppearance_MaterialComponents_Badge).h().getDefaultColor());
        }
        this.f71023b.f71037k = Integer.valueOf(aVar.f71037k == null ? e12.getInt(1, 8388661) : aVar.f71037k.intValue());
        this.f71023b.f71039m = Integer.valueOf(aVar.f71039m == null ? e12.getDimensionPixelOffset(6, 0) : aVar.f71039m.intValue());
        this.f71023b.f71040n = Integer.valueOf(aVar.f71039m == null ? e12.getDimensionPixelOffset(10, 0) : aVar.f71040n.intValue());
        this.f71023b.f71041o = Integer.valueOf(aVar.f71041o == null ? e12.getDimensionPixelOffset(7, this.f71023b.f71039m.intValue()) : aVar.f71041o.intValue());
        this.f71023b.f71042p = Integer.valueOf(aVar.f71042p == null ? e12.getDimensionPixelOffset(11, this.f71023b.f71040n.intValue()) : aVar.f71042p.intValue());
        this.f71023b.f71043q = Integer.valueOf(aVar.f71043q == null ? 0 : aVar.f71043q.intValue());
        this.f71023b.f71044r = Integer.valueOf(aVar.f71044r != null ? aVar.f71044r.intValue() : 0);
        e12.recycle();
        if (aVar.f71033g == null) {
            this.f71023b.f71033g = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f71023b.f71033g = aVar.f71033g;
        }
        this.f71022a = aVar;
    }

    final int a() {
        return this.f71023b.f71043q.intValue();
    }

    final int b() {
        return this.f71023b.f71044r.intValue();
    }

    final int c() {
        return this.f71023b.f71030d;
    }

    final int d() {
        return this.f71023b.f71028b.intValue();
    }

    final int e() {
        return this.f71023b.f71037k.intValue();
    }

    final int f() {
        return this.f71023b.f71029c.intValue();
    }

    final int g() {
        return this.f71023b.f71036j;
    }

    final CharSequence h() {
        return this.f71023b.f71034h;
    }

    final int i() {
        return this.f71023b.f71035i;
    }

    final int j() {
        return this.f71023b.f71041o.intValue();
    }

    final int k() {
        return this.f71023b.f71039m.intValue();
    }

    final int l() {
        return this.f71023b.f71032f;
    }

    final int m() {
        return this.f71023b.f71031e;
    }

    final Locale n() {
        return this.f71023b.f71033g;
    }

    final a o() {
        return this.f71022a;
    }

    final int p() {
        return this.f71023b.f71042p.intValue();
    }

    final int q() {
        return this.f71023b.f71040n.intValue();
    }

    final boolean r() {
        return this.f71023b.f71031e != -1;
    }

    final boolean s() {
        return this.f71023b.f71038l.booleanValue();
    }

    final void t(int i11) {
        this.f71022a.f71030d = i11;
        this.f71023b.f71030d = i11;
    }

    /* renamed from: k7.b$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1159a();

        /* renamed from: a, reason: collision with root package name */
        private int f71027a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f71028b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f71029c;

        /* renamed from: d, reason: collision with root package name */
        private int f71030d;

        /* renamed from: e, reason: collision with root package name */
        private int f71031e;

        /* renamed from: f, reason: collision with root package name */
        private int f71032f;

        /* renamed from: g, reason: collision with root package name */
        private Locale f71033g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f71034h;

        /* renamed from: i, reason: collision with root package name */
        private int f71035i;

        /* renamed from: j, reason: collision with root package name */
        private int f71036j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f71037k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f71038l;

        /* renamed from: m, reason: collision with root package name */
        private Integer f71039m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f71040n;

        /* renamed from: o, reason: collision with root package name */
        private Integer f71041o;

        /* renamed from: p, reason: collision with root package name */
        private Integer f71042p;

        /* renamed from: q, reason: collision with root package name */
        private Integer f71043q;

        /* renamed from: r, reason: collision with root package name */
        private Integer f71044r;

        /* renamed from: k7.b$a$a, reason: collision with other inner class name */
        final class C1159a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a() {
            this.f71030d = 255;
            this.f71031e = -2;
            this.f71032f = -2;
            this.f71038l = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeInt(this.f71027a);
            parcel.writeSerializable(this.f71028b);
            parcel.writeSerializable(this.f71029c);
            parcel.writeInt(this.f71030d);
            parcel.writeInt(this.f71031e);
            parcel.writeInt(this.f71032f);
            CharSequence charSequence = this.f71034h;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f71035i);
            parcel.writeSerializable(this.f71037k);
            parcel.writeSerializable(this.f71039m);
            parcel.writeSerializable(this.f71040n);
            parcel.writeSerializable(this.f71041o);
            parcel.writeSerializable(this.f71042p);
            parcel.writeSerializable(this.f71043q);
            parcel.writeSerializable(this.f71044r);
            parcel.writeSerializable(this.f71038l);
            parcel.writeSerializable(this.f71033g);
        }

        a(@NonNull Parcel parcel) {
            this.f71030d = 255;
            this.f71031e = -2;
            this.f71032f = -2;
            this.f71038l = Boolean.TRUE;
            this.f71027a = parcel.readInt();
            this.f71028b = (Integer) parcel.readSerializable();
            this.f71029c = (Integer) parcel.readSerializable();
            this.f71030d = parcel.readInt();
            this.f71031e = parcel.readInt();
            this.f71032f = parcel.readInt();
            this.f71034h = parcel.readString();
            this.f71035i = parcel.readInt();
            this.f71037k = (Integer) parcel.readSerializable();
            this.f71039m = (Integer) parcel.readSerializable();
            this.f71040n = (Integer) parcel.readSerializable();
            this.f71041o = (Integer) parcel.readSerializable();
            this.f71042p = (Integer) parcel.readSerializable();
            this.f71043q = (Integer) parcel.readSerializable();
            this.f71044r = (Integer) parcel.readSerializable();
            this.f71038l = (Boolean) parcel.readSerializable();
            this.f71033g = (Locale) parcel.readSerializable();
        }
    }
}
