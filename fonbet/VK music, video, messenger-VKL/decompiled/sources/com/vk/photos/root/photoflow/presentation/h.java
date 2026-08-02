package com.vk.photos.root.photoflow.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import defpackage.q0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.oq;
import xsna.qba0;
import xsna.qoy;

/* compiled from: PhotoFlowState.kt */
/* loaded from: classes4.dex */
public final class h implements km50 {
    public final UserId b;
    public final boolean c;
    public final boolean d;
    public final a e;
    public final boolean f;
    public final Set<Integer> g;
    public final List<qba0> h;
    public final boolean i;
    public final Integer j;
    public final boolean k;

    /* compiled from: PhotoFlowState.kt */
    public static final class a {
        public final VKList<Photo> a;
        public final boolean b;
        public final Set<Integer> c;
        public final Throwable d;

        public a(VKList<Photo> vKList, boolean z, Set<Integer> set, Throwable th) {
            this.a = vKList;
            this.b = z;
            this.c = set;
            this.d = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, VKList vKList, LinkedHashSet linkedHashSet, int i) {
            if ((i & 1) != 0) {
                vKList = aVar.a;
            }
            boolean z = aVar.b;
            Set set = linkedHashSet;
            if ((i & 4) != 0) {
                set = aVar.c;
            }
            Throwable th = aVar.d;
            aVar.getClass();
            return new a(vKList, z, set, th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            VKList<Photo> vKList = this.a;
            int b = fw3.b(qoy.b((vKList == null ? 0 : vKList.hashCode()) * 31, 31, this.b), 31, this.c);
            Throwable th = this.d;
            return b + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotosState(items=");
            sb.append(this.a);
            sb.append(", isLastPageLoaded=");
            sb.append(this.b);
            sb.append(", unBlurredPhotoIds=");
            sb.append(this.c);
            sb.append(", error=");
            return oq.c(sb, this.d, ')');
        }
    }

    public h(UserId userId, boolean z, boolean z2, a aVar, boolean z3, Set<Integer> set, List<qba0> list, boolean z4, Integer num, boolean z5) {
        this.b = userId;
        this.c = z;
        this.d = z2;
        this.e = aVar;
        this.f = z3;
        this.g = set;
        this.h = list;
        this.i = z4;
        this.j = num;
        this.k = z5;
    }

    public static h a(h hVar, boolean z, boolean z2, a aVar, boolean z3, Set set, List list, boolean z4, Integer num, boolean z5, int i) {
        boolean z6 = z;
        UserId userId = hVar.b;
        if ((i & 2) != 0) {
            z6 = hVar.c;
        }
        if ((i & 4) != 0) {
            z2 = hVar.d;
        }
        if ((i & 8) != 0) {
            aVar = hVar.e;
        }
        if ((i & 16) != 0) {
            z3 = hVar.f;
        }
        if ((i & 32) != 0) {
            set = hVar.g;
        }
        if ((i & 64) != 0) {
            list = hVar.h;
        }
        if ((i & 128) != 0) {
            z4 = hVar.i;
        }
        if ((i & 256) != 0) {
            num = hVar.j;
        }
        if ((i & 512) != 0) {
            z5 = hVar.k;
        }
        boolean z7 = z5;
        hVar.getClass();
        Integer num2 = num;
        boolean z8 = z4;
        List list2 = list;
        Set set2 = set;
        boolean z9 = z3;
        a aVar2 = aVar;
        return new h(userId, z6, z2, aVar2, z9, set2, list2, z8, num2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return epx.f(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d && epx.f(this.e, hVar.e) && this.f == hVar.f && epx.f(this.g, hVar.g) && epx.f(this.h, hVar.h) && this.i == hVar.i && epx.f(this.j, hVar.j) && this.k == hVar.k;
    }

    public final int hashCode() {
        int b = fw3.b(qoy.b((this.e.hashCode() + qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
        List<qba0> list = this.h;
        int b2 = qoy.b((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.i);
        Integer num = this.j;
        return Boolean.hashCode(this.k) + ((b2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoFlowState(userId=");
        sb.append(this.b);
        sb.append(", showSkeleton=");
        sb.append(this.c);
        sb.append(", showHeaderAddButton=");
        sb.append(this.d);
        sb.append(", photos=");
        sb.append(this.e);
        sb.append(", isInMultiSelectMode=");
        sb.append(this.f);
        sb.append(", selectedPhotosIds=");
        sb.append(this.g);
        sb.append(", taggedPhotos=");
        sb.append(this.h);
        sb.append(", hasAlbums=");
        sb.append(this.i);
        sb.append(", uploadTaskId=");
        sb.append(this.j);
        sb.append(", scrollToTopMode=");
        return q0.a(sb, this.k, ')');
    }
}
