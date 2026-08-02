package com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.bpn0;
import xsna.bzj;
import xsna.epx;
import xsna.lm50;
import xsna.nuj;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DescriptionState.kt */
/* loaded from: classes7.dex */
public final class DescriptionState implements lm50, Parcelable {
    public static final Parcelable.Creator<DescriptionState> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final bpn0 e;
    public final bpn0 f;

    /* compiled from: DescriptionState.kt */
    public static final class a implements Parcelable.Creator<DescriptionState> {
        @Override // android.os.Parcelable.Creator
        public final DescriptionState createFromParcel(Parcel parcel) {
            return new DescriptionState(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DescriptionState[] newArray(int i) {
            return new DescriptionState[i];
        }
    }

    public DescriptionState(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = new bpn0(new bzj(this, 2));
        this.f = new bpn0(new nuj(this, 1));
    }

    public static DescriptionState a(DescriptionState descriptionState, String str, boolean z, int i) {
        String str2 = descriptionState.b;
        if ((i & 2) != 0) {
            str = descriptionState.c;
        }
        if ((i & 4) != 0) {
            z = descriptionState.d;
        }
        descriptionState.getClass();
        return new DescriptionState(str2, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionState)) {
            return false;
        }
        DescriptionState descriptionState = (DescriptionState) obj;
        return epx.f(this.b, descriptionState.b) && epx.f(this.c, descriptionState.c) && this.d == descriptionState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionState(sourceDescription=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", isExitConfirmDialogVisible=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ DescriptionState(String str, String str2, boolean z, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
