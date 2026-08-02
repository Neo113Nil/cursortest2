package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.measurement.x implements d {
    public final int U(int i5, String str, String str2, Bundle bundle) {
        Parcel R = R();
        R.writeInt(i5);
        R.writeString(str);
        R.writeString(str2);
        int i10 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 10);
        int readInt = S.readInt();
        S.recycle();
        return readInt;
    }

    public final Bundle V(String str, String str2, Bundle bundle) {
        Parcel R = R();
        R.writeInt(9);
        R.writeString(str);
        R.writeString(str2);
        int i5 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) f.a(S);
        S.recycle();
        return bundle2;
    }

    public final Bundle W(String str, String str2, Bundle bundle) {
        Parcel R = R();
        R.writeInt(9);
        R.writeString(str);
        R.writeString(str2);
        int i5 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) f.a(S);
        S.recycle();
        return bundle2;
    }

    public final Bundle X(String str, String str2, String str3) {
        Parcel R = R();
        R.writeInt(3);
        R.writeString(str);
        R.writeString(str2);
        R.writeString(str3);
        R.writeString(null);
        Parcel S = S(R, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) f.a(S);
        S.recycle();
        return bundle;
    }

    public final Bundle Y(int i5, String str, String str2, String str3, Bundle bundle) {
        Parcel R = R();
        R.writeInt(i5);
        R.writeString(str);
        R.writeString(str2);
        R.writeString(str3);
        R.writeString(null);
        int i10 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) f.a(S);
        S.recycle();
        return bundle2;
    }

    public final Bundle Z(String str, String str2, String str3, Bundle bundle) {
        Parcel R = R();
        R.writeInt(6);
        R.writeString(str);
        R.writeString(str2);
        R.writeString(str3);
        int i5 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 9);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) f.a(S);
        S.recycle();
        return bundle2;
    }

    public final Bundle a0(String str, String str2, String str3) {
        Parcel R = R();
        R.writeInt(3);
        R.writeString(str);
        R.writeString(str2);
        R.writeString(str3);
        Parcel S = S(R, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) f.a(S);
        S.recycle();
        return bundle;
    }

    public final Bundle b0(int i5, String str, String str2, String str3, Bundle bundle) {
        Parcel R = R();
        R.writeInt(i5);
        R.writeString(str);
        R.writeString(str2);
        R.writeString(str3);
        int i10 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) f.a(S);
        S.recycle();
        return bundle2;
    }

    public final Bundle c0(String str, String str2, Bundle bundle) {
        Parcel R = R();
        R.writeInt(3);
        R.writeString(str);
        R.writeString(str2);
        int i5 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        Parcel S = S(R, 2);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) f.a(S);
        S.recycle();
        return bundle2;
    }

    public final Bundle d0(int i5, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel R = R();
        R.writeInt(i5);
        R.writeString(str);
        R.writeString(str2);
        int i10 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeInt(1);
        bundle2.writeToParcel(R, 0);
        Parcel S = S(R, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) f.a(S);
        S.recycle();
        return bundle3;
    }

    public final void e0(String str, Bundle bundle, com.android.billingclient.api.h0 h0Var) {
        Parcel R = R();
        R.writeInt(18);
        R.writeString(str);
        int i5 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(h0Var);
        T(R, 1301);
    }

    public final void f0(String str, Bundle bundle, com.android.billingclient.api.i0 i0Var) {
        Parcel R = R();
        R.writeInt(12);
        R.writeString(str);
        int i5 = f.f5442a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(i0Var);
        T(R, 1201);
    }
}
