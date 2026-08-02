package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.MediaContent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Drawable e;
    public final MediaContent f;

    public pf(String str, String str2, String str3, String str4, Drawable drawable, MediaContent mediaContent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = mediaContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        return Intrinsics.c(this.a, pfVar.a) && Intrinsics.c(this.b, pfVar.b) && Intrinsics.c(this.c, pfVar.c) && Intrinsics.c(this.d, pfVar.d) && Intrinsics.c(this.e, pfVar.e) && Intrinsics.c(this.f, pfVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        MediaContent mediaContent = this.f;
        return hashCode5 + (mediaContent != null ? mediaContent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("AdData(headline=", this.a, ", body=", this.b, ", callToAction=");
        bf3.v(s, this.c, ", advertiser=", this.d, ", icon=");
        s.append(this.e);
        s.append(", mediaContent=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
