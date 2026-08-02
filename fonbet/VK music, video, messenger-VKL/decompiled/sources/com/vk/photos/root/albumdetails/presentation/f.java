package com.vk.photos.root.albumdetails.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.photos.root.albumdetails.presentation.j;
import com.vk.photos.root.albumdetails.presentation.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.epx;
import xsna.izs;
import xsna.nzo;
import xsna.s0e0;

/* compiled from: AlbumDetailsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements izs<j, k.c> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final k.c invoke(j jVar) {
        ?? r8;
        k.c.b aVar;
        j jVar2 = jVar;
        h hVar = (h) this.receiver;
        hVar.getClass();
        s0e0 s0e0Var = hVar.d;
        VKList<Photo> vKList = jVar2.b;
        UserId userId = jVar2.f;
        Set<Integer> set = jVar2.h;
        boolean z = jVar2.j;
        j.a aVar2 = jVar2.d;
        boolean z2 = vKList != null && epx.f(aVar2, j.a.b.a);
        Throwable th = aVar2 instanceof j.a.C1487a ? ((j.a.C1487a) aVar2).a : null;
        if (vKList != null) {
            nzo.i(vKList, jVar2.i);
            r8 = new ArrayList(c5g.u(vKList, 10));
            for (Photo photo : vKList) {
                r8.add(new k.c.C1491c(photo, z ? Boolean.valueOf(set.contains(Integer.valueOf(photo.c))) : null, s0e0Var.a(userId), photo.Ib()));
            }
        } else {
            r8 = EmptyList.b;
        }
        List list = r8;
        j.a aVar3 = jVar2.e;
        if (aVar3 == null) {
            aVar = null;
        } else if (aVar3.equals(j.a.b.a)) {
            aVar = k.c.b.C1490b.a;
        } else {
            if (!(aVar3 instanceof j.a.C1487a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new k.c.b.a(((j.a.C1487a) aVar3).a);
        }
        Integer num = jVar2.c;
        boolean z3 = hVar.f;
        boolean a = s0e0Var.a(userId);
        int i = jVar2.m;
        return new k.c(z2, list, aVar, th, a ? z ? new k.c.a.C1489c((set.isEmpty() || i == -9000) ? false : true) : i < 0 ? (z3 && i == -15) ? k.c.a.b.a : k.c.a.d.a : z3 ? k.c.a.b.a : k.c.a.C1488a.a : null, num);
    }
}
