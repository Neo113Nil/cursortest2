package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.v0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.s1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class b implements e, v0, com.fyber.inneractive.sdk.config.cellular.h {
    public static final b h = new b();
    public final k a;
    public final com.fyber.inneractive.sdk.serverapi.c b;
    public final d c;
    public f d;
    public final AtomicReference e = new AtomicReference(null);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Object g = new Object();

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.b = cVar;
        d dVar = new d(cVar);
        this.c = dVar;
        this.a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.N;
        iAConfigManager.w.e = this;
        if (iAConfigManager.t.b.a(true, "bidding_token_wait_for_ua")) {
            s1 s1Var = iAConfigManager.x;
            s1Var.b();
            if (!s1Var.d.get()) {
                s1Var.c();
            }
            dVar.b = iAConfigManager.x.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.M) != null) {
            try {
                aVar.c.add(this);
            } catch (Throwable th) {
                IAlog.a("failed to add network observer", th, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.d = fVar;
        fVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x061d, code lost:
    
        if (r3.equals("2") == false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        JSONArray jSONArray;
        ?? r12;
        ?? r13;
        u0 u0Var;
        char c;
        char c2;
        o0 o0Var;
        String str;
        k kVar = this.a;
        kVar.b = (z0) kVar.b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.a;
        this.c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString a = h.a("1.2");
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.b).setVersion(a);
        if (this.e.get() != null) {
            this.c.a();
        }
        k kVar3 = this.a;
        TokenParametersOuterClass$TokenParameters.NullableString a2 = h.a(this.c.b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setUserAgent(a2);
        TokenParametersOuterClass$TokenParameters.NullableString a3 = h.a(this.c.c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setSdkVersion(a3);
        TokenParametersOuterClass$TokenParameters.NullableString a4 = h.a(this.c.d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setBundleID(a4);
        TokenParametersOuterClass$TokenParameters.NullableString a5 = h.a(this.c.e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceModel(a5);
        TokenParametersOuterClass$TokenParameters.NullableString a6 = h.a(this.c.f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setAppVersion(a6);
        TokenParametersOuterClass$TokenParameters.NullableString a7 = h.a(X3.d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceOS(a7);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 a8 = h.a(Build.VERSION.SDK_INT);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceApi(a8);
        TokenParametersOuterClass$TokenParameters.NullableString a9 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOsVersion(a9);
        TokenParametersOuterClass$TokenParameters.NullableString a10 = h.a(this.c.g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceLanguage(a10);
        TokenParametersOuterClass$TokenParameters.NullableString a11 = h.a(this.c.h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setCountryCode(a11);
        TokenParametersOuterClass$TokenParameters.NullableString a12 = h.a(this.c.i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setCarrierName(a12);
        TokenParametersOuterClass$TokenParameters.NullableString a13 = h.a(this.c.j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileCountryCode(a13);
        TokenParametersOuterClass$TokenParameters.NullableString a14 = h.a(this.c.k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileNetworkCode(a14);
        Long l = this.c.l;
        y newBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l != null) {
            int intValue = l.intValue();
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.b).setData(intValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.N;
        TokenParametersOuterClass$TokenParameters.NullableString a15 = h.a(iAConfigManager.C.g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setUserID(a15);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 a16 = h.a(this.c.m);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceWidth(a16);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 a17 = h.a(this.c.n);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceHeight(a17);
        q qVar = this.c.o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString a18 = h.a(this.c.p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setInputLanguages(a18);
        TokenParametersOuterClass$TokenParameters.NullableString a19 = h.a(this.c.H);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMediationType(a19);
        this.c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.D.p;
        TokenParametersOuterClass$TokenParameters.NullableString a20 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOdt(a20);
        Integer a21 = com.fyber.inneractive.sdk.serverapi.b.a();
        a0 newBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (a21 != null) {
            int intValue2 = a21.intValue();
            newBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder2.b).setData(intValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder2.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setAdServicesVersion(nullableUInt32);
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.C;
        if (gVar != null) {
            k kVar4 = this.a;
            if (gVar.m() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY || com.fyber.inneractive.sdk.util.o.a == null) {
                str = null;
            } else {
                gVar.o();
                if (gVar.e == null) {
                    gVar.k();
                }
                str = gVar.d;
                if (str == null) {
                    str = gVar.e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString a22 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprString(a22);
            TokenParametersOuterClass$TokenParameters.NullableBool a23 = h.a(gVar.e());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprConsent(a23);
            TokenParametersOuterClass$TokenParameters.NullableString a24 = h.a(com.fyber.inneractive.sdk.util.o.a == null ? null : gVar.h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setCcpaString(a24);
            TokenParametersOuterClass$TokenParameters.NullableBool a25 = h.a(com.fyber.inneractive.sdk.util.o.a == null ? null : gVar.i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setLgpdConsent(a25);
            Boolean bool = gVar.j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableBool a26 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.b).setCoppaApplies(a26);
            }
            com.fyber.inneractive.sdk.gpp.a aVar = gVar.m;
            String str2 = aVar.d;
            String str3 = aVar.a.get() == null ? null : aVar.b;
            if (com.fyber.inneractive.sdk.util.v.a(str2) || com.fyber.inneractive.sdk.util.v.a(str3)) {
                r newBuilder3 = TokenParametersOuterClass$TokenParameters.Gpp.newBuilder();
                if (com.fyber.inneractive.sdk.util.v.a(str2)) {
                    newBuilder3.c();
                    ((TokenParametersOuterClass$TokenParameters.Gpp) newBuilder3.b).setGppEncodedString(str2);
                } else {
                    IAlog.a("%ssetGppDataToToken No GPP String found, not adding to token", IAlog.a(this));
                }
                if (com.fyber.inneractive.sdk.util.v.a(str3)) {
                    newBuilder3.c();
                    ((TokenParametersOuterClass$TokenParameters.Gpp) newBuilder3.b).setGppSid(str3);
                } else {
                    IAlog.a("%ssetGppDataToToken No GPP SID found, not adding to token", IAlog.a(this));
                }
                k kVar6 = this.a;
                TokenParametersOuterClass$TokenParameters.Gpp gpp = (TokenParametersOuterClass$TokenParameters.Gpp) newBuilder3.a();
                kVar6.c();
                ((TokenParametersOuterClass$TokenParameters) kVar6.b).setGpp(gpp);
            } else {
                IAlog.a("%ssetGppDataToToken No GPP data found", IAlog.a(this));
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar7 = this.a;
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.a.b;
            boolean z = vVar != null ? vVar.b : false;
            kVar7.c();
            ((TokenParametersOuterClass$TokenParameters) kVar7.b).setDnt(z);
        }
        k kVar8 = this.a;
        TokenParametersOuterClass$TokenParameters.NullableString a27 = h.a(this.c.q);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setNetwork(a27);
        g0 g0Var = this.c.r;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setSecureContent(g0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool a28 = h.a(this.c.B);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryCharging(a28);
        TokenParametersOuterClass$TokenParameters.NullableBool a29 = h.a(this.c.s);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setHeadsetPlugged(a29);
        TokenParametersOuterClass$TokenParameters.NullableBool a30 = h.a(this.c.t);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBluetoothPlugged(a30);
        TokenParametersOuterClass$TokenParameters.NullableBool a31 = h.a(this.c.u);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setLowPowerMode(a31);
        boolean z2 = this.c.v;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setDarkMode(z2);
        TokenParametersOuterClass$TokenParameters.NullableBool a32 = h.a(this.c.w);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setAirplaneMode(a32);
        TokenParametersOuterClass$TokenParameters.NullableBool a33 = h.a(this.c.x);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setDndMode(a33);
        TokenParametersOuterClass$TokenParameters.NullableBool a34 = h.a(this.c.y);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setIsRingMuted(a34);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 a35 = h.a(this.c.z);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setSessionDuration(a35);
        String str4 = this.c.C;
        a0 newBuilder4 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str4)) {
            int parseInt = Integer.parseInt(str4);
            newBuilder4.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder4.b).setData(parseInt);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder4.a();
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryLevel(nullableUInt322);
        TokenParametersOuterClass$TokenParameters.NullableBool a36 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.w.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setPriorSkip(a36);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 a37 = h.a(this.c.D);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setUserAge(a37);
        InneractiveUserConfig.Gender gender = this.c.E;
        q0 q0Var = gender == InneractiveUserConfig.Gender.FEMALE ? q0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? q0.MALE : q0.UNKNOWN;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setUserGender(q0Var);
        TokenParametersOuterClass$TokenParameters.NullableString a38 = h.a(this.c.G);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setZipCode(a38);
        boolean z3 = this.c.F;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setMuteAudio(z3);
        TokenParametersOuterClass$TokenParameters.NullableBool a39 = h.a(this.c.L);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setMediaMuted(a39);
        com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.a.b;
        if (vVar2 != null ? vVar2.c : false) {
            k kVar9 = this.a;
            TokenParametersOuterClass$TokenParameters.NullableString a40 = h.a(this.c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.b).setAmazonId(a40);
        } else {
            k kVar10 = this.a;
            TokenParametersOuterClass$TokenParameters.NullableString a41 = h.a(this.c.A);
            kVar10.c();
            ((TokenParametersOuterClass$TokenParameters) kVar10.b).setAaid(a41);
        }
        UnitDisplayType[] values = UnitDisplayType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            boolean z4 = true;
            if (i >= length) {
                com.fyber.inneractive.sdk.serverapi.c cVar = this.b;
                cVar.getClass();
                com.fyber.inneractive.sdk.config.global.r a42 = com.fyber.inneractive.sdk.config.global.r.a();
                cVar.a = a42;
                a42.a(false, "");
                com.fyber.inneractive.sdk.config.global.r rVar = this.b.a;
                if (rVar != null) {
                    jSONArray = com.fyber.inneractive.sdk.config.global.g.a(rVar.b, true);
                    IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArray);
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            n newBuilder5 = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            String optString = optJSONObject.optString("id");
                            newBuilder5.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder5.b).setIdentifier(optString);
                            String optString2 = optJSONObject.optString("v");
                            newBuilder5.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder5.b).setVariant(optString2);
                            k kVar11 = this.a;
                            TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) newBuilder5.a();
                            kVar11.c();
                            ((TokenParametersOuterClass$TokenParameters) kVar11.b).addAbExperiments(experiment);
                        }
                    }
                }
                k kVar12 = this.a;
                int i3 = com.fyber.inneractive.sdk.config.k.a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.number");
                a0 newBuilder6 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!TextUtils.isEmpty(property)) {
                    int parseInt2 = Integer.parseInt(property);
                    newBuilder6.c();
                    ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder6.b).setData(parseInt2);
                }
                TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt323 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder6.a();
                kVar12.c();
                ((TokenParametersOuterClass$TokenParameters) kVar12.b).setPortal(nullableUInt323);
                k kVar13 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableString a43 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
                kVar13.c();
                ((TokenParametersOuterClass$TokenParameters) kVar13.b).setMockResponseId(a43);
                k kVar14 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableString a44 = h.a(this.c.I);
                kVar14.c();
                ((TokenParametersOuterClass$TokenParameters) kVar14.b).setIgniteVersion(a44);
                k kVar15 = this.a;
                TokenParametersOuterClass$TokenParameters.NullableString a45 = h.a(this.c.J);
                kVar15.c();
                ((TokenParametersOuterClass$TokenParameters) kVar15.b).setIgnitePackageName(a45);
                if (this.c.K) {
                    k kVar16 = this.a;
                    TokenParametersOuterClass$TokenParameters.NullableBool a46 = h.a(Boolean.TRUE);
                    kVar16.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar16.b).setChildMode(a46);
                }
                return ((TokenParametersOuterClass$TokenParameters) this.a.a()).toByteArray();
            }
            UnitDisplayType unitDisplayType = values[i];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = g.a;
                int i4 = iArr[unitDisplayType.ordinal()];
                o0 o0Var2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? o0.UNITDISPLAYTYPEUNKNOWN : o0.TYPENATIVE : o0.MRECT : o0.REWARDED : o0.INTERSTITIAL : o0.BANNER;
                com.fyber.inneractive.sdk.serverapi.a aVar2 = com.fyber.inneractive.sdk.serverapi.b.a;
                IAConfigManager iAConfigManager2 = IAConfigManager.N;
                String a47 = iAConfigManager2.w.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(a47) && a47.contains(StringUtils.COMMA)) {
                    a47 = a47.split(StringUtils.COMMA)[0];
                }
                if (!TextUtils.isEmpty(a47)) {
                    k kVar17 = this.a;
                    s newBuilder7 = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    newBuilder7.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder7.b).setAdomain(a47);
                    newBuilder7.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder7.b).setType(o0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder7.a();
                    kVar17.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar17.b).addLastAdomains(lastAdomain);
                }
                String a48 = iAConfigManager2.w.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(a48)) {
                    k kVar18 = this.a;
                    u newBuilder8 = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    newBuilder8.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder8.b).setLastBundle(a48);
                    newBuilder8.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder8.b).setType(o0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder8.a();
                    kVar18.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar18.b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.w.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar19 = this.a;
                    int i5 = iArr[unitDisplayType.ordinal()];
                    if (i5 == 1) {
                        c = 3;
                        c2 = 4;
                        o0Var = o0.BANNER;
                    } else if (i5 != 2) {
                        c = 3;
                        c = 3;
                        c = 3;
                        c = 3;
                        if (i5 != 3) {
                            c2 = 4;
                            c2 = 4;
                            c2 = 4;
                            o0Var = i5 != 4 ? i5 != 5 ? o0.UNITDISPLAYTYPEUNKNOWN : o0.TYPENATIVE : o0.MRECT;
                        } else {
                            c2 = 4;
                            o0Var = o0.REWARDED;
                        }
                    } else {
                        c = 3;
                        c2 = 4;
                        o0Var = o0.INTERSTITIAL;
                    }
                    kVar19.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar19.b).addPriorClicks(o0Var);
                    r12 = c;
                    r13 = c2;
                } else {
                    r12 = 3;
                    r13 = 4;
                }
                a("display", unitDisplayType, o0Var2);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, o0Var2);
                    String a49 = iAConfigManager2.w.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(a49)) {
                        k kVar20 = this.a;
                        b0 newBuilder9 = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        a49.getClass();
                        switch (a49.hashCode()) {
                            case 49:
                                if (a49.equals("1")) {
                                    z4 = false;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 50:
                                break;
                            case 51:
                                if (a49.equals("3")) {
                                    z4 = 2;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 52:
                                if (a49.equals("4")) {
                                    z4 = r12;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 53:
                                if (a49.equals(CampaignEx.CLICKMODE_ON)) {
                                    z4 = r13;
                                    break;
                                }
                                z4 = -1;
                                break;
                            default:
                                z4 = -1;
                                break;
                        }
                        switch (z4) {
                            case false:
                                u0Var = u0.CTABUTTON;
                                break;
                            case true:
                                u0Var = u0.COMPANION;
                                break;
                            case true:
                                u0Var = u0.VIDEOVIEW;
                                break;
                            case true:
                                u0Var = u0.APPINFO;
                                break;
                            case true:
                                u0Var = u0.STOREPROMO;
                                break;
                            default:
                                u0Var = u0.NOCLICK;
                                break;
                        }
                        newBuilder9.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder9.b).setClickType(u0Var);
                        newBuilder9.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder9.b).setType(o0Var2);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder9.a();
                        kVar20.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar20.b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i++;
        }
    }

    public final void b() {
        byte[] byteArray;
        if (this.f.compareAndSet(false, true)) {
            try {
                String encodeToString = Base64.encodeToString(a(), 2);
                IAConfigManager iAConfigManager = IAConfigManager.N;
                String str = iAConfigManager.l;
                com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.t.b;
                String str2 = "token_size_limit";
                int a = oVar.a("token_size_limit", 4000, 1);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "token_size_limit_" + str.toLowerCase(Locale.US);
                }
                TokenParametersOuterClass$TokenParameters a2 = iAConfigManager.H.a(oVar.a(str2, a, 1) - encodeToString.getBytes().length);
                if (a2 == null) {
                    byteArray = null;
                } else {
                    k kVar = this.a;
                    kVar.c();
                    com.fyber.inneractive.sdk.protobuf.t0.a(kVar.b, a2);
                    byteArray = ((TokenParametersOuterClass$TokenParameters) kVar.a()).toByteArray();
                }
                AtomicReference atomicReference = this.e;
                if (byteArray != null) {
                    encodeToString = Base64.encodeToString(byteArray, 2);
                }
                atomicReference.set(encodeToString);
            } catch (Throwable th) {
                IAlog.b("Failed to generate token with error: %s", th.getMessage());
            }
            this.f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.c.x;
        if (bool == null || bool.booleanValue() != z) {
            this.c.x = Boolean.valueOf(z);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.a.execute(new a(this));
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(a1 a1Var) {
        if (TextUtils.equals(this.c.q, a1Var.b())) {
            return;
        }
        this.c.q = a1Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, o0 o0Var) {
        ArrayList arrayList;
        int i;
        m0 m0Var;
        IAConfigManager iAConfigManager = IAConfigManager.N;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.w.a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i = Integer.parseInt(iAConfigManager.t.b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i = 5;
            }
            int i2 = i >= 0 ? i : 5;
            if (i2 > 0 && arrayList != null && arrayList.size() >= i2) {
                if (str.equals("video")) {
                    m0Var = m0.VIDEO;
                } else if (!str.equals("display")) {
                    m0Var = m0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    m0Var = m0.DISPLAY;
                }
                r0 newBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setSubType(m0Var);
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) it.next();
                    h0 newBuilder2 = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i4 = gVar.b;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setClicks(i4);
                    int i5 = gVar.a;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setImpressions(i5);
                    if (str.equals("video") || o0Var.equals(o0.REWARDED)) {
                        int i6 = gVar.c;
                        newBuilder2.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setCompletions(i6);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.a();
                    newBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).addSessionDataItems(sessionData);
                    i3++;
                    if (i3 >= i2) {
                        break;
                    }
                }
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setType(o0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.b).addUserSessions(userSession);
        }
    }
}
