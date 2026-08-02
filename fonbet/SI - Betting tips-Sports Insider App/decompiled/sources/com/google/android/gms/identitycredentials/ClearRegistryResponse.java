package com.google.android.gms.identitycredentials;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClearRegistryResponse extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<ClearRegistryResponse> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4831a;

    public ClearRegistryResponse(boolean z5) {
        this.f4831a = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int V = b.V(dest, 20293);
        b.U(dest, 1, 4);
        dest.writeInt(this.f4831a ? 1 : 0);
        b.W(dest, V);
    }
}
