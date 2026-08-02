package ru.ozon.uni.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/core/models/UniIconToken;", "Lru/ozon/uni/core/models/UniToken;", "id", "", "isMulticolor", "", "<init>", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "()Z", "equals", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniIconToken implements UniToken {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UniIconToken> CREATOR = new Creator();

    @NotNull
    private final String id;
    private final boolean isMulticolor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniIconToken> {
        @Override // android.os.Parcelable.Creator
        public final UniIconToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UniIconToken(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UniIconToken[] newArray(int i11) {
            return new UniIconToken[i11];
        }
    }

    public UniIconToken(@NotNull String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.isMulticolor = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UniIconToken.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.core.models.UniIconToken");
        return Intrinsics.d(getId(), ((UniIconToken) other).getId());
    }

    @Override // ru.ozon.uni.core.models.UniToken
    @NotNull
    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    /* renamed from: isMulticolor, reason: from getter */
    public final boolean getIsMulticolor() {
        return this.isMulticolor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.isMulticolor ? 1 : 0);
    }
}
