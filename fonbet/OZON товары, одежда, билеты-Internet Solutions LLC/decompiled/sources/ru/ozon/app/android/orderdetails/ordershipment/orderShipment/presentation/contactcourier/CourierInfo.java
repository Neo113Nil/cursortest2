package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier;

import C.o0;
import G.g;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/CourierInfo;", "Landroid/os/Parcelable;", "", "formattedPhone", "link", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormattedPhone", "getLink", "getTitle", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CourierInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CourierInfo> CREATOR = new Creator();

    @NotNull
    private final String formattedPhone;

    @NotNull
    private final String link;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CourierInfo> {
        @Override // android.os.Parcelable.Creator
        public final CourierInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CourierInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CourierInfo[] newArray(int i11) {
            return new CourierInfo[i11];
        }
    }

    public CourierInfo(@NotNull String formattedPhone, @NotNull String link, @NotNull String title) {
        Intrinsics.checkNotNullParameter(formattedPhone, "formattedPhone");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(title, "title");
        this.formattedPhone = formattedPhone;
        this.link = link;
        this.title = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierInfo)) {
            return false;
        }
        CourierInfo courierInfo = (CourierInfo) other;
        return Intrinsics.d(this.formattedPhone, courierInfo.formattedPhone) && Intrinsics.d(this.link, courierInfo.link) && Intrinsics.d(this.title, courierInfo.title);
    }

    @NotNull
    public final String getFormattedPhone() {
        return this.formattedPhone;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + g.a(this.formattedPhone.hashCode() * 31, 31, this.link);
    }

    @NotNull
    public String toString() {
        String str = this.formattedPhone;
        String str2 = this.link;
        return o0.c(C3660k.d("CourierInfo(formattedPhone=", str, ", link=", str2, ", title="), this.title, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.formattedPhone);
        dest.writeString(this.link);
        dest.writeString(this.title);
    }
}
