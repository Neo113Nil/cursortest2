package com.vk.messagetemplates.impl.details;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.lm50;
import xsna.nr;
import xsna.zcl;

/* compiled from: TemplateDetailsState.kt */
/* loaded from: classes3.dex */
public final class TemplateDetailsState implements lm50, Parcelable {
    public static final Parcelable.Creator<TemplateDetailsState> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: TemplateDetailsState.kt */
    public static final class a implements Parcelable.Creator<TemplateDetailsState> {
        @Override // android.os.Parcelable.Creator
        public final TemplateDetailsState createFromParcel(Parcel parcel) {
            return new TemplateDetailsState(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateDetailsState[] newArray(int i) {
            return new TemplateDetailsState[i];
        }
    }

    public TemplateDetailsState(Integer num, String str, String str2, boolean z) {
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public static TemplateDetailsState a(TemplateDetailsState templateDetailsState, String str, String str2, boolean z, int i) {
        Integer num = templateDetailsState.b;
        if ((i & 2) != 0) {
            str = templateDetailsState.c;
        }
        if ((i & 4) != 0) {
            str2 = templateDetailsState.d;
        }
        if ((i & 8) != 0) {
            z = templateDetailsState.e;
        }
        templateDetailsState.getClass();
        return new TemplateDetailsState(num, str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDetailsState)) {
            return false;
        }
        TemplateDetailsState templateDetailsState = (TemplateDetailsState) obj;
        return epx.f(this.b, templateDetailsState.b) && epx.f(this.c, templateDetailsState.c) && epx.f(this.d, templateDetailsState.d) && this.e == templateDetailsState.e;
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateDetailsState(templateId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", content=");
        sb.append(this.d);
        sb.append(", isSaving=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ TemplateDetailsState(Integer num, String str, String str2, boolean z, int i, zcl zclVar) {
        this(num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }
}
