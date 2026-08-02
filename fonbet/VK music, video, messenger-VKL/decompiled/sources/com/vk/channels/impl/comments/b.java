package com.vk.channels.impl.comments;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.channels.api.Channel;
import com.vk.channels.api.CommentsHistory;
import com.vk.channels.impl.comments.a;
import com.vk.channels.impl.comments.c;
import com.vk.channels.impl.comments.f;
import com.vk.channels.impl.comments.g;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.stability.ImMsgSendDisabledByUnstableConnection;
import com.vk.log.L;
import com.vk.movika.sdk.base.hooks.p;
import com.vk.movika.sdk.base.observable.q;
import com.vk.movika.sdk.base.observable.s;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.single.j;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.asu0;
import xsna.az;
import xsna.b25;
import xsna.cvk;
import xsna.d50;
import xsna.di6;
import xsna.dz;
import xsna.e43;
import xsna.e60;
import xsna.e7;
import xsna.ea;
import xsna.ed;
import xsna.epx;
import xsna.ew;
import xsna.f50;
import xsna.fb;
import xsna.ff3;
import xsna.fh4;
import xsna.ft0;
import xsna.fu0;
import xsna.fwa;
import xsna.g20;
import xsna.gn0;
import xsna.gva;
import xsna.hag;
import xsna.hfz;
import xsna.hg1;
import xsna.itz;
import xsna.iva;
import xsna.iwa;
import xsna.j41;
import xsna.j5g;
import xsna.jm0;
import xsna.js1;
import xsna.k00;
import xsna.kfp;
import xsna.kl6;
import xsna.kro0;
import xsna.kva;
import xsna.kwa;
import xsna.l46;
import xsna.lg4;
import xsna.lhg;
import xsna.lp0;
import xsna.lwa;
import xsna.lxa;
import xsna.m5;
import xsna.mva;
import xsna.mwa;
import xsna.nf1;
import xsna.nwa;
import xsna.ot1;
import xsna.p41;
import xsna.pdg0;
import xsna.ph3;
import xsna.q060;
import xsna.q40;
import xsna.qm1;
import xsna.r060;
import xsna.rbg;
import xsna.reg;
import xsna.rf;
import xsna.rva;
import xsna.s6;
import xsna.sf;
import xsna.sh6;
import xsna.sn;
import xsna.sv;
import xsna.t9;
import xsna.tf1;
import xsna.tp0;
import xsna.um0;
import xsna.uva;
import xsna.v71;
import xsna.vva;
import xsna.wag;
import xsna.x8;
import xsna.xva;
import xsna.y50;
import xsna.yx0;
import xsna.zva;

/* compiled from: ChannelCommentsFeature.kt */
/* loaded from: classes16.dex */
public final class b extends di6<g, a, f, c> {
    public final ChannelCommentsParams h;
    public final b25 i;
    public final nwa j;
    public final mwa k;
    public final lxa l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public io.reactivex.rxjava3.disposables.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public io.reactivex.rxjava3.disposables.c q;
    public final io.reactivex.rxjava3.disposables.b r;

    public b(ChannelCommentsParams channelCommentsParams, b25 b25Var, nwa nwaVar, mwa mwaVar, lxa lxaVar) {
        super(g.e);
        this.h = channelCommentsParams;
        this.i = b25Var;
        this.j = nwaVar;
        this.k = mwaVar;
        this.l = lxaVar;
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.r = new io.reactivex.rxjava3.disposables.b();
        q(new com.vk.movika.sdk.base.data.a(this, 15));
        j(mwaVar.b(), new nf1(this, 9), new sh6(this, 3));
        com.vk.core.utils.newtork.b.a.getClass();
        i(com.vk.core.utils.newtork.b.d, io.reactivex.rxjava3.internal.functions.a.e, new j41(this, 5));
    }

