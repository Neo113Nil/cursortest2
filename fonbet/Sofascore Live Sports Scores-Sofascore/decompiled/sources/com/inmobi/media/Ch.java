package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;
import defpackage.ok3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ch implements N0 {
    public final AdQualityResult a;

    public Ch(AdQualityResult adQualityResult) {
        adQualityResult.getClass();
        this.a = adQualityResult;
    }

    @Override // com.inmobi.media.N0
    public final Object a() {
        boolean z;
        try {
            ok3.J(new Bh(this, null));
            z = true;
        } catch (SQLiteException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
