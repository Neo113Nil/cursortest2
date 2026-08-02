package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zbvq implements zbvx {
    private final zbvm zba;
    private final zbwl zbb;
    private final boolean zbc;
    private final zbtq zbd;

    private zbvq(zbwl zbwlVar, zbtq zbtqVar, zbvm zbvmVar) {
        this.zbb = zbwlVar;
        this.zbc = zbvmVar instanceof zbub;
        this.zbd = zbtqVar;
        this.zba = zbvmVar;
    }

    static zbvq zbc(zbwl zbwlVar, zbtq zbtqVar, zbvm zbvmVar) {
        return new zbvq(zbwlVar, zbtqVar, zbvmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(Object obj) {
        int zbb = ((zbuf) obj).zbc.zbb();
        return this.zbc ? zbb + ((zbub) obj).zbb.zbc() : zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(Object obj) {
        int hashCode = ((zbuf) obj).zbc.hashCode();
        return this.zbc ? (hashCode * 53) + ((zbub) obj).zbb.zba.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final Object zbe() {
        zbvm zbvmVar = this.zba;
        return zbvmVar instanceof zbuf ? ((zbuf) zbvmVar).zbt() : zbvmVar.zbJ().zbl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(Object obj) {
        this.zbb.zbb(obj);
        this.zbd.zba(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(Object obj, Object obj2) {
        zbvz.zbp(this.zbb, obj, obj2);
        if (this.zbc) {
            zbvz.zbo(this.zbd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[EDGE_INSN: B:24:0x00b8->B:25:0x00b8 BREAK  A[LOOP:1: B:10:0x0064->B:18:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbh(Object obj, byte[] bArr, int i11, int i12, zbsq zbsqVar) throws IOException {
        int i13;
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        if (zbwmVar == zbwm.zbc()) {
            zbwmVar = zbwm.zbf();
            zbufVar.zbc = zbwmVar;
        }
        zbwm zbwmVar2 = zbwmVar;
        zbtu zbg = ((zbub) obj).zbg();
        zbud zbudVar = null;
        while (i11 < i12) {
            int zbk = zbsr.zbk(bArr, i11, zbsqVar);
            int i14 = zbsqVar.zba;
            if (i14 == 11) {
                int i15 = i12;
                zbsq zbsqVar2 = zbsqVar;
                int i16 = 0;
                zbtc zbtcVar = null;
                while (true) {
                    if (zbk >= i15) {
                        i13 = zbk;
                        break;
                    }
                    i13 = zbsr.zbk(bArr, zbk, zbsqVar2);
                    int i17 = zbsqVar2.zba;
                    int i18 = i17 >>> 3;
                    int i19 = i17 & 7;
                    if (i18 != 2) {
                        if (i18 == 3) {
                            if (zbudVar != null) {
                                zbk = zbsr.zbe(zbvu.zba().zbb(zbudVar.zba.getClass()), bArr, i13, i15, zbsqVar2);
                                zbg.zbj(zbudVar.zbb, zbsqVar2.zbc);
                            } else if (i19 == 2) {
                                zbk = zbsr.zba(bArr, i13, zbsqVar2);
                                zbtcVar = (zbtc) zbsqVar2.zbc;
                            }
                        }
                        if (i17 != 12) {
                            break;
                        } else {
                            zbk = zbsr.zbq(i17, bArr, i13, i15, zbsqVar2);
                        }
                    } else if (i19 == 0) {
                        zbk = zbsr.zbk(bArr, i13, zbsqVar2);
                        i16 = zbsqVar2.zba;
                        zbudVar = zbsqVar2.zbd.zbc(this.zba, i16);
                    } else if (i17 != 12) {
                    }
                }
                if (zbtcVar != null) {
                    zbwmVar2.zbj((i16 << 3) | 2, zbtcVar);
                }
                i11 = i13;
                i12 = i15;
                zbsqVar = zbsqVar2;
            } else if ((i14 & 7) == 2) {
                zbudVar = zbsqVar.zbd.zbc(this.zba, i14 >>> 3);
                if (zbudVar != null) {
                    i11 = zbsr.zbe(zbvu.zba().zbb(zbudVar.zba.getClass()), bArr, zbk, i12, zbsqVar);
                    zbg.zbj(zbudVar.zbb, zbsqVar.zbc);
                } else {
                    i11 = zbsr.zbj(i14, bArr, zbk, i12, zbwmVar2, zbsqVar);
                }
            } else {
                i11 = zbsr.zbq(i14, bArr, zbk, i12, zbsqVar);
            }
        }
        if (i11 != i12) {
            throw new zbuq("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbi(Object obj, zbwy zbwyVar) throws IOException {
        Iterator zbg = ((zbub) obj).zbb.zbg();
        while (zbg.hasNext()) {
            Map.Entry entry = (Map.Entry) zbg.next();
            zbtt zbttVar = (zbtt) entry.getKey();
            if (zbttVar.zbe() != zbwx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zbttVar.zbg();
            zbttVar.zbf();
            if (entry instanceof zbut) {
                zbttVar.zba();
                zbwyVar.zbx(32149011, ((zbut) entry).zba().zbb());
            } else {
                zbttVar.zba();
                zbwyVar.zbx(32149011, entry.getValue());
            }
        }
        ((zbuf) obj).zbc.zbk(zbwyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(Object obj, Object obj2) {
        if (!((zbuf) obj).zbc.equals(((zbuf) obj2).zbc)) {
            return false;
        }
        if (this.zbc) {
            return ((zbub) obj).zbb.equals(((zbub) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(Object obj) {
        return ((zbub) obj).zbb.zbm();
    }
}
