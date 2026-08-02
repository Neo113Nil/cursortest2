package com.vk.photos.ui.editalbum.domain;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumEntryPoint;
import java.util.List;
import xsna.bh10;
import xsna.el1;
import xsna.epx;
import xsna.f8a0;
import xsna.jed0;
import xsna.mpn0;
import xsna.ms9;
import xsna.qfa0;

/* compiled from: EditAlbumFeatureDependencies.kt */
/* loaded from: classes3.dex */
public final class d {
    public final f a;
    public final AlbumsRepository b;
    public final mpn0 c;
    public final f8a0 d;
    public final jed0 e;
    public final el1 f;
    public final PhotoUploadInteractor.a g;
    public final b h;
    public final a i;

    /* compiled from: EditAlbumFeatureDependencies.kt */
    public static final class a {
        public final qfa0.a a;
        public final CreateAlbumEntryPoint b;

        public a(qfa0.a aVar, CreateAlbumEntryPoint createAlbumEntryPoint) {
            this.a = aVar;
            this.b = createAlbumEntryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            CreateAlbumEntryPoint createAlbumEntryPoint = this.b;
            return hashCode + (createAlbumEntryPoint == null ? 0 : createAlbumEntryPoint.b.hashCode());
        }

        public final String toString() {
            return "Analytics(metricsCollector=" + this.a + ", entryPoint=" + this.b + ')';
        }
    }

    /* compiled from: EditAlbumFeatureDependencies.kt */
    public static final class b {
        public final PhotoAlbum a;
        public final UserId b;
        public final List<Uri> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(PhotoAlbum photoAlbum, UserId userId, List<? extends Uri> list) {
            this.a = photoAlbum;
            this.b = userId;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            PhotoAlbum photoAlbum = this.a;
            int a = bh10.a((photoAlbum == null ? 0 : photoAlbum.hashCode()) * 31, 31, this.b.b);
            List<Uri> list = this.c;
            return a + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Values(album=");
            sb.append(this.a);
            sb.append(", userId=");
            sb.append(this.b);
            sb.append(", photos=");
            return ms9.a(')', sb, this.c);
        }
    }

    public d(f fVar, AlbumsRepository albumsRepository, mpn0 mpn0Var, f8a0 f8a0Var, jed0 jed0Var, el1 el1Var, PhotoUploadInteractor.a aVar, b bVar, a aVar2) {
        this.a = fVar;
        this.b = albumsRepository;
        this.c = mpn0Var;
        this.d = f8a0Var;
        this.e = jed0Var;
        this.f = el1Var;
        this.g = aVar;
        this.h = bVar;
        this.i = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h) && epx.f(this.i, dVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EditAlbumFeatureDependencies(reducer=" + this.a + ", repository=" + this.b + ", privacyRepository=" + this.c + ", photoFlowRepository=" + this.d + ", privacyRulesRepository=" + this.e + ", albumUtils=" + this.f + ", uploadFactory=" + this.g + ", values=" + this.h + ", analytics=" + this.i + ')';
    }
}
