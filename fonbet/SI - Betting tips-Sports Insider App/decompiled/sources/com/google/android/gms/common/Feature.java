package com.google.android.gms.common;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new a(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f4445a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4446b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4447c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4448d;

    public Feature(String str, int i5, long j, boolean z5) {
        this.f4445a = str;
        this.f4446b = i5;
        this.f4447c = j;
        this.f4448d = z5;
    }

    public final long c() {
        long j = this.f4447c;
        return j == -1 ? this.f4446b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (v.k(this.f4445a, feature.f4445a) && c() == feature.c() && this.f4448d == feature.f4448d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4445a, Long.valueOf(c()), Boolean.valueOf(this.f4448d)});
    }

    public final String toString() {
        l1.a aVar = new l1.a(this);
        aVar.i(this.f4445a, "name");
        aVar.i(Long.valueOf(c()), "version");
        aVar.i(Boolean.valueOf(this.f4448d), "is_fully_rolled_out");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 1, this.f4445a, false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4446b);
        long c2 = c();
        b.U(parcel, 3, 8);
        parcel.writeLong(c2);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4448d ? 1 : 0);
        b.W(parcel, V);
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }
}
