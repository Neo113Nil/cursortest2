package com.vk.music.stats;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.stats.MusicActionTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bjc;
import xsna.uzp0;

/* compiled from: MusicSearchActionTracker.kt */
/* loaded from: classes3.dex */
public final class a implements MusicActionTracker {
    public final SearchStatsLoggingInfo a;

    /* compiled from: MusicSearchActionTracker.kt */
    /* renamed from: com.vk.music.stats.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1356a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicActionTracker.Action.values().length];
            try {
                iArr[MusicActionTracker.Action.MixAllTracks.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicActionTracker.Action.PlayAll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicActionTracker.Action.Download.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicActionTracker.Action.AddToMe.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MusicActionTracker.Action.RemoveFromMe.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MusicActionTracker.Action.ListenNext.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MusicActionTracker.Action.GoToArtist.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MusicActionTracker.Action.Share.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MusicActionTracker.Action.CopyLink.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MusicActionTracker.Action.Play.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MusicActionTracker.Action.Pause.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MusicActionTracker.Action.OpenAlbum.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MusicActionTracker.Action.ShowSimilar.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MusicActionTracker.Action.AddToPlaylist.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MusicActionTracker.Action.SetSleepTimer.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MusicActionTracker.Action.Broadcast.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MusicActionTracker.Action.Fave.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MusicActionTracker.Action.Unfave.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MusicActionTracker.Action.AddToStory.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicBottomSheetActionTracker.Action.values().length];
            try {
                iArr2[MusicBottomSheetActionTracker.Action.ListenNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.AddToMyMusic.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.RemoveFromMyMusic.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.GoToArtists.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.Download.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.Share.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.CopyLink.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.OpenAlbum.ordinal()] = 8;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.ShowSimilar.ordinal()] = 9;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.AddToPlaylist.ordinal()] = 10;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.SetSleepTimer.ordinal()] = 11;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.Broadcast.ordinal()] = 12;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.Fave.ordinal()] = 13;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.Unfave.ordinal()] = 14;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[MusicBottomSheetActionTracker.Action.AddToStory.ordinal()] = 15;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }

    @Override // com.vk.music.stats.MusicActionTracker
    public final void a(MusicActionTracker.Action action, MusicActionTracker.a aVar) {
        Pair pair;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action2;
        if (aVar instanceof MusicActionTracker.a.C1355a) {
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
            if (searchStatsLoggingInfo == null) {
                return;
            } else {
                pair = new Pair(searchStatsLoggingInfo.d, searchStatsLoggingInfo.f);
            }
        } else {
            if (!(aVar instanceof MusicActionTracker.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(SchemeStat$EventItem.Type.MUSIC, ((MusicActionTracker.a.b) aVar).a);
        }
        SchemeStat$EventItem.Type type = (SchemeStat$EventItem.Type) pair.d();
        String str = (String) pair.g();
        switch (C1356a.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.MIX_ALL_OUT;
                break;
            case 2:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL_OUT;
                break;
            case 3:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
                break;
            case 4:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT;
                break;
            case 5:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT;
                break;
            case 6:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LISTEN_NEXT_OUT;
                break;
            case 7:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
                break;
            case 8:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                break;
            case 9:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT;
                break;
            case 10:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_OUT;
                break;
            case 11:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE_OUT;
                break;
            case 12:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_ALBUM_OUT;
                break;
            case 13:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME_OUT;
                break;
            case 14:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST_OUT;
                break;
            case 15:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_SLEEP_OUT;
                break;
            case 16:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BROADCAST_OUT;
                break;
            case 17:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT;
                break;
            case 18:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT;
                break;
            case 19:
                action2 = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_STORY_OUT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action2, null, null, null, null, 30, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
