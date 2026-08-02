package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new l(13);

    /* renamed from: a, reason: collision with root package name */
    public final List f4761a;

    public UvmEntries(ArrayList arrayList) {
        this.f4761a = arrayList;
    }

    public final JSONArray c() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f4761a;
            if (list != null) {
                for (int i5 = 0; i5 < list.size(); i5++) {
                    UvmEntry uvmEntry = (UvmEntry) list.get(i5);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.f4764c);
                    jSONArray2.put((int) uvmEntry.f4763b);
                    jSONArray2.put((int) uvmEntry.f4764c);
                    jSONArray.put(i5, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        List list = ((UvmEntries) obj).f4761a;
        List list2 = this.f4761a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f4761a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f4761a, false);
        b.W(parcel, V);
    }
}
