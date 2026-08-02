package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AppsGetTrackBridgeCallHandlersResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetTrackBridgeCallHandlersResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetTrackBridgeCallHandlersResponseDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("handlers")
    private final List<String> handlers;

    /* compiled from: AppsGetTrackBridgeCallHandlersResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetTrackBridgeCallHandlersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetTrackBridgeCallHandlersResponseDto createFromParcel(Parcel parcel) {
            return new AppsGetTrackBridgeCallHandlersResponseDto(parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetTrackBridgeCallHandlersResponseDto[] newArray(int i) {
            return new AppsGetTrackBridgeCallHandlersResponseDto[i];
        }
    }

    public AppsGetTrackBridgeCallHandlersResponseDto(boolean z, List<String> list) {
        this.enabled = z;
        this.handlers = list;
    }

    public final boolean d() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.handlers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetTrackBridgeCallHandlersResponseDto)) {
            return false;
        }
        AppsGetTrackBridgeCallHandlersResponseDto appsGetTrackBridgeCallHandlersResponseDto = (AppsGetTrackBridgeCallHandlersResponseDto) obj;
        return this.enabled == appsGetTrackBridgeCallHandlersResponseDto.enabled && epx.f(this.handlers, appsGetTrackBridgeCallHandlersResponseDto.handlers);
    }

    public final int hashCode() {
        return this.handlers.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetTrackBridgeCallHandlersResponseDto(enabled=");
        sb.append(this.enabled);
        sb.append(", handlers=");
        return ms9.a(')', sb, this.handlers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeStringList(this.handlers);
    }
}
