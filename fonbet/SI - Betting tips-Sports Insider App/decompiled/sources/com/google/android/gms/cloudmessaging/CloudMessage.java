package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import b6.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f4437a;

    public CloudMessage(Intent intent) {
        this.f4437a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4437a, i5, false);
        b.W(parcel, V);
    }
}
