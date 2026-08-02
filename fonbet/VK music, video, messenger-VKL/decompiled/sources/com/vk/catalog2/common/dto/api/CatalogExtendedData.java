package com.vk.catalog2.common.dto.api;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.channel.CatalogChannel;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategoryMappings;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.market.MarketInfo;
import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;
import com.vk.catalog2.common.dto.api.music.CatalogAudioStreamMix;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.music.MusicSignalInfo;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.news.CatalogNewsEntry;
import com.vk.catalog2.common.dto.api.poll.UxPollData;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.catalog2.common.dto.api.sport.CatalogSportMatch;
import com.vk.catalog2.common.dto.api.video.CatalogAiAssistantItem;
import com.vk.catalog2.common.dto.api.video.CatalogMovieItem;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.catalog2.common.dto.api.video.TopshelfItem;
import com.vk.catalog2.common.dto.api.video.musicvideo.VideoMusicStreamMixItem;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.AdBlockItem;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupChat;
import com.vk.dto.group.GroupCollection;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.group.GroupsCategory;
import com.vk.dto.music.Artist;
import com.vk.dto.music.AudioFollowingsUpdateInfo;
import com.vk.dto.music.AudioFollowingsUpdateItem;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistRecommendationData;
import com.vk.dto.music.RecommendedPlaylist;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.search.SearchFilterItem;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.LiveCategory;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoAlbumExtendedInfo;
import com.vk.log.L;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.aja;
import xsna.d3r;
import xsna.d5a;
import xsna.e5a;
import xsna.ec;
import xsna.epx;
import xsna.f5a;
import xsna.fkq0;
import xsna.fqe0;
import xsna.fw3;
import xsna.g53;
import xsna.g5a;
import xsna.h5a;
import xsna.i5a;
import xsna.izs;
import xsna.j5g;
import xsna.jgp;
import xsna.lba;
import xsna.ms9;
import xsna.mz;
import xsna.on00;
import xsna.pn00;
import xsna.rba;
import xsna.rd1;
import xsna.rl3;
import xsna.rli0;
import xsna.s3q0;
import xsna.tj5;
import xsna.tsj;
import xsna.uw4;
import xsna.v11;
import xsna.vp70;
import xsna.w490;
import xsna.w8;
import xsna.x490;
import xsna.y8;
import xsna.zcl;

