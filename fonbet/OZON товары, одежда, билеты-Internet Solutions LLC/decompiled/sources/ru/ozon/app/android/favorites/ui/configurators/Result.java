package ru.ozon.app.android.favorites.ui.configurators;

import G.g;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/Result;", "Landroid/os/Parcelable;", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "wasProductAdded", "description", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getTitle", "Z", "getWasProductAdded", "()Z", "getDescription", "I", "getQuantity", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Result implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Result> CREATOR = new Creator();

    @NotNull
    private final String deeplink;

    @NotNull
    private final String description;
    private final int quantity;

    @NotNull
    private final String title;
    private final boolean wasProductAdded;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Result> {
        @Override // android.os.Parcelable.Creator
        public final Result createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Result(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Result[] newArray(int i11) {
            return new Result[i11];
        }
    }

    public Result(@NotNull String deeplink, @NotNull String title, boolean z11, @NotNull String description, int i11) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.deeplink = deeplink;
        this.title = title;
        this.wasProductAdded = z11;
        this.description = description;
        this.quantity = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return Intrinsics.d(this.deeplink, result.deeplink) && Intrinsics.d(this.title, result.title) && this.wasProductAdded == result.wasProductAdded && Intrinsics.d(this.description, result.description) && this.quantity == result.quantity;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getWasProductAdded() {
        return this.wasProductAdded;
    }

    public int hashCode() {
        return Integer.hashCode(this.quantity) + g.a(C3532b.a(g.a(this.deeplink.hashCode() * 31, 31, this.title), 31, this.wasProductAdded), 31, this.description);
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        String str2 = this.title;
        boolean z11 = this.wasProductAdded;
        String str3 = this.description;
        int i11 = this.quantity;
        StringBuilder d11 = C3660k.d("Result(deeplink=", str, ", title=", str2, ", wasProductAdded=");
        C5766e.a(", description=", str3, ", quantity=", d11, z11);
        return b.e(i11, ")", d11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.deeplink);
        dest.writeString(this.title);
        dest.writeInt(this.wasProductAdded ? 1 : 0);
        dest.writeString(this.description);
        dest.writeInt(this.quantity);
    }
}
