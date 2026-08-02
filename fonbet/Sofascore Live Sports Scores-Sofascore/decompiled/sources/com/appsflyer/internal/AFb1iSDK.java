package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import com.ironsource.C4324ta;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1iSDK extends ContentProviderFetcher<String> {
    public AFb1iSDK(Context context, Executor executor) {
        super(context, AFLogger.INSTANCE, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.sdk_base.util.ContentProviderFetcher
    /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public String query() {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.authority);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[]{C4324ta.b}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(C4324ta.b));
                        query.close();
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

    @Override // com.appsflyer.sdk_base.util.ContentProviderFetcher
    @Nullable
    public final /* synthetic */ String get() {
        start();
        return (String) super.get();
    }

    @Nullable
    public final String registerClient() {
        start();
        return (String) super.get();
    }
}
