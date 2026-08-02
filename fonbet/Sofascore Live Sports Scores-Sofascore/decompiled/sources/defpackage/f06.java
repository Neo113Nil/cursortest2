package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f06 {
    public final c9b a;
    public final e9b b;
    public final h06 c;
    public final r8b d;
    public final bnf e;
    public final gye f;
    public final rle g;
    public final boolean h;

    public f06(c9b c9bVar, e9b e9bVar, h06 h06Var, r8b r8bVar, bnf bnfVar, gye gyeVar, rle rleVar, boolean z) {
        r8bVar.getClass();
        bnfVar.getClass();
        this.a = c9bVar;
        this.b = e9bVar;
        this.c = h06Var;
        this.d = r8bVar;
        this.e = bnfVar;
        this.f = gyeVar;
        this.g = rleVar;
        this.h = z;
    }

    public static f06 a(f06 f06Var, c9b c9bVar, e9b e9bVar, h06 h06Var, r8b r8bVar, bnf bnfVar, gye gyeVar, rle rleVar, boolean z, int i) {
        if ((i & 1) != 0) {
            c9bVar = f06Var.a;
        }
        c9b c9bVar2 = c9bVar;
        if ((i & 2) != 0) {
            e9bVar = f06Var.b;
        }
        e9b e9bVar2 = e9bVar;
        if ((i & 4) != 0) {
            h06Var = f06Var.c;
        }
        h06 h06Var2 = h06Var;
        if ((i & 8) != 0) {
            r8bVar = f06Var.d;
        }
        r8b r8bVar2 = r8bVar;
        if ((i & 16) != 0) {
            bnfVar = f06Var.e;
        }
        bnf bnfVar2 = bnfVar;
        if ((i & 32) != 0) {
            gyeVar = f06Var.f;
        }
        gye gyeVar2 = gyeVar;
        rle rleVar2 = (i & 64) != 0 ? f06Var.g : rleVar;
        boolean z2 = (i & 128) != 0 ? f06Var.h : z;
        f06Var.getClass();
        e9bVar2.getClass();
        r8bVar2.getClass();
        bnfVar2.getClass();
        return new f06(c9bVar2, e9bVar2, h06Var2, r8bVar2, bnfVar2, gyeVar2, rleVar2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f06)) {
            return false;
        }
        f06 f06Var = (f06) obj;
        return Intrinsics.c(this.a, f06Var.a) && Intrinsics.c(this.b, f06Var.b) && Intrinsics.c(this.c, f06Var.c) && this.d == f06Var.d && this.e == f06Var.e && Intrinsics.c(this.f, f06Var.f) && Intrinsics.c(this.g, f06Var.g) && this.h == f06Var.h;
    }

    public final int hashCode() {
        c9b c9bVar = this.a;
        int hashCode = (this.b.hashCode() + ((c9bVar == null ? 0 : c9bVar.hashCode()) * 31)) * 31;
        h06 h06Var = this.c;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (h06Var == null ? 0 : h06Var.hashCode())) * 31)) * 31)) * 31;
        gye gyeVar = this.f;
        int hashCode3 = (hashCode2 + (gyeVar == null ? 0 : gyeVar.hashCode())) * 31;
        rle rleVar = this.g;
        return Boolean.hashCode(this.h) + ((hashCode3 + (rleVar != null ? rleVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EventFootballLineupsState(fieldUiModel=" + this.a + ", lineupsListData=" + this.b + ", chipsConfig=" + this.c + ", selectedChip=" + this.d + ", selectedRatingComponent=" + this.e + ", playersAveragePositionsData=" + this.f + ", selectedHeatmapData=" + this.g + ", isPullToRefreshing=" + this.h + ")";
    }
}
