package com.vk.vmoji.storage.impl.di.component;

import android.content.Context;
import com.ironsource.X3;
import com.vk.di.component.DiScopedComponent;
import com.vk.vmoji.storage.api.di.component.VmojiStorageComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.gbw0;
import xsna.iml0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: VmojiStorageComponentImpl.kt */
/* loaded from: classes7.dex */
public final class VmojiStorageComponentImpl implements VmojiStorageComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final Context a;
    public final nwy b = new nwy(new iml0(this, 27));

    /* compiled from: VmojiStorageComponentImpl.kt */
    public static final class a implements c8m<VmojiStorageComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VmojiStorageComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VmojiStorageComponentImpl.class, X3.a.k, "getStorage()Lcom/vk/vmoji/storage/api/VmojiStorage;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public VmojiStorageComponentImpl(Context context) {
        this.a = context;
    }

    @Override // com.vk.vmoji.storage.api.di.component.VmojiStorageComponent
    public final gbw0 H() {
        qcy<Object> qcyVar = c[0];
        return (gbw0) this.b.c();
    }
}
