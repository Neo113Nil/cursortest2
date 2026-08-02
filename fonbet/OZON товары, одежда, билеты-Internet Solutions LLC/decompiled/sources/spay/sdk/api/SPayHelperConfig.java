package spay.sdk.api;

import Bi.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n¨\u0006\u001b"}, d2 = {"Lspay/sdk/api/SPayHelperConfig;", "Landroid/os/Parcelable;", "isHelperEnabled", "", "disabledHelpers", "", "Lspay/sdk/api/SPayHelpers;", "(ZLjava/util/List;)V", "getDisabledHelpers", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SPayHelperConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SPayHelperConfig> CREATOR = new Creator();

    @NotNull
    private final List<SPayHelpers> disabledHelpers;
    private final boolean isHelperEnabled;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SPayHelperConfig> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SPayHelperConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z11 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(SPayHelpers.valueOf(parcel.readString()));
            }
            return new SPayHelperConfig(z11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SPayHelperConfig[] newArray(int i11) {
            return new SPayHelperConfig[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SPayHelperConfig(boolean z11, @NotNull List<? extends SPayHelpers> disabledHelpers) {
        Intrinsics.checkNotNullParameter(disabledHelpers, "disabledHelpers");
        this.isHelperEnabled = z11;
        this.disabledHelpers = disabledHelpers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SPayHelperConfig copy$default(SPayHelperConfig sPayHelperConfig, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sPayHelperConfig.isHelperEnabled;
        }
        if ((i11 & 2) != 0) {
            list = sPayHelperConfig.disabledHelpers;
        }
        return sPayHelperConfig.copy(z11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHelperEnabled() {
        return this.isHelperEnabled;
    }

    @NotNull
    public final List<SPayHelpers> component2() {
        return this.disabledHelpers;
    }

    @NotNull
    public final SPayHelperConfig copy(boolean isHelperEnabled, @NotNull List<? extends SPayHelpers> disabledHelpers) {
        Intrinsics.checkNotNullParameter(disabledHelpers, "disabledHelpers");
        return new SPayHelperConfig(isHelperEnabled, disabledHelpers);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayHelperConfig)) {
            return false;
        }
        SPayHelperConfig sPayHelperConfig = (SPayHelperConfig) other;
        return this.isHelperEnabled == sPayHelperConfig.isHelperEnabled && Intrinsics.d(this.disabledHelpers, sPayHelperConfig.disabledHelpers);
    }

    @NotNull
    public final List<SPayHelpers> getDisabledHelpers() {
        return this.disabledHelpers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z11 = this.isHelperEnabled;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return this.disabledHelpers.hashCode() + (r02 * 31);
    }

    public final boolean isHelperEnabled() {
        return this.isHelperEnabled;
    }

    @NotNull
    public String toString() {
        return "SPayHelperConfig(isHelperEnabled=" + this.isHelperEnabled + ", disabledHelpers=" + this.disabledHelpers + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isHelperEnabled ? 1 : 0);
        Iterator c11 = a.c(this.disabledHelpers, parcel);
        while (c11.hasNext()) {
            parcel.writeString(((SPayHelpers) c11.next()).name());
        }
    }

    public /* synthetic */ SPayHelperConfig(boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, list);
    }
}
