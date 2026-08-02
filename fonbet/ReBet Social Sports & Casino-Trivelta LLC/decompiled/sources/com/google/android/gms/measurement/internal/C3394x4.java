package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3394x4 implements a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f34385a;

    public C3394x4(W4 w42) {
        Objects.requireNonNull(w42);
        this.f34385a = w42;
    }

    @Override // com.google.android.gms.measurement.internal.a7
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f34385a.p("auto", "_err", bundle);
        } else {
            this.f34385a.w("auto", "_err", bundle, str);
        }
    }
}
