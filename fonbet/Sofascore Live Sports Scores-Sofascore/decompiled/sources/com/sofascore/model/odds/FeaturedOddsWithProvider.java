package com.sofascore.model.odds;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/odds/FeaturedOddsWithProvider;", "Ljava/io/Serializable;", "countryProvider", "Lcom/sofascore/model/odds/OddsCountryProvider;", "featuredOdds", "Lcom/sofascore/model/odds/ProviderOdds;", "<init>", "(Lcom/sofascore/model/odds/OddsCountryProvider;Lcom/sofascore/model/odds/ProviderOdds;)V", "getCountryProvider", "()Lcom/sofascore/model/odds/OddsCountryProvider;", "getFeaturedOdds", "()Lcom/sofascore/model/odds/ProviderOdds;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FeaturedOddsWithProvider implements Serializable {

    @NotNull
    private final OddsCountryProvider countryProvider;

    @NotNull
    private final ProviderOdds featuredOdds;

    public FeaturedOddsWithProvider(@NotNull OddsCountryProvider oddsCountryProvider, @NotNull ProviderOdds providerOdds) {
        oddsCountryProvider.getClass();
        providerOdds.getClass();
        this.countryProvider = oddsCountryProvider;
        this.featuredOdds = providerOdds;
    }

    public static /* synthetic */ FeaturedOddsWithProvider copy$default(FeaturedOddsWithProvider featuredOddsWithProvider, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds, int i, Object obj) {
        if ((i & 1) != 0) {
            oddsCountryProvider = featuredOddsWithProvider.countryProvider;
        }
        if ((i & 2) != 0) {
            providerOdds = featuredOddsWithProvider.featuredOdds;
        }
        return featuredOddsWithProvider.copy(oddsCountryProvider, providerOdds);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OddsCountryProvider getCountryProvider() {
        return this.countryProvider;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ProviderOdds getFeaturedOdds() {
        return this.featuredOdds;
    }

    @NotNull
    public final FeaturedOddsWithProvider copy(@NotNull OddsCountryProvider countryProvider, @NotNull ProviderOdds featuredOdds) {
        countryProvider.getClass();
        featuredOdds.getClass();
        return new FeaturedOddsWithProvider(countryProvider, featuredOdds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedOddsWithProvider)) {
            return false;
        }
        FeaturedOddsWithProvider featuredOddsWithProvider = (FeaturedOddsWithProvider) other;
        return Intrinsics.c(this.countryProvider, featuredOddsWithProvider.countryProvider) && Intrinsics.c(this.featuredOdds, featuredOddsWithProvider.featuredOdds);
    }

    @NotNull
    public final OddsCountryProvider getCountryProvider() {
        return this.countryProvider;
    }

    @NotNull
    public final ProviderOdds getFeaturedOdds() {
        return this.featuredOdds;
    }

    public int hashCode() {
        return this.featuredOdds.hashCode() + (this.countryProvider.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FeaturedOddsWithProvider(countryProvider=" + this.countryProvider + ", featuredOdds=" + this.featuredOdds + ")";
    }
}
