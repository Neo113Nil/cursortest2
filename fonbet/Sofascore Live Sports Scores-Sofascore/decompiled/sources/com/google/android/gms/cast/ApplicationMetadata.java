package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new zzd();
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final int j;

    public ApplicationMetadata(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return CastUtils.c(this.a, applicationMetadata.a) && CastUtils.c(this.b, applicationMetadata.b) && CastUtils.c(this.c, applicationMetadata.c) && CastUtils.c(this.d, applicationMetadata.d) && CastUtils.c(this.e, applicationMetadata.e) && CastUtils.c(this.f, applicationMetadata.f) && CastUtils.c(this.g, applicationMetadata.g) && this.j == applicationMetadata.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.j)});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.d;
        int d = mz1.d(length2 + 20 + length3 + 23, 22, String.valueOf(str3));
        int length4 = valueOf.length();
        String str4 = this.f;
        int i = d + length4 + 11;
        int length5 = String.valueOf(str4).length();
        String str5 = this.g;
        StringBuilder sb = new StringBuilder(i + length5 + 8 + String.valueOf(str5).length());
        bf3.v(sb, "applicationId: ", str, ", name: ", str2);
        fn0.s(size, ", namespaces.count: ", ", senderAppIdentifier: ", str3, sb);
        bf3.v(sb, ", senderAppLaunchUrl: ", valueOf, ", iconUrl: ", str4);
        return mz1.o(sb, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.o(parcel, 5, Collections.unmodifiableList(this.c));
        SafeParcelWriter.m(parcel, 6, this.d, false);
        SafeParcelWriter.l(parcel, 7, this.e, i, false);
        SafeParcelWriter.m(parcel, 8, this.f, false);
        SafeParcelWriter.m(parcel, 9, this.g, false);
        SafeParcelWriter.a(parcel, 10, this.h);
        SafeParcelWriter.a(parcel, 11, this.i);
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(this.j);
        SafeParcelWriter.t(parcel, s);
    }

    private ApplicationMetadata() {
        this.c = new ArrayList();
        this.j = 1;
    }
}
