package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import xsna.a301;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new a301();

    @Nullable
    public final List b;

    public UvmEntries(@Nullable ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.b;
        if (list2 == null && uvmEntries.b == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.b) != null && list2.containsAll(list) && uvmEntries.b.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.b;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @NonNull
    public final JSONArray i() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.b;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.d);
                    jSONArray2.put((int) uvmEntry.c);
                    jSONArray2.put((int) uvmEntry.d);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.x(w, parcel);
    }
}
