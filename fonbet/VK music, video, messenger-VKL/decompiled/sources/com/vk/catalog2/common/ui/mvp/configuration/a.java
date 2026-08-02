package com.vk.catalog2.common.ui.mvp.configuration;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import androidx.car.app.hardware.common.CarZone;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.ads.adchoice.api.di.AdChoiceComponent;
import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.catalog2.common.dto.api.style.AudioBookListItemViewStyle;
import com.vk.catalog2.common.dto.api.style.AudioBookSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.CategoriesListViewStyle;
import com.vk.catalog2.common.dto.api.style.DoubleListViewStyle;
import com.vk.catalog2.common.dto.api.style.HorizontalButtonStackViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkListViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.PodcastSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchEntityCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchSuggestionCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.TopshelfViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoAlbumCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixInteractiveViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.dto.ui.UIBlockAppContent;
import com.vk.catalog2.common.dto.ui.UIBlockBanner;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.holders.ActionExpandBlockVh;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.catalog2.common.ui.holders.ArticleVh;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.catalog2.common.ui.holders.ComposeHeaderClearBlocksVh;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.FriendsLikeVh;
import com.vk.catalog2.common.ui.holders.HeaderClearBlocksVh;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.TextVh;
import com.vk.catalog2.common.ui.holders.ads.AdSearchBannerVh;
import com.vk.catalog2.common.ui.holders.ads.AdShowCaseBannerVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh;
import com.vk.catalog2.common.ui.holders.apps.AppLinkVh;
import com.vk.catalog2.common.ui.holders.author.AuthorsVideoGroupCardVh;
import com.vk.catalog2.common.ui.holders.author.CircularAuthorViewHolder;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonLargeWithIconVh;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonSmallVh;
import com.vk.catalog2.common.ui.holders.channel.CatalogChannelViewHolder;
import com.vk.catalog2.common.ui.holders.classifieds.CatalogCategoryTabVh;
import com.vk.catalog2.common.ui.holders.container.BannersVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsActionListItemVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsActionVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsIncomingVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsSliderItemVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.catalog2.common.ui.holders.group.GroupBannerVh;
import com.vk.catalog2.common.ui.holders.group.GroupChatVh;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.catalog2.common.ui.holders.group.GroupLikeRecentBusinessesVh;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.catalog2.common.ui.holders.group.GroupsPreviewVh;
import com.vk.catalog2.common.ui.holders.group.SearchGroupCellVh;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.catalog2.common.ui.holders.market.FeaturedListBannerVh;
import com.vk.catalog2.common.ui.holders.search.ActionOpenSearchTabVh;
import com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestionVh;
import com.vk.catalog2.common.ui.holders.search.SearchEntityPersonAnswerVh;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.holders.search.SearchFilterVh;
import com.vk.catalog2.common.ui.holders.search.SearchSliderSuggestionVh;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.catalog2.common.ui.holders.search.SearchSuggestionVh;
import com.vk.catalog2.common.ui.holders.search.SportsMatchesCurrentVh;
import com.vk.catalog2.common.ui.holders.search.SportsMatchesUpcomingVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackDoubleStackedSliderItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackSearchItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackSliderItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackSliderLargeItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackSliderSmallItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackTripleStackedSliderItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackVerticalListItemVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerSearchItemVh;
import com.vk.catalog2.common.ui.holders.video.VideoActionCreateAlbumVh;
import com.vk.catalog2.common.ui.holders.video.VideoActionStartLiveStreamVh;
import com.vk.catalog2.common.ui.holders.video.VideoActionUploadVh;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh;
import com.vk.catalog2.common.ui.holders.vkui.LinkCellVh;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.ActionAdvButtonVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionOpenLinkVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionOpenScreenButtonVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionOpenSectionChipVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionOpenSectionVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionOpenSliderLinkVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionOpenSliderSectionVh;
import com.vk.catalog2.common.ui.mvp.holder.ActionSortVh;
import com.vk.catalog2.common.ui.mvp.holder.BorderlessWithIconButtonVh;
import com.vk.catalog2.common.ui.mvp.holder.ComposeConfigurableHeaderVh;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.NavigationTabVh;
import com.vk.catalog2.common.ui.mvp.holder.PreviewVh;
import com.vk.catalog2.common.ui.mvp.holder.community.CommunityVkTabVh;
import com.vk.catalog2.common.ui.mvp.holder.container.BannerSize;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogGroupBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogPromoBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PagerGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.SmallVkBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCategoryVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCategoryWithCollectionVh;
import com.vk.catalog2.common.ui.mvp.holder.group.FilterButtonVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardWithBottomBtnVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupRedesignCardWithBottomBtnVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsRedesignCollectionVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemSmallVh;
import com.vk.catalog2.common.ui.mvp.holder.market.item.MarketSingleItemViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicAggregatedUpdatesVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicPlaylistChartGridVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicPlaylistChartListVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSignalVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSnippetBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSpecialVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh;
import com.vk.catalog2.common.ui.mvp.holder.music.PodcastBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.ImageWarningPlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchMapPreviewHeaderHolder;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerTopBarBonusBalanceVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicTrackPickerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.InteractiveVideoVh;
import com.vk.catalog2.common.ui.mvp.holder.video.QuestionnaireVh;
import com.vk.catalog2.common.ui.mvp.holder.video.SubcategoryFilterVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemHideVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoVerticalAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.musicvideo.MusicMixVideoTopshelfVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistInfoVh;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.ShowcaseVideoAutoPlayViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.CategoryLinkVh;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.catalog2.feature.music.holders.ComposeMusicOwnerVh;
import com.vk.catalog2.feature.music.holders.ExclusiveAlbumVh;
import com.vk.catalog2.feature.music.holders.LegalNoticeVh;
import com.vk.catalog2.feature.music.holders.MusicActionPlayAudiosFromBlockIdVh;
import com.vk.catalog2.feature.music.holders.MusicActionSaveAsPlaylistButtonVh;
import com.vk.catalog2.feature.music.holders.MusicCategoryVh;
import com.vk.catalog2.feature.music.holders.MusicDynamicGridVh;
import com.vk.catalog2.feature.music.holders.MusicFollowCuratorButtonVh;
import com.vk.catalog2.feature.music.holders.MusicFollowOwnerButtonVh;
import com.vk.catalog2.feature.music.holders.MusicGridLinkVh;
import com.vk.catalog2.feature.music.holders.MusicKidsAgeCategoryVh;
import com.vk.catalog2.feature.music.holders.MusicKidsCatalogVh;
import com.vk.catalog2.feature.music.holders.MusicKidsCollectionVh;
import com.vk.catalog2.feature.music.holders.MusicMoodPlaylistVh;
import com.vk.catalog2.feature.music.holders.MusicPlaylistCellVh;
import com.vk.catalog2.feature.music.holders.MusicPlaylistUpdateVh;
import com.vk.catalog2.feature.music.holders.MusicPlaylistVh;
import com.vk.catalog2.feature.music.holders.MusicRecommendedPlaylistVh;
import com.vk.catalog2.feature.music.holders.MusicSmallBannerOfferVh;
import com.vk.catalog2.feature.music.holders.MusicSmartPlaylistVh;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.catalog2.feature.music.holders.MyShelfStartedListeningVh;
import com.vk.catalog2.feature.music.holders.OpenInfoPopupVh;
import com.vk.catalog2.feature.music.holders.PodcastSliderItemRoundBackgroundVh;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.catalog2.feature.music.holders.RadioStationVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookCellVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookListenedVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookOfflineSliderVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookOfflineVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioContentCardVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioContentVh;
import com.vk.catalog2.feature.music.holders.audiobook.ComposeAudioBookSliderVh;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVh;
import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.catalog2.feature.music.holders.playmix.ArtistMixVh;
import com.vk.catalog2.feature.music.holders.playmix.PlayMixActionVh;
import com.vk.catalog2.feature.music.holders.podcast.ComposePodcastSliderVh;
import com.vk.catalog2.feature.music.holders.podcast.ExtendedPodcastBannerVh;
import com.vk.catalog2.feature.music.holders.podcast.LinkMyShelfVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastCategoryVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastOfflineSliderVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastOfflineVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastRecommendationVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastSliderCellVh;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.SimpleMusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.small.SmallVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveSingleVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveTwoVkMixesVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.music.Thumb;
import com.vk.ecomm.categories.api.MarketCategoriesComponent;
import com.vk.friends.api.di.FeedFriendsComponent;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import com.vk.music.mix.MixSettingsComponent;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.toggle.b;
import com.vk.toggle.features.CatalogFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.TimeUtils;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;
import xsna.a6a;
import xsna.akd0;
import xsna.akj0;
import xsna.ams;
import xsna.ava0;
import xsna.ayn0;
import xsna.b5a;
import xsna.bpn0;
import xsna.bx9;
import xsna.c5g;
import xsna.cks;
import xsna.d2a;
import xsna.daz;
import xsna.db80;
import xsna.ddh0;
import xsna.did0;
import xsna.dks;
import xsna.dos;
import xsna.e2a;
import xsna.e3m;
import xsna.eda;
import xsna.eht0;
import xsna.epx;
import xsna.f9l0;
import xsna.fl4;
import xsna.fne;
import xsna.fpf0;
import xsna.fxc0;
import xsna.fz8;
import xsna.g3a;
import xsna.gda;
import xsna.gqh0;
import xsna.hda;
import xsna.hdt0;
import xsna.hvr0;
import xsna.hyk0;
import xsna.iah0;
import xsna.ijf0;
import xsna.ikk0;
import xsna.iud0;
import xsna.izs;
import xsna.jda;
import xsna.jo60;
import xsna.jzi0;
import xsna.k7a;
import xsna.k7m;
import xsna.k840;
import xsna.kbj0;
import xsna.kea;
import xsna.kud0;
import xsna.lca;
import xsna.lga;
import xsna.lpg0;
import xsna.lqs0;
import xsna.m3a;
import xsna.m7m;
import xsna.mca;
import xsna.mcc0;
import xsna.msy;
import xsna.oca;
import xsna.od0;
import xsna.oht0;
import xsna.pca;
import xsna.phb0;
import xsna.pyr0;
import xsna.q3a;
import xsna.qah0;
import xsna.qca;
import xsna.qdz;
import xsna.qmk0;
import xsna.r6a;
import xsna.r8a;
import xsna.rcs0;
import xsna.rns;
import xsna.rsg0;
import xsna.s1v;
import xsna.s8a;
import xsna.sca;
import xsna.sha;
import xsna.sif0;
import xsna.sq40;
import xsna.stg0;
import xsna.t5a;
import xsna.tba;
import xsna.tc0;
import xsna.tca;
import xsna.tfm0;
import xsna.tyr0;
import xsna.u2b0;
import xsna.u4a;
import xsna.u5d0;
import xsna.u70;
import xsna.u96;
import xsna.uba;
import xsna.ufu0;
import xsna.uv80;
import xsna.uvs0;
import xsna.vd7;
import xsna.vha;
import xsna.vhu0;
import xsna.vls;
import xsna.vyr0;
import xsna.w060;
import xsna.w2j0;
import xsna.w8i;
import xsna.wba;
import xsna.wga;
import xsna.whu0;
import xsna.wtm0;
import xsna.x2j0;
import xsna.x9l0;
import xsna.xga;
import xsna.y1a;
import xsna.y7a;
import xsna.ydt0;
import xsna.yfb;
import xsna.zaf0;
import xsna.zg;
import xsna.zjj0;
import xsna.zpt0;
import xsna.zvr0;

