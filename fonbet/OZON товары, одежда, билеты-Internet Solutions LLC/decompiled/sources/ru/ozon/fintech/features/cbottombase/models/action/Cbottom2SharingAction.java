package ru.ozon.fintech.features.cbottombase.models.action;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2SharingAction;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action$Type;", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action$Type;)V", "getId", "()Ljava/lang/String;", "getName", "()Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2SharingAction implements Parcelable, Cbottom2Action {

    @NotNull
    public static final Parcelable.Creator<Cbottom2SharingAction> CREATOR = new a();

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final Cbottom2Action.Type name;

    public static final class a implements Parcelable.Creator<Cbottom2SharingAction> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2SharingAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Cbottom2SharingAction(parcel.readString(), Cbottom2Action.Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2SharingAction[] newArray(int i11) {
            return new Cbottom2SharingAction[i11];
        }
    }

    public Cbottom2SharingAction(@NotNull String id2, @NotNull Cbottom2Action.Type name) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id2;
        this.name = name;
    }

    public static /* synthetic */ Cbottom2SharingAction copy$default(Cbottom2SharingAction cbottom2SharingAction, String str, Cbottom2Action.Type type, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottom2SharingAction.id;
        }
        if ((i11 & 2) != 0) {
            type = cbottom2SharingAction.name;
        }
        return cbottom2SharingAction.copy(str, type);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Cbottom2Action.Type getName() {
        return this.name;
    }

    @NotNull
    public final Cbottom2SharingAction copy(@NotNull String id2, @NotNull Cbottom2Action.Type name) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Cbottom2SharingAction(id2, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2SharingAction)) {
            return false;
        }
        Cbottom2SharingAction cbottom2SharingAction = (Cbottom2SharingAction) other;
        return Intrinsics.d(this.id, cbottom2SharingAction.id) && this.name == cbottom2SharingAction.name;
    }

    @Override // ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action
    @NotNull
    public Cbottom2Action.Type getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Cbottom2SharingAction(id=" + this.id + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name.name());
    }
}
