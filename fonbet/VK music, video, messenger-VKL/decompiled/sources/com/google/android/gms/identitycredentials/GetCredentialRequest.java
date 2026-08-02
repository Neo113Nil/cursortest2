package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import xsna.ozg0;
import xsna.zqt;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class GetCredentialRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new zqt();
    public final List<CredentialOption> b;
    public final Bundle c;
    public final String d;
    public final ResultReceiver e;

    public GetCredentialRequest(@NonNull List<CredentialOption> list, @NonNull Bundle bundle, String str, @NonNull ResultReceiver resultReceiver) {
        this.b = list;
        this.c = bundle;
        this.d = str;
        this.e = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.d(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.x(w, parcel);
    }
}
