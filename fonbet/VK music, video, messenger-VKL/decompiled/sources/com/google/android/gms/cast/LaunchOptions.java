package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import xsna.e401;
import xsna.n23;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class LaunchOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new e401();
    public final boolean b;
    public final String c;
    public final boolean d;

    @Nullable
    public final CredentialsData e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LaunchOptions() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = o0a.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.b == launchOptions.b && o0a.c(this.c, launchOptions.c) && this.d == launchOptions.d && o0a.c(this.e, launchOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), this.e});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(this.b);
        sb.append(", language=");
        sb.append(this.c);
        sb.append(", androidReceiverCompatible: ");
        return n23.b(sb, this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.x(w, parcel);
    }

    public LaunchOptions(boolean z, String str, boolean z2, @Nullable CredentialsData credentialsData) {
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = credentialsData;
    }
}
