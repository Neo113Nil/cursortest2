package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1pSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import defpackage.ndd;
import defpackage.tub;
import defpackage.zzl;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1tSDK extends Referrer {

    @NotNull
    private final AFc1hSDK AFKeystoreWrapper;

    @Nullable
    private String d;

    @NotNull
    private final Runnable registerClient;

    @NotNull
    private final AFi1qSDK unregisterClient;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] unregisterClient;

        static {
            int[] iArr = new int[AFi1qSDK.values().length];
            try {
                iArr[AFi1qSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1qSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1qSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            unregisterClient = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1tSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull AFi1qSDK aFi1qSDK, @NotNull ReferrerProp referrerProp, @NotNull Runnable runnable) {
        super("app", r0, referrerProp);
        String str;
        aFc1hSDK.getClass();
        aFi1qSDK.getClass();
        referrerProp.getClass();
        runnable.getClass();
        int i = AFi1pSDK.AFa1ySDK.unregisterClient[aFi1qSDK.ordinal()];
        if (i == 1) {
            str = Payload.SOURCE_FACEBOOK;
        } else if (i == 2) {
            str = Payload.SOURCE_INSTAGRAM;
        } else {
            if (i != 3) {
                zzl.b();
                throw null;
            }
            str = Payload.SOURCE_FACEBOOK_LITE;
        }
        this.AFKeystoreWrapper = aFc1hSDK;
        this.unregisterClient = aFi1qSDK;
        this.registerClient = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0212, code lost:
    
        if (r3 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01fe, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fc, code lost:
    
        if (r3 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0242, code lost:
    
        if (r3 == null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:3:0x0020, B:9:0x0036, B:11:0x0042, B:17:0x00e5, B:83:0x0062, B:85:0x0073, B:86:0x0078, B:87:0x0079, B:89:0x0085, B:90:0x009d, B:91:0x00ad, B:93:0x00b9, B:94:0x00d1), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void registerClient(AFi1tSDK aFi1tSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        AFLogger aFLogger;
        LogTag logTag;
        Uri parse;
        Cursor cursor2;
        String str;
        String str2;
        aFi1tSDK.start();
        String str3 = aFi1tSDK.d;
        str3.getClass();
        try {
            AFi1qSDK aFi1qSDK = aFi1tSDK.unregisterClient;
            int[] iArr = AFa1zSDK.unregisterClient;
            int i = iArr[aFi1qSDK.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new ndd();
                    }
                    if (context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) {
                        aFLogger = AFLogger.INSTANCE;
                        logTag = LogTag.META_REFERRER;
                        AFLoggerBase.d$default(aFLogger, logTag, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str3));
                        if (parse == null) {
                            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                            try {
                                String[] strArr = {"install_referrer", Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY, "actual_timestamp"};
                                if (acquireUnstableContentProviderClient != null) {
                                    cursor2 = acquireUnstableContentProviderClient.query(parse, strArr, null, null, null);
                                    contentProviderClient = acquireUnstableContentProviderClient;
                                } else {
                                    contentProviderClient = acquireUnstableContentProviderClient;
                                    cursor2 = null;
                                }
                                if (cursor2 != null) {
                                    try {
                                        if (cursor2.moveToFirst()) {
                                            int columnIndex = cursor2.getColumnIndex("install_referrer");
                                            if (columnIndex != -1) {
                                                str = cursor2.getString(columnIndex);
                                            } else {
                                                AFLoggerBase.d$default(aFLogger, logTag, "No such column, " + aFi1tSDK.unregisterClient + " provider", false, 4, null);
                                                str = null;
                                            }
                                            if (str != null) {
                                                AFLoggerBase.d$default(aFLogger, logTag, "Collected " + aFi1tSDK.unregisterClient + " attribution data.", false, 4, null);
                                                aFi1tSDK.map.put("response", Payload.RESPONSE_OK);
                                                aFi1tSDK.map.put(Payload.RFR, str);
                                                int columnIndex2 = cursor2.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(cursor2.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFi1tSDK.map.put(Payload.CLICK_TS, Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = cursor2.getColumnIndex(Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY);
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(cursor2.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFi1tSDK.map.put(Payload.META_CUSTOM, tub.i(new Pair(Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY, Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i2 = iArr[aFi1tSDK.unregisterClient.ordinal()];
                                                if (i2 == 1) {
                                                    str2 = FbValidationUtils.FB_PACKAGE;
                                                } else if (i2 == 2) {
                                                    str2 = "com.instagram.android";
                                                } else {
                                                    if (i2 != 3) {
                                                        throw new ndd();
                                                    }
                                                    str2 = "com.facebook.lite";
                                                }
                                                aFi1tSDK.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, str2)));
                                                aFi1tSDK.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, str2));
                                            }
                                            cursor2.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        try {
                                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1tSDK.unregisterClient.name() + " provider", th, false, false, false, false, 120, null);
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th3) {
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (contentProviderClient != null) {
                                                contentProviderClient.close();
                                            }
                                            throw th3;
                                        }
                                    }
                                }
                                AFLoggerBase.d$default(aFLogger, logTag, "Content provider returned no data", false, 4, null);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                            } catch (Throwable th4) {
                                contentProviderClient = acquireUnstableContentProviderClient;
                                th = th4;
                                cursor = null;
                                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1tSDK.unregisterClient.name() + " provider", th, false, false, false, false, 120, null);
                                if (cursor != null) {
                                }
                            }
                        }
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        logTag = LogTag.META_REFERRER;
                        AFLoggerBase.d$default(aFLogger, logTag, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) {
                    aFLogger = AFLogger.INSTANCE;
                    logTag = LogTag.META_REFERRER;
                    AFLoggerBase.d$default(aFLogger, logTag, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                    if (parse == null) {
                    }
                } else {
                    aFLogger = AFLogger.INSTANCE;
                    logTag = LogTag.META_REFERRER;
                    AFLoggerBase.d$default(aFLogger, logTag, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) {
                aFLogger = AFLogger.INSTANCE;
                logTag = LogTag.META_REFERRER;
                AFLoggerBase.d$default(aFLogger, logTag, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
            } else {
                aFLogger = AFLogger.INSTANCE;
                logTag = LogTag.META_REFERRER;
                AFLoggerBase.d$default(aFLogger, logTag, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFi1tSDK.finish();
        aFi1tSDK.registerClient.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        getProp().getBackgroundExecutor().execute(new com.appsflyer.internal.n(5, r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    @Override // com.appsflyer.sdk_base.referrer.Referrer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(@NotNull Context context) {
        context.getClass();
        String AFLogger = this.AFKeystoreWrapper.AFLogger("com.facebook.sdk.ApplicationId");
        String str = null;
        String V = AFLogger != null ? StringsKt.V(AFLogger, "fb") : null;
        if (V == null || V.length() == 0) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            V = null;
        }
        if (V == null) {
            String AFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper("facebook_application_id");
            V = AFKeystoreWrapper != null ? StringsKt.V(AFKeystoreWrapper, "fb") : null;
            if (V == null || V.length() == 0) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                V = null;
            }
            if (V == null) {
                String AFLogger2 = this.AFKeystoreWrapper.AFLogger("com.appsflyer.FacebookApplicationId");
                V = AFLogger2 != null ? StringsKt.V(AFLogger2, "fb") : null;
                if (V == null || V.length() == 0) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    V = null;
                }
            }
        }
        str = V;
        this.d = str;
        if (str == null) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
        } else {
            int i = AFa1zSDK.unregisterClient[this.unregisterClient.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        zzl.b();
                        return;
                    }
                }
            }
        }
        this.registerClient.run();
    }
}
