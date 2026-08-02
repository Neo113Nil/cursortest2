package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbk;
import defpackage.ilg;
import defpackage.lnb;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new zzaz();
    public final TokenBindingStatus a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new d();
        public final String a;

        TokenBindingStatus(String str) {
            this.a = str;
        }

        public static TokenBindingStatus a(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.a)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(lnb.o("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class UnsupportedTokenBindingStatusException extends Exception {
    }

    static {
        new TokenBinding("supported", null);
        new TokenBinding("not-supported", null);
    }

    public TokenBinding(String str, String str2) {
        Preconditions.i(str);
        try {
            this.a = TokenBindingStatus.a(str);
            this.b = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            ilg.k(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzbk.a(this.a, tokenBinding.a) && zzbk.a(this.b, tokenBinding.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