/* compiled from: CatalogExtendedData.kt */
/* loaded from: classes16.dex */
public final class CatalogExtendedData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogExtendedData> CREATOR = new i1();
    public final Map<String, GroupChat> A;
    public final Map<String, Good> B;
    public final Map<String, CatalogMarketGroupInfo> C;
    public final Map<String, CatalogNavigationTab> D;
    public final Map<String, Curator> E;
    public final Map<String, CatalogText> F;
    public final Map<String, GroupLikes> G;
    public final Map<String, CatalogHint> H;
    public final Map<String, Article> I;
    public final Map<String, FriendsLikedEpisode> J;
    public final Map<String, PodcastSliderItem> K;
    public final Map<String, CatalogClassifiedYoulaCity> L;
    public final Map<String, CatalogMarketCategory> M;
    public final List<CatalogMarketCategoryMappings> N;
    public final Map<String, MusicSignalInfo> O;
    public final Map<String, MarketInfo> P;
    public final Map<String, CatalogSearchSpellcheckResult> Q;
    public final Map<String, Podcast> R;
    public final Map<String, OfflinePodcast> S;
    public final Map<String, ExtendedPodcast> T;
    public final Map<String, GroupCollection> U;
    public final Map<String, RadioStation> V;
    public final Map<String, AudioBook> W;
    public final Map<String, ApiApplication> X;
    public final Map<String, GroupsCategory> Y;
    public final Map<String, CatalogNewsEntry> Z;
    public final Map<String, CatalogNewsEntry> a0;
    public final Map<String, UserProfile> b;
    public final Map<String, CatalogSearchEntityAnswer> b0;
    public final Map<String, Group> c;
    public final Map<String, CatalogAudioStreamMix> c0;
    public final Map<String, ApiApplication> d;
    public final Map<String, QuestionnaireDto> d0;
    public final Map<String, VideoFile> e;
    public final Map<String, AudioBookPerson> e0;
    public final Map<String, CatalogVideo> f;
    public final Map<String, CatalogAudioContentCard> f0;
    public final Map<String, TopshelfItem> g;
    public final Map<String, SearchFilterItem> g0;
    public final Map<String, ShowcaseListItem> h;
    public final Map<String, CatalogConcertItem> h0;
    public final Map<String, VideoAlbum> i;
    public final Map<String, LiveCategory> i0;
    public final Map<String, Playlist> j;
    public final Map<String, VideoMusicStreamMixItem> j0;
    public final Map<String, RecommendedPlaylist> k;
    public final Map<String, AdBlockItem> k0;
    public final Map<String, AudioFollowingsUpdateInfo> l;
    public final Map<String, CatalogChannel> l0;
    public final Map<String, AudioFollowingsUpdateItem> m;
    public final Map<String, CatalogSportMatch> m0;
    public final Map<String, MusicOwner> n;
    public final Map<String, CatalogAiAssistantItem> n0;
    public final Map<String, MusicTrack> o;
    public final Map<String, CatalogMovieItem> o0;
    public final Map<String, SearchSuggestion> p;
    public final List<UxPollData> p0;
    public final Map<String, CatalogLink> q;
    public final com.vk.catalog2.common.dto.api.hint.a q0;
    public final Map<String, CatalogUserMeta> r;
    public final Map<String, Artist> s;
    public final Map<String, StickerStockItem> t;
    public final Map<String, StickerPackPreview> u;
    public final Map<String, StickerStockItem> v;
    public final Map<String, Banner> w;
    public final Map<String, StickersInfo> x;
    public final Map<String, Thumb> y;
    public final Map<String, CatalogStateInfo> z;

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class a extends PropertyReference1Impl {
        public static final a b = new a(CatalogAudioContentCard.class, "fullId", "getFullId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogAudioContentCard) obj).Ab();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class a0 extends PropertyReference1Impl {
        public static final a0 b = new a0(CatalogMarketCategory.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((CatalogMarketCategory) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class a1 extends PropertyReference1Impl {
        public static final a1 b = new a1(CatalogNewsEntry.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogNewsEntry) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class b extends PropertyReference1Impl {
        public static final b b = new b(AudioFollowingsUpdateInfo.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((AudioFollowingsUpdateInfo) obj).c;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class b0 extends PropertyReference1Impl {
        public static final b0 b = new b0(MusicSignalInfo.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((MusicSignalInfo) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class b1 extends PropertyReference1Impl {
        public static final b1 b = new b1(CatalogNewsEntry.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogNewsEntry) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class c extends PropertyReference1Impl {
        public static final c b = new c(AudioFollowingsUpdateItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((AudioFollowingsUpdateItem) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class c0 extends PropertyReference1Impl {
        public static final c0 b = new c0(CatalogSearchSpellcheckResult.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogSearchSpellcheckResult) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class c1 extends PropertyReference1Impl {
        public static final c1 b = new c1(VideoFile.class, "videoId", "getVideoId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((VideoFile) obj).a1();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class d extends PropertyReference1Impl {
        public static final d b = new d(MusicOwner.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((MusicOwner) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class d0 extends PropertyReference1Impl {
        public static final d0 b = new d0(Podcast.class, "fullId", "getFullId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((Podcast) obj).e();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class d1 extends PropertyReference1Impl {
        public static final d1 b = new d1(VideoFile.class, "videoId", "getVideoId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((VideoFile) obj).a1();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class e extends PropertyReference1Impl {
        public static final e b = new e(CatalogLink.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogLink) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class e0 extends PropertyReference1Impl {
        public static final e0 b = new e0(OfflinePodcast.class, "fullId", "getFullId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((OfflinePodcast) obj).b.e();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class e1 extends FunctionReferenceImpl implements izs<Playlist, String> {
        public static final e1 b = new e1(1, Playlist.class, "pid", "pid()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(Playlist playlist) {
            return playlist.Ib();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class f extends PropertyReference1Impl {
        public static final f b = new f(CatalogUserMeta.class, "itemId", "getItemId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogUserMeta) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class f0 extends PropertyReference1Impl {
        public static final f0 b = new f0(ExtendedPodcast.class, "fullId", "getFullId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            StringBuilder sb = new StringBuilder();
            Podcast podcast = ((ExtendedPodcast) obj).f;
            sb.append(podcast.c);
            sb.append('_');
            sb.append(podcast.b);
            return sb.toString();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class f1 extends FunctionReferenceImpl implements izs<RecommendedPlaylist, String> {
        public static final f1 b = new f1(1, RecommendedPlaylist.class, "pid", "pid()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(RecommendedPlaylist recommendedPlaylist) {
            return recommendedPlaylist.zb();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class g extends MutablePropertyReference1Impl {
        public static final g b = new g(Artist.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((Artist) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class g0 extends MutablePropertyReference1Impl {
        public static final g0 b = new g0(ApiApplication.class, "id", "getId()Lcom/vk/dto/common/id/UserId;", 0);

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ApiApplication) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final class g1 {

        /* compiled from: CatalogExtendedData.kt */
        public static final class a<T> {
            public final JSONObject a;
            public final aay<T> b;
            public String c = "";

            public a(JSONObject jSONObject, aay<T> aayVar) {
                this.a = jSONObject;
                this.b = aayVar;
            }

            public final void a(Map map, izs izsVar) {
                ArrayList arrayList;
                String str = this.c;
                aay<T> aayVar = this.b;
                JSONArray optJSONArray = this.a.optJSONArray(str);
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            try {
                                T a = aayVar.a(optJSONObject);
                                if (a != null) {
                                    arrayList.add(a);
                                }
                            } catch (Exception e) {
                                L.i(e);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    for (T t : arrayList) {
                        map.put(izsVar.invoke(t), t);
                    }
                }
            }
        }

        public static final void a(JSONObject jSONObject, aay aayVar, String str, Map map, izs izsVar) {
            Serializer.c<CatalogExtendedData> cVar = CatalogExtendedData.CREATOR;
            a aVar = new a(jSONObject, aayVar);
            aVar.c = str;
            aVar.a(map, new tj5(izsVar, 2));
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class h extends PropertyReference1Impl {
        public static final h b = new h(Banner.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((Banner) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class h0 extends PropertyReference1Impl {
        public static final h0 b = new h0(GroupCollection.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((GroupCollection) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class h1 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_INVITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_STICKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_OWNERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MINIAPPS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GAMES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PODCAST_SLIDER_ITEMS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_OWNERS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_RECENT_BUSINESSES.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ARTIST.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_STICKER_PACKS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_STICKERS_BANNERS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_STICKERS_INFO.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_SPECIAL.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUP_BANNERS.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_CHATS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CURATOR.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_TEXTS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_FRIENDS_LIKES.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LONGREADS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_FRIENDS_LIKE_EPISODE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_CLASSIFIEDS_CITIES.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PODCASTS.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_OFFLINE_PODCASTS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_EXTENDED_PODCASTS.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_COLLECTION.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_RADIO_STATIONS.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIOBOOKS.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIOBOOKS_PERSONS.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_TOPSHELF.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_FEEDBACKS.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MARKET_INFO.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_FILTERS.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AD_BLOCKS.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_AD_BLOCKS.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CHANNELS.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SPORTS_MATCHES_CURRENT.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SPORTS_MATCHES_UPCOMING.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AI_ASSISTANTS.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MOVIES.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class i extends PropertyReference1Impl {
        public static final i b = new i(StickersInfo.class, "id", "getId()J", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Long.valueOf(((StickersInfo) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class i0 extends PropertyReference1Impl {
        public static final i0 b = new i0(RadioStation.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((RadioStation) obj).b);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class i1 extends Serializer.c<CatalogExtendedData> {
        /* JADX WARN: Finally extract failed */
        @Override // com.vk.core.serialize.Serializer.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CatalogExtendedData a(Serializer serializer) {
            Map map;
            Map map2;
            Map map3;
            Map map4;
            Map map5;
            Map map6;
            Map map7;
            Map map8;
            Map map9;
            Map map10;
            Map map11;
            Map map12;
            Map map13;
            Map map14;
            Map map15;
            Map map16;
            Map map17;
            Map map18;
            Map map19;
            Map map20;
            Map map21;
            Map map22;
            Map map23;
            Map map24;
            Map map25;
            Map map26;
            Map map27;
            Map map28;
            Map map29;
            Map map30;
            Map map31;
            Map map32;
            Map map33;
            Map map34;
            Map map35;
            Map map36;
            Map map37;
            Map map38;
            Map map39;
            Map map40;
            Map map41;
            Map map42;
            Map map43;
            Map map44;
            Map map45;
            Map map46;
            Map map47;
            Map map48;
            Map map49;
            Map map50;
            Map map51;
            Map map52;
            Map map53;
            Map map54;
            Map map55;
            Map map56;
            Map map57;
            Map map58;
            Map map59;
            Map map60;
            Map map61;
            Map map62;
            Map map63;
            Serializer.c<CatalogExtendedData> cVar = CatalogExtendedData.CREATOR;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                Map map64 = jgp.b;
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        Serializer.StreamParcelable G = serializer.G(UserProfile.class.getClassLoader());
                        if (H != null && G != null) {
                            map.put(H, G);
                        }
                    }
                } else {
                    map = map64;
                }
                LinkedHashMap v = pn00.v(map);
                Serializer.c<CatalogExtendedData> cVar2 = CatalogExtendedData.CREATOR;
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                try {
                    int u2 = serializer.u();
                    if (u2 >= 0) {
                        map2 = new LinkedHashMap();
                        for (int i2 = 0; i2 < u2; i2++) {
                            String H2 = serializer.H();
                            Serializer.StreamParcelable G2 = serializer.G(Group.class.getClassLoader());
                            if (H2 != null && G2 != null) {
                                map2.put(H2, G2);
                            }
                        }
                    } else {
                        map2 = map64;
                    }
                    LinkedHashMap v2 = pn00.v(map2);
                    Serializer.c<CatalogExtendedData> cVar3 = CatalogExtendedData.CREATOR;
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                    try {
                        int u3 = serializer.u();
                        if (u3 >= 0) {
                            map3 = new LinkedHashMap();
                            for (int i3 = 0; i3 < u3; i3++) {
                                String H3 = serializer.H();
                                Serializer.StreamParcelable G3 = serializer.G(ApiApplication.class.getClassLoader());
                                if (H3 != null && G3 != null) {
                                    map3.put(H3, G3);
                                }
                            }
                        } else {
                            map3 = map64;
                        }
                        LinkedHashMap v3 = pn00.v(map3);
                        Serializer.c<CatalogExtendedData> cVar4 = CatalogExtendedData.CREATOR;
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                        try {
                            int u4 = serializer.u();
                            if (u4 >= 0) {
                                map4 = new LinkedHashMap();
                                for (int i4 = 0; i4 < u4; i4++) {
                                    String H4 = serializer.H();
                                    Serializer.StreamParcelable G4 = serializer.G(ApiApplication.class.getClassLoader());
                                    if (H4 != null && G4 != null) {
                                        map4.put(H4, G4);
                                    }
                                }
                            } else {
                                map4 = map64;
                            }
                            LinkedHashMap v4 = pn00.v(map4);
                            Serializer.c<CatalogExtendedData> cVar5 = CatalogExtendedData.CREATOR;
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
                            try {
                                int u5 = serializer.u();
                                if (u5 >= 0) {
                                    map5 = new LinkedHashMap();
                                    for (int i5 = 0; i5 < u5; i5++) {
                                        String H5 = serializer.H();
                                        Serializer.StreamParcelable G5 = serializer.G(VideoFile.class.getClassLoader());
                                        if (H5 != null && G5 != null) {
                                            map5.put(H5, G5);
                                        }
                                    }
                                } else {
                                    map5 = map64;
                                }
                                LinkedHashMap v5 = pn00.v(map5);
                                Serializer.c<CatalogExtendedData> cVar6 = CatalogExtendedData.CREATOR;
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap6 = Serializer.a;
                                try {
                                    int u6 = serializer.u();
                                    if (u6 >= 0) {
                                        map6 = new LinkedHashMap();
                                        for (int i6 = 0; i6 < u6; i6++) {
                                            String H6 = serializer.H();
                                            Serializer.StreamParcelable G6 = serializer.G(CatalogVideo.class.getClassLoader());
                                            if (H6 != null && G6 != null) {
                                                map6.put(H6, G6);
                                            }
                                        }
                                    } else {
                                        map6 = map64;
                                    }
                                    LinkedHashMap v6 = pn00.v(map6);
                                    Serializer.c<CatalogExtendedData> cVar7 = CatalogExtendedData.CREATOR;
                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap7 = Serializer.a;
                                    try {
                                        int u7 = serializer.u();
                                        if (u7 >= 0) {
                                            map7 = new LinkedHashMap();
                                            for (int i7 = 0; i7 < u7; i7++) {
                                                String H7 = serializer.H();
                                                Serializer.StreamParcelable G7 = serializer.G(TopshelfItem.class.getClassLoader());
                                                if (H7 != null && G7 != null) {
                                                    map7.put(H7, G7);
                                                }
                                            }
                                        } else {
                                            map7 = map64;
                                        }
                                        LinkedHashMap v7 = pn00.v(map7);
                                        Serializer.c<CatalogExtendedData> cVar8 = CatalogExtendedData.CREATOR;
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap8 = Serializer.a;
                                        try {
                                            int u8 = serializer.u();
                                            if (u8 >= 0) {
                                                map8 = new LinkedHashMap();
                                                for (int i8 = 0; i8 < u8; i8++) {
                                                    String H8 = serializer.H();
                                                    Serializer.StreamParcelable G8 = serializer.G(ShowcaseListItem.class.getClassLoader());
                                                    if (H8 != null && G8 != null) {
                                                        map8.put(H8, G8);
                                                    }
                                                }
                                            } else {
                                                map8 = map64;
                                            }
                                            LinkedHashMap v8 = pn00.v(map8);
                                            Serializer.c<CatalogExtendedData> cVar9 = CatalogExtendedData.CREATOR;
                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap9 = Serializer.a;
                                            try {
                                                int u9 = serializer.u();
                                                if (u9 >= 0) {
                                                    map9 = new LinkedHashMap();
                                                    for (int i9 = 0; i9 < u9; i9++) {
                                                        String H9 = serializer.H();
                                                        Serializer.StreamParcelable G9 = serializer.G(VideoAlbum.class.getClassLoader());
                                                        if (H9 != null && G9 != null) {
                                                            map9.put(H9, G9);
                                                        }
                                                    }
                                                } else {
                                                    map9 = map64;
                                                }
                                                LinkedHashMap v9 = pn00.v(map9);
                                                Serializer.c<CatalogExtendedData> cVar10 = CatalogExtendedData.CREATOR;
                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap10 = Serializer.a;
                                                try {
                                                    int u10 = serializer.u();
                                                    if (u10 >= 0) {
                                                        map10 = new LinkedHashMap();
                                                        for (int i10 = 0; i10 < u10; i10++) {
                                                            String H10 = serializer.H();
                                                            Serializer.StreamParcelable G10 = serializer.G(Playlist.class.getClassLoader());
                                                            if (H10 != null && G10 != null) {
                                                                map10.put(H10, G10);
                                                            }
                                                        }
                                                    } else {
                                                        map10 = map64;
                                                    }
                                                    LinkedHashMap v10 = pn00.v(map10);
                                                    Serializer.c<CatalogExtendedData> cVar11 = CatalogExtendedData.CREATOR;
                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap11 = Serializer.a;
                                                    try {
                                                        int u11 = serializer.u();
                                                        if (u11 >= 0) {
                                                            map11 = new LinkedHashMap();
                                                            for (int i11 = 0; i11 < u11; i11++) {
                                                                String H11 = serializer.H();
                                                                Serializer.StreamParcelable G11 = serializer.G(RecommendedPlaylist.class.getClassLoader());
                                                                if (H11 != null && G11 != null) {
                                                                    map11.put(H11, G11);
                                                                }
                                                            }
                                                        } else {
                                                            map11 = map64;
                                                        }
                                                        LinkedHashMap v11 = pn00.v(map11);
                                                        Serializer.c<CatalogExtendedData> cVar12 = CatalogExtendedData.CREATOR;
                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap12 = Serializer.a;
                                                        try {
                                                            int u12 = serializer.u();
                                                            if (u12 >= 0) {
                                                                map12 = new LinkedHashMap();
                                                                for (int i12 = 0; i12 < u12; i12++) {
                                                                    String H12 = serializer.H();
                                                                    Serializer.StreamParcelable G12 = serializer.G(AudioFollowingsUpdateInfo.class.getClassLoader());
                                                                    if (H12 != null && G12 != null) {
                                                                        map12.put(H12, G12);
                                                                    }
                                                                }
                                                            } else {
                                                                map12 = map64;
                                                            }
                                                            LinkedHashMap v12 = pn00.v(map12);
                                                            Serializer.c<CatalogExtendedData> cVar13 = CatalogExtendedData.CREATOR;
                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap13 = Serializer.a;
                                                            try {
                                                                int u13 = serializer.u();
                                                                if (u13 >= 0) {
                                                                    map13 = new LinkedHashMap();
                                                                    int i13 = 0;
                                                                    while (i13 < u13) {
                                                                        String H13 = serializer.H();
                                                                        LinkedHashMap linkedHashMap = v12;
                                                                        Serializer.StreamParcelable G13 = serializer.G(AudioFollowingsUpdateItem.class.getClassLoader());
                                                                        if (H13 != null && G13 != null) {
                                                                            map13.put(H13, G13);
                                                                        }
                                                                        i13++;
                                                                        v12 = linkedHashMap;
                                                                    }
                                                                } else {
                                                                    map13 = map64;
                                                                }
                                                                LinkedHashMap linkedHashMap2 = v12;
                                                                LinkedHashMap v13 = pn00.v(map13);
                                                                Serializer.c<CatalogExtendedData> cVar14 = CatalogExtendedData.CREATOR;
                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap14 = Serializer.a;
                                                                try {
                                                                    int u14 = serializer.u();
                                                                    if (u14 >= 0) {
                                                                        map14 = new LinkedHashMap();
                                                                        int i14 = 0;
                                                                        while (i14 < u14) {
                                                                            String H14 = serializer.H();
                                                                            LinkedHashMap linkedHashMap3 = v13;
                                                                            Serializer.StreamParcelable G14 = serializer.G(MusicOwner.class.getClassLoader());
                                                                            if (H14 != null && G14 != null) {
                                                                                map14.put(H14, G14);
                                                                            }
                                                                            i14++;
                                                                            v13 = linkedHashMap3;
                                                                        }
                                                                    } else {
                                                                        map14 = map64;
                                                                    }
                                                                    LinkedHashMap linkedHashMap4 = v13;
                                                                    LinkedHashMap v14 = pn00.v(map14);
                                                                    Serializer.c<CatalogExtendedData> cVar15 = CatalogExtendedData.CREATOR;
                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap15 = Serializer.a;
                                                                    try {
                                                                        int u15 = serializer.u();
                                                                        if (u15 >= 0) {
                                                                            map15 = new LinkedHashMap();
                                                                            for (int i15 = 0; i15 < u15; i15++) {
                                                                                String H15 = serializer.H();
                                                                                Serializer.StreamParcelable G15 = serializer.G(MusicTrack.class.getClassLoader());
                                                                                if (H15 != null && G15 != null) {
                                                                                    map15.put(H15, G15);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            map15 = map64;
                                                                        }
                                                                        LinkedHashMap v15 = pn00.v(map15);
                                                                        Serializer.c<CatalogExtendedData> cVar16 = CatalogExtendedData.CREATOR;
                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap16 = Serializer.a;
                                                                        try {
                                                                            int u16 = serializer.u();
                                                                            if (u16 >= 0) {
                                                                                map16 = new LinkedHashMap();
                                                                                int i16 = 0;
                                                                                while (i16 < u16) {
                                                                                    String H16 = serializer.H();
                                                                                    LinkedHashMap linkedHashMap5 = v15;
                                                                                    Serializer.StreamParcelable G16 = serializer.G(SearchSuggestion.class.getClassLoader());
                                                                                    if (H16 != null && G16 != null) {
                                                                                        map16.put(H16, G16);
                                                                                    }
                                                                                    i16++;
                                                                                    v15 = linkedHashMap5;
                                                                                }
                                                                            } else {
                                                                                map16 = map64;
                                                                            }
                                                                            LinkedHashMap linkedHashMap6 = v15;
                                                                            LinkedHashMap v16 = pn00.v(map16);
                                                                            Serializer.c<CatalogExtendedData> cVar17 = CatalogExtendedData.CREATOR;
                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap17 = Serializer.a;
                                                                            try {
                                                                                int u17 = serializer.u();
                                                                                if (u17 >= 0) {
                                                                                    map17 = new LinkedHashMap();
                                                                                    int i17 = 0;
                                                                                    while (i17 < u17) {
                                                                                        String H17 = serializer.H();
                                                                                        LinkedHashMap linkedHashMap7 = v16;
                                                                                        Serializer.StreamParcelable G17 = serializer.G(CatalogLink.class.getClassLoader());
                                                                                        if (H17 != null && G17 != null) {
                                                                                            map17.put(H17, G17);
                                                                                        }
                                                                                        i17++;
                                                                                        v16 = linkedHashMap7;
                                                                                    }
                                                                                } else {
                                                                                    map17 = map64;
                                                                                }
                                                                                LinkedHashMap linkedHashMap8 = v16;
                                                                                LinkedHashMap v17 = pn00.v(map17);
                                                                                Serializer.c<CatalogExtendedData> cVar18 = CatalogExtendedData.CREATOR;
                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap18 = Serializer.a;
                                                                                try {
                                                                                    int u18 = serializer.u();
                                                                                    if (u18 >= 0) {
                                                                                        map18 = new LinkedHashMap();
                                                                                        for (int i18 = 0; i18 < u18; i18++) {
                                                                                            String H18 = serializer.H();
                                                                                            Serializer.StreamParcelable G18 = serializer.G(CatalogUserMeta.class.getClassLoader());
                                                                                            if (H18 != null && G18 != null) {
                                                                                                map18.put(H18, G18);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        map18 = map64;
                                                                                    }
                                                                                    LinkedHashMap v18 = pn00.v(map18);
                                                                                    Serializer.c<CatalogExtendedData> cVar19 = CatalogExtendedData.CREATOR;
                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap19 = Serializer.a;
                                                                                    try {
                                                                                        int u19 = serializer.u();
                                                                                        if (u19 >= 0) {
                                                                                            map19 = new LinkedHashMap();
                                                                                            int i19 = 0;
                                                                                            while (i19 < u19) {
                                                                                                String H19 = serializer.H();
                                                                                                LinkedHashMap linkedHashMap9 = v18;
                                                                                                Serializer.StreamParcelable G19 = serializer.G(Artist.class.getClassLoader());
                                                                                                if (H19 != null && G19 != null) {
                                                                                                    map19.put(H19, G19);
                                                                                                }
                                                                                                i19++;
                                                                                                v18 = linkedHashMap9;
                                                                                            }
                                                                                        } else {
                                                                                            map19 = map64;
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap10 = v18;
                                                                                        LinkedHashMap v19 = pn00.v(map19);
                                                                                        Serializer.c<CatalogExtendedData> cVar20 = CatalogExtendedData.CREATOR;
                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap20 = Serializer.a;
                                                                                        try {
                                                                                            int u20 = serializer.u();
                                                                                            if (u20 >= 0) {
                                                                                                map20 = new LinkedHashMap();
                                                                                                int i20 = 0;
                                                                                                while (i20 < u20) {
                                                                                                    LinkedHashMap linkedHashMap11 = v19;
                                                                                                    String H20 = serializer.H();
                                                                                                    int i21 = u20;
                                                                                                    Serializer.StreamParcelable G20 = serializer.G(StickerStockItem.class.getClassLoader());
                                                                                                    if (H20 != null && G20 != null) {
                                                                                                        map20.put(H20, G20);
                                                                                                    }
                                                                                                    i20++;
                                                                                                    v19 = linkedHashMap11;
                                                                                                    u20 = i21;
                                                                                                }
                                                                                            } else {
                                                                                                map20 = map64;
                                                                                            }
                                                                                            LinkedHashMap linkedHashMap12 = v19;
                                                                                            LinkedHashMap v20 = pn00.v(map20);
                                                                                            Serializer.c<CatalogExtendedData> cVar21 = CatalogExtendedData.CREATOR;
                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap21 = Serializer.a;
                                                                                            try {
                                                                                                int u21 = serializer.u();
                                                                                                if (u21 >= 0) {
                                                                                                    map21 = new LinkedHashMap();
                                                                                                    int i22 = 0;
                                                                                                    while (i22 < u21) {
                                                                                                        LinkedHashMap linkedHashMap13 = v20;
                                                                                                        String H21 = serializer.H();
                                                                                                        int i23 = u21;
                                                                                                        Serializer.StreamParcelable G21 = serializer.G(StickerPackPreview.class.getClassLoader());
                                                                                                        if (H21 != null && G21 != null) {
                                                                                                            map21.put(H21, G21);
                                                                                                        }
                                                                                                        i22++;
                                                                                                        v20 = linkedHashMap13;
                                                                                                        u21 = i23;
                                                                                                    }
                                                                                                } else {
                                                                                                    map21 = map64;
                                                                                                }
                                                                                                LinkedHashMap linkedHashMap14 = v20;
                                                                                                LinkedHashMap v21 = pn00.v(map21);
                                                                                                Serializer.c<CatalogExtendedData> cVar22 = CatalogExtendedData.CREATOR;
                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap22 = Serializer.a;
                                                                                                try {
                                                                                                    int u22 = serializer.u();
                                                                                                    if (u22 >= 0) {
                                                                                                        map22 = new LinkedHashMap();
                                                                                                        int i24 = 0;
                                                                                                        while (i24 < u22) {
                                                                                                            LinkedHashMap linkedHashMap15 = v21;
                                                                                                            String H22 = serializer.H();
                                                                                                            int i25 = u22;
                                                                                                            Serializer.StreamParcelable G22 = serializer.G(StickerStockItem.class.getClassLoader());
                                                                                                            if (H22 != null && G22 != null) {
                                                                                                                map22.put(H22, G22);
                                                                                                            }
                                                                                                            i24++;
                                                                                                            v21 = linkedHashMap15;
                                                                                                            u22 = i25;
                                                                                                        }
                                                                                                    } else {
                                                                                                        map22 = map64;
                                                                                                    }
                                                                                                    LinkedHashMap linkedHashMap16 = v21;
                                                                                                    LinkedHashMap v22 = pn00.v(map22);
                                                                                                    Serializer.c<CatalogExtendedData> cVar23 = CatalogExtendedData.CREATOR;
                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap23 = Serializer.a;
                                                                                                    try {
                                                                                                        int u23 = serializer.u();
                                                                                                        if (u23 >= 0) {
                                                                                                            map23 = new LinkedHashMap();
                                                                                                            int i26 = 0;
                                                                                                            while (i26 < u23) {
                                                                                                                String H23 = serializer.H();
                                                                                                                LinkedHashMap linkedHashMap17 = v22;
                                                                                                                Serializer.StreamParcelable G23 = serializer.G(Banner.class.getClassLoader());
                                                                                                                if (H23 != null && G23 != null) {
                                                                                                                    map23.put(H23, G23);
                                                                                                                }
                                                                                                                i26++;
                                                                                                                v22 = linkedHashMap17;
                                                                                                            }
                                                                                                        } else {
                                                                                                            map23 = map64;
                                                                                                        }
                                                                                                        LinkedHashMap linkedHashMap18 = v22;
                                                                                                        LinkedHashMap v23 = pn00.v(map23);
                                                                                                        Serializer.c<CatalogExtendedData> cVar24 = CatalogExtendedData.CREATOR;
                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap24 = Serializer.a;
                                                                                                        try {
                                                                                                            int u24 = serializer.u();
                                                                                                            if (u24 >= 0) {
                                                                                                                map24 = new LinkedHashMap();
                                                                                                                int i27 = 0;
                                                                                                                while (i27 < u24) {
                                                                                                                    String H24 = serializer.H();
                                                                                                                    LinkedHashMap linkedHashMap19 = v23;
                                                                                                                    Serializer.StreamParcelable G24 = serializer.G(StickersInfo.class.getClassLoader());
                                                                                                                    if (H24 != null && G24 != null) {
                                                                                                                        map24.put(H24, G24);
                                                                                                                    }
                                                                                                                    i27++;
                                                                                                                    v23 = linkedHashMap19;
                                                                                                                }
                                                                                                            } else {
                                                                                                                map24 = map64;
                                                                                                            }
                                                                                                            LinkedHashMap linkedHashMap20 = v23;
                                                                                                            LinkedHashMap v24 = pn00.v(map24);
                                                                                                            Serializer.c<CatalogExtendedData> cVar25 = CatalogExtendedData.CREATOR;
                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap25 = Serializer.a;
                                                                                                            try {
                                                                                                                int u25 = serializer.u();
                                                                                                                if (u25 >= 0) {
                                                                                                                    map25 = new LinkedHashMap();
                                                                                                                    for (int i28 = 0; i28 < u25; i28++) {
                                                                                                                        String H25 = serializer.H();
                                                                                                                        Serializer.StreamParcelable G25 = serializer.G(Thumb.class.getClassLoader());
                                                                                                                        if (H25 != null && G25 != null) {
                                                                                                                            map25.put(H25, G25);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    map25 = map64;
                                                                                                                }
                                                                                                                LinkedHashMap v25 = pn00.v(map25);
                                                                                                                Serializer.c<CatalogExtendedData> cVar26 = CatalogExtendedData.CREATOR;
                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap26 = Serializer.a;
                                                                                                                try {
                                                                                                                    int u26 = serializer.u();
                                                                                                                    if (u26 >= 0) {
                                                                                                                        map26 = new LinkedHashMap();
                                                                                                                        int i29 = 0;
                                                                                                                        while (i29 < u26) {
                                                                                                                            String H26 = serializer.H();
                                                                                                                            LinkedHashMap linkedHashMap21 = v25;
                                                                                                                            Serializer.StreamParcelable G26 = serializer.G(CatalogStateInfo.class.getClassLoader());
                                                                                                                            if (H26 != null && G26 != null) {
                                                                                                                                map26.put(H26, G26);
                                                                                                                            }
                                                                                                                            i29++;
                                                                                                                            v25 = linkedHashMap21;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        map26 = map64;
                                                                                                                    }
                                                                                                                    LinkedHashMap linkedHashMap22 = v25;
                                                                                                                    LinkedHashMap v26 = pn00.v(map26);
                                                                                                                    Serializer.c<CatalogExtendedData> cVar27 = CatalogExtendedData.CREATOR;
                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap27 = Serializer.a;
                                                                                                                    try {
                                                                                                                        int u27 = serializer.u();
                                                                                                                        if (u27 >= 0) {
                                                                                                                            map27 = new LinkedHashMap();
                                                                                                                            int i30 = 0;
                                                                                                                            while (i30 < u27) {
                                                                                                                                String H27 = serializer.H();
                                                                                                                                LinkedHashMap linkedHashMap23 = v26;
                                                                                                                                Serializer.StreamParcelable G27 = serializer.G(GroupChat.class.getClassLoader());
                                                                                                                                if (H27 != null && G27 != null) {
                                                                                                                                    map27.put(H27, G27);
                                                                                                                                }
                                                                                                                                i30++;
                                                                                                                                v26 = linkedHashMap23;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            map27 = map64;
                                                                                                                        }
                                                                                                                        LinkedHashMap linkedHashMap24 = v26;
                                                                                                                        LinkedHashMap v27 = pn00.v(map27);
                                                                                                                        Serializer.c<CatalogExtendedData> cVar28 = CatalogExtendedData.CREATOR;
                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap28 = Serializer.a;
                                                                                                                        try {
                                                                                                                            int u28 = serializer.u();
                                                                                                                            if (u28 >= 0) {
                                                                                                                                map28 = new LinkedHashMap();
                                                                                                                                for (int i31 = 0; i31 < u28; i31++) {
                                                                                                                                    String H28 = serializer.H();
                                                                                                                                    Serializer.StreamParcelable G28 = serializer.G(Good.class.getClassLoader());
                                                                                                                                    if (H28 != null && G28 != null) {
                                                                                                                                        map28.put(H28, G28);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                map28 = map64;
                                                                                                                            }
                                                                                                                            LinkedHashMap v28 = pn00.v(map28);
                                                                                                                            Serializer.c<CatalogExtendedData> cVar29 = CatalogExtendedData.CREATOR;
                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap29 = Serializer.a;
                                                                                                                            try {
                                                                                                                                int u29 = serializer.u();
                                                                                                                                if (u29 >= 0) {
                                                                                                                                    map29 = new LinkedHashMap();
                                                                                                                                    int i32 = 0;
                                                                                                                                    while (i32 < u29) {
                                                                                                                                        String H29 = serializer.H();
                                                                                                                                        LinkedHashMap linkedHashMap25 = v28;
                                                                                                                                        Serializer.StreamParcelable G29 = serializer.G(CatalogMarketGroupInfo.class.getClassLoader());
                                                                                                                                        if (H29 != null && G29 != null) {
                                                                                                                                            map29.put(H29, G29);
                                                                                                                                        }
                                                                                                                                        i32++;
                                                                                                                                        v28 = linkedHashMap25;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    map29 = map64;
                                                                                                                                }
                                                                                                                                LinkedHashMap linkedHashMap26 = v28;
                                                                                                                                LinkedHashMap v29 = pn00.v(map29);
                                                                                                                                Serializer.c<CatalogExtendedData> cVar30 = CatalogExtendedData.CREATOR;
                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap30 = Serializer.a;
                                                                                                                                try {
                                                                                                                                    int u30 = serializer.u();
                                                                                                                                    if (u30 >= 0) {
                                                                                                                                        map30 = new LinkedHashMap();
                                                                                                                                        int i33 = 0;
                                                                                                                                        while (i33 < u30) {
                                                                                                                                            String H30 = serializer.H();
                                                                                                                                            LinkedHashMap linkedHashMap27 = v29;
                                                                                                                                            Serializer.StreamParcelable G30 = serializer.G(CatalogNavigationTab.class.getClassLoader());
                                                                                                                                            if (H30 != null && G30 != null) {
                                                                                                                                                map30.put(H30, G30);
                                                                                                                                            }
                                                                                                                                            i33++;
                                                                                                                                            v29 = linkedHashMap27;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        map30 = map64;
                                                                                                                                    }
                                                                                                                                    LinkedHashMap linkedHashMap28 = v29;
                                                                                                                                    LinkedHashMap v30 = pn00.v(map30);
                                                                                                                                    Serializer.c<CatalogExtendedData> cVar31 = CatalogExtendedData.CREATOR;
                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap31 = Serializer.a;
                                                                                                                                    try {
                                                                                                                                        int u31 = serializer.u();
                                                                                                                                        if (u31 >= 0) {
                                                                                                                                            map31 = new LinkedHashMap();
                                                                                                                                            for (int i34 = 0; i34 < u31; i34++) {
                                                                                                                                                String H31 = serializer.H();
                                                                                                                                                Serializer.StreamParcelable G31 = serializer.G(Curator.class.getClassLoader());
                                                                                                                                                if (H31 != null && G31 != null) {
                                                                                                                                                    map31.put(H31, G31);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            map31 = map64;
                                                                                                                                        }
                                                                                                                                        LinkedHashMap v31 = pn00.v(map31);
                                                                                                                                        Serializer.c<CatalogExtendedData> cVar32 = CatalogExtendedData.CREATOR;
                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap32 = Serializer.a;
                                                                                                                                        try {
                                                                                                                                            int u32 = serializer.u();
                                                                                                                                            if (u32 >= 0) {
                                                                                                                                                map32 = new LinkedHashMap();
                                                                                                                                                int i35 = 0;
                                                                                                                                                while (i35 < u32) {
                                                                                                                                                    String H32 = serializer.H();
                                                                                                                                                    LinkedHashMap linkedHashMap29 = v31;
                                                                                                                                                    Serializer.StreamParcelable G32 = serializer.G(CatalogText.class.getClassLoader());
                                                                                                                                                    if (H32 != null && G32 != null) {
                                                                                                                                                        map32.put(H32, G32);
                                                                                                                                                    }
                                                                                                                                                    i35++;
                                                                                                                                                    v31 = linkedHashMap29;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                map32 = map64;
                                                                                                                                            }
                                                                                                                                            LinkedHashMap linkedHashMap30 = v31;
                                                                                                                                            LinkedHashMap v32 = pn00.v(map32);
                                                                                                                                            Serializer.c<CatalogExtendedData> cVar33 = CatalogExtendedData.CREATOR;
                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap33 = Serializer.a;
                                                                                                                                            try {
                                                                                                                                                int u33 = serializer.u();
                                                                                                                                                if (u33 >= 0) {
                                                                                                                                                    map33 = new LinkedHashMap();
                                                                                                                                                    int i36 = 0;
                                                                                                                                                    while (i36 < u33) {
                                                                                                                                                        String H33 = serializer.H();
                                                                                                                                                        LinkedHashMap linkedHashMap31 = v32;
                                                                                                                                                        Serializer.StreamParcelable G33 = serializer.G(GroupLikes.class.getClassLoader());
                                                                                                                                                        if (H33 != null && G33 != null) {
                                                                                                                                                            map33.put(H33, G33);
                                                                                                                                                        }
                                                                                                                                                        i36++;
                                                                                                                                                        v32 = linkedHashMap31;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    map33 = map64;
                                                                                                                                                }
                                                                                                                                                LinkedHashMap linkedHashMap32 = v32;
                                                                                                                                                LinkedHashMap v33 = pn00.v(map33);
                                                                                                                                                Serializer.c<CatalogExtendedData> cVar34 = CatalogExtendedData.CREATOR;
                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap34 = Serializer.a;
                                                                                                                                                try {
                                                                                                                                                    int u34 = serializer.u();
                                                                                                                                                    if (u34 >= 0) {
                                                                                                                                                        map34 = new LinkedHashMap();
                                                                                                                                                        for (int i37 = 0; i37 < u34; i37++) {
                                                                                                                                                            String H34 = serializer.H();
                                                                                                                                                            Serializer.StreamParcelable G34 = serializer.G(CatalogHint.class.getClassLoader());
                                                                                                                                                            if (H34 != null && G34 != null) {
                                                                                                                                                                map34.put(H34, G34);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        map34 = map64;
                                                                                                                                                    }
                                                                                                                                                    LinkedHashMap v34 = pn00.v(map34);
                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar35 = CatalogExtendedData.CREATOR;
                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap35 = Serializer.a;
                                                                                                                                                    try {
                                                                                                                                                        int u35 = serializer.u();
                                                                                                                                                        if (u35 >= 0) {
                                                                                                                                                            map35 = new LinkedHashMap();
                                                                                                                                                            int i38 = 0;
                                                                                                                                                            while (i38 < u35) {
                                                                                                                                                                String H35 = serializer.H();
                                                                                                                                                                LinkedHashMap linkedHashMap33 = v34;
                                                                                                                                                                Serializer.StreamParcelable G35 = serializer.G(Article.class.getClassLoader());
                                                                                                                                                                if (H35 != null && G35 != null) {
                                                                                                                                                                    map35.put(H35, G35);
                                                                                                                                                                }
                                                                                                                                                                i38++;
                                                                                                                                                                v34 = linkedHashMap33;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            map35 = map64;
                                                                                                                                                        }
                                                                                                                                                        LinkedHashMap linkedHashMap34 = v34;
                                                                                                                                                        LinkedHashMap v35 = pn00.v(map35);
                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar36 = CatalogExtendedData.CREATOR;
                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap36 = Serializer.a;
                                                                                                                                                        try {
                                                                                                                                                            int u36 = serializer.u();
                                                                                                                                                            if (u36 >= 0) {
                                                                                                                                                                map36 = new LinkedHashMap();
                                                                                                                                                                int i39 = 0;
                                                                                                                                                                while (i39 < u36) {
                                                                                                                                                                    String H36 = serializer.H();
                                                                                                                                                                    LinkedHashMap linkedHashMap35 = v35;
                                                                                                                                                                    Serializer.StreamParcelable G36 = serializer.G(FriendsLikedEpisode.class.getClassLoader());
                                                                                                                                                                    if (H36 != null && G36 != null) {
                                                                                                                                                                        map36.put(H36, G36);
                                                                                                                                                                    }
                                                                                                                                                                    i39++;
                                                                                                                                                                    v35 = linkedHashMap35;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                map36 = map64;
                                                                                                                                                            }
                                                                                                                                                            LinkedHashMap linkedHashMap36 = v35;
                                                                                                                                                            LinkedHashMap v36 = pn00.v(map36);
                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar37 = CatalogExtendedData.CREATOR;
                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap37 = Serializer.a;
                                                                                                                                                            try {
                                                                                                                                                                int u37 = serializer.u();
                                                                                                                                                                if (u37 >= 0) {
                                                                                                                                                                    map37 = new LinkedHashMap();
                                                                                                                                                                    for (int i40 = 0; i40 < u37; i40++) {
                                                                                                                                                                        String H37 = serializer.H();
                                                                                                                                                                        Serializer.StreamParcelable G37 = serializer.G(PodcastSliderItem.class.getClassLoader());
                                                                                                                                                                        if (H37 != null && G37 != null) {
                                                                                                                                                                            map37.put(H37, G37);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    map37 = map64;
                                                                                                                                                                }
                                                                                                                                                                LinkedHashMap v37 = pn00.v(map37);
                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar38 = CatalogExtendedData.CREATOR;
                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap38 = Serializer.a;
                                                                                                                                                                try {
                                                                                                                                                                    int u38 = serializer.u();
                                                                                                                                                                    if (u38 >= 0) {
                                                                                                                                                                        map38 = new LinkedHashMap();
                                                                                                                                                                        int i41 = 0;
                                                                                                                                                                        while (i41 < u38) {
                                                                                                                                                                            String H38 = serializer.H();
                                                                                                                                                                            LinkedHashMap linkedHashMap37 = v37;
                                                                                                                                                                            Serializer.StreamParcelable G38 = serializer.G(CatalogClassifiedYoulaCity.class.getClassLoader());
                                                                                                                                                                            if (H38 != null && G38 != null) {
                                                                                                                                                                                map38.put(H38, G38);
                                                                                                                                                                            }
                                                                                                                                                                            i41++;
                                                                                                                                                                            v37 = linkedHashMap37;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        map38 = map64;
                                                                                                                                                                    }
                                                                                                                                                                    LinkedHashMap linkedHashMap38 = v37;
                                                                                                                                                                    LinkedHashMap v38 = pn00.v(map38);
                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar39 = CatalogExtendedData.CREATOR;
                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap39 = Serializer.a;
                                                                                                                                                                    try {
                                                                                                                                                                        int u39 = serializer.u();
                                                                                                                                                                        if (u39 >= 0) {
                                                                                                                                                                            map39 = new LinkedHashMap();
                                                                                                                                                                            int i42 = 0;
                                                                                                                                                                            while (i42 < u39) {
                                                                                                                                                                                String H39 = serializer.H();
                                                                                                                                                                                LinkedHashMap linkedHashMap39 = v38;
                                                                                                                                                                                Serializer.StreamParcelable G39 = serializer.G(CatalogMarketCategory.class.getClassLoader());
                                                                                                                                                                                if (H39 != null && G39 != null) {
                                                                                                                                                                                    map39.put(H39, G39);
                                                                                                                                                                                }
                                                                                                                                                                                i42++;
                                                                                                                                                                                v38 = linkedHashMap39;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            map39 = map64;
                                                                                                                                                                        }
                                                                                                                                                                        LinkedHashMap linkedHashMap40 = v38;
                                                                                                                                                                        LinkedHashMap v39 = pn00.v(map39);
                                                                                                                                                                        ArrayList j = serializer.j(CatalogMarketCategoryMappings.CREATOR);
                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar40 = CatalogExtendedData.CREATOR;
                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap40 = Serializer.a;
                                                                                                                                                                        try {
                                                                                                                                                                            int u40 = serializer.u();
                                                                                                                                                                            if (u40 >= 0) {
                                                                                                                                                                                map40 = new LinkedHashMap();
                                                                                                                                                                                int i43 = 0;
                                                                                                                                                                                while (i43 < u40) {
                                                                                                                                                                                    String H40 = serializer.H();
                                                                                                                                                                                    ArrayList arrayList = j;
                                                                                                                                                                                    Serializer.StreamParcelable G40 = serializer.G(MusicSignalInfo.class.getClassLoader());
                                                                                                                                                                                    if (H40 != null && G40 != null) {
                                                                                                                                                                                        map40.put(H40, G40);
                                                                                                                                                                                    }
                                                                                                                                                                                    i43++;
                                                                                                                                                                                    j = arrayList;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                map40 = map64;
                                                                                                                                                                            }
                                                                                                                                                                            ArrayList arrayList2 = j;
                                                                                                                                                                            LinkedHashMap v40 = pn00.v(map40);
                                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar41 = CatalogExtendedData.CREATOR;
                                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap41 = Serializer.a;
                                                                                                                                                                            try {
                                                                                                                                                                                int u41 = serializer.u();
                                                                                                                                                                                if (u41 >= 0) {
                                                                                                                                                                                    map41 = new LinkedHashMap();
                                                                                                                                                                                    int i44 = 0;
                                                                                                                                                                                    while (i44 < u41) {
                                                                                                                                                                                        String H41 = serializer.H();
                                                                                                                                                                                        LinkedHashMap linkedHashMap41 = v40;
                                                                                                                                                                                        Serializer.StreamParcelable G41 = serializer.G(CatalogSearchSpellcheckResult.class.getClassLoader());
                                                                                                                                                                                        if (H41 != null && G41 != null) {
                                                                                                                                                                                            map41.put(H41, G41);
                                                                                                                                                                                        }
                                                                                                                                                                                        i44++;
                                                                                                                                                                                        v40 = linkedHashMap41;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    map41 = map64;
                                                                                                                                                                                }
                                                                                                                                                                                LinkedHashMap linkedHashMap42 = v40;
                                                                                                                                                                                LinkedHashMap v41 = pn00.v(map41);
                                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar42 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap42 = Serializer.a;
                                                                                                                                                                                try {
                                                                                                                                                                                    int u42 = serializer.u();
                                                                                                                                                                                    if (u42 >= 0) {
                                                                                                                                                                                        map42 = new LinkedHashMap();
                                                                                                                                                                                        int i45 = 0;
                                                                                                                                                                                        while (i45 < u42) {
                                                                                                                                                                                            String H42 = serializer.H();
                                                                                                                                                                                            LinkedHashMap linkedHashMap43 = v41;
                                                                                                                                                                                            Serializer.StreamParcelable G42 = serializer.G(Podcast.class.getClassLoader());
                                                                                                                                                                                            if (H42 != null && G42 != null) {
                                                                                                                                                                                                map42.put(H42, G42);
                                                                                                                                                                                            }
                                                                                                                                                                                            i45++;
                                                                                                                                                                                            v41 = linkedHashMap43;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        map42 = map64;
                                                                                                                                                                                    }
                                                                                                                                                                                    LinkedHashMap linkedHashMap44 = v41;
                                                                                                                                                                                    LinkedHashMap v42 = pn00.v(map42);
                                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar43 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap43 = Serializer.a;
                                                                                                                                                                                    try {
                                                                                                                                                                                        int u43 = serializer.u();
                                                                                                                                                                                        if (u43 >= 0) {
                                                                                                                                                                                            map43 = new LinkedHashMap();
                                                                                                                                                                                            int i46 = 0;
                                                                                                                                                                                            while (i46 < u43) {
                                                                                                                                                                                                String H43 = serializer.H();
                                                                                                                                                                                                LinkedHashMap linkedHashMap45 = v42;
                                                                                                                                                                                                Serializer.StreamParcelable G43 = serializer.G(OfflinePodcast.class.getClassLoader());
                                                                                                                                                                                                if (H43 != null && G43 != null) {
                                                                                                                                                                                                    map43.put(H43, G43);
                                                                                                                                                                                                }
                                                                                                                                                                                                i46++;
                                                                                                                                                                                                v42 = linkedHashMap45;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            map43 = map64;
                                                                                                                                                                                        }
                                                                                                                                                                                        LinkedHashMap linkedHashMap46 = v42;
                                                                                                                                                                                        LinkedHashMap v43 = pn00.v(map43);
                                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar44 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap44 = Serializer.a;
                                                                                                                                                                                        try {
                                                                                                                                                                                            int u44 = serializer.u();
                                                                                                                                                                                            if (u44 >= 0) {
                                                                                                                                                                                                map44 = new LinkedHashMap();
                                                                                                                                                                                                int i47 = 0;
                                                                                                                                                                                                while (i47 < u44) {
                                                                                                                                                                                                    String H44 = serializer.H();
                                                                                                                                                                                                    LinkedHashMap linkedHashMap47 = v43;
                                                                                                                                                                                                    Serializer.StreamParcelable G44 = serializer.G(ExtendedPodcast.class.getClassLoader());
                                                                                                                                                                                                    if (H44 != null && G44 != null) {
                                                                                                                                                                                                        map44.put(H44, G44);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    i47++;
                                                                                                                                                                                                    v43 = linkedHashMap47;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                map44 = map64;
                                                                                                                                                                                            }
                                                                                                                                                                                            LinkedHashMap linkedHashMap48 = v43;
                                                                                                                                                                                            LinkedHashMap v44 = pn00.v(map44);
                                                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar45 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap45 = Serializer.a;
                                                                                                                                                                                            try {
                                                                                                                                                                                                int u45 = serializer.u();
                                                                                                                                                                                                if (u45 >= 0) {
                                                                                                                                                                                                    map45 = new LinkedHashMap();
                                                                                                                                                                                                    int i48 = 0;
                                                                                                                                                                                                    while (i48 < u45) {
                                                                                                                                                                                                        String H45 = serializer.H();
                                                                                                                                                                                                        LinkedHashMap linkedHashMap49 = v44;
                                                                                                                                                                                                        Serializer.StreamParcelable G45 = serializer.G(GroupCollection.class.getClassLoader());
                                                                                                                                                                                                        if (H45 != null && G45 != null) {
                                                                                                                                                                                                            map45.put(H45, G45);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        i48++;
                                                                                                                                                                                                        v44 = linkedHashMap49;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    map45 = map64;
                                                                                                                                                                                                }
                                                                                                                                                                                                LinkedHashMap linkedHashMap50 = v44;
                                                                                                                                                                                                LinkedHashMap v45 = pn00.v(map45);
                                                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar46 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap46 = Serializer.a;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    int u46 = serializer.u();
                                                                                                                                                                                                    if (u46 >= 0) {
                                                                                                                                                                                                        map46 = new LinkedHashMap();
                                                                                                                                                                                                        int i49 = 0;
                                                                                                                                                                                                        while (i49 < u46) {
                                                                                                                                                                                                            String H46 = serializer.H();
                                                                                                                                                                                                            LinkedHashMap linkedHashMap51 = v45;
                                                                                                                                                                                                            Serializer.StreamParcelable G46 = serializer.G(RadioStation.class.getClassLoader());
                                                                                                                                                                                                            if (H46 != null && G46 != null) {
                                                                                                                                                                                                                map46.put(H46, G46);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i49++;
                                                                                                                                                                                                            v45 = linkedHashMap51;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        map46 = map64;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    LinkedHashMap linkedHashMap52 = v45;
                                                                                                                                                                                                    LinkedHashMap v46 = pn00.v(map46);
                                                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar47 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap47 = Serializer.a;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        int u47 = serializer.u();
                                                                                                                                                                                                        if (u47 >= 0) {
                                                                                                                                                                                                            map47 = new LinkedHashMap();
                                                                                                                                                                                                            int i50 = 0;
                                                                                                                                                                                                            while (i50 < u47) {
                                                                                                                                                                                                                String H47 = serializer.H();
                                                                                                                                                                                                                LinkedHashMap linkedHashMap53 = v46;
                                                                                                                                                                                                                Serializer.StreamParcelable G47 = serializer.G(AudioBook.class.getClassLoader());
                                                                                                                                                                                                                if (H47 != null && G47 != null) {
                                                                                                                                                                                                                    map47.put(H47, G47);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                i50++;
                                                                                                                                                                                                                v46 = linkedHashMap53;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            map47 = map64;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        LinkedHashMap linkedHashMap54 = v46;
                                                                                                                                                                                                        LinkedHashMap v47 = pn00.v(map47);
                                                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar48 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap48 = Serializer.a;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            int u48 = serializer.u();
                                                                                                                                                                                                            if (u48 >= 0) {
                                                                                                                                                                                                                map48 = new LinkedHashMap();
                                                                                                                                                                                                                int i51 = 0;
                                                                                                                                                                                                                while (i51 < u48) {
                                                                                                                                                                                                                    String H48 = serializer.H();
                                                                                                                                                                                                                    LinkedHashMap linkedHashMap55 = v47;
                                                                                                                                                                                                                    Serializer.StreamParcelable G48 = serializer.G(GroupsCategory.class.getClassLoader());
                                                                                                                                                                                                                    if (H48 != null && G48 != null) {
                                                                                                                                                                                                                        map48.put(H48, G48);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i51++;
                                                                                                                                                                                                                    v47 = linkedHashMap55;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                map48 = map64;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            LinkedHashMap linkedHashMap56 = v47;
                                                                                                                                                                                                            LinkedHashMap v48 = pn00.v(map48);
                                                                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar49 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap49 = Serializer.a;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                int u49 = serializer.u();
                                                                                                                                                                                                                if (u49 >= 0) {
                                                                                                                                                                                                                    map49 = new LinkedHashMap();
                                                                                                                                                                                                                    int i52 = 0;
                                                                                                                                                                                                                    while (i52 < u49) {
                                                                                                                                                                                                                        LinkedHashMap linkedHashMap57 = v48;
                                                                                                                                                                                                                        String H49 = serializer.H();
                                                                                                                                                                                                                        int i53 = u49;
                                                                                                                                                                                                                        Serializer.StreamParcelable G49 = serializer.G(CatalogNewsEntry.class.getClassLoader());
                                                                                                                                                                                                                        if (H49 != null && G49 != null) {
                                                                                                                                                                                                                            map49.put(H49, G49);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        i52++;
                                                                                                                                                                                                                        v48 = linkedHashMap57;
                                                                                                                                                                                                                        u49 = i53;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    map49 = map64;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                LinkedHashMap linkedHashMap58 = v48;
                                                                                                                                                                                                                LinkedHashMap v49 = pn00.v(map49);
                                                                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar50 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap50 = Serializer.a;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    int u50 = serializer.u();
                                                                                                                                                                                                                    if (u50 >= 0) {
                                                                                                                                                                                                                        map50 = new LinkedHashMap();
                                                                                                                                                                                                                        int i54 = 0;
                                                                                                                                                                                                                        while (i54 < u50) {
                                                                                                                                                                                                                            LinkedHashMap linkedHashMap59 = v49;
                                                                                                                                                                                                                            String H50 = serializer.H();
                                                                                                                                                                                                                            int i55 = u50;
                                                                                                                                                                                                                            Serializer.StreamParcelable G50 = serializer.G(CatalogNewsEntry.class.getClassLoader());
                                                                                                                                                                                                                            if (H50 != null && G50 != null) {
                                                                                                                                                                                                                                map50.put(H50, G50);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            i54++;
                                                                                                                                                                                                                            v49 = linkedHashMap59;
                                                                                                                                                                                                                            u50 = i55;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        map50 = map64;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    LinkedHashMap linkedHashMap60 = v49;
                                                                                                                                                                                                                    LinkedHashMap v50 = pn00.v(map50);
                                                                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar51 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap51 = Serializer.a;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        int u51 = serializer.u();
                                                                                                                                                                                                                        if (u51 >= 0) {
                                                                                                                                                                                                                            map51 = new LinkedHashMap();
                                                                                                                                                                                                                            int i56 = 0;
                                                                                                                                                                                                                            while (i56 < u51) {
                                                                                                                                                                                                                                String H51 = serializer.H();
                                                                                                                                                                                                                                LinkedHashMap linkedHashMap61 = v50;
                                                                                                                                                                                                                                Serializer.StreamParcelable G51 = serializer.G(CatalogSearchEntityAnswer.class.getClassLoader());
                                                                                                                                                                                                                                if (H51 != null && G51 != null) {
                                                                                                                                                                                                                                    map51.put(H51, G51);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i56++;
                                                                                                                                                                                                                                v50 = linkedHashMap61;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            map51 = map64;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        LinkedHashMap linkedHashMap62 = v50;
                                                                                                                                                                                                                        LinkedHashMap v51 = pn00.v(map51);
                                                                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar52 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap52 = Serializer.a;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            int u52 = serializer.u();
                                                                                                                                                                                                                            if (u52 >= 0) {
                                                                                                                                                                                                                                map52 = new LinkedHashMap();
                                                                                                                                                                                                                                for (int i57 = 0; i57 < u52; i57++) {
                                                                                                                                                                                                                                    String H52 = serializer.H();
                                                                                                                                                                                                                                    Serializer.StreamParcelable G52 = serializer.G(CatalogAudioStreamMix.class.getClassLoader());
                                                                                                                                                                                                                                    if (H52 != null && G52 != null) {
                                                                                                                                                                                                                                        map52.put(H52, G52);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                map52 = map64;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            LinkedHashMap v52 = pn00.v(map52);
                                                                                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar53 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap53 = Serializer.a;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                int u53 = serializer.u();
                                                                                                                                                                                                                                if (u53 >= 0) {
                                                                                                                                                                                                                                    map53 = new LinkedHashMap();
                                                                                                                                                                                                                                    int i58 = 0;
                                                                                                                                                                                                                                    while (i58 < u53) {
                                                                                                                                                                                                                                        String H53 = serializer.H();
                                                                                                                                                                                                                                        LinkedHashMap linkedHashMap63 = v52;
                                                                                                                                                                                                                                        Serializer.StreamParcelable G53 = serializer.G(QuestionnaireDto.class.getClassLoader());
                                                                                                                                                                                                                                        if (H53 != null && G53 != null) {
                                                                                                                                                                                                                                            map53.put(H53, G53);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        i58++;
                                                                                                                                                                                                                                        v52 = linkedHashMap63;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    map53 = map64;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                LinkedHashMap linkedHashMap64 = v52;
                                                                                                                                                                                                                                LinkedHashMap v53 = pn00.v(map53);
                                                                                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar54 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap54 = Serializer.a;
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    int u54 = serializer.u();
                                                                                                                                                                                                                                    if (u54 >= 0) {
                                                                                                                                                                                                                                        map54 = new LinkedHashMap();
                                                                                                                                                                                                                                        for (int i59 = 0; i59 < u54; i59++) {
                                                                                                                                                                                                                                            String H54 = serializer.H();
                                                                                                                                                                                                                                            Serializer.StreamParcelable G54 = serializer.G(AudioBookPerson.class.getClassLoader());
                                                                                                                                                                                                                                            if (H54 != null && G54 != null) {
                                                                                                                                                                                                                                                map54.put(H54, G54);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        map54 = map64;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    LinkedHashMap v54 = pn00.v(map54);
                                                                                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar55 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap55 = Serializer.a;
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        int u55 = serializer.u();
                                                                                                                                                                                                                                        if (u55 >= 0) {
                                                                                                                                                                                                                                            map55 = new LinkedHashMap();
                                                                                                                                                                                                                                            int i60 = 0;
                                                                                                                                                                                                                                            while (i60 < u55) {
                                                                                                                                                                                                                                                String H55 = serializer.H();
                                                                                                                                                                                                                                                LinkedHashMap linkedHashMap65 = v54;
                                                                                                                                                                                                                                                Serializer.StreamParcelable G55 = serializer.G(CatalogAudioContentCard.class.getClassLoader());
                                                                                                                                                                                                                                                if (H55 != null && G55 != null) {
                                                                                                                                                                                                                                                    map55.put(H55, G55);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                i60++;
                                                                                                                                                                                                                                                v54 = linkedHashMap65;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            map55 = map64;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        LinkedHashMap linkedHashMap66 = v54;
                                                                                                                                                                                                                                        LinkedHashMap v55 = pn00.v(map55);
                                                                                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar56 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap56 = Serializer.a;
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            int u56 = serializer.u();
                                                                                                                                                                                                                                            if (u56 >= 0) {
                                                                                                                                                                                                                                                map56 = new LinkedHashMap();
                                                                                                                                                                                                                                                for (int i61 = 0; i61 < u56; i61++) {
                                                                                                                                                                                                                                                    String H56 = serializer.H();
                                                                                                                                                                                                                                                    Serializer.StreamParcelable G56 = serializer.G(MarketInfo.class.getClassLoader());
                                                                                                                                                                                                                                                    if (H56 != null && G56 != null) {
                                                                                                                                                                                                                                                        map56.put(H56, G56);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                map56 = map64;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            LinkedHashMap v56 = pn00.v(map56);
                                                                                                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar57 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap57 = Serializer.a;
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                int u57 = serializer.u();
                                                                                                                                                                                                                                                if (u57 >= 0) {
                                                                                                                                                                                                                                                    map57 = new LinkedHashMap();
                                                                                                                                                                                                                                                    int i62 = 0;
                                                                                                                                                                                                                                                    while (i62 < u57) {
                                                                                                                                                                                                                                                        String H57 = serializer.H();
                                                                                                                                                                                                                                                        LinkedHashMap linkedHashMap67 = v56;
                                                                                                                                                                                                                                                        Serializer.StreamParcelable G57 = serializer.G(LiveCategory.class.getClassLoader());
                                                                                                                                                                                                                                                        if (H57 != null && G57 != null) {
                                                                                                                                                                                                                                                            map57.put(H57, G57);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        i62++;
                                                                                                                                                                                                                                                        v56 = linkedHashMap67;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    map57 = map64;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                LinkedHashMap linkedHashMap68 = v56;
                                                                                                                                                                                                                                                LinkedHashMap v57 = pn00.v(map57);
                                                                                                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar58 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap58 = Serializer.a;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    int u58 = serializer.u();
                                                                                                                                                                                                                                                    if (u58 >= 0) {
                                                                                                                                                                                                                                                        map58 = new LinkedHashMap();
                                                                                                                                                                                                                                                        int i63 = 0;
                                                                                                                                                                                                                                                        while (i63 < u58) {
                                                                                                                                                                                                                                                            String H58 = serializer.H();
                                                                                                                                                                                                                                                            LinkedHashMap linkedHashMap69 = v57;
                                                                                                                                                                                                                                                            Serializer.StreamParcelable G58 = serializer.G(AdBlockItem.class.getClassLoader());
                                                                                                                                                                                                                                                            if (H58 != null && G58 != null) {
                                                                                                                                                                                                                                                                map58.put(H58, G58);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            i63++;
                                                                                                                                                                                                                                                            v57 = linkedHashMap69;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        map58 = map64;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    LinkedHashMap linkedHashMap70 = v57;
                                                                                                                                                                                                                                                    LinkedHashMap v58 = pn00.v(map58);
                                                                                                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar59 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap59 = Serializer.a;
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        int u59 = serializer.u();
                                                                                                                                                                                                                                                        if (u59 >= 0) {
                                                                                                                                                                                                                                                            map59 = new LinkedHashMap();
                                                                                                                                                                                                                                                            for (int i64 = 0; i64 < u59; i64++) {
                                                                                                                                                                                                                                                                String H59 = serializer.H();
                                                                                                                                                                                                                                                                Serializer.StreamParcelable G59 = serializer.G(CatalogConcertItem.class.getClassLoader());
                                                                                                                                                                                                                                                                if (H59 != null && G59 != null) {
                                                                                                                                                                                                                                                                    map59.put(H59, G59);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            map59 = map64;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        LinkedHashMap v59 = pn00.v(map59);
                                                                                                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar60 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap60 = Serializer.a;
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            int u60 = serializer.u();
                                                                                                                                                                                                                                                            if (u60 >= 0) {
                                                                                                                                                                                                                                                                map60 = new LinkedHashMap();
                                                                                                                                                                                                                                                                for (int i65 = 0; i65 < u60; i65++) {
                                                                                                                                                                                                                                                                    String H60 = serializer.H();
                                                                                                                                                                                                                                                                    Serializer.StreamParcelable G60 = serializer.G(VideoMusicStreamMixItem.class.getClassLoader());
                                                                                                                                                                                                                                                                    if (H60 != null && G60 != null) {
                                                                                                                                                                                                                                                                        map60.put(H60, G60);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                map60 = map64;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            LinkedHashMap v60 = pn00.v(map60);
                                                                                                                                                                                                                                                            Serializer.c<CatalogExtendedData> cVar61 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap61 = Serializer.a;
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                int u61 = serializer.u();
                                                                                                                                                                                                                                                                if (u61 >= 0) {
                                                                                                                                                                                                                                                                    map61 = new LinkedHashMap();
                                                                                                                                                                                                                                                                    int i66 = 0;
                                                                                                                                                                                                                                                                    while (i66 < u61) {
                                                                                                                                                                                                                                                                        String H61 = serializer.H();
                                                                                                                                                                                                                                                                        LinkedHashMap linkedHashMap71 = v60;
                                                                                                                                                                                                                                                                        Serializer.StreamParcelable G61 = serializer.G(CatalogChannel.class.getClassLoader());
                                                                                                                                                                                                                                                                        if (H61 != null && G61 != null) {
                                                                                                                                                                                                                                                                            map61.put(H61, G61);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        i66++;
                                                                                                                                                                                                                                                                        v60 = linkedHashMap71;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    map61 = map64;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                LinkedHashMap linkedHashMap72 = v60;
                                                                                                                                                                                                                                                                LinkedHashMap v61 = pn00.v(map61);
                                                                                                                                                                                                                                                                Serializer.c<CatalogExtendedData> cVar62 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap62 = Serializer.a;
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    int u62 = serializer.u();
                                                                                                                                                                                                                                                                    if (u62 >= 0) {
                                                                                                                                                                                                                                                                        map62 = new LinkedHashMap();
                                                                                                                                                                                                                                                                        for (int i67 = 0; i67 < u62; i67++) {
                                                                                                                                                                                                                                                                            String H62 = serializer.H();
                                                                                                                                                                                                                                                                            Serializer.StreamParcelable G62 = serializer.G(CatalogSportMatch.class.getClassLoader());
                                                                                                                                                                                                                                                                            if (H62 != null && G62 != null) {
                                                                                                                                                                                                                                                                                map62.put(H62, G62);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                        map62 = map64;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    LinkedHashMap v62 = pn00.v(map62);
                                                                                                                                                                                                                                                                    Serializer.c<CatalogExtendedData> cVar63 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap63 = Serializer.a;
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        int u63 = serializer.u();
                                                                                                                                                                                                                                                                        if (u63 >= 0) {
                                                                                                                                                                                                                                                                            map63 = new LinkedHashMap();
                                                                                                                                                                                                                                                                            int i68 = 0;
                                                                                                                                                                                                                                                                            while (i68 < u63) {
                                                                                                                                                                                                                                                                                String H63 = serializer.H();
                                                                                                                                                                                                                                                                                LinkedHashMap linkedHashMap73 = v62;
                                                                                                                                                                                                                                                                                Serializer.StreamParcelable G63 = serializer.G(CatalogAiAssistantItem.class.getClassLoader());
                                                                                                                                                                                                                                                                                if (H63 != null && G63 != null) {
                                                                                                                                                                                                                                                                                    map63.put(H63, G63);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                i68++;
                                                                                                                                                                                                                                                                                v62 = linkedHashMap73;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            map63 = map64;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        LinkedHashMap linkedHashMap74 = v62;
                                                                                                                                                                                                                                                                        LinkedHashMap v63 = pn00.v(map63);
                                                                                                                                                                                                                                                                        Serializer.c<CatalogExtendedData> cVar64 = CatalogExtendedData.CREATOR;
                                                                                                                                                                                                                                                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap64 = Serializer.a;
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            int u64 = serializer.u();
                                                                                                                                                                                                                                                                            if (u64 >= 0) {
                                                                                                                                                                                                                                                                                map64 = new LinkedHashMap();
                                                                                                                                                                                                                                                                                for (int i69 = 0; i69 < u64; i69++) {
                                                                                                                                                                                                                                                                                    String H64 = serializer.H();
                                                                                                                                                                                                                                                                                    Serializer.StreamParcelable G64 = serializer.G(CatalogMovieItem.class.getClassLoader());
                                                                                                                                                                                                                                                                                    if (H64 != null && G64 != null) {
                                                                                                                                                                                                                                                                                        map64.put(H64, G64);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            LinkedHashMap v64 = pn00.v(map64);
                                                                                                                                                                                                                                                                            ArrayList j2 = serializer.j(UxPollData.CREATOR);
                                                                                                                                                                                                                                                                            if (j2 == null) {
                                                                                                                                                                                                                                                                                j2 = new ArrayList();
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            return new CatalogExtendedData(v, v2, v3, v5, v6, v7, v8, v9, v10, v11, linkedHashMap2, linkedHashMap4, v14, linkedHashMap6, linkedHashMap8, v17, linkedHashMap10, linkedHashMap12, linkedHashMap14, linkedHashMap16, linkedHashMap18, linkedHashMap20, v24, linkedHashMap22, linkedHashMap24, v27, linkedHashMap26, linkedHashMap28, v30, linkedHashMap30, linkedHashMap32, v33, linkedHashMap34, linkedHashMap36, v36, linkedHashMap38, linkedHashMap40, v39, arrayList2, linkedHashMap42, linkedHashMap68, linkedHashMap44, linkedHashMap46, linkedHashMap48, linkedHashMap50, linkedHashMap52, linkedHashMap54, linkedHashMap56, v4, linkedHashMap58, linkedHashMap60, linkedHashMap62, v51, linkedHashMap64, v53, linkedHashMap66, v55, null, v59, linkedHashMap70, linkedHashMap72, v58, v61, linkedHashMap74, v63, v64, j2, 0, 33554432, 0, null);
                                                                                                                                                                                                                                                                        } finally {
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    } catch (Throwable th) {
                                                                                                                                                                                                                                                                        if (th instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                                            throw th;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        throw new Serializer.DeserializationError(null, th);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                } catch (Throwable th2) {
                                                                                                                                                                                                                                                                    if (th2 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                                        throw th2;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    throw new Serializer.DeserializationError(null, th2);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            } catch (Throwable th3) {
                                                                                                                                                                                                                                                                if (th3 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                                    throw th3;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                throw new Serializer.DeserializationError(null, th3);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        } catch (Throwable th4) {
                                                                                                                                                                                                                                                            if (th4 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                                throw th4;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            throw new Serializer.DeserializationError(null, th4);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    } catch (Throwable th5) {
                                                                                                                                                                                                                                                        if (th5 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                            throw th5;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        throw new Serializer.DeserializationError(null, th5);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } catch (Throwable th6) {
                                                                                                                                                                                                                                                    if (th6 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                        throw th6;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    throw new Serializer.DeserializationError(null, th6);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } catch (Throwable th7) {
                                                                                                                                                                                                                                                if (th7 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                    throw th7;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                throw new Serializer.DeserializationError(null, th7);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } catch (Throwable th8) {
                                                                                                                                                                                                                                            if (th8 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                                throw th8;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            throw new Serializer.DeserializationError(null, th8);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } catch (Throwable th9) {
                                                                                                                                                                                                                                        if (th9 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                            throw th9;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        throw new Serializer.DeserializationError(null, th9);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } catch (Throwable th10) {
                                                                                                                                                                                                                                    if (th10 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                        throw th10;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    throw new Serializer.DeserializationError(null, th10);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } catch (Throwable th11) {
                                                                                                                                                                                                                                if (th11 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                    throw th11;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                throw new Serializer.DeserializationError(null, th11);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } catch (Throwable th12) {
                                                                                                                                                                                                                            if (th12 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                                throw th12;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw new Serializer.DeserializationError(null, th12);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } catch (Throwable th13) {
                                                                                                                                                                                                                        if (th13 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                            throw th13;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        throw new Serializer.DeserializationError(null, th13);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } catch (Throwable th14) {
                                                                                                                                                                                                                    if (th14 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                        throw th14;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw new Serializer.DeserializationError(null, th14);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th15) {
                                                                                                                                                                                                                if (th15 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                    throw th15;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw new Serializer.DeserializationError(null, th15);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th16) {
                                                                                                                                                                                                            if (th16 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                                throw th16;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw new Serializer.DeserializationError(null, th16);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th17) {
                                                                                                                                                                                                        if (th17 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                            throw th17;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw new Serializer.DeserializationError(null, th17);
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable th18) {
                                                                                                                                                                                                    if (th18 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                        throw th18;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw new Serializer.DeserializationError(null, th18);
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th19) {
                                                                                                                                                                                                if (th19 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                    throw th19;
                                                                                                                                                                                                }
                                                                                                                                                                                                throw new Serializer.DeserializationError(null, th19);
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th20) {
                                                                                                                                                                                            if (th20 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                                throw th20;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw new Serializer.DeserializationError(null, th20);
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th21) {
                                                                                                                                                                                        if (th21 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                            throw th21;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw new Serializer.DeserializationError(null, th21);
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th22) {
                                                                                                                                                                                    if (th22 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                        throw th22;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw new Serializer.DeserializationError(null, th22);
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th23) {
                                                                                                                                                                                if (th23 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                    throw th23;
                                                                                                                                                                                }
                                                                                                                                                                                throw new Serializer.DeserializationError(null, th23);
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th24) {
                                                                                                                                                                            if (th24 instanceof Serializer.DeserializationError) {
                                                                                                                                                                                throw th24;
                                                                                                                                                                            }
                                                                                                                                                                            throw new Serializer.DeserializationError(null, th24);
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th25) {
                                                                                                                                                                        if (th25 instanceof Serializer.DeserializationError) {
                                                                                                                                                                            throw th25;
                                                                                                                                                                        }
                                                                                                                                                                        throw new Serializer.DeserializationError(null, th25);
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th26) {
                                                                                                                                                                    if (th26 instanceof Serializer.DeserializationError) {
                                                                                                                                                                        throw th26;
                                                                                                                                                                    }
                                                                                                                                                                    throw new Serializer.DeserializationError(null, th26);
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th27) {
                                                                                                                                                                if (th27 instanceof Serializer.DeserializationError) {
                                                                                                                                                                    throw th27;
                                                                                                                                                                }
                                                                                                                                                                throw new Serializer.DeserializationError(null, th27);
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th28) {
                                                                                                                                                            if (th28 instanceof Serializer.DeserializationError) {
                                                                                                                                                                throw th28;
                                                                                                                                                            }
                                                                                                                                                            throw new Serializer.DeserializationError(null, th28);
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th29) {
                                                                                                                                                        if (th29 instanceof Serializer.DeserializationError) {
                                                                                                                                                            throw th29;
                                                                                                                                                        }
                                                                                                                                                        throw new Serializer.DeserializationError(null, th29);
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th30) {
                                                                                                                                                    if (th30 instanceof Serializer.DeserializationError) {
                                                                                                                                                        throw th30;
                                                                                                                                                    }
                                                                                                                                                    throw new Serializer.DeserializationError(null, th30);
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th31) {
                                                                                                                                                if (th31 instanceof Serializer.DeserializationError) {
                                                                                                                                                    throw th31;
                                                                                                                                                }
                                                                                                                                                throw new Serializer.DeserializationError(null, th31);
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th32) {
                                                                                                                                            if (th32 instanceof Serializer.DeserializationError) {
                                                                                                                                                throw th32;
                                                                                                                                            }
                                                                                                                                            throw new Serializer.DeserializationError(null, th32);
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th33) {
                                                                                                                                        if (th33 instanceof Serializer.DeserializationError) {
                                                                                                                                            throw th33;
                                                                                                                                        }
                                                                                                                                        throw new Serializer.DeserializationError(null, th33);
                                                                                                                                    }
                                                                                                                                } catch (Throwable th34) {
                                                                                                                                    if (th34 instanceof Serializer.DeserializationError) {
                                                                                                                                        throw th34;
                                                                                                                                    }
                                                                                                                                    throw new Serializer.DeserializationError(null, th34);
                                                                                                                                }
                                                                                                                            } catch (Throwable th35) {
                                                                                                                                if (th35 instanceof Serializer.DeserializationError) {
                                                                                                                                    throw th35;
                                                                                                                                }
                                                                                                                                throw new Serializer.DeserializationError(null, th35);
                                                                                                                            }
                                                                                                                        } catch (Throwable th36) {
                                                                                                                            if (th36 instanceof Serializer.DeserializationError) {
                                                                                                                                throw th36;
                                                                                                                            }
                                                                                                                            throw new Serializer.DeserializationError(null, th36);
                                                                                                                        }
                                                                                                                    } catch (Throwable th37) {
                                                                                                                        if (th37 instanceof Serializer.DeserializationError) {
                                                                                                                            throw th37;
                                                                                                                        }
                                                                                                                        throw new Serializer.DeserializationError(null, th37);
                                                                                                                    }
                                                                                                                } catch (Throwable th38) {
                                                                                                                    if (th38 instanceof Serializer.DeserializationError) {
                                                                                                                        throw th38;
                                                                                                                    }
                                                                                                                    throw new Serializer.DeserializationError(null, th38);
                                                                                                                }
                                                                                                            } catch (Throwable th39) {
                                                                                                                if (th39 instanceof Serializer.DeserializationError) {
                                                                                                                    throw th39;
                                                                                                                }
                                                                                                                throw new Serializer.DeserializationError(null, th39);
                                                                                                            }
                                                                                                        } catch (Throwable th40) {
                                                                                                            if (th40 instanceof Serializer.DeserializationError) {
                                                                                                                throw th40;
                                                                                                            }
                                                                                                            throw new Serializer.DeserializationError(null, th40);
                                                                                                        }
                                                                                                    } catch (Throwable th41) {
                                                                                                        if (th41 instanceof Serializer.DeserializationError) {
                                                                                                            throw th41;
                                                                                                        }
                                                                                                        throw new Serializer.DeserializationError(null, th41);
                                                                                                    }
                                                                                                } catch (Throwable th42) {
                                                                                                    if (th42 instanceof Serializer.DeserializationError) {
                                                                                                        throw th42;
                                                                                                    }
                                                                                                    throw new Serializer.DeserializationError(null, th42);
                                                                                                }
                                                                                            } catch (Throwable th43) {
                                                                                                if (th43 instanceof Serializer.DeserializationError) {
                                                                                                    throw th43;
                                                                                                }
                                                                                                throw new Serializer.DeserializationError(null, th43);
                                                                                            }
                                                                                        } catch (Throwable th44) {
                                                                                            if (th44 instanceof Serializer.DeserializationError) {
                                                                                                throw th44;
                                                                                            }
                                                                                            throw new Serializer.DeserializationError(null, th44);
                                                                                        }
                                                                                    } catch (Throwable th45) {
                                                                                        if (th45 instanceof Serializer.DeserializationError) {
                                                                                            throw th45;
                                                                                        }
                                                                                        throw new Serializer.DeserializationError(null, th45);
                                                                                    }
                                                                                } catch (Throwable th46) {
                                                                                    if (th46 instanceof Serializer.DeserializationError) {
                                                                                        throw th46;
                                                                                    }
                                                                                    throw new Serializer.DeserializationError(null, th46);
                                                                                }
                                                                            } catch (Throwable th47) {
                                                                                if (th47 instanceof Serializer.DeserializationError) {
                                                                                    throw th47;
                                                                                }
                                                                                throw new Serializer.DeserializationError(null, th47);
                                                                            }
                                                                        } catch (Throwable th48) {
                                                                            if (th48 instanceof Serializer.DeserializationError) {
                                                                                throw th48;
                                                                            }
                                                                            throw new Serializer.DeserializationError(null, th48);
                                                                        }
                                                                    } catch (Throwable th49) {
                                                                        if (th49 instanceof Serializer.DeserializationError) {
                                                                            throw th49;
                                                                        }
                                                                        throw new Serializer.DeserializationError(null, th49);
                                                                    }
                                                                } catch (Throwable th50) {
                                                                    if (th50 instanceof Serializer.DeserializationError) {
                                                                        throw th50;
                                                                    }
                                                                    throw new Serializer.DeserializationError(null, th50);
                                                                }
                                                            } catch (Throwable th51) {
                                                                if (th51 instanceof Serializer.DeserializationError) {
                                                                    throw th51;
                                                                }
                                                                throw new Serializer.DeserializationError(null, th51);
                                                            }
                                                        } catch (Throwable th52) {
                                                            if (th52 instanceof Serializer.DeserializationError) {
                                                                throw th52;
                                                            }
                                                            throw new Serializer.DeserializationError(null, th52);
                                                        }
                                                    } catch (Throwable th53) {
                                                        if (th53 instanceof Serializer.DeserializationError) {
                                                            throw th53;
                                                        }
                                                        throw new Serializer.DeserializationError(null, th53);
                                                    }
                                                } catch (Throwable th54) {
                                                    if (th54 instanceof Serializer.DeserializationError) {
                                                        throw th54;
                                                    }
                                                    throw new Serializer.DeserializationError(null, th54);
                                                }
                                            } catch (Throwable th55) {
                                                if (th55 instanceof Serializer.DeserializationError) {
                                                    throw th55;
                                                }
                                                throw new Serializer.DeserializationError(null, th55);
                                            }
                                        } catch (Throwable th56) {
                                            if (th56 instanceof Serializer.DeserializationError) {
                                                throw th56;
                                            }
                                            throw new Serializer.DeserializationError(null, th56);
                                        }
                                    } catch (Throwable th57) {
                                        if (th57 instanceof Serializer.DeserializationError) {
                                            throw th57;
                                        }
                                        throw new Serializer.DeserializationError(null, th57);
                                    }
                                } catch (Throwable th58) {
                                    if (th58 instanceof Serializer.DeserializationError) {
                                        throw th58;
                                    }
                                    throw new Serializer.DeserializationError(null, th58);
                                }
                            } catch (Throwable th59) {
                                if (th59 instanceof Serializer.DeserializationError) {
                                    throw th59;
                                }
                                throw new Serializer.DeserializationError(null, th59);
                            }
                        } catch (Throwable th60) {
                            if (th60 instanceof Serializer.DeserializationError) {
                                throw th60;
                            }
                            throw new Serializer.DeserializationError(null, th60);
                        }
                    } catch (Throwable th61) {
                        if (th61 instanceof Serializer.DeserializationError) {
                            throw th61;
                        }
                        throw new Serializer.DeserializationError(null, th61);
                    }
                } catch (Throwable th62) {
                    if (th62 instanceof Serializer.DeserializationError) {
                        throw th62;
                    }
                    throw new Serializer.DeserializationError(null, th62);
                }
            } catch (Throwable th63) {
                if (th63 instanceof Serializer.DeserializationError) {
                    throw th63;
                }
                throw new Serializer.DeserializationError(null, th63);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogExtendedData[i];
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class j extends PropertyReference1Impl {
        public static final j b = new j(CatalogStateInfo.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogStateInfo) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class j0 extends PropertyReference1Impl {
        public static final j0 b = new j0(AudioBook.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((AudioBook) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class k extends MutablePropertyReference1Impl {
        public static final k b = new k(UserProfile.class, "uid", "getUid()Lcom/vk/dto/common/id/UserId;", 0);

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((UserProfile) obj).c;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class k0 extends PropertyReference1Impl {
        public static final k0 b = new k0(GroupsCategory.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((GroupsCategory) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class l extends PropertyReference1Impl {
        public static final l b = new l(CatalogStateInfo.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogStateInfo) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class l0 extends PropertyReference1Impl {
        public static final l0 b = new l0(CatalogSearchEntityAnswer.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return String.valueOf(((CatalogSearchEntityAnswer) obj).c.getId());
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class m extends PropertyReference1Impl {
        public static final m b = new m(Thumb.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((Thumb) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class m0 extends PropertyReference1Impl {
        public static final m0 b = new m0(CatalogAudioStreamMix.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogAudioStreamMix) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements izs<GroupChat, String> {
        public static final n b = new n(1, GroupChat.class, "getGroupChatId", "getGroupChatId()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(GroupChat groupChat) {
            return groupChat.zb();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class n0 extends PropertyReference1Impl {
        public static final n0 b = new n0(QuestionnaireDto.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((QuestionnaireDto) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<Good, String> {
        public static final o b = new o(1, Good.class, "fullId", "fullId()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(Good good) {
            return good.Ab();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class o0 extends PropertyReference1Impl {
        public static final o0 b = new o0(AudioBookPerson.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((AudioBookPerson) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class p extends PropertyReference1Impl {
        public static final p b = new p(CatalogMarketGroupInfo.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogMarketGroupInfo) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class p0 extends PropertyReference1Impl {
        public static final p0 b = new p0(MarketInfo.class, "id", "getId()Ljava/lang/Integer;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((MarketInfo) obj).e;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class q extends PropertyReference1Impl {
        public static final q b = new q(CatalogNavigationTab.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogNavigationTab) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class q0 extends PropertyReference1Impl {
        public static final q0 b = new q0(SearchFilterItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((SearchFilterItem) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class r extends PropertyReference1Impl {
        public static final r b = new r(Curator.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((Curator) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class r0 extends MutablePropertyReference1Impl {
        public static final r0 b = new r0(ApiApplication.class, "id", "getId()Lcom/vk/dto/common/id/UserId;", 0);

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ApiApplication) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class s extends PropertyReference1Impl {
        public static final s b = new s(CatalogText.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogText) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class s0 extends PropertyReference1Impl {
        public static final s0 b = new s0(LiveCategory.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((LiveCategory) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class t extends PropertyReference1Impl {
        public static final t b = new t(Article.class, "oid", "getOid()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            Article article = (Article) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(article.c);
            sb.append('_');
            sb.append(article.b);
            return sb.toString();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class t0 extends PropertyReference1Impl {
        public static final t0 b = new t0(AdBlockItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((AdBlockItem) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements izs<FriendsLikedEpisode, String> {
        public static final u b = new u(1, FriendsLikedEpisode.class, "uniqId", "uniqId()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(FriendsLikedEpisode friendsLikedEpisode) {
            return friendsLikedEpisode.d.Fb();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class u0 extends PropertyReference1Impl {
        public static final u0 b = new u0(CatalogSportMatch.class, "matchId", "getMatchId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogSportMatch) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class v extends MutablePropertyReference1Impl {
        public static final v b = new v(Group.class, "id", "getId()Lcom/vk/dto/common/id/UserId;", 0);

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((Group) obj).c;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class v0 extends PropertyReference1Impl {
        public static final v0 b = new v0(CatalogAiAssistantItem.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((CatalogAiAssistantItem) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class w extends PropertyReference1Impl {
        public static final w b = new w(PodcastSliderItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((PodcastSliderItem) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class w0 extends PropertyReference1Impl {
        public static final w0 b = new w0(CatalogMovieItem.class, SignalingProtocol.KEY_MOVIE_ID, "getMovieId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((CatalogMovieItem) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class x extends MutablePropertyReference1Impl {
        public static final x b = new x(GroupLikes.class, "groupId", "getGroupId()Lcom/vk/dto/common/id/UserId;", 0);

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((GroupLikes) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class x0 extends PropertyReference1Impl {
        public static final x0 b = new x0(StickerPackPreview.class, "id", "getId()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Integer.valueOf(((StickerPackPreview) obj).b);
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class y extends PropertyReference1Impl {
        public static final y b = new y(CatalogHint.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogHint) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class y0 extends PropertyReference1Impl {
        public static final y0 b = new y0(VideoFile.class, "videoId", "getVideoId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((VideoFile) obj).a1();
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class z extends PropertyReference1Impl {
        public static final z b = new z(CatalogClassifiedYoulaCity.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogClassifiedYoulaCity) obj).b;
        }
    }

    /* compiled from: CatalogExtendedData.kt */
    public static final /* synthetic */ class z0 extends PropertyReference1Impl {
        public static final z0 b = new z0(ReactionSet.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ReactionSet) obj).b;
        }
    }

    public CatalogExtendedData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
    }

    public static void Hb(Serializer serializer, Map map) {
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c2 = io.reactivex.rxjava3.internal.operators.mixed.n.c(serializer, map);
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            serializer.j0((String) entry.getKey());
            serializer.i0((Serializer.StreamParcelable) entry.getValue());
        }
    }

    public final Object Ab(CatalogDataType catalogDataType, String str) {
        Object obj;
        StickerItem stickerItem;
        Object obj2;
        int i2 = h1.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        Map<String, UserProfile> map = this.b;
        Map<String, Group> map2 = this.c;
        switch (i2) {
            case 1:
            case 2:
                Group group = map2.get(str);
                if (group != null) {
                    if (fkq0.d(group.L)) {
                        group.M = map.get(String.valueOf(group.L.b));
                        return group;
                    }
                    if (fkq0.b(group.L)) {
                        group.N = map2.get(String.valueOf(-group.L.b));
                    }
                    return group;
                }
                return null;
            case 3:
                StickerStockItem stickerStockItem = this.v.get(str);
                if (stickerStockItem != null) {
                    return new StickerStockItemWithStickerId(stickerStockItem, Integer.parseInt(str));
                }
                Map<String, StickerPackPreview> map3 = this.u;
                if (!map3.isEmpty()) {
                    Iterator<T> it = map3.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            List<StickerItem> list = ((StickerPackPreview) obj).q;
                            if (list != null) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (epx.f(String.valueOf(((StickerItem) obj2).b), str)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                stickerItem = (StickerItem) obj2;
                            } else {
                                stickerItem = null;
                            }
                            if (stickerItem != null) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    StickerPackPreview stickerPackPreview = (StickerPackPreview) obj;
                    if (stickerPackPreview != null) {
                        return new StickerPackPreviewWithStickerId(stickerPackPreview, Integer.parseInt(str));
                    }
                }
                return null;
            case 4:
                Playlist playlist = this.j.get(str);
                RecommendedPlaylist recommendedPlaylist = this.k.get(str);
                if (playlist != null && recommendedPlaylist != null) {
                    return new PlaylistRecommendationData(playlist, recommendedPlaylist);
                }
                return null;
            case 5:
            case 6:
                UserProfile userProfile = map.get(str);
                return userProfile == null ? map2.get(String.valueOf(Math.abs(Long.parseLong(str)))) : userProfile;
            case 7:
                CatalogVideo catalogVideo = this.f.get(str);
                if (catalogVideo != null) {
                    return catalogVideo.c;
                }
                return null;
            case 8:
                return i5a.a(this, vp70.a.a(str));
            default:
                Map<String, ?> Db = Db(catalogDataType);
                if (Db != null) {
                    return Db.get(str);
                }
                return null;
        }
    }

    public final ArrayList Bb(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Artist artist = this.s.get((String) it.next());
            if (artist != null) {
                arrayList.add(artist);
            }
        }
        return arrayList;
    }

    public final CatalogHint Cb(String str) {
        if (str != null) {
            return this.H.get(str);
        }
        return null;
    }

    public final Map<String, ?> Db(CatalogDataType catalogDataType) {
        int i2 = h1.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        if (i2 != 1 && i2 != 2) {
            Map<String, AdBlockItem> map = this.k0;
            switch (i2) {
                case 9:
                case 10:
                    return this.e;
                case 11:
                case 12:
                case 13:
                    return this.o;
                case 14:
                case 15:
                    return this.d;
                case 16:
                    return this.X;
                case 17:
                    return this.K;
                case 18:
                    return this.j;
                case 19:
                    return this.l;
                case 20:
                    return this.m;
                case 21:
                    return this.n;
                case 22:
                    return this.i;
                case 23:
                case 24:
                    return this.p;
                case 25:
                    return this.q;
                case 26:
                    return this.r;
                case 27:
                case 28:
                case 29:
                    break;
                case 30:
                    return this.s;
                case 31:
                    Map<String, StickerPackPreview> map2 = this.u;
                    return map2.isEmpty() ? this.t : map2;
                case 32:
                    return this.w;
                case 33:
                    return this.x;
                case 34:
                    return this.y;
                case 35:
                case 36:
                case 37:
                    return this.z;
                case 38:
                    return this.A;
                case 39:
                    return this.B;
                case 40:
                    return this.C;
                case 41:
                    return this.D;
                case 42:
                    return this.E;
                case 43:
                    return this.F;
                case 44:
                    return this.G;
                case 45:
                    return this.I;
                case 46:
                    return this.J;
                case 47:
                    return this.L;
                case 48:
                    return this.O;
                case 49:
                    return this.Q;
                case 50:
                    return this.R;
                case 51:
                    return this.S;
                case 52:
                    return this.T;
                case 53:
                    return this.U;
                case 54:
                    return this.V;
                case 55:
                    return this.W;
                case 56:
                    return this.e0;
                case 57:
                    return this.c0;
                case 58:
                    return this.Y;
                case 59:
                    return this.Z;
                case 60:
                    return this.a0;
                case 61:
                    return this.g;
                case 62:
                    return this.j0;
                case 63:
                    return this.b0;
                case 64:
                    return this.d0;
                case 65:
                    return this.f0;
                case 66:
                    return this.P;
                case 67:
                    return this.i0;
                case 68:
                    return this.g0;
                case 69:
                case 70:
                    return map;
                case 71:
                    return this.h0;
                case 72:
                    return this.l0;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    return this.m0;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    return this.n0;
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    return this.o0;
                default:
                    return null;
            }
        }
        return this.c;
    }

    public final Map<String, MarketInfo> Eb() {
        return this.P;
    }

    public final LinkedHashMap Fb() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> Db = Db(CatalogDataType.DATA_TYPE_CATALOG_BANNERS);
        if (Db != null) {
            for (Map.Entry<String, ?> entry : Db.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof CatalogStateInfo) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }

    public final rba Gb(UserId... userIdArr) {
        return new rba((UserProfile) rli0.n(rli0.t(rl3.D(userIdArr), new mz(this, 20))), (Group) rli0.n(rli0.t(rl3.D(userIdArr), new w8(this, 16))));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Hb(serializer, this.b);
        Hb(serializer, this.c);
        Hb(serializer, this.d);
        Hb(serializer, this.X);
        Hb(serializer, this.e);
        Hb(serializer, this.f);
        Hb(serializer, this.g);
        Hb(serializer, this.h);
        Hb(serializer, this.i);
        Hb(serializer, this.j);
        Hb(serializer, this.k);
        Hb(serializer, this.l);
        Hb(serializer, this.m);
        Hb(serializer, this.n);
        Hb(serializer, this.o);
        Hb(serializer, this.p);
        Hb(serializer, this.q);
        Hb(serializer, this.r);
        Hb(serializer, this.s);
        Hb(serializer, this.t);
        Hb(serializer, this.u);
        Hb(serializer, this.v);
        Hb(serializer, this.w);
        Hb(serializer, this.x);
        Hb(serializer, this.y);
        Hb(serializer, this.z);
        Hb(serializer, this.A);
        Hb(serializer, this.B);
        Hb(serializer, this.C);
        Hb(serializer, this.D);
        Hb(serializer, this.E);
        Hb(serializer, this.F);
        Hb(serializer, this.G);
        Hb(serializer, this.H);
        Hb(serializer, this.I);
        Hb(serializer, this.J);
        Hb(serializer, this.K);
        Hb(serializer, this.L);
        Hb(serializer, this.M);
        serializer.o0(j5g.O0(this.N));
        Hb(serializer, this.O);
        Hb(serializer, this.Q);
        Hb(serializer, this.R);
        Hb(serializer, this.S);
        Hb(serializer, this.T);
        Hb(serializer, this.U);
        Hb(serializer, this.V);
        Map<String, AudioBook> map = this.W;
        Hb(serializer, map);
        Hb(serializer, this.Y);
        Hb(serializer, this.Z);
        Hb(serializer, this.a0);
        Hb(serializer, this.b0);
        Hb(serializer, this.c0);
        Hb(serializer, this.d0);
        Hb(serializer, map);
        Hb(serializer, this.f0);
        Hb(serializer, this.P);
        Hb(serializer, this.h0);
        Hb(serializer, this.i0);
        Hb(serializer, this.j0);
        Hb(serializer, this.k0);
        Hb(serializer, this.l0);
        Hb(serializer, this.m0);
        Hb(serializer, this.n0);
        Hb(serializer, this.o0);
        serializer.o0(j5g.O0(this.p0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogExtendedData)) {
            return false;
        }
        CatalogExtendedData catalogExtendedData = (CatalogExtendedData) obj;
        return epx.f(this.b, catalogExtendedData.b) && epx.f(this.c, catalogExtendedData.c) && epx.f(this.d, catalogExtendedData.d) && epx.f(this.e, catalogExtendedData.e) && epx.f(this.f, catalogExtendedData.f) && epx.f(this.g, catalogExtendedData.g) && epx.f(this.h, catalogExtendedData.h) && epx.f(this.i, catalogExtendedData.i) && epx.f(this.j, catalogExtendedData.j) && epx.f(this.k, catalogExtendedData.k) && epx.f(this.l, catalogExtendedData.l) && epx.f(this.m, catalogExtendedData.m) && epx.f(this.n, catalogExtendedData.n) && epx.f(this.o, catalogExtendedData.o) && epx.f(this.p, catalogExtendedData.p) && epx.f(this.q, catalogExtendedData.q) && epx.f(this.r, catalogExtendedData.r) && epx.f(this.s, catalogExtendedData.s) && epx.f(this.t, catalogExtendedData.t) && epx.f(this.u, catalogExtendedData.u) && epx.f(this.v, catalogExtendedData.v) && epx.f(this.w, catalogExtendedData.w) && epx.f(this.x, catalogExtendedData.x) && epx.f(this.y, catalogExtendedData.y) && epx.f(this.z, catalogExtendedData.z) && epx.f(this.A, catalogExtendedData.A) && epx.f(this.B, catalogExtendedData.B) && epx.f(this.C, catalogExtendedData.C) && epx.f(this.D, catalogExtendedData.D) && epx.f(this.E, catalogExtendedData.E) && epx.f(this.F, catalogExtendedData.F) && epx.f(this.G, catalogExtendedData.G) && epx.f(this.H, catalogExtendedData.H) && epx.f(this.I, catalogExtendedData.I) && epx.f(this.J, catalogExtendedData.J) && epx.f(this.K, catalogExtendedData.K) && epx.f(this.L, catalogExtendedData.L) && epx.f(this.M, catalogExtendedData.M) && epx.f(this.N, catalogExtendedData.N) && epx.f(this.O, catalogExtendedData.O) && epx.f(this.P, catalogExtendedData.P) && epx.f(this.Q, catalogExtendedData.Q) && epx.f(this.R, catalogExtendedData.R) && epx.f(this.S, catalogExtendedData.S) && epx.f(this.T, catalogExtendedData.T) && epx.f(this.U, catalogExtendedData.U) && epx.f(this.V, catalogExtendedData.V) && epx.f(this.W, catalogExtendedData.W) && epx.f(this.X, catalogExtendedData.X) && epx.f(this.Y, catalogExtendedData.Y) && epx.f(this.Z, catalogExtendedData.Z) && epx.f(this.a0, catalogExtendedData.a0) && epx.f(this.b0, catalogExtendedData.b0) && epx.f(this.c0, catalogExtendedData.c0) && epx.f(this.d0, catalogExtendedData.d0) && epx.f(this.e0, catalogExtendedData.e0) && epx.f(this.f0, catalogExtendedData.f0) && epx.f(this.g0, catalogExtendedData.g0) && epx.f(this.h0, catalogExtendedData.h0) && epx.f(this.i0, catalogExtendedData.i0) && epx.f(this.j0, catalogExtendedData.j0) && epx.f(this.k0, catalogExtendedData.k0) && epx.f(this.l0, catalogExtendedData.l0) && epx.f(this.m0, catalogExtendedData.m0) && epx.f(this.n0, catalogExtendedData.n0) && epx.f(this.o0, catalogExtendedData.o0) && epx.f(this.p0, catalogExtendedData.p0);
    }

    public final int hashCode() {
        return this.p0.hashCode() + v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(fw3.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P), 31, this.Q), 31, this.R), 31, this.S), 31, this.T), 31, this.U), 31, this.V), 31, this.W), 31, this.X), 31, this.Y), 31, this.Z), 31, this.a0), 31, this.b0), 31, this.c0), 31, this.d0), 31, this.e0), 31, this.f0), 31, this.g0), 31, this.h0), 31, this.i0), 31, this.j0), 31, this.k0), 31, this.l0), 31, this.m0), 31, this.n0), 31, this.o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogExtendedData(profiles=");
        sb.append(this.b);
        sb.append(", groups=");
        sb.append(this.c);
        sb.append(", miniApps=");
        sb.append(this.d);
        sb.append(", videos=");
        sb.append(this.e);
        sb.append(", catalogVideos=");
        sb.append(this.f);
        sb.append(", topshelfItems=");
        sb.append(this.g);
        sb.append(", videoShowcaseMetaInfo=");
        sb.append(this.h);
        sb.append(", albums=");
        sb.append(this.i);
        sb.append(", playlists=");
        sb.append(this.j);
        sb.append(", recommendedPlaylists=");
        sb.append(this.k);
        sb.append(", audioFollowingsUpdateInfo=");
        sb.append(this.l);
        sb.append(", audioFollowingsUpdateItems=");
        sb.append(this.m);
        sb.append(", musicOwners=");
        sb.append(this.n);
        sb.append(", audios=");
        sb.append(this.o);
        sb.append(", suggestions=");
        sb.append(this.p);
        sb.append(", links=");
        sb.append(this.q);
        sb.append(", userMetas=");
        sb.append(this.r);
        sb.append(", artists=");
        sb.append(this.s);
        sb.append(", stickers=");
        sb.append(this.t);
        sb.append(", stickersPreviews=");
        sb.append(this.u);
        sb.append(", stickerPackByStickerId=");
        sb.append(this.v);
        sb.append(", stickersBanners=");
        sb.append(this.w);
        sb.append(", stickersInfo=");
        sb.append(this.x);
        sb.append(", thumbs=");
        sb.append(this.y);
        sb.append(", placeholders=");
        sb.append(this.z);
        sb.append(", groupsChats=");
        sb.append(this.A);
        sb.append(", marketItems=");
        sb.append(this.B);
        sb.append(", marketGroupInfoItems=");
        sb.append(this.C);
        sb.append(", navigationTabs=");
        sb.append(this.D);
        sb.append(", curators=");
        sb.append(this.E);
        sb.append(", texts=");
        sb.append(this.F);
        sb.append(", friendsLikes=");
        sb.append(this.G);
        sb.append(", hints=");
        sb.append(this.H);
        sb.append(", articles=");
        sb.append(this.I);
        sb.append(", friendsLikedEpisodes=");
        sb.append(this.J);
        sb.append(", podcastSliderItem=");
        sb.append(this.K);
        sb.append(", classifiedsCities=");
        sb.append(this.L);
        sb.append(", classifiedsCategoryTrees=");
        sb.append(this.M);
        sb.append(", classifiedsCategoryMappings=");
        sb.append(this.N);
        sb.append(", signalInfos=");
        sb.append(this.O);
        sb.append(", marketInfos=");
        sb.append(this.P);
        sb.append(", searchSpellcheckResults=");
        sb.append(this.Q);
        sb.append(", podcasts=");
        sb.append(this.R);
        sb.append(", offlinePodcasts=");
        sb.append(this.S);
        sb.append(", extendedPodcast=");
        sb.append(this.T);
        sb.append(", groupCollections=");
        sb.append(this.U);
        sb.append(", radioStations=");
        sb.append(this.V);
        sb.append(", audioBooks=");
        sb.append(this.W);
        sb.append(", games=");
        sb.append(this.X);
        sb.append(", groupsCategories=");
        sb.append(this.Y);
        sb.append(", newsfeedItems=");
        sb.append(this.Z);
        sb.append(", wallItems=");
        sb.append(this.a0);
        sb.append(", searchEntityAnswers=");
        sb.append(this.b0);
        sb.append(", audioStreamMixes=");
        sb.append(this.c0);
        sb.append(", feedbacks=");
        sb.append(this.d0);
        sb.append(", audioBookPersons=");
        sb.append(this.e0);
        sb.append(", audioContentCards=");
        sb.append(this.f0);
        sb.append(", searchFilters=");
        sb.append(this.g0);
        sb.append(", concerts=");
        sb.append(this.h0);
        sb.append(", categories=");
        sb.append(this.i0);
        sb.append(", videoMusicStreamMixes=");
        sb.append(this.j0);
        sb.append(", bannersAds=");
        sb.append(this.k0);
        sb.append(", channels=");
        sb.append(this.l0);
        sb.append(", sportsMatches=");
        sb.append(this.m0);
        sb.append(", aiAssistantItem=");
        sb.append(this.n0);
        sb.append(", movies=");
        sb.append(this.o0);
        sb.append(", uxPollData=");
        return ms9.a(')', sb, this.p0);
    }

    public final void zb(CatalogExtendedData catalogExtendedData) {
        this.b.putAll(catalogExtendedData.b);
        this.c.putAll(catalogExtendedData.c);
        this.d.putAll(catalogExtendedData.d);
        this.X.putAll(catalogExtendedData.X);
        this.e.putAll(catalogExtendedData.e);
        this.f.putAll(catalogExtendedData.f);
        this.g.putAll(catalogExtendedData.g);
        this.h.putAll(catalogExtendedData.h);
        this.i.putAll(catalogExtendedData.i);
        this.j.putAll(catalogExtendedData.j);
        this.k.putAll(catalogExtendedData.k);
        this.l.putAll(catalogExtendedData.l);
        this.m.putAll(catalogExtendedData.m);
        this.n.putAll(catalogExtendedData.n);
        this.o.putAll(catalogExtendedData.o);
        this.p.putAll(catalogExtendedData.p);
        this.q.putAll(catalogExtendedData.q);
        this.r.putAll(catalogExtendedData.r);
        this.s.putAll(catalogExtendedData.s);
        this.t.putAll(catalogExtendedData.t);
        this.u.putAll(catalogExtendedData.u);
        this.v.putAll(catalogExtendedData.v);
        this.w.putAll(catalogExtendedData.w);
        this.x.putAll(catalogExtendedData.x);
        this.y.putAll(catalogExtendedData.y);
        this.z.putAll(catalogExtendedData.z);
        this.A.putAll(catalogExtendedData.A);
        this.B.putAll(catalogExtendedData.B);
        this.C.putAll(catalogExtendedData.C);
        this.D.putAll(catalogExtendedData.D);
        this.E.putAll(catalogExtendedData.E);
        this.F.putAll(catalogExtendedData.F);
        this.G.putAll(catalogExtendedData.G);
        this.H.putAll(catalogExtendedData.H);
        this.I.putAll(catalogExtendedData.I);
        this.J.putAll(catalogExtendedData.J);
        this.K.putAll(catalogExtendedData.K);
        this.L.putAll(catalogExtendedData.L);
        this.M.putAll(catalogExtendedData.M);
        this.N.addAll(catalogExtendedData.N);
        this.O.putAll(catalogExtendedData.O);
        this.R.putAll(catalogExtendedData.R);
        this.S.putAll(catalogExtendedData.S);
        this.T.putAll(catalogExtendedData.T);
        this.U.putAll(catalogExtendedData.U);
        this.V.putAll(catalogExtendedData.V);
        this.W.putAll(catalogExtendedData.W);
        this.Y.putAll(catalogExtendedData.Y);
        this.Z.putAll(catalogExtendedData.Z);
        this.a0.putAll(catalogExtendedData.a0);
        this.b0.putAll(catalogExtendedData.b0);
        this.c0.putAll(catalogExtendedData.c0);
        this.d0.putAll(catalogExtendedData.d0);
        this.f0.putAll(catalogExtendedData.f0);
        this.P.putAll(catalogExtendedData.P);
        this.h0.putAll(catalogExtendedData.h0);
        this.i0.putAll(catalogExtendedData.i0);
        this.k0.putAll(catalogExtendedData.k0);
        this.j0.putAll(catalogExtendedData.j0);
        this.l0.putAll(catalogExtendedData.l0);
        this.m0.putAll(catalogExtendedData.m0);
        this.n0.putAll(catalogExtendedData.n0);
        this.o0.putAll(catalogExtendedData.o0);
        this.p0.addAll(catalogExtendedData.p0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogExtendedData(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10, Map map11, Map map12, Map map13, Map map14, Map map15, Map map16, Map map17, Map map18, Map map19, Map map20, Map map21, Map map22, Map map23, Map map24, Map map25, Map map26, Map map27, Map map28, Map map29, Map map30, Map map31, Map map32, Map map33, Map map34, Map map35, Map map36, Map map37, Map map38, List list, Map map39, Map map40, Map map41, Map map42, Map map43, Map map44, Map map45, Map map46, Map map47, Map map48, Map map49, Map map50, Map map51, Map map52, Map map53, Map map54, Map map55, Map map56, Map map57, Map map58, Map map59, Map map60, Map map61, Map map62, Map map63, Map map64, Map map65, List list2, int i2, int i3, int i4, zcl zclVar) {
        this(r2, (i2 & 2) != 0 ? new HashMap() : map2, (i2 & 4) != 0 ? new HashMap() : map3, (i2 & 8) != 0 ? new HashMap() : map4, (i2 & 16) != 0 ? new HashMap() : map5, (i2 & 32) != 0 ? new HashMap() : map6, (i2 & 64) != 0 ? new HashMap() : map7, (i2 & 128) != 0 ? new HashMap() : map8, (i2 & 256) != 0 ? new HashMap() : map9, (i2 & 512) != 0 ? new HashMap() : map10, (i2 & 1024) != 0 ? new HashMap() : map11, (i2 & 2048) != 0 ? new HashMap() : map12, (i2 & 4096) != 0 ? new HashMap() : map13, (i2 & 8192) != 0 ? new HashMap() : map14, (i2 & 16384) != 0 ? new HashMap() : map15, (i2 & 32768) != 0 ? new HashMap() : map16, (i2 & 65536) != 0 ? new HashMap() : map17, (i2 & 131072) != 0 ? new HashMap() : map18, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? new HashMap() : map19, (i2 & 524288) != 0 ? new HashMap() : map20, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? new HashMap() : map21, (i2 & 2097152) != 0 ? new HashMap() : map22, (i2 & 4194304) != 0 ? new HashMap() : map23, (i2 & 8388608) != 0 ? new HashMap() : map24, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? new HashMap() : map25, (i2 & 33554432) != 0 ? new HashMap() : map26, (i2 & 67108864) != 0 ? new HashMap() : map27, (i2 & 134217728) != 0 ? new HashMap() : map28, (i2 & 268435456) != 0 ? new HashMap() : map29, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? new HashMap() : map30, (i2 & 1073741824) != 0 ? new HashMap() : map31, (i2 & Integer.MIN_VALUE) != 0 ? new HashMap() : map32, (i3 & 1) != 0 ? new HashMap() : map33, (i3 & 2) != 0 ? new HashMap() : map34, (i3 & 4) != 0 ? new HashMap() : map35, (i3 & 8) != 0 ? new HashMap() : map36, (i3 & 16) != 0 ? new HashMap() : map37, (i3 & 32) != 0 ? new HashMap() : map38, (i3 & 64) != 0 ? new ArrayList() : list, (i3 & 128) != 0 ? new HashMap() : map39, (i3 & 256) != 0 ? new HashMap() : map40, (i3 & 512) != 0 ? new HashMap() : map41, (i3 & 1024) != 0 ? new HashMap() : map42, (i3 & 2048) != 0 ? new HashMap() : map43, (i3 & 4096) != 0 ? new HashMap() : map44, (i3 & 8192) != 0 ? new HashMap() : map45, (i3 & 16384) != 0 ? new HashMap() : map46, (i3 & 32768) != 0 ? new HashMap() : map47, (i3 & 65536) != 0 ? new HashMap() : map48, (i3 & 131072) != 0 ? new HashMap() : map49, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? new HashMap() : map50, (i3 & 524288) != 0 ? new HashMap() : map51, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? new HashMap() : map52, (i3 & 2097152) != 0 ? new HashMap() : map53, (i3 & 4194304) != 0 ? new HashMap() : map54, (i3 & 8388608) != 0 ? new HashMap() : map55, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? new HashMap() : map56, (i3 & 33554432) != 0 ? new HashMap() : map57, (i3 & 67108864) != 0 ? new HashMap() : map58, (i3 & 134217728) != 0 ? new HashMap() : map59, (i3 & 268435456) != 0 ? new HashMap() : map60, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? new HashMap() : map61, (i3 & 1073741824) != 0 ? new HashMap() : map62, (i3 & Integer.MIN_VALUE) != 0 ? new HashMap() : map63, (i4 & 1) != 0 ? new HashMap() : map64, (i4 & 2) != 0 ? new HashMap() : map65, (i4 & 4) != 0 ? new ArrayList() : list2);
        Map hashMap = (i2 & 1) != 0 ? new HashMap() : map;
    }

    public CatalogExtendedData(Map<String, UserProfile> map, Map<String, Group> map2, Map<String, ApiApplication> map3, Map<String, VideoFile> map4, Map<String, CatalogVideo> map5, Map<String, TopshelfItem> map6, Map<String, ShowcaseListItem> map7, Map<String, VideoAlbum> map8, Map<String, Playlist> map9, Map<String, RecommendedPlaylist> map10, Map<String, AudioFollowingsUpdateInfo> map11, Map<String, AudioFollowingsUpdateItem> map12, Map<String, MusicOwner> map13, Map<String, MusicTrack> map14, Map<String, SearchSuggestion> map15, Map<String, CatalogLink> map16, Map<String, CatalogUserMeta> map17, Map<String, Artist> map18, Map<String, StickerStockItem> map19, Map<String, StickerPackPreview> map20, Map<String, StickerStockItem> map21, Map<String, Banner> map22, Map<String, StickersInfo> map23, Map<String, Thumb> map24, Map<String, CatalogStateInfo> map25, Map<String, GroupChat> map26, Map<String, Good> map27, Map<String, CatalogMarketGroupInfo> map28, Map<String, CatalogNavigationTab> map29, Map<String, Curator> map30, Map<String, CatalogText> map31, Map<String, GroupLikes> map32, Map<String, CatalogHint> map33, Map<String, Article> map34, Map<String, FriendsLikedEpisode> map35, Map<String, PodcastSliderItem> map36, Map<String, CatalogClassifiedYoulaCity> map37, Map<String, CatalogMarketCategory> map38, List<CatalogMarketCategoryMappings> list, Map<String, MusicSignalInfo> map39, Map<String, MarketInfo> map40, Map<String, CatalogSearchSpellcheckResult> map41, Map<String, Podcast> map42, Map<String, OfflinePodcast> map43, Map<String, ExtendedPodcast> map44, Map<String, GroupCollection> map45, Map<String, RadioStation> map46, Map<String, AudioBook> map47, Map<String, ApiApplication> map48, Map<String, GroupsCategory> map49, Map<String, CatalogNewsEntry> map50, Map<String, CatalogNewsEntry> map51, Map<String, CatalogSearchEntityAnswer> map52, Map<String, CatalogAudioStreamMix> map53, Map<String, QuestionnaireDto> map54, Map<String, AudioBookPerson> map55, Map<String, CatalogAudioContentCard> map56, Map<String, SearchFilterItem> map57, Map<String, CatalogConcertItem> map58, Map<String, LiveCategory> map59, Map<String, VideoMusicStreamMixItem> map60, Map<String, AdBlockItem> map61, Map<String, CatalogChannel> map62, Map<String, CatalogSportMatch> map63, Map<String, CatalogAiAssistantItem> map64, Map<String, CatalogMovieItem> map65, List<UxPollData> list2) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.g = map6;
        this.h = map7;
        this.i = map8;
        this.j = map9;
        this.k = map10;
        this.l = map11;
        this.m = map12;
        this.n = map13;
        this.o = map14;
        this.p = map15;
        this.q = map16;
        this.r = map17;
        this.s = map18;
        this.t = map19;
        this.u = map20;
        this.v = map21;
        this.w = map22;
        this.x = map23;
        this.y = map24;
        this.z = map25;
        this.A = map26;
        this.B = map27;
        this.C = map28;
        this.D = map29;
        this.E = map30;
        this.F = map31;
        this.G = map32;
        this.H = map33;
        this.I = map34;
        this.J = map35;
        this.K = map36;
        this.L = map37;
        this.M = map38;
        this.N = list;
        this.O = map39;
        this.P = map40;
        this.Q = map41;
        this.R = map42;
        this.S = map43;
        this.T = map44;
        this.U = map45;
        this.V = map46;
        this.W = map47;
        this.X = map48;
        this.Y = map49;
        this.Z = map50;
        this.a0 = map51;
        this.b0 = map52;
        this.c0 = map53;
        this.d0 = map54;
        this.e0 = map55;
        this.f0 = map56;
        this.g0 = map57;
        this.h0 = map58;
        this.i0 = map59;
        this.j0 = map60;
        this.k0 = map61;
        this.l0 = map62;
        this.m0 = map63;
        this.n0 = map64;
        this.o0 = map65;
        this.p0 = list2;
        this.q0 = new com.vk.catalog2.common.dto.api.hint.a();
    }

    public CatalogExtendedData(JSONObject jSONObject) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
        Map s2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        JSONArray jSONArray;
        int i2;
        int i3;
        List list;
        String str3;
        JSONArray jSONArray2;
        int i4;
        Owner owner;
        int i5;
        ArrayList arrayList3;
        Owner owner2;
        Artist artist;
        int i6;
        ArrayList arrayList4;
        VideoFileOld videoFileOld;
        g1.a(jSONObject, UserProfile.g0, "profiles", this.b, k.b);
        g1.a(jSONObject, Group.z0, "groups", this.c, v.b);
        ApiApplication.b bVar = ApiApplication.k0;
        g1.a(jSONObject, bVar, "mini_apps", this.d, g0.b);
        g1.a(jSONObject, bVar, "games", this.X, r0.b);
        Map<String, VideoFile> map = this.e;
        Map<String, UserProfile> map2 = this.b;
        Map<String, Group> map3 = this.c;
        y0 y0Var = y0.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(new UserId(Long.parseLong((String) entry.getKey())), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(map3.size()));
        Iterator<T> it2 = map3.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(new UserId(Long.parseLong((String) entry2.getKey())), entry2.getValue());
        }
        String str4 = "videos";
        JSONArray optJSONArray = jSONObject.optJSONArray("videos");
        if (optJSONArray != null) {
            ArrayList arrayList5 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                arrayList5.add(com.vk.dto.common.c.c(optJSONArray.getJSONObject(i7), linkedHashMap, linkedHashMap2, null));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                VideoFile videoFile = (VideoFile) it3.next();
                map.put(String.valueOf(y0Var.invoke(videoFile)), videoFile);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("catalog_videos");
        String str5 = "title";
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i8 = 0; i8 < length2; i8++) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i8);
                JSONArray optJSONArray3 = jSONObject2.optJSONArray("snippet_marks");
                if (optJSONArray3 != null) {
                    arrayList4 = new ArrayList(optJSONArray3.length());
                    int length3 = optJSONArray3.length();
                    for (int i9 = 0; i9 < length3; i9++) {
                        arrayList4.add(optJSONArray3.getJSONObject(i9).getString("title"));
                    }
                } else {
                    arrayList4 = null;
                }
                JSONObject optJSONObject = jSONObject2.optJSONObject("video");
                if (optJSONObject != null) {
                    VideoFileOld.a aVar = VideoFileOld.z1;
                    videoFileOld = com.vk.dto.common.c.b(optJSONObject);
                    Owner owner3 = videoFileOld.v0;
                    if (owner3 == null) {
                        rba Gb = Gb(videoFileOld.b);
                        Group group = Gb.b;
                        if (group != null) {
                            owner3 = tsj.a(group);
                        } else {
                            UserProfile userProfile = Gb.a;
                            owner3 = userProfile != null ? userProfile.l0() : null;
                        }
                    }
                    videoFileOld.f1(owner3);
                } else {
                    videoFileOld = null;
                }
                if (videoFileOld != null) {
                    this.f.put(videoFileOld.a1(), new CatalogVideo(arrayList4 == null ? EmptyList.b : arrayList4, videoFileOld));
                }
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("topshelf_items");
        if (optJSONArray4 != null) {
            int length4 = optJSONArray4.length();
            for (int i10 = 0; i10 < length4; i10++) {
                TopshelfItem topshelfItem = new TopshelfItem(optJSONArray4.getJSONObject(i10));
                VideoFile videoFile2 = topshelfItem.d;
                if (videoFile2 != null) {
                    Owner s3 = videoFile2.s();
                    if (s3 == null) {
                        rba Gb2 = Gb(videoFile2.I0());
                        Group group2 = Gb2.b;
                        if (group2 != null) {
                            s3 = tsj.a(group2);
                        } else {
                            UserProfile userProfile2 = Gb2.a;
                            s3 = userProfile2 != null ? userProfile2.l0() : null;
                        }
                    }
                    videoFile2.f1(s3);
                }
                String str6 = topshelfItem.b;
                if (str6 != null) {
                    this.g.put(str6, topshelfItem);
                }
            }
        }
        JSONArray optJSONArray5 = jSONObject.optJSONArray("video_showcase_meta_info");
        if (optJSONArray5 != null) {
            int length5 = optJSONArray5.length();
            for (int i11 = 0; i11 < length5; i11++) {
                ShowcaseListItem showcaseListItem = new ShowcaseListItem(optJSONArray5.getJSONObject(i11));
                this.h.put(showcaseListItem.b, showcaseListItem);
            }
        }
        VideoFileOld.a aVar2 = VideoFileOld.z1;
        g1.a(jSONObject, aVar2, "artist_videos", this.e, c1.b);
        g1.a(jSONObject, aVar2, "shopping_videos", this.e, d1.b);
        JSONArray optJSONArray6 = jSONObject.optJSONArray("albums");
        JSONArray optJSONArray7 = jSONObject.optJSONArray("video_playlists_meta_info");
        if (optJSONArray7 == null) {
            s2 = jgp.b;
        } else {
            ArrayList arrayList6 = new ArrayList(optJSONArray7.length());
            int length6 = optJSONArray7.length();
            for (int i12 = 0; i12 < length6; i12++) {
                VideoAlbumExtendedInfo videoAlbumExtendedInfo = new VideoAlbumExtendedInfo(optJSONArray7.getJSONObject(i12), new ec(this, 18));
                arrayList6.add(new Pair(videoAlbumExtendedInfo.b, videoAlbumExtendedInfo));
            }
            s2 = pn00.s(arrayList6);
        }
        if (optJSONArray6 != null) {
            int length7 = optJSONArray6.length();
            for (int i13 = 0; i13 < length7; i13++) {
                VideoAlbum videoAlbum = new VideoAlbum(optJSONArray6.getJSONObject(i13), new uw4(1, s2, Map.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0, 2));
                this.i.put(videoAlbum.zb(), videoAlbum);
            }
        }
        g1.a(jSONObject, Playlist.Q, "playlists", this.j, e1.b);
        g1.a(jSONObject, RecommendedPlaylist.l, "recommended_playlists", this.k, f1.b);
        g1.a(jSONObject, CatalogAudioContentCard.i, "audio_content_cards", this.f0, a.b);
        g1.a(jSONObject, AudioFollowingsUpdateInfo.e, "audio_followings_update_info", this.l, b.b);
        g1.a(jSONObject, AudioFollowingsUpdateItem.h, "audio_followings_update_item", this.m, c.b);
        g1.a(jSONObject, MusicOwner.h, "music_owners", this.n, d.b);
        MusicTrack.b bVar2 = MusicTrack.e0;
        g1.a(jSONObject, bVar2, "audios", this.o, d5a.b);
        g1.a(jSONObject, new g5a(), "short_video_audios", this.o, e5a.b);
        g1.a(jSONObject, bVar2, "podcast_episodes", this.o, f5a.b);
        g1.a(jSONObject, SearchSuggestion.l, "suggestions", this.p, h5a.b);
        g1.a(jSONObject, CatalogLink.o, "links", this.q, e.b);
        g1.a(jSONObject, CatalogUserMeta.n, "catalog_users", this.r, f.b);
        g1.a(jSONObject, Artist.o, "artists", this.s, g.b);
        g1.a(jSONObject, Banner.f, "stickers_banners", this.w, h.b);
        g1.a(jSONObject, StickersInfo.d, "stickers_info", this.x, i.b);
        CatalogStateInfo.a aVar3 = CatalogStateInfo.s;
        g1.a(jSONObject, aVar3, "placeholders", this.z, j.b);
        g1.a(jSONObject, aVar3, "catalog_banners", this.z, l.b);
        g1.a(jSONObject, Thumb.f, "thumbs", this.y, m.b);
        g1.a(jSONObject, GroupChat.m, "groups_chats", this.A, n.b);
        g1.a(jSONObject, Good.p0, "market_items", this.B, o.b);
        g1.a(jSONObject, CatalogMarketGroupInfo.h, "group_catalog_items", this.C, p.b);
        g1.a(jSONObject, CatalogNavigationTab.m, "navigation_tabs", this.D, q.b);
        g1.a(jSONObject, Curator.j, "curators", this.E, r.b);
        g1.a(jSONObject, CatalogText.f, "texts", this.F, s.b);
        g1.a(jSONObject, Article.w, "longreads", this.I, t.b);
        g1.a(jSONObject, FriendsLikedEpisode.e, "friends_liked_episodes", this.J, u.b);
        g1.a(jSONObject, PodcastSliderItem.e, "podcast_slider_items", this.K, w.b);
        g1.a(jSONObject, GroupLikes.g, "groups_friends_likes", this.G, x.b);
        g1.a(jSONObject, this.q0, "hints", this.H, y.b);
        g1.a(jSONObject, CatalogClassifiedYoulaCity.f, "classifieds_cities", this.L, z.b);
        g1.a(jSONObject, CatalogMarketCategory.h, "classifieds_category_tree", this.M, a0.b);
        g1.a(jSONObject, MusicSignalInfo.h, "audio_signal_common_info", this.O, b0.b);
        g1.a(jSONObject, CatalogSearchSpellcheckResult.j, "search_spellcheckers", this.Q, c0.b);
        g1.a(jSONObject, Podcast.o, "podcasts", this.R, d0.b);
        g1.a(jSONObject, OfflinePodcast.e, "offline_podcasts", this.S, e0.b);
        g1.a(jSONObject, ExtendedPodcast.g, "extended_podcasts", this.T, f0.b);
        g1.a(jSONObject, GroupCollection.n, "group_collection_items", this.U, h0.b);
        g1.a(jSONObject, RadioStation.j, "radio_stations", this.V, i0.b);
        g1.a(jSONObject, AudioBook.x, "audio_books", this.W, j0.b);
        g1.a(jSONObject, GroupsCategory.i, "group_category_items", this.Y, k0.b);
        g1.a(jSONObject, CatalogSearchEntityAnswer.d, "search_entity_items", this.b0, l0.b);
        g1.a(jSONObject, CatalogAudioStreamMix.j, "audio_stream_mixes", this.c0, m0.b);
        g1.a(jSONObject, fqe0.a, "feedbacks", this.d0, n0.b);
        g1.a(jSONObject, AudioBookPerson.h, "audio_books_persons", this.e0, o0.b);
        g1.a(jSONObject, MarketInfo.i, "market_infos", this.P, p0.b);
        g1.a(jSONObject, SearchFilterItem.o, "search_filters", this.g0, q0.b);
        g1.a(jSONObject, CatalogConcertItem.e, "concerts", this.h0, new rd1(4));
        g1.a(jSONObject, LiveCategory.g, "vklive_categories", this.i0, s0.b);
        g1.a(jSONObject, AdBlockItem.e, "catalog_ad_blocks", this.k0, t0.b);
        g1.a(jSONObject, CatalogSportMatch.q, "vk_sports_matches", this.m0, u0.b);
        g1.a(jSONObject, CatalogAiAssistantItem.f, "ai_assistants", this.n0, v0.b);
        g1.a(jSONObject, CatalogMovieItem.j, "movies", this.o0, w0.b);
        CatalogMarketCategoryMappings.a aVar4 = CatalogMarketCategoryMappings.g;
        JSONArray optJSONArray8 = jSONObject.optJSONArray("market_category_mappings");
        if (optJSONArray8 != null) {
            int length8 = optJSONArray8.length();
            arrayList = new ArrayList(length8);
            for (int i14 = 0; i14 < length8; i14++) {
                JSONObject optJSONObject2 = optJSONArray8.optJSONObject(i14);
                if (optJSONObject2 != null) {
                    try {
                        aVar4.getClass();
                        arrayList.add(new CatalogMarketCategoryMappings(optJSONObject2));
                    } catch (Exception e2) {
                        L.i(e2);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.N.addAll(arrayList);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("stickers_packs");
        if (optJSONObject3 != null) {
            Iterator<String> keys = optJSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject(next);
                if (optJSONObject4 != null) {
                    Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
                    StickerStockItem a2 = StickerStockItem.a.a(optJSONObject4);
                    this.t.put(next, a2);
                    Iterator<T> it4 = a2.g.iterator();
                    while (it4.hasNext()) {
                        this.v.put(String.valueOf(((StickerItem) it4.next()).b), a2);
                    }
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
        }
        g1.a(jSONObject, StickerPackPreview.t, "stickers_pack_previews", this.u, x0.b);
        JSONArray optJSONArray9 = jSONObject.optJSONArray("packs");
        if (optJSONArray9 != null) {
            ArrayList arrayList7 = new ArrayList(optJSONArray9.length());
            int length9 = optJSONArray9.length();
            for (int i15 = 0; i15 < length9; i15++) {
                JSONObject jSONObject3 = optJSONArray9.getJSONObject(i15);
                Serializer.c<StickerStockItem> cVar2 = StickerStockItem.CREATOR;
                arrayList7.add(StickerStockItem.a.a(jSONObject3));
            }
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                StickerStockItem stickerStockItem = (StickerStockItem) it5.next();
                this.t.put(String.valueOf(stickerStockItem.b), stickerStockItem);
                Iterator<T> it6 = stickerStockItem.g.iterator();
                while (it6.hasNext()) {
                    this.v.put(String.valueOf(((StickerItem) it6.next()).b), stickerStockItem);
                }
            }
            s3q0 s3q0Var3 = s3q0.a;
        }
        HashMap hashMap = new HashMap();
        g1.a aVar5 = new g1.a(jSONObject, x490.a);
        aVar5.c = "profiles";
        aVar5.a(hashMap, new y8(5));
        g1.a aVar6 = new g1.a(jSONObject, w490.a);
        aVar6.c = "groups";
        aVar6.a(hashMap, new g53(4));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        g1.a(jSONObject, d3r.a, "reaction_sets", linkedHashMap3, z0.b);
        g1.a(jSONObject, new lba(hashMap, linkedHashMap3), "newsfeed_items", this.Z, a1.b);
        g1.a(jSONObject, new aja(hashMap, linkedHashMap3), "wall_items", this.a0, b1.b);
        Map<String, VideoMusicStreamMixItem> map4 = this.j0;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        JSONArray optJSONArray10 = jSONObject.optJSONArray("video_music_stream_mixes");
        JSONArray optJSONArray11 = jSONObject.optJSONArray("groups");
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        if (optJSONArray11 != null) {
            int length10 = optJSONArray11.length();
            for (int i16 = 0; i16 < length10; i16++) {
                Group group3 = new Group(optJSONArray11.getJSONObject(i16));
                UserId e3 = fkq0.e(fkq0.a(group3.c));
                group3.c = e3;
                linkedHashMap5.put(e3, group3);
            }
        }
        if (optJSONArray10 != null) {
            int length11 = optJSONArray10.length();
            int i17 = 0;
            while (i17 < length11) {
                JSONObject jSONObject4 = optJSONArray10.getJSONObject(i17);
                String optString = jSONObject4.optString("id");
                String optString2 = jSONObject4.optString(str5);
                String optString3 = jSONObject4.optString("description");
                String optString4 = jSONObject4.optString("background_image_url");
                String optString5 = jSONObject4.optString("recom_payload");
                JSONArray optJSONArray12 = jSONObject4.optJSONArray(str4);
                if (optJSONArray12 != null) {
                    ArrayList arrayList8 = new ArrayList(optJSONArray12.length());
                    int length12 = optJSONArray12.length();
                    int i18 = 0;
                    while (i18 < length12) {
                        JSONObject jSONObject5 = optJSONArray12.getJSONObject(i18);
                        VideoFileOld.a aVar7 = VideoFileOld.z1;
                        String str7 = str5;
                        VideoFileOld b2 = com.vk.dto.common.c.b(jSONObject5);
                        if (b2.b != null) {
                            str3 = str4;
                            jSONArray2 = optJSONArray10;
                            i4 = length11;
                            Group group4 = (Group) linkedHashMap5.get(new UserId(b2.b.b));
                            owner = group4 != null ? tsj.a(group4) : null;
                        } else {
                            str3 = str4;
                            jSONArray2 = optJSONArray10;
                            i4 = length11;
                            owner = null;
                        }
                        Artist.a aVar8 = Artist.o;
                        JSONArray optJSONArray13 = jSONObject4.optJSONArray("main_artists");
                        Owner owner4 = owner;
                        if (optJSONArray13 != null) {
                            int length13 = optJSONArray13.length();
                            arrayList3 = new ArrayList(length13);
                            i5 = i17;
                            int i19 = 0;
                            while (i19 < length13) {
                                JSONObject optJSONObject5 = optJSONArray13.optJSONObject(i19);
                                if (optJSONObject5 != null) {
                                    try {
                                        aVar8.getClass();
                                        i6 = length13;
                                    } catch (Exception e4) {
                                        e = e4;
                                        i6 = length13;
                                    }
                                    try {
                                        arrayList3.add(new Artist(optJSONObject5));
                                    } catch (Exception e5) {
                                        e = e5;
                                        L.i(e);
                                        s3q0 s3q0Var4 = s3q0.a;
                                        i19++;
                                        length13 = i6;
                                    }
                                } else {
                                    i6 = length13;
                                }
                                i19++;
                                length13 = i6;
                            }
                        } else {
                            i5 = i17;
                            arrayList3 = null;
                        }
                        Long l2 = (arrayList3 == null || (artist = (Artist) j5g.Y(arrayList3)) == null) ? null : artist.l;
                        Group group5 = l2 != null ? (Group) linkedHashMap5.get(new UserId(l2.longValue())) : null;
                        if (arrayList3 != null) {
                            owner2 = tsj.b(arrayList3, group5 != null ? group5.v : 0, Boolean.valueOf(group5 != null && group5.C == 1), 1);
                        } else {
                            owner2 = null;
                        }
                        b2.f1(owner4 == null ? owner2 : owner4);
                        arrayList8.add(b2);
                        i18++;
                        str5 = str7;
                        str4 = str3;
                        optJSONArray10 = jSONArray2;
                        length11 = i4;
                        i17 = i5;
                    }
                    str = str5;
                    str2 = str4;
                    jSONArray = optJSONArray10;
                    i2 = length11;
                    i3 = i17;
                    list = j5g.O0(arrayList8);
                } else {
                    str = str5;
                    str2 = str4;
                    jSONArray = optJSONArray10;
                    i2 = length11;
                    i3 = i17;
                    list = null;
                }
                VideoMusicStreamMixItem videoMusicStreamMixItem = new VideoMusicStreamMixItem(optString, optString2, optString3, optString4, optString5, list);
                String str8 = videoMusicStreamMixItem.b;
                if (str8 != null) {
                    linkedHashMap4.put(str8, videoMusicStreamMixItem);
                }
                i17 = i3 + 1;
                str5 = str;
                str4 = str2;
                optJSONArray10 = jSONArray;
                length11 = i2;
            }
        }
        map4.putAll(linkedHashMap4);
        UxPollData.a aVar9 = UxPollData.e;
        JSONArray optJSONArray14 = jSONObject.optJSONArray("ux_polls");
        if (optJSONArray14 != null) {
            int length14 = optJSONArray14.length();
            arrayList2 = new ArrayList(length14);
            for (int i20 = 0; i20 < length14; i20++) {
                JSONObject optJSONObject6 = optJSONArray14.optJSONObject(i20);
                if (optJSONObject6 != null) {
                    try {
                        aVar9.getClass();
                        arrayList2.add(new UxPollData(optJSONObject6));
                    } catch (Exception e6) {
                        L.i(e6);
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            this.p0.addAll(arrayList2);
        }
    }
}
