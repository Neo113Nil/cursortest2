package com.vk.photos.root.albumdetails.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.qoy;
import xsna.shy;

/* compiled from: AlbumDetailsState.kt */
/* loaded from: classes4.dex */
public final class j implements km50 {
    public final VKList<Photo> b;
    public final Integer c;
    public final a d;
    public final a e;
    public final UserId f;
    public final boolean g;
    public final Set<Integer> h;
    public final Set<Integer> i;
    public final boolean j;
    public final boolean k;
    public final PhotoAlbum l;
    public final int m;
    public final boolean n;

    /* compiled from: AlbumDetailsState.kt */
    public static abstract class a {

        /* compiled from: AlbumDetailsState.kt */
        /* renamed from: com.vk.photos.root.albumdetails.presentation.j$a$a, reason: collision with other inner class name */
        public static final class C1487a extends a {
            public final Throwable a;

            public C1487a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: AlbumDetailsState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public j(VKList<Photo> vKList, Integer num, a aVar, a aVar2, UserId userId, boolean z, Set<Integer> set, Set<Integer> set2, boolean z2, boolean z3, PhotoAlbum photoAlbum, int i, boolean z4) {
        this.b = vKList;
        this.c = num;
        this.d = aVar;
        this.e = aVar2;
        this.f = userId;
        this.g = z;
        this.h = set;
        this.i = set2;
        this.j = z2;
        this.k = z3;
        this.l = photoAlbum;
        this.m = i;
        this.n = z4;
    }

    public static j a(j jVar, VKList vKList, Integer num, a aVar, a aVar2, Set set, Set set2, boolean z, boolean z2, PhotoAlbum photoAlbum, int i) {
        VKList vKList2 = (i & 1) != 0 ? jVar.b : vKList;
        Integer num2 = (i & 2) != 0 ? jVar.c : num;
        a aVar3 = (i & 4) != 0 ? jVar.d : aVar;
        a aVar4 = (i & 8) != 0 ? jVar.e : aVar2;
        UserId userId = jVar.f;
        boolean z3 = jVar.g;
        Set set3 = (i & 64) != 0 ? jVar.h : set;
        Set set4 = (i & 128) != 0 ? jVar.i : set2;
        boolean z4 = (i & 256) != 0 ? jVar.j : z;
        boolean z5 = (i & 512) != 0 ? jVar.k : z2;
        PhotoAlbum photoAlbum2 = (i & 1024) != 0 ? jVar.l : photoAlbum;
        int i2 = jVar.m;
        boolean z6 = jVar.n;
        jVar.getClass();
        return new j(vKList2, num2, aVar3, aVar4, userId, z3, set3, set4, z4, z5, photoAlbum2, i2, z6);
    }

    public final List<Photo> b(Photo photo) {
        if (!this.j) {
            return photo == null ? EmptyList.b : Collections.singletonList(photo);
        }
        VKList<Photo> vKList = this.b;
        if (vKList == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Photo photo2 : vKList) {
            if (this.h.contains(Integer.valueOf(photo2.c))) {
                arrayList.add(photo2);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e) && epx.f(this.f, jVar.f) && this.g == jVar.g && epx.f(this.h, jVar.h) && epx.f(this.i, jVar.i) && this.j == jVar.j && this.k == jVar.k && epx.f(this.l, jVar.l) && this.m == jVar.m && this.n == jVar.n;
    }

    public final int hashCode() {
        VKList<Photo> vKList = this.b;
        int hashCode = (vKList == null ? 0 : vKList.hashCode()) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.d;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.e;
        int b = qoy.b(qoy.b(fw3.b(fw3.b(qoy.b(bh10.a((hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f.b), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        PhotoAlbum photoAlbum = this.l;
        return Boolean.hashCode(this.n) + shy.a(this.m, (b + (photoAlbum != null ? photoAlbum.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumDetailsState(photos=");
        sb.append(this.b);
        sb.append(", totalPhotosCount=");
        sb.append(this.c);
        sb.append(", firstPageLoadingState=");
        sb.append(this.d);
        sb.append(", nextPageLoadingState=");
        sb.append(this.e);
        sb.append(", uid=");
        sb.append(this.f);
        sb.append(", showPrivacyIcon=");
        sb.append(this.g);
        sb.append(", selectedPhotosIds=");
        sb.append(this.h);
        sb.append(", unBlurredPhotoIds=");
        sb.append(this.i);
        sb.append(", isInMultiSelectMode=");
        sb.append(this.j);
        sb.append(", faceRecognitionMode=");
        sb.append(this.k);
        sb.append(", album=");
        sb.append(this.l);
        sb.append(", albumId=");
        sb.append(this.m);
        sb.append(", editMode=");
        return q0.a(sb, this.n, ')');
    }
}
