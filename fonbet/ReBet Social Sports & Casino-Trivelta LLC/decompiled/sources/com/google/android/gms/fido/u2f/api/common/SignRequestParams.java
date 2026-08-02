package com.google.android.gms.fido.u2f.api.common;

import S9.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes2.dex */
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33017a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f33018b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f33019c;

    /* renamed from: d, reason: collision with root package name */
    public final List f33020d;

    /* renamed from: e, reason: collision with root package name */
    public final ChannelIdValue f33021e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33022f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f33023g;
    private final byte[] zzd;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        this.f33017a = num;
        this.f33018b = d10;
        this.f33019c = uri;
        this.zzd = bArr;
        AbstractC3191o.b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f33020d = list;
        this.f33021e = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            AbstractC3191o.b((registeredKey.g() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            registeredKey.h();
            AbstractC3191o.b(true, "register request has null challenge and no default challenge isprovided");
            if (registeredKey.g() != null) {
                hashSet.add(Uri.parse(registeredKey.g()));
            }
        }
        this.f33023g = hashSet;
        AbstractC3191o.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f33022f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return AbstractC3189m.b(this.f33017a, signRequestParams.f33017a) && AbstractC3189m.b(this.f33018b, signRequestParams.f33018b) && AbstractC3189m.b(this.f33019c, signRequestParams.f33019c) && Arrays.equals(this.zzd, signRequestParams.zzd) && this.f33020d.containsAll(signRequestParams.f33020d) && signRequestParams.f33020d.containsAll(this.f33020d) && AbstractC3189m.b(this.f33021e, signRequestParams.f33021e) && AbstractC3189m.b(this.f33022f, signRequestParams.f33022f);
    }

    public Uri g() {
        return this.f33019c;
    }

    public ChannelIdValue h() {
        return this.f33021e;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f33017a, this.f33019c, this.f33018b, this.f33020d, this.f33021e, this.f33022f, Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    public byte[] i() {
        return this.zzd;
    }

    public String j() {
        return this.f33022f;
    }

    public List k() {
        return this.f33020d;
    }

    public Integer l() {
        return this.f33017a;
    }

    public Double m() {
        return this.f33018b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.x(parcel, 2, l(), false);
        E9.b.p(parcel, 3, m(), false);
        E9.b.D(parcel, 4, g(), i10, false);
        E9.b.l(parcel, 5, i(), false);
        E9.b.J(parcel, 6, k(), false);
        E9.b.D(parcel, 7, h(), i10, false);
        E9.b.F(parcel, 8, j(), false);
        E9.b.b(parcel, a10);
    }
}
