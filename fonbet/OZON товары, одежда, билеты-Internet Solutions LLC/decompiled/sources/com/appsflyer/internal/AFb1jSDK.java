package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes8.dex */
final class AFb1jSDK extends AFc1bSDK<String> {
    AFb1jSDK(Context context, AFd1mSDK aFd1mSDK) {
        super(context, aFd1mSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1bSDK
    /* renamed from: values, reason: merged with bridge method [inline-methods] */
    public String AFInAppEventParameterName() {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.values);
            Cursor query = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("aid"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
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
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String AFInAppEventType() {
        this.AFKeystoreWrapper.AFInAppEventParameterName().execute(this.valueOf);
        return (String) super.valueOf();
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final /* synthetic */ String valueOf() {
        this.AFKeystoreWrapper.AFInAppEventParameterName().execute(this.valueOf);
        return (String) super.valueOf();
    }
}
