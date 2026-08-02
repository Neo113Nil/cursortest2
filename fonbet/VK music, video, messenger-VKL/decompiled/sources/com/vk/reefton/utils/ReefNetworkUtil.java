package com.vk.reefton.utils;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.reefton.dto.network.ReefNetworkType;
import java.util.Collections;
import java.util.List;
import kotlin.text.Regex;
import xsna.asp;
import xsna.dnf0;
import xsna.eof0;
import xsna.epx;
import xsna.fnf0;
import xsna.hof0;
import xsna.kjt;
import xsna.rof0;
import xsna.sof0;
import xsna.tof0;
import xsna.zk10;
import xsna.zrp;

/* compiled from: ReefNetworkUtil.kt */
@SuppressLint({"MissingPermission"})
/* loaded from: classes5.dex */
public final class ReefNetworkUtil {
    public final hof0 a;
    public final fnf0 b;
    public final SubscriptionManager c;
    public final ConnectivityManager d;
    public final TelephonyManager e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReefNetworkUtil.kt */
    public static final class NetworkType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkType[] $VALUES;
        public static final NetworkType CELLULAR_2G;
        public static final NetworkType CELLULAR_3G;
        public static final NetworkType CELLULAR_4G;
        public static final NetworkType CELLULAR_UNKNOWN;
        public static final NetworkType OFFLINE;
        public static final NetworkType OTHER;
        public static final NetworkType WIFI;

