package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
/* loaded from: classes.dex */
public final class AFj1ySDK extends AFi1cSDK {

    @NotNull
    private final AFc1oSDK AFAdRevenueData;

    @NotNull
    private final Runnable component2;

    @Nullable
    private String equals;

    @NotNull
    private final ExecutorService getCurrencyIso4217Code;

    @NotNull
    private final AFj1zSDK getMonetizationNetwork;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
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
        int i5 = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i5 == 1) {
            str = "facebook";
        } else if (i5 == 2) {
            str = "instagram";
        } else {
            if (i5 != 3) {
                throw new gf.m();
            }
            str = "facebook_lite";
        }
        this.AFAdRevenueData = aFc1oSDK;
        this.getCurrencyIso4217Code = executorService;
        this.getMonetizationNetwork = aFj1zSDK;
        this.component2 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i5 = AFa1vSDK.getRevenue[this.getMonetizationNetwork.ordinal()];
        if (i5 == 1) {
            return getMediationNetwork(context);
        }
        if (i5 == 2) {
            return AFAdRevenueData(context);
        }
        if (i5 == 3) {
            return component3(context);
        }
        throw new gf.m();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String M = currencyIso4217Code != null ? StringsKt.M(currencyIso4217Code, "fb") : null;
        if (M == null || M.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            M = null;
        }
        if (M == null) {
            String revenue = this.AFAdRevenueData.getRevenue("facebook_application_id");
            M = revenue != null ? StringsKt.M(revenue, "fb") : null;
            if (M == null || M.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                M = null;
            }
            if (M == null) {
                String currencyIso4217Code2 = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                M = currencyIso4217Code2 != null ? StringsKt.M(currencyIso4217Code2, "fb") : null;
                if (M == null || M.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    M = null;
                }
            }
        }
        str = M;
        this.equals = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.execute(new f(5, this, context));
        } else {
            this.component2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0278, code lost:
    
        if ((r10 instanceof java.util.concurrent.ExecutorService) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x024c, code lost:
    
        r10.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0243, code lost:
    
        com.appsflyer.internal.h.h((java.util.concurrent.ExecutorService) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x027b, code lost:
    
        if (r10 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0253, code lost:
    
        r10.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0241, code lost:
    
        if ((r10 instanceof java.util.concurrent.ExecutorService) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0251, code lost:
    
        if (r10 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x0100, B:122:0x0079, B:124:0x008a, B:125:0x008f, B:126:0x0090, B:128:0x0096, B:129:0x00b6, B:130:0x00c6, B:132:0x00cc, B:133:0x00ec), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMonetizationNetwork(AFj1ySDK aFj1ySDK, Context context) {
        String str;
        Throwable th2;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        ContentProviderClient contentProviderClient2;
        Cursor cursor2;
        int[] iArr;
        int i5;
        Uri parse;
        ContentProviderClient contentProviderClient3;
        Cursor cursor3;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str4 = aFj1ySDK.equals;
        Intrinsics.checkNotNull(str4);
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.getMonetizationNetwork;
            iArr = AFa1vSDK.getRevenue;
            i5 = iArr[aFj1zSDK.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
            try {
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                contentProviderClient = null;
                cursor = null;
                contentProviderClient2 = contentProviderClient;
                try {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.getMonetizationNetwork.name() + " provider", th2, false, false, false, false, 120, null);
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (contentProviderClient2 != 0) {
                            if (contentProviderClient2 instanceof AutoCloseable) {
                                contentProviderClient2.close();
                            } else if (contentProviderClient2 instanceof ExecutorService) {
                                h.h((ExecutorService) contentProviderClient2);
                            } else {
                                contentProviderClient2.release();
                            }
                        }
                    } else if (contentProviderClient2 != 0) {
                        contentProviderClient2.release();
                    }
                    aFj1ySDK.getMediationNetwork();
                    aFj1ySDK.component2.run();
                    return;
                } catch (Throwable th4) {
                    Cursor cursor4 = cursor;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (contentProviderClient2 != 0) {
                            if (contentProviderClient2 instanceof AutoCloseable) {
                                contentProviderClient2.close();
                            } else if (contentProviderClient2 instanceof ExecutorService) {
                                h.h((ExecutorService) contentProviderClient2);
                            } else {
                                contentProviderClient2.release();
                            }
                        }
                    } else if (contentProviderClient2 != 0) {
                        contentProviderClient2.release();
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            str = "Error while collecting Meta Install Referrer for ";
        }
        if (i5 == 1) {
            if (getMediationNetwork(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str4);
                if (parse == null) {
                }
                aFj1ySDK.getMediationNetwork();
                aFj1ySDK.component2.run();
                return;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1ySDK.getMediationNetwork();
            aFj1ySDK.component2.run();
            return;
        }
        if (i5 == 2) {
            if (AFAdRevenueData(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str4);
                if (parse == null) {
                }
                aFj1ySDK.getMediationNetwork();
                aFj1ySDK.component2.run();
                return;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1ySDK.getMediationNetwork();
            aFj1ySDK.component2.run();
            return;
        }
        if (i5 == 3) {
            if (component3(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str4);
                if (parse == null) {
                    ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                    try {
                        String[] strArr = {"install_referrer", "is_ct", "actual_timestamp"};
                        if (acquireUnstableContentProviderClient != null) {
                            cursor3 = acquireUnstableContentProviderClient.query(parse, strArr, null, null, null);
                            contentProviderClient3 = acquireUnstableContentProviderClient;
                        } else {
                            contentProviderClient3 = acquireUnstableContentProviderClient;
                            cursor3 = null;
                        }
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int columnIndex = cursor3.getColumnIndex("install_referrer");
                                    if (columnIndex != -1) {
                                        str2 = cursor3.getString(columnIndex);
                                    } else {
                                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.getMonetizationNetwork + " provider", false, 4, null);
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.getMonetizationNetwork + " attribution data.", false, 4, null);
                                        Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map, "");
                                        map.put("response", "OK");
                                        Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map2, "");
                                        map2.put("referrer", str2);
                                        int columnIndex2 = cursor3.getColumnIndex("actual_timestamp");
                                        Long valueOf = columnIndex2 != -1 ? Long.valueOf(cursor3.getLong(columnIndex2)) : null;
                                        if (valueOf != null) {
                                            aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(valueOf.longValue()));
                                        }
                                        int columnIndex3 = cursor3.getColumnIndex("is_ct");
                                        Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(cursor3.getInt(columnIndex3)) : null;
                                        if (valueOf2 != null) {
                                            aFj1ySDK.getMediationNetwork.put("meta_custom", n0.f(new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                        }
                                        int i10 = iArr[aFj1ySDK.getMonetizationNetwork.ordinal()];
                                        if (i10 == 1) {
                                            str3 = "com.facebook.katana";
                                        } else if (i10 == 2) {
                                            str3 = "com.instagram.android";
                                        } else if (i10 == 3) {
                                            str3 = "com.facebook.lite";
                                        } else {
                                            throw new gf.m();
                                        }
                                        Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map3, "");
                                        map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str3)));
                                        Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map4, "");
                                        map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str3));
                                    }
                                    cursor3.close();
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        if (contentProviderClient3 != null) {
                                            if (!(contentProviderClient3 instanceof AutoCloseable)) {
                                            }
                                            contentProviderClient3.close();
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th2 = th6;
                                cursor = cursor3;
                                contentProviderClient2 = contentProviderClient3;
                                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.getMonetizationNetwork.name() + " provider", th2, false, false, false, false, 120, null);
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                if (Build.VERSION.SDK_INT >= 24) {
                                }
                                aFj1ySDK.getMediationNetwork();
                                aFj1ySDK.component2.run();
                                return;
                            }
                        }
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            if (contentProviderClient3 != null) {
                                if (!(contentProviderClient3 instanceof AutoCloseable)) {
                                }
                                contentProviderClient3.close();
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        contentProviderClient = acquireUnstableContentProviderClient;
                        cursor = null;
                        contentProviderClient2 = contentProviderClient;
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.getMonetizationNetwork.name() + " provider", th2, false, false, false, false, 120, null);
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                        }
                        aFj1ySDK.getMediationNetwork();
                        aFj1ySDK.component2.run();
                        return;
                    }
                }
                aFj1ySDK.getMediationNetwork();
                aFj1ySDK.component2.run();
                return;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1ySDK.getMediationNetwork();
            aFj1ySDK.component2.run();
            return;
        }
        throw new gf.m();
    }
}
