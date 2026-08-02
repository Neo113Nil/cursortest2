package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class G2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33411a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33412b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33413c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L2 f33415e;

    public G2(L2 l22, String str, boolean z10) {
        Objects.requireNonNull(l22);
        this.f33415e = l22;
        AbstractC3191o.g(str);
        this.f33411a = str;
        this.f33412b = z10;
    }

    public final boolean a() {
        if (!this.f33413c) {
            this.f33413c = true;
            L2 l22 = this.f33415e;
            this.f33414d = l22.p().getBoolean(this.f33411a, this.f33412b);
        }
        return this.f33414d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor edit = this.f33415e.p().edit();
        edit.putBoolean(this.f33411a, z10);
        edit.apply();
        this.f33414d = z10;
    }
}
