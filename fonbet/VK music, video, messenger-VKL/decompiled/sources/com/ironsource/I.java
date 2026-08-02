package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;

/* loaded from: classes13.dex */
public final class I {
    private final AbstractC4627x0 a;
    private final NetworkSettings b;
    private final Lazy c;

    public static final class a extends Lambda implements gzs<BaseAdAdapter<?, ?>> {
        final /* synthetic */ V0 a;
        final /* synthetic */ I b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V0 v0, I i) {
            super(0);
            this.a = v0;
            this.b = i;
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.a.a(this.b.e(), this.b.a(), this.b.d());
        }
    }

    public I(V0 v0, AbstractC4627x0 abstractC4627x0, NetworkSettings networkSettings) {
        this.a = abstractC4627x0;
        this.b = networkSettings;
        this.c = new bpn0(new a(v0, this));
    }

    public final IronSource.a a() {
        return this.a.b().a();
    }

    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.c.getValue();
    }

    public final String c() {
        return this.b.getProviderName();
    }

    public final UUID d() {
        return this.a.b().b();
    }

    public final NetworkSettings e() {
        return this.b;
    }
}
