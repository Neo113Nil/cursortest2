package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;
import java.util.Map;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes.dex */
public final class AFi1oSDK extends AFi1tSDK {
    private final AFd1mSDK AFInAppEventType;

    public AFi1oSDK(Runnable runnable, AFd1mSDK aFd1mSDK) {
        super("store", "huawei", runnable);
        this.AFInAppEventType = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void valueOf(Context context) {
        AFKeystoreWrapper(this.AFInAppEventType.values(), new AFc1bSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFi1oSDK.3
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x00fd, code lost:
            
                if (r5 != null) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
            
                r5.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
            
                r12.AFInAppEventParameterName.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x011d, code lost:
            
                return r12.AFInAppEventParameterName.valueOf;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
            
                if (0 == 0) goto L24;
             */
            @Override // com.appsflyer.internal.AFc1bSDK
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventParameterName() {
                String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, UserVerificationMethods.USER_VERIFY_PATTERN)).packageName;
                AFi1oSDK.this.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(this.AFInAppEventType, str)));
                AFi1oSDK.this.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(this.AFInAppEventType, str));
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.values);
                        sb2.append("/item/5");
                        cursor = contentResolver.query(Uri.parse(sb2.toString()), null, null, new String[]{this.AFInAppEventType.getPackageName()}, null);
                        if (cursor == null) {
                            AFi1oSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursor.moveToFirst()) {
                            AFi1oSDK.this.valueOf.put("response", DiscountCodeResponse.RESULT_OK);
                            AFi1oSDK.this.valueOf.put("referrer", cursor.getString(0));
                            AFi1oSDK.this.valueOf.put("click_ts", Long.valueOf(cursor.getLong(1)));
                            AFi1oSDK.this.valueOf.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                            if (cursor.getColumnCount() > 3) {
                                AFi1oSDK.this.valueOf.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                                HashMap hashMap = new HashMap();
                                String string = cursor.getString(4);
                                if (string != null) {
                                    hashMap.put("track_id", string);
                                }
                                hashMap.put("referrer_ex", cursor.getString(5));
                                AFi1oSDK.this.valueOf.put("huawei_custom", hashMap);
                            }
                        } else {
                            AFi1oSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e11) {
                        AFi1oSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e11.getMessage(), e11, false, true);
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
        });
    }
}
