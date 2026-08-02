package com.vk.camera.ui;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.zcl;

/* compiled from: SuperappQrCameraUiConfig.kt */
/* loaded from: classes16.dex */
public final class SuperappQrCameraUiConfig implements Serializer.StreamParcelable {
    public static final Serializer.c<SuperappQrCameraUiConfig> CREATOR = new a();
    public final boolean b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SuperappQrCameraUiConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SuperappQrCameraUiConfig a(Serializer serializer) {
            return new SuperappQrCameraUiConfig(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuperappQrCameraUiConfig[i];
        }
    }

    public SuperappQrCameraUiConfig() {
        this(false, 1, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperappQrCameraUiConfig) && this.b == ((SuperappQrCameraUiConfig) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("SuperappQrCameraUiConfig(withCaption="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public SuperappQrCameraUiConfig(boolean z) {
        this.b = z;
    }

    public /* synthetic */ SuperappQrCameraUiConfig(boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z);
    }

    public SuperappQrCameraUiConfig(Serializer serializer, zcl zclVar) {
        this(serializer.m());
    }
}
