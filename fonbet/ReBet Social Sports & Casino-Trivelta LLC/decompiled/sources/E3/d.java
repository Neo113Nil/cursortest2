package E3;

import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f2984a;

    /* renamed from: b, reason: collision with root package name */
    public final char f2985b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2986c;

    /* renamed from: d, reason: collision with root package name */
    public final double f2987d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2988e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2989f;

    public d(List list, char c10, double d10, double d11, String str, String str2) {
        this.f2984a = list;
        this.f2985b = c10;
        this.f2986c = d10;
        this.f2987d = d11;
        this.f2988e = str;
        this.f2989f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f2984a;
    }

    public double b() {
        return this.f2987d;
    }

    public int hashCode() {
        return c(this.f2985b, this.f2989f, this.f2988e);
    }
}
