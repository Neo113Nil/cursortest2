package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;
import xsna.puz0;
import xsna.s201;
import xsna.zs01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public class StartBleScanRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StartBleScanRequest> CREATOR = new s201();
    public final List b;

    @Nullable
    public final puz0 c;
    public final int d;

    @Nullable
    public final zzcw e;

    public StartBleScanRequest(ArrayList arrayList, @Nullable IBinder iBinder, int i, @Nullable IBinder iBinder2) {
        puz0 zs01Var;
        this.b = arrayList;
        if (iBinder == null) {
            zs01Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zs01Var = queryLocalInterface instanceof puz0 ? (puz0) queryLocalInterface : new zs01(iBinder);
        }
        this.c = zs01Var;
        this.d = i;
        this.e = iBinder2 != null ? zzcv.zzc(iBinder2) : null;
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "dataTypes");
        aVar.a(Integer.valueOf(this.d), "timeoutSecs");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, Collections.unmodifiableList(this.b), false);
        puz0 puz0Var = this.c;
        ozg0.h(parcel, 2, puz0Var == null ? null : puz0Var.asBinder());
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        zzcw zzcwVar = this.e;
        ozg0.h(parcel, 4, zzcwVar != null ? zzcwVar.asBinder() : null);
        ozg0.x(w, parcel);
    }

    public StartBleScanRequest(List list, @Nullable puz0 puz0Var, int i, @Nullable zzcw zzcwVar) {
        this.b = list;
        this.c = puz0Var;
        this.d = i;
        this.e = zzcwVar;
    }
}
