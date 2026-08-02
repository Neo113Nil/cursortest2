package com.vk.photos.root.selectalbum.domain;

import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.photos.root.selectalbum.domain.c;
import com.vk.photos.root.selectalbum.domain.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.f4z;
import xsna.wk50;

/* compiled from: SelectAlbumFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<h, g, a, c> {
    public final f4z f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Set set, List list) {
        super(null, new e(r0, set));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(Integer.valueOf(((PhotoAlbumWrapper.SpecialPhotoAlbum) obj).e))) {
                arrayList.add(obj);
            }
        }
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(g gVar, a aVar) {
        g gVar2 = gVar;
        a aVar2 = aVar;
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            List<PhotoAlbum> list = eVar.b;
            if (eVar.c) {
                T(new c.f(list));
                return;
            } else {
                T(new c.d(list));
                return;
            }
        }
        if (aVar2 instanceof a.f) {
            a.f fVar = (a.f) aVar2;
            T(new c.C1512c(fVar.b, fVar.c));
            return;
        }
        if (aVar2 instanceof a.d) {
            T(new c.e(((a.d) aVar2).b));
            return;
        }
        boolean equals = aVar2.equals(a.C1511a.b);
        f4z f4zVar = this.f;
        if (equals) {
            f4zVar.b(f.a.a);
            return;
        }
        if (aVar2 instanceof a.b) {
            PhotoAlbumWrapper photoAlbumWrapper = gVar2.e;
            if (photoAlbumWrapper != null) {
                f4zVar.b(new f.e(photoAlbumWrapper));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.h) {
            T(new c.a(((a.h) aVar2).b));
            return;
        }
        if (aVar2.equals(a.c.b)) {
            f4zVar.b(f.c.a);
        } else if (aVar2 instanceof a.i) {
            T(new c.g(((a.i) aVar2).b));
        } else {
            if (!aVar2.equals(a.g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(f.d.a);
        }
    }
}
