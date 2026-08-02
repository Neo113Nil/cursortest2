package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class fx extends gb {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2137 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2138 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2139 = -3773275213520157101L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final ef f2140;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ef f2141;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final gb f2142;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final ef f2143;

    public fx(ef efVar, ef efVar2, ef efVar3, gb gbVar) {
        this.f2140 = efVar;
        this.f2143 = efVar2;
        this.f2141 = efVar3;
        this.f2142 = gbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        m7780(this.f2140, eeVar, clVar);
        while (true) {
            Object obj = null;
            if (!this.f2143.m7721(eeVar, clVar).m7682()) {
                break;
            }
            int i2 = f2138 + 77;
            f2137 = i2 % 128;
            if (i2 % 2 != 0) {
                ea m7788 = this.f2142.m7788(eeVar, clVar);
                if (m7788.m7679()) {
                    break;
                }
                if (m7788.m7683()) {
                    return m7788;
                }
                m7780(this.f2141, eeVar, clVar);
                int i3 = f2137 + 87;
                f2138 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                this.f2142.m7788(eeVar, clVar).m7679();
                super.hashCode();
                throw null;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ea m7780(ef efVar, ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2138 + 7;
        int i3 = i2 % 128;
        f2137 = i3;
        int i4 = i2 % 2;
        if (efVar != null) {
            int i5 = i3 + 85;
            f2138 = i5 % 128;
            if (i5 % 2 == 0) {
                return efVar.m7721(eeVar, clVar);
            }
            ea m7721 = efVar.m7721(eeVar, clVar);
            int i6 = 25 / 0;
            return m7721;
        }
        return new ea(null);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m7781("ਓ㊔ੵ璨䛴쨠伟鷆፷", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern());
        ef efVar = this.f2140;
        if (efVar != null) {
            int i2 = f2138 + 7;
            f2137 = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(efVar);
                int i3 = 82 / 0;
            } else {
                sb.append(efVar);
            }
        }
        sb.append(m7781("岦䛀岝³┙鸈", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb.append(this.f2143);
        sb.append(m7781("岦䛀岝³┙鸈", 1 - Gravity.getAbsoluteGravity(0, 0)).intern());
        ef efVar2 = this.f2141;
        if (efVar2 != null) {
            sb.append(efVar2);
            int i4 = f2138 + 59;
            f2137 = i4 % 128;
            int i5 = i4 % 2;
        }
        sb.append(m7781("鿱捴鿘┇\ue4fcꢓ", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        sb.append(this.f2142);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.equals(r7.f2143) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r0 = r6.f2141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r0.equals(r7.f2141) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r0 = r6.f2142;
        r7 = r7.f2142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        return r0.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r7.f2141 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (r7.f2143 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (obj != null) {
            int i2 = f2137 + 25;
            f2138 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.getClass();
                super.hashCode();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                fx fxVar = (fx) obj;
                ef efVar = this.f2140;
                if (efVar == null ? fxVar.f2140 != null : !efVar.equals(fxVar.f2140)) {
                    return false;
                }
                ef efVar2 = this.f2143;
                if (efVar2 != null) {
                    int i3 = f2138 + 75;
                    f2137 = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        }
        int i5 = f2137 + 5;
        f2138 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        ef efVar = this.f2140;
        if (efVar != null) {
            i = efVar.hashCode();
        } else {
            int i5 = f2137 + 1;
            f2138 = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        int i7 = i * 31;
        ef efVar2 = this.f2143;
        if (efVar2 != null) {
            int i8 = f2138 + 13;
            f2137 = i8 % 128;
            int i9 = i8 % 2;
            i2 = efVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i7 + i2) * 31;
        ef efVar3 = this.f2141;
        if (efVar3 != null) {
            int i11 = f2138 + 105;
            f2137 = i11 % 128;
            int i12 = i11 % 2;
            i3 = efVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i10 + i3) * 31;
        gb gbVar = this.f2142;
        return i13 + (gbVar != null ? gbVar.hashCode() : 0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7781(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2139, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2139));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
