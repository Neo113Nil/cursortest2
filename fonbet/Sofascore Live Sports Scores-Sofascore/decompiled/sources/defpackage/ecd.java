package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.newNetwork.NewsProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ecd {
    public static final /* synthetic */ int h = 0;
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final NewsProvider g;

    static {
        ypa.a(ysa.c, new ivc(15));
    }

    public ecd(int i, String str, String str2, long j, String str3, String str4, NewsProvider newsProvider) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = newsProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecd)) {
            return false;
        }
        ecd ecdVar = (ecd) obj;
        return this.a == ecdVar.a && Intrinsics.c(this.b, ecdVar.b) && Intrinsics.c(this.c, ecdVar.c) && this.d == ecdVar.d && Intrinsics.c(this.e, ecdVar.e) && Intrinsics.c(this.f, ecdVar.f) && Intrinsics.c(this.g, ecdVar.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode3 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NewsProvider newsProvider = this.g;
        return hashCode4 + (newsProvider != null ? newsProvider.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "NewsPostUiModel(id=", ", title=", this.b, ", body=");
        i.n(this.d, this.c, ", publishedAtTimestamp=", t);
        bf3.v(t, ", externalUrl=", this.e, ", thumbnailUrl=", this.f);
        t.append(", newsProvider=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
