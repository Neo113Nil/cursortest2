package com.vk.core.fragments.internal.transition.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import xsna.qj2;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: TransitionAnimationSimple.kt */
/* loaded from: classes17.dex */
public final class TransitionAnimationSimple implements TransitionAnimation {
    public static final Parcelable.Creator<TransitionAnimationSimple> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: TransitionAnimationSimple.kt */
    public static final class a implements Parcelable.Creator<TransitionAnimationSimple> {
        @Override // android.os.Parcelable.Creator
        public final TransitionAnimationSimple createFromParcel(Parcel parcel) {
            return new TransitionAnimationSimple(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final TransitionAnimationSimple[] newArray(int i) {
            return new TransitionAnimationSimple[i];
        }
    }

    public /* synthetic */ TransitionAnimationSimple(int i, int i2, int i3, int i4, zcl zclVar) {
        this(i, i2, i3, i4);
    }

    @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
    public final void X4(androidx.fragment.app.a aVar, qj2 qj2Var) {
        qj2.b bVar = qj2Var instanceof qj2.b ? (qj2.b) qj2Var : null;
        if (bVar != null && bVar.a != null) {
            aVar.i(this.b, 0, 0, 0);
        }
        qj2.c cVar = qj2Var instanceof qj2.c ? (qj2.c) qj2Var : null;
        if (cVar != null && cVar.a != null) {
            aVar.i(0, this.c, 0, 0);
        }
        qj2.d dVar = qj2Var instanceof qj2.d ? (qj2.d) qj2Var : null;
        if (dVar != null && dVar.a != null) {
            aVar.i(this.d, 0, 0, 0);
        }
        qj2.e eVar = qj2Var instanceof qj2.e ? (qj2.e) qj2Var : null;
        if (eVar == null || eVar.a == null) {
            return;
        }
        aVar.i(0, this.e, 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionAnimationSimple)) {
            return false;
        }
        TransitionAnimationSimple transitionAnimationSimple = (TransitionAnimationSimple) obj;
        return this.b == transitionAnimationSimple.b && this.c == transitionAnimationSimple.c && this.d == transitionAnimationSimple.d && this.e == transitionAnimationSimple.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionAnimationSimple(destinationEnterAnimation=");
        sb.append(this.b);
        sb.append(", destinationExitAnimation=");
        sb.append(this.c);
        sb.append(", sourceEnterAnimation=");
        sb.append(this.d);
        sb.append(", sourceExitAnimation=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public TransitionAnimationSimple(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public /* synthetic */ TransitionAnimationSimple(int i, int i2, int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
    public final void s3(qj2 qj2Var) {
    }
}
