package ru.ozon.fintech.settings.models;

import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/fintech/settings/models/AppConfig;", "Landroid/os/Parcelable;", "", "source", "", "Lru/ozon/fintech/settings/models/AppConfigTab;", DynamicElementDTO.TABS, "Lru/ozon/fintech/settings/models/AuthPinpad;", "authPinpad", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/fintech/settings/models/AuthPinpad;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lru/ozon/fintech/settings/models/AuthPinpad;", "copy", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/fintech/settings/models/AuthPinpad;)Lru/ozon/fintech/settings/models/AppConfig;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Ljava/util/List;", "getTabs", "Lru/ozon/fintech/settings/models/AuthPinpad;", "getAuthPinpad", "Companion", "a", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AppConfig implements Parcelable {

    @NotNull
    public static final String CHO = "CHO";

    /* renamed from: NB, reason: collision with root package name */
    @NotNull
    public static final String f97035NB = "NB";
    private final AuthPinpad authPinpad;

    @i(name = "source")
    @NotNull
    private final String source;

    @i(name = DynamicElementDTO.TABS)
    @NotNull
    private final List<AppConfigTab> tabs;

    @NotNull
    public static final Parcelable.Creator<AppConfig> CREATOR = new b();

    public static final class b implements Parcelable.Creator<AppConfig> {
        @Override // android.os.Parcelable.Creator
        public final AppConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(AppConfigTab.CREATOR, parcel, arrayList, i11, 1);
            }
            return new AppConfig(readString, arrayList, parcel.readInt() == 0 ? null : AuthPinpad.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppConfig[] newArray(int i11) {
            return new AppConfig[i11];
        }
    }

    public AppConfig(@NotNull String source, @NotNull List<AppConfigTab> tabs, AuthPinpad authPinpad) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.source = source;
        this.tabs = tabs;
        this.authPinpad = authPinpad;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, List list, AuthPinpad authPinpad, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appConfig.source;
        }
        if ((i11 & 2) != 0) {
            list = appConfig.tabs;
        }
        if ((i11 & 4) != 0) {
            authPinpad = appConfig.authPinpad;
        }
        return appConfig.copy(str, list, authPinpad);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final List<AppConfigTab> component2() {
        return this.tabs;
    }

    /* renamed from: component3, reason: from getter */
    public final AuthPinpad getAuthPinpad() {
        return this.authPinpad;
    }

    @NotNull
    public final AppConfig copy(@NotNull String source, @NotNull List<AppConfigTab> tabs, AuthPinpad authPinpad) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new AppConfig(source, tabs, authPinpad);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        return Intrinsics.d(this.source, appConfig.source) && Intrinsics.d(this.tabs, appConfig.tabs) && Intrinsics.d(this.authPinpad, appConfig.authPinpad);
    }

    public final AuthPinpad getAuthPinpad() {
        return this.authPinpad;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final List<AppConfigTab> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        int b11 = g.b(this.source.hashCode() * 31, 31, this.tabs);
        AuthPinpad authPinpad = this.authPinpad;
        return b11 + (authPinpad == null ? 0 : authPinpad.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.source;
        List<AppConfigTab> list = this.tabs;
        AuthPinpad authPinpad = this.authPinpad;
        StringBuilder f7 = Tl.b.f("AppConfig(source=", str, ", tabs=", ", authPinpad=", list);
        f7.append(authPinpad);
        f7.append(")");
        return f7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        Iterator c11 = Bi.a.c(this.tabs, dest);
        while (c11.hasNext()) {
            ((AppConfigTab) c11.next()).writeToParcel(dest, flags);
        }
        AuthPinpad authPinpad = this.authPinpad;
        if (authPinpad == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            authPinpad.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AppConfig(String str, List list, AuthPinpad authPinpad, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CHO : str, list, (i11 & 4) != 0 ? null : authPinpad);
    }
}
