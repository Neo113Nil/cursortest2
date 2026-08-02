package ru.ozon.uni.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/core/models/UniColorToken;", "Lru/ozon/uni/core/models/UniToken;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniColorToken implements UniToken {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UniColorToken> CREATOR = new Creator();

    @NotNull
    private final String id;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniColorToken> {
        @Override // android.os.Parcelable.Creator
        public final UniColorToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UniColorToken(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UniColorToken[] newArray(int i11) {
            return new UniColorToken[i11];
        }
    }

    public UniColorToken(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UniColorToken.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.core.models.UniColorToken");
        return Intrinsics.d(getId(), ((UniColorToken) other).getId());
    }

    @Override // ru.ozon.uni.core.models.UniToken
    @NotNull
    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
    }
}
