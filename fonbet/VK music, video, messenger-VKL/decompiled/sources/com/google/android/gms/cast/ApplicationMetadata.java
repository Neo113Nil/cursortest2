package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.i5s;
import xsna.k73;
import xsna.n6j;
import xsna.o0a;
import xsna.ozg0;
import xsna.u601;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new u601();
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final Uri f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final Boolean i;

    @Nullable
    public final Boolean j;
    public final int k;

    public ApplicationMetadata() {
        this.d = new ArrayList();
        this.k = 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return o0a.c(this.b, applicationMetadata.b) && o0a.c(this.c, applicationMetadata.c) && o0a.c(this.d, applicationMetadata.d) && o0a.c(this.e, applicationMetadata.e) && o0a.c(this.f, applicationMetadata.f) && o0a.c(this.g, applicationMetadata.g) && o0a.c(this.h, applicationMetadata.h) && this.k == applicationMetadata.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, Integer.valueOf(this.k)});
    }

    @NonNull
    public final String toString() {
        List list = this.d;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.f);
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.c;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.e;
        int a = k73.a(length2 + 20 + length3 + 23, 22, String.valueOf(str3));
        int length4 = valueOf.length();
        String str4 = this.g;
        int i = a + length4 + 11;
        int length5 = String.valueOf(str4).length();
        String str5 = this.h;
        StringBuilder sb = new StringBuilder(i + length5 + 8 + String.valueOf(str5).length());
        n6j.b(sb, "applicationId: ", str, ", name: ", str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        n6j.b(sb, ", senderAppLaunchUrl: ", valueOf, ", iconUrl: ", str4);
        return i5s.a(sb, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.s(parcel, Collections.unmodifiableList(this.d), 5);
        ozg0.q(parcel, 6, this.e, false);
        ozg0.p(parcel, 7, this.f, i, false);
        ozg0.q(parcel, 8, this.g, false);
        ozg0.q(parcel, 9, this.h, false);
        ozg0.c(parcel, 10, this.i);
        ozg0.c(parcel, 11, this.j);
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(this.k);
        ozg0.x(w, parcel);
    }

    public ApplicationMetadata(String str, String str2, ArrayList arrayList, String str3, Uri uri, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Boolean bool2, int i) {
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = str3;
        this.f = uri;
        this.g = str4;
        this.h = str5;
        this.i = bool;
        this.j = bool2;
        this.k = i;
    }
}
