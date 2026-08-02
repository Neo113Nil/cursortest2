package com.vk.trustedhash.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.er4;
import xsna.fpf0;
import xsna.g8m;
import xsna.hsp0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: TrustedHashComponentImpl.kt */
/* loaded from: classes11.dex */
public final class TrustedHashComponentImpl implements TrustedHashComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: TrustedHashComponentImpl.kt */
    public static final class a implements c8m<TrustedHashComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new TrustedHashComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(TrustedHashComponentImpl.class, "repository", "getRepository()Lcom/vk/trustedhash/domain/TrustedHashRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public TrustedHashComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = new nwy(new er4(appContextDiComponent, 7));
    }

    @Override // com.vk.trustedhash.di.TrustedHashComponent
    public final hsp0 c() {
        qcy<Object> qcyVar = b[0];
        return (hsp0) this.a.c();
    }
}
