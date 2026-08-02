package com.vk.photos.ui.editalbum.domain;

import com.vk.dto.photo.PhotoAlbum;
import xsna.bh10;
import xsna.epx;
import xsna.j7k0;
import xsna.mi1;
import xsna.xt9;

/* compiled from: EditAlbumSideEffect.kt */
/* loaded from: classes3.dex */
public abstract class g {

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class a extends g {
        public final PhotoAlbum a;

        public a(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class b extends g {
        public static final b a = new b();
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class c extends g {
        public final PhotoAlbum a;

        public c(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class d extends g {
        public static final d a = new d();
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class e extends g {
        public static final e a = new e();
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class f extends g {
        public final xt9 a;

        public f(xt9 xt9Var) {
            this.a = xt9Var;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    /* renamed from: com.vk.photos.ui.editalbum.domain.g$g, reason: collision with other inner class name */
    public static final class C1518g extends g {
        public final PhotoAlbum a;

        public C1518g(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class h extends g {
        public final int a;
        public final mi1 b;

        public h(int i, mi1 mi1Var) {
            this.a = i;
            this.b = mi1Var;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class i extends g {
        public final com.vk.photos.ui.editalbum.domain.h a;

        public i(com.vk.photos.ui.editalbum.domain.h hVar) {
            this.a = hVar;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class j extends g {
        public final com.vk.photos.ui.editalbum.domain.h a;

        public j(com.vk.photos.ui.editalbum.domain.h hVar) {
            this.a = hVar;
        }
    }

    /* compiled from: EditAlbumSideEffect.kt */
    public static final class k extends g {
        public final j7k0 a;
        public final long b;
        public final g c;

        public k(j7k0 j7k0Var, long j, g gVar) {
            this.a = j7k0Var;
            this.b = j;
            this.c = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b && epx.f(this.c, kVar.c);
        }

        public final int hashCode() {
            int a = bh10.a(this.a.hashCode() * 31, 31, this.b);
            g gVar = this.c;
            return a + (gVar == null ? 0 : gVar.hashCode());
        }

        public final String toString() {
            return "Snackbar(snackbarData=" + this.a + ", delay=" + this.b + ", action=" + this.c + ')';
        }

        public /* synthetic */ k(j7k0 j7k0Var) {
            this(j7k0Var, 0L, null);
        }
    }
}
