package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.joa;
import defpackage.xka;
import defpackage.ypa;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I {

    @NotNull
    private final AbstractC4386x0 a;

    @NotNull
    private final NetworkSettings b;

    @NotNull
    private final joa c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<BaseAdAdapter<?, ?>> {
        final /* synthetic */ T0 a;
        final /* synthetic */ I b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T0 t0, I i) {
            super(0);
            this.a = t0;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.a.a(this.b.e(), this.b.a(), this.b.d());
        }
    }

    public I(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0, @NotNull NetworkSettings networkSettings) {
        t0.getClass();
        abstractC4386x0.getClass();
        networkSettings.getClass();
        this.a = abstractC4386x0;
        this.b = networkSettings;
        this.c = ypa.b(new a(t0, this));
    }

    @NotNull
    public final IronSource.a a() {
        return this.a.b().a();
    }

    @Nullable
    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.c.getValue();
    }

    @NotNull
    public final String c() {
        String providerName = this.b.getProviderName();
        providerName.getClass();
        return providerName;
    }

    @NotNull
    public final UUID d() {
        return this.a.b().b();
    }

    @NotNull
    public final NetworkSettings e() {
        return this.b;
    }
}
