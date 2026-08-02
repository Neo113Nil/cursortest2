package com.vk.superapp.core.api.models;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkGender.kt */
/* loaded from: classes11.dex */
public final class VkGender {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkGender[] $VALUES;
    public static final a Companion;
    public static final VkGender FEMALE;
    public static final VkGender MALE;
    public static final VkGender UNDEFINED;
    private final int id;
    private final String value;

    /* compiled from: VkGender.kt */
    public static final class a {
        public static VkGender a(Integer num) {
            VkGender vkGender;
            VkGender[] values = VkGender.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    vkGender = null;
                    break;
                }
                vkGender = values[i];
                int h = vkGender.h();
                if (num != null && h == num.intValue()) {
                    break;
                }
                i++;
            }
            return vkGender == null ? VkGender.UNDEFINED : vkGender;
        }

        public static VkGender b(String str) {
            VkGender vkGender;
            VkGender[] values = VkGender.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    vkGender = null;
                    break;
                }
                vkGender = values[i];
                if (epx.f(vkGender.i(), str)) {
                    break;
                }
                i++;
            }
            return vkGender == null ? VkGender.UNDEFINED : vkGender;
        }
    }

    static {
        VkGender vkGender = new VkGender("UNDEFINED", 0, 0, StringUtils.UNDEFINED);
        UNDEFINED = vkGender;
        VkGender vkGender2 = new VkGender("FEMALE", 1, 1, IronSourceConstants.a.c);
        FEMALE = vkGender2;
        VkGender vkGender3 = new VkGender("MALE", 2, 2, IronSourceConstants.a.b);
        MALE = vkGender3;
        VkGender[] vkGenderArr = {vkGender, vkGender2, vkGender3};
        $VALUES = vkGenderArr;
        $ENTRIES = new asp(vkGenderArr);
        Companion = new a();
    }

    public VkGender(String str, int i, int i2, String str2) {
        this.id = i2;
        this.value = str2;
    }

    public static VkGender valueOf(String str) {
        return (VkGender) Enum.valueOf(VkGender.class, str);
    }

    public static VkGender[] values() {
        return (VkGender[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }

    public final String i() {
        return this.value;
    }
}
