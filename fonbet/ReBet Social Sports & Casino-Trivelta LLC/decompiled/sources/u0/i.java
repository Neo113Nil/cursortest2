package u0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f65918b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final j f65919a;

    public static class a {
        private static final Locale[] PSEUDO_LOCALE = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public i(j jVar) {
        this.f65919a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f65918b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f65919a.get(i10);
    }

    public boolean e() {
        return this.f65919a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f65919a.equals(((i) obj).f65919a);
    }

    public int f() {
        return this.f65919a.size();
    }

    public String g() {
        return this.f65919a.a();
    }

    public Object h() {
        return this.f65919a.b();
    }

    public int hashCode() {
        return this.f65919a.hashCode();
    }

    public String toString() {
        return this.f65919a.toString();
    }
}
