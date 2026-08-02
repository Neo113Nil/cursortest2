package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new b(19);

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f4281g;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4282a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4283b;

    /* renamed from: c, reason: collision with root package name */
    public final zzw f4284c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4285d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4286e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4287f;

    static {
        HashMap hashMap = new HashMap();
        f4281g = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", new FastJsonResponse$Field(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new FastJsonResponse$Field(7, false, 7, false, "package", 4, null));
    }

    public zzu(HashSet hashSet, int i5, zzw zzwVar, String str, String str2, String str3) {
        this.f4282a = hashSet;
        this.f4283b = i5;
        this.f4284c = zzwVar;
        this.f4285d = str;
        this.f4286e = str2;
        this.f4287f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f4281g;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i5 = fastJsonResponse$Field.f4588g;
        if (i5 == 1) {
            return Integer.valueOf(this.f4283b);
        }
        if (i5 == 2) {
            return this.f4284c;
        }
        if (i5 == 3) {
            return this.f4285d;
        }
        if (i5 == 4) {
            return this.f4286e;
        }
        throw new IllegalStateException(c1.i(fastJsonResponse$Field.f4588g, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f4282a.contains(Integer.valueOf(fastJsonResponse$Field.f4588g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        HashSet hashSet = this.f4282a;
        if (hashSet.contains(1)) {
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4283b);
        }
        if (hashSet.contains(2)) {
            h8.b.N(parcel, 2, this.f4284c, i5, true);
        }
        if (hashSet.contains(3)) {
            h8.b.O(parcel, 3, this.f4285d, true);
        }
        if (hashSet.contains(4)) {
            h8.b.O(parcel, 4, this.f4286e, true);
        }
        if (hashSet.contains(5)) {
            h8.b.O(parcel, 5, this.f4287f, true);
        }
        h8.b.W(parcel, V);
    }
}
