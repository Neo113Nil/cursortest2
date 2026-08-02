package q3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import r3.AbstractC6201a;
import r3.AbstractC6203c;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6110b extends AbstractC6112d implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final List f63355o;

    /* renamed from: a, reason: collision with root package name */
    public String f63356a;

    /* renamed from: b, reason: collision with root package name */
    public String f63357b;

    /* renamed from: c, reason: collision with root package name */
    public String f63358c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f63359d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f63360e;

    /* renamed from: f, reason: collision with root package name */
    public String f63361f;

    /* renamed from: g, reason: collision with root package name */
    public String f63362g;

    /* renamed from: h, reason: collision with root package name */
    public String f63363h;

    /* renamed from: i, reason: collision with root package name */
    public String f63364i;

    /* renamed from: j, reason: collision with root package name */
    public String f63365j;

    /* renamed from: k, reason: collision with root package name */
    public String f63366k;

    /* renamed from: l, reason: collision with root package name */
    public String f63367l;

    /* renamed from: m, reason: collision with root package name */
    public String f63368m;

    /* renamed from: n, reason: collision with root package name */
    public String f63369n;

    /* renamed from: q3.b$b, reason: collision with other inner class name */
    public static class C0876b extends d {
        public C0876b() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^3[47][0-9]{13}$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "American Express";
        }
    }

    /* renamed from: q3.b$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f63370a;

        /* renamed from: b, reason: collision with root package name */
        public String f63371b;

        /* renamed from: c, reason: collision with root package name */
        public String f63372c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f63373d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f63374e;

        /* renamed from: f, reason: collision with root package name */
        public String f63375f;

        /* renamed from: g, reason: collision with root package name */
        public String f63376g;

        /* renamed from: h, reason: collision with root package name */
        public String f63377h;

        /* renamed from: i, reason: collision with root package name */
        public String f63378i;

        /* renamed from: j, reason: collision with root package name */
        public String f63379j;

        /* renamed from: k, reason: collision with root package name */
        public String f63380k;

        /* renamed from: l, reason: collision with root package name */
        public String f63381l;

        /* renamed from: m, reason: collision with root package name */
        public String f63382m;

        public c(String str, Integer num, Integer num2, String str2) {
            o(str);
            this.f63373d = num;
            this.f63374e = num2;
            this.f63372c = str2;
        }

        public C6110b n() {
            return new C6110b(this);
        }

        public c o(String str) {
            this.f63371b = AbstractC6203c.c(str);
            if (str.length() == 4) {
                this.f63382m = str;
                return this;
            }
            if (str.length() > 4) {
                this.f63382m = str.substring(str.length() - 4);
                return this;
            }
            this.f63382m = str;
            return this;
        }
    }

    /* renamed from: q3.b$d */
    public static abstract class d {
        public abstract boolean a(String str);

        public abstract String toString();
    }

    /* renamed from: q3.b$e */
    public static class e extends d {
        public e() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^3(?:0[0-5]|[68][0-9])[0-9]{11}$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "Diners Club";
        }
    }

    /* renamed from: q3.b$f */
    public static class f extends d {
        public f() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^6(?:011|5[0-9]{2})[0-9]{12}$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "Discover";
        }
    }

    /* renamed from: q3.b$g */
    public static class g extends d {
        public g() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^(?:2131|1800|35[0-9]{3})[0-9]{11}$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "JCB";
        }
    }

    /* renamed from: q3.b$h */
    public static class h extends d {
        public h() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "MasterCard";
        }
    }

    /* renamed from: q3.b$i */
    public static class i extends d {
        public i() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^((506(0|1))|(507(8|9))|(6500))[0-9]{12,15}$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "VERVE";
        }
    }

    /* renamed from: q3.b$j */
    public static class j extends d {
        public j() {
        }

        @Override // q3.C6110b.d
        public boolean a(String str) {
            return str.matches("^4[0-9]{12}(?:[0-9]{3})?$");
        }

        @Override // q3.C6110b.d
        public String toString() {
            return "Visa";
        }
    }

    static {
        f63355o = Arrays.asList(new j(), new h(), new C0876b(), new e(), new g(), new i(), new f());
    }

    public String a() {
        return this.f63358c;
    }

    public Integer b() {
        return this.f63359d;
    }

    public Integer c() {
        return this.f63360e;
    }

    public String d() {
        return this.f63369n;
    }

    public String e() {
        return this.f63357b;
    }

    public String f() {
        if (!AbstractC6203c.b(this.f63368m) || AbstractC6203c.b(this.f63357b)) {
            return this.f63368m;
        }
        for (d dVar : f63355o) {
            if (dVar.a(this.f63357b)) {
                return dVar.toString();
            }
        }
        return "Unknown";
    }

    public final boolean g(String str) {
        int length = str.trim().length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt((length - 1) - i11);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int parseInt = Integer.parseInt(charAt + "");
            if (i11 % 2 == 1) {
                parseInt *= 2;
            }
            if (parseInt > 9) {
                parseInt -= 9;
            }
            i10 += parseInt;
        }
        return i10 % 10 == 0;
    }

    public void h(String str) {
        this.f63358c = str;
    }

    public void i(Integer num) {
        this.f63359d = num;
    }

    public boolean isValid() {
        return (this.f63358c == null || this.f63357b == null || this.f63359d == null || this.f63360e == null || !m() || !l() || !k()) ? false : true;
    }

    public void j(Integer num) {
        this.f63360e = num;
    }

    public boolean k() {
        if (AbstractC6203c.b(this.f63358c)) {
            return false;
        }
        String trim = this.f63358c.trim();
        return AbstractC6201a.e(trim) && ((this.f63368m == null && trim.length() >= 3 && trim.length() <= 4) || (("American Express".equals(this.f63368m) && trim.length() == 4) || (!"American Express".equals(this.f63368m) && trim.length() == 3)));
    }

    public boolean l() {
        Integer num;
        return this.f63359d != null && (num = this.f63360e) != null && AbstractC6201a.c(num.intValue(), this.f63359d.intValue()) && AbstractC6201a.d(this.f63359d.intValue());
    }

    public boolean m() {
        if (AbstractC6203c.b(this.f63357b)) {
            return false;
        }
        String replaceAll = this.f63357b.trim().replaceAll("[^0-9]", "");
        if (replaceAll.matches("^((506(0|1))|(507(8|9))|(6500))[0-9]{12,15}$")) {
            return true;
        }
        if (!AbstractC6203c.b(replaceAll) && AbstractC6201a.e(this.f63357b) && g(this.f63357b)) {
            if ("American Express".equals(this.f63368m)) {
                return replaceAll.length() == 15;
            }
            if ("Diners Club".equals(this.f63368m)) {
                return replaceAll.length() == 14;
            }
            if (replaceAll.length() == 16) {
                return true;
            }
        }
        return false;
    }

    public C6110b(c cVar) {
        this.f63357b = AbstractC6203c.d(cVar.f63371b);
        this.f63359d = cVar.f63373d;
        this.f63360e = cVar.f63374e;
        this.f63358c = AbstractC6203c.d(cVar.f63372c);
        this.f63356a = AbstractC6203c.d(cVar.f63370a);
        this.f63361f = AbstractC6203c.d(cVar.f63375f);
        this.f63362g = AbstractC6203c.d(cVar.f63376g);
        this.f63363h = AbstractC6203c.d(cVar.f63377h);
        this.f63364i = AbstractC6203c.d(cVar.f63378i);
        this.f63366k = AbstractC6203c.d(cVar.f63380k);
        this.f63365j = AbstractC6203c.d(cVar.f63379j);
        this.f63367l = AbstractC6203c.d(cVar.f63381l);
        this.f63368m = f();
        this.f63369n = cVar.f63382m;
    }
}
