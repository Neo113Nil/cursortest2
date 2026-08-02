package com.vk.photos.root.albums.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.PhotoAlbum;
import java.util.List;
import xsna.fk1;
import xsna.kj50;
import xsna.m7a0;
import xsna.nda0;

/* compiled from: AlbumsAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: AlbumsAction.kt */
    /* renamed from: com.vk.photos.root.albums.presentation.a$a, reason: collision with other inner class name */
    public static final class C1492a extends a {
        public final PhotoAlbum b;

        public C1492a(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: AlbumsAction.kt */
    public static final class c extends a {
        public final nda0 b;

        public c(nda0 nda0Var) {
            this.b = nda0Var;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static final class d extends a {
        public final m7a0 b;

        public d(m7a0 m7a0Var) {
            this.b = m7a0Var;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: AlbumsAction.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: AlbumsAction.kt */
    public static final class g extends a {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static final class h extends a {
        public final List<PhotoAlbum> b;
        public final boolean c;

        public h(VKList vKList, boolean z) {
            this.b = vKList;
            this.c = z;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static final class i extends a {
        public final Throwable b;
        public final boolean c;

        public i(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static final class j extends a {
        public static final j b = new j();
    }

    /* compiled from: AlbumsAction.kt */
    public static final class k extends a {
        public final int b;

        public k(int i) {
            this.b = i;
        }
    }

    /* compiled from: AlbumsAction.kt */
    public static abstract class l extends a {

        /* compiled from: AlbumsAction.kt */
        /* renamed from: com.vk.photos.root.albums.presentation.a$l$a, reason: collision with other inner class name */
        public static final class C1493a extends l {
            public final fk1.a b;
            public final PhotoAlbum c;

            public C1493a(fk1.a aVar, PhotoAlbum photoAlbum) {
                this.b = aVar;
                this.c = photoAlbum;
            }
        }

        /* compiled from: AlbumsAction.kt */
        public static final class b extends l {
            public final PhotoAlbum b;
            public final int c;

            public b(PhotoAlbum photoAlbum, int i) {
                this.b = photoAlbum;
                this.c = i;
            }
        }
    }
}
