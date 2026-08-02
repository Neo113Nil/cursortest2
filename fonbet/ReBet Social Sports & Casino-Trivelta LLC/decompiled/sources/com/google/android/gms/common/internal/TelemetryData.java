package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C3198w();

    /* renamed from: a, reason: collision with root package name */
    public final int f32674a;

    /* renamed from: b, reason: collision with root package name */
    public List f32675b;

    public TelemetryData(int i10, List list) {
        this.f32674a = i10;
        this.f32675b = list;
    }

    public final int g() {
        return this.f32674a;
    }

    public final List h() {
        return this.f32675b;
    }

    public final void i(MethodInvocation methodInvocation) {
        if (this.f32675b == null) {
            this.f32675b = new ArrayList();
        }
        this.f32675b.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, this.f32674a);
        E9.b.J(parcel, 2, this.f32675b, false);
        E9.b.b(parcel, a10);
    }
}
