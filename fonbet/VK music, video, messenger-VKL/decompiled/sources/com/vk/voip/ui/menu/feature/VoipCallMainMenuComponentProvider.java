package com.vk.voip.ui.menu.feature;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.u59;

/* compiled from: VoipCallMainMenuFeatureProvider.kt */
/* loaded from: classes7.dex */
public final class VoipCallMainMenuComponentProvider implements Parcelable {
    public static final Parcelable.Creator<VoipCallMainMenuComponentProvider> CREATOR = new a();
    public final u59 b;

    /* compiled from: VoipCallMainMenuFeatureProvider.kt */
    public static final class a implements Parcelable.Creator<VoipCallMainMenuComponentProvider> {
        @Override // android.os.Parcelable.Creator
        public final VoipCallMainMenuComponentProvider createFromParcel(Parcel parcel) {
            return new VoipCallMainMenuComponentProvider(null);
        }

        @Override // android.os.Parcelable.Creator
        public final VoipCallMainMenuComponentProvider[] newArray(int i) {
            return new VoipCallMainMenuComponentProvider[i];
        }
    }

    public VoipCallMainMenuComponentProvider(u59 u59Var) {
        this.b = u59Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
