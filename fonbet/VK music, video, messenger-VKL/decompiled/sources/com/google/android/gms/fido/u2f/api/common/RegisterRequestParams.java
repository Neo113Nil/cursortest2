package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.dq70;
import xsna.exc0;
import xsna.ge01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes12.dex */
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new ge01();
    public final Integer b;
    public final Double c;
    public final Uri d;
    public final List e;
    public final List f;
    public final ChannelIdValue g;
    public final String h;

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.b = num;
        this.c = d;
        this.d = uri;
        exc0.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.e = arrayList;
        this.f = arrayList2;
        this.g = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            exc0.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.e == null) ? false : true);
            String str2 = registerRequest.e;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            exc0.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.c == null) ? false : true);
            String str3 = registeredKey.c;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        exc0.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.h = str;
    }

    public final boolean equals(@NonNull Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        Integer num = registerRequestParams.b;
        List list2 = registerRequestParams.f;
        return dq70.b(this.b, num) && dq70.b(this.c, registerRequestParams.c) && dq70.b(this.d, registerRequestParams.d) && dq70.b(this.e, registerRequestParams.e) && (((list = this.f) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && dq70.b(this.g, registerRequestParams.g) && dq70.b(this.h, registerRequestParams.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, this.c, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.k(parcel, 2, this.b);
        ozg0.f(parcel, 3, this.c);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.u(parcel, 5, this.e, false);
        ozg0.u(parcel, 6, this.f, false);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.x(w, parcel);
    }
}
