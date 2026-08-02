package io.seon.androidsdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
import com.facebook.hermes.intl.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public final class V0 extends AbstractC4950j {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f53169k = {"carrier_name", "carrier_country", "device_id", "network_config", "is_on_call", "sim_slot_count"};

    /* renamed from: r, reason: collision with root package name */
    public static final Lh.a f53170r = Lh.a.d(V0.class);

    /* renamed from: e, reason: collision with root package name */
    public Context f53171e;

    /* renamed from: g, reason: collision with root package name */
    public PackageManager f53172g;

    /* renamed from: n, reason: collision with root package name */
    public TelephonyManager f53173n;

    /* renamed from: o, reason: collision with root package name */
    public SubscriptionManager f53174o;

    /* renamed from: p, reason: collision with root package name */
    public TelecomManager f53175p;

    /* renamed from: q, reason: collision with root package name */
    public EuiccManager f53176q;

    public static /* synthetic */ String[] y(int i10) {
        return new String[i10];
    }

    public final String A() {
        TelephonyManager telephonyManager = this.f53173n;
        if (telephonyManager == null || telephonyManager.getNetworkCountryIso().isEmpty()) {
            return null;
        }
        return this.f53173n.getNetworkCountryIso().toUpperCase();
    }

    public final String[] B() {
        if (this.f53173n == null) {
            return null;
        }
        try {
            if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                return new String[]{this.f53173n.getNetworkOperator()};
            }
            ArrayList arrayList = new ArrayList();
            try {
                Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getNetworkOperator());
                }
            } catch (Exception unused) {
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String C() {
        TelephonyManager telephonyManager = this.f53173n;
        if (telephonyManager != null) {
            try {
                if (telephonyManager.getNetworkOperatorName().isEmpty()) {
                    return null;
                }
                return this.f53173n.getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Map D() {
        boolean isEmbedded;
        try {
            HashMap hashMap = new HashMap();
            if (this.f53174o != null && Build.VERSION.SDK_INT >= 28 && V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                for (SubscriptionInfo subscriptionInfo : this.f53174o.getActiveSubscriptionInfoList()) {
                    String format = String.format(Locale.ENGLISH, "SIM%d", Integer.valueOf(subscriptionInfo.getSubscriptionId()));
                    isEmbedded = subscriptionInfo.isEmbedded();
                    hashMap.put(format, isEmbedded ? "ESIM" : "PHYSICAL");
                }
            }
            return hashMap;
        } catch (Exception e10) {
            V.j("simt", e10);
            return null;
        }
    }

    public final String[] E() {
        String str;
        boolean isDataRoamingEnabled;
        boolean isDataRoamingEnabled2;
        str = "DISABLED";
        if (this.f53173n == null || !((V.k(this.f53171e, "android.permission.ACCESS_NETWORK_STATE") || V.k(this.f53171e, "android.permission.READ_PHONE_STATE") || V.k(this.f53171e, "android.permission.READ_BASIC_PHONE_STATE")) && this.f53172g.hasSystemFeature("android.hardware.telephony.data") && Build.VERSION.SDK_INT >= 29)) {
            String F10 = F();
            if (Objects.equals(F10, "true")) {
                str = "ENABLED";
            } else if (!Objects.equals(F10, Constants.CASEFIRST_FALSE)) {
                str = "UNKNOWN";
            }
            return new String[]{str};
        }
        try {
            if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                isDataRoamingEnabled = this.f53173n.isDataRoamingEnabled();
                return new String[]{isDataRoamingEnabled ? "ENABLED" : "DISABLED"};
            }
            ArrayList arrayList = new ArrayList();
            Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
            while (it.hasNext()) {
                isDataRoamingEnabled2 = this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).isDataRoamingEnabled();
                arrayList.add(isDataRoamingEnabled2 ? "ENABLED" : "DISABLED");
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception unused) {
            return new String[0];
        }
    }

    public final String F() {
        return V.n(this.f53171e, "ro.com.android.dataroaming");
    }

    public final String G() {
        String str;
        PackageManager.ResolveInfoFlags of2;
        List queryIntentActivities;
        try {
            str = Telephony.Sms.getDefaultSmsPackage(this.f53171e);
        } catch (Exception e10) {
            V.j("getDefaultSmsPackage", e10);
            str = null;
        }
        if ((str != null && !com.imagepicker.k.a(str)) || Build.VERSION.SDK_INT < 33) {
            return str;
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:"));
            PackageManager packageManager = this.f53172g;
            of2 = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of2);
            return !queryIntentActivities.isEmpty() ? ((ResolveInfo) queryIntentActivities.get(0)).activityInfo.packageName : str;
        } catch (Exception e11) {
            V.j("getDefaultSmsPackage", e11);
            return str;
        }
    }

    public final String H() {
        if (Build.VERSION.SDK_INT <= 28) {
            if (this.f53173n == null) {
                f53170r.a("Failed to get TelephonyManager", 6);
                return "";
            }
            if (!V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                f53170r.a("There is no granted READ_PHONE_STATE permission", 5);
            } else if (this.f53173n.getDeviceId() != null) {
                return this.f53173n.getDeviceId();
            }
        }
        return null;
    }

    public final String I() {
        boolean isEnabled;
        try {
            if (Build.VERSION.SDK_INT >= 28 && this.f53172g.hasSystemFeature("android.hardware.telephony.euicc")) {
                isEnabled = this.f53176q.isEnabled();
                return isEnabled ? "ENABLED" : "DISABLED";
            }
            return "UNSUPPORTED";
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String J() {
        return V.n(this.f53171e, "gsm.operator.isroaming");
    }

    public final String[] K() {
        if (this.f53173n != null && ((Build.VERSION.SDK_INT <= 29 && V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) || V.k(this.f53171e, "android.permission.READ_SMS") || V.k(this.f53171e, "android.permission.READ_PHONE_NUMBERS"))) {
            try {
                if (this.f53174o == null) {
                    return new String[]{this.f53173n.getLine1Number()};
                }
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getLine1Number());
                    }
                } catch (Exception unused) {
                }
                return (String[]) arrayList.toArray(new String[0]);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String L() {
        if (this.f53173n != null && this.f53172g.hasSystemFeature("android.hardware.telephony.messaging")) {
            try {
                return this.f53173n.getMmsUAProfUrl();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final String M() {
        if (this.f53173n != null && this.f53172g.hasSystemFeature("android.hardware.telephony.messaging")) {
            try {
                return this.f53173n.getMmsUserAgent();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final String N() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f53171e.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "No wifi or cellular";
        }
        if (V.k(this.f53171e, "android.permission.ACCESS_NETWORK_STATE")) {
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
            } else {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && networkInfo.isConnected()) {
                    return "WIFI";
                }
            }
        }
        if (this.f53173n == null) {
            return "No wifi or cellular";
        }
        if (!V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            f53170r.a("There is no granted READ_PHONE_STATE permission", 5);
            return "UNKNOWN";
        }
        switch (this.f53173n.getDataNetworkType()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            case 16:
                return "GSM";
            case 17:
                return "TD_SCDMA";
            case 18:
                return "IWLAN";
            case 19:
            default:
                return "No wifi or cellular";
            case 20:
                return "NR";
        }
    }

    public final String[] O() {
        Object[] array;
        String phoneNumber;
        if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_NUMBERS") || Build.VERSION.SDK_INT < 33) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
            while (it.hasNext()) {
                phoneNumber = this.f53174o.getPhoneNumber(it.next().getSubscriptionId());
                arrayList.add(phoneNumber);
            }
        } catch (Exception unused) {
        }
        array = arrayList.toArray(new IntFunction() { // from class: io.seon.androidsdk.service.U0
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return V0.y(i10);
            }
        });
        return (String[]) array;
    }

    public final String[] P() {
        if (this.f53173n == null) {
            return null;
        }
        if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            if (this.f53173n.getSimState() == 5) {
                return new String[]{this.f53173n.getSimOperator()};
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getSimOperator());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String[] Q() {
        if (this.f53173n == null) {
            return null;
        }
        if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            if (this.f53173n.getSimState() == 5) {
                return new String[]{this.f53173n.getSimCountryIso()};
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getSimCountryIso());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String[] R() {
        if (this.f53173n == null) {
            return null;
        }
        if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            if (this.f53173n.getSimState() == 5) {
                return new String[]{this.f53173n.getSimOperatorName()};
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getSimOperatorName());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String[] S() {
        int simSpecificCarrierId;
        int simSpecificCarrierId2;
        if (this.f53173n != null && Build.VERSION.SDK_INT >= 29) {
            try {
                if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                    simSpecificCarrierId = this.f53173n.getSimSpecificCarrierId();
                    return new String[]{String.valueOf(simSpecificCarrierId)};
                }
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
                    while (it.hasNext()) {
                        simSpecificCarrierId2 = this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getSimSpecificCarrierId();
                        arrayList.add(String.valueOf(simSpecificCarrierId2));
                    }
                } catch (Exception unused) {
                }
                return (String[]) arrayList.toArray(new String[0]);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String[] T() {
        CharSequence simSpecificCarrierIdName;
        CharSequence simSpecificCarrierIdName2;
        if (this.f53173n != null && Build.VERSION.SDK_INT >= 29) {
            try {
                if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                    simSpecificCarrierIdName = this.f53173n.getSimSpecificCarrierIdName();
                    return simSpecificCarrierIdName != null ? new String[]{simSpecificCarrierIdName.toString()} : new String[0];
                }
                ArrayList arrayList = new ArrayList();
                Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
                while (it.hasNext()) {
                    simSpecificCarrierIdName2 = this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).getSimSpecificCarrierIdName();
                    if (simSpecificCarrierIdName2 != null) {
                        arrayList.add(simSpecificCarrierIdName2.toString());
                    }
                }
                return (String[]) arrayList.toArray(new String[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final String U() {
        boolean z10;
        int simState;
        try {
            z10 = this.f53171e.getPackageManager().hasSystemFeature("android.hardware.telephony");
        } catch (Exception unused) {
            z10 = false;
        }
        if (z10 && this.f53173n != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(1, "Absent");
                hashMap.put(4, "Network Locked");
                hashMap.put(2, "PIN Locked");
                hashMap.put(3, "PUK Locked");
                hashMap.put(5, "Ready");
                hashMap.put(0, "State Unknown");
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    hashMap.put(8, "IO Error");
                    hashMap.put(9, "Restricted");
                    hashMap.put(6, "Not Ready");
                    hashMap.put(7, "Permanently Disabled");
                }
                int z11 = z();
                if (i10 < 26 || z11 <= 1) {
                    String str = (String) hashMap.get(Integer.valueOf(this.f53173n.getSimState()));
                    return str != null ? str : "Unknown";
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < z11; i11++) {
                    simState = this.f53173n.getSimState(i11);
                    sb2.append((String) hashMap.getOrDefault(Integer.valueOf(simState), "Unknown"));
                    sb2.append(";");
                }
                return sb2.toString();
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53171e = c4878a.a();
        this.f53368b = c4878a;
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.k0
            @Override // java.lang.Runnable
            public final void run() {
                V0.this.t();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.l0
                @Override // java.lang.Runnable
                public final void run() {
                    V0.this.u();
                }
            }.run();
        } catch (Throwable unused2) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.m0
                @Override // java.lang.Runnable
                public final void run() {
                    V0.this.v();
                }
            }.run();
        } catch (Throwable unused3) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.n0
                @Override // java.lang.Runnable
                public final void run() {
                    V0.this.w();
                }
            }.run();
        } catch (Throwable unused4) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                new Runnable() { // from class: io.seon.androidsdk.service.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        V0.this.x();
                    }
                }.run();
            } catch (Throwable unused5) {
            }
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("is_network_roaming", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.v0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.p();
            }
        }));
        hashMap.put("gsm_roaming_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.J();
            }
        }));
        hashMap.put("data_roaming_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.M0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.E();
            }
        }));
        hashMap.put("data_roaming_state_prop", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.N0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.F();
            }
        }));
        hashMap.put("sim_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.O0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.U();
            }
        }));
        hashMap.put("sim_operator_name", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.P0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.R();
            }
        }));
        hashMap.put("sim_operator_country", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Q0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.Q();
            }
        }));
        hashMap.put("sim_operator_code", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.R0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.P();
            }
        }));
        hashMap.put("sim_specific_carrier_id", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.S0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.S();
            }
        }));
        hashMap.put("sim_specific_carrier_id_name", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.T0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.T();
            }
        }));
        hashMap.put("carrier_operator_code", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.B();
            }
        }));
        hashMap.put("line1_number", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.x0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.K();
            }
        }));
        hashMap.put("phone_number", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.y0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.O();
            }
        }));
        hashMap.put("voicemail_number", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.z0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.l();
            }
        }));
        hashMap.put("type_allocation_code", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.A0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.k();
            }
        }));
        hashMap.put("mms_ua_prof_url", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.B0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.L();
            }
        }));
        hashMap.put("mms_user_agent", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.C0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.M();
            }
        }));
        hashMap.put("is_in_call", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.D0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.n();
            }
        }));
        hashMap.put("is_in_managed_call", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.E0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.o();
            }
        }));
        hashMap.put("default_sms_package", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.F0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.G();
            }
        }));
        hashMap.put("is_sms_capable", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.H0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.s();
            }
        }));
        hashMap.put("is_on_call_perm", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.I0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(V0.this.r());
            }
        }));
        hashMap.put("is_call_active_by_audio", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.J0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.m();
            }
        }));
        hashMap.put("esim_feature", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.K0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.I();
            }
        }));
        hashMap.put("sim_types", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.L0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.D();
            }
        }));
        return hashMap;
    }

    public final String k() {
        String typeAllocationCode;
        TelephonyManager telephonyManager = this.f53173n;
        if (telephonyManager == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        typeAllocationCode = telephonyManager.getTypeAllocationCode();
        return typeAllocationCode;
    }

    public final String l() {
        if (this.f53173n == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            return null;
        }
        return this.f53173n.getVoiceMailNumber();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001a, B:10:0x0024, B:12:0x002a, B:15:0x0033, B:17:0x0034), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m() {
        boolean z10;
        try {
            AudioManager audioManager = (AudioManager) this.f53171e.getSystemService("audio");
            boolean z11 = true;
            if (audioManager.getMode() != 2 && (audioManager.getMode() != 3 || audioManager.isMusicActive())) {
                z10 = false;
                if (Build.VERSION.SDK_INT >= 30) {
                    if (audioManager.getMode() != 4) {
                        z11 = false;
                    }
                    z10 |= z11;
                }
                return Boolean.valueOf(z10);
            }
            z10 = true;
            if (Build.VERSION.SDK_INT >= 30) {
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Boolean n() {
        if (this.f53175p != null && V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            try {
                return Boolean.valueOf(this.f53175p.isInCall());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Boolean o() {
        boolean isInManagedCall;
        if (this.f53175p != null && V.k(this.f53171e, "android.permission.READ_PHONE_STATE") && Build.VERSION.SDK_INT >= 26) {
            try {
                isInManagedCall = this.f53175p.isInManagedCall();
                return Boolean.valueOf(isInManagedCall);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final List p() {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f53173n != null && this.f53172g.hasSystemFeature("android.hardware.telephony.radio.access")) {
                if (this.f53174o == null || !V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add(Boolean.valueOf(this.f53173n.isNetworkRoaming()));
                    return arrayList;
                }
                Iterator<SubscriptionInfo> it = this.f53174o.getActiveSubscriptionInfoList().iterator();
                while (it.hasNext()) {
                    arrayList.add(Boolean.valueOf(this.f53173n.createForSubscriptionId(it.next().getSubscriptionId()).isNetworkRoaming()));
                }
                return arrayList;
            }
            return null;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public final boolean q() {
        try {
            if (!r()) {
                if (!m().booleanValue()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean r() {
        if (!V.k(this.f53171e, "android.permission.READ_PHONE_STATE")) {
            return false;
        }
        try {
            return ((TelecomManager) this.f53171e.getSystemService("telecom")).isInCall();
        } catch (Exception unused) {
            return false;
        }
    }

    public final Boolean s() {
        TelephonyManager telephonyManager = this.f53173n;
        if (telephonyManager == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 35) {
                return null;
            }
            return Boolean.valueOf(telephonyManager.isSmsCapable());
        } catch (Exception unused) {
            return null;
        }
    }

    public final void t() {
        Context context = this.f53171e;
        AtomicInteger atomicInteger = V.f53166a;
        this.f53172g = context.getPackageManager();
    }

    public final /* synthetic */ void u() {
        this.f53173n = V.r(this.f53171e);
    }

    public final /* synthetic */ void v() {
        this.f53174o = V.a(this.f53171e);
    }

    public final /* synthetic */ void w() {
        this.f53175p = V.m(this.f53171e);
    }

    public final /* synthetic */ void x() {
        this.f53176q = Y.a(this.f53171e.getSystemService("euicc"));
    }

    public final int z() {
        int activeModemCount;
        TelephonyManager telephonyManager = this.f53173n;
        if (telephonyManager == null) {
            return -1;
        }
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return telephonyManager.getPhoneCount();
            }
            activeModemCount = telephonyManager.getActiveModemCount();
            return activeModemCount;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("carrier_name", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.p0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.C();
            }
        }));
        hashMap.put("carrier_country", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.q0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.A();
            }
        }));
        hashMap.put("device_id", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.r0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.H();
            }
        }));
        hashMap.put("network_config", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.s0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return V0.this.N();
            }
        }));
        hashMap.put("is_on_call", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.t0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(V0.this.q());
            }
        }));
        hashMap.put("sim_slot_count", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.u0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(V0.this.z());
            }
        }));
        return hashMap;
    }
}
