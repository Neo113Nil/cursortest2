package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4603b;

    /* renamed from: c, reason: collision with root package name */
    public final FastJsonResponse$Field f4604c;

    public zam(int i5, String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.f4602a = i5;
        this.f4603b = str;
        this.f4604c = fastJsonResponse$Field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4602a);
        b.O(parcel, 2, this.f4603b, false);
        b.N(parcel, 3, this.f4604c, i5, false);
        b.W(parcel, V);
    }

    public zam(String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.f4602a = 1;
        this.f4603b = str;
        this.f4604c = fastJsonResponse$Field;
    }
}
