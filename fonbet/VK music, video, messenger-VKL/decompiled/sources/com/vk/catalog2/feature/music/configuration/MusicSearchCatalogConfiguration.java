package com.vk.catalog2.feature.music.configuration;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.ConcertSliderViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.HeaderClearBlocksVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.feature.music.analytics.visibility.ConcertsCatalogUiViewTracker;
import com.vk.catalog2.feature.music.holders.concert.ConcertCardType;
import com.vk.catalog2.feature.music.holders.concert.ConcertRefSource;
import com.vk.catalog2.feature.music.holders.concert.ConcertVh;
import com.vk.catalog2.feature.music.ui.holder.market.MarketMusicItemSource;
import com.vk.catalog2.feature.music.ui.holder.market.MarketSingleMusicItemViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import kotlin.LazyThreadSafetyMode;
import xsna.Cnew;
import xsna.b010;
import xsna.b410;
import xsna.b5a;
import xsna.bpn0;
import xsna.brm0;
import xsna.by20;
import xsna.e550;
import xsna.epx;
import xsna.fy00;
import xsna.g750;
import xsna.gzv;
import xsna.hda;
import xsna.huh0;
import xsna.iah0;
import xsna.jtx0;
import xsna.k140;
import xsna.kea;
import xsna.ln20;
import xsna.lt00;
import xsna.msy;
import xsna.nh0;
import xsna.pp00;
import xsna.qdz;
import xsna.rsi;
import xsna.s550;
import xsna.s6y;
import xsna.smq;
import xsna.sz00;
import xsna.tba;
import xsna.tq3;
import xsna.u4a;
import xsna.uba;
import xsna.vha;
import xsna.x4u;
import xsna.zf40;

