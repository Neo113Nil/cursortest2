package com.vk.dto.clips.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import xsna.epx;
import xsna.zcl;

/* compiled from: ClipsEditorInitParams.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorInitParams implements Parcelable {
    public static final Parcelable.Creator<ClipsEditorInitParams> CREATOR = new a();
    public final ClipsEditorInputData b;
    public final ClipsEditorUploadParams c;
    public final ClipsEditorSessionParams d;

    /* compiled from: ClipsEditorInitParams.kt */
    public static final class a implements Parcelable.Creator<ClipsEditorInitParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEditorInitParams createFromParcel(Parcel parcel) {
            return new ClipsEditorInitParams(ClipsEditorInputData.CREATOR.createFromParcel(parcel), ClipsEditorUploadParams.CREATOR.createFromParcel(parcel), ClipsEditorSessionParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEditorInitParams[] newArray(int i) {
            return new ClipsEditorInitParams[i];
        }
    }

    public ClipsEditorInitParams(ClipsEditorInputData clipsEditorInputData, ClipsEditorUploadParams clipsEditorUploadParams, ClipsEditorSessionParams clipsEditorSessionParams) {
        this.b = clipsEditorInputData;
        this.c = clipsEditorUploadParams;
        this.d = clipsEditorSessionParams;
    }

    public static ClipsEditorInitParams a(ClipsEditorInitParams clipsEditorInitParams, ClipsEditorInputData clipsEditorInputData, ClipsEditorUploadParams clipsEditorUploadParams, int i) {
        if ((i & 1) != 0) {
            clipsEditorInputData = clipsEditorInitParams.b;
        }
        if ((i & 2) != 0) {
            clipsEditorUploadParams = clipsEditorInitParams.c;
        }
        return new ClipsEditorInitParams(clipsEditorInputData, clipsEditorUploadParams, clipsEditorInitParams.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorInitParams)) {
            return false;
        }
        ClipsEditorInitParams clipsEditorInitParams = (ClipsEditorInitParams) obj;
        return epx.f(this.b, clipsEditorInitParams.b) && epx.f(this.c, clipsEditorInitParams.c) && epx.f(this.d, clipsEditorInitParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClipsEditorInitParams(clipData=" + this.b + ", uploadParams=" + this.c + ", sessionParams=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
    }

    public /* synthetic */ ClipsEditorInitParams(ClipsEditorInputData clipsEditorInputData, ClipsEditorUploadParams clipsEditorUploadParams, ClipsEditorSessionParams clipsEditorSessionParams, int i, zcl zclVar) {
        this(clipsEditorInputData, clipsEditorUploadParams, (i & 4) != 0 ? new ClipsEditorSessionParams(null, false, false, false, null, false, 63, null) : clipsEditorSessionParams);
    }
}
