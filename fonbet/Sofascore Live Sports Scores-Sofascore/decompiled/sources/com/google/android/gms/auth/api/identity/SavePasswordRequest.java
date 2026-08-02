package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbs();
    public final SignInPassword a;
    public final String b;
    public final int c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static final class Builder {
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        Preconditions.i(signInPassword);
        this.a = signInPassword;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.a(this.a, savePasswordRequest.a) && Objects.a(this.b, savePasswordRequest.b) && this.c == savePasswordRequest.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
