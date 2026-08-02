package com.vk.photos.root.albums.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import defpackage.q0;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.km50;

/* compiled from: AlbumsState.kt */
/* loaded from: classes4.dex */
public final class f implements km50 {
    public final List<PhotoAlbum> b;
    public final List<PhotoAlbum> c;
    public final a d;
    public final a e;
    public final a f;
    public final UserId g;
    public final String h;
    public final boolean i;

    /* compiled from: AlbumsState.kt */
    public static abstract class a {

        /* compiled from: AlbumsState.kt */
        /* renamed from: com.vk.photos.root.albums.presentation.f$a$a, reason: collision with other inner class name */
        public static final class C1497a extends a {
            public final Throwable a;

            public C1497a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: AlbumsState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends PhotoAlbum> list, List<? extends PhotoAlbum> list2, a aVar, a aVar2, a aVar3, UserId userId, String str, boolean z) {
        this.b = list;
        this.c = list2;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = userId;
        this.h = str;
        this.i = z;
    }

    public static f a(f fVar, List list, List list2, a aVar, a aVar2, a aVar3, boolean z, int i) {
        if ((i & 1) != 0) {
            list = fVar.b;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = fVar.c;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            aVar = fVar.d;
        }
        a aVar4 = aVar;
        if ((i & 8) != 0) {
            aVar2 = fVar.e;
        }
        a aVar5 = aVar2;
        a aVar6 = (i & 16) != 0 ? fVar.f : aVar3;
        UserId userId = fVar.g;
        String str = fVar.h;
        boolean z2 = (i & 128) != 0 ? fVar.i : z;
        fVar.getClass();
        return new f(list3, list4, aVar4, aVar5, aVar6, userId, str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g) && epx.f(this.h, fVar.h) && this.i == fVar.i;
    }

    public final int hashCode() {
        List<PhotoAlbum> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PhotoAlbum> list2 = this.c;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        a aVar = this.d;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.e;
        int hashCode4 = (hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.f;
        int a2 = bh10.a((hashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31, this.g.b);
        String str = this.h;
        return Boolean.hashCode(this.i) + ((a2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumsState(albums=");
        sb.append(this.b);
        sb.append(", systemAlbums=");
        sb.append(this.c);
        sb.append(", systemLoadingState=");
        sb.append(this.d);
        sb.append(", firstPageLoadingState=");
        sb.append(this.e);
        sb.append(", nextPageLoadingState=");
        sb.append(this.f);
        sb.append(", uid=");
        sb.append(this.g);
        sb.append(", userNameGen=");
        sb.append(this.h);
        sb.append(", faceRecognitionMode=");
        return q0.a(sb, this.i, ')');
    }
}
