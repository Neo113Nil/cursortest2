package l0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f19307c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f19308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19309b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f19308a = f19307c;
            this.f19309b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < localeArr.length; i5++) {
            Locale locale = localeArr[i5];
            if (locale == null) {
                throw new NullPointerException(d9.e.f(i5, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i5 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f19308a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f19309b = sb2.toString();
    }

    @Override // l0.i
    public final String a() {
        return this.f19309b;
    }

    @Override // l0.i
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f19308a;
        Locale[] localeArr2 = this.f19308a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < localeArr2.length; i5++) {
            if (!localeArr2[i5].equals(localeArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // l0.i
    public final Locale get(int i5) {
        if (i5 < 0) {
            return null;
        }
        Locale[] localeArr = this.f19308a;
        if (i5 < localeArr.length) {
            return localeArr[i5];
        }
        return null;
    }

    public final int hashCode() {
        int i5 = 1;
        for (Locale locale : this.f19308a) {
            i5 = (i5 * 31) + locale.hashCode();
        }
        return i5;
    }

    @Override // l0.i
    public final boolean isEmpty() {
        return this.f19308a.length == 0;
    }

    @Override // l0.i
    public final int size() {
        return this.f19308a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i5 = 0;
        while (true) {
            Locale[] localeArr = this.f19308a;
            if (i5 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i5]);
            if (i5 < localeArr.length - 1) {
                sb2.append(',');
            }
            i5++;
        }
    }
}
