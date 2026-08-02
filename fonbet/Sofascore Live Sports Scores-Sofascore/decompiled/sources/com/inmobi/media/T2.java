package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class T2 {
    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return hashMap;
        }
        int cellOperatorFlag = AbstractC3890xj.a().getCellOperatorFlag();
        boolean z = (cellOperatorFlag & 2) == 2;
        boolean z2 = (cellOperatorFlag & 1) == 1;
        R2 r2 = new R2();
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!z) {
            int[] a = a(telephonyManager.getNetworkOperator());
            r2.a = a[0];
            r2.b = a[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale locale = Locale.ENGLISH;
                r2.e = com.appsflyer.internal.i.k(locale, networkCountryIso, locale);
            }
        }
        if (!z2) {
            int[] a2 = a(telephonyManager.getSimOperator());
            r2.c = a2[0];
            r2.d = a2[1];
        }
        String b = r2.b();
        if (b != null) {
            hashMap.put("s-ho", b);
        }
        String a3 = r2.a();
        if (a3 != null) {
            hashMap.put("s-co", a3);
        }
        String str2 = r2.e;
        if (str2 != null) {
            hashMap.put("s-iso", str2);
        }
        F5.a.getClass();
        Object systemService2 = context.getSystemService("phone");
        TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (str = telephonyManager2.getNetworkOperatorName()) == null) {
            str = "";
        }
        hashMap.put("s-cn", str);
        return hashMap;
    }

    public static HashMap b() {
        Context context;
        Hh hh = AbstractC3890xj.a;
        S2 s2 = null;
        if ((AbstractC3424fj.b() == null || AbstractC3890xj.a().isConnectedCellTowerEnabled()) && d() && e() && (context = AbstractC3424fj.a) != null) {
            Object systemService = context.getSystemService("phone");
            systemService.getClass();
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int[] a = a(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(a[0]);
            String valueOf2 = String.valueOf(a[1]);
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                CellInfo cellInfo = null;
                for (int i = 0; i < size; i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    s2 = new S2(cellInfo, valueOf, valueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation != null && a[0] != -1) {
                s2 = new S2();
                if (cellLocation instanceof CdmaCellLocation) {
                    s2.b = Integer.MAX_VALUE;
                    s2.c = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    s2.a = S2.a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    s2.b = Integer.MAX_VALUE;
                    s2.c = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    s2.a = S2.a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (s2 != null) {
            hashMap.put("c-sc", s2.a().toString());
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap c() {
        ArrayList arrayList;
        if (AbstractC3424fj.d() && d() && e()) {
            Hh hh = AbstractC3890xj.a;
            if (AbstractC3424fj.b() == null || AbstractC3890xj.a().isVisibleCellTowerEnabled()) {
                Context context = AbstractC3424fj.a;
                if (context == null) {
                    arrayList = new ArrayList();
                } else {
                    Object systemService = context.getSystemService("phone");
                    systemService.getClass();
                    TelephonyManager telephonyManager = (TelephonyManager) systemService;
                    ArrayList arrayList2 = new ArrayList();
                    int[] a = a(telephonyManager.getNetworkOperator());
                    String valueOf = String.valueOf(a[0]);
                    String valueOf2 = String.valueOf(a[1]);
                    List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        for (CellInfo cellInfo : allCellInfo) {
                            if (!cellInfo.isRegistered()) {
                                arrayList2.add(new S2(cellInfo, valueOf, valueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                HashMap hashMap = new HashMap();
                if (!arrayList.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(((S2) arrayList.get(arrayList.size() - 1)).a());
                    hashMap.put("v-sc", jSONArray.toString());
                }
                return hashMap;
            }
        }
        arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        if (!arrayList.isEmpty()) {
        }
        return hashMap2;
    }

    public static boolean d() {
        if (!AbstractC3424fj.d()) {
            return false;
        }
        boolean a = AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.READ_PHONE_STATE");
        boolean a2 = AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.ACCESS_FINE_LOCATION");
        int i = Build.VERSION.SDK_INT;
        return i == 29 ? a2 : i >= 30 ? a2 && a : AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.ACCESS_COARSE_LOCATION") || a2;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = AbstractC3424fj.a;
        Object systemService = context != null ? context.getSystemService("location") : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !"".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str.substring(0, 3));
                int parseInt2 = Integer.parseInt(str.substring(3));
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
