package com.vk.nspk.di;

import android.content.Context;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.ib8;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: NspkSearchBanksFeatureInnerComponent.kt */
/* loaded from: classes.dex */
public final class NspkSearchBanksFeatureInnerComponent implements DiScopedComponent<pwj0> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final Context a;
    public final CacheComponent b;
    public final nwy c = new nwy(new ib8(this, 8));

    /* compiled from: NspkSearchBanksFeatureInnerComponent.kt */
    public static final class a implements c8m<NspkSearchBanksFeatureInnerComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NspkSearchBanksFeatureInnerComponent(this.a, (CacheComponent) g8mVar.a(fpf0.a(CacheComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NspkSearchBanksFeatureInnerComponent.class, "cache", "getCache()Lcom/vk/nspk/NspkListCache;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public NspkSearchBanksFeatureInnerComponent(Context context, CacheComponent cacheComponent) {
        this.a = context;
        this.b = cacheComponent;
    }
}
