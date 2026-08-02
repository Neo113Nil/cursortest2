package com.vk.photos.root.albums.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.PhotoAlbum;
import java.util.List;
import xsna.izs;
import xsna.xl50;

/* compiled from: AlbumsPatch.kt */
/* loaded from: classes4.dex */
public abstract class c implements xl50 {

    /* compiled from: AlbumsPatch.kt */
    public static final class a extends c {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumsPatch.kt */
    public static final class b extends c {
        public static final b b = new b();
    }

    /* compiled from: AlbumsPatch.kt */
    /* renamed from: com.vk.photos.root.albums.presentation.c$c, reason: collision with other inner class name */
    public static final class C1495c extends c {
        public final Throwable b;
        public final boolean c;

        public C1495c(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: AlbumsPatch.kt */
    public static final class d extends c {
        public final List<PhotoAlbum> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends PhotoAlbum> list) {
            this.b = list;
        }
    }

    /* compiled from: AlbumsPatch.kt */
    public static final class e extends c {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumsPatch.kt */
    public static final class f extends c {
        public final List<PhotoAlbum> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends PhotoAlbum> list) {
            this.b = list;
        }
    }

    /* compiled from: AlbumsPatch.kt */
    public static abstract class g extends c {

        /* compiled from: AlbumsPatch.kt */
        public static final class a extends g {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: AlbumsPatch.kt */
        public static final class b extends g {
            public static final b b = new b();
        }

        /* compiled from: AlbumsPatch.kt */
        /* renamed from: com.vk.photos.root.albums.presentation.c$g$c, reason: collision with other inner class name */
        public static final class C1496c extends g {
            public final List<PhotoAlbum> b;

            public C1496c(VKList vKList) {
                this.b = vKList;
            }
        }
    }

    /* compiled from: AlbumsPatch.kt */
    public static final class h extends c {
        public final int b;
        public final izs<PhotoAlbum, PhotoAlbum> c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(int i, izs<? super PhotoAlbum, ? extends PhotoAlbum> izsVar) {
            this.b = i;
            this.c = izsVar;
        }
    }
}
