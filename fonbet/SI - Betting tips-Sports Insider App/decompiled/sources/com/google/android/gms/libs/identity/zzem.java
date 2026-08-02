package com.google.android.gms.libs.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;
import java.util.ArrayList;
import m7.l;
import m7.n;
import m7.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new j(23);

    /* renamed from: a, reason: collision with root package name */
    public final n f4890a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f4891b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4892c;

    public zzem(ArrayList arrayList, PendingIntent pendingIntent, String str) {
        n g10;
        if (arrayList == null) {
            l lVar = n.f20469b;
            g10 = o.f20470e;
        } else {
            g10 = n.g(arrayList);
        }
        this.f4890a = g10;
        this.f4891b = pendingIntent;
        this.f4892c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.P(parcel, 1, this.f4890a);
        b.N(parcel, 2, this.f4891b, i5, false);
        b.O(parcel, 3, this.f4892c, false);
        b.W(parcel, V);
    }
}
