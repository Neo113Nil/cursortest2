package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import g6.v;
import h8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new n(17);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4820a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f4821b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f4822c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4823d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4824e;

    /* renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f4825f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4826g;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.f4820a = num;
        this.f4821b = d10;
        this.f4822c = uri;
        this.f4823d = bArr;
        this.f4824e = arrayList;
        this.f4825f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                v.a("registered key has null appId and no request appId is provided", (registeredKey.f4818b == null && uri == null) ? false : true);
                String str2 = registeredKey.f4818b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        v.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f4826g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.f4824e;
        if (v.k(this.f4820a, signRequestParams.f4820a) && v.k(this.f4821b, signRequestParams.f4821b) && v.k(this.f4822c, signRequestParams.f4822c) && Arrays.equals(this.f4823d, signRequestParams.f4823d)) {
            List list2 = this.f4824e;
            if (list2.containsAll(list) && list.containsAll(list2) && v.k(this.f4825f, signRequestParams.f4825f) && v.k(this.f4826g, signRequestParams.f4826g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4820a, this.f4822c, this.f4821b, this.f4824e, this.f4825f, this.f4826g, Integer.valueOf(Arrays.hashCode(this.f4823d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.K(parcel, 2, this.f4820a);
        b.H(parcel, 3, this.f4821b);
        b.N(parcel, 4, this.f4822c, i5, false);
        b.G(parcel, 5, this.f4823d, false);
        b.R(parcel, 6, this.f4824e, false);
        b.N(parcel, 7, this.f4825f, i5, false);
        b.O(parcel, 8, this.f4826g, false);
        b.W(parcel, V);
    }
}
