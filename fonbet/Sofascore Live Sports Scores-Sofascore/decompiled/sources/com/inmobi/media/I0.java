package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.adquality.models.AdQualityResult;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.k13;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I0 {
    public final C3724r9 a;
    public WeakReference b;

    public I0(C3724r9 c3724r9) {
        c3724r9.getClass();
        this.a = c3724r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdQualityResult adQualityResult, sq3 sq3Var) {
        H0 h0;
        int i;
        WeakReference weakReference;
        A0 a0;
        if (sq3Var instanceof H0) {
            h0 = (H0) sq3Var;
            int i2 = h0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0.c = i2 - Integer.MIN_VALUE;
                Object obj = h0.a;
                lu3 lu3Var = lu3.a;
                i = h0.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    adQualityResult.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("image_location", adQualityResult.getImageLocation());
                    String sdkModelResult = adQualityResult.getSdkModelResult();
                    if (sdkModelResult == null) {
                        sdkModelResult = "";
                    }
                    contentValues.put("sdk_model_result", sdkModelResult);
                    contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, adQualityResult.getExtras());
                    h0.c = 1;
                    if (c3724r9.a("ad_quality_db", contentValues, 4, h0) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                weakReference = this.b;
                if (weakReference != null && (a0 = (A0) weakReference.get()) != null && a0.a.b.get()) {
                    a0.a.b.set(false);
                    a0.a.a();
                }
                return Unit.a;
            }
        }
        h0 = new H0(this, sq3Var);
        Object obj2 = h0.a;
        lu3 lu3Var2 = lu3.a;
        i = h0.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            a0.a.b.set(false);
            a0.a.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        G0 g0;
        int i;
        if (sq3Var instanceof G0) {
            g0 = (G0) sq3Var;
            int i2 = g0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0.c = i2 - Integer.MIN_VALUE;
                Object obj = g0.a;
                lu3 lu3Var = lu3.a;
                i = g0.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    g0.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM ad_quality_db", null), g0);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    contentValues.getClass();
                    String asString = contentValues.getAsString("image_location");
                    asString.getClass();
                    String asString2 = contentValues.getAsString("sdk_model_result");
                    String asString3 = contentValues.getAsString("beacon_url");
                    asString3.getClass();
                    arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_EXTRAS)));
                }
                return arrayList;
            }
        }
        g0 = new G0(this, sq3Var);
        Object obj2 = g0.a;
        lu3 lu3Var2 = lu3.a;
        i = g0.c;
        if (i != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }
}