/* compiled from: VkCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public abstract class a implements w8i, CatalogConfiguration {
    public final Object A;
    public final Object B;
    public final bpn0 C;
    public final UserId b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final bpn0 g;
    public final Object h;
    public final boolean i;
    public final Object j;
    public final Object k;
    public final bpn0 l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final bpn0 p;
    public final u2b0 q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final bpn0 x;
    public final xga y;
    public final e2a z;

    /* compiled from: VkCatalogConfiguration.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.configuration.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0495a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.VIDEO_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.MUSIC_EXCLUSIVE_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.LIST_PICKER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.STACKED_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.ICONS_SLIDER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.RECOMMS_SLIDER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.ARTISTS_SLIDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.CROP_SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.SLIDER_EVENT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogViewType.STICKERS_SLIDER_ONLY_PRICE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogViewType.STICKERS_LARGE_SLIDER_ONLY_PRICE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogViewType.LIST_STICKERS_PREVIEW.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogViewType.PODCAST_EXTENDED_SLIDER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogViewType.AUDIO_CONTENT_CARD_EXTENDED_SLIDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogViewType.SHOWCASE_LIST.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LARGE_SLIDER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogViewType.HORIZONTAL_LIST_FRIEND_SUGGESTS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogViewType.SLIDER_INFINITE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER_INFINITE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD_INFINITE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_INFINITE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_TRIPLE_STACKED_SLIDER.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_STAGGERED_TRIPLE_STACKED_SLIDER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SPORT_WIDGET_SLIDER.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SPORT_WIDGET_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_SLIDER_INTERACTIVE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_HIDE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_UPLOAD.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[CatalogViewType.SHORT_DOUBLE_STACKED_LIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[CatalogViewType.LISTENED_LIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[CatalogViewType.MY_SHELF_PLAYABLE_ITEM.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MUSIC_TRACK_LIST.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[CatalogViewType.OWNER_CELL.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[CatalogViewType.LIST_WITH_NOTIFICATION_STATE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[CatalogViewType.LIST_WITH_RETURN_STATE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[CatalogViewType.TITLE_SUBTITLE_AVATAR.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[CatalogViewType.VIDEO_TABS_ALBUM_LIST.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[CatalogViewType.FIENDS_HORIZONTAL_ACTION.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[CatalogViewType.SUBSECTION_TABS.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[CatalogViewType.FILTER_BUTTON.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[CatalogViewType.SUBSECTION_FILTER_BUTTON.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UPLOAD_VIDEO.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_START_LIVE_STREAM.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_MIX.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_FOLLOW.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_SCAN_QR.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADD_FRIENDS.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_FRIENDS_CLEANUP.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_IMPORT_CONTACTS.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_SELECT_SORTING.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADV_URL.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_CHIP.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_TAB.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_EXPAND_BLOCK.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_MUSIC_FOLLOW_OWNER.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_INFO_POPUP.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[CatalogViewType.SNIPPETS_BANNER.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[CatalogViewType.CATALOG_BANNER.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_ILLEGAL_QUERY.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_IMAGE_WARNING.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[CatalogViewType.HEADER_EXTENDED.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR_COMPACT.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_THIN.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_TABS.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEARCH_MAP_HEADER.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_LEGAL_NOTICE.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[CatalogViewType.FEATURED_LIST.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[CatalogViewType.MUSIC_NEWSFEED_TITLE.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_LIST.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[CatalogViewType.PLAYLIST_SMALL.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[CatalogViewType.SMALL_BANNER_OFFER.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[CatalogViewType.ENTITY_DOUBLE_GRID.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_LIST.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[CatalogViewType.PODCAST_CATEGORY_GENRE_BUTTONS.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_GRID.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[CatalogViewType.PODCAST_FAVORITES.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[CatalogViewType.KIDS_COLLECTION.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[CatalogViewType.KIDS_CATALOG.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[CatalogViewType.DYNAMIC_GRID.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[CatalogViewType.TEXT.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[CatalogViewType.VERTICAL_GRID.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEARCH_LIST.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_UNREAD_REQUEST.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS_OUT.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_SUGGEST.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_LIST_FOLLOWERS.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_REQUEST.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEARCH_GROUP_ITEMS_LIST.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[CatalogViewType.PREVIEW.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_GROUP_ITEM_BIG.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[CatalogViewType.MAP_PREVIEW.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[CatalogViewType.AUDIO_STREAM_MIX.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[CatalogViewType.VIDEO_MUSIC_STREAM_MIX.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[CatalogViewType.HORIZONTAL_BUTTONS_STACK.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr2[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr2[CatalogConfiguration$Companion$ContainerType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr2[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused163) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MINIAPPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GAMES.ordinal()] = 7;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_STICKERS.ordinal()] = 9;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_STICKER_PACKS.ordinal()] = 10;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_STICKERS_BANNERS.ordinal()] = 11;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 12;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS.ordinal()] = 13;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS.ordinal()] = 15;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_BANNERS.ordinal()] = 16;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED.ordinal()] = 18;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 19;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUP_BANNERS.ordinal()] = 20;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 21;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 22;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 23;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 24;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_FEEDBACKS.ordinal()] = 25;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LONGREADS.ordinal()] = 26;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_FRIENDS_LIKE_EPISODE.ordinal()] = 27;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PODCAST_SLIDER_ITEMS.ordinal()] = 28;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 29;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PODCASTS.ordinal()] = 30;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_OFFLINE_PODCASTS.ordinal()] = 31;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 32;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO.ordinal()] = 33;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM.ordinal()] = 34;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_OWNERS.ordinal()] = 35;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_OWNERS.ordinal()] = 36;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 37;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_DND_ACTION.ordinal()] = 38;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 39;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_EXTENDED_PODCASTS.ordinal()] = 40;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 41;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS.ordinal()] = 42;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_TEXTS.ordinal()] = 43;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 44;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS.ordinal()] = 45;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS.ordinal()] = 46;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_STICKERS_INFO.ordinal()] = 47;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 48;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS.ordinal()] = 49;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 50;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 51;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_COLLECTION.ordinal()] = 52;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 53;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_INVITES.ordinal()] = 54;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ARTIST.ordinal()] = 55;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CURATOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION.ordinal()] = 57;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION.ordinal()] = 58;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_SPECIAL.ordinal()] = 59;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr3[CatalogDataType.UNKNOWN.ordinal()] = 60;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MARKET_INFO.ordinal()] = 61;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_FAVORITES.ordinal()] = 62;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_CATALOG.ordinal()] = 63;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_CHATS.ordinal()] = 64;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_FRIENDS_LIKES.ordinal()] = 65;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_RECENT_BUSINESSES.ordinal()] = 66;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO.ordinal()] = 67;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 68;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_RADIO_STATIONS.ordinal()] = 69;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIOBOOKS.ordinal()] = 70;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 71;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_TOPSHELF.ordinal()] = 72;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF.ordinal()] = 73;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_EMPTY.ordinal()] = 74;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_FILTERS.ordinal()] = 75;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AD_BLOCKS.ordinal()] = 76;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_AD_BLOCKS.ordinal()] = 77;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CHANNELS.ordinal()] = 78;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MOVIES.ordinal()] = 79;
            } catch (NoSuchFieldError unused242) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[VideoCatalogViewStyle.Style.values().length];
            try {
                iArr4[VideoCatalogViewStyle.Style.AuthorVideos.ordinal()] = 1;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.WithDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.LargeWithDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.ShowcaseWithDescription.ordinal()] = 5;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.VideoPage.ordinal()] = 6;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.Showcase.ordinal()] = 7;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.AuthorsCircle.ordinal()] = 8;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.None.ordinal()] = 9;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr4[VideoCatalogViewStyle.Style.InvisibleAuthor.ordinal()] = 10;
            } catch (NoSuchFieldError unused252) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[SearchSuggestion.Type.values().length];
            try {
                iArr5[SearchSuggestion.Type.MovieLink.ordinal()] = 1;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr5[SearchSuggestion.Type.Recent.ordinal()] = 2;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr5[SearchSuggestion.Type.RecentWithoutClear.ordinal()] = 3;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr5[SearchSuggestion.Type.Popular.ordinal()] = 4;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr5[SearchSuggestion.Type.SectionLink.ordinal()] = 5;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr5[SearchSuggestion.Type.MetaChannelLink.ordinal()] = 6;
            } catch (NoSuchFieldError unused258) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[CatalogSearchEntityAnswer.EntityType.values().length];
            try {
                iArr6[CatalogSearchEntityAnswer.EntityType.Person.ordinal()] = 1;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr6[CatalogSearchEntityAnswer.EntityType.VideoPlaylist.ordinal()] = 2;
            } catch (NoSuchFieldError unused260) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[LinkListViewStyle.Style.values().length];
            try {
                iArr7[LinkListViewStyle.Style.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr7[LinkListViewStyle.Style.WithArrowButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused262) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[LinkSliderViewStyle.Style.values().length];
            try {
                iArr8[LinkSliderViewStyle.Style.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused263) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[HorizontalButtonStackViewStyle.Style.values().length];
            try {
                iArr9[HorizontalButtonStackViewStyle.Style.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr9[HorizontalButtonStackViewStyle.Style.LargeWithIcon.ordinal()] = 2;
            } catch (NoSuchFieldError unused265) {
            }
            $EnumSwitchMapping$8 = iArr9;
        }
    }

    /* compiled from: VkCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogBlockItemsDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogBlockItemsDto catalogBlockItemsDto) {
            return ((e2a) this.receiver).a(catalogBlockItemsDto);
        }
    }

    /* compiled from: VkCatalogConfiguration.kt */
    public static final class c extends u96 {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            this.d = str;
        }

        @Override // xsna.gda
        public final q d(String str, String str2, String str3, boolean z, Integer num) {
            if (str == null) {
                str = this.d;
            }
            return a.this.D(str, str2, z);
        }
    }

    /* compiled from: VkCatalogConfiguration.kt */
    public static final class d implements GridListVh.a {
        @Override // com.vk.catalog2.common.ui.mvp.holder.container.GridListVh.a
        public final int a(int i, UIBlock uIBlock) {
            if (uIBlock instanceof UIBlockActionOpenUrl) {
                return i;
            }
            if (uIBlock instanceof UIBlockActionOpenSection) {
                return i;
            }
            return 1;
        }
    }

    public a(UserId userId, String str) {
        this.b = userId;
        this.c = str;
        tfm0 tfm0Var = new tfm0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, tfm0Var);
        this.e = msy.a(lazyThreadSafetyMode, new ikk0(this, 20));
        this.f = msy.a(lazyThreadSafetyMode, new qah0(this, 23));
        this.g = new bpn0(new uvs0(this, 6));
        this.h = msy.a(lazyThreadSafetyMode, new gqh0(this, 23));
        this.i = BuildInfo.q();
        this.j = msy.a(lazyThreadSafetyMode, new daz(28));
        this.k = msy.a(lazyThreadSafetyMode, new jo60(23));
        this.l = new bpn0(new uv80(17));
        this.m = msy.a(lazyThreadSafetyMode, new rcs0(5));
        this.n = msy.a(lazyThreadSafetyMode, new kud0(14));
        this.o = msy.a(lazyThreadSafetyMode, new hvr0(this, 15));
        this.p = new bpn0(new akd0(this, 25));
        this.q = k840.a.g().b();
        this.r = msy.a(lazyThreadSafetyMode, new stg0(this, 28));
        this.s = msy.a(lazyThreadSafetyMode, new w2j0(this, 24));
        this.t = msy.a(lazyThreadSafetyMode, new ufu0(this, 2));
        this.u = msy.a(lazyThreadSafetyMode, new pyr0(this, 14));
        this.v = msy.a(lazyThreadSafetyMode, new x9l0(this, 21));
        this.w = msy.a(lazyThreadSafetyMode, new lqs0(this, 8));
        this.x = new bpn0(new x2j0(this, 20));
        this.y = new xga();
        this.z = new e2a();
        this.A = msy.a(lazyThreadSafetyMode, new vhu0(0));
        this.B = msy.a(lazyThreadSafetyMode, new iud0(12));
        this.C = new bpn0(new zpt0(2));
    }

    public static LinkCellVh Y(CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        LinkListViewStyle linkListViewStyle = catalogViewStyle instanceof LinkListViewStyle ? (LinkListViewStyle) catalogViewStyle : null;
        LinkListViewStyle.Style style = linkListViewStyle != null ? linkListViewStyle.b : null;
        int i = style == null ? -1 : C0495a.$EnumSwitchMapping$6[style.ordinal()];
        if (i == 1) {
            u4a.a aVar = u4aVar.b;
            return new LinkCellVh(aVar.f, LinkCellVh.ImageSize.Small, aVar.j, aVar.m, new LinkBaseVh.a(false, Integer.valueOf(R.dimen.music_catalog_list_small_corner_radius)), 15856);
        }
        if (i != 2) {
            u4a.a aVar2 = u4aVar.b;
            return new LinkCellVh(aVar2.f, LinkCellVh.ImageSize.Small, aVar2.j, aVar2.m, null, 16368);
        }
        u4a.a aVar3 = u4aVar.b;
        return new LinkCellVh(aVar3.f, LinkCellVh.ImageSize.Medium, aVar3.j, aVar3.m, null, 8176);
    }

    public static AdSearchBannerVh c0(u4a u4aVar, od0 od0Var) {
        return new AdSearchBannerVh(new tc0(u4aVar.b.e, od0Var, true));
    }

    public static AdShowCaseBannerVh d(u4a u4aVar, od0 od0Var) {
        return new AdShowCaseBannerVh(new tc0(u4aVar.b.e, od0Var, false));
    }

    public static s1v e(u4a u4aVar) {
        s1v s1vVar = u4aVar.b.J;
        return s1vVar == null ? new s1v() : s1vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CatalogPaginatedListViewHolder g0(a aVar, UIBlock uIBlock, u4a u4aVar, tba tbaVar, int i) {
        String str;
        if ((i & 4) != 0) {
            if (uIBlock == null || (str = uIBlock.b) == null) {
                str = "";
            }
            tbaVar = aVar.h0(uIBlock, str, u4aVar);
        }
        return aVar.f0(uIBlock, u4aVar, tbaVar, true);
    }

    public static CategoryLinkVh h(CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        CategoriesListViewStyle categoriesListViewStyle = catalogViewStyle instanceof CategoriesListViewStyle ? (CategoriesListViewStyle) catalogViewStyle : null;
        return (categoriesListViewStyle != null ? categoriesListViewStyle.b : null) == CategoriesListViewStyle.Style.KIDS_MODE ? new CategoryLinkVh(u4aVar.b.f, R.layout.catalog_music_kids_cell, ((CategoriesListViewStyle) catalogViewStyle).b, 8) : new CategoryLinkVh(u4aVar.b.f, R.layout.catalog_vk_cell_item, null, 56);
    }

    public static CatalogViewHolder i(CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        DoubleListViewStyle doubleListViewStyle = catalogViewStyle instanceof DoubleListViewStyle ? (DoubleListViewStyle) catalogViewStyle : null;
        if ((doubleListViewStyle != null ? doubleListViewStyle.b : null) == DoubleListViewStyle.Style.Small) {
            return new MusicKidsAgeCategoryVh();
        }
        u4a.a aVar = u4aVar.b;
        return new PodcastCategoryVh(aVar.f, aVar.m);
    }

    public static LinkHorizontalListItemVh p(CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        LinkSliderViewStyle linkSliderViewStyle = catalogViewStyle instanceof LinkSliderViewStyle ? (LinkSliderViewStyle) catalogViewStyle : null;
        LinkSliderViewStyle.Style style = linkSliderViewStyle != null ? linkSliderViewStyle.b : null;
        if ((style == null ? -1 : C0495a.$EnumSwitchMapping$7[style.ordinal()]) == 1) {
            u4a.a aVar = u4aVar.b;
            return new LinkHorizontalListItemVh(aVar.f, LinkHorizontalListItemVh.Size.Medium, aVar.j, aVar.m, true, 0, false, false, 8160);
        }
        u4a.a aVar2 = u4aVar.b;
        return new LinkHorizontalListItemVh(aVar2.f, LinkHorizontalListItemVh.Size.Small, aVar2.j, aVar2.m, true, 0, false, false, 8160);
    }

    public static EmptyVh u0(CatalogViewType catalogViewType) {
        return new EmptyVh(catalogViewType.j());
    }

    public static AccountToggleDto y0(b.d dVar) {
        return new AccountToggleDto(dVar.a, dVar.b.toString(), dVar.c.toString(), null, null, 24, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = C0495a.$EnumSwitchMapping$1[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i == 1) {
            return new vha(true, e(u4aVar), aVar.I, 8);
        }
        if (i == 2 || i == 3) {
            return new vha(false, e(u4aVar), aVar.I, 8);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public o0 B(CatalogViewType catalogViewType) {
        int i = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i == 1 || i == 2) {
            return new oht0(new DecelerateInterpolator(1.0f), null, null, 104);
        }
        if (i == 3) {
            return new oht0(new DecelerateInterpolator(1.0f), null, null, 104);
        }
        if (i != 4) {
            return null;
        }
        return new oht0(null, null, null, 111);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public int C(UIBlock uIBlock) {
        List<Thumb> list;
        switch (C0495a.$EnumSwitchMapping$2[uIBlock.e.ordinal()]) {
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return 1;
            case 14:
                UIBlockMusicPlaylist uIBlockMusicPlaylist = uIBlock instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) uIBlock : null;
                Playlist playlist = uIBlockMusicPlaylist != null ? uIBlockMusicPlaylist.z : null;
                if (playlist == null || (list = playlist.p) == null) {
                    return (playlist != null ? playlist.m : null) != null ? 1 : 0;
                }
                return list.size();
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 1;
            case 21:
                return uIBlock.d == CatalogViewType.NOTIFICATION ? 1 : 0;
            default:
                return 0;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public q<hda> D(String str, String str2, boolean z) {
        return rsg0.y0(new r6a(N(), str, str2, z, null, null, null, null, 496), null, null, 3);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public void E(u4a u4aVar) {
        qca s = s();
        if (s != null) {
            if (s.f == null) {
                s.f = new ijf0(this, u4aVar, (mca) s.d.getValue());
            }
            ijf0 ijf0Var = s.f;
            zg zgVar = s.g;
            if (ijf0Var == null || zgVar == null) {
                return;
            }
            ijf0Var.h = zgVar;
            s.e.d.m();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        int i = C0495a.$EnumSwitchMapping$1[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i == 1) {
            return new sca();
        }
        if (i == 2) {
            return new pca();
        }
        if (i == 3) {
            return new oca();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public Boolean G(lca lcaVar, tca tcaVar) {
        Map<sif0, Integer> map;
        UIBlock uIBlock = tcaVar.n;
        sif0 sif0Var = uIBlock != null ? new sif0(uIBlock.d, uIBlock.e, uIBlock.l) : null;
        qca s = s();
        if (s == null || (map = s.b) == null) {
            return null;
        }
        return Boolean.valueOf(map.containsKey(sif0Var));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public boolean J() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public jda K(u4a u4aVar) {
        return new fz8(new w060(0), u4aVar.c.d);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public boolean L() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public db80 M(CatalogConfiguration.AutoPlayEntryPoint autoPlayEntryPoint) {
        return V();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public wba N() {
        return new wba();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public boolean O(UserId userId) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public boolean P() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public boolean Q(UIBlock uIBlock) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public int R() {
        return 5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public g3a S(u4a u4aVar, String str) {
        return new g3a(this, u4aVar, K(u4aVar), null, null, null, null, null, null, null, 32760);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public void T(RecyclerView recyclerView) {
        recyclerView.setItemViewCacheSize(1);
        qca s = s();
        if (s != null) {
            zg zgVar = new zg(recyclerView, 11);
            s.g = zgVar;
            ijf0 ijf0Var = s.f;
            if (ijf0Var != null) {
                ijf0Var.h = zgVar;
                s.e.d.m();
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final gda U() {
        return new whu0(this);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public db80 V() {
        return new ddh0(6);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public ayn0 W(RecyclerView recyclerView) {
        return new ayn0(recyclerView, null, 30);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public String X(Context context, int i, UIBlock uIBlock, s8a s8aVar) {
        int a;
        SearchEntityCatalogViewStyle.EntityStyle entityStyle;
        ImageSize Cb;
        String str;
        ImageSize Cb2;
        ImageSize Cb3;
        ImageSize Cb4;
        CatalogDataType catalogDataType = uIBlock.e;
        CatalogViewType catalogViewType = uIBlock.d;
        CatalogViewStyle catalogViewStyle = uIBlock.l;
        switch (C0495a.$EnumSwitchMapping$2[catalogDataType.ordinal()]) {
            case 1:
                int i2 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 != 5 && i2 != 6 && i2 != 9) {
                    a = e3m.a(R.dimen.video_catalog_album_small_content_item_width, context);
                    break;
                } else {
                    a = e3m.a(R.dimen.video_catalog_album_small_content_item_width, context);
                    break;
                }
            case 2:
                a = e3m.a(R.dimen.video_catalog_album_small_content_item_width, context);
                break;
            case 3:
            case 4:
                int i3 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i3 == 5) {
                    a = e3m.a(R.dimen.video_catalog_large_slider_content_item_width, context);
                    break;
                } else {
                    if (i3 != 6) {
                        if (i3 == 8) {
                            a = e3m.a(R.dimen.video_catalog_small_content_item_width, context);
                            break;
                        } else if (i3 != 9) {
                            a = ImageScreenSize.BIG.h();
                            break;
                        }
                    }
                    a = e3m.a(R.dimen.video_catalog_small_slider_content_item_width, context);
                    break;
                }
            case 5:
                int i4 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i4 == 5) {
                    a = e3m.a(R.dimen.catalog_link_larger_slider_content_item_width, context);
                    break;
                } else if (i4 == 6) {
                    a = e3m.a(R.dimen.catalog_link_larger_slider_content_item_width, context);
                    break;
                } else if (i4 == 7) {
                    a = e3m.a(R.dimen.music_playlist_image, context);
                    break;
                } else {
                    a = e3m.a(R.dimen.catalog_link_small_content_item_height, context);
                    break;
                }
            case 6:
                int i5 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i5 == 6) {
                    a = e3m.a(R.dimen.catalog_app_slider_content_item_width, context);
                    break;
                } else if (i5 == 8) {
                    a = e3m.a(R.dimen.catalog_app_list_content_item_height, context);
                    break;
                } else {
                    a = e3m.a(R.dimen.catalog_app_list_content_item_height, context);
                    break;
                }
            case 7:
                int i6 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i6 == 5) {
                    a = e3m.a(R.dimen.catalog_app_slider_content_item_width, context);
                    break;
                } else if (i6 == 6) {
                    a = e3m.a(R.dimen.catalog_game_slider_content_item_width, context);
                    break;
                } else if (i6 == 8) {
                    a = e3m.a(R.dimen.catalog_app_list_content_item_height, context);
                    break;
                } else {
                    a = e3m.a(R.dimen.catalog_app_list_content_item_height, context);
                    break;
                }
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                a = 0;
                break;
            case 12:
            case 13:
                a = e3m.a(R.dimen.music_track_image, context);
                break;
            case 14:
                if (!catalogViewType.n()) {
                    if (catalogViewType.j()) {
                        a = e3m.a(R.dimen.music_playlist_slider_image_size, context);
                        break;
                    }
                    a = 0;
                    break;
                } else {
                    a = e3m.a(R.dimen.music_playlist_image, context);
                    break;
                }
            case 15:
                SearchEntityCatalogViewStyle searchEntityCatalogViewStyle = catalogViewStyle instanceof SearchEntityCatalogViewStyle ? (SearchEntityCatalogViewStyle) catalogViewStyle : null;
                CatalogSearchEntityAnswer.EntityType i7 = (searchEntityCatalogViewStyle == null || (entityStyle = searchEntityCatalogViewStyle.b) == null) ? null : entityStyle.i();
                if (i7 != CatalogSearchEntityAnswer.EntityType.VideoPlaylist) {
                    if (i7 != CatalogSearchEntityAnswer.EntityType.Person || searchEntityCatalogViewStyle.b != SearchEntityCatalogViewStyle.EntityStyle.Flat) {
                        a = e3m.a(R.dimen.catalog_link_small_content_item_width, context);
                        break;
                    } else {
                        a = e3m.a(R.dimen.catalog_search_entity_flat_icon_size, context);
                        break;
                    }
                } else {
                    a = e3m.a(R.dimen.catalog_search_entity_video_playlist_item_width, context);
                    break;
                }
                break;
        }
        if (uIBlock instanceof UIBlockLink) {
            ImageSize Cb5 = ((UIBlockLink) uIBlock).y.f.Cb(a, true, false);
            if (Cb5 != null) {
                return Cb5.d.d;
            }
        } else {
            if (uIBlock instanceof UIBlockApp) {
                return ((UIBlockApp) uIBlock).y.d.Fb(a, false).d.d;
            }
            if (uIBlock instanceof UIBlockAppContent) {
                return ((UIBlockAppContent) uIBlock).z.h;
            }
            if (uIBlock instanceof UIBlockVideoAlbum) {
                ImageSize Cb6 = ((UIBlockVideoAlbum) uIBlock).y.h.Cb(a, true, false);
                if (Cb6 != null) {
                    return Cb6.d.d;
                }
            } else if (uIBlock instanceof UIBlockVideo) {
                if (i != 0) {
                    return ((UIBlockVideo) uIBlock).B.M0();
                }
                Image image = ((UIBlockVideo) uIBlock).B.getImage();
                if (image != null && (Cb4 = image.Cb(a, true, false)) != null) {
                    return Cb4.d.d;
                }
            } else {
                if (uIBlock instanceof UIBlockStickerPack) {
                    bpn0 bpn0Var = u5d0.a;
                    return u5d0.a.a(((UIBlockStickerPack) uIBlock).y, a);
                }
                if (uIBlock instanceof UIBlockStickerPackPreview) {
                    bpn0 bpn0Var2 = u5d0.a;
                    return u5d0.a.b(a, ((UIBlockStickerPackPreview) uIBlock).y.p, false);
                }
                if (uIBlock instanceof UIBlockBanner) {
                    return NotificationImage.Db(((UIBlockBanner) uIBlock).y.d, a);
                }
                if (uIBlock instanceof UIBlockPlaceholder) {
                    Image image2 = ((UIBlockPlaceholder) uIBlock).B;
                    if (image2 != null && (Cb3 = image2.Cb(a, true, false)) != null) {
                        return Cb3.d.d;
                    }
                } else if (uIBlock instanceof UIBlockMusicPlaylist) {
                    Playlist playlist = ((UIBlockMusicPlaylist) uIBlock).z;
                    Thumb thumb = playlist.m;
                    if (thumb == null) {
                        List<Thumb> list = playlist.p;
                        thumb = list != null ? list.get(i) : null;
                    }
                    if (thumb != null) {
                        Serializer.c<Thumb> cVar = Thumb.CREATOR;
                        return thumb.Ab(a, false);
                    }
                } else if (uIBlock instanceof UIBlockMusicTrack) {
                    Thumb Jb = ((UIBlockMusicTrack) uIBlock).z.Jb();
                    if (Jb != null) {
                        Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
                        return Jb.Ab(a, false);
                    }
                } else if (uIBlock instanceof UIBlockSearchEntityPerson) {
                    Image image3 = ((UIBlockSearchEntityPerson) uIBlock).y.e;
                    if (image3 != null && (Cb2 = image3.Cb(a, true, false)) != null) {
                        return Cb2.d.d;
                    }
                } else if (uIBlock instanceof UIBlockSearchEntityVideoPlaylist) {
                    UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist = (UIBlockSearchEntityVideoPlaylist) uIBlock;
                    Image image4 = uIBlockSearchEntityVideoPlaylist.y.f;
                    if (image4 != null && (Cb = image4.Cb(a, true, false)) != null && (str = Cb.d.d) != null) {
                        return str;
                    }
                    ImageSize Cb7 = uIBlockSearchEntityVideoPlaylist.B.h.Cb(a, true, false);
                    if (Cb7 != null) {
                        return Cb7.d.d;
                    }
                }
            }
        }
        return null;
    }

    public final MusicBaseVkMixInteractiveVh Z(CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        VkMixInteractiveViewStyle vkMixInteractiveViewStyle = catalogViewStyle instanceof VkMixInteractiveViewStyle ? (VkMixInteractiveViewStyle) catalogViewStyle : null;
        if ((vkMixInteractiveViewStyle != null ? vkMixInteractiveViewStyle.b : null) == VkMixInteractiveViewStyle.Style.STATIC) {
            u4a.a aVar = u4aVar.b;
            return new MusicInteractiveSingleVkMixVh(aVar.i, aVar.Q, m0(), u4aVar.b.f);
        }
        u4a.a aVar2 = u4aVar.b;
        return new MusicInteractiveTwoVkMixesVh(aVar2.i, aVar2.Q, m0(), u4aVar.b.f);
    }

    public vd7 a0(u4a u4aVar) {
        return new vd7(u4aVar.b.e);
    }

    public final eda b0(u4a u4aVar) {
        return new eda(N(), u4aVar.b.e, K(u4aVar), g());
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final SearchAuthorVh d0(u4a u4aVar, int i) {
        u4a.a aVar = u4aVar.b;
        b5a b5aVar = aVar.f;
        q3a q3aVar = aVar.e;
        SearchStatInfoProvider searchStatInfoProvider = aVar.m;
        mcc0 mcc0Var = aVar.o;
        CatalogConfiguration catalogConfiguration = aVar.s;
        ydt0 Y = fxc0.B().Y();
        u4a.a aVar2 = u4aVar.b;
        return new SearchAuthorVh(i, b5aVar, q3aVar, searchStatInfoProvider, mcc0Var, catalogConfiguration, new SearchAuthorVh.b(aVar2.b, Y), aVar2.K, new SearchAuthorVh.c(((Boolean) this.m.getValue()).booleanValue(), ((Boolean) this.n.getValue()).booleanValue()), n0(), 512);
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
    public final CatalogViewHolder e0(CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        SearchEntityCatalogViewStyle.EntityStyle entityStyle;
        CatalogSearchEntityAnswer.EntityType entityType = null;
        SearchEntityCatalogViewStyle searchEntityCatalogViewStyle = catalogViewStyle instanceof SearchEntityCatalogViewStyle ? (SearchEntityCatalogViewStyle) catalogViewStyle : null;
        if (C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] != 8) {
            return new EmptyVh(catalogViewType.j());
        }
        if (searchEntityCatalogViewStyle != null && (entityStyle = searchEntityCatalogViewStyle.b) != null) {
            entityType = entityStyle.i();
        }
        int i = entityType == null ? -1 : C0495a.$EnumSwitchMapping$5[entityType.ordinal()];
        if (i == 1) {
            if (searchEntityCatalogViewStyle.b == SearchEntityCatalogViewStyle.EntityStyle.Flat) {
                u4a.a aVar = u4aVar.b;
                return new SearchEntityPersonAnswerVh(aVar.f, aVar.e, aVar.d, aVar.m, aVar.o, aVar.i, R.layout.catalog_search_entity_person_flat_item);
            }
            u4a.a aVar2 = u4aVar.b;
            return new SearchEntityPersonAnswerVh(aVar2.f, aVar2.e, aVar2.d, aVar2.m, aVar2.o, aVar2.i, R.layout.catalog_search_entity_person_card_item);
        }
        if (i != 2) {
            return new EmptyVh(catalogViewType.j());
        }
        if (!((Boolean) this.j.getValue()).booleanValue()) {
            return new EmptyVh(catalogViewType.j());
        }
        u4a.a aVar3 = u4aVar.b;
        return new SearchEntityVideoPlaylistAnswerVh(aVar3.f, aVar3.d, aVar3.m, aVar3.o);
    }

    public final MusicVkMixVh f(CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        VkMixViewStyle vkMixViewStyle = catalogViewStyle instanceof VkMixViewStyle ? (VkMixViewStyle) catalogViewStyle : null;
        if ((vkMixViewStyle != null ? vkMixViewStyle.b : null) != VkMixViewStyle.Style.Small) {
            SimpleMusicVkMixVh simpleMusicVkMixVh = new SimpleMusicVkMixVh(u4aVar.b.i, m0(), R.layout.catalog_music_vk_mix_container);
            simpleMusicVkMixVh.i = null;
            return simpleMusicVkMixVh;
        }
        DevicePerformanceInfo a = DevicePerformanceInfo.a.a();
        boolean z = false;
        if (a == null ? ((int) (Runtime.getRuntime().maxMemory() / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) < 420 : a.d.h() < 2) {
            z = true;
        }
        u4a.a aVar = u4aVar.b;
        return new SmallVkMixVh(!z ? R.layout.catalog_small_vk_mix_animation : R.layout.catalog_small_vk_mix, aVar.f, aVar.i, m0());
    }

    public CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new VerticalListVh(this, hVar, tbaVar, u4aVar, null, z, 0, null, 976);
    }

    public eda.a g() {
        return new qmk0(5);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public String getRef() {
        return this.c;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    public tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        gda l = l(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        return new kea(l, K(u4aVar), u4aVar, a0(u4aVar), uIBlockList == null || uIBlockList.y.size() == 0, uIBlockList, str, uIBlockList == null, null, b0(u4aVar), null, null, null, false, null, 129792);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zvr0 i0() {
        return (zvr0) this.e.getValue();
    }

    public q<hda> j(String str, String str2, String str3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (MusicFeatures.AUTOGEN_GET_BLOCK_ITEMS.h()) {
            String str4 = str == null ? "" : str;
            CatalogFeatures.Companion.getClass();
            List a = CatalogFeatures.a.a();
            if (a != null) {
                List list = a;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(y0((b.d) it.next()));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            return rsg0.y0(yfb.x(wga.f(this.y, str4, str2, null, null, null, arrayList2, str3, 252)), null, null, 3).U(new did0(new b(1, this.z, e2a.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogBlockItemsDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 16));
        }
        wba N = N();
        String str5 = str == null ? "" : str;
        CatalogFeatures.Companion.getClass();
        List a2 = CatalogFeatures.a.a();
        if (a2 != null) {
            List list2 = a2;
            ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(y0((b.d) it2.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return rsg0.y0(new a6a(N, str5, str2, null, str3, arrayList, 24), null, null, 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final fl4 j0() {
        return (fl4) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qdz k0() {
        return (qdz) this.f.getValue();
    }

    public gda l(String str) {
        return new c(str);
    }

    public final com.vk.catalog.mvi.legacy.api.a l0() {
        return (com.vk.catalog.mvi.legacy.api.a) this.x.getValue();
    }

    public final CatalogViewHolder m(CatalogViewStyle catalogViewStyle) {
        HorizontalButtonStackViewStyle horizontalButtonStackViewStyle = catalogViewStyle instanceof HorizontalButtonStackViewStyle ? (HorizontalButtonStackViewStyle) catalogViewStyle : null;
        HorizontalButtonStackViewStyle.Style style = horizontalButtonStackViewStyle != null ? horizontalButtonStackViewStyle.b : null;
        int i = style == null ? -1 : C0495a.$EnumSwitchMapping$8[style.ordinal()];
        return i != 1 ? i != 2 ? new EmptyVh(false) : new HorizontalButtonLargeWithIconVh(k0()) : new HorizontalButtonSmallVh(k0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zaf0 m0() {
        return (zaf0) this.w.getValue();
    }

    public y1a n(u4a u4aVar) {
        return new y1a(u4aVar.b.e, new whu0(this), K(u4aVar), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lpg0 n0() {
        return (lpg0) this.d.getValue();
    }

    public HorizontalListVh o(UIBlock uIBlock, u4a u4aVar, CatalogViewStyle catalogViewStyle) {
        y1a n = n(u4aVar);
        return new HorizontalListVh(this, new c.h((c.m) n), n, u4aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final hyk0 o0() {
        return (hyk0) this.h.getValue();
    }

    public sha p0() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final UserId q() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final tyr0 q0() {
        return (tyr0) this.v.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putString("ref", getRef());
        bundle.putParcelable("owner_id", this.b);
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final vyr0 r0() {
        return (vyr0) this.t.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public qca s() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.libvideo.adfree.api.di.a s0() {
        return (com.vk.libvideo.adfree.api.di.a) this.u.getValue();
    }

    public final hdt0 t0() {
        return (hdt0) this.p.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public int u(UIBlock uIBlock) {
        return 1;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public int v() {
        return 3;
    }

    public final boolean v0() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1122:0x1b88  */
    /* JADX WARN: Removed duplicated region for block: B:1128:0x1b9a  */
    /* JADX WARN: Removed duplicated region for block: B:1132:0x1ba1  */
    /* JADX WARN: Removed duplicated region for block: B:1134:0x1b8c  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.vk.ecomm.api.analytics.MarketAnalyticsParams] */
    /* JADX WARN: Type inference failed for: r6v168 */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        ArrayList<UIBlock> Pb;
        Object obj;
        boolean z5;
        u4a.a aVar = u4aVar.b;
        u4a.b bVar = u4aVar.c;
        u4a.a aVar2 = u4aVar.b;
        boolean f = epx.f(aVar.s.q(), UserId.d);
        int i = C0495a.$EnumSwitchMapping$2[catalogDataType.ordinal()];
        bpn0 bpn0Var = this.g;
        ?? r13 = this.s;
        ?? r14 = this.o;
        r6 = null;
        r6 = null;
        String str2 = null;
        switch (i) {
            case 1:
                int i2 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 != 5) {
                    if (i2 == 6) {
                        return new VideoAlbumVh(R.layout.catalog_video_playlist_single_row_small_slider_item, R.dimen.video_catalog_playlist_item_width, u4aVar, null, 120);
                    }
                    if (i2 != 9) {
                        if (i2 == 14) {
                            return new VideoVerticalAlbumVh(n0(), u4aVar.g(), u4aVar.n(), 24);
                        }
                        switch (i2) {
                            case 66:
                                return new EmptyVh();
                            case 67:
                                return new VideoPlaylistInfoVh(u4aVar.g(), aVar2);
                            case 68:
                                return new VideoAlbumVh(R.layout.catalog_video_tabs_playlist_list_item, R.dimen.video_catalog_playlist_item_width, u4aVar, null, 120);
                            default:
                                return new VideoAlbumVh(R.layout.catalog_video_playlist_list_item, R.dimen.video_catalog_playlist_item_width, u4aVar, null, 120);
                        }
                    }
                }
                if (((Boolean) this.j.getValue()).booleanValue()) {
                    VideoAlbumCatalogViewStyle videoAlbumCatalogViewStyle = catalogViewStyle instanceof VideoAlbumCatalogViewStyle ? (VideoAlbumCatalogViewStyle) catalogViewStyle : null;
                    if (videoAlbumCatalogViewStyle != null && videoAlbumCatalogViewStyle.b == VideoAlbumCatalogViewStyle.Style.VerticalCover) {
                        return new VideoVerticalAlbumVh(n0(), u4aVar.g(), u4aVar.n(), 16);
                    }
                }
                return new VideoAlbumVh(R.layout.catalog_video_playlist_large_or_double_stack_slider_item, R.dimen.video_catalog_album_small_content_item_width, u4aVar, null, 120);
            case 2:
            case 8:
            default:
                return u0(catalogViewType);
            case 3:
            case 4:
            case 24:
                int i3 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i3 == 1) {
                    k7a k = u4aVar.k();
                    VideoItemListSettings videoItemListSettings = VideoItemListSettings.i;
                    return new VideoItemAutoPlayVh(new VideoItemListLargeVh(k, VideoItemListSettings.a.b(), u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                }
                if (i3 != 3) {
                    if (i3 == 14) {
                        VideoCatalogViewStyle videoCatalogViewStyle = catalogViewStyle instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle : null;
                        return new VideoShowcaseViewHolder(u4aVar, videoCatalogViewStyle != null && videoCatalogViewStyle.Cb());
                    }
                    if (i3 == 32) {
                        boolean z6 = catalogViewStyle instanceof VideoCatalogViewStyle;
                        VideoCatalogViewStyle videoCatalogViewStyle2 = z6 ? (VideoCatalogViewStyle) catalogViewStyle : null;
                        if (videoCatalogViewStyle2 != null) {
                            z = true;
                            if (videoCatalogViewStyle2.Bb()) {
                                z2 = true;
                                VideoCatalogViewStyle videoCatalogViewStyle3 = !z6 ? (VideoCatalogViewStyle) catalogViewStyle : null;
                                boolean z7 = videoCatalogViewStyle3 == null && videoCatalogViewStyle3.Cb() == z;
                                return new VideoItemAutoPlayVh(new ShowcaseVideoAutoPlayViewHolder(!z2 ? new zjj0.a(z7) : new zjj0.b(z7), akj0.a.a, w0(), u4aVar.g(), u4aVar.n(), u4aVar.b, 8), u4aVar.g(), u4aVar.n(), f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, x0(), PsExtractor.AUDIO_STREAM);
                            }
                        } else {
                            z = true;
                        }
                        z2 = false;
                        if (!z6) {
                        }
                        if (videoCatalogViewStyle3 == null) {
                        }
                        return new VideoItemAutoPlayVh(new ShowcaseVideoAutoPlayViewHolder(!z2 ? new zjj0.a(z7) : new zjj0.b(z7), akj0.a.a, w0(), u4aVar.g(), u4aVar.n(), u4aVar.b, 8), u4aVar.g(), u4aVar.n(), f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, x0(), PsExtractor.AUDIO_STREAM);
                    }
                    if (i3 == 46) {
                        k7a k2 = u4aVar.k();
                        VideoItemListSettings videoItemListSettings2 = VideoItemListSettings.i;
                        return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(k2, VideoItemListSettings.a.c(), u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    }
                    if (i3 == 5) {
                        return new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_large_item, R.dimen.video_catalog_large_slider_content_item_width, u4aVar, null, null, null, null, null, false, false, false, false, null, t0(), 65528), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    }
                    if (i3 == 6) {
                        VideoCatalogViewStyle videoCatalogViewStyle4 = catalogViewStyle instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle : null;
                        VideoCatalogViewStyle.Style zb = videoCatalogViewStyle4 != null ? videoCatalogViewStyle4.zb() : null;
                        switch (zb != null ? C0495a.$EnumSwitchMapping$3[zb.ordinal()] : -1) {
                            case -1:
                            case 9:
                            case 10:
                                return new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_small_item, R.dimen.video_catalog_small_slider_content_item_width, u4aVar, null, null, null, null, null, false, false, false, false, null, t0(), 65528), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                                return new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_small_item, R.dimen.video_catalog_small_slider_content_item_width, u4aVar, null, null, null, null, null, false, true, false, false, Integer.valueOf(R.dimen.catalog_search_video_slider_item_preview_corner_radius), t0(), 31224), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                return new VideoItemAutoPlayVh(new ShowcaseVideoAutoPlayViewHolder(new zjj0.a(videoCatalogViewStyle4.Cb()), akj0.b.a, false, u4aVar.g(), u4aVar.n(), u4aVar.b, 12), u4aVar.g(), u4aVar.n(), f, true, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 448);
                            case 8:
                                return new CircularAuthorViewHolder(u4aVar.n(), u4aVar.f(), u4aVar.g());
                        }
                    }
                    if (i3 == 8) {
                        return new VideoItemNoAutoPlayVh(new VideoItemListSmallVh(R.layout.catalog_video_small_item, u4aVar, u4aVar.n(), true, null, false, t0(), null, 12024), u4aVar.g(), u4aVar.n(), f, null, false, 176);
                    }
                    if (i3 == 9) {
                        return new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_small_item, R.dimen.video_catalog_small_slider_content_item_width, u4aVar, null, null, null, null, null, false, false, false, false, null, t0(), 65528), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    }
                    switch (i3) {
                        case 48:
                            break;
                        case 49:
                            return new VideoItemAutoPlayVh(new VideoItemListLargeVh(u4aVar.k(), VideoItemListSettings.j, u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                        case 50:
                            return new VideoItemAutoPlayVh(new VideoItemListLargeVh(u4aVar.k(), VideoItemListSettings.k, u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                        case 51:
                            return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(u4aVar.k(), VideoItemListSettings.j, u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        case 52:
                            return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(u4aVar.k(), VideoItemListSettings.k, u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        case 53:
                            return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(u4aVar.k(), VideoItemListSettings.i, u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        case 54:
                        case 55:
                        case 56:
                            return new VideoItemHideVh(u4aVar.g(), u4aVar.n());
                        case 57:
                            return new VideoUploadVh(u4aVar.g(), u4aVar.n());
                        case 58:
                            return new InteractiveVideoVh(u4aVar.k(), VideoItemListSettings.a.f(VideoItemListSettings.i), u4aVar.n(), u4aVar.g(), u4aVar.b);
                        case 59:
                            k7a k3 = u4aVar.k();
                            VideoItemListSettings videoItemListSettings3 = VideoItemListSettings.i;
                            return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(k3, VideoItemListSettings.a.d(), u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, bVar.a, false, 224);
                        default:
                            return new VideoItemAutoPlayVh(new VideoItemListLargeVh(u4aVar.k(), VideoItemListSettings.i, u4aVar.g(), u4aVar.n(), null, null, null, 2032), u4aVar.g(), u4aVar.n(), f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                    }
                }
                Lazy<eht0> p = u4aVar.p();
                return p == null ? new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_small_item, R.dimen.video_catalog_small_slider_content_item_width, u4aVar, null, null, null, null, null, false, false, false, false, null, t0(), 65528), u4aVar.g(), u4aVar.n(), f, null, false, PsExtractor.VIDEO_STREAM_MASK) : catalogViewType == CatalogViewType.VIDEO_SLIDER ? p.getValue().a(aVar2.A) : p.getValue().b(u4aVar.g(), u4aVar.n());
            case 5:
                int i4 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i4 == 5) {
                    return new LinkCellVh(u4aVar.g(), LinkCellVh.ImageSize.Large, u4aVar.k(), u4aVar.n(), null, 16368);
                }
                if (i4 == 6) {
                    return p(catalogViewStyle, u4aVar);
                }
                if (i4 == 7) {
                    return new LinkCellVh(u4aVar.g(), LinkCellVh.ImageSize.Large, u4aVar.k(), u4aVar.n(), null, 16368);
                }
                if (i4 == 8) {
                    return Y(catalogViewStyle, u4aVar);
                }
                if (i4 == 40) {
                    return new LinkCellVh(u4aVar.g(), LinkCellVh.ImageSize.Small, u4aVar.k(), u4aVar.n(), null, 16368);
                }
                if (i4 == 66) {
                    return new BannersVh(u4aVar.g(), new u70(this, 11));
                }
                if (i4 == 106) {
                    return new LinkCellVh(u4aVar.g(), LinkCellVh.ImageSize.ExtraSmall, u4aVar.k(), u4aVar.n(), new LinkBaseVh.a(), 15696);
                }
                switch (i4) {
                    case 130:
                        return new FeaturedListBannerVh();
                    case MRAID_JS_WRITE_FAILED_VALUE:
                        return new LinkVh(u4aVar.g(), R.layout.catalog_link_music_update, R.dimen.catalog_link_music_update_icon_size, u4aVar.k(), u4aVar.n(), null, 32736);
                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        return h(catalogViewStyle, u4aVar);
                    case OMSDK_JS_WRITE_FAILED_VALUE:
                        return new LinkCellVh(u4aVar.g(), LinkCellVh.ImageSize.Small, u4aVar.k(), u4aVar.n(), new LinkBaseVh.a(false, Integer.valueOf(R.dimen.vk_button_corner_radius)), 6512);
                    case 134:
                        return new MusicSmallBannerOfferVh(u4aVar.g());
                    case 135:
                        return new MusicGridLinkVh(u4aVar.g(), u4aVar.n(), catalogViewType, u4aVar.k(), new LinkVh.a(false, Integer.valueOf(R.dimen.music_catalog_list_small_corner_radius)));
                    case PRIVACY_URL_ERROR_VALUE:
                        return i(catalogViewStyle, u4aVar);
                    case TPAT_RETRY_FAILED_VALUE:
                        return new PodcastCategoryVh(u4aVar.g(), u4aVar.n());
                    case 138:
                        return new MusicCategoryVh(u4aVar.g(), u4aVar.n(), new lga(u4aVar, 1));
                    case 139:
                        return new LinkMyShelfVh();
                    case VersionConstants.PRODUCT_MAJOR_VERSION /* 140 */:
                        return new MusicKidsCollectionVh(aVar2.R);
                    case 141:
                        return new MusicKidsCatalogVh(aVar2.R);
                    case 142:
                        return new MusicDynamicGridVh();
                    default:
                        return new LinkCellVh(u4aVar.g(), LinkCellVh.ImageSize.Small, u4aVar.k(), u4aVar.n(), null, 16368);
                }
            case 6:
                int i5 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i5 != 6 ? i5 != 8 ? u0(catalogViewType) : new AppLinkVh(u4aVar.g(), u4aVar.k(), u4aVar.n(), m7m.f(this)) : new AppHorizontalLinkVh(new AppHorizontalLinkVh.c.a(), u4aVar.g(), u4aVar.k(), u4aVar.n(), m7m.f(this));
            case 7:
                int i6 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i6 != 5 ? i6 != 6 ? i6 != 8 ? u0(catalogViewType) : new AppLinkVh(u4aVar.g(), u4aVar.k(), u4aVar.n(), m7m.f(this)) : new AppHorizontalLinkVh(new AppHorizontalLinkVh.c.b(), u4aVar.g(), u4aVar.k(), u4aVar.n(), m7m.f(this)) : new AppHorizontalLinkVh(new AppHorizontalLinkVh.c.a(), u4aVar.g(), u4aVar.k(), u4aVar.n(), m7m.f(this));
            case 9:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 144 ? new StickerSearchItemVh(bVar.b, aVar2.A, new GiftData(aVar2.z, true), aVar2.y, u4aVar.g(), u4aVar.n()) : u0(catalogViewType);
            case 10:
                f9l0 f9l0Var = bVar.b;
                String str3 = aVar2.A;
                GiftData giftData = new GiftData(aVar2.z, true);
                ContextUser contextUser = aVar2.y;
                int i7 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i7 == 40) {
                    return new StickerPackTripleStackedSliderItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                }
                if (i7 == 144) {
                    return new StickerPackSearchItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                }
                switch (i7) {
                    case 5:
                        return new StickerPackSliderLargeItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                    case 6:
                        return new StickerPackSliderSmallItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                    case 7:
                    case 8:
                        return new StickerPackVerticalListItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                    case 9:
                        return new StickerPackDoubleStackedSliderItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                    default:
                        switch (i7) {
                            case 23:
                                return new StickerPackSliderItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                            case 24:
                                return new StickerPackSliderItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n(), true);
                            case 25:
                                return new StickerPackHorizontalPreviewListItemVh(f9l0Var, str3, giftData, contextUser, u4aVar.g(), u4aVar.n());
                            default:
                                return u0(catalogViewType);
                        }
                }
            case 11:
                return new BannersVh(u4aVar.g(), new fne(this, 11));
            case 12:
            case 13:
                int i8 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i8 == 12) {
                    u2b0 l = u4aVar.l();
                    t5a<MusicTrack> j = u4aVar.j();
                    b5a g = u4aVar.g();
                    SearchStatInfoProvider n = u4aVar.n();
                    q3a f2 = u4aVar.f();
                    Object m = u4aVar.m();
                    return new MusicTrackVh(l, R.layout.music_audio_item_ordered_playlist, j, g, n, 3, f2, m instanceof sq40 ? (sq40) m : null, 1728);
                }
                if (i8 == 62) {
                    u2b0 l2 = u4aVar.l();
                    t5a<MusicTrack> j2 = u4aVar.j();
                    b5a g2 = u4aVar.g();
                    SearchStatInfoProvider n2 = u4aVar.n();
                    q3a f3 = u4aVar.f();
                    Object m2 = u4aVar.m();
                    return new MusicTrackCellVh(l2, R.layout.catalog_music_audio_item_slider, j2, g2, n2, f3, m2 instanceof sq40 ? (sq40) m2 : null, !v0(), 12512);
                }
                switch (i8) {
                    case 7:
                        u2b0 l3 = u4aVar.l();
                        t5a<MusicTrack> j3 = u4aVar.j();
                        b5a g3 = u4aVar.g();
                        SearchStatInfoProvider n3 = u4aVar.n();
                        q3a f4 = u4aVar.f();
                        Object m3 = u4aVar.m();
                        return new MusicTrackVh(l3, R.layout.catalog_music_track_large_list, j3, g3, n3, 0, f4, m3 instanceof sq40 ? (sq40) m3 : null, 1760);
                    case 8:
                        u2b0 l4 = u4aVar.l();
                        t5a<MusicTrack> j4 = u4aVar.j();
                        b5a g4 = u4aVar.g();
                        SearchStatInfoProvider n4 = u4aVar.n();
                        q3a f5 = u4aVar.f();
                        Object m4 = u4aVar.m();
                        return new MusicTrackCellVh(l4, R.layout.catalog_music_cell_audio_item, j4, g4, n4, f5, m4 instanceof sq40 ? (sq40) m4 : null, !v0(), 5856);
                    case 9:
                        break;
                    case 10:
                        return new MusicTrackPickerVh(bVar.a, u4aVar.g(), u4aVar.l(), R.layout.catalog_music_audio_item_picker);
                    default:
                        switch (i8) {
                            case 40:
                                break;
                            case 41:
                                return new MusicTrackPickerVh(bVar.a, u4aVar.g(), u4aVar.l(), R.layout.catalog_music_audio_item_picker_320);
                            case 42:
                                u2b0 l5 = u4aVar.l();
                                t5a<MusicTrack> j5 = u4aVar.j();
                                b5a g5 = u4aVar.g();
                                SearchStatInfoProvider n5 = u4aVar.n();
                                q3a f6 = u4aVar.f();
                                Object m5 = u4aVar.m();
                                return new MusicTrackVh(l5, R.layout.music_audio_item_ordered_playlist_320, j5, g5, n5, 3, f6, m5 instanceof sq40 ? (sq40) m5 : null, 1728);
                            default:
                                return u0(catalogViewType);
                        }
                }
                u2b0 l6 = u4aVar.l();
                t5a<MusicTrack> j6 = u4aVar.j();
                b5a g6 = u4aVar.g();
                SearchStatInfoProvider n6 = u4aVar.n();
                q3a f7 = u4aVar.f();
                Object m6 = u4aVar.m();
                return new MusicTrackCellVh(l6, R.layout.catalog_music_audio_item_slider, j6, g6, n6, f7, m6 instanceof sq40 ? (sq40) m6 : null, !v0(), 13536);
            case 14:
                if (catalogViewType == CatalogViewType.MUSIC_CHART_LARGE_SLIDER) {
                    u2b0 l7 = u4aVar.l();
                    b5a g7 = u4aVar.g();
                    SearchStatInfoProvider n7 = u4aVar.n();
                    Object m7 = u4aVar.m();
                    return new MusicPlaylistChartGridVh(new MusicPlaylistVh(catalogViewType, R.layout.catalog_music_playlist_chart_slider, l7, g7, n7, m7 instanceof sq40 ? (sq40) m7 : null));
                }
                if (catalogViewType == CatalogViewType.MUSIC_CHART_LIST) {
                    u2b0 l8 = u4aVar.l();
                    b5a g8 = u4aVar.g();
                    SearchStatInfoProvider n8 = u4aVar.n();
                    Object m8 = u4aVar.m();
                    return new MusicPlaylistChartListVh(new MusicPlaylistVh(catalogViewType, R.layout.catalog_music_playlist_chart_list, l8, g8, n8, m8 instanceof sq40 ? (sq40) m8 : null));
                }
                if (catalogViewType == CatalogViewType.RECOMMS_SLIDER) {
                    return new MusicSmartPlaylistVh(u4aVar.l(), m0(), u4aVar.g());
                }
                if (catalogViewType == CatalogViewType.CROP_SLIDER) {
                    return new MusicMoodPlaylistVh(R.layout.catalog_music_vibe_playlist_slider, u4aVar.g(), u4aVar.l(), m0());
                }
                if (catalogViewType == CatalogViewType.COMPACT_LIST) {
                    b5a g9 = u4aVar.g();
                    SearchStatInfoProvider n9 = u4aVar.n();
                    Object m9 = u4aVar.m();
                    return new MusicPlaylistCellVh(g9, n9, m9 instanceof sq40 ? (sq40) m9 : null, 120);
                }
                if (catalogViewType == CatalogViewType.MUSIC_EXCLUSIVE_SLIDER) {
                    return new ExclusiveAlbumVh(u4aVar.l());
                }
                if (catalogViewType.n()) {
                    b5a g10 = u4aVar.g();
                    SearchStatInfoProvider n10 = u4aVar.n();
                    Object m10 = u4aVar.m();
                    return new MusicPlaylistCellVh(g10, n10, m10 instanceof sq40 ? (sq40) m10 : null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                if (!catalogViewType.j()) {
                    return u0(catalogViewType);
                }
                u2b0 l9 = u4aVar.l();
                b5a g11 = u4aVar.g();
                SearchStatInfoProvider n11 = u4aVar.n();
                Object m11 = u4aVar.m();
                return new MusicPlaylistVkTileVh(l9, g11, n11, m11 instanceof sq40 ? (sq40) m11 : null, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE);
            case 15:
                return e0(catalogViewType, catalogViewStyle, u4aVar);
            case 16:
                int i9 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i9 != 26) {
                    if (i9 != 27) {
                        if (i9 != 36) {
                            if (i9 != 37) {
                                return u0(catalogViewType);
                            }
                        }
                    }
                    return new PodcastBannerVh(u4aVar.e(), u4aVar.g());
                }
                q3a f8 = u4aVar.f();
                b5a g12 = u4aVar.g();
                r8a r8aVar = aVar2.q;
                com.vk.catalog2.common.ui.mvp.util.a e = u4aVar.e();
                boolean j7 = catalogViewType.j();
                switch (CatalogViewType.b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                return new CatalogPromoBannerVh(f8, g12, r8aVar, e, j7, z3);
            case 17:
            case 18:
            case 19:
                int i10 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 8 && i10 != 11) {
                    if (i10 != 30) {
                        if (i10 != 35 && i10 != 39 && i10 != 66) {
                            switch (i10) {
                                case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                                    break;
                                case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                                    return new MusicSnippetBannerVh(u4aVar.e(), u4aVar.g());
                                case 108:
                                    return fxc0.B().J().U0() ? new CatalogBannerVh(this.y, u4aVar.f(), r0(), s0(), q0()) : new EmptyVh();
                                default:
                                    return u0(catalogViewType);
                            }
                        }
                    }
                    return new SmallVkBannerVh(u4aVar.f(), u4aVar.g(), aVar2.q, u4aVar.e(), catalogViewType.j(), catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE);
                }
                return new VkBannerVh(u4aVar.f(), u4aVar.g(), aVar2.q, u4aVar.e(), catalogViewType.k() ? R.layout.catalog_vk_banner_large : R.layout.catalog_vk_banner_normal, catalogViewType.k() ? BannerSize.Large : BannerSize.Normal, catalogViewType.j(), catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE);
            case 20:
                int i11 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i11 != 21 && i11 != 38) {
                    return u0(catalogViewType);
                }
                b5a g13 = u4aVar.g();
                com.vk.catalog2.common.ui.mvp.util.a e2 = u4aVar.e();
                switch (CatalogViewType.b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        z4 = true;
                        break;
                    default:
                        z4 = false;
                        break;
                }
                return new CatalogGroupBannerVh(g13, e2, z4);
            case 21:
                switch (C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 109:
                        return new PlaceholderVh(u4aVar.e(), false, false, null, null, 0, u4aVar.m(), 0, 190);
                    case 110:
                        return new PlaceholderVh(u4aVar.e(), false, false, null, null, 0, u4aVar.m(), 0, 188);
                    case 111:
                        return new PlaceholderVh(u4aVar.e(), false, false, null, null, 0, u4aVar.m(), 0, 190);
                    case 112:
                    case 113:
                        return new ImageWarningPlaceholderVh(u4aVar.e(), u4aVar.m());
                    default:
                        return u0(catalogViewType);
                }
            case 22:
                ToolbarVh toolbarVh = new ToolbarVh(u4aVar.m(), u4aVar.f(), null, 0, false, null, b0(u4aVar), null, p0(), null, null, 4046716);
                if (uIBlock == null || (str = uIBlock.w()) == null) {
                    str = "";
                }
                tba<hda> h0 = h0(null, str, u4aVar);
                bx9 bx9Var = new bx9(u4aVar, toolbarVh, this, uIBlock, 5);
                uba ubaVar = new uba(h0);
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = (CatalogPaginatedListViewHolder) bx9Var.invoke(ubaVar);
                ubaVar.h = catalogPaginatedListViewHolder;
                return catalogPaginatedListViewHolder;
            case 23:
                int i12 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                bpn0 bpn0Var2 = this.C;
                switch (i12) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        return o(uIBlock, u4aVar, catalogViewStyle);
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return g0(this, uIBlock, u4aVar, null, 12);
                    case 9:
                        return new GridListVh(this, 2, u4aVar, 0, null, (GridListVh.a) bpn0Var2.getValue(), 120);
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        return new HorizontalLoopVh(this, u4aVar, 60);
                    case 40:
                    case 41:
                    case 42:
                        return new GridListVh(this, 3, u4aVar, 0, null, (GridListVh.a) bpn0Var2.getValue(), 120);
                    case 43:
                        return new GridListVh(this, 3, u4aVar, 0, null, null, 184);
                    case 44:
                        return new SportsMatchesCurrentVh(u4aVar.g());
                    case 45:
                        return new SportsMatchesUpcomingVh(u4aVar.g());
                    case 46:
                        return o(uIBlock, u4aVar, catalogViewStyle);
                    case 47:
                        return new PagerGridListVh(this, new Pair(2, 2), u4aVar, new Pair(2, 4));
                    default:
                        return u0(catalogViewType);
                }
            case 25:
                return !aVar2.c ? new QuestionnaireVh(u4aVar.n(), u4aVar.f(), u4aVar.g()) : new EmptyVh();
            case 26:
                int i13 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i13 != 5 ? i13 != 8 ? u0(catalogViewType) : new ArticleVh(R.layout.catalog_article_list_item, R.dimen.catalog_article_background_image_list_width) : new ArticleVh(R.layout.catalog_article_large_slider_item, R.dimen.catalog_article_background_image_slider_width);
            case 27:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 6 ? new FriendsLikeVh(new PodcastSliderItemRoundBackgroundVh(R.layout.music_audio_item_friend_liked_podcast, u4aVar.l(), aVar2.B), u4aVar.d()) : u0(catalogViewType);
            case 28:
                sq40 sq40Var = null;
                int i14 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i14 == 6) {
                    return new PodcastSliderItemRoundBackgroundVh(R.layout.music_audio_item_slider_podcast, u4aVar.l(), aVar2.B);
                }
                if (i14 != 8) {
                    return u0(catalogViewType);
                }
                u2b0 l10 = u4aVar.l();
                t5a<MusicTrack> j8 = u4aVar.j();
                b5a g14 = u4aVar.g();
                SearchStatInfoProvider n12 = u4aVar.n();
                q3a f9 = u4aVar.f();
                Object m12 = u4aVar.m();
                if (m12 instanceof sq40) {
                    sq40Var = (sq40) m12;
                }
                return new MusicTrackVh(l10, R.layout.music_audio_item_podcast, j8, g14, n12, 1, f9, sq40Var, 1728);
            case 29:
                int i15 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i15 == 8) {
                    sq40 sq40Var2 = null;
                    u2b0 l11 = u4aVar.l();
                    t5a<MusicTrack> j9 = u4aVar.j();
                    b5a g15 = u4aVar.g();
                    SearchStatInfoProvider n13 = u4aVar.n();
                    q3a f10 = u4aVar.f();
                    Object m13 = u4aVar.m();
                    if (m13 instanceof sq40) {
                        sq40Var2 = (sq40) m13;
                    }
                    return new MusicTrackVh(l11, R.layout.music_audio_item_podcast, j9, g15, n13, 1, f10, sq40Var2, 1728);
                }
                if (i15 == 12) {
                    sq40 sq40Var3 = null;
                    u2b0 l12 = u4aVar.l();
                    t5a<MusicTrack> j10 = u4aVar.j();
                    b5a g16 = u4aVar.g();
                    SearchStatInfoProvider n14 = u4aVar.n();
                    q3a f11 = u4aVar.f();
                    Object m14 = u4aVar.m();
                    if (m14 instanceof sq40) {
                        sq40Var3 = (sq40) m14;
                    }
                    return new MusicTrackVh(l12, R.layout.music_audio_item_ordered_podcast, j10, g16, n14, 3, f11, sq40Var3, 1728);
                }
                if (i15 == 42) {
                    u2b0 l13 = u4aVar.l();
                    t5a<MusicTrack> j11 = u4aVar.j();
                    b5a g17 = u4aVar.g();
                    SearchStatInfoProvider n15 = u4aVar.n();
                    q3a f12 = u4aVar.f();
                    Object m15 = u4aVar.m();
                    return new MusicTrackVh(l13, R.layout.music_audio_item_ordered_podcast_320, j11, g17, n15, 3, f12, m15 instanceof sq40 ? (sq40) m15 : null, 1728);
                }
                if (i15 != 60) {
                    return i15 != 61 ? u0(catalogViewType) : new MyShelfStartedListeningVh(u4aVar.l());
                }
                u2b0 l14 = u4aVar.l();
                sq40 sq40Var4 = null;
                t5a<MusicTrack> j12 = u4aVar.j();
                b5a g18 = u4aVar.g();
                SearchStatInfoProvider n16 = u4aVar.n();
                q3a f13 = u4aVar.f();
                Object m16 = u4aVar.m();
                if (m16 instanceof sq40) {
                    sq40Var4 = (sq40) m16;
                }
                return new MusicTrackVh(l14, R.layout.music_item_listened_track, j12, g18, n16, 5, f13, sq40Var4, 1600);
            case 30:
                int i16 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i16 != 5) {
                    return i16 != 8 ? i16 != 17 ? u0(catalogViewType) : new PodcastRecommendationVh(u4aVar.l()) : new PodcastSliderCellVh(u4aVar.l(), k0(), (kbj0) r13.getValue(), (phb0) r14.getValue(), (PodcastBottomSheetHeaderComponent) bpn0Var.getValue());
                }
                qdz k0 = k0();
                b5a g19 = u4aVar.g();
                r6 = catalogViewStyle instanceof PodcastSliderViewStyle ? (PodcastSliderViewStyle) catalogViewStyle : 0;
                return new ComposePodcastSliderVh(k0, g19, r6 != 0 && r6.zb());
            case 31:
                int i17 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i17 != 5 ? i17 != 8 ? u0(catalogViewType) : new PodcastOfflineVh(u4aVar.l(), j0(), (kbj0) r13.getValue(), (phb0) r14.getValue(), (PodcastBottomSheetHeaderComponent) bpn0Var.getValue()) : new PodcastOfflineSliderVh(j0());
            case 32:
                int i18 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i18 == 5) {
                    return new MusicRecommendedPlaylistVh(u4aVar.l(), u4aVar.f(), u4aVar.g());
                }
                if (i18 != 8) {
                    return u0(catalogViewType);
                }
                b5a g20 = u4aVar.g();
                SearchStatInfoProvider n17 = u4aVar.n();
                Object m17 = u4aVar.m();
                return new MusicPlaylistCellVh(g20, n17, m17 instanceof sq40 ? (sq40) m17 : null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            case 33:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 8 ? new MusicAggregatedUpdatesVh(u4aVar.e()) : u0(catalogViewType);
            case 34:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 8 ? new MusicPlaylistUpdateVh() : u0(catalogViewType);
            case 35:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 63 ? new ComposeMusicOwnerVh(u4aVar.g(), u4aVar.k(), j0(), k0()) : u0(catalogViewType);
            case 36:
            case 37:
                int i19 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i19 != 8) {
                    return i19 != 64 ? i19 != 65 ? u0(catalogViewType) : d0(u4aVar, R.layout.catalog_link_video_subscriptions_hidden_list_item) : d0(u4aVar, R.layout.catalog_link_video_subscriptions_list_item);
                }
                return d0(u4aVar, (this.i && aVar2.c) ? R.layout.catalog_search_owner_item_tablet : R.layout.catalog_search_owner_item);
            case 38:
                return new EmptyVh();
            case 39:
                int i20 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i20 == 5) {
                    return o(uIBlock, u4aVar, catalogViewStyle);
                }
                if (i20 == 6) {
                    return new SubcategoryFilterVh(new wtm0(u4aVar.f(), u4aVar.g(), b0(u4aVar), 8));
                }
                u2b0 u2b0Var = this.q;
                switch (i20) {
                    case 69:
                        return new FriendsRequestsIncomingVh();
                    case 70:
                    case 71:
                        return new HorizontalNonScrollableListVh(this, u4aVar, 0, null, 0, 28);
                    case 72:
                        return new FilterButtonVh(b0(u4aVar));
                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                        return new MusicSubsectionFilterButtonVh(b0(u4aVar));
                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                        return new VideoActionUploadVh();
                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                        UIBlockButtons uIBlockButtons = uIBlock instanceof UIBlockButtons ? (UIBlockButtons) uIBlock : null;
                        if (uIBlockButtons != null && (Pb = uIBlockButtons.Pb()) != null) {
                            Iterator<T> it = Pb.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((UIBlock) obj) instanceof UIBlockActionTextButton) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            UIBlock uIBlock2 = (UIBlock) obj;
                            if (uIBlock2 != null) {
                                str2 = ((UIBlockActionTextButton) uIBlock2).Sb();
                            }
                        }
                        return epx.f(str2, "borderless_with_icon") ? new BorderlessWithIconButtonVh(u4aVar.e(), catalogViewType) : new VideoActionCreateAlbumVh(q(), 14);
                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        return new VideoActionStartLiveStreamVh(i0());
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        return new PlayMixActionVh(u2b0Var, m0(), new ava0(u2b0Var, ((MixSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(MixSettingsComponent.class))).af(), m0()));
                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                        return new ArtistMixVh(u2b0Var, new ava0(u2b0Var, ((MixSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(MixSettingsComponent.class))).af()), u4aVar.g());
                    case 79:
                        return new ComposeMusicActionPlayAudiosFromBlockIdVh(R.string.music_button_create_playlist, u4aVar.l(), Integer.valueOf(R.drawable.vk_icon_list_add_outline_28), VkCell.Left.Main.Size.Large, j0());
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        return new MusicActionPlayAudiosFromBlockIdVh(R.drawable.vk_icon_shuffle_24, R.string.music_button_shuffle, u4aVar.l());
                    case IMAGES_IMAGE_LOADED_VALUE:
                        return new MusicActionPlayAudiosFromBlockIdVh(R.drawable.vk_icon_play_24, R.string.music_playlist_controls_play_all, u4aVar.l());
                    case 82:
                        return new MusicActionSaveAsPlaylistButtonVh(R.drawable.vk_icon_add_24, R.layout.catalog_music_action_with_icon_background_btn);
                    case 83:
                        return new ActionFollowVh(u4aVar.f(), u4aVar.k(), u4aVar.g(), u4aVar.n());
                    case 84:
                        return new ComposeHeaderClearBlocksVh(u4aVar.f(), u4aVar.g());
                    case 85:
                    case ModuleDescriptor.MODULE_VERSION /* 86 */:
                        return new FriendsActionVh(u4aVar.g());
                    case 87:
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        b5a g21 = u4aVar.g();
                        rns A6 = ((FeedFriendsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FeedFriendsComponent.class))).A6();
                        if (catalogViewType == CatalogViewType.SYNTHETIC_ACTION_IMPORT_CONTACTS && ams.a().H0()) {
                            long j13 = Preference.j().getLong("contacts_import_timestamp", 0L);
                            if (j13 != 0 && System.currentTimeMillis() - j13 > TimeUtils.MILLISECONDS_PER_DAY) {
                                return new EmptyVh();
                            }
                        }
                        return new FriendsActionListItemVh(g21, A6);
                    case 90:
                        u4aVar.m();
                        u4aVar.g();
                        return new ActionOpenScreenButtonVh();
                    case JsonToken.BEGIN_ARRAY /* 91 */:
                    case 92:
                        u4aVar.m();
                        return new ActionSortVh(b0(u4aVar), u4aVar.g());
                    case JsonToken.END_ARRAY /* 93 */:
                        u4aVar.m();
                        u4aVar.g();
                        return new ActionAdvButtonVh();
                    case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        return new ActionOpenSectionVh(this, u4aVar.m(), u4aVar.g(), u4aVar.n());
                    case 95:
                        return new ActionOpenSectionChipVh(this, u4aVar.m(), u4aVar.g());
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        return new ActionOpenSearchTabVh(u4aVar.g());
                    case 97:
                        return new ActionExpandBlockVh(u4aVar.f(), u4aVar.g());
                    case JsonToken.BOOLEAN /* 98 */:
                        return new ActionOpenSliderSectionVh(this, u4aVar.m(), u4aVar.g(), u4aVar.n());
                    case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                        return new ActionOpenSliderSectionVh(this, u4aVar.m(), u4aVar.g(), u4aVar.n(), Integer.valueOf(iah0.a(168)));
                    case 100:
                        return new ActionOpenSliderSectionVh(this, u4aVar.m(), u4aVar.g(), u4aVar.n(), Integer.valueOf(iah0.a(138)));
                    case 101:
                        return new ActionOpenSliderLinkVh(u4aVar.e(), u4aVar.m(), u4aVar.g());
                    case 102:
                        return new ActionOpenLinkVh(u4aVar.e(), u4aVar.g());
                    case 103:
                        return new MusicFollowOwnerButtonVh(aVar2.v);
                    case 104:
                        return new MusicFollowCuratorButtonVh(aVar2.v);
                    case 105:
                        return new OpenInfoPopupVh();
                    default:
                        return u0(catalogViewType);
                }
            case 40:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 28 ? new ExtendedPodcastBannerVh() : u0(catalogViewType);
            case 41:
                int i21 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i21 == 84) {
                    return new ComposeHeaderClearBlocksVh(u4aVar.f(), u4aVar.g());
                }
                if (i21 == 93) {
                    u4aVar.m();
                    u4aVar.g();
                    return new ActionAdvButtonVh();
                }
                switch (i21) {
                    case ASSET_WRITE_ERROR_VALUE:
                        return new ComposeHeaderShowAllVh(this, u4aVar.m(), b0(u4aVar), u4aVar.g(), u4aVar.e(), u4aVar.n(), null, false, u4aVar.f(), PsExtractor.AUDIO_STREAM);
                    case INVALID_INDEX_URL_VALUE:
                        return new ComposeHeaderShowAllVh(this, u4aVar.m(), b0(u4aVar), u4aVar.g(), u4aVar.e(), u4aVar.n(), null, false, u4aVar.f(), PsExtractor.AUDIO_STREAM);
                    case 116:
                        return new ComposeConfigurableHeaderVh(this, u4aVar.m(), b0(u4aVar), u4aVar.g(), u4aVar.e(), u4aVar.n());
                    case ASSET_FAILED_STATUS_CODE_VALUE:
                        return new ComposeHeaderIconShowAllBadgeVh(this, u4aVar.m(), b0(u4aVar), u4aVar.g(), u4aVar.e(), u4aVar.n(), null, 448);
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        return new SeparatorVh(0, null, 0, 7);
                    case JSON_ENCODE_ERROR_VALUE:
                        return new SeparatorVh(R.layout.catalog_separator_compact, null, R.attr.vk_ui_separator_primary_alpha, 2);
                    case 120:
                        return new SeparatorVh(R.layout.catalog_separator_transparent, null, R.attr.vk_ui_transparent, 2);
                    case TPAT_ERROR_VALUE:
                        return new SeparatorVh(R.layout.catalog_separator_thin, null, 0, 6);
                    case INVALID_ADS_ENDPOINT_VALUE:
                        return new SeparatorVh(R.layout.catalog_separator_island, null, R.attr.vk_ui_background, 2);
                    case 123:
                        return new SeparatorVh(R.layout.catalog_separator_island_transparent, null, R.attr.vk_ui_transparent, 2);
                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        return new EmptyVh();
                    case 125:
                        return new HeaderClearBlocksVh(u4aVar.f(), u4aVar.g(), R.layout.catalog_header_clear_compact);
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        return new ComposeHeaderClearBlocksVh(u4aVar.f(), u4aVar.g());
                    case 127:
                        return new ViewPagerVh(u4aVar, false, null, false, null, null, null, null, null, null, 8190);
                    case 128:
                        return new SearchMapPreviewHeaderHolder(this, u4aVar.m(), b0(u4aVar), u4aVar.g(), u4aVar.e(), u4aVar.n(), u4aVar.c());
                    case 129:
                        return new LegalNoticeVh();
                    default:
                        return u0(catalogViewType);
                }
            case 42:
                int i22 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i22 != 8 ? i22 != 29 ? u0(catalogViewType) : new AudioContentCardVh(u4aVar.l(), u4aVar.g(), (phb0) r14.getValue()) : new AudioContentVh(u4aVar.l(), u4aVar.g());
            case 43:
                int i23 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i23 != 67 ? i23 != 143 ? u0(catalogViewType) : new TextVh(aVar2.q, u4aVar.f()) : new VideoPlaylistInfoVh(u4aVar.g(), aVar2);
            case 44:
                int i24 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return (i24 == 5 || i24 == 6) ? new MarketSingleItemViewHolder(u4aVar, true) : i24 != 13 ? u0(catalogViewType) : new MarketSingleItemViewHolder(u4aVar, false);
            case 45:
                int i25 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i25 != 6 ? i25 != 8 ? u0(catalogViewType) : new MarketGroupItemLargeVh(u4aVar) : new MarketGroupItemSmallVh(u4aVar);
            case 46:
                int i26 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i26 != 6 ? i26 != 16 ? u0(catalogViewType) : new CatalogCategoryTabVh(k0().e(), ((MarketCategoriesComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketCategoriesComponent.class))).a()) : new NavigationTabVh(u4aVar, r6, 14);
            case 47:
                return new StickerTopBarBonusBalanceVh(new d2a((whu0) U(), K(u4aVar), u4aVar.f()), new GiftData(aVar2.z, true), aVar2.y);
            case 48:
                int i27 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i27 == 6) {
                    return new FriendsSliderItemVh(u4aVar.g(), u4aVar.n());
                }
                if (i27 == 8) {
                    m3a c2 = u4aVar.c();
                    q3a f14 = u4aVar.f();
                    b5a g22 = u4aVar.g();
                    SearchStatInfoProvider n18 = u4aVar.n();
                    cks h = u4aVar.h();
                    u4aVar.i();
                    return new FriendsItemListVh(c2, f14, g22, n18, h, new jzi0(3));
                }
                switch (i27) {
                    case 145:
                        return new FriendsItemSearchListVh(u4aVar.c(), u4aVar.g(), u4aVar.f(), u4aVar.n());
                    case 146:
                    case 147:
                    case 148:
                        dos dosVar = new dos(new vls[0]);
                        dos dosVar2 = aVar2.n;
                        if (dosVar2 != null) {
                            dosVar.b(dosVar2);
                        }
                        cks h2 = u4aVar.h();
                        if (h2 != null) {
                            dosVar.b(new dks(h2));
                        }
                        return new FriendsRequestsCommonVh(new FriendsRequestsCommonVh.d(u4aVar.n(), u4aVar.c(), u4aVar.g(), u4aVar.h(), dosVar));
                    case 149:
                        dos dosVar3 = new dos(new vls[0]);
                        dos dosVar4 = aVar2.n;
                        if (dosVar4 != null) {
                            dosVar3.b(dosVar4);
                        }
                        cks h3 = u4aVar.h();
                        if (h3 != null) {
                            dosVar3.b(new dks(h3));
                        }
                        return new FriendsSuggestsVh(new FriendsSuggestsVh.a(u4aVar.n(), u4aVar.c(), u4aVar.g(), u4aVar.h(), dosVar3));
                    case 150:
                        dos dosVar5 = new dos(new vls[0]);
                        dos dosVar6 = aVar2.n;
                        if (dosVar6 != null) {
                            dosVar5.b(dosVar6);
                        }
                        cks h4 = u4aVar.h();
                        if (h4 != null) {
                            dosVar5.b(new dks(h4));
                        }
                        return new FriendsSuggestsVh(new FriendsSuggestsVh.a(dosVar5, u4aVar.h(), u4aVar.c(), u4aVar.g(), u4aVar.n(), true, false, FriendsSuggestsVh.ScreenType.SEARCH_SCREEN));
                    case 151:
                        return new FriendsRequestsIncomingVh();
                    default:
                        return u0(catalogViewType);
                }
            case 49:
            case 50:
            case 51:
                int i28 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i28 == 5 || i28 == 6) {
                    return new GroupVh(R.layout.catalog_link_slider_item, 8096, u4aVar.n(), u4aVar.c(), u4aVar.f(), u4aVar.g(), true);
                }
                if (i28 == 14) {
                    return new GroupCardItemVh(u4aVar.g(), u4aVar.f(), u4aVar.n(), true);
                }
                if (i28 != 15) {
                    if (i28 == 21) {
                        return new GroupCardItemVh(u4aVar.n(), u4aVar.f(), u4aVar.g());
                    }
                    if (i28 == 22) {
                        VideoCatalogViewStyle videoCatalogViewStyle5 = catalogViewStyle instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle : null;
                        if (videoCatalogViewStyle5 != null && videoCatalogViewStyle5.b == VideoCatalogViewStyle.Style.AuthorVideos) {
                            return new AuthorsVideoGroupCardVh(u4aVar.n(), u4aVar.f(), u4aVar.g());
                        }
                        if (videoCatalogViewStyle5 == null || videoCatalogViewStyle5.b != VideoCatalogViewStyle.Style.AuthorsCircle) {
                            return new GroupCardWithBottomBtnVh(u4aVar.g(), u4aVar.f(), u4aVar.n(), catalogViewType);
                        }
                        return new CircularAuthorViewHolder(u4aVar.n(), u4aVar.f(), u4aVar.g());
                    }
                    if (i28 == 40) {
                        return new GroupCellVh(iah0.a(320), 832, u4aVar.n(), u4aVar.c(), u4aVar.f(), u4aVar.g(), false);
                    }
                    if (i28 != 47) {
                        if (i28 == 66) {
                            return new GroupBannerVh(u4aVar.g());
                        }
                        if (i28 == 71) {
                            return new CommunityVkTabVh(b0(u4aVar));
                        }
                        if (i28 == 72) {
                            return new FilterButtonVh(b0(u4aVar));
                        }
                        switch (i28) {
                            case 152:
                                return new SearchGroupCellVh(u4aVar.c(), u4aVar.g(), u4aVar.f(), u4aVar.n(), true);
                            case 153:
                                return new GroupsPreviewVh(k0().e());
                            case 154:
                                return new HorizontalScrollableListVh(this, u4aVar, 0, Integer.valueOf(iah0.a(6)), 20);
                            case 155:
                                return new GroupCellVh(-1, 832, u4aVar.n(), u4aVar.c(), u4aVar.f(), u4aVar.g(), false);
                            case 156:
                                return new SearchStaticMapPreviewVh(u4aVar.c(), o0());
                            default:
                                return new GroupCellVh(0, 968, u4aVar.n(), u4aVar.c(), u4aVar.f(), u4aVar.g(), false);
                        }
                    }
                }
                return new GroupRedesignCardWithBottomBtnVh(u4aVar.o(), u4aVar.g(), u4aVar.f(), u4aVar.n());
            case 52:
                int i29 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i29 == 15) {
                    return new GroupsRedesignCollectionVh();
                }
                if (i29 != 66) {
                    return new GroupsCollectionVh(u4aVar.n(), u4aVar.f(), u4aVar.g());
                }
                return new EmptyVh();
            case 53:
                int i30 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i30 == 5) {
                    return new CommunitiesCategoryWithCollectionVh(aVar2.s, u4aVar.m(), u4aVar.e(), u4aVar.g(), n0(), u4aVar.f(), u4aVar.n());
                }
                if (i30 != 6) {
                    if (i30 == 8) {
                        return new CommunitiesCategoryVh(R.layout.catalog_communities_category_list_item, aVar2.s, u4aVar.m(), u4aVar.e(), u4aVar.g(), n0());
                    }
                    if (i30 != 30) {
                        return i30 != 40 ? u0(catalogViewType) : new CommunitiesCategoryVh(R.layout.catalog_communities_category_horizontal_item, aVar2.s, u4aVar.m(), u4aVar.e(), u4aVar.g(), n0());
                    }
                }
                return new CommunitiesCategoryVh(R.layout.catalog_communities_category_vertical_item, aVar2.s, u4aVar.m(), u4aVar.e(), u4aVar.g(), n0());
            case 54:
                return new GroupInviteVh();
            case 55:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 66 ? new ArtistInfoVh(u4aVar.b(), u4aVar.l(), u4aVar.g(), u4aVar.n(), aVar2.v, aVar2.r) : u0(catalogViewType);
            case 56:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 66 ? new CuratorInfoVh(u4aVar.l(), u4aVar.g(), u4aVar.n(), aVar2.v, aVar2.r) : u0(catalogViewType);
            case 57:
            case 58:
                int i31 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i31 == 6) {
                    return new SearchSliderSuggestionVh(bVar.a, u4aVar.g());
                }
                if (i31 != 8) {
                    return u0(catalogViewType);
                }
                SearchSuggestionCatalogViewStyle searchSuggestionCatalogViewStyle = catalogViewStyle instanceof SearchSuggestionCatalogViewStyle ? (SearchSuggestionCatalogViewStyle) catalogViewStyle : null;
                SearchSuggestion.Type zb2 = searchSuggestionCatalogViewStyle != null ? searchSuggestionCatalogViewStyle.zb() : null;
                switch (zb2 != null ? C0495a.$EnumSwitchMapping$4[zb2.ordinal()] : -1) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new SearchSuggestionVh(R.layout.catalog_common_list_search_hint_item, bVar.a, u4aVar.g());
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        return new MovieSearchSuggestionVh(fxc0.B().Y());
                }
            case 59:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 66 ? new MusicSpecialVh(this, u4aVar.m(), u4aVar.l()) : u0(catalogViewType);
            case 60:
            case 61:
            case 62:
            case 63:
                return u0(catalogViewType);
            case 64:
                int i32 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i32 != 8 ? (i32 == 9 || i32 == 40 || i32 == 41) ? new GroupChatVh(R.layout.catalog_group_chat_slider_item) : i32 != 153 ? u0(catalogViewType) : new PreviewVh(this, u4aVar.m()) : new GroupChatVh(R.layout.catalog_group_chat_list_item);
            case 65:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 8 ? new GroupCellVh(0, 1000, null, u4aVar.c(), u4aVar.f(), u4aVar.g(), false) : u0(catalogViewType);
            case 66:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 8 ? new GroupLikeRecentBusinessesVh(u4aVar.c(), u4aVar.g()) : u0(catalogViewType);
            case 67:
                int i33 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i33 != 5 ? i33 != 66 ? u0(catalogViewType) : new MusicSignalVh(u4aVar.l(), this, u4aVar.m(), u4aVar.g(), true, R.layout.catalog_music_signal) : new MusicSignalVh(u4aVar.l(), this, u4aVar.m(), u4aVar.g(), false, R.layout.catalog_music_signal_slider);
            case 68:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 143 ? new SearchSpellcheckVh(u4aVar.c(), u4aVar.g()) : u0(catalogViewType);
            case 69:
                int i34 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i34 != 6 ? i34 != 8 ? u0(catalogViewType) : new RadioStationCellVh(u4aVar.l(), k840.c.a(), u4aVar.g()) : new RadioStationVh(u4aVar.l(), k840.c.a(), u4aVar.g());
            case 70:
                int i35 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i35 != 5) {
                    if (i35 != 8) {
                        return i35 != 60 ? i35 != 61 ? u0(catalogViewType) : new MyShelfStartedListeningVh(u4aVar.l()) : new AudioBookListenedVh(u4aVar.l(), j0());
                    }
                    AudioBookListItemViewStyle audioBookListItemViewStyle = catalogViewStyle instanceof AudioBookListItemViewStyle ? (AudioBookListItemViewStyle) catalogViewStyle : null;
                    return (audioBookListItemViewStyle == null || !audioBookListItemViewStyle.zb()) ? new AudioBookCellVh(j0()) : new AudioBookOfflineVh(j0());
                }
                AudioBookSliderViewStyle audioBookSliderViewStyle = catalogViewStyle instanceof AudioBookSliderViewStyle ? (AudioBookSliderViewStyle) catalogViewStyle : null;
                if (audioBookSliderViewStyle != null) {
                    z5 = true;
                    if (audioBookSliderViewStyle.zb()) {
                        return new AudioBookOfflineSliderVh(j0());
                    }
                } else {
                    z5 = true;
                }
                return new ComposeAudioBookSliderVh(u4aVar.g(), j0(), audioBookSliderViewStyle != null && audioBookSliderViewStyle.Ab() == z5);
            case 71:
                int i36 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i36 != 157 ? i36 != 158 ? u0(catalogViewType) : f(catalogViewStyle, u4aVar) : Z(catalogViewStyle, u4aVar);
            case 72:
                TopshelfViewStyle topshelfViewStyle = catalogViewStyle instanceof TopshelfViewStyle ? (TopshelfViewStyle) catalogViewStyle : null;
                return new VideoTopshelfVh(u4aVar, (topshelfViewStyle != null ? topshelfViewStyle.zb() : null) == TopshelfViewStyle.Style.ChildProfile);
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 159 ? new MusicMixVideoTopshelfVh(u4aVar) : new EmptyVh();
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 160 ? m(catalogViewStyle) : new EmptyVh();
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                return C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 6 ? new EmptyVh() : new SearchFilterVh(u4aVar.c(), u4aVar.g());
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return d(u4aVar, ((AdChoiceComponent) ((k7m) m7m.f(this)).a(fpf0.a(AdChoiceComponent.class))).M3());
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return c0(u4aVar, ((AdChoiceComponent) ((k7m) m7m.f(this)).a(fpf0.a(AdChoiceComponent.class))).M3());
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                return new CatalogChannelViewHolder(u4aVar.c(), u4aVar.g());
            case 79:
                int i37 = C0495a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i37 == 6 || i37 == 144) {
                    return new CatalogMviVh(u4aVar.g(), u4aVar.f(), u4aVar.n(), catalogViewType == CatalogViewType.SLIDER ? CatalogBlockVariant.MoviePostersLegacySlider : CatalogBlockVariant.MoviePostersGrid, l0());
                }
                return u0(catalogViewType);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean w0() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean x0() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public boolean y() {
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public y7a z(lca lcaVar, CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType) {
        int i = C0495a.$EnumSwitchMapping$1[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i == 1) {
            return new y7a(lcaVar, 3);
        }
        if (i == 2) {
            return new y7a(lcaVar, 12);
        }
        if (i == 3) {
            return new y7a(lcaVar, 15);
        }
        throw new NoWhenBranchMatchedException();
    }
}
