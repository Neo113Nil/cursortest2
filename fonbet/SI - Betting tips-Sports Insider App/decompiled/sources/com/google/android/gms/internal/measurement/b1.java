package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 extends y implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s7.w0 f4929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(w0 w0Var, s7.w0 w0Var2) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f4929a = w0Var2;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 2) {
            return false;
        }
        c();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void c() {
        this.f4929a.run();
    }
}
