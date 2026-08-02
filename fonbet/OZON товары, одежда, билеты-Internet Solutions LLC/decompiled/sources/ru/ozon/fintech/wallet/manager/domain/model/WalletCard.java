package ru.ozon.fintech.wallet.manager.domain.model;

import B0.C2454a;
import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/model/WalletCard;", "", "portfolioName", "", "fPanLastFour", "dPanLastFour", "cardNetwork", "", "tokenServiceProvider", "isDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getPortfolioName", "()Ljava/lang/String;", "getFPanLastFour", "getDPanLastFour", "getCardNetwork", "()I", "getTokenServiceProvider", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletCard {
    private final int cardNetwork;

    @NotNull
    private final String dPanLastFour;

    @NotNull
    private final String fPanLastFour;
    private final boolean isDefault;

    @NotNull
    private final String portfolioName;
    private final int tokenServiceProvider;

    public WalletCard(@NotNull String portfolioName, @NotNull String fPanLastFour, @NotNull String dPanLastFour, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(fPanLastFour, "fPanLastFour");
        Intrinsics.checkNotNullParameter(dPanLastFour, "dPanLastFour");
        this.portfolioName = portfolioName;
        this.fPanLastFour = fPanLastFour;
        this.dPanLastFour = dPanLastFour;
        this.cardNetwork = i11;
        this.tokenServiceProvider = i12;
        this.isDefault = z11;
    }

    public static /* synthetic */ WalletCard copy$default(WalletCard walletCard, String str, String str2, String str3, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = walletCard.portfolioName;
        }
        if ((i13 & 2) != 0) {
            str2 = walletCard.fPanLastFour;
        }
        if ((i13 & 4) != 0) {
            str3 = walletCard.dPanLastFour;
        }
        if ((i13 & 8) != 0) {
            i11 = walletCard.cardNetwork;
        }
        if ((i13 & 16) != 0) {
            i12 = walletCard.tokenServiceProvider;
        }
        if ((i13 & 32) != 0) {
            z11 = walletCard.isDefault;
        }
        int i14 = i12;
        boolean z12 = z11;
        return walletCard.copy(str, str2, str3, i11, i14, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFPanLastFour() {
        return this.fPanLastFour;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDPanLastFour() {
        return this.dPanLastFour;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCardNetwork() {
        return this.cardNetwork;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @NotNull
    public final WalletCard copy(@NotNull String portfolioName, @NotNull String fPanLastFour, @NotNull String dPanLastFour, int cardNetwork, int tokenServiceProvider, boolean isDefault) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(fPanLastFour, "fPanLastFour");
        Intrinsics.checkNotNullParameter(dPanLastFour, "dPanLastFour");
        return new WalletCard(portfolioName, fPanLastFour, dPanLastFour, cardNetwork, tokenServiceProvider, isDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletCard)) {
            return false;
        }
        WalletCard walletCard = (WalletCard) other;
        return Intrinsics.d(this.portfolioName, walletCard.portfolioName) && Intrinsics.d(this.fPanLastFour, walletCard.fPanLastFour) && Intrinsics.d(this.dPanLastFour, walletCard.dPanLastFour) && this.cardNetwork == walletCard.cardNetwork && this.tokenServiceProvider == walletCard.tokenServiceProvider && this.isDefault == walletCard.isDefault;
    }

    public final int getCardNetwork() {
        return this.cardNetwork;
    }

    @NotNull
    public final String getDPanLastFour() {
        return this.dPanLastFour;
    }

    @NotNull
    public final String getFPanLastFour() {
        return this.fPanLastFour;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    public final int getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDefault) + C2454a.a(this.tokenServiceProvider, C2454a.a(this.cardNetwork, g.a(g.a(this.portfolioName.hashCode() * 31, 31, this.fPanLastFour), 31, this.dPanLastFour), 31), 31);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @NotNull
    public String toString() {
        String str = this.portfolioName;
        String str2 = this.fPanLastFour;
        String str3 = this.dPanLastFour;
        int i11 = this.cardNetwork;
        int i12 = this.tokenServiceProvider;
        boolean z11 = this.isDefault;
        StringBuilder d11 = C3660k.d("WalletCard(portfolioName=", str, ", fPanLastFour=", str2, ", dPanLastFour=");
        Pk0.g.d(i11, str3, ", cardNetwork=", ", tokenServiceProvider=", d11);
        d11.append(i12);
        d11.append(", isDefault=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ WalletCard(String str, String str2, String str3, int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i11, i12, (i13 & 32) != 0 ? false : z11);
    }
}
