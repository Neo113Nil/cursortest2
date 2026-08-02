package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.צּ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1028 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3285;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3286;

    public C1028(ArrayList arrayList, JSONObject jSONObject) {
        this.f3286 = arrayList;
        this.f3285 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        Iterator it = this.f3286.iterator();
        while (it.hasNext()) {
            C0999 c0999 = (C0999) it.next();
            JSONObject jSONObject = this.f3285;
            Context context = c0999.f3237.f3011.f2595;
            String str = AbstractC0615.f2002;
            int i = AbstractC0609.f1978;
            Intent putExtra = new Intent(str).putExtra(AbstractC0615.f1994, jSONObject.toString());
            C0656 m396 = C0656.m396(context);
            if (m396.f2256) {
                synchronized (m396.f2254) {
                    try {
                        putExtra.getAction();
                        putExtra.resolveTypeIfNeeded(m396.f2255.getContentResolver());
                        putExtra.getData();
                        putExtra.getScheme();
                        putExtra.getCategories();
                        boolean z = (putExtra.getFlags() & 8) != 0;
                        if (z) {
                            StringFog.decrypt("OYu63NANuSsMzr3KzB7w\n", "a+7Js7x70EU=\n");
                            StringFog.decrypt("ZgrBcISAWao=\n", "RnmiGOHtPIo=\n");
                            StringFog.decrypt("Dzb4Hwr5miRBLb4=\n", "L1meP2OX7kE=\n");
                            putExtra.toString();
                        }
                        ArrayList arrayList = (ArrayList) m396.f2253.get(putExtra.getAction());
                        if (arrayList != null) {
                            if (z) {
                                StringFog.decrypt("r9MLQCsTHz2HwwsTZA==\n", "7rB/KUR9P1E=\n");
                                arrayList.toString();
                            }
                            if (arrayList.size() > 0) {
                                if (arrayList.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                if (!z) {
                                    throw null;
                                }
                                StringFog.decrypt("Ca25bD5MptNkrapuP0u7wGSqpGMiQLqU\n", "RMzND1YlyLQ=\n");
                                throw null;
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
