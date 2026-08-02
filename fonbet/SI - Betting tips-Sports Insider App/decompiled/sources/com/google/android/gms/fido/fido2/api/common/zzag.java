package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new b(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f4767a;

    public zzag(String str) {
        v.h(str);
        this.f4767a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f4767a.equals(((zzag) obj).f4767a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4767a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4767a, false);
        h8.b.W(parcel, V);
    }
}
