package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.ozg0;
import xsna.qnz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new qnz0();
    public final int b;
    public final HashMap c;
    public final SparseArray d;

    public StringToIntConverter() {
        this.b = 1;
        this.c = new HashMap();
        this.d = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.c;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zac(str, ((Integer) hashMap.get(str)).intValue()));
        }
        ozg0.u(parcel, 2, arrayList, false);
        ozg0.x(w, parcel);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.b = i;
        this.c = new HashMap();
        this.d = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            String str = zacVar.c;
            int i3 = zacVar.d;
            this.c.put(str, Integer.valueOf(i3));
            this.d.put(i3, str);
        }
    }
}
