package com.google.android.gms.location;

import E9.b;
import V9.A;
import V9.B;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new B();

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator f33048e = new A();

    /* renamed from: a, reason: collision with root package name */
    public final List f33049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33050b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33051c;

    /* renamed from: d, reason: collision with root package name */
    public String f33052d;

    public ActivityTransitionRequest(List list) {
        this(list, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (AbstractC3189m.b(this.f33049a, activityTransitionRequest.f33049a) && AbstractC3189m.b(this.f33050b, activityTransitionRequest.f33050b) && AbstractC3189m.b(this.f33052d, activityTransitionRequest.f33052d) && AbstractC3189m.b(this.f33051c, activityTransitionRequest.f33051c)) {
                return true;
            }
        }
        return false;
    }

    public final ActivityTransitionRequest g(String str) {
        this.f33052d = str;
        return this;
    }

    public int hashCode() {
        int hashCode = this.f33049a.hashCode() * 31;
        String str = this.f33050b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f33051c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f33052d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.f33049a) + ", mTag='" + this.f33050b + "', mClients=" + String.valueOf(this.f33051c) + ", mAttributionTag=" + this.f33052d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.J(parcel, 1, this.f33049a, false);
        b.F(parcel, 2, this.f33050b, false);
        b.J(parcel, 3, this.f33051c, false);
        b.F(parcel, 4, this.f33052d, false);
        b.b(parcel, a10);
    }

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        AbstractC3191o.n(list, "transitions can't be null");
        AbstractC3191o.b(list.size() > 0, "transitions can't be empty.");
        AbstractC3191o.m(list);
        TreeSet treeSet = new TreeSet(f33048e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            AbstractC3191o.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f33049a = Collections.unmodifiableList(list);
        this.f33050b = str;
        this.f33051c = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f33052d = str2;
    }
}
