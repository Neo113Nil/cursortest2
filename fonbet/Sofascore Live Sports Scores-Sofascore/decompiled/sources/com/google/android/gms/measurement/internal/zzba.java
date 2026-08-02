package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.vungle.ads.internal.protos.Sdk;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzba {
    public static final zzba f = new zzba((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public zzba(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.e = enumMap;
        enumMap.put((EnumMap) zzjk.AD_USER_DATA, (zzjk) (bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED));
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static zzba b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArr = zzjj.DMA.a;
        int length = zzjkVarArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) zzjkVarArr[i2], (zzjk) zzjl.e(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new zzba(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static zzba c(int i, Bundle bundle) {
        if (bundle == null) {
            return new zzba((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.a) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) zzjl.d(bundle.getString(zzjkVar.a)));
        }
        return new zzba(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final zzji a() {
        zzji zzjiVar = (zzji) this.e.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (zzjk zzjkVar : zzjj.DMA.a) {
            sb.append(":");
            sb.append(zzjl.h((zzji) this.e.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj;
        if (this.b.equalsIgnoreCase(zzbaVar.b) && Objects.equals(this.c, zzbaVar.c)) {
            return Objects.equals(this.d, zzbaVar.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjl.a(this.a));
        for (zzjk zzjkVar : zzjj.DMA.a) {
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb.append(zzjkVar.a);
            sb.append(U3.j.b);
            zzji zzjiVar = (zzji) this.e.get(zzjkVar);
            if (zzjiVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = zzjiVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public zzba(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
