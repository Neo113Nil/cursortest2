package com.vk.billing;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.vk.billing.StorePurchasesManager;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.ang;
import xsna.c5g;
import xsna.e43;
import xsna.h7u0;
import xsna.iil0;
import xsna.ivz;
import xsna.jx2;
import xsna.ki4;
import xsna.mge0;
import xsna.nge0;
import xsna.o25;
import xsna.q76;
import xsna.uc00;
import xsna.um0;

/* compiled from: InternalPurchasesManagerImpl.kt */
/* loaded from: classes.dex */
public final class f implements d {

    /* compiled from: InternalPurchasesManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final class a extends q76 {
        public final /* synthetic */ Activity c;
        public final /* synthetic */ StorePurchasesManager.a<mge0> d;
        public final /* synthetic */ mge0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, StorePurchasesManager.a<mge0> aVar, mge0 mge0Var) {
            super(activity);
            this.c = activity;
            this.d = aVar;
            this.e = mge0Var;
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            nge0 nge0Var = (nge0) obj;
            String str = nge0Var.f;
            String str2 = nge0Var.e;
            if (str2.length() > 0 || str.length() > 0) {
                int i = h7u0.p;
                h7u0.a a = h7u0.b.a(this.c);
                a.g0(R.string.error);
                if (str2.length() != 0) {
                    str = str2;
                }
                a.a.f = str;
                a.c0(R.string.ok, null);
                a.m();
            }
            int i2 = nge0Var.a;
            mge0 mge0Var = this.e;
            StorePurchasesManager.a<mge0> aVar = this.d;
            if (i2 == 1 || nge0Var.h == 1) {
                aVar.c(mge0Var, nge0Var);
            } else if (nge0Var.l != null) {
                aVar.c(mge0Var, nge0Var);
            }
        }
    }

    /* JADX WARN: Incorrect field signature: TD; */
    /* compiled from: InternalPurchasesManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final class b extends q76 {
        public final /* synthetic */ Activity c;
        public final /* synthetic */ StorePurchasesManager.a<D> d;
        public final /* synthetic */ mge0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Landroid/app/Activity;Lcom/vk/billing/StorePurchasesManager$a<TD;>;TD;)V */
        public b(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
            super(activity);
            this.c = activity;
            this.d = aVar;
            this.e = mge0Var;
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            nge0 nge0Var = (nge0) obj;
            String str = nge0Var.f;
            String str2 = nge0Var.e;
            if (str2.length() > 0 || str.length() > 0) {
                if (str2.length() != 0) {
                    str = str2;
                }
                int i = h7u0.p;
                h7u0.a a = h7u0.b.a(this.c);
                a.g0(R.string.error);
                a.a.f = str;
                a.c0(R.string.ok, null);
                a.m();
            }
            int i2 = nge0Var.a;
            mge0 mge0Var = this.e;
            StorePurchasesManager.a<D> aVar = this.d;
            if (i2 == 1) {
                if (aVar != 0) {
                    aVar.c(mge0Var, nge0Var);
                }
            } else {
                if (nge0Var.l == null || aVar == 0) {
                    return;
                }
                aVar.c(mge0Var, nge0Var);
            }
        }
    }

    @Override // com.vk.billing.d
    public final io.reactivex.rxjava3.disposables.c i(Activity activity, ArrayList arrayList, ang.a aVar, Boolean bool, Boolean bool2) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((mge0) it.next()).getId()));
        }
        jx2 jx2Var = new jx2(new iil0(arrayList2, ((mge0) arrayList.get(0)).getType(), ((mge0) arrayList.get(0)).n(), o25.a().h(), bool, bool2, ((mge0) arrayList.get(0)).D8(), null, 3184), new e(activity, arrayList, aVar));
        jx2Var.c(activity);
        return jx2Var.a();
    }

    @Override // com.vk.billing.d
    @SuppressLint({"CheckResult"})
    public final io.reactivex.rxjava3.disposables.c j(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        uc00 uc00Var = uc00.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new v(new ivz(context, 1)).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new um0(new ki4(mge0Var, activity, aVar, 3), 27));
    }

    @Override // com.vk.billing.d
    public final <D extends mge0> io.reactivex.rxjava3.disposables.c k(Activity activity, D d, StorePurchasesManager.a<D> aVar, Boolean bool, Boolean bool2) {
        jx2 jx2Var = new jx2(new iil0(Collections.singletonList(Integer.valueOf(d.getId())), d.getType(), d.n(), o25.a().h(), bool, bool2, d.D8(), null, 3184), new b(activity, aVar, d));
        jx2Var.c(activity);
        return jx2Var.a();
    }
}
