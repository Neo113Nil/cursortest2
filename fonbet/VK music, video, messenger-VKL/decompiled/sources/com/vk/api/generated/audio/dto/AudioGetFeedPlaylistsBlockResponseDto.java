package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioGetFeedPlaylistsBlockResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetFeedPlaylistsBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetFeedPlaylistsBlockResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<AudioPlaylistDto> items;

    @pmi0("session_id")
    private final Integer sessionId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioGetFeedPlaylistsBlockResponseDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("recommended_playlist")
        public static final TypeDto RECOMMENDED_PLAYLIST;

        @pmi0("recommended_playlist_official")
        public static final TypeDto RECOMMENDED_PLAYLIST_OFFICIAL;
        private final String value;

        /* compiled from: AudioGetFeedPlaylistsBlockResponseDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("RECOMMENDED_PLAYLIST", 0, "recommended_playlist");
            RECOMMENDED_PLAYLIST = typeDto;
            TypeDto typeDto2 = new TypeDto("RECOMMENDED_PLAYLIST_OFFICIAL", 1, "recommended_playlist_official");
            RECOMMENDED_PLAYLIST_OFFICIAL = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: AudioGetFeedPlaylistsBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetFeedPlaylistsBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetFeedPlaylistsBlockResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AudioGetFeedPlaylistsBlockResponseDto.class, parcel, arrayList, i, 1);
            }
            return new AudioGetFeedPlaylistsBlockResponseDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetFeedPlaylistsBlockResponseDto[] newArray(int i) {
            return new AudioGetFeedPlaylistsBlockResponseDto[i];
        }
    }

    public AudioGetFeedPlaylistsBlockResponseDto(List<AudioPlaylistDto> list, Integer num, TypeDto typeDto) {
        this.items = list;
        this.sessionId = num;
        this.type = typeDto;
    }

    public final List<AudioPlaylistDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetFeedPlaylistsBlockResponseDto)) {
            return false;
        }
        AudioGetFeedPlaylistsBlockResponseDto audioGetFeedPlaylistsBlockResponseDto = (AudioGetFeedPlaylistsBlockResponseDto) obj;
        return epx.f(this.items, audioGetFeedPlaylistsBlockResponseDto.items) && epx.f(this.sessionId, audioGetFeedPlaylistsBlockResponseDto.sessionId) && this.type == audioGetFeedPlaylistsBlockResponseDto.type;
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Integer num = this.sessionId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        TypeDto typeDto = this.type;
        return hashCode2 + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AudioGetFeedPlaylistsBlockResponseDto(items=" + this.items + ", sessionId=" + this.sessionId + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Integer num = this.sessionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AudioGetFeedPlaylistsBlockResponseDto(List list, Integer num, TypeDto typeDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : typeDto);
    }
}
