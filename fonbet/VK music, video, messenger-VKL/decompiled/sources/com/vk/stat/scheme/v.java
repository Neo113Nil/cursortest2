package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioOnboardingItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudiobookActItem;
import com.vk.stat.scheme.CommonAudioStat$TypeMusicSubscriptionItem;
import com.vk.stat.scheme.CommonCoreNetworkStat$NetworkEffectiveType;
import com.vk.stat.scheme.FilteredString;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeSharingLinkOpen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$StoryGraffitiItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$StoryStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder;
import com.vk.stat.scheme.SchemeStat$BaseOkResponse;
import com.vk.stat.scheme.SchemeStat$NetworkSignalInfo;
import com.vk.stat.scheme.SchemeStat$PrivacyItem;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import com.vk.stat.scheme.SchemeStat$TypeNetworkProtocol;
import com.vk.stat.scheme.SchemeStat$TypeVkConnectNavigationItem;

/* compiled from: GsonCreator.kt */
/* loaded from: classes11.dex */
public final class v {
    public static Gson a() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(CommonAudioStat$TypeAudiobookActItem.AppState.class, new CommonAudioStat$TypeAudiobookActItem.AppState.Serializer());
        gsonBuilder.registerTypeAdapter(CommonAudioStat$TypeAudioListeningItem.AppState.class, new CommonAudioStat$TypeAudioListeningItem.AppState.Serializer());
        gsonBuilder.registerTypeAdapter(SchemeStat$BaseOkResponse.class, new SchemeStat$BaseOkResponse.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsStoriesStat$StoryGraffitiItem.Brush.class, new MobileOfficialAppsStoriesStat$StoryGraffitiItem.Brush.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.class, new MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.Serializer());
        gsonBuilder.registerTypeAdapter(CommonAudioStat$TypeMusicSubscriptionItem.Element.class, new CommonAudioStat$TypeMusicSubscriptionItem.Element.Serializer());
        gsonBuilder.registerTypeAdapter(SchemeStat$TypeVkConnectNavigationItem.EventType.class, new SchemeStat$TypeVkConnectNavigationItem.EventType.Serializer());
        gsonBuilder.registerTypeAdapter(FilteredString.class, new FilteredString.Serializer());
        gsonBuilder.registerTypeAdapter(CommonCoreNetworkStat$NetworkEffectiveType.class, new CommonCoreNetworkStat$NetworkEffectiveType.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.class, new MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.Serializer());
        gsonBuilder.registerTypeAdapter(SchemeStat$PrivacyItem.PrivacyType.class, new SchemeStat$PrivacyItem.PrivacyType.Serializer());
        gsonBuilder.registerTypeAdapter(SchemeStat$TypeNetworkImagesItem.Protocol.class, new SchemeStat$TypeNetworkImagesItem.Protocol.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsMarketStat$ReferrerItemType.class, new MobileOfficialAppsMarketStat$ReferrerItemType.Serializer());
        gsonBuilder.registerTypeAdapter(CommonAudioStat$TypeAudioOnboardingItem.Scenario.class, new CommonAudioStat$TypeAudioOnboardingItem.Scenario.Serializer());
        gsonBuilder.registerTypeAdapter(SchemeStat$NetworkSignalInfo.SignalStrength.class, new SchemeStat$NetworkSignalInfo.SignalStrength.Serializer());
        gsonBuilder.registerTypeAdapter(CommonAudioStat$TypeAudioListeningItem.StreamingType.class, new CommonAudioStat$TypeAudioListeningItem.StreamingType.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsStoriesStat$StoryStickerItem.Style.class, new MobileOfficialAppsStoriesStat$StoryStickerItem.Style.Serializer());
        gsonBuilder.registerTypeAdapter(SchemeStat$TypeNetworkProtocol.class, new SchemeStat$TypeNetworkProtocol.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.class, new MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.VideoPlaylistType.class, new MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.VideoPlaylistType.Serializer());
        gsonBuilder.registerTypeAdapter(MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.class, new MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.Serializer());
        gsonBuilder.disableHtmlEscaping();
        return gsonBuilder.create();
    }
}
