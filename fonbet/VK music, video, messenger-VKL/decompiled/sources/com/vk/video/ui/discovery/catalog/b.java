package com.vk.video.ui.discovery.catalog;

import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Params;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.catalog.a;
import com.vk.video.ui.discovery.catalog.c;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ahn;
import xsna.awi0;
import xsna.dso0;
import xsna.epx;
import xsna.eum;
import xsna.exi0;
import xsna.fw3;
import xsna.fxc0;
import xsna.fz2;
import xsna.gda0;
import xsna.gs00;
import xsna.ha40;
import xsna.hdi0;
import xsna.hi70;
import xsna.hq;
import xsna.i630;
import xsna.jh;
import xsna.nc90;
import xsna.oe40;
import xsna.pmp0;
import xsna.qfs0;
import xsna.qhg0;
import xsna.qjl0;
import xsna.qoy;
import xsna.qw80;
import xsna.rfs0;
import xsna.rsg0;
import xsna.tfx;
import xsna.uf20;
import xsna.uf3;
import xsna.vhs0;
import xsna.w11;
import xsna.wo40;
import xsna.xb20;
import xsna.xvq0;
import xsna.yfb;

/* compiled from: VideoDiscoveryCatalogPagedDataProviderDelegate.kt */
/* loaded from: classes7.dex */
public final class b implements c.m<a> {
    public final d b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final vhs0 d;
    public io.reactivex.rxjava3.disposables.c e;
    public VideoDiscoveryCatalogSourceArgs f;
    public String g;
    public VideoDiscoveryCatalogRepository$Section h;
    public VideoDiscoveryCatalogRepository$Section i;
    public boolean j;

    /* compiled from: VideoDiscoveryCatalogPagedDataProviderDelegate.kt */
    public static abstract class a {

        /* compiled from: VideoDiscoveryCatalogPagedDataProviderDelegate.kt */
        /* renamed from: com.vk.video.ui.discovery.catalog.b$a$a, reason: collision with other inner class name */
        public static final class C1967a extends a {
            public final VideoDiscoveryCatalogRepository$Section a;
            public final boolean b;
            public final VideoDiscoveryCatalogSourceArgs.Catalog c;

            public C1967a(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, boolean z, VideoDiscoveryCatalogSourceArgs.Catalog catalog) {
                this.a = videoDiscoveryCatalogRepository$Section;
                this.b = z;
                this.c = catalog;
            }

            @Override // com.vk.video.ui.discovery.catalog.b.a
            public final VideoDiscoveryCatalogSourceArgs a() {
                return this.c;
            }

            @Override // com.vk.video.ui.discovery.catalog.b.a
            public final String b() {
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.a;
                if (videoDiscoveryCatalogRepository$Section != null) {
                    return videoDiscoveryCatalogRepository$Section.g;
                }
                return null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1967a)) {
                    return false;
                }
                C1967a c1967a = (C1967a) obj;
                return epx.f(this.a, c1967a.a) && this.b == c1967a.b && epx.f(this.c, c1967a.c);
            }

            public final int hashCode() {
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.a;
                return this.c.hashCode() + qoy.b((videoDiscoveryCatalogRepository$Section == null ? 0 : videoDiscoveryCatalogRepository$Section.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                return "Page(section=" + this.a + ", sectionChange=" + this.b + ", config=" + this.c + ')';
            }
        }

        /* compiled from: VideoDiscoveryCatalogPagedDataProviderDelegate.kt */
        /* renamed from: com.vk.video.ui.discovery.catalog.b$a$b, reason: collision with other inner class name */
        public static final class C1968b extends a {
            public final VideoDiscoveryCatalogSourceArgs a;
            public final List<VideoDiscoveryCatalogRepository$Section> b;
            public final VideoDiscoveryCatalogRepository$Section c;

            public C1968b(VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs, List<VideoDiscoveryCatalogRepository$Section> list, VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section) {
                this.a = videoDiscoveryCatalogSourceArgs;
                this.b = list;
                this.c = videoDiscoveryCatalogRepository$Section;
            }

            @Override // com.vk.video.ui.discovery.catalog.b.a
            public final VideoDiscoveryCatalogSourceArgs a() {
                return this.a;
            }

            @Override // com.vk.video.ui.discovery.catalog.b.a
            public final String b() {
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.c;
                if (videoDiscoveryCatalogRepository$Section != null) {
                    return videoDiscoveryCatalogRepository$Section.g;
                }
                return null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1968b)) {
                    return false;
                }
                C1968b c1968b = (C1968b) obj;
                return epx.f(this.a, c1968b.a) && epx.f(this.b, c1968b.b) && epx.f(this.c, c1968b.c);
            }

