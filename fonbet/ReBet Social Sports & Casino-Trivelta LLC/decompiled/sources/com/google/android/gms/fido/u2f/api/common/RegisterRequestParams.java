package com.google.android.gms.fido.u2f.api.common;

import S9.d;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes2.dex */
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33006a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f33007b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f33008c;

    /* renamed from: d, reason: collision with root package name */
    public final List f33009d;

    /* renamed from: e, reason: collision with root package name */
    public final List f33010e;

    /* renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f33011f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33012g;

    /* renamed from: h, reason: collision with root package name */
    public Set f33013h;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        this.f33006a = num;
        this.f33007b = d10;
        this.f33008c = uri;
        AbstractC3191o.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f33009d = list;
        this.f33010e = list2;
        this.f33011f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            AbstractC3191o.b((uri == null && registerRequest.g() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (registerRequest.g() != null) {
                hashSet.add(Uri.parse(registerRequest.g()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            AbstractC3191o.b((uri == null && registeredKey.g() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (registeredKey.g() != null) {
                hashSet.add(Uri.parse(registeredKey.g()));
            }
        }
        this.f33013h = hashSet;
        AbstractC3191o.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f33012g = str;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return AbstractC3189m.b(this.f33006a, registerRequestParams.f33006a) && AbstractC3189m.b(this.f33007b, registerRequestParams.f33007b) && AbstractC3189m.b(this.f33008c, registerRequestParams.f33008c) && AbstractC3189m.b(this.f33009d, registerRequestParams.f33009d) && (((list = this.f33010e) == null && registerRequestParams.f33010e == null) || (list != null && (list2 = registerRequestParams.f33010e) != null && list.containsAll(list2) && registerRequestParams.f33010e.containsAll(this.f33010e))) && AbstractC3189m.b(this.f33011f, registerRequestParams.f33011f) && AbstractC3189m.b(this.f33012g, registerRequestParams.f33012g);
    }

    public Uri g() {
        return this.f33008c;
    }

    public ChannelIdValue h() {
        return this.f33011f;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f33006a, this.f33008c, this.f33007b, this.f33009d, this.f33010e, this.f33011f, this.f33012g);
    }

    public String i() {
        return this.f33012g;
    }

    public List j() {
        return this.f33009d;
    }

    public List k() {
        return this.f33010e;
    }

    public Integer l() {
        return this.f33006a;
    }

    public Double m() {
        return this.f33007b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.x(parcel, 2, l(), false);
        E9.b.p(parcel, 3, m(), false);
        E9.b.D(parcel, 4, g(), i10, false);
        E9.b.J(parcel, 5, j(), false);
        E9.b.J(parcel, 6, k(), false);
        E9.b.D(parcel, 7, h(), i10, false);
        E9.b.F(parcel, 8, i(), false);
        E9.b.b(parcel, a10);
    }
}
