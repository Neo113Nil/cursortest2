package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum H implements EnumWithValue, Parcelable {
    SWIPE("Swipe"),
    SWIPE_DOWN("Swipe Down"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SWIPE_TO_DISMISS("User Swipe To Dismiss"),
    SKIP("Skip"),
    USER_SKIP_NEXT("User Skip Next"),
    USER_SKIP_PREVIOUS("User Skip Previous"),
    VIDEO_FINISHED("Video Finished"),
    CLOSE_BUTTON("Close Button"),
    APP_CLOSE("App Close"),
    BACK_BUTTON("Back Button"),
    STORIES_COMPLETED("Stories completed"),
    ASSETS_EXPIRY("URL Expiration"),
    APP_BACKGROUND("App Background"),
    INLINE("Inline"),
    VIEWING_MODE_TRANSITION("Viewing Mode Transition"),
    PIP_DISMISSED("PIP Dismissed");


    @NotNull
    public static final Parcelable.Creator<H> CREATOR = new Parcelable.Creator() { // from class: gu8
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return H.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new H[i];
        }
    };
    public final String a;

    H(String str) {
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
