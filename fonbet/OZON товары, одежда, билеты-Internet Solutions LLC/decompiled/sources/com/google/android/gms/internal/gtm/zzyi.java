package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzyi extends zzuj {
    private zzyi() {
        super(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.gtm.zzuj
    public final <CT extends zzwk> zzux<CT, ?> zzc(CT ct, int i11) {
        char c11;
        String name = ct.getClass().getName();
        switch (name.hashCode()) {
            case -1328301759:
                if (name.equals("com.google.android.gms.internal.gtm.zzak")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1328301158:
                if (name.equals("com.google.android.gms.internal.gtm.zztw")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1328301155:
                if (name.equals("com.google.android.gms.internal.gtm.zztz")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1328301148:
                if (name.equals("com.google.android.gms.internal.gtm.zzub")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0) {
            switch (i11) {
                case 21596320:
                    break;
                case 21623477:
                    break;
                case 21713708:
                    break;
                case 23459630:
                    break;
                case 26652850:
                    break;
                case 53697879:
                    break;
                case 56871503:
                    break;
            }
            return null;
        }
        if (c11 == 1) {
            switch (i11) {
                case 21467048:
                    break;
                case 21596320:
                    break;
                case 21623477:
                    break;
                case 21713708:
                    break;
                case 26652850:
                    break;
            }
            return null;
        }
        if (c11 == 2) {
            if (i11 == 21596320) {
                return zzyq.zzm;
            }
            if (i11 != 28993747) {
                return null;
            }
            return zzyq.zzn;
        }
        if (c11 != 3) {
            return null;
        }
        if (i11 == 101) {
            return zzae.zza;
        }
        if (i11 != 47497405) {
            return null;
        }
        return zze.zza;
    }

    /* synthetic */ zzyi(zzyg zzygVar) {
        super(true);
    }
}
