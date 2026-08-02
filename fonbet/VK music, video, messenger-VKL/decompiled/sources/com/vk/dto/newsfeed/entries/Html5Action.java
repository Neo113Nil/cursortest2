package com.vk.dto.newsfeed.entries;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import xsna.epx;

/* compiled from: Html5Action.kt */
/* loaded from: classes18.dex */
public final class Html5Action implements Serializer.StreamParcelable {
    public static final Serializer.c<Html5Action> CREATOR = new a();
    public final String b;
    public final Action c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Html5Action> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Html5Action a(Serializer serializer) {
            return new Html5Action(serializer.H(), (Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Html5Action[i];
        }
    }

    public Html5Action(String str, Action action) {
        this.b = str;
        this.c = action;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Html5Action)) {
            return false;
        }
        Html5Action html5Action = (Html5Action) obj;
        return epx.f(this.b, html5Action.b) && epx.f(this.c, html5Action.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Html5Action(name=" + this.b + ", action=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
