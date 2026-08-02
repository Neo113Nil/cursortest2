package d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8207a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8208b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8209c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8210d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8211e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8212f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8213g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8214h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8215i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8216k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8217l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f8207a = num;
        this.f8208b = str;
        this.f8209c = str2;
        this.f8210d = str3;
        this.f8211e = str4;
        this.f8212f = str5;
        this.f8213g = str6;
        this.f8214h = str7;
        this.f8215i = str8;
        this.j = str9;
        this.f8216k = str10;
        this.f8217l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f8207a;
            if (num != null ? num.equals(((h) aVar).f8207a) : ((h) aVar).f8207a == null) {
                String str = this.f8208b;
                if (str != null ? str.equals(((h) aVar).f8208b) : ((h) aVar).f8208b == null) {
                    String str2 = this.f8209c;
                    if (str2 != null ? str2.equals(((h) aVar).f8209c) : ((h) aVar).f8209c == null) {
                        String str3 = this.f8210d;
                        if (str3 != null ? str3.equals(((h) aVar).f8210d) : ((h) aVar).f8210d == null) {
                            String str4 = this.f8211e;
                            if (str4 != null ? str4.equals(((h) aVar).f8211e) : ((h) aVar).f8211e == null) {
                                String str5 = this.f8212f;
                                if (str5 != null ? str5.equals(((h) aVar).f8212f) : ((h) aVar).f8212f == null) {
                                    String str6 = this.f8213g;
                                    if (str6 != null ? str6.equals(((h) aVar).f8213g) : ((h) aVar).f8213g == null) {
                                        String str7 = this.f8214h;
                                        if (str7 != null ? str7.equals(((h) aVar).f8214h) : ((h) aVar).f8214h == null) {
                                            String str8 = this.f8215i;
                                            if (str8 != null ? str8.equals(((h) aVar).f8215i) : ((h) aVar).f8215i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((h) aVar).j) : ((h) aVar).j == null) {
                                                    String str10 = this.f8216k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f8216k) : ((h) aVar).f8216k == null) {
                                                        String str11 = this.f8217l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f8217l) : ((h) aVar).f8217l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f8207a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f8208b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8209c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8210d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8211e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f8212f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f8213g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f8214h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f8215i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f8216k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f8217l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f8207a);
        sb2.append(", model=");
        sb2.append(this.f8208b);
        sb2.append(", hardware=");
        sb2.append(this.f8209c);
        sb2.append(", device=");
        sb2.append(this.f8210d);
        sb2.append(", product=");
        sb2.append(this.f8211e);
        sb2.append(", osBuild=");
        sb2.append(this.f8212f);
        sb2.append(", manufacturer=");
        sb2.append(this.f8213g);
        sb2.append(", fingerprint=");
        sb2.append(this.f8214h);
        sb2.append(", locale=");
        sb2.append(this.f8215i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f8216k);
        sb2.append(", applicationBuild=");
        return d9.e.l(sb2, this.f8217l, "}");
    }
}
