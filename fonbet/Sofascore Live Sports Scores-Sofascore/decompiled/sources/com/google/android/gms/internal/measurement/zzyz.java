package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.lnb;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzyz {
    public static final zzyz e;
    public static final zzyz[] f;
    public static final /* synthetic */ zzyz[] g;
    public final char a;
    public final zzzb b;
    public final int c;
    public final String d;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF0;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF3;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    static {
        /*
            com.google.android.gms.internal.measurement.zzyz r0 = new com.google.android.gms.internal.measurement.zzyz
            r3 = 115(0x73, float:1.61E-43)
            r6 = 1
            java.lang.String r1 = "STRING"
            r2 = 0
            com.google.android.gms.internal.measurement.zzzb r4 = com.google.android.gms.internal.measurement.zzzb.GENERAL
            java.lang.String r5 = "-#"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.measurement.zzyz r1 = new com.google.android.gms.internal.measurement.zzyz
            r4 = 98
            r7 = 1
            java.lang.String r2 = "BOOLEAN"
            r3 = 1
            com.google.android.gms.internal.measurement.zzzb r5 = com.google.android.gms.internal.measurement.zzzb.BOOLEAN
            java.lang.String r6 = "-"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.gms.internal.measurement.zzyz r2 = new com.google.android.gms.internal.measurement.zzyz
            r5 = 99
            r8 = 1
            java.lang.String r3 = "CHAR"
            r4 = 2
            com.google.android.gms.internal.measurement.zzzb r6 = com.google.android.gms.internal.measurement.zzzb.CHARACTER
            java.lang.String r7 = "-"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.measurement.zzyz r3 = new com.google.android.gms.internal.measurement.zzyz
            r6 = 100
            r9 = 0
            java.lang.String r4 = "DECIMAL"
            r5 = 3
            com.google.android.gms.internal.measurement.zzzb r14 = com.google.android.gms.internal.measurement.zzzb.INTEGRAL
            java.lang.String r8 = "-0+ ,("
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.google.android.gms.internal.measurement.zzyz r4 = new com.google.android.gms.internal.measurement.zzyz
            r13 = 111(0x6f, float:1.56E-43)
            r16 = 0
            java.lang.String r11 = "OCTAL"
            r12 = 4
            java.lang.String r15 = "-#0("
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.measurement.zzyz r5 = new com.google.android.gms.internal.measurement.zzyz
            r13 = 120(0x78, float:1.68E-43)
            r16 = 1
            java.lang.String r11 = "HEX"
            r12 = 5
            java.lang.String r15 = "-#0("
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.measurement.zzyz.e = r5
            com.google.android.gms.internal.measurement.zzyz r6 = new com.google.android.gms.internal.measurement.zzyz
            r9 = 102(0x66, float:1.43E-43)
            r12 = 0
            java.lang.String r7 = "FLOAT"
            r8 = 6
            com.google.android.gms.internal.measurement.zzzb r17 = com.google.android.gms.internal.measurement.zzzb.FLOAT
            java.lang.String r11 = "-#0+ ,("
            r10 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.internal.measurement.zzyz r7 = new com.google.android.gms.internal.measurement.zzyz
            r16 = 101(0x65, float:1.42E-43)
            r19 = 1
            java.lang.String r14 = "EXPONENT"
            r15 = 7
            java.lang.String r18 = "-#0+ ("
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.zzyz r8 = new com.google.android.gms.internal.measurement.zzyz
            r16 = 103(0x67, float:1.44E-43)
            java.lang.String r14 = "GENERAL"
            r15 = 8
            java.lang.String r18 = "-0+ ,("
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.zzyz r9 = new com.google.android.gms.internal.measurement.zzyz
            r16 = 97
            java.lang.String r14 = "EXPONENT_HEX"
            r15 = 9
            java.lang.String r18 = "-#0+ "
            r13 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.zzyz[] r0 = new com.google.android.gms.internal.measurement.zzyz[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.google.android.gms.internal.measurement.zzyz.g = r0
            r0 = 26
            com.google.android.gms.internal.measurement.zzyz[] r0 = new com.google.android.gms.internal.measurement.zzyz[r0]
            com.google.android.gms.internal.measurement.zzyz.f = r0
            com.google.android.gms.internal.measurement.zzyz[] r0 = values()
            int r1 = r0.length
            r2 = 0
        Lab:
            if (r2 >= r1) goto Lbc
            r3 = r0[r2]
            char r4 = r3.a
            r4 = r4 | 32
            int r4 = r4 + (-97)
            com.google.android.gms.internal.measurement.zzyz[] r5 = com.google.android.gms.internal.measurement.zzyz.f
            r5[r4] = r3
            int r2 = r2 + 1
            goto Lab
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzyz.<clinit>():void");
    }

    public zzyz(String str, int i, char c, zzzb zzzbVar, String str2, boolean z) {
        this.a = c;
        this.b = zzzbVar;
        zzza zzzaVar = zzza.e;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str2.length(); i3++) {
            int charAt = ((int) ((zzza.d >>> ((str2.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt < 0) {
                a70.p("invalid flags: ".concat(str2));
                throw null;
            }
            i2 |= 1 << charAt;
        }
        this.c = i2;
        this.d = lnb.q(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }

    public static zzyz[] values() {
        return (zzyz[]) g.clone();
    }
}
