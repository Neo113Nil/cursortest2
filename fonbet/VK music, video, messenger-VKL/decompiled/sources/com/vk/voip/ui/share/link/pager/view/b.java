package com.vk.voip.ui.share.link.pager.view;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vk.voip.ui.share.link.pager.view.a;
import com.vk.voip.ui.share.link.pager.view.c;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.asu0;
import xsna.epx;
import xsna.gfv0;
import xsna.h1x0;
import xsna.izs;
import xsna.m1x0;
import xsna.r1x0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sg20;
import xsna.tdk0;
import xsna.vg20;
import xsna.xau0;
import xsna.yfb;
import xsna.zk70;

/* compiled from: VoipShareLinkPagerDelegate.kt */
/* loaded from: classes7.dex */
public final class b {
    public final CallId a;
    public final String b;
    public final VoipShareLinkPagerState.TypeControl c;
    public final vg20 d;
    public final izs<String, s3q0> e;
    public c f;
    public a g;
    public final f<com.vk.voip.ui.share.link.pager.view.a> h = new f<>();
    public final f<VoipShareLinkPagerState> i = new f<>();
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();
    public final f<h1x0.a> k = new f<>();

    /* compiled from: VoipShareLinkPagerDelegate.kt */
    public static final class a {
        public final c.a a;
        public final c.b b;

        public a(c.a aVar, c.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            c.b bVar = this.b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "Links(long=" + this.a + ", shortWithPassword=" + this.b + ')';
        }
    }

    public b(CallId callId, String str, VoipShareLinkPagerState.TypeControl typeControl, vg20 vg20Var, izs izsVar) {
        this.a = callId;
        this.b = str;
        this.c = typeControl;
        this.d = vg20Var;
        this.e = izsVar;
        b(false);
    }

    public final void a(com.vk.voip.ui.share.link.pager.view.a aVar) {
        this.h.onNext(aVar);
        if (aVar instanceof a.C2091a) {
            c cVar = this.f;
            c cVar2 = ((a.C2091a) aVar).a;
            if (epx.f(cVar, cVar2)) {
                return;
            }
            this.f = cVar2;
            c();
            return;
        }
        if (aVar instanceof a.c) {
            if (this.f instanceof c.b) {
                this.k.onNext(h1x0.a.b.a);
            }
            this.e.invoke(((a.c) aVar).a);
            return;
        }
        if (aVar instanceof a.b) {
            b(true);
        } else if (!(aVar instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void b(boolean z) {
        vg20 vg20Var = this.d;
        io.reactivex.rxjava3.disposables.b bVar = this.j;
        String str = this.b;
        if (str != null && !z) {
            bVar.b(io.reactivex.rxjava3.kotlin.c.e(rsg0.w0(yfb.x(sg20.q(vg20Var, str, null, null, 62))).m(asu0.a.d()), new tdk0(11), new gfv0(this, 8)));
            return;
        }
        try {
            bVar.b(io.reactivex.rxjava3.kotlin.c.e(rsg0.w0(yfb.x(sg20.f(vg20Var, this.a.b, Boolean.valueOf(z), null, 4))).m(asu0.a.d()), new m1x0(0), new xau0(this, 11)));
        } catch (Exception e) {
            L.C("VoipShareLinkPagerDelegate", e);
            zk70.e(e);
            if (BuildInfo.h()) {
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        c.b bVar;
        a aVar = this.g;
        if (aVar != null) {
            c.b bVar2 = aVar.b;
            c.a aVar2 = aVar.a;
            c cVar = this.f;
            if (cVar != null && !(cVar instanceof c.a)) {
                if (!(cVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bVar2 != null) {
                    bVar = bVar2;
                    this.f = bVar;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new r1x0(aVar2, aVar2.equals(bVar)));
                    if (bVar2 != null) {
                        arrayList.add(new r1x0(bVar2, bVar2.equals(bVar)));
                    }
                    this.i.onNext(new VoipShareLinkPagerState(bVar, arrayList, this.c));
                }
            }
            bVar = aVar2;
            this.f = bVar;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new r1x0(aVar2, aVar2.equals(bVar)));
            if (bVar2 != null) {
            }
            this.i.onNext(new VoipShareLinkPagerState(bVar, arrayList2, this.c));
        }
    }
}
