package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1ySDK;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class AFi1cSDK extends AFi1fSDK {
    private final Runnable component3;
    private String equals;
    private final AFi1eSDK getCurrencyIso4217Code;
    private final AFc1kSDK getMediationNetwork;
    private final ExecutorService getRevenue;

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!getMonetizationNetwork(context)) {
            this.component3.run();
        } else {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1cSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1cSDK.getMonetizationNetwork(AFi1cSDK.this, context);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code(FacebookSdk.APPLICATION_ID_PROPERTY);
        String str = null;
        String removePrefix = currencyIso4217Code != null ? StringsKt.removePrefix(currencyIso4217Code, (CharSequence) "fb") : null;
        String str2 = removePrefix;
        if (str2 == null || str2.length() == 0) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            removePrefix = null;
        }
        if (removePrefix == null) {
            String mediationNetwork = this.getMediationNetwork.getMediationNetwork("facebook_application_id");
            removePrefix = mediationNetwork != null ? StringsKt.removePrefix(mediationNetwork, (CharSequence) "fb") : null;
            String str3 = removePrefix;
            if (str3 == null || str3.length() == 0) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                removePrefix = null;
            }
            if (removePrefix == null) {
                String currencyIso4217Code2 = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                removePrefix = currencyIso4217Code2 != null ? StringsKt.removePrefix(currencyIso4217Code2, (CharSequence) "fb") : null;
                String str4 = removePrefix;
                if (str4 == null || str4.length() == 0) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    removePrefix = null;
                }
            }
        }
        str = removePrefix;
        this.equals = str;
        if (str == null) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (AFAdRevenueData(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private final boolean AFAdRevenueData(Context context) {
        int i = AFa1zSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i == 1) {
            return getCurrencyIso4217Code(context);
        }
        if (i == 2) {
            return getMediationNetwork(context);
        }
        if (i == 3) {
            return component3(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1cSDK(AFc1kSDK aFc1kSDK, ExecutorService executorService, AFi1eSDK aFi1eSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFc1kSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFi1eSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFi1aSDK.AFa1tSDK.getRevenue[aFi1eSDK.ordinal()];
        if (i == 1) {
            str = AccessToken.DEFAULT_GRAPH_DOMAIN;
        } else if (i == 2) {
            str = FacebookSdk.INSTAGRAM;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = executorService;
        this.getCurrencyIso4217Code = aFi1eSDK;
        this.component3 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0262, code lost:
    
        if (r24 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024b, code lost:
    
        if (r24 != null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115 A[Catch: all -> 0x026f, TRY_LEAVE, TryCatch #4 {all -> 0x026f, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x0115, B:84:0x0078, B:86:0x008d, B:87:0x0092, B:88:0x0093, B:90:0x0099, B:91:0x00be, B:92:0x00d2, B:94:0x00d8, B:95:0x00fd), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a9 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMonetizationNetwork(AFi1cSDK aFi1cSDK, Context context) {
        String str;
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        int i;
        Uri parse;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aFi1cSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFi1cSDK.areAllFieldsValid = System.currentTimeMillis();
        aFi1cSDK.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        aFi1cSDK.addObserver(new AFj1ySDK.AnonymousClass2());
        String str4 = aFi1cSDK.equals;
        Intrinsics.checkNotNull(str4);
        try {
            i = AFa1zSDK.getMonetizationNetwork[aFi1cSDK.getCurrencyIso4217Code.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
        } catch (Throwable th2) {
            th = th2;
            str = "Error while collecting Meta Install Referrer for ";
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component3(context)) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str4);
                        if (parse == null) {
                            contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                            try {
                                Cursor query = contentProviderClient != null ? contentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            int columnIndex = query.getColumnIndex("install_referrer");
                                            if (columnIndex != -1) {
                                                str2 = query.getString(columnIndex);
                                            } else {
                                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "No such column, " + aFi1cSDK.getCurrencyIso4217Code + " provider", false, 4, null);
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Collected " + aFi1cSDK.getCurrencyIso4217Code + " attribution data.", false, 4, null);
                                                Map<String, Object> map = aFi1cSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map, "");
                                                map.put("response", "OK");
                                                Map<String, Object> map2 = aFi1cSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                                map2.put("referrer", str2);
                                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFi1cSDK.AFAdRevenueData.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = query.getColumnIndex("is_ct");
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFi1cSDK.AFAdRevenueData.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i2 = AFa1zSDK.getMonetizationNetwork[aFi1cSDK.getCurrencyIso4217Code.ordinal()];
                                                if (i2 == 1) {
                                                    str3 = "com.facebook.katana";
                                                } else if (i2 == 2) {
                                                    str3 = "com.instagram.android";
                                                } else {
                                                    if (i2 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    str3 = "com.facebook.lite";
                                                }
                                                Map<String, Object> map3 = aFi1cSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                                map3.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, str3)));
                                                Map<String, Object> map4 = aFi1cSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map4, "");
                                                map4.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, str3));
                                            }
                                            query.close();
                                        }
                                    } catch (Throwable th3) {
                                        cursor = query;
                                        th = th3;
                                        try {
                                            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, str + aFi1cSDK.getCurrencyIso4217Code.name() + " provider", th, false, false, false, false, 120, null);
                                        } finally {
                                            Cursor cursor2 = cursor;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (contentProviderClient != null) {
                                                contentProviderClient.close();
                                            }
                                        }
                                    }
                                }
                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = null;
                            }
                        }
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getMediationNetwork(context)) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str4);
                    if (parse == null) {
                    }
                } else {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (getCurrencyIso4217Code(context)) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str4);
                if (parse == null) {
                }
            } else {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            cursor = null;
            contentProviderClient = null;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, str + aFi1cSDK.getCurrencyIso4217Code.name() + " provider", th, false, false, false, false, 120, null);
        }
        aFi1cSDK.getMonetizationNetwork();
        aFi1cSDK.component3.run();
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFi1eSDK.values().length];
            try {
                iArr[AFi1eSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1eSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1eSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }
}
