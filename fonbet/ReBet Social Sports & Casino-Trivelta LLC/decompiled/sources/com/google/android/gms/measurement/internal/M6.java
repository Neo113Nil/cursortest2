package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class M6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f33559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N6 f33560d;

    public M6(N6 n62, String str, String str2, Bundle bundle) {
        this.f33557a = str;
        this.f33558b = str2;
        this.f33559c = bundle;
        Objects.requireNonNull(n62);
        this.f33560d = n62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S6 s62 = this.f33560d.f33573a;
        b7 N02 = s62.N0();
        long a10 = s62.e().a();
        String str = this.f33557a;
        s62.i((zzbg) AbstractC3191o.m(N02.R(str, this.f33558b, this.f33559c, "auto", a10, false, true)), str);
    }
}
