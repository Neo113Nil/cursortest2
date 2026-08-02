package ru.ozon.app.android.tabbar.data;

import NZ.h;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/tabbar/data/LocalTabConfig;", "Lru/ozon/app/android/tabbar/data/TabConfig;", "LNZ/h;", "tabNavigatorConfig", "<init>", "(LNZ/h;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LNZ/h;", "getTabNavigatorConfig", "()LNZ/h;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LocalTabConfig extends TabConfig {

    @NotNull
    public static final Parcelable.Creator<LocalTabConfig> CREATOR = new Creator();

    @NotNull
    private final h tabNavigatorConfig;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalTabConfig> {
        @Override // android.os.Parcelable.Creator
        public final LocalTabConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalTabConfig((h) parcel.readParcelable(LocalTabConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocalTabConfig[] newArray(int i11) {
            return new LocalTabConfig[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabConfig(@NotNull h tabNavigatorConfig) {
        super(null);
        Intrinsics.checkNotNullParameter(tabNavigatorConfig, "tabNavigatorConfig");
        this.tabNavigatorConfig = tabNavigatorConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalTabConfig) && Intrinsics.d(this.tabNavigatorConfig, ((LocalTabConfig) other).tabNavigatorConfig);
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfig
    @NotNull
    public h getTabNavigatorConfig() {
        return this.tabNavigatorConfig;
    }

    public int hashCode() {
        return this.tabNavigatorConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalTabConfig(tabNavigatorConfig=" + this.tabNavigatorConfig + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.tabNavigatorConfig, flags);
    }
}
