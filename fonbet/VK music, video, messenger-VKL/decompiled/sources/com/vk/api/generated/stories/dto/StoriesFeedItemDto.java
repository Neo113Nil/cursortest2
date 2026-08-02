package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesFeedItemDto.kt */
/* loaded from: classes15.dex */
public final class StoriesFeedItemDto implements Parcelable {
    public static final Parcelable.Creator<StoriesFeedItemDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppMinDto f83app;

    @pmi0("decoration_config")
    private final StoriesDecorationConfigDto decorationConfig;

    @pmi0("grouped")
    private final List<StoriesFeedItemDto> grouped;

    @pmi0("has_unseen")
    private final Boolean hasUnseen;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("no_author_link")
    private final Boolean noAuthorLink;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("preview")
    private final StoriesPreviewDto preview;

    @pmi0("promo_data")
    private final StoriesPromoBlockDto promoData;

    @pmi0("stories")
    private final List<StoriesStoryDto> stories;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesFeedItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("app_grouped_stories")
        public static final TypeDto APP_GROUPED_STORIES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("discover")
        public static final TypeDto DISCOVER;

        @pmi0("live_active")
        public static final TypeDto LIVE_ACTIVE;

        @pmi0("live_finished")
        public static final TypeDto LIVE_FINISHED;

        @pmi0("promo_ideas")
        public static final TypeDto PROMO_IDEAS;

        @pmi0("promo_stories")
        public static final TypeDto PROMO_STORIES;

        @pmi0("stories")
        public static final TypeDto STORIES;
        private final String value;

