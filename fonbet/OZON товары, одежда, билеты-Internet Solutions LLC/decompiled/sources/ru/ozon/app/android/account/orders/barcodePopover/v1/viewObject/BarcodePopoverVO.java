package ru.ozon.app.android.account.orders.barcodePopover.v1.viewObject;

import G.g;
import Ns.b;
import TY.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;", "Ll20/c;", "Landroid/os/Parcelable;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "code", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getCode", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodePopoverVO implements c, Parcelable {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    public static final Parcelable.Creator<BarcodePopoverVO> CREATOR = new Creator();

    @NotNull
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final String code;
    private final long id;

    @NotNull
    private final TextDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BarcodePopoverVO> {
        @Override // android.os.Parcelable.Creator
        public final BarcodePopoverVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BarcodePopoverVO(parcel.readLong(), (TextDTO) parcel.readParcelable(BarcodePopoverVO.class.getClassLoader()), parcel.readString(), (IconButtonV3DTO) parcel.readParcelable(BarcodePopoverVO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BarcodePopoverVO[] newArray(int i11) {
            return new BarcodePopoverVO[i11];
        }
    }

    public BarcodePopoverVO(long j11, @NotNull TextDTO title, @NotNull String code, @NotNull IconButtonV3DTO closeButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.id = j11;
        this.title = title;
        this.code = code;
        this.closeButton = closeButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodePopoverVO)) {
            return false;
        }
        BarcodePopoverVO barcodePopoverVO = (BarcodePopoverVO) other;
        return this.id == barcodePopoverVO.id && Intrinsics.d(this.title, barcodePopoverVO.title) && Intrinsics.d(this.code, barcodePopoverVO.code) && Intrinsics.d(this.closeButton, barcodePopoverVO.closeButton);
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.closeButton.hashCode() + g.a(b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.code);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        String str = this.code;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        StringBuilder b11 = a.b("BarcodePopoverVO(id=", j11, ", title=", textDTO);
        b11.append(", code=");
        b11.append(str);
        b11.append(", closeButton=");
        b11.append(iconButtonV3DTO);
        b11.append(")");
        return b11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeParcelable(this.title, flags);
        dest.writeString(this.code);
        dest.writeParcelable(this.closeButton, flags);
    }
}
