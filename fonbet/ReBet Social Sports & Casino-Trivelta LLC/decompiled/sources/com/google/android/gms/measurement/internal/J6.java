package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J6 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S6 f33489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6(S6 s62, Q3 q32) {
        super(q32);
        Objects.requireNonNull(s62);
        this.f33489e = s62;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        S6 s62 = this.f33489e;
        s62.b().h();
        String str = (String) s62.y0().pollFirst();
        if (str != null) {
            s62.z0(s62.e().b());
            s62.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            S6.W(s62.d(), intent);
        }
        s62.v0();
    }
}
