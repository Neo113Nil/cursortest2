package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kb.b0;

/* loaded from: classes3.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    public String f37605a;

    /* renamed from: b, reason: collision with root package name */
    public String f37606b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37607c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37608d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f37609e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f37610a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f37611b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37612c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37613d;

        public UserProfileChangeRequest a() {
            String str = this.f37610a;
            Uri uri = this.f37611b;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.f37612c, this.f37613d);
        }

        public a b(String str) {
            if (str == null) {
                this.f37612c = true;
                return this;
            }
            this.f37610a = str;
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f37613d = true;
                return this;
            }
            this.f37611b = uri;
            return this;
        }
    }

    public UserProfileChangeRequest(String str, String str2, boolean z10, boolean z11) {
        this.f37605a = str;
        this.f37606b = str2;
        this.f37607c = z10;
        this.f37608d = z11;
        this.f37609e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public Uri g() {
        return this.f37609e;
    }

    public String getDisplayName() {
        return this.f37605a;
    }

    public final boolean h() {
        return this.f37607c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, getDisplayName(), false);
        E9.b.F(parcel, 3, this.f37606b, false);
        E9.b.g(parcel, 4, this.f37607c);
        E9.b.g(parcel, 5, this.f37608d);
        E9.b.b(parcel, a10);
    }

    public final String zza() {
        return this.f37606b;
    }

    public final boolean zzc() {
        return this.f37608d;
    }
}
