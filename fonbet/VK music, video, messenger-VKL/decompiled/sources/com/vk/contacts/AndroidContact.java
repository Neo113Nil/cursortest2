package com.vk.contacts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.qoy;
import xsna.ur;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AndroidContact.kt */
/* loaded from: classes17.dex */
public final class AndroidContact implements Parcelable {
    public static final Parcelable.Creator<AndroidContact> CREATOR = new a();
    public final Long b;
    public final String c;
    public final boolean d;
    public final Set<String> e;
    public final Set<String> f;
    public final Set<String> g;
    public final long h;

    /* compiled from: AndroidContact.kt */
    public static final class a implements Parcelable.Creator<AndroidContact> {
        @Override // android.os.Parcelable.Creator
        public final AndroidContact createFromParcel(Parcel parcel) {
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readString());
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashSet2.add(parcel.readString());
            }
            int readInt3 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                linkedHashSet3.add(parcel.readString());
            }
            return new AndroidContact(valueOf, readString, z, linkedHashSet, linkedHashSet2, linkedHashSet3);
        }

        @Override // android.os.Parcelable.Creator
        public final AndroidContact[] newArray(int i) {
            return new AndroidContact[i];
        }
    }

    public AndroidContact(Long l, String str, boolean z, Set<String> set, Set<String> set2, Set<String> set3) {
        this.b = l;
        this.c = str;
        this.d = z;
        this.e = set;
        this.f = set2;
        this.g = set3;
        this.h = Math.abs(j5g.C0(set3).hashCode() + ((j5g.C0(set).hashCode() + (str.hashCode() * 31)) * 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AndroidContact a(AndroidContact androidContact, String str, Set set, LinkedHashSet linkedHashSet, int i) {
        Long l = androidContact.b;
        if ((i & 2) != 0) {
            str = androidContact.c;
        }
        String str2 = str;
        boolean z = androidContact.d;
        if ((i & 8) != 0) {
            set = androidContact.e;
        }
        Set set2 = set;
        Set<String> set3 = androidContact.f;
        Set set4 = linkedHashSet;
        if ((i & 32) != 0) {
            set4 = androidContact.g;
        }
        androidContact.getClass();
        return new AndroidContact(l, str2, z, set2, set3, set4);
    }

    public final long d() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Set<String> e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidContact)) {
            return false;
        }
        AndroidContact androidContact = (AndroidContact) obj;
        return epx.f(this.b, androidContact.b) && epx.f(this.c, androidContact.c) && this.d == androidContact.d && epx.f(this.e, androidContact.e) && epx.f(this.f, androidContact.f) && epx.f(this.g, androidContact.g);
    }

    public final Set<String> f() {
        return this.e;
    }

    public final int hashCode() {
        Long l = this.b;
        return this.g.hashCode() + fw3.b(fw3.b(qoy.b(urd0.a((l == null ? 0 : l.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidContact(androidId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", isFavorite=");
        sb.append(this.d);
        sb.append(", rawPhones=");
        sb.append(this.e);
        sb.append(", originalPhones=");
        sb.append(this.f);
        sb.append(", rawEmails=");
        return ur.c(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Set<String> set = this.e;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Set<String> set2 = this.f;
        parcel.writeInt(set2.size());
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        Set<String> set3 = this.g;
        parcel.writeInt(set3.size());
        Iterator<String> it3 = set3.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next());
        }
    }

    public AndroidContact(Long l, String str, boolean z, Set set, Set set2, Set set3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? EmptySet.b : set, (i & 16) != 0 ? EmptySet.b : set2, (i & 32) != 0 ? EmptySet.b : set3);
    }
}
