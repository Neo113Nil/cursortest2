package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class J2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33474c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L2 f33476e;

    public /* synthetic */ J2(L2 l22, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(l22);
        this.f33476e = l22;
        AbstractC3191o.g("health_monitor");
        AbstractC3191o.a(j10 > 0);
        this.f33472a = "health_monitor:start";
        this.f33473b = "health_monitor:count";
        this.f33474c = "health_monitor:value";
        this.f33475d = j10;
    }

    public final void a(String str, long j10) {
        L2 l22 = this.f33476e;
        l22.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences p10 = l22.p();
        String str2 = this.f33473b;
        long j11 = p10.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = l22.p().edit();
            edit.putString(this.f33474c, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = l22.f33578a.C().q0().nextLong() & LongCompanionObject.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = LongCompanionObject.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = l22.p().edit();
        if (nextLong < j13) {
            edit2.putString(this.f33474c, str);
        }
        edit2.putLong(str2, j12);
        edit2.apply();
    }

    public final Pair b() {
        long abs;
        L2 l22 = this.f33476e;
        l22.h();
        l22.h();
        long d10 = d();
        if (d10 == 0) {
            c();
            abs = 0;
        } else {
            abs = Math.abs(d10 - l22.f33578a.e().a());
        }
        long j10 = this.f33475d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            c();
            return null;
        }
        String string = l22.p().getString(this.f33474c, null);
        long j11 = l22.p().getLong(this.f33473b, 0L);
        c();
        return (string == null || j11 <= 0) ? L2.f33512A : new Pair(string, Long.valueOf(j11));
    }

    public final void c() {
        L2 l22 = this.f33476e;
        l22.h();
        long a10 = l22.f33578a.e().a();
        SharedPreferences.Editor edit = l22.p().edit();
        edit.remove(this.f33473b);
        edit.remove(this.f33474c);
        edit.putLong(this.f33472a, a10);
        edit.apply();
    }

    public final long d() {
        return this.f33476e.p().getLong(this.f33472a, 0L);
    }
}
