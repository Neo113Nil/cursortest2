package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Tg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f12929b;

    public Tg(@NonNull X4 x42, @NonNull IReporter iReporter) {
        super(x42);
        this.f12929b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        Gc gc2 = (Gc) Gc.f12258c.get(p52.f12730d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", gc2.f12259a);
        hashMap.put("delivery_method", gc2.f12260b);
        this.f12929b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
