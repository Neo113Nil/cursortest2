package com.vk.photos.root.albums.presentation;

import com.vk.dto.photo.PhotoAlbum;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.j5g;
import xsna.n0u0;
import xsna.qoy;
import xsna.tlo0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: AlbumsViewState.kt */
/* loaded from: classes4.dex */
public final class g implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: AlbumsViewState.kt */
    public static final class a implements fm50<f> {
        public final yzt0<Boolean> a;
        public final yzt0<b> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(showHeader=");
            sb.append(this.a);
            sb.append(", albumsListState=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: AlbumsViewState.kt */
    public static final class b {
        public final boolean a;
        public final d b;
        public final a c;
        public final String d;
        public final boolean e;
        public final boolean f;

        /* compiled from: AlbumsViewState.kt */
        public static abstract class a {

            /* compiled from: AlbumsViewState.kt */
            /* renamed from: com.vk.photos.root.albums.presentation.g$b$a$a, reason: collision with other inner class name */
            public static final class C1498a extends a {
            }

            /* compiled from: AlbumsViewState.kt */
            /* renamed from: com.vk.photos.root.albums.presentation.g$b$a$b, reason: collision with other inner class name */
            public static final class C1499b extends a {
                public static final C1499b a = new C1499b();
            }
        }

        public b(boolean z, d dVar, a aVar, String str, boolean z2, boolean z3) {
            this.a = z;
            this.b = dVar;
            this.c = aVar;
            this.d = str;
            this.e = z2;
            this.f = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
            a aVar = this.c;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.d;
            return Boolean.hashCode(this.f) + qoy.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListState(refreshing=");
            sb.append(this.a);
            sb.append(", albumsWrapper=");
            sb.append(this.b);
            sb.append(", footer=");
            sb.append(this.c);
            sb.append(", firstPageError=");
            sb.append(this.d);
            sb.append(", albumOfCurrentUser=");
            sb.append(this.e);
            sb.append(", swipeToRefreshEnabled=");
            return q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: AlbumsViewState.kt */
    public static final class c implements fm50<f> {
        public final yzt0<Boolean> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Loading(showHeader="), this.a, ')');
        }
    }

    /* compiled from: AlbumsViewState.kt */
    public static final class d {
        public final List<PhotoAlbum> a;
        public final tlo0 b;
        public final List<PhotoAlbum> c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends PhotoAlbum> list, tlo0 tlo0Var, List<? extends PhotoAlbum> list2) {
            this.a = list;
            this.b = tlo0Var;
            this.c = list2;
        }

        public static boolean a(List list, List list2) {
            ArrayList X0 = j5g.X0(list, list2);
            if (X0.isEmpty()) {
                return true;
            }
            Iterator it = X0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                PhotoAlbum photoAlbum = (PhotoAlbum) pair.d();
                PhotoAlbum photoAlbum2 = (PhotoAlbum) pair.g();
                if (!epx.f(photoAlbum.g, photoAlbum2.g) || photoAlbum.f != photoAlbum2.f || !epx.f(photoAlbum.i, photoAlbum2.i) || !epx.f(photoAlbum.s, photoAlbum2.s) || photoAlbum.d != photoAlbum2.d || photoAlbum.b != photoAlbum2.b || !epx.f(photoAlbum.k, photoAlbum2.k) || !epx.f(photoAlbum.l, photoAlbum2.l)) {
                    return false;
                }
            }
            return true;
        }

        public static int b(List list) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                PhotoAlbum photoAlbum = (PhotoAlbum) it.next();
                i += Arrays.hashCode(new Object[]{photoAlbum.g, Integer.valueOf(photoAlbum.f), photoAlbum.i, photoAlbum.s, Integer.valueOf(photoAlbum.d), Integer.valueOf(photoAlbum.b), photoAlbum.k, photoAlbum.l}) * 31;
            }
            return i;
        }

        public final boolean equals(Object obj) {
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                List<PhotoAlbum> list = dVar.c;
                List<PhotoAlbum> list2 = dVar.a;
                List<PhotoAlbum> list3 = this.c;
                int size = list3.size();
                int size2 = list.size();
                List<PhotoAlbum> list4 = this.a;
                boolean z = size == size2 && list4.size() == list2.size();
                boolean z2 = a(list3, list) && a(list4, list2);
                if (z && z2) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return b(this.a) + b(this.c);
        }
    }

    public g(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }

    public final n0u0<a> a() {
        return this.a;
    }

    public final n0u0<c> b() {
        return this.b;
    }
}
