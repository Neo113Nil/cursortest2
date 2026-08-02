package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: StickersMarkPopupAnimationInterruptedResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersMarkPopupAnimationInterruptedResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersMarkPopupAnimationInterruptedResponseDto> CREATOR = new a();

    @pmi0("marked")
    private final boolean marked;

    @pmi0("show_blocker")
    private final boolean showBlocker;

    /* compiled from: StickersMarkPopupAnimationInterruptedResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersMarkPopupAnimationInterruptedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersMarkPopupAnimationInterruptedResponseDto createFromParcel(Parcel parcel) {
            return new StickersMarkPopupAnimationInterruptedResponseDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersMarkPopupAnimationInterruptedResponseDto[] newArray(int i) {
            return new StickersMarkPopupAnimationInterruptedResponseDto[i];
        }
    }

    public StickersMarkPopupAnimationInterruptedResponseDto(boolean z, boolean z2) {
        this.showBlocker = z;
        this.marked = z2;
    }

    public final boolean d() {
        return this.showBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.marked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersMarkPopupAnimationInterruptedResponseDto)) {
            return false;
        }
        StickersMarkPopupAnimationInterruptedResponseDto stickersMarkPopupAnimationInterruptedResponseDto = (StickersMarkPopupAnimationInterruptedResponseDto) obj;
        return this.showBlocker == stickersMarkPopupAnimationInterruptedResponseDto.showBlocker && this.marked == stickersMarkPopupAnimationInterruptedResponseDto.marked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.marked) + (Boolean.hashCode(this.showBlocker) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersMarkPopupAnimationInterruptedResponseDto(showBlocker=");
        sb.append(this.showBlocker);
        sb.append(", marked=");
        return q0.a(sb, this.marked, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showBlocker ? 1 : 0);
        parcel.writeInt(this.marked ? 1 : 0);
    }
}
