package com.vk.newsfeed.impl.posting.settings.mvi;

import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.a;
import com.vk.newsfeed.impl.posting.settings.mvi.e;
import com.vk.newsfeed.impl.posting.settings.mvi.g;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.cf00;
import xsna.ctu;
import xsna.epx;
import xsna.f4z;
import xsna.fhc0;
import xsna.i0b0;
import xsna.i750;
import xsna.iwg0;
import xsna.jw80;
import xsna.kwg0;
import xsna.m330;
import xsna.ma;
import xsna.o330;
import xsna.pvo0;
import xsna.ut6;
import xsna.uu60;
import xsna.wk50;
import xsna.zlc0;

/* compiled from: PostingSettingsFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<h, PostingSettingsState, a, e> {
    public final zlc0 f;
    public final fhc0.e g;
    public final f4z h;
    public final bpn0 i;

    public b(f fVar, zlc0 zlc0Var, fhc0.e eVar) {
        super(a.g.b, fVar);
        this.f = zlc0Var;
        this.g = eVar;
        this.h = new f4z();
        this.i = new bpn0(new cf00(this, 19));
    }

    @Override // xsna.wk50
    public final void N(PostingSettingsState postingSettingsState, a aVar) {
        Boolean bool;
        PostingSettingsState postingSettingsState2 = postingSettingsState;
        a aVar2 = aVar;
        PostingSettingsState.e eVar = postingSettingsState2.l;
        PostingSettingsState.f fVar = postingSettingsState2.k;
        PostingSettingsState.b bVar = postingSettingsState2.i;
        long j = postingSettingsState2.h;
        boolean z = postingSettingsState2.e;
        PostingSettingsState.a aVar3 = postingSettingsState2.o;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = postingSettingsState2.p;
        boolean equals = aVar2.equals(a.g.b);
        int i = 14;
        int i2 = 4;
        io.reactivex.rxjava3.disposables.b bVar2 = this.e;
        zlc0 zlc0Var = this.f;
        if (equals) {
            if (z) {
                m1 c = zlc0Var.c(j);
                uu60 uu60Var = new uu60(new i0b0(this, i2), 9);
                int i3 = kwg0.a;
                bVar2.b(c.subscribe(uu60Var, new iwg0()));
            } else {
                m1 d = zlc0Var.d();
                o330 o330Var = new o330(new i750(this, i), 12);
                int i4 = kwg0.a;
                bVar2.b(d.subscribe(o330Var, new iwg0()));
            }
            T(e.i.b);
            return;
        }
        boolean equals2 = aVar2.equals(a.c.b);
        f4z f4zVar = this.h;
        if (equals2) {
            f4zVar.b(new g.b(postingSettingsState2));
            return;
        }
        if (aVar2.equals(a.d.b)) {
            T(new e.b(!bVar.c));
            return;
        }
        boolean equals3 = aVar2.equals(a.f.b);
        fhc0.e eVar2 = this.g;
        if (equals3) {
            boolean z2 = postingSettingsState2.j.b;
            boolean z3 = !z2;
            if (z2) {
                eVar2.c(postingMetricsCreationEntryPoint);
            } else {
                eVar2.i(postingMetricsCreationEntryPoint);
            }
            T(new e.C1390e(z3));
            return;
        }
        if (aVar2.equals(a.e.b)) {
            T(new e.d(!postingSettingsState2.n.b));
            return;
        }
        if (aVar2 instanceof a.i) {
            a.i iVar = (a.i) aVar2;
            if (iVar instanceof a.i.b) {
                a.i.b bVar3 = (a.i.b) iVar;
                if (fVar.d > 0) {
                    f4zVar.b(new g.d(bVar3.b));
                    return;
                }
                Calendar d2 = pvo0.d();
                d2.add(10, 4);
                d2.set(13, 0);
                long time = d2.getTime().getTime();
                eVar2.e(postingMetricsCreationEntryPoint);
                f4zVar.b(new g.c(time));
                return;
            }
            if (iVar.equals(a.i.c.b)) {
                long j2 = fVar.d;
                eVar2.e(postingMetricsCreationEntryPoint);
                f4zVar.b(new g.c(j2));
                return;
            } else if (iVar instanceof a.i.C1388a) {
                long j3 = ((a.i.C1388a) iVar).b;
                eVar2.d(j3, postingMetricsCreationEntryPoint);
                T(new e.f(j3));
                return;
            } else {
                if (!iVar.equals(a.i.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar2.d(0L, postingMetricsCreationEntryPoint);
                T(new e.f(0L));
                return;
            }
        }
        if (aVar2 instanceof a.k) {
            a.k kVar = (a.k) aVar2;
            if (kVar instanceof a.k.b) {
                a.k.b bVar4 = (a.k.b) kVar;
                if (eVar.b != null) {
                    f4zVar.b(new g.f(bVar4.b));
                    return;
                } else {
                    eVar2.j(postingMetricsCreationEntryPoint);
                    f4zVar.b(new g.e(null));
                    return;
                }
            }
            if (kVar.equals(a.k.c.b)) {
                String str = eVar.b;
                eVar2.j(postingMetricsCreationEntryPoint);
                f4zVar.b(new g.e(str));
                return;
            } else if (kVar instanceof a.k.C1389a) {
                String str2 = ((a.k.C1389a) kVar).b;
                eVar2.a(str2, postingMetricsCreationEntryPoint);
                T(new e.g(str2));
                return;
            } else {
                if (!kVar.equals(a.k.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar2.a(null, postingMetricsCreationEntryPoint);
                T(new e.g(null));
                return;
            }
        }
        if (aVar2.equals(a.j.b)) {
            if (z) {
                PostingSettingsState.CommentsGlobalState commentsGlobalState = bVar.b;
                m1 f = zlc0Var.f(j, commentsGlobalState == PostingSettingsState.CommentsGlobalState.CLOSED_BY_REPLIES_SETTINGS);
                jw80 jw80Var = new jw80(new ma(28, this, commentsGlobalState), 6);
                int i5 = kwg0.a;
                bVar2.b(f.subscribe(jw80Var, new iwg0()));
                return;
            }
            PostingSettingsState.CommentsGlobalState commentsGlobalState2 = bVar.b;
            m1 e = zlc0Var.e(commentsGlobalState2 == PostingSettingsState.CommentsGlobalState.CLOSED_BY_REPLIES_SETTINGS);
            m330 m330Var = new m330(new ut6(25, this, commentsGlobalState2), 14);
            int i6 = kwg0.a;
            bVar2.b(e.subscribe(m330Var, new iwg0()));
            return;
        }
        if (aVar2.equals(a.b.b)) {
            if (postingSettingsState2.m) {
                f4zVar.b(g.i.a);
                return;
            }
            StringBuilder sb = new StringBuilder("#");
            Boolean bool2 = aVar3.c;
            if (bool2 != null) {
                sb.append("is_ad=" + bool2.booleanValue());
            }
            String str3 = aVar3.b;
            if (str3 != null) {
                sb.append("&ord_pred_id=".concat(str3));
            }
            String str4 = aVar3.d;
            if (str4 != null) {
                sb.append("&erid=".concat(str4));
            }
            f4zVar.b(new g.a(sb.toString(), postingMetricsCreationEntryPoint));
            return;
        }
        if (aVar2 instanceof a.h) {
            a.h hVar = (a.h) aVar2;
            boolean equals4 = hVar.equals(a.h.C1387a.b);
            bpn0 bpn0Var = this.i;
            if (equals4) {
                ((ctu) bpn0Var.getValue()).a();
                return;
            } else {
                if (!hVar.equals(a.h.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ctu) bpn0Var.getValue()).getClass();
                ctu.b();
                return;
            }
        }
        if (!(aVar2 instanceof a.C1386a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.C1386a c1386a = (a.C1386a) aVar2;
        boolean z4 = c1386a.d;
        if (z4 && !epx.f(aVar3.c, Boolean.TRUE)) {
            f4zVar.b(g.h.a);
        }
        if (!z4 && (bool = aVar3.c) != null && !bool.equals(Boolean.FALSE)) {
            f4zVar.b(g.j.a);
        }
        T(new e.a(c1386a.b, z4, c1386a.c));
    }
}
