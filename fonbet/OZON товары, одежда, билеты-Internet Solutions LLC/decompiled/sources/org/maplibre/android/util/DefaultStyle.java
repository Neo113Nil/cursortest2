package org.maplibre.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class DefaultStyle implements Parcelable {
    public static final Parcelable.Creator<DefaultStyle> CREATOR = new a();

    @Keep
    private String name;

    @Keep
    private String url;

    @Keep
    private int version;

    final class a implements Parcelable.Creator<DefaultStyle> {
        @Override // android.os.Parcelable.Creator
        public final DefaultStyle createFromParcel(@NonNull Parcel parcel) {
            return new DefaultStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultStyle[] newArray(int i11) {
            return new DefaultStyle[i11];
        }
    }

    @Keep
    public DefaultStyle(String str, String str2, int i11) {
        this.url = str;
        this.name = str2;
        this.version = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeInt(this.version);
    }

    protected DefaultStyle(Parcel parcel) {
        this.url = parcel.readString();
        this.name = parcel.readString();
        this.version = parcel.readInt();
    }
}
