package com.vk.catalog2.feature.music.configuration;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.ConcertSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicRecommendedPlaylistViewStyle;
import com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixInteractiveViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.feature.music.analytics.visibility.ConcertsCatalogUiViewTracker;
import com.vk.catalog2.feature.music.dto.api.MusicOpenSectionIcon;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.catalog2.feature.music.holders.MusicActionPlayAllButtonVh;
import com.vk.catalog2.feature.music.holders.MusicActionSaveAsPlaylistButtonVh;
import com.vk.catalog2.feature.music.holders.MusicHideablePlaceholderVh;
import com.vk.catalog2.feature.music.holders.MusicKidsArtistsShimmerVh;
import com.vk.catalog2.feature.music.holders.MusicKidsCollectionShimmerVh;
import com.vk.catalog2.feature.music.holders.MusicLinksLineVh;
import com.vk.catalog2.feature.music.holders.MusicMoodPlaylistVh;
import com.vk.catalog2.feature.music.holders.MusicShimmerByLayoutIdVh;
import com.vk.catalog2.feature.music.holders.MusicShimmerVh;
import com.vk.catalog2.feature.music.holders.MusicShimmerVkMixVh;
import com.vk.catalog2.feature.music.holders.MusicSnippetShimmerVh;
import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.catalog2.feature.music.holders.concert.ConcertCardType;
import com.vk.catalog2.feature.music.holders.concert.ConcertRefSource;
import com.vk.catalog2.feature.music.holders.concert.ConcertVh;
import com.vk.catalog2.feature.music.holders.playmix.ArtistMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveSingleVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveTwoVkMixesVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicFeedPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicNavigationVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOpenSectionVh;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicShowAllListVh;
import com.vk.catalog2.feature.music.ui.holder.market.MarketMusicItemSource;
import com.vk.catalog2.feature.music.ui.holder.market.MarketSingleMusicItemViewHolder;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.music.mix.MixSettingsComponent;
import com.vk.music.navigation.VkMusicNavigationTab;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j2;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ae40;
import xsna.af0;
import xsna.afa;
import xsna.asu0;
import xsna.ava0;
import xsna.ayn0;
import xsna.b1a;
import xsna.b5a;
import xsna.be40;
import xsna.bpn0;
import xsna.brm0;
import xsna.c1a;
import xsna.c5g;
import xsna.cnh;
import xsna.cr20;
import xsna.da;
import xsna.dhb0;
import xsna.drm0;
import xsna.e3a;
import xsna.e43;
import xsna.ed40;
import xsna.eda;
import xsna.egi;
import xsna.el30;
import xsna.epx;
import xsna.erb;
import xsna.flu;
import xsna.fpf0;
import xsna.fy00;
import xsna.fz8;
import xsna.g3a;
import xsna.g750;
import xsna.gda;
import xsna.h2w;
import xsna.hda;
import xsna.huh0;
import xsna.itx0;
import xsna.iu4;
import xsna.izs;
import xsna.j5g;
import xsna.jda;
import xsna.jtx0;
import xsna.k7m;
import xsna.l340;
import xsna.l4v0;
import xsna.l500;
import xsna.lca;
import xsna.ldl;
import xsna.lt00;
import xsna.m7m;
import xsna.msy;
import xsna.n1;
import xsna.nly;
import xsna.no3;
import xsna.ns1;
import xsna.nuj;
import xsna.nuv;
import xsna.nwk;
import xsna.oca;
import xsna.ox0;
import xsna.p2k0;
import xsna.p5w;
import xsna.pca;
import xsna.pd4;
import xsna.pp00;
import xsna.pr0;
import xsna.q010;
import xsna.q3a;
import xsna.q9a;
import xsna.qd40;
import xsna.qdz;
import xsna.qmk0;
import xsna.r250;
import xsna.r6a;
import xsna.rd40;
import xsna.rsg0;
import xsna.rsi;
import xsna.s550;
import xsna.smq;
import xsna.sr80;
import xsna.sz00;
import xsna.t210;
import xsna.tba;
import xsna.tzv;
import xsna.u210;
import xsna.u2b0;
import xsna.u4a;
import xsna.u550;
import xsna.u5a;
import xsna.u96;
import xsna.uba;
import xsna.uw3;
import xsna.v100;
import xsna.v3n;
import xsna.vd7;
import xsna.vga;
import xsna.vha;
import xsna.w2a;
import xsna.w7p0;
import xsna.w950;
import xsna.wba;
import xsna.wga;
import xsna.x2a;
import xsna.x2b0;
import xsna.x5;
import xsna.xga;
import xsna.xmz;
import xsna.xrj;
import xsna.xv0;
import xsna.y7a;
import xsna.yfb;
import xsna.zaf0;
import xsna.zda;
import xsna.zf40;

