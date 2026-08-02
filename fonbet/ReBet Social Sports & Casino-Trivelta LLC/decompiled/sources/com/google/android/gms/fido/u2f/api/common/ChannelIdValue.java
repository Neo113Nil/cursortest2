package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new S9.a();

    /* renamed from: d, reason: collision with root package name */
    public static final ChannelIdValue f32986d = new ChannelIdValue();

    /* renamed from: e, reason: collision with root package name */
    public static final ChannelIdValue f32987e = new ChannelIdValue("unavailable");

    /* renamed from: f, reason: collision with root package name */
    public static final ChannelIdValue f32988f = new ChannelIdValue("unused");

    /* renamed from: a, reason: collision with root package name */
    public final ChannelIdValueType f32989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32990b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32991c;

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new com.google.android.gms.fido.u2f.api.common.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f32995a;

        ChannelIdValueType(int i10) {
            this.f32995a = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f32995a);
        }
    }

    public static class a extends Exception {
        public a(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    public ChannelIdValue() {
        this.f32989a = ChannelIdValueType.ABSENT;
        this.f32991c = null;
        this.f32990b = null;
    }

    public static ChannelIdValueType j(int i10) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i10 == channelIdValueType.f32995a) {
                return channelIdValueType;
            }
        }
        throw new a(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.f32989a.equals(channelIdValue.f32989a)) {
            return false;
        }
        int ordinal = this.f32989a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f32990b.equals(channelIdValue.f32990b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f32991c.equals(channelIdValue.f32991c);
    }

    public String g() {
        return this.f32991c;
    }

    public String h() {
        return this.f32990b;
    }

    public int hashCode() {
        int i10;
        int hashCode;
        int hashCode2 = this.f32989a.hashCode() + 31;
        int ordinal = this.f32989a.ordinal();
        if (ordinal == 1) {
            i10 = hashCode2 * 31;
            hashCode = this.f32990b.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i10 = hashCode2 * 31;
            hashCode = this.f32991c.hashCode();
        }
        return i10 + hashCode;
    }

    public int i() {
        return this.f32989a.f32995a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, i());
        E9.b.F(parcel, 3, h(), false);
        E9.b.F(parcel, 4, g(), false);
        E9.b.b(parcel, a10);
    }

    public ChannelIdValue(int i10, String str, String str2) {
        try {
            this.f32989a = j(i10);
            this.f32990b = str;
            this.f32991c = str2;
        } catch (a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public ChannelIdValue(String str) {
        this.f32990b = (String) AbstractC3191o.m(str);
        this.f32989a = ChannelIdValueType.STRING;
        this.f32991c = null;
    }
}
