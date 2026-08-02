package com.vk.photos.root.selectalbum.domain;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.km50;
import xsna.vu5;

/* compiled from: SelectAlbumState.kt */
/* loaded from: classes4.dex */
public final class g implements km50 {
    public final List<PhotoAlbumWrapper> b;
    public final a c;
    public final a d;
    public final PhotoAlbumWrapper e;
    public final int f;

    /* compiled from: SelectAlbumState.kt */
    public static abstract class a {

        /* compiled from: SelectAlbumState.kt */
        /* renamed from: com.vk.photos.root.selectalbum.domain.g$a$a, reason: collision with other inner class name */
        public static final class C1513a extends a {
            public final Throwable a;

            public C1513a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: SelectAlbumState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends PhotoAlbumWrapper> list, a aVar, a aVar2, PhotoAlbumWrapper photoAlbumWrapper, int i) {
        this.b = list;
        this.c = aVar;
        this.d = aVar2;
        this.e = photoAlbumWrapper;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g a(g gVar, ArrayList arrayList, a aVar, a aVar2, PhotoAlbumWrapper photoAlbumWrapper, int i, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = gVar.b;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            aVar = gVar.c;
        }
        a aVar3 = aVar;
        if ((i2 & 4) != 0) {
            aVar2 = gVar.d;
        }
        a aVar4 = aVar2;
        if ((i2 & 8) != 0) {
            photoAlbumWrapper = gVar.e;
        }
        PhotoAlbumWrapper photoAlbumWrapper2 = photoAlbumWrapper;
        if ((i2 & 16) != 0) {
            i = gVar.f;
        }
        gVar.getClass();
        return new g(list2, aVar3, aVar4, photoAlbumWrapper2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        List<PhotoAlbumWrapper> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        PhotoAlbumWrapper photoAlbumWrapper = this.e;
        return Integer.hashCode(this.f) + ((hashCode3 + (photoAlbumWrapper != null ? photoAlbumWrapper.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAlbumState(albums=");
        sb.append(this.b);
        sb.append(", firstPageLoadingState=");
        sb.append(this.c);
        sb.append(", nextPageLoadingState=");
        sb.append(this.d);
        sb.append(", selectedAlbum=");
        sb.append(this.e);
        sb.append(", contentPadding=");
        return vu5.b(sb, this.f, ')');
    }
}
