package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ChannelApi;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    public final zzcb a;
    public final int b;
    public final int c;
    public final int d;

    public zzbq(zzcb zzcbVar, int i, int i2, int i3) {
        this.a = zzcbVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void Y0(ChannelApi.ChannelListener channelListener) {
        zzcb zzcbVar = this.a;
        int i = this.b;
        if (i == 1) {
            channelListener.d(zzcbVar);
            return;
        }
        int i2 = this.d;
        int i3 = this.c;
        if (i == 2) {
            channelListener.a(zzcbVar, i3, i2);
            return;
        }
        if (i == 3) {
            channelListener.e(zzcbVar, i3, i2);
        } else if (i != 4) {
            new StringBuilder(String.valueOf(i).length() + 14);
        } else {
            channelListener.c(zzcbVar, i3, i2);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int length = String.valueOf(num2).length() + String.valueOf(num).length() + valueOf.length() + 40 + 14;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + length + 15 + 1);
        bf3.v(sb, "ChannelEventParcelable[, channel=", valueOf, ", type=", num);
        wt3.t(i3, ", closeReason=", num2, ", appErrorCode=", sb);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.t(parcel, s);
    }
}
