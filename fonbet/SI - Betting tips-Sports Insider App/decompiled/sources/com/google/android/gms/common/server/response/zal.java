package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.ArrayList;
import java.util.Map;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f4599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4600b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4601c;

    public zal(int i5, String str, ArrayList arrayList) {
        this.f4599a = i5;
        this.f4600b = str;
        this.f4601c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4599a);
        b.O(parcel, 2, this.f4600b, false);
        b.R(parcel, 3, this.f4601c, false);
        b.W(parcel, V);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f4599a = 1;
        this.f4600b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse$Field) map.get(str2)));
            }
        }
        this.f4601c = arrayList;
    }
}
