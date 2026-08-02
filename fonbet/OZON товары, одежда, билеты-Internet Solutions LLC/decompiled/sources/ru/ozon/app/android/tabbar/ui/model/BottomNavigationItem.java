package ru.ozon.app.android.tabbar.ui.model;

import B0.C2454a;
import Cm.e;
import G.g;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jf\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "Landroid/os/Parcelable;", "", "id", "", "icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "animation", "deeplink", "longClickDeeplink", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "behavior", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getIcon", "getTitle", "Ljava/lang/Integer;", "getAnimation", "()Ljava/lang/Integer;", "getDeeplink", "getLongClickDeeplink", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "getBehavior", "()Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BottomNavigationItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BottomNavigationItem> CREATOR = new Creator();
    private final Integer animation;

    @NotNull
    private final BottomNavigationBehavior behavior;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String icon;
    private final int id;
    private final IndicatorDTO indicator;
    private final String longClickDeeplink;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BottomNavigationItem> {
        @Override // android.os.Parcelable.Creator
        public final BottomNavigationItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BottomNavigationItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), BottomNavigationBehavior.valueOf(parcel.readString()), (IndicatorDTO) parcel.readParcelable(BottomNavigationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BottomNavigationItem[] newArray(int i11) {
            return new BottomNavigationItem[i11];
        }
    }

    public BottomNavigationItem(int i11, @NotNull String icon, @NotNull String title, Integer num, @NotNull String deeplink, String str, @NotNull BottomNavigationBehavior behavior, IndicatorDTO indicatorDTO) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.id = i11;
        this.icon = icon;
        this.title = title;
        this.animation = num;
        this.deeplink = deeplink;
        this.longClickDeeplink = str;
        this.behavior = behavior;
        this.indicator = indicatorDTO;
    }

    public static /* synthetic */ BottomNavigationItem copy$default(BottomNavigationItem bottomNavigationItem, int i11, String str, String str2, Integer num, String str3, String str4, BottomNavigationBehavior bottomNavigationBehavior, IndicatorDTO indicatorDTO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bottomNavigationItem.id;
        }
        if ((i12 & 2) != 0) {
            str = bottomNavigationItem.icon;
        }
        if ((i12 & 4) != 0) {
            str2 = bottomNavigationItem.title;
        }
        if ((i12 & 8) != 0) {
            num = bottomNavigationItem.animation;
        }
        if ((i12 & 16) != 0) {
            str3 = bottomNavigationItem.deeplink;
        }
        if ((i12 & 32) != 0) {
            str4 = bottomNavigationItem.longClickDeeplink;
        }
        if ((i12 & 64) != 0) {
            bottomNavigationBehavior = bottomNavigationItem.behavior;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            indicatorDTO = bottomNavigationItem.indicator;
        }
        BottomNavigationBehavior bottomNavigationBehavior2 = bottomNavigationBehavior;
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        String str5 = str3;
        String str6 = str4;
        return bottomNavigationItem.copy(i11, str, str2, num, str5, str6, bottomNavigationBehavior2, indicatorDTO2);
    }

    @NotNull
    public final BottomNavigationItem copy(int id2, @NotNull String icon, @NotNull String title, Integer animation, @NotNull String deeplink, String longClickDeeplink, @NotNull BottomNavigationBehavior behavior, IndicatorDTO indicator) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return new BottomNavigationItem(id2, icon, title, animation, deeplink, longClickDeeplink, behavior, indicator);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavigationItem)) {
            return false;
        }
        BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) other;
        return this.id == bottomNavigationItem.id && Intrinsics.d(this.icon, bottomNavigationItem.icon) && Intrinsics.d(this.title, bottomNavigationItem.title) && Intrinsics.d(this.animation, bottomNavigationItem.animation) && Intrinsics.d(this.deeplink, bottomNavigationItem.deeplink) && Intrinsics.d(this.longClickDeeplink, bottomNavigationItem.longClickDeeplink) && this.behavior == bottomNavigationItem.behavior && Intrinsics.d(this.indicator, bottomNavigationItem.indicator);
    }

    public final Integer getAnimation() {
        return this.animation;
    }

    @NotNull
    public final BottomNavigationBehavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    public final String getLongClickDeeplink() {
        return this.longClickDeeplink;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(g.a(Integer.hashCode(this.id) * 31, 31, this.icon), 31, this.title);
        Integer num = this.animation;
        int a12 = g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.deeplink);
        String str = this.longClickDeeplink;
        int hashCode = (this.behavior.hashCode() + ((a12 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        return hashCode + (indicatorDTO != null ? indicatorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        String str = this.icon;
        String str2 = this.title;
        Integer num = this.animation;
        String str3 = this.deeplink;
        String str4 = this.longClickDeeplink;
        BottomNavigationBehavior bottomNavigationBehavior = this.behavior;
        IndicatorDTO indicatorDTO = this.indicator;
        StringBuilder g10 = e.g(i11, "BottomNavigationItem(id=", ", icon=", str, ", title=");
        C2454a.f(num, str2, ", animation=", ", deeplink=", g10);
        a.h(g10, str3, ", longClickDeeplink=", str4, ", behavior=");
        g10.append(bottomNavigationBehavior);
        g10.append(", indicator=");
        g10.append(indicatorDTO);
        g10.append(")");
        return g10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.icon);
        dest.writeString(this.title);
        Integer num = this.animation;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        dest.writeString(this.deeplink);
        dest.writeString(this.longClickDeeplink);
        dest.writeString(this.behavior.name());
        dest.writeParcelable(this.indicator, flags);
    }

    public /* synthetic */ BottomNavigationItem(int i11, String str, String str2, Integer num, String str3, String str4, BottomNavigationBehavior bottomNavigationBehavior, IndicatorDTO indicatorDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, (i12 & 8) != 0 ? null : num, str3, (i12 & 32) != 0 ? null : str4, bottomNavigationBehavior, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : indicatorDTO);
    }
}
