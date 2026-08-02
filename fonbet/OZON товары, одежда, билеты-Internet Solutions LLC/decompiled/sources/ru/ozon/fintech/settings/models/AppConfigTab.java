package ru.ozon.fintech.settings.models;

import G.g;
import I0.C3173b;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lru/ozon/fintech/settings/models/AppConfigTab;", "Landroid/os/Parcelable;", "id", "", "feature", "path", AppMeasurementSdk.ConditionalUserProperty.NAME, "icon", "iconSrc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFeature", "getPath", "getName", "getIcon", "getIconSrc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AppConfigTab implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppConfigTab> CREATOR = new a();

    @i(name = "feature")
    @NotNull
    private final String feature;

    @i(name = "icon")
    @NotNull
    private final String icon;

    @i(name = "iconSrc")
    @NotNull
    private final String iconSrc;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @i(name = "path")
    private final String path;

    public static final class a implements Parcelable.Creator<AppConfigTab> {
        @Override // android.os.Parcelable.Creator
        public final AppConfigTab createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppConfigTab(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppConfigTab[] newArray(int i11) {
            return new AppConfigTab[i11];
        }
    }

    public AppConfigTab(@NotNull String id2, @NotNull String feature, String str, @NotNull String name, @NotNull String icon, @NotNull String iconSrc) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconSrc, "iconSrc");
        this.id = id2;
        this.feature = feature;
        this.path = str;
        this.name = name;
        this.icon = icon;
        this.iconSrc = iconSrc;
    }

    public static /* synthetic */ AppConfigTab copy$default(AppConfigTab appConfigTab, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appConfigTab.id;
        }
        if ((i11 & 2) != 0) {
            str2 = appConfigTab.feature;
        }
        if ((i11 & 4) != 0) {
            str3 = appConfigTab.path;
        }
        if ((i11 & 8) != 0) {
            str4 = appConfigTab.name;
        }
        if ((i11 & 16) != 0) {
            str5 = appConfigTab.icon;
        }
        if ((i11 & 32) != 0) {
            str6 = appConfigTab.iconSrc;
        }
        String str7 = str5;
        String str8 = str6;
        return appConfigTab.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getIconSrc() {
        return this.iconSrc;
    }

    @NotNull
    public final AppConfigTab copy(@NotNull String id2, @NotNull String feature, String path, @NotNull String name, @NotNull String icon, @NotNull String iconSrc) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconSrc, "iconSrc");
        return new AppConfigTab(id2, feature, path, name, icon, iconSrc);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfigTab)) {
            return false;
        }
        AppConfigTab appConfigTab = (AppConfigTab) other;
        return Intrinsics.d(this.id, appConfigTab.id) && Intrinsics.d(this.feature, appConfigTab.feature) && Intrinsics.d(this.path, appConfigTab.path) && Intrinsics.d(this.name, appConfigTab.name) && Intrinsics.d(this.icon, appConfigTab.icon) && Intrinsics.d(this.iconSrc, appConfigTab.iconSrc);
    }

    @NotNull
    public final String getFeature() {
        return this.feature;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getIconSrc() {
        return this.iconSrc;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int a11 = g.a(this.id.hashCode() * 31, 31, this.feature);
        String str = this.path;
        return this.iconSrc.hashCode() + g.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.icon);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.feature;
        String str3 = this.path;
        String str4 = this.name;
        String str5 = this.icon;
        String str6 = this.iconSrc;
        StringBuilder d11 = C3660k.d("AppConfigTab(id=", str, ", feature=", str2, ", path=");
        Nh.a.h(d11, str3, ", name=", str4, ", icon=");
        return C3173b.c(d11, str5, ", iconSrc=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.feature);
        dest.writeString(this.path);
        dest.writeString(this.name);
        dest.writeString(this.icon);
        dest.writeString(this.iconSrc);
    }
}
