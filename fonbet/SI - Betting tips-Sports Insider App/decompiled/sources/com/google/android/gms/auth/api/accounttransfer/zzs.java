package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q5.b;
import s.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new b(18);

    /* renamed from: g, reason: collision with root package name */
    public static final e f4274g;

    /* renamed from: a, reason: collision with root package name */
    public final int f4275a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4276b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4277c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4278d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4279e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4280f;

    static {
        e eVar = new e(0);
        f4274g = eVar;
        eVar.put("registered", FastJsonResponse$Field.c(2, "registered"));
        eVar.put("in_progress", FastJsonResponse$Field.c(3, "in_progress"));
        eVar.put("success", FastJsonResponse$Field.c(4, "success"));
        eVar.put("failed", FastJsonResponse$Field.c(5, "failed"));
        eVar.put("escrowed", FastJsonResponse$Field.c(6, "escrowed"));
    }

    public zzs(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f4275a = i5;
        this.f4276b = arrayList;
        this.f4277c = arrayList2;
        this.f4278d = arrayList3;
        this.f4279e = arrayList4;
        this.f4280f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map a() {
        return f4274g;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        switch (fastJsonResponse$Field.f4588g) {
            case 1:
                return Integer.valueOf(this.f4275a);
            case 2:
                return this.f4276b;
            case 3:
                return this.f4277c;
            case 4:
                return this.f4278d;
            case 5:
                return this.f4279e;
            case 6:
                return this.f4280f;
            default:
                throw new IllegalStateException(c1.i(fastJsonResponse$Field.f4588g, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4275a);
        h8.b.P(parcel, 2, this.f4276b);
        h8.b.P(parcel, 3, this.f4277c);
        h8.b.P(parcel, 4, this.f4278d);
        h8.b.P(parcel, 5, this.f4279e);
        h8.b.P(parcel, 6, this.f4280f);
        h8.b.W(parcel, V);
    }
}
