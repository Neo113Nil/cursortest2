package com.vk.photos.root.common;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.u1;
import io.reactivex.rxjava3.internal.operators.single.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a8v;
import xsna.aga0;
import xsna.aha0;
import xsna.at;
import xsna.bk1;
import xsna.c5g;
import xsna.eqq;
import xsna.fq;
import xsna.gky;
import xsna.gvs;
import xsna.i750;
import xsna.j720;
import xsna.jw80;
import xsna.k7;
import xsna.kv8;
import xsna.m7a0;
import xsna.o330;
import xsna.oey;
import xsna.p4g;
import xsna.qcw;
import xsna.qw30;
import xsna.rsg0;
import xsna.t7;
import xsna.tf3;
import xsna.tfx;
import xsna.uf3;
import xsna.up1;
import xsna.uva;
import xsna.w11;
import xsna.x310;
import xsna.yfb;
import xsna.ysg0;
import xsna.zga0;
import xsna.zos;

/* compiled from: PhotosRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class b implements aga0 {
    public final aha0 a;
    public final ysg0<m7a0> b;
    public final kv8 c;

    public b(aha0 aha0Var, ysg0 ysg0Var, up1 up1Var) {
        this.a = aha0Var;
        this.b = ysg0Var;
        this.c = up1Var;
    }

    @Override // xsna.aga0
    public final x<Integer> a(UserId userId, List<? extends Photo> list) {
        if (list.isEmpty()) {
            return x.k(0);
        }
        List<List> p = p4g.p(100, list);
        ArrayList arrayList = new ArrayList(c5g.u(p, 10));
        for (List list2 : p) {
            List<Photo> list3 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (Photo photo : list3) {
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                sb.append('_');
                sb.append(photo.c);
                arrayList2.add(sb.toString());
            }
            arrayList.add(rsg0.w0(yfb.x(zga0.p(this.a, userId, null, arrayList2, 2))).l(new bk1(new qw30(list2, 15), 26)).o(EmptyList.b));
        }
        return new o(new o(new u1(q.O(arrayList).x(new w11(new zos(15), 29)), new at(27)).s(), new o330(new i750(this, 8), 8)).l(new k7(new gky(13), 27)), new jw80(new oey(14), 2));
    }

    @Override // xsna.aga0
    public final x<Integer> b(UserId userId, int i, List<? extends Photo> list) {
        if (list.isEmpty()) {
            return x.k(0);
        }
        List<List> p = p4g.p(100, list);
        ArrayList arrayList = new ArrayList(c5g.u(p, 10));
        for (List list2 : p) {
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((Photo) it.next()).c));
            }
            this.a.getClass();
            tfx tfxVar = new tfx("photos.move", new com.vk.movika.sdk.base.model.history.b(24), new fq(25));
            tfx.l(tfxVar, "target_album_id", i, 0, 0, 12);
            tfxVar.i("photo_ids", arrayList2);
            if (userId != null) {
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            }
            arrayList.add(rsg0.w0(yfb.x(tfxVar)).l(new x310(new eqq(list2, 29), 5)).o(EmptyList.b));
        }
        return new o(new o(new u1(q.O(arrayList).x(new tf3(new zos(15), 25)), new uf3(22)).s(), new a8v(new uva(this, i, 1), 8)).l(new t7(new qcw(12), 27)), new j720(new gvs(20), 4));
    }
}
