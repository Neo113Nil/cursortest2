package com.vk.photos.root.albumdetails.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import java.util.Set;
import xsna.epx;
import xsna.ur;
import xsna.xl50;

/* compiled from: AlbumDetailsPatch.kt */
/* loaded from: classes4.dex */
public abstract class d implements xl50 {

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class a extends d {
        public static final a b = new a();
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class b extends d {
        public static final b b = new b();
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class c extends d {
        public static final c b = new c();
    }

    /* compiled from: AlbumDetailsPatch.kt */
    /* renamed from: com.vk.photos.root.albumdetails.presentation.d$d, reason: collision with other inner class name */
    public static final class C1483d extends d {
        public final Throwable b;
        public final boolean c;

        public C1483d(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class e extends d {
        public final VKList<Photo> b;

        public e(VKList<Photo> vKList) {
            this.b = vKList;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class f extends d {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class g extends d {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class h extends d {
        public final Set<Integer> b;

        public h(Set<Integer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("PhotosUnBlurred(unBlurredPhotoIds="), this.b, ')');
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class i extends d {
        public final VKList<Photo> b;

        public i(VKList<Photo> vKList) {
            this.b = vKList;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class j extends d {
        public final Photo b;

        public j(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class k extends d {
        public final Photo b;

        public k(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class l extends d {
        public final Photo b;

        public l(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: AlbumDetailsPatch.kt */
    public static final class m extends d {
        public final PhotoAlbum b;

        public m(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }
}
