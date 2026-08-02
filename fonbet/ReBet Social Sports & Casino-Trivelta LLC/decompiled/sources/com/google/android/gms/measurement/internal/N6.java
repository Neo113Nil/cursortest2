package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class N6 implements a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S6 f33573a;

    public N6(S6 s62) {
        Objects.requireNonNull(s62);
        this.f33573a = s62;
    }

    @Override // com.google.android.gms.measurement.internal.a7
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f33573a.b().t(new M6(this, str, str2, bundle));
            return;
        }
        S6 s62 = this.f33573a;
        if (s62.x0() != null) {
            s62.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
