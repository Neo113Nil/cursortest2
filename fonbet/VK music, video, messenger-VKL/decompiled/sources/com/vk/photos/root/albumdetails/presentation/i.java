package com.vk.photos.root.albumdetails.presentation;

import android.view.View;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.j7k0;
import xsna.kh1;
import xsna.ms9;
import xsna.s3q0;
import xsna.tlo0;

/* compiled from: AlbumDetailsSideEffect.kt */
/* loaded from: classes4.dex */
public abstract class i {

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class a extends i {
        public static final a a = new a();
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static abstract class b extends i {

        /* compiled from: AlbumDetailsSideEffect.kt */
        public static final class a extends b {
            public final List<String> a;

            public a(List<String> list) {
                this.a = list;
            }

            public final List<String> a() {
                return this.a;
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
                return ms9.a(')', new StringBuilder("MultiplePhotos(photosUrls="), this.a);
            }
        }

        /* compiled from: AlbumDetailsSideEffect.kt */
        /* renamed from: com.vk.photos.root.albumdetails.presentation.i$b$b, reason: collision with other inner class name */
        public static final class C1484b extends b {
            public final String a;

            public C1484b(String str) {
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1484b) && epx.f(this.a, ((C1484b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SinglePhoto(url="), this.a, ')');
            }
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class c extends i {
        public final PhotoAlbum a;

        public c(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class d extends i {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class e extends i {
        public static final e a = new e();
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class f extends i {
        public static final f a = new f();
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class g extends i {
        public final int a;
        public final VKList<Photo> b;

        public g(int i, VKList<Photo> vKList) {
            this.a = i;
            this.b = vKList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "OpenPhotoViewer(photoPosition=" + this.a + ", photos=" + this.b + ')';
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class h extends i {
        public final List<String> a;

        public h(List<String> list) {
            this.a = list;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    /* renamed from: com.vk.photos.root.albumdetails.presentation.i$i, reason: collision with other inner class name */
    public static final class C1485i extends i {
        public static final C1485i a = new C1485i();
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class j extends i {
        public static final j a = new j();
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class k extends i {
        public final kh1 a;

        public k(kh1 kh1Var) {
            this.a = kh1Var;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class l extends i {
        public final PhotoAlbum a;

        public l(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class m extends i {
        public final Photo a;

        public m(Photo photo) {
            this.a = photo;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class n extends i {
        public final tlo0 a;
        public final tlo0.f b;
        public final tlo0.f c;
        public final a d;

        /* compiled from: AlbumDetailsSideEffect.kt */
        public static abstract class a {

            /* compiled from: AlbumDetailsSideEffect.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.i$n$a$a, reason: collision with other inner class name */
            public static final class C1486a extends a {
                public final List<Photo> a;

                /* JADX WARN: Multi-variable type inference failed */
                public C1486a(List<? extends Photo> list) {
                    this.a = list;
                }
            }

            /* compiled from: AlbumDetailsSideEffect.kt */
            public static final class b extends a {
                public static final b a = new b();
            }

            /* compiled from: AlbumDetailsSideEffect.kt */
            public static final class c extends a {
                public static final c a = new c();
            }

            /* compiled from: AlbumDetailsSideEffect.kt */
            public static final class d extends a {
                public final Photo a;

                public d(Photo photo) {
                    this.a = photo;
                }
            }
        }

        public n(tlo0 tlo0Var, tlo0.f fVar, tlo0.f fVar2, a aVar) {
            this.a = tlo0Var;
            this.b = fVar;
            this.c = fVar2;
            this.d = aVar;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class o extends i {
        public final String a;
        public final String b;

        public o(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class p extends i {
        public final tlo0.f a;
        public final tlo0.f b;
        public final tlo0.f c;
        public final gzs<s3q0> d;

        public p(tlo0.f fVar, tlo0.f fVar2, tlo0.f fVar3, gzs gzsVar) {
            this.a = fVar;
            this.b = fVar2;
            this.c = fVar3;
            this.d = gzsVar;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class q extends i {
        public final ArrayList a;
        public final View b;
        public final Photo c;

        public q(ArrayList arrayList, View view, Photo photo) {
            this.a = arrayList;
            this.b = view;
            this.c = photo;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class r extends i {
        public static final r a = new r();
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class s extends i {
        public final List<Photo> a;

        /* JADX WARN: Multi-variable type inference failed */
        public s(List<? extends Photo> list) {
            this.a = list;
        }
    }

    /* compiled from: AlbumDetailsSideEffect.kt */
    public static final class t extends i {
        public final j7k0 a;

        public t(j7k0 j7k0Var) {
            this.a = j7k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Snackbar(data=" + this.a + ')';
        }
    }
}
