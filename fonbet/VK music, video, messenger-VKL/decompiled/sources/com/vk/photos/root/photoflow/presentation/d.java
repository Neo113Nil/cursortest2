package com.vk.photos.root.photoflow.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import defpackage.q0;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.ms9;
import xsna.oq;
import xsna.qba0;
import xsna.tq;
import xsna.ur;
import xsna.vu5;
import xsna.xl50;

/* compiled from: PhotoFlowPatch.kt */
/* loaded from: classes4.dex */
public abstract class d implements xl50 {

    /* compiled from: PhotoFlowPatch.kt */
    public static final class a extends d {
        public final Photo b;

        public a(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class b extends d {
        public static final b b = new b();
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class c extends d {
        public final VKList<Photo> b;
        public final boolean c;

        public c(VKList<Photo> vKList, boolean z) {
            this.b = vKList;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewPageLoaded(photos=");
            sb.append(this.b);
            sb.append(", isLastPageLoaded=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    /* renamed from: com.vk.photos.root.photoflow.presentation.d$d, reason: collision with other inner class name */
    public static final class C1508d extends d {
        public final boolean b;
        public final Throwable c;

        public C1508d(boolean z, Throwable th) {
            this.b = z;
            this.c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1508d)) {
                return false;
            }
            C1508d c1508d = (C1508d) obj;
            return this.b == c1508d.b && epx.f(this.c, c1508d.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageLoadFailed(isReload=");
            sb.append(this.b);
            sb.append(", error=");
            return oq.c(sb, this.c, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class e extends d {
        public final Set<Integer> b;

        public e(Set<Integer> set) {
            this.b = set;
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
            return ur.c(new StringBuilder("PhotosDeleted(photoIds="), this.b, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class f extends d {
        public final Set<Integer> b;

        public f(Set<Integer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("PhotosUnBlurred(unBlurredPhotoIds="), this.b, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class g extends d {
        public final Photo b;

        public g(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class h extends d {
        public final VKList<Photo> b;
        public final boolean c;

        public h(VKList<Photo> vKList, boolean z) {
            this.b = vKList;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Reloaded(photos=");
            sb.append(this.b);
            sb.append(", isLastPageLoaded=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class i extends d {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class j extends d {
        public final Photo b;

        public j(Photo photo) {
            this.b = photo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return tq.c(new StringBuilder("SelectPhoto(photo="), this.b, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class k extends d {
        public final List<qba0> b;

        public k(List<qba0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ShowTaggetPhotos(photos="), this.b);
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class l extends d {
        public final Photo b;

        public l(Photo photo) {
            this.b = photo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return tq.c(new StringBuilder("UnSelectPhoto(photo="), this.b, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class m extends d {
        public final boolean b;

        public m(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class n extends d {
        public final boolean b = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateSkeletonState(show="), this.b, ')');
        }
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class o extends d {
        public static final o b = new o();
    }

    /* compiled from: PhotoFlowPatch.kt */
    public static final class p extends d {
        public final int b;

        public p(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UploadTaskStarted(taskId="), this.b, ')');
        }
    }
}
