package com.vk.clips.upload.vk.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipUploadScreenRuntimeConfig.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenRuntimeConfig implements Parcelable {
    public static final Parcelable.Creator<ClipUploadScreenRuntimeConfig> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* compiled from: ClipUploadScreenRuntimeConfig.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenRuntimeConfig> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenRuntimeConfig createFromParcel(Parcel parcel) {
            return new ClipUploadScreenRuntimeConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenRuntimeConfig[] newArray(int i) {
            return new ClipUploadScreenRuntimeConfig[i];
        }
    }

    public ClipUploadScreenRuntimeConfig() {
        this(false, false, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploadScreenRuntimeConfig)) {
            return false;
        }
        ClipUploadScreenRuntimeConfig clipUploadScreenRuntimeConfig = (ClipUploadScreenRuntimeConfig) obj;
        return this.b == clipUploadScreenRuntimeConfig.b && this.c == clipUploadScreenRuntimeConfig.c && this.d == clipUploadScreenRuntimeConfig.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadScreenRuntimeConfig(showOpenEditorBtn=");
        sb.append(this.b);
        sb.append(", shouldDeleteDraftOnExit=");
        sb.append(this.c);
        sb.append(", showPostingRedirectBanner=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public ClipUploadScreenRuntimeConfig(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public /* synthetic */ ClipUploadScreenRuntimeConfig(boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