        /* compiled from: StoriesFeedItemDto.kt */
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
            TypeDto typeDto = new TypeDto("PROMO_STORIES", 0, "promo_stories");
            PROMO_STORIES = typeDto;
            TypeDto typeDto2 = new TypeDto("STORIES", 1, "stories");
            STORIES = typeDto2;
            TypeDto typeDto3 = new TypeDto("LIVE_ACTIVE", 2, "live_active");
            LIVE_ACTIVE = typeDto3;
            TypeDto typeDto4 = new TypeDto("LIVE_FINISHED", 3, "live_finished");
            LIVE_FINISHED = typeDto4;
            TypeDto typeDto5 = new TypeDto("APP_GROUPED_STORIES", 4, "app_grouped_stories");
            APP_GROUPED_STORIES = typeDto5;
            TypeDto typeDto6 = new TypeDto("DISCOVER", 5, "discover");
            DISCOVER = typeDto6;
            TypeDto typeDto7 = new TypeDto("PROMO_IDEAS", 6, "promo_ideas");
            PROMO_IDEAS = typeDto7;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7};
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

    /* compiled from: StoriesFeedItemDto.kt */
    public static final class a implements Parcelable.Creator<StoriesFeedItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesFeedItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(StoriesFeedItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoriesFeedItemDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(StoriesFeedItemDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(StoriesFeedItemDto.class.getClassLoader());
            StoriesPromoBlockDto createFromParcel2 = parcel.readInt() == 0 ? null : StoriesPromoBlockDto.CREATOR.createFromParcel(parcel);
            StoriesDecorationConfigDto createFromParcel3 = parcel.readInt() == 0 ? null : StoriesDecorationConfigDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList3 = arrayList2;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesFeedItemDto(createFromParcel, readString, userId, arrayList, arrayList3, appsAppMinDto, createFromParcel2, createFromParcel3, readString2, valueOf, readString3, valueOf2, parcel.readInt() != 0 ? StoriesPreviewDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesFeedItemDto[] newArray(int i) {
            return new StoriesFeedItemDto[i];
        }
    }

    public StoriesFeedItemDto(TypeDto typeDto, String str, UserId userId, List<StoriesStoryDto> list, List<StoriesFeedItemDto> list2, AppsAppMinDto appsAppMinDto, StoriesPromoBlockDto storiesPromoBlockDto, StoriesDecorationConfigDto storiesDecorationConfigDto, String str2, Boolean bool, String str3, Boolean bool2, StoriesPreviewDto storiesPreviewDto) {
        this.type = typeDto;
        this.id = str;
        this.ownerId = userId;
        this.stories = list;
        this.grouped = list2;
        this.f83app = appsAppMinDto;
        this.promoData = storiesPromoBlockDto;
        this.decorationConfig = storiesDecorationConfigDto;
        this.trackCode = str2;
        this.hasUnseen = bool;
        this.name = str3;
        this.noAuthorLink = bool2;
        this.preview = storiesPreviewDto;
    }

    public final AppsAppMinDto d() {
        return this.f83app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StoriesDecorationConfigDto e() {
        return this.decorationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesFeedItemDto)) {
            return false;
        }
        StoriesFeedItemDto storiesFeedItemDto = (StoriesFeedItemDto) obj;
        return this.type == storiesFeedItemDto.type && epx.f(this.id, storiesFeedItemDto.id) && epx.f(this.ownerId, storiesFeedItemDto.ownerId) && epx.f(this.stories, storiesFeedItemDto.stories) && epx.f(this.grouped, storiesFeedItemDto.grouped) && epx.f(this.f83app, storiesFeedItemDto.f83app) && epx.f(this.promoData, storiesFeedItemDto.promoData) && epx.f(this.decorationConfig, storiesFeedItemDto.decorationConfig) && epx.f(this.trackCode, storiesFeedItemDto.trackCode) && epx.f(this.hasUnseen, storiesFeedItemDto.hasUnseen) && epx.f(this.name, storiesFeedItemDto.name) && epx.f(this.noAuthorLink, storiesFeedItemDto.noAuthorLink) && epx.f(this.preview, storiesFeedItemDto.preview);
    }

    public final List<StoriesFeedItemDto> f() {
        return this.grouped;
    }

    public final Boolean g() {
        return this.hasUnseen;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<StoriesStoryDto> list = this.stories;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<StoriesFeedItemDto> list2 = this.grouped;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.f83app;
        int hashCode6 = (hashCode5 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        StoriesPromoBlockDto storiesPromoBlockDto = this.promoData;
        int hashCode7 = (hashCode6 + (storiesPromoBlockDto == null ? 0 : storiesPromoBlockDto.hashCode())) * 31;
        StoriesDecorationConfigDto storiesDecorationConfigDto = this.decorationConfig;
        int hashCode8 = (hashCode7 + (storiesDecorationConfigDto == null ? 0 : storiesDecorationConfigDto.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasUnseen;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.name;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.noAuthorLink;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StoriesPreviewDto storiesPreviewDto = this.preview;
        return hashCode12 + (storiesPreviewDto != null ? storiesPreviewDto.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final Boolean j() {
        return this.noAuthorLink;
    }

    public final StoriesPromoBlockDto k() {
        return this.promoData;
    }

    public final List<StoriesStoryDto> l() {
        return this.stories;
    }

    public final TypeDto n() {
        return this.type;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "StoriesFeedItemDto(type=" + this.type + ", id=" + this.id + ", ownerId=" + this.ownerId + ", stories=" + this.stories + ", grouped=" + this.grouped + ", app=" + this.f83app + ", promoData=" + this.promoData + ", decorationConfig=" + this.decorationConfig + ", trackCode=" + this.trackCode + ", hasUnseen=" + this.hasUnseen + ", name=" + this.name + ", noAuthorLink=" + this.noAuthorLink + ", preview=" + this.preview + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeParcelable(this.ownerId, i);
        List<StoriesStoryDto> list = this.stories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<StoriesFeedItemDto> list2 = this.grouped;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((StoriesFeedItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.f83app, i);
        StoriesPromoBlockDto storiesPromoBlockDto = this.promoData;
        if (storiesPromoBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesPromoBlockDto.writeToParcel(parcel, i);
        }
        StoriesDecorationConfigDto storiesDecorationConfigDto = this.decorationConfig;
        if (storiesDecorationConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesDecorationConfigDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        Boolean bool = this.hasUnseen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.name);
        Boolean bool2 = this.noAuthorLink;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        StoriesPreviewDto storiesPreviewDto = this.preview;
        if (storiesPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesPreviewDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StoriesFeedItemDto(TypeDto typeDto, String str, UserId userId, List list, List list2, AppsAppMinDto appsAppMinDto, StoriesPromoBlockDto storiesPromoBlockDto, StoriesDecorationConfigDto storiesDecorationConfigDto, String str2, Boolean bool, String str3, Boolean bool2, StoriesPreviewDto storiesPreviewDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : appsAppMinDto, (i & 64) != 0 ? null : storiesPromoBlockDto, (i & 128) != 0 ? null : storiesDecorationConfigDto, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : storiesPreviewDto);
    }
}
