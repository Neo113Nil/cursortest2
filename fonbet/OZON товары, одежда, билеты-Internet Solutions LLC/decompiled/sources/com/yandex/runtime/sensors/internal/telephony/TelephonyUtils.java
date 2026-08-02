package com.yandex.runtime.sensors.internal.telephony;

import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class TelephonyUtils {
    private static GsmCellInfo convert(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        if (cellIdentity.getCid() == Integer.MAX_VALUE || cellIdentity.getLac() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE) {
            return null;
        }
        int timingAdvance = cellInfoGsm.getCellSignalStrength().getTimingAdvance();
        return new GsmCellInfo(cellIdentity.getCid(), cellIdentity.getLac(), cellInfoGsm.getCellSignalStrength().getDbm(), cellIdentity.getMcc(), cellIdentity.getMnc(), timingAdvance != Integer.MAX_VALUE ? new Integer(timingAdvance) : null, CellType.Gsm, unixTimestampMilliseconds(cellInfoGsm), null, null);
    }

    public static List<GsmCellInfo> convertCellInfo(List<CellInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (CellInfo cellInfo : list) {
                GsmCellInfo convert = cellInfo instanceof CellInfoGsm ? convert((CellInfoGsm) cellInfo) : cellInfo instanceof CellInfoLte ? convert((CellInfoLte) cellInfo) : cellInfo instanceof CellInfoWcdma ? convert((CellInfoWcdma) cellInfo) : null;
                if (convert != null) {
                    arrayList.add(convert);
                }
            }
        }
        return arrayList;
    }

    private static int replaceUnavailableToZero(int i11) {
        if (i11 == Integer.MAX_VALUE) {
            return 0;
        }
        return i11;
    }

    private static long unixTimestampMilliseconds(CellInfo cellInfo) {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (Build.VERSION.SDK_INT >= 30 ? cellInfo.getTimestampMillis() : cellInfo.getTimeStamp() / 1000000);
    }

    private static GsmCellInfo convert(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        int pci = cellIdentity.getPci();
        int earfcn = cellIdentity.getEarfcn();
        if (pci == Integer.MAX_VALUE && (cellIdentity.getCi() == Integer.MAX_VALUE || cellIdentity.getTac() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE)) {
            return null;
        }
        int timingAdvance = cellInfoLte.getCellSignalStrength().getTimingAdvance();
        return new GsmCellInfo(replaceUnavailableToZero(cellIdentity.getCi()), replaceUnavailableToZero(cellIdentity.getTac()), cellInfoLte.getCellSignalStrength().getDbm(), replaceUnavailableToZero(cellIdentity.getMcc()), replaceUnavailableToZero(cellIdentity.getMnc()), timingAdvance == Integer.MAX_VALUE ? null : new Integer(timingAdvance), CellType.Lte, unixTimestampMilliseconds(cellInfoLte), pci == Integer.MAX_VALUE ? null : new Integer(pci), earfcn != Integer.MAX_VALUE ? new Integer(earfcn) : null);
    }

    private static GsmCellInfo convert(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        if (cellIdentity.getCid() == Integer.MAX_VALUE || cellIdentity.getLac() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE) {
            return null;
        }
        return new GsmCellInfo(cellIdentity.getCid(), cellIdentity.getLac(), cellInfoWcdma.getCellSignalStrength().getDbm(), cellIdentity.getMcc(), cellIdentity.getMnc(), null, CellType.Wcdma, unixTimestampMilliseconds(cellInfoWcdma), null, null);
    }
}
