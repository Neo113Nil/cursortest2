package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzb();
    public final boolean a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public boolean a = false;

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder) {
        this.a = builder.a;
    }

    public boolean getManualImpressionsEnabled() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        boolean manualImpressionsEnabled = getManualImpressionsEnabled();
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(manualImpressionsEnabled ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public AdManagerAdViewOptions(boolean z) {
        this.a = z;
    }
}
