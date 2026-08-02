package com.vk.video.ui.upload.impl.publish.presentation.author.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.shy;

/* compiled from: AuthorArguments.kt */
/* loaded from: classes7.dex */
public final class AuthorArguments implements Parcelable {
    public static final Parcelable.Creator<AuthorArguments> CREATOR = new a();
    public final List<AuthorItem> b;
    public final int c;
    public final boolean d;

    /* compiled from: AuthorArguments.kt */
    public static final class a implements Parcelable.Creator<AuthorArguments> {
        @Override // android.os.Parcelable.Creator
        public final AuthorArguments createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AuthorItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new AuthorArguments(arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorArguments[] newArray(int i) {
            return new AuthorArguments[i];
        }
    }

    public AuthorArguments(List<AuthorItem> list, int i, boolean z) {
        this.b = list;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorArguments)) {
            return false;
        }
        AuthorArguments authorArguments = (AuthorArguments) obj;
        return epx.f(this.b, authorArguments.b) && this.c == authorArguments.c && this.d == authorArguments.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorArguments(items=");
        sb.append(this.b);
        sb.append(", selectedItemIndex=");
        sb.append(this.c);
        sb.append(", shouldConfirmChange=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((AuthorItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
