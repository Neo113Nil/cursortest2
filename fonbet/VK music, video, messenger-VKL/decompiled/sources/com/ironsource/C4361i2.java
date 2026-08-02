package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4361i2 {
    private final AbstractC4627x0 a;
    private final Map<String, Object> b = new HashMap();
    private final List<String> c = new ArrayList();
    private final StringBuilder d = new StringBuilder();
    private B e;

    public C4361i2(AbstractC4627x0 abstractC4627x0) {
        this.a = abstractC4627x0;
    }

    public final Map<String, Object> a() {
        return this.b;
    }

    public final List<String> b() {
        return this.c;
    }

    public final B c() {
        return this.e;
    }

    public final StringBuilder d() {
        return this.d;
    }

    public final boolean e() {
        return (this.e == null && this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final void a(B b) {
        this.e = b;
        if (b != null) {
            StringBuilder sb = this.d;
            sb.append(b.r());
            sb.append(b.p());
            sb.append(StringUtils.COMMA);
        }
    }

    public final void a(NetworkSettings networkSettings) {
        this.c.add(networkSettings.getProviderInstanceName());
        StringBuilder sb = this.d;
        sb.append(networkSettings.getInstanceType(this.a.b().a()));
        sb.append(networkSettings.getProviderInstanceName());
        sb.append(StringUtils.COMMA);
    }

    public final void a(NetworkSettings networkSettings, Map<String, ? extends Object> map) {
        a(networkSettings.getProviderInstanceName(), networkSettings.getInstanceType(this.a.b().a()), map);
    }

    public final void a(C4576u3 c4576u3) {
        a(c4576u3.c(), c4576u3.d(), c4576u3.a());
    }

    private final void a(String str, int i, Map<String, ? extends Object> map) {
        this.b.put(str, map);
        StringBuilder sb = this.d;
        sb.append(i);
        sb.append(str);
        sb.append(StringUtils.COMMA);
    }
}
