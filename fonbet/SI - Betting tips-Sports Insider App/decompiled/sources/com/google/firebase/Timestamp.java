package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import d9.e;
import h8.j;
import h8.k;
import h8.l;
import jf.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final long f6050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6051b;

    public Timestamp(long j, int i5) {
        if (i5 < 0 || i5 >= 1000000000) {
            throw new IllegalArgumentException(c1.i(i5, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j || j >= 253402300800L) {
            throw new IllegalArgumentException(e.g(j, "Timestamp seconds out of range: ").toString());
        }
        this.f6050a = j;
        this.f6051b = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Timestamp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Function1[] selectors = {k.f10422a, l.f10423a};
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        for (int i5 = 0; i5 < 2; i5++) {
            Function1 function1 = selectors[i5];
            int a7 = a.a((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
            if (a7 != 0) {
                return a7;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f6050a;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.f6051b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.f6050a);
        sb2.append(", nanoseconds=");
        return e.i(sb2, this.f6051b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f6050a);
        dest.writeInt(this.f6051b);
    }
}
