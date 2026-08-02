package com.vk.libvideo.design.view.ad.data;

import com.vk.libvideo.design.view.ad.data.AdLayoutBannerData;
import xsna.ba30;
import xsna.epx;
import xsna.gg0;
import xsna.qoy;
import xsna.xq;

/* compiled from: AdLayoutData.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: AdLayoutData.kt */
    /* renamed from: com.vk.libvideo.design.view.ad.data.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1232a implements a {
        public final AdLayoutBannerData.b a;
        public final boolean b;
        public final float c;

        /* compiled from: AdLayoutData.kt */
        /* renamed from: com.vk.libvideo.design.view.ad.data.a$a$a, reason: collision with other inner class name */
        public static final class C1233a extends AbstractC1232a {
            @Override // com.vk.libvideo.design.view.ad.data.a.AbstractC1232a
            public final AdLayoutBannerData a() {
                throw null;
            }

            @Override // com.vk.libvideo.design.view.ad.data.a.AbstractC1232a
            public final float b() {
                throw null;
            }

            @Override // com.vk.libvideo.design.view.ad.data.a.AbstractC1232a
            public final boolean c() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1233a)) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }

        /* compiled from: AdLayoutData.kt */
        /* renamed from: com.vk.libvideo.design.view.ad.data.a$a$b */
        public static final class b extends AbstractC1232a {
            public final AdLayoutBannerData.b d;
            public final gg0 e;
            public final boolean f;
            public final float g;

            public b(AdLayoutBannerData.b bVar, gg0 gg0Var, boolean z, float f) {
                super(bVar, gg0Var, z, f);
                this.d = bVar;
                this.e = gg0Var;
                this.f = z;
                this.g = f;
            }

            @Override // com.vk.libvideo.design.view.ad.data.a.AbstractC1232a
            public final AdLayoutBannerData a() {
                return this.d;
            }

            @Override // com.vk.libvideo.design.view.ad.data.a.AbstractC1232a
            public final float b() {
                return this.g;
            }

            @Override // com.vk.libvideo.design.view.ad.data.a.AbstractC1232a
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
                gg0 gg0Var = this.e;
                return Float.hashCode(this.g) + qoy.b((hashCode + (gg0Var == null ? 0 : gg0Var.hashCode())) * 31, 31, this.f);
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

        public AbstractC1232a(AdLayoutBannerData.b bVar, gg0 gg0Var, boolean z, float f) {
            this.a = bVar;
            this.b = z;
            this.c = f;
        }

        public AdLayoutBannerData a() {
            return this.a;
        }

        public float b() {
            return this.c;
        }

        public boolean c() {
            return this.b;
        }
    }

    /* compiled from: AdLayoutData.kt */
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
            return "AdLayoutMotionBanner(banner=" + this.a + ')';
        }
    }
}
