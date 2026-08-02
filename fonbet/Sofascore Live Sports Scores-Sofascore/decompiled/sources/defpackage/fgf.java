package defpackage;

import com.sofascore.model.odds.ProviderOdds;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fgf {
    public final int a;
    public final r9k b;
    public final int c;
    public final boolean d;
    public final gv9 e;
    public final ProviderOdds.Type f;
    public final String g;
    public final boolean h;

    public /* synthetic */ fgf(int i, r9k r9kVar, int i2, boolean z, gv9 gv9Var, ProviderOdds.Type type, String str, int i3) {
        this(i, r9kVar, i2, z, gv9Var, (i3 & 32) != 0 ? ProviderOdds.Type.STANDARD : type, (i3 & 64) != 0 ? null : str, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgf)) {
            return false;
        }
        fgf fgfVar = (fgf) obj;
        return this.a == fgfVar.a && Intrinsics.c(this.b, fgfVar.b) && this.c == fgfVar.c && this.d == fgfVar.d && Intrinsics.c(this.e, fgfVar.e) && this.f == fgfVar.f && Intrinsics.c(this.g, fgfVar.g) && this.h == fgfVar.h;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        r9k r9kVar = this.b;
        int hashCode2 = (this.f.hashCode() + ljg.d(dmi.e(wv8.a(this.c, (hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        return Boolean.hashCode(this.h) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProviderOddsUIModel(id=" + this.a + ", marketName=" + this.b + ", marketId=" + this.c + ", isLive=" + this.d + ", choices=" + this.e + ", type=" + this.f + ", choiceGroup=" + this.g + ", shouldReverseOdds=" + this.h + ")";
    }

    public fgf(int i, r9k r9kVar, int i2, boolean z, gv9 gv9Var, ProviderOdds.Type type, String str, boolean z2) {
        gv9Var.getClass();
        type.getClass();
        this.a = i;
        this.b = r9kVar;
        this.c = i2;
        this.d = z;
        this.e = gv9Var;
        this.f = type;
        this.g = str;
        this.h = z2;
    }
}
