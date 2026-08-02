package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.bj01;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes12.dex */
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new bj01();
    public final Integer b;

    @Nullable
    public final Double c;
    public final Uri d;
    public final byte[] e;
    public final List f;
    public final ChannelIdValue g;
    public final String h;

    public SignRequestParams(Integer num, @Nullable Double d, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.b = num;
        this.c = d;
        this.d = uri;
        this.e = bArr;
        this.f = arrayList;
        this.g = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                exc0.a("registered key has null appId and no request appId is provided", (registeredKey.c == null && uri == null) ? false : true);
                String str2 = registeredKey.c;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        exc0.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.h = str;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        Integer num = signRequestParams.b;
        List list = signRequestParams.f;
        if (dq70.b(this.b, num) && dq70.b(this.c, signRequestParams.c) && dq70.b(this.d, signRequestParams.d) && Arrays.equals(this.e, signRequestParams.e)) {
            List list2 = this.f;
            if (list2.containsAll(list) && list.containsAll(list2) && dq70.b(this.g, signRequestParams.g) && dq70.b(this.h, signRequestParams.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, this.c, this.f, this.g, this.h, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.k(parcel, 2, this.b);
        ozg0.f(parcel, 3, this.c);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.e(parcel, 5, this.e, false);
        ozg0.u(parcel, 6, this.f, false);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.x(w, parcel);
    }
}
