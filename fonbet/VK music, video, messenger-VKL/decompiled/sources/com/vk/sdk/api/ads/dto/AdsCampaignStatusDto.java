package com.vk.sdk.api.ads.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsCampaignStatusDto.kt */
/* loaded from: classes5.dex */
public final class AdsCampaignStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsCampaignStatusDto[] $VALUES;

    @pmi0("2")
    public static final AdsCampaignStatusDto DELETED;

    @pmi0("1")
    public static final AdsCampaignStatusDto STARTED;

    @pmi0("0")
    public static final AdsCampaignStatusDto STOPPED;
    private final int value;

    static {
        AdsCampaignStatusDto adsCampaignStatusDto = new AdsCampaignStatusDto("STOPPED", 0, 0);
        STOPPED = adsCampaignStatusDto;
        AdsCampaignStatusDto adsCampaignStatusDto2 = new AdsCampaignStatusDto(SignalingProtocol.STATE_STARTED, 1, 1);
        STARTED = adsCampaignStatusDto2;
        AdsCampaignStatusDto adsCampaignStatusDto3 = new AdsCampaignStatusDto("DELETED", 2, 2);
        DELETED = adsCampaignStatusDto3;
        AdsCampaignStatusDto[] adsCampaignStatusDtoArr = {adsCampaignStatusDto, adsCampaignStatusDto2, adsCampaignStatusDto3};
        $VALUES = adsCampaignStatusDtoArr;
        $ENTRIES = new asp(adsCampaignStatusDtoArr);
    }

    private AdsCampaignStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AdsCampaignStatusDto valueOf(String str) {
        return (AdsCampaignStatusDto) Enum.valueOf(AdsCampaignStatusDto.class, str);
    }

    public static AdsCampaignStatusDto[] values() {
        return (AdsCampaignStatusDto[]) $VALUES.clone();
    }
}
