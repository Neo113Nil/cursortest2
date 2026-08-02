package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: EntryDescription.kt */
/* loaded from: classes18.dex */
public final class EntryDescription implements Serializer.StreamParcelable {
    public static final Serializer.c<EntryDescription> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final List<LinkButton> e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryDescription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryDescription a(Serializer serializer) {
            return new EntryDescription(serializer.H(), serializer.H(), serializer.H(), serializer.B(LinkButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryDescription[i];
        }
    }

    public EntryDescription(String str, String str2, String str3, List<LinkButton> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.f0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryDescription)) {
            return false;
        }
        EntryDescription entryDescription = (EntryDescription) obj;
        return epx.f(this.b, entryDescription.b) && epx.f(this.c, entryDescription.c) && epx.f(this.d, entryDescription.d) && epx.f(this.e, entryDescription.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntryDescription(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", actions=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
