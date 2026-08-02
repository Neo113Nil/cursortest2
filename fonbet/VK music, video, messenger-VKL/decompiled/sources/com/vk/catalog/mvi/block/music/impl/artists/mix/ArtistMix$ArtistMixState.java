package com.vk.catalog.mvi.block.music.impl.artists.mix;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.Image;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ArtistMix.kt */
/* loaded from: classes.dex */
public final class ArtistMix$ArtistMixState implements CatalogBlockState {
    public static final Parcelable.Creator<ArtistMix$ArtistMixState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final ArtistMixPlayParams d;
    public final String e;
    public final PlayingState f;
    public final String g;
    public final Image h;
    public final Image i;
    public final String j;

    /* compiled from: ArtistMix.kt */
    /* loaded from: classes16.dex */
    public static final class ArtistMixPlayParams implements Parcelable {
        public static final Parcelable.Creator<ArtistMixPlayParams> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        /* compiled from: ArtistMix.kt */
        public static final class a implements Parcelable.Creator<ArtistMixPlayParams> {
            @Override // android.os.Parcelable.Creator
            public final ArtistMixPlayParams createFromParcel(Parcel parcel) {
                return new ArtistMixPlayParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ArtistMixPlayParams[] newArray(int i) {
                return new ArtistMixPlayParams[i];
            }
        }

        public ArtistMixPlayParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArtistMixPlayParams)) {
                return false;
            }
            ArtistMixPlayParams artistMixPlayParams = (ArtistMixPlayParams) obj;
            return epx.f(this.b, artistMixPlayParams.b) && epx.f(this.c, artistMixPlayParams.c) && epx.f(this.d, artistMixPlayParams.d) && epx.f(this.e, artistMixPlayParams.e) && epx.f(this.f, artistMixPlayParams.f) && epx.f(this.g, artistMixPlayParams.g) && epx.f(this.h, artistMixPlayParams.h);
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            String str = this.f;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.h;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistMixPlayParams(blockId=");
            sb.append(this.b);
            sb.append(", sectionId=");
            sb.append(this.c);
            sb.append(", mixId=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", actionId=");
            sb.append(this.f);
            sb.append(", entityId=");
            sb.append(this.g);
            sb.append(", mixOptions=");
            return ho8.a(sb, this.h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
        }
    }

    /* compiled from: ArtistMix.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<ArtistMix$ArtistMixState> {
        @Override // android.os.Parcelable.Creator
        public final ArtistMix$ArtistMixState createFromParcel(Parcel parcel) {
            return new ArtistMix$ArtistMixState((BlockId) parcel.readParcelable(ArtistMix$ArtistMixState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), ArtistMixPlayParams.CREATOR.createFromParcel(parcel), parcel.readString(), PlayingState.valueOf(parcel.readString()), parcel.readString(), (Image) parcel.readParcelable(ArtistMix$ArtistMixState.class.getClassLoader()), (Image) parcel.readParcelable(ArtistMix$ArtistMixState.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArtistMix$ArtistMixState[] newArray(int i) {
            return new ArtistMix$ArtistMixState[i];
        }
    }

    public ArtistMix$ArtistMixState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, ArtistMixPlayParams artistMixPlayParams, String str, PlayingState playingState, String str2, Image image, Image image2, String str3) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = artistMixPlayParams;
        this.e = str;
        this.f = playingState;
        this.g = str2;
        this.h = image;
        this.i = image2;
        this.j = str3;
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final CatalogBlockVariant M7() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistMix$ArtistMixState)) {
            return false;
        }
        ArtistMix$ArtistMixState artistMix$ArtistMixState = (ArtistMix$ArtistMixState) obj;
        return epx.f(this.b, artistMix$ArtistMixState.b) && this.c == artistMix$ArtistMixState.c && epx.f(this.d, artistMix$ArtistMixState.d) && epx.f(this.e, artistMix$ArtistMixState.e) && this.f == artistMix$ArtistMixState.f && epx.f(this.g, artistMix$ArtistMixState.g) && epx.f(this.h, artistMix$ArtistMixState.h) && epx.f(this.i, artistMix$ArtistMixState.i) && epx.f(this.j, artistMix$ArtistMixState.j);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + urd0.a((this.d.hashCode() + b.b(this.c, this.b.hashCode() * 31, 31)) * 31, 31, this.e)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.h;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.i;
        int hashCode4 = (hashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str2 = this.j;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistMixState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", mixPlayParams=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", playingState=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", background=");
        sb.append(this.h);
        sb.append(", foreground=");
        sb.append(this.i);
        sb.append(", trackCode=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.j);
    }
}
