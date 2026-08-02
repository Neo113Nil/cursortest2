package com.huawei.hms.health;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.data.HealthKitApiResult;
import com.huawei.hms.hihealth.options.aaba;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.utils.Util;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.chromium.base.TimeUtils;
import xsna.aad0;
import xsna.bbs0;
import xsna.h5s;
import xsna.odj;
import xsna.pzl;

/* loaded from: classes13.dex */
public class aaci {
    private static volatile aaci aabk;
    private static volatile HealthKitApiInvoker aabl;
    private long aab;
    private com.huawei.hms.hihealth.data.aab aaba;
    private com.huawei.hms.hihealth.data.aaba aabe;
    private int aabf;
    private long aabg;
    private long aabh;
    private long aabj;
    private Map<String, com.huawei.hms.hihealth.data.aabb> aabb = new HashMap();
    private Map<String, Pair<String, Long>> aabc = new HashMap();
    private Map<String, Long> aabd = new HashMap();
    private int aabi = -1;

    public static class aab extends aaba.aab {
        private CountDownLatch aab;
        private List<String> aaba;

        public aab(@NonNull CountDownLatch countDownLatch, @NonNull List<String> list) {
            this.aab = countDownLatch;
            this.aaba = list;
        }

        public void aab(List list, int i, int i2, int i3) throws RemoteException {
            aabz.aabb("CommonMethodImpl", "onTransmissionResult enter");
            if (i == 3) {
                aabz.aabb("CommonMethodImpl", "transfer complete");
                this.aab.countDown();
                return;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            Object obj = list.get(0);
            if (i == 1) {
                StringBuilder aab = com.huawei.hms.health.aab.aab("transmission slice get:");
                aab.append(System.currentTimeMillis());
                aabz.aabb("CommonMethodImpl", aab.toString());
                if (obj instanceof String) {
                    this.aaba.add((String) obj);
                    return;
                }
                return;
            }
            if (i != 2) {
                aabz.aabb("CommonMethodImpl", "unknown transmissionType" + i);
            } else {
                if (obj instanceof String) {
                    this.aaba.add((String) obj);
                }
                this.aab.countDown();
                aabz.aabb("CommonMethodImpl", "transmission complete no need slice");
            }
        }
    }

    @NonNull
    private String aabc(HealthKitApiInvoker healthKitApiInvoker) {
        return pzl.b(healthKitApiInvoker.getInterfaceProvider(), ".", healthKitApiInvoker.getInterfaceInvoked());
    }

    private void aabd() {
        long j = this.aab;
        if (j == 0 || aacs.aab(j, TimeUtils.MILLISECONDS_PER_DAY)) {
            StringBuilder aab2 = com.huawei.hms.health.aab.aab("init InterfacePolicy, last time ");
            aab2.append(this.aab);
            aabz.aabb("CommonMethodImpl", aab2.toString());
            Task<com.huawei.hms.hihealth.data.aabc> aabd = aacp.aabg().aabd();
            aabd.c(new aad0(this, 18));
            aabd.b(new bbs0(4));
        }
    }

    public synchronized String aab(HealthKitApiInvoker healthKitApiInvoker) throws RemoteException, ApiException {
        return aaba(healthKitApiInvoker, false);
    }

    public HealthKitApiInvoker aaba() {
        return aabl;
    }

    public int aabb() {
        com.huawei.hms.hihealth.data.aab aabVar = this.aaba;
        if (aabVar == null || aabVar.aab() == -1 || this.aaba.aab() == 0) {
            return 30000;
        }
        return this.aaba.aab();
    }

    @NonNull
    private String aabb(HealthKitApiInvoker healthKitApiInvoker) {
        return healthKitApiInvoker.getInterfaceProvider() + healthKitApiInvoker.getInterfaceInvoked() + healthKitApiInvoker.getRequestBody().hashCode();
    }

    public void aab() {
        this.aabc.clear();
    }

