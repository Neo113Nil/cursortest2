package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vc implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13033a;

    /* renamed from: b, reason: collision with root package name */
    public final C0277k9 f13034b;

    /* renamed from: c, reason: collision with root package name */
    public final P5 f13035c;

    public Vc(boolean z5, @NotNull C0277k9 c0277k9, @NotNull P5 p52) {
        this.f13033a = z5;
        this.f13034b = c0277k9;
        this.f13035c = p52;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f13033a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        P5 d10 = P5.d(this.f13035c);
        d10.f12730d = counterReportApi.getType();
        d10.f12731e = counterReportApi.getCustomType();
        d10.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d10.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d10.setValueBytes(valueBytes);
        }
        d10.f12733g = counterReportApi.getBytesTruncated();
        C0277k9 c0277k9 = this.f13034b;
        c0277k9.a(d10, Rk.a(c0277k9.f14108c.b(d10), d10.f12735i));
    }
}
