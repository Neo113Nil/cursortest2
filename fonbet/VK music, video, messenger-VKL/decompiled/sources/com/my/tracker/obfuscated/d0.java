package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.my.tracker.obfuscated.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.goy0;
import xsna.hoy0;
import xsna.ioy0;
import xsna.joy0;
import xsna.koy0;
import xsna.xdu;
import xsna.yar;

/* loaded from: classes.dex */
public final class d0 {
    private static final c0.k a = new c0.k(null, Collections.EMPTY_LIST);
    public static int b = 5;

    private List a(Context context) {
        c0.h a2;
        if (Build.VERSION.SDK_INT < 29) {
            if (!m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                x2.a("EnvironmentParamsDataProvider: can't access information");
                return Collections.EMPTY_LIST;
            }
        } else if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            x2.a("EnvironmentParamsDataProvider: can't access information");
            return Collections.EMPTY_LIST;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return Collections.EMPTY_LIST;
            }
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null && !allCellInfo.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoCdma) {
                            arrayList.add(a((CellInfoCdma) cellInfo));
                        } else if (cellInfo instanceof CellInfoGsm) {
                            arrayList.add(a((CellInfoGsm) cellInfo));
                        } else if (cellInfo instanceof CellInfoLte) {
                            arrayList.add(a((CellInfoLte) cellInfo));
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            arrayList.add(a((CellInfoWcdma) cellInfo));
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 29 && goy0.a(cellInfo)) {
                                arrayList.add(a(hoy0.a(cellInfo)));
                            } else if (i >= 29 && ioy0.a(cellInfo)) {
                                arrayList.add(a(joy0.a(cellInfo)));
                            }
                        }
                    }
                }
                if (arrayList.isEmpty() && (a2 = a(telephonyManager)) != null) {
                    arrayList.add(a2);
                }
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        } catch (Throwable th) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
            return Collections.EMPTY_LIST;
        }
    }

    private c0.k c(Context context) {
        c0.j jVar;
        if (!m1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    String ssid = connectionInfo.getSSID();
                    String bssid = connectionInfo.getBSSID();
                    jVar = new c0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                } else {
                    jVar = null;
                }
                if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context) && !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    return new c0.k(jVar, Collections.EMPTY_LIST);
                }
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Collections.sort(scanResults, new koy0());
                    int min = Math.min(scanResults.size(), b);
                    ArrayList arrayList = new ArrayList(min);
                    for (int i = 0; i < min; i++) {
                        ScanResult scanResult = scanResults.get(i);
                        String str = scanResult.SSID;
                        String str2 = scanResult.BSSID;
                        if (str == null) {
                            str = "<null>";
                        }
                        if (str2 == null) {
                            str2 = "<null>";
                        }
                        arrayList.add(new c0.a(str, str2, scanResult.level));
                    }
                    return new c0.k(jVar, arrayList);
                }
                return new c0.k(jVar, Collections.EMPTY_LIST);
            }
            return a;
        } catch (Throwable th) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            return a;
        }
    }

    public c0 b(Context context) {
        return new c0(a(context), c(context));
    }

    private c0.c a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new c0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    private c0.d a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        return new c0.d(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());
    }

    private c0.e a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        return new c0.e(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());
    }

    private c0.i a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        return new c0.i(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    private c0.g a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity;
        CellSignalStrengthTdscdma cellSignalStrength;
        int uarfcn;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoTdscdma.getCellIdentity();
        cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        String mccString = cellIdentity.getMccString();
        String mncString = cellIdentity.getMncString();
        int cid = cellIdentity.getCid();
        int lac = cellIdentity.getLac();
        uarfcn = cellIdentity.getUarfcn();
        int cpid = cellIdentity.getCpid();
        level = cellSignalStrength.getLevel();
        dbm = cellSignalStrength.getDbm();
        asuLevel = cellSignalStrength.getAsuLevel();
        return new c0.g(mccString, mncString, cid, lac, uarfcn, cpid, level, dbm, asuLevel);
    }

    private c0.f a(CellInfoNr cellInfoNr) {
        CellIdentity cellIdentity;
        CellSignalStrength cellSignalStrength;
        String mccString;
        String mncString;
        long nci;
        int tac;
        int nrarfcn;
        int pci;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoNr.getCellIdentity();
        CellIdentityNr c = xdu.c(cellIdentity);
        cellSignalStrength = cellInfoNr.getCellSignalStrength();
        CellSignalStrengthNr a2 = yar.a(cellSignalStrength);
        mccString = c.getMccString();
        mncString = c.getMncString();
        nci = c.getNci();
        tac = c.getTac();
        nrarfcn = c.getNrarfcn();
        pci = c.getPci();
        level = a2.getLevel();
        dbm = a2.getDbm();
        asuLevel = a2.getAsuLevel();
        return new c0.f(mccString, mncString, nci, tac, nrarfcn, pci, level, dbm, asuLevel);
    }

    private c0.h a(TelephonyManager telephonyManager) {
        String str;
        String str2;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        String str3 = null;
        if (!(cellLocation instanceof GsmCellLocation)) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator)) {
            str = null;
        } else {
            try {
                str2 = networkOperator.substring(0, 3);
            } catch (Throwable unused) {
                str2 = null;
            }
            try {
                str3 = networkOperator.substring(3);
            } catch (Throwable unused2) {
                x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                str = str3;
                str3 = str2;
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                return new c0.h(str3, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
            }
            str = str3;
            str3 = str2;
        }
        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
        return new c0.h(str3, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }
}
