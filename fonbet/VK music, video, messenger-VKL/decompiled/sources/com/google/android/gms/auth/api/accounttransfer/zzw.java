package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import xsna.el3;
import xsna.lhg;
import xsna.ls01;
import xsna.ozg0;
import xsna.tgw;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new ls01();
    public static final HashMap i;
    public final Set b;
    public final int c;
    public String d;
    public int e;
    public byte[] f;
    public final PendingIntent g;
    public final DeviceMetaData h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw() {
        this.b = new el3(3);
        this.c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int i2 = field.h;
        if (i2 == 1) {
            return Integer.valueOf(this.c);
        }
        if (i2 == 2) {
            return this.d;
        }
        if (i2 == 3) {
            return Integer.valueOf(this.e);
        }
        if (i2 == 4) {
            return this.f;
        }
        throw new IllegalStateException(lhg.a(field.h, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.b.contains(Integer.valueOf(field.h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        int i2 = field.h;
        if (i2 != 4) {
            throw new IllegalArgumentException(tgw.b(i2, "Field with id=", " is not known to be a byte array."));
        }
        this.f = bArr;
        this.b.add(Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i2) {
        int i3 = field.h;
        if (i3 != 3) {
            throw new IllegalArgumentException(tgw.b(i3, "Field with id=", " is not known to be an int."));
        }
        this.e = i2;
        this.b.add(Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int i2 = field.h;
        if (i2 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i2)));
        }
        this.d = str2;
        this.b.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int w = ozg0.w(20293, parcel);
        Set set = this.b;
        if (set.contains(1)) {
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.c);
        }
        if (set.contains(2)) {
            ozg0.q(parcel, 2, this.d, true);
        }
        if (set.contains(3)) {
            int i3 = this.e;
            ozg0.v(parcel, 3, 4);
            parcel.writeInt(i3);
        }
        if (set.contains(4)) {
            ozg0.e(parcel, 4, this.f, true);
        }
        if (set.contains(5)) {
            ozg0.p(parcel, 5, this.g, i2, true);
        }
        if (set.contains(6)) {
            ozg0.p(parcel, 6, this.h, i2, true);
        }
        ozg0.x(w, parcel);
    }

    public zzw(HashSet hashSet, int i2, String str, int i3, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.b = hashSet;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = bArr;
        this.g = pendingIntent;
        this.h = deviceMetaData;
    }
}
