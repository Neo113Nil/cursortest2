package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: WallPosterDto.kt */
/* loaded from: classes15.dex */
public final class WallPosterDto implements Parcelable {
    public static final Parcelable.Creator<WallPosterDto> CREATOR = new a();

    @pmi0("access_hash")
    private final String accessHash;

    @pmi0("background_name")
    private final String backgroundName;

    @pmi0("bkg_id")
    private final Integer bkgId;

    @pmi0("bkg_owner_id")
    private final UserId bkgOwnerId;

    @pmi0("constants")
    private final WallPosterConstantsDto constants;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("layers")
    private final List<List<BaseImageDto>> layers;

    @pmi0("main_color")
    private final String mainColor;

    @pmi0("text_color")
    private final String textColor;

    @pmi0("try_button_caption")
    private final String tryButtonCaption;

    /* compiled from: WallPosterDto.kt */
    public static final class a implements Parcelable.Creator<WallPosterDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPosterDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(WallPosterDto.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(WallPosterDto.class, parcel, arrayList3, i2, 1);
                    }
                    arrayList2.add(arrayList3);
                }
                arrayList = arrayList2;
            }
            return new WallPosterDto(valueOf, readString, userId, readString2, readString3, readString4, valueOf2, arrayList, parcel.readInt() == 0 ? null : WallPosterConstantsDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPosterDto[] newArray(int i) {
            return new WallPosterDto[i];
        }
    }

    public WallPosterDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final String d() {
        return this.accessHash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.bkgId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPosterDto)) {
            return false;
        }
        WallPosterDto wallPosterDto = (WallPosterDto) obj;
        return epx.f(this.bkgId, wallPosterDto.bkgId) && epx.f(this.backgroundName, wallPosterDto.backgroundName) && epx.f(this.bkgOwnerId, wallPosterDto.bkgOwnerId) && epx.f(this.mainColor, wallPosterDto.mainColor) && epx.f(this.textColor, wallPosterDto.textColor) && epx.f(this.accessHash, wallPosterDto.accessHash) && epx.f(this.isHidden, wallPosterDto.isHidden) && epx.f(this.layers, wallPosterDto.layers) && epx.f(this.constants, wallPosterDto.constants) && epx.f(this.tryButtonCaption, wallPosterDto.tryButtonCaption);
    }

    public final UserId f() {
        return this.bkgOwnerId;
    }

    public final WallPosterConstantsDto g() {
        return this.constants;
    }

    public final int hashCode() {
        Integer num = this.bkgId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.backgroundName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.bkgOwnerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.mainColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessHash;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isHidden;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.layers;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        WallPosterConstantsDto wallPosterConstantsDto = this.constants;
        int hashCode9 = (hashCode8 + (wallPosterConstantsDto == null ? 0 : wallPosterConstantsDto.hashCode())) * 31;
        String str5 = this.tryButtonCaption;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final List<List<BaseImageDto>> i() {
        return this.layers;
    }

    public final String j() {
        return this.mainColor;
    }

    public final String k() {
        return this.textColor;
    }

    public final Boolean l() {
        return this.isHidden;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPosterDto(bkgId=");
        sb.append(this.bkgId);
        sb.append(", backgroundName=");
        sb.append(this.backgroundName);
        sb.append(", bkgOwnerId=");
        sb.append(this.bkgOwnerId);
        sb.append(", mainColor=");
        sb.append(this.mainColor);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", accessHash=");
        sb.append(this.accessHash);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", layers=");
        sb.append(this.layers);
        sb.append(", constants=");
        sb.append(this.constants);
        sb.append(", tryButtonCaption=");
        return ho8.a(sb, this.tryButtonCaption, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.bkgId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.backgroundName);
        parcel.writeParcelable(this.bkgOwnerId, i);
        parcel.writeString(this.mainColor);
        parcel.writeString(this.textColor);
        parcel.writeString(this.accessHash);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<List<BaseImageDto>> list = this.layers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        WallPosterConstantsDto wallPosterConstantsDto = this.constants;
        if (wallPosterConstantsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPosterConstantsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tryButtonCaption);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallPosterDto(Integer num, String str, UserId userId, String str2, String str3, String str4, Boolean bool, List<? extends List<BaseImageDto>> list, WallPosterConstantsDto wallPosterConstantsDto, String str5) {
        this.bkgId = num;
        this.backgroundName = str;
        this.bkgOwnerId = userId;
        this.mainColor = str2;
        this.textColor = str3;
        this.accessHash = str4;
        this.isHidden = bool;
        this.layers = list;
        this.constants = wallPosterConstantsDto;
        this.tryButtonCaption = str5;
    }

    public /* synthetic */ WallPosterDto(Integer num, String str, UserId userId, String str2, String str3, String str4, Boolean bool, List list, WallPosterConstantsDto wallPosterConstantsDto, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : wallPosterConstantsDto, (i & 512) != 0 ? null : str5);
    }
}
