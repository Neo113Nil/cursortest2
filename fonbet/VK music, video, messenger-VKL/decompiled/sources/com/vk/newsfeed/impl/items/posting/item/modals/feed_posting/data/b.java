package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data;

import com.vk.api.generated.groups.dto.GroupsFilterDto;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.completable.y;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.internal.operators.single.e0;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.adc0;
import xsna.asu0;
import xsna.awd0;
import xsna.b25;
import xsna.c5g;
import xsna.cr;
import xsna.d2y;
import xsna.do3;
import xsna.ful0;
import xsna.k3c0;
import xsna.kl60;
import xsna.max0;
import xsna.o1e0;
import xsna.o440;
import xsna.oft0;
import xsna.rsg0;
import xsna.sj4;
import xsna.tfx;
import xsna.u5;
import xsna.v34;
import xsna.wx30;
import xsna.x34;
import xsna.y160;
import xsna.y510;
import xsna.ycc0;
import xsna.yfb;
import xsna.zcc0;
import xsna.zj0;

/* compiled from: PostingAuthorRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class b implements ycc0 {
    public final b25 a;
    public final AdminCommunitiesDataSource b;
    public final max0 c;

    public b(b25 b25Var, AdminCommunitiesDataSource adminCommunitiesDataSource, max0 max0Var) {
        this.a = b25Var;
        this.b = adminCommunitiesDataSource;
        this.c = max0Var;
    }

    @Override // xsna.ycc0
    public final void a() {
        this.b.c.set(false);
    }

    @Override // xsna.ycc0
    public final r b() {
        ArrayList arrayList;
        List singletonList = Collections.singletonList(GroupsFilterDto.EDITOR);
        this.c.getClass();
        tfx tfxVar = new tfx("wall.getLastPostingInfo", new ful0(8), new oft0(3));
        if (singletonList != null) {
            List list = singletonList;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFilterDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filter", arrayList);
        }
        return new r(x.A(new e0(rsg0.w0(yfb.x(tfxVar)).l(new cr(new y510(14), 24)), new sj4(new y160(this, 4), 26)), new e0(new v(new k3c0(this, 1)), new sj4(new y160(this, 4), 26)), new e0(new io.reactivex.rxjava3.internal.operators.single.c(new zcc0(this, false)), new do3(new wx30(this, 7), 27)), new zj0(new adc0(3, this, b.class, "buildUpAuthorContext", "buildUpAuthorContext(Lcom/vk/dto/common/id/UserId;Lcom/vk/newsfeed/api/posting/author/PostingAuthor$User;Ljava/util/List;)Lcom/vk/newsfeed/api/posting/author/PostingAuthorContext;", 0), 22)), new u5(new d2y(this, 19), 27));
    }

    @Override // xsna.ycc0
    public final y c() {
        f<awd0> fVar = o1e0.a.a;
        v34 v34Var = new v34(new kl60(11), 24);
        fVar.getClass();
        return new l0(new i0(fVar, v34Var), new x34(new o440(this, 15), 25)).q(asu0.a.c());
    }
}
