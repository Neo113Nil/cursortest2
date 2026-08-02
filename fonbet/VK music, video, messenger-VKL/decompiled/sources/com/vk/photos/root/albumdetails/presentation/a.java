package com.vk.photos.root.albumdetails.presentation;

import android.content.Intent;
import android.view.View;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.kj50;
import xsna.m7a0;
import xsna.ms9;
import xsna.paq0;
import xsna.uh1;

/* compiled from: AlbumDetailsAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: AlbumDetailsAction.kt */
    /* renamed from: com.vk.photos.root.albumdetails.presentation.a$a, reason: collision with other inner class name */
    public static final class C1477a extends a {
        public final int b;
        public final int c;
        public final Intent d;

        public C1477a(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class a0 extends a {
        public static final a0 b = new a0();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class b0 extends a {
        public final Photo b;
        public final boolean c;

        public b0(Photo photo, boolean z) {
            this.b = photo;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return epx.f(this.b, b0Var.b) && this.c == b0Var.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnBlurPhoto(photo=");
            sb.append(this.b);
            sb.append(", isOwner=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class c extends a {
        public final PhotoAlbum b;

        public c(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class c0 extends a {
        public final paq0 b;

        public c0(paq0 paq0Var) {
            this.b = paq0Var;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class d extends a {
        public final PhotoAlbumWrapper b;
        public final List<Photo> c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(PhotoAlbumWrapper photoAlbumWrapper, List<? extends Photo> list, boolean z) {
            this.b = photoAlbumWrapper;
            this.c = list;
            this.d = z;
        }

        public static d a(d dVar) {
            PhotoAlbumWrapper photoAlbumWrapper = dVar.b;
            List<Photo> list = dVar.c;
            dVar.getClass();
            return new d(photoAlbumWrapper, list, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + fw3.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbumSelected(photoAlbumWrapper=");
            sb.append(this.b);
            sb.append(", selectedPhotosList=");
            sb.append(this.c);
            sb.append(", confirmed=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class e extends a {
        public final View b;

        public e(View view) {
            this.b = view;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class h extends a {
        public final i.n.a b;

        public h(i.n.a aVar) {
            this.b = aVar;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class i extends a {
        public static final i b = new i();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static abstract class j extends a {

        /* compiled from: AlbumDetailsAction.kt */
        /* renamed from: com.vk.photos.root.albumdetails.presentation.a$j$a, reason: collision with other inner class name */
        public static abstract class AbstractC1478a extends j {

            /* compiled from: AlbumDetailsAction.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.a$j$a$a, reason: collision with other inner class name */
            public static final class C1479a extends AbstractC1478a {
                public final List<String> b;

                public C1479a(List<String> list) {
                    this.b = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1479a) && epx.f(this.b, ((C1479a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("Failure(photoUrls="), this.b);
                }
            }

            /* compiled from: AlbumDetailsAction.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.a$j$a$b */
            public static final class b extends AbstractC1478a {
                public static final b b = new b();
            }
        }

        /* compiled from: AlbumDetailsAction.kt */
        public static abstract class b extends j {

            /* compiled from: AlbumDetailsAction.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.a$j$b$a, reason: collision with other inner class name */
            public static final class C1480a extends b {
                public final String b;

                public C1480a(String str) {
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1480a) && epx.f(this.b, ((C1480a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Failure(photoUrl="), this.b, ')');
                }
            }

            /* compiled from: AlbumDetailsAction.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.a$j$b$b, reason: collision with other inner class name */
            public static final class C1481b extends b {
                public static final C1481b b = new C1481b();
            }
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class k extends a {
        public static final k b = new k();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class l extends a {
        public static final l b = new l();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class m extends a {
        public final m7a0 b;

        public m(m7a0 m7a0Var) {
            this.b = m7a0Var;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class n extends a {
        public static final n b = new n();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class o extends a {
        public static final o b = new o();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class p extends a {
        public final boolean b;

        public p(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class q extends a {
        public final VKList<Photo> b;
        public final boolean c;

        public q(VKList<Photo> vKList, boolean z) {
            this.b = vKList;
            this.c = z;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class r extends a {
        public final Throwable b;
        public final boolean c;

        public r(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class s extends a {
        public final Photo b;

        public s(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class t extends a {
        public final Photo b;
        public final View c;

        public t(Photo photo, View view) {
            this.b = photo;
            this.c = view;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class u extends a {
        public final Photo b;

        public u(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class v extends a {
        public final Photo b;

        public v(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class w extends a {
        public final uh1 b;
        public final Photo c;

        public w(uh1 uh1Var, Photo photo) {
            this.b = uh1Var;
            this.c = photo;
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class x extends a {
        public final List<String> b;

        public x(List<String> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.b, ((x) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("PublishStory(photos="), this.b);
        }
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class y extends a {
        public static final y b = new y();
    }

    /* compiled from: AlbumDetailsAction.kt */
    public static final class z extends a {
        public static final z b = new z();
    }
}
