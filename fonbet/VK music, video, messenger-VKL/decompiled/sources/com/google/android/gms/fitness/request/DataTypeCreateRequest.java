package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzby;
import com.google.android.gms.internal.fitness.zzbz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;
import xsna.vm01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public class DataTypeCreateRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataTypeCreateRequest> CREATOR = new vm01();
    public final String b;
    public final List c;

    @Nullable
    public final zzbz d;

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, zzbz zzbzVar) {
        this(dataTypeCreateRequest.b, dataTypeCreateRequest.c, zzbzVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataTypeCreateRequest)) {
            return false;
        }
        DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) obj;
        return dq70.b(this.b, dataTypeCreateRequest.b) && dq70.b(this.c, dataTypeCreateRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "name");
        aVar.a(this.c, "fields");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.u(parcel, 2, this.c, false);
        zzbz zzbzVar = this.d;
        ozg0.h(parcel, 3, zzbzVar == null ? null : zzbzVar.asBinder());
        ozg0.x(w, parcel);
    }

    public DataTypeCreateRequest(String str, ArrayList arrayList, @Nullable IBinder iBinder) {
        this.b = str;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = iBinder == null ? null : zzby.zzb(iBinder);
    }

    public DataTypeCreateRequest(String str, List list, @Nullable zzbz zzbzVar) {
        this.b = str;
        this.c = Collections.unmodifiableList(list);
        this.d = zzbzVar;
    }
}
