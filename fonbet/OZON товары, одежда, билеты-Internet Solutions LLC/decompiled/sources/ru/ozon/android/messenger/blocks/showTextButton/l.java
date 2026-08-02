package ru.ozon.android.messenger.blocks.showTextButton;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
public final class l implements ru.ozon.android.messenger.framework.presentation.models.g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86405a;

    /* renamed from: b, reason: collision with root package name */
    private final ButtonV3DTO f86406b;

    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new l(ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel), (ButtonV3DTO) parcel.readParcelable(l.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f86405a = blockId;
        this.f86406b = buttonV3DTO;
    }

    public final ButtonV3DTO a() {
        return this.f86406b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f86405a, lVar.f86405a) && Intrinsics.d(this.f86406b, lVar.f86406b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86405a;
    }

    public final int hashCode() {
        int hashCode = this.f86405a.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.f86406b;
        return hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ShowTextButtonVO(blockId=" + this.f86405a + ", button=" + this.f86406b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86405a.writeToParcel(dest, i11);
        dest.writeParcelable(this.f86406b, i11);
    }
}
