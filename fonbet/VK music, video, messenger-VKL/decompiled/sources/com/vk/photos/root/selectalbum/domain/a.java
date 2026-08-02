package com.vk.photos.root.selectalbum.domain;

import com.vk.dto.photo.PhotoAlbum;
import java.util.List;
import xsna.kj50;

/* compiled from: SelectAlbumAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: SelectAlbumAction.kt */
    /* renamed from: com.vk.photos.root.selectalbum.domain.a$a, reason: collision with other inner class name */
    public static final class C1511a extends a {
        public static final C1511a b = new C1511a();
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class d extends a {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class e extends a {
        public final List<PhotoAlbum> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends PhotoAlbum> list, boolean z) {
            this.b = list;
            this.c = z;
        }
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class f extends a {
        public final Throwable b;
        public final boolean c;

        public f(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class h extends a {
        public final PhotoAlbumWrapper b;

        public h(PhotoAlbumWrapper photoAlbumWrapper) {
            this.b = photoAlbumWrapper;
        }
    }

    /* compiled from: SelectAlbumAction.kt */
    public static final class i extends a {
        public final int b;

        public i(int i) {
            this.b = i;
        }
    }
}
