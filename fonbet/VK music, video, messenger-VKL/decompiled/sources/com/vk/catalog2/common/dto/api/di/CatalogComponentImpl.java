package com.vk.catalog2.common.dto.api.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.c8m;
import xsna.f20;
import xsna.g8m;
import xsna.msy;
import xsna.pwj0;
import xsna.zia;

/* compiled from: CatalogComponentImpl.kt */
/* loaded from: classes16.dex */
public final class CatalogComponentImpl implements CatalogComponent {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new f20(4));

    /* compiled from: CatalogComponentImpl.kt */
    public static final class a implements c8m<CatalogComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CatalogComponentImpl();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.dto.api.di.CatalogComponent
    public final zia Ce() {
        return (zia) this.a.getValue();
    }
}
