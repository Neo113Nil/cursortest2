package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import xsna.epx;
import xsna.urd0;

/* compiled from: EntryPointsItem.kt */
/* loaded from: classes18.dex */
public final class EntryPointsItem implements Serializer.StreamParcelable {
    public static final Serializer.c<EntryPointsItem> CREATOR = new a();
    public final Icon b;
    public final String c;
    public final String d;
    public final String e;
    public final Action f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryPointsItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryPointsItem a(Serializer serializer) {
            return new EntryPointsItem((Icon) serializer.A(Icon.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), (Action) serializer.A(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryPointsItem[i];
        }
    }

    public EntryPointsItem(Icon icon, String str, String str2, String str3, Action action) {
        this.b = icon;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = action;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryPointsItem)) {
            return false;
        }
        EntryPointsItem entryPointsItem = (EntryPointsItem) obj;
        return epx.f(this.b, entryPointsItem.b) && epx.f(this.c, entryPointsItem.c) && epx.f(this.d, entryPointsItem.d) && epx.f(this.e, entryPointsItem.e) && epx.f(this.f, entryPointsItem.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        Action action = this.f;
        return a2 + (action == null ? 0 : action.hashCode());
    }

    public final String toString() {
        return "EntryPointsItem(icon=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", trackCode=" + this.e + ", action=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
