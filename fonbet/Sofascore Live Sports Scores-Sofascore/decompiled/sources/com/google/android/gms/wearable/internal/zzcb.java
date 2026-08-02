package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import defpackage.bf3;
import defpackage.mz1;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcb extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzcc();
    public final String a;
    public final String b;
    public final String c;

    public zzcb(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        str3.getClass();
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return false;
        }
        zzcb zzcbVar = (zzcb) obj;
        return this.a.equals(zzcbVar.a) && Objects.a(zzcbVar.b, this.b) && Objects.a(zzcbVar.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(substring.length() + 3 + substring2.length() + 2 + String.valueOf(i).length());
            bf3.v(sb, substring, "...", substring2, "::");
            sb.append(i);
            trim = sb.toString();
        }
        int length2 = trim.length();
        String str2 = this.b;
        int length3 = String.valueOf(str2).length() + length2 + 23;
        String str3 = this.c;
        StringBuilder sb2 = new StringBuilder(mz1.d(length3 + 7, 1, String.valueOf(str3)));
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str2);
        return wt3.m(", path=", str3, sb2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