    public static List s(b bVar, mwa.a aVar, boolean z, int i) {
        hfz hfzVar;
        boolean d = (i & 1) != 0 ? hg1.d(bVar.q) : z;
        boolean d2 = (i & 2) != 0 ? hg1.d(bVar.o) : true;
        nwa nwaVar = bVar.j;
        MsgFromChannel msgFromChannel = aVar.a;
        CommentsHistory commentsHistory = aVar.b;
        LinkedHashSet linkedHashSet = bVar.n;
        ProfilesSimpleInfo profilesSimpleInfo = aVar.c;
        LinkedHashSet linkedHashSet2 = bVar.m;
        nwaVar.getClass();
        List<hag> list = commentsHistory.a;
        if (list.isEmpty()) {
            return Collections.singletonList(kfp.b);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new reg(commentsHistory.c, commentsHistory.d, d));
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            hfzVar = null;
            if (!it.hasNext()) {
                break;
            }
            hag hagVar = (hag) it.next();
            hfz a = nwaVar.a(hagVar, 0, msgFromChannel, profilesSimpleInfo, linkedHashSet);
            CommentsHistory commentsHistory2 = hagVar.f;
            arrayList2.add(a);
            Iterator<T> it2 = commentsHistory2.a.iterator();
            while (it2.hasNext()) {
                arrayList2.add(nwaVar.a((hag) it2.next(), 1, msgFromChannel, profilesSimpleInfo, linkedHashSet));
            }
            int i2 = hagVar.a;
            String str = commentsHistory2.e;
            if (str != null && str.length() != 0) {
                if (linkedHashSet2.contains(Integer.valueOf(i2))) {
                    hfzVar = new kro0.a(i2);
                } else {
                    r060 r060Var = commentsHistory2.g;
                    hfzVar = r060Var == null ? new kro0.b(i2, Math.min(commentsHistory2.c - commentsHistory2.a.size(), 10)) : new kro0.c(i2, r060Var.a);
                }
            }
            if (hfzVar != null) {
                arrayList2.add(hfzVar);
            }
        }
        arrayList.addAll(arrayList2);
        String str2 = commentsHistory.e;
        if (str2 != null && str2.length() != 0) {
            r060 r060Var2 = commentsHistory.g;
            hfzVar = (r060Var2 == null || d2) ? new itz(Integer.valueOf(((hag) j5g.i0(list)).a)) : new q060(r060Var2.a, r060Var2.b, r060Var2.c);
        }
        if (hfzVar != null) {
            arrayList.add(hfzVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x031c, code lost:
    
        if (r8 == com.vk.im.engine.models.groups.AdminLevel.EDITOR) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0233  */
    /* JADX WARN: Type inference failed for: r0v92, types: [io.reactivex.rxjava3.internal.operators.single.q] */
    /* JADX WARN: Type inference failed for: r0v95, types: [io.reactivex.rxjava3.internal.operators.single.q] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object] */
    @Override // xsna.di6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(a aVar) {
        hag.b bVar;
        Integer a;
        Integer num;
        ChannelType channelType;
        hag a2;
        ListBuilder g;
        hag.b bVar2;
        Integer num2;
        int i;
        o oVar;
        a aVar2 = aVar;
        boolean equals = aVar2.equals(a.m.b);
        io.reactivex.rxjava3.disposables.b bVar3 = this.r;
        mwa mwaVar = this.k;
        if (equals) {
            io.reactivex.rxjava3.disposables.c cVar = this.o;
            if (cVar != null) {
                cVar.dispose();
            }
            bVar3.e();
            io.reactivex.rxjava3.disposables.c cVar2 = this.q;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            q(new q(this, 15));
            j(mwaVar.b(), new sv(this, 10), new m5(this, 9));
            return;
        }
        if (aVar2.equals(a.k.b)) {
            v(false);
            return;
        }
        if (aVar2.equals(a.j.b)) {
            q(new com.vk.movika.sdk.base.data.a(this, 15));
            j(mwaVar.b(), new nf1(this, 9), new sh6(this, 3));
            return;
        }
        hag hagVar = null;
        r6 = null;
        Integer num3 = null;
        r6 = null;
        Integer num4 = null;
        if (aVar2 instanceof a.q) {
            final int i2 = ((a.q) aVar2).b;
            q(new rva(this, i2, 0));
            Iterator it = mwaVar.a().b.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ?? next = it.next();
                if (((hag) next).a == i2) {
                    hagVar = next;
                    break;
                }
            }
            hag hagVar2 = hagVar;
            if (hagVar2 == null) {
                oVar = x.i(new IllegalArgumentException(lhg.a(i2, "No such comment with id=")));
            } else {
                long j = mwaVar.b;
                int i3 = mwaVar.c;
                Integer valueOf = Integer.valueOf(i2);
                String str = hagVar2.f.e;
                oVar = str == null ? sn.b("Unable to load comment thread, nextFrom is null") : new o(mwaVar.a.C(mwaVar, new iwa(j, i3, valueOf, str, CommentsHistory.Order.ASC, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE)).l(new ed(new fh4(mwaVar, i2, 1), 9)).q(asu0.a.c()), new ew(new k00(mwaVar, 16), 8));
            }
            bVar3.b(j(oVar, new io.reactivex.rxjava3.functions.f() { // from class: xsna.sva
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    com.vk.channels.impl.comments.b bVar4 = com.vk.channels.impl.comments.b.this;
                    bVar4.q(new cwa(bVar4, i2, 0));
                    bVar4.u((Throwable) obj);
                }
            }, new io.reactivex.rxjava3.functions.f() { // from class: xsna.tva
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    com.vk.channels.impl.comments.b bVar4 = com.vk.channels.impl.comments.b.this;
                    bVar4.q(new yva(bVar4, i2, (mwa.a) obj, 0));
                }
            }));
            return;
        }
        if (aVar2 instanceof a.C0531a) {
            m(new c.b(((a.C0531a) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.b) {
            m(new c.b(((a.b) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.h) {
            CharSequence charSequence = ((a.h) aVar2).b;
            if (hg1.d(this.p)) {
                return;
            }
            g.b bVar4 = g().c;
            if (bVar4 != null) {
                g.b.a aVar3 = bVar4.a;
                g.b.a.C0534a c0534a = aVar3 instanceof g.b.a.C0534a ? (g.b.a.C0534a) aVar3 : null;
                if (c0534a != null) {
                    num2 = Integer.valueOf(c0534a.a);
                    if (num2 != null) {
                        io.reactivex.rxjava3.disposables.c cVar3 = this.o;
                        if (cVar3 != null) {
                            cVar3.dispose();
                        }
                        q(new s(11));
                        g.b bVar5 = g().c;
                        Integer a3 = bVar5 != null ? bVar5.a() : null;
                        this.p = j(new j(new o(new r(mwaVar.a.C(mwaVar, new gva(mwaVar.b, mwaVar.c, a3, charSequence.toString())), new ft0(new d50(4, mwaVar, a3), 11)).q(asu0.a.c()), new f50(new com.vk.movika.sdk.base.logic.interactor.e(mwaVar, 11), 9)), new lg4(this, 1)), new ph3(this, 10), new x8(this, 8));
                        return;
                    }
                    hag a4 = rbg.a(mwaVar.a().b.a, num2, false);
                    if (epx.f(a4 != null ? a4.c : null, charSequence)) {
                        q(new com.vk.libvideo.design.view.video.a(5, this, num2));
                        n(f.a.a);
                        n(f.d.a);
                        return;
                    }
                    final int intValue = num2.intValue();
                    io.reactivex.rxjava3.disposables.c cVar4 = this.o;
                    if (cVar4 != null) {
                        cVar4.dispose();
                    }
                    q(new dz(5));
                    hag a5 = rbg.a(mwaVar.a().b.a, num2, true);
                    if (a5 != null && (i = a5.a) != intValue) {
                        num3 = Integer.valueOf(i);
                    }
                    this.p = j(new j(new o(mwaVar.a.C(mwaVar, new kva(mwaVar.b, mwaVar.c, intValue, num3, charSequence.toString())).l(new lp0(new p(mwaVar, 24), 12)).q(asu0.a.c()), new ea(new s6(mwaVar, 17), 11)), new zva(this, 0)), new gn0(this, 7), new io.reactivex.rxjava3.functions.f() { // from class: xsna.awa
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj) {
                            f.d dVar = f.d.a;
                            com.vk.channels.impl.comments.b bVar6 = com.vk.channels.impl.comments.b.this;
                            bVar6.n(dVar);
                            bVar6.q(new tn0(6, bVar6, (mwa.a) obj));
                            bVar6.n(f.a.a);
                            bVar6.n(dVar);
                            int i4 = intValue;
                            bVar6.n(new f.e(i4));
                            bVar6.w(i4);
                        }
                    });
                    return;
                }
            }
            num2 = null;
            if (num2 != null) {
            }
        } else {
            boolean z = aVar2 instanceof a.e;
            lxa lxaVar = this.l;
            if (!z) {
                if (aVar2 instanceof a.f) {
                    a.f fVar = (a.f) aVar2;
                    wag wagVar = fVar.b;
                    final int i4 = fVar.c;
                    if (epx.f(wagVar, wag.b.a)) {
                        q(new rf(11));
                        j(new j(new o(new r(mwaVar.a.C(mwaVar, new iva(mwaVar.b, mwaVar.c, i4)), new e7(new lwa(mwaVar, i4, 0), 10)).q(asu0.a.c()), new sf(new com.vk.movika.sdk.base.logic.interactor.p(mwaVar, 16), 13)), new ot1(this, 1)), new tp0(this, 4), new io.reactivex.rxjava3.functions.f() { // from class: xsna.qva
                            @Override // io.reactivex.rxjava3.functions.f
                            public final void accept(Object obj) {
                                final mwa.a aVar4 = (mwa.a) obj;
                                f.d dVar = f.d.a;
                                final com.vk.channels.impl.comments.b bVar6 = com.vk.channels.impl.comments.b.this;
                                bVar6.n(dVar);
                                final int i5 = i4;
                                bVar6.q(new izs() { // from class: xsna.bwa
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj2) {
                                        Integer b;
                                        com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj2;
                                        g.b bVar7 = gVar.c;
                                        int i6 = i5;
                                        if (bVar7 != null && (b = bVar7.b()) != null && b.intValue() == i6) {
                                            bVar7 = new g.b(g.b.a.C0535b.a);
                                        }
                                        g.b bVar8 = bVar7;
                                        com.vk.channels.impl.comments.b bVar9 = bVar6;
                                        bVar9.n.add(Integer.valueOf(i6));
                                        return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar9, aVar4, false, 3), null, bVar8, false, 2);
                                    }
                                });
                                bVar6.w(i5);
                            }
                        });
                        return;
                    }
                    if (epx.f(wagVar, wag.e.a)) {
                        y(i4);
                        return;
                    }
                    if (epx.f(wagVar, wag.a.a)) {
                        z(i4, r1);
                        return;
                    }
                    if (epx.f(wagVar, wag.f.a)) {
                        Channel b = lxaVar.b();
                        if (b == null || (channelType = b.z) == null) {
                            return;
                        }
                        m(new c.C0532c(mwaVar.b, channelType, i4));
                        return;
                    }
                    if (epx.f(wagVar, wag.d.a)) {
                        z(i4, null);
                        return;
                    }
                    if (!epx.f(wagVar, wag.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hag a6 = rbg.a(mwaVar.a().b.a, Integer.valueOf(i4), false);
                    if (a6 == null) {
                        return;
                    }
                    q(new fwa(this, i4, a6, 0));
                    n(new f.e(i4));
                    n(f.b.a);
                    return;
                }
                if (aVar2 instanceof a.n) {
                    y(((a.n) aVar2).b);
                    return;
                }
                if (aVar2 instanceof a.o) {
                    hag a7 = rbg.a(mwaVar.a().b.a, Integer.valueOf(((a.o) aVar2).b), false);
                    if (a7 == null || (num = a7.k) == null) {
                        return;
                    }
                    int intValue2 = num.intValue();
                    q(new vva(this, intValue2, 0));
                    n(new f.e(intValue2));
                    w(intValue2);
                    return;
                }
                if (aVar2.equals(a.d.b)) {
                    g.b bVar6 = g().c;
                    if (bVar6 == null || (a = bVar6.a()) == null) {
                        return;
                    }
                    q(new uva(this, a.intValue(), 0));
                    return;
                }
                if (aVar2 instanceof a.g) {
                    CommentsHistory commentsHistory = mwaVar.a().b;
                    int i5 = ((a.g) aVar2).b;
                    hag a8 = rbg.a(commentsHistory.a, Integer.valueOf(i5), false);
                    z(i5, ((a8 == null || (bVar = a8.l) == null) ? null : bVar.c) != null ? null : 1);
                    return;
                }
                if (aVar2 instanceof a.i) {
                    CommentsHistory.Order order = ((a.i) aVar2).b;
                    io.reactivex.rxjava3.disposables.c cVar5 = this.o;
                    if (cVar5 != null) {
                        cVar5.dispose();
                    }
                    bVar3.e();
                    q(new g20(this, 16));
                    this.q = di6.l(this, new j(mwaVar.d(order).h(new kl6(new jm0(this, 7), 3)), new v71(this, 1)), null, 3);
                    return;
                }
                if (aVar2 instanceof a.p) {
                    final int i6 = ((a.p) aVar2).b;
                    q(new e60(10));
                    j(new j(new o(new r(mwaVar.a.C(mwaVar, new mva(mwaVar.b, mwaVar.c, i6)), new q40(new kwa(mwaVar, i6), 4)).q(asu0.a.c()), new js1(new t9(mwaVar, 16), 11)), new l46(this, 2)), new tf1(this, 8), new io.reactivex.rxjava3.functions.f() { // from class: xsna.wva
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj) {
                            com.vk.channels.impl.comments.b bVar7 = com.vk.channels.impl.comments.b.this;
                            int i7 = i6;
                            bVar7.q(new dwa(bVar7, i7, (mwa.a) obj, 0));
                            bVar7.w(i7);
                        }
                    });
                    return;
                } else if (!aVar2.equals(a.c.b)) {
                    if (!(aVar2 instanceof a.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v(true);
                    return;
                } else {
                    g.b bVar7 = g().c;
                    if ((bVar7 != null ? bVar7.a : null) instanceof g.b.a.C0534a) {
                        q(new com.vk.im.engine.commands.messages.a(7, this, bVar7));
                        return;
                    } else {
                        m(c.a.a);
                        return;
                    }
                }
            }
            int i7 = ((a.e) aVar2).b;
            hag a9 = rbg.a(mwaVar.a().b.a, Integer.valueOf(i7), false);
            if (a9 == null) {
                return;
            }
            UserId userId = a9.b;
            ListBuilder e = e43.e();
            if (mwaVar.a().a.bc()) {
                e.add(wag.e.a);
            }
            b25 b25Var = this.i;
            if (!b25Var.a(userId)) {
                Channel b2 = lxaVar.b();
                if (b2 == null ? false : epx.f(com.vk.dto.common.a.a(userId), b2.A)) {
                    Channel b3 = lxaVar.b();
                    if (b3 != null) {
                        if (!b3.p) {
                            AdminLevel adminLevel = b3.u;
                            if (adminLevel != AdminLevel.ADMIN) {
                            }
                        }
                    }
                }
                a2 = rbg.a(mwaVar.a().b.a, Integer.valueOf(i7), false);
                if (a2 != null && (bVar2 = a2.l) != null) {
                    num4 = bVar2.c;
                }
                if (num4 == null) {
                    e.add(wag.d.a);
                } else if (mwaVar.a().a.bc()) {
                    e.add(wag.a.a);
                }
                if (!b25Var.a(userId)) {
                    Channel b4 = lxaVar.b();
                    if (!(b4 != null ? epx.f(com.vk.dto.common.a.a(userId), b4.A) : false)) {
                        e.add(wag.f.a);
                    }
                }
                if (a9.i && !a9.h) {
                    e.add(wag.b.a);
                }
                g = e.g();
                if (g.isEmpty()) {
                    n(new f.g(a9.a, g));
                    return;
                }
                return;
            }
            if (mwaVar.a().a.bc()) {
                e.add(wag.c.a);
            }
            a2 = rbg.a(mwaVar.a().b.a, Integer.valueOf(i7), false);
            if (a2 != null) {
                num4 = bVar2.c;
            }
            if (num4 == null) {
            }
            if (!b25Var.a(userId)) {
            }
            if (a9.i) {
                e.add(wag.b.a);
            }
            g = e.g();
            if (g.isEmpty()) {
            }
        }
    }

    public final void u(Throwable th) {
        if (th instanceof IOException) {
            n(f.h.a);
        } else if ((th instanceof ImTaskExecutionException) && (((ImTaskExecutionException) th).getCause() instanceof ImMsgSendDisabledByUnstableConnection)) {
            cvk.t();
        } else {
            L.i(th);
            n(new f.i(th));
        }
    }

    public final void v(boolean z) {
        if (hg1.d(this.o) || hg1.d(this.p)) {
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            n(f.h.a);
        }
        if (z) {
            q(new fb(this, 13));
        }
        this.o = j(this.k.c(), new fu0(this, 9), new ff3(this, 5));
    }

    public final void w(int i) {
        di6.l(this, x.k(Integer.valueOf(i)).f(3L, TimeUnit.SECONDS), new az(this, 8), 1);
    }

    public final void y(int i) {
        CommentsHistory commentsHistory = this.k.a().b;
        hag a = rbg.a(commentsHistory.a, Integer.valueOf(i), false);
        if (a == null) {
            return;
        }
        q(new xva(this, a, i, 0));
        n(new f.e(i));
        n(f.b.a);
    }

    public final void z(final int i, final Integer num) {
        final mwa mwaVar = this.k;
        mwaVar.getClass();
        l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.jwa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                hag.b bVar;
                mwa mwaVar2 = mwa.this;
                mwa.a a = mwaVar2.a();
                List<hag> list = a.b.a;
                int i2 = i;
                hag a2 = rbg.a(list, Integer.valueOf(i2), false);
                Integer num2 = (a2 == null || (bVar = a2.l) == null) ? null : bVar.c;
                Integer num3 = num;
                mwa.a b = a.b(i2, num3);
                if (!rVar.h()) {
                    rVar.onNext(b);
                }
                pdg0 n = mwaVar2.a.n(mwaVar2, new ova(mwaVar2.b, i2, num3));
                if (n instanceof pdg0.b) {
                    ((Boolean) ((pdg0.b) n).a).getClass();
                    if (!rVar.h()) {
                        rVar.onComplete();
                        return;
                    }
                    return;
                }
                if (!(n instanceof pdg0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th = ((pdg0.a) n).a.b;
                mwa.a b2 = mwaVar2.a().b(i2, num2);
                if (!rVar.h()) {
                    rVar.onNext(b2);
                }
                rVar.b(th);
            }
        }).r0(asu0.a.c());
        p41 p41Var = new p41(new qm1(mwaVar, 15), 8);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.b.b(r0.E(p41Var, lVar, kVar, kVar).subscribe(new um0(this, 11), new y50(new yx0(this, 19), 9)));
    }
}
