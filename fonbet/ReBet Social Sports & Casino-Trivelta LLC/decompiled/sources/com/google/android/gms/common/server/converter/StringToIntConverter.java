package com.google.android.gms.common.server.converter;

import H9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f32787a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f32788b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f32789c = new SparseArray();

    public StringToIntConverter(int i10, ArrayList arrayList) {
        this.f32787a = i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            g(zacVar.f32793b, zacVar.f32794c);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        String str = (String) this.f32789c.get(((Integer) obj).intValue());
        return (str == null && this.f32788b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        Integer num = (Integer) this.f32788b.get((String) obj);
        return num == null ? (Integer) this.f32788b.get("gms_unknown") : num;
    }

    public StringToIntConverter g(String str, int i10) {
        this.f32788b.put(str, Integer.valueOf(i10));
        this.f32789c.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32787a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f32788b.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f32788b.get(str)).intValue()));
        }
        E9.b.J(parcel, 2, arrayList, false);
        E9.b.b(parcel, a10);
    }
}
