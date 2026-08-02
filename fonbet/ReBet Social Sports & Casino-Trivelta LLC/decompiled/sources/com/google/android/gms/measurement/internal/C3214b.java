package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import z.C6900a;

/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3214b extends AbstractC3222c {

    /* renamed from: g, reason: collision with root package name */
    public final zzff f33926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3238e f33927h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3214b(C3238e c3238e, String str, int i10, zzff zzffVar) {
        super(str, i10);
        Objects.requireNonNull(c3238e);
        this.f33927h = c3238e;
        this.f33926g = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3222c
    public final int a() {
        return this.f33926g.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3222c
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3222c
    public final boolean c() {
        return this.f33926g.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x035f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Long l10, Long l11, zzhs zzhsVar, long j10, B b10, boolean z10) {
        Boolean i10;
        zzpu.zza();
        C3238e c3238e = this.f33927h;
        C3298l3 c3298l3 = c3238e.f33578a;
        C3286k w10 = c3298l3.w();
        String str = this.f33949a;
        boolean H10 = w10.H(str, AbstractC3209a2.f33813G0);
        zzff zzffVar = this.f33926g;
        long j11 = zzffVar.zzm() ? b10.f33287e : j10;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        Boolean bool = null;
        if (Log.isLoggable(c3298l3.a().z(), 2)) {
            c3298l3.a().w().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f33950b), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, c3298l3.D().a(zzffVar.zzc()));
            c3298l3.a().w().b("Filter definition", c3238e.f34418b.K0().L(zzffVar));
        }
        if (!zzffVar.zza() || zzffVar.zzb() > 256) {
            c3298l3.a().r().c("Invalid event filter ID. appId, id", C3392x2.x(str), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        Object[] objArr = zzffVar.zzi() || zzffVar.zzj() || zzffVar.zzm();
        if (z10 && objArr != true) {
            c3298l3.a().w().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f33950b), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        String zzd = zzhsVar.zzd();
        if (zzffVar.zzg()) {
            Boolean g10 = AbstractC3222c.g(j11, zzffVar.zzh());
            if (g10 != null) {
                if (!g10.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            c3298l3.a().w().b("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.f33951c = bool2;
            if (!bool.booleanValue()) {
                return true;
            }
            this.f33952d = bool2;
            if (objArr != false && zzhsVar.zze()) {
                Long valueOf = Long.valueOf(zzhsVar.zzf());
                if (zzffVar.zzj()) {
                    if (H10 && zzffVar.zzg()) {
                        valueOf = l10;
                    }
                    this.f33954f = valueOf;
                } else {
                    if (H10 && zzffVar.zzg()) {
                        valueOf = l11;
                    }
                    this.f33953e = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = zzffVar.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                C6900a c6900a = new C6900a();
                Iterator it2 = zzhsVar.zza().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = zzffVar.zzd().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            zzfh zzfhVar = (zzfh) it3.next();
                            boolean z11 = zzfhVar.zze() && zzfhVar.zzf();
                            String zzh = zzfhVar.zzh();
                            if (zzh.isEmpty()) {
                                c3298l3.a().r().b("Event has empty param name. event", c3298l3.D().a(zzd));
                                break;
                            }
                            Object obj = c6900a.get(zzh);
                            if (obj instanceof Long) {
                                if (!zzfhVar.zzc()) {
                                    c3298l3.a().r().c("No number filter for long param. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzh));
                                    break;
                                }
                                Boolean g11 = AbstractC3222c.g(((Long) obj).longValue(), zzfhVar.zzd());
                                if (g11 == null) {
                                    break;
                                }
                                if (g11.booleanValue() == z11) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!zzfhVar.zzc()) {
                                    c3298l3.a().r().c("No number filter for double param. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzh));
                                    break;
                                }
                                Boolean h10 = AbstractC3222c.h(((Double) obj).doubleValue(), zzfhVar.zzd());
                                if (h10 == null) {
                                    break;
                                }
                                if (h10.booleanValue() == z11) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!zzfhVar.zza()) {
                                    if (!zzfhVar.zzc()) {
                                        c3298l3.a().r().c("No filter for String param. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzh));
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!X6.O(str2)) {
                                        c3298l3.a().r().c("Invalid param value for number filter. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzh));
                                        break;
                                    }
                                    i10 = AbstractC3222c.i(str2, zzfhVar.zzd());
                                } else {
                                    i10 = AbstractC3222c.f((String) obj, zzfhVar.zzb(), c3298l3.a());
                                }
                                if (i10 == null) {
                                    break;
                                }
                                if (i10.booleanValue() == z11) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj == null) {
                                c3298l3.a().w().c("Missing param for filter. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzh));
                                bool = Boolean.FALSE;
                            } else {
                                c3298l3.a().r().c("Unknown param type. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzh));
                            }
                        }
                    } else {
                        zzhw zzhwVar = (zzhw) it2.next();
                        if (hashSet.contains(zzhwVar.zzb())) {
                            if (!zzhwVar.zze()) {
                                if (!zzhwVar.zzi()) {
                                    if (!zzhwVar.zzc()) {
                                        c3298l3.a().r().c("Unknown value for param. event, param", c3298l3.D().a(zzd), c3298l3.D().b(zzhwVar.zzb()));
                                        break;
                                    }
                                    c6900a.put(zzhwVar.zzb(), zzhwVar.zzd());
                                } else {
                                    c6900a.put(zzhwVar.zzb(), zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                                }
                            } else {
                                c6900a.put(zzhwVar.zzb(), zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                            }
                        }
                    }
                }
            } else {
                zzfh zzfhVar2 = (zzfh) it.next();
                if (zzfhVar2.zzh().isEmpty()) {
                    c3298l3.a().r().b("null or empty param name in filter. event", c3298l3.D().a(zzd));
                    break;
                }
                hashSet.add(zzfhVar2.zzh());
            }
        }
        c3298l3.a().w().b("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