    public synchronized String aaba(HealthKitApiInvoker healthKitApiInvoker) throws RemoteException, ApiException {
        aabz.aabb("CommonMethodImpl", "invoke read interface");
        return aaba(healthKitApiInvoker, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String aaba(HealthKitApiInvoker healthKitApiInvoker, boolean z) throws RemoteException, ApiException {
        String str;
        String str2;
        Pair<String, Long> pair;
        com.huawei.hms.hihealth.data.aab aabVar;
        if (healthKitApiInvoker == null) {
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.INPUT_PARAM_MISSING));
        }
        String aabc = aabc(healthKitApiInvoker);
        aabz.aabb("CommonMethodImpl", "invoke with policy " + aabc + " " + z);
        Context context = HiHealthKitClient.getInstance().getContext();
        if (context == null || (aabVar = this.aaba) == null || aabz.aab(aabVar.aaba()).booleanValue()) {
            aabz.aabb("CommonMethodImpl", "bgLimitPolicy empty");
        } else if (!this.aaba.aaba().contains(aabc)) {
            aabz.aabb("CommonMethodImpl", "interface not in bgLimitPolicy");
        } else {
            if (aacs.aabb(context)) {
                aabz.aab("CommonMethodImpl", "the phone is screen off or locked");
                throw new SecurityException(String.valueOf(HiHealthStatusCodes.DISABLE_DATA_OPERATION));
            }
            if (aacs.aab(context)) {
                long j = this.aabj;
                long convert = TimeUnit.MILLISECONDS.convert(this.aaba.aabb(), TimeUnit.SECONDS);
                if (j != -1 && System.currentTimeMillis() - j <= convert) {
                    StringBuilder aab2 = com.huawei.hms.health.aab.aab("background app can not invoke read apis in ");
                    aab2.append(this.aaba.aabb());
                    aabz.aab("CommonMethodImpl", aab2.toString());
                    throw new SecurityException(String.valueOf(HiHealthStatusCodes.APPLICATION_NOT_FORGROUND));
                }
                this.aabj = System.currentTimeMillis();
            }
        }
        if (this.aabb.get(aabc(healthKitApiInvoker)) != null) {
            String aabb = aabb(healthKitApiInvoker);
            if (!aab(healthKitApiInvoker, aabb) && (pair = this.aabc.get(aabb)) != null && !aacs.aab(((Long) pair.second).longValue(), TimeUnit.MILLISECONDS.convert(r0.aab(), TimeUnit.SECONDS))) {
                StringBuilder aab3 = com.huawei.hms.health.aab.aab("get cache result within ");
                aab3.append(pair.second);
                aabz.aabb("CommonMethodImpl", aab3.toString());
                str = (String) pair.first;
                if (str == null) {
                    return str;
                }
                com.huawei.hms.hihealth.data.aaba aabaVar = this.aabe;
                try {
                    if (aabaVar == null || aabaVar.aaba() == 0) {
                        str2 = "flowPolicy is empty";
                    } else {
                        com.huawei.hms.health.aab.aab("do flow policy countBeginTime ").append(this.aabg);
                        long j2 = this.aabg;
                        if (j2 != 0 && !aacs.aab(j2, TimeUnit.MILLISECONDS.convert(this.aabe.aabb(), TimeUnit.SECONDS))) {
                            this.aabf++;
                            com.huawei.hms.health.aab.aab("do flow policy countBeginTime flowCount ").append(this.aabf);
                            if (this.aabf > this.aabe.aaba()) {
                                if (this.aabi == -1) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    this.aabg = currentTimeMillis;
                                    this.aabh = currentTimeMillis;
                                    this.aabi = 0;
                                    StringBuilder aab4 = com.huawei.hms.health.aab.aab("flow policy invoke at ");
                                    aab4.append(this.aabg);
                                    aab4.append(" with ");
                                    aab4.append(this.aabf);
                                    aabz.aabb("CommonMethodImpl", aab4.toString());
                                }
                                if (aacs.aab(this.aabh, 10000L)) {
                                    this.aabh = System.currentTimeMillis();
                                    this.aabi = 0;
                                }
                                int i = this.aabi + 1;
                                this.aabi = i;
                                if (i > this.aabe.aab()) {
                                    StringBuilder aab5 = com.huawei.hms.health.aab.aab("flow policy limit effect ");
                                    aab5.append(this.aabi);
                                    aabz.aabb("CommonMethodImpl", aab5.toString());
                                    Locale locale = Locale.ENGLISH;
                                    throw new ApiException(new Status(HiHealthStatusCodes.API_FLOW_LIMIT, h5s.c(this.aabe.aab(), " calls in the next 10s", odj.a(this.aabe.aaba(), this.aabe.aabb(), "Interface calls are too frequent, more than ", " calls in ", " second, triggering flow control, and only "))));
                                }
                            }
                            String aab6 = aab(healthKitApiInvoker, z);
                            aaba(healthKitApiInvoker, aab6);
                            return aab6;
                        }
                        this.aabf = 1;
                        this.aabi = -1;
                        this.aabg = System.currentTimeMillis();
                        StringBuilder aab7 = com.huawei.hms.health.aab.aab("init flow policy countBeginTime ");
                        aab7.append(this.aabg);
                        str2 = aab7.toString();
                    }
                    String aab62 = aab(healthKitApiInvoker, z);
                    aaba(healthKitApiInvoker, aab62);
                    return aab62;
                } finally {
                    aabd();
                }
                aabz.aabb("CommonMethodImpl", str2);
            }
        }
        str = null;
        if (str == null) {
        }
    }

