package com.vk.photos.root.photoflow.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import xsna.epx;
import xsna.gd60;
import xsna.kdg0;
import xsna.m7a0;
import xsna.oca0;
import xsna.qfa0;
import xsna.s0e0;
import xsna.shy;
import xsna.vi3;
import xsna.x7a0;
import xsna.ysg0;

/* compiled from: PhotoFlowFeatureDependencies.kt */
/* loaded from: classes4.dex */
public final class c {
    public final a a;
    public final b b;
    public final C1507c c;
    public final d d;

    /* compiled from: PhotoFlowFeatureDependencies.kt */
    public static final class a {
        public final vi3 a;

        public a(vi3 vi3Var) {
            this.a = vi3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Archive(archiveRepository=" + this.a + ')';
        }
    }

    /* compiled from: PhotoFlowFeatureDependencies.kt */
    public static final class b {
        public final UserId a;
        public final AlbumsRepository b;
        public final x7a0 c;
        public final PhotoUploadInteractor.a d;
        public final ysg0<m7a0> e;
        public final s0e0 f;
        public final qfa0.k g;

        public b(UserId userId, AlbumsRepository albumsRepository, x7a0 x7a0Var, PhotoUploadInteractor.a aVar, ysg0<m7a0> ysg0Var, s0e0 s0e0Var, qfa0.k kVar) {
            this.a = userId;
            this.b = albumsRepository;
            this.c = x7a0Var;
            this.d = aVar;
            this.e = ysg0Var;
            this.f = s0e0Var;
            this.g = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "PhotoFlow(userId=" + this.a + ", albumsRepository=" + this.b + ", photoFlowInteractor=" + this.c + ", photoUploadFactory=" + this.d + ", photosRxBus=" + this.e + ", profileUtils=" + this.f + ", metricsCollector=" + this.g + ')';
        }
    }

    /* compiled from: PhotoFlowFeatureDependencies.kt */
    /* renamed from: com.vk.photos.root.photoflow.presentation.c$c, reason: collision with other inner class name */
    public static final class C1507c {
        public final gd60 a;
        public final kdg0 b;

        public C1507c(gd60 gd60Var, kdg0 kdg0Var) {
            this.a = gd60Var;
            this.b = kdg0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1507c)) {
                return false;
            }
            C1507c c1507c = (C1507c) obj;
            return epx.f(this.a, c1507c.a) && epx.f(this.b, c1507c.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Restrictions(newsfeedBridge=" + this.a + ", restrictionsUtils=" + this.b + ')';
        }
    }

    /* compiled from: PhotoFlowFeatureDependencies.kt */
    public static final class d {
        public int a;
        public int b;
        public final oca0 c;
        public final qfa0.g d;

        public d(int i, int i2, oca0 oca0Var, qfa0.g gVar) {
            this.a = i;
            this.b = i2;
            this.c = oca0Var;
            this.d = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
        }

        public final String toString() {
            return "Tags(tagCount=" + this.a + ", recognitionCount=" + this.b + ", photoTagsInteractor=" + this.c + ", metricsCollector=" + this.d + ')';
        }
    }

    public c(a aVar, b bVar, C1507c c1507c, d dVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = c1507c;
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PhotoFlowFeatureDependencies(archive=" + this.a + ", photoFlow=" + this.b + ", restrictions=" + this.c + ", tags=" + this.d + ')';
    }
}
