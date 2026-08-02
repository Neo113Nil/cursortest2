package com.vk.video.ui.discovery.recommendations;

import com.vk.dto.common.id.UserId;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.lists.c;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import com.vk.video.ui.discovery.recommendations.a;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aam0;
import xsna.aer0;
import xsna.c3t;
import xsna.fxc0;
import xsna.jgs0;
import xsna.jvl0;
import xsna.kgs0;
import xsna.le50;
import xsna.onm0;
import xsna.pd40;
import xsna.q7a0;
import xsna.vx30;
import xsna.wx30;

/* compiled from: VideoDiscoveryRecommendationsPagedDataProviderDelegate.kt */
/* loaded from: classes7.dex */
public final class b implements c.l<a> {
    public final VideoDiscoveryRecommendationsRepository b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final aer0 d;
    public io.reactivex.rxjava3.disposables.c e;
    public int f = Integer.MAX_VALUE;
    public int g;
    public VideoDiscoveryRecommendationsSourceArgs h;
    public String i;

    /* compiled from: VideoDiscoveryRecommendationsPagedDataProviderDelegate.kt */
    public static final class a {
        public final VideoDiscoveryRecommendationsSourceArgs a;
        public final c3t b;
        public final String c;
        public final List<UxPoll> d;
        public final int e;
        public final boolean f;

        public a(VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, c3t c3tVar, String str, List<UxPoll> list, int i, boolean z) {
            this.a = videoDiscoveryRecommendationsSourceArgs;
            this.b = c3tVar;
            this.c = str;
            this.d = list;
            this.e = i;
            this.f = z;
        }
    }

    public b(VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository, io.reactivex.rxjava3.disposables.b bVar, aer0 aer0Var) {
        this.b = videoDiscoveryRecommendationsRepository;
        this.c = bVar;
        this.d = aer0Var;
    }

    @Override // com.vk.lists.c.k
    public final void X5(q qVar, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new onm0(new q7a0(10, this, cVar), 5), new jgs0(new jvl0(7), 0));
        this.c.b(subscribe);
        this.e = subscribe;
    }

    public final q<a> a(VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, int i, int i2, boolean z) {
        int i3;
        VideoDiscoveryRecommendationsRepository.Params aVar;
        VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType recommendationType;
        if (videoDiscoveryRecommendationsSourceArgs == null || (!z && (videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos))) {
            return g0.b;
        }
        String str = this.i;
        if (videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.Recommendations) {
            VideoDiscoveryRecommendationsSourceArgs.Recommendations recommendations = (VideoDiscoveryRecommendationsSourceArgs.Recommendations) videoDiscoveryRecommendationsSourceArgs;
            int i4 = recommendations.b;
            UserId userId = recommendations.c;
            String str2 = recommendations.d;
            String str3 = recommendations.e;
            int i5 = c.$EnumSwitchMapping$0[recommendations.f.ordinal()];
            if (i5 == 1) {
                recommendationType = VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType.VIDEO;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                recommendationType = VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType.MUSIC;
            }
            aVar = new VideoDiscoveryRecommendationsRepository.Params.Recommendations(i4, userId, str2, str, i, i2, str3, recommendationType);
            i3 = i;
        } else {
            i3 = i;
            if (videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos) {
                aVar = new VideoDiscoveryRecommendationsRepository.Params.b(i3, i2, ((VideoDiscoveryRecommendationsSourceArgs.OfflineVideos) videoDiscoveryRecommendationsSourceArgs).b);
            } else {
                if (!(videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.MusicMix)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoDiscoveryRecommendationsSourceArgs.MusicMix musicMix = (VideoDiscoveryRecommendationsSourceArgs.MusicMix) videoDiscoveryRecommendationsSourceArgs;
                aVar = new VideoDiscoveryRecommendationsRepository.Params.a(musicMix.b, i3, i2, musicMix.c, musicMix.e, str, musicMix.f);
            }
        }
        return this.b.b(aVar).U(new aam0(new kgs0(videoDiscoveryRecommendationsSourceArgs, i3), 4));
    }

    public final void b(a aVar, boolean z, com.vk.lists.c cVar, boolean z2) {
        this.d.invoke(new a.C1996a(aVar, z, Boolean.valueOf(z2)));
        int i = this.f;
        int i2 = aVar.e;
        int min = Math.min(i, i2);
        boolean z3 = false;
        if (min < 0) {
            min = 0;
        }
        this.f = min;
        if (cVar.f) {
            cVar.d.j(min);
        }
        int max = Math.max(this.g, cVar.k() + i2);
        this.g = max;
        cVar.q(max);
        if (cVar.i() < aVar.b.a && !(this.h instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos)) {
            z3 = true;
        }
        cVar.r(z3);
    }

    public final void c(String str) {
        if (fxc0.B().J().J0()) {
            this.i = str;
        }
    }

    @Override // com.vk.lists.c.k
    public final q<a> hj(com.vk.lists.c cVar, boolean z) {
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.d.invoke(a.b.a);
        VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs = this.h;
        cVar.p = videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos;
        this.f = Integer.MAX_VALUE;
        this.g = 0;
        return a(videoDiscoveryRecommendationsSourceArgs, 0, cVar.k(), true);
    }

    @Override // com.vk.lists.c.l
    public final q<a> ri(int i, int i2, com.vk.lists.c cVar) {
        return a(this.h, i, cVar.k(), false);
    }

    @Override // com.vk.lists.c.l
    public final q<a> ui(int i, com.vk.lists.c cVar) {
        return a(this.h, i, cVar.k(), false);
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<a> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new pd40(new vx30(this, z, cVar, 1), 19), new le50(new wx30(20), 23));
        this.c.b(subscribe);
        this.e = subscribe;
    }
}
