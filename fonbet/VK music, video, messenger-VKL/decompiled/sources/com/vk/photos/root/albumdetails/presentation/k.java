package com.vk.photos.root.albumdetails.presentation;

import com.vk.dto.photo.Photo;
import defpackage.q0;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.h0u0;
import xsna.oq;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.yzt0;

/* compiled from: AlbumDetailsViewState.kt */
/* loaded from: classes4.dex */
public final class k implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: AlbumDetailsViewState.kt */
    public static final class a implements fm50<j> {
        public final yzt0<b> a;
        public final yzt0<Boolean> b;
        public final yzt0<c> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: AlbumDetailsViewState.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public b(String str, String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderState(albumName=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", showPrivacyIcon=");
            sb.append(this.c);
            sb.append(", showOptionsInToolbar=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: AlbumDetailsViewState.kt */
    public static final class c {
        public final boolean a;
        public final List<C1491c> b;
        public final b c;
        public final Throwable d;
        public final a e;
        public final Integer f;

        /* compiled from: AlbumDetailsViewState.kt */
        public static abstract class a {

            /* compiled from: AlbumDetailsViewState.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.k$c$a$a, reason: collision with other inner class name */
            public static final class C1488a extends a {
                public static final C1488a a = new C1488a();
            }

            /* compiled from: AlbumDetailsViewState.kt */
            public static final class b extends a {
                public static final b a = new b();
            }

            /* compiled from: AlbumDetailsViewState.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.k$c$a$c, reason: collision with other inner class name */
            public static final class C1489c extends a {
                public final boolean a;

                public C1489c(boolean z) {
                    this.a = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1489c) && this.a == ((C1489c) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("MultiSelect(showOptionsMenu="), this.a, ')');
                }
            }

            /* compiled from: AlbumDetailsViewState.kt */
            public static final class d extends a {
                public static final d a = new d();
            }
        }

        /* compiled from: AlbumDetailsViewState.kt */
        public static abstract class b {

            /* compiled from: AlbumDetailsViewState.kt */
            public static final class a extends b {
                public final Throwable a;

                public a(Throwable th) {
                    this.a = th;
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
                    return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
                }
            }

            /* compiled from: AlbumDetailsViewState.kt */
            /* renamed from: com.vk.photos.root.albumdetails.presentation.k$c$b$b, reason: collision with other inner class name */
            public static final class C1490b extends b {
                public static final C1490b a = new C1490b();
            }
        }

        /* compiled from: AlbumDetailsViewState.kt */
        /* renamed from: com.vk.photos.root.albumdetails.presentation.k$c$c, reason: collision with other inner class name */
        public static final class C1491c {
            public final Photo a;
            public final Boolean b;
            public final boolean c;
            public final boolean d;

            public C1491c(Photo photo, Boolean bool, boolean z, boolean z2) {
                this.a = photo;
                this.b = bool;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1491c)) {
                    return false;
                }
                C1491c c1491c = (C1491c) obj;
                return epx.f(this.a, c1491c.a) && epx.f(this.b, c1491c.b) && this.c == c1491c.c && this.d == c1491c.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Boolean bool = this.b;
                return Boolean.hashCode(this.d) + qoy.b((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Item(photo=");
                sb.append(this.a);
                sb.append(", selected=");
                sb.append(this.b);
                sb.append(", longClickEnabled=");
                sb.append(this.c);
                sb.append(", hasRestriction=");
                return q0.a(sb, this.d, ')');
            }
        }

        public c(boolean z, List<C1491c> list, b bVar, Throwable th, a aVar, Integer num) {
            this.a = z;
            this.b = list;
            this.c = bVar;
            this.d = th;
            this.e = aVar;
            this.f = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int a2 = fw3.a(Boolean.hashCode(this.a) * 31, 31, this.b);
            b bVar = this.c;
            int hashCode = (a2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th = this.d;
            int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
            a aVar = this.e;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Integer num = this.f;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListState(refreshing=");
            sb.append(this.a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", footer=");
            sb.append(this.c);
            sb.append(", firstPageError=");
            sb.append(this.d);
            sb.append(", albumControls=");
            sb.append(this.e);
            sb.append(", photosCount=");
            return uqi.b(sb, this.f, ')');
        }
    }

    /* compiled from: AlbumDetailsViewState.kt */
    public static final class d implements fm50<j> {
        public final yzt0<b> a;
        public final yzt0<Boolean> b;

        public d(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    public k(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
