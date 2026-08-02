package com.google.android.gms.location;

import E9.b;
import E9.c;
import V9.C;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final List f33053a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f33054b;

    public ActivityTransitionResult(List list) {
        this.f33054b = null;
        AbstractC3191o.n(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i10 = 1; i10 < list.size(); i10++) {
                AbstractC3191o.a(((ActivityTransitionEvent) list.get(i10)).h() >= ((ActivityTransitionEvent) list.get(i10 + (-1))).h());
            }
        }
        this.f33053a = Collections.unmodifiableList(list);
    }

    public static ActivityTransitionResult g(Intent intent) {
        if (i(intent)) {
            return (ActivityTransitionResult) c.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean i(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f33053a.equals(((ActivityTransitionResult) obj).f33053a);
    }

    public List h() {
        return this.f33053a;
    }

    public int hashCode() {
        return this.f33053a.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.J(parcel, 1, h(), false);
        b.j(parcel, 2, this.f33054b, false);
        b.b(parcel, a10);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.f33054b = bundle;
    }
}
