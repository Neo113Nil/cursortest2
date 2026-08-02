package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new b(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f4257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4258b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f4259c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4260d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4261e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4262f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4263g;

    public TokenData(int i5, String str, Long l6, boolean z5, boolean z7, ArrayList arrayList, String str2) {
        this.f4257a = i5;
        v.e(str);
        this.f4258b = str;
        this.f4259c = l6;
        this.f4260d = z5;
        this.f4261e = z7;
        this.f4262f = arrayList;
        this.f4263g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f4258b, tokenData.f4258b) && v.k(this.f4259c, tokenData.f4259c) && this.f4260d == tokenData.f4260d && this.f4261e == tokenData.f4261e && v.k(this.f4262f, tokenData.f4262f) && v.k(this.f4263g, tokenData.f4263g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4258b, this.f4259c, Boolean.valueOf(this.f4260d), Boolean.valueOf(this.f4261e), this.f4262f, this.f4263g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4257a);
        h8.b.O(parcel, 2, this.f4258b, false);
        h8.b.M(parcel, 3, this.f4259c);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4260d ? 1 : 0);
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f4261e ? 1 : 0);
        h8.b.P(parcel, 6, this.f4262f);
        h8.b.O(parcel, 7, this.f4263g, false);
        h8.b.W(parcel, V);
    }
}
