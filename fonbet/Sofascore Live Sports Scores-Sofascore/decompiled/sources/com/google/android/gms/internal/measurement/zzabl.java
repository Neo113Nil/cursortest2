package com.google.android.gms.internal.measurement;

import defpackage.a7n;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabl extends zzabp {
    public static final zzabl b = new zzabl();

    private zzabl() {
    }

    @Override // com.google.android.gms.internal.measurement.zzabp
    public final int c(zzyy zzyyVar, int i, String str, int i2, int i3, int i4) {
        int i5;
        zzza zzzaVar;
        zzza zzzaVar2;
        zzabh zzabgVar;
        zzabh a7nVar;
        char charAt = str.charAt(i4);
        int i6 = charAt & ' ';
        int i7 = 1;
        boolean z = i6 == 0;
        zzza zzzaVar3 = zzza.e;
        int i8 = 128;
        char c = ' ';
        int i9 = i3;
        if (i9 != i4 || z) {
            int i10 = true != z ? 0 : 128;
            while (i9 != i4) {
                int i11 = i9 + 1;
                i5 = i7;
                char charAt2 = str.charAt(i9);
                if (charAt2 >= c && charAt2 <= '0') {
                    int i12 = ((int) ((zzza.d >>> ((charAt2 - ' ') * 3)) & 7)) - 1;
                    if (i12 >= 0) {
                        int i13 = i5 << i12;
                        if ((i10 & i13) != 0) {
                            throw zzabo.b(i9, "repeated flag", str);
                        }
                        i10 |= i13;
                        i7 = i5;
                        i9 = i11;
                        c = ' ';
                    } else {
                        if (charAt2 != '.') {
                            throw zzabo.b(i9, "invalid flag", str);
                        }
                        zzzaVar2 = new zzza(i10, -1, zzza.e(i11, i4, str));
                    }
                } else {
                    if (charAt2 > '9') {
                        throw zzabo.b(i9, "invalid flag", str);
                    }
                    int i14 = charAt2 - '0';
                    int i15 = i11;
                    while (i15 != i4) {
                        int i16 = i15 + 1;
                        char charAt3 = str.charAt(i15);
                        if (charAt3 == '.') {
                            zzzaVar = new zzza(i10, i14, zzza.e(i16, i4, str));
                            break;
                        }
                        char c2 = (char) (charAt3 - '0');
                        if (c2 >= '\n') {
                            throw zzabo.b(i15, "invalid width character", str);
                        }
                        i14 = (i14 * 10) + c2;
                        if (i14 > 999999) {
                            throw zzabo.a(i9, i4, "width too large", str);
                        }
                        i15 = i16;
                        i8 = 128;
                    }
                    zzzaVar2 = new zzza(i10, i14, -1);
                }
                zzzaVar = zzzaVar2;
            }
            i5 = i7;
            zzzaVar = new zzza(i10, -1, -1);
        } else {
            zzzaVar = zzza.e;
            i5 = 1;
        }
        zzyz zzyzVar = zzyz.f[(charAt | ' ') - 97];
        if (i6 == 0 && (zzyzVar == null || (zzyzVar.c & i8) == 0)) {
            zzyzVar = null;
        }
        int i17 = i4 + 1;
        if (zzyzVar != null) {
            zzzaVar.getClass();
            if (!zzzaVar.b(zzyzVar.c, zzyzVar.b.a)) {
                throw zzabo.a(i2, i17, "invalid format specifier", str);
            }
            if (i < 10) {
                Map map = zzabj.d;
                if (zzzaVar.a()) {
                    zzabh[] zzabhVarArr = (zzabj[]) zzabj.d.get(zzyzVar);
                    zzabr.a(zzabhVarArr, "default parameter");
                    zzabgVar = zzabhVarArr[i];
                }
            }
            a7nVar = new zzabj(i, zzyzVar, zzzaVar);
            zzabgVar = a7nVar;
        } else if (charAt == 't' || charAt == 'T') {
            if (!zzzaVar.b(160, false)) {
                throw zzabo.a(i2, i17, "invalid format specification", str);
            }
            int i18 = i4 + 2;
            if (i18 > str.length()) {
                throw zzabo.b(i2, "truncated format specifier", str);
            }
            zzabf zzabfVar = (zzabf) zzabf.b.get(Character.valueOf(str.charAt(i17)));
            if (zzabfVar == null) {
                throw zzabo.b(i17, "illegal date/time conversion", str);
            }
            zzabgVar = new zzabg(zzzaVar, i, zzabfVar);
            i17 = i18;
        } else {
            if (charAt != 'h' && charAt != 'H') {
                throw zzabo.a(i2, i17, "invalid format specification", str);
            }
            if (!zzzaVar.b(160, false)) {
                throw zzabo.a(i2, i17, "invalid format specification", str);
            }
            a7nVar = new a7n(zzzaVar, i);
            zzabgVar = a7nVar;
        }
        int i19 = zzabgVar.a;
        if (i19 < 32) {
            zzyyVar.b |= i5 << i19;
        }
        zzyyVar.c = Math.max(zzyyVar.c, i19);
        zzaaf zzaafVar = zzyyVar.a;
        zzabn zzabnVar = zzaafVar.a;
        StringBuilder sb = zzyyVar.e;
        zzabnVar.b(zzyyVar.f, i2, zzaafVar.b, sb);
        Object[] objArr = zzyyVar.d;
        int i20 = zzabgVar.a;
        if (i20 < objArr.length) {
            Object obj = objArr[i20];
            if (obj != null) {
                zzabgVar.a(zzyyVar, obj);
            } else {
                sb.append("null");
            }
        } else {
            sb.append("[ERROR: MISSING LOG ARGUMENT]");
        }
        zzyyVar.f = i17;
        return i17;
    }
}
