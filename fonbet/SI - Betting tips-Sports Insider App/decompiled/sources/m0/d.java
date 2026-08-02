package m0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20111b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20112c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20113d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20114e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20115f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20116g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f20110a = str;
        str2.getClass();
        this.f20111b = str2;
        this.f20112c = str3;
        list.getClass();
        this.f20113d = list;
        this.f20114e = str4;
        this.f20115f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f20116g = d9.e.n(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f20110a + ", mProviderPackage: " + this.f20111b + ", mQuery: " + this.f20112c + ", mSystemFont: " + this.f20114e + ", mVariationSettings: " + this.f20115f + ", mCertificates:");
        int i5 = 0;
        while (true) {
            List list = this.f20113d;
            if (i5 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i5);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i5++;
        }
    }
}
