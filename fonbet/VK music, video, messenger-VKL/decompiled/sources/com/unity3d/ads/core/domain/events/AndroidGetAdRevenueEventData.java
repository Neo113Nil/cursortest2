package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueAdFormat;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueDataKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;

/* compiled from: AndroidGetAdRevenueEventData.kt */
/* loaded from: classes14.dex */
public final class AndroidGetAdRevenueEventData implements GetAdRevenueEventData {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r4 = com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventDataKt.toProto(r4);
     */
    @Override // com.unity3d.ads.core.domain.events.GetAdRevenueEventData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdRevenueEventRequestOuterClass.AdRevenueData invoke(AdRevenueData adRevenueData) {
        AdFormatOuterClass.AdFormat adFormat;
        AdRevenueDataKt.Dsl _create = AdRevenueDataKt.Dsl.Companion._create(AdRevenueEventRequestOuterClass.AdRevenueData.newBuilder());
        _create.setEventId(ProtobufExtensionsKt.toByteString(adRevenueData.getEventId()));
        Double revenue = adRevenueData.getRevenue();
        if (revenue != null) {
            _create.setRevenue(revenue.doubleValue());
        }
        String countryCode = adRevenueData.getCountryCode();
        if (countryCode != null) {
            _create.setCountryCode(countryCode);
        }
        String networkName = adRevenueData.getNetworkName();
        if (networkName != null) {
            _create.setNetworkName(networkName);
        }
        String adUnitId = adRevenueData.getAdUnitId();
        if (adUnitId != null) {
            _create.setAdUnitId(adUnitId);
        }
        String thirdPartyAdPlacementId = adRevenueData.getThirdPartyAdPlacementId();
        if (thirdPartyAdPlacementId != null) {
            _create.setThirdPartyAdPlacementId(thirdPartyAdPlacementId);
        }
        AdRevenueAdFormat adFormat2 = adRevenueData.getAdFormat();
        if (adFormat2 == null || adFormat == null) {
            adFormat = AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        _create.setAdFormat(adFormat);
        return _create._build();
    }
}
