package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.jax0;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.sq;
import xsna.to;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsGetSettingsResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetSettingsResponseDto {

    @pmi0("access")
    private final GroupsGroupAccessDto access;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("addresses")
    private final Boolean addresses;

    @pmi0("age_limits")
    private final GroupsGroupAgeLimitsDto ageLimits;

    @pmi0("articles")
    private final int articles;

    @pmi0("audio")
    private final GroupsGroupAudioDto audio;

    @pmi0("bots_add_to_chat")
    private final BaseBoolIntDto botsAddToChat;

    @pmi0("bots_capabilities")
    private final BaseBoolIntDto botsCapabilities;

    @pmi0("bots_start_button")
    private final BaseBoolIntDto botsStartButton;

    @pmi0("city_id")
    private final int cityId;

    @pmi0("city_name")
    private final String cityName;

    @pmi0("contacts")
    private final BaseBoolIntDto contacts;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final int countryId;

    @pmi0("country_name")
    private final String countryName;

    @pmi0("description")
    private final String description;

    @pmi0("docs")
    private final GroupsGroupDocsDto docs;

    @pmi0("email")
    private final String email;

    @pmi0("event_group_id")
    private final Integer eventGroupId;

    @pmi0("events")
    private final BaseBoolIntDto events;

    @pmi0("finish_date")
    private final Integer finishDate;

    @pmi0("links")
    private final BaseBoolIntDto links;

    @pmi0("main_section")
    private final GroupsGroupFullSectionDto mainSection;

    @pmi0("obscene_filter")
    private final BaseBoolIntDto obsceneFilter;

    @pmi0("obscene_stopwords")
    private final BaseBoolIntDto obsceneStopwords;

    @pmi0("obscene_words")
    private final List<String> obsceneWords;

    @pmi0("phone")
    private final String phone;

    @pmi0("photos")
    private final GroupsGroupPhotosDto photos;

    @pmi0("public_category")
    private final Integer publicCategory;

    @pmi0("public_category_list")
    private final List<GroupsGroupPublicCategoryListDto> publicCategoryList;

    @pmi0("public_date")
    private final String publicDate;

    @pmi0("public_date_label")
    private final String publicDateLabel;

    @pmi0("public_subcategory")
    private final Integer publicSubcategory;

    @pmi0("recognize_photo")
    private final Integer recognizePhoto;

    @pmi0("rss")
    private final String rss;

    @pmi0("secondary_section")
    private final GroupsGroupFullSectionDto secondarySection;

    @pmi0("sections_list")
    private final List<List<Integer>> sectionsList;

    @pmi0("start_date")
    private final Integer startDate;

    @pmi0("subject")
    private final Integer subject;

    @pmi0("subject_list")
    private final List<GroupsSubjectItemDto> subjectList;

    @pmi0("suggested_privacy")
    private final GroupsGroupSuggestedPrivacyDto suggestedPrivacy;

    @pmi0("title")
    private final String title;

    @pmi0("topics")
    private final GroupsGroupTopicsDto topics;

    @pmi0("twitter")
    private final GroupsSettingsTwitterDto twitter;

    @pmi0("video")
    private final GroupsGroupVideoDto video;

    @pmi0("wall")
    private final GroupsGroupWallDto wall;

    @pmi0("website")
    private final String website;

    @pmi0("wiki")
    private final GroupsGroupWikiDto wiki;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsGetSettingsResponseDto(GroupsGroupAudioDto groupsGroupAudioDto, int i, int i2, String str, int i3, String str2, String str3, GroupsGroupDocsDto groupsGroupDocsDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, List<String> list, GroupsGroupPhotosDto groupsGroupPhotosDto, String str4, GroupsGroupTopicsDto groupsGroupTopicsDto, GroupsGroupVideoDto groupsGroupVideoDto, GroupsGroupWallDto groupsGroupWallDto, GroupsGroupWikiDto groupsGroupWikiDto, GroupsGroupAccessDto groupsGroupAccessDto, String str5, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, List<? extends List<Integer>> list2, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsGroupFullSectionDto groupsGroupFullSectionDto2, GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto, BaseBoolIntDto baseBoolIntDto5, Boolean bool, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, Integer num2, Integer num3, List<GroupsGroupPublicCategoryListDto> list3, String str6, String str7, Integer num4, String str8, Integer num5, Integer num6, Integer num7, List<GroupsSubjectItemDto> list4, GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto, GroupsSettingsTwitterDto groupsSettingsTwitterDto, String str9, String str10, String str11) {
        this.audio = groupsGroupAudioDto;
        this.articles = i;
        this.cityId = i2;
        this.cityName = str;
        this.countryId = i3;
        this.countryName = str2;
        this.description = str3;
        this.docs = groupsGroupDocsDto;
        this.obsceneFilter = baseBoolIntDto;
        this.obsceneStopwords = baseBoolIntDto2;
        this.obsceneWords = list;
        this.photos = groupsGroupPhotosDto;
        this.title = str4;
        this.topics = groupsGroupTopicsDto;
        this.video = groupsGroupVideoDto;
        this.wall = groupsGroupWallDto;
        this.wiki = groupsGroupWikiDto;
        this.access = groupsGroupAccessDto;
        this.address = str5;
        this.recognizePhoto = num;
        this.contacts = baseBoolIntDto3;
        this.links = baseBoolIntDto4;
        this.sectionsList = list2;
        this.mainSection = groupsGroupFullSectionDto;
        this.secondarySection = groupsGroupFullSectionDto2;
        this.ageLimits = groupsGroupAgeLimitsDto;
        this.events = baseBoolIntDto5;
        this.addresses = bool;
        this.botsCapabilities = baseBoolIntDto6;
        this.botsStartButton = baseBoolIntDto7;
        this.botsAddToChat = baseBoolIntDto8;
        this.eventGroupId = num2;
        this.publicCategory = num3;
        this.publicCategoryList = list3;
        this.publicDate = str6;
        this.publicDateLabel = str7;
        this.publicSubcategory = num4;
        this.rss = str8;
        this.startDate = num5;
        this.finishDate = num6;
        this.subject = num7;
        this.subjectList = list4;
        this.suggestedPrivacy = groupsGroupSuggestedPrivacyDto;
        this.twitter = groupsSettingsTwitterDto;
        this.website = str9;
        this.phone = str10;
        this.email = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetSettingsResponseDto)) {
            return false;
        }
        GroupsGetSettingsResponseDto groupsGetSettingsResponseDto = (GroupsGetSettingsResponseDto) obj;
        return this.audio == groupsGetSettingsResponseDto.audio && this.articles == groupsGetSettingsResponseDto.articles && this.cityId == groupsGetSettingsResponseDto.cityId && epx.f(this.cityName, groupsGetSettingsResponseDto.cityName) && this.countryId == groupsGetSettingsResponseDto.countryId && epx.f(this.countryName, groupsGetSettingsResponseDto.countryName) && epx.f(this.description, groupsGetSettingsResponseDto.description) && this.docs == groupsGetSettingsResponseDto.docs && this.obsceneFilter == groupsGetSettingsResponseDto.obsceneFilter && this.obsceneStopwords == groupsGetSettingsResponseDto.obsceneStopwords && epx.f(this.obsceneWords, groupsGetSettingsResponseDto.obsceneWords) && this.photos == groupsGetSettingsResponseDto.photos && epx.f(this.title, groupsGetSettingsResponseDto.title) && this.topics == groupsGetSettingsResponseDto.topics && this.video == groupsGetSettingsResponseDto.video && this.wall == groupsGetSettingsResponseDto.wall && this.wiki == groupsGetSettingsResponseDto.wiki && this.access == groupsGetSettingsResponseDto.access && epx.f(this.address, groupsGetSettingsResponseDto.address) && epx.f(this.recognizePhoto, groupsGetSettingsResponseDto.recognizePhoto) && this.contacts == groupsGetSettingsResponseDto.contacts && this.links == groupsGetSettingsResponseDto.links && epx.f(this.sectionsList, groupsGetSettingsResponseDto.sectionsList) && this.mainSection == groupsGetSettingsResponseDto.mainSection && this.secondarySection == groupsGetSettingsResponseDto.secondarySection && this.ageLimits == groupsGetSettingsResponseDto.ageLimits && this.events == groupsGetSettingsResponseDto.events && epx.f(this.addresses, groupsGetSettingsResponseDto.addresses) && this.botsCapabilities == groupsGetSettingsResponseDto.botsCapabilities && this.botsStartButton == groupsGetSettingsResponseDto.botsStartButton && this.botsAddToChat == groupsGetSettingsResponseDto.botsAddToChat && epx.f(this.eventGroupId, groupsGetSettingsResponseDto.eventGroupId) && epx.f(this.publicCategory, groupsGetSettingsResponseDto.publicCategory) && epx.f(this.publicCategoryList, groupsGetSettingsResponseDto.publicCategoryList) && epx.f(this.publicDate, groupsGetSettingsResponseDto.publicDate) && epx.f(this.publicDateLabel, groupsGetSettingsResponseDto.publicDateLabel) && epx.f(this.publicSubcategory, groupsGetSettingsResponseDto.publicSubcategory) && epx.f(this.rss, groupsGetSettingsResponseDto.rss) && epx.f(this.startDate, groupsGetSettingsResponseDto.startDate) && epx.f(this.finishDate, groupsGetSettingsResponseDto.finishDate) && epx.f(this.subject, groupsGetSettingsResponseDto.subject) && epx.f(this.subjectList, groupsGetSettingsResponseDto.subjectList) && this.suggestedPrivacy == groupsGetSettingsResponseDto.suggestedPrivacy && epx.f(this.twitter, groupsGetSettingsResponseDto.twitter) && epx.f(this.website, groupsGetSettingsResponseDto.website) && epx.f(this.phone, groupsGetSettingsResponseDto.phone) && epx.f(this.email, groupsGetSettingsResponseDto.email);
    }

    public final int hashCode() {
        int hashCode = (this.wiki.hashCode() + ((this.wall.hashCode() + ((this.video.hashCode() + ((this.topics.hashCode() + urd0.a((this.photos.hashCode() + fw3.a(vp.a(this.obsceneStopwords, vp.a(this.obsceneFilter, (this.docs.hashCode() + urd0.a(urd0.a(shy.a(this.countryId, urd0.a(shy.a(this.cityId, shy.a(this.articles, this.audio.hashCode() * 31, 31), 31), 31, this.cityName), 31), 31, this.countryName), 31, this.description)) * 31, 31), 31), 31, this.obsceneWords)) * 31, 31, this.title)) * 31)) * 31)) * 31)) * 31;
        GroupsGroupAccessDto groupsGroupAccessDto = this.access;
        int hashCode2 = (hashCode + (groupsGroupAccessDto == null ? 0 : groupsGroupAccessDto.hashCode())) * 31;
        String str = this.address;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.recognizePhoto;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.contacts;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.links;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        List<List<Integer>> list = this.sectionsList;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        int hashCode8 = (hashCode7 + (groupsGroupFullSectionDto == null ? 0 : groupsGroupFullSectionDto.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = this.secondarySection;
        int hashCode9 = (hashCode8 + (groupsGroupFullSectionDto2 == null ? 0 : groupsGroupFullSectionDto2.hashCode())) * 31;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = this.ageLimits;
        int hashCode10 = (hashCode9 + (groupsGroupAgeLimitsDto == null ? 0 : groupsGroupAgeLimitsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.events;
        int hashCode11 = (hashCode10 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.addresses;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.botsCapabilities;
        int hashCode13 = (hashCode12 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.botsStartButton;
        int hashCode14 = (hashCode13 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.botsAddToChat;
        int hashCode15 = (hashCode14 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        Integer num2 = this.eventGroupId;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.publicCategory;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<GroupsGroupPublicCategoryListDto> list2 = this.publicCategoryList;
        int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.publicDate;
        int hashCode19 = (hashCode18 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicDateLabel;
        int hashCode20 = (hashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.publicSubcategory;
        int hashCode21 = (hashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.rss;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.startDate;
        int hashCode23 = (hashCode22 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.finishDate;
        int hashCode24 = (hashCode23 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.subject;
        int hashCode25 = (hashCode24 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<GroupsSubjectItemDto> list3 = this.subjectList;
        int hashCode26 = (hashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto = this.suggestedPrivacy;
        int hashCode27 = (hashCode26 + (groupsGroupSuggestedPrivacyDto == null ? 0 : groupsGroupSuggestedPrivacyDto.hashCode())) * 31;
        GroupsSettingsTwitterDto groupsSettingsTwitterDto = this.twitter;
        int hashCode28 = (hashCode27 + (groupsSettingsTwitterDto == null ? 0 : groupsSettingsTwitterDto.hashCode())) * 31;
        String str5 = this.website;
        int hashCode29 = (hashCode28 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode30 = (hashCode29 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        return hashCode30 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        GroupsGroupAudioDto groupsGroupAudioDto = this.audio;
        int i = this.articles;
        int i2 = this.cityId;
        String str = this.cityName;
        int i3 = this.countryId;
        String str2 = this.countryName;
        String str3 = this.description;
        GroupsGroupDocsDto groupsGroupDocsDto = this.docs;
        BaseBoolIntDto baseBoolIntDto = this.obsceneFilter;
        BaseBoolIntDto baseBoolIntDto2 = this.obsceneStopwords;
        List<String> list = this.obsceneWords;
        GroupsGroupPhotosDto groupsGroupPhotosDto = this.photos;
        String str4 = this.title;
        GroupsGroupTopicsDto groupsGroupTopicsDto = this.topics;
        GroupsGroupVideoDto groupsGroupVideoDto = this.video;
        GroupsGroupWallDto groupsGroupWallDto = this.wall;
        GroupsGroupWikiDto groupsGroupWikiDto = this.wiki;
        GroupsGroupAccessDto groupsGroupAccessDto = this.access;
        String str5 = this.address;
        Integer num = this.recognizePhoto;
        BaseBoolIntDto baseBoolIntDto3 = this.contacts;
        BaseBoolIntDto baseBoolIntDto4 = this.links;
        List<List<Integer>> list2 = this.sectionsList;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = this.secondarySection;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = this.ageLimits;
        BaseBoolIntDto baseBoolIntDto5 = this.events;
        Boolean bool = this.addresses;
        BaseBoolIntDto baseBoolIntDto6 = this.botsCapabilities;
        BaseBoolIntDto baseBoolIntDto7 = this.botsStartButton;
        BaseBoolIntDto baseBoolIntDto8 = this.botsAddToChat;
        Integer num2 = this.eventGroupId;
        Integer num3 = this.publicCategory;
        List<GroupsGroupPublicCategoryListDto> list3 = this.publicCategoryList;
        String str6 = this.publicDate;
        String str7 = this.publicDateLabel;
        Integer num4 = this.publicSubcategory;
        String str8 = this.rss;
        Integer num5 = this.startDate;
        Integer num6 = this.finishDate;
        Integer num7 = this.subject;
        List<GroupsSubjectItemDto> list4 = this.subjectList;
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto = this.suggestedPrivacy;
        GroupsSettingsTwitterDto groupsSettingsTwitterDto = this.twitter;
        String str9 = this.website;
        String str10 = this.phone;
        String str11 = this.email;
        StringBuilder sb = new StringBuilder("GroupsGetSettingsResponseDto(audio=");
        sb.append(groupsGroupAudioDto);
        sb.append(", articles=");
        sb.append(i);
        sb.append(", cityId=");
        jax0.a(i2, ", cityName=", str, ", countryId=", sb);
        jax0.a(i3, ", countryName=", str2, ", description=", sb);
        sb.append(str3);
        sb.append(", docs=");
        sb.append(groupsGroupDocsDto);
        sb.append(", obsceneFilter=");
        to.b(sb, baseBoolIntDto, ", obsceneStopwords=", baseBoolIntDto2, ", obsceneWords=");
        sb.append(list);
        sb.append(", photos=");
        sb.append(groupsGroupPhotosDto);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", topics=");
        sb.append(groupsGroupTopicsDto);
        sb.append(", video=");
        sb.append(groupsGroupVideoDto);
        sb.append(", wall=");
        sb.append(groupsGroupWallDto);
        sb.append(", wiki=");
        sb.append(groupsGroupWikiDto);
        sb.append(", access=");
        sb.append(groupsGroupAccessDto);
        sb.append(", address=");
        kr.b(num, str5, ", recognizePhoto=", ", contacts=", sb);
        to.b(sb, baseBoolIntDto3, ", links=", baseBoolIntDto4, ", sectionsList=");
        sb.append(list2);
        sb.append(", mainSection=");
        sb.append(groupsGroupFullSectionDto);
        sb.append(", secondarySection=");
        sb.append(groupsGroupFullSectionDto2);
        sb.append(", ageLimits=");
        sb.append(groupsGroupAgeLimitsDto);
        sb.append(", events=");
        sb.append(baseBoolIntDto5);
        sb.append(", addresses=");
        sb.append(bool);
        sb.append(", botsCapabilities=");
        to.b(sb, baseBoolIntDto6, ", botsStartButton=", baseBoolIntDto7, ", botsAddToChat=");
        sb.append(baseBoolIntDto8);
        sb.append(", eventGroupId=");
        sb.append(num2);
        sb.append(", publicCategory=");
        sb.append(num3);
        sb.append(", publicCategoryList=");
        sb.append(list3);
        sb.append(", publicDate=");
        n6j.b(sb, str6, ", publicDateLabel=", str7, ", publicSubcategory=");
        mq.b(num4, ", rss=", str8, ", startDate=", sb);
        sq.b(sb, num5, ", finishDate=", num6, ", subject=");
        sb.append(num7);
        sb.append(", subjectList=");
        sb.append(list4);
        sb.append(", suggestedPrivacy=");
        sb.append(groupsGroupSuggestedPrivacyDto);
        sb.append(", twitter=");
        sb.append(groupsSettingsTwitterDto);
        sb.append(", website=");
        n6j.b(sb, str9, ", phone=", str10, ", email=");
        return i5s.a(sb, str11, ")");
    }

    public /* synthetic */ GroupsGetSettingsResponseDto(GroupsGroupAudioDto groupsGroupAudioDto, int i, int i2, String str, int i3, String str2, String str3, GroupsGroupDocsDto groupsGroupDocsDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, List list, GroupsGroupPhotosDto groupsGroupPhotosDto, String str4, GroupsGroupTopicsDto groupsGroupTopicsDto, GroupsGroupVideoDto groupsGroupVideoDto, GroupsGroupWallDto groupsGroupWallDto, GroupsGroupWikiDto groupsGroupWikiDto, GroupsGroupAccessDto groupsGroupAccessDto, String str5, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, List list2, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsGroupFullSectionDto groupsGroupFullSectionDto2, GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto, BaseBoolIntDto baseBoolIntDto5, Boolean bool, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, Integer num2, Integer num3, List list3, String str6, String str7, Integer num4, String str8, Integer num5, Integer num6, Integer num7, List list4, GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto, GroupsSettingsTwitterDto groupsSettingsTwitterDto, String str9, String str10, String str11, int i4, int i5, zcl zclVar) {
        this(groupsGroupAudioDto, i, i2, str, i3, str2, str3, groupsGroupDocsDto, baseBoolIntDto, baseBoolIntDto2, list, groupsGroupPhotosDto, str4, groupsGroupTopicsDto, groupsGroupVideoDto, groupsGroupWallDto, groupsGroupWikiDto, (i4 & 131072) != 0 ? null : groupsGroupAccessDto, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str5, (i4 & 524288) != 0 ? null : num, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto3, (i4 & 2097152) != 0 ? null : baseBoolIntDto4, (i4 & 4194304) != 0 ? null : list2, (i4 & 8388608) != 0 ? null : groupsGroupFullSectionDto, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : groupsGroupFullSectionDto2, (i4 & 33554432) != 0 ? null : groupsGroupAgeLimitsDto, (i4 & 67108864) != 0 ? null : baseBoolIntDto5, (i4 & 134217728) != 0 ? null : bool, (i4 & 268435456) != 0 ? null : baseBoolIntDto6, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto7, (i4 & 1073741824) != 0 ? null : baseBoolIntDto8, (i4 & Integer.MIN_VALUE) != 0 ? null : num2, (i5 & 1) != 0 ? null : num3, (i5 & 2) != 0 ? null : list3, (i5 & 4) != 0 ? null : str6, (i5 & 8) != 0 ? null : str7, (i5 & 16) != 0 ? null : num4, (i5 & 32) != 0 ? null : str8, (i5 & 64) != 0 ? null : num5, (i5 & 128) != 0 ? null : num6, (i5 & 256) != 0 ? null : num7, (i5 & 512) != 0 ? null : list4, (i5 & 1024) != 0 ? null : groupsGroupSuggestedPrivacyDto, (i5 & 2048) != 0 ? null : groupsSettingsTwitterDto, (i5 & 4096) != 0 ? null : str9, (i5 & 8192) != 0 ? null : str10, (i5 & 16384) != 0 ? null : str11);
    }
}
