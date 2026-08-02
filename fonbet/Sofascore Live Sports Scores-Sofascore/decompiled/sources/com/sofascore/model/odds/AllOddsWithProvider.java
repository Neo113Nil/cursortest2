package com.sofascore.model.odds;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sofascore/model/odds/AllOddsWithProvider;", "Ljava/io/Serializable;", "countryProvider", "Lcom/sofascore/model/odds/OddsCountryProvider;", "allOdds", "", "Lcom/sofascore/model/odds/ProviderOdds;", "<init>", "(Lcom/sofascore/model/odds/OddsCountryProvider;Ljava/util/List;)V", "getCountryProvider", "()Lcom/sofascore/model/odds/OddsCountryProvider;", "getAllOdds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AllOddsWithProvider implements Serializable {

    @NotNull
    private final List<ProviderOdds> allOdds;

    @NotNull
    private final OddsCountryProvider countryProvider;

    public AllOddsWithProvider(@NotNull OddsCountryProvider oddsCountryProvider, @NotNull List<ProviderOdds> list) {
        oddsCountryProvider.getClass();
        list.getClass();
        this.countryProvider = oddsCountryProvider;
        this.allOdds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllOddsWithProvider copy$default(AllOddsWithProvider allOddsWithProvider, OddsCountryProvider oddsCountryProvider, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            oddsCountryProvider = allOddsWithProvider.countryProvider;
        }
        if ((i & 2) != 0) {
            list = allOddsWithProvider.allOdds;
        }
        return allOddsWithProvider.copy(oddsCountryProvider, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OddsCountryProvider getCountryProvider() {
        return this.countryProvider;
    }

    @NotNull
    public final List<ProviderOdds> component2() {
        return this.allOdds;
    }

    @NotNull
    public final AllOddsWithProvider copy(@NotNull OddsCountryProvider countryProvider, @NotNull List<ProviderOdds> allOdds) {
        countryProvider.getClass();
        allOdds.getClass();
        return new AllOddsWithProvider(countryProvider, allOdds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllOddsWithProvider)) {
            return false;
        }
        AllOddsWithProvider allOddsWithProvider = (AllOddsWithProvider) other;
        return Intrinsics.c(this.countryProvider, allOddsWithProvider.countryProvider) && Intrinsics.c(this.allOdds, allOddsWithProvider.allOdds);
    }

    @NotNull
    public final List<ProviderOdds> getAllOdds() {
        return this.allOdds;
    }

    @NotNull
    public final OddsCountryProvider getCountryProvider() {
        return this.countryProvider;
    }

    public int hashCode() {
        return this.allOdds.hashCode() + (this.countryProvider.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AllOddsWithProvider(countryProvider=" + this.countryProvider + ", allOdds=" + this.allOdds + ")";
    }
}
