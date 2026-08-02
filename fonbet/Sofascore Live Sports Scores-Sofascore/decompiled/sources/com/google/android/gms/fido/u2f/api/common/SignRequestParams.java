package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new zzk();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = arrayList;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                Preconditions.a("registered key has null appId and no request appId is provided", (registeredKey.b == null && uri == null) ? false : true);
                String str2 = registeredKey.b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        Preconditions.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.e;
        if (Objects.a(this.a, signRequestParams.a) && Objects.a(this.b, signRequestParams.b) && Objects.a(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list2 = this.e;
            if (list2.containsAll(list) && list.containsAll(list2) && Objects.a(this.f, signRequestParams.f) && Objects.a(this.g, signRequestParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.i(parcel, 2, this.a);
        SafeParcelWriter.e(parcel, 3, this.b);
        SafeParcelWriter.l(parcel, 4, this.c, i, false);
        SafeParcelWriter.c(parcel, 5, this.d, false);
        SafeParcelWriter.q(parcel, 6, this.e, false);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.t(parcel, s);
    }
}
