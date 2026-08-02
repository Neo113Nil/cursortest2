package com.vk.accountmanager.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ap;
import xsna.bp;
import xsna.bpn0;
import xsna.c8m;
import xsna.cp;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.kp;
import xsna.mp;
import xsna.nwy;
import xsna.pon0;
import xsna.pwj0;
import xsna.qcy;
import xsna.xcu0;

/* compiled from: AccountManagerComponentImpl.kt */
/* loaded from: classes.dex */
public final class AccountManagerComponentImpl implements AccountManagerComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final Context a;
    public final pon0 b;
    public final kp c;
    public final Lazy<StatInteractorComponent> d;
    public final nwy e = new nwy(new ap(this, 0));
    public final nwy f = new nwy(new bp(this, 0));
    public final nwy g = new nwy(new cp(this, 0));

    /* compiled from: AccountManagerComponentImpl.kt */
    public static final class a implements c8m<AccountManagerComponent, pwj0> {
        public final Context a;
        public final pon0 b;
        public final kp c;
        public final Lazy<StatInteractorComponent> d;

        public a(Context context, pon0 pon0Var, kp kpVar, bpn0 bpn0Var) {
            this.a = context;
            this.b = pon0Var;
            this.c = kpVar;
            this.d = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AccountManagerComponentImpl(this.a, this.b, this.c, this.d);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AccountManagerComponentImpl.class, "repository", "getRepository()Lcom/vk/accountmanager/domain/AccountManagerRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, AccountManagerComponentImpl.class, "syncManager", "getSyncManager()Lcom/vk/accountmanager/domain/VkAuthSyncManager;", hpf0Var), ep.a(0, AccountManagerComponentImpl.class, "interactor", "getInteractor()Lcom/vk/accountmanager/domain/AccountManagerInteractor;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountManagerComponentImpl(Context context, pon0 pon0Var, kp kpVar, Lazy<? extends StatInteractorComponent> lazy) {
        this.a = context;
        this.b = pon0Var;
        this.c = kpVar;
        this.d = lazy;
    }

    @Override // com.vk.accountmanager.di.AccountManagerComponent
    public final xcu0 Kd() {
        qcy<Object> qcyVar = h[1];
        return (xcu0) this.f.c();
    }

    @Override // com.vk.accountmanager.di.AccountManagerComponent
    public final kp b() {
        qcy<Object> qcyVar = h[2];
        return (kp) this.g.c();
    }

    @Override // com.vk.accountmanager.di.AccountManagerComponent
    public final mp c() {
        qcy<Object> qcyVar = h[0];
        return (mp) this.e.c();
    }
}
