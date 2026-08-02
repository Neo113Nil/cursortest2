package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new j(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f4562a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4563b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f4564c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f4565d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4566e;

    public ModuleInstallStatusUpdate(int i5, int i10, Long l6, Long l10, int i11) {
        this.f4562a = i5;
        this.f4563b = i10;
        this.f4564c = l6;
        this.f4565d = l10;
        this.f4566e = i11;
        if (l6 != null && l10 != null && l10.longValue() != 0 && l10.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4562a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4563b);
        b.M(parcel, 3, this.f4564c);
        b.M(parcel, 4, this.f4565d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4566e);
        b.W(parcel, V);
    }
}
