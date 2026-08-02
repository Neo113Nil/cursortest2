package com.vk.photos.root.selectalbum.domain;

import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.domain.c;
import com.vk.photos.root.selectalbum.domain.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.dm50;
import xsna.epx;
import xsna.g2h0;
import xsna.hsc0;
import xsna.j5g;

/* compiled from: SelectAlbumReducer.kt */
/* loaded from: classes4.dex */
public final class e extends dm50<h, c, g> {
    public final ArrayList d;
    public final Set<Integer> e;
    public final Set<Integer> f;

    public e(ArrayList arrayList, Set set) {
        super(new g(arrayList, g.a.b.a, null, null, 0));
        this.d = arrayList;
        this.e = set;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((PhotoAlbumWrapper.SpecialPhotoAlbum) it.next()).e));
        }
        this.f = j5g.S0(arrayList2);
    }

    @Override // xsna.dm50
    public final g c(g gVar, c cVar) {
        Collection collection;
        Collection collection2;
        g gVar2 = gVar;
        c cVar2 = cVar;
        PhotoAlbumWrapper photoAlbumWrapper = gVar2.e;
        Collection collection3 = gVar2.b;
        if (cVar2.equals(c.b.b)) {
            return gVar2;
        }
        if (cVar2 instanceof c.C1512c) {
            c.C1512c c1512c = (c.C1512c) cVar2;
            g.a.C1513a c1513a = new g.a.C1513a(c1512c.b);
            return (c1512c.c || (collection2 = collection3) == null || collection2.isEmpty()) ? g.a(gVar2, null, c1513a, null, null, 0, 29) : g.a(gVar2, null, null, c1513a, null, 0, 27);
        }
        if (cVar2 instanceof c.e) {
            return (((c.e) cVar2).b || (collection = collection3) == null || collection.isEmpty()) ? g.a(gVar2, null, g.a.b.a, null, null, 0, 25) : g.a(gVar2, null, null, g.a.b.a, null, 0, 25);
        }
        if (cVar2 instanceof c.d) {
            if (collection3 == null) {
                collection3 = EmptyList.b;
            }
            Collection collection4 = collection3;
            List<PhotoAlbum> list = ((c.d) cVar2).b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (PhotoAlbum photoAlbum : list) {
                arrayList.add(new PhotoAlbumWrapper.CommonPhotoAlbum(photoAlbum, photoAlbumWrapper != null && photoAlbum.b == photoAlbumWrapper.getId()));
            }
            return g.a(gVar2, j5g.u0(arrayList, collection4), null, null, null, 0, 24);
        }
        if (!(cVar2 instanceof c.f)) {
            if (cVar2 instanceof c.a) {
                return g.a(gVar2, null, null, null, ((c.a) cVar2).b, 0, 23);
            }
            if (cVar2 instanceof c.g) {
                return g.a(gVar2, null, null, null, null, ((c.g) cVar2).b, 15);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<PhotoAlbum> list2 = ((c.f) cVar2).b;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (PhotoAlbum photoAlbum2 : list2) {
            arrayList2.add(new PhotoAlbumWrapper.CommonPhotoAlbum(photoAlbum2, photoAlbumWrapper != null && photoAlbum2.b == photoAlbumWrapper.getId()));
        }
        return g.a(gVar2, j5g.u0(arrayList2, this.d), null, null, null, 0, 28);
    }

    @Override // xsna.dm50
    public final h d() {
        return new h(e(new hsc0(this, 10)), e(new g2h0(1)));
    }

    @Override // xsna.dm50
    public final void h(g gVar, h hVar) {
        g gVar2 = gVar;
        h hVar2 = hVar;
        if (epx.f(gVar2.c, g.a.b.a)) {
            f(hVar2.b, gVar2);
        } else {
            f(hVar2.a, gVar2);
        }
    }
}
