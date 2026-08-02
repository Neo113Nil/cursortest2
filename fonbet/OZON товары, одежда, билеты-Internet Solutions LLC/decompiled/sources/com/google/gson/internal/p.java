package com.google.gson.internal;

import c9.C5769a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import h9.EnumC6876a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import l9.C7899c;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class p implements zzu, h9.u {
    public static SimpleDateFormat b(int i11, int i12) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i11 == 1) {
            str = "MMMM d, yyyy";
        } else if (i11 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb2.append(str);
        sb2.append(" ");
        if (i12 == 0 || i12 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i12 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException(Ej.b.a(i12, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    @Override // h9.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map map) {
        int i13;
        Charset charset = StandardCharsets.ISO_8859_1;
        if (map != null) {
            h9.g gVar = h9.g.CHARACTER_SET;
            if (map.containsKey(gVar)) {
                charset = Charset.forName(map.get(gVar).toString());
            }
            h9.g gVar2 = h9.g.ERROR_CORRECTION;
            r1 = map.containsKey(gVar2) ? Integer.parseInt(map.get(gVar2).toString()) : 33;
            h9.g gVar3 = h9.g.AZTEC_LAYERS;
            if (map.containsKey(gVar3)) {
                i13 = Integer.parseInt(map.get(gVar3).toString());
                if (enumC6876a == EnumC6876a.AZTEC) {
                    throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(enumC6876a)));
                }
                C8660b a11 = C7899c.b(r1, i13, str.getBytes(charset)).a();
                if (a11 == null) {
                    throw new IllegalStateException();
                }
                int j11 = a11.j();
                int g10 = a11.g();
                int max = Math.max(i11, j11);
                int max2 = Math.max(i12, g10);
                int min = Math.min(max / j11, max2 / g10);
                int i14 = (max - (j11 * min)) / 2;
                int i15 = (max2 - (g10 * min)) / 2;
                C8660b c8660b = new C8660b(max, max2);
                int i16 = 0;
                while (i16 < g10) {
                    int i17 = i14;
                    int i18 = 0;
                    while (i18 < j11) {
                        if (a11.d(i18, i16)) {
                            c8660b.m(i17, i15, min, min);
                        }
                        i18++;
                        i17 += min;
                    }
                    i16++;
                    i15 += min;
                }
                return c8660b;
            }
        }
        i13 = 0;
        if (enumC6876a == EnumC6876a.AZTEC) {
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return ((C5769a.b) obj).c();
    }
}