            public final int hashCode() {
                int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.c;
                return a + (videoDiscoveryCatalogRepository$Section == null ? 0 : videoDiscoveryCatalogRepository$Section.hashCode());
            }

            public final String toString() {
                return "Skeleton(config=" + this.a + ", sections=" + this.b + ", currentSection=" + this.c + ')';
            }
        }

        public abstract VideoDiscoveryCatalogSourceArgs a();

        public abstract String b();
    }

    public b(d dVar, io.reactivex.rxjava3.disposables.b bVar, vhs0 vhs0Var) {
        this.b = dVar;
        this.c = bVar;
        this.d = vhs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (xsna.epx.f(r2, r6 != null ? r6.a : null) == false) goto L13;
     */
    @Override // com.vk.lists.c.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q<a> O9(String str, com.vk.lists.c cVar) {
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section;
        String str2;
        String str3;
        q f;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = this.i;
        boolean z = false;
        if (!this.j) {
            if (videoDiscoveryCatalogRepository$Section2 != null) {
                String str4 = videoDiscoveryCatalogRepository$Section2.a;
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section3 = this.h;
            }
            boolean z2 = z;
            videoDiscoveryCatalogRepository$Section = this.h;
            if (videoDiscoveryCatalogRepository$Section != null || (str2 = videoDiscoveryCatalogRepository$Section.a) == null) {
                return g0.b;
            }
            VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs = this.f;
            VideoDiscoveryCatalogSourceArgs.Catalog catalog = videoDiscoveryCatalogSourceArgs instanceof VideoDiscoveryCatalogSourceArgs.Catalog ? (VideoDiscoveryCatalogSourceArgs.Catalog) videoDiscoveryCatalogSourceArgs : null;
            if (catalog == null) {
                return g0.b;
            }
            VideoDiscoveryCatalogRepository$Params a2 = VideoDiscoveryCatalogRepository$Params.a.a(catalog, this.g);
            VideoDiscoveryCatalogRepository$Params.Catalog catalog2 = a2 instanceof VideoDiscoveryCatalogRepository$Params.Catalog ? (VideoDiscoveryCatalogRepository$Params.Catalog) a2 : null;
            if (catalog2 == null) {
                return g0.b;
            }
            d dVar = this.b;
            dVar.getClass();
            if (fxc0.B().J().m0()) {
                f = dVar.b(catalog2, str2, str).U(new awi0(new ha40(23), 6));
            } else {
                c cVar2 = dVar.a;
                cVar2.getClass();
                if (catalog2.f == VideoDiscoveryCatalogRepository$Params.Catalog.CatalogType.MUSIC) {
                    f = cVar2.b(catalog2, str, "__discovery_catalog_special_fallback_music_section_id__", (String) cVar2.h.invoke(), VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType.MUSIC).U(new eum(c.a.b, 1));
                } else if (cVar2.e()) {
                    f = cVar2.b(catalog2, str, "__discovery_catalog_special_fallback_kids_section_id__", (String) cVar2.e.invoke(), VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType.VIDEO).U(new gs00(c.b.b, 16));
                } else {
                    String str5 = str;
                    String str6 = catalog2.c;
                    int i = catalog2.a;
                    UserId userId = catalog2.b;
                    String str7 = catalog2.e;
                    String str8 = catalog2.d;
                    if (str5.equals("__discovery_catalog_special_section_next_from__")) {
                        str5 = null;
                    }
                    tfx tfxVar = new tfx("catalog.getVideoDiscoveryRelatedTabsSection", new w11(9), new uf3(3));
                    if (str6 != null) {
                        tfx.o(tfxVar, "from_trackcode", str6, 0, 0, 12);
                    }
                    if (userId != null) {
                        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                    }
                    tfx.l(tfxVar, "video_id", i, 0, 0, 8);
                    if (str2 != null) {
                        str3 = str7;
                        tfx.o(tfxVar, "section_id", str2, 0, 255, 4);
                    } else {
                        str3 = str7;
                    }
                    tfxVar.j("need_blocks", true);
                    if (str8 != null) {
                        tfx.o(tfxVar, "payload", str8, 0, 0, 12);
                    }
                    if (str3 != null) {
                        tfx.o(tfxVar, "ref", str3, 0, 0, 12);
                    }
                    if (str5 != null) {
                        tfx.o(tfxVar, "start_from", str5, 0, 0, 12);
                    }
                    fz2 y = yfb.y(tfxVar, new exi0(cVar2, 21));
                    ahn.D(y);
                    f = cVar2.f(rsg0.T(y));
                }
            }
            return f.U(new hi70(new rfs0(z2, catalog), 11));
        }
        this.j = false;
        this.h = videoDiscoveryCatalogRepository$Section2;
        this.d.invoke(a.C1966a.a);
        z = true;
        boolean z22 = z;
        videoDiscoveryCatalogRepository$Section = this.h;
        if (videoDiscoveryCatalogRepository$Section != null) {
        }
        return g0.b;
    }

    public final void a(String str) {
        if (fxc0.B().J().J0()) {
            this.g = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // com.vk.lists.c.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q<a> hj(com.vk.lists.c cVar, boolean z) {
        boolean z2;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs;
        VideoDiscoveryCatalogRepository$Params a2;
        q f;
        tfx tfxVar;
        String str;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.h;
        this.i = null;
        this.h = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.d.invoke(a.c.a);
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs2 = this.f;
        cVar.p = videoDiscoveryCatalogSourceArgs2 instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos;
        if (!(videoDiscoveryCatalogSourceArgs2 instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos)) {
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = this.h;
            if ((videoDiscoveryCatalogRepository$Section2 != null ? videoDiscoveryCatalogRepository$Section2.e : null) != VideoDiscoveryCatalogRepository$Section.SectionType.MusicMix) {
                z2 = true;
                cVar.r(z2);
                videoDiscoveryCatalogSourceArgs = this.f;
                if (videoDiscoveryCatalogSourceArgs != null) {
                    return g0.b;
                }
                if ((videoDiscoveryCatalogRepository$Section != null ? videoDiscoveryCatalogRepository$Section.e : null) == VideoDiscoveryCatalogRepository$Section.SectionType.MusicMix && (videoDiscoveryCatalogSourceArgs instanceof VideoDiscoveryCatalogSourceArgs.Catalog)) {
                    VideoDiscoveryCatalogSourceArgs.Catalog catalog = (VideoDiscoveryCatalogSourceArgs.Catalog) videoDiscoveryCatalogSourceArgs;
                    a2 = VideoDiscoveryCatalogRepository$Params.a.a(new VideoDiscoveryCatalogSourceArgs.Catalog(catalog.b, catalog.c, catalog.d, "mix", VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType.MUSIC), this.g);
                } else {
                    a2 = VideoDiscoveryCatalogRepository$Params.a.a(videoDiscoveryCatalogSourceArgs, this.g);
                }
                boolean z3 = a2 instanceof VideoDiscoveryCatalogRepository$Params.Catalog;
                d dVar = this.b;
                if (z3) {
                    dVar.getClass();
                    if (fxc0.B().J().m0()) {
                        f = dVar.b((VideoDiscoveryCatalogRepository$Params.Catalog) a2, null, null);
                        return f.U(new oe40(new qjl0(videoDiscoveryCatalogSourceArgs, 11), 16));
                    }
                }
                c cVar3 = dVar.a;
                cVar3.getClass();
                if (a2 instanceof VideoDiscoveryCatalogRepository$Params.Catalog) {
                    VideoDiscoveryCatalogRepository$Params.Catalog catalog2 = (VideoDiscoveryCatalogRepository$Params.Catalog) a2;
                    if (catalog2.f == VideoDiscoveryCatalogRepository$Params.Catalog.CatalogType.MUSIC) {
                        f = cVar3.f(cVar3.b(catalog2, "0", "__discovery_catalog_special_fallback_music_section_id__", (String) cVar3.h.invoke(), VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType.MUSIC).U(new xb20(new nc90(25), 22)));
                    } else if (cVar3.e()) {
                        f = cVar3.f(cVar3.b(catalog2, "0", "__discovery_catalog_special_fallback_kids_section_id__", (String) cVar3.e.invoke(), VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType.VIDEO).U(new i630(new pmp0(4), 19)));
                    } else {
                        String str2 = catalog2.c;
                        int i = catalog2.a;
                        UserId userId = catalog2.b;
                        String str3 = catalog2.e;
                        String str4 = catalog2.d;
                        tfx tfxVar2 = new tfx("catalog.getVideoDiscoveryRelatedTabs", new hq(5), new jh(6));
                        if (str2 != null) {
                            tfxVar = tfxVar2;
                            tfx.o(tfxVar, "from_trackcode", str2, 0, 0, 12);
                        } else {
                            tfxVar = tfxVar2;
                        }
                        if (userId != null) {
                            tfx tfxVar3 = tfxVar;
                            str = str3;
                            tfx.n(tfxVar3, "owner_id", userId, 0L, 0L, 12);
                            tfxVar = tfxVar3;
                        } else {
                            str = str3;
                        }
                        tfx tfxVar4 = tfxVar;
                        tfx.l(tfxVar4, "video_id", i, 0, 0, 8);
                        tfx tfxVar5 = tfxVar4;
                        tfxVar5.j("need_blocks", true);
                        if (str4 != null) {
                            tfx.o(tfxVar5, "payload", str4, 0, 0, 12);
                        }
                        if (str != null) {
                            tfx.o(tfxVar5, "ref", str, 0, 0, 12);
                            tfxVar5 = tfxVar5;
                        }
                        fz2 y = yfb.y(tfxVar5, new dso0(cVar3, 13));
                        ahn.D(y);
                        f = cVar3.f(rsg0.T(y));
                    }
                } else if (a2 instanceof VideoDiscoveryCatalogRepository$Params.c) {
                    f = fxc0.B().s().B().U(new qw80(new gda0(cVar3, 27), 13));
                } else {
                    if (!(a2 instanceof VideoDiscoveryCatalogRepository$Params.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VideoDiscoveryCatalogRepository$Params.b bVar = (VideoDiscoveryCatalogRepository$Params.b) a2;
                    f = cVar3.f(cVar3.a.b(new VideoDiscoveryRecommendationsRepository.Params.a(bVar.b, 0, 5, bVar.a, bVar.d, bVar.c, "")).U(new uf20(new qhg0(cVar3, 20), 22)));
                }
                return f.U(new oe40(new qjl0(videoDiscoveryCatalogSourceArgs, 11), 16));
            }
        }
        z2 = false;
        cVar.r(z2);
        videoDiscoveryCatalogSourceArgs = this.f;
        if (videoDiscoveryCatalogSourceArgs != null) {
        }
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<a> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new hdi0(new qfs0(this, z, cVar), 7), new xvq0(new wo40(22), 4));
        this.c.b(subscribe);
        this.e = subscribe;
    }
}
