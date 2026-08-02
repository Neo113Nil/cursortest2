package com.blaze.blazesdk.features.moments.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsLoopBehavior;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0008a();
    public final BlazeMomentsLoopBehavior a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.features.moments.models.ui.a$a, reason: collision with other inner class name */
    public static final class C0008a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a((BlazeMomentsLoopBehavior) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(@NotNull BlazeMomentsLoopBehavior blazeMomentsLoopBehavior) {
        blazeMomentsLoopBehavior.getClass();
        this.a = blazeMomentsLoopBehavior;
    }

    public static a copy$default(a aVar, BlazeMomentsLoopBehavior blazeMomentsLoopBehavior, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeMomentsLoopBehavior = aVar.a;
        }
        aVar.getClass();
        blazeMomentsLoopBehavior.getClass();
        return new a(blazeMomentsLoopBehavior);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalMomentsPlaybackConfiguration(loopBehavior=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
