package com.vk.auth.ui.consent;

import android.content.Context;
import com.vk.auth.main.TermsLink;
import com.vk.auth.ui.consent.g;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bnu0;
import xsna.c5g;
import xsna.ctb;
import xsna.ece0;
import xsna.epx;
import xsna.f0j0;
import xsna.gqe0;
import xsna.gzs;
import xsna.h4f0;
import xsna.izs;
import xsna.j5g;
import xsna.j720;
import xsna.n7b0;
import xsna.q1z;
import xsna.r55;
import xsna.umu0;
import xsna.wo40;
import xsna.yvq0;

/* compiled from: VkConsentScreenPresenter.kt */
/* loaded from: classes15.dex */
public final class i implements bnu0 {
    public final VkConsentView a;
    public g b;
    public io.reactivex.rxjava3.disposables.c c;
    public q1z d;
    public Object e;
    public boolean f;

    public i(Context context, VkConsentView vkConsentView) {
        this.a = vkConsentView;
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        (umu0Var == null ? null : umu0Var).getClass();
        g.h.getClass();
        this.b = g.i;
        q1z q1zVar = new q1z(context);
        this.d = q1zVar;
        this.e = EmptyList.b;
        g gVar = this.b;
        izs<String, String> izsVar = gVar.d;
        izs<String, String> izsVar2 = gVar.e;
        gzs<List<TermsLink>> gzsVar = gVar.f;
        q1zVar.b = izsVar;
        q1zVar.c = izsVar2;
        if (gzsVar != null) {
            q1zVar.d = gzsVar;
        }
        if (this.f) {
            vkConsentView.c(gVar.a, gVar.b, gVar.g, gzsVar);
            d();
        }
    }

    @Override // xsna.bnu0
    public final void a(String str) {
        this.d.a(str);
    }

    public final void b(q<List<VkAuthAppScope>> qVar) {
        if (this.f) {
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            this.c = new c0(qVar.U(new f0j0(new wo40(25), 10)), new h4f0(new gqe0(this, 29), 18), io.reactivex.rxjava3.internal.functions.a.c).G(new ctb(this, 2)).subscribe(new yvq0(new ece0(this, 27), 2), new j720(new n7b0(this, 27), 18));
        }
    }

    public final void c(c cVar) {
        g.b bVar = cVar.a;
        Iterable<c> iterable = (Iterable) this.e;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (c cVar2 : iterable) {
            arrayList.add(new c(cVar2.a, epx.f(cVar2.a, bVar)));
        }
        this.e = arrayList;
        VkConsentView vkConsentView = this.a;
        vkConsentView.b(arrayList);
        bVar.getClass();
        vkConsentView.setConsentDescription(null);
        b(bVar.b.invoke());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void d() {
        List<g.b> list = this.b.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((g.b) it.next(), false));
        }
        this.e = arrayList;
        VkConsentView vkConsentView = this.a;
        vkConsentView.b(arrayList);
        if (this.e.size() > 1) {
            vkConsentView.e.setVisibility(0);
            vkConsentView.f.setVisibility(0);
        }
        c cVar = (c) j5g.a0(this.e);
        if (cVar != null) {
            c(cVar);
        } else {
            vkConsentView.g0();
        }
    }
}
