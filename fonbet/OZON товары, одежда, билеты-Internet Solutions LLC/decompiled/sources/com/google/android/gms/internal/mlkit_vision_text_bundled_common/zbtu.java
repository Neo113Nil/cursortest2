package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import TY.a;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zbtu {
    private static final zbtu zbb = new zbtu(true);
    final zbwh zba = new zbwa();
    private boolean zbc;
    private boolean zbd;

    private zbtu() {
    }

    static int zba(zbww zbwwVar, int i11, Object obj) {
        int zbd;
        int zbD;
        int zbD2 = zbtk.zbD(i11 << 3);
        if (zbwwVar == zbww.zbj) {
            zbuo.zbd((zbvm) obj);
            zbD2 += zbD2;
        }
        zbwx zbwxVar = zbwx.INT;
        int i12 = 4;
        switch (zbwwVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i12 = 8;
                return zbD2 + i12;
            case 1:
                ((Float) obj).getClass();
                return zbD2 + i12;
            case 2:
                i12 = zbtk.zbE(((Long) obj).longValue());
                return zbD2 + i12;
            case 3:
                i12 = zbtk.zbE(((Long) obj).longValue());
                return zbD2 + i12;
            case 4:
                i12 = zbtk.zbE(((Integer) obj).intValue());
                return zbD2 + i12;
            case 5:
                ((Long) obj).getClass();
                i12 = 8;
                return zbD2 + i12;
            case 6:
                ((Integer) obj).getClass();
                return zbD2 + i12;
            case 7:
                ((Boolean) obj).getClass();
                i12 = 1;
                return zbD2 + i12;
            case 8:
                if (!(obj instanceof zbtc)) {
                    i12 = zbtk.zbC((String) obj);
                    return zbD2 + i12;
                }
                zbd = ((zbtc) obj).zbd();
                zbD = zbtk.zbD(zbd);
                i12 = zbD + zbd;
                return zbD2 + i12;
            case 9:
                i12 = ((zbvm) obj).zbo();
                return zbD2 + i12;
            case 10:
                if (!(obj instanceof zbuv)) {
                    i12 = zbtk.zbA((zbvm) obj);
                    return zbD2 + i12;
                }
                zbd = ((zbuv) obj).zba();
                zbD = zbtk.zbD(zbd);
                i12 = zbD + zbd;
                return zbD2 + i12;
            case 11:
                if (obj instanceof zbtc) {
                    zbd = ((zbtc) obj).zbd();
                    zbD = zbtk.zbD(zbd);
                } else {
                    zbd = ((byte[]) obj).length;
                    zbD = zbtk.zbD(zbd);
                }
                i12 = zbD + zbd;
                return zbD2 + i12;
            case 12:
                i12 = zbtk.zbD(((Integer) obj).intValue());
                return zbD2 + i12;
            case 13:
                i12 = obj instanceof zbuh ? zbtk.zbE(((zbuh) obj).zba()) : zbtk.zbE(((Integer) obj).intValue());
                return zbD2 + i12;
            case 14:
                ((Integer) obj).getClass();
                return zbD2 + i12;
            case 15:
                ((Long) obj).getClass();
                i12 = 8;
                return zbD2 + i12;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i12 = zbtk.zbD((intValue >> 31) ^ (intValue + intValue));
                return zbD2 + i12;
            case 17:
                long longValue = ((Long) obj).longValue();
                i12 = zbtk.zbE((longValue >> 63) ^ (longValue + longValue));
                return zbD2 + i12;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zbb(zbtt zbttVar, Object obj) {
        zbww zbd = zbttVar.zbd();
        zbttVar.zba();
        zbttVar.zbg();
        return zba(zbd, 32149011, obj);
    }

    public static zbtu zbe() {
        return zbb;
    }

    static void zbk(zbtk zbtkVar, zbww zbwwVar, int i11, Object obj) throws IOException {
        if (zbwwVar == zbww.zbj) {
            zbvm zbvmVar = (zbvm) obj;
            zbuo.zbd(zbvmVar);
            zbtkVar.zbu(i11, 3);
            zbvmVar.zbL(zbtkVar);
            zbtkVar.zbu(i11, 4);
            return;
        }
        zbtkVar.zbu(i11, zbwwVar.zba());
        zbwx zbwxVar = zbwx.INT;
        switch (zbwwVar.ordinal()) {
            case 0:
                zbtkVar.zbk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zbtkVar.zbi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zbtkVar.zby(((Long) obj).longValue());
                break;
            case 3:
                zbtkVar.zby(((Long) obj).longValue());
                break;
            case 4:
                zbtkVar.zbm(((Integer) obj).intValue());
                break;
            case 5:
                zbtkVar.zbk(((Long) obj).longValue());
                break;
            case 6:
                zbtkVar.zbi(((Integer) obj).intValue());
                break;
            case 7:
                zbtkVar.zbb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zbtc)) {
                    zbtkVar.zbt((String) obj);
                    break;
                } else {
                    zbtkVar.zbg((zbtc) obj);
                    break;
                }
            case 9:
                ((zbvm) obj).zbL(zbtkVar);
                break;
            case 10:
                zbtkVar.zbp((zbvm) obj);
                break;
            case 11:
                if (!(obj instanceof zbtc)) {
                    byte[] bArr = (byte[]) obj;
                    zbtkVar.zbe(bArr, 0, bArr.length);
                    break;
                } else {
                    zbtkVar.zbg((zbtc) obj);
                    break;
                }
            case 12:
                zbtkVar.zbw(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zbuh)) {
                    zbtkVar.zbm(((Integer) obj).intValue());
                    break;
                } else {
                    zbtkVar.zbm(((zbuh) obj).zba());
                    break;
                }
            case 14:
                zbtkVar.zbi(((Integer) obj).intValue());
                break;
            case 15:
                zbtkVar.zbk(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zbtkVar.zbw((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zbtkVar.zby((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static Object zbn(Object obj) {
        if (obj instanceof zbvr) {
            return ((zbvr) obj).zbc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zbo(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        Object value = entry.getValue();
        boolean z11 = value instanceof zbuv;
        zbttVar.zbg();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            if (z11) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zba.put(zbttVar, zbn(value));
            return;
        }
        Object zbf = zbf(zbttVar);
        if (zbf != null) {
            if (z11) {
                throw null;
            }
            this.zba.put(zbttVar, zbf instanceof zbvr ? zbttVar.zbc((zbvr) zbf, (zbvr) value) : zbttVar.zbb(((zbvm) zbf).zbK(), (zbvm) value).zbk());
        } else {
            this.zba.put(zbttVar, zbn(value));
            if (z11) {
                this.zbd = true;
            }
        }
    }

    private static boolean zbp(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            return true;
        }
        zbttVar.zbg();
        Object value = entry.getValue();
        if (value instanceof zbvn) {
            return ((zbvn) value).zbp();
        }
        if (value instanceof zbuv) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zbq(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        Object value = entry.getValue();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            return zbb(zbttVar, value);
        }
        zbttVar.zbg();
        zbttVar.zbf();
        if (!(value instanceof zbuv)) {
            ((zbtt) entry.getKey()).zba();
            int zbD = zbtk.zbD(8);
            int zbD2 = zbtk.zbD(32149011) + zbtk.zbD(16);
            return zbD + zbD + zbD2 + zbtk.zbA((zbvm) value) + zbtk.zbD(24);
        }
        ((zbtt) entry.getKey()).zba();
        int zbD3 = zbtk.zbD(8);
        int zbD4 = zbtk.zbD(32149011) + zbtk.zbD(16);
        int zbD5 = zbtk.zbD(24);
        int zba = ((zbuv) value).zba();
        return zbD3 + zbD3 + zbD4 + a.a(zba, zba, zbD5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zbtu) {
            return this.zba.equals(((zbtu) obj).zba);
        }
        return false;
    }

    public final int hashCode() {
        return this.zba.hashCode();
    }

    public final int zbc() {
        int zbc = this.zba.zbc();
        int i11 = 0;
        for (int i12 = 0; i12 < zbc; i12++) {
            i11 += zbq(this.zba.zbg(i12));
        }
        Iterator it = this.zba.zbd().iterator();
        while (it.hasNext()) {
            i11 += zbq((Map.Entry) it.next());
        }
        return i11;
    }

    /* renamed from: zbd, reason: merged with bridge method [inline-methods] */
    public final zbtu clone() {
        zbtu zbtuVar = new zbtu();
        int zbc = this.zba.zbc();
        for (int i11 = 0; i11 < zbc; i11++) {
            Map.Entry zbg = this.zba.zbg(i11);
            zbtuVar.zbj((zbtt) ((zbwb) zbg).zba(), zbg.getValue());
        }
        for (Map.Entry entry : this.zba.zbd()) {
            zbtuVar.zbj((zbtt) entry.getKey(), entry.getValue());
        }
        zbtuVar.zbd = this.zbd;
        return zbtuVar;
    }

    public final Object zbf(zbtt zbttVar) {
        Object obj = this.zba.get(zbttVar);
        if (obj instanceof zbuv) {
            throw null;
        }
        return obj;
    }

    public final Iterator zbg() {
        return this.zba.isEmpty() ? Collections.emptyIterator() : this.zbd ? new zbuu(this.zba.entrySet().iterator()) : this.zba.entrySet().iterator();
    }

    public final void zbh() {
        if (this.zbc) {
            return;
        }
        int zbc = this.zba.zbc();
        for (int i11 = 0; i11 < zbc; i11++) {
            Map.Entry zbg = this.zba.zbg(i11);
            if (zbg.getValue() instanceof zbuf) {
                ((zbuf) zbg.getValue()).zbB();
            }
        }
        this.zba.zba();
        this.zbc = true;
    }

    public final void zbi(zbtu zbtuVar) {
        int zbc = zbtuVar.zba.zbc();
        for (int i11 = 0; i11 < zbc; i11++) {
            zbo(zbtuVar.zba.zbg(i11));
        }
        Iterator it = zbtuVar.zba.zbd().iterator();
        while (it.hasNext()) {
            zbo((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuh) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbj(zbtt zbttVar, Object obj) {
        boolean z11;
        zbttVar.zbg();
        zbttVar.zbd();
        byte[] bArr = zbuo.zbb;
        obj.getClass();
        zbww zbwwVar = zbww.zba;
        zbwx zbwxVar = zbwx.INT;
        switch (r0.zbb()) {
            case INT:
                z11 = obj instanceof Integer;
                break;
            case LONG:
                z11 = obj instanceof Long;
                break;
            case FLOAT:
                z11 = obj instanceof Float;
                break;
            case DOUBLE:
                z11 = obj instanceof Double;
                break;
            case BOOLEAN:
                z11 = obj instanceof Boolean;
                break;
            case STRING:
                z11 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zbtc)) {
                    break;
                }
                if (obj instanceof zbuv) {
                    this.zbd = true;
                }
                this.zba.put(zbttVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zbuv) {
                }
                this.zba.put(zbttVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zbvm)) {
                    break;
                }
                if (obj instanceof zbuv) {
                }
                this.zba.put(zbttVar, obj);
                return;
            default:
                zbttVar.zba();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 32149011, zbttVar.zbd().zbb(), obj.getClass().getName()));
        }
    }

    public final boolean zbl() {
        return this.zbc;
    }

    public final boolean zbm() {
        int zbc = this.zba.zbc();
        for (int i11 = 0; i11 < zbc; i11++) {
            if (!zbp(this.zba.zbg(i11))) {
                return false;
            }
        }
        Iterator it = this.zba.zbd().iterator();
        while (it.hasNext()) {
            if (!zbp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zbtu(boolean z11) {
        zbh();
        zbh();
    }
}
