package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzaqu implements zzaqm {
    final /* synthetic */ zzaqw zza;
    private final zzer zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzaqu(zzaqw zzaqwVar, int i) {
        Objects.requireNonNull(zzaqwVar);
        this.zza = zzaqwVar;
        this.zzb = new zzer(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzb(zzes zzesVar) {
        zzaqw zzaqwVar;
        int i;
        zzer zzerVar;
        int i2;
        int i3;
        if (zzesVar.zzs() != 2) {
            return;
        }
        zzaqw zzaqwVar2 = this.zza;
        zzfh zzfhVar = (zzfh) zzaqwVar2.zzh().get(0);
        if ((zzesVar.zzs() & 128) != 0) {
            zzesVar.zzk(1);
            int zzt = zzesVar.zzt();
            int i4 = 3;
            zzesVar.zzk(3);
            zzer zzerVar2 = this.zzb;
            zzesVar.zzl(zzerVar2, 2);
            zzerVar2.zzh(3);
            int i5 = 13;
            zzaqwVar2.zzq(zzerVar2.zzj(13));
            zzesVar.zzl(zzerVar2, 2);
            int i6 = 4;
            zzerVar2.zzh(4);
            int i7 = 12;
            zzesVar.zzk(zzerVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int zzd = zzesVar.zzd();
            while (zzd > 0) {
                int i8 = 5;
                zzesVar.zzl(zzerVar2, 5);
                int zzj = zzerVar2.zzj(8);
                zzerVar2.zzh(i4);
                int zzj2 = zzerVar2.zzj(i5);
                zzerVar2.zzh(i6);
                int zzj3 = zzerVar2.zzj(i7);
                int zzg = zzesVar.zzg();
                int i9 = zzg + zzj3;
                String str = null;
                ArrayList arrayList = null;
                int i10 = -1;
                int i11 = 0;
                while (zzesVar.zzg() < i9) {
                    int zzs = zzesVar.zzs();
                    int zzg2 = zzesVar.zzg() + zzesVar.zzs();
                    if (zzg2 > i9) {
                        break;
                    }
                    if (zzs == i8) {
                        long zzz = zzesVar.zzz();
                        if (zzz != 1094921523) {
                            if (zzz != 1161904947) {
                                if (zzz != 1094921524) {
                                    if (zzz == 1212503619) {
                                        i3 = 36;
                                        zzaqwVar = zzaqwVar2;
                                        i10 = i3;
                                        i = zzg2;
                                        zzerVar = zzerVar2;
                                        i2 = zzd;
                                    }
                                    zzaqwVar = zzaqwVar2;
                                    i = zzg2;
                                    zzerVar = zzerVar2;
                                    i2 = zzd;
                                }
                                zzaqwVar = zzaqwVar2;
                                i = zzg2;
                                zzerVar = zzerVar2;
                                i2 = zzd;
                                i10 = 172;
                            }
                            zzaqwVar = zzaqwVar2;
                            zzerVar = zzerVar2;
                            i2 = zzd;
                            i10 = 135;
                            i = zzg2;
                            zzesVar.zzk(i - zzesVar.zzg());
                            zzd = i2;
                            zzerVar2 = zzerVar;
                            zzaqwVar2 = zzaqwVar;
                            i8 = 5;
                        }
                        zzaqwVar = zzaqwVar2;
                        i = zzg2;
                        zzerVar = zzerVar2;
                        i2 = zzd;
                        i10 = 129;
                    } else {
                        if (zzs != 106) {
                            if (zzs != 122) {
                                if (zzs == 127) {
                                    int zzs2 = zzesVar.zzs();
                                    if (zzs2 != 21) {
                                        if (zzs2 == 14) {
                                            i3 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                                        } else {
                                            if (zzs2 == 33) {
                                                i3 = 139;
                                            }
                                            zzaqwVar = zzaqwVar2;
                                            i = zzg2;
                                            zzerVar = zzerVar2;
                                            i2 = zzd;
                                        }
                                    }
                                    zzaqwVar = zzaqwVar2;
                                    i = zzg2;
                                    zzerVar = zzerVar2;
                                    i2 = zzd;
                                    i10 = 172;
                                } else if (zzs == 123) {
                                    i3 = 138;
                                } else if (zzs == 10) {
                                    String trim = zzesVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    i11 = zzesVar.zzs();
                                    zzaqwVar = zzaqwVar2;
                                    str = trim;
                                    i = zzg2;
                                    zzerVar = zzerVar2;
                                    i2 = zzd;
                                } else {
                                    if (zzs == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzesVar.zzg() < zzg2) {
                                            int i12 = zzg2;
                                            String trim2 = zzesVar.zzK(3, StandardCharsets.UTF_8).trim();
                                            int zzs3 = zzesVar.zzs();
                                            int i13 = zzd;
                                            byte[] bArr = new byte[4];
                                            zzesVar.zzm(bArr, 0, 4);
                                            arrayList2.add(new zzaqx(trim2, zzs3, bArr));
                                            zzd = i13;
                                            zzg2 = i12;
                                            zzerVar2 = zzerVar2;
                                            zzaqwVar2 = zzaqwVar2;
                                        }
                                        zzaqwVar = zzaqwVar2;
                                        i = zzg2;
                                        zzerVar = zzerVar2;
                                        i2 = zzd;
                                        arrayList = arrayList2;
                                        i10 = 89;
                                    } else {
                                        zzaqwVar = zzaqwVar2;
                                        i = zzg2;
                                        zzerVar = zzerVar2;
                                        i2 = zzd;
                                        if (zzs == 111) {
                                            i10 = 257;
                                        }
                                    }
                                    zzesVar.zzk(i - zzesVar.zzg());
                                    zzd = i2;
                                    zzerVar2 = zzerVar;
                                    zzaqwVar2 = zzaqwVar;
                                    i8 = 5;
                                }
                                zzaqwVar = zzaqwVar2;
                                i10 = i3;
                                i = zzg2;
                                zzerVar = zzerVar2;
                                i2 = zzd;
                            }
                            zzaqwVar = zzaqwVar2;
                            zzerVar = zzerVar2;
                            i2 = zzd;
                            i10 = 135;
                            i = zzg2;
                            zzesVar.zzk(i - zzesVar.zzg());
                            zzd = i2;
                            zzerVar2 = zzerVar;
                            zzaqwVar2 = zzaqwVar;
                            i8 = 5;
                        }
                        zzaqwVar = zzaqwVar2;
                        i = zzg2;
                        zzerVar = zzerVar2;
                        i2 = zzd;
                        i10 = 129;
                    }
                    zzesVar.zzk(i - zzesVar.zzg());
                    zzd = i2;
                    zzerVar2 = zzerVar;
                    zzaqwVar2 = zzaqwVar;
                    i8 = 5;
                }
                zzaqw zzaqwVar3 = zzaqwVar2;
                zzer zzerVar3 = zzerVar2;
                int i14 = zzd;
                zzesVar.zzh(i9);
                zzaqy zzaqyVar = new zzaqy(i10, str, i11, arrayList, Arrays.copyOfRange(zzesVar.zzi(), zzg, i9));
                if (zzj == 6 || zzj == 5) {
                    zzj = zzaqyVar.zza;
                }
                zzd = i14 - (zzj3 + 5);
                if (!zzaqwVar3.zzk().get(zzj2)) {
                    zzarb zzb = zzaqwVar3.zzi().zzb(zzj, zzaqyVar);
                    sparseIntArray.put(zzj2, zzj2);
                    sparseArray.put(zzj2, zzb);
                }
                i6 = 4;
                zzerVar2 = zzerVar3;
                zzaqwVar2 = zzaqwVar3;
                i4 = 3;
                i5 = 13;
                i7 = 12;
            }
            zzaqw zzaqwVar4 = zzaqwVar2;
            int size = sparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                int keyAt = sparseIntArray.keyAt(i15);
                int valueAt = sparseIntArray.valueAt(i15);
                zzaqwVar4.zzk().put(keyAt, true);
                zzaqwVar4.zzl().put(valueAt, true);
                zzarb zzarbVar = (zzarb) sparseArray.valueAt(i15);
                if (zzarbVar != null) {
                    zzarbVar.zza(zzfhVar, zzaqwVar4.zzm(), new zzara(zzt, keyAt, 8192));
                    zzaqwVar4.zzj().put(valueAt, zzarbVar);
                }
            }
            zzaqwVar4.zzj().remove(this.zze);
            zzaqwVar4.zzo(0);
            if (zzaqwVar4.zzn() == 0) {
                zzaqwVar4.zzm().zzv();
                zzaqwVar4.zzp(true);
            }
        }
    }
}
