package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final String f33261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33262b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33263c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33264d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33265e;

    /* renamed from: f, reason: collision with root package name */
    public final zzbe f33266f;

    public A(C3298l3 c3298l3, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzbe zzbeVar;
        AbstractC3191o.g(str2);
        AbstractC3191o.g(str3);
        this.f33261a = str2;
        this.f33262b = str3;
        this.f33263c = true == TextUtils.isEmpty(str) ? null : str;
        this.f33264d = j10;
        this.f33265e = j11;
        if (j11 != 0 && j11 > j10) {
            c3298l3.a().r().b("Event created with reverse previous/current timestamps. appId", C3392x2.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c3298l3.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s10 = c3298l3.C().s(next, bundle2.get(next));
                    if (s10 == null) {
                        c3298l3.a().r().b("Param value can't be null", c3298l3.D().b(next));
                        it.remove();
                    } else {
                        c3298l3.C().A(bundle2, next, s10);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f33266f = zzbeVar;
    }

    public final A a(C3298l3 c3298l3, long j10) {
        return new A(c3298l3, this.f33263c, this.f33261a, this.f33262b, this.f33264d, j10, this.f33266f);
    }

    public final String toString() {
        String obj = this.f33266f.toString();
        String str = this.f33261a;
        int length = String.valueOf(str).length();
        String str2 = this.f33262b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + obj.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }

    public A(C3298l3 c3298l3, String str, String str2, String str3, long j10, long j11, zzbe zzbeVar) {
        AbstractC3191o.g(str2);
        AbstractC3191o.g(str3);
        AbstractC3191o.m(zzbeVar);
        this.f33261a = str2;
        this.f33262b = str3;
        this.f33263c = true == TextUtils.isEmpty(str) ? null : str;
        this.f33264d = j10;
        this.f33265e = j11;
        if (j11 != 0 && j11 > j10) {
            c3298l3.a().r().c("Event created with reverse previous/current timestamps. appId, name", C3392x2.x(str2), C3392x2.x(str3));
        }
        this.f33266f = zzbeVar;
    }
}
