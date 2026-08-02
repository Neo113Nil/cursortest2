package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import G.g;
import I0.C3173b;
import Ns.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;", "pickupBadge", "", "icon", "iconTintColor", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;", "getPickupBadge", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;", "Ljava/lang/String;", "getIcon", "getIconTintColor", "getBackgroundColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PickupButtonVo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PickupButtonVo> CREATOR = new Creator();

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String icon;

    @NotNull
    private final String iconTintColor;
    private final PickupBadgeVO pickupBadge;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickupButtonVo> {
        @Override // android.os.Parcelable.Creator
        public final PickupButtonVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PickupButtonVo((TextDTO) parcel.readParcelable(PickupButtonVo.class.getClassLoader()), (TextDTO) parcel.readParcelable(PickupButtonVo.class.getClassLoader()), parcel.readInt() == 0 ? null : PickupBadgeVO.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PickupButtonVo[] newArray(int i11) {
            return new PickupButtonVo[i11];
        }
    }

    public PickupButtonVo(@NotNull TextDTO title, @NotNull TextDTO subtitle, PickupBadgeVO pickupBadgeVO, @NotNull String icon, @NotNull String iconTintColor, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.subtitle = subtitle;
        this.pickupBadge = pickupBadgeVO;
        this.icon = icon;
        this.iconTintColor = iconTintColor;
        this.backgroundColor = backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupButtonVo)) {
            return false;
        }
        PickupButtonVo pickupButtonVo = (PickupButtonVo) other;
        return Intrinsics.d(this.title, pickupButtonVo.title) && Intrinsics.d(this.subtitle, pickupButtonVo.subtitle) && Intrinsics.d(this.pickupBadge, pickupButtonVo.pickupBadge) && Intrinsics.d(this.icon, pickupButtonVo.icon) && Intrinsics.d(this.iconTintColor, pickupButtonVo.iconTintColor) && Intrinsics.d(this.backgroundColor, pickupButtonVo.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    public final PickupBadgeVO getPickupBadge() {
        return this.pickupBadge;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
        PickupBadgeVO pickupBadgeVO = this.pickupBadge;
        return this.backgroundColor.hashCode() + g.a(g.a((a11 + (pickupBadgeVO == null ? 0 : pickupBadgeVO.hashCode())) * 31, 31, this.icon), 31, this.iconTintColor);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        PickupBadgeVO pickupBadgeVO = this.pickupBadge;
        String str = this.icon;
        String str2 = this.iconTintColor;
        String str3 = this.backgroundColor;
        StringBuilder g10 = D3.g.g("PickupButtonVo(title=", textDTO, ", subtitle=", textDTO2, ", pickupBadge=");
        g10.append(pickupBadgeVO);
        g10.append(", icon=");
        g10.append(str);
        g10.append(", iconTintColor=");
        return C3173b.c(g10, str2, ", backgroundColor=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitle, flags);
        PickupBadgeVO pickupBadgeVO = this.pickupBadge;
        if (pickupBadgeVO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupBadgeVO.writeToParcel(dest, flags);
        }
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        dest.writeString(this.backgroundColor);
    }
}
