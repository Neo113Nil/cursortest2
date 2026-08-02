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
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new n(14);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4807a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f4808b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f4809c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4810d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4811e;

    /* renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f4812f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4813g;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.f4807a = num;
        this.f4808b = d10;
        this.f4809c = uri;
        v.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f4810d = arrayList;
        this.f4811e = arrayList2;
        this.f4812f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            v.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.f4806d == null) ? false : true);
            String str2 = registerRequest.f4806d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            v.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.f4818b == null) ? false : true);
            String str3 = registeredKey.f4818b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        v.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f4813g = str;
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
        List list2 = registerRequestParams.f4811e;
        return v.k(this.f4807a, registerRequestParams.f4807a) && v.k(this.f4808b, registerRequestParams.f4808b) && v.k(this.f4809c, registerRequestParams.f4809c) && v.k(this.f4810d, registerRequestParams.f4810d) && (((list = this.f4811e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && v.k(this.f4812f, registerRequestParams.f4812f) && v.k(this.f4813g, registerRequestParams.f4813g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4807a, this.f4809c, this.f4808b, this.f4810d, this.f4811e, this.f4812f, this.f4813g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.K(parcel, 2, this.f4807a);
        b.H(parcel, 3, this.f4808b);
        b.N(parcel, 4, this.f4809c, i5, false);
        b.R(parcel, 5, this.f4810d, false);
        b.R(parcel, 6, this.f4811e, false);
        b.N(parcel, 7, this.f4812f, i5, false);
        b.O(parcel, 8, this.f4813g, false);
        b.W(parcel, V);
    }
}
