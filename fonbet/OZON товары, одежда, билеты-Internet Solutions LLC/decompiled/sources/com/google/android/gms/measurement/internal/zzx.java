package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.C5132a;
import com.google.android.gms.internal.measurement.zzoi;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class zzx extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzej zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(zzaa zzaaVar, String str, int i11, com.google.android.gms.internal.measurement.zzej zzejVar) {
        super(str, i11);
        this.zza = zzaaVar;
        this.zzh = zzejVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzd(Long l11, Long l12, com.google.android.gms.internal.measurement.zzfs zzfsVar, long j11, zzas zzasVar, boolean z11) {
        Boolean zzi;
        zzoi.zzc();
        boolean zzs = this.zza.zzs.zzf().zzs(this.zzb, zzen.zzX);
        long j12 = this.zzh.zzn() ? zzasVar.zze : j11;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzs.zzay().zzq(), 2)) {
            this.zza.zzs.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzs.zzj().zzd(this.zzh.zzg()));
            this.zza.zzs.zzay().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzo(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzs.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzfa.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        Object[] objArr = this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn();
        if (z11 && objArr != true) {
            this.zza.zzs.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzej zzejVar = this.zzh;
        String zzh = zzfsVar.zzh();
        if (zzejVar.zzo()) {
            Boolean zzh2 = zzy.zzh(j12, zzejVar.zzf());
            if (zzh2 != null) {
                if (!zzh2.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            this.zza.zzs.zzay().zzj().zzb("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.zzd = bool2;
            if (!bool.booleanValue()) {
                return true;
            }
            this.zze = bool2;
            if (objArr != false && zzfsVar.zzu()) {
                Long valueOf = Long.valueOf(zzfsVar.zzd());
                if (this.zzh.zzm()) {
                    if (!zzs || !this.zzh.zzo()) {
                        l11 = valueOf;
                    }
                    this.zzg = l11;
                } else {
                    if (zzs && this.zzh.zzo()) {
                        valueOf = l12;
                    }
                    this.zzf = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = zzejVar.zzh().iterator();
        while (true) {
            if (!it.hasNext()) {
                C5132a c5132a = new C5132a();
                Iterator it2 = zzfsVar.zzi().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = zzejVar.zzh().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzel zzelVar = (com.google.android.gms.internal.measurement.zzel) it3.next();
                            boolean z12 = zzelVar.zzh() && zzelVar.zzg();
                            String zze = zzelVar.zze();
                            if (zze.isEmpty()) {
                                this.zza.zzs.zzay().zzk().zzb("Event has empty param name. event", this.zza.zzs.zzj().zzd(zzh));
                                break;
                            }
                            V v11 = c5132a.get(zze);
                            if (v11 instanceof Long) {
                                if (!zzelVar.zzi()) {
                                    this.zza.zzs.zzay().zzk().zzc("No number filter for long param. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zze));
                                    break;
                                }
                                Boolean zzh3 = zzy.zzh(((Long) v11).longValue(), zzelVar.zzc());
                                if (zzh3 == null) {
                                    break;
                                }
                                if (zzh3.booleanValue() == z12) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (v11 instanceof Double) {
                                if (!zzelVar.zzi()) {
                                    this.zza.zzs.zzay().zzk().zzc("No number filter for double param. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zze));
                                    break;
                                }
                                Boolean zzg = zzy.zzg(((Double) v11).doubleValue(), zzelVar.zzc());
                                if (zzg == null) {
                                    break;
                                }
                                if (zzg.booleanValue() == z12) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (v11 instanceof String) {
                                if (!zzelVar.zzk()) {
                                    if (!zzelVar.zzi()) {
                                        this.zza.zzs.zzay().zzk().zzc("No filter for String param. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zze));
                                        break;
                                    }
                                    String str = (String) v11;
                                    if (!zzln.zzx(str)) {
                                        this.zza.zzs.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zze));
                                        break;
                                    }
                                    zzi = zzy.zzi(str, zzelVar.zzc());
                                } else {
                                    zzi = zzy.zzf((String) v11, zzelVar.zzd(), this.zza.zzs.zzay());
                                }
                                if (zzi == null) {
                                    break;
                                }
                                if (zzi.booleanValue() == z12) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (v11 == 0) {
                                this.zza.zzs.zzay().zzj().zzc("Missing param for filter. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zze));
                                bool = Boolean.FALSE;
                            } else {
                                this.zza.zzs.zzay().zzk().zzc("Unknown param type. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zze));
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it2.next();
                        if (hashSet.contains(zzfwVar.zzg())) {
                            if (!zzfwVar.zzw()) {
                                if (!zzfwVar.zzu()) {
                                    if (!zzfwVar.zzy()) {
                                        this.zza.zzs.zzay().zzk().zzc("Unknown value for param. event, param", this.zza.zzs.zzj().zzd(zzh), this.zza.zzs.zzj().zze(zzfwVar.zzg()));
                                        break;
                                    }
                                    c5132a.put(zzfwVar.zzg(), zzfwVar.zzh());
                                } else {
                                    c5132a.put(zzfwVar.zzg(), zzfwVar.zzu() ? Double.valueOf(zzfwVar.zza()) : null);
                                }
                            } else {
                                c5132a.put(zzfwVar.zzg(), zzfwVar.zzw() ? Long.valueOf(zzfwVar.zzd()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.zzel zzelVar2 = (com.google.android.gms.internal.measurement.zzel) it.next();
                if (zzelVar2.zze().isEmpty()) {
                    this.zza.zzs.zzay().zzk().zzb("null or empty param name in filter. event", this.zza.zzs.zzj().zzd(zzh));
                    break;
                }
                hashSet.add(zzelVar2.zze());
            }
        }
        this.zza.zzs.zzay().zzj().zzb("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
