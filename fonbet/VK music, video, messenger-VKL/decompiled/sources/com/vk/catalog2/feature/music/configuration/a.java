package com.vk.catalog2.feature.music.configuration;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.ConcertSliderViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.feature.music.analytics.visibility.ConcertsCatalogUiViewTracker;
import com.vk.catalog2.feature.music.ui.holder.MusicShowAllListVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.internal.api.GsonHolder;
import com.vk.lists.c;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.toggle.b;
import com.vk.toggle.features.CatalogFeatures;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.afa;
import xsna.b1z;
import xsna.ba40;
import xsna.bpn0;
import xsna.c5g;
import xsna.cf00;
import xsna.com;
import xsna.cqm0;
import xsna.dgm;
import xsna.e3a;
import xsna.eda;
import xsna.ek;
import xsna.f540;
import xsna.fd40;
import xsna.fsq;
import xsna.fz8;
import xsna.g750;
import xsna.hda;
import xsna.hvz;
import xsna.hyu;
import xsna.i1a;
import xsna.izs;
import xsna.jda;
import xsna.kq;
import xsna.kq3;
import xsna.lq;
import xsna.mau;
import xsna.msy;
import xsna.n1i;
import xsna.op0;
import xsna.q9a;
import xsna.qmk0;
import xsna.rsg0;
import xsna.rsi;
import xsna.s1v;
import xsna.tba;
import xsna.tfx;
import xsna.tq3;
import xsna.u110;
import xsna.u4a;
import xsna.uba;
import xsna.ufk;
import xsna.vha;
import xsna.w7p0;
import xsna.w950;
import xsna.wfb0;
import xsna.wga;
import xsna.xga;
import xsna.yfb;

