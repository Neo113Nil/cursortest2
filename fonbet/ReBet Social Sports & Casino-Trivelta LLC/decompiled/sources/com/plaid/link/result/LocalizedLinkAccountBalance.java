package com.plaid.link.result;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "Landroid/os/Parcelable;", "available", "", "current", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvailable", "()Ljava/lang/String;", "getCurrent", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocalizedLinkAccountBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocalizedLinkAccountBalance> CREATOR = new Creator();

    @c("available")
    @Nullable
    private final String available;

    @c("current")
    @Nullable
    private final String current;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalizedLinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LocalizedLinkAccountBalance createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalizedLinkAccountBalance(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LocalizedLinkAccountBalance[] newArray(int i10) {
            return new LocalizedLinkAccountBalance[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalizedLinkAccountBalance() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LocalizedLinkAccountBalance copy$default(LocalizedLinkAccountBalance localizedLinkAccountBalance, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localizedLinkAccountBalance.available;
        }
        if ((i10 & 2) != 0) {
            str2 = localizedLinkAccountBalance.current;
        }
        return localizedLinkAccountBalance.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAvailable() {
        return this.available;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    @NotNull
    public final LocalizedLinkAccountBalance copy(@Nullable String available, @Nullable String current) {
        return new LocalizedLinkAccountBalance(available, current);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalizedLinkAccountBalance)) {
            return false;
        }
        LocalizedLinkAccountBalance localizedLinkAccountBalance = (LocalizedLinkAccountBalance) other;
        return Intrinsics.areEqual(this.available, localizedLinkAccountBalance.available) && Intrinsics.areEqual(this.current, localizedLinkAccountBalance.current);
    }

    @Nullable
    public final String getAvailable() {
        return this.available;
    }

    @Nullable
    public final String getCurrent() {
        return this.current;
    }

    public int hashCode() {
        String str = this.available;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.current;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LocalizedLinkAccountBalance(available=" + this.available + ", current=" + this.current + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.available);
        parcel.writeString(this.current);
    }

    public LocalizedLinkAccountBalance(@Nullable String str, @Nullable String str2) {
        this.available = str;
        this.current = str2;
    }

    public /* synthetic */ LocalizedLinkAccountBalance(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
