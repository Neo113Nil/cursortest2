package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4425a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4426b;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f4427a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4428b;

        public BlockstoreData(String str, byte[] bArr) {
            this.f4427a = bArr;
            this.f4428b = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f4427a, ((BlockstoreData) obj).f4427a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f4427a))});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            int V = h8.b.V(parcel, 20293);
            h8.b.G(parcel, 1, this.f4427a, false);
            h8.b.O(parcel, 2, this.f4428b, false);
            h8.b.W(parcel, V);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, ArrayList arrayList) {
        this.f4425a = bundle;
        this.f4426b = arrayList;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.f4428b, blockstoreData);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.F(parcel, 1, this.f4425a);
        h8.b.R(parcel, 2, this.f4426b, false);
        h8.b.W(parcel, V);
    }
}
