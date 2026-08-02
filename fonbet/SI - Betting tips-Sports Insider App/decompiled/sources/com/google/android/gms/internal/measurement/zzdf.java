package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new v0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f5388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5389b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f5390c;

    public zzdf(int i5, Intent intent, String str) {
        this.f5388a = i5;
        this.f5389b = str;
        this.f5390c = intent;
    }

    public static zzdf c(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getIntent(), activity.getClass().getCanonicalName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.f5388a == zzdfVar.f5388a && Objects.equals(this.f5389b, zzdfVar.f5389b) && Objects.equals(this.f5390c, zzdfVar.f5390c);
    }

    public final int hashCode() {
        return this.f5388a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f5388a);
        h8.b.O(parcel, 2, this.f5389b, false);
        h8.b.N(parcel, 3, this.f5390c, i5, false);
        h8.b.W(parcel, V);
    }
}
