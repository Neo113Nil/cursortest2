package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum d implements EnumWithValue, Parcelable {
    CTA("Cta"),
    BODY_TEXT_LINK("BodyTextLink"),
    PLAYER_DISMISSED("PlayerDismissed"),
    PLAYER_APPEARED("PlayerAppeared"),
    DATA_LOAD_STARTED("DataLoadStarted"),
    DATA_LOAD_COMPLETED("DataLoadCompleted"),
    ON_PLAYER_EVENT_TRIGGERED("OnPlayerEventTriggered"),
    CUSTOM_ACTION_BUTTON_CLICKED("CustomActionButtonClicked"),
    SEARCH_BUTTON_CLICKED("SearchButtonClicked"),
    PLAYER_ENTERED_FULLSCREEN("PlayerEnteredFullscreen"),
    PLAYER_EXITED_FULLSCREEN("PlayerExitedFullscreen"),
    SHARE("Share");


    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator() { // from class: fzl
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return d.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new d[i];
        }
    };
    public final String a;

    d(String str) {
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
