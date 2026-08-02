package com.vk.photos.root.photoflow.presentation;

import android.content.Intent;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.d8a0;
import xsna.epx;
import xsna.h7o0;
import xsna.ho8;
import xsna.kj50;
import xsna.ms9;
import xsna.oq;
import xsna.qba0;
import xsna.qoy;
import xsna.shy;
import xsna.tq;
import xsna.vu5;
import xsna.y7a0;

/* compiled from: PhotoFlowAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: PhotoFlowAction.kt */
    /* renamed from: com.vk.photos.root.photoflow.presentation.a$a, reason: collision with other inner class name */
    public static final class C1501a extends a {
        public final int b;
        public final int c;
        public final Intent d;

        public C1501a(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1501a)) {
                return false;
            }
            C1501a c1501a = (C1501a) obj;
            return this.b == c1501a.b && this.c == c1501a.c && epx.f(this.d, c1501a.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            Intent intent = this.d;
            return a + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "ActivityResult(requestCode=" + this.b + ", resultCode=" + this.c + ", data=" + this.d + ')';
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class b extends a {
        public final ArrayList b;
        public final List<Photo> c;

        public b(ArrayList arrayList, List list) {
            this.b = arrayList;
            this.c = list;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: PhotoFlowAction.kt */
    public static abstract class d extends a {

        /* compiled from: PhotoFlowAction.kt */
        /* renamed from: com.vk.photos.root.photoflow.presentation.a$d$a, reason: collision with other inner class name */
        public static final class C1502a extends d {
            public static final C1502a b = new C1502a();
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class b extends d {
            public static final b b = new b();
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class c extends d {
            public static final c b = new c();
        }

        /* compiled from: PhotoFlowAction.kt */
        /* renamed from: com.vk.photos.root.photoflow.presentation.a$d$d, reason: collision with other inner class name */
        public static final class C1503d extends d {
            public static final C1503d b = new C1503d();
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class e extends d {
            public static final e b = new e();
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class f extends a {
        public final List<Photo> b;
        public final PhotoAlbumWrapper c;
        public final boolean d;

        public f(PhotoAlbumWrapper photoAlbumWrapper, List list, boolean z) {
            this.b = list;
            this.c = photoAlbumWrapper;
            this.d = z;
        }

        public static f a(f fVar) {
            List<Photo> list = fVar.b;
            PhotoAlbumWrapper photoAlbumWrapper = fVar.c;
            fVar.getClass();
            return new f(photoAlbumWrapper, list, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveToAlbum(photos=");
            sb.append(this.b);
            sb.append(", album=");
            sb.append(this.c);
            sb.append(", confirmed=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static abstract class g extends a {

        /* compiled from: PhotoFlowAction.kt */
        /* renamed from: com.vk.photos.root.photoflow.presentation.a$g$a, reason: collision with other inner class name */
        public static final class C1504a extends g {
            public final List<Photo> b;

            public C1504a(ArrayList arrayList) {
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1504a) && epx.f(this.b, ((C1504a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("DeleteConfirmation(photos="), this.b);
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class b extends g {
            public final List<String> b;

            public b(List<String> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("DownloadFailure(photosUrls="), this.b);
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class c extends g {
            public static final c b = new c();
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class d extends g {
            public final d8a0.a b;

            public d(d8a0.a aVar) {
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PopupMenuItemClicked(item=" + this.b + ')';
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class e extends g {
            public final List<Photo> b;

            /* JADX WARN: Multi-variable type inference failed */
            public e(List<? extends Photo> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("RetryDelete(photos="), this.b);
            }
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class h extends a {
        public static final h b = new h();
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class i extends a {
        public static final i b = new i();
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class j extends a {
        public final boolean b;
        public final Throwable c;

        public j(boolean z, Throwable th) {
            this.b = z;
            this.c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageLoadFailed(isReload=");
            sb.append(this.b);
            sb.append(", throwable=");
            return oq.c(sb, this.c, ')');
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class k extends a {
        public final VKList<Photo> b;
        public final boolean c;
        public final boolean d;

        public k(VKList<Photo> vKList, boolean z, boolean z2) {
            this.b = vKList;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageLoaded(photos=");
            sb.append(this.b);
            sb.append(", isLastPageLoaded=");
            sb.append(this.c);
            sb.append(", isReload=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class l extends a {
        public static final l b = new l();
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class m extends a {
        public final List<String> b;

        public m(List<String> list) {
            this.b = list;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class n extends a {
        public static final n b = new n();
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class o extends a {
        public final int b;

        public o(int i) {
            this.b = i;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class p extends a {
        public final boolean b;

        public p(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class q extends a {
        public final Photo b;

        public q(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class r extends a {
        public final List<qba0> b;

        public r(List<qba0> list) {
            this.b = list;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static abstract class s extends a {

        /* compiled from: PhotoFlowAction.kt */
        /* renamed from: com.vk.photos.root.photoflow.presentation.a$s$a, reason: collision with other inner class name */
        public static final class C1505a extends s {
            public final y7a0 b;

            public C1505a(y7a0 y7a0Var) {
                this.b = y7a0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1505a) && epx.f(this.b, ((C1505a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Click(photo=" + this.b + ')';
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class b extends s {
            public final Photo b;

            public b(Photo photo) {
                this.b = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("DeleteConfirmation(photo="), this.b, ')');
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class c extends s {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("DownloadFailure(photoUrl="), this.b, ')');
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class d extends s {
            public static final d b = new d();
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class e extends s {
            public final y7a0 b;
            public final int c;

            public e(y7a0 y7a0Var, int i) {
                this.b = y7a0Var;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && this.c == eVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LongClick(photo=");
                sb.append(this.b);
                sb.append(", adapterPosition=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class f extends s {
            public final d8a0.b b;
            public final Photo c;

            public f(d8a0.b bVar, Photo photo) {
                this.b = bVar;
                this.c = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PopupMenuItemClicked(item=");
                sb.append(this.b);
                sb.append(", photo=");
                return tq.c(sb, this.c, ')');
            }
        }

        /* compiled from: PhotoFlowAction.kt */
        public static final class g extends s {
            public final Photo b;

            public g(Photo photo) {
                this.b = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("RetryDelete(photo="), this.b, ')');
            }
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class t extends a {
        public final Photo b;
        public final boolean c;

        public t(Photo photo, boolean z) {
            this.b = photo;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return epx.f(this.b, tVar.b) && this.c == tVar.c;
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

    /* compiled from: PhotoFlowAction.kt */
    public static final class u extends a {
        public final Photo b;

        public u(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: PhotoFlowAction.kt */
    public static final class v extends a {
        public final h7o0 b;

        public v(h7o0 h7o0Var) {
            this.b = h7o0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.b, ((v) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ValidateUploadEvent(event=" + this.b + ')';
        }
    }
}
