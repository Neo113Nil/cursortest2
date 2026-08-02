package com.vk.im.ui.components.msg_list;

import androidx.recyclerview.widget.m;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_list.b;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a1w;
import xsna.asu0;
import xsna.bl30;
import xsna.de;
import xsna.e9w;
import xsna.ehu;
import xsna.el30;
import xsna.ell;
import xsna.epx;
import xsna.fk;
import xsna.gdd;
import xsna.gzs;
import xsna.h2t0;
import xsna.hg1;
import xsna.ie8;
import xsna.ifm;
import xsna.il30;
import xsna.izs;
import xsna.jfm;
import xsna.jl30;
import xsna.jnm;
import xsna.k41;
import xsna.kfm;
import xsna.l5v0;
import xsna.ll30;
import xsna.m5v0;
import xsna.mcl0;
import xsna.mdz;
import xsna.mh40;
import xsna.n1w;
import xsna.nz;
import xsna.p5e;
import xsna.pl30;
import xsna.pn00;
import xsna.rj30;
import xsna.ry30;
import xsna.s3q0;
import xsna.sj30;
import xsna.sl30;
import xsna.uhm;
import xsna.uj30;
import xsna.v4v;
import xsna.vl30;
import xsna.w8v;
import xsna.w920;
import xsna.wbs0;
import xsna.xk30;
import xsna.xl30;
import xsna.yh1;
import xsna.ym1;
import xsna.yvv;
import xsna.zl20;
import xsna.zl30;
import xsna.zvv;

/* compiled from: MsgListPresenter.kt */
/* loaded from: classes2.dex */
public final class c {
    public final a1w a;
    public final com.vk.im.engine.models.c b;
    public final ry30 c;
    public final jl30 d;
    public final l5v0 e;
    public final io.reactivex.rxjava3.subjects.d<Pair<xl30, a>> f;
    public final y g;
    public final f<com.vk.im.ui.components.msg_list.b> h;
    public final y i;
    public volatile boolean j;
    public boolean k;
    public final io.reactivex.rxjava3.disposables.b l;
    public io.reactivex.rxjava3.disposables.c m;
    public final w n;
    public final zl30 o;
    public final io.reactivex.rxjava3.disposables.c p;
    public final io.reactivex.rxjava3.disposables.c q;

    /* compiled from: MsgListPresenter.kt */
    public final class a {
        public m.d a;

        public a(m.d dVar) {
            this.a = dVar;
        }
    }

