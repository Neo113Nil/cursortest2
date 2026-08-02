package com.vk.photos.root.selectalbum.domain;

import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.domain.g;
import com.vk.photos.root.selectalbum.domain.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.g270;
import xsna.izi0;
import xsna.izs;
import xsna.vvu;

/* compiled from: SelectAlbumReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements izs<g, h.b> {
    @Override // xsna.izs
    public final h.b invoke(g gVar) {
        boolean z;
        g gVar2 = gVar;
        e eVar = (e) this.receiver;
        Set<Integer> set = eVar.e;
        Iterable iterable = gVar2.b;
        g.a aVar = gVar2.c;
        boolean z2 = iterable != null && epx.f(aVar, g.a.b.a);
        h.b.a aVar2 = null;
        Throwable th = aVar instanceof g.a.C1513a ? ((g.a.C1513a) aVar).a : null;
        Set g = izi0.g(eVar.f, set);
        ListBuilder e = e43.e();
        e.add(vvu.b);
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            PhotoAlbumWrapper photoAlbumWrapper = (PhotoAlbumWrapper) obj;
            if (!set.contains(Integer.valueOf(photoAlbumWrapper.getId())) || g.contains(Integer.valueOf(photoAlbumWrapper.getId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PhotoAlbumWrapper photoAlbumWrapper2 = (PhotoAlbumWrapper) it.next();
            PhotoAlbumWrapper photoAlbumWrapper3 = gVar2.e;
            if (photoAlbumWrapper3 != null && photoAlbumWrapper2.getId() == photoAlbumWrapper3.getId()) {
                if (photoAlbumWrapper2 instanceof PhotoAlbumWrapper.CommonPhotoAlbum) {
                    photoAlbumWrapper2 = new PhotoAlbumWrapper.CommonPhotoAlbum(((PhotoAlbumWrapper.CommonPhotoAlbum) photoAlbumWrapper2).e, true);
                } else {
                    if (!(photoAlbumWrapper2 instanceof PhotoAlbumWrapper.SpecialPhotoAlbum)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PhotoAlbumWrapper.SpecialPhotoAlbum specialPhotoAlbum = (PhotoAlbumWrapper.SpecialPhotoAlbum) photoAlbumWrapper2;
                    photoAlbumWrapper2 = new PhotoAlbumWrapper.SpecialPhotoAlbum(specialPhotoAlbum.e, specialPhotoAlbum.f, true);
                }
            }
            arrayList2.add(photoAlbumWrapper2);
        }
        if (!arrayList2.isEmpty() && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!(((PhotoAlbumWrapper) it2.next()) instanceof PhotoAlbumWrapper.SpecialPhotoAlbum)) {
                    e.addAll(arrayList2);
                    z = true;
                    break;
                }
            }
        }
        e.addAll(arrayList2);
        e.add(g270.b);
        z = false;
        ListBuilder g2 = e.g();
        g.a aVar3 = gVar2.d;
        if (aVar3 != null) {
            if (aVar3.equals(g.a.b.a)) {
                aVar2 = h.b.a.C1515b.a;
            } else {
                if (!(aVar3 instanceof g.a.C1513a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = new h.b.a.C1514a();
            }
        }
        return new h.b(z2, g2, aVar2, th, z);
    }
}
