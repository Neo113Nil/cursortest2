package com.vk.sdk.api.stories.dto;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.apps.dto.AppsAppMinDto;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesFeedItemDto.kt */
/* loaded from: classes5.dex */
public final class StoriesFeedItemDto {

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppMinDto f94app;

    @pmi0("grouped")
    private final List<StoriesFeedItemDto> grouped;

    @pmi0("has_unseen")
    private final Boolean hasUnseen;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final UserId ownerId;

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
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("app_grouped_stories")
        public static final TypeDto APP_GROUPED_STORIES;

        @pmi0("discover")
        public static final TypeDto DISCOVER;

        @pmi0("live_active")
        public static final TypeDto LIVE_ACTIVE;

        @pmi0("live_finished")
        public static final TypeDto LIVE_FINISHED;

        @pmi0("promo_stories")
        public static final TypeDto PROMO_STORIES;

        @pmi0("stories")
        public static final TypeDto STORIES;
        private final String value;

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
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public StoriesFeedItemDto(TypeDto typeDto, String str, UserId userId, List<StoriesStoryDto> list, List<StoriesFeedItemDto> list2, AppsAppMinDto appsAppMinDto, StoriesPromoBlockDto storiesPromoBlockDto, String str2, Boolean bool, String str3) {
        this.type = typeDto;
        this.id = str;
        this.ownerId = userId;
        this.stories = list;
        this.grouped = list2;
        this.f94app = appsAppMinDto;
        this.promoData = storiesPromoBlockDto;
        this.trackCode = str2;
        this.hasUnseen = bool;
        this.name = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesFeedItemDto)) {
            return false;
        }
        StoriesFeedItemDto storiesFeedItemDto = (StoriesFeedItemDto) obj;
        return this.type == storiesFeedItemDto.type && epx.f(this.id, storiesFeedItemDto.id) && epx.f(this.ownerId, storiesFeedItemDto.ownerId) && epx.f(this.stories, storiesFeedItemDto.stories) && epx.f(this.grouped, storiesFeedItemDto.grouped) && epx.f(this.f94app, storiesFeedItemDto.f94app) && epx.f(this.promoData, storiesFeedItemDto.promoData) && epx.f(this.trackCode, storiesFeedItemDto.trackCode) && epx.f(this.hasUnseen, storiesFeedItemDto.hasUnseen) && epx.f(this.name, storiesFeedItemDto.name);
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
        AppsAppMinDto appsAppMinDto = this.f94app;
        int hashCode6 = (hashCode5 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        StoriesPromoBlockDto storiesPromoBlockDto = this.promoData;
        int hashCode7 = (hashCode6 + (storiesPromoBlockDto == null ? 0 : storiesPromoBlockDto.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasUnseen;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.name;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "StoriesFeedItemDto(type=" + this.type + ", id=" + this.id + ", ownerId=" + this.ownerId + ", stories=" + this.stories + ", grouped=" + this.grouped + ", app=" + this.f94app + ", promoData=" + this.promoData + ", trackCode=" + this.trackCode + ", hasUnseen=" + this.hasUnseen + ", name=" + this.name + ")";
    }

    public /* synthetic */ StoriesFeedItemDto(TypeDto typeDto, String str, UserId userId, List list, List list2, AppsAppMinDto appsAppMinDto, StoriesPromoBlockDto storiesPromoBlockDto, String str2, Boolean bool, String str3, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : appsAppMinDto, (i & 64) != 0 ? null : storiesPromoBlockDto, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str3);
    }
}
