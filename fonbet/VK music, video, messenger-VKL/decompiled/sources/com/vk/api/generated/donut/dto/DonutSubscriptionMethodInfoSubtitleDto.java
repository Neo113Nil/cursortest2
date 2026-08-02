package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DonutSubscriptionMethodInfoSubtitleDto.kt */
/* loaded from: classes14.dex */
public final class DonutSubscriptionMethodInfoSubtitleDto implements Parcelable {
    public static final Parcelable.Creator<DonutSubscriptionMethodInfoSubtitleDto> CREATOR = new a();

    @pmi0("card_id")
    private final String cardId;

    @pmi0("card_type_name")
    private final String cardTypeName;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("icon_accessibility_label")
    private final String iconAccessibilityLabel;

    @pmi0("mask_text")
    private final String maskText;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutSubscriptionMethodInfoSubtitleDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("change_card")
        public static final TypeDto CHANGE_CARD;

        @pmi0("change_card_with_mask")
        public static final TypeDto CHANGE_CARD_WITH_MASK;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final String value;

        /* compiled from: DonutSubscriptionMethodInfoSubtitleDto.kt */
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
            TypeDto typeDto = new TypeDto("CHANGE_CARD_WITH_MASK", 0, "change_card_with_mask");
            CHANGE_CARD_WITH_MASK = typeDto;
            TypeDto typeDto2 = new TypeDto("CHANGE_CARD", 1, "change_card");
            CHANGE_CARD = typeDto2;
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

    /* compiled from: DonutSubscriptionMethodInfoSubtitleDto.kt */
    public static final class a implements Parcelable.Creator<DonutSubscriptionMethodInfoSubtitleDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutSubscriptionMethodInfoSubtitleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new DonutSubscriptionMethodInfoSubtitleDto(createFromParcel, readString, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutSubscriptionMethodInfoSubtitleDto[] newArray(int i) {
            return new DonutSubscriptionMethodInfoSubtitleDto[i];
        }
    }

    public DonutSubscriptionMethodInfoSubtitleDto(TypeDto typeDto, String str, String str2, List<BaseImageDto> list, String str3, String str4, String str5) {
        this.type = typeDto;
        this.text = str;
        this.maskText = str2;
        this.icon = list;
        this.iconAccessibilityLabel = str3;
        this.cardTypeName = str4;
        this.cardId = str5;
    }

    public final String d() {
        return this.maskText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutSubscriptionMethodInfoSubtitleDto)) {
            return false;
        }
        DonutSubscriptionMethodInfoSubtitleDto donutSubscriptionMethodInfoSubtitleDto = (DonutSubscriptionMethodInfoSubtitleDto) obj;
        return this.type == donutSubscriptionMethodInfoSubtitleDto.type && epx.f(this.text, donutSubscriptionMethodInfoSubtitleDto.text) && epx.f(this.maskText, donutSubscriptionMethodInfoSubtitleDto.maskText) && epx.f(this.icon, donutSubscriptionMethodInfoSubtitleDto.icon) && epx.f(this.iconAccessibilityLabel, donutSubscriptionMethodInfoSubtitleDto.iconAccessibilityLabel) && epx.f(this.cardTypeName, donutSubscriptionMethodInfoSubtitleDto.cardTypeName) && epx.f(this.cardId, donutSubscriptionMethodInfoSubtitleDto.cardId);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.text);
        String str = this.maskText;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.iconAccessibilityLabel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardTypeName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutSubscriptionMethodInfoSubtitleDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", maskText=");
        sb.append(this.maskText);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconAccessibilityLabel=");
        sb.append(this.iconAccessibilityLabel);
        sb.append(", cardTypeName=");
        sb.append(this.cardTypeName);
        sb.append(", cardId=");
        return ho8.a(sb, this.cardId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.maskText);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.iconAccessibilityLabel);
        parcel.writeString(this.cardTypeName);
        parcel.writeString(this.cardId);
    }

    public /* synthetic */ DonutSubscriptionMethodInfoSubtitleDto(TypeDto typeDto, String str, String str2, List list, String str3, String str4, String str5, int i, zcl zclVar) {
        this(typeDto, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
