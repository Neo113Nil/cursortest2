package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.delegates.models.b;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum b implements EnumWithValue, Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_MINIMIZED_MAXIMIZE("player_minimized_maximize"),
    PLAYER_FIRST_FRAME_RENDERED("player_first_frame_rendered"),
    SHARE_RESULT("share_result");


    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator() { // from class: zql
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return b.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b[i];
        }
    };
    public final String a;

    b(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    public final String getValue() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
