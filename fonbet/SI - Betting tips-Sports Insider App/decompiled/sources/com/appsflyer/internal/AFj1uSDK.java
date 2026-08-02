package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFj1uSDK extends AFj1tSDK {
    final ProviderInfo getCurrencyIso4217Code;
    private final AFd1zSDK getMonetizationNetwork;

    public AFj1uSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMonetizationNetwork = aFd1zSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e7) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e7, false, true, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        this.getMonetizationNetwork.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.5
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
            
                if ((r1 instanceof java.util.concurrent.ExecutorService) != false) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00a8, code lost:
            
                r1.release();
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00a2, code lost:
            
                com.appsflyer.internal.h.h((java.util.concurrent.ExecutorService) r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
            
                if ((r1 instanceof java.util.concurrent.ExecutorService) != false) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x00e3, code lost:
            
                if ((r1 instanceof java.util.concurrent.ExecutorService) != false) goto L30;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor cursor;
                AFj1uSDK aFj1uSDK = AFj1uSDK.this;
                aFj1uSDK.component1 = System.currentTimeMillis();
                aFj1uSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
                aFj1uSDK.addObserver(new AFj1tSDK.AnonymousClass1());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFj1uSDK.this.getCurrencyIso4217Code.authority);
                sb2.append("/transaction_id");
                Uri parse = Uri.parse(sb2.toString());
                ContentProviderClient B_ = AFj1uSDK.B_(context, parse);
                if (B_ != 0) {
                    try {
                        try {
                            try {
                                try {
                                    StringBuilder sb3 = new StringBuilder("app_id=");
                                    sb3.append(context.getPackageName());
                                    cursor = B_.query(parse, null, sb3.toString(), null, null);
                                    if (Build.VERSION.SDK_INT < 24) {
                                        B_.release();
                                    } else if (B_ instanceof AutoCloseable) {
                                        B_.close();
                                    } else if (B_ instanceof ExecutorService) {
                                        h.h((ExecutorService) B_);
                                    } else {
                                        B_.release();
                                    }
                                } catch (RemoteException e7) {
                                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e7, false, true, false);
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        if (!(B_ instanceof AutoCloseable)) {
                                        }
                                        B_.close();
                                        cursor = null;
                                        if (cursor == null) {
                                        }
                                        AFj1uSDK aFj1uSDK2 = AFj1uSDK.this;
                                        aFj1uSDK2.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK2.getCurrencyIso4217Code).packageName)));
                                        AFj1uSDK aFj1uSDK3 = AFj1uSDK.this;
                                        aFj1uSDK3.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK3.getCurrencyIso4217Code).packageName));
                                        AFj1uSDK.this.getMediationNetwork();
                                    }
                                    B_.release();
                                    cursor = null;
                                    if (cursor == null) {
                                    }
                                    AFj1uSDK aFj1uSDK22 = AFj1uSDK.this;
                                    aFj1uSDK22.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK22.getCurrencyIso4217Code).packageName)));
                                    AFj1uSDK aFj1uSDK32 = AFj1uSDK.this;
                                    aFj1uSDK32.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK32.getCurrencyIso4217Code).packageName));
                                    AFj1uSDK.this.getMediationNetwork();
                                }
                            } catch (Throwable th2) {
                                AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th2, false, true, false);
                                if (Build.VERSION.SDK_INT >= 24) {
                                    if (!(B_ instanceof AutoCloseable)) {
                                    }
                                    B_.close();
                                    cursor = null;
                                    if (cursor == null) {
                                    }
                                    AFj1uSDK aFj1uSDK222 = AFj1uSDK.this;
                                    aFj1uSDK222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK222.getCurrencyIso4217Code).packageName)));
                                    AFj1uSDK aFj1uSDK322 = AFj1uSDK.this;
                                    aFj1uSDK322.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK322.getCurrencyIso4217Code).packageName));
                                    AFj1uSDK.this.getMediationNetwork();
                                }
                                B_.release();
                                cursor = null;
                                if (cursor == null) {
                                }
                                AFj1uSDK aFj1uSDK2222 = AFj1uSDK.this;
                                aFj1uSDK2222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK2222.getCurrencyIso4217Code).packageName)));
                                AFj1uSDK aFj1uSDK3222 = AFj1uSDK.this;
                                aFj1uSDK3222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK3222.getCurrencyIso4217Code).packageName));
                                AFj1uSDK.this.getMediationNetwork();
                            }
                        } catch (DeadObjectException e9) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e9, false, true, false);
                            if (Build.VERSION.SDK_INT >= 24) {
                                if (!(B_ instanceof AutoCloseable)) {
                                }
                                B_.close();
                                cursor = null;
                                if (cursor == null) {
                                }
                                AFj1uSDK aFj1uSDK22222 = AFj1uSDK.this;
                                aFj1uSDK22222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK22222.getCurrencyIso4217Code).packageName)));
                                AFj1uSDK aFj1uSDK32222 = AFj1uSDK.this;
                                aFj1uSDK32222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK32222.getCurrencyIso4217Code).packageName));
                                AFj1uSDK.this.getMediationNetwork();
                            }
                            B_.release();
                            cursor = null;
                            if (cursor == null) {
                            }
                            AFj1uSDK aFj1uSDK222222 = AFj1uSDK.this;
                            aFj1uSDK222222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK222222.getCurrencyIso4217Code).packageName)));
                            AFj1uSDK aFj1uSDK322222 = AFj1uSDK.this;
                            aFj1uSDK322222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK322222.getCurrencyIso4217Code).packageName));
                            AFj1uSDK.this.getMediationNetwork();
                        }
                        if (cursor == null) {
                            int columnIndex = cursor.getColumnIndex("transaction_id");
                            if (columnIndex == -1) {
                                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                                AFj1uSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1uSDK.this.getMediationNetwork.put("response", "OK");
                                if (cursor.moveToFirst()) {
                                    String string = cursor.getString(columnIndex);
                                    cursor.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1uSDK.this.getMediationNetwork.put("referrer", string);
                                    }
                                }
                            }
                            cursor.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1uSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFj1uSDK aFj1uSDK2222222 = AFj1uSDK.this;
                        aFj1uSDK2222222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK2222222.getCurrencyIso4217Code).packageName)));
                        AFj1uSDK aFj1uSDK3222222 = AFj1uSDK.this;
                        aFj1uSDK3222222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK3222222.getCurrencyIso4217Code).packageName));
                        AFj1uSDK.this.getMediationNetwork();
                    } catch (Throwable th3) {
                        if (Build.VERSION.SDK_INT < 24) {
                            B_.release();
                        } else if (B_ instanceof AutoCloseable) {
                            B_.close();
                        } else if (B_ instanceof ExecutorService) {
                            h.h((ExecutorService) B_);
                        } else {
                            B_.release();
                        }
                        throw th3;
                    }
                }
                cursor = null;
                if (cursor == null) {
                }
                AFj1uSDK aFj1uSDK22222222 = AFj1uSDK.this;
                aFj1uSDK22222222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK22222222.getCurrencyIso4217Code).packageName)));
                AFj1uSDK aFj1uSDK32222222 = AFj1uSDK.this;
                aFj1uSDK32222222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK32222222.getCurrencyIso4217Code).packageName));
                AFj1uSDK.this.getMediationNetwork();
            }
        });
    }
}
