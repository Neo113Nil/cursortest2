package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new j(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f4560a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4561b;

    public ModuleInstallResponse(int i5, boolean z5) {
        this.f4560a = i5;
        this.f4561b = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4560a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4561b ? 1 : 0);
        b.W(parcel, V);
    }
}
