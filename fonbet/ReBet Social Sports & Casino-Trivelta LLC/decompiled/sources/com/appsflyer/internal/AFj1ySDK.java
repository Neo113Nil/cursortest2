package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
/* loaded from: classes.dex */
public final class AFj1ySDK extends AFi1cSDK {

    @NotNull
    private final AFj1zSDK AFAdRevenueData;

    @NotNull
    private final Runnable component2;

    @NotNull
    private final AFc1oSDK getCurrencyIso4217Code;

    @NotNull
    private final ExecutorService getMonetizationNetwork;

    @Nullable
    private String hashCode;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1ySDK(@NotNull AFc1oSDK aFc1oSDK, @NotNull ExecutorService executorService, @NotNull AFj1zSDK aFj1zSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        super("app", r0, aFc1oSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i10 = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i10 == 1) {
            str = "facebook";
        } else if (i10 == 2) {
            str = "instagram";
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getMonetizationNetwork = executorService;
        this.AFAdRevenueData = aFj1zSDK;
        this.component2 = runnable2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String removePrefix = currencyIso4217Code != null ? StringsKt.removePrefix(currencyIso4217Code, (CharSequence) "fb") : null;
        if (removePrefix == null || removePrefix.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            removePrefix = null;
        }
        if (removePrefix == null) {
            String revenue = this.getCurrencyIso4217Code.getRevenue("facebook_application_id");
            removePrefix = revenue != null ? StringsKt.removePrefix(revenue, (CharSequence) "fb") : null;
            if (removePrefix == null || removePrefix.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                removePrefix = null;
            }
            if (removePrefix == null) {
                String currencyIso4217Code2 = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                removePrefix = currencyIso4217Code2 != null ? StringsKt.removePrefix(currencyIso4217Code2, (CharSequence) "fb") : null;
                if (removePrefix == null || removePrefix.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    removePrefix = null;
                }
            }
        }
        str = removePrefix;
        this.hashCode = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getMediationNetwork(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getMediationNetwork(Context context) {
        int i10 = AFa1vSDK.getRevenue[this.AFAdRevenueData.ordinal()];
        if (i10 == 1) {
            return getRevenue(context);
        }
        if (i10 == 2) {
            return getCurrencyIso4217Code(context);
        }
        if (i10 == 3) {
            return component3(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.Q
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1ySDK.getRevenue(AFj1ySDK.this, context);
                }
            });
        } else {
            this.component2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0247, code lost:
    
        if (r20 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0232, code lost:
    
        r20.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0230, code lost:
    
        if (r20 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0277, code lost:
    
        if (r20 == null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:3:0x002b, B:7:0x003e, B:9:0x0044, B:15:0x0104, B:80:0x0072, B:82:0x0084, B:83:0x0089, B:84:0x008a, B:86:0x0090, B:87:0x00b5, B:88:0x00c5, B:90:0x00cb, B:91:0x00f0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1ySDK aFj1ySDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        Uri parse;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str3 = aFj1ySDK.hashCode;
        Intrinsics.checkNotNull(str3);
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.AFAdRevenueData;
            int[] iArr = AFa1vSDK.getRevenue;
            int i10 = iArr[aFj1zSDK.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component3(context)) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str3);
                        if (parse == null) {
                            contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                            try {
                                Cursor query = contentProviderClient != null ? contentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            int columnIndex = query.getColumnIndex("install_referrer");
                                            if (columnIndex != -1) {
                                                str = query.getString(columnIndex);
                                            } else {
                                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.AFAdRevenueData + " provider", false, 4, null);
                                                str = null;
                                            }
                                            if (str != null) {
                                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.AFAdRevenueData + " attribution data.", false, 4, null);
                                                Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map, "");
                                                map.put("response", "OK");
                                                Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                                map2.put("referrer", str);
                                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = query.getColumnIndex("is_ct");
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFj1ySDK.getMediationNetwork.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i11 = iArr[aFj1ySDK.AFAdRevenueData.ordinal()];
                                                if (i11 == 1) {
                                                    str2 = "com.facebook.katana";
                                                } else if (i11 == 2) {
                                                    str2 = "com.instagram.android";
                                                } else {
                                                    if (i11 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    str2 = "com.facebook.lite";
                                                }
                                                Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                                map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str2)));
                                                Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map4, "");
                                                map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str2));
                                            }
                                            query.close();
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        cursor = query;
                                        try {
                                            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.AFAdRevenueData.name() + " provider", th2, false, false, false, false, 120, null);
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th4) {
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (contentProviderClient != null) {
                                                contentProviderClient.close();
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                cursor = null;
                                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.AFAdRevenueData.name() + " provider", th2, false, false, false, false, 120, null);
                                if (cursor != null) {
                                }
                            }
                        }
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getCurrencyIso4217Code(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str3);
                    if (parse == null) {
                    }
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (getRevenue(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str3);
                if (parse == null) {
                }
            } else {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            contentProviderClient = null;
        }
        aFj1ySDK.getMediationNetwork();
        aFj1ySDK.component2.run();
    }
}
