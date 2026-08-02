package com.vk.odnoklassniki.registration.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AdditionalInfo.kt */
/* loaded from: classes4.dex */
public final class AdditionalInfo implements Parcelable {
    public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

    @pmi0("error_codes")
    private final List<String> errorCodes;

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<String> errors;

    /* compiled from: AdditionalInfo.kt */
    public static final class a implements Parcelable.Creator<AdditionalInfo> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalInfo createFromParcel(Parcel parcel) {
            return new AdditionalInfo(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalInfo[] newArray(int i) {
            return new AdditionalInfo[i];
        }
    }

    public AdditionalInfo(List<String> list, List<String> list2) {
        this.errors = list;
        this.errorCodes = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfo)) {
            return false;
        }
        AdditionalInfo additionalInfo = (AdditionalInfo) obj;
        return epx.f(this.errors, additionalInfo.errors) && epx.f(this.errorCodes, additionalInfo.errorCodes);
    }

    public final int hashCode() {
        return this.errorCodes.hashCode() + (this.errors.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalInfo(errors=");
        sb.append(this.errors);
        sb.append(", errorCodes=");
        return ms9.a(')', sb, this.errorCodes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.errors);
        parcel.writeStringList(this.errorCodes);
    }
}
