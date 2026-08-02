package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import defpackage.fc6;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.গ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0543 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1792 = StringFog.decrypt("U9AH\n", "Hf9Gx3B0zq0=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public String f1795;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f1796;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String f1797;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f1798;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String f1799;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String f1800;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public EnumC0546 f1794 = EnumC0546.f1809;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public EnumC0552 f1793 = EnumC0552.f1820;

    public C0543(String str) {
        this.f1800 = str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m352(EnumC0546 enumC0546) {
        String str;
        String str2;
        this.f1794 = enumC0546;
        EnumC0546 enumC05462 = EnumC0546.f1804;
        if (enumC0546 != enumC05462) {
            this.f1793 = EnumC0552.f1820;
        }
        int ordinal = enumC0546.ordinal();
        if (ordinal == 1) {
            System.currentTimeMillis();
            return;
        }
        if (ordinal == 2) {
            System.currentTimeMillis();
            return;
        }
        if (ordinal == 3) {
            System.currentTimeMillis();
        } else if (ordinal != 4 && ordinal != 5) {
            return;
        }
        if (this.f1800.equals(StringFog.decrypt("royj/uqO0w==\n", "+enBqIPrpJA=\n"))) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("Ae+5cyI1FJ0B77lzIjUZ\n", "LMKUXg8YObA=\n"));
        sb.append(this.f1800);
        String m662 = AbstractC1133.m662("tX3sReNI0gr6bKM=\n", "lR6DK40tsX4=\n", sb);
        if (this.f1799 != null) {
            m662 = mz1.o(fc6.q(m662), this.f1799, " ");
        }
        StringBuilder q = fc6.q(m662);
        q.append(StringFog.decrypt("Vil+3TodeKhWKX7dOh0=\n", "ewRT8BcwVYU=\n"));
        StringBuilder sb2 = new StringBuilder(q.toString().concat("\n"));
        String str3 = null;
        if (this.f1800 == null || (str2 = this.f1798) == null) {
            str = null;
        } else {
            if (str2.equals(f1792) && this.f1794 != EnumC0546.f1805) {
                str2 = StringFog.decrypt("LIUnIwAuhvQKjzc=\n", "YupTA2ZL8pc=\n");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f1800);
            str = AbstractC0424.m255("yT2dcDg2vemaB7ZVImA=\n", "6W7ZOxhA2Js=\n", sb3, str2);
        }
        if (str != null) {
            sb2.append(str.concat("\n"));
        }
        if (this.f1797 != null && this.f1796 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(StringFog.decrypt("34utYSgL2VnloIgyXh3eWvyglDUbCpEK\n", "jM/mQX5uqyo=\n"));
            ceo.g(this.f1797, "S1yr\n", sb4, "a3GLISNWl80=\n");
            sb4.append(this.f1796);
            str3 = sb4.toString();
        }
        if (str3 != null) {
            sb2.append(str3.concat("\n"));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(StringFog.decrypt("sGvuqykBUpI=\n", "4x+P31xyaLI=\n"));
        EnumC0546 enumC05463 = this.f1794;
        sb5.append(enumC05463 == enumC05462 ? StringFog.decrypt("lkmDBP+4XA==\n", "wQjRSrb2G0w=\n") : enumC05463.name());
        sb5.append("\n");
        sb2.append(sb5.toString());
        EnumC0546 enumC05464 = this.f1794;
        if (enumC05464 == EnumC0546.f1806 || enumC05464 == EnumC0546.f1805) {
            String decrypt = StringFog.decrypt("8nPTDJBNHtzKRMYy\n", "sxeCefEhd6g=\n");
            AbstractC0420.m253(decrypt, decrypt, sb2.toString(), true);
            return;
        }
        String m351 = m351(this.f1793);
        if (m351 != null) {
            sb2.append(StringFog.decrypt("PujlQhsk03dT\n", "c42WMXpDtk0=\n") + m351);
        }
        String decrypt2 = StringFog.decrypt("RYkHCcXjrfB9vhI3\n", "BO1WfKSPxIQ=\n");
        if (AbstractC0420.m247()) {
            AbstractC0420.m249(decrypt2);
        } else if (AbstractC0420.m248().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            AbstractC0420.m249(decrypt2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m351(EnumC0552 enumC0552) {
        if (enumC0552 == null) {
            return null;
        }
        int ordinal = enumC0552.ordinal();
        if (ordinal == 1) {
            return String.format(StringFog.decrypt("/2hsWo5KX/u/aT9AhU9fqKk7PkybVBb/v2hsYLlgG9yveiBAnlhf3p5QbF+PUwzktXVsDJkBEP/6\ndSlej1M=\n", "2htMKeohf40=\n"), this.f1800, this.f1798, this.f1795);
        }
        if (ordinal == 2) {
            return String.format(StringFog.decrypt("oMLCoaoaRZ3gw5GbgT9FzvaRi4HOPwqfpciHhs4iEJv13pCGizVFifyRlpqLcQaE69+HkZo+Fw==\n", "hbHi8u5RZes=\n"), this.f1800, this.f1798);
        }
        if (ordinal == 3) {
            return StringFog.decrypt("RNJtBL06HNZtk20GsSpVw27afg34PVPMbNZnHLcs\n", "ArMEaNhePKI=\n");
        }
        if (ordinal == 4) {
            return StringFog.decrypt("RQluKBqwMshsSGQ2GrVm2SMLaCoRsXHIbBo=\n", "A2gHRH/UErw=\n");
        }
        if (ordinal != 5) {
            return null;
        }
        return StringFog.decrypt("S11NRjAiPSF7QVRHLXU8Yn1GVFo6MQ==\n", "HjMmKF9VUwE=\n");
    }
}
