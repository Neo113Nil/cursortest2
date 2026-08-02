package com.vk.video.ui.discovery.recommendations;

import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.api.generated.video.dto.VideoDiscoverAdsDto;
import com.vk.bridges.ProfileType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.uxpolls.UxPoll;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.b25;
import xsna.bh10;
import xsna.bpn0;
import xsna.c3t;
import xsna.c5g;
import xsna.c80;
import xsna.epx;
import xsna.ev60;
import xsna.fw3;
import xsna.fxc0;
import xsna.gzs;
import xsna.ho8;
import xsna.kud0;
import xsna.o25;
import xsna.q4r0;
import xsna.qoy;
import xsna.rcs0;
import xsna.s3q0;
import xsna.shy;
import xsna.si60;
import xsna.u4r0;
import xsna.uh3;
import xsna.vqs0;
import xsna.zil0;
import xsna.zrp;
import xsna.zv;

/* compiled from: VideoDiscoveryRecommendationsRepository.kt */
/* loaded from: classes7.dex */
public final class VideoDiscoveryRecommendationsRepository {
    public final u4r0 a;
    public final q4r0 b;
    public final bpn0 c;
    public final boolean d = fxc0.B().J().D0();
    public final bpn0 e = new bpn0(new rcs0(1));
    public final bpn0 f = new bpn0(new kud0(8));

    /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
    public static abstract class Params {

        /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
        public static final class Recommendations extends Params {
            public final int a;
            public final UserId b;
            public final String c;
            public final String d;
            public final int e;
            public final int f;
            public final String g;
            public final RecommendationType h;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
            public static final class RecommendationType {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ RecommendationType[] $VALUES;
                public static final RecommendationType MUSIC;
                public static final RecommendationType VIDEO;

                static {
                    RecommendationType recommendationType = new RecommendationType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
                    VIDEO = recommendationType;
                    RecommendationType recommendationType2 = new RecommendationType("MUSIC", 1);
                    MUSIC = recommendationType2;
                    RecommendationType[] recommendationTypeArr = {recommendationType, recommendationType2};
                    $VALUES = recommendationTypeArr;
                    $ENTRIES = new asp(recommendationTypeArr);
                }

                public RecommendationType() {
                    throw null;
                }

                public static RecommendationType valueOf(String str) {
                    return (RecommendationType) Enum.valueOf(RecommendationType.class, str);
                }

                public static RecommendationType[] values() {
                    return (RecommendationType[]) $VALUES.clone();
                }
            }

            public Recommendations(int i, UserId userId, String str, String str2, int i2, int i3, String str3, RecommendationType recommendationType) {
                this.a = i;
                this.b = userId;
                this.c = str;
                this.d = str2;
                this.e = i2;
                this.f = i3;
                this.g = str3;
                this.h = recommendationType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Recommendations)) {
                    return false;
                }
                Recommendations recommendations = (Recommendations) obj;
                return this.a == recommendations.a && epx.f(this.b, recommendations.b) && epx.f(this.c, recommendations.c) && epx.f(this.d, recommendations.d) && this.e == recommendations.e && this.f == recommendations.f && epx.f(this.g, recommendations.g) && this.h == recommendations.h;
            }

