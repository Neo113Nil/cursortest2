package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class StoreBytesData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new u5.b(20);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4429a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4431c;

    public StoreBytesData(String str, boolean z5, byte[] bArr) {
        this.f4429a = bArr;
        this.f4430b = z5;
        this.f4431c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.G(parcel, 1, this.f4429a, false);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4430b ? 1 : 0);
        h8.b.O(parcel, 3, this.f4431c, false);
        h8.b.W(parcel, V);
    }
}
