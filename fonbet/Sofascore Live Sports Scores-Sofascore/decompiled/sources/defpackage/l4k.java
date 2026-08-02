package defpackage;

import com.sofascore.model.network.response.TwitterAccount;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l4k {
    public final String a;
    public final int b;
    public final String c;
    public final TwitterAccount d;
    public final String e;
    public final gv9 f;
    public final String g;
    public final boolean h;
    public final String i;

    public l4k(String str, int i, String str2, TwitterAccount twitterAccount, String str3, gv9 gv9Var, String str4, boolean z, String str5) {
        str.getClass();
        str3.getClass();
        gv9Var.getClass();
        str5.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = twitterAccount;
        this.e = str3;
        this.f = gv9Var;
        this.g = str4;
        this.h = z;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4k)) {
            return false;
        }
        l4k l4kVar = (l4k) obj;
        return Intrinsics.c(this.a, l4kVar.a) && this.b == l4kVar.b && this.c.equals(l4kVar.c) && Intrinsics.c(this.d, l4kVar.d) && Intrinsics.c(this.e, l4kVar.e) && Intrinsics.c(this.f, l4kVar.f) && this.g.equals(l4kVar.g) && this.h == l4kVar.h && Intrinsics.c(this.i, l4kVar.i);
    }

    public final int hashCode() {
        int c = dmi.c(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        TwitterAccount twitterAccount = this.d;
        return this.i.hashCode() + dmi.e(dmi.c(ljg.d(dmi.c((c + (twitterAccount == null ? 0 : twitterAccount.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "TwitterItemUiModel(id=", this.a, ", entityId=", ", analyticsLocation=");
        q.append(this.c);
        q.append(", twitterAccount=");
        q.append(this.d);
        q.append(", text=");
        q.append(this.e);
        q.append(", mediaItems=");
        q.append(this.f);
        q.append(", time=");
        dmi.w(q, this.g, ", hasCarousel=", this.h, ", externalUrl=");
        return mz1.o(q, this.i, ")");
    }
}
