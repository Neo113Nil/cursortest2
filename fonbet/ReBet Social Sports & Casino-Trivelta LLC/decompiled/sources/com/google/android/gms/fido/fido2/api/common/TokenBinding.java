package com.google.android.gms.fido.fido2.api.common;

import R9.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new p();

    /* renamed from: c, reason: collision with root package name */
    public static final TokenBinding f32960c = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    /* renamed from: d, reason: collision with root package name */
    public static final TokenBinding f32961d = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* renamed from: a, reason: collision with root package name */
    public final TokenBindingStatus f32962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32963b;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        public final String f32967a;

        TokenBindingStatus(String str) {
            this.f32967a = str;
        }

        public static TokenBindingStatus a(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f32967a)) {
                    return tokenBindingStatus;
                }
            }
            throw new a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f32967a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f32967a);
        }
    }

    public static class a extends Exception {
        public a(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(String str, String str2) {
        AbstractC3191o.m(str);
        try {
            this.f32962a = TokenBindingStatus.a(str);
            this.f32963b = str2;
        } catch (a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzao.zza(this.f32962a, tokenBinding.f32962a) && zzao.zza(this.f32963b, tokenBinding.f32963b);
    }

    public String g() {
        return this.f32963b;
    }

    public String h() {
        return this.f32962a.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32962a, this.f32963b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, h(), false);
        E9.b.F(parcel, 3, g(), false);
        E9.b.b(parcel, a10);
    }
}
