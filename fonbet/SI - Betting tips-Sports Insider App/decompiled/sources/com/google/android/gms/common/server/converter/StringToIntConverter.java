package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new j(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f4574a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4575b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f4576c = new SparseArray();

    public StringToIntConverter(ArrayList arrayList, int i5) {
        this.f4574a = i5;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zac zacVar = (zac) arrayList.get(i10);
            String str = zacVar.f4580b;
            int i11 = zacVar.f4581c;
            this.f4575b.put(str, Integer.valueOf(i11));
            this.f4576c.put(i11, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4574a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f4575b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zac(str, ((Integer) hashMap.get(str)).intValue()));
        }
        b.R(parcel, 2, arrayList, false);
        b.W(parcel, V);
    }
}
