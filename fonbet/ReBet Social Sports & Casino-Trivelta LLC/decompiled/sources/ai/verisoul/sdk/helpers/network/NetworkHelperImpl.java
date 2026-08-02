package ai.verisoul.sdk.helpers.network;

import ai.verisoul.sdk.logger.Logger;
import ai.verisoul.sdk.utils.ConnectivityUtils;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lai/verisoul/sdk/helpers/network/NetworkHelperImpl;", "Lai/verisoul/sdk/helpers/network/NetworkHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "logTag", "", "collect", "Lai/verisoul/sdk/helpers/network/NetworkData;", "getCellInfoList", "", "Lai/verisoul/sdk/helpers/network/CellInfoData;", "getWifiScanList", "Lai/verisoul/sdk/helpers/network/WifiScanData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkHelperImpl.kt\nai/verisoul/sdk/helpers/network/NetworkHelperImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1549#2:282\n1620#2,3:283\n1#3:286\n*S KotlinDebug\n*F\n+ 1 NetworkHelperImpl.kt\nai/verisoul/sdk/helpers/network/NetworkHelperImpl\n*L\n44#1:282\n44#1:283,3\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkHelperImpl implements NetworkHelper {

    @NotNull
    private final Context context;

    @NotNull
    private final String logTag;

    public NetworkHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + NetworkHelperImpl.class.getSimpleName() + "]";
    }

    @Override // ai.verisoul.sdk.helpers.network.NetworkHelper
    @NotNull
    public NetworkData collect() {
        List emptyList;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        if (!ConnectivityUtils.INSTANCE.hasNetworkStatePermission(this.context)) {
            Boolean bool = Boolean.FALSE;
            NetworkData networkData = new NetworkData(false, bool, bool, null, null, null, null, "ACCESS_NETWORK_STATE permission not granted. Returning limited network data.", null, null, 888, null);
            Logger logger = Logger.INSTANCE;
            logger.error(this.logTag, "ACCESS_NETWORK_STATE permission not granted. Returning limited network data.");
            logger.metricLog(this.logTag, "network_duration", System.currentTimeMillis() - currentTimeMillis);
            return networkData;
        }
        Object systemService = this.context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        boolean z10 = false;
        boolean z11 = networkCapabilities != null;
        boolean z12 = networkCapabilities != null && networkCapabilities.hasTransport(1);
        if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
            z10 = true;
        }
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            Intrinsics.checkNotNullExpressionValue(list, "list(...)");
            emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                emptyList.add(((NetworkInterface) it.next()).getName());
            }
        } catch (Exception e10) {
            Logger.INSTANCE.error("[NetworkHelper]", "Error fetching network interfaces: " + e10.getMessage());
            emptyList = CollectionsKt.emptyList();
        }
        List list2 = emptyList;
        if (AbstractC5338c.checkSelfPermission(this.context, "android.permission.READ_PHONE_STATE") != 0) {
            NetworkData networkData2 = new NetworkData(z11, Boolean.valueOf(z12), Boolean.valueOf(z10), null, null, null, list2, "READ_PHONE_STATE permission not granted. Returning limited network data.", null, null, 824, null);
            Logger logger2 = Logger.INSTANCE;
            String str2 = this.logTag;
            String errorMessage = networkData2.getErrorMessage();
            Intrinsics.checkNotNull(errorMessage);
            logger2.error(str2, errorMessage);
            logger2.metricLog(this.logTag, "network_duration", System.currentTimeMillis() - currentTimeMillis);
            return networkData2;
        }
        Object systemService2 = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService2;
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        String simOperatorName = telephonyManager.getSimOperatorName();
        int networkType = telephonyManager.getNetworkType();
        if (networkType == 1 || networkType == 2) {
            str = "2G";
        } else {
            if (networkType != 3) {
                if (networkType == 13) {
                    str = "LTE";
                } else if (networkType != 20) {
                    switch (networkType) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            str = "Unknown";
                            break;
                    }
                } else {
                    str = "5G";
                }
            }
            str = "3G";
        }
        NetworkData networkData3 = new NetworkData(z11, Boolean.valueOf(z12), Boolean.valueOf(z10), str, networkOperatorName, simOperatorName, list2, null, getCellInfoList(this.context), getWifiScanList(this.context));
        Logger.INSTANCE.metricLog(this.logTag, "network_duration", System.currentTimeMillis() - currentTimeMillis);
        return networkData3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ai.verisoul.sdk.helpers.network.CellInfoData] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ai.verisoul.sdk.helpers.network.CellInfoData] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ai.verisoul.sdk.helpers.network.CellInfoData] */
    /* JADX WARN: Type inference failed for: r7v9, types: [ai.verisoul.sdk.helpers.network.CellInfoData] */
    @SuppressLint({"MissingPermission"})
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<CellInfoData> getCellInfoList(@NotNull Context context) {
        List<CellInfo> allCellInfo;
        Integer num;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            ArrayList arrayList = new ArrayList();
            if (AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo instanceof CellInfoLte) {
                        CellIdentityLte cellIdentity = ((CellInfoLte) cellInfo).getCellIdentity();
                        Intrinsics.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
                        int i10 = Build.VERSION.SDK_INT;
                        num = new CellInfoData("LTE", i10 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i10 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), Integer.valueOf(cellIdentity.getCi()), Integer.valueOf(cellIdentity.getTac()), Integer.valueOf(cellIdentity.getPci()), i10 >= 28 ? Integer.valueOf(cellIdentity.getEarfcn()) : null, Integer.valueOf(((CellInfoLte) cellInfo).getCellSignalStrength().getDbm()));
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
                        Intrinsics.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
                        int i11 = Build.VERSION.SDK_INT;
                        num = new CellInfoData("GSM", i11 >= 28 ? cellIdentity2.getMccString() : String.valueOf(cellIdentity2.getMcc()), i11 >= 28 ? cellIdentity2.getMncString() : String.valueOf(cellIdentity2.getMnc()), Integer.valueOf(cellIdentity2.getCid()), Integer.valueOf(cellIdentity2.getLac()), null, i11 >= 28 ? Integer.valueOf(cellIdentity2.getArfcn()) : null, Integer.valueOf(((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm()));
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellIdentityWcdma cellIdentity3 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        Intrinsics.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
                        int i12 = Build.VERSION.SDK_INT;
                        num = new CellInfoData("WCDMA", i12 >= 28 ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), i12 >= 28 ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()), Integer.valueOf(cellIdentity3.getCid()), Integer.valueOf(cellIdentity3.getLac()), Integer.valueOf(cellIdentity3.getPsc()), i12 >= 28 ? Integer.valueOf(cellIdentity3.getUarfcn()) : null, Integer.valueOf(((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm()));
                    } else {
                        if (Build.VERSION.SDK_INT >= 29 && Intrinsics.areEqual(cellInfo.getClass().getSimpleName(), "CellInfoNr")) {
                            try {
                                Object invoke = cellInfo.getClass().getMethod("getCellIdentity", null).invoke(cellInfo, null);
                                Object invoke2 = invoke.getClass().getMethod("getMccString", null).invoke(invoke, null);
                                String str = invoke2 instanceof String ? (String) invoke2 : null;
                                Object invoke3 = invoke.getClass().getMethod("getMncString", null).invoke(invoke, null);
                                String str2 = invoke3 instanceof String ? (String) invoke3 : null;
                                Object invoke4 = invoke.getClass().getMethod("getNci", null).invoke(invoke, null);
                                Long l10 = invoke4 instanceof Long ? (Long) invoke4 : null;
                                Object invoke5 = invoke.getClass().getMethod("getTac", null).invoke(invoke, null);
                                Integer num2 = invoke5 instanceof Integer ? (Integer) invoke5 : null;
                                Object invoke6 = invoke.getClass().getMethod("getPci", null).invoke(invoke, null);
                                Integer num3 = invoke6 instanceof Integer ? (Integer) invoke6 : null;
                                Object invoke7 = invoke.getClass().getMethod("getNrarfcn", null).invoke(invoke, null);
                                Integer num4 = invoke7 instanceof Integer ? (Integer) invoke7 : null;
                                Object invoke8 = cellInfo.getClass().getMethod("getCellSignalStrength", null).invoke(cellInfo, null);
                                Object invoke9 = invoke8.getClass().getMethod("getDbm", null).invoke(invoke8, null);
                                num = new CellInfoData("NR", str, str2, l10 != null ? Integer.valueOf((int) l10.longValue()) : null, num2, num3, num4, invoke9 instanceof Integer ? (Integer) invoke9 : null);
                            } catch (Exception unused) {
                            }
                        }
                        if (r6 == null) {
                            arrayList.add(r6);
                        }
                    }
                    r6 = num;
                    if (r6 == null) {
                    }
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Logger logger = Logger.INSTANCE;
            String str3 = this.logTag;
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            logger.error(str3, message);
            return CollectionsKt.emptyList();
        }
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final List<WifiScanData> getWifiScanList(@NotNull Context context) {
        List<ScanResult> scanResults;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService;
            ArrayList arrayList = new ArrayList();
            if ((AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0) && (scanResults = wifiManager.getScanResults()) != null) {
                for (ScanResult scanResult : scanResults) {
                    String SSID = scanResult.SSID;
                    Intrinsics.checkNotNullExpressionValue(SSID, "SSID");
                    String BSSID = scanResult.BSSID;
                    Intrinsics.checkNotNullExpressionValue(BSSID, "BSSID");
                    arrayList.add(new WifiScanData(SSID, BSSID, scanResult.level, scanResult.frequency));
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Logger logger = Logger.INSTANCE;
            String str = this.logTag;
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            logger.error(str, message);
            return CollectionsKt.emptyList();
        }
    }
}
