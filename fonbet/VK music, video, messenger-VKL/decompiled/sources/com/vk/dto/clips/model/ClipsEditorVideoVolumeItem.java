package com.vk.dto.clips.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClipsEditorVideoVolumeItem.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorVideoVolumeItem implements Parcelable, bxx {
    public static final Parcelable.Creator<ClipsEditorVideoVolumeItem> CREATOR = new a();
    public static final b d = new b();
    public final float b;
    public final boolean c;

    /* compiled from: ClipsEditorVideoVolumeItem.kt */
    public static final class a implements Parcelable.Creator<ClipsEditorVideoVolumeItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEditorVideoVolumeItem createFromParcel(Parcel parcel) {
            return new ClipsEditorVideoVolumeItem(parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEditorVideoVolumeItem[] newArray(int i) {
            return new ClipsEditorVideoVolumeItem[i];
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<ClipsEditorVideoVolumeItem> {
        @Override // xsna.aay
        public final ClipsEditorVideoVolumeItem a(JSONObject jSONObject) {
            return new ClipsEditorVideoVolumeItem(jSONObject);
        }
    }

    public ClipsEditorVideoVolumeItem(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(Float.valueOf(this.b), "volume");
        w9yVar.b(Boolean.valueOf(this.c), "volume_mute");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorVideoVolumeItem)) {
            return false;
        }
        ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem = (ClipsEditorVideoVolumeItem) obj;
        return Float.compare(this.b, clipsEditorVideoVolumeItem.b) == 0 && this.c == clipsEditorVideoVolumeItem.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorVideoVolumeItem(volume=");
        sb.append(this.b);
        sb.append(", muted=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public /* synthetic */ ClipsEditorVideoVolumeItem(float f, boolean z, int i, zcl zclVar) {
        this(f, (i & 2) != 0 ? false : z);
    }

    public ClipsEditorVideoVolumeItem(JSONObject jSONObject) {
        this((float) jSONObject.getDouble("volume"), jSONObject.getBoolean("volume_mute"));
    }
}
