package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    public final int a;
    public final HashMap b;
    public final SparseArray c;

    public StringToIntConverter(ArrayList arrayList, int i) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            String str = zacVar.b;
            int i3 = zacVar.c;
            this.b.put(str, Integer.valueOf(i3));
            this.c.put(i3, str);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ String u0(Object obj) {
        String str = (String) this.c.get(((Integer) obj).intValue());
        return (str == null && this.b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zac(str, ((Integer) hashMap.get(str)).intValue()));
        }
        SafeParcelWriter.q(parcel, 2, arrayList, false);
        SafeParcelWriter.t(parcel, s);
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }
}
