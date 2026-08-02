package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.AFi1nSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes.dex */
public final class AFi1mSDK extends AFi1rSDK {

    @NotNull
    private final ExecutorService AFInAppEventType;

    @NotNull
    private final Runnable AFLogger;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFi1kSDK f57490e;

    /* renamed from: v, reason: collision with root package name */
    private String f57491v;

    @NotNull
    private final AFd1sSDK values;

    /* loaded from: classes8.dex */
    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFi1kSDK.values().length];
            iArr[AFi1kSDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1kSDK.INSTAGRAM.ordinal()] = 2;
            AFInAppEventType = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1mSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull ExecutorService executorService, @NotNull AFi1kSDK aFi1kSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        super("app", r0, aFd1sSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i11 = AFi1nSDK.AFa1vSDK.AFInAppEventType[aFi1kSDK.ordinal()];
        if (i11 == 1) {
            str = "facebook";
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            str = "instagram";
        }
        this.values = aFd1sSDK;
        this.AFInAppEventType = executorService;
        this.f57490e = aFi1kSDK;
        this.AFLogger = runnable2;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private final boolean AFInAppEventType(Context context) {
        int i11 = AFa1tSDK.AFInAppEventType[this.f57490e.ordinal()];
        if (i11 == 1) {
            return values(context);
        }
        if (i11 == 2) {
            return AFInAppEventParameterName(context);
        }
        throw new Sc.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFKeystoreWrapper(Context context) {
        if (!AFInAppEventType()) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by counter.");
            return false;
        }
        String AFInAppEventParameterName = this.values.AFInAppEventParameterName("com.facebook.sdk.ApplicationId");
        String str = null;
        if (AFInAppEventParameterName == null || AFInAppEventParameterName.length() == 0) {
            AFLogger.afDebugLog("[MetaReferrer]: Facebook app id Manifest metadata is not found.");
            AFInAppEventParameterName = null;
        }
        if (AFInAppEventParameterName == null) {
            AFInAppEventParameterName = this.values.AFInAppEventType("facebook_application_id");
            if (AFInAppEventParameterName == null || AFInAppEventParameterName.length() == 0) {
                AFLogger.afDebugLog("[MetaReferrer]: Facebook app id string resource is not found.");
                AFInAppEventParameterName = null;
            }
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = this.values.AFInAppEventParameterName("com.appsflyer.FacebookApplicationId");
                if (AFInAppEventParameterName == null || AFInAppEventParameterName.length() == 0) {
                    AFLogger.afDebugLog("[MetaReferrer]: AF Facebook app id Manifest metadata is not found.");
                    AFInAppEventParameterName = null;
                }
            }
        }
        str = AFInAppEventParameterName;
        this.f57491v = str;
        if (str == null) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing Facebook app id.");
            return false;
        }
        if (AFInAppEventType(context)) {
            return true;
        }
        AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing content providers.");
        return false;
    }

    private static boolean values(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    @SuppressLint({"NewApi"})
    public final void valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFKeystoreWrapper(context)) {
            this.AFInAppEventType.execute(new v(0, this, context));
        } else {
            this.AFLogger.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0198, code lost:
    
        if (r12 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018a, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0188, code lost:
    
        if (r12 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a5, code lost:
    
        if (r12 != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AFInAppEventType(AFi1mSDK aFi1mSDK, Context context) {
        ContentProviderClient contentProviderClient;
        Uri parse;
        Uri uri;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFi1mSDK.registerClient = System.currentTimeMillis();
        aFi1mSDK.f57489d = AFi1jSDK.AFa1tSDK.STARTED;
        aFi1mSDK.addObserver(new AFi1jSDK.AnonymousClass4());
        String str3 = aFi1mSDK.f57491v;
        Intrinsics.f(str3);
        Cursor cursor = null;
        cursor = null;
        try {
            AFi1kSDK aFi1kSDK = aFi1mSDK.f57490e;
            int[] iArr = AFa1tSDK.AFInAppEventType;
            int i11 = iArr[aFi1kSDK.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (AFInAppEventParameterName(context)) {
                        AFLogger.afDebugLog("[MetaReferrer]: Found Instagram content provider");
                        parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                        uri = parse;
                    } else {
                        AFLogger.afDebugLog("[MetaReferrer]: Instagram content provider not found");
                        uri = null;
                    }
                } else {
                    throw new Sc.o();
                }
            } else if (values(context)) {
                AFLogger.afDebugLog("[MetaReferrer]: Found Facebook content provider");
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                uri = parse;
            } else {
                AFLogger.afDebugLog("[MetaReferrer]: Facebook content provider noy found");
                uri = null;
            }
            if (uri != null) {
                contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor query = contentProviderClient != null ? contentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                int columnIndex = query.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    str = query.getString(columnIndex);
                                } else {
                                    StringBuilder sb2 = new StringBuilder("[MetaReferrer]: No such column, ");
                                    sb2.append(aFi1mSDK.f57490e);
                                    sb2.append(" provider");
                                    AFLogger.afDebugLog(sb2.toString());
                                    str = null;
                                }
                                if (str != null) {
                                    StringBuilder sb3 = new StringBuilder("[MetaReferrer]: Collected ");
                                    sb3.append(aFi1mSDK.f57490e);
                                    sb3.append(" attribution data.");
                                    AFLogger.afDebugLog(sb3.toString());
                                    Map<String, Object> map = aFi1mSDK.valueOf;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put("response", DiscountCodeResponse.RESULT_OK);
                                    Map<String, Object> map2 = aFi1mSDK.valueOf;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", str);
                                    int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                    Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                    if (valueOf != null) {
                                        aFi1mSDK.valueOf.put("click_ts", Long.valueOf(valueOf.longValue()));
                                    }
                                    int columnIndex3 = query.getColumnIndex("is_ct");
                                    Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                    if (valueOf2 != null) {
                                        aFi1mSDK.valueOf.put("meta_custom", U.l(new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                    }
                                    int i12 = iArr[aFi1mSDK.f57490e.ordinal()];
                                    if (i12 == 1) {
                                        str2 = "com.facebook.katana";
                                    } else if (i12 == 2) {
                                        str2 = "com.instagram.android";
                                    } else {
                                        throw new Sc.o();
                                    }
                                    Map<String, Object> map3 = aFi1mSDK.valueOf;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFb1uSDK.values(context, str2)));
                                    Map<String, Object> map4 = aFi1mSDK.valueOf;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, str2));
                                }
                                query.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            try {
                                AFLogger.afErrorLog("[MetaReferrer]: Error while collecting Meta Install Referrer", th);
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
                    AFLogger.afDebugLog("[MetaReferrer]: Content provider returned no data");
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFi1mSDK.AFKeystoreWrapper();
        aFi1mSDK.AFLogger.run();
    }
}
