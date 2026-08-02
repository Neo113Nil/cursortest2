package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: CatalogArtistInfoItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogArtistInfoItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogArtistInfoItemDto> CREATOR = new a();

    @pmi0("chips")
    private final List<CatalogButtonDto> chips;

    @pmi0("click_track_code")
    private final String clickTrackCode;

    @pmi0("expand_track_code")
    private final String expandTrackCode;

    @pmi0("is_foreign_agent")
    private final Boolean isForeignAgent;

    @pmi0("play_action_ref")
    private final String playActionRef;

    @pmi0("play_track_code")
    private final String playTrackCode;

    @pmi0("subscription_bio_track_code")
    private final String subscriptionBioTrackCode;

    @pmi0("subscription_track_code")
    private final String subscriptionTrackCode;

    @pmi0("view_track_code")
    private final String viewTrackCode;

    /* compiled from: CatalogArtistInfoItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogArtistInfoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogArtistInfoItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(CatalogButtonDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CatalogArtistInfoItemDto(arrayList, bool, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogArtistInfoItemDto[] newArray(int i) {
            return new CatalogArtistInfoItemDto[i];
        }
    }

    public CatalogArtistInfoItemDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final List<CatalogButtonDto> d() {
        return this.chips;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.expandTrackCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogArtistInfoItemDto)) {
            return false;
        }
        CatalogArtistInfoItemDto catalogArtistInfoItemDto = (CatalogArtistInfoItemDto) obj;
        return epx.f(this.chips, catalogArtistInfoItemDto.chips) && epx.f(this.isForeignAgent, catalogArtistInfoItemDto.isForeignAgent) && epx.f(this.playTrackCode, catalogArtistInfoItemDto.playTrackCode) && epx.f(this.subscriptionTrackCode, catalogArtistInfoItemDto.subscriptionTrackCode) && epx.f(this.subscriptionBioTrackCode, catalogArtistInfoItemDto.subscriptionBioTrackCode) && epx.f(this.playActionRef, catalogArtistInfoItemDto.playActionRef) && epx.f(this.expandTrackCode, catalogArtistInfoItemDto.expandTrackCode) && epx.f(this.clickTrackCode, catalogArtistInfoItemDto.clickTrackCode) && epx.f(this.viewTrackCode, catalogArtistInfoItemDto.viewTrackCode);
    }

    public final String f() {
        return this.playActionRef;
    }

    public final String g() {
        return this.playTrackCode;
    }

    public final int hashCode() {
        List<CatalogButtonDto> list = this.chips;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isForeignAgent;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.playTrackCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriptionTrackCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriptionBioTrackCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.playActionRef;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expandTrackCode;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.clickTrackCode;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.viewTrackCode;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String i() {
        return this.subscriptionBioTrackCode;
    }

    public final String j() {
        return this.subscriptionTrackCode;
    }

    public final String k() {
        return this.viewTrackCode;
    }

    public final Boolean l() {
        return this.isForeignAgent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogArtistInfoItemDto(chips=");
        sb.append(this.chips);
        sb.append(", isForeignAgent=");
        sb.append(this.isForeignAgent);
        sb.append(", playTrackCode=");
        sb.append(this.playTrackCode);
        sb.append(", subscriptionTrackCode=");
        sb.append(this.subscriptionTrackCode);
        sb.append(", subscriptionBioTrackCode=");
        sb.append(this.subscriptionBioTrackCode);
        sb.append(", playActionRef=");
        sb.append(this.playActionRef);
        sb.append(", expandTrackCode=");
        sb.append(this.expandTrackCode);
        sb.append(", clickTrackCode=");
        sb.append(this.clickTrackCode);
        sb.append(", viewTrackCode=");
        return ho8.a(sb, this.viewTrackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CatalogButtonDto> list = this.chips;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isForeignAgent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.playTrackCode);
        parcel.writeString(this.subscriptionTrackCode);
        parcel.writeString(this.subscriptionBioTrackCode);
        parcel.writeString(this.playActionRef);
        parcel.writeString(this.expandTrackCode);
        parcel.writeString(this.clickTrackCode);
        parcel.writeString(this.viewTrackCode);
    }

    public CatalogArtistInfoItemDto(List<CatalogButtonDto> list, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.chips = list;
        this.isForeignAgent = bool;
        this.playTrackCode = str;
        this.subscriptionTrackCode = str2;
        this.subscriptionBioTrackCode = str3;
        this.playActionRef = str4;
        this.expandTrackCode = str5;
        this.clickTrackCode = str6;
        this.viewTrackCode = str7;
    }

    public /* synthetic */ CatalogArtistInfoItemDto(List list, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
