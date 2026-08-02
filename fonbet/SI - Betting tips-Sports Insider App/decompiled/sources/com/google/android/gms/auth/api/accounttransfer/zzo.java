package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new b(17);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f4268f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4270b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4271c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4272d;

    /* renamed from: e, reason: collision with root package name */
    public final zzs f4273e;

    static {
        HashMap hashMap = new HashMap();
        f4268f = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        hashMap.put("progress", new FastJsonResponse$Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo(HashSet hashSet, int i5, ArrayList arrayList, int i10, zzs zzsVar) {
        this.f4269a = hashSet;
        this.f4270b = i5;
        this.f4271c = arrayList;
        this.f4272d = i10;
        this.f4273e = zzsVar;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f4268f;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i5 = fastJsonResponse$Field.f4588g;
        if (i5 == 1) {
            return Integer.valueOf(this.f4270b);
        }
        if (i5 == 2) {
            return this.f4271c;
        }
        if (i5 == 4) {
            return this.f4273e;
        }
        throw new IllegalStateException(c1.i(fastJsonResponse$Field.f4588g, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f4269a.contains(Integer.valueOf(fastJsonResponse$Field.f4588g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        HashSet hashSet = this.f4269a;
        if (hashSet.contains(1)) {
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4270b);
        }
        if (hashSet.contains(2)) {
            h8.b.R(parcel, 2, this.f4271c, true);
        }
        if (hashSet.contains(3)) {
            h8.b.U(parcel, 3, 4);
            parcel.writeInt(this.f4272d);
        }
        if (hashSet.contains(4)) {
            h8.b.N(parcel, 4, this.f4273e, i5, true);
        }
        h8.b.W(parcel, V);
    }
}
