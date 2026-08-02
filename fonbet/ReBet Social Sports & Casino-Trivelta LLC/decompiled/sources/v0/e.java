package v0;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f66782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66783b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66784c;

    /* renamed from: d, reason: collision with root package name */
    public final List f66785d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66786e;

    /* renamed from: f, reason: collision with root package name */
    public final String f66787f;

    /* renamed from: g, reason: collision with root package name */
    public final String f66788g;

    /* renamed from: h, reason: collision with root package name */
    public final String f66789h;

    public e(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f66785d;
    }

    public int c() {
        return this.f66786e;
    }

    public String d() {
        return this.f66789h;
    }

    public String e() {
        return this.f66782a;
    }

    public String f() {
        return this.f66783b;
    }

    public String g() {
        return this.f66784c;
    }

    public String h() {
        return this.f66787f;
    }

    public String i() {
        return this.f66788g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f66782a + ", mProviderPackage: " + this.f66783b + ", mQuery: " + this.f66784c + ", mSystemFont: " + this.f66787f + ", mVariationSettings: " + this.f66788g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f66785d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f66785d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f66786e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        this.f66782a = (String) x0.f.g(str);
        this.f66783b = (String) x0.f.g(str2);
        this.f66784c = (String) x0.f.g(str3);
        this.f66785d = (List) x0.f.g(list);
        this.f66786e = 0;
        this.f66787f = str4;
        this.f66788g = str5;
        this.f66789h = a(str, str2, str3, str4, str5);
    }
}
