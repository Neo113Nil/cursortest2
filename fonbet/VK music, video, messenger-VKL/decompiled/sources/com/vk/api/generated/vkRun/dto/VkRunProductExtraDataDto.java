package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.up;
import xsna.uqi;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunProductExtraDataDto.kt */
/* loaded from: classes15.dex */
public abstract class VkRunProductExtraDataDto implements Parcelable {

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class Deserializer implements a9y<VkRunProductExtraDataDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "product_type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -2031136805:
                        if (f.equals("sticker_pack")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunStickerPackProductExtraDataDto.class);
                        }
                        break;
                    case -1354573786:
                        if (f.equals("coupon")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunCouponProductExtraDataDto.class);
                        }
                        break;
                    case 97739:
                        if (f.equals("box")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunBoxProductExtraDataDto.class);
                        }
                        break;
                    case 94839810:
                        if (f.equals("coins")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunCoinsProductExtraDataDto.class);
                        }
                        break;
                    case 96632902:
                        if (f.equals("emoji")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunEmojiProductExtraDataDto.class);
                        }
                        break;
                    case 112332759:
                        if (f.equals("vmoji")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunVmojiProductExtraDataDto.class);
                        }
                        break;
                    case 354670409:
                        if (f.equals("lottery")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunTicketProductExtraDataDto.class);
                        }
                        break;
                    case 1614918151:
                        if (f.equals("page_cover")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunPageCoverProductExtraDataDto.class);
                        }
                        break;
                    case 1747619631:
                        if (f.equals("achievement")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunAchievementProductExtraDataDto.class);
                        }
                        break;
                    case 1768801076:
                        if (f.equals("infinity_box")) {
                            return (VkRunProductExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunInfinityBoxProductExtraDataDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunAchievementProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunAchievementProductExtraDataDto> CREATOR = new a();

        @pmi0("id")
        private final String id;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunAchievementProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunAchievementProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunAchievementProductExtraDataDto(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunAchievementProductExtraDataDto[] newArray(int i) {
                return new VkRunAchievementProductExtraDataDto[i];
            }
        }

        public VkRunAchievementProductExtraDataDto(String str, String str2) {
            super(null);
            this.id = str;
            this.productType = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunAchievementProductExtraDataDto)) {
                return false;
            }
            VkRunAchievementProductExtraDataDto vkRunAchievementProductExtraDataDto = (VkRunAchievementProductExtraDataDto) obj;
            return epx.f(this.id, vkRunAchievementProductExtraDataDto.id) && epx.f(this.productType, vkRunAchievementProductExtraDataDto.productType);
        }

        public final int hashCode() {
            return this.productType.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunAchievementProductExtraDataDto(id=");
            sb.append(this.id);
            sb.append(", productType=");
            return ho8.a(sb, this.productType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.productType);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunBoxProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunBoxProductExtraDataDto> CREATOR = new a();

        @pmi0("product_type")
        private final String productType;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("golden")
            public static final TypeDto GOLDEN;

            @pmi0("moon")
            public static final TypeDto MOON;
            private final String value;

            /* compiled from: VkRunProductExtraDataDto.kt */
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
                TypeDto typeDto = new TypeDto("MOON", 0, "moon");
                MOON = typeDto;
                TypeDto typeDto2 = new TypeDto("GOLDEN", 1, "golden");
                GOLDEN = typeDto2;
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

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunBoxProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunBoxProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunBoxProductExtraDataDto(parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunBoxProductExtraDataDto[] newArray(int i) {
                return new VkRunBoxProductExtraDataDto[i];
            }
        }

        public VkRunBoxProductExtraDataDto(String str, TypeDto typeDto) {
            super(null);
            this.productType = str;
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunBoxProductExtraDataDto)) {
                return false;
            }
            VkRunBoxProductExtraDataDto vkRunBoxProductExtraDataDto = (VkRunBoxProductExtraDataDto) obj;
            return epx.f(this.productType, vkRunBoxProductExtraDataDto.productType) && this.type == vkRunBoxProductExtraDataDto.type;
        }

        public final int hashCode() {
            return this.type.hashCode() + (this.productType.hashCode() * 31);
        }

        public final String toString() {
            return "VkRunBoxProductExtraDataDto(productType=" + this.productType + ", type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.productType);
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunCoinsProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunCoinsProductExtraDataDto> CREATOR = new a();

        @pmi0("amount")
        private final int amount;

        @pmi0("boost")
        private final Integer boost;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunCoinsProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunCoinsProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunCoinsProductExtraDataDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunCoinsProductExtraDataDto[] newArray(int i) {
                return new VkRunCoinsProductExtraDataDto[i];
            }
        }

        public /* synthetic */ VkRunCoinsProductExtraDataDto(String str, int i, Integer num, int i2, zcl zclVar) {
            this(str, i, (i2 & 4) != 0 ? null : num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunCoinsProductExtraDataDto)) {
                return false;
            }
            VkRunCoinsProductExtraDataDto vkRunCoinsProductExtraDataDto = (VkRunCoinsProductExtraDataDto) obj;
            return epx.f(this.productType, vkRunCoinsProductExtraDataDto.productType) && this.amount == vkRunCoinsProductExtraDataDto.amount && epx.f(this.boost, vkRunCoinsProductExtraDataDto.boost);
        }

        public final int hashCode() {
            int a2 = shy.a(this.amount, this.productType.hashCode() * 31, 31);
            Integer num = this.boost;
            return a2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunCoinsProductExtraDataDto(productType=");
            sb.append(this.productType);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", boost=");
            return uqi.b(sb, this.boost, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.productType);
            parcel.writeInt(this.amount);
            Integer num = this.boost;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public VkRunCoinsProductExtraDataDto(String str, int i, Integer num) {
            super(null);
            this.productType = str;
            this.amount = i;
            this.boost = num;
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunCouponProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunCouponProductExtraDataDto> CREATOR = new a();

        @pmi0("coupon_link")
        private final String couponLink;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunCouponProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunCouponProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunCouponProductExtraDataDto(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunCouponProductExtraDataDto[] newArray(int i) {
                return new VkRunCouponProductExtraDataDto[i];
            }
        }

        public /* synthetic */ VkRunCouponProductExtraDataDto(String str, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunCouponProductExtraDataDto)) {
                return false;
            }
            VkRunCouponProductExtraDataDto vkRunCouponProductExtraDataDto = (VkRunCouponProductExtraDataDto) obj;
            return epx.f(this.productType, vkRunCouponProductExtraDataDto.productType) && epx.f(this.couponLink, vkRunCouponProductExtraDataDto.couponLink);
        }

        public final int hashCode() {
            int hashCode = this.productType.hashCode() * 31;
            String str = this.couponLink;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunCouponProductExtraDataDto(productType=");
            sb.append(this.productType);
            sb.append(", couponLink=");
            return ho8.a(sb, this.couponLink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.productType);
            parcel.writeString(this.couponLink);
        }

        public VkRunCouponProductExtraDataDto(String str, String str2) {
            super(null);
            this.productType = str;
            this.couponLink = str2;
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunEmojiProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunEmojiProductExtraDataDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("is_set")
        private final boolean isSet;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunEmojiProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunEmojiProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunEmojiProductExtraDataDto(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunEmojiProductExtraDataDto[] newArray(int i) {
                return new VkRunEmojiProductExtraDataDto[i];
            }
        }

        public VkRunEmojiProductExtraDataDto(int i, boolean z, String str) {
            super(null);
            this.id = i;
            this.isSet = z;
            this.productType = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunEmojiProductExtraDataDto)) {
                return false;
            }
            VkRunEmojiProductExtraDataDto vkRunEmojiProductExtraDataDto = (VkRunEmojiProductExtraDataDto) obj;
            return this.id == vkRunEmojiProductExtraDataDto.id && this.isSet == vkRunEmojiProductExtraDataDto.isSet && epx.f(this.productType, vkRunEmojiProductExtraDataDto.productType);
        }

        public final int hashCode() {
            return this.productType.hashCode() + qoy.b(Integer.hashCode(this.id) * 31, 31, this.isSet);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunEmojiProductExtraDataDto(id=");
            sb.append(this.id);
            sb.append(", isSet=");
            sb.append(this.isSet);
            sb.append(", productType=");
            return ho8.a(sb, this.productType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.id);
            parcel.writeInt(this.isSet ? 1 : 0);
            parcel.writeString(this.productType);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunInfinityBoxProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunInfinityBoxProductExtraDataDto> CREATOR = new a();

        @pmi0("earned_boxes_total")
        private final int earnedBoxesTotal;

        @pmi0("percent")
        private final int percent;

        @pmi0("product_type")
        private final String productType;

        @pmi0("steps_remained")
        private final int stepsRemained;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunInfinityBoxProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunInfinityBoxProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunInfinityBoxProductExtraDataDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunInfinityBoxProductExtraDataDto[] newArray(int i) {
                return new VkRunInfinityBoxProductExtraDataDto[i];
            }
        }

        public VkRunInfinityBoxProductExtraDataDto(int i, int i2, int i3, String str) {
            super(null);
            this.percent = i;
            this.stepsRemained = i2;
            this.earnedBoxesTotal = i3;
            this.productType = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunInfinityBoxProductExtraDataDto)) {
                return false;
            }
            VkRunInfinityBoxProductExtraDataDto vkRunInfinityBoxProductExtraDataDto = (VkRunInfinityBoxProductExtraDataDto) obj;
            return this.percent == vkRunInfinityBoxProductExtraDataDto.percent && this.stepsRemained == vkRunInfinityBoxProductExtraDataDto.stepsRemained && this.earnedBoxesTotal == vkRunInfinityBoxProductExtraDataDto.earnedBoxesTotal && epx.f(this.productType, vkRunInfinityBoxProductExtraDataDto.productType);
        }

        public final int hashCode() {
            return this.productType.hashCode() + shy.a(this.earnedBoxesTotal, shy.a(this.stepsRemained, Integer.hashCode(this.percent) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunInfinityBoxProductExtraDataDto(percent=");
            sb.append(this.percent);
            sb.append(", stepsRemained=");
            sb.append(this.stepsRemained);
            sb.append(", earnedBoxesTotal=");
            sb.append(this.earnedBoxesTotal);
            sb.append(", productType=");
            return ho8.a(sb, this.productType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.percent);
            parcel.writeInt(this.stepsRemained);
            parcel.writeInt(this.earnedBoxesTotal);
            parcel.writeString(this.productType);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunPageCoverProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunPageCoverProductExtraDataDto> CREATOR = new a();

        @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
        private final String imageUrl;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunPageCoverProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunPageCoverProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunPageCoverProductExtraDataDto(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunPageCoverProductExtraDataDto[] newArray(int i) {
                return new VkRunPageCoverProductExtraDataDto[i];
            }
        }

        public VkRunPageCoverProductExtraDataDto(String str, String str2) {
            super(null);
            this.imageUrl = str;
            this.productType = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunPageCoverProductExtraDataDto)) {
                return false;
            }
            VkRunPageCoverProductExtraDataDto vkRunPageCoverProductExtraDataDto = (VkRunPageCoverProductExtraDataDto) obj;
            return epx.f(this.imageUrl, vkRunPageCoverProductExtraDataDto.imageUrl) && epx.f(this.productType, vkRunPageCoverProductExtraDataDto.productType);
        }

        public final int hashCode() {
            return this.productType.hashCode() + (this.imageUrl.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunPageCoverProductExtraDataDto(imageUrl=");
            sb.append(this.imageUrl);
            sb.append(", productType=");
            return ho8.a(sb, this.productType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.imageUrl);
            parcel.writeString(this.productType);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunStickerPackProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunStickerPackProductExtraDataDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunStickerPackProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunStickerPackProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunStickerPackProductExtraDataDto(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunStickerPackProductExtraDataDto[] newArray(int i) {
                return new VkRunStickerPackProductExtraDataDto[i];
            }
        }

        public VkRunStickerPackProductExtraDataDto(int i, String str) {
            super(null);
            this.id = i;
            this.productType = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunStickerPackProductExtraDataDto)) {
                return false;
            }
            VkRunStickerPackProductExtraDataDto vkRunStickerPackProductExtraDataDto = (VkRunStickerPackProductExtraDataDto) obj;
            return this.id == vkRunStickerPackProductExtraDataDto.id && epx.f(this.productType, vkRunStickerPackProductExtraDataDto.productType);
        }

        public final int hashCode() {
            return this.productType.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunStickerPackProductExtraDataDto(id=");
            sb.append(this.id);
            sb.append(", productType=");
            return ho8.a(sb, this.productType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.id);
            parcel.writeString(this.productType);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunTicketProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunTicketProductExtraDataDto> CREATOR = new a();

        @pmi0("amount")
        private final int amount;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunTicketProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunTicketProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunTicketProductExtraDataDto(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunTicketProductExtraDataDto[] newArray(int i) {
                return new VkRunTicketProductExtraDataDto[i];
            }
        }

        public VkRunTicketProductExtraDataDto(String str, int i) {
            super(null);
            this.productType = str;
            this.amount = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunTicketProductExtraDataDto)) {
                return false;
            }
            VkRunTicketProductExtraDataDto vkRunTicketProductExtraDataDto = (VkRunTicketProductExtraDataDto) obj;
            return epx.f(this.productType, vkRunTicketProductExtraDataDto.productType) && this.amount == vkRunTicketProductExtraDataDto.amount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.amount) + (this.productType.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunTicketProductExtraDataDto(productType=");
            sb.append(this.productType);
            sb.append(", amount=");
            return vu5.b(sb, this.amount, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.productType);
            parcel.writeInt(this.amount);
        }
    }

    /* compiled from: VkRunProductExtraDataDto.kt */
    public static final class VkRunVmojiProductExtraDataDto extends VkRunProductExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunVmojiProductExtraDataDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("product_type")
        private final String productType;

        /* compiled from: VkRunProductExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunVmojiProductExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunVmojiProductExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunVmojiProductExtraDataDto(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunVmojiProductExtraDataDto[] newArray(int i) {
                return new VkRunVmojiProductExtraDataDto[i];
            }
        }

        public VkRunVmojiProductExtraDataDto(int i, String str) {
            super(null);
            this.id = i;
            this.productType = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunVmojiProductExtraDataDto)) {
                return false;
            }
            VkRunVmojiProductExtraDataDto vkRunVmojiProductExtraDataDto = (VkRunVmojiProductExtraDataDto) obj;
            return this.id == vkRunVmojiProductExtraDataDto.id && epx.f(this.productType, vkRunVmojiProductExtraDataDto.productType);
        }

        public final int hashCode() {
            return this.productType.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunVmojiProductExtraDataDto(id=");
            sb.append(this.id);
            sb.append(", productType=");
            return ho8.a(sb, this.productType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.id);
            parcel.writeString(this.productType);
        }
    }

    public /* synthetic */ VkRunProductExtraDataDto(zcl zclVar) {
        this();
    }

    private VkRunProductExtraDataDto() {
    }
}