/* compiled from: MusicSearchCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class MusicSearchCatalogConfiguration extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final boolean D;
    public final k140 E;
    public zf40 F;
    public final Object G;
    public final Object H;
    public final bpn0 I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public Cnew P;

    /* compiled from: MusicSearchCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConcertSliderViewStyle.Style.values().length];
            try {
                iArr3[ConcertSliderViewStyle.Style.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ConcertSliderViewStyle.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr4[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public MusicSearchCatalogConfiguration() {
        super(UserId.d, MusicPlaybackLaunchContext.o.t());
        this.D = true;
        this.E = new k140(null);
        b010 b010Var = new b010(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, b010Var);
        this.H = msy.a(lazyThreadSafetyMode, new nh0(26));
        new bpn0(new by20(this, 9));
        this.I = new bpn0(new b410(this, 4));
        this.J = msy.a(lazyThreadSafetyMode, new pp00(this, 10));
        this.K = msy.a(lazyThreadSafetyMode, new ln20(this, 4));
        this.L = msy.a(lazyThreadSafetyMode, new e550(this, 0));
        this.M = msy.a(lazyThreadSafetyMode, new s6y(this, 13));
        this.N = msy.a(lazyThreadSafetyMode, new gzv(this, 19));
        this.O = msy.a(lazyThreadSafetyMode, new x4u(this, 17));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return new rsi(this.E.d(catalogConfiguration$Companion$ContainerType, u4aVar), new ConcertsCatalogUiViewTracker(ConcertsCatalogUiViewTracker.EntryPoint.SEARCH, com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar), u4aVar.b.I));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final q<hda> D(String str, String str2, boolean z) {
        return brm0.B(str, "synthetic_section_similar_tracks", false) ? ((s550) this.H.getValue()).a(str) : super.D(str, str2, z);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return a.$EnumSwitchMapping$3[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new tq3() : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new VerticalStackedListVh(this, hVar, tbaVar, u4aVar, null, 0, null, new g750(), 976);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        return new kea(cVar, K(u4aVar), u4aVar, a0(u4aVar), uIBlockList == null || uIBlockList.y.size() == 0, uIBlockList, str, uIBlockList == null, null, b0(u4aVar), null, null, this.P, false, null, 113408);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        MusicSearchCatalogConfiguration musicSearchCatalogConfiguration;
        String str;
        CatalogViewHolder marketSingleMusicItemViewHolder;
        CatalogViewHolder catalogViewHolder;
        CatalogViewHolder catalogViewHolder2;
        u4a.a aVar = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        b5a b5aVar = aVar.f;
        epx.f(catalogConfiguration.q(), UserId.d);
        switch (a.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                musicSearchCatalogConfiguration = this;
                ToolbarVh toolbarVh = new ToolbarVh(aVar.b, aVar.e, null, 0, false, null, musicSearchCatalogConfiguration.b0(u4aVar), null, null, null, null, 4046716);
                if (uIBlock == null || (str = uIBlock.b) == null) {
                    str = "";
                }
                uba ubaVar = new uba(musicSearchCatalogConfiguration.h0(null, str, u4aVar));
                ShowAllListVh showAllListVh = new ShowAllListVh(u4aVar, toolbarVh, com.vk.catalog2.common.ui.mvp.configuration.a.g0(musicSearchCatalogConfiguration, uIBlock, u4aVar, ubaVar, 8), false, true, false, null, 440);
                ubaVar.h = showAllListVh;
                catalogViewHolder2 = showAllListVh;
                break;
            case 2:
                int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i == 1) {
                    musicSearchCatalogConfiguration = this;
                    catalogViewHolder2 = new HeaderClearBlocksVh(aVar.e, b5aVar, R.layout.catalog_header_clear_recent_queries_item_view);
                    break;
                } else {
                    catalogViewHolder = i != 2 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large);
                    musicSearchCatalogConfiguration = this;
                    catalogViewHolder2 = catalogViewHolder;
                    break;
                }
            case 3:
                catalogViewHolder = a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new DiscoverSearchPlaceholderVhWrapper(new PlaceholderVh(aVar.w, false, false, null, null, R.layout.global_search_catalog_placeholder_view, null, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE)) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                musicSearchCatalogConfiguration = this;
                catalogViewHolder2 = catalogViewHolder;
                break;
            case 4:
                if (this.D) {
                    int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                    ?? r7 = this.L;
                    ?? r8 = this.K;
                    ?? r9 = this.J;
                    bpn0 bpn0Var = this.I;
                    if (i2 == 4) {
                        marketSingleMusicItemViewHolder = new MarketSingleMusicItemViewHolder(u4aVar, true, MarketMusicItemSource.SEARCH_CARD, (lt00) bpn0Var.getValue(), (fy00) r9.getValue(), (sz00) r8.getValue(), (smq) r7.getValue());
                    } else if (i2 != 5) {
                        catalogViewHolder = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    } else {
                        marketSingleMusicItemViewHolder = new MarketSingleMusicItemViewHolder(u4aVar, false, MarketMusicItemSource.SEARCH_CARD_FULLPAGE, (lt00) bpn0Var.getValue(), (fy00) r9.getValue(), (sz00) r8.getValue(), (smq) r7.getValue());
                    }
                    catalogViewHolder = marketSingleMusicItemViewHolder;
                } else {
                    catalogViewHolder = new EmptyVh(false);
                }
                musicSearchCatalogConfiguration = this;
                catalogViewHolder2 = catalogViewHolder;
                break;
            case 5:
                int i3 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                ?? r11 = this.M;
                if (i3 != 6) {
                    catalogViewHolder = i3 != 7 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new ConcertVh(ConcertCardType.FULL_PAGE, (qdz) r11.getValue(), ConcertRefSource.SEARCH_ARTIST_FULLPAGE, b5aVar);
                    musicSearchCatalogConfiguration = this;
                    catalogViewHolder2 = catalogViewHolder;
                    break;
                } else {
                    ConcertSliderViewStyle concertSliderViewStyle = catalogViewStyle instanceof ConcertSliderViewStyle ? (ConcertSliderViewStyle) catalogViewStyle : null;
                    ConcertSliderViewStyle.Style style = concertSliderViewStyle != null ? concertSliderViewStyle.b : null;
                    int i4 = style == null ? -1 : a.$EnumSwitchMapping$2[style.ordinal()];
                    marketSingleMusicItemViewHolder = new ConcertVh(i4 != 1 ? i4 != 2 ? ConcertCardType.SEARCH_CARD : ConcertCardType.ARTIST_CARD : ConcertCardType.SEARCH_CARD, (qdz) r11.getValue(), ConcertRefSource.SEARCH_ARTIST, b5aVar);
                    catalogViewHolder = marketSingleMusicItemViewHolder;
                    musicSearchCatalogConfiguration = this;
                    catalogViewHolder2 = catalogViewHolder;
                }
            case 6:
                catalogViewHolder = ((huh0) this.O.getValue()).a(catalogViewType, catalogViewStyle, u4aVar);
                musicSearchCatalogConfiguration = this;
                catalogViewHolder2 = catalogViewHolder;
                break;
            default:
                catalogViewHolder = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                musicSearchCatalogConfiguration = this;
                catalogViewHolder2 = catalogViewHolder;
                break;
        }
        if (catalogViewHolder2 instanceof jtx0) {
            jtx0 jtx0Var = (jtx0) catalogViewHolder2;
            jtx0Var.a(((Boolean) musicSearchCatalogConfiguration.G.getValue()).booleanValue());
            jtx0Var.b(musicSearchCatalogConfiguration.F);
        }
        return catalogViewHolder2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final q<hda> x(UserId userId, String str) {
        return g0.b;
    }

    /* compiled from: MusicSearchCatalogConfiguration.kt */
    public static final class DiscoverSearchPlaceholderVhWrapper implements CatalogViewHolder {
        public final PlaceholderVh b;

        public DiscoverSearchPlaceholderVhWrapper(PlaceholderVh placeholderVh) {
            this.b = placeholderVh;
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final void L() {
            this.b.L();
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final void N6(UIBlock uIBlock) {
            this.b.N6(uIBlock);
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View k5 = this.b.k5(layoutInflater, viewGroup, bundle);
            TextView textView = (TextView) k5.findViewById(R.id.title);
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = iah0.a(2);
                }
            }
            return k5;
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final void yh(int i, UIBlock uIBlock) {
            this.b.N6(uIBlock);
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final boolean ze(Rect rect) {
            this.b.getClass();
            return false;
        }

        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
        }
    }
}
