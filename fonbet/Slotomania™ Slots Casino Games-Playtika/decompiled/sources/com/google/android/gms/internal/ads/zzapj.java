package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapj implements zzaqz {
    private final List zza;

    public zzapj() {
        this(0);
    }

    public zzapj(int i, List list) {
        this.zza = list;
    }

    private final zzaqp zzc(zzaqy zzaqyVar) {
        return new zzaqp(zze(zzaqyVar), MimeTypes.VIDEO_MP2T);
    }

    private final zzare zzd(zzaqy zzaqyVar) {
        return new zzare(zze(zzaqyVar), MimeTypes.VIDEO_MP2T);
    }

    private final List zze(zzaqy zzaqyVar) {
        String str;
        int i;
        List list;
        zzes zzesVar = new zzes(zzaqyVar.zze);
        List list2 = this.zza;
        while (zzesVar.zzd() > 0) {
            int zzs = zzesVar.zzs();
            int zzg = zzesVar.zzg() + zzesVar.zzs();
            if (zzs == 134) {
                list2 = new ArrayList();
                int zzs2 = zzesVar.zzs() & 31;
                for (int i2 = 0; i2 < zzs2; i2++) {
                    String zzK = zzesVar.zzK(3, StandardCharsets.UTF_8);
                    int zzs3 = zzesVar.zzs();
                    boolean z = (zzs3 & 128) != 0;
                    if (z) {
                        i = zzs3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte zzs4 = (byte) zzesVar.zzs();
                    zzesVar.zzk(1);
                    if (z) {
                        int i3 = zzs4 & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzdp.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzo(str);
                    zztVar.zze(zzK);
                    zztVar.zzL(i);
                    zztVar.zzr(list);
                    list2.add(zztVar.zzO());
                }
            }
            zzesVar.zzh(zzg);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzapj(int i) {
        this.zza = zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final zzarb zzb(int i, zzaqy zzaqyVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaqf(new zzapy(zzaqyVar.zzb, zzaqyVar.zza(), MimeTypes.VIDEO_MP2T));
            }
            if (i == 21) {
                return new zzaqf(new zzapw(MimeTypes.VIDEO_MP2T));
            }
            if (i == 27) {
                return new zzaqf(new zzapt(zzc(zzaqyVar), false, false, MimeTypes.VIDEO_MP2T));
            }
            if (i == 36) {
                return new zzaqf(new zzapv(zzc(zzaqyVar), MimeTypes.VIDEO_MP2T));
            }
            if (i == 45) {
                return new zzaqf(new zzapz(MimeTypes.VIDEO_MP2T));
            }
            if (i == 89) {
                return new zzaqf(new zzapl(zzaqyVar.zzd, MimeTypes.VIDEO_MP2T));
            }
            if (i == 172) {
                return new zzaqf(new zzapf(zzaqyVar.zzb, zzaqyVar.zza(), MimeTypes.VIDEO_MP2T));
            }
            if (i == 257) {
                return new zzaqn(new zzaqe(MimeTypes.APPLICATION_AIT, MimeTypes.VIDEO_MP2T));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzaqf(new zzapk(zzaqyVar.zzb, zzaqyVar.zza(), 5408, MimeTypes.VIDEO_MP2T));
                        }
                        switch (i) {
                            case 15:
                                return new zzaqf(new zzapi(false, zzaqyVar.zzb, zzaqyVar.zza(), MimeTypes.VIDEO_MP2T));
                            case 16:
                                return new zzaqf(new zzapr(zzd(zzaqyVar), MimeTypes.VIDEO_MP2T));
                            case 17:
                                return new zzaqf(new zzapx(zzaqyVar.zzb, zzaqyVar.zza(), MimeTypes.VIDEO_MP2T));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzaqn(new zzaqe(MimeTypes.APPLICATION_SCTE35, MimeTypes.VIDEO_MP2T));
                                    case 135:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzaqf(new zzapk(zzaqyVar.zzb, zzaqyVar.zza(), 4096, MimeTypes.VIDEO_MP2T));
                }
                return new zzaqf(new zzapc(zzaqyVar.zzb, zzaqyVar.zza(), MimeTypes.VIDEO_MP2T));
            }
        }
        return new zzaqf(new zzapo(zzd(zzaqyVar), MimeTypes.VIDEO_MP2T));
    }
}
