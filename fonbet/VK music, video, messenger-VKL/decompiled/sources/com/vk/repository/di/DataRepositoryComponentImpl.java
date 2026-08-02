package com.vk.repository.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.gxh;
import xsna.pwj0;
import xsna.t6g0;

/* compiled from: DataRepositoryComponentImpl.kt */
/* loaded from: classes11.dex */
public final class DataRepositoryComponentImpl implements DataRepositoryComponent {

    /* compiled from: DataRepositoryComponentImpl.kt */
    public static final class a implements c8m<DataRepositoryComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DataRepositoryComponentImpl();
        }
    }

    @Override // com.vk.repository.data.api.di.DataRepositoryComponent
    public final ExtendedProfilesRepository C() {
        t6g0 t6g0Var = t6g0.b;
        return t6g0.c();
    }

    @Override // com.vk.repository.data.api.di.DataRepositoryComponent
    public final gxh D() {
        t6g0 t6g0Var = t6g0.b;
        return t6g0.b();
    }
}
