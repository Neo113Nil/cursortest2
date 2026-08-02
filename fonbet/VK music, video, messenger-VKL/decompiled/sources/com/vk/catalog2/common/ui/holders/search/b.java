package com.vk.catalog2.common.ui.holders.search;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.dto.ui.UIBlockAppContent;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.UIBlockSearchFilter;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchFilterAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchSuggestionAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.StickerAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.search.SearchSpellcheckAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchSpellcheck;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.games.CatalogMiniAppItem;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjc;
import xsna.oap;
import xsna.onh0;
import xsna.uzp0;
import xsna.xvh0;

/* compiled from: SearchAnalytics.kt */
/* loaded from: classes16.dex */
public final class b {
    public static final b a = new b();
    public static final onh0 b = new onh0();

    /* compiled from: SearchAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[GroupAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.Join.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.Leave.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.SendMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.ShowStory.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.OpenOwner.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FriendsAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.SendMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.AddToFriends.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.RemoveFromFriends.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.RemoveFromFollowers.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.Follow.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.Unfollow.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.ShowStory.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[FriendsAnalyticsInfo.ClickTarget.Call.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SearchSuggestionAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr3[SearchSuggestionAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[SearchSuggestionAnalyticsInfo.ClickTarget.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SearchSpellcheckAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr4[SearchSpellcheckAnalyticsInfo.ClickTarget.Tap.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[SearchFilterAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr5[SearchFilterAnalyticsInfo.ClickTarget.Tap.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[StickerAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr6[StickerAnalyticsInfo.ClickTarget.Tap.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[SearchEntityAnswerAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.Tap.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.ShowStory.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.Join.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.Leave.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.Follow.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.Unfollow.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.Pause.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[SearchEntityAnswerAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 8;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Share.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.AddToMe.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.RemoveFromMe.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.OpenMusician.ordinal()] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Download.ordinal()] = 6;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.CopyLink.ordinal()] = 7;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.ListenNext.ordinal()] = 8;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 9;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Pause.ordinal()] = 10;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.OpenAlbum.ordinal()] = 11;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.ShowSimilar.ordinal()] = 12;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.AddToPlaylist.ordinal()] = 13;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.SetSleepTimer.ordinal()] = 14;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Broadcast.ordinal()] = 15;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Fave.ordinal()] = 16;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Unfave.ordinal()] = 17;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.AddToStory.ordinal()] = 18;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 19;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.PauseAll.ordinal()] = 20;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Subscribe.ordinal()] = 21;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Unsubscribe.ordinal()] = 22;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.LongTap.ordinal()] = 23;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.ShowSimilarSerp.ordinal()] = 24;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.Menu.ordinal()] = 25;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[MusicAnalyticsInfo.ClickTarget.None.ordinal()] = 26;
            } catch (NoSuchFieldError unused54) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[SearchAuthorAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.Subscribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.Unsubscribe.ordinal()] = 3;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.SendMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.SetNotificationAll.ordinal()] = 5;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.SetNotificationPreferred.ordinal()] = 6;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.SetNotificationNone.ordinal()] = 7;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr9[SearchAuthorAnalyticsInfo.ClickTarget.CancelUnsubscribe.ordinal()] = 8;
            } catch (NoSuchFieldError unused62) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[VideoAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.ShowAuthor.ordinal()] = 2;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Like.ordinal()] = 3;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Unlike.ordinal()] = 4;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Fave.ordinal()] = 5;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Unfave.ordinal()] = 6;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Download.ordinal()] = 7;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.AddToMe.ordinal()] = 8;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.RemoveFromMe.ordinal()] = 9;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.RemoveSeen.ordinal()] = 10;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.CopyLink.ordinal()] = 11;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.Share.ordinal()] = 12;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.AddToPlaylist.ordinal()] = 13;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.NotInterested.ordinal()] = 14;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.ExtendEpisodes.ordinal()] = 15;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr10[VideoAnalyticsInfo.ClickTarget.OpenEpisodes.ordinal()] = 16;
            } catch (NoSuchFieldError unused78) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[VideoAlbumAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.ShowAuthor.ordinal()] = 2;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 3;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.Subscribe.ordinal()] = 4;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.Unsubscribe.ordinal()] = 5;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.CopyLink.ordinal()] = 6;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.CancelUnsubscribe.ordinal()] = 7;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.Share.ordinal()] = 8;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.ExpandVideos.ordinal()] = 9;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr11[VideoAlbumAnalyticsInfo.ClickTarget.CollapseVideos.ordinal()] = 10;
            } catch (NoSuchFieldError unused88) {
            }
            $EnumSwitchMapping$10 = iArr11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(b bVar, UIBlock uIBlock, Object obj, boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        MusicAnalyticsInfo.ClickTarget clickTarget;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2;
        SchemeStat$EventItem.Type type;
        boolean z2 = (i & 4) != 0 ? false : z;
        boolean z3 = (i & 8) != 0;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = (i & 16) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen;
        bVar.getClass();
        boolean z4 = uIBlock instanceof UIBlockGroup;
        if (z4) {
            GroupAnalyticsInfo groupAnalyticsInfo = obj instanceof GroupAnalyticsInfo ? (GroupAnalyticsInfo) obj : null;
            GroupAnalyticsInfo.ClickTarget clickTarget2 = groupAnalyticsInfo != null ? groupAnalyticsInfo.a : null;
            switch (clickTarget2 != null ? a.$EnumSwitchMapping$0[clickTarget2.ordinal()] : -1) {
                case 1:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                    action2 = action;
                    break;
                case 2:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.JOIN_GROUP;
                    action2 = action;
                    break;
                case 3:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LEAVE_GROUP;
                    action2 = action;
                    break;
                case 4:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE;
                    action2 = action;
                    break;
                case 5:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES;
                    action2 = action;
                    break;
                case 6:
                    action = z2 ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER;
                    action2 = action;
                    break;
                default:
                    action2 = null;
                    break;
            }
        } else if (uIBlock instanceof UIBlockProfile) {
            FriendsAnalyticsInfo friendsAnalyticsInfo = obj instanceof FriendsAnalyticsInfo ? (FriendsAnalyticsInfo) obj : null;
            FriendsAnalyticsInfo.ClickTarget clickTarget3 = friendsAnalyticsInfo != null ? friendsAnalyticsInfo.a : null;
            switch (clickTarget3 != null ? a.$EnumSwitchMapping$1[clickTarget3.ordinal()] : -1) {
                case 1:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                    action2 = action;
                    break;
                case 2:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE;
                    action2 = action;
                    break;
                case 3:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_FRIEND;
                    action2 = action;
                    break;
                case 4:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FRIEND;
                    action2 = action;
                    break;
                case 5:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_SUBSCRIBER;
                    action2 = action;
                    break;
                case 6:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                    action2 = action;
                    break;
                case 7:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE;
                    action2 = action;
                    break;
                case 8:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES;
                    action2 = action;
                    break;
                case 9:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL;
                    action2 = action;
                    break;
            }
        } else {
            if (uIBlock instanceof UIBlockMarketItem) {
                action = obj instanceof UIBlockMarketItem.b ? ((UIBlockMarketItem.b) obj).a.X() ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
            } else if (uIBlock instanceof UIBlockSearchSuggestion) {
                SearchSuggestionAnalyticsInfo searchSuggestionAnalyticsInfo = obj instanceof SearchSuggestionAnalyticsInfo ? (SearchSuggestionAnalyticsInfo) obj : null;
                SearchSuggestionAnalyticsInfo.ClickTarget clickTarget4 = searchSuggestionAnalyticsInfo != null ? searchSuggestionAnalyticsInfo.a : null;
                int i2 = clickTarget4 != null ? a.$EnumSwitchMapping$2[clickTarget4.ordinal()] : -1;
                if (i2 != 1) {
                    if (i2 == 2) {
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT;
                    }
                    action2 = null;
                } else {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                }
            } else if ((uIBlock instanceof UIBlockVideo) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryVideo)) {
                VideoAnalyticsInfo videoAnalyticsInfo = obj instanceof VideoAnalyticsInfo ? (VideoAnalyticsInfo) obj : null;
                VideoAnalyticsInfo.ClickTarget clickTarget5 = videoAnalyticsInfo != null ? videoAnalyticsInfo.a : null;
                switch (clickTarget5 != null ? a.$EnumSwitchMapping$9[clickTarget5.ordinal()] : -1) {
                    case -1:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                        break;
                    case 2:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
                            break;
                        }
                    case 3:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE_OUT;
                            break;
                        }
                    case 4:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE_OUT;
                            break;
                        }
                    case 5:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT;
                            break;
                        }
                    case 6:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT;
                            break;
                        }
                    case 7:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
                            break;
                        }
                    case 8:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT;
                            break;
                        }
                    case 9:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT;
                            break;
                        }
                    case 10:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT;
                        break;
                    case 11:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT;
                            break;
                        }
                    case 12:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                            break;
                        }
                    case 13:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST_OUT;
                            break;
                        }
                    case 14:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.NOT_INTERESTED;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.NOT_INTERESTED_OUT;
                            break;
                        }
                    case 15:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.EXTEND_EPISODES;
                        break;
                    case 16:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_EPISODES;
                        break;
                }
            } else if (uIBlock instanceof UIBlockVideoAlbum) {
                VideoAlbumAnalyticsInfo videoAlbumAnalyticsInfo = obj instanceof VideoAlbumAnalyticsInfo ? (VideoAlbumAnalyticsInfo) obj : null;
                VideoAlbumAnalyticsInfo.ClickTarget clickTarget6 = videoAlbumAnalyticsInfo != null ? videoAlbumAnalyticsInfo.a : null;
                switch (clickTarget6 != null ? a.$EnumSwitchMapping$10[clickTarget6.ordinal()] : -1) {
                    case -1:
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                        break;
                    case 2:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
                            break;
                        }
                    case 3:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL_OUT;
                            break;
                        }
                    case 4:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT;
                            break;
                        }
                    case 5:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT;
                            break;
                        }
                    case 6:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT;
                            break;
                        }
                    case 7:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT;
                            break;
                        }
                    case 8:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                            break;
                        }
                    case 9:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.VIDEO_PLAYLIST_EXPAND;
                        break;
                    case 10:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.VIDEO_PLAYLIST_COLLAPSE;
                        break;
                }
            } else if ((uIBlock instanceof UIBlockSearchAuthor) || (uIBlock instanceof UIBlockActionFollow)) {
                SearchAuthorAnalyticsInfo searchAuthorAnalyticsInfo = obj instanceof SearchAuthorAnalyticsInfo ? (SearchAuthorAnalyticsInfo) obj : null;
                SearchAuthorAnalyticsInfo.ClickTarget clickTarget7 = searchAuthorAnalyticsInfo != null ? searchAuthorAnalyticsInfo.a : null;
                switch (clickTarget7 != null ? a.$EnumSwitchMapping$8[clickTarget7.ordinal()] : -1) {
                    case -1:
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                        break;
                    case 2:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT;
                            break;
                        }
                    case 3:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT;
                            break;
                        }
                    case 4:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
                            break;
                        }
                    case 5:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_ALL;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_ALL_OUT;
                            break;
                        }
                    case 6:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_USEFUL;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_USEFUL_OUT;
                            break;
                        }
                    case 7:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_NO_NOTIFY;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_NO_NOTIFY_OUT;
                            break;
                        }
                    case 8:
                        if (!z2) {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                            break;
                        } else {
                            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT;
                            break;
                        }
                }
            } else if (uIBlock instanceof UIBlockActionOpenSearchTab) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_SHOW_ALL;
            } else if (uIBlock instanceof UIBlockActionOpenSection) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_SHOW_ALL;
            } else if ((uIBlock instanceof UIBlockMusicTrack) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack) || (uIBlock instanceof UIBlockMusicArtist) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryArtist) || (uIBlock instanceof UIBlockMusicCurator) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryPodcast) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryAudioBook) || (uIBlock instanceof UIBlockMusicPlaylist) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) || (uIBlock instanceof UIBlockRadioStation) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation)) {
                MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
                if (musicAnalyticsInfo != null && (clickTarget = musicAnalyticsInfo.a) != null) {
                    if (!z2) {
                        switch (a.$EnumSwitchMapping$7[clickTarget.ordinal()]) {
                            case -1:
                            case 14:
                            case 20:
                            case 25:
                            case 26:
                                break;
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                                break;
                            case 2:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE;
                                break;
                            case 3:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME;
                                break;
                            case 4:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME;
                                break;
                            case 5:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER;
                                break;
                            case 6:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD;
                                break;
                            case 7:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK;
                                break;
                            case 8:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LISTEN_NEXT;
                                break;
                            case 9:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY;
                                break;
                            case 10:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE;
                                break;
                            case 11:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_ALBUM;
                                break;
                            case 12:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME;
                                break;
                            case 13:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST;
                                break;
                            case 15:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BROADCAST;
                                break;
                            case 16:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE;
                                break;
                            case 17:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE;
                                break;
                            case 18:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_STORY;
                                break;
                            case 19:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL;
                                break;
                            case 21:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                                break;
                            case 22:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE;
                                break;
                            case 23:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                                break;
                            case 24:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME_SERP;
                                break;
                        }
                    } else {
                        switch (a.$EnumSwitchMapping$7[clickTarget.ordinal()]) {
                            case -1:
                            case 24:
                            case 25:
                            case 26:
                                break;
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                                break;
                            case 2:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                                break;
                            case 3:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT;
                                break;
                            case 4:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT;
                                break;
                            case 5:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
                                break;
                            case 6:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
                                break;
                            case 7:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT;
                                break;
                            case 8:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LISTEN_NEXT_OUT;
                                break;
                            case 9:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_OUT;
                                break;
                            case 10:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE_OUT;
                                break;
                            case 11:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_ALBUM_OUT;
                                break;
                            case 12:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME_OUT;
                                break;
                            case 13:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST_OUT;
                                break;
                            case 14:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_SLEEP_OUT;
                                break;
                            case 15:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BROADCAST_OUT;
                                break;
                            case 16:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT;
                                break;
                            case 17:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT;
                                break;
                            case 18:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_STORY_OUT;
                                break;
                            case 19:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL_OUT;
                                break;
                            case 20:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE_ALL_OUT;
                                break;
                            case 21:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT;
                                break;
                            case 22:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT;
                                break;
                            case 23:
                                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LONG_TAP;
                                break;
                        }
                    }
                }
                action2 = null;
            } else if (uIBlock instanceof UIBlockSearchSpellcheck) {
                SearchSpellcheckAnalyticsInfo searchSpellcheckAnalyticsInfo = obj instanceof SearchSpellcheckAnalyticsInfo ? (SearchSpellcheckAnalyticsInfo) obj : null;
                SearchSpellcheckAnalyticsInfo.ClickTarget clickTarget8 = searchSpellcheckAnalyticsInfo != null ? searchSpellcheckAnalyticsInfo.a : null;
                if ((clickTarget8 != null ? a.$EnumSwitchMapping$3[clickTarget8.ordinal()] : -1) == 1) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                }
                action2 = null;
            } else if (uIBlock instanceof UIBlockSearchFilter) {
                SearchFilterAnalyticsInfo searchFilterAnalyticsInfo = obj instanceof SearchFilterAnalyticsInfo ? (SearchFilterAnalyticsInfo) obj : null;
                SearchFilterAnalyticsInfo.ClickTarget clickTarget9 = searchFilterAnalyticsInfo != null ? searchFilterAnalyticsInfo.a : null;
                if ((clickTarget9 != null ? a.$EnumSwitchMapping$4[clickTarget9.ordinal()] : -1) == 1) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CLOSE_FILTER;
                }
                action2 = null;
            } else if ((uIBlock instanceof UIBlockStickerPack) || (uIBlock instanceof UIBlockStickerPackPreview)) {
                StickerAnalyticsInfo stickerAnalyticsInfo = obj instanceof StickerAnalyticsInfo ? (StickerAnalyticsInfo) obj : null;
                StickerAnalyticsInfo.ClickTarget clickTarget10 = stickerAnalyticsInfo != null ? stickerAnalyticsInfo.a : null;
                if ((clickTarget10 != null ? a.$EnumSwitchMapping$5[clickTarget10.ordinal()] : -1) == 1) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                }
                action2 = null;
            } else if (uIBlock instanceof UIBlockActionClearRecent) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT;
            } else if (uIBlock instanceof UIBlockAppContent) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
            } else if ((uIBlock instanceof UIBlockSearchEntityPerson) || (uIBlock instanceof UIBlockSearchEntityVideoPlaylist)) {
                SearchEntityAnswerAnalyticsInfo searchEntityAnswerAnalyticsInfo = obj instanceof SearchEntityAnswerAnalyticsInfo ? (SearchEntityAnswerAnalyticsInfo) obj : null;
                SearchEntityAnswerAnalyticsInfo.ClickTarget clickTarget11 = searchEntityAnswerAnalyticsInfo != null ? searchEntityAnswerAnalyticsInfo.a : null;
                switch (clickTarget11 != null ? a.$EnumSwitchMapping$6[clickTarget11.ordinal()] : -1) {
                    case 1:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                        break;
                    case 2:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES;
                        break;
                    case 3:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.JOIN_GROUP;
                        break;
                    case 4:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LEAVE_GROUP;
                        break;
                    case 5:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
                        break;
                    case 6:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE;
                        break;
                    case 7:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE;
                        break;
                    case 8:
                        action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL;
                        break;
                }
            } else {
                action = ((uIBlock instanceof UIBlockActionExpandBlock) || (uIBlock instanceof UIBlockActionSwitchSection) || (uIBlock instanceof UIBlockActionOpenUrl)) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_SHOW_ALL : uIBlock instanceof UIBlockTitleSubtitleAvatar ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
            }
            action2 = action;
        }
        if (action2 == null) {
            return;
        }
        if (z3) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen2 = UiTracker.c();
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen2 = null;
        }
        String str = obj instanceof VideoAlbumAnalyticsInfo ? ((VideoAlbumAnalyticsInfo) obj).b : obj instanceof xvh0 ? ((xvh0) obj).a : null;
        MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem = new MobileOfficialAppsSearchStat$TypeSearchClickItem(action2, null, null, null, mobileOfficialAppsCoreNavStat$EventScreen2, 14, null);
        if (z4) {
            type = SchemeStat$EventItem.Type.GROUP;
        } else if (uIBlock instanceof UIBlockLink) {
            type = SchemeStat$EventItem.Type.LINK;
        } else if (uIBlock instanceof UIBlockProfile) {
            type = SchemeStat$EventItem.Type.USER;
        } else if (uIBlock instanceof UIBlockApp) {
            CatalogMiniAppItem catalogMiniAppItem = ((UIBlockApp) uIBlock).z;
            type = (catalogMiniAppItem != null ? catalogMiniAppItem.d : null) == CatalogMiniAppItem.AppType.GAME ? SchemeStat$EventItem.Type.GAME : SchemeStat$EventItem.Type.MINI_APP;
        } else if (uIBlock instanceof UIBlockAppContent) {
            type = SchemeStat$EventItem.Type.MINI_APP;
        } else if (uIBlock instanceof UIBlockVideo) {
            type = ((UIBlockVideo) uIBlock).B.C2() ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.VIDEO;
        } else if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryVideo) {
            type = ((UIBlockSearchHistory.UIBlockSearchHistoryVideo) uIBlock).A.C2() ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.VIDEO;
        } else if (uIBlock instanceof UIBlockVideoAlbum) {
            type = SchemeStat$EventItem.Type.VIDEO_PLAYLIST;
        } else if (uIBlock instanceof UIBlockMarketItem) {
            type = SchemeStat$EventItem.Type.MARKET_ITEM;
        } else if (uIBlock instanceof UIBlockSearchSuggestion) {
            type = SchemeStat$EventItem.Type.SEARCH_SUGGESTION;
        } else if ((uIBlock instanceof UIBlockSearchAuthor) || (uIBlock instanceof UIBlockActionFollow)) {
            type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
        } else if (uIBlock instanceof UIBlockActionOpenSearchTab) {
            type = SchemeStat$EventItem.Type.CATALOG_ITEM;
        } else if ((uIBlock instanceof UIBlockActionOpenSection) || (uIBlock instanceof UIBlockActionOpenUrl)) {
            type = SchemeStat$EventItem.Type.CATALOG_ITEM;
        } else if ((uIBlock instanceof UIBlockMusicTrack) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack)) {
            type = SchemeStat$EventItem.Type.MUSIC;
        } else if (uIBlock instanceof UIBlockMusicPlaylist) {
            type = ((UIBlockMusicPlaylist) uIBlock).z.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST;
        } else if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) {
            type = ((UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) uIBlock).A.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST;
        } else if (uIBlock instanceof UIBlockMusicCurator) {
            type = SchemeStat$EventItem.Type.MUSIC_CURATOR;
        } else if (uIBlock instanceof UIBlockMusicArtist) {
            type = SchemeStat$EventItem.Type.ARTIST;
        } else if ((uIBlock instanceof UIBlockStickerPack) || (uIBlock instanceof UIBlockStickerPackPreview)) {
            type = SchemeStat$EventItem.Type.STICKERS;
        } else if (uIBlock instanceof UIBlockSearchEntityPerson) {
            oap<UserProfile, Group> oapVar = ((UIBlockSearchEntityPerson) uIBlock).C;
            if (oapVar instanceof oap.b) {
                type = SchemeStat$EventItem.Type.GROUP;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                type = SchemeStat$EventItem.Type.USER;
            }
        } else {
            type = ((uIBlock instanceof UIBlockRadioStation) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation)) ? SchemeStat$EventItem.Type.RADIO : ((uIBlock instanceof UIBlockSearchEntityVideoPlaylist) || (uIBlock instanceof UIBlockTitleSubtitleAvatar)) ? SchemeStat$EventItem.Type.VIDEO_PLAYLIST : uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryArtist ? SchemeStat$EventItem.Type.ARTIST : uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryPodcast ? SchemeStat$EventItem.Type.PODCAST : uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryAudioBook ? SchemeStat$EventItem.Type.CATALOG_ITEM : SchemeStat$EventItem.Type.CATALOG_ITEM;
        }
        SchemeStat$EventItem.Type type2 = type;
        if (str == null) {
            str = b.e(uIBlock);
        }
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type2, null, null, null, str, null, 46, null), mobileOfficialAppsSearchStat$TypeSearchClickItem, 2);
        if (mobileOfficialAppsCoreNavStat$EventScreen3 != null) {
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(mobileOfficialAppsCoreNavStat$EventScreen3, b2, uzp0Var.a).q();
        } else {
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var2 = UiTracker.h;
            uzp0Var2.getClass();
            new bjc(c, b2, uzp0Var2.a).q();
        }
    }

    public static void b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, String str) {
        UiTracker uiTracker = UiTracker.a;
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, UiTracker.c(), 14, null), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    public static void c(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, String str) {
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }
}
