package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.dh0;
import defpackage.ljg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public static final dh0 g;
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
        dh0 dh0Var = new dh0(0);
        g = dh0Var;
        dh0Var.put("registered", FastJsonResponse.Field.Y0(2, "registered"));
        dh0Var.put("in_progress", FastJsonResponse.Field.Y0(3, "in_progress"));
        dh0Var.put("success", FastJsonResponse.Field.Y0(4, "success"));
        dh0Var.put(U3.i.t, FastJsonResponse.Field.Y0(5, U3.i.t));
        dh0Var.put("escrowed", FastJsonResponse.Field.Y0(6, "escrowed"));
    }

    public zzs(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        return g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i = field.g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                a70.r(ljg.j(i, "Unknown SafeParcelable id="));
                return null;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.o(parcel, 2, this.b);
        SafeParcelWriter.o(parcel, 3, this.c);
        SafeParcelWriter.o(parcel, 4, this.d);
        SafeParcelWriter.o(parcel, 5, this.e);
        SafeParcelWriter.o(parcel, 6, this.f);
        SafeParcelWriter.t(parcel, s);
    }

    public zzs() {
        this.a = 1;
    }
}
