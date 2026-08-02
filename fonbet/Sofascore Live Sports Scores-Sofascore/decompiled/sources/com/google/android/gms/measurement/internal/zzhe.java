package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.lmo;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhe {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ lmo e;

    public zzhe(lmo lmoVar, String str, long j) {
        Objects.requireNonNull(lmoVar);
        this.e = lmoVar;
        Preconditions.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.U().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.U().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
