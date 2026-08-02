package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1zSDK;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import io.sentry.protocol.App;
import io.sentry.protocol.Response;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class AFj1vSDK extends AFi1bSDK {
    private final Runnable areAllFieldsValid;
    private final AFd1rSDK getCurrencyIso4217Code;
    private final ExecutorService getMediationNetwork;
    private final AFj1ySDK getMonetizationNetwork;
    private String toString;

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!getMediationNetwork(context)) {
            this.areAllFieldsValid.run();
        } else {
            this.getMediationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1vSDK.getRevenue(AFj1vSDK.this, context);
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
    private final boolean getMediationNetwork(Context context) {
        if (!AFAdRevenueData()) {
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork(FacebookSdk.APPLICATION_ID_PROPERTY);
        String str = null;
        String removePrefix = monetizationNetwork != null ? StringsKt.removePrefix(monetizationNetwork, (CharSequence) "fb") : null;
        String str2 = removePrefix;
        if (str2 == null || str2.length() == 0) {
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            removePrefix = null;
        }
        if (removePrefix == null) {
            String AFAdRevenueData = this.getCurrencyIso4217Code.AFAdRevenueData("facebook_application_id");
            removePrefix = AFAdRevenueData != null ? StringsKt.removePrefix(AFAdRevenueData, (CharSequence) "fb") : null;
            String str3 = removePrefix;
            if (str3 == null || str3.length() == 0) {
                AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                removePrefix = null;
            }
            if (removePrefix == null) {
                String monetizationNetwork2 = this.getCurrencyIso4217Code.getMonetizationNetwork("com.appsflyer.FacebookApplicationId");
                removePrefix = monetizationNetwork2 != null ? StringsKt.removePrefix(monetizationNetwork2, (CharSequence) "fb") : null;
                String str4 = removePrefix;
                if (str4 == null || str4.length() == 0) {
                    AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    removePrefix = null;
                }
            }
        }
        str = removePrefix;
        this.toString = str;
        if (str == null) {
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getRevenue(context)) {
            return true;
        }
        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private final boolean getRevenue(Context context) {
        int i = AFa1zSDK.AFAdRevenueData[this.getMonetizationNetwork.ordinal()];
        if (i == 1) {
            return getCurrencyIso4217Code(context);
        }
        if (i == 2) {
            return AFAdRevenueData(context);
        }
        if (i == 3) {
            return areAllFieldsValid(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean areAllFieldsValid(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1vSDK(AFd1rSDK aFd1rSDK, ExecutorService executorService, AFj1ySDK aFj1ySDK, Runnable runnable, Runnable runnable2) {
        super(App.TYPE, r0, aFd1rSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFj1zSDK.AFa1uSDK.getRevenue[aFj1ySDK.ordinal()];
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
        this.getCurrencyIso4217Code = aFd1rSDK;
        this.getMediationNetwork = executorService;
        this.getMonetizationNetwork = aFj1ySDK;
        this.areAllFieldsValid = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0254, code lost:
    
        if (r24 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023d, code lost:
    
        if (r24 != null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112 A[Catch: all -> 0x0261, TRY_LEAVE, TryCatch #0 {all -> 0x0261, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x0112, B:83:0x0077, B:85:0x008c, B:86:0x0091, B:87:0x0092, B:89:0x0098, B:90:0x00bc, B:91:0x00d0, B:93:0x00d6, B:94:0x00fa), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0299 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1vSDK aFj1vSDK, Context context) {
        String str;
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        Uri parse;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aFj1vSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1vSDK.component4 = System.currentTimeMillis();
        aFj1vSDK.component2 = AFj1qSDK.AFa1vSDK.STARTED;
        aFj1vSDK.addObserver(new AFj1qSDK.AnonymousClass3());
        String str4 = aFj1vSDK.toString;
        Intrinsics.checkNotNull(str4);
        try {
            int i = AFa1zSDK.AFAdRevenueData[aFj1vSDK.getMonetizationNetwork.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
            try {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (areAllFieldsValid(context)) {
                            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
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
                                                    AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "No such column, " + aFj1vSDK.getMonetizationNetwork + " provider", false, 4, null);
                                                    str2 = null;
                                                }
                                                if (str2 != null) {
                                                    AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Collected " + aFj1vSDK.getMonetizationNetwork + " attribution data.", false, 4, null);
                                                    Map<String, Object> map = aFj1vSDK.AFAdRevenueData;
                                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                                    map.put(Response.TYPE, "OK");
                                                    Map<String, Object> map2 = aFj1vSDK.AFAdRevenueData;
                                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                                    map2.put("referrer", str2);
                                                    int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                    Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                    if (valueOf != null) {
                                                        aFj1vSDK.AFAdRevenueData.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                    }
                                                    int columnIndex3 = query.getColumnIndex("is_ct");
                                                    Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                    if (valueOf2 != null) {
                                                        aFj1vSDK.AFAdRevenueData.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                    }
                                                    int i2 = AFa1zSDK.AFAdRevenueData[aFj1vSDK.getMonetizationNetwork.ordinal()];
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
                                                    Map<String, Object> map3 = aFj1vSDK.AFAdRevenueData;
                                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                                    map3.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, str3)));
                                                    Map<String, Object> map4 = aFj1vSDK.AFAdRevenueData;
                                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                                    map4.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, str3));
                                                }
                                                query.close();
                                            }
                                        } catch (Throwable th2) {
                                            cursor = query;
                                            th = th2;
                                            try {
                                                AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, str + aFj1vSDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
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
                                    AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                    if (query != null) {
                                        query.close();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor = null;
                                }
                            }
                        } else {
                            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                            parse = null;
                            if (parse == null) {
                            }
                        }
                    } else if (AFAdRevenueData(context)) {
                        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                        parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str4);
                        if (parse == null) {
                        }
                    } else {
                        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getCurrencyIso4217Code(context)) {
                    AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                    parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str4);
                    if (parse == null) {
                    }
                } else {
                    AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                cursor = null;
                contentProviderClient = null;
                AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.META_REFERRER, str + aFj1vSDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
            }
        } catch (Throwable th5) {
            th = th5;
            str = "Error while collecting Meta Install Referrer for ";
        }
        aFj1vSDK.getRevenue();
        aFj1vSDK.areAllFieldsValid.run();
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFj1ySDK.values().length];
            try {
                iArr[AFj1ySDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1ySDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1ySDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFAdRevenueData = iArr;
        }
    }
}
