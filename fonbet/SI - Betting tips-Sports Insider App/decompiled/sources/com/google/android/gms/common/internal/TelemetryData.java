package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new j(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f4532a;

    /* renamed from: b, reason: collision with root package name */
    public List f4533b;

    public TelemetryData(int i5, List list) {
        this.f4532a = i5;
        this.f4533b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4532a);
        b.R(parcel, 2, this.f4533b, false);
        b.W(parcel, V);
    }
}
