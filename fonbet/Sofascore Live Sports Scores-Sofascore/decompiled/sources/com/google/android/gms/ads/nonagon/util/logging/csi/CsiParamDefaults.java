package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzbjg;
import com.ironsource.L6;
import com.ironsource.U3;
import defpackage.inn;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CsiParamDefaults {
    public final Context a;
    public final String b;
    public final String c;
    public final PackageInfo d;
    public final String e;
    public final DeviceTierManager f;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel, @Nullable PackageInfo packageInfo, @Nullable String str, @NonNull DeviceTierManager deviceTierManager) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = versionInfoParcel.afmaVersion;
        this.d = packageInfo;
        this.e = str;
        this.f = deviceTierManager;
    }

    public void set(@NonNull Map<String, String> map) {
        PackageInfo packageInfo;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(L6.F, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put(U3.i.G, zzs.zzt());
        map.put("app", this.b);
        zzt.zzc();
        Context context = this.a;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        inn innVar = zzbjg.a;
        ArrayList b = zzba.zzb().b();
        if (((Boolean) zzba.zzc().a(zzbjg.V7)).booleanValue()) {
            b.addAll(zzt.zzh().g().zzi().i);
        }
        map.put("e", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, b));
        map.put("sdkVersion", this.c);
        if (((Boolean) zzba.zzc().a(zzbjg.Wc)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzE(context) ? "0" : "1");
        }
        if (((Boolean) zzba.zzc().a(zzbjg.Wa)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.l3)).booleanValue()) {
                String str = zzt.zzh().g;
                if (str == null) {
                    str = "";
                }
                map.put(L6.L, str);
            }
        }
        if (((Boolean) zzba.zzc().a(zzbjg.ed)).booleanValue()) {
            String str2 = this.e;
            map.put("uev", str2 != null ? str2 : "");
        }
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.e3)).booleanValue();
        DeviceTierManager deviceTierManager = this.f;
        if (booleanValue) {
            map.put("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().a(zzbjg.f3)).booleanValue()) {
            map.put("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().a(zzbjg.g3)).booleanValue() || (packageInfo = this.d) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }
}
