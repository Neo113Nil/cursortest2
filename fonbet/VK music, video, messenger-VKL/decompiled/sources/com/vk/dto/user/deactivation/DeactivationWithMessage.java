package com.vk.dto.user.deactivation;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.deactivation.Deactivation;
import xsna.epx;
import xsna.u590;
import xsna.zcl;

/* compiled from: DeactivationWithMessage.kt */
/* loaded from: classes18.dex */
public final class DeactivationWithMessage implements Deactivation {
    public static final b CREATOR = new b();
    public final Deactivation.Reason b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final Deactivation.Type g;

    /* compiled from: DeactivationWithMessage.kt */
    public static final class b extends Serializer.c<DeactivationWithMessage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DeactivationWithMessage a(Serializer serializer) {
            Deactivation.Reason.a aVar = Deactivation.Reason.Companion;
            int u = serializer.u();
            aVar.getClass();
            Deactivation.Reason a = Deactivation.Reason.a.a(u);
            String H = serializer.H();
            int u2 = serializer.u();
            String H2 = serializer.H();
            int u3 = serializer.u();
            Deactivation.Type.a aVar2 = Deactivation.Type.Companion;
            String H3 = serializer.H();
            aVar2.getClass();
            return new DeactivationWithMessage(a, H, u2, H2, u3, epx.f(H3, "geo_blocked") ? Deactivation.Type.GEO_BLOCKED : epx.f(H3, "banned") ? Deactivation.Type.BANNED : null, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeactivationWithMessage[i];
        }
    }

    public DeactivationWithMessage(Deactivation.Reason reason, String str, int i, String str2, int i2, Deactivation.Type type, zcl zclVar) {
        this.b = reason;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = i2;
        this.g = type;
    }

    @Override // com.vk.dto.user.deactivation.Deactivation
    public final int O4() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.h());
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        Deactivation.Type type = this.g;
        serializer.j0(type != null ? type.name() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.dto.user.deactivation.Deactivation
    public final Deactivation.Reason getReason() {
        return this.b;
    }

    @Override // com.vk.dto.user.deactivation.Deactivation
    public final Deactivation.Type getType() {
        return this.g;
    }

    @Override // com.vk.dto.user.deactivation.Deactivation
    public final String q5() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* compiled from: DeactivationWithMessage.kt */
    public static final class a {
        public Deactivation.Reason a;
        public String b;
        public int c;
        public final String d;
        public Deactivation.Type e;

        public a() {
            this.b = "";
            this.d = "";
        }

        public final DeactivationWithMessage a() {
            Deactivation.Reason reason = this.a;
            if (reason == null) {
                throw new IllegalArgumentException("Reason of deactivation can't be null");
            }
            return new DeactivationWithMessage(reason, this.b, this.c, this.d, 0, this.e, null);
        }

        public final void b(String str) {
            this.a = str.equals("banned") ? Deactivation.Reason.Banned : Deactivation.Reason.Deleted;
        }

        public a(u590 u590Var) {
            this();
            int i = u590Var.a;
            Deactivation.Reason.Companion.getClass();
            this.a = Deactivation.Reason.a.a(i);
            this.b = u590Var.b;
            String str = u590Var.c;
            this.d = str == null ? "" : str;
        }
    }
}
