package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new zzd();
    public final Bundle a;
    public final List b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new zza();
        public final byte[] a;
        public final String b;

        public BlockstoreData(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.a, ((BlockstoreData) obj).a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.c(parcel, 1, this.a, false);
            SafeParcelWriter.m(parcel, 2, this.b, false);
            SafeParcelWriter.t(parcel, s);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.b, blockstoreData);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.b(parcel, 1, this.a);
        SafeParcelWriter.q(parcel, 2, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
