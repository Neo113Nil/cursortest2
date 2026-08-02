package com.google.android.gms.cloudmessaging;

import D9.C1135c;
import E9.b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C1135c();

    /* renamed from: a, reason: collision with root package name */
    public final Intent f32209a;

    public CloudMessage(Intent intent) {
        this.f32209a = intent;
    }

    public Intent g() {
        return this.f32209a;
    }

    public String h() {
        String stringExtra = this.f32209a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f32209a.getStringExtra("message_id") : stringExtra;
    }

    public final Integer i() {
        if (this.f32209a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f32209a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, this.f32209a, i10, false);
        b.b(parcel, a10);
    }
}
