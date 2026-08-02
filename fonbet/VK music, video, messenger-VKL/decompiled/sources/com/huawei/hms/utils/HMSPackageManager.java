package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.utils.PackageManagerHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import xsna.ji;
import xsna.pzl;

/* loaded from: classes13.dex */
public class HMSPackageManager {
    private static HMSPackageManager o;
    private static final Object p = new Object();
    private static final Object q = new Object();
    private static final Object r = new Object();
    private static final Map<String, String> s;
    private final Context a;
    private final PackageManagerHelper b;
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private int n;

    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Long f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = Long.valueOf(j);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.e, packagePriorityInfo.e) ? this.f.compareTo(packagePriorityInfo.f) : this.e.compareTo(packagePriorityInfo.e);
        }
    }

    public class a implements Comparator<ResolveInfo> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            String str2 = resolveInfo2.serviceInfo.applicationInfo.packageName;
            if (HMSPackageManager.s.containsKey(str) && HMSPackageManager.s.containsKey(str2)) {
                return str.compareTo(str2);
            }
            if (HMSPackageManager.s.containsKey(str)) {
                return -1;
            }
            return HMSPackageManager.s.containsKey(str2) ? 1 : 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<ResolveInfo> queryIntentServices = HMSPackageManager.this.a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    return;
                }
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.d();
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        s = hashMap;
        hashMap.put("com.huawei.hwid", "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05");
        hashMap.put("com.huawei.hwid.tv", "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C");
    }

    private HMSPackageManager(Context context) {
        this.a = context;
        this.b = new PackageManagerHelper(context);
    }

    private boolean c(String str, String str2) {
        return Objects.equals(str2, this.b.getPackageSigningCertificate(str)) || Objects.equals(str2, this.b.getPackageSignature(str));
    }

    private Pair<String, String> d(String str, String str2) {
        if (!s.containsKey(str) || !PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(str2)) {
            return null;
        }
        this.n = 3;
        return new Pair<>(str, str2);
    }

    private void e(String str) {
        if (SystemUtils.isHuawei() || SystemUtils.isSystemApp(this.a, str) || b(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        }
    }

    private void f() {
        synchronized (q) {
            this.c = null;
            this.d = null;
            this.e = 0;
        }
    }

    private String g() {
        String str;
        String str2 = this.f;
        if (str2 == null) {
            return "com.huawei.hwid";
        }
        c(str2);
        return (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(this.f)) || (str = this.f) == null) ? "com.huawei.hwid" : str;
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (p) {
            try {
                if (o == null && context != null) {
                    if (context.getApplicationContext() != null) {
                        o = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        o = new HMSPackageManager(context);
                    }
                    o.l();
                    o.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    private Pair<String, String> h() {
        try {
            List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (queryIntentServices != null && queryIntentServices.size() != 0) {
                a(queryIntentServices);
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                    String packageSigningCertificate = this.b.getPackageSigningCertificate(str);
                    String packageSignature = this.b.getPackageSignature(str);
                    Pair<String, String> d = d(str, packageSigningCertificate);
                    if (d != null) {
                        return d;
                    }
                    Pair<String, String> a2 = a(resolveInfo.serviceInfo.metaData, str, packageSigningCertificate, packageSignature);
                    if (a2 != null) {
                        return a2;
                    }
                    Pair<String, String> a3 = a(str, packageSignature);
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private Pair<String, String> i() {
        Pair<String, String> h = h();
        if (h != null) {
            this.h = "com.huawei.hms.core.aidlservice";
            this.i = null;
            return h;
        }
        ArrayList<PackagePriorityInfo> j = j();
        if (j == null) {
            return null;
        }
        Iterator<PackagePriorityInfo> it = j.iterator();
        while (it.hasNext()) {
            PackagePriorityInfo next = it.next();
            String str = next.a;
            String str2 = next.b;
            String str3 = next.c;
            String str4 = next.d;
            String packageSignature = this.b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                Long unused = next.f;
                this.h = PackageConstants.GENERAL_SERVICES_ACTION;
                d(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    private ArrayList<PackagePriorityInfo> j() {
        ArrayList<PackagePriorityInfo> arrayList = null;
        try {
            List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                arrayList = new ArrayList<>();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                    long packageFirstInstallTime = this.b.getPackageFirstInstallTime(str);
                    Bundle bundle = resolveInfo.serviceInfo.metaData;
                    if (bundle != null) {
                        String a2 = a(bundle, "hms_app_checker_config");
                        String a3 = a(a2);
                        if (!TextUtils.isEmpty(a3)) {
                            String a4 = a(bundle, "hms_app_signer_v2");
                            if (!TextUtils.isEmpty(a4)) {
                                String a5 = a(bundle, "hms_app_cert_chain");
                                if (!TextUtils.isEmpty(a5)) {
                                    arrayList.add(new PackagePriorityInfo(str, a2, a4, a5, a3, packageFirstInstallTime));
                                }
                            }
                        }
                    }
                }
                Collections.sort(arrayList);
            }
            return arrayList;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private void k() {
        synchronized (q) {
            try {
                Pair<String, String> h = h();
                if (h == null) {
                    f();
                    return;
                }
                String str = (String) h.first;
                this.c = str;
                this.d = (String) h.second;
                this.e = this.b.getPackageVersionCode(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (q) {
            try {
                Pair<String, String> i = i();
                if (i == null) {
                    e();
                    AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                } else {
                    this.f = (String) i.first;
                    this.g = (String) i.second;
                    this.j = this.b.getPackageVersionCode(g());
                    e(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean m() {
        Bundle bundle;
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        if (!TextUtils.isEmpty(this.h) && (this.h.equals(PackageConstants.GENERAL_SERVICES_ACTION) || this.h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            return false;
        }
        ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore")) {
            if (getHmsVersionCode() < 50000000) {
                if (getHmsVersionCode() <= 19999999) {
                }
            }
            return false;
        }
        return true;
    }

    public String getHMSFingerprint() {
        String str = this.d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        refresh();
        String str = this.c;
        if (str == null) {
            return "com.huawei.hwid";
        }
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
            k();
        }
        String str2 = this.c;
        return str2 != null ? str2 : "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        refreshForMultiService();
        String str = this.f;
        if (str == null) {
            return "com.huawei.hwid";
        }
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
            l();
        }
        String str2 = this.f;
        return str2 != null ? str2 : "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (p) {
            try {
                refresh();
                PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.c);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    f();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.c) && d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.c, this.d)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (p) {
            try {
                refreshForMultiService();
                PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.f);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    e();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f) && d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.f, this.g)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.h) ? this.h : "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.e >= i || !m()) {
            return true;
        }
        int packageVersionCode = this.b.getPackageVersionCode(getHMSPackageName());
        this.e = packageVersionCode;
        return packageVersionCode >= i;
    }

    public boolean isApkNeedUpdate(int i) {
        return getHmsVersionCode() < i;
    }

    public boolean isApkUpdateNecessary(int i) {
        if (isUpdateHmsForThirdPartyDevice()) {
            return true;
        }
        return m() && getHmsVersionCode() < i;
    }

    public boolean isUpdateHmsForThirdPartyDevice() {
        return "com.huawei.hwid".equals(this.f) && AgHmsUpdateState.getInstance().isUpdateHms();
    }

    public boolean isUseOldCertificate() {
        return this.m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            k();
        }
        c(this.c);
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
            l();
        }
        c(this.f);
    }

    public void resetMultiServiceState() {
        e();
    }

    public void setUseOldCertificate(boolean z) {
        this.m = z;
    }

    private boolean b(String str) {
        return !"com.huawei.hwid".equals(str) || this.n == 3;
    }

    private void a(List<ResolveInfo> list) {
        if (list.size() <= 1) {
            return;
        }
        Collections.sort(list, new a());
    }

    private boolean b(String str, String str2) {
        Map<String, String> map = s;
        return map.containsKey(str) && map.get(str).equalsIgnoreCase(str2);
    }

    private void c(String str) {
        if ("com.huawei.hwid".equals(str) && AgHmsUpdateState.getInstance().isUpdateHms() && this.b.getPackageVersionCode(str) >= AgHmsUpdateState.getInstance().getTargetVersionCode()) {
            AgHmsUpdateState.getInstance().resetUpdateState();
        }
    }

    private Pair<String, String> a(Bundle bundle, String str, String str2, String str3) {
        String str4;
        if (bundle == null) {
            return null;
        }
        this.n = 2;
        if (a(bundle, str, str2)) {
            str3 = str2;
            str4 = "hms_app_signer_v3";
        } else {
            str4 = "hms_app_signer";
        }
        if (!bundle.containsKey(str4) || !bundle.containsKey("hms_app_cert_chain") || !a(pzl.b(str, "&", str3), bundle.getString(str4), bundle.getString("hms_app_cert_chain"))) {
            return null;
        }
        if (str4.equals("hms_app_signer_v3")) {
            this.n = 3;
        }
        return new Pair<>(str, str3);
    }

    private void b() {
        new Thread(new b(), "Thread-asyncOnceCheckMDMState").start();
    }

    private void d(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        this.i = a2.substring(9);
    }

    private void e() {
        synchronized (q) {
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = 0;
        }
    }

    private boolean c() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.a);
        return hmsPath != null && ReadApkFileUtil.isCertFound(hmsPath) && ReadApkFileUtil.checkSignature() && ReadApkFileUtil.verifyApkHash(hmsPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        synchronized (r) {
            try {
                long packageFirstInstallTime = this.b.getPackageFirstInstallTime("com.huawei.hwid");
                int i = this.k;
                if (i != 3 && this.l == packageFirstInstallTime) {
                    a(i);
                    return this.k;
                }
                this.k = c() ? 2 : 1;
                this.l = this.b.getPackageFirstInstallTime("com.huawei.hwid");
                a(this.k);
                return this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Pair<String, String> a(String str, String str2) {
        if (b(str, str2)) {
            return new Pair<>(str, str2);
        }
        return null;
    }

    private boolean a(Bundle bundle, String str, String str2) {
        return bundle.containsKey("hms_app_signer_v3") && !b(str, str2);
    }

    private String a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        return null;
    }

    private String a(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf("priority=")) == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(StringUtils.COMMA, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    private boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        List<X509Certificate> b2 = com.huawei.hms.device.a.b(str3);
        if (b2.size() == 0 || !com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.a), b2)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) ji.a(1, b2);
        return com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS") && com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer") && com.huawei.hms.device.a.a(x509Certificate, str, str2);
    }

    private static String a(int i) {
        if (i == 1) {
            return "SPOOFED";
        }
        if (i == 2) {
            return "SUCCESS";
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        return "";
    }
}
