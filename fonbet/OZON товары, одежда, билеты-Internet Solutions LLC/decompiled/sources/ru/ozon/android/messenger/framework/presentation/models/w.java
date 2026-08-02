package ru.ozon.android.messenger.framework.presentation.models;

import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w extends p {

    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f91555e;

    /* renamed from: f, reason: collision with root package name */
    private final String f91556f;

    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new w(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i11) {
            return new w[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull String id2, String str) {
        super(id2, 6);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f91555e = id2;
        this.f91556f = str;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f91555e, wVar.f91555e) && Intrinsics.d(this.f91556f, wVar.f91556f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    @NotNull
    public final String getId() {
        return this.f91555e;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    public final int hashCode() {
        int hashCode = this.f91555e.hashCode() * 31;
        String str = this.f91556f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PinnedItemInfo(id=");
        sb2.append(this.f91555e);
        sb2.append(", messageId=");
        return o0.c(sb2, this.f91556f, ")");
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91555e);
        dest.writeString(this.f91556f);
    }
}