/* compiled from: MusicCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class b extends com.vk.catalog2.common.ui.mvp.configuration.a implements zda {
    public static final bpn0 l0 = new bpn0(new x5(27));
    public static final bpn0 m0 = new bpn0(new n1(24));
    public final String D;
    public final C0518b E;
    public final xga F;
    public final e3a G;
    public final afa H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final bpn0 L;
    public final bpn0 M;
    public final Object N;
    public sr80 O;
    public zf40 P;
    public zf40 Q;
    public r250 R;
    public boolean S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final Object g0;
    public pp00 h0;
    public final Object i0;
    public MusicCatalogRootVh j0;
    public final boolean k0;

    /* compiled from: MusicCatalogConfiguration.kt */
    public static final class a {
        public static final boolean a() {
            bpn0 bpn0Var = b.l0;
            return ((Boolean) b.l0.getValue()).booleanValue();
        }
    }

    /* compiled from: MusicCatalogConfiguration.kt */
    /* renamed from: com.vk.catalog2.feature.music.configuration.b$b, reason: collision with other inner class name */
    public static final class C0518b {
    }

    /* compiled from: MusicCatalogConfiguration.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX_BLURRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.MUSIC_MAIN_NAVIGATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.HEADER_COMPACT.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.FEATURED_LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.LARGE_SLIDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_PLACEHOLDER.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CatalogViewType.BANNER.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CatalogViewType.LISTENED_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CatalogViewType.AUDIO_STREAM_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CatalogViewType.PLAYLIST_SMALL.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CatalogViewType.ENTITY_DOUBLE_GRID.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CatalogViewType.ARTISTS_SLIDER.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CatalogViewType.RECOMMS_SLIDER.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[CatalogViewType.CROP_SLIDER.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[CatalogViewType.SNIPPETS_BANNER.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[CatalogViewType.PODCAST_EXTENDED_SLIDER.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[CatalogViewType.PODCAST_FAVORITES.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[CatalogViewType.KIDS_COLLECTION.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[CatalogViewType.KIDS_CATALOG.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[CatalogViewType.CATEGORIES_LIST.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_EMPTY.ordinal()] = 7;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 12;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 13;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ConcertSliderViewStyle.Style.values().length];
            try {
                iArr4[ConcertSliderViewStyle.Style.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr4[ConcertSliderViewStyle.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: MusicCatalogConfiguration.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: MusicCatalogConfiguration.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CatalogSectionResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
            return ((afa) this.receiver).a(catalogSectionResponseObjectDto);
        }
    }

    /* compiled from: MusicCatalogConfiguration.kt */
    public static final class f extends u96 {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            this.d = str;
        }

        @Override // xsna.gda
        public final q d(String str, String str2, String str3, boolean z, Integer num) {
            if (str == null) {
                str = this.d;
            }
            return b.this.D(str, str2, z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Bundle bundle, C0518b c0518b) {
        super(r0, r1);
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("owner_id", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("owner_id");
            parcelable = (UserId) (parcelable3 instanceof UserId ? parcelable3 : null);
        }
        UserId userId = (UserId) parcelable;
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        this.D = string2;
        this.E = c0518b;
        this.F = new xga();
        this.G = new e3a();
        this.H = new afa();
        af0 af0Var = new af0(27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I = msy.a(lazyThreadSafetyMode, af0Var);
        this.J = msy.a(lazyThreadSafetyMode, new pr0(21));
        this.K = msy.a(lazyThreadSafetyMode, new t210(this, 7));
        this.L = new bpn0(new ldl(this, 28));
        this.M = new bpn0(new xrj(this, 23));
        this.N = msy.a(lazyThreadSafetyMode, new pd4(22));
        this.T = msy.a(lazyThreadSafetyMode, new nuv(this, 12));
        this.U = msy.a(lazyThreadSafetyMode, new u210(this, 5));
        this.V = msy.a(lazyThreadSafetyMode, new uw3(24));
        this.W = msy.a(lazyThreadSafetyMode, new tzv(this, 12));
        this.X = msy.a(lazyThreadSafetyMode, new v100(this, 3));
        this.Y = msy.a(lazyThreadSafetyMode, new nly(this, 9));
        this.Z = msy.a(lazyThreadSafetyMode, new xv0(14));
        this.a0 = msy.a(lazyThreadSafetyMode, new nuj(this, 22));
        this.b0 = msy.a(lazyThreadSafetyMode, new v3n(this, 20));
        this.c0 = msy.a(lazyThreadSafetyMode, new q010(this, 2));
        this.d0 = msy.a(lazyThreadSafetyMode, new nwk(this, 19));
        this.e0 = msy.a(lazyThreadSafetyMode, new cnh(this, 24));
        this.f0 = msy.a(lazyThreadSafetyMode, new cr20(this, 5));
        this.g0 = msy.a(lazyThreadSafetyMode, new l500(this, 11));
        this.i0 = msy.a(lazyThreadSafetyMode, new flu(this, 20));
        this.k0 = true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        return new rsi((List<? extends vha>) e43.l(new ae40(catalogConfiguration$Companion$ContainerType == CatalogConfiguration$Companion$ContainerType.VERTICAL, com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar), aVar.I), new ConcertsCatalogUiViewTracker(ConcertsCatalogUiViewTracker.EntryPoint.SEARCH, com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar), aVar.I)));
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final q<hda> D(String str, String str2, boolean z) {
        q l02;
        String str3 = str;
        String str4 = this.S ? "kids_section" : this.c;
        MusicFeatures.Companion.getClass();
        ArrayList a2 = MusicFeatures.a.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
        }
        if (brm0.B(str3, "synthetic_section_similar_tracks", false)) {
            l02 = ((s550) this.V.getValue()).a(str3);
        } else {
            Features.Type type = Features.Type.FEATURE_AUDIO_AUTOGEN_CATALOG;
            type.getClass();
            if (com.vk.toggle.b.A.a(type)) {
                l02 = rsg0.T(yfb.x(wga.d(this.F, str3, null, str2, Boolean.valueOf(z), arrayList, str4, 29562))).U(new iu4(new e(1, this.H, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 22));
                str3 = str;
            } else {
                String str5 = str4;
                str3 = str;
                str4 = str5;
                l02 = rsg0.l0(new r6a(new wba(), str, str2, z, null, null, str5, arrayList, 112), null, 3);
            }
        }
        q<hda> t = egi.t(l02, this.O);
        r250 r250Var = this.R;
        if (r250Var != null) {
            q<hda> L = (epx.f(r250Var.b, str3) && str2 == null && (str4 == null || !drm0.D(str4, "kids_section", false))) ? t.L(new l340(new el30(r250Var, 5), 2), false) : t;
            if (L != null) {
                t = L;
            }
        }
        return ((q9a) this.L.getValue()).b(t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final void E(u4a u4aVar) {
        super.E(u4aVar);
        if (((Boolean) this.J.getValue()).booleanValue()) {
            c1a c1aVar = (c1a) this.M.getValue();
            q3a q3aVar = u4aVar.b.e;
            c1aVar.getClass();
            com.vk.core.utils.newtork.b.a.getClass();
            io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
            dVar.getClass();
            c1aVar.e.b(new j2(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).y(1000L, TimeUnit.MILLISECONDS)).U(new ox0(new ns1(c1aVar, 14), 7)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new da(new b1a(0, q3aVar, c1aVar), 5)));
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        int i = c.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i == 1) {
            return new be40();
        }
        if (i == 2) {
            return new pca();
        }
        if (i == 3) {
            return new oca();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        if (arrayList.size() == 1) {
            w950 w950Var = (w950) this.W.getValue();
            UIBlock uIBlock = (UIBlock) j5g.a0(arrayList);
            w950.p(w950Var, uIBlock != null ? uIBlock.c : null, null, null, 6);
        }
        MusicCatalogRootVh musicCatalogRootVh = this.j0;
        if (musicCatalogRootVh != null) {
            musicCatalogRootVh.H(uIBlockCatalog);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean J() {
        return this.k0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        Pair pair;
        this.E.getClass();
        if (a.a()) {
            pair = new Pair(str != null ? new vga(str) : null, new x2a.a());
        } else {
            pair = new Pair(str != null ? new u550(str) : null, new x2a.b(false));
        }
        return new g3a(this, u4aVar, K(u4aVar), (x2a) pair.g(), (w2a) pair.d(), null, null, this, null, null, 32480);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final ayn0 W(RecyclerView recyclerView) {
        return new ayn0(recyclerView, null, 28);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        return new MusicVerticalStackedListVh(u4aVar.b.w, this, new c.h((c.m) tbaVar), tbaVar, u4aVar, new g750(), (p2k0) this.Y.getValue());
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final eda.a g() {
        return new erb(4, this, new qmk0(5));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        String str2;
        Uri parse;
        f fVar = new f(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        boolean z = uIBlockList == null;
        boolean z2 = uIBlockList == null || uIBlockList.y.isEmpty();
        String str3 = this.D;
        String fragment = (str3 == null || (parse = Uri.parse(str3)) == null) ? null : parse.getFragment();
        VkMusicNavigationTab.a aVar = VkMusicNavigationTab.Companion;
        if (uIBlockList != null && (str2 = uIBlockList.M) != null) {
            str3 = str2;
        }
        aVar.getClass();
        VkMusicNavigationTab a2 = VkMusicNavigationTab.a.a(str3);
        this.E.getClass();
        boolean a3 = a.a();
        bpn0 bpn0Var = m0;
        VkMusicNavigationTab vkMusicNavigationTab = (a3 || ((Boolean) bpn0Var.getValue()).booleanValue()) ? a2 : null;
        VkMusicNavigationTab vkMusicNavigationTab2 = VkMusicNavigationTab.GENERAL;
        bpn0 bpn0Var2 = this.L;
        Pair pair = (vkMusicNavigationTab == vkMusicNavigationTab2 && a.a()) ? new Pair(new rd40(str, bpn0Var2), new x2a.b(true)) : (vkMusicNavigationTab == VkMusicNavigationTab.MY_MUSIC && ((Boolean) bpn0Var.getValue()).booleanValue()) ? new Pair(new rd40(str, bpn0Var2), new x2a.b(true)) : new Pair(new u550(str), new x2a.e());
        w2a w2aVar = (w2a) pair.d();
        x2a x2aVar = (x2a) pair.g();
        no3 no3Var = new no3(this, 5);
        jda K = K(u4aVar);
        String str4 = null;
        vd7 a0 = a0(u4aVar);
        if (a2 != null) {
            str4 = a2.i();
        }
        return new qd40(fVar, (fz8) K, u4aVar, a0, z2, uIBlockList, str, z, str4, fragment, b0(u4aVar), this, x2aVar, w2aVar, no3Var, this.h0);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final q<hda> j(String str, String str2, String str3) {
        return ((q9a) this.L.getValue()).b(egi.t(super.j(str, str2, str3), this.O));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        x2b0.c((x2b0) this.X.getValue(), uIBlock.b, null, 14);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final gda l(String str) {
        return new f(str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("key_url", this.D);
        if (this.S) {
            r.putString("ref", "kids_section");
        }
        return r;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:165:0x046b  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        CatalogViewHolder composeMusicActionPlayAudiosFromBlockIdVh;
        CatalogViewHolder w;
        MusicOpenSectionIcon musicOpenSectionIcon;
        String str;
        OpenSectionViewStyle.ButtonIcon buttonIcon;
        b bVar;
        String str2;
        b bVar2 = this;
        u4a.a aVar = u4aVar.b;
        if (uIBlock instanceof UIBlockButtons) {
            UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
            if (uIBlockButtons.d == CatalogViewType.BUTTONS_HORIZONTAL && uIBlockButtons.y.size() != 1) {
                if (c.$EnumSwitchMapping$2[catalogDataType.ordinal()] != 1) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                int i = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                return i != 1 ? i != 2 ? i != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new MusicActionPlayAllButtonVh(R.drawable.vk_icon_shuffle_outline_28, R.string.audio_shuffle_all, aVar.i) : new MusicActionSaveAsPlaylistButtonVh(R.drawable.vk_icon_add_outline_28, R.layout.catalog_action_horizontal_list_music) : new MusicActionPlayAllButtonVh(R.drawable.vk_icon_play_28, R.string.music_artist_listen_all_btn, aVar.i);
            }
        }
        int i2 = c.$EnumSwitchMapping$2[catalogDataType.ordinal()];
        ?? r11 = bVar2.K;
        ?? r12 = bVar2.I;
        int i3 = 0;
        ?? r15 = bVar2.i0;
        C0518b c0518b = bVar2.E;
        switch (i2) {
            case 1:
                int i4 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i4 == 3) {
                    composeMusicActionPlayAudiosFromBlockIdVh = new ComposeMusicActionPlayAudiosFromBlockIdVh(R.string.music_button_shuffle, aVar.i, Integer.valueOf(R.drawable.vk_icon_shuffle_24), VkCell.Left.Main.Size.Medium, null);
                    w = composeMusicActionPlayAudiosFromBlockIdVh;
                    break;
                } else if (i4 == 4) {
                    boolean z = catalogViewStyle instanceof OpenSectionViewStyle;
                    OpenSectionViewStyle openSectionViewStyle = z ? (OpenSectionViewStyle) catalogViewStyle : null;
                    if (openSectionViewStyle != null && openSectionViewStyle.b == OpenSectionViewStyle.ButtonStyle.FLAT) {
                        OpenSectionViewStyle openSectionViewStyle2 = z ? (OpenSectionViewStyle) catalogViewStyle : null;
                        String h = (openSectionViewStyle2 == null || (buttonIcon = openSectionViewStyle2.c) == null) ? null : buttonIcon.h();
                        MusicOpenSectionIcon.Companion.getClass();
                        MusicOpenSectionIcon[] values = MusicOpenSectionIcon.values();
                        int length = values.length;
                        while (true) {
                            if (i3 < length) {
                                MusicOpenSectionIcon musicOpenSectionIcon2 = values[i3];
                                str = musicOpenSectionIcon2.iconName;
                                if (epx.f(str, h)) {
                                    musicOpenSectionIcon = musicOpenSectionIcon2;
                                } else {
                                    i3++;
                                }
                            } else {
                                musicOpenSectionIcon = null;
                            }
                        }
                        if (musicOpenSectionIcon == null) {
                            musicOpenSectionIcon = MusicOpenSectionIcon.DEFAULT;
                        }
                        w = new MusicOpenSectionVh(bVar2, aVar.b, aVar.f, aVar.m, musicOpenSectionIcon.h());
                        break;
                    } else {
                        w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                        break;
                    }
                } else if (i4 == 5) {
                    if (!((Boolean) r12.getValue()).booleanValue()) {
                        u2b0 u2b0Var = aVar.i;
                        w = new ArtistMixVh(u2b0Var, new ava0(u2b0Var, ((MixSettingsComponent) ((k7m) m7m.f(bVar2)).a(fpf0.a(MixSettingsComponent.class))).af(), null), aVar.f);
                        break;
                    } else {
                        w = new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.ArtistMixBlurred, (com.vk.catalog.mvi.legacy.api.a) r11.getValue());
                        break;
                    }
                } else {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
                break;
            case 2:
                switch (c.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                    case 11:
                    case 12:
                    case 13:
                        w = new MusicPlaceholderVh(aVar.w, aVar.f, null, null, aVar.b, 92);
                        break;
                    case 14:
                        w = new MusicHideablePlaceholderVh(aVar.e);
                        break;
                    case 15:
                        w = new MusicFeedPlaceholderVh(aVar.e, aVar.w, aVar.b);
                        break;
                    default:
                        w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                        break;
                }
            case 3:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 16) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    MusicTrackVh musicTrackVh = w instanceof MusicTrackVh ? (MusicTrackVh) w : null;
                    if (musicTrackVh != null) {
                        musicTrackVh.m = (dhb0) bVar2.N.getValue();
                        break;
                    }
                }
                break;
            case 4:
                int i5 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i5 == 6) {
                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_entity_double_grid);
                    break;
                } else if (i5 == 15) {
                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_banner);
                    break;
                } else {
                    switch (i5) {
                        case 8:
                            VkMixInteractiveViewStyle vkMixInteractiveViewStyle = catalogViewStyle instanceof VkMixInteractiveViewStyle ? (VkMixInteractiveViewStyle) catalogViewStyle : null;
                            boolean z2 = (vkMixInteractiveViewStyle != null ? vkMixInteractiveViewStyle.b : null) == VkMixInteractiveViewStyle.Style.STATIC;
                            w = new MusicShimmerVkMixVh(aVar.Q, z2 ? R.layout.catalog_music_vk_mix_static_shimmer : R.layout.catalog_music_vk_mix_shimmer, z2);
                            break;
                        case 9:
                            w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_entity_double_grid);
                            break;
                        case 10:
                            w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_large_slider);
                            break;
                        default:
                            switch (i5) {
                                case 17:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_triple_stacked_slider);
                                    break;
                                case 18:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_vk_mix);
                                    break;
                                case 19:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_playlist_small);
                                    break;
                                case 20:
                                    break;
                                case 21:
                                case 22:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_recomms_slider);
                                    break;
                                case 23:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_crop_slider);
                                    break;
                                case 24:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_buttons_horizontal);
                                    break;
                                case 25:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_large_list);
                                    break;
                                case 26:
                                    w = new MusicSnippetShimmerVh();
                                    break;
                                case 27:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_podcast_extended);
                                    break;
                                case 28:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_podcast_extended);
                                    break;
                                case 29:
                                    w = new MusicKidsCollectionShimmerVh();
                                    break;
                                case 30:
                                    w = new MusicShimmerByLayoutIdVh(R.layout.catalog_music_kids_catalog_shimmer);
                                    break;
                                case 31:
                                    w = new MusicKidsArtistsShimmerVh();
                                    break;
                                case 32:
                                    w = new MusicShimmerVh(R.dimen.music_catalog_shimmer_height_categories, R.layout.catalog_music_shimmer_12_dp, Integer.valueOf(R.dimen.music_catalog_shimmer_kids_cell_horizontal_padding), Integer.valueOf(R.dimen.music_catalog_shimmer_kids_cell_vertical_padding));
                                    break;
                                default:
                                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                                    break;
                            }
                    }
                }
            case 5:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 23) {
                    bVar2 = bVar2;
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else if (!bVar2.S) {
                    GridListVh.a aVar2 = (GridListVh.a) bVar2.C.getValue();
                    bVar2 = bVar2;
                    w = new GridListVh(bVar2, 2, u4aVar, 0, null, aVar2, 120);
                    break;
                } else {
                    bVar2 = bVar2;
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
            case 6:
                bVar = bVar2;
                VkTopBarVh vkTopBarVh = new VkTopBarVh(aVar.b, aVar.e, null, new w7p0(false, null, com.vk.core.compose.component.semantics.b.a(null, new xmz(10), 3), com.vk.core.compose.component.semantics.b.a(null, new h2w(7), 3), null, null, null, null, null, 32575), null, bVar.b0(u4aVar), null, null, 3700);
                if (uIBlock == null || (str2 = uIBlock.b) == null) {
                    str2 = "";
                }
                uba ubaVar = new uba(bVar.h0(null, str2, u4aVar));
                MusicShowAllListVh musicShowAllListVh = new MusicShowAllListVh(uIBlock != null ? uIBlock.c : null, u4aVar, vkTopBarVh, com.vk.catalog2.common.ui.mvp.configuration.a.g0(bVar, uIBlock, u4aVar, ubaVar, 8), (w950) bVar.W.getValue(), null, false, 448);
                ubaVar.h = musicShowAllListVh;
                w = musicShowAllListVh;
                bVar2 = bVar;
                break;
            case 7:
                bVar = bVar2;
                w = c.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 6 ? new MusicNavigationVh(u4aVar) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                bVar2 = bVar;
                break;
            case 8:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 7) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else {
                    w = new ComposeHeaderIconShowAllBadgeVh(bVar2, aVar.b, bVar2.b0(u4aVar), aVar.f, aVar.w, aVar.m, null, 448);
                    break;
                }
            case 9:
                c0518b.getClass();
                int i6 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                ?? r7 = bVar2.d0;
                ?? r8 = bVar2.c0;
                ?? r9 = bVar2.b0;
                ?? r10 = bVar2.a0;
                if (i6 == 33) {
                    composeMusicActionPlayAudiosFromBlockIdVh = new MarketSingleMusicItemViewHolder(u4aVar, true, MarketMusicItemSource.SEARCH_CARD, (lt00) r10.getValue(), (fy00) r9.getValue(), (sz00) r8.getValue(), (smq) r7.getValue());
                } else if (i6 != 34) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else {
                    composeMusicActionPlayAudiosFromBlockIdVh = new MarketSingleMusicItemViewHolder(u4aVar, false, MarketMusicItemSource.SEARCH_CARD_FULLPAGE, (lt00) r10.getValue(), (fy00) r9.getValue(), (sz00) r8.getValue(), (smq) r7.getValue());
                }
                w = composeMusicActionPlayAudiosFromBlockIdVh;
                break;
            case 10:
                int i7 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                ?? r102 = bVar2.e0;
                ?? r112 = bVar2.Z;
                if (i7 == 31) {
                    if (!((Boolean) r112.getValue()).booleanValue()) {
                        w = new EmptyVh(false);
                        break;
                    } else {
                        ConcertSliderViewStyle concertSliderViewStyle = catalogViewStyle instanceof ConcertSliderViewStyle ? (ConcertSliderViewStyle) catalogViewStyle : null;
                        ConcertSliderViewStyle.Style style = concertSliderViewStyle != null ? concertSliderViewStyle.b : null;
                        int i8 = style == null ? -1 : c.$EnumSwitchMapping$3[style.ordinal()];
                        composeMusicActionPlayAudiosFromBlockIdVh = new ConcertVh(i8 != 1 ? i8 != 2 ? ConcertCardType.SEARCH_CARD : ConcertCardType.ARTIST_CARD : ConcertCardType.SEARCH_CARD, (qdz) r102.getValue(), ConcertRefSource.SEARCH_ARTIST, aVar.f);
                        w = composeMusicActionPlayAudiosFromBlockIdVh;
                        break;
                    }
                } else if (i7 == 35) {
                    if (!((Boolean) r112.getValue()).booleanValue()) {
                        w = new EmptyVh(false);
                        break;
                    } else {
                        w = new ConcertVh(ConcertCardType.FULL_PAGE, (qdz) r102.getValue(), ConcertRefSource.SEARCH_ARTIST_FULLPAGE, aVar.f);
                        break;
                    }
                } else {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
            case 11:
                if (!((Boolean) r12.getValue()).booleanValue() || catalogViewType != CatalogViewType.ARTISTS_SLIDER) {
                    boolean z3 = bVar2.S;
                    if (!z3 && catalogViewType == CatalogViewType.CROP_SLIDER) {
                        w = new MusicMoodPlaylistVh(R.layout.catalog_music_vibe_small_playlist_slider, aVar.f, aVar.i, (zaf0) r15.getValue());
                        break;
                    } else if (!z3 && catalogViewType == CatalogViewType.DOUBLE_STACKED_SLIDER) {
                        w = new MusicMoodPlaylistVh(R.layout.catalog_music_vibe_small_playlist_slider, aVar.f, aVar.i, (zaf0) r15.getValue());
                        break;
                    } else {
                        w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                        break;
                    }
                } else {
                    w = new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.PlaylistWithArtistsBlurred, (com.vk.catalog.mvi.legacy.api.a) r11.getValue());
                    break;
                }
                break;
            case 12:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 8) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else {
                    VkMixInteractiveViewStyle vkMixInteractiveViewStyle2 = catalogViewStyle instanceof VkMixInteractiveViewStyle ? (VkMixInteractiveViewStyle) catalogViewStyle : null;
                    if ((vkMixInteractiveViewStyle2 != null ? vkMixInteractiveViewStyle2.b : null) != VkMixInteractiveViewStyle.Style.STATIC) {
                        u2b0 u2b0Var2 = aVar.i;
                        l4v0 l4v0Var = aVar.Q;
                        zaf0 zaf0Var = (zaf0) r15.getValue();
                        b5a b5aVar = aVar.f;
                        c0518b.getClass();
                        w = new MusicInteractiveTwoVkMixesVh(u2b0Var2, l4v0Var, zaf0Var, b5aVar);
                        break;
                    } else {
                        u2b0 u2b0Var3 = aVar.i;
                        l4v0 l4v0Var2 = aVar.Q;
                        zaf0 zaf0Var2 = (zaf0) r15.getValue();
                        b5a b5aVar2 = aVar.f;
                        c0518b.getClass();
                        w = new MusicInteractiveSingleVkMixVh(u2b0Var3, l4v0Var2, zaf0Var2, b5aVar2);
                        break;
                    }
                }
            case 13:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 9) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else {
                    w = new MusicLinksLineVh(aVar.f, aVar.m, aVar.j, aVar.R);
                    break;
                }
            case 14:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 10) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else if (!((Boolean) r12.getValue()).booleanValue() || !(catalogViewStyle instanceof MusicRecommendedPlaylistViewStyle) || ((MusicRecommendedPlaylistViewStyle) catalogViewStyle).b != MusicRecommendedPlaylistViewStyle.Style.Blurred) {
                    w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                } else {
                    w = new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.RecommendedPlaylistBlurred, (com.vk.catalog.mvi.legacy.api.a) r11.getValue());
                    break;
                }
            case 15:
                w = ((huh0) bVar2.g0.getValue()).a(catalogViewType, catalogViewStyle, u4aVar);
                break;
            default:
                w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                break;
        }
        if (w instanceof itx0) {
            itx0 itx0Var = (itx0) w;
            itx0Var.a(((Boolean) bVar2.T.getValue()).booleanValue());
            itx0Var.c(bVar2.P);
        }
        if (w instanceof jtx0) {
            jtx0 jtx0Var = (jtx0) w;
            jtx0Var.a(((Boolean) bVar2.U.getValue()).booleanValue());
            jtx0Var.b(bVar2.Q);
        }
        return w;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final q<hda> x(UserId userId, String str) {
        q y0;
        MusicFeatures.Companion.getClass();
        ArrayList a2 = MusicFeatures.a.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
        }
        Features.Type type = Features.Type.FEATURE_AUDIO_AUTOGEN_CATALOG;
        type.getClass();
        if (com.vk.toggle.b.A.a(type)) {
            y0 = rsg0.T(yfb.x(this.F.r(userId, Boolean.valueOf(!a.a()), str, this.D, arrayList))).U(new p5w(new d(1, this.G, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 5));
        } else {
            y0 = rsg0.y0(new u5a(new wba(), userId, str, this.D, arrayList, !a.a()), null, null, 3);
        }
        return ((q9a) this.L.getValue()).b(egi.t(y0, this.O));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean y() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final y7a z(lca lcaVar, CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType) {
        return c.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new ed40(lcaVar, 3) : super.z(lcaVar, catalogConfiguration$Companion$ContainerType);
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }
}
