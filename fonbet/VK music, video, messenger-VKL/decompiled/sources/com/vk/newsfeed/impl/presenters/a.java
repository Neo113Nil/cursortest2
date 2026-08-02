package com.vk.newsfeed.impl.presenters;

import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.presenters.b;
import io.reactivex.rxjava3.core.x;
import java.util.Collections;
import java.util.List;
import xsna.a840;
import xsna.arb0;
import xsna.drm0;
import xsna.e43;
import xsna.fkq0;
import xsna.izs;
import xsna.j5g;
import xsna.mi10;
import xsna.p5w;
import xsna.pi40;
import xsna.r1r0;
import xsna.rsg0;
import xsna.rxz;
import xsna.sn;
import xsna.t6g0;
import xsna.tuz;
import xsna.viu;
import xsna.wee0;
import xsna.xgv;
import xsna.xqu;
import xsna.yfb;

/* compiled from: PostViewPresenter.kt */
/* loaded from: classes4.dex */
public final class a implements izs {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        x b;
        x l;
        x l2;
        String str;
        Parcelable parcelable = (NewsEntry) j5g.b0(0, (List) obj);
        if (parcelable == null) {
            throw new IllegalArgumentException("listEntries must not be empty");
        }
        if (!(parcelable instanceof wee0)) {
            return x.k(parcelable);
        }
        Owner G = ((wee0) parcelable).G();
        if (G == null) {
            x.k(null);
            throw null;
        }
        int i = 3;
        if (fkq0.c(G.b)) {
            String str2 = G.c;
            if (str2 == null || drm0.N(str2) || (str = G.e) == null || drm0.N(str)) {
                boolean d = fkq0.d(G.b);
                int i2 = 15;
                b bVar = this.b;
                if (d) {
                    b = rsg0.W(yfb.x(r1r0.a.b(bVar.O, Collections.singletonList(G.b), Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)), 7).l(new a840(new mi10(bVar, 13), i));
                } else if (fkq0.b(G.b)) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.a(G.b));
                    if (C0 != null) {
                        l = x.k(C0);
                    } else {
                        List singletonList = Collections.singletonList(fkq0.a(G.b));
                        List l3 = e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.PHOTO_BASE);
                        if ((4 & 2) != 0) {
                            l3 = null;
                        }
                        l = rsg0.W(yfb.x(xqu.a.a(null, singletonList, l3)), 7).l(new p5w(new xgv(bVar, 28), 12));
                    }
                    b = l.l(new pi40(new viu(i2), 5));
                } else {
                    b = sn.b("Publisher is not group or user");
                }
                l2 = b.l(new tuz(new rxz(G, i2), 7));
            } else {
                l2 = x.k(G);
            }
        } else {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Publisher userId isn't real: " + G.b));
            l2 = x.k(G);
        }
        return l2.l(new b.c(new arb0(parcelable, i)));
    }
}
