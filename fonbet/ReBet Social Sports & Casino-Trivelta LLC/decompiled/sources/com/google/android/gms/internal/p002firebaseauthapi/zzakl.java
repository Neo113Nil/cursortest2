package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzakl implements zzanc {
    private final zzakh zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzakl(zzakh zzakhVar) {
        zzakh zzakhVar2 = (zzakh) zzalh.zza(zzakhVar, "input");
        this.zza = zzakhVar2;
        zzakhVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        if (i11 == 0 || i11 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final zzajv zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final boolean zzt() {
        int i10;
        if (this.zza.zzw() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i10);
    }

    private final <T> void zzd(T t10, zzanb<T> zzanbVar, zzaku zzakuVar) {
        int zzj = this.zza.zzj();
        this.zza.zzt();
        int zzb = this.zza.zzb(zzj);
        this.zza.zza++;
        zzanbVar.zza(t10, this, zzakuVar);
        this.zza.zzc(0);
        r4.zza--;
        this.zza.zzd(zzb);
    }

    public static zzakl zza(zzakh zzakhVar) {
        zzakl zzaklVar = zzakhVar.zzc;
        return zzaklVar != null ? zzaklVar : new zzakl(zzakhVar);
    }

    private final <T> T zzb(zzanb<T> zzanbVar, zzaku zzakuVar) {
        T zza = zzanbVar.zza();
        zzd(zza, zzanbVar, zzakuVar);
        zzanbVar.zzd(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaliVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 == 5) {
                do {
                    zzaliVar.zzc(this.zza.zze());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzalxVar.zza(this.zza.zzk());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzalxVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzald) {
            zzald zzaldVar = (zzald) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaldVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 == 5) {
                do {
                    zzaldVar.zza(this.zza.zzb());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzf());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzalxVar.zza(this.zza.zzl());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaliVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 == 5) {
                do {
                    zzaliVar.zzc(this.zza.zzg());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzalxVar.zza(this.zza.zzn());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzalxVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzh());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzalxVar.zza(this.zza.zzo());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzj());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzalxVar.zza(this.zza.zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    private final Object zza(zzaog zzaogVar, Class<?> cls, zzaku zzakuVar) {
        switch (zzako.zza[zzaogVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzamx.zza().zza((Class) cls), zzakuVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t10, zzanb<T> zzanbVar, zzaku zzakuVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzanbVar.zza(t10, this, zzakuVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzall.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final <T> void zzb(T t10, zzanb<T> zzanbVar, zzaku zzakuVar) {
        zzb(2);
        zzd(t10, zzanbVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzb(List<zzajv> list) {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzd());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final <T> void zzb(List<T> list, zzanb<T> zzanbVar, zzaku zzakuVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzb(zzanbVar, zzakuVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaks) {
            zzaks zzaksVar = (zzaks) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaksVar.zza(this.zza.zza());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaksVar.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzall.zza();
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzall.zza();
        }
    }

    private final <T> T zza(zzanb<T> zzanbVar, zzaku zzakuVar) {
        T zza = zzanbVar.zza();
        zzc(zza, zzanbVar, zzakuVar);
        zzanbVar.zzd(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final <T> void zza(T t10, zzanb<T> zzanbVar, zzaku zzakuVar) {
        zzb(3);
        zzc(t10, zzanbVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajt) {
            zzajt zzajtVar = (zzajt) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajtVar.zza(this.zza.zzx());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i10 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajtVar.zza(this.zza.zzx());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i11 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzall.zzg();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzall.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    @Deprecated
    public final <T> void zza(List<T> list, zzanb<T> zzanbVar, zzaku zzakuVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zza(zzanbVar, zzakuVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        r7.zza.zzd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzamd<K, V> zzamdVar, zzaku zzakuVar) {
        zzb(2);
        int zzb = this.zza.zzb(this.zza.zzj());
        Object obj = zzamdVar.zzb;
        Object obj2 = zzamdVar.zzd;
        while (true) {
            try {
                int zzc = zzc();
                if (zzc == Integer.MAX_VALUE || this.zza.zzw()) {
                    break;
                }
                if (zzc == 1) {
                    obj = zza(zzamdVar.zza, (Class<?>) null, (zzaku) null);
                } else if (zzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzall("Unable to parse map entry.");
                        }
                    } catch (zzalo e10) {
                        if (!zzt()) {
                            throw new zzall("Unable to parse map entry.", e10);
                        }
                    }
                } else {
                    obj2 = zza(zzamdVar.zzc, zzamdVar.zzd.getClass(), zzakuVar);
                }
            } catch (Throwable th2) {
                this.zza.zzd(zzb);
                throw th2;
            }
        }
    }

    private final void zza(List<String> list, boolean z10) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzalt) && !z10) {
                zzalt zzaltVar = (zzalt) list;
                do {
                    zzaltVar.zza(zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            do {
                list.add(z10 ? zzr() : zzq());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    private final void zza(int i10) {
        if (this.zza.zzc() != i10) {
            throw zzall.zzj();
        }
    }
}
