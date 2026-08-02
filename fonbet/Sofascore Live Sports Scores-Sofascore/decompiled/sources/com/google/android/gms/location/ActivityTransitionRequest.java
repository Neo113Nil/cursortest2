package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.v4n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzh();
    public static final v4n e = new v4n(19);
    public final List a;
    public final String b;
    public final List c;
    public final String d;

    public ActivityTransitionRequest(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Preconditions.j(arrayList, "transitions can't be null");
        Preconditions.a("transitions can't be empty.", !arrayList.isEmpty());
        TreeSet treeSet = new TreeSet(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            Preconditions.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = str;
        this.c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.a(this.a, activityTransitionRequest.a) && Objects.a(this.b, activityTransitionRequest.b) && Objects.a(this.d, activityTransitionRequest.d) && Objects.a(this.c, activityTransitionRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        int length = valueOf.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(fn0.b(length, 48, length2, 12, length3, 18, String.valueOf(str2).length()) + 1);
        bf3.v(sb, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str);
        bf3.v(sb, "', mClients=", valueOf2, ", mAttributionTag=", str2);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.i(parcel);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.q(parcel, 3, this.c, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }
}
