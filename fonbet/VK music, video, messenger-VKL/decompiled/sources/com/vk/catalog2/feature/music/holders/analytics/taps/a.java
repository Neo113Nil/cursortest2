package com.vk.catalog2.feature.music.holders.analytics.taps;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.holders.analytics.taps.MusicAnalyticTapsLinkName;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import java.util.Iterator;
import xsna.epx;
import xsna.ud40;
import xsna.w950;

/* compiled from: LinksTapsHandler.kt */
/* loaded from: classes16.dex */
public final class a implements ud40 {
    public final w950 a;

    /* compiled from: LinksTapsHandler.kt */
    /* renamed from: com.vk.catalog2.feature.music.holders.analytics.taps.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0521a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.ENTITY_DOUBLE_GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.FEATURED_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicAnalyticTapsLinkName.values().length];
            try {
                iArr2[MusicAnalyticTapsLinkName.COLLECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MusicAnalyticTapsLinkName.RECENT_TRACKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MusicAnalyticTapsLinkName.RECENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ContentType.values().length];
            try {
                iArr3[ContentType.AUDIO_PLAYLISTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ContentType.AUDIO_PODCASTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ContentType.AUDIO_ALBUMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ContentType.AUDIO_RECENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ContentType.AUDIO_AUDIOBOOKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ContentType.AUDIO_RADIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ContentType.AUDIO_FOLLOWINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ContentType.AUDIO_OFFLINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ContentType.AUDIO_KIDS.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public a(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        CommonAudioStat$TypeAudioUiClickItem.EventType eventType;
        Object obj2;
        CommonAudioStat$TypeAudioUiClickItem.EventType eventType2;
        String str = uIBlock.b;
        int i = C0521a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        w950 w950Var = this.a;
        if (i == 1 || i == 2) {
            if ((obj instanceof ContentType) && (uIBlock instanceof UIBlockLink)) {
                MusicAnalyticTapsLinkName.a aVar = MusicAnalyticTapsLinkName.Companion;
                String str2 = ((UIBlockLink) uIBlock).y.m;
                aVar.getClass();
                MusicAnalyticTapsLinkName musicAnalyticTapsLinkName = null;
                try {
                    Iterator<E> it = MusicAnalyticTapsLinkName.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (epx.f(((MusicAnalyticTapsLinkName) obj2).i(), str2)) {
                                break;
                            }
                        }
                    }
                    musicAnalyticTapsLinkName = (MusicAnalyticTapsLinkName) obj2;
                } catch (Exception unused) {
                }
                int i2 = C0521a.$EnumSwitchMapping$2[((ContentType) obj).ordinal()];
                if (i2 == 1) {
                    int i3 = musicAnalyticTapsLinkName != null ? C0521a.$EnumSwitchMapping$1[musicAnalyticTapsLinkName.ordinal()] : -1;
                    eventType = i3 != 1 ? i3 != 2 ? i3 != 3 ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PLAYLIST : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PLAYLIST_RECENT : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PLAYLIST_RECENT_TRACKS : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PLAYLIST_COLLECTION;
                } else if (i2 == 2) {
                    eventType = (musicAnalyticTapsLinkName != null ? C0521a.$EnumSwitchMapping$1[musicAnalyticTapsLinkName.ordinal()] : -1) == 3 ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PODCAST_RECENT : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO;
                } else if (i2 != 3) {
                    eventType = (i2 == 4 || i2 == 5) ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO;
                } else {
                    eventType = (musicAnalyticTapsLinkName != null ? C0521a.$EnumSwitchMapping$1[musicAnalyticTapsLinkName.ordinal()] : -1) == 3 ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_ALBUM_RECENT : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO;
                }
                w950Var.J(str, eventType);
                w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                return;
            }
            return;
        }
        if (i == 3 && (obj instanceof ContentType) && (uIBlock instanceof UIBlockLink)) {
            switch (C0521a.$EnumSwitchMapping$2[((ContentType) obj).ordinal()]) {
                case 1:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_PLAYLIST;
                    break;
                case 2:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_PODCATS;
                    break;
                case 3:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_ALBUMS;
                    break;
                case 4:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_RECENT_TRACKS;
                    break;
                case 5:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_AUDIO_BOOKS;
                    break;
                case 6:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_RADIO;
                    break;
                case 7:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_ARTIST_AND_CURATOR;
                    break;
                case 8:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_DOWNLOADED;
                    break;
                case 9:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_MORE_KIDS;
                    break;
                default:
                    eventType2 = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO;
                    break;
            }
            w950Var.m(str, eventType2);
            w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        }
    }
}
