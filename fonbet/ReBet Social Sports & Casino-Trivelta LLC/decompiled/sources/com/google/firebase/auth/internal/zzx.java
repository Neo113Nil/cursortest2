package com.google.firebase.auth.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import lb.E;
import lb.x0;

/* loaded from: classes3.dex */
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = new x0();

    /* renamed from: a, reason: collision with root package name */
    public final String f37701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37702b;

    /* renamed from: c, reason: collision with root package name */
    public Map f37703c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37704d;

    public zzx(boolean z10) {
        this.f37704d = z10;
        this.f37702b = null;
        this.f37701a = null;
        this.f37703c = null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean C() {
        return this.f37704d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map getProfile() {
        return this.f37703c;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getUsername() {
        if ("github.com".equals(this.f37701a)) {
            return (String) this.f37703c.get("login");
        }
        if ("twitter.com".equals(this.f37701a)) {
            return (String) this.f37703c.get("screen_name");
        }
        return null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String n() {
        return this.f37701a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, n(), false);
        b.F(parcel, 2, this.f37702b, false);
        b.g(parcel, 3, C());
        b.b(parcel, a10);
    }

    public zzx(String str, String str2, boolean z10) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        this.f37701a = str;
        this.f37702b = str2;
        this.f37703c = E.d(str2);
        this.f37704d = z10;
    }
}
