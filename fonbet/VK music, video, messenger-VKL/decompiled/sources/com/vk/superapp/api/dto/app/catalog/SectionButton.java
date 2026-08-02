package com.vk.superapp.api.dto.app.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.epx;

/* compiled from: SectionButton.kt */
/* loaded from: classes6.dex */
public final class SectionButton implements Parcelable {
    public static final Parcelable.Creator<SectionButton> CREATOR = new a();
    public final String b;
    public final WebAction c;

    /* compiled from: SectionButton.kt */
    public static final class a implements Parcelable.Creator<SectionButton> {
        @Override // android.os.Parcelable.Creator
        public final SectionButton createFromParcel(Parcel parcel) {
            return new SectionButton(parcel.readString(), (WebAction) parcel.readParcelable(SectionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionButton[] newArray(int i) {
            return new SectionButton[i];
        }
    }

    public SectionButton(String str, WebAction webAction) {
        this.b = str;
        this.c = webAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionButton)) {
            return false;
        }
        SectionButton sectionButton = (SectionButton) obj;
        return epx.f(this.b, sectionButton.b) && epx.f(this.c, sectionButton.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        WebAction webAction = this.c;
        return hashCode + (webAction == null ? 0 : webAction.hashCode());
    }

    public final String toString() {
        return "SectionButton(title=" + this.b + ", action=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
