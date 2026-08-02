package com.plaid.link.result;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.E1;
import com.plaid.internal.U3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/plaid/link/result/LinkAccountBalance;", "Landroid/os/Parcelable;", "available", "", "current", "currency", "", "localized", "Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/plaid/link/result/LocalizedLinkAccountBalance;)V", "getAvailable", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "getCurrent", "getLocalized", "()Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/plaid/link/result/LocalizedLinkAccountBalance;)Lcom/plaid/link/result/LinkAccountBalance;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkAccountBalance implements Parcelable {

    @c("available")
    @Nullable
    private final Double available;

    @c("currency")
    @Nullable
    private final String currency;

    @c("current")
    @Nullable
    private final Double current;

    @c("localized")
    @Nullable
    private final LocalizedLinkAccountBalance localized;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LinkAccountBalance> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountBalance$Companion;", "", "<init>", "()V", "Lcom/plaid/internal/E1;", "balance", "Lcom/plaid/link/result/LinkAccountBalance;", "convert$link_sdk_release", "(Lcom/plaid/internal/E1;)Lcom/plaid/link/result/LinkAccountBalance;", "convert", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final LinkAccountBalance convert$link_sdk_release(@Nullable E1 balance) {
            if (balance == null) {
                return null;
            }
            Double a10 = balance.a();
            Double c10 = balance.c();
            String b10 = balance.b();
            U3 d10 = balance.d();
            String a11 = d10 != null ? d10.a() : null;
            U3 d11 = balance.d();
            return new LinkAccountBalance(a10, c10, b10, new LocalizedLinkAccountBalance(a11, d11 != null ? d11.b() : null));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkAccountBalance createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkAccountBalance(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? LocalizedLinkAccountBalance.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkAccountBalance[] newArray(int i10) {
            return new LinkAccountBalance[i10];
        }
    }

    public LinkAccountBalance() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LinkAccountBalance copy$default(LinkAccountBalance linkAccountBalance, Double d10, Double d11, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = linkAccountBalance.available;
        }
        if ((i10 & 2) != 0) {
            d11 = linkAccountBalance.current;
        }
        if ((i10 & 4) != 0) {
            str = linkAccountBalance.currency;
        }
        if ((i10 & 8) != 0) {
            localizedLinkAccountBalance = linkAccountBalance.localized;
        }
        return linkAccountBalance.copy(d10, d11, str, localizedLinkAccountBalance);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getAvailable() {
        return this.available;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getCurrent() {
        return this.current;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    @NotNull
    public final LinkAccountBalance copy(@Nullable Double available, @Nullable Double current, @Nullable String currency, @Nullable LocalizedLinkAccountBalance localized) {
        return new LinkAccountBalance(available, current, currency, localized);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountBalance)) {
            return false;
        }
        LinkAccountBalance linkAccountBalance = (LinkAccountBalance) other;
        return Intrinsics.areEqual((Object) this.available, (Object) linkAccountBalance.available) && Intrinsics.areEqual((Object) this.current, (Object) linkAccountBalance.current) && Intrinsics.areEqual(this.currency, linkAccountBalance.currency) && Intrinsics.areEqual(this.localized, linkAccountBalance.localized);
    }

    @Nullable
    public final Double getAvailable() {
        return this.available;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Double getCurrent() {
        return this.current;
    }

    @Nullable
    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    public int hashCode() {
        Double d10 = this.available;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.current;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.currency;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        return hashCode3 + (localizedLinkAccountBalance != null ? localizedLinkAccountBalance.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LinkAccountBalance(available=" + this.available + ", current=" + this.current + ", currency=" + this.currency + ", localized=" + this.localized + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d10 = this.available;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        Double d11 = this.current;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        parcel.writeString(this.currency);
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        if (localizedLinkAccountBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizedLinkAccountBalance.writeToParcel(parcel, flags);
        }
    }

    public LinkAccountBalance(@Nullable Double d10, @Nullable Double d11, @Nullable String str, @Nullable LocalizedLinkAccountBalance localizedLinkAccountBalance) {
        this.available = d10;
        this.current = d11;
        this.currency = str;
        this.localized = localizedLinkAccountBalance;
    }

    public /* synthetic */ LinkAccountBalance(Double d10, Double d11, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : localizedLinkAccountBalance);
    }
}
