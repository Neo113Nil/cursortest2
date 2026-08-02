package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: VkidokGetInitialDataFeatureToggleDto.kt */
/* loaded from: classes15.dex */
public final class VkidokGetInitialDataFeatureToggleDto implements Parcelable {
    public static final Parcelable.Creator<VkidokGetInitialDataFeatureToggleDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    /* compiled from: VkidokGetInitialDataFeatureToggleDto.kt */
    public static final class a implements Parcelable.Creator<VkidokGetInitialDataFeatureToggleDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokGetInitialDataFeatureToggleDto createFromParcel(Parcel parcel) {
            return new VkidokGetInitialDataFeatureToggleDto(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokGetInitialDataFeatureToggleDto[] newArray(int i) {
            return new VkidokGetInitialDataFeatureToggleDto[i];
        }
    }

    public VkidokGetInitialDataFeatureToggleDto(String str, boolean z, String str2) {
        this.key = str;
        this.enabled = z;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokGetInitialDataFeatureToggleDto)) {
            return false;
        }
        VkidokGetInitialDataFeatureToggleDto vkidokGetInitialDataFeatureToggleDto = (VkidokGetInitialDataFeatureToggleDto) obj;
        return epx.f(this.key, vkidokGetInitialDataFeatureToggleDto.key) && this.enabled == vkidokGetInitialDataFeatureToggleDto.enabled && epx.f(this.value, vkidokGetInitialDataFeatureToggleDto.value);
    }

    public final int hashCode() {
        int b = qoy.b(this.key.hashCode() * 31, 31, this.enabled);
        String str = this.value;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokGetInitialDataFeatureToggleDto(key=");
        sb.append(this.key);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.value);
    }

    public /* synthetic */ VkidokGetInitialDataFeatureToggleDto(String str, boolean z, String str2, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}
