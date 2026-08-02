package com.vk.mail.auth.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: MailAuthFlowConfig.kt */
/* loaded from: classes.dex */
public final class MailAuthFlowConfig implements Parcelable {
    public static final Parcelable.Creator<MailAuthFlowConfig> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;

    /* compiled from: MailAuthFlowConfig.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MailAuthFlowConfig> {
        @Override // android.os.Parcelable.Creator
        public final MailAuthFlowConfig createFromParcel(Parcel parcel) {
            return new MailAuthFlowConfig(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MailAuthFlowConfig[] newArray(int i) {
            return new MailAuthFlowConfig[i];
        }
    }

    public MailAuthFlowConfig(String str, boolean z, boolean z2) {
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MailAuthFlowConfig)) {
            return false;
        }
        MailAuthFlowConfig mailAuthFlowConfig = (MailAuthFlowConfig) obj;
        return epx.f(this.b, mailAuthFlowConfig.b) && this.c == mailAuthFlowConfig.c && this.d == mailAuthFlowConfig.d;
    }

    public final int hashCode() {
        String str = this.b;
        return Boolean.hashCode(this.d) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MailAuthFlowConfig(enteredEmail=");
        sb.append(this.b);
        sb.append(", isSoftVkid=");
        sb.append(this.c);
        sb.append(", isGrayVkidMailPromo=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
