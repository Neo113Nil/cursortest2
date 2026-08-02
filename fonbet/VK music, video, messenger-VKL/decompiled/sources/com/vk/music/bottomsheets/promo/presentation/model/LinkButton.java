package com.vk.music.bottomsheets.promo.presentation.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.uf3;
import xsna.urd0;

/* compiled from: LinkButton.kt */
/* loaded from: classes3.dex */
public final class LinkButton implements Parcelable {
    public static final Parcelable.Creator<LinkButton> CREATOR = new a();
    public final String b;
    public final String c;
    public final Bundle d;

    /* compiled from: LinkButton.kt */
    public static final class a implements Parcelable.Creator<LinkButton> {
        @Override // android.os.Parcelable.Creator
        public final LinkButton createFromParcel(Parcel parcel) {
            return new LinkButton(parcel.readString(), parcel.readString(), parcel.readBundle(LinkButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LinkButton[] newArray(int i) {
            return new LinkButton[i];
        }
    }

    public LinkButton(String str, String str2, Bundle bundle) {
        this.b = str;
        this.c = str2;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkButton)) {
            return false;
        }
        LinkButton linkButton = (LinkButton) obj;
        return epx.f(this.b, linkButton.b) && epx.f(this.c, linkButton.c) && epx.f(this.d, linkButton.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        Bundle bundle = this.d;
        return a2 + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkButton(title=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", awayParams=");
        return uf3.c(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeBundle(this.d);
    }
}
