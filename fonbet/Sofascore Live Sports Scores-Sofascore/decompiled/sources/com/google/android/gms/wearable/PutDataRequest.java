package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.yhk;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class PutDataRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new zzq();
    public static final long e = 1800000;
    public final Uri a;
    public final Bundle b;
    public byte[] c;
    public long d;

    static {
        new SecureRandom();
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.a = uri;
        this.b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        this.c = bArr;
        this.d = j;
    }

    public final Map Y0() {
        HashMap hashMap = new HashMap();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            hashMap.put(str, (Asset) bundle.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final void Z0(String str, Asset asset) {
        str.getClass();
        this.b.putParcelable(str, asset);
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.c;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Bundle bundle = this.b;
        int size = bundle.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        sb.append(", uri=".concat(String.valueOf(this.a)));
        long j = this.d;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 15);
        sb3.append(", syncDeadline=");
        sb3.append(j);
        sb.append(sb3.toString());
        if (!isLoggable) {
            sb.append(U3.j.e);
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : bundle.keySet()) {
            String valueOf = String.valueOf(bundle.getParcelable(str));
            sb.append(fc6.o(new StringBuilder(fn0.c(7, str) + valueOf.length()), "\n    ", str, ": ", valueOf));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            yhk.s("dest must not be null");
            return;
        }
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.b(parcel, 4, this.b);
        SafeParcelWriter.c(parcel, 5, this.c, false);
        long j = this.d;
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(j);
        SafeParcelWriter.t(parcel, s);
    }
}