        static {
            NetworkType networkType = new NetworkType("OFFLINE", 0);
            OFFLINE = networkType;
            NetworkType networkType2 = new NetworkType("WIFI", 1);
            WIFI = networkType2;
            NetworkType networkType3 = new NetworkType("CELLULAR_UNKNOWN", 2);
            CELLULAR_UNKNOWN = networkType3;
            NetworkType networkType4 = new NetworkType("CELLULAR_2G", 3);
            CELLULAR_2G = networkType4;
            NetworkType networkType5 = new NetworkType("CELLULAR_3G", 4);
            CELLULAR_3G = networkType5;
            NetworkType networkType6 = new NetworkType("CELLULAR_4G", 5);
            CELLULAR_4G = networkType6;
            NetworkType networkType7 = new NetworkType(NativeAdContent.ViewTag.OTHER, 6);
            OTHER = networkType7;
            NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6, networkType7};
            $VALUES = networkTypeArr;
            $ENTRIES = new asp(networkTypeArr);
        }

        public NetworkType() {
            throw null;
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        public static NetworkType[] values() {
            return (NetworkType[]) $VALUES.clone();
        }
    }

    public ReefNetworkUtil(hof0 hof0Var, fnf0 fnf0Var, SubscriptionManager subscriptionManager, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        this.a = hof0Var;
        this.b = fnf0Var;
        this.c = subscriptionManager;
        this.d = connectivityManager;
        this.e = telephonyManager;
    }

    public static sof0 d(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        Integer num;
        Integer num2;
        int asuLevel = cellSignalStrengthWcdma.getAsuLevel();
        int level = cellSignalStrengthWcdma.getLevel();
        int dbm = cellSignalStrengthWcdma.getDbm();
        Integer valueOf = Integer.valueOf(asuLevel);
        Integer valueOf2 = Integer.valueOf(level);
        Integer valueOf3 = Integer.valueOf(dbm);
        try {
            kjt.a aVar = new kjt.a(Regex.d(new Regex("(ss|rscp)=(-?\\d+)"), cellSignalStrengthWcdma.toString()));
            num = null;
            num2 = null;
            while (aVar.hasNext()) {
                try {
                    zk10 zk10Var = (zk10) aVar.next();
                    String str = zk10Var.b().get(1);
                    String str2 = zk10Var.b().get(2);
                    if (epx.f(str, "ss")) {
                        num = Integer.valueOf(Integer.parseInt(str2));
                    } else if (epx.f(str, "rscp")) {
                        num2 = Integer.valueOf(Integer.parseInt(str2));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            num = null;
            num2 = null;
        }
        return new sof0(valueOf, valueOf2, valueOf3, null, null, (num == null && num2 == null) ? null : new eof0(num, num2), 24);
    }

    @SuppressLint({"NewApi"})
    public final dnf0 a(CellInfo cellInfo) {
        boolean isRegistered = cellInfo.isRegistered();
        long timeStamp = cellInfo.getTimeStamp();
        fnf0 fnf0Var = this.b;
        int cellConnectionStatus = fnf0Var.a() >= 28 ? cellInfo.getCellConnectionStatus() : 0;
        if (cellInfo instanceof CellInfoGsm) {
            CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
            return new dnf0(ReefNetworkType.GPRS, Integer.valueOf(cellIdentity.getMcc()), Integer.valueOf(cellIdentity.getMnc()), Integer.valueOf(cellIdentity.getLac()), Long.valueOf(cellIdentity.getCid()), Integer.valueOf(fnf0Var.a() >= 24 ? cellIdentity.getArfcn() : -1), (Integer) null, (Integer) null, isRegistered, timeStamp, cellConnectionStatus, Collections.singletonList(e(cellInfo)), 448);
        }
        if (cellInfo instanceof CellInfoWcdma) {
            CellIdentityWcdma cellIdentity2 = ((CellInfoWcdma) cellInfo).getCellIdentity();
            return new dnf0(ReefNetworkType.WCDMA_UMTS, Integer.valueOf(cellIdentity2.getMcc()), Integer.valueOf(cellIdentity2.getMnc()), Integer.valueOf(cellIdentity2.getLac()), Long.valueOf(cellIdentity2.getCid()), Integer.valueOf(fnf0Var.a() >= 24 ? cellIdentity2.getUarfcn() : -1), Integer.valueOf(fnf0Var.a() >= 24 ? cellIdentity2.getPsc() : -1), (Integer) null, isRegistered, timeStamp, cellConnectionStatus, Collections.singletonList(e(cellInfo)), 384);
        }
        if (!(cellInfo instanceof CellInfoLte)) {
            return cellInfo instanceof CellInfoCdma ? new dnf0(ReefNetworkType.CDMA, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, isRegistered, timeStamp, cellConnectionStatus, (List) null, 4606) : new dnf0((ReefNetworkType) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, isRegistered, timeStamp, cellConnectionStatus, (List) null, 4607);
        }
        CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
        return new dnf0(ReefNetworkType.LTE, Integer.valueOf(cellIdentity3.getMcc()), Integer.valueOf(cellIdentity3.getMnc()), Integer.valueOf(cellIdentity3.getTac()), Long.valueOf(cellIdentity3.getCi()), Integer.valueOf(fnf0Var.a() >= 24 ? cellIdentity3.getEarfcn() : -1), Integer.valueOf(cellIdentity3.getPci()), Integer.valueOf(fnf0Var.a() >= 28 ? cellIdentity3.getBandwidth() : -1), isRegistered, timeStamp, cellConnectionStatus, Collections.singletonList(e(cellInfo)), 256);
    }

    @SuppressLint({"NewApi"})
    public final sof0 b(CellSignalStrengthGsm cellSignalStrengthGsm) {
        Integer num;
        int bitErrorRate;
        int asuLevel = cellSignalStrengthGsm.getAsuLevel();
        int level = cellSignalStrengthGsm.getLevel();
        int dbm = cellSignalStrengthGsm.getDbm();
        fnf0 fnf0Var = this.b;
        if (fnf0Var.a() >= 29) {
            bitErrorRate = cellSignalStrengthGsm.getBitErrorRate();
            num = Integer.valueOf(bitErrorRate);
        } else {
            num = null;
        }
        return new sof0(Integer.valueOf(asuLevel), Integer.valueOf(level), Integer.valueOf(dbm), null, new rof0(num, fnf0Var.a() >= 26 ? Integer.valueOf(cellSignalStrengthGsm.getTimingAdvance()) : null), null, 40);
    }

    @SuppressLint({"NewApi"})
    public final sof0 c(CellSignalStrengthLte cellSignalStrengthLte) {
        int rssi;
        int asuLevel = cellSignalStrengthLte.getAsuLevel();
        int level = cellSignalStrengthLte.getLevel();
        int dbm = cellSignalStrengthLte.getDbm();
        fnf0 fnf0Var = this.b;
        Integer num = null;
        Integer valueOf = fnf0Var.a() >= 26 ? Integer.valueOf(cellSignalStrengthLte.getRssnr()) : null;
        Integer valueOf2 = fnf0Var.a() >= 26 ? Integer.valueOf(cellSignalStrengthLte.getCqi()) : null;
        Integer valueOf3 = fnf0Var.a() >= 26 ? Integer.valueOf(cellSignalStrengthLte.getRsrp()) : null;
        Integer valueOf4 = fnf0Var.a() >= 26 ? Integer.valueOf(cellSignalStrengthLte.getRsrq()) : null;
        if (fnf0Var.a() >= 29) {
            rssi = cellSignalStrengthLte.getRssi();
            num = Integer.valueOf(rssi);
        }
        return new sof0(Integer.valueOf(asuLevel), Integer.valueOf(level), Integer.valueOf(dbm), new tof0(valueOf, valueOf2, valueOf3, valueOf4, num, Integer.valueOf(cellSignalStrengthLte.getTimingAdvance())), null, null, 48);
    }

    public final sof0 e(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoGsm ? b(((CellInfoGsm) cellInfo).getCellSignalStrength()) : cellInfo instanceof CellInfoWcdma ? d(((CellInfoWcdma) cellInfo).getCellSignalStrength()) : cellInfo instanceof CellInfoLte ? c(((CellInfoLte) cellInfo).getCellSignalStrength()) : new sof0(null, null, null, null, null, null, 63);
    }
}
