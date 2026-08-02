package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    public zzid f33582a;

    /* renamed from: b, reason: collision with root package name */
    public List f33583b;

    /* renamed from: c, reason: collision with root package name */
    public List f33584c;

    /* renamed from: d, reason: collision with root package name */
    public long f33585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S6 f33586e;

    public /* synthetic */ O6(S6 s62, byte[] bArr) {
        Objects.requireNonNull(s62);
        this.f33586e = s62;
    }

    public static final long b(zzhs zzhsVar) {
        return ((zzhsVar.zzf() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, zzhs zzhsVar) {
        AbstractC3191o.m(zzhsVar);
        if (this.f33584c == null) {
            this.f33584c = new ArrayList();
        }
        if (this.f33583b == null) {
            this.f33583b = new ArrayList();
        }
        if (!this.f33584c.isEmpty() && b((zzhs) this.f33584c.get(0)) != b(zzhsVar)) {
            return false;
        }
        long zzcn = this.f33585d + zzhsVar.zzcn();
        S6 s62 = this.f33586e;
        if (!s62.B0().H(null, AbstractC3209a2.f33866e1)) {
            s62.B0();
            if (zzcn >= C3286k.o()) {
                return false;
            }
        } else if (!this.f33584c.isEmpty()) {
            s62.B0();
            if (zzcn >= C3286k.o()) {
                return false;
            }
        }
        this.f33585d = zzcn;
        this.f33584c.add(zzhsVar);
        this.f33583b.add(Long.valueOf(j10));
        int size = this.f33584c.size();
        s62.B0();
        return size < Math.max(1, ((Integer) AbstractC3209a2.f33882k.b(null)).intValue());
    }
}
