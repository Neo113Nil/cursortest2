package com.vk.clips.coauthors.list.common.mvi.entity.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipCoauthorListItem.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorListItem implements Parcelable {
    public static final Parcelable.Creator<ClipCoauthorListItem> CREATOR = new a();
    public final OwnerMin b;
    public final boolean c;
    public final SubscribeState d;
    public final boolean e;
    public final boolean f;
    public final CoauthorType g;
    public final boolean h;

    /* compiled from: ClipCoauthorListItem.kt */
    public static final class OwnerMin implements Parcelable {
        public static final Parcelable.Creator<OwnerMin> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final String d;

        /* compiled from: ClipCoauthorListItem.kt */
        public static final class a implements Parcelable.Creator<OwnerMin> {
            @Override // android.os.Parcelable.Creator
            public final OwnerMin createFromParcel(Parcel parcel) {
                return new OwnerMin((UserId) parcel.readParcelable(OwnerMin.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OwnerMin[] newArray(int i) {
                return new OwnerMin[i];
            }
        }

        public OwnerMin(UserId userId, String str, String str2) {
            this.b = userId;
            this.c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OwnerMin)) {
                return false;
            }
            OwnerMin ownerMin = (OwnerMin) obj;
            return epx.f(this.b, ownerMin.b) && epx.f(this.c, ownerMin.c) && epx.f(this.d, ownerMin.d);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnerMin(id=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", photoBase=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: ClipCoauthorListItem.kt */
    public static final class a implements Parcelable.Creator<ClipCoauthorListItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorListItem createFromParcel(Parcel parcel) {
            boolean z;
            OwnerMin createFromParcel = OwnerMin.CREATOR.createFromParcel(parcel);
            boolean z2 = true;
            boolean z3 = parcel.readInt() != 0;
            SubscribeState subscribeState = (SubscribeState) parcel.readParcelable(ClipCoauthorListItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new ClipCoauthorListItem(createFromParcel, z3, subscribeState, z2, parcel.readInt() != 0 ? z : false, CoauthorType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorListItem[] newArray(int i) {
            return new ClipCoauthorListItem[i];
        }
    }

    public ClipCoauthorListItem(OwnerMin ownerMin, boolean z, SubscribeState subscribeState, boolean z2, boolean z3, CoauthorType coauthorType) {
        this.b = ownerMin;
        this.c = z;
        this.d = subscribeState;
        this.e = z2;
        this.f = z3;
        this.g = coauthorType;
        boolean z4 = true;
        if (!(subscribeState instanceof SubscribeState.Gone)) {
            SubscribeState.Visible visible = subscribeState instanceof SubscribeState.Visible ? (SubscribeState.Visible) subscribeState : null;
            if (visible == null || !visible.b) {
                z4 = false;
            }
        }
        this.h = z4;
    }

    public static ClipCoauthorListItem a(ClipCoauthorListItem clipCoauthorListItem, OwnerMin ownerMin, SubscribeState subscribeState, int i) {
        if ((i & 1) != 0) {
            ownerMin = clipCoauthorListItem.b;
        }
        return new ClipCoauthorListItem(ownerMin, clipCoauthorListItem.c, subscribeState, clipCoauthorListItem.e, clipCoauthorListItem.f, clipCoauthorListItem.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCoauthorListItem)) {
            return false;
        }
        ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) obj;
        return epx.f(this.b, clipCoauthorListItem.b) && this.c == clipCoauthorListItem.c && epx.f(this.d, clipCoauthorListItem.d) && this.e == clipCoauthorListItem.e && this.f == clipCoauthorListItem.f && this.g == clipCoauthorListItem.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + qoy.b(qoy.b((this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "ClipCoauthorListItem(owner=" + this.b + ", isMain=" + this.c + ", subscribeState=" + this.d + ", isApproved=" + this.e + ", canSetStatus=" + this.f + ", coauthorType=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g.name());
    }

    /* compiled from: ClipCoauthorListItem.kt */
    public interface SubscribeState extends Parcelable {

        /* compiled from: ClipCoauthorListItem.kt */
        public static final class Gone implements SubscribeState {
            public static final Gone b = new Gone();
            public static final Parcelable.Creator<Gone> CREATOR = new a();

            /* compiled from: ClipCoauthorListItem.kt */
            public static final class a implements Parcelable.Creator<Gone> {
                @Override // android.os.Parcelable.Creator
                public final Gone createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Gone.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Gone[] newArray(int i) {
                    return new Gone[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Gone);
            }

            public final int hashCode() {
                return 1005747822;
            }

            public final String toString() {
                return "Gone";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ClipCoauthorListItem.kt */
        public static final class Visible implements SubscribeState {
            public static final Parcelable.Creator<Visible> CREATOR = new a();
            public final boolean b;
            public final boolean c;

            /* compiled from: ClipCoauthorListItem.kt */
            public static final class a implements Parcelable.Creator<Visible> {
                @Override // android.os.Parcelable.Creator
                public final Visible createFromParcel(Parcel parcel) {
                    return new Visible(parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Visible[] newArray(int i) {
                    return new Visible[i];
                }
            }

            public Visible(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Visible)) {
                    return false;
                }
                Visible visible = (Visible) obj;
                return this.b == visible.b && this.c == visible.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(subscribed=");
                sb.append(this.b);
                sb.append(", enabled=");
                return q0.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
                parcel.writeInt(this.c ? 1 : 0);
            }

            public /* synthetic */ Visible(boolean z, boolean z2, int i, zcl zclVar) {
                this(z, (i & 2) != 0 ? true : z2);
            }
        }
    }
}