    @Nullable
    private String aab(HealthKitApiInvoker healthKitApiInvoker, boolean z) throws RemoteException, ApiException {
        boolean z2;
        if (HiHealthKitClient.getInstance().bindService(100) == null) {
            throw new ApiException(new Status(HiHealthStatusCodes.API_EXCEPTION_ERROR, "the client is not connected"));
        }
        if (z) {
            String aab2 = aacs.aab(healthKitApiInvoker);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList = new ArrayList();
            aack.aabe().aabb().aab(aab2, new aab(countDownLatch, arrayList));
            try {
                z2 = countDownLatch.await(1L, TimeUnit.MINUTES);
            } catch (InterruptedException unused) {
                aabz.aab("CommonMethodImpl", "invokeReadInterface interruptedException");
                z2 = false;
            }
            String str = null;
            if (!z2) {
                aabz.aab("CommonMethodImpl", "invokeReadInterface time Out");
                return null;
            }
            if (arrayList.isEmpty()) {
                aabz.aabc("CommonMethodImpl", "build result fail for return empty body");
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                }
                aabz.aabb("CommonMethodImpl", "build result by StringBuilder appending");
                str = sb.toString();
            }
            HealthKitApiResult healthKitApiResult = (HealthKitApiResult) aacs.aab(str, (Type) HealthKitApiResult.class);
            if (healthKitApiResult != null) {
                return healthKitApiResult.isResultGzipped() ? aacs.aabd(healthKitApiResult.getResponse()) : healthKitApiResult.getResponse();
            }
            aabz.aab("CommonMethodImpl", "result from core is null");
            return "";
        }
        HealthKitApiResult healthKitApiResult2 = (HealthKitApiResult) aacs.aab(aack.aabe().aabb().aabb(aacs.aab(healthKitApiInvoker)), (Type) HealthKitApiResult.class);
        if (healthKitApiResult2 == null) {
            aabz.aab("CommonMethodImpl", "result from core is null");
            return "";
        }
        if (!healthKitApiResult2.isResultGzipped()) {
            return healthKitApiResult2.getResponse();
        }
        StringBuilder aab3 = com.huawei.hms.health.aab.aab("the result length from core is ");
        aab3.append(healthKitApiResult2.getResponse().length());
        aabz.aab("CommonMethodImpl", aab3.toString());
        return aacs.aabd(healthKitApiResult2.getResponse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aab(com.huawei.hms.hihealth.data.aabc aabcVar) {
        Objects.toString(aabcVar);
        if (aabcVar == null) {
            return;
        }
        this.aab = System.currentTimeMillis();
        this.aaba = aabcVar.aab();
        if (aabz.aaba(aabcVar.aaba()).booleanValue()) {
            for (com.huawei.hms.hihealth.data.aabb aabbVar : aabcVar.aaba()) {
                this.aabb.put(aabbVar.aaba(), aabbVar);
            }
        }
        this.aabe = aabcVar.aabb();
        aacs.aab("getInterfacePolicy success bgLimit %s, cachePolicy size %s, flow %s", Boolean.valueOf(this.aaba != null), Integer.valueOf(this.aabb.size()), Boolean.valueOf(this.aabe != null));
    }

    private boolean aab(HealthKitApiInvoker healthKitApiInvoker, String str) {
        int i;
        boolean z = false;
        if (!"AuthController".equals(healthKitApiInvoker.getInterfaceProvider())) {
            return false;
        }
        Long l = this.aabd.get(str);
        if (l != null) {
            long longValue = l.longValue();
            com.huawei.hms.hihealth.data.aabb aabbVar = this.aabb.get(aacs.aab("AuthController", "TIME_WINDOW"));
            if (aabbVar != null) {
                aabz.aabb("CommonMethodImpl", "getInvokeTimeWindow with timeWindowPolicy");
                i = aabbVar.aab();
            } else {
                aabz.aabb("CommonMethodImpl", "getInvokeTimeWindow with default TimeWindow");
                i = 10500;
            }
            if (aacs.aab(longValue, i)) {
                z = true;
            }
        }
        aabz.aabb("CommonMethodImpl", "timeWindow lastTime " + l + " result " + z);
        this.aabd.put(str, Long.valueOf(System.currentTimeMillis()));
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[Catch: all -> 0x0045, TryCatch #1 {, blocks: (B:6:0x0007, B:8:0x000b, B:28:0x002e, B:31:0x0035, B:11:0x0056, B:13:0x0064, B:16:0x006b, B:18:0x006f, B:20:0x007b, B:21:0x008d, B:24:0x0082, B:34:0x004b, B:36:0x0090), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[Catch: all -> 0x0045, RuntimeException -> 0x007e, NameNotFoundException -> 0x0086, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0007, B:8:0x000b, B:28:0x002e, B:31:0x0035, B:11:0x0056, B:13:0x0064, B:16:0x006b, B:18:0x006f, B:20:0x007b, B:21:0x008d, B:24:0x0082, B:34:0x004b, B:36:0x0090), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aaci aabc() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        PackageInfo packageInfo;
        if (aabk == null) {
            synchronized (aaci.class) {
                if (aabk == null) {
                    aabk = new aaci();
                    aabl = new HealthKitApiInvoker();
                    Context context = HiHealthKitClient.getInstance().getContext();
                    aabl.setAppId(Util.getAppId(context));
                    HealthKitApiInvoker healthKitApiInvoker = aabl;
                    if (context != null) {
                        try {
                        } catch (PackageManager.NameNotFoundException unused) {
                            str = "PackageManagerUtil";
                            str2 = "can not find PackageManager";
                            aabz.aab(str, str2);
                            str3 = "";
                            healthKitApiInvoker.setPackageName(str3);
                            aabl.setSdkVersion("6.15.0.300");
                            HealthKitApiInvoker healthKitApiInvoker2 = aabl;
                            if (context != null) {
                            }
                            str4 = "";
                            healthKitApiInvoker2.setAppVersion(str4);
                            return aabk;
                        } catch (Exception unused2) {
                            str = "PackageManagerUtil";
                            str2 = "catch basic exception";
                            aabz.aab(str, str2);
                            str3 = "";
                            healthKitApiInvoker.setPackageName(str3);
                            aabl.setSdkVersion("6.15.0.300");
                            HealthKitApiInvoker healthKitApiInvoker22 = aabl;
                            if (context != null) {
                            }
                            str4 = "";
                            healthKitApiInvoker22.setAppVersion(str4);
                            return aabk;
                        }
                        if (context.getPackageManager() != null) {
                            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                            healthKitApiInvoker.setPackageName(str3);
                            aabl.setSdkVersion("6.15.0.300");
                            HealthKitApiInvoker healthKitApiInvoker222 = aabl;
                            if (context != null && context.getPackageManager() != null) {
                                try {
                                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    str5 = "PackageManagerUtil";
                                    str6 = "getAppVersion NameNotFoundException";
                                    aabz.aab(str5, str6);
                                    str4 = "";
                                    healthKitApiInvoker222.setAppVersion(str4);
                                    return aabk;
                                } catch (RuntimeException unused4) {
                                    str5 = "PackageManagerUtil";
                                    str6 = "getPackageInfo exists exception!";
                                    aabz.aab(str5, str6);
                                    str4 = "";
                                    healthKitApiInvoker222.setAppVersion(str4);
                                    return aabk;
                                }
                                if (packageInfo != null) {
                                    str4 = packageInfo.versionName;
                                    healthKitApiInvoker222.setAppVersion(str4);
                                }
                            }
                            str4 = "";
                            healthKitApiInvoker222.setAppVersion(str4);
                        }
                    }
                    str3 = "";
                    healthKitApiInvoker.setPackageName(str3);
                    aabl.setSdkVersion("6.15.0.300");
                    HealthKitApiInvoker healthKitApiInvoker2222 = aabl;
                    if (context != null) {
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
                        if (packageInfo != null) {
                        }
                    }
                    str4 = "";
                    healthKitApiInvoker2222.setAppVersion(str4);
                }
            }
        }
        return aabk;
    }

    private void aaba(HealthKitApiInvoker healthKitApiInvoker, String str) {
        if (this.aabb.get(aabc(healthKitApiInvoker)) != null) {
            String aabb = aabb(healthKitApiInvoker);
            if (!"AuthController".equals(healthKitApiInvoker.getInterfaceProvider()) || (!TextUtils.isEmpty(str) && !"[]".equals(str))) {
                this.aabc.put(aabb, new Pair<>(str, Long.valueOf(System.currentTimeMillis())));
            } else {
                aabz.aabb("CommonMethodImpl", "skip cache empty result, and clear cache");
                this.aabc.remove(aabb);
            }
        }
    }
}
