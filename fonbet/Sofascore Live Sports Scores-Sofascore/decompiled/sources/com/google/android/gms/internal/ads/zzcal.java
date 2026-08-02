package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzcal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcal> CREATOR = new zzcam();
    public final View a;
    public final Map b;

    public zzcal(IBinder iBinder, IBinder iBinder2) {
        this.a = (View) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder));
        this.b = (Map) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.f(parcel, 1, new ObjectWrapper(this.a));
        SafeParcelWriter.f(parcel, 2, new ObjectWrapper(this.b));
        SafeParcelWriter.t(parcel, s);
    }
}
