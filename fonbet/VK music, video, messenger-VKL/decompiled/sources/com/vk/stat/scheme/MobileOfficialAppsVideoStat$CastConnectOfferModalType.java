package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$CastConnectOfferModalType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsVideoStat$CastConnectOfferModalType[] $VALUES;

    @pmi0("offer_modal_first")
    public static final MobileOfficialAppsVideoStat$CastConnectOfferModalType OFFER_MODAL_FIRST;

    @pmi0("offer_modal_reconnect")
    public static final MobileOfficialAppsVideoStat$CastConnectOfferModalType OFFER_MODAL_RECONNECT;

    @pmi0("offer_modal_reconnect_multi")
    public static final MobileOfficialAppsVideoStat$CastConnectOfferModalType OFFER_MODAL_RECONNECT_MULTI;

    static {
        MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType = new MobileOfficialAppsVideoStat$CastConnectOfferModalType("OFFER_MODAL_FIRST", 0);
        OFFER_MODAL_FIRST = mobileOfficialAppsVideoStat$CastConnectOfferModalType;
        MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType2 = new MobileOfficialAppsVideoStat$CastConnectOfferModalType("OFFER_MODAL_RECONNECT", 1);
        OFFER_MODAL_RECONNECT = mobileOfficialAppsVideoStat$CastConnectOfferModalType2;
        MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType3 = new MobileOfficialAppsVideoStat$CastConnectOfferModalType("OFFER_MODAL_RECONNECT_MULTI", 2);
        OFFER_MODAL_RECONNECT_MULTI = mobileOfficialAppsVideoStat$CastConnectOfferModalType3;
        MobileOfficialAppsVideoStat$CastConnectOfferModalType[] mobileOfficialAppsVideoStat$CastConnectOfferModalTypeArr = {mobileOfficialAppsVideoStat$CastConnectOfferModalType, mobileOfficialAppsVideoStat$CastConnectOfferModalType2, mobileOfficialAppsVideoStat$CastConnectOfferModalType3};
        $VALUES = mobileOfficialAppsVideoStat$CastConnectOfferModalTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsVideoStat$CastConnectOfferModalTypeArr);
    }

    private MobileOfficialAppsVideoStat$CastConnectOfferModalType(String str, int i) {
    }

    public static MobileOfficialAppsVideoStat$CastConnectOfferModalType valueOf(String str) {
        return (MobileOfficialAppsVideoStat$CastConnectOfferModalType) Enum.valueOf(MobileOfficialAppsVideoStat$CastConnectOfferModalType.class, str);
    }

    public static MobileOfficialAppsVideoStat$CastConnectOfferModalType[] values() {
        return (MobileOfficialAppsVideoStat$CastConnectOfferModalType[]) $VALUES.clone();
    }
}
