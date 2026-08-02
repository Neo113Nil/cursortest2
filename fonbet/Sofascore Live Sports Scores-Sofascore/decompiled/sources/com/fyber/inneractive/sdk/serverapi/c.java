package com.fyber.inneractive.sdk.serverapi;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements d {
    public static final List c = Arrays.asList(5);
    public static final List d = Arrays.asList(Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0.a()), Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0_WRAPPER.a()));
    public r a;
    public final String b;

    public c(r rVar) {
        String str;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) o.a.getSystemService("phone");
            str = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2 && k.n()) {
                str = telephonyManager.getSimOperator();
            }
        } catch (Exception unused) {
            str = null;
        }
        this.b = str;
        this.a = rVar;
    }

    public final void a(String str, HashMap hashMap) {
        String str2;
        a aVar = b.a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = IronSourceConstants.EVENTS_NATIVE;
        }
        hashMap.put("frmn", str2);
        hashMap.put("headset", a(b.m()));
        hashMap.put("is_muted", a(b.k()));
        hashMap.put("btry_c", a(b.i()));
        hashMap.put("btry_l", b.b());
        hashMap.put("bt_con", a(b.g()));
        Long e = b.e();
        hashMap.put("tod", e == null ? "" : String.valueOf(e));
        hashMap.put("apnm", a(b.f()));
        hashMap.put("dnd", a(b.l()));
        IAConfigManager iAConfigManager = IAConfigManager.N;
        hashMap.put("lng", iAConfigManager.o);
        String a = iAConfigManager.w.a(b.a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a) && a.contains(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
            a = a.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)[0];
        }
        hashMap.put("ldomain", a);
        hashMap.put("lbundle", iAConfigManager.w.a(b.a(str), "LAST_APP_BUNDLE_ID"));
        String a2 = iAConfigManager.w.a(b.a(str), "LAST_CLICKED");
        if (TextUtils.equals(a2, "0")) {
            a2 = "";
        }
        hashMap.put("lclick", a2);
        String a3 = iAConfigManager.w.a(b.a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(a3, "0")) {
            a3 = "";
        }
        hashMap.put("v_lskip", a3);
        UnitDisplayType a4 = b.a(str);
        hashMap.put("v_lclicktype", a4.isFullscreenUnit() ? iAConfigManager.w.a(a4, "LAST_VAST_CLICKED_TYPE") : "");
        hashMap.put("sdur", String.valueOf(b.c()));
        hashMap.put("userid", iAConfigManager.C.g);
        hashMap.put("low_power_mode", a(b.n()));
        hashMap.put("dark_mode", a(b.h()));
        hashMap.put("d_api", b.d());
        hashMap.put("media_muted", a(b.j()));
        Integer a5 = b.a();
        hashMap.put("asv", a5 != null ? String.valueOf(a5) : "");
    }

    public final String a() {
        try {
            return ((TelephonyManager) o.a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Boolean bool) {
        return bool != null ? bool.booleanValue() ? "1" : "0" : "";
    }
}
