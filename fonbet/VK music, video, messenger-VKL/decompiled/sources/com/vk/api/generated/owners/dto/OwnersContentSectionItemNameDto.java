package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnersContentSectionItemNameDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentSectionItemNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnersContentSectionItemNameDto[] $VALUES;

    @pmi0("articles")
    public static final OwnersContentSectionItemNameDto ARTICLES;

    @pmi0("audios")
    public static final OwnersContentSectionItemNameDto AUDIOS;

    @pmi0("channel")
    public static final OwnersContentSectionItemNameDto CHANNEL;

    @pmi0("chats")
    public static final OwnersContentSectionItemNameDto CHATS;
    public static final Parcelable.Creator<OwnersContentSectionItemNameDto> CREATOR;

    @pmi0("discussions")
    public static final OwnersContentSectionItemNameDto DISCUSSIONS;

    @pmi0("events")
    public static final OwnersContentSectionItemNameDto EVENTS;

    @pmi0("files")
    public static final OwnersContentSectionItemNameDto FILES;

    @pmi0("market")
    public static final OwnersContentSectionItemNameDto MARKET;

    @pmi0("narratives")
    public static final OwnersContentSectionItemNameDto NARRATIVES;

    @pmi0("photos")
    public static final OwnersContentSectionItemNameDto PHOTOS;

    @pmi0("podcasts")
    public static final OwnersContentSectionItemNameDto PODCASTS;

    @pmi0("services")
    public static final OwnersContentSectionItemNameDto SERVICES;
    private final String value;

    /* compiled from: OwnersContentSectionItemNameDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentSectionItemNameDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentSectionItemNameDto createFromParcel(Parcel parcel) {
            return OwnersContentSectionItemNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentSectionItemNameDto[] newArray(int i) {
            return new OwnersContentSectionItemNameDto[i];
        }
    }

    static {
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto = new OwnersContentSectionItemNameDto("PHOTOS", 0, "photos");
        PHOTOS = ownersContentSectionItemNameDto;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto2 = new OwnersContentSectionItemNameDto("AUDIOS", 1, "audios");
        AUDIOS = ownersContentSectionItemNameDto2;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto3 = new OwnersContentSectionItemNameDto("CHATS", 2, "chats");
        CHATS = ownersContentSectionItemNameDto3;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto4 = new OwnersContentSectionItemNameDto("EVENTS", 3, "events");
        EVENTS = ownersContentSectionItemNameDto4;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto5 = new OwnersContentSectionItemNameDto("FILES", 4, "files");
        FILES = ownersContentSectionItemNameDto5;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto6 = new OwnersContentSectionItemNameDto("DISCUSSIONS", 5, "discussions");
        DISCUSSIONS = ownersContentSectionItemNameDto6;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto7 = new OwnersContentSectionItemNameDto("ARTICLES", 6, "articles");
        ARTICLES = ownersContentSectionItemNameDto7;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto8 = new OwnersContentSectionItemNameDto("NARRATIVES", 7, "narratives");
        NARRATIVES = ownersContentSectionItemNameDto8;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto9 = new OwnersContentSectionItemNameDto("MARKET", 8, "market");
        MARKET = ownersContentSectionItemNameDto9;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto10 = new OwnersContentSectionItemNameDto("SERVICES", 9, "services");
        SERVICES = ownersContentSectionItemNameDto10;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto11 = new OwnersContentSectionItemNameDto("PODCASTS", 10, "podcasts");
        PODCASTS = ownersContentSectionItemNameDto11;
        OwnersContentSectionItemNameDto ownersContentSectionItemNameDto12 = new OwnersContentSectionItemNameDto("CHANNEL", 11, "channel");
        CHANNEL = ownersContentSectionItemNameDto12;
        OwnersContentSectionItemNameDto[] ownersContentSectionItemNameDtoArr = {ownersContentSectionItemNameDto, ownersContentSectionItemNameDto2, ownersContentSectionItemNameDto3, ownersContentSectionItemNameDto4, ownersContentSectionItemNameDto5, ownersContentSectionItemNameDto6, ownersContentSectionItemNameDto7, ownersContentSectionItemNameDto8, ownersContentSectionItemNameDto9, ownersContentSectionItemNameDto10, ownersContentSectionItemNameDto11, ownersContentSectionItemNameDto12};
        $VALUES = ownersContentSectionItemNameDtoArr;
        $ENTRIES = new asp(ownersContentSectionItemNameDtoArr);
        CREATOR = new a();
    }

    private OwnersContentSectionItemNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OwnersContentSectionItemNameDto valueOf(String str) {
        return (OwnersContentSectionItemNameDto) Enum.valueOf(OwnersContentSectionItemNameDto.class, str);
    }

    public static OwnersContentSectionItemNameDto[] values() {
        return (OwnersContentSectionItemNameDto[]) $VALUES.clone();
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
