package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vt2 {
    public final Object a;
    public final String b;
    public final boolean c;
    public final ct8 d;
    public final ct8 e;
    public final lrh f;
    public final tt2 g;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ vt2(java.lang.Object r9, java.lang.String r10, boolean r11, defpackage.tc3 r12, defpackage.tc3 r13, defpackage.lrh r14, defpackage.tt2 r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r11 = 1
        L5:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto Ld
            r4 = r0
            goto Le
        Ld:
            r4 = r12
        Le:
            r11 = r16 & 16
            if (r11 == 0) goto L14
            r5 = r0
            goto L15
        L14:
            r5 = r13
        L15:
            r11 = r16 & 32
            if (r11 == 0) goto L1b
            r6 = r0
            goto L1c
        L1b:
            r6 = r14
        L1c:
            r11 = r16 & 64
            if (r11 == 0) goto L25
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L29
        L25:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt2.<init>(java.lang.Object, java.lang.String, boolean, tc3, tc3, lrh, tt2, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [ct8] */
    public static vt2 a(vt2 vt2Var, boolean z, tc3 tc3Var, int i) {
        Object obj = vt2Var.a;
        String str = vt2Var.b;
        if ((i & 4) != 0) {
            z = vt2Var.c;
        }
        boolean z2 = z;
        ct8 ct8Var = vt2Var.d;
        tc3 tc3Var2 = tc3Var;
        if ((i & 16) != 0) {
            tc3Var2 = vt2Var.e;
        }
        lrh lrhVar = vt2Var.f;
        tt2 tt2Var = vt2Var.g;
        vt2Var.getClass();
        vt2Var.getClass();
        str.getClass();
        return new vt2(obj, str, z2, ct8Var, tc3Var2, lrhVar, tt2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt2)) {
            return false;
        }
        vt2 vt2Var = (vt2) obj;
        return Intrinsics.c(this.a, vt2Var.a) && Intrinsics.c(this.b, vt2Var.b) && this.c == vt2Var.c && Intrinsics.c(this.d, vt2Var.d) && Intrinsics.c(this.e, vt2Var.e) && Intrinsics.c(this.f, vt2Var.f) && Intrinsics.c(this.g, vt2Var.g);
    }

    public final int hashCode() {
        Object obj = this.a;
        int e = dmi.e(dmi.c((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b), 31, this.c);
        ct8 ct8Var = this.d;
        int hashCode = (e + (ct8Var == null ? 0 : ct8Var.hashCode())) * 31;
        ct8 ct8Var2 = this.e;
        int hashCode2 = (hashCode + (ct8Var2 == null ? 0 : ct8Var2.hashCode())) * 31;
        lrh lrhVar = this.f;
        int hashCode3 = (hashCode2 + (lrhVar == null ? 0 : lrhVar.hashCode())) * 31;
        tt2 tt2Var = this.g;
        return (hashCode3 + (tt2Var != null ? tt2Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "ChipItem(item=" + this.a + ", label=" + this.b + ", isEnabled=" + this.c + ", iconStart=" + this.d + ", iconEnd=" + this.e + ", style=" + this.f + ", chipDropdown=" + this.g + ", chipImageBackgroundRes=null)";
    }

    public vt2(Object obj, String str, boolean z, ct8 ct8Var, ct8 ct8Var2, lrh lrhVar, tt2 tt2Var) {
        str.getClass();
        this.a = obj;
        this.b = str;
        this.c = z;
        this.d = ct8Var;
        this.e = ct8Var2;
        this.f = lrhVar;
        this.g = tt2Var;
    }
}
