package com.vk.dto.clips.media;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.vu5;
import xsna.w9y;
import xsna.zcl;

/* compiled from: AudioConfigEditor.kt */
/* loaded from: classes18.dex */
public final class AudioConfigEditor implements Parcelable, bxx {
    public static final Parcelable.Creator<AudioConfigEditor> CREATOR = new a();
    public static final b d = new b();
    public final int b;
    public final int c;

    /* compiled from: AudioConfigEditor.kt */
    public static final class a implements Parcelable.Creator<AudioConfigEditor> {
        @Override // android.os.Parcelable.Creator
        public final AudioConfigEditor createFromParcel(Parcel parcel) {
            return new AudioConfigEditor(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioConfigEditor[] newArray(int i) {
            return new AudioConfigEditor[i];
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<AudioConfigEditor> {
        @Override // xsna.aay
        public final AudioConfigEditor a(JSONObject jSONObject) {
            return new AudioConfigEditor(jSONObject);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioConfigEditor() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "sample_rate");
        w9yVar.c(Integer.valueOf(this.c), "channels_count");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioConfigEditor)) {
            return false;
        }
        AudioConfigEditor audioConfigEditor = (AudioConfigEditor) obj;
        return this.b == audioConfigEditor.b && this.c == audioConfigEditor.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioConfigEditor(sampleRate=");
        sb.append(this.b);
        sb.append(", channelCount=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public AudioConfigEditor(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ AudioConfigEditor(int i, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 44100 : i, (i3 & 2) != 0 ? 2 : i2);
    }

    public AudioConfigEditor(JSONObject jSONObject) {
        this(jSONObject.getInt("sample_rate"), jSONObject.getInt("channels_count"));
    }
}
