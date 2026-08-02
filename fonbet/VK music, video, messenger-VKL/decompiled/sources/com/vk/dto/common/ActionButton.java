package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: ActionButton.kt */
/* loaded from: classes18.dex */
public final class ActionButton implements Serializer.StreamParcelable {
    public static final Serializer.c<ActionButton> CREATOR = new a();
    public final LinkButton b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButton a(Serializer serializer) {
            return new ActionButton((LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButton[i];
        }
    }

    public ActionButton(LinkButton linkButton, String str) {
        this.b = linkButton;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return epx.f(this.b, actionButton.b) && epx.f(this.c, actionButton.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionButton(button=");
        sb.append(this.b);
        sb.append(", icon=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
