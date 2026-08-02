package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33492a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33493b;

    /* renamed from: c, reason: collision with root package name */
    public String f33494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L2 f33495d;

    public K2(L2 l22, String str, String str2) {
        Objects.requireNonNull(l22);
        this.f33495d = l22;
        AbstractC3191o.g(str);
        this.f33492a = str;
    }

    public final String a() {
        if (!this.f33493b) {
            this.f33493b = true;
            L2 l22 = this.f33495d;
            this.f33494c = l22.p().getString(this.f33492a, null);
        }
        return this.f33494c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f33495d.p().edit();
        edit.putString(this.f33492a, str);
        edit.apply();
        this.f33494c = str;
    }
}
