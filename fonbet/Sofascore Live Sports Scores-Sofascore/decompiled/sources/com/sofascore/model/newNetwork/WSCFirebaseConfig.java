package com.sofascore.model.newNetwork;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.wt3;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/sofascore/model/newNetwork/WSCFirebaseConfig;", "Ljava/io/Serializable;", "countries", "", "", "mainScreenCountries", "storyPlayerAdsEnabled", "", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "getCountries", "()Ljava/util/List;", "getMainScreenCountries", "getStoryPlayerAdsEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WSCFirebaseConfig implements Serializable {

    @NotNull
    private final List<String> countries;

    @NotNull
    private final List<String> mainScreenCountries;
    private final boolean storyPlayerAdsEnabled;

    public WSCFirebaseConfig(@NotNull List<String> list, @NotNull List<String> list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.countries = list;
        this.mainScreenCountries = list2;
        this.storyPlayerAdsEnabled = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSCFirebaseConfig copy$default(WSCFirebaseConfig wSCFirebaseConfig, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSCFirebaseConfig.countries;
        }
        if ((i & 2) != 0) {
            list2 = wSCFirebaseConfig.mainScreenCountries;
        }
        if ((i & 4) != 0) {
            z = wSCFirebaseConfig.storyPlayerAdsEnabled;
        }
        return wSCFirebaseConfig.copy(list, list2, z);
    }

    @NotNull
    public final List<String> component1() {
        return this.countries;
    }

    @NotNull
    public final List<String> component2() {
        return this.mainScreenCountries;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getStoryPlayerAdsEnabled() {
        return this.storyPlayerAdsEnabled;
    }

    @NotNull
    public final WSCFirebaseConfig copy(@NotNull List<String> countries, @NotNull List<String> mainScreenCountries, boolean storyPlayerAdsEnabled) {
        countries.getClass();
        mainScreenCountries.getClass();
        return new WSCFirebaseConfig(countries, mainScreenCountries, storyPlayerAdsEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WSCFirebaseConfig)) {
            return false;
        }
        WSCFirebaseConfig wSCFirebaseConfig = (WSCFirebaseConfig) other;
        return Intrinsics.c(this.countries, wSCFirebaseConfig.countries) && Intrinsics.c(this.mainScreenCountries, wSCFirebaseConfig.mainScreenCountries) && this.storyPlayerAdsEnabled == wSCFirebaseConfig.storyPlayerAdsEnabled;
    }

    @NotNull
    public final List<String> getCountries() {
        return this.countries;
    }

    @NotNull
    public final List<String> getMainScreenCountries() {
        return this.mainScreenCountries;
    }

    public final boolean getStoryPlayerAdsEnabled() {
        return this.storyPlayerAdsEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.storyPlayerAdsEnabled) + dmi.d(this.countries.hashCode() * 31, 31, this.mainScreenCountries);
    }

    @NotNull
    public String toString() {
        List<String> list = this.countries;
        List<String> list2 = this.mainScreenCountries;
        return wt3.p(fc6.s("WSCFirebaseConfig(countries=", ", mainScreenCountries=", ", storyPlayerAdsEnabled=", list, list2), this.storyPlayerAdsEnabled, ")");
    }
}
