package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum F implements EnumWithValue, Parcelable {
    WIDGET("Widget"),
    WIDGET_AUTO_PLAY("Auto Play from Widget"),
    DEEPLINK("Deeplink"),
    ENTRYPOINT("Entry Point"),
    NOTIFICATION("Notification"),
    INLINE("Inline");


    @NotNull
    public static final Parcelable.Creator<F> CREATOR = new Parcelable.Creator() { // from class: of5
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return F.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new F[i];
        }
    };
    public final String a;

    F(String str) {
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
