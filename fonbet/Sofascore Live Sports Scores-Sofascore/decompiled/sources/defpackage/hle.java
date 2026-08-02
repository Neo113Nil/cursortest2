package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hle {
    public final int a;
    public final fle b;
    public final int c;
    public final q9k d;
    public final r9k e;
    public final r9k f;
    public final gle g;
    public final gv9 h;
    public final int i;
    public final boolean j;

    public hle(int i, fle fleVar, int i2, q9k q9kVar, r9k r9kVar, m9k m9kVar, gle gleVar, gv9 gv9Var, int i3, boolean z, int i4) {
        m9kVar = (i4 & 32) != 0 ? null : m9kVar;
        gleVar = (i4 & 64) != 0 ? null : gleVar;
        i3 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? R.color.error : i3;
        z = (i4 & 512) != 0 ? true : z;
        gv9Var.getClass();
        this.a = i;
        this.b = fleVar;
        this.c = i2;
        this.d = q9kVar;
        this.e = r9kVar;
        this.f = m9kVar;
        this.g = gleVar;
        this.h = gv9Var;
        this.i = i3;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hle)) {
            return false;
        }
        hle hleVar = (hle) obj;
        return this.a == hleVar.a && this.b == hleVar.b && this.c == hleVar.c && this.d.equals(hleVar.d) && this.e.equals(hleVar.e) && Intrinsics.c(this.f, hleVar.f) && Intrinsics.c(this.g, hleVar.g) && this.h.equals(hleVar.h) && this.i == hleVar.i && this.j == hleVar.j;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + lnb.e(wv8.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31, this.d)) * 31;
        r9k r9kVar = this.f;
        int hashCode2 = (hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31;
        gle gleVar = this.g;
        return Boolean.hashCode(this.j) + wv8.a(this.i, ljg.d((hashCode2 + (gleVar != null ? gleVar.hashCode() : 0)) * 31, 31, this.h), 31);
    }

    public final String toString() {
        return "PlayerAbsenceUIModel(id=" + this.a + ", type=" + this.b + ", iconResId=" + this.c + ", reason=" + this.d + ", description=" + this.e + ", lastUpdatedDate=" + this.f + ", affectedTournament=" + this.g + ", details=" + this.h + ", tintColorResId=" + this.i + ", shouldTintIcon=" + this.j + ")";
    }
}
