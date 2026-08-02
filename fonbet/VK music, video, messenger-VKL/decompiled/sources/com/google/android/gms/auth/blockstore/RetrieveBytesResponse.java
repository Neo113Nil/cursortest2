package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new b();

    @Deprecated
    public final Bundle b;
    public final List c;
    public final HashMap d;

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new a();
        public final byte[] b;
        public final String c;

        public BlockstoreData(byte[] bArr, String str) {
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.b, ((BlockstoreData) obj).b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b))});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.e(parcel, 1, this.b, false);
            ozg0.q(parcel, 2, this.c, false);
            ozg0.x(w, parcel);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, ArrayList arrayList) {
        this.b = bundle;
        this.c = arrayList;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.c, blockstoreData);
        }
        this.d = hashMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.d(parcel, 1, this.b, false);
        ozg0.u(parcel, 2, this.c, false);
        ozg0.x(w, parcel);
    }
}
