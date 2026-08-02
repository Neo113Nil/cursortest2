package com.vk.catalog2.feature.music.api;

import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.catalog.dto.CatalogSearchRecentDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.movika.sdk.base.ui.t;
import com.vk.movika.sdk.base.ui.v;
import com.vk.music.search.history.SearchHistoryModel;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.toggle.b;
import com.vk.toggle.features.CatalogFeatures;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.bpn0;
import xsna.c5g;
import xsna.d14;
import xsna.dja;
import xsna.e05;
import xsna.gvh0;
import xsna.gzs;
import xsna.hda;
import xsna.i22;
import xsna.irh0;
import xsna.q9a;
import xsna.r250;
import xsna.rsg0;
import xsna.tl0;
import xsna.u6;
import xsna.wba;
import xsna.wga;
import xsna.wzs;
import xsna.xl0;
import xsna.xs6;
import xsna.yfb;
import xsna.yp70;
import xsna.z5a;
import xsna.zrp;

/* compiled from: CatalogGetAudioSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class CatalogGetAudioSearchRequestFactory extends com.vk.catalog2.common.dto.api.a {
    public static final irh0 y = new irh0(true, false, 403);
    public static final x z = io.reactivex.rxjava3.core.x.k(EmptyList.b);
    public final r250 s;
    public final yp70 t;
    public final FunctionReferenceImpl u;
    public final bpn0 v;
    public final t w;
    public final bpn0 x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetAudioSearchRequestFactory.kt */
    public static final class SearchMusicEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchMusicEntrypoint[] $VALUES;
        public static final SearchMusicEntrypoint GlobalSearchTab;
        public static final SearchMusicEntrypoint SearchInService;
        public static final SearchMusicEntrypoint SearchInServiceKids;
        private final String apiName;

        static {
            SearchMusicEntrypoint searchMusicEntrypoint = new SearchMusicEntrypoint("GlobalSearchTab", 0, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC));
            GlobalSearchTab = searchMusicEntrypoint;
            SearchMusicEntrypoint searchMusicEntrypoint2 = new SearchMusicEntrypoint("SearchInService", 1, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC_SERVICE));
            SearchInService = searchMusicEntrypoint2;
            SearchMusicEntrypoint searchMusicEntrypoint3 = new SearchMusicEntrypoint("SearchInServiceKids", 2, "search_music_service_kids");
            SearchInServiceKids = searchMusicEntrypoint3;
            SearchMusicEntrypoint[] searchMusicEntrypointArr = {searchMusicEntrypoint, searchMusicEntrypoint2, searchMusicEntrypoint3};
            $VALUES = searchMusicEntrypointArr;
            $ENTRIES = new asp(searchMusicEntrypointArr);
        }

        public SearchMusicEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchMusicEntrypoint valueOf(String str) {
            return (SearchMusicEntrypoint) Enum.valueOf(SearchMusicEntrypoint.class, str);
        }

        public static SearchMusicEntrypoint[] values() {
            return (SearchMusicEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: CatalogGetAudioSearchRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchHistoryModel.Type.values().length];
            try {
                iArr[SearchHistoryModel.Type.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryModel.Type.TrackLyrics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchHistoryModel.Type.Artist.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchHistoryModel.Type.Podcast.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchHistoryModel.Type.AudioBook.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchHistoryModel.Type.Album.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SearchHistoryModel.Type.Playlist.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SearchHistoryModel.Type.RadioStation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SearchHistoryModel.Type.Video.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogGetAudioSearchRequestFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<hda, List<? extends String>, hda> {
        @Override // xsna.wzs
        public final hda invoke(hda hdaVar, List<? extends String> list) {
            hda hdaVar2 = hdaVar;
            ((dja) this.receiver).b(hdaVar2, list);
            return hdaVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogGetAudioSearchRequestFactory(wba wbaVar, gzs gzsVar, r250 r250Var, yp70 yp70Var, gzs gzsVar2) {
        super(wbaVar, new xs6(3), "local_block_id", (SearchRequestFactory.a) gzsVar.invoke(), null, 16);
        this.s = r250Var;
        this.t = yp70Var;
        this.u = (FunctionReferenceImpl) gzsVar2;
        this.v = new bpn0(new d14(4));
        this.w = new t(this, 15);
        this.x = new bpn0(new v(6));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // com.vk.catalog2.common.dto.api.a
    public final io.reactivex.rxjava3.core.x<hda> p(String str) {
        ArrayList arrayList;
        Object failure;
        CatalogSearchRecentDto.EntityTypeDto entityTypeDto;
        CatalogSearchRecentDto catalogSearchRecentDto;
        wga k = k();
        SearchRequestFactory.a aVar = this.d;
        boolean z2 = aVar == SearchMusicEntrypoint.SearchInServiceKids ? false : this.h;
        ArrayList arrayList2 = null;
        String h = aVar != null ? aVar.h() : null;
        String str2 = this.k == SearchRequestFactory.InputMethod.Suggest ? this.f : null;
        CatalogFeatures.Companion.getClass();
        List a2 = CatalogFeatures.a.a();
        if (a2 != null) {
            List<b.d> list = a2;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            for (b.d dVar : list) {
                arrayList3.add(new AccountToggleDto(dVar.a, dVar.b.toString(), dVar.c.toString(), null, null, 24, null));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (this.d != SearchMusicEntrypoint.SearchInServiceKids && ((Boolean) this.u.invoke()).booleanValue() && (str == null || str.length() == 0)) {
            yp70 yp70Var = this.t;
            gvh0<SearchHistoryModel> gvh0Var = yp70Var.a;
            try {
                failure = gvh0Var.a();
                yp70Var.i = gvh0Var.c();
                if (yp70Var.j == 0) {
                    yp70Var.j = ((Number) yp70Var.e.invoke()).longValue();
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) != null) {
                failure = EmptyList.b;
            }
            ArrayList arrayList4 = new ArrayList();
            for (SearchHistoryModel searchHistoryModel : (List) failure) {
                String valueOf = String.valueOf(searchHistoryModel.q().b);
                String id = searchHistoryModel.getType() == SearchHistoryModel.Type.Podcast ? null : searchHistoryModel.getId();
                switch (a.$EnumSwitchMapping$0[searchHistoryModel.getType().ordinal()]) {
                    case 1:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.AUDIO;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 2:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.FOUND_BY_LYRICS;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 3:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.ARTIST;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 4:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.PODCAST;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 5:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.AUDIOBOOK;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 6:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.ALBUM;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 7:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.PLAYLIST;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 8:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.RADIO;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    case 9:
                        entityTypeDto = CatalogSearchRecentDto.EntityTypeDto.VIDEO;
                        catalogSearchRecentDto = new CatalogSearchRecentDto(entityTypeDto, id, valueOf);
                        break;
                    default:
                        catalogSearchRecentDto = null;
                        break;
                }
                if (catalogSearchRecentDto != null) {
                    arrayList4.add(catalogSearchRecentDto);
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
        }
        return new o(rsg0.w0(yfb.x(wga.i(k, str, arrayList2, h, Boolean.valueOf(z2), str2, null, arrayList, null, 644))), new i22(new z5a(0, this, str), 6)).l(new e05(new tl0(this, 20), 5));
    }

    @Override // com.vk.catalog2.common.dto.api.a
    public final io.reactivex.rxjava3.core.x<hda> q(String str) {
        return ((q9a) this.v.getValue()).a(new r(p(str), new xl0(new u6(4, str, this), 10)));
    }
}
