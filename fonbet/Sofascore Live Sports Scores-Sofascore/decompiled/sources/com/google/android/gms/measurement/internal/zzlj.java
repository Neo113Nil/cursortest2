package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzoh;
import com.ironsource.U3;
import com.ironsource.Ua;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import defpackage.a0p;
import defpackage.awf;
import defpackage.b10;
import defpackage.bnn;
import defpackage.bto;
import defpackage.c78;
import defpackage.cck;
import defpackage.ddb;
import defpackage.djh;
import defpackage.dto;
import defpackage.f0o;
import defpackage.fuo;
import defpackage.gt7;
import defpackage.kqj;
import defpackage.lmo;
import defpackage.lv9;
import defpackage.muo;
import defpackage.mxo;
import defpackage.nod;
import defpackage.nvo;
import defpackage.pyn;
import defpackage.qxo;
import defpackage.r1c;
import defpackage.uto;
import defpackage.uuo;
import defpackage.uyo;
import defpackage.v4n;
import defpackage.vv9;
import defpackage.vvf;
import defpackage.w3o;
import defpackage.wjn;
import defpackage.wog;
import defpackage.wto;
import defpackage.yao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlj extends yao {
    public gt7 d;
    public zzjp e;
    public final CopyOnWriteArraySet f;
    public boolean g;
    public final AtomicReference h;
    public final Object i;
    public boolean j;
    public int k;
    public dto l;
    public dto m;
    public PriorityQueue n;
    public zzjl o;
    public final AtomicLong p;
    public long q;
    public final zzx r;
    public boolean s;
    public dto t;
    public w3o u;
    public dto v;
    public final muo w;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.f = new CopyOnWriteArraySet();
        this.i = new Object();
        this.j = false;
        this.k = 1;
        this.s = true;
        this.w = new muo(this, 0);
        this.h = new AtomicReference();
        this.o = zzjl.c;
        this.q = -1L;
        this.p = new AtomicLong(0L);
        this.r = new zzx(zzicVar);
    }

    @Override // defpackage.yao
    public final boolean T() {
        return false;
    }

    public final void U(String str, Bundle bundle, String str2) {
        long j;
        zzic zzicVar = (zzic) this.b;
        zzicVar.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzicVar.d.b0(null, zzfy.e1)) {
            zzicVar.k.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        V(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.e == null || zzpp.u0(str2);
            String str3 = str == null ? "app" : str;
            long j3 = true != ((zzic) this.b).d.b0(null, zzfy.e1) ? 0L : j2;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            zzhz zzhzVar = ((zzic) this.b).g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new uto(this, str3, str2, j, j3, bundle3, z2, z3, z));
            return;
        }
        zzic zzicVar = (zzic) this.b;
        zzmb zzmbVar = zzicVar.l;
        zzic.l(zzmbVar);
        long j4 = true != zzicVar.d.b0(null, zzfy.e1) ? 0L : j2;
        synchronized (zzmbVar.m) {
            try {
                if (!zzmbVar.l) {
                    zzgu zzguVar = ((zzic) zzmbVar.b).f;
                    zzic.m(zzguVar);
                    zzguVar.l.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((zzic) zzmbVar.b).d.getClass();
                    }
                    zzgu zzguVar2 = ((zzic) zzmbVar.b).f;
                    zzic.m(zzguVar2);
                    zzguVar2.l.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((zzic) zzmbVar.b).d.getClass();
                    }
                    zzgu zzguVar3 = ((zzic) zzmbVar.b).f;
                    zzic.m(zzguVar3);
                    zzguVar3.l.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    zzdd zzddVar = zzmbVar.h;
                    string2 = zzddVar != null ? zzmbVar.V(zzddVar.b) : "Activity";
                }
                String str5 = string2;
                zzlu zzluVar = zzmbVar.d;
                if (zzmbVar.i && zzluVar != null) {
                    zzmbVar.i = false;
                    boolean equals = Objects.equals(zzluVar.b, str5);
                    boolean equals2 = Objects.equals(zzluVar.a, string);
                    if (equals && equals2) {
                        zzgu zzguVar4 = ((zzic) zzmbVar.b).f;
                        zzic.m(zzguVar4);
                        zzguVar4.l.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzic zzicVar2 = (zzic) zzmbVar.b;
                zzgu zzguVar5 = zzicVar2.f;
                zzic.m(zzguVar5);
                zzguVar5.o.c(string == null ? "null" : string, str5, "Logging screen view with name, class");
                zzlu zzluVar2 = zzmbVar.d == null ? zzmbVar.e : zzmbVar.d;
                zzpp zzppVar = zzicVar2.i;
                zzic.k(zzppVar);
                zzlu zzluVar3 = new zzlu(string, str5, zzppVar.O0(), true, j, j4);
                zzmbVar.d = zzluVar3;
                zzmbVar.e = zzluVar2;
                zzmbVar.j = zzluVar3;
                zzicVar2.k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzhz zzhzVar2 = zzicVar2.g;
                zzic.m(zzhzVar2);
                zzhzVar2.Z(new kqj(zzmbVar, bundle2, zzluVar3, zzluVar2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0414  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        zzabx zzabxVar;
        zzic zzicVar;
        boolean z;
        Object obj;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        awf c;
        String string;
        int i6;
        zzod zzodVar;
        String string2;
        String a;
        zzlj zzljVar;
        int i7;
        int c2;
        boolean equals;
        String str3;
        zzabx zzabxVar2;
        Q();
        zzic zzicVar2 = (zzic) this.b;
        zzgu zzguVar = zzicVar2.f;
        zzgu zzguVar2 = zzicVar2.f;
        zzic.m(zzguVar);
        zzguVar.n.a("Handle tcf update.");
        lmo lmoVar = zzicVar2.e;
        zzic.k(lmoVar);
        SharedPreferences V = lmoVar.V();
        vvf vvfVar = zzof.a;
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        a0p a0pVar = a0p.a;
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        a0p a0pVar2 = a0p.b;
        zzabw zzabwVar3 = zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzabw zzabwVar4 = zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzabw zzabwVar5 = zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        awf j = awf.j(7, new Object[]{zzabwVar, a0pVar, zzabwVar2, a0pVar2, zzabwVar3, a0pVar, zzabwVar4, a0pVar, zzabwVar5, a0pVar2, zzabw.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, a0pVar2, zzabw.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, a0pVar2}, null);
        int i8 = vv9.c;
        djh djhVar = new djh("CH");
        char[] cArr = new char[5];
        boolean contains = V.contains(AndroidTcfDataSource.TCF_TCSTRING_KEY);
        try {
            i = V.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = V.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        try {
            i3 = V.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i3 = -1;
        }
        try {
            i4 = V.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused4) {
            i4 = -1;
        }
        int i9 = i2;
        try {
            i5 = V.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i5 = -1;
        }
        String a2 = zzof.a(V, "IABTCF_PublisherCC");
        b10 d = lv9.d();
        cck it = j.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zzabxVar = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
            if (!hasNext) {
                break;
            }
            zzabw zzabwVar6 = (zzabw) it.next();
            boolean z2 = contains;
            int zza = zzabwVar6.zza();
            int i10 = i;
            djh djhVar2 = djhVar;
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 28);
            sb.append("IABTCF_PublisherRestrictions");
            sb.append(zza);
            String a3 = zzof.a(V, sb.toString());
            if (!TextUtils.isEmpty(a3) && a3.length() >= 755) {
                int digit = Character.digit(a3.charAt(754), 10);
                zzabxVar2 = zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED;
                if (digit >= 0 && digit <= zzabx.values().length && digit != 0) {
                    if (digit == 1) {
                        zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (digit == 2) {
                        zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                d.A(zzabwVar6, zzabxVar2);
                contains = z2;
                i = i10;
                djhVar = djhVar2;
            }
            zzabxVar2 = zzabxVar;
            d.A(zzabwVar6, zzabxVar2);
            contains = z2;
            i = i10;
            djhVar = djhVar2;
        }
        boolean z3 = contains;
        int i11 = i;
        djh djhVar3 = djhVar;
        awf c3 = d.c(true);
        String a4 = zzof.a(V, "IABTCF_PurposeConsents");
        String a5 = zzof.a(V, "IABTCF_VendorConsents");
        boolean z4 = !TextUtils.isEmpty(a5) && a5.length() >= 755 && a5.charAt(754) == '1';
        String a6 = zzof.a(V, "IABTCF_PurposeLegitimateInterests");
        String a7 = zzof.a(V, "IABTCF_VendorLegitimateInterests");
        if (TextUtils.isEmpty(a7)) {
            zzicVar = zzicVar2;
        } else {
            zzicVar = zzicVar2;
            if (a7.length() >= 755 && a7.charAt(754) == '1') {
                z = true;
                cArr[0] = '2';
                if (z3) {
                    c = awf.g;
                    obj = "EnableAdvertiserConsentMode";
                    obj2 = "gdprApplies";
                    obj4 = "Version";
                    obj3 = "CmpSdkID";
                    str2 = "1";
                    str = "0";
                } else {
                    zzabx zzabxVar3 = (zzabx) c3.get(zzabwVar);
                    zzabx zzabxVar4 = (zzabx) c3.get(zzabwVar3);
                    zzabx zzabxVar5 = (zzabx) c3.get(zzabwVar4);
                    zzabx zzabxVar6 = (zzabx) c3.get(zzabwVar5);
                    b10 d2 = lv9.d();
                    d2.A("Version", "2");
                    boolean z5 = z4;
                    d2.A("VendorConsent", true != z4 ? "0" : "1");
                    boolean z6 = z;
                    d2.A("VendorLegitimateInterest", true != z ? "0" : "1");
                    d2.A("gdprApplies", i3 != 1 ? "0" : "1");
                    d2.A("EnableAdvertiserConsentMode", i5 != 1 ? "0" : "1");
                    d2.A("PolicyVersion", String.valueOf(i9));
                    d2.A("CmpSdkID", String.valueOf(i11));
                    d2.A("PurposeOneTreatment", i4 != 1 ? "0" : "1");
                    d2.A("PublisherCC", a2);
                    d2.A("PublisherRestrictions1", String.valueOf(zzabxVar3 != null ? zzabxVar3.zza() : zzabxVar.zza()));
                    d2.A("PublisherRestrictions3", String.valueOf(zzabxVar4 != null ? zzabxVar4.zza() : zzabxVar.zza()));
                    d2.A("PublisherRestrictions4", String.valueOf(zzabxVar5 != null ? zzabxVar5.zza() : zzabxVar.zza()));
                    d2.A("PublisherRestrictions7", String.valueOf(zzabxVar6 != null ? zzabxVar6.zza() : zzabxVar.zza()));
                    int i12 = i3;
                    d2.B(awf.j(4, new Object[]{"Purpose1", zzof.d(zzabwVar, a4, a6), "Purpose3", zzof.d(zzabwVar3, a4, a6), "Purpose4", zzof.d(zzabwVar4, a4, a6), "Purpose7", zzof.d(zzabwVar5, a4, a6)}, null).entrySet());
                    obj = "EnableAdvertiserConsentMode";
                    str = "0";
                    str2 = "1";
                    obj2 = "gdprApplies";
                    obj3 = "CmpSdkID";
                    obj4 = "Version";
                    int i13 = i4;
                    String str4 = true != zzof.b(zzabwVar, j, c3, djhVar3, cArr, i5, i12, i13, a2, a4, a6, z5, z6) ? str : str2;
                    int i14 = i5;
                    d2.B(awf.j(5, new Object[]{"AuthorizePurpose1", str4, "AuthorizePurpose3", true != zzof.b(zzabwVar3, j, c3, djhVar3, cArr, i14, i12, i13, a2, a4, a6, z5, z6) ? str : str2, "AuthorizePurpose4", true != zzof.b(zzabwVar4, j, c3, djhVar3, cArr, i14, i12, i13, a2, a4, a6, z5, z6) ? str : str2, "AuthorizePurpose7", true != zzof.b(zzabwVar5, j, c3, djhVar3, cArr, i14, i12, i13, a2, a4, a6, z5, z6) ? str : str2, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                    c = d2.c(true);
                }
                zzod zzodVar2 = new zzod(c);
                zzic.m(zzguVar2);
                zzguVar2.o.b(zzodVar2, "Tcf preferences read");
                lmoVar.Q();
                string = lmoVar.U().getString("stored_tcf_param", "");
                HashMap hashMap = new HashMap();
                if (TextUtils.isEmpty(string)) {
                    for (String str5 : string.split(";")) {
                        String[] split = str5.split(U3.j.b);
                        if (split.length >= 2 && zzof.a.contains(split[0])) {
                            hashMap.put(split[0], split[1]);
                        }
                    }
                    i6 = 2;
                    zzodVar = new zzod(hashMap);
                } else {
                    zzodVar = new zzod(hashMap);
                    i6 = 2;
                }
                lmoVar.Q();
                string2 = lmoVar.U().getString("stored_tcf_param", "");
                a = zzodVar2.a();
                if (a.equals(string2)) {
                    SharedPreferences.Editor edit = lmoVar.U().edit();
                    edit.putString("stored_tcf_param", a);
                    edit.apply();
                    Bundle b = zzodVar2.b();
                    zzic.m(zzguVar2);
                    zzguVar2.o.b(b, "Consent generated from Tcf");
                    if (b != Bundle.EMPTY) {
                        zzicVar.k.getClass();
                        zzljVar = this;
                        zzljVar.k0(b, -30, System.currentTimeMillis());
                    } else {
                        zzljVar = this;
                    }
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = zzodVar.a;
                    String str6 = (hashMap2.isEmpty() || ((String) hashMap2.get(obj4)) != null) ? str : str2;
                    Bundle b2 = zzodVar2.b();
                    Bundle b3 = zzodVar.b();
                    bundle.putString("_tcfm", str6.concat((b2.size() == b3.size() && Objects.equals(b2.getString("ad_storage"), b3.getString("ad_storage")) && Objects.equals(b2.getString("ad_personalization"), b3.getString("ad_personalization")) && Objects.equals(b2.getString("ad_user_data"), b3.getString("ad_user_data"))) ? str : str2));
                    HashMap hashMap3 = zzodVar2.a;
                    String str7 = (String) hashMap3.get("PurposeDiagnostics");
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "200000";
                    }
                    bundle.putString("_tcfd2", str7);
                    StringBuilder sb2 = new StringBuilder(str2);
                    try {
                        str3 = (String) hashMap3.get(obj3);
                    } catch (NumberFormatException unused6) {
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        i7 = Integer.parseInt(str3);
                        if (i7 >= 0 || i7 > 4095) {
                            sb2.append("00");
                        } else {
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 >> 6));
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 & 63));
                        }
                        c2 = zzodVar2.c();
                        if (c2 >= 0 || c2 > 63) {
                            sb2.append(str);
                        } else {
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(c2));
                        }
                        int i15 = true == str2.equals(hashMap3.get(obj2)) ? 0 : i6;
                        equals = str2.equals(hashMap3.get(obj));
                        int i16 = i15 | 4;
                        if (equals) {
                            i16 = i15 | 12;
                        }
                        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16));
                        bundle.putString("_tcfd", sb2.toString());
                        zzljVar.X("auto", bundle, "_tcf");
                        return;
                    }
                    i7 = -1;
                    if (i7 >= 0) {
                    }
                    sb2.append("00");
                    c2 = zzodVar2.c();
                    if (c2 >= 0) {
                    }
                    sb2.append(str);
                    if (true == str2.equals(hashMap3.get(obj2))) {
                    }
                    equals = str2.equals(hashMap3.get(obj));
                    int i162 = i15 | 4;
                    if (equals) {
                    }
                    sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i162));
                    bundle.putString("_tcfd", sb2.toString());
                    zzljVar.X("auto", bundle, "_tcf");
                    return;
                }
                return;
            }
        }
        z = false;
        cArr[0] = '2';
        if (z3) {
        }
        zzod zzodVar22 = new zzod(c);
        zzic.m(zzguVar2);
        zzguVar2.o.b(zzodVar22, "Tcf preferences read");
        lmoVar.Q();
        string = lmoVar.U().getString("stored_tcf_param", "");
        HashMap hashMap4 = new HashMap();
        if (TextUtils.isEmpty(string)) {
        }
        lmoVar.Q();
        string2 = lmoVar.U().getString("stored_tcf_param", "");
        a = zzodVar22.a();
        if (a.equals(string2)) {
        }
    }

    public final void X(String str, Bundle bundle, String str2) {
        long j;
        Q();
        zzic zzicVar = (zzic) this.b;
        zzicVar.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzicVar.d.b0(null, zzfy.e1)) {
            zzicVar.k.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        Y(currentTimeMillis, j, bundle, str, str2);
    }

    public final void Y(long j, long j2, Bundle bundle, String str, String str2) {
        Q();
        boolean z = true;
        if (this.e != null && !zzpp.u0(str2)) {
            z = false;
        }
        Z(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        lmo lmoVar;
        DefaultClock defaultClock;
        zzal zzalVar;
        String str3;
        lmo lmoVar2;
        muo muoVar;
        long j3;
        boolean z4;
        long j4;
        boolean a;
        Bundle[] bundleArr;
        zzmb zzmbVar;
        long j5;
        int i;
        long j6;
        long j7;
        boolean X;
        ArrayList arrayList;
        Bundle[] bundleArr2;
        zzic zzicVar;
        int i2;
        Preconditions.f(str);
        Preconditions.i(bundle);
        Q();
        R();
        zzic zzicVar2 = (zzic) this.b;
        boolean c = zzicVar2.c();
        zzoc zzocVar = zzicVar2.h;
        zzal zzalVar2 = zzicVar2.d;
        Context context = zzicVar2.a;
        zzpp zzppVar = zzicVar2.i;
        zzgu zzguVar = zzicVar2.f;
        if (!c) {
            zzic.m(zzguVar);
            zzguVar.n.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = zzicVar2.q().l;
        if (list != null && !list.contains(str2)) {
            zzic.m(zzguVar);
            zzguVar.n.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.g) {
            this.g = true;
            try {
                try {
                    (!zzicVar2.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    zzic.m(zzguVar);
                    zzguVar.j.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                zzic.m(zzguVar);
                zzguVar.m.a("Tag Manager is not found and thus will not be used");
            }
        }
        zzgn zzgnVar = zzicVar2.j;
        lmo lmoVar3 = zzicVar2.e;
        DefaultClock defaultClock2 = zzicVar2.k;
        if (!zzalVar2.b0(null, zzfy.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            defaultClock2.getClass();
            lmoVar = lmoVar3;
            defaultClock = defaultClock2;
            zzalVar = zzalVar2;
            str3 = null;
            b0(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            lmoVar = lmoVar3;
            defaultClock = defaultClock2;
            zzalVar = zzalVar2;
            str3 = null;
        }
        if (!z || zzpp.k[0].equals(str2)) {
            lmoVar2 = lmoVar;
        } else {
            zzic.k(zzppVar);
            zzic.k(lmoVar);
            lmoVar2 = lmoVar;
            zzppVar.d0(bundle, lmoVar2.z.a());
        }
        muo muoVar2 = this.w;
        if (!z3 && !"_iap".equals(str2)) {
            zzic.k(zzppVar);
            int i3 = 2;
            if (zzppVar.T0("event", str2)) {
                if (zzppVar.V0("event", zzjm.a, ((zzic) zzppVar.b).d.b0(str3, zzfy.f1) ? zzjm.c : zzjm.b, str2)) {
                    i2 = 40;
                    if (zzppVar.W0(40, "event", str2)) {
                        i3 = 0;
                    }
                    if (i3 != 0) {
                        zzic.m(zzguVar);
                        zzguVar.i.b(zzgnVar.a(str2), "Invalid public event name. Event will not be logged (FE)");
                        zzic.k(zzppVar);
                        zzpp.i0(muoVar2, null, i3, "_ev", zzpp.X(i2, str2, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                } else {
                    i3 = 13;
                }
            }
            i2 = 40;
            if (i3 != 0) {
            }
        }
        zzmb zzmbVar2 = zzicVar2.l;
        zzic.l(zzmbVar2);
        zzlu U = zzmbVar2.U(false);
        if (U != null && !bundle.containsKey("_sc")) {
            U.d = true;
        }
        zzpp.M0(U, bundle, z && !z3);
        boolean equals = "am".equals(str);
        boolean u0 = zzpp.u0(str2);
        if (z) {
            muoVar = muoVar2;
            if (this.e != null && !u0) {
                if (!equals) {
                    zzic.m(zzguVar);
                    zzguVar.n.c(zzgnVar.a(str2), zzgnVar.e(bundle), "Passing event to registered event handler (FE)");
                    Preconditions.i(this.e);
                    this.e.a(j, bundle, str, str2);
                    return;
                }
                j3 = j;
                z4 = true;
                if (zzicVar2.h()) {
                    return;
                }
                zzic.k(zzppVar);
                zzic zzicVar3 = (zzic) zzppVar.b;
                int X0 = zzppVar.X0(str2);
                if (X0 != 0) {
                    zzic.m(zzguVar);
                    zzguVar.i.b(zzgnVar.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String X2 = zzpp.X(40, str2, true);
                    int length = str2 != null ? str2.length() : 0;
                    zzic.k(zzppVar);
                    zzpp.i0(muoVar, null, X0, "_ev", X2, length);
                    return;
                }
                boolean z5 = z4;
                Bundle a0 = zzppVar.a0(str2, bundle, CollectionUtils.a("_o", "_sn", "_sc", "_si"), z3);
                Preconditions.i(a0);
                zzic.l(zzmbVar2);
                if (zzmbVar2.U(false) == null || !"_ae".equals(str2)) {
                    j4 = 0;
                } else {
                    zzic.l(zzocVar);
                    c78 c78Var = zzocVar.g;
                    j4 = 0;
                    ((zzic) ((zzoc) c78Var.e).b).k.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j8 = elapsedRealtime - c78Var.c;
                    c78Var.c = elapsedRealtime;
                    if (j8 > 0) {
                        zzppVar.C0(a0, j8);
                    }
                }
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    String string2 = a0.getString("_ffr");
                    if (Strings.a(string2)) {
                        zzicVar = zzicVar3;
                        string2 = null;
                    } else {
                        if (string2 != null) {
                            string2 = string2.trim();
                        }
                        zzicVar = zzicVar3;
                    }
                    lmo lmoVar4 = zzicVar.e;
                    zzic.k(lmoVar4);
                    if (Objects.equals(string2, lmoVar4.w.a())) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.n.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        lmo lmoVar5 = zzicVar.e;
                        zzic.k(lmoVar5);
                        lmoVar5.w.b(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    lmo lmoVar6 = zzicVar3.e;
                    zzic.k(lmoVar6);
                    String a2 = lmoVar6.w.a();
                    if (!TextUtils.isEmpty(a2)) {
                        a0.putString("_ffr", a2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(a0);
                if (zzalVar.b0(null, zzfy.S0)) {
                    zzic.l(zzocVar);
                    zzocVar.Q();
                    a = zzocVar.e;
                } else {
                    zzic.k(lmoVar2);
                    a = lmoVar2.t.a();
                }
                zzic.k(lmoVar2);
                if (lmoVar2.q.a() > j4 && lmoVar2.Z(j3) && a) {
                    zzic.m(zzguVar);
                    zzguVar.o.a("Current session is expired, remove the session number, ID, and engagement time");
                    defaultClock.getClass();
                    bundleArr = null;
                    zzmbVar = zzmbVar2;
                    j5 = j4;
                    i = 0;
                    b0(System.currentTimeMillis(), null, "auto", "_sid");
                    defaultClock.getClass();
                    b0(System.currentTimeMillis(), null, "auto", "_sno");
                    defaultClock.getClass();
                    b0(System.currentTimeMillis(), null, "auto", "_se");
                    lmoVar2.r.b(j5);
                } else {
                    bundleArr = null;
                    zzmbVar = zzmbVar2;
                    j5 = j4;
                    i = 0;
                }
                if (a0.getLong("extend_session", j5) == 1) {
                    zzic.m(zzguVar);
                    zzguVar.o.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    zzic.l(zzocVar);
                    j6 = j;
                    j7 = j2;
                    zzocVar.f.h(j6, j7);
                } else {
                    j6 = j;
                    j7 = j2;
                }
                ArrayList arrayList3 = new ArrayList(a0.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                int i4 = i;
                while (i4 < size) {
                    String str4 = (String) arrayList3.get(i4);
                    if (str4 != null) {
                        zzic.k(zzppVar);
                        Object obj = a0.get(str4);
                        if (obj instanceof Bundle) {
                            arrayList = arrayList3;
                            bundleArr2 = new Bundle[1];
                            bundleArr2[i] = (Bundle) obj;
                        } else {
                            arrayList = arrayList3;
                            if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr2 = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr2 = bundleArr;
                            }
                        }
                        if (bundleArr2 != null) {
                            a0.putParcelableArray(str4, bundleArr2);
                        }
                    } else {
                        arrayList = arrayList3;
                    }
                    i4++;
                    arrayList3 = arrayList;
                }
                int i5 = i;
                while (i5 < arrayList2.size()) {
                    Bundle bundle2 = (Bundle) arrayList2.get(i5);
                    String str5 = i5 != 0 ? "_ep" : str2;
                    bundle2.putString("_o", str);
                    if (z2) {
                        bundle2 = zzppVar.w0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    zzbh zzbhVar = new zzbh(str5, new zzbf(bundle3), str, j6, j7);
                    zznl o = zzicVar2.o();
                    o.getClass();
                    o.Q();
                    o.R();
                    o.c0();
                    zzgl n = ((zzic) o.b).n();
                    n.getClass();
                    Parcel obtain = Parcel.obtain();
                    zzbi.a(zzbhVar, obtain, i);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        zzgu zzguVar3 = ((zzic) n.b).f;
                        zzic.m(zzguVar3);
                        zzguVar3.h.a("Event is too long for local database. Sending event directly to service");
                        X = false;
                    } else {
                        X = n.X(0, marshall);
                    }
                    o.e0(new nod(o, o.g0(true), X, zzbhVar, 2));
                    if (!z5) {
                        Iterator it = this.f.iterator();
                        while (it.hasNext()) {
                            ((zzjq) it.next()).a(j, new Bundle(bundle3), str, str2);
                        }
                    }
                    i5++;
                    j6 = j;
                    j7 = j2;
                    i = 0;
                }
                zzic.l(zzmbVar);
                if (zzmbVar.U(false) == null || !"_ae".equals(str2)) {
                    return;
                }
                zzic.l(zzocVar);
                defaultClock.getClass();
                zzocVar.g.q(SystemClock.elapsedRealtime(), true, true);
                return;
            }
        } else {
            muoVar = muoVar2;
        }
        j3 = j;
        z4 = equals;
        if (zzicVar2.h()) {
        }
    }

    public final void a0(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        zzic zzicVar = (zzic) this.b;
        if (z) {
            zzpp zzppVar = zzicVar.i;
            zzic.k(zzppVar);
            i = zzppVar.Z0(str2);
        } else {
            zzpp zzppVar2 = zzicVar.i;
            zzic.k(zzppVar2);
            if (zzppVar2.T0("user property", str2)) {
                if (zzppVar2.V0("user property", zzjo.a, null, str2)) {
                    zzal zzalVar = ((zzic) zzppVar2.b).d;
                    if (zzppVar2.W0(24, "user property", str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        muo muoVar = this.w;
        if (i != 0) {
            zzic.k(zzicVar.i);
            String X = zzpp.X(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            zzic.k(zzicVar.i);
            zzpp.i0(muoVar, null, i, "_ev", X, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new kqj(this, str3, str2, null, j, 2));
            return;
        }
        zzpp zzppVar3 = zzicVar.i;
        zzpp zzppVar4 = zzicVar.i;
        zzic.k(zzppVar3);
        int f0 = zzppVar3.f0(obj, str2);
        if (f0 != 0) {
            zzic.k(zzppVar4);
            String X2 = zzpp.X(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            zzic.k(zzppVar4);
            zzpp.i0(muoVar, null, f0, "_ev", X2, length);
            return;
        }
        zzic.k(zzppVar4);
        Object g0 = zzppVar4.g0(obj, str2);
        if (g0 != null) {
            zzhz zzhzVar2 = zzicVar.g;
            zzic.m(zzhzVar2);
            zzhzVar2.Z(new kqj(this, str3, str2, g0, j, 2));
        }
    }

    public final void b0(long j, Object obj, String str, String str2) {
        String str3;
        boolean X;
        Object obj2 = obj;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Preconditions.f(str2);
        Q();
        R();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j2);
                    lmo lmoVar = zzicVar.e;
                    zzic.k(lmoVar);
                    lmoVar.n.b(j2 == 1 ? "true" : "false");
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.o.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                lmo lmoVar2 = zzicVar.e;
                zzic.k(lmoVar2);
                lmoVar2.n.b("unset");
            } else {
                str4 = str2;
            }
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.o.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!zzicVar.c()) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.o.a("User property not set since app measurement is disabled");
            return;
        }
        if (zzicVar.h()) {
            zzpl zzplVar = new zzpl(j, obj3, str3, str);
            zznl o = zzicVar.o();
            o.Q();
            o.R();
            o.c0();
            zzgl n = ((zzic) o.b).n();
            n.getClass();
            Parcel obtain = Parcel.obtain();
            zzpm.a(zzplVar, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                zzgu zzguVar4 = ((zzic) n.b).f;
                zzic.m(zzguVar4);
                zzguVar4.h.a("User property too long for local database. Sending directly to service");
                X = false;
            } else {
                X = n.X(1, marshall);
            }
            o.e0(new nod(o, o.g0(true), X, zzplVar, 1));
        }
    }

    public final void c0() {
        Q();
        R();
        zzic zzicVar = (zzic) this.b;
        if (zzicVar.h()) {
            zzal zzalVar = zzicVar.d;
            ((zzic) zzalVar.b).getClass();
            Boolean d0 = zzalVar.d0("google_analytics_deferred_deep_link_enabled");
            if (d0 != null && d0.booleanValue()) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.n.a("Deferred Deep Link feature enabled.");
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Z(new bto(this, 2));
            }
            zznl o = zzicVar.o();
            o.Q();
            o.R();
            zzr g0 = o.g0(true);
            o.c0();
            zzic zzicVar2 = (zzic) o.b;
            zzicVar2.d.b0(null, zzfy.W0);
            zzicVar2.n().X(3, new byte[0]);
            o.e0(new mxo(o, g0, 0));
            this.s = false;
            lmo lmoVar = zzicVar.e;
            zzic.k(lmoVar);
            lmoVar.Q();
            String string = lmoVar.U().getString("previous_os_version", null);
            ((zzic) lmoVar.b).p().S();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = lmoVar.U().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.p().S();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            X("auto", bundle, "_ou");
        }
    }

    public final void d0(Bundle bundle, long j) {
        zzic zzicVar = (zzic) this.b;
        Preconditions.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        zzjh.b(bundle2, MBridgeConstans.APP_ID, String.class, null);
        zzjh.b(bundle2, "origin", String.class, null);
        zzjh.b(bundle2, "name", String.class, null);
        zzjh.b(bundle2, U3.i.X, Object.class, null);
        zzjh.b(bundle2, "trigger_event_name", String.class, null);
        zzjh.b(bundle2, "trigger_timeout", Long.class, 0L);
        zzjh.b(bundle2, "timed_out_event_name", String.class, null);
        zzjh.b(bundle2, "timed_out_event_params", Bundle.class, null);
        zzjh.b(bundle2, "triggered_event_name", String.class, null);
        zzjh.b(bundle2, "triggered_event_params", Bundle.class, null);
        zzjh.b(bundle2, "time_to_live", Long.class, 0L);
        zzjh.b(bundle2, "expired_event_name", String.class, null);
        zzjh.b(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.f(bundle2.getString("name"));
        Preconditions.f(bundle2.getString("origin"));
        Preconditions.i(bundle2.get(U3.i.X));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(U3.i.X);
        zzpp zzppVar = zzicVar.i;
        zzgn zzgnVar = zzicVar.j;
        zzgu zzguVar2 = zzicVar.f;
        zzic.k(zzppVar);
        if (zzppVar.Z0(string) != 0) {
            zzic.m(zzguVar2);
            zzguVar2.g.b(zzgnVar.c(string), "Invalid conditional user property name");
            return;
        }
        zzic.k(zzppVar);
        if (zzppVar.f0(obj, string) != 0) {
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgnVar.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object g0 = zzppVar.g0(obj, string);
        if (g0 == null) {
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgnVar.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        zzjh.a(bundle2, g0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgnVar.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgnVar.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new fuo(this, bundle2, 0));
        }
    }

    public final void e0(String str, Bundle bundle, String str2) {
        zzic zzicVar = (zzic) this.b;
        zzicVar.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Preconditions.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new bnn(this, bundle2, false, 26));
    }

    public final String f0() {
        zzic zzicVar = (zzic) this.b;
        try {
            return zzlt.a(zzicVar.a, zzicVar.p);
        } catch (IllegalStateException e) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void g0(zzjl zzjlVar, long j, boolean z) {
        int i = zzjlVar.b;
        Q();
        R();
        zzic zzicVar = (zzic) this.b;
        lmo lmoVar = zzicVar.e;
        zzgu zzguVar = zzicVar.f;
        zzic.k(lmoVar);
        zzjl X = lmoVar.X();
        if (j <= this.q && zzjl.l(X.b, i)) {
            zzic.m(zzguVar);
            zzguVar.m.b(zzjlVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        lmo lmoVar2 = zzicVar.e;
        zzic.k(lmoVar2);
        lmoVar2.Q();
        if (!zzjl.l(i, lmoVar2.U().getInt("consent_source", 100))) {
            zzic.m(zzguVar);
            zzguVar.m.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = lmoVar2.U().edit();
        edit.putString("consent_settings", zzjlVar.g());
        edit.putInt("consent_source", i);
        edit.apply();
        zzic.m(zzguVar);
        zzguVar.o.b(zzjlVar, "Setting storage consent(FE)");
        this.q = j;
        if (zzicVar.o().a0()) {
            zznl o = zzicVar.o();
            o.Q();
            o.R();
            o.e0(new uyo(o, 2));
        } else {
            zznl o2 = zzicVar.o();
            o2.Q();
            o2.R();
            if (o2.Z()) {
                o2.e0(new qxo(o2, o2.g0(false), 1));
            }
        }
        if (z) {
            zzicVar.o().U(new AtomicReference());
        }
    }

    public final void h0(Boolean bool, boolean z) {
        Q();
        R();
        zzic zzicVar = (zzic) this.b;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.n.b(bool, "Setting app measurement enabled (FE)");
        lmo lmoVar = zzicVar.e;
        zzic.k(lmoVar);
        lmoVar.Q();
        SharedPreferences.Editor edit = lmoVar.U().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            lmoVar.Q();
            SharedPreferences.Editor edit2 = lmoVar.U().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.Q();
        if (zzicVar.z || !(bool == null || bool.booleanValue())) {
            i0();
        }
    }

    public final void i0() {
        Q();
        zzic zzicVar = (zzic) this.b;
        lmo lmoVar = zzicVar.e;
        zzgu zzguVar = zzicVar.f;
        DefaultClock defaultClock = zzicVar.k;
        zzic.k(lmoVar);
        String a = lmoVar.n.a();
        int i = 1;
        if (a != null) {
            if ("unset".equals(a)) {
                defaultClock.getClass();
                b0(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0L : 1L);
                defaultClock.getClass();
                b0(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!zzicVar.c() || !this.s) {
            zzic.m(zzguVar);
            zzguVar.n.a("Updating Scion state (FE)");
            zznl o = zzicVar.o();
            o.Q();
            o.R();
            o.e0(new mxo(o, o.g0(true), i));
            return;
        }
        zzic.m(zzguVar);
        zzguVar.n.a("Recording app launch after enabling measurement for the first time (FE)");
        c0();
        zzoc zzocVar = zzicVar.h;
        zzic.l(zzocVar);
        zzocVar.f.mo905zza();
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new bto(this, i));
    }

    public final void j0() {
        zzic zzicVar = (zzic) this.b;
        if (!(zzicVar.a.getApplicationContext() instanceof Application) || this.d == null) {
            return;
        }
        ((Application) zzicVar.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.d);
    }

    public final void k0(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        zzji zzjiVar;
        zzic zzicVar = (zzic) this.b;
        R();
        zzjl zzjlVar = zzjl.c;
        zzjk[] zzjkVarArr = zzjj.STORAGE.a;
        int length = zzjkVarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                str = null;
                break;
            }
            String str2 = zzjkVarArr[i2].a;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i2++;
        }
        if (str != null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.l.b(str, "Ignoring invalid consent setting");
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.l.a("Valid consent values are 'granted', 'denied'");
        }
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        boolean W = zzhzVar.W();
        zzjl b = zzjl.b(i, bundle);
        Iterator it = b.a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zzjiVar = zzji.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((zzji) it.next()) != zzjiVar) {
                m0(b, W);
                break;
            }
        }
        zzba c = zzba.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((zzji) it2.next()) != zzjiVar) {
                l0(c, W);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = zzjl.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i == -30 ? "tcf" : "app";
            if (W) {
                b0(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                a0(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void l0(zzba zzbaVar, boolean z) {
        wjn wjnVar = new wjn(this, zzbaVar, false, 29);
        if (z) {
            Q();
            wjnVar.run();
        } else {
            zzhz zzhzVar = ((zzic) this.b).g;
            zzic.m(zzhzVar);
            zzhzVar.Z(wjnVar);
        }
    }

    public final void m0(zzjl zzjlVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        zzjl zzjlVar2;
        R();
        int i = zzjlVar.b;
        if (i != -10) {
            zzji zzjiVar = (zzji) zzjlVar.a.get(zzjk.AD_STORAGE);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            zzji zzjiVar2 = zzji.UNINITIALIZED;
            if (zzjiVar == zzjiVar2) {
                zzji zzjiVar3 = (zzji) zzjlVar.a.get(zzjk.ANALYTICS_STORAGE);
                if (zzjiVar3 == null) {
                    zzjiVar3 = zzjiVar2;
                }
                if (zzjiVar3 == zzjiVar2) {
                    zzgu zzguVar = ((zzic) this.b).f;
                    zzic.m(zzguVar);
                    zzguVar.l.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.i) {
            try {
                z2 = false;
                if (zzjl.l(i, this.o.b)) {
                    zzjl zzjlVar3 = this.o;
                    EnumMap enumMap = zzjlVar.a;
                    zzjk[] zzjkVarArr = (zzjk[]) enumMap.keySet().toArray(new zzjk[0]);
                    int length = zzjkVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        zzjk zzjkVar = zzjkVarArr[i2];
                        zzji zzjiVar4 = (zzji) enumMap.get(zzjkVar);
                        zzji zzjiVar5 = (zzji) zzjlVar3.a.get(zzjkVar);
                        zzji zzjiVar6 = zzji.DENIED;
                        if (zzjiVar4 == zzjiVar6 && zzjiVar5 != zzjiVar6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                    if (zzjlVar.i(zzjkVar2) && !this.o.i(zzjkVar2)) {
                        z2 = true;
                    }
                    zzjlVar = zzjlVar.k(this.o);
                    this.o = zzjlVar;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                zzjlVar2 = zzjlVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            zzgu zzguVar2 = ((zzic) this.b).f;
            zzic.m(zzguVar2);
            zzguVar2.m.b(zzjlVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.p.getAndIncrement();
        if (z3) {
            this.h.set(null);
            uuo uuoVar = new uuo(this, zzjlVar2, andIncrement, z4, 0);
            if (z) {
                Q();
                uuoVar.run();
                return;
            } else {
                zzhz zzhzVar = ((zzic) this.b).g;
                zzic.m(zzhzVar);
                zzhzVar.b0(uuoVar);
                return;
            }
        }
        uuo uuoVar2 = new uuo(this, zzjlVar2, andIncrement, z4, 1);
        if (z) {
            Q();
            uuoVar2.run();
        } else if (i == 30 || i == -10) {
            zzhz zzhzVar2 = ((zzic) this.b).g;
            zzic.m(zzhzVar2);
            zzhzVar2.b0(uuoVar2);
        } else {
            zzhz zzhzVar3 = ((zzic) this.b).g;
            zzic.m(zzhzVar3);
            zzhzVar3.Z(uuoVar2);
        }
    }

    public final void n0() {
        zzaif.a();
        zzic zzicVar = (zzic) this.b;
        zzal zzalVar = zzicVar.d;
        zzhz zzhzVar = zzicVar.g;
        zzgu zzguVar = zzicVar.f;
        if (zzalVar.b0(null, zzfy.P0)) {
            zzic.m(zzhzVar);
            if (zzhzVar.W()) {
                zzic.m(zzguVar);
                zzguVar.g.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzae.a()) {
                zzic.m(zzguVar);
                zzguVar.g.a("Cannot get trigger URIs from main thread");
                return;
            }
            R();
            zzic.m(zzguVar);
            zzguVar.o.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzic.m(zzhzVar);
            zzhzVar.a0(atomicReference, Ua.s, "get trigger URIs", new wto(this, atomicReference, 2, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzic.m(zzguVar);
                zzguVar.i.a("Timed out waiting for get trigger URIs");
            } else {
                zzic.m(zzhzVar);
                zzhzVar.Z(new Runnable() { // from class: kvo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlj zzljVar = zzlj.this;
                        zzljVar.Q();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        lmo lmoVar = ((zzic) zzljVar.b).e;
                        zzic.k(lmoVar);
                        SparseArray W = lmoVar.W();
                        for (zzoh zzohVar : list) {
                            int i = zzohVar.c;
                            if (!W.contains(i) || ((Long) W.get(i)).longValue() < zzohVar.b) {
                                zzljVar.o0().add(zzohVar);
                            }
                        }
                        zzljVar.p0();
                    }
                });
            }
        }
    }

    public final PriorityQueue o0() {
        PriorityQueue priorityQueue = this.n;
        if (priorityQueue != null) {
            return priorityQueue;
        }
        PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(nvo.b, v4n.n));
        this.n = priorityQueue2;
        return priorityQueue2;
    }

    public final void p0() {
        zzoh zzohVar;
        Q();
        if (o0().isEmpty() || this.j || (zzohVar = (zzoh) o0().poll()) == null) {
            return;
        }
        zzic zzicVar = (zzic) this.b;
        zzpp zzppVar = zzicVar.i;
        zzic.k(zzppVar);
        r1c r1cVar = zzppVar.g;
        if (r1cVar == null) {
            r1cVar = r1c.b(((zzic) zzppVar.b).a);
            zzppVar.g = r1cVar;
        }
        if (r1cVar != null) {
            this.j = true;
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzgs zzgsVar = zzguVar.o;
            String str = zzohVar.a;
            zzgsVar.b(str, "Registering trigger URI");
            ddb f = r1cVar.f(Uri.parse(str));
            boolean z = false;
            if (f != null) {
                f.addListener(new pyn(11, f, new f0o(this, zzohVar, z, 26)), new wog(this, 3));
            } else {
                this.j = false;
                o0().add(zzohVar);
            }
        }
    }

    public final void q0(zzjl zzjlVar) {
        Q();
        boolean z = (zzjlVar.i(zzjk.ANALYTICS_STORAGE) && zzjlVar.i(zzjk.AD_STORAGE)) || ((zzic) this.b).o().Z();
        zzic zzicVar = (zzic) this.b;
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.Q();
        if (z != zzicVar.z) {
            zzhz zzhzVar2 = zzicVar.g;
            zzic.m(zzhzVar2);
            zzhzVar2.Q();
            zzicVar.z = z;
            lmo lmoVar = ((zzic) this.b).e;
            zzic.k(lmoVar);
            lmoVar.Q();
            Boolean valueOf = lmoVar.U().contains("measurement_enabled_from_api") ? Boolean.valueOf(lmoVar.U().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                h0(Boolean.valueOf(z), false);
            }
        }
    }
}
