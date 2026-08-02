package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4502q0;
import com.ironsource.F0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import xsna.xq70;

/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4299ec extends AbstractC4502q0 {
    public C4299ec(C4484p0 c4484p0, C4317fc c4317fc, InterfaceC4335gc interfaceC4335gc) {
        super(c4484p0, c4317fc, interfaceC4335gc);
        String format;
        int b;
        C4336gd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            b = B0.b(c4317fc.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    @Override // com.ironsource.AbstractC4502q0
    public E a() {
        return new xq70(this, 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(C4299ec c4299ec, C c, I i) {
        return new Wb(new V0(c4299ec.f(), F0.b.PROVIDER), c, i, new AbstractC4502q0.a());
    }
}
