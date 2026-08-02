package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;
import com.ironsource.U3;
import defpackage.fn0;
import defpackage.mz1;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzhk extends AbstractSafeParcelable implements MessageEvent {
    public static final Parcelable.Creator<zzhk> CREATOR = new zzhl();
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public zzhk(String str, String str2, int i, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final byte[] getData() {
        return this.c;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final String n() {
        return this.b;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String obj = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        StringBuilder sb = new StringBuilder(obj.length() + mz1.d(length + 24, 7, String.valueOf(str)) + 1);
        fn0.s(i, "MessageEventParcelable[", BlazeDataSourcePersonalizedType.STRING_SEPARATOR, str, sb);
        return wt3.m(", size=", obj, sb, U3.j.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.c(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }
}
