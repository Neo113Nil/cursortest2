package com.vk.emailforwarding.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: VkEmailForwardingConfig.kt */
/* loaded from: classes.dex */
public final class VkEmailForwardingConfig implements Parcelable {
    public static final Parcelable.Creator<VkEmailForwardingConfig> CREATOR = new a();
    public final boolean b;

    /* compiled from: VkEmailForwardingConfig.kt */
    /* loaded from: classes18.dex */
    public static final class a implements Parcelable.Creator<VkEmailForwardingConfig> {
        @Override // android.os.Parcelable.Creator
        public final VkEmailForwardingConfig createFromParcel(Parcel parcel) {
            return new VkEmailForwardingConfig(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VkEmailForwardingConfig[] newArray(int i) {
            return new VkEmailForwardingConfig[i];
        }
    }

    public VkEmailForwardingConfig(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkEmailForwardingConfig) && this.b == ((VkEmailForwardingConfig) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("VkEmailForwardingConfig(isSoftVkId="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
    }
}
