package com.vk.posting.presentation.album;

import com.vk.dto.photo.PhotoAlbum;
import xsna.epx;
import xsna.kj50;

/* compiled from: AlbumPickerAction.kt */
/* loaded from: classes5.dex */
public abstract class a implements kj50 {

    /* compiled from: AlbumPickerAction.kt */
    /* renamed from: com.vk.posting.presentation.album.a$a, reason: collision with other inner class name */
    public static final class C1523a extends a {
        public final PhotoAlbum b;

        public C1523a(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1523a) && epx.f(this.b, ((C1523a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AlbumSelected(album=" + this.b + ')';
        }
    }

    /* compiled from: AlbumPickerAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: AlbumPickerAction.kt */
    public static abstract class c extends a {

        /* compiled from: AlbumPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.album.a$c$a, reason: collision with other inner class name */
        public static final class C1524a extends c {
            public static final C1524a b = new C1524a();
        }
    }

    /* compiled from: AlbumPickerAction.kt */
    public static abstract class d extends a {

        /* compiled from: AlbumPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.album.a$d$a, reason: collision with other inner class name */
        public static final class C1525a extends d {
        }

        /* compiled from: AlbumPickerAction.kt */
        public static final class b extends d {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -848113353;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: AlbumPickerAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }
}
