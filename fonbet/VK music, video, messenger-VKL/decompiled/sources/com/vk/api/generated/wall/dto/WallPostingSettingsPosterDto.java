package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallPostingSettingsPosterDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsPosterDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsPosterDto> CREATOR = new a();

    @pmi0("base_path")
    private final String basePath;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<WallPosterCategoryDto> categories;

    @pmi0("constants")
    private final WallPosterConstantsDto constants;

    @pmi0("custom_enabled")
    private final boolean customEnabled;

    @pmi0("custom_layer_placeholder")
    private final String customLayerPlaceholder;

    @pmi0("events_hash")
    private final String eventsHash;

    @pmi0("upload_gen")
    private final String uploadGen;

    /* compiled from: WallPostingSettingsPosterDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsPosterDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsPosterDto createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(WallPosterCategoryDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new WallPostingSettingsPosterDto(readString, readString2, readString3, readString4, z, arrayList, parcel.readInt() != 0 ? WallPosterConstantsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsPosterDto[] newArray(int i) {
            return new WallPostingSettingsPosterDto[i];
        }
    }

    public WallPostingSettingsPosterDto(String str, String str2, String str3, String str4, boolean z, List<WallPosterCategoryDto> list, WallPosterConstantsDto wallPosterConstantsDto) {
        this.uploadGen = str;
        this.eventsHash = str2;
        this.basePath = str3;
        this.customLayerPlaceholder = str4;
        this.customEnabled = z;
        this.categories = list;
        this.constants = wallPosterConstantsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsPosterDto)) {
            return false;
        }
        WallPostingSettingsPosterDto wallPostingSettingsPosterDto = (WallPostingSettingsPosterDto) obj;
        return epx.f(this.uploadGen, wallPostingSettingsPosterDto.uploadGen) && epx.f(this.eventsHash, wallPostingSettingsPosterDto.eventsHash) && epx.f(this.basePath, wallPostingSettingsPosterDto.basePath) && epx.f(this.customLayerPlaceholder, wallPostingSettingsPosterDto.customLayerPlaceholder) && this.customEnabled == wallPostingSettingsPosterDto.customEnabled && epx.f(this.categories, wallPostingSettingsPosterDto.categories) && epx.f(this.constants, wallPostingSettingsPosterDto.constants);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(this.uploadGen.hashCode() * 31, 31, this.eventsHash), 31, this.basePath), 31, this.customLayerPlaceholder), 31, this.customEnabled);
        List<WallPosterCategoryDto> list = this.categories;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        WallPosterConstantsDto wallPosterConstantsDto = this.constants;
        return hashCode + (wallPosterConstantsDto != null ? wallPosterConstantsDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallPostingSettingsPosterDto(uploadGen=" + this.uploadGen + ", eventsHash=" + this.eventsHash + ", basePath=" + this.basePath + ", customLayerPlaceholder=" + this.customLayerPlaceholder + ", customEnabled=" + this.customEnabled + ", categories=" + this.categories + ", constants=" + this.constants + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadGen);
        parcel.writeString(this.eventsHash);
        parcel.writeString(this.basePath);
        parcel.writeString(this.customLayerPlaceholder);
        parcel.writeInt(this.customEnabled ? 1 : 0);
        List<WallPosterCategoryDto> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((WallPosterCategoryDto) f.next()).writeToParcel(parcel, i);
            }
        }
        WallPosterConstantsDto wallPosterConstantsDto = this.constants;
        if (wallPosterConstantsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPosterConstantsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallPostingSettingsPosterDto(String str, String str2, String str3, String str4, boolean z, List list, WallPosterConstantsDto wallPosterConstantsDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, z, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : wallPosterConstantsDto);
    }
}
