package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4261q0;
import com.ironsource.E0;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.bnk;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4040dc extends AbstractC4261q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4040dc(@NotNull C4243p0 c4243p0, @NotNull C4058ec c4058ec, @NotNull InterfaceC4076fc interfaceC4076fc) {
        super(c4243p0, c4058ec, interfaceC4076fc);
        String format;
        int b;
        c4243p0.getClass();
        c4058ec.getClass();
        interfaceC4076fc.getClass();
        C4077fd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            b = A0.b(c4058ec.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(C4040dc c4040dc, C c, I i) {
        c4040dc.getClass();
        c.getClass();
        i.getClass();
        return new Vb(new T0(c4040dc.f(), E0.b.PROVIDER), c, i, new AbstractC4261q0.a());
    }

    @Override // com.ironsource.AbstractC4261q0
    @NotNull
    public E a() {
        return new bnk(this, 11);
    }
}
