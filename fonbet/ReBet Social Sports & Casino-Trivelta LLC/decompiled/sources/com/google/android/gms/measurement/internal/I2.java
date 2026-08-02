package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class I2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33452b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33453c;

    /* renamed from: d, reason: collision with root package name */
    public long f33454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L2 f33455e;

    public I2(L2 l22, String str, long j10) {
        Objects.requireNonNull(l22);
        this.f33455e = l22;
        AbstractC3191o.g(str);
        this.f33451a = str;
        this.f33452b = j10;
    }

    public final long a() {
        if (!this.f33453c) {
            this.f33453c = true;
            L2 l22 = this.f33455e;
            this.f33454d = l22.p().getLong(this.f33451a, this.f33452b);
        }
        return this.f33454d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f33455e.p().edit();
        edit.putLong(this.f33451a, j10);
        edit.apply();
        this.f33454d = j10;
    }
}
