package com.vk.superapp.sessionmanagment.impl.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.dr4;
import xsna.er4;
import xsna.f53;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.mui0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.sxi0;

/* compiled from: SessionManagementComponentImpl.kt */
/* loaded from: classes11.dex */
public final class SessionManagementComponentImpl implements SessionManagementComponent {
    public static final /* synthetic */ qcy<Object>[] k = {new PropertyReference1Impl(SessionManagementComponentImpl.class, "readOnlyRepository", "getReadOnlyRepository()Lcom/vk/superapp/sessionmanagment/api/domain/repository/SessionReadOnlyRepository;", 0), fp.c(0, SessionManagementComponentImpl.class, "writeOnlyRepository", "getWriteOnlyRepository()Lcom/vk/superapp/sessionmanagment/api/domain/repository/SessionWriteOnlyRepository;", fpf0.a)};
    public final Context a;
    public final StatInteractorComponent b;
    public final gzs<Executor> c;
    public final gzs<Executor> d;
    public final gzs<ExecutorService> e;
    public final gzs<Boolean> f;
    public final gzs<Boolean> g;
    public final bpn0 h = new bpn0(new dr4(this, 7));
    public final nwy i = new nwy(new f53(this, 10));
    public final nwy j = new nwy(new er4(this, 4));

    /* compiled from: SessionManagementComponentImpl.kt */
    public static final class a implements c8m<SessionManagementComponent, pwj0> {
        public final Context a;
        public final gzs<Executor> b;
        public final gzs<Executor> c;
        public final gzs<ExecutorService> d;
        public final gzs<Boolean> e;
        public final gzs<Boolean> f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, gzs<? extends Executor> gzsVar, gzs<? extends Executor> gzsVar2, gzs<? extends ExecutorService> gzsVar3, gzs<Boolean> gzsVar4, gzs<Boolean> gzsVar5) {
            this.a = context;
            this.b = gzsVar;
            this.c = gzsVar2;
            this.d = gzsVar3;
            this.e = gzsVar4;
            this.f = gzsVar5;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SessionManagementComponentImpl(this.a, (StatInteractorComponent) g8mVar.a(fpf0.a(StatInteractorComponent.class)), this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionManagementComponentImpl(Context context, StatInteractorComponent statInteractorComponent, gzs<? extends Executor> gzsVar, gzs<? extends Executor> gzsVar2, gzs<? extends ExecutorService> gzsVar3, gzs<Boolean> gzsVar4, gzs<Boolean> gzsVar5) {
        this.a = context;
        this.b = statInteractorComponent;
        this.c = gzsVar;
        this.d = gzsVar2;
        this.e = gzsVar3;
        this.f = gzsVar4;
        this.g = gzsVar5;
    }

    @Override // com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent
    public final sxi0 B2() {
        qcy<Object> qcyVar = k[1];
        return (sxi0) this.j.c();
    }

    @Override // com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent
    public final mui0 J2() {
        qcy<Object> qcyVar = k[0];
        return (mui0) this.i.c();
    }
}
