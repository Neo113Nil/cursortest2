package com.vk.photos.root.albumdetails.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.observable.o;
import com.vk.movika.sdk.base.observable.p;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.photos.root.albumdetails.presentation.j;
import com.vk.photos.root.albumdetails.presentation.k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.dm50;
import xsna.el1;
import xsna.epx;
import xsna.izi0;
import xsna.j5g;
import xsna.s0e0;

/* compiled from: AlbumDetailsReducer.kt */
/* loaded from: classes4.dex */
public final class h extends dm50<k, d, j> {
    public final s0e0 d;
    public final el1 e;
    public final boolean f;

    public h(s0e0 s0e0Var, el1 el1Var, PhotoAlbum photoAlbum, UserId userId, int i, boolean z) {
        super(new j(null, null, j.a.b.a, null, userId, photoAlbum != null && el1Var.a(photoAlbum), new HashSet(), new HashSet(), false, false, photoAlbum, i, z));
        this.d = s0e0Var;
        this.e = el1Var;
        this.f = z;
    }

    public static final k.b i(h hVar, j jVar) {
        String str;
        String str2;
        hVar.getClass();
        PhotoAlbum photoAlbum = jVar.l;
        String str3 = "";
        if (photoAlbum == null || (str = photoAlbum.g) == null) {
            str = "";
        }
        if (photoAlbum != null && (str2 = photoAlbum.h) != null) {
            str3 = str2;
        }
        return new k.b(str, str3, photoAlbum != null && hVar.e.a(photoAlbum), !hVar.d.a(jVar.f));
    }

    public static Set j(j jVar, VKList vKList) {
        boolean z = jVar.j;
        Set<Integer> set = jVar.h;
        if (!z || set.isEmpty()) {
            return EmptySet.b;
        }
        Set R0 = j5g.R0(set);
        Iterator<T> it = vKList.iterator();
        while (it.hasNext()) {
            R0.remove(Integer.valueOf(((Photo) it.next()).c));
            R0.isEmpty();
        }
        return R0;
    }

    @Override // xsna.dm50
    public final j c(j jVar, d dVar) {
        boolean z;
        j jVar2 = jVar;
        d dVar2 = dVar;
        VKList<Photo> vKList = jVar2.b;
        Set<Integer> set = jVar2.h;
        if (dVar2 instanceof d.c) {
            return jVar2;
        }
        if (dVar2 instanceof d.C1483d) {
            d.C1483d c1483d = (d.C1483d) dVar2;
            j.a.C1487a c1487a = new j.a.C1487a(c1483d.b);
            return (c1483d.c || vKList == null || vKList.isEmpty()) ? j.a(jVar2, null, null, c1487a, null, null, null, false, false, null, 8184) : j.a(jVar2, null, null, null, c1487a, null, null, false, false, null, 8183);
        }
        if (dVar2 instanceof d.e) {
            d.e eVar = (d.e) dVar2;
            if (vKList == null) {
                vKList = new VKList<>();
            }
            VKList<Photo> vKList2 = eVar.b;
            vKList.addAll(vKList2);
            vKList.o(vKList2.i());
            vKList.n(vKList2.j());
            z = vKList2.i() == vKList.size();
            int size = vKList.size();
            Integer valueOf = Integer.valueOf(size);
            if (!z || size <= 0) {
                valueOf = null;
            }
            return j.a(jVar2, vKList, valueOf, null, null, izi0.g(set, j(jVar2, vKList)), null, false, false, null, 8112);
        }
        if (dVar2 instanceof d.f) {
            return (((d.f) dVar2).b || vKList == null || vKList.isEmpty()) ? j.a(jVar2, null, null, j.a.b.a, null, null, null, false, false, null, 8179) : j.a(jVar2, null, null, null, j.a.b.a, null, null, false, false, null, 8179);
        }
        if (dVar2 instanceof d.i) {
            VKList<Photo> vKList3 = ((d.i) dVar2).b;
            z = vKList3.i() == vKList3.size();
            int size2 = vKList3.size();
            Integer valueOf2 = Integer.valueOf(size2);
            if (!z || size2 <= 0) {
                valueOf2 = null;
            }
            return j.a(jVar2, vKList3, valueOf2, null, null, izi0.g(set, j(jVar2, vKList3)), EmptySet.b, false, false, null, 7992);
        }
        if (dVar2.equals(d.a.b)) {
            return j.a(jVar2, null, null, null, null, null, null, true, false, null, 7935);
        }
        if (dVar2.equals(d.b.b)) {
            return j.a(jVar2, null, null, null, null, EmptySet.b, null, false, false, null, 7871);
        }
        if (dVar2 instanceof d.k) {
            HashSet hashSet = new HashSet(set);
            int i = ((d.k) dVar2).b.c;
            if (set.contains(Integer.valueOf(i))) {
                hashSet.remove(Integer.valueOf(i));
            } else {
                hashSet.add(Integer.valueOf(i));
            }
            return j.a(jVar2, null, null, null, null, hashSet, null, false, false, null, 8127);
        }
        if (dVar2 instanceof d.j) {
            return j.a(jVar2, null, null, null, null, izi0.k(set, Integer.valueOf(((d.j) dVar2).b.c)), null, false, false, null, 8127);
        }
        if (dVar2 instanceof d.l) {
            return j.a(jVar2, null, null, null, null, izi0.f(set, Integer.valueOf(((d.l) dVar2).b.c)), null, false, false, null, 8127);
        }
        if (dVar2 instanceof d.m) {
            return j.a(jVar2, null, null, null, null, null, null, false, false, ((d.m) dVar2).b, 7167);
        }
        if (dVar2 instanceof d.g) {
            return j.a(jVar2, null, null, null, null, null, null, false, ((d.g) dVar2).b, null, 7679);
        }
        if (dVar2 instanceof d.h) {
            return j.a(jVar2, null, null, null, null, null, izi0.j(jVar2.i, ((d.h) dVar2).b), false, false, null, 8063);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final k d() {
        return new k(e(new o(this, 1)), e(new p(this, 6)));
    }

    @Override // xsna.dm50
    public final void h(j jVar, k kVar) {
        j jVar2 = jVar;
        k kVar2 = kVar;
        if (epx.f(jVar2.d, j.a.b.a) && jVar2.b == null) {
            f(kVar2.b, jVar2);
        } else {
            f(kVar2.a, jVar2);
        }
    }
}
