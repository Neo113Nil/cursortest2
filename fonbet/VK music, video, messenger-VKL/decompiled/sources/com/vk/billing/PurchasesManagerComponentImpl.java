package com.vk.billing;

import android.content.Context;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.billing.PurchasesManagerComponentImpl;
import com.vk.billing.SberpayPurchasesManager;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.nwy;
import xsna.oge0;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: PurchasesManagerComponentImpl.kt */
/* loaded from: classes.dex */
public final class PurchasesManagerComponentImpl implements PurchasesManagerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: PurchasesManagerComponentImpl.kt */
    public static final class a implements c8m<PurchasesManagerComponent, pwj0> {
        public final bpn0 a;
        public final bpn0 b;

        public a(bpn0 bpn0Var, bpn0 bpn0Var2) {
            this.a = bpn0Var;
            this.b = bpn0Var2;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PurchasesManagerComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), this.a, this.b);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PurchasesManagerComponentImpl.class, "purchasesManager", "getPurchasesManager()Lcom/vk/billing/PurchasesManager;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public PurchasesManagerComponentImpl(final AppContextDiComponent appContextDiComponent, final bpn0 bpn0Var, final bpn0 bpn0Var2) {
        this.a = new nwy(new gzs() { // from class: xsna.pge0
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = PurchasesManagerComponentImpl.b;
                Context context = AppContextDiComponent.this.a;
                bpn0 bpn0Var3 = bpn0Var;
                return new com.vk.billing.g(new GoogleStorePurchasesManagerImpl(context, (com.vk.billing.d) bpn0Var3.getValue()), (com.vk.billing.d) bpn0Var3.getValue(), (SberpayPurchasesManager) bpn0Var2.getValue());
            }
        });
    }

    @Override // com.vk.billing.PurchasesManagerComponent
    public final oge0 J7() {
        qcy<Object> qcyVar = b[0];
        return (oge0) this.a.c();
    }
}