            public final int hashCode() {
                int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
                String str = this.c;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int a2 = shy.a(this.f, shy.a(this.e, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
                String str3 = this.g;
                return this.h.hashCode() + ((a2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Recommendations(videoId=" + this.a + ", videoOwnerId=" + this.b + ", trackCode=" + this.c + ", payload=" + this.d + ", offset=" + this.e + ", count=" + this.f + ", referrer=" + this.g + ", type=" + this.h + ')';
            }
        }

        /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
        public static final class a extends Params {
            public final int a;
            public final UserId b;
            public final String c;
            public final String d;
            public final int e;
            public final int f;
            public final String g;

            public a(int i, int i2, int i3, UserId userId, String str, String str2, String str3) {
                this.a = i;
                this.b = userId;
                this.c = str;
                this.d = str2;
                this.e = i2;
                this.f = i3;
                this.g = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
            }

            public final int hashCode() {
                int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
                String str = this.c;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int a2 = shy.a(this.f, shy.a(this.e, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
                String str3 = this.g;
                return a2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MusicMix(videoId=");
                sb.append(this.a);
                sb.append(", videoOwnerId=");
                sb.append(this.b);
                sb.append(", trackCode=");
                sb.append(this.c);
                sb.append(", payload=");
                sb.append(this.d);
                sb.append(", offset=");
                sb.append(this.e);
                sb.append(", count=");
                sb.append(this.f);
                sb.append(", referrer=");
                return ho8.a(sb, this.g, ')');
            }
        }

        /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
        public static final class b extends Params {
            public final int a;
            public final int b;
            public final String c;

            public b(int i, int i2, String str) {
                this.a = i;
                this.b = i2;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
                String str = this.c;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OfflineVideos(offset=");
                sb.append(this.a);
                sb.append(", count=");
                sb.append(this.b);
                sb.append(", referrer=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Params.Recommendations.RecommendationType.values().length];
            try {
                iArr[Params.Recommendations.RecommendationType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Params.Recommendations.RecommendationType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoDiscoveryRecommendationsRepository(u4r0 u4r0Var, q4r0 q4r0Var, bpn0 bpn0Var) {
        this.a = u4r0Var;
        this.b = q4r0Var;
        this.c = bpn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final a a(c3t c3tVar, VideoDiscoverAdsDto videoDiscoverAdsDto, List<UxpollsPollDto> list, String str) {
        ?? r2;
        if (this.a.c()) {
            List<UxpollsPollDto> list2 = list == null ? EmptyList.b : list;
            r2 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r2.add(this.b.a((UxpollsPollDto) it.next(), null));
            }
        } else {
            r2 = EmptyList.b;
        }
        if (list == null) {
            list = EmptyList.b;
        }
        boolean isEmpty = list.isEmpty();
        ((vqs0) this.c.getValue()).getClass();
        bpn0 bpn0Var = o25.a;
        return new a(c3tVar, r2, (videoDiscoverAdsDto != null ? epx.f(videoDiscoverAdsDto.d(), Boolean.TRUE) : false) && !(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c0() == ProfileType.RELATED) && isEmpty && this.d, str);
    }

    public final q<a> b(Params params) {
        if (params instanceof Params.Recommendations) {
            return c(new zv(22, this, params));
        }
        if (params instanceof Params.b) {
            return fxc0.B().s().B().U(new si60(new ev60(18), 16));
        }
        if (params instanceof Params.a) {
            return c(new uh3(28, this, params));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final q<a> c(gzs<? extends q<a>> gzsVar) {
        q<a> invoke = gzsVar.invoke();
        io.reactivex.rxjava3.internal.operators.mixed.a d = this.a.a().d(q.T(s3q0.a));
        zil0 zil0Var = new zil0(new c80(3));
        invoke.getClass();
        return q.I0(invoke, d, zil0Var);
    }

    /* compiled from: VideoDiscoveryRecommendationsRepository.kt */
    public static final class a {
        public final c3t a;
        public final List<UxPoll> b;
        public final boolean c;
        public final String d;

        public a(c3t c3tVar, String str, int i) {
            this(c3tVar, EmptyList.b, false, (i & 8) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideosWithPolls(videos=");
            sb.append(this.a);
            sb.append(", polls=");
            sb.append(this.b);
            sb.append(", canShowAdBanner=");
            sb.append(this.c);
            sb.append(", payload=");
            return ho8.a(sb, this.d, ')');
        }

        public a(c3t c3tVar, List<UxPoll> list, boolean z, String str) {
            this.a = c3tVar;
            this.b = list;
            this.c = z;
            this.d = str;
        }
    }
}
