package com.vk.profile.community.impl.ui.profile.state;

import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import java.util.Iterator;
import xsna.asp;
import xsna.dly;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class MarketInfoBlockModel {
    public final SubType a;
    public final String b;
    public final dly c;
    public final MarketItemLabelActionDto d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityProfileContentItem.kt */
    public static final class SubType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubType[] $VALUES;
        public static final a Companion;
        public static final SubType DEFAULT;
        public static final SubType INTEGRATION_ONBOARDING;
        public static final SubType OZON_ONBOARDING;
        private final String value;

        /* compiled from: CommunityProfileContentItem.kt */
        public static final class a {
            public static SubType a(String str) {
                Object obj;
                Iterator<E> it = SubType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((SubType) obj).i(), str)) {
                        break;
                    }
                }
                SubType subType = (SubType) obj;
                return subType == null ? SubType.DEFAULT : subType;
            }
        }

        static {
            SubType subType = new SubType("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = subType;
            SubType subType2 = new SubType("OZON_ONBOARDING", 1, "ozon_onboarding");
            OZON_ONBOARDING = subType2;
            SubType subType3 = new SubType("INTEGRATION_ONBOARDING", 2, "integration_onboarding");
            INTEGRATION_ONBOARDING = subType3;
            SubType[] subTypeArr = {subType, subType2, subType3};
            $VALUES = subTypeArr;
            $ENTRIES = new asp(subTypeArr);
            Companion = new a();
        }

        public SubType(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<SubType> h() {
            return $ENTRIES;
        }

        public static SubType valueOf(String str) {
            return (SubType) Enum.valueOf(SubType.class, str);
        }

        public static SubType[] values() {
            return (SubType[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    public MarketInfoBlockModel(SubType subType, String str, dly dlyVar, MarketItemLabelActionDto marketItemLabelActionDto) {
        this.a = subType;
        this.b = str;
        this.c = dlyVar;
        this.d = marketItemLabelActionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketInfoBlockModel)) {
            return false;
        }
        MarketInfoBlockModel marketInfoBlockModel = (MarketInfoBlockModel) obj;
        return this.a == marketInfoBlockModel.a && epx.f(this.b, marketInfoBlockModel.b) && epx.f(this.c, marketInfoBlockModel.c) && epx.f(this.d, marketInfoBlockModel.d);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        dly dlyVar = this.c;
        int hashCode = (a + (dlyVar == null ? 0 : dlyVar.hashCode())) * 31;
        MarketItemLabelActionDto marketItemLabelActionDto = this.d;
        return hashCode + (marketItemLabelActionDto != null ? marketItemLabelActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketInfoBlockModel(subType=" + this.a + ", text=" + this.b + ", labelIcon=" + this.c + ", action=" + this.d + ')';
    }
}