    /* compiled from: MsgListPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((c) this.receiver).i(th);
            return s3q0.a;
        }
    }

    /* compiled from: MsgListPresenter.kt */
    /* renamed from: com.vk.im.ui.components.msg_list.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C1150c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((c) this.receiver).i(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00b6, code lost:
    
        if (r1.h() == false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.im.ui.components.msg_list.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(il30 il30Var, long j, a1w a1wVar, com.vk.im.engine.models.c cVar, int i, int i2, Dialog dialog, ry30 ry30Var, yh1 yh1Var, nz nzVar, jl30 jl30Var) {
        ?? obj = new Object();
        obj.a = a1wVar;
        obj.b = cVar;
        obj.c = ry30Var;
        obj.d = jl30Var;
        v4v v4vVar = new v4v(16);
        ifm ifmVar = new ifm(j, a1wVar);
        l5v0 l5v0Var = new l5v0(j, a1wVar, cVar, new w920(new jfm(a1wVar, ifmVar), new kfm(a1wVar, ifmVar), ifmVar, new n1w(j, a1wVar), i, i2, new uhm(j, a1wVar), e9w.b("MessageHistoryLogger"), v4vVar, false), new ell(a1wVar), dialog, jl30Var);
        obj.e = l5v0Var;
        io.reactivex.rxjava3.subjects.d<Pair<xl30, a>> O0 = io.reactivex.rxjava3.subjects.d.O0(new Pair(new xl30(0), new a(null)));
        obj.f = O0;
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        obj.g = new y(O0, qVar, aVar);
        f<com.vk.im.ui.components.msg_list.b> fVar = new f<>();
        obj.h = fVar;
        obj.i = new y(fVar, qVar, aVar);
        obj.j = true;
        obj.l = new io.reactivex.rxjava3.disposables.b();
        asu0 asu0Var = asu0.a;
        obj.n = asu0Var.A(1, "msg-list-presenter-history-processing");
        obj.o = new zl30(il30Var, yh1Var, nzVar, il30Var.Q);
        io.reactivex.rxjava3.disposables.c cVar2 = obj.p;
        c cVar3 = cVar2 != null ? obj : cVar3;
        int i3 = 1;
        c cVar4 = this;
        cVar4.p = l5v0Var.l.subscribe(new k41(new p5e(i3, obj, c.class, "handleMsgListDataLoaderEvent", "handleMsgListDataLoaderEvent(Lcom/vk/im/ui/components/msg_list/loader/MsgListLoaderEvent;)V", 0, 4), 28), new xk30(new ym1(i3, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, 9), i3));
        cVar3 = cVar4;
        cVar3.q = new i0(a1wVar.l.a(), new hg1.j2()).r0(asu0Var.d()).subscribe(new sl30(new zl20(cVar3, 3), 0));
    }

    public final void a() {
        a j;
        Pair<xl30, a> P0 = this.f.P0();
        if (P0 != null && (j = P0.j()) != null) {
            j.a = null;
        }
        io.reactivex.rxjava3.disposables.b bVar = this.l;
        this.j = false;
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = null;
        bVar.e();
        l5v0 l5v0Var = this.e;
        l5v0Var.d.k();
        l5v0Var.p.e();
    }

    public final void b(com.vk.im.ui.components.msg_list.b bVar) {
        this.h.onNext(bVar);
    }

    public final ArrayList c(List list) {
        l5v0 l5v0Var = this.e;
        l5v0Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<Msg> k = l5v0Var.d.c().k();
        HashMap hashMap = new HashMap(k.size());
        for (Msg msg : k) {
            hashMap.put(Integer.valueOf(msg.b), msg);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (hashMap.containsKey(Integer.valueOf(intValue))) {
                arrayList.add(pn00.h(Integer.valueOf(intValue), hashMap));
            }
        }
        return arrayList;
    }

    public final Msg d(int i) {
        Object obj;
        Iterator<T> it = this.e.d.c().k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Msg) obj).d == i) {
                break;
            }
        }
        return (Msg) obj;
    }

    public final Msg e(Integer num) {
        Object obj;
        Iterator<T> it = this.e.d.c().k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Msg) obj).b == num.intValue()) {
                break;
            }
        }
        return (Msg) obj;
    }

    public final Dialog f() {
        return this.e.d().a();
    }

    public final xl30 g() {
        return this.f.P0().i();
    }

    public final ProfilesInfo h() {
        return this.e.e.b();
    }

    public final void i(Throwable th) {
        yvv yvvVar;
        if (this.j) {
            this.j = false;
            if (!BuildInfo.m() && (yvvVar = zvv.a.get()) != null) {
                yvvVar.a();
                throw null;
            }
        }
        b(new b.c(th));
    }

    public final void j(MsgListOpenMode msgListOpenMode) {
        de rj30Var;
        yvv yvvVar;
        jl30 jl30Var = this.d;
        jl30Var.a.c((mdz) jl30Var.g.getValue());
        this.j = false;
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = null;
        m(new el30(this, 1));
        this.j = true;
        b(b.e.a);
        if (!BuildInfo.m() && (yvvVar = zvv.a.get()) != null) {
            yvvVar.a();
            throw null;
        }
        if (msgListOpenMode instanceof MsgListOpenAtLatestMode) {
            rj30Var = uj30.d;
        } else if (msgListOpenMode instanceof MsgListOpenAtUnreadMode) {
            rj30Var = sj30.b;
        } else {
            if (!(msgListOpenMode instanceof MsgListOpenAtMsgMode)) {
                throw new NoWhenBranchMatchedException();
            }
            MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) msgListOpenMode;
            rj30Var = new rj30(msgListOpenAtMsgMode.b, msgListOpenAtMsgMode.c);
        }
        l5v0 l5v0Var = this.e;
        l5v0Var.p.e();
        l5v0Var.d.d(rj30Var);
        l5v0Var.p.b(l5v0Var.b.E(l5v0Var, new jnm()).l(new mh40(new mcl0(18), 23)).m(asu0.a.d()).subscribe(new wbs0(new m5v0(1, l5v0Var, l5v0.class, "onUpdateLoaded", "onUpdateLoaded(Lcom/vk/im/ui/components/msg_list/loader/VkMsgListDataLoader$LocalStateUpdate;)V", 0), 3), new h2t0(new ie8(l5v0Var, 12), 1)));
    }

    public final void k(Msg msg) {
        if (msg == null) {
            m(new bl30(new ehu(11), 1));
        } else {
            if (g().b == msg.b) {
                return;
            }
            l(true, new fk(11, this, new vl30(msg, 0)));
        }
    }

    public final void l(final boolean z, final gzs<s3q0> gzsVar) {
        this.l.b(io.reactivex.rxjava3.kotlin.c.h(new v(new Callable() { // from class: xsna.rl30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list;
                gzs.this.invoke();
                if (z) {
                    com.vk.im.ui.components.msg_list.c cVar = this;
                    if (cVar.o.d.e && (list = cVar.g().c) != null && !list.isEmpty()) {
                        cVar.e.k.onNext(new pl30.d(w8v.d.c));
                    }
                }
                return s3q0.a;
            }
        }).q(this.n).m(asu0.a.d()), new b(1, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0), null, 2));
    }

    public final void m(izs<? super xl30, xl30> izsVar) {
        this.l.b(io.reactivex.rxjava3.kotlin.c.h(new v(new gdd(2, this, izsVar)).q(this.n).m(asu0.a.d()), new C1150c(1, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0), null, 2));
    }

    public final synchronized xl30 n(izs<? super xl30, xl30> izsVar) {
        m.d dVar;
        try {
            xl30 g = g();
            xl30 invoke = izsVar.invoke(g);
            if (epx.f(g, invoke)) {
                return g;
            }
            if (this.k) {
                List list = g.c;
                if (list == null) {
                    list = EmptyList.b;
                }
                List list2 = invoke.c;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                dVar = m.a(new ll30(list, list2), false);
            } else {
                dVar = null;
            }
            this.f.onNext(new Pair<>(invoke, new a(dVar)));
            return invoke;
        } catch (Throwable th) {
            throw th;
        }
    }
}
