package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.gq01;
import xsna.lhg;
import xsna.ozg0;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new gq01();
    public static final zk3 h;
    public final int b;
    public List c;
    public List d;
    public List e;
    public List f;
    public List g;

    static {
        zk3 zk3Var = new zk3();
        h = zk3Var;
        zk3Var.put("registered", FastJsonResponse.Field.b(2, "registered"));
        zk3Var.put("in_progress", FastJsonResponse.Field.b(3, "in_progress"));
        zk3Var.put("success", FastJsonResponse.Field.b(4, "success"));
        zk3Var.put("failed", FastJsonResponse.Field.b(5, "failed"));
        zk3Var.put("escrowed", FastJsonResponse.Field.b(6, "escrowed"));
    }

    public zzs() {
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.h) {
            case 1:
                return Integer.valueOf(this.b);
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            default:
                throw new IllegalStateException(lhg.a(field.h, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int i = field.h;
        if (i == 2) {
            this.c = arrayList;
            return;
        }
        if (i == 3) {
            this.d = arrayList;
            return;
        }
        if (i == 4) {
            this.e = arrayList;
        } else if (i == 5) {
            this.f = arrayList;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
            }
            this.g = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.s(parcel, this.c, 2);
        ozg0.s(parcel, this.d, 3);
        ozg0.s(parcel, this.e, 4);
        ozg0.s(parcel, this.f, 5);
        ozg0.s(parcel, this.g, 6);
        ozg0.x(w, parcel);
    }

    public zzs(int i, @Nullable ArrayList arrayList, @Nullable ArrayList arrayList2, @Nullable ArrayList arrayList3, @Nullable ArrayList arrayList4, @Nullable ArrayList arrayList5) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.g = arrayList5;
    }
}
