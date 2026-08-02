package com.vk.photos.root.selectalbum.domain;

import com.vk.dto.photo.PhotoAlbum;
import java.util.List;
import xsna.xl50;

/* compiled from: SelectAlbumPatch.kt */
/* loaded from: classes4.dex */
public abstract class c implements xl50 {

    /* compiled from: SelectAlbumPatch.kt */
    public static final class a extends c {
        public final PhotoAlbumWrapper b;

        public a(PhotoAlbumWrapper photoAlbumWrapper) {
            this.b = photoAlbumWrapper;
        }
    }

    /* compiled from: SelectAlbumPatch.kt */
    public static final class b extends c {
        public static final b b = new b();
    }

    /* compiled from: SelectAlbumPatch.kt */
    /* renamed from: com.vk.photos.root.selectalbum.domain.c$c, reason: collision with other inner class name */
    public static final class C1512c extends c {
        public final Throwable b;
        public final boolean c;

        public C1512c(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: SelectAlbumPatch.kt */
    public static final class d extends c {
        public final List<PhotoAlbum> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends PhotoAlbum> list) {
            this.b = list;
        }
    }

    /* compiled from: SelectAlbumPatch.kt */
    public static final class e extends c {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: SelectAlbumPatch.kt */
    public static final class f extends c {
        public final List<PhotoAlbum> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends PhotoAlbum> list) {
            this.b = list;
        }
    }

    /* compiled from: SelectAlbumPatch.kt */
    public static final class g extends c {
        public final int b;

        public g(int i) {
            this.b = i;
        }
    }
}
