package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();
    public final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, ArrayList arrayList, String str2) {
        this.a = i;
        Preconditions.f(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = arrayList;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && Objects.a(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && Objects.a(this.f, tokenData.f) && Objects.a(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.k(parcel, 3, this.c);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.o(parcel, 6, this.f);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.t(parcel, s);
    }
}
