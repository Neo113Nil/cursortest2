package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i73 {
    public final n4 a;
    public final r9k b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final r9k f;
    public final boolean g;
    public final gv9 h;
    public final String i;

    public i73(n4 n4Var, r9k r9kVar, int i, Integer num, Integer num2, r9k r9kVar2, boolean z, gv9 gv9Var, String str) {
        gv9Var.getClass();
        this.a = n4Var;
        this.b = r9kVar;
        this.c = i;
        this.d = num;
        this.e = num2;
        this.f = r9kVar2;
        this.g = z;
        this.h = gv9Var;
        this.i = str;
    }

    public static i73 a(i73 i73Var, Integer num, r9k r9kVar, boolean z, gv9 gv9Var, String str, int i) {
        n4 n4Var = i73Var.a;
        r9k r9kVar2 = i73Var.b;
        int i2 = i73Var.c;
        Integer num2 = i73Var.d;
        if ((i & 16) != 0) {
            num = i73Var.e;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            r9kVar = i73Var.f;
        }
        r9k r9kVar3 = r9kVar;
        if ((i & 64) != 0) {
            z = i73Var.g;
        }
        boolean z2 = z;
        if ((i & 128) != 0) {
            gv9Var = i73Var.h;
        }
        gv9 gv9Var2 = gv9Var;
        r9kVar2.getClass();
        gv9Var2.getClass();
        return new i73(n4Var, r9kVar2, i2, num2, num3, r9kVar3, z2, gv9Var2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i73)) {
            return false;
        }
        i73 i73Var = (i73) obj;
        return Intrinsics.c(this.a, i73Var.a) && Intrinsics.c(this.b, i73Var.b) && this.c == i73Var.c && Intrinsics.c(this.d, i73Var.d) && Intrinsics.c(this.e, i73Var.e) && Intrinsics.c(this.f, i73Var.f) && this.g == i73Var.g && Intrinsics.c(this.h, i73Var.h) && Intrinsics.c(this.i, i73Var.i);
    }

    public final int hashCode() {
        n4 n4Var = this.a;
        int a = wv8.a(this.c, (this.b.hashCode() + ((n4Var == null ? 0 : n4Var.hashCode()) * 31)) * 31, 31);
        Integer num = this.d;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        r9k r9kVar = this.f;
        int d = ljg.d(dmi.e((hashCode2 + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31, this.g), 31, this.h);
        String str = this.i;
        return d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComparisonHeaderSlotUiModel(entityDisplay=");
        sb.append(this.a);
        sb.append(", placeholderLabel=");
        sb.append(this.b);
        sb.append(", placeholderAvatarRes=");
        sb.append(this.c);
        sb.append(", placeholderAvatarTintRes=");
        sb.append(this.d);
        sb.append(", selectedSeasonUniqueTournamentId=");
        sb.append(this.e);
        sb.append(", selectedSeasonLabel=");
        sb.append(this.f);
        sb.append(", showTournamentPlaceholder=");
        sb.append(this.g);
        sb.append(", secondaryPickerItems=");
        sb.append(this.h);
        sb.append(", selectedSecondaryPickerKey=");
        return mz1.o(sb, this.i, ")");
    }

    public i73(q9k q9kVar, int i, Integer num) {
        this(null, q9kVar, i, num, null, null, false, rlh.b, null);
    }
}
