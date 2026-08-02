package com.vk.ecomm.market.good.ui.restriction;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LaunchContext;
import com.vk.ecomm.market.good.ui.restriction.c;
import defpackage.x;
import io.reactivex.rxjava3.internal.operators.single.m;
import io.reactivex.rxjava3.internal.operators.single.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.bhh;
import xsna.c95;
import xsna.ce0;
import xsna.cgc;
import xsna.cvh;
import xsna.dhc;
import xsna.dhh;
import xsna.epx;
import xsna.est;
import xsna.f1j;
import xsna.f40;
import xsna.izs;
import xsna.jai;
import xsna.n430;
import xsna.om1;
import xsna.qdz;
import xsna.qs6;
import xsna.r7u;
import xsna.s3q0;
import xsna.u70;
import xsna.wh50;
import xsna.zak0;

/* compiled from: GoodFragmentRestrictionsBinderImpl.kt */
/* loaded from: classes18.dex */
public final class a {
    public final r7u a;
    public final n430 b;
    public final dhc c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final qdz e;
    public final Context f;
    public final View g;
    public final wh50 h = k.b(null);
    public String i;
    public String j;
    public est k;
    public c95 l;

    /* compiled from: GoodFragmentRestrictionsBinderImpl.kt */
    /* renamed from: com.vk.ecomm.market.good.ui.restriction.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0948a extends FunctionReferenceImpl implements izs<c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(c cVar) {
            c cVar2 = cVar;
            a aVar = (a) this.receiver;
            aVar.getClass();
            if (cVar2 instanceof c.f) {
                est estVar = aVar.k;
                if (estVar != null) {
                    estVar.invoke();
                }
            } else if (cVar2 instanceof c.e) {
                aVar.b(aVar.j);
            } else if (cVar2 instanceof c.d) {
                aVar.c.c(aVar.f, new cgc(null, null, false, null, null, 262143));
            } else if (cVar2 instanceof c.C0951c) {
                aVar.b(aVar.i);
            } else if (cVar2 instanceof c.b) {
                aVar.d.b(new m(new n(aVar.b.a().m(asu0.a.d()), new f40(new bhh(aVar, 21), 23)), new qs6(new u70(aVar, 5), 19)).subscribe(new om1(new dhh(aVar, 20), 24), new x(new f1j(new cvh(aVar, 12), 16), 26)));
            } else {
                if (!(cVar2 instanceof c.g) && !epx.f(cVar2, c.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.a.finish();
            }
            return s3q0.a;
        }
    }

    /* compiled from: GoodFragmentRestrictionsBinderImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((a) this.receiver).b(str);
            return s3q0.a;
        }
    }

    public a(r7u r7uVar, n430 n430Var, dhc dhcVar, io.reactivex.rxjava3.disposables.b bVar, qdz qdzVar, Context context, View view) {
        this.a = r7uVar;
        this.b = n430Var;
        this.c = dhcVar;
        this.d = bVar;
        this.e = qdzVar;
        this.f = context;
        this.g = view;
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.setContent(new jai(618567149, new ce0(this, 4), true));
        } else {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("view is not compose view in compose restriction binder impl"));
        }
    }

    public final ProductCardRestrictionViewState a() {
        return (ProductCardRestrictionViewState) ((zak0) this.h).getValue();
    }

    public final void b(String str) {
        if (str != null) {
            this.e.e().l(this.f, str, LaunchContext.A, null, null);
        }
    }

    public final void c(ProductCardRestrictionViewState productCardRestrictionViewState) {
        ((zak0) this.h).setValue(productCardRestrictionViewState);
    }
}
