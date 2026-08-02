package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṫ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0891 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2995 = StringFog.decrypt("7CWaJCe9boz/KYEHD7hpjOwlnCAsqnOM5SOL\n", "i0DuaULZB+0=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2994 = StringFog.decrypt("q5pW27oSUrypr077vSNGqaKLduOuIw==\n", "zP8imt5GK8w=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2993 = StringFog.decrypt("QDYs1DkO6VFUIDHyOjr6QEYDNPw3G/ZRSScM5CQb\n", "J1NYnVR+mzQ=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2992 = StringFog.decrypt("rfEXLlRs6nO55woIV1j5YqvGBgldeep/pPMwA1I=\n", "ypRjZzkcmBY=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2991 = StringFog.decrypt("yOf3TBNYJfrc8epqEGw2687Q5msaTSX2weXQYRV+Mu3c6+xr\n", "r4KDBX4oV58=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2990 = StringFog.decrypt("bsT3F3RtDjl60uoxd1kdKGjl5jN4cxgPZtTxPXw=\n", "CaGDXhkdfFw=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2989 = StringFog.decrypt("4Zjt3ndJ9Tb1jvD4dH3mJ+er+OVzWOknz5k=\n", "hv2Zlxo5h1M=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2988 = StringFog.decrypt("w/ZQ7xEA0fzX4E3JEjTC7cXdQdIsEdr20ec=\n", "pJMkpnxwo5k=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2987 = StringFog.decrypt("8BCYS5d3XaXkBoVtlENOtPY2nmebc0a28jyI\n", "l3XsAvoHL8A=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2986 = StringFog.decrypt("+55vpcBebJjviHKDw2p/if26f5rIXGqU755pqMJDf5Ty\n", "nPsb7K0uHv0=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2985 = StringFog.decrypt("veU7qSi/ovGp8yaPK4ux4LvDLo01rrnztMkr\n", "2oBP4EXP0JQ=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2984 = StringFog.decrypt("5JAdTv8TgCA=\n", "g/VpD49jyUQ=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2983 = StringFog.decrypt("3f2JII002PE=\n", "upj9c/lbqpQ=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2982 = StringFog.decrypt("DLkdv++ZhFYOriqR5Z6dRR6uCIril5pR\n", "a9xp/ov49CI=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2981 = StringFog.decrypt("4tmJNCFL0Lzo2ZMQDE7noPXZ\n", "hbz9ZE0qs9k=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2980 = StringFog.decrypt("KRy1fSlc4FcjHK9ZC1zuVw==\n", "TnnBLUU9gzI=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2979 = StringFog.decrypt("hz9iKZ7j6vKNP3gNgcro+YQ2cws=\n", "4FoWefKCiZc=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2978 = StringFog.decrypt("q62lJW6OkNqpjb8RZw==\n", "zMjRZAra6ao=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2977 = StringFog.decrypt("ed+PpbART5V5zpKYtwRGq2PJj4mwAFg=\n", "Crr77N5lKuc=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2976 = StringFog.decrypt("giZE5A1MB3iVJlT6AUgSb58mQg==\n", "8UMwtmg7Zgo=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2975 = StringFog.decrypt("LfIM4GNuah4t8wvgdQ==\n", "TIF/hREaOWo=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2974 = StringFog.decrypt("AqK90cpl7w==\n", "RMPUo4gMi2g=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2973 = StringFog.decrypt("Dq3FSZ7LVQkthcBOnthZFA==\n", "Q8ihIP+/PGY=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2972 = StringFog.decrypt("bseALQe/\n", "L6PUVHfaxD8=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2971 = StringFog.decrypt("RPi1a9KnnDpi\n", "BZzGKL3J+lM=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2970 = StringFog.decrypt("PwuVggV2IfwcLZ6FAmsv\n", "cm7x62QCSJM=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2969 = StringFog.decrypt("HSqLxKZjaEY5NaLGrWphTT8=\n", "TUbqp8MODSg=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2968 = StringFog.decrypt("O/wFaDof8/0f\n", "a5BkC19ylpM=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2967 = StringFog.decrypt("zAVcnLwP6abxAkmVghXuu+AFTYs=\n", "hWso+c58nc8=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2966 = StringFog.decrypt("uEGK0KwKgdemTY7FuwCBwQ==\n", "6iT9sd5u5LM=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2965 = StringFog.decrypt("iPvb7O3kLXKu+O///PY=\n", "wZarnoiXXhs=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2964 = StringFog.decrypt("UayzK9Q9w5Nsq6Yi\n", "GMLHTqZOt/o=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2963 = StringFog.decrypt("ML/hs2gs+3IUh/mgaA==\n", "YNOA0A1Bnhw=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2962 = StringFog.decrypt("xgFdYZfdJRU=\n", "lGQqAOW5QHE=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2961 = StringFog.decrypt("uvA5siNJ91eG9iU=\n", "6ZhWxWw5gz4=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2960 = StringFog.decrypt("pyLXpRwIkWA=\n", "5EO0zXls0AQ=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2959 = StringFog.decrypt("PN1XrX9sdFsW2VOudWw=\n", "crgj2hAeHxo=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2958 = StringFog.decrypt("10WYIMz6xuP5TpU=\n", "liH5ULiftLM=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2957 = StringFog.decrypt("jaffOgqzoXyjrdgjGaOhXriq0SQ=\n", "zMO+Sn7W0z8=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2956 = StringFog.decrypt("9GmvtW2bd0XUfqc=\n", "sR/K2xnIAzc=\n");

    public C0891(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            try {
                return (String) FairBid.class.getDeclaredField(StringFog.decrypt("w86Ri0RHN/7ZxZQ=\n", "kIra1BICZa0=\n")).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1050 c1050 = C0267.m139().f487;
            String decrypt = StringFog.decrypt("54OY0kx+oPfkg5jSTH6g9+SDmNJMft8=\n", "udjEthFV+9k=\n");
            c1050.getClass();
            return C1050.m621((Object) null, FairBid.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2995, new C1032(this));
        hashMap.put(f2994, new C0956(this));
        hashMap.put(f2993, new C0925(this));
        hashMap.put(f2992, new C0924(this));
        hashMap.put(f2991, new C0923(this));
        hashMap.put(f2990, new C0922(this));
        hashMap.put(f2989, new C0902(this));
        hashMap.put(f2988, new C0899(this));
        hashMap.put(f2987, new C0893(this));
        hashMap.put(f2986, new C1165(this));
        hashMap.put(f2985, new C1157(this));
        hashMap.put(f2984, new C1149(this));
        hashMap.put(f2983, new C1147(this));
        hashMap.put(f2982, new C1140(this));
        hashMap.put(f2981, new C1139(this));
        hashMap.put(f2980, new C1126(this));
        hashMap.put(f2979, new C1125(this));
        hashMap.put(f2978, new C1096(this));
        hashMap.put(f2977, new C1056(this));
        hashMap.put(f2976, new C1017(this));
        hashMap.put(f2975, new C1001(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(f2958)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1598046662:
                if (str.equals(f2970)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f2965)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -847426041:
                if (str.equals(f2957)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f2968)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -368841467:
                if (str.equals(f2960)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -174936018:
                if (str.equals(f2962)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f2963)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 438795617:
                if (str.equals(f2959)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 578208537:
                if (str.equals(f2974)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 769047372:
                if (str.equals(f2964)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 806552769:
                if (str.equals(f2961)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1062384924:
                if (str.equals(f2969)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1212533506:
                if (str.equals(f2966)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(f2967)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1775008410:
                if (str.equals(f2956)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1884304309:
                if (str.equals(f2973)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(f2972)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1969669106:
                if (str.equals(f2971)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case '\b':
                return RewardedListener.class;
            case '\t':
                return ImpressionData.class;
            case '\n':
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case '\f':
                return Rewarded.class;
            case '\r':
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }
}
