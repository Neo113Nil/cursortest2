package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.v001;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes12.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new v001();

    @NonNull
    public final Intent b;

    public CloudMessage(@NonNull Intent intent) {
        this.b = intent;
    }

    @Nullable
    public final String i() {
        Intent intent = this.b;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Nullable
    public final Integer j() {
        Intent intent = this.b;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.x(w, parcel);
    }
}
