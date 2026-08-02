package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1179 extends AbstractC0475 implements InterfaceC0264, InterfaceC0823 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final InterfaceC0264 f3708;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object f3709;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Map f3710;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Collection f3711;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field f3712;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3707 = StringFog.decrypt("a2KaVfru3pxBbJR59Or0\n", "JADwMJmamPU=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f3706 = StringFog.decrypt("KRrrgeOQMqo=\n", "Tn+f14L8R88=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f3705 = StringFog.decrypt("R0tk/y++beM=\n", "NC4QqU7SGIY=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f3704 = StringFog.decrypt("hyzbX139MQ==\n", "7l+dNjiRVSU=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f3703 = StringFog.decrypt("9VNSW5iDW3g=\n", "kjYmHfHmNxw=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f3702 = StringFog.decrypt("tDGg1uEATAepK4zX\n", "3ULjuY1sKWQ=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3701 = StringFog.decrypt("GwygXHj97wsfHb1weQ==\n", "fGnUHxeRg24=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3700 = StringFog.decrypt("fyIdTWA=\n", "FlFQLBDYvzE=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f3699 = StringFog.decrypt("en0CTBVH\n", "HRh2AXQ30cs=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3698 = StringFog.decrypt("SpPclOKesCpZ\n", "LfaoxIPs1UQ=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3697 = StringFog.decrypt("Udb51cGhe29Y0Og=\n", "NrONnK/SDw4=\n");

    public C1179(Field field, Object obj, InterfaceC0264 interfaceC0264) {
        this.f3712 = field;
        this.f3709 = obj;
        this.f3708 = interfaceC0264;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0823
    /* renamed from: ﾒ */
    public final Object mo55(C1102 c1102, String str, ArrayList arrayList, C0683 c0683, C0950 c0950) {
        try {
            boolean z = true;
            switch (str.hashCode()) {
                case -2039060844:
                    if (str.equals(f3701)) {
                        return this.f3711;
                    }
                    break;
                case -1661939189:
                    if (str.equals(f3697)) {
                        return this.f3709;
                    }
                    break;
                case -1249356250:
                    if (str.equals(f3699)) {
                        return this.f3710;
                    }
                    break;
                case 100472786:
                    if (str.equals(f3700)) {
                        if (this.f3710 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 429960040:
                    if (str.equals(f3702)) {
                        if (this.f3711 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 700591008:
                    if (str.equals(f3698)) {
                        return this.f3708;
                    }
                    break;
                case 1406685743:
                    if (str.equals(f3705)) {
                        Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
                        Field field = this.f3712;
                        if (field != null) {
                            try {
                                field.set(this.f3709, m295);
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    break;
                case 1953253188:
                    if (str.equals(f3703)) {
                        return this.f3712;
                    }
                    break;
                case 1967798203:
                    if (str.equals(f3706)) {
                        return m665();
                    }
                    break;
                case 2058833392:
                    if (str.equals(f3704)) {
                        if (this.f3712 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
            }
            new C0315(c1102, c0950, f3707, str).m277(c1102.m651());
        } catch (Exception e) {
            AbstractC0962.m595(c1102.m651(), AbstractC1133.m662("uw==\n", "nJ5NbPliNkY=\n", AbstractC1072.m642("2Q6l1KowSQj1ELKbvWhbA+kIvtW/MHEC9hm0z555Wwz4NbrLtDBQAegVod74fVsU9BOzm/8=\n", "nHzXu9gQPmA=\n", new StringBuilder(), str)), e, null);
        }
        return null;
    }

    public C1179(Collection collection, Object obj, InterfaceC0264 interfaceC0264) {
        this.f3711 = collection;
        this.f3709 = obj;
        this.f3708 = interfaceC0264;
    }

    public C1179(Map map, Object obj, InterfaceC0264 interfaceC0264) {
        this.f3710 = map;
        this.f3709 = obj;
        this.f3708 = interfaceC0264;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m665() {
        Field field = this.f3712;
        if (field != null) {
            try {
                return field.get(this.f3709);
            } catch (Exception unused) {
                return null;
            }
        }
        if (this.f3711 == null && this.f3710 == null) {
            return null;
        }
        return this.f3709;
    }
}
