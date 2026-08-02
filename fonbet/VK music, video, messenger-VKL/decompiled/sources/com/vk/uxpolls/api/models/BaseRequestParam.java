package com.vk.uxpolls.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: UxPollsModels.kt */
/* loaded from: classes6.dex */
public final class BaseRequestParam implements Parcelable {
    public static final Parcelable.Creator<BaseRequestParam> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    /* compiled from: UxPollsModels.kt */
    public static final class a implements Parcelable.Creator<BaseRequestParam> {
        @Override // android.os.Parcelable.Creator
        public final BaseRequestParam createFromParcel(Parcel parcel) {
            return new BaseRequestParam(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseRequestParam[] newArray(int i) {
            return new BaseRequestParam[i];
        }
    }

    public BaseRequestParam(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String d() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRequestParam)) {
            return false;
        }
        BaseRequestParam baseRequestParam = (BaseRequestParam) obj;
        return epx.f(this.key, baseRequestParam.key) && epx.f(this.value, baseRequestParam.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseRequestParam(key=");
        sb.append(this.key);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
