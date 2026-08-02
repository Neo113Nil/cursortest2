package com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMoviePageButtonDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.VideoFileOld;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.drm0;
import xsna.f2a;
import xsna.j5g;
import xsna.ums0;

/* compiled from: MovieButtonsBlockStateMapper.kt */
/* loaded from: classes.dex */
public final class a implements f2a<MovieButtonsBlockState> {

    /* compiled from: MovieButtonsBlockStateMapper.kt */
    /* renamed from: com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class C0459a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogVideoMovieDto.MainRubricDto.values().length];
            try {
                iArr[CatalogVideoMovieDto.MainRubricDto.MOVIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogVideoMovieDto.MainRubricDto.SERIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogVideoMovieDto.MainRubricDto.TVSHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogVideoMovieDto.LicenseTypeDto.values().length];
            try {
                iArr2[CatalogVideoMovieDto.LicenseTypeDto.LICENSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogVideoMovieDto.LicenseTypeDto.EXTERNAL_PIRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogVideoMovieDto.LicenseTypeDto.INTERNAL_PIRATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<MovieButtonsBlockState> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        MovieButtonsBlockState movieButtonsBlockState;
        Object obj;
        List<VideoVideoFullDto> p;
        Object obj2;
        MovieButtonsBlockState.WatchButtonState watchButtonState;
        List<CatalogVideoMoviePageButtonDto> D;
        ?? r4;
        ?? r10;
        List<Integer> L1 = catalogBlockDto.L1();
        ArrayList arrayList = null;
        if (L1 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = L1.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                List<CatalogVideoMovieDto> k = catalogExtraResponseObjectDto.k();
                if (k != null) {
                    Iterator it2 = k.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((CatalogVideoMovieDto) obj).getId() == intValue) {
                            break;
                        }
                    }
                    CatalogVideoMovieDto catalogVideoMovieDto = (CatalogVideoMovieDto) obj;
                    if (catalogVideoMovieDto != null && (p = catalogExtraResponseObjectDto.p()) != null) {
                        Iterator it3 = p.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj2;
                            List<String> f3 = catalogBlockDto.f3();
                            if (f3 != null) {
                                List<String> list = f3;
                                r10 = new ArrayList(c5g.u(list, 10));
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    String str = (String) j5g.k0(drm0.c0((String) it4.next(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                                    r10.add(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
                                }
                            } else {
                                r10 = 0;
                            }
                            if (r10 == 0) {
                                r10 = EmptyList.b;
                            }
                            if (r10.contains(videoVideoFullDto.s1())) {
                                break;
                            }
                        }
                        VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) obj2;
                        if (videoVideoFullDto2 != null) {
                            VideoFileOld d = ums0.d(ums0.a, videoVideoFullDto2, null, null, null, 30);
                            BlockId.Simple a = BlockId.Simple.a(catalogBlockDto.getId());
                            CatalogVideoMovieDto.LicenseTypeDto o = catalogVideoMovieDto.o();
                            int i = o == null ? -1 : C0459a.$EnumSwitchMapping$1[o.ordinal()];
                            if (i != -1) {
                                if (i == 1) {
                                    CatalogVideoMovieDto.MainRubricDto p2 = catalogVideoMovieDto.p();
                                    int i2 = p2 == null ? -1 : C0459a.$EnumSwitchMapping$0[p2.ordinal()];
                                    if (i2 == -1 || i2 == 1) {
                                        watchButtonState = MovieButtonsBlockState.WatchButtonState.WatchMovie.b;
                                    } else {
                                        if (i2 != 2 && i2 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        watchButtonState = MovieButtonsBlockState.WatchButtonState.WatchSeries.b;
                                    }
                                    MovieButtonsBlockState.WatchButtonState watchButtonState2 = watchButtonState;
                                    D = catalogVideoMovieDto.D();
                                    if (D == null) {
                                        List<CatalogVideoMoviePageButtonDto> list2 = D;
                                        r4 = new ArrayList(c5g.u(list2, 10));
                                        Iterator it5 = list2.iterator();
                                        while (it5.hasNext()) {
                                            r4.add(((CatalogVideoMoviePageButtonDto) it5.next()).d());
                                        }
                                    } else {
                                        r4 = 0;
                                    }
                                    if (r4 == 0) {
                                        r4 = EmptyList.b;
                                    }
                                    movieButtonsBlockState = new MovieButtonsBlockState(a, catalogBlockVariant, watchButtonState2, r4.contains(CatalogVideoMoviePageButtonDto.TypeDto.WATCH_LATER), d, catalogVideoMovieDto.o() != CatalogVideoMovieDto.LicenseTypeDto.LICENSE, 0, 64, null);
                                    if (movieButtonsBlockState != null) {
                                        arrayList2.add(movieButtonsBlockState);
                                    }
                                } else if (i != 2 && i != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            watchButtonState = MovieButtonsBlockState.WatchButtonState.WatchFromSearch.b;
                            MovieButtonsBlockState.WatchButtonState watchButtonState22 = watchButtonState;
                            D = catalogVideoMovieDto.D();
                            if (D == null) {
                            }
                            if (r4 == 0) {
                            }
                            movieButtonsBlockState = new MovieButtonsBlockState(a, catalogBlockVariant, watchButtonState22, r4.contains(CatalogVideoMoviePageButtonDto.TypeDto.WATCH_LATER), d, catalogVideoMovieDto.o() != CatalogVideoMovieDto.LicenseTypeDto.LICENSE, 0, 64, null);
                            if (movieButtonsBlockState != null) {
                            }
                        }
                    }
                }
                movieButtonsBlockState = null;
                if (movieButtonsBlockState != null) {
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }
}
