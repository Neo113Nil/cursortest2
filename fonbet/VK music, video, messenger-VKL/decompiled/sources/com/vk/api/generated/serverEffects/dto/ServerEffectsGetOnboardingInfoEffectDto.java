package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServerEffectsGetOnboardingInfoEffectDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetOnboardingInfoEffectDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServerEffectsGetOnboardingInfoEffectDto[] $VALUES;
    public static final Parcelable.Creator<ServerEffectsGetOnboardingInfoEffectDto> CREATOR;

    @pmi0("deepfake")
    public static final ServerEffectsGetOnboardingInfoEffectDto DEEPFAKE;
    private final String value;

    /* compiled from: ServerEffectsGetOnboardingInfoEffectDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetOnboardingInfoEffectDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetOnboardingInfoEffectDto createFromParcel(Parcel parcel) {
            return ServerEffectsGetOnboardingInfoEffectDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetOnboardingInfoEffectDto[] newArray(int i) {
            return new ServerEffectsGetOnboardingInfoEffectDto[i];
        }
    }

    static {
        ServerEffectsGetOnboardingInfoEffectDto serverEffectsGetOnboardingInfoEffectDto = new ServerEffectsGetOnboardingInfoEffectDto("DEEPFAKE", 0, "deepfake");
        DEEPFAKE = serverEffectsGetOnboardingInfoEffectDto;
        ServerEffectsGetOnboardingInfoEffectDto[] serverEffectsGetOnboardingInfoEffectDtoArr = {serverEffectsGetOnboardingInfoEffectDto};
        $VALUES = serverEffectsGetOnboardingInfoEffectDtoArr;
        $ENTRIES = new asp(serverEffectsGetOnboardingInfoEffectDtoArr);
        CREATOR = new a();
    }

    private ServerEffectsGetOnboardingInfoEffectDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ServerEffectsGetOnboardingInfoEffectDto valueOf(String str) {
        return (ServerEffectsGetOnboardingInfoEffectDto) Enum.valueOf(ServerEffectsGetOnboardingInfoEffectDto.class, str);
    }

    public static ServerEffectsGetOnboardingInfoEffectDto[] values() {
        return (ServerEffectsGetOnboardingInfoEffectDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
