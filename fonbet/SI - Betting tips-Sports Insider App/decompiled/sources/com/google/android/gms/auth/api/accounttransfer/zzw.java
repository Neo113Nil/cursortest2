package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new b(20);

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f4288h;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4290b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4291c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4292d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4293e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f4294f;

    /* renamed from: g, reason: collision with root package name */
    public final DeviceMetaData f4295g;

    static {
        HashMap hashMap = new HashMap();
        f4288h = hashMap;
        hashMap.put("accountType", new FastJsonResponse$Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put(PredictionTable.statusColumn, new FastJsonResponse$Field(0, false, 0, false, PredictionTable.statusColumn, 3, null));
        hashMap.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw(HashSet hashSet, int i5, String str, int i10, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f4289a = hashSet;
        this.f4290b = i5;
        this.f4291c = str;
        this.f4292d = i10;
        this.f4293e = bArr;
        this.f4294f = pendingIntent;
        this.f4295g = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f4288h;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i5 = fastJsonResponse$Field.f4588g;
        if (i5 == 1) {
            return Integer.valueOf(this.f4290b);
        }
        if (i5 == 2) {
            return this.f4291c;
        }
        if (i5 == 3) {
            return Integer.valueOf(this.f4292d);
        }
        if (i5 == 4) {
            return this.f4293e;
        }
        throw new IllegalStateException(c1.i(fastJsonResponse$Field.f4588g, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f4289a.contains(Integer.valueOf(fastJsonResponse$Field.f4588g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        HashSet hashSet = this.f4289a;
        if (hashSet.contains(1)) {
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4290b);
        }
        if (hashSet.contains(2)) {
            h8.b.O(parcel, 2, this.f4291c, true);
        }
        if (hashSet.contains(3)) {
            h8.b.U(parcel, 3, 4);
            parcel.writeInt(this.f4292d);
        }
        if (hashSet.contains(4)) {
            h8.b.G(parcel, 4, this.f4293e, true);
        }
        if (hashSet.contains(5)) {
            h8.b.N(parcel, 5, this.f4294f, i5, true);
        }
        if (hashSet.contains(6)) {
            h8.b.N(parcel, 6, this.f4295g, i5, true);
        }
        h8.b.W(parcel, V);
    }
}
