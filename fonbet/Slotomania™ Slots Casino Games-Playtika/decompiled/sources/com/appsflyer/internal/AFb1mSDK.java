package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.internal.AttributionIdentifiers;
import com.ironsource.C2669ta;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class AFb1mSDK extends AFb1uSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1uSDK
    /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
    public String getRevenue() {
        Cursor cursor = null;
        try {
            Cursor query = this.getMonetizationNetwork.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFAdRevenueData).toString()), new String[]{C2669ta.b}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(C2669ta.b));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String getCurrencyIso4217Code() {
        this.getRevenue.execute(this.getCurrencyIso4217Code);
        return (String) super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final /* synthetic */ String AFAdRevenueData() {
        this.getRevenue.execute(this.getCurrencyIso4217Code);
        return (String) super.AFAdRevenueData();
    }
}
