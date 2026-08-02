package com.vk.dto.newsfeed.entries.post;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.ms9;
import xsna.qoy;

/* compiled from: NewsfeedCoowners.kt */
/* loaded from: classes18.dex */
public final class NewsfeedCoowners implements Serializer.StreamParcelable {
    public static final Serializer.c<NewsfeedCoowners> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final UserId d;
    public final Integer e;
    public final List<CoownerStatus> f;
    public final List<CoownerRequest> g;

    /* compiled from: NewsfeedCoowners.kt */
    public static final class CoownerRequest implements Serializer.StreamParcelable {
        public static final Serializer.c<CoownerRequest> CREATOR = new a();
        public final Owner b;
        public final Owner c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CoownerRequest> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CoownerRequest a(Serializer serializer) {
                return new CoownerRequest((Owner) serializer.G(Owner.class.getClassLoader()), (Owner) serializer.G(Owner.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoownerRequest[i];
            }
        }

        public CoownerRequest(Owner owner, Owner owner2, String str) {
            this.b = owner;
            this.c = owner2;
            this.d = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.i0(this.c);
            serializer.j0(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoownerRequest)) {
                return false;
            }
            CoownerRequest coownerRequest = (CoownerRequest) obj;
            return epx.f(this.b, coownerRequest.b) && epx.f(this.c, coownerRequest.c) && epx.f(this.d, coownerRequest.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CoownerRequest(owner=");
            sb.append(this.b);
            sb.append(", coowner=");
            sb.append(this.c);
            sb.append(", rejectedPrivacyLink=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: NewsfeedCoowners.kt */
    public static final class CoownerStatus implements Serializer.StreamParcelable {
        public static final Serializer.c<CoownerStatus> CREATOR = new a();
        public final Owner b;
        public final String c;
        public final boolean d;
        public boolean e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CoownerStatus> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CoownerStatus a(Serializer serializer) {
                return new CoownerStatus((Owner) serializer.G(Owner.class.getClassLoader()), serializer.H(), serializer.m(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoownerStatus[i];
            }
        }

        public CoownerStatus(Owner owner, String str, boolean z, boolean z2) {
            this.b = owner;
            this.c = str;
            this.d = z;
            this.e = z2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoownerStatus)) {
                return false;
            }
            CoownerStatus coownerStatus = (CoownerStatus) obj;
            return epx.f(this.b, coownerStatus.b) && epx.f(this.c, coownerStatus.c) && this.d == coownerStatus.d && this.e == coownerStatus.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return Boolean.hashCode(this.e) + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CoownerStatus(owner=");
            sb.append(this.b);
            sb.append(", status=");
            sb.append(this.c);
            sb.append(", canSubscribe=");
            sb.append(this.d);
            sb.append(", isSubscribed=");
            return q0.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NewsfeedCoowners> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsfeedCoowners a(Serializer serializer) {
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            Long x = serializer.x();
            return new NewsfeedCoowners(m, m2, x != null ? new UserId(x.longValue()) : null, serializer.v(), serializer.k(CoownerStatus.class), serializer.k(CoownerRequest.class));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsfeedCoowners[i];
        }
    }

    public NewsfeedCoowners(boolean z, boolean z2, UserId userId, Integer num, List<CoownerStatus> list, List<CoownerRequest> list2) {
        this.b = z;
        this.c = z2;
        this.d = userId;
        this.e = num;
        this.f = list;
        this.g = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        UserId userId = this.d;
        serializer.b0(userId != null ? Long.valueOf(userId.b) : null);
        serializer.V(this.e);
        serializer.W(this.f);
        serializer.W(this.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedCoowners)) {
            return false;
        }
        NewsfeedCoowners newsfeedCoowners = (NewsfeedCoowners) obj;
        return this.b == newsfeedCoowners.b && this.c == newsfeedCoowners.c && epx.f(this.d, newsfeedCoowners.d) && epx.f(this.e, newsfeedCoowners.e) && epx.f(this.f, newsfeedCoowners.f) && epx.f(this.g, newsfeedCoowners.g);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        UserId userId = this.d;
        int hashCode = (b + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.e;
        return this.g.hashCode() + fw3.a((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCoowners(isOwner=");
        sb.append(this.b);
        sb.append(", isCoowner=");
        sb.append(this.c);
        sb.append(", coownerPostOwnerId=");
        sb.append(this.d);
        sb.append(", coownerPostId=");
        sb.append(this.e);
        sb.append(", list=");
        sb.append(this.f);
        sb.append(", requests=");
        return ms9.a(')', sb, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
