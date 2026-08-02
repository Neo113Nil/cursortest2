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
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new zzh();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        Preconditions.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.d = arrayList;
        this.e = arrayList2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            Preconditions.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.d == null) ? false : true);
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            Preconditions.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.b == null) ? false : true);
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        Preconditions.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.g = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.e;
        return Objects.a(this.a, registerRequestParams.a) && Objects.a(this.b, registerRequestParams.b) && Objects.a(this.c, registerRequestParams.c) && Objects.a(this.d, registerRequestParams.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.a(this.f, registerRequestParams.f) && Objects.a(this.g, registerRequestParams.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.i(parcel, 2, this.a);
        SafeParcelWriter.e(parcel, 3, this.b);
        SafeParcelWriter.l(parcel, 4, this.c, i, false);
        SafeParcelWriter.q(parcel, 5, this.d, false);
        SafeParcelWriter.q(parcel, 6, this.e, false);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.t(parcel, s);
    }
}
