package com.vk.sdk.api.ads.dto;

import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsAdStatusDto.kt */
/* loaded from: classes5.dex */
public final class AdsAdStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsAdStatusDto[] $VALUES;

    @pmi0("2")
    public static final AdsAdStatusDto DELETED;

    @pmi0("3")
    public static final AdsAdStatusDto DISABLED_BY_MONEY_FINAL;

    @pmi0("4")
    public static final AdsAdStatusDto DISABLED_BY_MONEY_TEMPORARY;

    @pmi0("8")
    public static final AdsAdStatusDto DISABLED_BY_SCHEDULE;

    @pmi0(Gc.e)
    public static final AdsAdStatusDto DISABLED_BY_TIME;

    @pmi0("6")
    public static final AdsAdStatusDto DISAPPROVED;

    @pmi0("9")
    public static final AdsAdStatusDto ENABLING;

    @pmi0("1")
    public static final AdsAdStatusDto STARTED;

    @pmi0("0")
    public static final AdsAdStatusDto STOPPED;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AdsAdStatusDto WAIT_FOR_MODERATION;
    private final int value;

    static {
        AdsAdStatusDto adsAdStatusDto = new AdsAdStatusDto("STOPPED", 0, 0);
        STOPPED = adsAdStatusDto;
        AdsAdStatusDto adsAdStatusDto2 = new AdsAdStatusDto(SignalingProtocol.STATE_STARTED, 1, 1);
        STARTED = adsAdStatusDto2;
        AdsAdStatusDto adsAdStatusDto3 = new AdsAdStatusDto("DELETED", 2, 2);
        DELETED = adsAdStatusDto3;
        AdsAdStatusDto adsAdStatusDto4 = new AdsAdStatusDto("DISABLED_BY_MONEY_FINAL", 3, 3);
        DISABLED_BY_MONEY_FINAL = adsAdStatusDto4;
        AdsAdStatusDto adsAdStatusDto5 = new AdsAdStatusDto("DISABLED_BY_MONEY_TEMPORARY", 4, 4);
        DISABLED_BY_MONEY_TEMPORARY = adsAdStatusDto5;
        AdsAdStatusDto adsAdStatusDto6 = new AdsAdStatusDto("WAIT_FOR_MODERATION", 5, 5);
        WAIT_FOR_MODERATION = adsAdStatusDto6;
        AdsAdStatusDto adsAdStatusDto7 = new AdsAdStatusDto("DISAPPROVED", 6, 6);
        DISAPPROVED = adsAdStatusDto7;
        AdsAdStatusDto adsAdStatusDto8 = new AdsAdStatusDto("DISABLED_BY_TIME", 7, 7);
        DISABLED_BY_TIME = adsAdStatusDto8;
        AdsAdStatusDto adsAdStatusDto9 = new AdsAdStatusDto("DISABLED_BY_SCHEDULE", 8, 8);
        DISABLED_BY_SCHEDULE = adsAdStatusDto9;
        AdsAdStatusDto adsAdStatusDto10 = new AdsAdStatusDto("ENABLING", 9, 9);
        ENABLING = adsAdStatusDto10;
        AdsAdStatusDto[] adsAdStatusDtoArr = {adsAdStatusDto, adsAdStatusDto2, adsAdStatusDto3, adsAdStatusDto4, adsAdStatusDto5, adsAdStatusDto6, adsAdStatusDto7, adsAdStatusDto8, adsAdStatusDto9, adsAdStatusDto10};
        $VALUES = adsAdStatusDtoArr;
        $ENTRIES = new asp(adsAdStatusDtoArr);
    }

    private AdsAdStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AdsAdStatusDto valueOf(String str) {
        return (AdsAdStatusDto) Enum.valueOf(AdsAdStatusDto.class, str);
    }

    public static AdsAdStatusDto[] values() {
        return (AdsAdStatusDto[]) $VALUES.clone();
    }
}
