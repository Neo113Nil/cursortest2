package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
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
public class SavePasswordResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new zbt();
    public final PendingIntent a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        Preconditions.i(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return Objects.a(this.a, ((SavePasswordResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
