package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.internal.AttributionIdentifiers;

/* loaded from: classes6.dex */
final class AFb1lSDK extends AFc1dSDK<String> {
    AFb1lSDK(Context context, AFd1kSDK aFd1kSDK) {
        super(context, aFd1kSDK, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
    public String getMonetizationNetwork() {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.getRevenue.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.getMediationNetwork);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("aid"));
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

    public final String getRevenue() {
        this.AFAdRevenueData.getMonetizationNetwork().execute(this.getCurrencyIso4217Code);
        return (String) super.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final /* synthetic */ String getMediationNetwork() {
        this.AFAdRevenueData.getMonetizationNetwork().execute(this.getCurrencyIso4217Code);
        return (String) super.getMediationNetwork();
    }
}
