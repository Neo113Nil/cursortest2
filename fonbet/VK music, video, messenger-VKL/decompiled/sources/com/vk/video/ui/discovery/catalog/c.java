package com.vk.video.ui.discovery.catalog;

import androidx.core.app.NotificationCompat;
import com.vk.api.generated.catalog.dto.CatalogDiscoverDataDto;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.bridges.ProfileType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Params;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.arm0;
import xsna.b25;
import xsna.bpn0;
import xsna.c5g;
import xsna.cff;
import xsna.dy20;
import xsna.ey20;
import xsna.fxc0;
import xsna.gy20;
import xsna.igj0;
import xsna.izs;
import xsna.j5g;
import xsna.mz2;
import xsna.o25;
import xsna.q4r0;
import xsna.r2v;
import xsna.s3q0;
import xsna.tfs0;
import xsna.u4r0;
import xsna.ufs0;
import xsna.vqs0;

/* compiled from: VideoDiscoveryCatalogRepositoryLegacy.kt */
/* loaded from: classes7.dex */
public final class c {
    public final VideoDiscoveryRecommendationsRepository a;
    public final u4r0 b;
    public final q4r0 c;
    public final bpn0 d;
    public final dy20 e;
    public final cff f;
    public final ey20 g;
    public final gy20 h;
    public final boolean i = fxc0.B().J().D0();

    /* compiled from: VideoDiscoveryCatalogRepositoryLegacy.kt */
    public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VideoDiscoveryCatalogRepository$Section, tfs0> {
        public static final a b = new a(1, tfs0.class, "<init>", "<init>(Lcom/vk/video/ui/discovery/catalog/VideoDiscoveryCatalogRepository$Section;)V", 0);

        @Override // xsna.izs
        public final tfs0 invoke(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section) {
            return new tfs0(videoDiscoveryCatalogRepository$Section);
        }
    }

    /* compiled from: VideoDiscoveryCatalogRepositoryLegacy.kt */
    public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<VideoDiscoveryCatalogRepository$Section, tfs0> {
        public static final b b = new b(1, tfs0.class, "<init>", "<init>(Lcom/vk/video/ui/discovery/catalog/VideoDiscoveryCatalogRepository$Section;)V", 0);

        @Override // xsna.izs
        public final tfs0 invoke(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section) {
            return new tfs0(videoDiscoveryCatalogRepository$Section);
        }
    }

    public c(VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository, u4r0 u4r0Var, q4r0 q4r0Var, bpn0 bpn0Var, dy20 dy20Var, cff cffVar, ey20 ey20Var, gy20 gy20Var) {
        this.a = videoDiscoveryRecommendationsRepository;
        this.b = u4r0Var;
        this.c = q4r0Var;
        this.d = bpn0Var;
        this.e = dy20Var;
        this.f = cffVar;
        this.g = ey20Var;
        this.h = gy20Var;
    }

    public static VideoDiscoveryCatalogRepository$Section.SectionType d(List list) {
        String M4;
        JSONObject optJSONObject;
        String optString;
        VideoFile videoFile = (VideoFile) j5g.a0(list);
        if (videoFile == null || (M4 = videoFile.M4()) == null || (optJSONObject = new JSONObject(M4).optJSONObject(NotificationCompat.CATEGORY_NAVIGATION)) == null || (optString = optJSONObject.optString("source_block")) == null) {
            return null;
        }
        VideoDiscoveryCatalogRepository$Section.SectionType.Companion.getClass();
        return VideoDiscoveryCatalogRepository$Section.SectionType.a.a(optString);
    }

    public final boolean a(List list, boolean z) {
        ((vqs0) this.d.getValue()).getClass();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return z && !(((b25) bpn0Var.getValue()).c0() == ProfileType.RELATED) && list.isEmpty() && this.i;
    }

    public final j1 b(VideoDiscoveryCatalogRepository$Params.Catalog catalog, String str, String str2, String str3, VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType recommendationType) {
        Integer m = arm0.m(10, str);
        int intValue = m != null ? m.intValue() : 0;
        return this.a.b(new VideoDiscoveryRecommendationsRepository.Params.Recommendations(catalog.a, catalog.b, catalog.c, catalog.d, intValue, 10, catalog.e, recommendationType)).U(new r2v(new ufs0(intValue, str2, str3), 20));
    }

    public final List<UxPoll> c(CatalogDiscoverDataDto catalogDiscoverDataDto) {
        if (!this.b.c()) {
            return EmptyList.b;
        }
        List<UxpollsPollDto> f = catalogDiscoverDataDto != null ? catalogDiscoverDataDto.f() : null;
        if (f == null) {
            f = EmptyList.b;
        }
        List<UxpollsPollDto> list = f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.a((UxpollsPollDto) it.next(), null));
        }
        return arrayList;
    }

    public final boolean e() {
        ((vqs0) this.d.getValue()).getClass();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return ((b25) bpn0Var.getValue()).c0() == ProfileType.RELATED;
    }

    public final q f(io.reactivex.rxjava3.internal.operators.observable.a aVar) {
        return q.I0(aVar, this.b.a().d(q.T(s3q0.a)), new igj0(7, new mz2((byte) 0, 5)));
    }
}
