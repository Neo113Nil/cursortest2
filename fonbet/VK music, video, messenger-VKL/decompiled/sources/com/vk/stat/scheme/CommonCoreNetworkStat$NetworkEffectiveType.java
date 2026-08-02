package com.vk.stat.scheme;

import com.ironsource.T3;
import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonCoreNetworkStat.kt */
/* loaded from: classes11.dex */
public final class CommonCoreNetworkStat$NetworkEffectiveType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonCoreNetworkStat$NetworkEffectiveType[] $VALUES;
    public static final CommonCoreNetworkStat$NetworkEffectiveType SLOW_2G;
    public static final CommonCoreNetworkStat$NetworkEffectiveType TYPE_2G;
    public static final CommonCoreNetworkStat$NetworkEffectiveType TYPE_3G;
    public static final CommonCoreNetworkStat$NetworkEffectiveType TYPE_4G;
    public static final CommonCoreNetworkStat$NetworkEffectiveType TYPE_5G;
    private final String value;

    /* compiled from: CommonCoreNetworkStat.kt */
    public static final class Serializer implements uay<CommonCoreNetworkStat$NetworkEffectiveType> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(((CommonCoreNetworkStat$NetworkEffectiveType) obj).value);
        }
    }

    static {
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType = new CommonCoreNetworkStat$NetworkEffectiveType("SLOW_2G", 0, "slow-2g");
        SLOW_2G = commonCoreNetworkStat$NetworkEffectiveType;
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType2 = new CommonCoreNetworkStat$NetworkEffectiveType("TYPE_2G", 1, "2g");
        TYPE_2G = commonCoreNetworkStat$NetworkEffectiveType2;
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType3 = new CommonCoreNetworkStat$NetworkEffectiveType("TYPE_3G", 2, T3.a);
        TYPE_3G = commonCoreNetworkStat$NetworkEffectiveType3;
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType4 = new CommonCoreNetworkStat$NetworkEffectiveType("TYPE_4G", 3, "4g");
        TYPE_4G = commonCoreNetworkStat$NetworkEffectiveType4;
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType5 = new CommonCoreNetworkStat$NetworkEffectiveType("TYPE_5G", 4, "5g");
        TYPE_5G = commonCoreNetworkStat$NetworkEffectiveType5;
        CommonCoreNetworkStat$NetworkEffectiveType[] commonCoreNetworkStat$NetworkEffectiveTypeArr = {commonCoreNetworkStat$NetworkEffectiveType, commonCoreNetworkStat$NetworkEffectiveType2, commonCoreNetworkStat$NetworkEffectiveType3, commonCoreNetworkStat$NetworkEffectiveType4, commonCoreNetworkStat$NetworkEffectiveType5};
        $VALUES = commonCoreNetworkStat$NetworkEffectiveTypeArr;
        $ENTRIES = new asp(commonCoreNetworkStat$NetworkEffectiveTypeArr);
    }

    public CommonCoreNetworkStat$NetworkEffectiveType(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommonCoreNetworkStat$NetworkEffectiveType valueOf(String str) {
        return (CommonCoreNetworkStat$NetworkEffectiveType) Enum.valueOf(CommonCoreNetworkStat$NetworkEffectiveType.class, str);
    }

    public static CommonCoreNetworkStat$NetworkEffectiveType[] values() {
        return (CommonCoreNetworkStat$NetworkEffectiveType[]) $VALUES.clone();
    }
}
