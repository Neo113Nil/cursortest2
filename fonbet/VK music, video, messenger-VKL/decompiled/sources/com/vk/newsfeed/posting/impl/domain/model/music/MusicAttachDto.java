package com.vk.newsfeed.posting.impl.domain.model.music;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: MusicAttachDto.kt */
/* loaded from: classes4.dex */
public interface MusicAttachDto extends Parcelable {

    /* compiled from: MusicAttachDto.kt */
    public static final class MusicPlaylistDto implements MusicAttachDto {
        public static final Parcelable.Creator<MusicPlaylistDto> CREATOR = new a();
        public final MusicDto b;

        /* compiled from: MusicAttachDto.kt */
        public static final class a implements Parcelable.Creator<MusicPlaylistDto> {
            @Override // android.os.Parcelable.Creator
            public final MusicPlaylistDto createFromParcel(Parcel parcel) {
                return new MusicPlaylistDto(MusicDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MusicPlaylistDto[] newArray(int i) {
                return new MusicPlaylistDto[i];
            }
        }

        public MusicPlaylistDto(MusicDto musicDto) {
            this.b = musicDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MusicPlaylistDto) && epx.f(this.b, ((MusicPlaylistDto) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "MusicPlaylistDto(playlist=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* compiled from: MusicAttachDto.kt */
    public static final class MusicSnippetDto implements MusicAttachDto {
        public static final Parcelable.Creator<MusicSnippetDto> CREATOR = new a();
        public final MusicDto b;

        /* compiled from: MusicAttachDto.kt */
        public static final class a implements Parcelable.Creator<MusicSnippetDto> {
            @Override // android.os.Parcelable.Creator
            public final MusicSnippetDto createFromParcel(Parcel parcel) {
                return new MusicSnippetDto(MusicDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MusicSnippetDto[] newArray(int i) {
                return new MusicSnippetDto[i];
            }
        }

        public MusicSnippetDto(MusicDto musicDto) {
            this.b = musicDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MusicSnippetDto) && epx.f(this.b, ((MusicSnippetDto) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "MusicSnippetDto(snippet=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* compiled from: MusicAttachDto.kt */
    public static final class MusicTracksDto implements MusicAttachDto {
        public static final Parcelable.Creator<MusicTracksDto> CREATOR = new a();
        public final List<MusicDto> b;

        /* compiled from: MusicAttachDto.kt */
        public static final class a implements Parcelable.Creator<MusicTracksDto> {
            @Override // android.os.Parcelable.Creator
            public final MusicTracksDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MusicDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new MusicTracksDto(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MusicTracksDto[] newArray(int i) {
                return new MusicTracksDto[i];
            }
        }

        public MusicTracksDto(List<MusicDto> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MusicTracksDto) && epx.f(this.b, ((MusicTracksDto) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("MusicTracksDto(tracks="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((MusicDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }
}
