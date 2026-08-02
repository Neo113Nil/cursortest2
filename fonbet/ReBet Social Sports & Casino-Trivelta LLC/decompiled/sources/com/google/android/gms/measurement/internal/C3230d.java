package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3230d extends AbstractC3222c {

    /* renamed from: g, reason: collision with root package name */
    public final zzfn f33973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3238e f33974h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3230d(C3238e c3238e, String str, int i10, zzfn zzfnVar) {
        super(str, i10);
        Objects.requireNonNull(c3238e);
        this.f33974h = c3238e;
        this.f33973g = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3222c
    public final int a() {
        return this.f33973g.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3222c
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3222c
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, zziu zziuVar, boolean z10) {
        zzpu.zza();
        C3298l3 c3298l3 = this.f33974h.f33578a;
        boolean H10 = c3298l3.w().H(this.f33949a, AbstractC3209a2.f33809E0);
        zzfn zzfnVar = this.f33973g;
        boolean zze = zzfnVar.zze();
        boolean zzf = zzfnVar.zzf();
        boolean zzh = zzfnVar.zzh();
        Object[] objArr = zze || zzf || zzh;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && objArr != true) {
            c3298l3.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f33950b), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        zzfh zzd = zzfnVar.zzd();
        boolean zzf2 = zzd.zzf();
        if (zziuVar.zzf()) {
            if (zzd.zzc()) {
                bool = AbstractC3222c.e(AbstractC3222c.g(zziuVar.zzg(), zzd.zzd()), zzf2);
            } else {
                c3298l3.a().r().b("No number filter for long property. property", c3298l3.D().c(zziuVar.zzc()));
            }
        } else if (zziuVar.zzj()) {
            if (zzd.zzc()) {
                bool = AbstractC3222c.e(AbstractC3222c.h(zziuVar.zzk(), zzd.zzd()), zzf2);
            } else {
                c3298l3.a().r().b("No number filter for double property. property", c3298l3.D().c(zziuVar.zzc()));
            }
        } else if (!zziuVar.zzd()) {
            c3298l3.a().r().b("User property has no value, property", c3298l3.D().c(zziuVar.zzc()));
        } else if (zzd.zza()) {
            bool = AbstractC3222c.e(AbstractC3222c.f(zziuVar.zze(), zzd.zzb(), c3298l3.a()), zzf2);
        } else if (!zzd.zzc()) {
            c3298l3.a().r().b("No string or number filter defined. property", c3298l3.D().c(zziuVar.zzc()));
        } else if (X6.O(zziuVar.zze())) {
            bool = AbstractC3222c.e(AbstractC3222c.i(zziuVar.zze(), zzd.zzd()), zzf2);
        } else {
            c3298l3.a().r().c("Invalid user property value for Numeric number filter. property, value", c3298l3.D().c(zziuVar.zzc()), zziuVar.zze());
        }
        c3298l3.a().w().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f33951c = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || zzfnVar.zze()) {
            this.f33952d = bool;
        }
        if (bool.booleanValue() && objArr != false && zziuVar.zza()) {
            long zzb = zziuVar.zzb();
            if (l10 != null) {
                zzb = l10.longValue();
            }
            if (H10 && zzfnVar.zze() && !zzfnVar.zzf() && l11 != null) {
                zzb = l11.longValue();
            }
            if (zzfnVar.zzf()) {
                this.f33954f = Long.valueOf(zzb);
            } else {
                this.f33953e = Long.valueOf(zzb);
            }
        }
        return true;
    }
}
