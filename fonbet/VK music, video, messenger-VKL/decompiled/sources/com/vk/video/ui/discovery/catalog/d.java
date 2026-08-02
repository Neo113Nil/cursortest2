package com.vk.video.ui.discovery.catalog;

import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.api.generated.video.dto.VideoDiscoverAdsDto;
import com.vk.api.generated.video.dto.VideoItemsInSimilarDto;
import com.vk.api.generated.video.dto.VideoRelatedTabDto;
import com.vk.bridges.ProfileType;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.dto.video.Doc2DocItem;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Params;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ahn;
import xsna.arm0;
import xsna.b25;
import xsna.bpn0;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.fbj0;
import xsna.fu10;
import xsna.fxc0;
import xsna.fz2;
import xsna.gwd0;
import xsna.iob;
import xsna.mz2;
import xsna.o25;
import xsna.q4r0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sfs0;
import xsna.tft0;
import xsna.u4r0;
import xsna.uft0;
import xsna.vqs0;
import xsna.yfb;

/* compiled from: VideoDiscoveryCatalogRepositoryNew.kt */
/* loaded from: classes7.dex */
public final class d {
    public final c a;
    public final bpn0 b;
    public final u4r0 c;
    public final q4r0 d;
    public final uft0 e;
    public final bpn0 f;

    /* compiled from: VideoDiscoveryCatalogRepositoryNew.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoItemsInSimilarDto.TypeDto.values().length];
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.CAROUSEL_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.FLOOR_CLIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(c cVar, bpn0 bpn0Var, u4r0 u4r0Var, q4r0 q4r0Var) {
        uft0 uft0Var = new uft0();
        this.a = cVar;
        this.b = bpn0Var;
        this.c = u4r0Var;
        this.d = q4r0Var;
        this.e = uft0Var;
        this.f = new bpn0(new gwd0(14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sfs0 a(int i, int i2, ArrayList arrayList, VideoDiscoverAdsDto videoDiscoverAdsDto, List list, String str, List list2) {
        ?? r4;
        int i3;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section;
        EmptyList emptyList;
        boolean z;
        ArrayList arrayList2 = null;
        if (this.c.c()) {
            List list3 = list == null ? EmptyList.b : list;
            r4 = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                r4.add(this.d.a((UxpollsPollDto) it.next(), null));
            }
        } else {
            r4 = EmptyList.b;
        }
        List list4 = r4;
        if (arrayList.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                if ((((Doc2DocItem) it2.next()) instanceof Doc2DocItem.Video) && (i3 = i3 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        int i4 = i + i3;
        Integer valueOf = Integer.valueOf(i4);
        if (i4 >= i2) {
            valueOf = null;
        }
        String num = valueOf != null ? valueOf.toString() : null;
        if (list2 != null) {
            List<VideoRelatedTabDto> list5 = list2;
            ?? arrayList3 = new ArrayList(c5g.u(list5, 10));
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = null;
            for (VideoRelatedTabDto videoRelatedTabDto : list5) {
                String id = videoRelatedTabDto.getId();
                String title = videoRelatedTabDto.getTitle();
                String str2 = videoRelatedTabDto.d() ? num : "0";
                ArrayList arrayList4 = videoRelatedTabDto.d() ? arrayList : arrayList2;
                VideoDiscoveryCatalogRepository$Section.SectionType.a aVar = VideoDiscoveryCatalogRepository$Section.SectionType.Companion;
                String i5 = videoRelatedTabDto.e().i();
                aVar.getClass();
                VideoDiscoveryCatalogRepository$Section.SectionType a2 = VideoDiscoveryCatalogRepository$Section.SectionType.a.a(i5);
                boolean f = videoDiscoverAdsDto != null ? epx.f(videoDiscoverAdsDto.d(), Boolean.TRUE) : false;
                EmptyList emptyList2 = EmptyList.b;
                ((vqs0) this.b.getValue()).getClass();
                bpn0 bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                boolean z2 = ((b25) bpn0Var.getValue()).c0() == ProfileType.RELATED;
                if (f && !z2) {
                    emptyList2.getClass();
                    if (fxc0.B().J().D0()) {
                        z = true;
                        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section3 = new VideoDiscoveryCatalogRepository$Section(id, title, str2, arrayList4, a2, z, !videoRelatedTabDto.d() ? str : null, (List<UxPoll>) list4);
                        if (!videoRelatedTabDto.d()) {
                            videoDiscoveryCatalogRepository$Section2 = videoDiscoveryCatalogRepository$Section3;
                        }
                        arrayList3.add(videoDiscoveryCatalogRepository$Section3);
                        arrayList2 = null;
                    }
                }
                z = false;
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section32 = new VideoDiscoveryCatalogRepository$Section(id, title, str2, arrayList4, a2, z, !videoRelatedTabDto.d() ? str : null, (List<UxPoll>) list4);
                if (!videoRelatedTabDto.d()) {
                }
                arrayList3.add(videoDiscoveryCatalogRepository$Section32);
                arrayList2 = null;
            }
            videoDiscoveryCatalogRepository$Section = videoDiscoveryCatalogRepository$Section2;
            emptyList = arrayList3;
        } else {
            videoDiscoveryCatalogRepository$Section = null;
            emptyList = EmptyList.b;
        }
        return new sfs0(videoDiscoveryCatalogRepository$Section, emptyList);
    }

    public final q<sfs0> b(VideoDiscoveryCatalogRepository$Params.Catalog catalog, String str, String str2) {
        Integer m;
        Integer m2;
        int i = 0;
        if (((Boolean) this.f.getValue()).booleanValue()) {
            if (str2 != null && (m2 = arm0.m(10, str2)) != null) {
                i = m2.intValue();
            }
            fz2 y = yfb.y(tft0.f(this.e, catalog.b, catalog.a, Integer.valueOf(i), 10, catalog.e, catalog.c, null, catalog.d, str, 836), new iob(this, i, 4));
            ahn.D(y);
            return c(rsg0.T(y));
        }
        if (str2 != null && (m = arm0.m(10, str2)) != null) {
            i = m.intValue();
        }
        int i2 = i;
        fz2 y2 = yfb.y(tft0.k(this.e, catalog.b, catalog.a, Integer.valueOf(i2), Integer.valueOf(epx.f(catalog.e, "mix") ? 5 : 10), catalog.e, catalog.c, null, catalog.d, str, 836), new fu10(this, i2, 2));
        ahn.D(y2);
        return c(rsg0.T(y2));
    }

    public final q c(m1 m1Var) {
        return q.I0(m1Var, this.c.a().d(q.T(s3q0.a)), new fbj0(new mz2((byte) 0, 5)));
    }
}
