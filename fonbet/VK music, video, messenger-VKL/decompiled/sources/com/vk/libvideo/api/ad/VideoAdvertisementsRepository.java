package com.vk.libvideo.api.ad;

import com.vk.dto.common.AdSection;
import com.vk.dto.common.InstreamAd;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.cw50;
import xsna.eg1;
import xsna.epx;
import xsna.ho8;
import xsna.l31;
import xsna.mdm0;
import xsna.zrp;
import xsna.zu50;

/* compiled from: VideoAdvertisementsRepository.kt */
/* loaded from: classes2.dex */
public interface VideoAdvertisementsRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAdvertisementsRepository.kt */
    public static final class AdType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdType[] $VALUES;
        public static final AdType INSTREAM;
        public static final AdType OVERLAY;
        public static final AdType SPORT_BANNER;
        public static final AdType SPORT_ODDS;

        static {
            AdType adType = new AdType("SPORT_BANNER", 0);
            SPORT_BANNER = adType;
            AdType adType2 = new AdType("SPORT_ODDS", 1);
            SPORT_ODDS = adType2;
            AdType adType3 = new AdType("INSTREAM", 2);
            INSTREAM = adType3;
            AdType adType4 = new AdType("OVERLAY", 3);
            OVERLAY = adType4;
            AdType[] adTypeArr = {adType, adType2, adType3, adType4};
            $VALUES = adTypeArr;
            $ENTRIES = new asp(adTypeArr);
        }

        public AdType() {
            throw null;
        }

        public static AdType valueOf(String str) {
            return (AdType) Enum.valueOf(AdType.class, str);
        }

        public static AdType[] values() {
            return (AdType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAdvertisementsRepository.kt */
    public static abstract class a {

        /* compiled from: VideoAdvertisementsRepository.kt */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("InstreamAd(sdkSource="), this.a, ')');
            }
        }

        /* compiled from: VideoAdvertisementsRepository.kt */
        public static final class c extends a {
            public final cw50 a;
            public final zu50 b;
            public final long c;
            public final long d;
            public final mdm0 e;
            public final eg1 f;

            public c(cw50 cw50Var, zu50 zu50Var, long j, long j2, mdm0 mdm0Var, eg1 eg1Var) {
                this.a = cw50Var;
                this.b = zu50Var;
                this.c = j;
                this.d = j2;
                this.e = mdm0Var;
                this.f = eg1Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + bh10.a(bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
            }

            public final String toString() {
                return "OverlayAd(banner=" + this.a + ", nativeAd=" + this.b + ", duration=" + this.c + ", startAt=" + this.d + ", closeOverlay=" + this.e + ", trackAdEvent=" + this.f + ')';
            }
        }

        /* compiled from: VideoAdvertisementsRepository.kt */
        public static final class d extends a {
            public final l31 a;

            public d(l31 l31Var) {
                this.a = l31Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SportAd(state=" + this.a + ')';
            }
        }

        /* compiled from: VideoAdvertisementsRepository.kt */
        /* renamed from: com.vk.libvideo.api.ad.VideoAdvertisementsRepository$a$a, reason: collision with other inner class name */
        public static final class C1194a extends a {
            public final boolean a;

            public C1194a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1194a) && this.a == ((C1194a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Empty(noAd="), this.a, ')');
            }

            public C1194a() {
                this(false);
            }
        }
    }

    q<List<Long>> a();

    void b(String str, AdSection adSection);

    void c(AdType adType);

    void d(long j);

    q<a> e(AdType adType, String str);

    a.c f();

    void g(String str, InstreamAd instreamAd, String str2, String str3, long j);
}
