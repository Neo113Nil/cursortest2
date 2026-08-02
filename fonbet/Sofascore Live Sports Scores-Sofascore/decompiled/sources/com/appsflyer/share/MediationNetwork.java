package com.appsflyer.share;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import defpackage.jp5;
import defpackage.kp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/appsflyer/share/MediationNetwork;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", U3.i.X, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "IRONSOURCE", "APPLOVIN_MAX", "GOOGLE_ADMOB", "FYBER", "APPODEAL", "ADMOST", "TOPON", "TRADPLUS", "YANDEX", "CHARTBOOST", "UNITY", "TOPON_PTE", "CUSTOM_MEDIATION", "DIRECT_MONETIZATION_NETWORK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MediationNetwork {
    public static final MediationNetwork ADMOST;
    public static final MediationNetwork APPLOVIN_MAX;
    public static final MediationNetwork APPODEAL;
    public static final MediationNetwork CHARTBOOST;
    public static final MediationNetwork CUSTOM_MEDIATION;
    public static final MediationNetwork DIRECT_MONETIZATION_NETWORK;
    public static final MediationNetwork FYBER;
    public static final MediationNetwork GOOGLE_ADMOB;
    public static final MediationNetwork IRONSOURCE;
    public static final MediationNetwork TOPON;
    public static final MediationNetwork TOPON_PTE;
    public static final MediationNetwork TRADPLUS;
    public static final MediationNetwork UNITY;
    public static final MediationNetwork YANDEX;
    private static final /* synthetic */ jp5 d;
    private static final /* synthetic */ MediationNetwork[] registerClient;

    @NotNull
    private final String value;

    static {
        MediationNetwork mediationNetwork = new MediationNetwork("IRONSOURCE", 0, InneractiveMediationNameConsts.IRONSOURCE);
        IRONSOURCE = mediationNetwork;
        MediationNetwork mediationNetwork2 = new MediationNetwork("APPLOVIN_MAX", 1, "applovinmax");
        APPLOVIN_MAX = mediationNetwork2;
        MediationNetwork mediationNetwork3 = new MediationNetwork("GOOGLE_ADMOB", 2, "googleadmob");
        GOOGLE_ADMOB = mediationNetwork3;
        MediationNetwork mediationNetwork4 = new MediationNetwork("FYBER", 3, InneractiveMediationNameConsts.FYBER);
        FYBER = mediationNetwork4;
        MediationNetwork mediationNetwork5 = new MediationNetwork("APPODEAL", 4, "appodeal");
        APPODEAL = mediationNetwork5;
        MediationNetwork mediationNetwork6 = new MediationNetwork("ADMOST", 5, "Admost");
        ADMOST = mediationNetwork6;
        MediationNetwork mediationNetwork7 = new MediationNetwork("TOPON", 6, "Topon");
        TOPON = mediationNetwork7;
        MediationNetwork mediationNetwork8 = new MediationNetwork("TRADPLUS", 7, "Tradplus");
        TRADPLUS = mediationNetwork8;
        MediationNetwork mediationNetwork9 = new MediationNetwork("YANDEX", 8, "Yandex");
        YANDEX = mediationNetwork9;
        MediationNetwork mediationNetwork10 = new MediationNetwork("CHARTBOOST", 9, "chartboost");
        CHARTBOOST = mediationNetwork10;
        MediationNetwork mediationNetwork11 = new MediationNetwork("UNITY", 10, "Unity");
        UNITY = mediationNetwork11;
        MediationNetwork mediationNetwork12 = new MediationNetwork("TOPON_PTE", 11, "toponpte");
        TOPON_PTE = mediationNetwork12;
        MediationNetwork mediationNetwork13 = new MediationNetwork("CUSTOM_MEDIATION", 12, "customMediation");
        CUSTOM_MEDIATION = mediationNetwork13;
        MediationNetwork mediationNetwork14 = new MediationNetwork("DIRECT_MONETIZATION_NETWORK", 13, "directMonetizationNetwork");
        DIRECT_MONETIZATION_NETWORK = mediationNetwork14;
        MediationNetwork[] mediationNetworkArr = {mediationNetwork, mediationNetwork2, mediationNetwork3, mediationNetwork4, mediationNetwork5, mediationNetwork6, mediationNetwork7, mediationNetwork8, mediationNetwork9, mediationNetwork10, mediationNetwork11, mediationNetwork12, mediationNetwork13, mediationNetwork14};
        registerClient = mediationNetworkArr;
        d = new kp5(mediationNetworkArr);
    }

    private MediationNetwork(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return d;
    }

    public static MediationNetwork valueOf(String str) {
        return (MediationNetwork) Enum.valueOf(MediationNetwork.class, str);
    }

    public static MediationNetwork[] values() {
        return (MediationNetwork[]) registerClient.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
