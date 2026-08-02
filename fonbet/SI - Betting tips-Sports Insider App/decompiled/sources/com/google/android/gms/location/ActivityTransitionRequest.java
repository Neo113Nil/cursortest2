package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import n6.a;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new a(23);

    /* renamed from: e, reason: collision with root package name */
    public static final i f5676e = new i(16);

    /* renamed from: a, reason: collision with root package name */
    public final List f5677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5678b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5679c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5680d;

    public ActivityTransitionRequest(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        v.i(arrayList, "transitions can't be null");
        v.a("transitions can't be empty.", !arrayList.isEmpty());
        TreeSet treeSet = new TreeSet(f5676e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            v.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.f5677a = DesugarCollections.unmodifiableList(arrayList);
        this.f5678b = str;
        this.f5679c = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
        this.f5680d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (v.k(this.f5677a, activityTransitionRequest.f5677a) && v.k(this.f5678b, activityTransitionRequest.f5678b) && v.k(this.f5680d, activityTransitionRequest.f5680d) && v.k(this.f5679c, activityTransitionRequest.f5679c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5677a.hashCode() * 31;
        String str = this.f5678b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f5679c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f5680d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5677a);
        String valueOf2 = String.valueOf(this.f5679c);
        int length = valueOf.length();
        String str = this.f5678b;
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        String str2 = this.f5680d;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + length3 + 18 + String.valueOf(str2).length() + 1);
        k.s(sb2, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str);
        k.s(sb2, "', mClients=", valueOf2, ", mAttributionTag=", str2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f5677a, false);
        b.O(parcel, 2, this.f5678b, false);
        b.R(parcel, 3, this.f5679c, false);
        b.O(parcel, 4, this.f5680d, false);
        b.W(parcel, V);
    }
}
