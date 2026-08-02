package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes.dex */
public final class AFi1gSDK extends AFi1tSDK {
    private final AFd1mSDK AFInAppEventType;

    public AFi1gSDK(Runnable runnable, AFd1mSDK aFd1mSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventType = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void valueOf(Context context) {
        AFKeystoreWrapper(this.AFInAppEventType.values(), new AFc1bSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFi1gSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r3 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.AFInAppEventType.getPackageManager().resolveContentProvider(r10.values, com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN)).packageName;
                r10.AFInAppEventParameterName.valueOf.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1uSDK.values(r10.AFInAppEventType, r0)));
                r10.AFInAppEventParameterName.valueOf.put("api_ver_name", com.appsflyer.internal.AFb1uSDK.AFKeystoreWrapper(r10.AFInAppEventType, r0));
                r10.AFInAppEventParameterName.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.AFInAppEventParameterName.valueOf;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFc1bSDK
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventParameterName() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.values);
                        cursor = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursor == null) {
                            AFi1gSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursor.moveToFirst()) {
                            AFi1gSDK.this.valueOf.put("response", DiscountCodeResponse.RESULT_OK);
                            values("referrer", AFi1gSDK.this.valueOf, cursor);
                            AFKeystoreWrapper("click_ts", AFi1gSDK.this.valueOf, cursor);
                            AFKeystoreWrapper("install_begin_ts", AFi1gSDK.this.valueOf, cursor);
                            AFKeystoreWrapper("install_end_ts", AFi1gSDK.this.valueOf, cursor);
                            values("organic_keywords", AFi1gSDK.this.valueOf, cursor);
                            values("attr_type", AFi1gSDK.this.valueOf, cursor);
                            HashMap hashMap = new HashMap();
                            int columnIndex = cursor.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            AFKeystoreWrapper("click_server_ts", hashMap, cursor);
                            AFKeystoreWrapper("install_begin_server_ts", hashMap, cursor);
                            values("install_version", hashMap, cursor);
                            if (!hashMap.isEmpty()) {
                                AFi1gSDK.this.valueOf.put("custom", hashMap);
                            }
                        } else {
                            AFi1gSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e11) {
                        AFi1gSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e11.getMessage(), e11, false, true);
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th2;
                }
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j11 = cursor.getLong(columnIndex);
                if (j11 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j11));
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
