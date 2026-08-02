package com.vk.libvideo.api.ad;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ad.AdBannerData;
import xsna.ba30;
import xsna.epx;
import xsna.qh0;
import xsna.qoy;
import xsna.xq;

/* compiled from: AdData.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: AdData.kt */
    /* renamed from: com.vk.libvideo.api.ad.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1195a implements a {
        public final AdBannerData a;
        public final boolean b;
        public final float c;

        /* compiled from: AdData.kt */
        /* renamed from: com.vk.libvideo.api.ad.a$a$a, reason: collision with other inner class name */
        public static final class C1196a extends AbstractC1195a {
            @Override // com.vk.libvideo.api.ad.a.AbstractC1195a
            public final /* bridge */ /* synthetic */ AdBannerData a() {
                return null;
            }

            @Override // com.vk.libvideo.api.ad.a.AbstractC1195a
            public final float b() {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }

            @Override // com.vk.libvideo.api.ad.a.AbstractC1195a
            public final boolean c() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1196a)) {
                    return false;
                }
                ((C1196a) obj).getClass();
                return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "New(bannerData=null, adProgress=null, isPostViewState=false, volume=0.0)";
            }
        }

        /* compiled from: AdData.kt */
        /* renamed from: com.vk.libvideo.api.ad.a$a$b */
        public static final class b extends AbstractC1195a {
            public final AdBannerData.a d;
            public final qh0 e;
            public final boolean f;
            public final float g;

            public b(AdBannerData.a aVar, qh0 qh0Var, boolean z, float f) {
                super(aVar, qh0Var, z, f);
                this.d = aVar;
                this.e = qh0Var;
                this.f = z;
                this.g = f;
            }

            @Override // com.vk.libvideo.api.ad.a.AbstractC1195a
            public final AdBannerData a() {
                return this.d;
            }

            @Override // com.vk.libvideo.api.ad.a.AbstractC1195a
            public final float b() {
                return this.g;
            }

            @Override // com.vk.libvideo.api.ad.a.AbstractC1195a
            public final boolean c() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && Float.compare(this.g, bVar.g) == 0;
            }

            public final int hashCode() {
                int hashCode = this.d.hashCode() * 31;
                qh0 qh0Var = this.e;
                return Float.hashCode(this.g) + qoy.b((hashCode + (qh0Var == null ? 0 : qh0Var.hashCode())) * 31, 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Old(bannerData=");
                sb.append(this.d);
                sb.append(", adProgress=");
                sb.append(this.e);
                sb.append(", isPostViewState=");
                sb.append(this.f);
                sb.append(", volume=");
                return xq.c(')', this.g, sb);
            }
        }

        public AbstractC1195a(AdBannerData.a aVar, qh0 qh0Var, boolean z, float f) {
            this.a = aVar;
            this.b = z;
            this.c = f;
        }

        public AdBannerData a() {
            return this.a;
        }

        public float b() {
            return this.c;
        }

        public boolean c() {
            return this.b;
        }
    }

    /* compiled from: AdData.kt */
    public static final class b implements a {
        public final ba30 a;

        public b(ba30 ba30Var) {
            this.a = ba30Var;
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
            return "AdMotionBanner(banner=" + this.a + ')';
        }
    }
}
