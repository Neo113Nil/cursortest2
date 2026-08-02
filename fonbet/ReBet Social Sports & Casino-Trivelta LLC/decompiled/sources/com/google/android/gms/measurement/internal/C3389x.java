package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.plaid.internal.EnumC3631g;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3389x {

    /* renamed from: f, reason: collision with root package name */
    public static final C3389x f34363f = new C3389x((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f34364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34365b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f34366c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34367d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f34368e;

    public C3389x(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(U3.class);
        this.f34368e = enumMap;
        enumMap.put((EnumMap) U3.AD_USER_DATA, (U3) V3.h(bool));
        this.f34364a = i10;
        this.f34365b = l();
        this.f34366c = bool2;
        this.f34367d = str;
    }

    public static C3389x a(S3 s32, int i10) {
        EnumMap enumMap = new EnumMap(U3.class);
        enumMap.put((EnumMap) U3.AD_USER_DATA, (U3) s32);
        return new C3389x(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C3389x g(String str) {
        if (str == null || str.length() <= 0) {
            return f34363f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(U3.class);
        U3[] a10 = T3.DMA.a();
        int length = a10.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) a10[i11], (U3) V3.j(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new C3389x(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static C3389x h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C3389x((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(U3.class);
        for (U3 u32 : T3.DMA.a()) {
            enumMap.put((EnumMap) u32, (U3) V3.g(bundle.getString(u32.f33682a)));
        }
        return new C3389x(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        S3 g10;
        if (bundle == null || (g10 = V3.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = g10.ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int b() {
        return this.f34364a;
    }

    public final S3 c() {
        S3 s32 = (S3) this.f34368e.get(U3.AD_USER_DATA);
        return s32 == null ? S3.UNINITIALIZED : s32;
    }

    public final boolean d() {
        Iterator it = this.f34368e.values().iterator();
        while (it.hasNext()) {
            if (((S3) it.next()) != S3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f34365b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3389x)) {
            return false;
        }
        C3389x c3389x = (C3389x) obj;
        if (this.f34365b.equalsIgnoreCase(c3389x.f34365b) && Objects.equals(this.f34366c, c3389x.f34366c)) {
            return Objects.equals(this.f34367d, c3389x.f34367d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f34368e.entrySet()) {
            String i10 = V3.i((S3) entry.getValue());
            if (i10 != null) {
                bundle.putString(((U3) entry.getKey()).f33682a, i10);
            }
        }
        Boolean bool = this.f34366c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f34367d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f34366c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f34367d;
        return this.f34365b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
    }

    public final Boolean j() {
        return this.f34366c;
    }

    public final String k() {
        return this.f34367d;
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34364a);
        for (U3 u32 : T3.DMA.a()) {
            sb2.append(":");
            sb2.append(V3.m((S3) this.f34368e.get(u32)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(V3.d(this.f34364a));
        for (U3 u32 : T3.DMA.a()) {
            sb2.append(",");
            sb2.append(u32.f33682a);
            sb2.append("=");
            S3 s32 = (S3) this.f34368e.get(u32);
            if (s32 == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = s32.ordinal();
                if (ordinal == 0) {
                    sb2.append("uninitialized");
                } else if (ordinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb2.append("denied");
                } else if (ordinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f34366c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f34367d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C3389x(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(U3.class);
        this.f34368e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f34364a = i10;
        this.f34365b = l();
        this.f34366c = bool;
        this.f34367d = str;
    }
}