/* compiled from: MusicArtistCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class a extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final xga H;
    public final C0517a I;
    public final bpn0 J;
    public final bpn0 K;
    public final bpn0 L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final e3a T;
    public final afa U;

    /* compiled from: MusicArtistCatalogConfiguration.kt */
    /* renamed from: com.vk.catalog2.feature.music.configuration.a$a, reason: collision with other inner class name */
    public static final class C0517a {
    }

    /* compiled from: MusicArtistCatalogConfiguration.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.ARTIST_HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.BIOGRAPHY_LAYOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ARTIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConcertSliderViewStyle.Style.values().length];
            try {
                iArr3[ConcertSliderViewStyle.Style.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[ConcertSliderViewStyle.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr4[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: MusicArtistCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: MusicArtistCatalogConfiguration.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CatalogSectionResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
            return ((afa) this.receiver).a(catalogSectionResponseObjectDto);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Bundle bundle, C0517a c0517a) {
        super(UserId.d, r0);
        String str;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("artist_id", "");
        String string3 = bundle.getString("key_url");
        SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
        String a = (searchStatsLoggingInfo == null || (str = searchStatsLoggingInfo.f) == null) ? null : cqm0.a(str);
        String string4 = bundle.getString("launch_origin");
        String str2 = string4 != null ? string4 : "";
        xga xgaVar = new xga();
        this.D = string2;
        this.E = string3;
        this.F = a;
        this.G = str2;
        this.H = xgaVar;
        this.I = c0517a;
        this.J = new bpn0(new l(26));
        this.K = new bpn0(new hvz(this, 12));
        this.L = new bpn0(new f540(this, 1));
        n1i n1iVar = new n1i(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.M = msy.a(lazyThreadSafetyMode, n1iVar);
        this.N = msy.a(lazyThreadSafetyMode, new b1z(this, 7));
        this.O = msy.a(lazyThreadSafetyMode, new cf00(this, 6));
        this.P = msy.a(lazyThreadSafetyMode, new u110(this, 3));
        this.Q = msy.a(lazyThreadSafetyMode, new dgm(this, 24));
        this.R = msy.a(lazyThreadSafetyMode, new ek(18));
        this.S = msy.a(lazyThreadSafetyMode, new ufk(this, 15));
        this.T = new e3a();
        this.U = new afa();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        ConcertsCatalogUiViewTracker.EntryPoint entryPoint = ConcertsCatalogUiViewTracker.EntryPoint.ARTIST_CARD;
        s1v e = com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar);
        u4a.a aVar = u4aVar.b;
        ConcertsCatalogUiViewTracker concertsCatalogUiViewTracker = new ConcertsCatalogUiViewTracker(entryPoint, e, aVar.I);
        this.I.getClass();
        return new rsi(concertsCatalogUiViewTracker, new kq3(com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar), aVar.I));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final q<hda> D(String str, String str2, boolean z) {
        ArrayList arrayList;
        String Lb = MusicPlaybackLaunchContext.Fb(this.c).Cb(this.G).Lb();
        CatalogFeatures.Companion.getClass();
        List a = CatalogFeatures.a.a();
        if (a != null) {
            List list = a;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        return ((q9a) this.J.getValue()).b(rsg0.T(yfb.x(wga.d(this.H, str, null, str2, Boolean.valueOf(z), arrayList2, Lb, 29562))).U(new op0(new d(1, this.U, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 23)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return b.$EnumSwitchMapping$3[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new tq3() : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new fz8(new wfb0(Collections.singleton(new fd40())), u4aVar.c.d);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new VerticalStackedListVh(this, hVar, tbaVar, u4aVar, null, 0, null, new g750(), 976);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final eda.a g() {
        return new i1a(this, new qmk0(5));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final q<hda> j(String str, String str2, String str3) {
        return ((q9a) this.J.getValue()).b(super.j(str, str2, str3));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("artist_id", this.D);
        r.putString("key_url", this.E);
        r.putString("launch_origin", this.G);
        return r;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        String str;
        u4a.a aVar = u4aVar.b;
        int i = b.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        C0517a c0517a = this.I;
        switch (i) {
            case 1:
                VkTopBarVh vkTopBarVh = new VkTopBarVh(aVar.b, aVar.e, null, new w7p0(false, null, com.vk.core.compose.component.semantics.b.a(null, new hyu(6), 3), com.vk.core.compose.component.semantics.b.a(null, new com(16), 3), null, null, null, null, null, 32575), null, b0(u4aVar), null, null, 3700);
                if (uIBlock == null || (str = uIBlock.b) == null) {
                    str = "";
                }
                uba ubaVar = new uba(h0(null, str, u4aVar));
                MusicShowAllListVh musicShowAllListVh = new MusicShowAllListVh(uIBlock != null ? uIBlock.c : null, u4aVar, vkTopBarVh, com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar, 8), (w950) this.Q.getValue(), null, false, 480);
                ubaVar.h = musicShowAllListVh;
                break;
            case 2:
                int i2 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    break;
                } else {
                    break;
                }
            case 3:
                int i3 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i3 == 3) {
                    break;
                } else if (i3 == 4) {
                    if (!aVar.c) {
                        break;
                    } else {
                        break;
                    }
                } else if (i3 == 5) {
                    c0517a.getClass();
                    break;
                } else {
                    break;
                }
            case 4:
                c0517a.getClass();
                int i4 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                ?? r7 = this.O;
                ?? r8 = this.N;
                ?? r9 = this.M;
                bpn0 bpn0Var = this.L;
                if (i4 == 6) {
                    break;
                } else if (i4 == 7) {
                    break;
                } else {
                    break;
                }
            case 5:
                int i5 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                ?? r82 = this.P;
                ?? r92 = this.R;
                if (i5 == 1) {
                    if (!((Boolean) r92.getValue()).booleanValue()) {
                        break;
                    } else {
                        ConcertSliderViewStyle concertSliderViewStyle = catalogViewStyle instanceof ConcertSliderViewStyle ? (ConcertSliderViewStyle) catalogViewStyle : null;
                        ConcertSliderViewStyle.Style style = concertSliderViewStyle != null ? concertSliderViewStyle.b : null;
                        int i6 = style == null ? -1 : b.$EnumSwitchMapping$2[style.ordinal()];
                        break;
                    }
                } else if (i5 == 10) {
                    if (!((Boolean) r92.getValue()).booleanValue()) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 6:
                if (catalogViewType != CatalogViewType.SLIDER) {
                    break;
                } else {
                    break;
                }
            case 7:
                int i7 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i7 != 8 && i7 != 9) {
                    break;
                } else {
                    break;
                }
        }
        return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final q<hda> x(UserId userId, String str) {
        ArrayList arrayList;
        String Lb = MusicPlaybackLaunchContext.Fb(str).Cb(this.G).Lb();
        CatalogFeatures.Companion.getClass();
        List a = CatalogFeatures.a.a();
        if (a != null) {
            List list = a;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
            }
        } else {
            arrayList = null;
        }
        this.H.getClass();
        tfx tfxVar = new tfx("catalog.getAudioArtist", new kq(9), new lq(7));
        String str2 = this.D;
        if (str2 != null) {
            tfx.o(tfxVar, "artist_id", str2, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        String str3 = this.E;
        if (str3 != null) {
            tfx.o(tfxVar, "url", str3, 0, 0, 12);
        }
        if (Lb != null) {
            tfx.o(tfxVar, "ref", Lb, 0, 0, 12);
            tfxVar = tfxVar;
        }
        String str4 = this.F;
        if (str4 != null) {
            tfx.o(tfxVar, "from_trackcode", str4, 0, 0, 12);
        }
        if (arrayList != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(arrayList), 0, 0, 12);
        }
        return ((q9a) this.J.getValue()).b(rsg0.T(yfb.x(tfxVar)).U(new mau(new c(1, this.T, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 5)).D(new fsq(new ba40(this, 0), 9)));
    }
}
