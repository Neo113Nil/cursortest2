package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
final class zbtl implements zbwy {
    private final zbtk zba;

    private zbtl(zbtk zbtkVar) {
        byte[] bArr = zbuo.zbb;
        this.zba = zbtkVar;
        zbtkVar.zba = this;
    }

    public static zbtl zba(zbtk zbtkVar) {
        zbtl zbtlVar = zbtkVar.zba;
        return zbtlVar != null ? zbtlVar : new zbtl(zbtkVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbA(int i11, long j11) throws IOException {
        this.zba.zbj(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbB(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbva)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbj(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbk(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z11) {
            while (i12 < zbvaVar.size()) {
                this.zba.zbj(i11, zbvaVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbvaVar.size(); i16++) {
            zbvaVar.zbe(i16);
            i15 += 8;
        }
        this.zba.zbw(i15);
        while (i12 < zbvaVar.size()) {
            this.zba.zbk(zbvaVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbC(int i11, int i12) throws IOException {
        this.zba.zbv(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbD(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbug)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zbtk zbtkVar = this.zba;
                    int intValue = ((Integer) list.get(i12)).intValue();
                    zbtkVar.zbv(i11, (intValue >> 31) ^ (intValue + intValue));
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue2 = ((Integer) list.get(i14)).intValue();
                i13 += zbtk.zbD((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                zbtk zbtkVar2 = this.zba;
                int intValue3 = ((Integer) list.get(i12)).intValue();
                zbtkVar2.zbw((intValue3 >> 31) ^ (intValue3 + intValue3));
                i12++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z11) {
            while (i12 < zbugVar.size()) {
                zbtk zbtkVar3 = this.zba;
                int zbe = zbugVar.zbe(i12);
                zbtkVar3.zbv(i11, (zbe >> 31) ^ (zbe + zbe));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbugVar.size(); i16++) {
            int zbe2 = zbugVar.zbe(i16);
            i15 += zbtk.zbD((zbe2 >> 31) ^ (zbe2 + zbe2));
        }
        this.zba.zbw(i15);
        while (i12 < zbugVar.size()) {
            zbtk zbtkVar4 = this.zba;
            int zbe3 = zbugVar.zbe(i12);
            zbtkVar4.zbw((zbe3 >> 31) ^ (zbe3 + zbe3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbE(int i11, long j11) throws IOException {
        this.zba.zbx(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbF(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbva)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zbtk zbtkVar = this.zba;
                    long longValue = ((Long) list.get(i12)).longValue();
                    zbtkVar.zbx(i11, (longValue >> 63) ^ (longValue + longValue));
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue2 = ((Long) list.get(i14)).longValue();
                i13 += zbtk.zbE((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                zbtk zbtkVar2 = this.zba;
                long longValue3 = ((Long) list.get(i12)).longValue();
                zbtkVar2.zby((longValue3 >> 63) ^ (longValue3 + longValue3));
                i12++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z11) {
            while (i12 < zbvaVar.size()) {
                zbtk zbtkVar3 = this.zba;
                long zbe = zbvaVar.zbe(i12);
                zbtkVar3.zbx(i11, (zbe >> 63) ^ (zbe + zbe));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbvaVar.size(); i16++) {
            long zbe2 = zbvaVar.zbe(i16);
            i15 += zbtk.zbE((zbe2 >> 63) ^ (zbe2 + zbe2));
        }
        this.zba.zbw(i15);
        while (i12 < zbvaVar.size()) {
            zbtk zbtkVar4 = this.zba;
            long zbe3 = zbvaVar.zbe(i12);
            zbtkVar4.zby((zbe3 >> 63) ^ (zbe3 + zbe3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @Deprecated
    public final void zbG(int i11) throws IOException {
        this.zba.zbu(i11, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbH(int i11, String str) throws IOException {
        this.zba.zbs(i11, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbI(int i11, List list) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbux)) {
            while (i12 < list.size()) {
                this.zba.zbs(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zbux zbuxVar = (zbux) list;
        while (i12 < list.size()) {
            Object zba = zbuxVar.zba();
            if (zba instanceof String) {
                this.zba.zbs(i11, (String) zba);
            } else {
                this.zba.zbf(i11, (zbtc) zba);
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbJ(int i11, int i12) throws IOException {
        this.zba.zbv(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbK(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbug)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbv(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zbtk.zbD(((Integer) list.get(i14)).intValue());
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbw(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z11) {
            while (i12 < zbugVar.size()) {
                this.zba.zbv(i11, zbugVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbugVar.size(); i16++) {
            i15 += zbtk.zbD(zbugVar.zbe(i16));
        }
        this.zba.zbw(i15);
        while (i12 < zbugVar.size()) {
            this.zba.zbw(zbugVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbL(int i11, long j11) throws IOException {
        this.zba.zbx(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbM(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbva)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbx(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zbtk.zbE(((Long) list.get(i14)).longValue());
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zby(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z11) {
            while (i12 < zbvaVar.size()) {
                this.zba.zbx(i11, zbvaVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbvaVar.size(); i16++) {
            i15 += zbtk.zbE(zbvaVar.zbe(i16));
        }
        this.zba.zbw(i15);
        while (i12 < zbvaVar.size()) {
            this.zba.zby(zbvaVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbb(int i11, boolean z11) throws IOException {
        this.zba.zbd(i11, z11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbc(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbss)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbd(i11, ((Boolean) list.get(i12)).booleanValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbb(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        zbss zbssVar = (zbss) list;
        if (!z11) {
            while (i12 < zbssVar.size()) {
                this.zba.zbd(i11, zbssVar.zbf(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbssVar.size(); i16++) {
            zbssVar.zbf(i16);
            i15++;
        }
        this.zba.zbw(i15);
        while (i12 < zbssVar.size()) {
            this.zba.zbb(zbssVar.zbf(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbd(int i11, zbtc zbtcVar) throws IOException {
        this.zba.zbf(i11, zbtcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbe(int i11, List list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zba.zbf(i11, (zbtc) list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbf(int i11, double d11) throws IOException {
        this.zba.zbj(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbg(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbtm)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbj(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbk(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        zbtm zbtmVar = (zbtm) list;
        if (!z11) {
            while (i12 < zbtmVar.size()) {
                this.zba.zbj(i11, Double.doubleToRawLongBits(zbtmVar.zbe(i12)));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbtmVar.size(); i16++) {
            zbtmVar.zbe(i16);
            i15 += 8;
        }
        this.zba.zbw(i15);
        while (i12 < zbtmVar.size()) {
            this.zba.zbk(Double.doubleToRawLongBits(zbtmVar.zbe(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @Deprecated
    public final void zbh(int i11) throws IOException {
        this.zba.zbu(i11, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbi(int i11, int i12) throws IOException {
        this.zba.zbl(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbj(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbug)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbl(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zbtk.zbE(((Integer) list.get(i14)).intValue());
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbm(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z11) {
            while (i12 < zbugVar.size()) {
                this.zba.zbl(i11, zbugVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbugVar.size(); i16++) {
            i15 += zbtk.zbE(zbugVar.zbe(i16));
        }
        this.zba.zbw(i15);
        while (i12 < zbugVar.size()) {
            this.zba.zbm(zbugVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbk(int i11, int i12) throws IOException {
        this.zba.zbh(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbl(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbug)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbh(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbi(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z11) {
            while (i12 < zbugVar.size()) {
                this.zba.zbh(i11, zbugVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbugVar.size(); i16++) {
            zbugVar.zbe(i16);
            i15 += 4;
        }
        this.zba.zbw(i15);
        while (i12 < zbugVar.size()) {
            this.zba.zbi(zbugVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbm(int i11, long j11) throws IOException {
        this.zba.zbj(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbn(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbva)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbj(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbk(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z11) {
            while (i12 < zbvaVar.size()) {
                this.zba.zbj(i11, zbvaVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbvaVar.size(); i16++) {
            zbvaVar.zbe(i16);
            i15 += 8;
        }
        this.zba.zbw(i15);
        while (i12 < zbvaVar.size()) {
            this.zba.zbk(zbvaVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbo(int i11, float f7) throws IOException {
        this.zba.zbh(i11, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbp(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbtw)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbh(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbi(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        zbtw zbtwVar = (zbtw) list;
        if (!z11) {
            while (i12 < zbtwVar.size()) {
                this.zba.zbh(i11, Float.floatToRawIntBits(zbtwVar.zbe(i12)));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbtwVar.size(); i16++) {
            zbtwVar.zbe(i16);
            i15 += 4;
        }
        this.zba.zbw(i15);
        while (i12 < zbtwVar.size()) {
            this.zba.zbi(Float.floatToRawIntBits(zbtwVar.zbe(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbq(int i11, Object obj, zbvx zbvxVar) throws IOException {
        zbtk zbtkVar = this.zba;
        zbtkVar.zbu(i11, 3);
        zbvxVar.zbi((zbvm) obj, zbtkVar.zba);
        zbtkVar.zbu(i11, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbr(int i11, int i12) throws IOException {
        this.zba.zbl(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbs(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbug)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbl(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zbtk.zbE(((Integer) list.get(i14)).intValue());
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbm(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z11) {
            while (i12 < zbugVar.size()) {
                this.zba.zbl(i11, zbugVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbugVar.size(); i16++) {
            i15 += zbtk.zbE(zbugVar.zbe(i16));
        }
        this.zba.zbw(i15);
        while (i12 < zbugVar.size()) {
            this.zba.zbm(zbugVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbt(int i11, long j11) throws IOException {
        this.zba.zbx(i11, j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbu(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbva)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbx(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zbtk.zbE(((Long) list.get(i14)).longValue());
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zby(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zbva zbvaVar = (zbva) list;
        if (!z11) {
            while (i12 < zbvaVar.size()) {
                this.zba.zbx(i11, zbvaVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbvaVar.size(); i16++) {
            i15 += zbtk.zbE(zbvaVar.zbe(i16));
        }
        this.zba.zbw(i15);
        while (i12 < zbvaVar.size()) {
            this.zba.zby(zbvaVar.zbe(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbv(int i11, zbve zbveVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.zba.zbu(i11, 2);
            this.zba.zbw(zbvf.zbb(zbveVar, entry.getKey(), entry.getValue()));
            zbvf.zbe(this.zba, zbveVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbw(int i11, Object obj, zbvx zbvxVar) throws IOException {
        this.zba.zbo(i11, (zbvm) obj, zbvxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbx(int i11, Object obj) throws IOException {
        if (obj instanceof zbtc) {
            this.zba.zbr(i11, (zbtc) obj);
        } else {
            this.zba.zbq(i11, (zbvm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zby(int i11, int i12) throws IOException {
        this.zba.zbh(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbz(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zbug)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zba.zbh(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zba.zbu(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zba.zbw(i13);
            while (i12 < list.size()) {
                this.zba.zbi(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zbug zbugVar = (zbug) list;
        if (!z11) {
            while (i12 < zbugVar.size()) {
                this.zba.zbh(i11, zbugVar.zbe(i12));
                i12++;
            }
            return;
        }
        this.zba.zbu(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zbugVar.size(); i16++) {
            zbugVar.zbe(i16);
            i15 += 4;
        }
        this.zba.zbw(i15);
        while (i12 < zbugVar.size()) {
            this.zba.zbi(zbugVar.zbe(i12));
            i12++;
        }
    }
}
